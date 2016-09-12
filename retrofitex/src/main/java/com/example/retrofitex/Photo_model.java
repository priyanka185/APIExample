package com.example.retrofitex;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Priyanka on 31-08-2016.
 */
public class Photo_model {

    /**
     * address_components : [{"long_name":"Sydney","short_name":"Sydney","types":["locality","political"]},{"long_name":"New South Wales","short_name":"NSW","types":["administrative_area_level_1","political"]},{"long_name":"Australia","short_name":"AU","types":["country","political"]},{"long_name":"2000","short_name":"2000","types":["postal_code"]}]
     * adr_address : 32 The Promenade, <span class="street-address">King Street Wharf 5</span>, <span class="locality">Sydney</span> <span class="region">NSW</span> <span class="postal-code">2000</span>, <span class="country-name">Australia</span>
     * formatted_address : 32 The Promenade, King Street Wharf 5, Sydney NSW 2000, Australia
     * formatted_phone_number : (02) 8296 7296
     * geometry : {"location":{"lat":-33.867591,"lng":151.201196}}
     * icon : https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png
     * id : a97f9fb468bcd26b68a23072a55af82d4b325e0d
     * international_phone_number : +61 2 8296 7296
     * name : Australian Cruise Group
     * opening_hours : {"open_now":true,"periods":[{"close":{"day":0,"time":"2200"},"open":{"day":0,"time":"0900"}},{"close":{"day":1,"time":"2200"},"open":{"day":1,"time":"0900"}},{"close":{"day":2,"time":"2200"},"open":{"day":2,"time":"0900"}},{"close":{"day":3,"time":"2200"},"open":{"day":3,"time":"0900"}},{"close":{"day":4,"time":"2200"},"open":{"day":4,"time":"0900"}},{"close":{"day":5,"time":"2200"},"open":{"day":5,"time":"0900"}},{"close":{"day":6,"time":"2200"},"open":{"day":6,"time":"0900"}}],"weekday_text":["Monday: 9:00 AM \u2013 10:00 PM","Tuesday: 9:00 AM \u2013 10:00 PM","Wednesday: 9:00 AM \u2013 10:00 PM","Thursday: 9:00 AM \u2013 10:00 PM","Friday: 9:00 AM \u2013 10:00 PM","Saturday: 9:00 AM \u2013 10:00 PM","Sunday: 9:00 AM \u2013 10:00 PM"]}
     * photos : [{"height":328,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAALlkW1klXwu1Hce4-nskFoSjLsBwCeIFsEGioO7neorf8KXDF6mNWyy5BiYbsi0UMsExxWxHimLdg477EcJzIRbnF2tpaScUT9QiXoxKG51YooFxiF75F3GyAWpA9FzD1tb6-zNcmQk5Bntm4VG3cqqfenkj2JTV7YGEDWF7a7-2EhC_DIkOzN9kgE8kXgp7IACGGhTvMT0FtbhlW2Cr4-usJEp0R1GCQw","width":329},{"height":2448,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/118410684014024830328/photos\">Michael Mak<\/a>"],"photo_reference":"CoQBcwAAAHPKQ8YZEmEONic8x1M3mC1x_8CGyPIP98uIpIIlFJQqls5Kgit1YnOSzYT1a_jk02dDu-g6JfAiTtAwFIDtu6C5aCHV_C_xnXuQp0Gp-qEBrlnpe_F9i64A12zDTPkZ8oEjWvLWpNYZMe6LAUHYmL1jNaURLHskgTMDvZ1sggI0EhAiBJusCG1Y1c2n23rg0ZPNGhQanqwNcvsG-OGE4sg-ZkU4Z5AqHw","width":3264},{"height":1331,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAACOXkJNomia0wWSVP4zolAGAWLtMWUaA-gbIhHDFK1E2r4OYpAxlwQYXGUXe4qvIW75Q8KouXiukW_UGdOSXVJFsahX7nL-5hB8mcP6RXr8ATNiJQZ2HBxhPIt7-0o03Z9h0IF5f6PT39UyQR4rW87tGMzBHLi0S61t8PokKnFkzEhBtiSHPR9yE7KnzK6QrwY4yGhQAOoTzKyngK4nWiBLQBlVYa8HGJA","width":2000},{"height":1320,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAAFUU2zuKJh-tq7xbatu8sciUpDZAJzZsaXdUkSy_VvE4-uhbSUuMbbCTJYarO7oAAmifPb2Lc9-ufPcELoVAiXmsjlm_8wOfdPmWjJd0FuZ39bag0LQRPuRMyj_Ov88HePkNYVdna5BcH0d_Tq1T59Y_lhFDyADcOSj3JGwvQeSUEhAnktsmiZMEXFPOZJxyqDLxGhRWc-c76Xy9Wg63wqWo2lSydSQ4BQ","width":2048},{"height":1331,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAAF3_q_cdg1OQbbAK9nmKACwmiQABnZBbEQXTwWbtF3AJhpbPp8zCA7PPR7kzUJQC19YhOH9zKezclUHh_H0Pg3hiGYuPrkCDY-ekuUVa8fxrnUWHGXhxHXUv0g9UnqCzOmCoRkAeCKpH7xsWgXMxS9-ONZzprYMKbCCWAWYHGsYzEhCJZ0x5Dgh9OFN7Fxjz5vFKGhSDrdBKgifT7J9UaMOMSMKJNpy7tA","width":2000},{"height":1607,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAAEOw6E2PpUkUWKoBMYG21YwGIbAlqDnq7efXDcX8QrUvxk8A7oudpOQn6nc2Ppub8f1cv7mxzQHaIDtEtQWNpgWwt2TtwZpVkzPmMhuhm4uSAY_wsTR0byVN6IqmbLZDZo706x7tHBd5ifAbQ--w8-1KFb-xV3ss3JdsDY53yv-xEhASWLnna46dU6q4FsyoctXmGhTj0wJLvbUOtlWwbPR81cgKGAHsSA","width":1969},{"height":417,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAAIHtyfvO-FA8E-kNar5O7GeuRZRiCw1UDVae5FSHy4nWD8IdB-KJpVgzsunq56yk68tQEeMdIgLDgCbZptyCrViFbgnWn0ipLB9yjO8Cpa_JNKV8HUITY2Yb62foHDXAWLMd86sP8aUP5Dq0UJMso7lIhoKDSePFbelDRezAFHglEhBXvvPL4Pn0IclLBb8nGrETGhToCPoCJWmttRjZ3ASjR_DEyZkDQg","width":1334},{"height":426,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAAIKR2D2EyP7QqbNI8Ey9OBJx-k-hlrXPu5lyw12eFMVWoJOqqde25Phrvk5fkGRrCyfCWQq_z3V7pYNRkdem-GIhtMZNwdr7TudiehfU_QemBg0OnW5WlZbQqaJ0IzFIZl9IYYtm7p8TyIQYkEsIcVQQawfvesl-bjMltCm4xus_EhAVyGHypiXdS8xme17MJJKsGhRfTRHmPBwEPudfetqlecpI3LmCaw","width":640},{"height":1119,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAABMWspCas_88saZT2rwykILK5fE_0Y5wqKYij4xly5TifDsAWvezAp3aLrAKiIR2q981_zkR5jKHrwdq1pk3rGuZB9hGKfTwLA0qic3NlVoTBfyAH5l6P05O7cvsX6xpA_S9Qv2ZxsaMa5EYICRYwulL7Fj9l-0Jt5jr4mHgnEU_EhBX7ux44yY97uBzJrCcAtdQGhTPUXs2Eo-Yar55T4Yt0KvHuYhlpQ","width":2000},{"height":300,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAAOFePjdV7QiZ0XvaK1MB763SRlOj_bjWb6IYkuy1Od_I16m1qXeEoNVwq4SPlMMWrumW_XUbKd_RU2nm2ele33OykLtjQoQwFiqkj8lZgN2-ssWp-GafS3QcVgd25J8o2aqKf0skO46XHrRFqx292Dx9GW8EraOVdOL1tIZATWN-EhD0rrh2goJMC8Q-aMgaHdJfGhQDHqGq0xWrhqUDin79vMb7U8Hemg","width":300}]
     * place_id : ChIJrTLr-GyuEmsRBfy61i59si0
     * reference : CnRqAAAAfIUNZxvytksUP4vYmLnlKAutBZ19RTFRmjoNLAmxIzQBCGk--EjrReuWbBVOSInIUPILcnJRBVDeNyZEGXdrN4HjS-29M9Cg5tOHQDS_u6qps1jFWNMxI42z1dprWCa6h4kO9AokUdPw5Wcd-kpGaRIQR-1z5p8H0KxwxLEbWGM_8hoUG6ieTDiYyu3vk7-GbIztFq_htcA
     * reviews : [{"aspects":[{"rating":0,"type":"overall"}],"author_name":"Jenny R","author_url":"https://plus.google.com/108261115973070154933","language":"en","rating":1,"text":"Terrible customer service. They cancelled our show boat cruise at late notice due to a 'chartered cruise' after we had had it booked for over a month, instead offering us a cheaper buffet dinner with no show. Totally unwilling to offer a suitable alternative. When questioned they said they cancel cruises all the time, often with only 24 hours notice. \nA previous lunch buffet cruise with the same group was average at best and I was hoping the show boat cruise would be better. \nI will never book with them again and actively advise everybody I know not to.","time":1463040604},{"aspects":[{"rating":3,"type":"overall"}],"author_name":"DMITRY DOROFEEV","author_url":"https://plus.google.com/100694246975361947714","language":"en","profile_photo_url":"//lh5.googleusercontent.com/-LJyp43_9tHw/AAAAAAAAAAI/AAAAAAAAADE/i57zbFMlLjM/photo.jpg","rating":5,"text":"Review!\nStaff: 5* (Tried their best to accommodate to your request & promptly :)\nCruise: 4* (Marks on walls, seats standard, toilet splash back behind the toilet lid was rusted & loose)!\nFood: 4* (Great Mango Chilli Chicken & fresh Prawns. Dessert was great with chocolate mud cake & tiramisu).\nDrinks: 5* (Provides Pure Blond, Crown Lager, Red & white wines :)\n \nMagistic VIP Top Deck Dinner Cruise for Vivid Sydney 2016 @ Darling Harbour, NSW.","time":1465827058},{"aspects":[{"rating":3,"type":"overall"}],"author_name":"Ben Anderson","author_url":"https://plus.google.com/103501509378270717527","language":"en","profile_photo_url":"//lh5.googleusercontent.com/--3vAvrHnJgo/AAAAAAAAAAI/AAAAAAAAAKA/UsB6Py6h86w/photo.jpg","rating":5,"text":"My wife and I took the afternoon lunch cruise and we were thoroughly impressed. The service was top notch. The crew was very friendly but also maintained efficiency so no one I saw was waiting long. The food was surprisingly well prepared and tasted great. I wasn't expecting nearly as much variety or quality given that the food was served in such a short time, on a boat and to so many people. I would suggest that you get there early or you will wait in line for boarding. The crew seemed to be doing this for safety, which is appreciated, but no one likes waiting in lines. I didn't understand why there was a short leg (about 30 minutes) around the harbor to Circular Quay where the ship stopped. Not that big of a deal, just a little weird. The tour of the harbor was relaxing. We claimed some seats on the bow of the boat and enjoyed deserts, drinks, and the great weather. Outside was a little loud and hard to hear the speaker at times. This was mainly just due to chatter, wind and other outside noise. Maybe that could have been louder but that might have been unpleasant since it would have just added to the noise. When I paid attention I was able to hear some fun trivia about the Sydney. Not that it mattered for us, but I did notice many families so the cruise is family friendly. Overall the cruise was a pleasant experience and I would recommend it as an afternoon out for anyone visiting Sydney. \n","time":1442552409},{"aspects":[{"rating":3,"type":"overall"}],"author_name":"Bennington John","author_url":"https://plus.google.com/105551381030224691313","language":"en","profile_photo_url":"//lh5.googleusercontent.com/-lqWzJwLWvyU/AAAAAAAAAAI/AAAAAAAAcUQ/tkPgY1ir3Ws/photo.jpg","rating":5,"text":"","time":1469819599}]
     * scope : GOOGLE
     * types : ["travel_agency","restaurant","food","point_of_interest","establishment"]
     * url : https://maps.google.com/?cid=3292831917685799941
     * utc_offset : 600
     * vicinity : 32 The Promenade, King Street Wharf 5, Sydney
     * website : https://www.australiancruisegroup.com.au/
     */

