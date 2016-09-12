package com.example.retrofitex;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Priyanka on 12-08-2016.
 */
public class DataModel {

    /**
     * html_attributions : []
     * results : [{"formatted_address":"Sri T. Choudaiah Road, High Grounds, Bengaluru, Karnataka 560001, India","geometry":{"location":{"lat":12.984865,"lng":77.5895718}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/school-71.png","id":"2a8360f04f27d73c8759255d99a50eb3d356d98b","name":"Jawaharlal Nehru Planetarium","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":1224,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/114404896690583715176/photos\">Sunilkumar Thimmarayappa<\/a>"],"photo_reference":"CoQBcwAAAOsvQ9bju89NbrpvrCjAjo72eOsegEnchMYFIgiOnAhYBtPgu9VmMWvVkUALRqAP4XrWKKzdBtPjNqJ6plYE2-excF4nYcwwCwsTIpC_6Q334CFqC-a4p1ZKJ12oKlQLne9U1Iu0nF1ILWyGinqk9P03JJcL46ZrQ1clSASQj4qyEhBMBAjwPcgwsM-oygHw0sK2GhQoIGs7hGCB_ia-7z3ad4pZOCoPDA","width":1632}],"place_id":"ChIJk0gN-2sWrjsRljNKfECgL9M","rating":4.1,"reference":"CnRwAAAA7R8ETcsockGRmxJQ29w7zneqnaLnqXBTWqc21L0UjJr0CmkYeR2OW5MbGVdigBuEae7_IwlJKDId0h4G4_If0rPNN6xoG_XXz05ZEfzuYNQ90iuoWX5mt-RmRt6HfDkj0xgWV0Y-P4MfcRUTcZPbABIQkpEqFfF4uyl3djX-h7c_0BoUGB4a1wjfON42bqDQk4cnGvOqQQ4","types":["point_of_interest","establishment"]},{"formatted_address":"Flat No. 49, Palace Road, Manikyavelu Mansion, Bengaluru, Karnataka 560052, India","geometry":{"location":{"lat":12.9897471,"lng":77.5881502}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"9904a7dc084a4026a6f96b222a9b67f5818cd39d","name":"National Gallery of Modern Art","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":1872,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/113006397068601736650/photos\">Rafael Schreiber<\/a>"],"photo_reference":"CoQBdwAAAE54UbWtlcoNax5-BNo6eYzxJa9hFC4VG-1_PQXVfjXdzJP0dzCU5XU6eAXMOkNfMYGh-iAJuGmuScPXKIQdH26Hl0jASLmJp4bgZZdwzjrO9xiHeOXQ-Lt3UaM6ASzWYZHhe5JuW9_OzVwGHQYT7Pd1sDH4YO_-VhAB9HVX488CEhCEKAqItNsEPpRwizJXc8g2GhRrlAM3OVu9W4z7cYbaQlWBMt--Xw","width":3016}],"place_id":"ChIJqZQybIEWrjsRezNLL4Ju2Gk","rating":4.4,"reference":"CoQBcQAAAHykpcsnuZzJLvPGmeJbTOpNZDcAbDro7Lsd0NewpUFvIBWy3FfINx17NJA7eLmufUU3xbBJsz1n1bhyYo_LYy1De_7hIiQ2t1O8yfSxEx6ChgJzyDzD5g3vBa8M0JeMt_iTQ0RCrP58ST7HZXNmOF6u7tHyXDNrRLSdBGvEhGBQEhBKnHEBCxUkw2OzPrVuQ_aHGhRWkbx20YJVZvRGem48NT6-uDDNJQ","types":["art_gallery","point_of_interest","establishment"]},{"formatted_address":"Tavarekere Hobli, Bengaluru, Karnataka, India","geometry":{"location":{"lat":12.90939,"lng":77.3957798},"viewport":{"northeast":{"lat":12.91025355,"lng":77.39597660000001},"southwest":{"lat":12.90910215,"lng":77.39518939999998}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"9d436be2b91c9778cb866224d8bed70afe1733fb","name":"Dodda Aalada Mara","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":1200,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/116567251780827698008/photos\">Ganesh Gowtham G R<\/a>"],"photo_reference":"CoQBdwAAAHrQ43sOabVOJ3PNjae9oxWDFOdFQfD3hRXvttMtHwB93OJezPrrDQ2d6T9zIhsRRcbBFAjSsKPfy-ymlVnaFnOIS-wBzbf02rHJP-UU9DIh5ti5PssaGMgSMoPdAnIAY_AmpmTPe1yiWz6WXvpYToke_Gj-4wI89nGGgGzD_Vv8EhBCDQpOg2mnspFJI6DOWVw0GhQbFDWO2acV2Y6wZZuC_ORvF3YYow","width":1600}],"place_id":"ChIJRzdYfjQ4rjsRc9kA7UZXzZk","rating":4,"reference":"CnRlAAAApuolhB7ewwEzHD3vTEQeDTBcEcb3D5R5OKDx4IyMtgooTr18xFx97l846DfK8BQaNltahFSfzulfSKflZwHAY_OI3zpOAPsXoGeNld1todLyjHS0JCyjr2DMUcG8r_6LsBy8O-DCUtDGIl0HP5VtHxIQIostLH_rtEMw6L7sg79CIhoUv5wELTYvLzr46viIkhHZ-imTWvU","types":["point_of_interest","establishment"]},{"formatted_address":"Near Mount Carmel Institute of Management, Palace Road, Vasanth Nagar, Bengaluru, Karnataka 560052, India","geometry":{"location":{"lat":12.9986907,"lng":77.5920093},"viewport":{"northeast":{"lat":13.0102745,"lng":77.59525295000002},"southwest":{"lat":12.9907469,"lng":77.58775795}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"b77167e5d3bc242297e8038b9db627a22d035464","name":"Bangalore Palace","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":350,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/116157180485191468643/photos\">ram kumar<\/a>"],"photo_reference":"CoQBcwAAAHWAhI3OmFE0V6ksOTBGkM82FKw3THNyK_cWrsP2AeZQgDYRt1LyNx1wt0DmY9vQ2eqN7Bdgic8jkV9-fztqYyd_-P-igZxQa7_5G_6KIkEh5uoDkfhEgbt4lJ0LBYBEpYLvqOSZWTeMCw5bTgzUcK_ZiLAR48bafFsiGzv2Y0oCEhDssc76ZmRKUTx6Slh74CiwGhQu5lquFECzM7A5BtAP-LQ8ImMJug","width":1004}],"place_id":"ChIJN1ZKKUkWrjsRzxIVM363-LE","rating":4,"reference":"CnRkAAAA7T6MrxTYNLrriO6EzbHqXSupBB2S6bhC_s0bTajTjgdvde4J-cdSSeVRWazrNj63ThPUv96cH081ujf9Bc742snsGhAd0P_v1z1MFxvRQsv3IjUbc8iSMQoRHqRcxGqAsDyj4k8KAPZM3bCs1IQOShIQ7YiAS3j2iFAAvduh9d2FjBoUJn6BWIYufz2buyt07GFypP4a46o","types":["museum","point_of_interest","establishment"]},{"formatted_address":"Bengaluru, Karnataka 560004, India","geometry":{"location":{"lat":12.9507432,"lng":77.5847773},"viewport":{"northeast":{"lat":12.95568749999999,"lng":77.58564925},"southwest":{"lat":12.9490951,"lng":77.58448665}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_recreational-71.png","id":"8ae4a9c5e9c2b40e58bf0c947e5502ff9ef71c29","name":"Lalbagh Botanical Garden","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":446,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/103918301412806721545/photos\">Lalbagh Botanical Garden<\/a>"],"photo_reference":"CoQBcwAAAJ5Za5Bt_KuKw1seJ-le5kUAmqJmWpwZj5inHjPyL4ahLdccJdhbIZtTLunhOdpqOqrSmdAZrprDXWsSeZD9E1ckDE6yaIUaf4UCxM28llEZgUCrmzjncwI5kiyGhUgPCLj2ozu2KvjHifLt7Hk9ewOJ7aEk_4pwNmZzyo3GwrwqEhDL852pEETOdsgLuxzny66hGhRwjbLwhltUBOb5EQTpL7AjAZoiuQ","width":445}],"place_id":"ChIJHdPykcEVrjsRIr4v35kLEY4","rating":4.2,"reference":"CnRsAAAAxpgN0PhDt-4NNIXl8jShSAdArlkjW8Wc7L9zD6bEwudAnFLsN06IeIzAXvBuDQenuSeIaXceILpdSIk308Pa22CAX64oBeuADGt3rEMWnSHTxxL-E399GcI8L4cfdYRygdKS8dCAOLxb0YTM6BfIkBIQaKUTBDHenGpGjjmZUY0ufBoU22L1_kgHxPgOaNR1ILfIhB683ag","types":["park","point_of_interest","establishment"]},{"formatted_address":"Bannerghatta Road, Bengaluru, Karnataka 560083, India","geometry":{"location":{"lat":12.8009343,"lng":77.5776681}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_recreational-71.png","id":"b75ef794890ad3443b580bc2815a99fb028785fa","name":"Bannerghatta Biological Park","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":2208,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110249753617995314877/photos\">Puttu m<\/a>"],"photo_reference":"CoQBdwAAAEDn1xZvZb3ekB2ANacq-vMHmpjQpNy634XwoVAAATp11vuzjABq4S39vwsREIZopY3gZbbk1mgfKRAVkqhLFLrRIKwyKPaUSaDhhdvSDbD_TFLKDOKsYdj267oljwkt-E5sQhtZxwVoXnd3MylhhawS68ZVuZKbJPKUfX81ttFGEhC9Sjechzd7iVVHH_6NwG8-GhR3DsDS_D8xKsHfaAm9wPyxtPpDcQ","width":3920}],"place_id":"ChIJsW0ZC-BprjsRXzqh_3gub08","rating":4.1,"reference":"CnRvAAAANNW4r-Akcl6K_if8Gd3jjD3mQ5ZWvhT3vueSZNxl-wLwiUoL2jsd15iXzi2aZr3QOXzrbSUxzU3wMWN-lSU6QKvvIjKZHE_Jxy8uhafP9uysPURlK6Lqr5TWUM675ePnx0eQPgxiu7uqL6ANgTji2BIQmShcoHVRcPdootZQroehzxoUiR2GKw5V9Knc4otUGfHo5OPWWi0","types":["park","point_of_interest","establishment"]},{"formatted_address":"P. B. No. 5216, Kasturba Road, Beside Karnataka State Government Museum, Bengaluru, Karnataka 560001, India","geometry":{"location":{"lat":12.9752264,"lng":77.59634489999999},"viewport":{"northeast":{"lat":12.97542505,"lng":77.59691925000001},"southwest":{"lat":12.97463045,"lng":77.59615345}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/museum-71.png","id":"c390f3fde0cf6545104dd2561aa10b2a8317f5a9","name":"Visvesvaraya Industrial and Technological Museum","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":468,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/104158043168750019754/photos\">Visvesvaraya Industrial and Technological Museum<\/a>"],"photo_reference":"CoQBdwAAAM_RUnHQar1HU2frl5h9TSF61qaOhHNu6b9mMHHYp4ghw9AV9aTls5x1Wo-NIB6cumXoc-dVRrokNGR8MrLfziiFgydeZHSwccEHChzv55_CMjUPFxk6GaTwApFQk332oq_NEbj82NshR0m-Jh1_TG6F6vwRrVFWITo17A95PxkhEhAw94-eLY2VbEyS5XYM_0SoGhQnhwHToWvjIgAkSXE9KLYYkEct0A","width":471}],"place_id":"ChIJqyoigt8VrjsRp_hKR5Y_1X8","rating":4.5,"reference":"CpQBhAAAAAk25qv6MYTCTU2PcK012vg3QQntZG9DYnnczsGsSM94s0dIsRAZ5m8tmG_CuoFUgLvcf9coSnKInmsNEOUzNSgiVEx8HToha76FtQN463zVmbYVXmX5Y8Ss0BmnIQjelDJMz4cnNmuq6V-PMjpqD-0YIJHsiqertdPhdM1dS9Iwl9INtXm6cPg6JeTSVwreIRIQotjY8bhyWeoTq7ytrfnnThoUSHUgCNVC2gxcrRMvN0rtSe3t1So","types":["museum","point_of_interest","establishment"]},{"formatted_address":"Varthur Main Rd, Marathahalli, Bengaluru, Karnataka 560037, India","geometry":{"location":{"lat":12.9546853,"lng":77.6807805},"viewport":{"northeast":{"lat":12.95476335,"lng":77.68079774999998},"southwest":{"lat":12.95445115,"lng":77.68077475}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/museum-71.png","id":"cb6c08ad2e65009678376d7ffc2ce9028eafca1a","name":"HAL Heritage Centre and Aerospace Museum","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":3120,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/116869254352908455972/photos\">Arun J<\/a>"],"photo_reference":"CoQBdwAAAB7ZiDJQJPvo3XkOx_XLVtxPncPX21mytUUdK__TcratBPN5TB0waCaHI0DySbgRKSvHz-AiKjzO5iU9dDHVkPneG1HawykolQhceOslSKhX99DBGJe-qVmp3ypEo3FeqbUnyQQ-9Xvk9cMGXT9ZisvJUxAU0fi7OTsdH-ocCofUEhDrZ1GINcOufhcr0kGqmfSpGhSegmzyZhrkzrOXHUfL4wM8EWMKgQ","width":4160}],"place_id":"ChIJg2Ir7MMTrjsR9kqAcrWsFew","rating":4.3,"reference":"CoQBfAAAAJ89VgKs7VeabL26uXEQ5HX9e3Ll04l7461V16yprdSDM9Lqbgr_U6Y7lDuIqY1Mgp-ZqaQx5H0u0c9TzDLsArqsfef-mBfDf1Y3Qof9ZN10t04DE5a8lXLL6no73rc3IlU8YzaT-ASkY56BFDMG2Kf3hSfLj_p07QlQGxB3DPNeEhB1rI0yzcYaRZ4TNKJhoogiGhR1G9D77hIL0uHr7JJaYJNoTlsfgg","types":["museum","point_of_interest","establishment"]},{"formatted_address":"1st Main Road, 3rd Block, LIC Colony, Jayanagar, Bengaluru, Karnataka 560011, India","geometry":{"location":{"lat":12.9311998,"lng":77.5889921}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"365065086daa4b534b01cda79310a376f3a883ab","name":"Sri Venkataramana temple","photos":[{"height":413,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/114890985096543825769/photos\">Gopal Krishna<\/a>"],"photo_reference":"CoQBcwAAAEpzgQIO7VFOQxeixop7oeUMZsm3iQtTu2JUFSnus_jgsbN525QPnJD4gqDCkEJInGiJ2HCykYPjQG-6m9HgM8H4kgSiIkXjppy-Vr47s35gdVcljlNFzZBHklKjPX2ei_sYFrXlGSpn_9l4iASWAfhxf44fFDgSy7gJcEOzuy0UEhCpAp5xbTKzjyWUeVxtb_bvGhSHtAit9FHB4BXKqMD0uEaDo5hvrQ","width":550}],"place_id":"ChIJda_OEqMVrjsR60DMTOTSveU","rating":4.6,"reference":"CnRsAAAAcA514kHIq7IUp9mSb7W1ZpEEt9FqYS8O98JznUtuvI3VtUNCQJhLq_VvypOWKy6ZHdasUuqkJvj0-dYDos5qU1-_1_OlMwbR5wtqbTyfzYyOghhJAkEqo3LJwooiA0QilDibJ6l3oBUPaw7bLjz4ChIQcUEgXEf7keDhxJyO0zzkyhoUQ5bu3xV1cyi-OOMm9_ArfZgi2Iw","types":["place_of_worship","point_of_interest","establishment"]},{"formatted_address":"Msgr. F. Noronha Road, Shivaji Nagar, Bengaluru, Karnataka 560051, India","geometry":{"location":{"lat":12.9842288,"lng":77.6044404}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/worship_general-71.png","id":"b810ec6ed9e26fccd5327f17c1c2b55f1f27ec9f","name":"St. Mary's Basilica","photos":[{"height":1320,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/113162599058905524851/photos\">Venky Venkatesh<\/a>"],"photo_reference":"CoQBcwAAAIilnOKKHb8oxkCxTb3pMRuxI8WNtrD6mpWdQAsNDHBp6Z3R6mYlm3yHD6Wp-qCPApzfwH4gYtvQimnI9sCEdWQmlDC0zFOo6fxj0OE5A35tQw_-jg8C6Kl2XXYL4fEoQVhrWm403AyL40AOm--8iHIU5O7c6gyNW-zs5wEsNw8pEhC18mO1QqdAU8wLxunSEPv3GhTMtC3u_YciGzr81MF7TVZEN9ZPkg","width":1980}],"place_id":"ChIJ8VNf1mMWrjsRwsMEl564ksQ","rating":4.6,"reference":"CnRnAAAALqZvSJ9Tq0IiJCrLmUNpNDBV6CuwisfLG2QLd8rbEZ42mbYUD8gUW62zDWbI9u5bNYLc_U1n0LtJWut35fv__cz6gQzfQOMT-NxnfU5KHQFjrdY_p58yxat9gglMFEJxSbh9uuXf-KJ6A2XOD8sr0hIQP6vzkt0LdMubITxBfZQLTxoUULOZrbCDVRDcE-MCh87HYIbRTTA","types":["church","place_of_worship","point_of_interest","establishment"]},{"formatted_address":"Bull Temple Rd, Basavanagudi, Bengaluru, Karnataka 560004, India","geometry":{"location":{"lat":12.9428878,"lng":77.56825839999999},"viewport":{"northeast":{"lat":12.9429131,"lng":77.56848539999999},"southwest":{"lat":12.9428703,"lng":77.56757740000002}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"f66af09e1d15372d7fc759d548ca3cfb108aab44","name":"Shree Dodda Ganapathi Temple","photos":[{"height":3456,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/108977743546616325911/photos\">Vijay K.<\/a>"],"photo_reference":"CoQBdwAAAOUfeitR7hR_tBxIOv_I52g9ibVxv4tTiz5zy46MMXcXAhbGv8FdLNucC12HqiXCo1KmgHEel1DIDMxfZ-Bna8jQShOMTXQ9Qi7YhE0Xwl4L9OEJe6wNXmqDY2IrLU3Ga4E9v3An5tsF40nWyPiIBvCH2QyGc_-CeyPM03pugHfrEhBapzyLVH4cVvP1pV6A-R59GhRSz2p_GUi-dBhYo1psRYmgpG2wKw","width":4608}],"place_id":"ChIJpbprrowVrjsRFme9nlnRtJg","rating":4.6,"reference":"CnRwAAAAm-Wi3LlVzSafrpEcFfJWqlITlF5qpO8VJXfkmoA8EqMPGUJPquQUSCagfZlEFZd0Nm-uiC_Upq6366f_wIAPZoV3jJ5DAIUntTgt590s_lkgZ9A7JSrW_7tgEfSj_1NMscKI4Ipi5l47eEo85L_F3BIQEBzv52qEKudRcYSPVylI7BoUIv_8QVbXF9SO63YuxjnShW_itOo","types":["place_of_worship","hindu_temple","point_of_interest","establishment"]},{"formatted_address":"49, II Floor, Khanija Bhavan, Racecourse Road, Bengaluru, Karnataka 560001, India","geometry":{"location":{"lat":12.9828427,"lng":77.5855552}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"ea3dc2604e42bf81e7042d82aa22aad93c4b98a7","name":"Karnataka Tourism","place_id":"ChIJYSy2exQWrjsRTh5MTQWJa4k","rating":4,"reference":"CnRlAAAAJD8wLW9tohN-fx8BMCjdizpMX3lcmUtJ0s-tRhH7oDFfHwlwzUmgqR3npI4IoEKe9kutuFABPm_iIZzmUOQAwZ5WG9EEuhZ3NITpKZy79sVRFIWiSElkjL8PXvELZ0hfaMESBOmEdnwKxoDsdBzCYxIQYUy6qxVNEyqxcPviiV02mBoUmEGuUx4lekvUW2Dv-3OCIgKeoSw","types":["travel_agency","point_of_interest","establishment"]},{"formatted_address":"AU, New Tharagupet, Bengaluru, Karnataka 560002, India","geometry":{"location":{"lat":12.9629472,"lng":77.5760913},"viewport":{"northeast":{"lat":12.96330405,"lng":77.57658375},"southwest":{"lat":12.96282825,"lng":77.57592715000001}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"52acb6e961a359ddfb851f8894f685b14352cd87","name":"Bangalore Fort","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":3480,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/115090415447463898530/photos\">avikal Bisht<\/a>"],"photo_reference":"CoQBdwAAAGMIVkGIsasYvWiM42KAfkGxrcPpbnQQPsZP0KIv6rg0o30FE8rxY9Htb5p2bUsJKLseRCAx-4b8R3civ22RflIsM2QD9fyR2xgzc7U6CKtGjqDk9x9wUyGdFjSAyRPQaRlMqci9W8peUwhnT2SNOMLbKRFmbxoJODWtQY0oW7cyEhD3EeiZ-vAmK1kyeHT6eLoEGhSs4UL_dethlMeFAvFtcRKvK-c2PA","width":4640}],"place_id":"ChIJVx06BOMVrjsR1-a9CQJZpLI","rating":3.6,"reference":"CnRiAAAApeekzX9PdKHoLkzN6JHe3w3QQXoifvqryZabW7FvEFOfzNZTsVlzgAvM8KWEi6xFXS1bU6uHWOPhYPt61_NIt-33ebqHk4fJmis-MHxDJV7lRH0qEXj0n7UWK7xLQGute0cXGK4fKdPVI48XLgVqVhIQ4e_wSPXG_84L0VaBzh2m4xoU-xil7M9_z3CmVWpK_WWIKxqGXFs","types":["point_of_interest","establishment"]},{"formatted_address":"Allbert Victor Road, Chamrajpet, Bengaluru, Karnataka 560018, India","geometry":{"location":{"lat":12.9592693,"lng":77.5736093}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"454d236c0c8443c09e47d33c65e40a5fc4723d46","name":"Tipu Sultan's Summer Palace","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":1536,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/109931744413811791602/photos\">Mukil Elango<\/a>"],"photo_reference":"CoQBcwAAAFyIiLsCmwwoTf712oYtW4zslpsW7yDnAwIvfZsnrGq6Y9N115r0O3JXMOXV2kefa8IG1dsD0HIiB44_zuVBwbEuzxe7gqfQBeVFMsRtqNAobEffG6bGhpVuOUOx3tmk5cD3XKfX5z7nTzAlflkPpOD6Kk2cxZdG4XCXN09ju31qEhBl4cxuS1wcfeBCSm2z9SlwGhTwka0L-wwnyNnV9LZG9EyTCVbKGw","width":2048}],"place_id":"ChIJAeY0tOQVrjsRdZ8hleP7aRo","rating":3.8,"reference":"CnRuAAAARhcUc5CDfWMIqGqFLvz-WfpLf3DRRkexou0skSMfBaSZp7kfinEE__HBl3XnY0r72rvrRejjj7PcHxz-Yrsu2m9laLKM9Dl0_fMDrIGChJA9F6Zd65jy_6ENFwdKynvsMGz_EMvjnW_Jpx-6tRTYxBIQdN3oUnlunvkDeEUSKyvcZxoUBbu1aHZDMMPJwoT2IMzQ1J0W5Zs","types":["museum","point_of_interest","establishment"]}]
     * status : OK
     */

