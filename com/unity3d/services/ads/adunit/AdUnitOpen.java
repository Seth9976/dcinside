package com.unity3d.services.ads.adunit;

import android.os.ConditionVariable;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.AdOperationError;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.bridge.CallbackStatus;
import java.lang.reflect.Method;
import org.json.JSONObject;

public class AdUnitOpen {
    private static Configuration _configuration;
    private static final SDKMetricsSender _sdkMetricsSender;
    private static ConditionVariable _waitShowStatus;

    static {
        AdUnitOpen._sdkMetricsSender = (SDKMetricsSender)Utilities.getService(SDKMetricsSender.class);
    }

    public static boolean open(String s, JSONObject jSONObject0) throws NoSuchMethodException {
        synchronized(AdUnitOpen.class) {
            Method method0 = AdUnitOpen.class.getMethod("showCallback", CallbackStatus.class);
            AdUnitOpen._waitShowStatus = new ConditionVariable();
            if(AdUnitOpen._configuration == null) {
                AdUnitOpen._configuration = new Configuration();
            }
            WebViewApp.getCurrentApp().invokeMethod("webview", "show", method0, new Object[]{s, jSONObject0});
            boolean z = AdUnitOpen._waitShowStatus.block(((long)AdUnitOpen._configuration.getShowTimeout()));
            AdUnitOpen._waitShowStatus = null;
            if(!z) {
                Metric metric0 = AdOperationMetric.newAdShowFailure(AdOperationError.timeout, ((long)AdUnitOpen._configuration.getShowTimeout()));
                AdUnitOpen._sdkMetricsSender.sendMetric(metric0);
            }
            return z;
        }
    }

    public static void setConfiguration(Configuration configuration0) {
        AdUnitOpen._configuration = configuration0;
    }

    public static void showCallback(CallbackStatus callbackStatus0) {
        if(AdUnitOpen._waitShowStatus != null && callbackStatus0.equals(CallbackStatus.OK)) {
            AdUnitOpen._waitShowStatus.open();
        }
    }
}

