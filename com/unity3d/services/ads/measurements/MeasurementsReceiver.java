package com.unity3d.services.ads.measurements;

import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.L;
import y4.l;

@SuppressLint({"NewApi", "MissingPermission"})
public final class MeasurementsReceiver implements OutcomeReceiver {
    @l
    private final MeasurementsEvents errorEvent;
    @l
    private final IEventSender eventSender;
    @l
    private final MeasurementsEvents successEvent;

    public MeasurementsReceiver(@l IEventSender iEventSender0, @l MeasurementsEvents measurementsEvents0, @l MeasurementsEvents measurementsEvents1) {
        L.p(iEventSender0, "eventSender");
        L.p(measurementsEvents0, "successEvent");
        L.p(measurementsEvents1, "errorEvent");
        super();
        this.eventSender = iEventSender0;
        this.successEvent = measurementsEvents0;
        this.errorEvent = measurementsEvents1;
    }

    public void onError(@l Exception exception0) {
        L.p(exception0, "error");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.errorEvent, new Object[]{exception0.toString()});
    }

    @Override  // android.os.OutcomeReceiver
    public void onError(Throwable throwable0) {
        this.onError(((Exception)throwable0));
    }

    @Override  // android.os.OutcomeReceiver
    public void onResult(@l Object object0) {
        L.p(object0, "p0");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.successEvent, new Object[0]);
    }
}

