package com.vungle.ads.internal.network.converters;

import java.io.IOException;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.reflect.s;
import kotlinx.serialization.i;
import kotlinx.serialization.json.f;
import kotlinx.serialization.z;
import okhttp3.ResponseBody;
import y4.l;
import y4.m;

public final class c implements a {
    static final class com.vungle.ads.internal.network.converters.c.a extends N implements Function1 {
        public static final com.vungle.ads.internal.network.converters.c.a INSTANCE;

        static {
            com.vungle.ads.internal.network.converters.c.a.INSTANCE = new com.vungle.ads.internal.network.converters.c.a();
        }

        com.vungle.ads.internal.network.converters.c.a() {
            super(1);
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            this.invoke(((f)object0));
            return S0.a;
        }

        public final void invoke(@l f f0) {
            L.p(f0, "$this$Json");
            f0.w(true);
            f0.u(true);
            f0.v(false);
            f0.r(true);
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }
    }

    @l
    public static final b Companion;
    @l
    private static final kotlinx.serialization.json.b json;
    @l
    private final s kType;

    static {
        c.Companion = new b(null);
        c.json = kotlinx.serialization.json.s.b(null, com.vungle.ads.internal.network.converters.c.a.INSTANCE, 1, null);
    }

    public c(@l s s0) {
        L.p(s0, "kType");
        super();
        this.kType = s0;
    }

    @Override  // com.vungle.ads.internal.network.converters.a
    public Object convert(Object object0) {
        return this.convert(((ResponseBody)object0));
    }

    @m
    public Object convert(@m ResponseBody responseBody0) throws IOException {
        Object object0;
        if(responseBody0 != null) {
            try {
                String s = responseBody0.string();
                if(s != null) {
                    i i0 = z.k(kotlinx.serialization.json.b.d.a(), this.kType);
                    object0 = c.json.d(i0, s);
                    goto label_9;
                }
                goto label_11;
            }
            catch(Throwable throwable0) {
                kotlin.io.c.a(responseBody0, throwable0);
                throw throwable0;
            }
        label_9:
            kotlin.io.c.a(responseBody0, null);
            return object0;
        }
    label_11:
        kotlin.io.c.a(responseBody0, null);
        return null;
    }
}

