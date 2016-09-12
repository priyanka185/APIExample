package com.example.retrofitex;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by Priyanka on 12-09-2016.
 */
public class Around_me extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.around_me,container,false);
        GridView grid= (GridView) v.findViewById(R.id.around);
        AroundMe_adapter aroundMeAdapter=new AroundMe_adapter(container.getContext());
        grid.setAdapter(aroundMeAdapter);
        return v;
    }
}
