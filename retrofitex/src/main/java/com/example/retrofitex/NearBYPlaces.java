package com.example.retrofitex;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Priyanka on 14-09-2016.
 */
public class NearBYPlaces {

    /**
     * html_attributions : []
     * results : [{"geometry":{"location":{"lat":-33.8709434,"lng":151.1903114},"viewport":{"northeast":{"lat":-33.87039965,"lng":151.1906609},"southwest":{"lat":-33.87112465000001,"lng":151.1901949}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"3458f23c154e574552e0722773a46f384816b241","name":"Vagabond Cruises","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":4016,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/101516907347198229066/photos\">Vagabond Cruises<\/a>"],"photo_reference":"CoQBdwAAAE7cIkW9LB8tJzglArjSkxJeaDjvGx3eQEriiEPSk2lyZ3wHKKWgj03wKHSvLkJKashP-UxU8UeZsxQz6cSN1Jl3Ykym3W9NPbVhgy7WdBhaEqc5SmqTdkOhbfR9hZ_t54f0j1ZvOLGTi5Z8MO7tiMovYgcT77yChcq4ZNXdtoqvEhA1SNfvUPzKU3TkyztD1ijHGhQeEx0pTGj-13gheYeD4hs0mHOb0w","width":6016}],"place_id":"ChIJLfySpTOuEmsRMFymbMkVkOE","rating":4,"reference":"CnRkAAAAGDLOKeiBIHk0hRVlwxRdFOge-rQBvKLscUCbn_tex7rhgaFR_KBZKfet_etJtvw7Dnc36TZ-bi8MfyUNk2vfhT41k8QGvw2p388-KE7x8ldQvb7PsWRZ7H5UVDwRD6YaCpreZ43V2pWPDukM4q77XRIQQhjAIVtmqp5csl0SgQmlaBoU9jfjiDUbD6tvvU0U8dxoCPnQZKw","scope":"GOOGLE","types":["travel_agency","restaurant","food","point_of_interest","establishment"],"vicinity":"37 Bank Street, Pyrmont"},{"geometry":{"location":{"lat":-33.86755700000001,"lng":151.201527},"viewport":{"northeast":{"lat":-33.86752310000001,"lng":151.2020721},"southwest":{"lat":-33.8675683,"lng":151.2013453}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"ce4ffe228ab7ad49bb050defe68b3d28cc879c4a","name":"Sydney Showboats","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":750,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/107415973755376511005/photos\">Sydney Showboats<\/a>"],"photo_reference":"CoQBcwAAAEfismiF3rcmCRHFCl45iaSHpJoeS966mw-K6y2lRjZHov6z67h6PgPc2sCMAywT4_XVzHKmADUCnfN7_02-OhIIMjbOM_zOCPtV9hMe6l332_0fV57d0Ys6jxUuTAFLqazcjfn6a0nYgLgPAT7GeT-vUVAIM45Hm9bfLvDref5SEhCdmffHxa3pKTug69PUSKUkGhRakWk3nt_cBpJvcvJ5dEjVSiJ_xg","width":1181}],"place_id":"ChIJjRuIiTiuEmsRCHhYnrWiSok","rating":4.2,"reference":"CnRkAAAAqnUibjI51m3J4oqK6w3QThSZTQJGR-ajsWzn6qdlZXvxrtN1QTdPAgdPSeJ-2RutX2Qi55usMIwjR_UnTUhZSx9UQXHEXthuUlH37Is9NMk6FeuwoUAtG33PmRG4xzfVpWOPXS3hfgfCL7ZEAXECHRIQ3h2Oq1dCDgBi0dOGT0WE0BoUJdnyod_HCLMQKE-OpdX0y34KhQ0","scope":"GOOGLE","types":["travel_agency","restaurant","food","point_of_interest","establishment"],"vicinity":"King Street Wharf 5, Lime Street, Sydney"},{"geometry":{"location":{"lat":-33.8709434,"lng":151.1903114},"viewport":{"northeast":{"lat":-33.87039755,"lng":151.1906561},"southwest":{"lat":-33.87112535000001,"lng":151.1901965}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"e644f7f34cf875b9919c6548f1b721947362850a","name":"Lunch Cruise with Jazz on Sydney Harbour","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":380,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/105423912060796272053/photos\">Lunch Cruise with Jazz on Sydney Harbour<\/a>"],"photo_reference":"CoQBcwAAAGoHOPiAzXFxPKcvjwgUgeLcPGjW8YxLyYt2Dwyysh8IUyvP9uKsOAaZvcqTb-iUaAhuttGZmbHWepze1Be5XTiAKvTBOiCxKWma4Qp9yyBmKGWU2WaQ4wr3SsqW6p_l_vxUtlIj8Upk5ccLL0jMI-zjM3msX3Ozh93HdPdp2SO0EhDP-WFX7Jb7TR22LdSTanWOGhTE4hvm05wWfPUawnHDa7FXKee2Dw","width":380}],"place_id":"ChIJLfySpTOuEmsRPCRKrzl8ZEY","reference":"CoQBewAAAKwqjqVyh5PI0uoCHQ9ekhREfzgUVY77TqRuT0C3EvekpfUySW81LVH26UKUf9k0yRfHNV4MRzjxbGz0oaz5Asa0zur4gFzb-clq8duzS3Whdh964WTnNfE1xLM-zxYirg-k7jU3FOl1KXhYfCIK9jodv52SHB1epBa1z0fXD_pnEhB2_UKgXlGzENrH_WVJPbhaGhS82bRfNJyM3DdYPAaYXxJqXCeLKw","scope":"GOOGLE","types":["night_club","bar","restaurant","food","point_of_interest","establishment"],"vicinity":"37 Bank Street, Pyrmont"},{"geometry":{"location":{"lat":-33.8686058,"lng":151.2018207},"viewport":{"northeast":{"lat":-33.8684986,"lng":151.20212835},"southwest":{"lat":-33.8689274,"lng":151.20171815}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"21a0b251c9b8392186142c798263e289fe45b4aa","name":"Rhythmboat Cruises","photos":[{"height":480,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/104066891898402903288/photos\">Rhythmboat Cruises<\/a>"],"photo_reference":"CoQBcwAAAOdkuaWTDODaiayxZr90Q11_jtmlcj69pDVzdAMvuaQiH3eMziUOHe-yj29EruNbSJOHao50ofT_6rV3SRA9SZIJQGZeOn_Mtp37LzmLqTrkCwd6bmmI8oGdmAtFjAsqHeq_SvKTIgoOICXXRuOAWqi3oUV1JvuUXJ789IS6RwKHEhC8SxIiXqrgk17ID0xqiF9yGhQFXFszMIVgwpHxgd35jTbU-q2C4Q","width":640}],"place_id":"ChIJyWEHuEmuEmsRm9hTkapTCrk","rating":4.1,"reference":"CnRmAAAAO16DCDwrZ63dwDrYxIWepEOv-P_KOhnVYR7V30M-_GaEO6-F8MOx8rSbaReDYg9c22olY5sx6taQ0aCuzH2XD2UQeYcadTbMIH2MSElePDY7Yxd3qAd1nDO7joVG0Dcj2likxVQoDKhHL1FdHQGNmBIQJ_iHbeAeoS1RvdpyKwBAuxoUM_6FjQoQRbB8fxy8EEROgJi30v8","scope":"GOOGLE","types":["travel_agency","restaurant","food","point_of_interest","establishment"],"vicinity":"King Street Wharf, King Street, Sydney"},{"geometry":{"location":{"lat":-33.867551,"lng":151.200817}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"b0277cade7696e575824681aba949d68814f9efe","name":"Sydney New Year's Eve Cruises","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":813,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/107666140764925298472/photos\">Sydney New Year&#39;s Eve Cruises<\/a>"],"photo_reference":"CoQBcwAAALR2IhtYASszAYod1OdlyIsebtx2c5GnDkILB1W2VoyoVl5w5GOW7-5FF1yXGOXl2m3qcxEz3TkKrXJhOocwBRTv2YDQ84K3ESO7kBVwtrqj1iau5n-LMzyf_1Y_y1KZgl5LnHCZMwkcq1Z7uJt9eRfAlAtJN0Gymz67I-4bEmC9EhBkrInUTZRgmtUTWL3uUOcGGhQ2zcXIkSYX-QwqgrrLaUDGRnd80g","width":1300}],"place_id":"ChIJ__8_hziuEmsR27ucFXECfOg","reference":"CoQBcQAAABMlpZgUZnfCFGLhfziuQFVWKrFN9FBzrkdk7jq3aRsVNC4YCD_g58QaEcGQ-K28WiaXpLLLtwhoW_Ysa-nKuOwYVN9XTE0G-bR_dJu6GcNfFECHW5WmFoTI9WexrqKouBmXEWs_hu3AJPVyfVcJ27hHdM7W5_nX1Kq-fx9xCUKCEhC3FZ0fbfOGzdD9N3DHMhwbGhQbE8TQk9vwJVAjV189cpt5L1Ecxg","scope":"GOOGLE","types":["travel_agency","restaurant","food","point_of_interest","establishment"],"vicinity":"32 The Promenade, King Street Wharf 5, Sydney Nsw 2000, Sydney"},{"geometry":{"location":{"lat":-33.867591,"lng":151.201196}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"a97f9fb468bcd26b68a23072a55af82d4b325e0d","name":"Australian Cruise Group","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":2448,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/118410684014024830328/photos\">Michael Mak<\/a>"],"photo_reference":"CoQBcwAAAKtYBDHOpH85c1y14-1U-bCUgQAQzps-ismYKpY8BZ1lZh0mTzXpPfJNz_Z-45YfyTmOz5mqND9tal4ApDTsbvnwWQCHYzm8yAEOH0bnrc8WY1Z9boNC6dn0d0STlblWWtAVXDdtQQu5Z0ToV6otIYx7BcspNH9qgDliUuFJWtcEEhDHwcbETU_rPs47WRtX4RpdGhSEeUhfOvLg4k3gzkke6gsPn2RUTg","width":3264}],"place_id":"ChIJrTLr-GyuEmsRBfy61i59si0","reference":"CnRqAAAAuiD6HLy56z07RY9HxdixiouPAfrnLxsVr8If4kERUIBASES10wrld0pq6pTUmCsWnTHnWw-onKPJ2PYRGLn0Ym2sSsm5p_DT0D4fwLHRLV8YVWRhWXe9HPbEp0MLdLRUgbqxoLcmQpee8QSveaIx1RIQGfv8iyfScbRfwcNU52H9zBoU7AvCZPed_8qvKNgMcWW_L6TsnLw","scope":"GOOGLE","types":["travel_agency","restaurant","food","point_of_interest","establishment"],"vicinity":"32 The Promenade, King Street Wharf 5, Sydney"},{"geometry":{"location":{"lat":-33.86724419999999,"lng":151.2017012}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"c620902a8565dd4c4d605fecbe4f9b585d881b62","name":"Blue Line Cruises","place_id":"ChIJvwSIiTiuEmsR8hEazPa4W7U","reference":"CnRlAAAAilVUHzUrxNTa_pPC6Giiq7HTEj5fSlkp2b84i9hhkfYvLmi5FMx4yBQI0iciETEB6WePcYB01-EW-Ge-qdMRcTECNEeR1JYwSHKKOjjzNJeevZfgy2ewu8-YZyIBNvdsH_iliY5prkSFd5qoXQyhWRIQLk94QQeRa7hSpUUyccIBWBoUoPBJX38m4FPZNpeSWXu17CMiFss","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"Australia"},{"geometry":{"location":{"lat":-33.8666184,"lng":151.2027477},"viewport":{"northeast":{"lat":-33.8665873,"lng":151.2028499},"southwest":{"lat":-33.86671169999999,"lng":151.2024411}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"111f458c4ee5ab8dd2658e0b442d4b14fda6b994","name":"ibis Sydney King Street Wharf","photos":[{"height":768,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/109753793480552091881/photos\">ibis Sydney King Street Wharf<\/a>"],"photo_reference":"CoQBcwAAAL0YSeIHFXTv8LWZH8aiNBJAZEFwBHi_PTKL7DXiwZP8mCnLNzr2FmcMrbvIcgbXESfWslOUDa938a9K8d7UzcD4r86pUq8rdCOPO5HumExLsgIl2L7EbX4VH9IqXEkDY5vRXAft1vlfGjYddlGlsg9v2M6959gIRa0jHQyuOFUoEhAO7YzNYPv6myima8jnTtzlGhRDA7jn57_bavFFwLefIBiyYVLMug","width":1024}],"place_id":"ChIJkzN9YUeuEmsRXS5xib231aQ","rating":3.7,"reference":"CoQBcQAAACycZPDfT7iOmjaeHhrdeczdVnbm0GcU14CKA__0YjskAivMglz6kpx7w8EUEF13ukrACWQcdfGnnyqbuonBbbI91JtBWFu2YP1hGWvpBxDNNTW9mW2aymXgdjXlD8meOCd08Arc0EIFQLtLGPh8E-3OMXHL7hbrDvrGV4X6j84IEhC6pddL_w7gZ1kWeS8t8qsyGhQTFXs9E3n5GByu4x3pd7P_rtjU5w","scope":"GOOGLE","types":["lodging","restaurant","food","point_of_interest","establishment"],"vicinity":"22 Shelley Street, Sydney"},{"geometry":{"location":{"lat":-33.8681472,"lng":151.1946364},"viewport":{"northeast":{"lat":-33.86807825,"lng":151.19480775},"southwest":{"lat":-33.86835405000001,"lng":151.19412235}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"690e0260be4d96e619d21b7a874200f0bc374e89","name":"Momofuku Seiōbo","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":1792,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/105870956330174629821/photos\">Rick L<\/a>"],"photo_reference":"CoQBcwAAAHmswT02SaShlITw9tV80vTbCcwTDnISKsy_sJ_XtANQ2HrA1qsuhTT0QldAX9a8Sx33cOSPWmCdCjgzkFJPuG6t5tHUK-mvTjjZph7a2dk4nJIM37lghqkeiJjSWMwY_XcH-Q4LfZsIFm_AlQ8F2lvYMbEO-ycb9MTiZT18D7w-EhB6biCML4kDFRGWGN34ch2gGhSJs9J73P8fGTJiD0xda--8cUhuVw","width":5088}],"place_id":"ChIJq6qq6jauEmsRg6MWt2pdd9U","price_level":3,"rating":4.3,"reference":"CnRkAAAAT07qtOkeYBXXd4czYJKf4Dbd0btM-yeC9OA1GVpullp85xi5EI_cG4Yca1kGuNx-Mf-MldmB2O2zamqieKQajAe2YDzc59L22dTaZ7-nN8xyC03FW8GFQ_3tK_eTQ4U4eXt6gY0E-cmQyoMqBvmNzhIQGiVa9dglPNc0CUfUzj2UhhoUvuJTLlbnpRbxnlSW9cdgOC4Eoos","scope":"GOOGLE","types":["bar","restaurant","food","point_of_interest","establishment"],"vicinity":"The Star, G, 80 Pyrmont Street, Pyrmont"},{"geometry":{"location":{"lat":-33.871042,"lng":151.1978691},"viewport":{"northeast":{"lat":-33.87085990000001,"lng":151.19798195},"southwest":{"lat":-33.87110269999999,"lng":151.19753055}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"64725a86605e7682a694c5383338e95b8993b398","name":"ibis Sydney Darling Harbour","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":3004,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/108010117506893215344/photos\">Brett Freer<\/a>"],"photo_reference":"CoQBcwAAAJd2Gg2Cmee10B8-yPqRSKqquRDowJvpuUJwO8W0Bg74yAHLkrYjByybt4-IZXjlY6o1nXH77IDKhlHKGfh3Y_uDBAuCIVAzTO65F21Th7ECXu1CG7K-iLyLvPHmql5kewNh3nXEG-VrgM--CV7bGpS3hrdHS8rKZPXvJ6-JyzbHEhCxbPaFCt34fn3UYPoh1jYsGhRyDy7v9dRuezBC-BV2DiigLtvPoQ","width":3269}],"place_id":"ChIJFfyzTTeuEmsRuMxvFyNRfbk","rating":3.8,"reference":"CnRvAAAAOo7eqhlXag-YFnuLjHyx2KamxQFF5iZzA_uHP83umUb825kC7sv7OQJCfAboF8Z6WyURzBGDq1gdwpt8Os-ZZsaZO0BxeY1zvlGvhccBdOF5suxz_jDiQNWu4J7H4xmMuW5b_fmhaTGa-yGAomGbnRIQ84WhPqxHb6K9HZPbjGtm5hoU8qCUZvx2XVp07PaMAoe9CFsze9M","scope":"GOOGLE","types":["lodging","restaurant","food","point_of_interest","establishment"],"vicinity":"70 Murray Street, Pyrmont"},{"geometry":{"location":{"lat":-33.86278079999999,"lng":151.1952315},"viewport":{"northeast":{"lat":-33.86174989999998,"lng":151.19592275},"southwest":{"lat":-33.8658735,"lng":151.19315775}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"05bf6e9aa18b35f174f5076c348ce8e91e328aba","name":"Flying Fish Restaurant & Bar","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":2448,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/118410684014024830328/photos\">Michael Mak<\/a>"],"photo_reference":"CoQBcwAAABRLbzO_WeEvLIyV14g4TxQk9wfuJx_-G1YAdoPPSBtogmBVeydgqFg9JysNhINkpfPey24y21adFUpTpWT7oN9cwXtYT3qL-vqU3arq-Lfv71Gkh0McpIvTAwmA0B0uobYzQhxnoStnNmIzJg46jjspvcBpdayPibViIYepVuPAEhDa8lZjECgLtLQu78jaPkm2GhR1KpMIilb8zxkuezA44lcqAceLSw","width":3264}],"place_id":"ChIJm7Ex8UmuEmsR37p4Hm0D0VI","price_level":4,"rating":4.4,"reference":"CnRvAAAAxkT_mwq4zWs__zhEw9gaLyGFna4oblCgbKhUD7HWG53ciCHXFojz-IKnOZtFcKQ6Wbp-3GSjlB4k3qCx_bSppKrsdxgDPZLS-upOerjkltDjVKF26CDBV3IVxx37Q6GbtlyjWNeUaTVtsR_f0QChoxIQxt7QNym_iZL2ilvilulK3hoUR5n_Okin2WEwmNOSNHk_BoUh1kY","scope":"GOOGLE","types":["bar","restaurant","food","point_of_interest","establishment"],"vicinity":"Lower Deck, Jones Bay Wharf, 21 Pirrama Road, Pyrmont"},{"geometry":{"location":{"lat":-33.8708202,"lng":151.1994884},"viewport":{"northeast":{"lat":-33.87079505,"lng":151.19997785},"southwest":{"lat":-33.87089565,"lng":151.19802005}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"f90a2cefe08c93293db1bc3953beda3685f773d8","name":"South Steyne","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":1722,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/108010117506893215344/photos\">Brett Freer<\/a>"],"photo_reference":"CoQBcwAAAKkhTFofg1NVbhMUPO4XyN_sFOpiyq1EA3q5iB_wDGUPTeGcfshAPQ-75I9iNlFSgYPdpCERwNmL_uAXJVq_TFM0NCswg1gImuC4-xYLZEpjDpw85x5zEzK_fW09AwrCqlUDM1j6LvLU-6SktBdf0PLnmTSvWtIUggFTJdLSMpLzEhC1ggQppNEkhGv1uM0W9u2pGhTuHLQC-LoTA3x8R-zUwihZpRRZTg","width":4811}],"place_id":"ChIJt9trB0euEmsRHdhhqjr37n4","rating":3.7,"reference":"CmRfAAAAAASe-t1Ev193EIak-h07vIjURDZI3jnooJZF6aPjSaMuP1B4rZR_DNn6c9eKAQgeP4TES09kSHwzsJJeKpQ3upT74mjSBKchNNdgDHbQXYQ4rVLuQF7xrtxbKK46x0c-EhCP7mNySFkPLTQO3rbmY_GJGhS0ptGIDFgQT9DH35RGYuRXS1vKgQ","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"Harbourside Jetty, Darling Dr, Darling Harbour"},{"geometry":{"location":{"lat":-33.8712997,"lng":151.1990326}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"9cc7076930226bd9c713efad7f18e82fcd7600b0","name":"Dragon Boat","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":3120,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/101224242111950060630/photos\">Hannah Tai<\/a>"],"photo_reference":"CoQBdwAAAFJsyerukKozXodQi5c0LCZL2Yu5jzVL0l735sdjF-Q5FJldpc6L4VWRPIjap6OnkVh7AAVKf8VOY-llL6-X5vyqk8MmXQbNf3TaAj0xQ3JyEBuHJ-lTkOn704RuENu_mr0UjaJzhs2oZeB9b9b0IcDr0G8WAKaWZ7JqjP1_9-gFEhA5Xwz9FlXK1MmF4zvJCnIIGhQWxmq3kdgYaXym1ZPFW1JxFHnyeg","width":4160}],"place_id":"ChIJsfCA-DmuEmsRM1QTsmdL1Uo","price_level":4,"rating":2.9,"reference":"CmReAAAAMTB9wC7_8K8QQ2Bv7z2NkqWuBt5zikBlUm5ZKPH4HjweDY_RhnO7Von-xyz1vhZgpsTyui5fDEW-KuelxlYsAKxV2Oe3SUcp6WP62J4Td_WtUA6qp4YPYQ7IHl1Ik8kiEhBzej4sDOK3aLjgk0Dume2cGhSegU1JLoKcmQmlYuZXTOz8-zRWPQ","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"Harbourside Shopping Centre, 2/445-451 Darling Drive, Darling Harbour"},{"geometry":{"location":{"lat":-33.86827099999999,"lng":151.2017512},"viewport":{"northeast":{"lat":-33.8682461,"lng":151.202065},"southwest":{"lat":-33.86827929999999,"lng":151.2016466}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"a2e6805ffa25d0d10cd3443ee9d394f328f106ef","name":"Manjits @ The Wharf - Indian Restaurant","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":990,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/101426609423179628746/photos\">Manjits @ The Wharf - Indian Restaurant<\/a>"],"photo_reference":"CoQBcwAAADpAQQbE7mzt4__-NoXkT8O0UjN09z21qsNv6s28p7kDAuy-LFGuzDXzlFWGiCz0Ke6Wn7_Q_8nICOoSt_sEsRl7-i4U0UhsGYAbdpNbiRwfgxR79YtEzhtpmXRaGy3YBvYcVWmml8xbQkf3IX4us4oyrNV4a7Xv3vWwfartQfrTEhDH-siq-cSRitBLrGmTMKW5GhQgqKLdyInSALF4tAKFB4mLcdw7kw","width":990}],"place_id":"ChIJIWt88ziuEmsR_87AR1awpAE","price_level":2,"rating":4.4,"reference":"CoQBegAAAB9WKV_CmbfpG2ksRgH7Wr3HqKUkxX9ixjYiOpPD9Psc5_1-QeFABZ9H8H3JcPdp1IJ6VlG_xO-M-lxJXdHg_G-hrwQY5L-CWSToyi3Uexsv0oc79k3vyoSrZifADhHM484MH-Z3TH6TASv2_K4CPCdarwWtFFwGEoXn6fIA7maBEhDbn2W-LZ1yAK5MIlQ6TBfmGhS1IQ5qjwmJ13VJ_556QJMsLe7TvA","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"10/49 Lime Street, Sydney"}]
     * status : OK
     */

