package com.unity3d.services.core.api;

import android.annotation.TargetApi;
import com.unity3d.services.ads.adunit.AdUnitError;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.device.DeviceError;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.ArrayList;
import org.json.JSONArray;

public class Permissions {
    @WebViewExposed
    public static void checkPermission(String s, WebViewCallback webViewCallback0) {
        if(ClientProperties.getApplicationContext() == null) {
            webViewCallback0.error(DeviceError.APPLICATION_CONTEXT_NULL, new Object[0]);
            return;
        }
        try {
            webViewCallback0.invoke(new Object[]{ClientProperties.getApplicationContext().getPackageManager().checkPermission(s, "com.dcinside.app.android")});
        }
        catch(Exception exception0) {
            webViewCallback0.error(PermissionsError.ERROR_CHECKING_PERMISSION, new Object[]{exception0.getMessage()});
        }
    }

    @WebViewExposed
    public static void getPermissions(WebViewCallback webViewCallback0) {
        if(ClientProperties.getApplicationContext() == null) {
            webViewCallback0.error(DeviceError.APPLICATION_CONTEXT_NULL, new Object[0]);
            return;
        }
        try {
            JSONArray jSONArray0 = new JSONArray();
            String[] arr_s = ClientProperties.getApplicationContext().getPackageManager().getPackageInfo("com.dcinside.app.android", 0x1000).requestedPermissions;
            if(arr_s != null) {
                for(int v = 0; v < arr_s.length; ++v) {
                    jSONArray0.put(arr_s[v]);
                }
                webViewCallback0.invoke(new Object[]{jSONArray0});
                return;
            }
            webViewCallback0.error(PermissionsError.NO_REQUESTED_PERMISSIONS, new Object[0]);
            return;
        }
        catch(Exception exception0) {
        }
        webViewCallback0.error(PermissionsError.COULDNT_GET_PERMISSIONS, new Object[]{exception0.getMessage()});
    }

    @TargetApi(23)
    @WebViewExposed
    public static void requestPermissions(JSONArray jSONArray0, Integer integer0, WebViewCallback webViewCallback0) {
        if(AdUnit.getAdUnitActivity() == null) {
            webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
            return;
        }
        if(jSONArray0 != null && jSONArray0.length() >= 1) {
            try {
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    arrayList0.add(jSONArray0.getString(v));
                }
                AdUnit.getAdUnitActivity().requestPermissions(((String[])arrayList0.toArray(new String[arrayList0.size()])), ((int)integer0));
                webViewCallback0.invoke(new Object[0]);
                return;
            }
            catch(Exception exception0) {
            }
            webViewCallback0.error(PermissionsError.ERROR_REQUESTING_PERMISSIONS, new Object[]{exception0.getMessage()});
            return;
        }
        webViewCallback0.error(PermissionsError.NO_REQUESTED_PERMISSIONS, new Object[0]);
    }
}