    @SerializedName("result")
    private ResultBean result;
    /**
     * html_attributions : []
     * result : {"address_components":[{"long_name":"Sydney","short_name":"Sydney","types":["locality","political"]},{"long_name":"New South Wales","short_name":"NSW","types":["administrative_area_level_1","political"]},{"long_name":"Australia","short_name":"AU","types":["country","political"]},{"long_name":"2000","short_name":"2000","types":["postal_code"]}],"adr_address":"32 The Promenade, <span class=\"street-address\">King Street Wharf 5<\/span>, <span class=\"locality\">Sydney<\/span> <span class=\"region\">NSW<\/span> <span class=\"postal-code\">2000<\/span>, <span class=\"country-name\">Australia<\/span>","formatted_address":"32 The Promenade, King Street Wharf 5, Sydney NSW 2000, Australia","formatted_phone_number":"(02) 8296 7296","geometry":{"location":{"lat":-33.867591,"lng":151.201196}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"a97f9fb468bcd26b68a23072a55af82d4b325e0d","international_phone_number":"+61 2 8296 7296","name":"Australian Cruise Group","opening_hours":{"open_now":true,"periods":[{"close":{"day":0,"time":"2200"},"open":{"day":0,"time":"0900"}},{"close":{"day":1,"time":"2200"},"open":{"day":1,"time":"0900"}},{"close":{"day":2,"time":"2200"},"open":{"day":2,"time":"0900"}},{"close":{"day":3,"time":"2200"},"open":{"day":3,"time":"0900"}},{"close":{"day":4,"time":"2200"},"open":{"day":4,"time":"0900"}},{"close":{"day":5,"time":"2200"},"open":{"day":5,"time":"0900"}},{"close":{"day":6,"time":"2200"},"open":{"day":6,"time":"0900"}}],"weekday_text":["Monday: 9:00 AM \u2013 10:00 PM","Tuesday: 9:00 AM \u2013 10:00 PM","Wednesday: 9:00 AM \u2013 10:00 PM","Thursday: 9:00 AM \u2013 10:00 PM","Friday: 9:00 AM \u2013 10:00 PM","Saturday: 9:00 AM \u2013 10:00 PM","Sunday: 9:00 AM \u2013 10:00 PM"]},"photos":[{"height":328,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAALlkW1klXwu1Hce4-nskFoSjLsBwCeIFsEGioO7neorf8KXDF6mNWyy5BiYbsi0UMsExxWxHimLdg477EcJzIRbnF2tpaScUT9QiXoxKG51YooFxiF75F3GyAWpA9FzD1tb6-zNcmQk5Bntm4VG3cqqfenkj2JTV7YGEDWF7a7-2EhC_DIkOzN9kgE8kXgp7IACGGhTvMT0FtbhlW2Cr4-usJEp0R1GCQw","width":329},{"height":2448,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/118410684014024830328/photos\">Michael Mak<\/a>"],"photo_reference":"CoQBcwAAAHPKQ8YZEmEONic8x1M3mC1x_8CGyPIP98uIpIIlFJQqls5Kgit1YnOSzYT1a_jk02dDu-g6JfAiTtAwFIDtu6C5aCHV_C_xnXuQp0Gp-qEBrlnpe_F9i64A12zDTPkZ8oEjWvLWpNYZMe6LAUHYmL1jNaURLHskgTMDvZ1sggI0EhAiBJusCG1Y1c2n23rg0ZPNGhQanqwNcvsG-OGE4sg-ZkU4Z5AqHw","width":3264},{"height":1331,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAACOXkJNomia0wWSVP4zolAGAWLtMWUaA-gbIhHDFK1E2r4OYpAxlwQYXGUXe4qvIW75Q8KouXiukW_UGdOSXVJFsahX7nL-5hB8mcP6RXr8ATNiJQZ2HBxhPIt7-0o03Z9h0IF5f6PT39UyQR4rW87tGMzBHLi0S61t8PokKnFkzEhBtiSHPR9yE7KnzK6QrwY4yGhQAOoTzKyngK4nWiBLQBlVYa8HGJA","width":2000},{"height":1320,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAAFUU2zuKJh-tq7xbatu8sciUpDZAJzZsaXdUkSy_VvE4-uhbSUuMbbCTJYarO7oAAmifPb2Lc9-ufPcELoVAiXmsjlm_8wOfdPmWjJd0FuZ39bag0LQRPuRMyj_Ov88HePkNYVdna5BcH0d_Tq1T59Y_lhFDyADcOSj3JGwvQeSUEhAnktsmiZMEXFPOZJxyqDLxGhRWc-c76Xy9Wg63wqWo2lSydSQ4BQ","width":2048},{"height":1331,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAAF3_q_cdg1OQbbAK9nmKACwmiQABnZBbEQXTwWbtF3AJhpbPp8zCA7PPR7kzUJQC19YhOH9zKezclUHh_H0Pg3hiGYuPrkCDY-ekuUVa8fxrnUWHGXhxHXUv0g9UnqCzOmCoRkAeCKpH7xsWgXMxS9-ONZzprYMKbCCWAWYHGsYzEhCJZ0x5Dgh9OFN7Fxjz5vFKGhSDrdBKgifT7J9UaMOMSMKJNpy7tA","width":2000},{"height":1607,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAAEOw6E2PpUkUWKoBMYG21YwGIbAlqDnq7efXDcX8QrUvxk8A7oudpOQn6nc2Ppub8f1cv7mxzQHaIDtEtQWNpgWwt2TtwZpVkzPmMhuhm4uSAY_wsTR0byVN6IqmbLZDZo706x7tHBd5ifAbQ--w8-1KFb-xV3ss3JdsDY53yv-xEhASWLnna46dU6q4FsyoctXmGhTj0wJLvbUOtlWwbPR81cgKGAHsSA","width":1969},{"height":417,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAAIHtyfvO-FA8E-kNar5O7GeuRZRiCw1UDVae5FSHy4nWD8IdB-KJpVgzsunq56yk68tQEeMdIgLDgCbZptyCrViFbgnWn0ipLB9yjO8Cpa_JNKV8HUITY2Yb62foHDXAWLMd86sP8aUP5Dq0UJMso7lIhoKDSePFbelDRezAFHglEhBXvvPL4Pn0IclLBb8nGrETGhToCPoCJWmttRjZ3ASjR_DEyZkDQg","width":1334},{"height":426,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAAIKR2D2EyP7QqbNI8Ey9OBJx-k-hlrXPu5lyw12eFMVWoJOqqde25Phrvk5fkGRrCyfCWQq_z3V7pYNRkdem-GIhtMZNwdr7TudiehfU_QemBg0OnW5WlZbQqaJ0IzFIZl9IYYtm7p8TyIQYkEsIcVQQawfvesl-bjMltCm4xus_EhAVyGHypiXdS8xme17MJJKsGhRfTRHmPBwEPudfetqlecpI3LmCaw","width":640},{"height":1119,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAABMWspCas_88saZT2rwykILK5fE_0Y5wqKYij4xly5TifDsAWvezAp3aLrAKiIR2q981_zkR5jKHrwdq1pk3rGuZB9hGKfTwLA0qic3NlVoTBfyAH5l6P05O7cvsX6xpA_S9Qv2ZxsaMa5EYICRYwulL7Fj9l-0Jt5jr4mHgnEU_EhBX7ux44yY97uBzJrCcAtdQGhTPUXs2Eo-Yar55T4Yt0KvHuYhlpQ","width":2000},{"height":300,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"],"photo_reference":"CoQBcwAAAOFePjdV7QiZ0XvaK1MB763SRlOj_bjWb6IYkuy1Od_I16m1qXeEoNVwq4SPlMMWrumW_XUbKd_RU2nm2ele33OykLtjQoQwFiqkj8lZgN2-ssWp-GafS3QcVgd25J8o2aqKf0skO46XHrRFqx292Dx9GW8EraOVdOL1tIZATWN-EhD0rrh2goJMC8Q-aMgaHdJfGhQDHqGq0xWrhqUDin79vMb7U8Hemg","width":300}],"place_id":"ChIJrTLr-GyuEmsRBfy61i59si0","reference":"CnRqAAAAfIUNZxvytksUP4vYmLnlKAutBZ19RTFRmjoNLAmxIzQBCGk--EjrReuWbBVOSInIUPILcnJRBVDeNyZEGXdrN4HjS-29M9Cg5tOHQDS_u6qps1jFWNMxI42z1dprWCa6h4kO9AokUdPw5Wcd-kpGaRIQR-1z5p8H0KxwxLEbWGM_8hoUG6ieTDiYyu3vk7-GbIztFq_htcA","reviews":[{"aspects":[{"rating":0,"type":"overall"}],"author_name":"Jenny R","author_url":"https://plus.google.com/108261115973070154933","language":"en","rating":1,"text":"Terrible customer service. They cancelled our show boat cruise at late notice due to a 'chartered cruise' after we had had it booked for over a month, instead offering us a cheaper buffet dinner with no show. Totally unwilling to offer a suitable alternative. When questioned they said they cancel cruises all the time, often with only 24 hours notice. \nA previous lunch buffet cruise with the same group was average at best and I was hoping the show boat cruise would be better. \nI will never book with them again and actively advise everybody I know not to.","time":1463040604},{"aspects":[{"rating":3,"type":"overall"}],"author_name":"DMITRY DOROFEEV","author_url":"https://plus.google.com/100694246975361947714","language":"en","profile_photo_url":"//lh5.googleusercontent.com/-LJyp43_9tHw/AAAAAAAAAAI/AAAAAAAAADE/i57zbFMlLjM/photo.jpg","rating":5,"text":"Review!\nStaff: 5* (Tried their best to accommodate to your request & promptly :)\nCruise: 4* (Marks on walls, seats standard, toilet splash back behind the toilet lid was rusted & loose)!\nFood: 4* (Great Mango Chilli Chicken & fresh Prawns. Dessert was great with chocolate mud cake & tiramisu).\nDrinks: 5* (Provides Pure Blond, Crown Lager, Red & white wines :)\n \nMagistic VIP Top Deck Dinner Cruise for Vivid Sydney 2016 @ Darling Harbour, NSW.","time":1465827058},{"aspects":[{"rating":3,"type":"overall"}],"author_name":"Ben Anderson","author_url":"https://plus.google.com/103501509378270717527","language":"en","profile_photo_url":"//lh5.googleusercontent.com/--3vAvrHnJgo/AAAAAAAAAAI/AAAAAAAAAKA/UsB6Py6h86w/photo.jpg","rating":5,"text":"My wife and I took the afternoon lunch cruise and we were thoroughly impressed. The service was top notch. The crew was very friendly but also maintained efficiency so no one I saw was waiting long. The food was surprisingly well prepared and tasted great. I wasn't expecting nearly as much variety or quality given that the food was served in such a short time, on a boat and to so many people. I would suggest that you get there early or you will wait in line for boarding. The crew seemed to be doing this for safety, which is appreciated, but no one likes waiting in lines. I didn't understand why there was a short leg (about 30 minutes) around the harbor to Circular Quay where the ship stopped. Not that big of a deal, just a little weird. The tour of the harbor was relaxing. We claimed some seats on the bow of the boat and enjoyed deserts, drinks, and the great weather. Outside was a little loud and hard to hear the speaker at times. This was mainly just due to chatter, wind and other outside noise. Maybe that could have been louder but that might have been unpleasant since it would have just added to the noise. When I paid attention I was able to hear some fun trivia about the Sydney. Not that it mattered for us, but I did notice many families so the cruise is family friendly. Overall the cruise was a pleasant experience and I would recommend it as an afternoon out for anyone visiting Sydney. \n","time":1442552409},{"aspects":[{"rating":3,"type":"overall"}],"author_name":"Bennington John","author_url":"https://plus.google.com/105551381030224691313","language":"en","profile_photo_url":"//lh5.googleusercontent.com/-lqWzJwLWvyU/AAAAAAAAAAI/AAAAAAAAcUQ/tkPgY1ir3Ws/photo.jpg","rating":5,"text":"","time":1469819599}],"scope":"GOOGLE","types":["travel_agency","restaurant","food","point_of_interest","establishment"],"url":"https://maps.google.com/?cid=3292831917685799941","utc_offset":600,"vicinity":"32 The Promenade, King Street Wharf 5, Sydney","website":"https://www.australiancruisegroup.com.au/"}
     * status : OK
     */

