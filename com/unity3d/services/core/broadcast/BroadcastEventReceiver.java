package com.unity3d.services.core.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import org.json.JSONException;
import org.json.JSONObject;

public class BroadcastEventReceiver extends BroadcastReceiver {
    private String _name;

    public BroadcastEventReceiver(String s) {
        this._name = s;
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        String s = intent0.getAction();
        if(s == null) {
            return;
        }
        String s1 = intent0.getDataString() == null ? "" : intent0.getDataString();
        JSONObject jSONObject0 = new JSONObject();
        try {
            if(intent0.getExtras() != null) {
                Bundle bundle0 = intent0.getExtras();
                for(Object object0: bundle0.keySet()) {
                    jSONObject0.put(((String)object0), bundle0.get(((String)object0)));
                }
            }
        }
        catch(JSONException jSONException0) {
            DeviceLog.debug(("JSONException when composing extras for broadcast action " + s + ": " + jSONException0.getMessage()));
        }
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        if(webViewApp0 != null && webViewApp0.isWebAppLoaded()) {
            webViewApp0.sendEvent(WebViewEventCategory.BROADCAST, BroadcastEvent.ACTION, new Object[]{this._name, s, s1, jSONObject0});
        }
    }
}

