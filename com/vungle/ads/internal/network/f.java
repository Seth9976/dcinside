package com.vungle.ads.internal.network;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import y4.l;
import y4.m;

public final class f {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final f error(@m ResponseBody responseBody0, @l Response response0) {
            L.p(response0, "rawResponse");
            if(response0.isSuccessful()) {
                throw new IllegalArgumentException("rawResponse should not be successful response");
            }
            return new f(response0, null, responseBody0, null);
        }

        @l
        public final f success(@m Object object0, @l Response response0) {
            L.p(response0, "rawResponse");
            if(!response0.isSuccessful()) {
                throw new IllegalArgumentException("rawResponse must be successful response");
            }
            return new f(response0, object0, null, null);
        }
    }

    @l
    public static final a Companion;
    @m
    private final Object body;
    @m
    private final ResponseBody errorBody;
    @l
    private final Response rawResponse;

    static {
        f.Companion = new a(null);
    }

    private f(Response response0, Object object0, ResponseBody responseBody0) {
        this.rawResponse = response0;
        this.body = object0;
        this.errorBody = responseBody0;
    }

    public f(Response response0, Object object0, ResponseBody responseBody0, w w0) {
        this(response0, object0, responseBody0);
    }

    @m
    public final Object body() {
        return this.body;
    }

    public final int code() {
        return this.rawResponse.code();
    }

    @m
    public final ResponseBody errorBody() {
        return this.errorBody;
    }

    @l
    public final Headers headers() {
        return this.rawResponse.headers();
    }

    public final boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    @l
    public final String message() {
        return this.rawResponse.message();
    }

    @l
    public final Response raw() {
        return this.rawResponse;
    }

    @Override
    @l
    public String toString() {
        return this.rawResponse.toString();
    }
}

