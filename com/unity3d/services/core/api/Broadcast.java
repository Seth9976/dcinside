package com.unity3d.services.core.api;

import com.unity3d.services.core.broadcast.BroadcastError;
import com.unity3d.services.core.broadcast.BroadcastMonitor;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import org.json.JSONArray;
import org.json.JSONException;

public class Broadcast {
    @WebViewExposed
    public static void addBroadcastListener(String s, String s1, JSONArray jSONArray0, WebViewCallback webViewCallback0) {
        try {
            if(jSONArray0.length() > 0) {
                String[] arr_s = new String[jSONArray0.length()];
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    arr_s[v] = jSONArray0.getString(v);
                }
                BroadcastMonitor.getInstance().addBroadcastListener(s, s1, arr_s);
            }
        }
        catch(JSONException unused_ex) {
            webViewCallback0.error(BroadcastError.JSON_ERROR, new Object[0]);
            return;
        }
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void addBroadcastListener(String s, JSONArray jSONArray0, WebViewCallback webViewCallback0) {
        Broadcast.addBroadcastListener(s, null, jSONArray0, webViewCallback0);
    }

    @WebViewExposed
    public static void removeAllBroadcastListeners(WebViewCallback webViewCallback0) {
        BroadcastMonitor.getInstance().removeAllBroadcastListeners();
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void removeBroadcastListener(String s, WebViewCallback webViewCallback0) {
        BroadcastMonitor.getInstance().removeBroadcastListener(s);
        webViewCallback0.invoke(new Object[0]);
    }
}