    @SerializedName("status")
    private String status;
    @SerializedName("html_attributions")
    private List<?> htmlAttributions;
    /**
     * formatted_address : Sri T. Choudaiah Road, High Grounds, Bengaluru, Karnataka 560001, India
     * geometry : {"location":{"lat":12.984865,"lng":77.5895718}}
     * icon : https://maps.gstatic.com/mapfiles/place_api/icons/school-71.png
     * id : 2a8360f04f27d73c8759255d99a50eb3d356d98b
     * name : Jawaharlal Nehru Planetarium
     * opening_hours : {"open_now":false,"weekday_text":[]}
     * photos : [{"height":1224,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/114404896690583715176/photos\">Sunilkumar Thimmarayappa<\/a>"],"photo_reference":"CoQBcwAAAOsvQ9bju89NbrpvrCjAjo72eOsegEnchMYFIgiOnAhYBtPgu9VmMWvVkUALRqAP4XrWKKzdBtPjNqJ6plYE2-excF4nYcwwCwsTIpC_6Q334CFqC-a4p1ZKJ12oKlQLne9U1Iu0nF1ILWyGinqk9P03JJcL46ZrQ1clSASQj4qyEhBMBAjwPcgwsM-oygHw0sK2GhQoIGs7hGCB_ia-7z3ad4pZOCoPDA","width":1632}]
     * place_id : ChIJk0gN-2sWrjsRljNKfECgL9M
     * rating : 4.1
     * reference : CnRwAAAA7R8ETcsockGRmxJQ29w7zneqnaLnqXBTWqc21L0UjJr0CmkYeR2OW5MbGVdigBuEae7_IwlJKDId0h4G4_If0rPNN6xoG_XXz05ZEfzuYNQ90iuoWX5mt-RmRt6HfDkj0xgWV0Y-P4MfcRUTcZPbABIQkpEqFfF4uyl3djX-h7c_0BoUGB4a1wjfON42bqDQk4cnGvOqQQ4
     * types : ["point_of_interest","establishment"]
     */

