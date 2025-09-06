package com.unity3d.services.ads.api;

import com.unity3d.services.ads.webplayer.WebPlayerError;
import com.unity3d.services.ads.webplayer.WebPlayerEventBridge;
import com.unity3d.services.ads.webplayer.WebPlayerSettingsCache;
import com.unity3d.services.ads.webplayer.WebPlayerView;
import com.unity3d.services.ads.webplayer.WebPlayerViewCache;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class WebPlayer {
    @WebViewExposed
    public static void clearSettings(String s, WebViewCallback webViewCallback0) {
        WebPlayerSettingsCache webPlayerSettingsCache0 = WebPlayerSettingsCache.getInstance();
        webPlayerSettingsCache0.removeWebSettings(s);
        webPlayerSettingsCache0.removeWebPlayerSettings(s);
        webPlayerSettingsCache0.removeWebPlayerEventSettings(s);
        WebPlayerView webPlayerView0 = WebPlayerViewCache.getInstance().getWebPlayer(s);
        if(webPlayerView0 != null) {
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    JSONObject jSONObject0 = new JSONObject();
                    JSONObject jSONObject1 = new JSONObject();
                    webPlayerView0.setSettings(jSONObject0, jSONObject1);
                    JSONObject jSONObject2 = new JSONObject();
                    webPlayerView0.setEventSettings(jSONObject2);
                }
            });
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getErroredSettings(String s, WebViewCallback webViewCallback0) {
        WebPlayerView webPlayerView0 = WebPlayerViewCache.getInstance().getWebPlayer(s);
        if(webPlayerView0 != null) {
            Map map0 = webPlayerView0.getErroredSettings();
            JSONObject jSONObject0 = new JSONObject();
            try {
                for(Object object0: map0.entrySet()) {
                    jSONObject0.put(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
                }
            }
            catch(Exception exception0) {
                DeviceLog.exception("Error forming JSON object", exception0);
            }
            webViewCallback0.invoke(new Object[]{jSONObject0});
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getFrame(String s, String s1, WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[0]);
        WebPlayerView webPlayerView0 = WebPlayerViewCache.getInstance().getWebPlayer(s1);
        if(webPlayerView0 != null) {
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    int[] arr_v = new int[2];
                    webPlayerView0.getLocationOnScreen(arr_v);
                    int v = arr_v[0];
                    int v1 = arr_v[1];
                    int v2 = webPlayerView0.getWidth();
                    int v3 = webPlayerView0.getHeight();
                    float f = webPlayerView0.getAlpha();
                    WebPlayerEventBridge.sendGetFrameResponse(s, s1, v, v1, v2, v3, f);
                }
            });
        }
    }

    @WebViewExposed
    public static void sendEvent(JSONArray jSONArray0, String s, WebViewCallback webViewCallback0) {
        WebPlayerView webPlayerView0 = WebPlayerViewCache.getInstance().getWebPlayer(s);
        if(webPlayerView0 != null) {
            webPlayerView0.sendEvent(jSONArray0);
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setData(String s, String s1, String s2, String s3, WebViewCallback webViewCallback0) {
        WebPlayerView webPlayerView0 = WebPlayerViewCache.getInstance().getWebPlayer(s3);
        if(webPlayerView0 != null) {
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    webPlayerView0.loadData(s, s1, s2);
                }
            });
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setDataWithUrl(String s, String s1, String s2, String s3, String s4, WebViewCallback webViewCallback0) {
        WebPlayerView webPlayerView0 = WebPlayerViewCache.getInstance().getWebPlayer(s4);
        if(webPlayerView0 != null) {
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    webPlayerView0.loadDataWithBaseURL(s, s1, s2, s3, null);
                }
            });
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setEventSettings(JSONObject jSONObject0, String s, WebViewCallback webViewCallback0) {
        WebPlayerSettingsCache.getInstance().addWebPlayerEventSettings(s, jSONObject0);
        WebPlayerView webPlayerView0 = WebPlayerViewCache.getInstance().getWebPlayer(s);
        if(webPlayerView0 != null) {
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    webPlayerView0.setEventSettings(jSONObject0);
                }
            });
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setSettings(JSONObject jSONObject0, JSONObject jSONObject1, String s, WebViewCallback webViewCallback0) {
        WebPlayerSettingsCache.getInstance().addWebSettings(s, jSONObject0);
        WebPlayerSettingsCache.getInstance().addWebPlayerSettings(s, jSONObject1);
        WebPlayerView webPlayerView0 = WebPlayerViewCache.getInstance().getWebPlayer(s);
        if(webPlayerView0 != null) {
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    webPlayerView0.setSettings(jSONObject0, jSONObject1);
                }
            });
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setUrl(String s, String s1, WebViewCallback webViewCallback0) {
        WebPlayerView webPlayerView0 = WebPlayerViewCache.getInstance().getWebPlayer(s1);
        if(webPlayerView0 != null) {
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    webPlayerView0.loadUrl(s);
                }
            });
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
    }
}

