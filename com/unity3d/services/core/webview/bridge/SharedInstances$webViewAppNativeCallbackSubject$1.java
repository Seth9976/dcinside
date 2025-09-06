package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import kotlin.jvm.internal.L;
import y4.l;

public final class SharedInstances.webViewAppNativeCallbackSubject.1 implements INativeCallbackSubject {
    @Override  // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
    @l
    public NativeCallback getCallback(@l String s) {
        L.p(s, "callbackId");
        NativeCallback nativeCallback0 = WebViewApp.getCurrentApp().getCallback(s);
        L.o(nativeCallback0, "getCurrentApp().getCallback(callbackId)");
        return nativeCallback0;
    }

    @Override  // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
    public void remove(@l NativeCallback nativeCallback0) {
        L.p(nativeCallback0, "callback");
        WebViewApp.getCurrentApp().removeCallback(nativeCallback0);
    }
}

