package com.unity3d.services.analytics;

import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class UnityAnalytics {
    static enum AnalyticsEventType {
        POSTEVENT;

        private static AnalyticsEventType[] $values() [...] // Inlined contents
    }

    protected static JSONArray eventQueue;

    static {
        UnityAnalytics.eventQueue = new JSONArray();
    }

    private static JSONObject createAdComplete(String s, String s1, Boolean boolean0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("rewarded", boolean0);
        hashMap0.put("network", s);
        hashMap0.put("placement_id", s1);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("custom_params", hashMap0);
        hashMap1.put("ts", new Date().getTime());
        hashMap1.put("name", "ad_complete");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("type", "analytics.custom.v1");
        hashMap2.put("msg", hashMap1);
        return new JSONObject(hashMap2);
    }

    private static JSONObject createIapTransaction(String s, Float float0, String s1, Boolean boolean0, String s2) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("ts", new Date().getTime());
        hashMap0.put("productid", s);
        hashMap0.put("amount", float0);
        hashMap0.put("currency", s1);
        hashMap0.put("promo", boolean0);
        hashMap0.put("receipt", s2);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("type", "analytics.transaction.v1");
        hashMap1.put("msg", hashMap0);
        return new JSONObject(hashMap1);
    }

    private static JSONObject createItemAcquired(String s, Float float0, String s1, Float float1, String s2, String s3, String s4, AcquisitionType acquisitionType0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("currency_type", acquisitionType0.toString());
        hashMap0.put("transaction_context", s);
        hashMap0.put("amount", float0);
        hashMap0.put("item_id", s1);
        hashMap0.put("balance", float1);
        hashMap0.put("item_type", s2);
        hashMap0.put("level", s3);
        hashMap0.put("transaction_id", s4);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("custom_params", hashMap0);
        hashMap1.put("ts", 0x1651159D0B5L);
        hashMap1.put("name", "item_acquired");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("type", "analytics.custom.v1");
        hashMap2.put("msg", hashMap1);
        return new JSONObject(hashMap2);
    }

    private static JSONObject createItemSpent(String s, Float float0, String s1, Float float1, String s2, String s3, String s4, AcquisitionType acquisitionType0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("currency_type", acquisitionType0.toString());
        hashMap0.put("transaction_context", s);
        hashMap0.put("amount", float0);
        hashMap0.put("item_id", s1);
        hashMap0.put("balance", float1);
        hashMap0.put("item_type", s2);
        hashMap0.put("level", s3);
        hashMap0.put("transaction_id", s4);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("custom_params", hashMap0);
        hashMap1.put("ts", new Date().getTime());
        hashMap1.put("name", "item_spent");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("type", "analytics.custom.v1");
        hashMap2.put("msg", hashMap1);
        return new JSONObject(hashMap2);
    }

    private static JSONObject createLevelFail(String s) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("level_index", s);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("custom_params", hashMap0);
        hashMap1.put("ts", new Date().getTime());
        hashMap1.put("name", "level_fail");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("type", "analytics.custom.v1");
        hashMap2.put("msg", hashMap1);
        return new JSONObject(hashMap2);
    }

    private static JSONObject createLevelUp(String s) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("new_level_index", s);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("custom_params", hashMap0);
        hashMap1.put("ts", new Date().getTime());
        hashMap1.put("name", "level_up");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("type", "analytics.custom.v1");
        hashMap2.put("msg", hashMap1);
        return new JSONObject(hashMap2);
    }

    public static void onAdComplete(String s, String s1, Boolean boolean0) {
        UnityAnalytics.postEvent(UnityAnalytics.createAdComplete(s, s1, boolean0));
    }

    public static void onEvent(JSONObject jSONObject0) {
        UnityAnalytics.postEvent(jSONObject0);
    }

    public static void onIapTransaction(String s, Float float0, String s1, Boolean boolean0, String s2) {
        UnityAnalytics.postEvent(UnityAnalytics.createIapTransaction(s, float0, s1, boolean0, s2));
    }

    public static void onItemAcquired(String s, Float float0, String s1, Float float1, String s2, String s3, String s4, AcquisitionType acquisitionType0) {
        UnityAnalytics.postEvent(UnityAnalytics.createItemAcquired(s, float0, s1, float1, s2, s3, s4, acquisitionType0));
    }

    public static void onItemSpent(String s, Float float0, String s1, Float float1, String s2, String s3, String s4, AcquisitionType acquisitionType0) {
        UnityAnalytics.postEvent(UnityAnalytics.createItemSpent(s, float0, s1, float1, s2, s3, s4, acquisitionType0));
    }

    public static void onLevelFail(String s) {
        UnityAnalytics.postEvent(UnityAnalytics.createLevelFail(s));
    }

    public static void onLevelUp(String s) {
        UnityAnalytics.postEvent(UnityAnalytics.createLevelUp(s));
    }

    private static void postEvent(JSONObject jSONObject0) {
        synchronized(UnityAnalytics.class) {
            if(UnityAnalytics.eventQueue.length() < 200) {
                UnityAnalytics.eventQueue.put(jSONObject0);
            }
            WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
            if(webViewApp0 != null && webViewApp0.sendEvent(WebViewEventCategory.ANALYTICS, AnalyticsEventType.POSTEVENT, new Object[]{"[]"})) {
                UnityAnalytics.eventQueue = new JSONArray();
            }
        }
    }
}