    @SerializedName("status")
    private String status;
    @SerializedName("html_attributions")
    private List<?> htmlAttributions;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

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

    public static class ResultBean {
        @SerializedName("adr_address")
        private String adrAddress;
        @SerializedName("formatted_address")
        private String formattedAddress;
        @SerializedName("formatted_phone_number")
        private String formattedPhoneNumber;
        /**
         * location : {"lat":-33.867591,"lng":151.201196}
         */

        @SerializedName("geometry")
        private GeometryBean geometry;
        @SerializedName("icon")
        private String icon;
        @SerializedName("id")
        private String id;
        @SerializedName("international_phone_number")
        private String internationalPhoneNumber;
        @SerializedName("name")
        private String name;
        /**
         * open_now : true
         * periods : [{"close":{"day":0,"time":"2200"},"open":{"day":0,"time":"0900"}},{"close":{"day":1,"time":"2200"},"open":{"day":1,"time":"0900"}},{"close":{"day":2,"time":"2200"},"open":{"day":2,"time":"0900"}},{"close":{"day":3,"time":"2200"},"open":{"day":3,"time":"0900"}},{"close":{"day":4,"time":"2200"},"open":{"day":4,"time":"0900"}},{"close":{"day":5,"time":"2200"},"open":{"day":5,"time":"0900"}},{"close":{"day":6,"time":"2200"},"open":{"day":6,"time":"0900"}}]
         * weekday_text : ["Monday: 9:00 AM \u2013 10:00 PM","Tuesday: 9:00 AM \u2013 10:00 PM","Wednesday: 9:00 AM \u2013 10:00 PM","Thursday: 9:00 AM \u2013 10:00 PM","Friday: 9:00 AM \u2013 10:00 PM","Saturday: 9:00 AM \u2013 10:00 PM","Sunday: 9:00 AM \u2013 10:00 PM"]
         */

