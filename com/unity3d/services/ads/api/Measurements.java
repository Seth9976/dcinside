package com.unity3d.services.ads.api;

import android.view.InputEvent;
import com.unity3d.services.ads.measurements.MeasurementsErrors;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Measurements {
    private static final MeasurementsService measurementsService;

    static {
        Measurements.measurementsService = (MeasurementsService)Utilities.getService(MeasurementsService.class);
    }

    @WebViewExposed
    public static void checkAvailability(WebViewCallback webViewCallback0) {
        Measurements.measurementsService.checkAvailability();
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void registerClick(String s, WebViewCallback webViewCallback0) {
        if(AdUnit.getAdUnitActivity() == null) {
            webViewCallback0.error(MeasurementsErrors.ERROR_AD_UNIT_NULL, new Object[0]);
            return;
        }
        if(AdUnit.getAdUnitActivity().getLayout() == null) {
            webViewCallback0.error(MeasurementsErrors.ERROR_LAYOUT_NULL, new Object[0]);
            return;
        }
        InputEvent inputEvent0 = AdUnit.getAdUnitActivity().getLayout().getLastInputEvent();
        if(inputEvent0 == null) {
            webViewCallback0.error(MeasurementsErrors.ERROR_LAST_INPUT_EVENT_NULL, new Object[0]);
            return;
        }
        Measurements.measurementsService.registerClick(s, inputEvent0);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void registerTrigger(String s, WebViewCallback webViewCallback0) {
        Measurements.measurementsService.registerTrigger(s);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void registerView(String s, WebViewCallback webViewCallback0) {
        Measurements.measurementsService.registerView(s);
        webViewCallback0.invoke(new Object[0]);
    }
}

