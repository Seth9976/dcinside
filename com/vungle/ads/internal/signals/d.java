package com.vungle.ads.internal.signals;

import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlinx.serialization.D;
import kotlinx.serialization.E;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.c;
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
public final class d {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a d$a0 = new a();
            a.INSTANCE = d$a0;
            w0 w00 = new w0("com.vungle.ads.internal.signals.SignaledAd", d$a0, 5);
            w00.k("500", true);
            w00.k("109", false);
            w00.k("107", true);
            w00.k("110", true);
            w00.k("108", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            i i0 = P3.a.u(N0.a);
            i i1 = P3.a.u(N0.a);
            return new i[]{i0, h0.a, i1, h0.a, W.a};
        }

        @l
        public d deserialize(@l e e0) {
            long v5;
            long v4;
            Object object2;
            int v3;
            int v2;
            Object object1;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            if(c0.k()) {
                Object object0 = c0.j(f0, 0, N0.a, null);
                long v = c0.e(f0, 1);
                object1 = c0.j(f0, 2, N0.a, null);
                long v1 = c0.e(f0, 3);
                v2 = 0x1F;
                v3 = c0.f(f0, 4);
                object2 = object0;
                v4 = v;
                v5 = v1;
            }
            else {
                v5 = 0L;
                Object object3 = null;
                Object object4 = null;
                long v6 = 0L;
                int v7 = 0;
                int v8 = 0;
                boolean z = true;
                while(z) {
                    int v9 = c0.w(f0);
                    switch(v9) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            object3 = c0.j(f0, 0, N0.a, object3);
                            v8 |= 1;
                            break;
                        }
                        case 1: {
                            v6 = c0.e(f0, 1);
                            v8 |= 2;
                            break;
                        }
                        case 2: {
                            object4 = c0.j(f0, 2, N0.a, object4);
                            v8 |= 4;
                            break;
                        }
                        case 3: {
                            v5 = c0.e(f0, 3);
                            v8 |= 8;
                            break;
                        }
                        case 4: {
                            v7 = c0.f(f0, 4);
                            v8 |= 16;
                            break;
                        }
                        default: {
                            throw new E(v9);
                        }
                    }
                }
                v2 = v8;
                object2 = object3;
                v4 = v6;
                v3 = v7;
                object1 = object4;
            }
            c0.c(f0);
            return new d(v2, ((String)object2), v4, ((String)object1), v5, v3, null);
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

        public void serialize(@l g g0, @l d d0) {
            L.p(g0, "encoder");
            L.p(d0, "value");
            f f0 = this.getDescriptor();
            kotlinx.serialization.encoding.d d1 = g0.b(f0);
            d.write$Self(d0, d1, f0);
            d1.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((d)object0));
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
    private long adAvailabilityCallbackTime;
    @y4.m
    private String eventId;
    @y4.m
    private final Long lastAdLoadTime;
    private final long loadAdTime;
    private long playAdTime;
    private int screenOrientation;
    @y4.m
    private String templateSignals;
    private long timeBetweenAdAvailabilityAndPlayAd;
    private final long timeSinceLastAdLoad;

    static {
        d.Companion = new b(null);
    }

    public d() {
        this(null, 0L, 3, null);
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public d(int v, @t("500") String s, @t("109") long v1, @t("107") String s1, @t("110") long v2, @t("108") int v3, H0 h00) {
        if(2 != (v & 2)) {
            v0.b(v, 2, a.INSTANCE.getDescriptor());
        }
        super();
        this.lastAdLoadTime = 0L;
        this.loadAdTime = 0L;
        this.templateSignals = (v & 1) == 0 ? null : s;
        this.timeSinceLastAdLoad = v1;
        this.eventId = (v & 4) == 0 ? null : s1;
        this.timeBetweenAdAvailabilityAndPlayAd = (v & 8) == 0 ? 0L : v2;
        this.screenOrientation = (v & 16) == 0 ? 0 : v3;
        this.adAvailabilityCallbackTime = 0L;
        this.playAdTime = 0L;
        this.timeSinceLastAdLoad = 0L;
    }

    public d(@y4.m Long long0, long v) {
        this.lastAdLoadTime = long0;
        this.loadAdTime = v;
        this.timeSinceLastAdLoad = this.getTimeDifference(long0, v);
    }

    public d(Long long0, long v, int v1, w w0) {
        if((v1 & 1) != 0) {
            long0 = 0L;
        }
        if((v1 & 2) != 0) {
            v = 0L;
        }
        this(long0, v);
    }

    public final void calculateTimeBetweenAdAvailabilityAndPlayAd() {
        this.timeBetweenAdAvailabilityAndPlayAd = this.getTimeDifference(this.adAvailabilityCallbackTime, this.playAdTime);
    }

    @y4.m
    public final Long component1() {
        return this.lastAdLoadTime;
    }

    public final long component2() {
        return this.loadAdTime;
    }

    @l
    public final d copy(@y4.m Long long0, long v) {
        return new d(long0, v);
    }

    public static d copy$default(d d0, Long long0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            long0 = d0.lastAdLoadTime;
        }
        if((v1 & 2) != 0) {
            v = d0.loadAdTime;
        }
        return d0.copy(long0, v);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        return L.g(this.lastAdLoadTime, ((d)object0).lastAdLoadTime) ? this.loadAdTime == ((d)object0).loadAdTime : false;
    }

    public final long getAdAvailabilityCallbackTime() {
        return this.adAvailabilityCallbackTime;
    }

    @D
    public static void getAdAvailabilityCallbackTime$annotations() {
    }

    @y4.m
    public final String getEventId() {
        return this.eventId;
    }

    @t("107")
    public static void getEventId$annotations() {
    }

    @y4.m
    public final Long getLastAdLoadTime() {
        return this.lastAdLoadTime;
    }

    @D
    public static void getLastAdLoadTime$annotations() {
    }

    public final long getLoadAdTime() {
        return this.loadAdTime;
    }

    @D
    public static void getLoadAdTime$annotations() {
    }

    public final long getPlayAdTime() {
        return this.playAdTime;
    }

    @D
    public static void getPlayAdTime$annotations() {
    }

    public final int getScreenOrientation() {
        return this.screenOrientation;
    }

    @t("108")
    public static void getScreenOrientation$annotations() {
    }

    @y4.m
    public final String getTemplateSignals() {
        return this.templateSignals;
    }

    @t("500")
    public static void getTemplateSignals$annotations() {
    }

    public final long getTimeBetweenAdAvailabilityAndPlayAd() {
        return this.timeBetweenAdAvailabilityAndPlayAd;
    }

    @t("110")
    public static void getTimeBetweenAdAvailabilityAndPlayAd$annotations() {
    }

    private final long getTimeDifference(Long long0, long v) [...] // 潜在的解密器

    public final long getTimeSinceLastAdLoad() {
        return this.timeSinceLastAdLoad;
    }

    @t("109")
    public static void getTimeSinceLastAdLoad$annotations() {
    }

    @Override
    public int hashCode() {
        return this.lastAdLoadTime == null ? ((int)(this.loadAdTime ^ this.loadAdTime >>> 0x20)) : this.lastAdLoadTime.hashCode() * 0x1F + ((int)(this.loadAdTime ^ this.loadAdTime >>> 0x20));
    }

    public final void setAdAvailabilityCallbackTime(long v) {
        this.adAvailabilityCallbackTime = v;
    }

    public final void setEventId(@y4.m String s) {
        this.eventId = s;
    }

    public final void setPlayAdTime(long v) {
        this.playAdTime = v;
    }

    public final void setScreenOrientation(int v) {
        this.screenOrientation = v;
    }

    public final void setTemplateSignals(@y4.m String s) {
        this.templateSignals = s;
    }

    public final void setTimeBetweenAdAvailabilityAndPlayAd(long v) {
        this.timeBetweenAdAvailabilityAndPlayAd = v;
    }

    @Override
    @l
    public String toString() {
        return "SignaledAd(lastAdLoadTime=" + this.lastAdLoadTime + ", loadAdTime=" + this.loadAdTime + ')';
    }

    @n
    public static final void write$Self(@l d d0, @l kotlinx.serialization.encoding.d d1, @l f f0) {
        L.p(d0, "self");
        L.p(d1, "output");
        L.p(f0, "serialDesc");
        if(d1.q(f0, 0) || d0.templateSignals != null) {
            d1.y(f0, 0, N0.a, d0.templateSignals);
        }
        d1.u(f0, 1, d0.timeSinceLastAdLoad);
        if(d1.q(f0, 2) || d0.eventId != null) {
            d1.y(f0, 2, N0.a, d0.eventId);
        }
        if(d1.q(f0, 3) || d0.timeBetweenAdAvailabilityAndPlayAd != 0L) {
            d1.u(f0, 3, d0.timeBetweenAdAvailabilityAndPlayAd);
        }
        if(d1.q(f0, 4) || d0.screenOrientation != 0) {
            d1.n(f0, 4, d0.screenOrientation);
        }
    }
}

