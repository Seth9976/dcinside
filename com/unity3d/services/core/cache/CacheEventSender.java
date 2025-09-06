package com.unity3d.services.core.cache;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;

public final class CacheEventSender implements Serializable {
    @l
    private final IEventSender eventSender;

    public CacheEventSender(@l IEventSender iEventSender0) {
        L.p(iEventSender0, "eventSender");
        super();
        this.eventSender = iEventSender0;
    }

    public final boolean sendEvent(@l CacheEvent cacheEvent0, @l Object[] arr_object) {
        L.p(cacheEvent0, "eventId");
        L.p(arr_object, "params");
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        return this.eventSender.sendEvent(WebViewEventCategory.CACHE, cacheEvent0, arr_object1);
    }
}

