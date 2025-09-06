package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import java.util.List;
import java.util.Map;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import y4.l;

@s0({"SMAP\nAndroidSendWebViewClientErrorDiagnostics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSendWebViewClientErrorDiagnostics.kt\ncom/unity3d/ads/core/domain/AndroidSendWebViewClientErrorDiagnostics\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1855#2,2:28\n*S KotlinDebug\n*F\n+ 1 AndroidSendWebViewClientErrorDiagnostics.kt\ncom/unity3d/ads/core/domain/AndroidSendWebViewClientErrorDiagnostics\n*L\n11#1:28,2\n*E\n"})
public final class AndroidSendWebViewClientErrorDiagnostics implements SendWebViewClientErrorDiagnostics {
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidSendWebViewClientErrorDiagnostics(@l SendDiagnosticEvent sendDiagnosticEvent0) {
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        super();
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
    }

    @Override  // com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics
    public void invoke(@l List list0) {
        L.p(list0, "errors");
        for(Object object0: list0) {
            WebViewClientError webViewClientError0 = (WebViewClientError)object0;
            String s = webViewClientError0.getUrl();
            Map map0 = s == null || s.length() == 0 ? null : Y.k(r0.a("webview_url", webViewClientError0.getUrl()));
            Map map1 = Y.j0(new V[]{r0.a("reason", webViewClientError0.getReason().getCode())});
            if(webViewClientError0.getStatusCode() != null) {
                map1.put("webview_error_code", webViewClientError0.getStatusCode());
            }
            DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_error", null, map0, map1, null, 18, null);
        }
    }
}

