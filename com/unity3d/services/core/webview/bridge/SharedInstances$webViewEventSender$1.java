package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;

public final class SharedInstances.webViewEventSender.1 implements IEventSender {
    @Override  // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return WebViewApp.getCurrentApp() != null;
    }

    @Override  // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(@l Enum enum0, @l Enum enum1, @l Object[] arr_object) {
        L.p(enum0, "eventCategory");
        L.p(enum1, "eventId");
        L.p(arr_object, "params");
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        return webViewApp0 == null ? false : webViewApp0.sendEvent(enum0, enum1, Arrays.copyOf(arr_object, arr_object.length));
    }
}

