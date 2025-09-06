package com.kakao.adfit.a;

import android.content.Context;
import com.kakao.adfit.common.matrix.c;
import com.kakao.adfit.i.j;
import java.util.HashMap;
import kotlin.collections.l;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import okhttp3.Response;

public final class e {
    public interface a {
        public static abstract class com.kakao.adfit.a.e.a.a {
            public static void a(a e$a0, Response response0) {
                L.p(response0, "response");
                e$a0.a(response0.code(), response0.message());
            }
        }

        void a(int arg1, String arg2);

        void a(Throwable arg1);

        void a(Response arg1);
    }

    private final Context a;
    private final String b;
    private final String c;
    private final String d;

    public e(Context context0, String s, String s1, String s2) {
        L.p(context0, "context");
        L.p(s, "responseId");
        L.p(s1, "adUnitId");
        L.p(s2, "dspId");
        super();
        this.a = context0;
        this.b = s;
        this.c = s1;
        this.d = s2;
    }

    public final a a(String s) {
        public static final class b implements a {
            private final String a;
            final String b;
            final e c;

            b(String s, e e0) {
                this.b = s;
                this.c = e0;
                super();
                this.a = "Failed to send a \"bimp\" URL.";
            }

            private final com.kakao.adfit.common.matrix.e a(String s, String s1, int v, String s2, Throwable throwable0) {
                String s3;
                j j0 = j.b.a(s1);
                com.kakao.adfit.common.matrix.e e0 = com.kakao.adfit.common.matrix.e.a.a(com.kakao.adfit.common.matrix.e.t, j0, null, null, 6, null);
                e e1 = this.c;
                e0.c(u.H());
                e0.a(throwable0);
                HashMap hashMap0 = new HashMap();
                hashMap0.put("ad.ad_unit_id", e1.c);
                hashMap0.put("ad.dsp_id", e1.d);
                switch(com.kakao.adfit.m.u.b(e1.a)) {
                    case 1: {
                        s3 = "cellular";
                        break;
                    }
                    case 2: {
                        s3 = "wifi";
                        break;
                    }
                    case 3: {
                        s3 = "ethernet";
                        break;
                    }
                    default: {
                        s3 = "unknown";
                    }
                }
                hashMap0.put("connection_type", s3);
                e0.b(hashMap0);
                HashMap hashMap1 = new HashMap();
                hashMap1.put("response_id", e1.b);
                hashMap1.put("url", s);
                if(v > 0) {
                    hashMap1.put("response.code", String.valueOf(v));
                    if(s2 != null) {
                        hashMap1.put("response.message", s2);
                    }
                }
                e0.a(hashMap1);
                return e0;
            }

            @Override  // com.kakao.adfit.a.e$a
            public void a(int v, String s) {
                com.kakao.adfit.common.matrix.e e0 = this.a(this.b, "Invalid response [" + v + " / " + s + ']', v, s, null);
                c.a.b(e0);
            }

            @Override  // com.kakao.adfit.a.e$a
            public void a(Throwable throwable0) {
                String s;
                L.p(throwable0, "t");
                StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
                L.o(arr_stackTraceElement, "oldStackTrace");
                int v;
                for(v = 0; true; ++v) {
                    s = null;
                    if(v >= arr_stackTraceElement.length) {
                        v = -1;
                        break;
                    }
                    String s1 = arr_stackTraceElement[v].getClassName();
                    if(s1 != null) {
                        L.o(s1, "className");
                        if(!v.v2(s1, "com.kakao.adfit", false, 2, null)) {
                            continue;
                        }
                        break;
                    }
                }
                if(v > 0) {
                    throwable0.setStackTrace(((StackTraceElement[])l.l1(arr_stackTraceElement, 0, v + 1)));
                }
                String s2 = throwable0.toString();
                if(!v.x3(s2)) {
                    s = s2;
                }
                if(s == null) {
                    s = this.a;
                }
                com.kakao.adfit.common.matrix.e e0 = this.a(this.b, s, -1, null, throwable0);
                c.a.b(e0);
            }

            @Override  // com.kakao.adfit.a.e$a
            public void a(Response response0) {
                com.kakao.adfit.a.e.a.a.a(this, response0);
            }
        }

        L.p(s, "url");
        return !v.W2(s, "/ssp/bimp", false, 2, null) ? null : new b(s, this);
    }
}

