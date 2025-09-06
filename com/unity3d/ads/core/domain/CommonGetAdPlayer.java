package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.banners.BannerViewCache;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import y4.l;

public final class CommonGetAdPlayer implements GetAdPlayer {
    @l
    private final O adPlayerScope;
    @l
    private final K defaultDispatcher;
    @l
    private final DeviceInfoRepository deviceInfoRepository;
    @l
    private final ExecuteAdViewerRequest executeAdViewerRequest;
    @l
    private final OfferwallManager offerwallManager;
    @l
    private final OpenMeasurementRepository openMeasurementRepository;
    @l
    private final ScarManager scarManager;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;
    @l
    private final SessionRepository sessionRepository;

    public CommonGetAdPlayer(@l DeviceInfoRepository deviceInfoRepository0, @l SessionRepository sessionRepository0, @l ExecuteAdViewerRequest executeAdViewerRequest0, @l SendDiagnosticEvent sendDiagnosticEvent0, @l K k0, @l O o0, @l OpenMeasurementRepository openMeasurementRepository0, @l ScarManager scarManager0, @l OfferwallManager offerwallManager0) {
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        L.p(sessionRepository0, "sessionRepository");
        L.p(executeAdViewerRequest0, "executeAdViewerRequest");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        L.p(k0, "defaultDispatcher");
        L.p(o0, "adPlayerScope");
        L.p(openMeasurementRepository0, "openMeasurementRepository");
        L.p(scarManager0, "scarManager");
        L.p(offerwallManager0, "offerwallManager");
        super();
        this.deviceInfoRepository = deviceInfoRepository0;
        this.sessionRepository = sessionRepository0;
        this.executeAdViewerRequest = executeAdViewerRequest0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
        this.defaultDispatcher = k0;
        this.adPlayerScope = o0;
        this.openMeasurementRepository = openMeasurementRepository0;
        this.scarManager = scarManager0;
        this.offerwallManager = offerwallManager0;
    }

    @Override  // com.unity3d.ads.core.domain.GetAdPlayer
    @l
    public AdPlayer invoke(@l WebViewBridge webViewBridge0, @l AndroidWebViewContainer androidWebViewContainer0, @l ByteString byteString0) {
        L.p(webViewBridge0, "webviewBridge");
        L.p(androidWebViewContainer0, "webviewContainer");
        L.p(byteString0, "opportunityId");
        WebViewAdPlayer webViewAdPlayer0 = new WebViewAdPlayer(webViewBridge0, this.deviceInfoRepository, this.sessionRepository, this.executeAdViewerRequest, this.defaultDispatcher, this.sendDiagnosticEvent, androidWebViewContainer0, this.adPlayerScope);
        if(BannerViewCache.getInstance().getBannerView(ProtobufExtensionsKt.toUUID(byteString0).toString()) == null) {
            String s = byteString0.toStringUtf8();
            L.o(s, "toStringUtf8()");
            return new AndroidFullscreenWebViewAdPlayer(webViewAdPlayer0, s, androidWebViewContainer0, this.deviceInfoRepository, this.sessionRepository, this.openMeasurementRepository, this.scarManager, this.offerwallManager, this.sendDiagnosticEvent);
        }
        String s1 = ProtobufExtensionsKt.toUUID(byteString0).toString();
        L.o(s1, "toString()");
        return new AndroidEmbeddableWebViewAdPlayer(webViewAdPlayer0, s1, androidWebViewContainer0, this.openMeasurementRepository, this.scarManager);
    }
}

