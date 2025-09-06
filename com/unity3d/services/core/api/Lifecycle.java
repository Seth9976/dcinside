package com.unity3d.services.core.api;

import android.annotation.TargetApi;
import com.unity3d.services.core.lifecycle.LifecycleError;
import com.unity3d.services.core.lifecycle.LifecycleListener;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

@TargetApi(14)
public class Lifecycle {
    private static LifecycleListener _listener;

    public static LifecycleListener getLifecycleListener() {
        return Lifecycle._listener;
    }

    @WebViewExposed
    public static void register(JSONArray jSONArray0, WebViewCallback webViewCallback0) {
        if(ClientProperties.getApplication() != null) {
            if(Lifecycle.getLifecycleListener() == null) {
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    try {
                        arrayList0.add(((String)jSONArray0.get(v)));
                    }
                    catch(JSONException unused_ex) {
                        webViewCallback0.error(LifecycleError.JSON_ERROR, new Object[0]);
                        return;
                    }
                }
                Lifecycle.setLifecycleListener(new LifecycleListener(arrayList0));
                ClientProperties.getApplication().registerActivityLifecycleCallbacks(Lifecycle.getLifecycleListener());
                webViewCallback0.invoke(new Object[0]);
                return;
            }
            webViewCallback0.error(LifecycleError.LISTENER_NOT_NULL, new Object[0]);
            return;
        }
        webViewCallback0.error(LifecycleError.APPLICATION_NULL, new Object[0]);
    }

    public static void setLifecycleListener(LifecycleListener lifecycleListener0) {
        Lifecycle._listener = lifecycleListener0;
    }

    @WebViewExposed
    public static void unregister(WebViewCallback webViewCallback0) {
        if(ClientProperties.getApplication() != null) {
            if(Lifecycle.getLifecycleListener() != null) {
                ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(Lifecycle.getLifecycleListener());
                Lifecycle.setLifecycleListener(null);
            }
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(LifecycleError.APPLICATION_NULL, new Object[0]);
    }
}

