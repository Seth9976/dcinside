package com.unity3d.ads.network.mapper;

import com.unity3d.ads.network.model.HttpBody.ByteArrayBody;
import com.unity3d.ads.network.model.HttpBody.EmptyBody;
import com.unity3d.ads.network.model.HttpBody.StringBody;
import com.unity3d.ads.network.model.HttpBody;
import com.unity3d.ads.network.model.HttpRequest;
import java.util.List;
import java.util.Map.Entry;
import kotlin.J;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import okhttp3.Headers.Builder;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import y4.l;

@s0({"SMAP\nHttpRequestToOkHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequestToOkHttpRequest.kt\ncom/unity3d/ads/network/mapper/HttpRequestToOkHttpRequestKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,25:1\n1#2:26\n215#3,2:27\n*S KotlinDebug\n*F\n+ 1 HttpRequestToOkHttpRequest.kt\ncom/unity3d/ads/network/mapper/HttpRequestToOkHttpRequestKt\n*L\n17#1:27,2\n*E\n"})
public final class HttpRequestToOkHttpRequestKt {
    private static final RequestBody generateOkHttpBody(HttpBody httpBody0) {
        if(httpBody0 instanceof StringBody) {
            return RequestBody.create(MediaType.parse("text/plain;charset=utf-8"), ((StringBody)httpBody0).getContent());
        }
        if(httpBody0 instanceof ByteArrayBody) {
            return RequestBody.create(MediaType.parse("text/plain;charset=utf-8"), ((ByteArrayBody)httpBody0).getContent());
        }
        if(!(httpBody0 instanceof EmptyBody)) {
            throw new J();
        }
        return null;
    }

    private static final Headers generateOkHttpHeaders(HttpRequest httpRequest0) {
        Builder headers$Builder0 = new Builder();
        for(Object object0: httpRequest0.getHeaders().entrySet()) {
            headers$Builder0.add(((String)((Map.Entry)object0).getKey()), u.m3(((List)((Map.Entry)object0).getValue()), ",", null, null, 0, null, null, 62, null));
        }
        Headers headers0 = headers$Builder0.build();
        L.o(headers0, "Builder()\n    .also { he…ng(\",\")) } }\n    .build()");
        return headers0;
    }

    @l
    public static final Request toOkHttpRequest(@l HttpRequest httpRequest0) {
        L.p(httpRequest0, "<this>");
        Request request0 = new okhttp3.Request.Builder().url(v.k4((v.L5(httpRequest0.getBaseURL(), new char[]{'/'}) + '/' + v.L5(httpRequest0.getPath(), new char[]{'/'})), "/")).method(httpRequest0.getMethod().toString(), HttpRequestToOkHttpRequestKt.generateOkHttpBody(httpRequest0.getBody())).headers(HttpRequestToOkHttpRequestKt.generateOkHttpHeaders(httpRequest0)).build();
        L.o(request0, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return request0;
    }
}

