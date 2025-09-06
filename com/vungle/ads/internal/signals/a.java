package com.vungle.ads.internal.signals;

import java.util.ArrayList;
import java.util.List;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlinx.serialization.E;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import kotlinx.serialization.internal.H0;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.internal.N0;
import kotlinx.serialization.internal.W;
import kotlinx.serialization.internal.h0;
import kotlinx.serialization.internal.v0;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.t;
import kotlinx.serialization.u;
import y4.l;
import z3.n;

@u
public final class a {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class com.vungle.ads.internal.signals.a.a implements M {
        @l
        public static final com.vungle.ads.internal.signals.a.a INSTANCE;
        public static final f descriptor;

        static {
            com.vungle.ads.internal.signals.a.a a$a0 = new com.vungle.ads.internal.signals.a.a();
            com.vungle.ads.internal.signals.a.a.INSTANCE = a$a0;
            w0 w00 = new w0("com.vungle.ads.internal.signals.SessionData", a$a0, 7);
            w00.k("103", false);
            w00.k("101", true);
            w00.k("100", true);
            w00.k("106", true);
            w00.k("102", true);
            w00.k("104", true);
            w00.k("105", true);
            com.vungle.ads.internal.signals.a.a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            kotlinx.serialization.internal.f f0 = new kotlinx.serialization.internal.f(com.vungle.ads.internal.signals.d.a.INSTANCE);
            kotlinx.serialization.internal.f f1 = new kotlinx.serialization.internal.f(com.vungle.ads.internal.model.p.a.INSTANCE);
            return new i[]{W.a, N0.a, h0.a, f0, h0.a, W.a, f1};
        }