    @SerializedName("results")
    private List<ResultsBean> results;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<?> getHtmlAttributions() {
        return htmlAttributions;
    }

    public void setHtmlAttributions(List<?> htmlAttributions) {
        this.htmlAttributions = htmlAttributions;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        @SerializedName("formatted_address")
        private String formattedAddress;
        /**
         * location : {"lat":12.984865,"lng":77.5895718}
         */

        @SerializedName("geometry")
        private GeometryBean geometry;
        @SerializedName("icon")
        private String icon;
        @SerializedName("id")
        private String id;
        @SerializedName("name")
        private String name;
        /**
         * open_now : false
         * weekday_text : []
         */

        @SerializedName("opening_hours")
        private OpeningHoursBean openingHours;
        @SerializedName("place_id")
        private String placeId;
        @SerializedName("rating")
        private double rating;
        @SerializedName("reference")
        private String reference;
        /**
         * height : 1224
         * html_attributions : ["<a href=\"https://maps.google.com/maps/contrib/114404896690583715176/photos\">Sunilkumar Thimmarayappa<\/a>"]
         * photo_reference : CoQBcwAAAOsvQ9bju89NbrpvrCjAjo72eOsegEnchMYFIgiOnAhYBtPgu9VmMWvVkUALRqAP4XrWKKzdBtPjNqJ6plYE2-excF4nYcwwCwsTIpC_6Q334CFqC-a4p1ZKJ12oKlQLne9U1Iu0nF1ILWyGinqk9P03JJcL46ZrQ1clSASQj4qyEhBMBAjwPcgwsM-oygHw0sK2GhQoIGs7hGCB_ia-7z3ad4pZOCoPDA
         * width : 1632
         */

        @SerializedName("photos")
        private List<PhotosBean> photos;
        @SerializedName("types")
        private List<String> types;

        public String getFormattedAddress() {
            return formattedAddress;
        }

        public void setFormattedAddress(String formattedAddress) {
            this.formattedAddress = formattedAddress;
        }

        public GeometryBean getGeometry() {
            return geometry;
        }

        public void setGeometry(GeometryBean geometry) {
            this.geometry = geometry;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public OpeningHoursBean getOpeningHours() {
            return openingHours;
        }

        public void setOpeningHours(OpeningHoursBean openingHours) {
            this.openingHours = openingHours;
        }

        public String getPlaceId() {
            return placeId;
        }

        public void setPlaceId(String placeId) {
            this.placeId = placeId;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public List<PhotosBean> getPhotos() {
            return photos;
        }

        public void setPhotos(List<PhotosBean> photos) {
            this.photos = photos;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public static class GeometryBean {
            /**
             * lat : 12.984865
             * lng : 77.5895718
             */

            @SerializedName("location")
            private LocationBean location;

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public static class LocationBean {
                @SerializedName("lat")
                private double lat;
                @SerializedName("lng")
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }
        }

        public static class OpeningHoursBean {
            @SerializedName("open_now")
            private boolean openNow;
            @SerializedName("weekday_text")
            private List<?> weekdayText;

            public boolean isOpenNow() {
                return openNow;
            }

            public void setOpenNow(boolean openNow) {
                this.openNow = openNow;
            }

            public List<?> getWeekdayText() {
                return weekdayText;
            }

            public void setWeekdayText(List<?> weekdayText) {
                this.weekdayText = weekdayText;
            }
        }

        public static class PhotosBean {
            @SerializedName("height")
            private int height;
            @SerializedName("photo_reference")
            private String photoReference;
            @SerializedName("width")
            private int width;
            @SerializedName("html_attributions")
            private List<String> htmlAttributions;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getPhotoReference() {
                return photoReference;
            }

            public void setPhotoReference(String photoReference) {
                this.photoReference = photoReference;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<String> getHtmlAttributions() {
                return htmlAttributions;
            }

            public void setHtmlAttributions(List<String> htmlAttributions) {
                this.htmlAttributions = htmlAttributions;
            }
        }
    }

    public DataModel(List<?> htmlAttributions, List<ResultsBean> results, String status) {
        this.htmlAttributions = htmlAttributions;
        this.results = results;
        this.status = status;
    }
}
