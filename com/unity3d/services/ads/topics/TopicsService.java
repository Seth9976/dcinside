package com.unity3d.services.ads.topics;

import android.adservices.AdServicesState;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.ext.SdkExtensions;
import androidx.privacysandbox.ads.adservices.topics.b;
import androidx.privacysandbox.ads.adservices.topics.f;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.w0;
import y4.l;
import y4.m;

@SuppressLint({"NewApi", "MissingPermission"})
public final class TopicsService {
    @l
    private final ISDKDispatchers dispatchers;
    @l
    private final IEventSender eventSender;
    @m
    private final TopicsManager topicsManager;

    public TopicsService(@l Context context0, @l ISDKDispatchers iSDKDispatchers0, @l IEventSender iEventSender0) {
        L.p(context0, "context");
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(iEventSender0, "eventSender");
        super();
        this.dispatchers = iSDKDispatchers0;
        this.eventSender = iEventSender0;
        this.topicsManager = this.getTopicsManager(context0);
    }

    @l
    public final TopicsStatus checkAvailability() {
        if(SdkExtensions.getExtensionVersion(1000000) < 4) {
            return TopicsStatus.ERROR_EXTENSION_BELOW_4;
        }
        if(this.topicsManager == null) {
            return TopicsStatus.ERROR_TOPICSMANAGER_NULL;
        }
        return AdServicesState.isAdServicesStateEnabled() ? TopicsStatus.TOPICS_AVAILABLE : TopicsStatus.ERROR_AD_SERVICES_DISABLED;
    }

    public final void getTopics(@l String s, boolean z) {
        L.p(s, "adsSdkName");
        TopicsReceiver topicsReceiver0 = new TopicsReceiver(this.eventSender);
        GetTopicsRequest getTopicsRequest0 = f.a().setAdsSdkName(s).setShouldRecordObservation(z).build();
        L.o(getTopicsRequest0, "Builder().setAdsSdkName(…ecordObservation).build()");
        TopicsManager topicsManager0 = this.topicsManager;
        if(topicsManager0 != null) {
            try {
                topicsManager0.getTopics(getTopicsRequest0, w0.b(this.dispatchers.getDefault()), topicsReceiver0);
            }
            catch(Exception exception0) {
                this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, new Object[]{TopicsErrors.ERROR_EXCEPTION, exception0.toString()});
                DeviceLog.debug(("Failed to get topics with error: " + exception0));
            }
        }
    }

    // 去混淆评级： 低(20)
    private final TopicsManager getTopicsManager(Context context0) {
        return SdkExtensions.getExtensionVersion(1000000) >= 4 ? b.a(context0.getSystemService(TopicsManager.class)) : null;
    }
}

