package com.kakao.adfit.m;

import android.content.Context;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

public final class r {
    public static final r a;
    private static String b;
    private static Long c;
    private static String d;
    private static String e;

    static {
        r.a = new r();
    }

    public final void a() {
        r.b = null;
        r.c = null;
        r.d = null;
        r.e = null;
    }

    public final void a(Context context0, String s) {
        L.p(context0, "context");
        L.p(s, "accountId");
        A.a.b(context0);
        r.e = s;
    }

    public final void a(Context context0, String s, long v) {
        static final class a extends N implements Function1 {
            final r a;
            final String b;
            final long c;

            a(r r0, String s, long v) {
                this.a = r0;
                this.b = s;
                this.c = v;
                super(1);
            }

            public final void a(o o0) {
                L.p(o0, "response");
                if(L.g(this.a.c(), this.b)) {
                    Long long0 = this.a.d();
                    if(long0 != null && ((long)long0) == this.c) {
                        r.d = o0.a();
                    }
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((o)object0));
                return S0.a;
            }
        }


        static final class b extends N implements Function1 {
            public static final b a;

            static {
                b.a = new b();
            }

            b() {
                super(1);
            }

            public final void a(String s) {
                f.b(("Failed to get eacid: " + s));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((String)object0));
                return S0.a;
            }
        }

        L.p(context0, "context");
        L.p(s, "appKey");
        if(L.g(r.b, s) && (r.c != null && ((long)r.c) == v)) {
            return;
        }
        A.a.b(context0);
        r.b = s;
        r.c = v;
        r.d = null;
        new n(context0).a(s, String.valueOf(v), new a(this, s, v), b.a);
    }

    public final String b() {
        return r.e;
    }

    public final String c() {
        return r.b;
    }

    public final Long d() {
        return r.c;
    }

    public final String e() {
        return r.d;
    }
}