    @SerializedName("status")
    private String status;
    @SerializedName("html_attributions")
    private List<?> htmlAttributions;
    /**
     * geometry : {"location":{"lat":-33.8709434,"lng":151.1903114},"viewport":{"northeast":{"lat":-33.87039965,"lng":151.1906609},"southwest":{"lat":-33.87112465000001,"lng":151.1901949}}}
     * icon : https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png
     * id : 3458f23c154e574552e0722773a46f384816b241
     * name : Vagabond Cruises
     * opening_hours : {"open_now":true,"weekday_text":[]}
     * photos : [{"height":4016,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/101516907347198229066/photos\">Vagabond Cruises<\/a>"],"photo_reference":"CoQBdwAAAE7cIkW9LB8tJzglArjSkxJeaDjvGx3eQEriiEPSk2lyZ3wHKKWgj03wKHSvLkJKashP-UxU8UeZsxQz6cSN1Jl3Ykym3W9NPbVhgy7WdBhaEqc5SmqTdkOhbfR9hZ_t54f0j1ZvOLGTi5Z8MO7tiMovYgcT77yChcq4ZNXdtoqvEhA1SNfvUPzKU3TkyztD1ijHGhQeEx0pTGj-13gheYeD4hs0mHOb0w","width":6016}]
     * place_id : ChIJLfySpTOuEmsRMFymbMkVkOE
     * rating : 4
     * reference : CnRkAAAAGDLOKeiBIHk0hRVlwxRdFOge-rQBvKLscUCbn_tex7rhgaFR_KBZKfet_etJtvw7Dnc36TZ-bi8MfyUNk2vfhT41k8QGvw2p388-KE7x8ldQvb7PsWRZ7H5UVDwRD6YaCpreZ43V2pWPDukM4q77XRIQQhjAIVtmqp5csl0SgQmlaBoU9jfjiDUbD6tvvU0U8dxoCPnQZKw
     * scope : GOOGLE
     * types : ["travel_agency","restaurant","food","point_of_interest","establishment"]
     * vicinity : 37 Bank Street, Pyrmont
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
        /**
         * location : {"lat":-33.8709434,"lng":151.1903114}
         * viewport : {"northeast":{"lat":-33.87039965,"lng":151.1906609},"southwest":{"lat":-33.87112465000001,"lng":151.1901949}}
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
         * open_now : true
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
        @SerializedName("scope")
        private String scope;
        @SerializedName("vicinity")
        private String vicinity;
        /**
         * height : 4016
         * html_attributions : ["<a href=\"https://maps.google.com/maps/contrib/101516907347198229066/photos\">Vagabond Cruises<\/a>"]
         * photo_reference : CoQBdwAAAE7cIkW9LB8tJzglArjSkxJeaDjvGx3eQEriiEPSk2lyZ3wHKKWgj03wKHSvLkJKashP-UxU8UeZsxQz6cSN1Jl3Ykym3W9NPbVhgy7WdBhaEqc5SmqTdkOhbfR9hZ_t54f0j1ZvOLGTi5Z8MO7tiMovYgcT77yChcq4ZNXdtoqvEhA1SNfvUPzKU3TkyztD1ijHGhQeEx0pTGj-13gheYeD4hs0mHOb0w
         * width : 6016
         */

