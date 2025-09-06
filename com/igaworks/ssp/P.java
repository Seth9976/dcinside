package com.igaworks.ssp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class p {
    public static p0 a(String s) {
        JSONArray jSONArray1;
        p0 p00 = new p0();
        try {
            if(s0.a(s)) {
                JSONObject jSONObject0 = new JSONObject(s);
                if(!jSONObject0.isNull("Placement_id_list")) {
                    JSONArray jSONArray0 = new JSONArray(jSONObject0.getString("Placement_id_list"));
                    if(jSONArray0.length() > 0) {
                        HashMap hashMap0 = new HashMap();
                        int v = 0;
                        while(v < jSONArray0.length()) {
                            JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
                            if(jSONObject1.has("placement_id")) {
                                jSONArray1 = jSONArray0;
                                String s1 = jSONObject1.getString("placement_id");
                                if(jSONObject1.has("thirdparty_id") && !jSONObject1.isNull("thirdparty_id")) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject1.getString("thirdparty_id"));
                                    if(jSONArray2.length() > 0) {
                                        ArrayList arrayList0 = new ArrayList();
                                        for(int v1 = 0; v1 < jSONArray2.length(); ++v1) {
                                            arrayList0.add(jSONArray2.getInt(v1));
                                        }
                                        hashMap0.put(s1, arrayList0);
                                    }
                                }
                            }
                            else {
                                jSONArray1 = jSONArray0;
                            }
                            ++v;
                            jSONArray0 = jSONArray1;
                        }
                        p00.a(hashMap0);
                    }
                }
                if(!jSONObject0.isNull("Thirdparty_key_info")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject0.getString("Thirdparty_key_info"));
                    if(jSONObject2.has("vungle_app_id") && !jSONObject2.isNull("vungle_app_id")) {
                        p00.a("vungle_app_id", jSONObject2.getString("vungle_app_id"));
                    }
                    if(jSONObject2.has("tapjoy_sdk_key") && !jSONObject2.isNull("tapjoy_sdk_key")) {
                        p00.a("tapjoy_sdk_key", jSONObject2.getString("tapjoy_sdk_key"));
                    }
                    if(jSONObject2.has("adcolony_app_id") && !jSONObject2.isNull("adcolony_app_id")) {
                        p00.a("adcolony_app_id", jSONObject2.getString("adcolony_app_id"));
                    }
                    if(jSONObject2.has("fyber_app_id") && !jSONObject2.isNull("fyber_app_id")) {
                        p00.a("fyber_app_id", jSONObject2.getString("fyber_app_id"));
                    }
                    if(jSONObject2.has("mintegral_app_id") && !jSONObject2.isNull("mintegral_app_id")) {
                        p00.a("mintegral_app_id", jSONObject2.getString("mintegral_app_id"));
                    }
                    if(jSONObject2.has("mintegral_app_key") && !jSONObject2.isNull("mintegral_app_key")) {
                        p00.a("mintegral_app_key", jSONObject2.getString("mintegral_app_key"));
                    }
                    if(jSONObject2.has("pangle_app_id") && !jSONObject2.isNull("pangle_app_id")) {
                        p00.a("pangle_app_id", jSONObject2.getString("pangle_app_id"));
                    }
                    if(jSONObject2.has("unity_game_id") && !jSONObject2.isNull("unity_game_id")) {
                        p00.a("unity_game_id", jSONObject2.getString("unity_game_id"));
                    }
                    if(jSONObject2.has("applovin_sdk_key") && !jSONObject2.isNull("applovin_sdk_key")) {
                        p00.a("applovin_sdk_key", jSONObject2.getString("applovin_sdk_key"));
                    }
                }
                return p00;
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
        return null;
    }

    public static String a(String s, String s1) {
        try {
            if(s0.a(s)) {
                JSONObject jSONObject0 = new JSONObject(s);
                if(jSONObject0.has(s1)) {
                    return jSONObject0.getString(s1);
                }
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
        return null;
    }

    private static ArrayList b(String s) {
        ArrayList arrayList5;
        g g0;
        ArrayList arrayList0;
        JSONArray jSONArray0;
        try {
            if(!s0.a(s)) {
                return null;
            }
            jSONArray0 = new JSONArray(s);
            if(jSONArray0.length() <= 0) {
                return null;
            }
            arrayList0 = new ArrayList();
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            return null;
        }
        for(int v = 0; true; ++v) {
            try {
                if(v >= jSONArray0.length()) {
                    return arrayList0;
                }
                String s1 = jSONArray0.getString(v);
                g0 = new g();
                JSONObject jSONObject0 = new JSONObject(s1);
                if(jSONObject0.has("ImageList")) {
                    g0.b(p.c(jSONObject0.getString("ImageList")));
                }
                if(jSONObject0.has("IsWebContent")) {
                    g0.b(jSONObject0.getBoolean("IsWebContent"));
                }
                if(jSONObject0.has("IsWebView")) {
                    g0.c(jSONObject0.getBoolean("IsWebView"));
                }
                if(jSONObject0.has("Key")) {
                    g0.e(jSONObject0.getString("Key"));
                }
                if(jSONObject0.has("Name")) {
                    g0.h(jSONObject0.getString("Name"));
                }
                if(jSONObject0.has("RedirectURL")) {
                    g0.l(jSONObject0.getString("RedirectURL"));
                }
                if(jSONObject0.has("VideoURL")) {
                    g0.p(jSONObject0.getString("VideoURL"));
                }
                if(jSONObject0.has("WebData")) {
                    g0.q(jSONObject0.getString("WebData"));
                }
                if(jSONObject0.has("FullscreenType")) {
                    g0.c(jSONObject0.getInt("FullscreenType"));
                }
                if(jSONObject0.has("width") && !jSONObject0.isNull("width")) {
                    g0.o(jSONObject0.getInt("width"));
                }
                else if(jSONObject0.has("Width") && !jSONObject0.isNull("Width")) {
                    g0.o(jSONObject0.getInt("Width"));
                }
                if(jSONObject0.has("height") && !jSONObject0.isNull("height")) {
                    g0.d(jSONObject0.getInt("height"));
                }
                else if(jSONObject0.has("Height") && !jSONObject0.isNull("Height")) {
                    g0.d(jSONObject0.getInt("Height"));
                }
                if(jSONObject0.has("InterstitialAdType") && !jSONObject0.isNull("InterstitialAdType")) {
                    g0.h(jSONObject0.getInt("InterstitialAdType"));
                }
                if(jSONObject0.has("CompleteURL") && !jSONObject0.isNull("CompleteURL")) {
                    g0.m(jSONObject0.getString("CompleteURL"));
                }
                if(jSONObject0.has("Reward") && !jSONObject0.isNull("Reward")) {
                    JSONObject jSONObject1 = new JSONObject(jSONObject0.getString("Reward"));
                    if(jSONObject1.has("Currency") && !jSONObject1.isNull("Currency")) {
                        g0.n(jSONObject1.getString("Currency"));
                    }
                    if(jSONObject1.has("Quantity") && !jSONObject1.isNull("Quantity")) {
                        g0.a(jSONObject1.getLong("Quantity"));
                    }
                }
                if(jSONObject0.has("Title") && !jSONObject0.isNull("Title")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject0.getString("Title"));
                    if(jSONObject2.has("Required") && !jSONObject2.isNull("Required")) {
                        g0.n(jSONObject2.getInt("Required"));
                    }
                    if(jSONObject2.has("Text") && !jSONObject2.isNull("Text")) {
                        g0.o(jSONObject2.getString("Text"));
                    }
                }
                if(jSONObject0.has("Desc") && !jSONObject0.isNull("Desc")) {
                    JSONObject jSONObject3 = new JSONObject(jSONObject0.getString("Desc"));
                    if(jSONObject3.has("Required") && !jSONObject3.isNull("Required")) {
                        g0.b(jSONObject3.getInt("Required"));
                    }
                    if(jSONObject3.has("Text") && !jSONObject3.isNull("Text")) {
                        g0.b(jSONObject3.getString("Text"));
                    }
                }
                if(jSONObject0.has("ClickTrackersList") && !jSONObject0.isNull("ClickTrackersList")) {
                    JSONArray jSONArray1 = new JSONArray(jSONObject0.getString("ClickTrackersList"));
                    if(jSONArray1.length() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        for(int v1 = 0; v1 < jSONArray1.length(); ++v1) {
                            arrayList2.add(jSONArray1.get(v1).toString());
                        }
                        g0.a(arrayList2);
                    }
                }
                if(jSONObject0.has("ImpTrackersList") && !jSONObject0.isNull("ImpTrackersList")) {
                    JSONArray jSONArray2 = new JSONArray(jSONObject0.getString("ImpTrackersList"));
                    if(jSONArray2.length() > 0) {
                        ArrayList arrayList3 = new ArrayList();
                        for(int v2 = 0; v2 < jSONArray2.length(); ++v2) {
                            arrayList3.add(jSONArray2.get(v2).toString());
                        }
                        g0.c(arrayList3);
                    }
                }
                if(jSONObject0.has("ViewabilityOffTrackersList") && !jSONObject0.isNull("ViewabilityOffTrackersList")) {
                    JSONArray jSONArray3 = new JSONArray(jSONObject0.getString("ViewabilityOffTrackersList"));
                    if(jSONArray3.length() > 0) {
                        ArrayList arrayList4 = new ArrayList();
                        for(int v3 = 0; v3 < jSONArray3.length(); ++v3) {
                            arrayList4.add(jSONArray3.get(v3).toString());
                            g0.a(true);
                        }
                        g0.e(arrayList4);
                    }
                }
                if(jSONObject0.has("LandingURL") && !jSONObject0.isNull("LandingURL")) {
                    g0.f(jSONObject0.getString("LandingURL"));
                }
                if(jSONObject0.has("IconImage") && !jSONObject0.isNull("IconImage")) {
                    JSONObject jSONObject4 = new JSONObject(jSONObject0.getString("IconImage"));
                    if(jSONObject4.has("Required") && !jSONObject4.isNull("Required")) {
                        g0.f(jSONObject4.getInt("Required"));
                    }
                    if(jSONObject4.has("Width") && !jSONObject4.isNull("Width")) {
                        g0.g(jSONObject4.getInt("Width"));
                    }
                    if(jSONObject4.has("Height") && !jSONObject4.isNull("Height")) {
                        g0.e(jSONObject4.getInt("Height"));
                    }
                    if(jSONObject4.has("Url") && !jSONObject4.isNull("Url")) {
                        g0.c(jSONObject4.getString("Url"));
                    }
                }
                if(jSONObject0.has("MainImage") && !jSONObject0.isNull("MainImage")) {
                    JSONObject jSONObject5 = new JSONObject(jSONObject0.getString("MainImage"));
                    if(jSONObject5.has("Required") && !jSONObject5.isNull("Required")) {
                        g0.j(jSONObject5.getInt("Required"));
                    }
                    if(jSONObject5.has("Width") && !jSONObject5.isNull("Width")) {
                        g0.k(jSONObject5.getInt("Width"));
                    }
                    if(jSONObject5.has("Height") && !jSONObject5.isNull("Height")) {
                        g0.i(jSONObject5.getInt("Height"));
                    }
                    if(jSONObject5.has("Url") && !jSONObject5.isNull("Url")) {
                        g0.g(jSONObject5.getString("Url"));
                    }
                }
                if(jSONObject0.has("CtaText") && !jSONObject0.isNull("CtaText")) {
                    JSONObject jSONObject6 = new JSONObject(jSONObject0.getString("CtaText"));
                    if(jSONObject6.has("Required") && !jSONObject6.isNull("Required")) {
                        g0.a(jSONObject6.getInt("Required"));
                    }
                    if(jSONObject6.has("Text") && !jSONObject6.isNull("Text")) {
                        g0.a(jSONObject6.getString("Text"));
                    }
                }
                if(jSONObject0.has("PrivacyIconImage") && !jSONObject0.isNull("PrivacyIconImage")) {
                    g0.j(jSONObject0.getString("PrivacyIconImage"));
                }
                if(jSONObject0.has("PrivacyIconURL") && !jSONObject0.isNull("PrivacyIconURL")) {
                    g0.k(jSONObject0.getString("PrivacyIconURL"));
                }
                if(jSONObject0.has("AID") && !jSONObject0.isNull("AID")) {
                    g0.i(jSONObject0.getString("AID"));
                }
                if(jSONObject0.has("MinimumViewTime") && !jSONObject0.isNull("MinimumViewTime")) {
                    g0.l(jSONObject0.getInt("MinimumViewTime"));
                }
                if(jSONObject0.has("InAppThirdpartyInfo") && !jSONObject0.isNull("InAppThirdpartyInfo")) {
                    g0.d(jSONObject0.getString("InAppThirdpartyInfo"));
                }
                if(jSONObject0.has("TemplateNo") && !jSONObject0.isNull("TemplateNo")) {
                    g0.m(jSONObject0.getInt("TemplateNo"));
                }
                if(jSONObject0.has("WinNoticeURL") && !jSONObject0.isNull("WinNoticeURL")) {
                    g0.r(jSONObject0.getString("WinNoticeURL"));
                }
            }
            catch(Exception exception0) {
                arrayList5 = arrayList0;
                break;
            }
            try {
                arrayList5 = arrayList0;
                arrayList5.add(g0);
                arrayList0 = arrayList5;
            }
            catch(Exception exception0) {
                break;
            }
        }
        b.a(Thread.currentThread(), exception0);
        return arrayList5;
    }

    private static ArrayList c(String s) {
        Exception exception1;
        ArrayList arrayList1;
        JSONArray jSONArray0;
        ArrayList arrayList0 = null;
        try {
            if(s0.a(s)) {
                jSONArray0 = new JSONArray(s);
                if(jSONArray0.length() > 0) {
                    arrayList1 = new ArrayList();
                    goto label_10;
                }
            }
        }
        catch(Exception exception0) {
            exception1 = exception0;
            b.a(Thread.currentThread(), exception1);
        }
        return arrayList0;
        try {
        label_10:
            for(int v = 0; v < jSONArray0.length(); ++v) {
                P p0 = new P();
                if(jSONArray0.getJSONObject(v).has("ImageURL")) {
                    p0.a(jSONArray0.getJSONObject(v).getString("ImageURL"));
                }
                if(jSONArray0.getJSONObject(v).has("Width")) {
                    p0.b(jSONArray0.getJSONObject(v).getInt("Width"));
                }
                if(jSONArray0.getJSONObject(v).has("Height")) {
                    p0.a(jSONArray0.getJSONObject(v).getInt("Height"));
                }
                arrayList1.add(p0);
            }
            return arrayList1;
        label_23:
            arrayList0 = arrayList1;
        }
        catch(Exception exception1) {
            goto label_23;
        }
        b.a(Thread.currentThread(), exception1);
        return arrayList0;
    }

    public static Z d(String s) {
        Z z1;
        Z z0 = null;
        try {
            if(s0.a(s)) {
                z1 = new Z();
                goto label_6;
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
        return z0;
        try {
        label_6:
            JSONObject jSONObject0 = new JSONObject(s);
            if(jSONObject0.has("MediationSchedule")) {
                z1.a(p.e(jSONObject0.getString("MediationSchedule")));
                return z1;
            }
            return z1;
        }
        catch(Exception exception0) {
            z0 = z1;
        }
        b.a(Thread.currentThread(), exception0);
        return z0;
    }

    public static ArrayList e(String s) {
        ArrayList arrayList2;
        JSONObject jSONObject1;
        a0 a00;
        ArrayList arrayList1;
        JSONArray jSONArray0;
        ArrayList arrayList0 = null;
        try {
            jSONArray0 = new JSONArray(s);
            if(jSONArray0.length() > 0) {
                arrayList1 = new ArrayList();
                goto label_8;
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
        return arrayList0;
        for(int v = 0; true; ++v) {
            try {
            label_8:
                if(v >= jSONArray0.length()) {
                    return arrayList1;
                }
                JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                a00 = new a0();
                if(jSONObject0.has("AdNetworkName")) {
                    a00.b(jSONObject0.getString("AdNetworkName"));
                }
                if(jSONObject0.has("AdNetworkNo")) {
                    a00.a(jSONObject0.getInt("AdNetworkNo"));
                }
                if(jSONObject0.has("IntegrationKey")) {
                    String s1 = jSONObject0.getString("IntegrationKey");
                    if(s0.a(s1)) {
                        jSONObject1 = jSONObject0;
                        JSONObject jSONObject2 = new JSONObject(s1);
                        if(jSONObject2.has("PlacementId")) {
                            i i5 = i.e;
                            if(a00.a() == i5.b()) {
                                a00.a(i5.d(), jSONObject2.getString("PlacementId"));
                            }
                            else {
                                a00.a("FAN_NATIVE_BANNER", jSONObject2.getString("PlacementId"));
                            }
                        }
                        else if(jSONObject2.has("adUnitID")) {
                            i i0 = i.d;
                            if(a00.a() == i0.b()) {
                                a00.a(i0.d(), jSONObject2.getString("adUnitID"));
                            }
                            else {
                                i i1 = i.w;
                                if(a00.a() == i1.b()) {
                                    a00.a(i1.d(), jSONObject2.getString("adUnitID"));
                                }
                                else {
                                    i i2 = i.A;
                                    if(a00.a() == i2.b()) {
                                        a00.a(i2.d(), jSONObject2.getString("adUnitID"));
                                    }
                                    else {
                                        i i3 = i.D;
                                        if(a00.a() == i3.b()) {
                                            a00.a(i3.d(), jSONObject2.getString("adUnitID"));
                                        }
                                    }
                                }
                            }
                        }
                        else if(jSONObject2.has("AppCode")) {
                            a00.a("Cauly", jSONObject2.getString("AppCode"));
                        }
                        else if(jSONObject2.has("PublisherCode")) {
                            i i4 = i.i;
                            a00.a("MezzoMedia_Publisher", jSONObject2.getString("PublisherCode"));
                            if(jSONObject2.has("MediaCode")) {
                                a00.a(i4.d() + "_Media", jSONObject2.getString("MediaCode"));
                            }
                            if(jSONObject2.has("SectionCode")) {
                                a00.a(i4.d() + "_Section", jSONObject2.getString("SectionCode"));
                            }
                        }
                        else if(jSONObject2.has("UnityPlacementId")) {
                            a00.a("UnityPlacementId", jSONObject2.getString("UnityPlacementId"));
                            if(jSONObject2.has("UnityGameId")) {
                                a00.a("UnityGameId", jSONObject2.getString("UnityGameId"));
                            }
                        }
                        else if(jSONObject2.has("MintegralAppId")) {
                            a00.a("MintegralAppId", jSONObject2.getString("MintegralAppId"));
                            if(jSONObject2.has("MintegralAppKey")) {
                                a00.a("MintegralAppKey", jSONObject2.getString("MintegralAppKey"));
                            }
                            if(jSONObject2.has("MintegralUnitId")) {
                                a00.a("MintegralUnitId", jSONObject2.getString("MintegralUnitId"));
                            }
                            if(jSONObject2.has("MintegralPlacementId")) {
                                a00.a("MintegralPlacementId", jSONObject2.getString("MintegralPlacementId"));
                            }
                            if(jSONObject2.has("MintegralRewardId")) {
                                a00.a("MintegralRewardId", jSONObject2.getString("MintegralRewardId"));
                            }
                        }
                        else if(jSONObject2.has("clientId")) {
                            a00.a("AdFit", jSONObject2.getString("clientId"));
                        }
                        else if(jSONObject2.has("AdColonyAppId")) {
                            a00.a("AdColonyAppId", jSONObject2.getString("AdColonyAppId"));
                            if(jSONObject2.has("AdColonyZoneId")) {
                                a00.a("AdColonyZoneId", jSONObject2.getString("AdColonyZoneId"));
                            }
                        }
                        else if(jSONObject2.has("VungleAppId")) {
                            a00.a("VungleAppId", jSONObject2.getString("VungleAppId"));
                            if(jSONObject2.has("VunglePlacementId")) {
                                a00.a("VunglePlacementId", jSONObject2.getString("VunglePlacementId"));
                            }
                        }
                        else if(jSONObject2.has("MobonMediaCode")) {
                            a00.a("MobonMediaCode", jSONObject2.getString("MobonMediaCode"));
                            if(jSONObject2.has("MobonUnitId")) {
                                a00.a("MobonUnitId", jSONObject2.getString("MobonUnitId"));
                            }
                        }
                        else if(jSONObject2.has("FyberAppId")) {
                            a00.a("FyberAppId", jSONObject2.getString("FyberAppId"));
                            if(jSONObject2.has("FyberSpotId")) {
                                a00.a("FyberSpotId", jSONObject2.getString("FyberSpotId"));
                            }
                        }
                        else if(jSONObject2.has("TapJoySDKKey")) {
                            a00.a("TapJoySDKKey", jSONObject2.getString("TapJoySDKKey"));
                            if(jSONObject2.has("TapJoyPlacementId")) {
                                a00.a("TapJoyPlacementId", jSONObject2.getString("TapJoyPlacementId"));
                            }
                        }
                        else if(jSONObject2.has("PangleAppId")) {
                            a00.a("PangleAppId", jSONObject2.getString("PangleAppId"));
                            if(jSONObject2.has("PanglePlacementId")) {
                                a00.a("PanglePlacementId", jSONObject2.getString("PanglePlacementId"));
                            }
                        }
                        else if(jSONObject2.has("CoupangAffiliateId")) {
                            if(a00.a() == i.x.b()) {
                                a00.a("CoupangAffiliateId", jSONObject2.getString("CoupangAffiliateId"));
                                if(jSONObject2.has("CoupangSubId")) {
                                    a00.a("CoupangSubId", jSONObject2.getString("CoupangSubId"));
                                }
                                if(jSONObject2.has("CoupangWidgetId")) {
                                    a00.a("CoupangWidgetId", jSONObject2.getString("CoupangWidgetId"));
                                }
                            }
                            else if(a00.a() == i.B.b()) {
                                a00.a("CoupangAffiliateId", jSONObject2.getString("CoupangAffiliateId"));
                                if(jSONObject2.has("CoupangSubId")) {
                                    a00.a("CoupangSubId", jSONObject2.getString("CoupangSubId"));
                                }
                                if(jSONObject2.has("CoupangWidgetId")) {
                                    a00.a("CoupangWidgetId", jSONObject2.getString("CoupangWidgetId"));
                                }
                            }
                        }
                        else if(jSONObject2.has("AppLovinZoneId") && jSONObject2.has("AppLovinUnitId")) {
                            a00.a("AppLovinZoneId", jSONObject2.getString("AppLovinZoneId"));
                            a00.a("AppLovinUnitId", jSONObject2.getString("AppLovinUnitId"));
                            if(jSONObject2.has("AppLovinSdkKey")) {
                                a00.a("AppLovinSdkKey", jSONObject2.getString("AppLovinSdkKey"));
                            }
                            else {
                                a00.a("AppLovinSdkKey", "nPNmWdnX7aDsJQd7yPG7w-rzdTAJJ3qcBNpgSoWzDrm4bUMSmHZJsv-2XRTSiOItVTm7FWZ7PrkUEKeVvlomd1");
                            }
                        }
                        else if(jSONObject2.has("AppLovinZoneId")) {
                            a00.a("AppLovinZoneId", jSONObject2.getString("AppLovinZoneId"));
                            a00.a("AppLovinUnitId", jSONObject2.getString("AppLovinZoneId"));
                            if(jSONObject2.has("AppLovinSdkKey")) {
                                a00.a("AppLovinSdkKey", jSONObject2.getString("AppLovinSdkKey"));
                            }
                            else {
                                a00.a("AppLovinSdkKey", "nPNmWdnX7aDsJQd7yPG7w-rzdTAJJ3qcBNpgSoWzDrm4bUMSmHZJsv-2XRTSiOItVTm7FWZ7PrkUEKeVvlomd1");
                            }
                        }
                        else if(jSONObject2.has("AppLovinUnitId")) {
                            a00.a("AppLovinZoneId", jSONObject2.getString("AppLovinUnitId"));
                            a00.a("AppLovinUnitId", jSONObject2.getString("AppLovinUnitId"));
                            if(jSONObject2.has("AppLovinSdkKey")) {
                                a00.a("AppLovinSdkKey", jSONObject2.getString("AppLovinSdkKey"));
                            }
                            else {
                                a00.a("AppLovinSdkKey", "nPNmWdnX7aDsJQd7yPG7w-rzdTAJJ3qcBNpgSoWzDrm4bUMSmHZJsv-2XRTSiOItVTm7FWZ7PrkUEKeVvlomd1");
                            }
                        }
                        else if(jSONObject2.has("AppLovinMaxUnitId")) {
                            a00.a("AppLovinMaxUnitId", jSONObject2.getString("AppLovinMaxUnitId"));
                            if(jSONObject2.has("AppLovinSdkKey")) {
                                a00.a("AppLovinSdkKey", jSONObject2.getString("AppLovinSdkKey"));
                            }
                            else {
                                a00.a("AppLovinSdkKey", "nPNmWdnX7aDsJQd7yPG7w-rzdTAJJ3qcBNpgSoWzDrm4bUMSmHZJsv-2XRTSiOItVTm7FWZ7PrkUEKeVvlomd1");
                            }
                        }
                        else if(jSONObject2.has("NamUnitId")) {
                            a00.a("NamUnitId", jSONObject2.getString("NamUnitId"));
                        }
                        else if(jSONObject2.has("MobWithUnitId")) {
                            a00.a("MobWithUnitId", jSONObject2.getString("MobWithUnitId"));
                        }
                        if(jSONObject2.has("price")) {
                            a00.a("price", jSONObject2.getDouble("price") + "");
                        }
                        if(jSONObject2.has("CampaignType")) {
                            a00.c(jSONObject2.getInt("CampaignType"));
                        }
                    }
                    else {
                        jSONObject1 = jSONObject0;
                    }
                }
                else {
                    jSONObject1 = jSONObject0;
                }
                if(jSONObject1.has("IntegrationTypeCode")) {
                    a00.b(jSONObject1.getInt("IntegrationTypeCode"));
                }
            }
            catch(Exception exception0) {
                arrayList2 = arrayList1;
                break;
            }
            try {
                arrayList2 = arrayList1;
                arrayList2.add(a00);
                arrayList1 = arrayList2;
            }
            catch(Exception exception0) {
                break;
            }
        }
        b.a(Thread.currentThread(), exception0);
        return arrayList2;
    }

    public static d0 f(String s) {
        d0 d01;
        d0 d00 = null;
        try {
            if(s0.a(s)) {
                d01 = new d0();
                goto label_6;
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
        return d00;
        try {
        label_6:
            JSONObject jSONObject0 = new JSONObject(s);
            if(jSONObject0.has("IsTest") && !jSONObject0.isNull("IsTest")) {
                d01.e(jSONObject0.getBoolean("IsTest"));
            }
            if(jSONObject0.has("Result") && !jSONObject0.isNull("Result")) {
                d01.d(jSONObject0.getBoolean("Result"));
            }
            if(jSONObject0.has("ResultCode") && !jSONObject0.isNull("ResultCode")) {
                d01.b(jSONObject0.getInt("ResultCode"));
            }
            if(jSONObject0.has("ResultMsg") && !jSONObject0.isNull("ResultMsg")) {
                d01.d(jSONObject0.getString("ResultMsg"));
            }
            if(jSONObject0.has("CampaignList")) {
                d01.a(p.b(jSONObject0.getString("CampaignList")));
            }
            if(jSONObject0.has("CompanionList")) {
                d01.b(p.b(jSONObject0.getString("CompanionList")));
            }
            if(jSONObject0.has("Mediation") && !jSONObject0.isNull("Mediation")) {
                d01.a(p.d(jSONObject0.getString("Mediation")));
            }
            if(jSONObject0.has("PeriodHours") && !jSONObject0.isNull("PeriodHours")) {
                d01.a(jSONObject0.getInt("PeriodHours"));
            }
            if(jSONObject0.has("CheckViewability") && !jSONObject0.isNull("CheckViewability")) {
                d01.a(jSONObject0.getBoolean("CheckViewability"));
            }
            if(jSONObject0.has("RewardCompleteURL") && !jSONObject0.isNull("RewardCompleteURL")) {
                d01.e(jSONObject0.getString("RewardCompleteURL"));
            }
            if(jSONObject0.has("RewardPlusType") && !jSONObject0.isNull("RewardPlusType")) {
                d01.c(jSONObject0.getInt("RewardPlusType"));
            }
            if(jSONObject0.has("AdRequestNo") && !jSONObject0.isNull("AdRequestNo")) {
                d01.a(jSONObject0.getString("AdRequestNo"));
            }
            if(jSONObject0.has("UrlSchemeList") && !jSONObject0.isNull("UrlSchemeList")) {
                JSONArray jSONArray0 = new JSONArray(jSONObject0.getString("UrlSchemeList"));
                if(jSONArray0.length() > 0) {
                    ArrayList arrayList0 = new ArrayList();
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        arrayList0.add(jSONArray0.get(v).toString());
                    }
                    d01.c(arrayList0);
                }
            }
            if(jSONObject0.has("Mute") && !jSONObject0.isNull("Mute")) {
                d01.c(jSONObject0.getBoolean("Mute"));
            }
            if(jSONObject0.has("DfineryId") && !jSONObject0.isNull("DfineryId")) {
                d01.b(jSONObject0.getString("DfineryId"));
            }
            if(jSONObject0.has("MediationImpTrackingURL") && !jSONObject0.isNull("MediationImpTrackingURL")) {
                d01.c(jSONObject0.getString("MediationImpTrackingURL"));
                d01.b(false);
            }
            return d01;
        label_50:
            d00 = d01;
        }
        catch(Exception exception0) {
            goto label_50;
        }
        b.a(Thread.currentThread(), exception0);
        return d00;
    }

    public static w g(String s) {
        w w0 = new w();
        try {
            String s1 = s.replaceAll("\r\n", "\\\\r\\\\n");
            JSONObject jSONObject0 = new JSONObject(s1.substring(s1.indexOf("{"), s1.lastIndexOf("}") + 1));
            if(jSONObject0.has("naverId") && !jSONObject0.isNull("naverId")) {
                w0.a(jSONObject0.getString("naverId"));
            }
            if(jSONObject0.has("openNewPage") && !jSONObject0.isNull("openNewPage")) {
                w0.a(jSONObject0.getBoolean("openNewPage"));
            }
            if(jSONObject0.has("toastMessage") && !jSONObject0.isNull("toastMessage")) {
                w0.d(jSONObject0.getString("toastMessage"));
            }
            if(jSONObject0.has("openURL") && !jSONObject0.isNull("openURL")) {
                w0.b(jSONObject0.getString("openURL"));
            }
            if(jSONObject0.has("campaignType") && !jSONObject0.isNull("campaignType")) {
                w0.b(jSONObject0.getInt("campaignType"));
            }
            if(jSONObject0.has("placementId") && !jSONObject0.isNull("placementId")) {
                w0.c(jSONObject0.getString("placementId"));
            }
            if(jSONObject0.has("boxNo") && !jSONObject0.isNull("boxNo")) {
                w0.a(jSONObject0.getInt("boxNo"));
            }
            return w0;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
        return null;
    }

    public static l h(String s) {
        l l0 = new l();
        try {
            String s1 = s.replaceAll("\r\n", "\\\\r\\\\n");
            JSONObject jSONObject0 = new JSONObject(s1.substring(s1.indexOf("{"), s1.lastIndexOf("}") + 1));
            if(jSONObject0.has("ad_type") && !jSONObject0.isNull("ad_type")) {
                l0.a(jSONObject0.getInt("ad_type"));
            }
            if(jSONObject0.has("ad_id") && !jSONObject0.isNull("ad_id")) {
                l0.a(jSONObject0.getString("ad_id"));
            }
            if(jSONObject0.has("media_key") && !jSONObject0.isNull("media_key")) {
                l0.b(jSONObject0.getString("media_key"));
            }
            if(jSONObject0.has("placement_id") && !jSONObject0.isNull("placement_id")) {
                l0.c(jSONObject0.getString("placement_id"));
            }
            if(jSONObject0.has("ssp_app_key") && !jSONObject0.isNull("ssp_app_key")) {
                l0.e(jSONObject0.getString("ssp_app_key"));
            }
            if(jSONObject0.has("ssp_placement_id") && !jSONObject0.isNull("ssp_placement_id")) {
                l0.f(jSONObject0.getString("ssp_placement_id"));
            }
            if(jSONObject0.has("reward_quantity") && !jSONObject0.isNull("reward_quantity")) {
                l0.a(jSONObject0.getLong("reward_quantity"));
            }
            if(jSONObject0.has("reward_message") && !jSONObject0.isNull("reward_message")) {
                l0.d(jSONObject0.getString("reward_message"));
            }
            if(jSONObject0.has("banner_size") && !jSONObject0.isNull("banner_size")) {
                l0.b(jSONObject0.getInt("banner_size"));
            }
            return l0;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
        return null;
    }

    public static String i(String s) {
        try {
            if(s0.a(s)) {
                JSONObject jSONObject0 = new JSONObject(s);
                if((jSONObject0.has("status") ? jSONObject0.getBoolean("status") : false) && jSONObject0.has("token")) {
                    return jSONObject0.getString("token");
                }
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
        return null;
    }

    public static List j(String s) {
        try {
            List list0 = new ArrayList();
            if(s0.a(s)) {
                JSONObject jSONObject0 = new JSONObject(s);
                if(!jSONObject0.isNull("placements")) {
                    JSONArray jSONArray0 = jSONObject0.getJSONArray("placements");
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        list0.add(jSONArray0.getString(v));
                    }
                }
                return list0;
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
        return null;
    }

    public static int k(String s) {
        try {
            if(s0.a(s)) {
                JSONObject jSONObject0 = new JSONObject(s);
                if(jSONObject0.has("thirdparty_id") && !jSONObject0.isNull("thirdparty_id")) {
                    return jSONObject0.getInt("thirdparty_id");
                }
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
        return 0;
    }
}