        @SerializedName("opening_hours")
        private OpeningHoursBean openingHours;
        @SerializedName("place_id")
        private String placeId;
        @SerializedName("reference")
        private String reference;
        @SerializedName("scope")
        private String scope;
        @SerializedName("url")
        private String url;
        @SerializedName("utc_offset")
        private int utcOffset;
        @SerializedName("vicinity")
        private String vicinity;
        @SerializedName("website")
        private String website;
        /**
         * long_name : Sydney
         * short_name : Sydney
         * types : ["locality","political"]
         */

        @SerializedName("address_components")
        private List<AddressComponentsBean> addressComponents;
        /**
         * height : 328
         * html_attributions : ["<a href=\"https://maps.google.com/maps/contrib/110751364053842618118/photos\">Australian Cruise Group<\/a>"]
         * photo_reference : CoQBcwAAALlkW1klXwu1Hce4-nskFoSjLsBwCeIFsEGioO7neorf8KXDF6mNWyy5BiYbsi0UMsExxWxHimLdg477EcJzIRbnF2tpaScUT9QiXoxKG51YooFxiF75F3GyAWpA9FzD1tb6-zNcmQk5Bntm4VG3cqqfenkj2JTV7YGEDWF7a7-2EhC_DIkOzN9kgE8kXgp7IACGGhTvMT0FtbhlW2Cr4-usJEp0R1GCQw
         * width : 329
         */

