package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.CommonWebViewBridge;
import com.unity3d.ads.adplayer.WebViewBridge;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import y4.l;

public final class CommonGetWebViewBridgeUseCase implements GetWebViewBridgeUseCase {
    @l
    private final K dispatcher;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetWebViewBridgeUseCase(@l K k0, @l SendDiagnosticEvent sendDiagnosticEvent0) {
        L.p(k0, "dispatcher");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        super();
        this.dispatcher = k0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
    }

    public CommonGetWebViewBridgeUseCase(K k0, SendDiagnosticEvent sendDiagnosticEvent0, int v, w w0) {
        if((v & 1) != 0) {
            k0 = h0.a();
        }
        this(k0, sendDiagnosticEvent0);
    }

    @Override  // com.unity3d.ads.core.domain.GetWebViewBridgeUseCase
    @l
    public WebViewBridge invoke(@l AndroidWebViewContainer androidWebViewContainer0, @l O o0) {
        L.p(androidWebViewContainer0, "webViewContainer");
        L.p(o0, "adPlayerScope");
        return new CommonWebViewBridge(this.dispatcher, androidWebViewContainer0, o0, this.sendDiagnosticEvent);
    }
}

