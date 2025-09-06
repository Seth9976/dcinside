package com.unity3d.services.core.network.mapper;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.request.WebRequest;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;

public final class WebRequestToHttpRequestKt {
    @l
    public static final HttpRequest toHttpRequest(@l WebRequest webRequest0) {
        L.p(webRequest0, "<this>");
        String s = webRequest0.getUrl().toString();
        String s1 = webRequest0.getRequestType();
        L.o(s1, "requestType");
        Map map0 = webRequest0.getHeaders();
        L.o(s, "toString()");
        L.o(map0, "headers");
        return new HttpRequest(s, null, RequestType.valueOf(s1), webRequest0.getBody(), map0, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 0x1FFE2, null);
    }
}