        @SerializedName("photos")
        private List<PhotosBean> photos;
        /**
         * aspects : [{"rating":0,"type":"overall"}]
         * author_name : Jenny R
         * author_url : https://plus.google.com/108261115973070154933
         * language : en
         * rating : 1
         * text : Terrible customer service. They cancelled our show boat cruise at late notice due to a 'chartered cruise' after we had had it booked for over a month, instead offering us a cheaper buffet dinner with no show. Totally unwilling to offer a suitable alternative. When questioned they said they cancel cruises all the time, often with only 24 hours notice.
         A previous lunch buffet cruise with the same group was average at best and I was hoping the show boat cruise would be better.
         I will never book with them again and actively advise everybody I know not to.
         * time : 1463040604
         */

        @SerializedName("reviews")
        private List<ReviewsBean> reviews;
        @SerializedName("types")
        private List<String> types;

        public String getAdrAddress() {
            return adrAddress;
        }

        public void setAdrAddress(String adrAddress) {
            this.adrAddress = adrAddress;
        }

        public String getFormattedAddress() {
            return formattedAddress;
        }

        public void setFormattedAddress(String formattedAddress) {
            this.formattedAddress = formattedAddress;
        }

        public String getFormattedPhoneNumber() {
            return formattedPhoneNumber;
        }

