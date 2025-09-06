package com.unity3d.ads.core.utils;

import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import kotlin.coroutines.d;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ContinuationFromCallback extends WebViewCallback {
    @l
    private final d continuation;

    public ContinuationFromCallback(@l d d0) {
        L.p(d0, "continuation");
        super("", 0);
        this.continuation = d0;
    }

    @Override  // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void error(@m Enum enum0, @l Object[] arr_object) {
        L.p(arr_object, "params");
        Object object0 = e0.b(f0.a(new ExposureException("Invocation failed with: " + enum0, arr_object)));
        this.continuation.resumeWith(object0);
    }

    @Override  // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void invoke(@l Object[] arr_object) {
        L.p(arr_object, "params");
        this.continuation.resumeWith(arr_object);
    }
}