        @SerializedName("photos")
        private List<PhotosBean> photos;
        @SerializedName("types")
        private List<String> types;

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

        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public String getVicinity() {
            return vicinity;
        }

        public void setVicinity(String vicinity) {
            this.vicinity = vicinity;
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
             * lat : -33.8709434
             * lng : 151.1903114
             */

            @SerializedName("location")
            private LocationBean location;
            /**
             * northeast : {"lat":-33.87039965,"lng":151.1906609}
             * southwest : {"lat":-33.87112465000001,"lng":151.1901949}
             */

            @SerializedName("viewport")
            private ViewportBean viewport;

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public ViewportBean getViewport() {
                return viewport;
            }

            public void setViewport(ViewportBean viewport) {
                this.viewport = viewport;
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

            public static class ViewportBean {
                /**
                 * lat : -33.87039965
                 * lng : 151.1906609
                 */

                @SerializedName("northeast")
                private NortheastBean northeast;
                /**
                 * lat : -33.87112465000001
                 * lng : 151.1901949
                 */

                @SerializedName("southwest")
                private SouthwestBean southwest;

                public NortheastBean getNortheast() {
                    return northeast;
                }

                public void setNortheast(NortheastBean northeast) {
                    this.northeast = northeast;
                }

                public SouthwestBean getSouthwest() {
                    return southwest;
                }

                public void setSouthwest(SouthwestBean southwest) {
                    this.southwest = southwest;
                }

                public static class NortheastBean {
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

                public static class SouthwestBean {
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
}