        public void setFormattedPhoneNumber(String formattedPhoneNumber) {
            this.formattedPhoneNumber = formattedPhoneNumber;
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

        public String getInternationalPhoneNumber() {
            return internationalPhoneNumber;
        }

        public void setInternationalPhoneNumber(String internationalPhoneNumber) {
            this.internationalPhoneNumber = internationalPhoneNumber;
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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getUtcOffset() {
            return utcOffset;
        }

        public void setUtcOffset(int utcOffset) {
            this.utcOffset = utcOffset;
        }

        public String getVicinity() {
            return vicinity;
        }

        public void setVicinity(String vicinity) {
            this.vicinity = vicinity;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public List<AddressComponentsBean> getAddressComponents() {
            return addressComponents;
        }

        public void setAddressComponents(List<AddressComponentsBean> addressComponents) {
            this.addressComponents = addressComponents;
        }

        public List<PhotosBean> getPhotos() {
            return photos;
        }

        public void setPhotos(List<PhotosBean> photos) {
            this.photos = photos;
        }

        public List<ReviewsBean> getReviews() {
            return reviews;
        }

        public void setReviews(List<ReviewsBean> reviews) {
            this.reviews = reviews;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public static class GeometryBean {
            /**
             * lat : -33.867591
             * lng : 151.201196
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
            /**
             * close : {"day":0,"time":"2200"}
             * open : {"day":0,"time":"0900"}
             */

            @SerializedName("periods")
            private List<PeriodsBean> periods;
            @SerializedName("weekday_text")
            private List<String> weekdayText;

            public boolean isOpenNow() {
                return openNow;
            }

            public void setOpenNow(boolean openNow) {
                this.openNow = openNow;
            }

            public List<PeriodsBean> getPeriods() {
                return periods;
            }

            public void setPeriods(List<PeriodsBean> periods) {
                this.periods = periods;
            }

            public List<String> getWeekdayText() {
                return weekdayText;
            }

            public void setWeekdayText(List<String> weekdayText) {
                this.weekdayText = weekdayText;
            }

            public static class PeriodsBean {
                /**
                 * day : 0
                 * time : 2200
                 */

                @SerializedName("close")
                private CloseBean close;
                /**
                 * day : 0
                 * time : 0900
                 */

                @SerializedName("open")
                private OpenBean open;

                public CloseBean getClose() {
                    return close;
                }

                public void setClose(CloseBean close) {
                    this.close = close;
                }

                public OpenBean getOpen() {
                    return open;
                }

                public void setOpen(OpenBean open) {
                    this.open = open;
                }

                public static class CloseBean {
                    @SerializedName("day")
                    private int day;
                    @SerializedName("time")
                    private String time;

                    public int getDay() {
                        return day;
                    }

                    public void setDay(int day) {
                        this.day = day;
                    }

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }

                public static class OpenBean {
                    @SerializedName("day")
                    private int day;
                    @SerializedName("time")
                    private String time;

                    public int getDay() {
                        return day;
                    }

                    public void setDay(int day) {
                        this.day = day;
                    }

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }
            }
        }

        public static class AddressComponentsBean {
            @SerializedName("long_name")
            private String longName;
            @SerializedName("short_name")
            private String shortName;
            @SerializedName("types")
            private List<String> types;

            public String getLongName() {
                return longName;
            }

            public void setLongName(String longName) {
                this.longName = longName;
            }

            public String getShortName() {
                return shortName;
            }

            public void setShortName(String shortName) {
                this.shortName = shortName;
            }

            public List<String> getTypes() {
                return types;
            }

            public void setTypes(List<String> types) {
                this.types = types;
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

        public static class ReviewsBean {
            @SerializedName("author_name")
            private String authorName;
            @SerializedName("author_url")
            private String authorUrl;
            @SerializedName("language")
            private String language;
            @SerializedName("rating")
            private int rating;
            @SerializedName("text")
            private String text;
            @SerializedName("time")
            private int time;
            /**
             * rating : 0
             * type : overall
             */

            @SerializedName("aspects")
            private List<AspectsBean> aspects;

            public String getAuthorName() {
                return authorName;
            }

            public void setAuthorName(String authorName) {
                this.authorName = authorName;
            }

            public String getAuthorUrl() {
                return authorUrl;
            }

            public void setAuthorUrl(String authorUrl) {
                this.authorUrl = authorUrl;
            }

            public String getLanguage() {
                return language;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public int getRating() {
                return rating;
            }

            public void setRating(int rating) {
                this.rating = rating;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public int getTime() {
                return time;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public List<AspectsBean> getAspects() {
                return aspects;
            }

            public void setAspects(List<AspectsBean> aspects) {
                this.aspects = aspects;
            }

            public static class AspectsBean {
                @SerializedName("rating")
                private int rating;
                @SerializedName("type")
                private String type;

                public int getRating() {
                    return rating;
                }

                public void setRating(int rating) {
                    this.rating = rating;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }
        }
    }
}
