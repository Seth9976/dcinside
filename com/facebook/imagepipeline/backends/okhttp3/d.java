package com.facebook.imagepipeline.backends.okhttp3;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import okhttp3.Headers;
import okhttp3.Response;
import y4.l;
import y4.m;
import z3.n;

public final class d extends Exception {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final d a(@l Response response0) {
            L.p(response0, "response");
            Response response1 = response0.networkResponse();
            Headers headers0 = null;
            Integer integer0 = response1 == null ? null : response1.code();
            Response response2 = response0.networkResponse();
            if(response2 != null) {
                headers0 = response2.headers();
            }
            return new d(integer0, headers0);
        }
    }

    @m
    private final Integer a;
    @m
    private final Headers b;
    @l
    public static final a c;

    static {
        d.c = new a(null);
    }

    public d() {
        this(null, null, 3, null);
    }

    public d(@m Integer integer0, @m Headers headers0) {
        this.a = integer0;
        this.b = headers0;
    }

    public d(Integer integer0, Headers headers0, int v, w w0) {
        if((v & 1) != 0) {
            integer0 = null;
        }
        if((v & 2) != 0) {
            headers0 = null;
        }
        this(integer0, headers0);
    }

    @l
    @n
    public static final d a(@l Response response0) {
        return d.c.a(response0);
    }

    @m
    public final Integer b() {
        return this.a;
    }

    @m
    public final Headers c() {
        return this.b;
    }
}

