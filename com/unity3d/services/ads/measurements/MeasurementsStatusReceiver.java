package com.unity3d.services.ads.measurements;

import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.L;
import y4.l;

@SuppressLint({"NewApi", "MissingPermission"})
public final class MeasurementsStatusReceiver implements OutcomeReceiver {
    @l
    private final IEventSender eventSender;

    public MeasurementsStatusReceiver(@l IEventSender iEventSender0) {
        L.p(iEventSender0, "eventSender");
        super();
        this.eventSender = iEventSender0;
    }

    public void onError(@l Exception exception0) {
        L.p(exception0, "error");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, new Object[]{MeasurementsErrors.ERROR_EXCEPTION, exception0.toString()});
    }

    @Override  // android.os.OutcomeReceiver
    public void onError(Throwable throwable0) {
        this.onError(((Exception)throwable0));
    }

    public void onResult(int v) {
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.AVAILABLE, new Object[]{v});
    }

    @Override  // android.os.OutcomeReceiver
    public void onResult(Object object0) {
        this.onResult(((Number)object0).intValue());
    }
}