        @l
        public a deserialize(@l e e0) {
            int v8;
            long v7;
            String s1;
            long v6;
            int v5;
            int v4;
            Object object1;
            Object object0;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            if(c0.k()) {
                int v = c0.f(f0, 0);
                String s = c0.i(f0, 1);
                long v1 = c0.e(f0, 2);
                object0 = c0.p(f0, 3, new kotlinx.serialization.internal.f(com.vungle.ads.internal.signals.d.a.INSTANCE), null);
                long v2 = c0.e(f0, 4);
                int v3 = c0.f(f0, 5);
                object1 = c0.p(f0, 6, new kotlinx.serialization.internal.f(com.vungle.ads.internal.model.p.a.INSTANCE), null);
                v4 = v;
                v5 = v3;
                v6 = v2;
                s1 = s;
                v7 = v1;
                v8 = 0x7F;
            }
            else {
                long v9 = 0L;
                Object object2 = null;
                String s2 = null;
                Object object3 = null;
                long v10 = 0L;
                int v11 = 0;
                int v12 = 0;
                int v13 = 0;
                boolean z = true;
                while(z) {
                    int v14 = c0.w(f0);
                    switch(v14) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            v13 |= 1;
                            v11 = c0.f(f0, 0);
                            break;
                        }
                        case 1: {
                            s2 = c0.i(f0, 1);
                            v13 |= 2;
                            break;
                        }
                        case 2: {
                            v10 = c0.e(f0, 2);
                            v13 |= 4;
                            break;
                        }
                        case 3: {
                            object3 = c0.p(f0, 3, new kotlinx.serialization.internal.f(com.vungle.ads.internal.signals.d.a.INSTANCE), object3);
                            v13 |= 8;
                            break;
                        }
                        case 4: {
                            v9 = c0.e(f0, 4);
                            v13 |= 16;
                            break;
                        }
                        case 5: {
                            v12 = c0.f(f0, 5);
                            v13 |= 0x20;
                            break;
                        }
                        case 6: {
                            object2 = c0.p(f0, 6, new kotlinx.serialization.internal.f(com.vungle.ads.internal.model.p.a.INSTANCE), object2);
                            v13 |= 0x40;
                            break;
                        }
                        default: {
                            throw new E(v14);
                        }
                    }
                }
                v4 = v11;
                object1 = object2;
                v5 = v12;
                v6 = v9;
                v8 = v13;
                s1 = s2;
                object0 = object3;
                v7 = v10;
            }
            c0.c(f0);
            return new a(v8, v4, s1, v7, ((List)object0), v6, v5, ((List)object1), null);
        }

        @Override  // kotlinx.serialization.d
        public Object deserialize(e e0) {
            return this.deserialize(e0);
        }

        @Override  // kotlinx.serialization.i
        @l
        public f getDescriptor() {
            return com.vungle.ads.internal.signals.a.a.descriptor;
        }

        public void serialize(@l g g0, @l a a0) {
            L.p(g0, "encoder");
            L.p(a0, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            a.write$Self(a0, d0, f0);
            d0.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((a)object0));
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] typeParametersSerializers() {
            return kotlinx.serialization.internal.M.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        @l
        public final i serializer() {
            return com.vungle.ads.internal.signals.a.a.INSTANCE;
        }
    }

    @l
    public static final b Companion;
    private final int sessionCount;
    private long sessionCreationTime;
    private int sessionDepthCounter;
    private long sessionDuration;
    @l
    private final String sessionId;
    @l
    private List signaledAd;
    @l
    private List unclosedAd;

    static {
        a.Companion = new b(null);
    }

    public a(int v) {
        this.sessionCount = v;
        L.o("2b433f86-e52b-41cc-911a-7233f2b72699", "randomUUID().toString()");
        this.sessionId = "2b433f86-e52b-41cc-911a-7233f2b72699";
        this.sessionCreationTime = System.currentTimeMillis() / 1000L;
        this.signaledAd = new ArrayList();
        this.unclosedAd = new ArrayList();
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public a(int v, @t("103") int v1, @t("101") String s, @t("100") long v2, @t("106") List list0, @t("102") long v3, @t("104") int v4, @t("105") List list1, H0 h00) {
        if(1 != (v & 1)) {
            v0.b(v, 1, com.vungle.ads.internal.signals.a.a.INSTANCE.getDescriptor());
        }
        super();
        this.sessionCount = v1;
        if((v & 2) == 0) {
            L.o("a951c361-d7ef-4741-98f1-70343bcaaba1", "randomUUID().toString()");
            this.sessionId = "a951c361-d7ef-4741-98f1-70343bcaaba1";
        }
        else {
            this.sessionId = s;
        }
        this.sessionCreationTime = (v & 4) == 0 ? System.currentTimeMillis() / 1000L : v2;
        this.signaledAd = (v & 8) == 0 ? new ArrayList() : list0;
        this.sessionDuration = (v & 16) == 0 ? 0L : v3;
        this.sessionDepthCounter = (v & 0x20) == 0 ? 0 : v4;
        if((v & 0x40) == 0) {
            this.unclosedAd = new ArrayList();
            return;
        }
        this.unclosedAd = list1;
    }

    public final int component1() {
        return this.sessionCount;
    }

    @l
    public final a copy(int v) {
        return new a(v);
    }

    public static a copy$default(a a0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = a0.sessionCount;
        }
        return a0.copy(v);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a ? this.sessionCount == ((a)object0).sessionCount : false;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    @t("103")
    public static void getSessionCount$annotations() {
    }

    public final long getSessionCreationTime() {
        return this.sessionCreationTime;
    }

    @t("100")
    public static void getSessionCreationTime$annotations() {
    }

    public final int getSessionDepthCounter() {
        return this.sessionDepthCounter;
    }

    @t("104")
    public static void getSessionDepthCounter$annotations() {
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    @t("102")
    public static void getSessionDuration$annotations() {
    }

    @l
    public final String getSessionId() {
        return this.sessionId;
    }

    @t("101")
    public static void getSessionId$annotations() {
    }

    @l
    public final List getSignaledAd() {
        return this.signaledAd;
    }

    @t("106")
    public static void getSignaledAd$annotations() {
    }

    @l
    public final List getUnclosedAd() {
        return this.unclosedAd;
    }

    @t("105")
    public static void getUnclosedAd$annotations() {
    }

    @Override
    public int hashCode() {
        return this.sessionCount;
    }

    public final void setSessionCreationTime(long v) {
        this.sessionCreationTime = v;
    }

    public final void setSessionDepthCounter(int v) {
        this.sessionDepthCounter = v;
    }

    public final void setSessionDuration(long v) {
        this.sessionDuration = v;
    }

    public final void setSignaledAd(@l List list0) {
        L.p(list0, "<set-?>");
        this.signaledAd = list0;
    }

    public final void setUnclosedAd(@l List list0) {
        L.p(list0, "<set-?>");
        this.unclosedAd = list0;
    }

    @Override
    @l
    public String toString() {
        return "SessionData(sessionCount=" + this.sessionCount + ')';
    }

    @n
    public static final void write$Self(@l a a0, @l d d0, @l f f0) {
        L.p(a0, "self");
        L.p(d0, "output");
        L.p(f0, "serialDesc");
        d0.n(f0, 0, a0.sessionCount);
        if(d0.q(f0, 1)) {
            d0.p(f0, 1, a0.sessionId);
        }
        else {
            L.o("5f019184-4e05-4204-a8e7-346161f52e78", "randomUUID().toString()");
            if(!L.g(a0.sessionId, "5f019184-4e05-4204-a8e7-346161f52e78")) {
                d0.p(f0, 1, a0.sessionId);
            }
        }
        if(d0.q(f0, 2) || a0.sessionCreationTime != System.currentTimeMillis() / 1000L) {
            d0.u(f0, 2, a0.sessionCreationTime);
        }
        if(d0.q(f0, 3) || !L.g(a0.signaledAd, new ArrayList())) {
            d0.G(f0, 3, new kotlinx.serialization.internal.f(com.vungle.ads.internal.signals.d.a.INSTANCE), a0.signaledAd);
        }
        if(d0.q(f0, 4) || a0.sessionDuration != 0L) {
            d0.u(f0, 4, a0.sessionDuration);
        }
        if(d0.q(f0, 5) || a0.sessionDepthCounter != 0) {
            d0.n(f0, 5, a0.sessionDepthCounter);
        }
        if(d0.q(f0, 6) || !L.g(a0.unclosedAd, new ArrayList())) {
            d0.G(f0, 6, new kotlinx.serialization.internal.f(com.vungle.ads.internal.model.p.a.INSTANCE), a0.unclosedAd);
        }
    }
}

