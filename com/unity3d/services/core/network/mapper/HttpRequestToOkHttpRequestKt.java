package com.unity3d.services.core.network.mapper;

import com.unity3d.services.core.network.model.HttpRequest;
import java.util.List;
import java.util.Map.Entry;
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

@s0({"SMAP\nHttpRequestToOkHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequestToOkHttpRequest.kt\ncom/unity3d/services/core/network/mapper/HttpRequestToOkHttpRequestKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,37:1\n1#2:38\n215#3,2:39\n*S KotlinDebug\n*F\n+ 1 HttpRequestToOkHttpRequest.kt\ncom/unity3d/services/core/network/mapper/HttpRequestToOkHttpRequestKt\n*L\n23#1:39,2\n*E\n"})
public final class HttpRequestToOkHttpRequestKt {
    private static final RequestBody generateOkHttpBody(Object object0) {
        RequestBody requestBody0;
        if(object0 instanceof byte[]) {
            requestBody0 = RequestBody.create(MediaType.parse("text/plain;charset=utf-8"), ((byte[])object0));
            L.o(requestBody0, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return requestBody0;
        }
        if(object0 instanceof String) {
            requestBody0 = RequestBody.create(MediaType.parse("text/plain;charset=utf-8"), ((String)object0));
            L.o(requestBody0, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return requestBody0;
        }
        requestBody0 = RequestBody.create(MediaType.parse("text/plain;charset=utf-8"), "");
        L.o(requestBody0, "create(MediaType.parse(\"…lain;charset=utf-8\"), \"\")");
        return requestBody0;
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

    private static final RequestBody generateOkHttpProtobufBody(Object object0) {
        RequestBody requestBody0;
        if(object0 instanceof byte[]) {
            requestBody0 = RequestBody.create(MediaType.parse("application/x-protobuf"), ((byte[])object0));
            L.o(requestBody0, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return requestBody0;
        }
        if(object0 instanceof String) {
            requestBody0 = RequestBody.create(MediaType.parse("application/x-protobuf"), ((String)object0));
            L.o(requestBody0, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return requestBody0;
        }
        requestBody0 = RequestBody.create(MediaType.parse("application/x-protobuf"), "");
        L.o(requestBody0, "create(MediaType.parse(\"…ication/x-protobuf\"), \"\")");
        return requestBody0;
    }

    @l
    public static final Request toOkHttpProtoRequest(@l HttpRequest httpRequest0) {
        L.p(httpRequest0, "<this>");
        Object object0 = httpRequest0.getBody();
        Request request0 = new okhttp3.Request.Builder().url(v.k4((v.L5(httpRequest0.getBaseURL(), new char[]{'/'}) + '/' + v.L5(httpRequest0.getPath(), new char[]{'/'})), "/")).method(httpRequest0.getMethod().toString(), (object0 == null ? null : HttpRequestToOkHttpRequestKt.generateOkHttpProtobufBody(object0))).headers(HttpRequestToOkHttpRequestKt.generateOkHttpHeaders(httpRequest0)).build();
        L.o(request0, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return request0;
    }

    @l
    public static final Request toOkHttpRequest(@l HttpRequest httpRequest0) {
        L.p(httpRequest0, "<this>");
        Object object0 = httpRequest0.getBody();
        Request request0 = new okhttp3.Request.Builder().url(v.k4((v.L5(httpRequest0.getBaseURL(), new char[]{'/'}) + '/' + v.L5(httpRequest0.getPath(), new char[]{'/'})), "/")).method(httpRequest0.getMethod().toString(), (object0 == null ? null : HttpRequestToOkHttpRequestKt.generateOkHttpBody(object0))).headers(HttpRequestToOkHttpRequestKt.generateOkHttpHeaders(httpRequest0)).build();
        L.o(request0, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return request0;
    }
}

