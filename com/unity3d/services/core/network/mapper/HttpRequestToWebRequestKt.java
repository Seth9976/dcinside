package com.unity3d.services.core.network.mapper;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.request.WebRequest;
import kotlin.jvm.internal.L;
import y4.l;

public final class HttpRequestToWebRequestKt {
    @l
    public static final WebRequest toWebRequest(@l HttpRequest httpRequest0) {
        L.p(httpRequest0, "<this>");
        WebRequest webRequest0 = new WebRequest(httpRequest0.getBaseURL(), httpRequest0.getMethod().toString(), httpRequest0.getHeaders(), httpRequest0.getConnectTimeout(), httpRequest0.getReadTimeout());
        Object object0 = httpRequest0.getBody();
        if(object0 instanceof String) {
            webRequest0.setBody(((String)httpRequest0.getBody()));
            return webRequest0;
        }
        if(object0 instanceof byte[]) {
            webRequest0.setBody(((byte[])httpRequest0.getBody()));
        }
        return webRequest0;
    }
}

