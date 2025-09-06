package com.unity3d.services.store;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;

public final class StoreWebViewEventSender {
    @l
    private final IEventSender eventSender;

    public StoreWebViewEventSender(@l IEventSender iEventSender0) {
        L.p(iEventSender0, "eventSender");
        super();
        this.eventSender = iEventSender0;
    }

    public final void send(@l StoreEvent storeEvent0, @l Object[] arr_object) {
        L.p(storeEvent0, "event");
        L.p(arr_object, "params");
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        this.eventSender.sendEvent(WebViewEventCategory.STORE, storeEvent0, arr_object1);
    }
}

