package com.vungle.ads.internal.model;

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
import kotlinx.serialization.internal.v0;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.t;
import kotlinx.serialization.u;
import y4.l;
import z3.n;

@u
public final class p {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a p$a0 = new a();
            a.INSTANCE = p$a0;
            w0 w00 = new w0("com.vungle.ads.internal.model.UnclosedAd", p$a0, 2);
            w00.k("107", false);
            w00.k("101", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            return new i[]{N0.a, N0.a};
        }

        @l
        public p deserialize(@l e e0) {
            int v;
            String s1;
            String s;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            if(c0.k()) {
                s = c0.i(f0, 0);
                s1 = c0.i(f0, 1);
                v = 3;
            }
            else {
                s = null;
                String s2 = null;
                int v1 = 0;
                boolean z = true;
                while(z) {
                    int v2 = c0.w(f0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            s = c0.i(f0, 0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            s2 = c0.i(f0, 1);
                            v1 |= 2;
                            break;
                        }
                        default: {
                            throw new E(v2);
                        }
                    }
                }
                s1 = s2;
                v = v1;
            }
            c0.c(f0);
            return new p(v, s, s1, null);
        }

        @Override  // kotlinx.serialization.d
        public Object deserialize(e e0) {
            return this.deserialize(e0);
        }

        @Override  // kotlinx.serialization.i
        @l
        public f getDescriptor() {
            return a.descriptor;
        }

        public void serialize(@l g g0, @l p p0) {
            L.p(g0, "encoder");
            L.p(p0, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            p.write$Self(p0, d0, f0);
            d0.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((p)object0));
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
            return a.INSTANCE;
        }
    }

    @l
    public static final b Companion;
    @l
    private final String eventId;
    @l
    private String sessionId;

    static {
        p.Companion = new b(null);
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public p(int v, @t("107") String s, @t("101") String s1, H0 h00) {
        if(1 != (v & 1)) {
            v0.b(v, 1, a.INSTANCE.getDescriptor());
        }
        super();
        this.eventId = s;
        if((v & 2) == 0) {
            this.sessionId = "";
            return;
        }
        this.sessionId = s1;
    }

    public p(@l String s, @l String s1) {
        L.p(s, "eventId");
        L.p(s1, "sessionId");
        super();
        this.eventId = s;
        this.sessionId = s1;
    }

    public p(String s, String s1, int v, w w0) {
        if((v & 2) != 0) {
            s1 = "";
        }
        this(s, s1);
    }

    @l
    public final String component1() {
        return this.eventId;
    }

    @l
    public final String component2() {
        return this.sessionId;
    }

    @l
    public final p copy(@l String s, @l String s1) {
        L.p(s, "eventId");
        L.p(s1, "sessionId");
        return new p(s, s1);
    }

    public static p copy$default(p p0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = p0.eventId;
        }
        if((v & 2) != 0) {
            s1 = p0.sessionId;
        }
        return p0.copy(s, s1);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(object0 != null) {
            Class class0 = object0.getClass();
            return L.g(p.class, class0) && L.g(this.eventId, ((p)object0).eventId) && L.g(this.sessionId, ((p)object0).sessionId);
        }
        return false;
    }

    @l
    public final String getEventId() {
        return this.eventId;
    }

    @t("107")
    public static void getEventId$annotations() {
    }

    @l
    public final String getSessionId() {
        return this.sessionId;
    }

    @t("101")
    public static void getSessionId$annotations() {
    }

    @Override
    public int hashCode() {
        return this.eventId.hashCode() * 0x1F + this.sessionId.hashCode();
    }

    public final void setSessionId(@l String s) {
        L.p(s, "<set-?>");
        this.sessionId = s;
    }

    @Override
    @l
    public String toString() {
        return "UnclosedAd(eventId=" + this.eventId + ", sessionId=" + this.sessionId + ')';
    }

    @n
    public static final void write$Self(@l p p0, @l d d0, @l f f0) {
        L.p(p0, "self");
        L.p(d0, "output");
        L.p(f0, "serialDesc");
        d0.p(f0, 0, p0.eventId);
        if(d0.q(f0, 1) || !L.g(p0.sessionId, "")) {
            d0.p(f0, 1, p0.sessionId);
        }
    }
}

