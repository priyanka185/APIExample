package com.example.cameraapi;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.provider.OpenableColumns;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dlazaro66.qrcodereaderview.QRCodeReaderView;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.MultiProcessor;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {
private  static final int IMAGE_CAPTURE_REQUEST_CODE=100;
    ArrayList<ImageItem> image_item=new ArrayList<>();
    Button capture_image,select_image,barcode;
    GridView image_grid;
    GridViewAdapter adapter;
    int position;
    QRCodeReaderView qrCodeReaderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        capture_image= (Button) findViewById(R.id.button);
        select_image= (Button) findViewById(R.id.button2);
        image_grid= (GridView) findViewById(R.id.gridView);
        qrCodeReaderView= (QRCodeReaderView) findViewById(R.id.qrdecoderview);
        qrCodeReaderView.setBackCamera();
        qrCodeReaderView.setQRDecodingEnabled(true);
        qrCodeReaderView.setAutofocusInterval(2000L);
       capture_image.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
              /* For Storing images in a directory:-
               File imagesFolder = new File(Environment.getExternalStorageDirectory(), "MyImages");

               if(imagesFolder.mkdirs()){
                   Log.d("created", "The directory is created");
               } else {
                   Log.d("failed", "Failed or already exists");
               }
               File image = new File(imagesFolder, "image_001"+System.currentTimeMillis()+".jpg");
               image_uri = Uri.fromFile(image);
               i.putExtra(MediaStore.EXTRA_OUTPUT, image_uri);*/
               startActivityForResult(i,IMAGE_CAPTURE_REQUEST_CODE);
           }
       });
        select_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                i.setType("image/*");
                i.putExtra(Intent.EXTRA_ALLOW_MULTIPLE,true);
                startActivityForResult(Intent.createChooser(i,""),0);

            }
        });
        barcode= (Button) findViewById(R.id.button3);
        barcode.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                image_grid.setVisibility(View.GONE);
                qrCodeReaderView.setVisibility(View.VISIBLE);
                qrCodeReaderView.startCamera();
                qrCodeReaderView.setOnQRCodeReadListener(new QRCodeReaderView.OnQRCodeReadListener() {
                    @Override
                    public void onQRCodeRead(String text, PointF[] points) {
                        showDialog(MainActivity.this,"QR code",text,"OK");
                        qrCodeReaderView.stopCamera();
                    }
                });
                //IntentIntegrator scanIntegrator=new IntentIntegrator(MainActivity.this);
                //scanIntegrator.initiateScan();
            }
        });
        adapter=new GridViewAdapter(this,image_item);
        image_grid.setAdapter(adapter);
        image_grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                MainActivity.this.position=position;
                Intent i = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                i.setType("image/*");
                startActivityForResult(Intent.createChooser(i, ""),2);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == IMAGE_CAPTURE_REQUEST_CODE) {

            if (resultCode == RESULT_OK) {
                final ImageItem item = new ImageItem();
                image_grid.setVisibility(View.VISIBLE);
                qrCodeReaderView.setVisibility(View.GONE);
                Bitmap bitmap= (Bitmap) data.getExtras().get("data");
                item.setImage_uri(bitmap);
                image_item.add(item);
                adapter.notifyDataSetChanged();
            }
        } else if(requestCode==0 && resultCode==RESULT_OK) {
            image_grid.setVisibility(View.VISIBLE);
            qrCodeReaderView.setVisibility(View.GONE);
            ClipData clipData = data.getClipData();
            if (clipData != null && clipData.getItemCount() > 1) {
                for (int i = 0; i < clipData.getItemCount(); i++) {
                    ImageItem imageItem = new ImageItem();
                    ClipData.Item item1 = clipData.getItemAt(i);
                    Uri uri = item1.getUri();
                    String path = getPath(uri);
                    final BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    Bitmap image1 = BitmapFactory.decodeFile(path);

                    //ParcelFileDescriptor parcelFileDescriptor = null;
                    /*Bitmap image1=null;
                    try {
                        parcelFileDescriptor = getContentResolver().openFileDescriptor(uri, "r");
                        FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                        image1 = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                        parcelFileDescriptor.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }*/
                    imageItem.setImage_uri(image1);
                    image_item.add(imageItem);
                    data.putExtra("list", image_item);
                }
                adapter.notifyDataSetChanged();

            } else {
                if(data!=null){
                Uri selectedImage = data.getData();
                ParcelFileDescriptor parcelFileDescriptor;
                Bitmap image = null;
                try {
                    parcelFileDescriptor = getContentResolver().openFileDescriptor(selectedImage, "r");
                    FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                    image = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                    parcelFileDescriptor.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                final ImageItem item = new ImageItem();
                item.setImage_uri(image);
                image_item.add( item);
            }}
            adapter.notifyDataSetChanged();
        }else {
            if(data!=null){
            Uri selectedImage = data.getData();
            ParcelFileDescriptor parcelFileDescriptor;
            Bitmap image = null;
            try {
                parcelFileDescriptor = getContentResolver().openFileDescriptor(selectedImage, "r");
                FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                image = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                parcelFileDescriptor.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            final ImageItem item = new ImageItem();
            item.setImage_uri(image);
            image_item.set(position, item);
        }}
        adapter.notifyDataSetChanged();
        }
           /* String[] filepath = {MediaStore.Images.Media.DATA};
           Cursor cursor = getContentResolver().query(selectedImage, null, null, null, null);
            String picturePath=null;
            if(cursor!=null && cursor.moveToFirst())
            {String displayName = cursor.getString(
                    cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME));
                Log.i("name", "Display Name: " + displayName);
                int columnIndex = cursor.getColumnIndex(OpenableColumns.SIZE);
                if (!cursor.isNull(columnIndex)) {
                    picturePath = cursor.getString(columnIndex);
                }else {
                    picturePath="unknown";
                }
                Log.d("path",picturePath);
            }
            cursor.close();*/

        /*IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
            if(scanningResult!=null){
                String scanContent = scanningResult.getContents();
                String scanFormat = scanningResult.getFormatName();
               showDialog(this,scanFormat,scanContent,"OK").show();
            }else {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "No scan data received!", Toast.LENGTH_SHORT);
                toast.show();
            }*/


    private static AlertDialog showDialog(final Activity act, CharSequence title, CharSequence message, CharSequence buttonok) {
        final AlertDialog.Builder displayDialog = new AlertDialog.Builder(act);
        displayDialog.setTitle(title);
        displayDialog.setMessage(message);
        displayDialog.setPositiveButton(buttonok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return displayDialog.show();
    }

    @Override
    protected void onPause() {
        super.onPause();

    }
    public String getPath(Uri uri) {
        if (uri == null) {
            return null;
        }
        String[] projection = {MediaStore.Images.Media.DATA};
        Cursor cursor = getContentResolver().query(uri, projection, null, null, null);
        if (cursor != null) {
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
            cursor.moveToFirst();
            return cursor.getString(column_index);
        }
        return uri.getPath();
    }
}
