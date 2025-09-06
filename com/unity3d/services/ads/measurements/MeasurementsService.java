package com.unity3d.services.ads.measurements;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.measurement.h;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.w0;
import y4.l;
import y4.m;

@SuppressLint({"NewApi", "MissingPermission"})
public final class MeasurementsService {
    @l
    private final ISDKDispatchers dispatchers;
    @l
    private final IEventSender eventSender;
    @m
    private final MeasurementManager measurementManager;

    public MeasurementsService(@l Context context0, @l ISDKDispatchers iSDKDispatchers0, @l IEventSender iEventSender0) {
        L.p(context0, "context");
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(iEventSender0, "eventSender");
        super();
        this.dispatchers = iSDKDispatchers0;
        this.eventSender = iEventSender0;
        this.measurementManager = this.getMeasurementManager(context0);
    }

    public final void checkAvailability() {
        if(SdkExtensions.getExtensionVersion(1000000) < 4) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, new Object[]{MeasurementsErrors.ERROR_EXTENSION_BELOW_4});
            return;
        }
        if(this.measurementManager == null) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, new Object[]{MeasurementsErrors.ERROR_MANAGER_NULL});
            return;
        }
        if(!AdServicesState.isAdServicesStateEnabled()) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, new Object[]{MeasurementsErrors.ERROR_AD_SERVICES_DISABLED});
            return;
        }
        Executor executor0 = w0.b(this.dispatchers.getDefault());
        MeasurementsStatusReceiver measurementsStatusReceiver0 = new MeasurementsStatusReceiver(this.eventSender);
        this.measurementManager.getMeasurementApiStatus(executor0, measurementsStatusReceiver0);
    }

    // 去混淆评级： 低(20)
    private final MeasurementManager getMeasurementManager(Context context0) {
        return SdkExtensions.getExtensionVersion(1000000) >= 4 ? h.a(context0.getSystemService(MeasurementManager.class)) : null;
    }

    public final void registerClick(@l String s, @l InputEvent inputEvent0) {
        L.p(s, "url");
        L.p(inputEvent0, "inputEvent");
        MeasurementManager measurementManager0 = this.measurementManager;
        if(measurementManager0 != null) {
            measurementManager0.registerSource(Uri.parse(s), inputEvent0, w0.b(this.dispatchers.getDefault()), androidx.core.os.h.a(new MeasurementsReceiver(this.eventSender, MeasurementsEvents.CLICK_SUCCESSFUL, MeasurementsEvents.CLICK_ERROR)));
        }
    }

    public final void registerTrigger(@l String s) {
        L.p(s, "url");
        MeasurementManager measurementManager0 = this.measurementManager;
        if(measurementManager0 != null) {
            measurementManager0.registerTrigger(Uri.parse(s), w0.b(this.dispatchers.getDefault()), androidx.core.os.h.a(new MeasurementsReceiver(this.eventSender, MeasurementsEvents.TRIGGER_SUCCESSFUL, MeasurementsEvents.TRIGGER_ERROR)));
        }
    }

    public final void registerView(@l String s) {
        L.p(s, "url");
        MeasurementManager measurementManager0 = this.measurementManager;
        if(measurementManager0 != null) {
            measurementManager0.registerSource(Uri.parse(s), null, w0.b(this.dispatchers.getDefault()), androidx.core.os.h.a(new MeasurementsReceiver(this.eventSender, MeasurementsEvents.VIEW_SUCCESSFUL, MeasurementsEvents.VIEW_ERROR)));
        }
    }
}

