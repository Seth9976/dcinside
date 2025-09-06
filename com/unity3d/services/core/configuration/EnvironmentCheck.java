package com.unity3d.services.core.configuration;

import android.webkit.JavascriptInterface;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class EnvironmentCheck {
    private static boolean hasJavascriptInterface(Method method0) {
        Annotation[] arr_annotation = method0.getAnnotations();
        if(arr_annotation != null) {
            for(int v = 0; v < arr_annotation.length; ++v) {
                if(arr_annotation[v] instanceof JavascriptInterface) {
                    return true;
                }
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public static boolean isEnvironmentOk() {
        return EnvironmentCheck.testProGuard() && EnvironmentCheck.testCacheDirectory();
    }

    public static boolean testCacheDirectory() {
        if(SdkProperties.getCacheDirectory() != null && SdkProperties.getWebViewCacheDirectory() != null) {
            DeviceLog.debug("Unity Ads cache directory check OK");
            return true;
        }
        DeviceLog.error("Unity Ads cache directory check fail: no working cache directory available");
        return false;
    }

    public static boolean testProGuard() {
        try {
            Method method0 = WebViewBridgeInterface.class.getMethod("handleInvocation", String.class);
            Method method1 = WebViewBridgeInterface.class.getMethod("handleCallback", String.class, String.class, String.class);
            if(EnvironmentCheck.hasJavascriptInterface(method0) && EnvironmentCheck.hasJavascriptInterface(method1)) {
                DeviceLog.debug("Unity Ads ProGuard check OK");
                return true;
            }
            DeviceLog.error("Unity Ads ProGuard check fail: missing @JavascriptInterface annotations in Unity Ads web bridge");
            return false;
        }
        catch(ClassNotFoundException classNotFoundException0) {
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            DeviceLog.exception("Unity Ads ProGuard check fail: Unity Ads web bridge methods not found", noSuchMethodException0);
            return false;
        }
        catch(Exception exception0) {
            DeviceLog.exception(("Unknown exception during Unity Ads ProGuard check: " + exception0.getMessage()), exception0);
            return true;
        }
        DeviceLog.exception("Unity Ads ProGuard check fail: Unity Ads web bridge class not found", classNotFoundException0);
        return false;
    }
}

