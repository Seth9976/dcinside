package com.vungle.ads.internal.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.c0;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlin.ranges.s;
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
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.t;
import kotlinx.serialization.u;
import y4.l;
import z3.n;

@u
public final class h {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a h$a0 = new a();
            a.INSTANCE = h$a0;
            w0 w00 = new w0("com.vungle.ads.internal.model.ConfigPayload", h$a0, 19);
            w00.k("reuse_assets", true);
            w00.k("config", true);
            w00.k("endpoints", true);
            w00.k("log_metrics", true);
            w00.k("placements", true);
            w00.k("user", true);
            w00.k("viewability", true);
            w00.k("config_extension", true);
            w00.k("disable_ad_id", true);
            w00.k("ri_enabled", true);
            w00.k("session_timeout", true);
            w00.k("wait_for_connectivity_for_tpat", true);
            w00.k("sdk_session_timeout", true);
            w00.k("cacheable_assets_required", true);
            w00.k("signals_disabled", true);
            w00.k("fpd_enabled", true);
            w00.k("rta_debugging", true);
            w00.k("config_last_validated_ts", true);
            w00.k("auto_redirect", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            return new i[]{P3.a.u(com.vungle.ads.internal.model.h.c.a.INSTANCE), P3.a.u(com.vungle.ads.internal.model.h.e.a.INSTANCE), P3.a.u(com.vungle.ads.internal.model.h.f.a.INSTANCE), P3.a.u(com.vungle.ads.internal.model.h.i.a.INSTANCE), P3.a.u(new kotlinx.serialization.internal.f(com.vungle.ads.internal.model.m.a.INSTANCE)), P3.a.u(com.vungle.ads.internal.model.h.j.a.INSTANCE), P3.a.u(com.vungle.ads.internal.model.h.k.a.INSTANCE), P3.a.u(N0.a), P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(W.a), P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(W.a), P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(h0.a), P3.a.u(com.vungle.ads.internal.model.h.b.a.INSTANCE)};
        }

        @l
        public h deserialize(@l e e0) {
            Object object42;
            Object object23;
            Object object22;
            Object object21;
            Object object20;
            Object object19;
            int v;
            Object object18;
            Object object17;
            Object object16;
            Object object15;
            Object object14;
            Object object11;
            Object object10;
            Object object9;
            Object object8;
            Object object7;
            Object object6;
            Object object5;
            Object object2;
            Object object1;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            if(c0.k()) {
                Object object0 = c0.j(f0, 0, com.vungle.ads.internal.model.h.c.a.INSTANCE, null);
                object1 = c0.j(f0, 1, com.vungle.ads.internal.model.h.e.a.INSTANCE, null);
                object2 = c0.j(f0, 2, com.vungle.ads.internal.model.h.f.a.INSTANCE, null);
                Object object3 = c0.j(f0, 3, com.vungle.ads.internal.model.h.i.a.INSTANCE, null);
                Object object4 = c0.j(f0, 4, new kotlinx.serialization.internal.f(com.vungle.ads.internal.model.m.a.INSTANCE), null);
                object5 = c0.j(f0, 5, com.vungle.ads.internal.model.h.j.a.INSTANCE, null);
                object6 = c0.j(f0, 6, com.vungle.ads.internal.model.h.k.a.INSTANCE, null);
                object7 = c0.j(f0, 7, N0.a, null);
                object8 = c0.j(f0, 8, kotlinx.serialization.internal.i.a, null);
                object9 = c0.j(f0, 9, kotlinx.serialization.internal.i.a, null);
                object10 = c0.j(f0, 10, W.a, null);
                object11 = c0.j(f0, 11, kotlinx.serialization.internal.i.a, null);
                Object object12 = c0.j(f0, 12, W.a, null);
                Object object13 = c0.j(f0, 13, kotlinx.serialization.internal.i.a, null);
                object14 = object12;
                object15 = c0.j(f0, 14, kotlinx.serialization.internal.i.a, null);
                object16 = c0.j(f0, 15, kotlinx.serialization.internal.i.a, null);
                object17 = c0.j(f0, 16, kotlinx.serialization.internal.i.a, null);
                object18 = object13;
                v = 0x7FFFF;
                object19 = object4;
                object20 = c0.j(f0, 17, h0.a, null);
                object21 = object0;
                object22 = c0.j(f0, 18, com.vungle.ads.internal.model.h.b.a.INSTANCE, null);
                object23 = object3;
            }
            else {
                Object object24 = null;
                Object object25 = null;
                Object object26 = null;
                Object object27 = null;
                Object object28 = null;
                Object object29 = null;
                Object object30 = null;
                Object object31 = null;
                Object object32 = null;
                Object object33 = null;
                Object object34 = null;
                object19 = null;
                Object object35 = null;
                Object object36 = null;
                Object object37 = null;
                Object object38 = null;
                Object object39 = null;
                Object object40 = null;
                Object object41 = null;
                int v1 = 0;
                boolean z = true;
                while(z) {
                    int v2 = c0.w(f0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            continue;
                        }
                        case 0: {
                            object41 = c0.j(f0, 0, com.vungle.ads.internal.model.h.c.a.INSTANCE, object41);
                            v1 |= 1;
                            continue;
                        }
                        case 1: {
                            v1 |= 2;
                            object24 = c0.j(f0, 1, com.vungle.ads.internal.model.h.e.a.INSTANCE, object24);
                            continue;
                        }
                        case 2: {
                            object42 = object24;
                            object28 = c0.j(f0, 2, com.vungle.ads.internal.model.h.f.a.INSTANCE, object28);
                            v1 |= 4;
                            break;
                        }
                        case 3: {
                            object42 = object24;
                            object27 = c0.j(f0, 3, com.vungle.ads.internal.model.h.i.a.INSTANCE, object27);
                            v1 |= 8;
                            break;
                        }
                        case 4: {
                            object42 = object24;
                            object19 = c0.j(f0, 4, new kotlinx.serialization.internal.f(com.vungle.ads.internal.model.m.a.INSTANCE), object19);
                            v1 |= 16;
                            break;
                        }
                        case 5: {
                            object42 = object24;
                            object25 = c0.j(f0, 5, com.vungle.ads.internal.model.h.j.a.INSTANCE, object25);
                            v1 |= 0x20;
                            break;
                        }
                        case 6: {
                            object42 = object24;
                            object34 = c0.j(f0, 6, com.vungle.ads.internal.model.h.k.a.INSTANCE, object34);
                            v1 |= 0x40;
                            break;
                        }
                        case 7: {
                            object42 = object24;
                            object33 = c0.j(f0, 7, N0.a, object33);
                            v1 |= 0x80;
                            break;
                        }
                        case 8: {
                            object42 = object24;
                            object32 = c0.j(f0, 8, kotlinx.serialization.internal.i.a, object32);
                            v1 |= 0x100;
                            break;
                        }
                        case 9: {
                            object42 = object24;
                            object26 = c0.j(f0, 9, kotlinx.serialization.internal.i.a, object26);
                            v1 |= 0x200;
                            break;
                        }
                        case 10: {
                            object42 = object24;
                            object31 = c0.j(f0, 10, W.a, object31);
                            v1 |= 0x400;
                            break;
                        }
                        case 11: {
                            object42 = object24;
                            object30 = c0.j(f0, 11, kotlinx.serialization.internal.i.a, object30);
                            v1 |= 0x800;
                            break;
                        }
                        case 12: {
                            object42 = object24;
                            object35 = c0.j(f0, 12, W.a, object35);
                            v1 |= 0x1000;
                            break;
                        }
                        case 13: {
                            object42 = object24;
                            object36 = c0.j(f0, 13, kotlinx.serialization.internal.i.a, object36);
                            v1 |= 0x2000;
                            break;
                        }
                        case 14: {
                            object42 = object24;
                            object37 = c0.j(f0, 14, kotlinx.serialization.internal.i.a, object37);
                            v1 |= 0x4000;
                            break;
                        }
                        case 15: {
                            object42 = object24;
                            object38 = c0.j(f0, 15, kotlinx.serialization.internal.i.a, object38);
                            v1 |= 0x8000;
                            break;
                        }
                        case 16: {
                            object42 = object24;
                            object39 = c0.j(f0, 16, kotlinx.serialization.internal.i.a, object39);
                            v1 |= 0x10000;
                            break;
                        }
                        case 17: {
                            object42 = object24;
                            object40 = c0.j(f0, 17, h0.a, object40);
                            v1 |= 0x20000;
                            break;
                        }
                        case 18: {
                            object42 = object24;
                            object29 = c0.j(f0, 18, com.vungle.ads.internal.model.h.b.a.INSTANCE, object29);
                            v1 |= 0x40000;
                            break;
                        }
                        default: {
                            throw new E(v2);
                        }
                    }
                    object24 = object42;
                }
                object22 = object29;
                object18 = object36;
                object21 = object41;
                object23 = object27;
                object2 = object28;
                v = v1;
                object11 = object30;
                object10 = object31;
                object20 = object40;
                object17 = object39;
                object16 = object38;
                object15 = object37;
                object1 = object24;
                object9 = object26;
                object14 = object35;
                object8 = object32;
                object7 = object33;
                object6 = object34;
                object5 = object25;
            }
            c0.c(f0);
            return new h(v, ((com.vungle.ads.internal.model.h.c)object21), ((com.vungle.ads.internal.model.h.e)object1), ((com.vungle.ads.internal.model.h.f)object2), ((com.vungle.ads.internal.model.h.i)object23), ((List)object19), ((j)object5), ((com.vungle.ads.internal.model.h.k)object6), ((String)object7), ((Boolean)object8), ((Boolean)object9), ((Integer)object10), ((Boolean)object11), ((Integer)object14), ((Boolean)object18), ((Boolean)object15), ((Boolean)object16), ((Boolean)object17), ((Long)object20), ((b)object22), null);
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

        public void serialize(@l g g0, @l h h0) {
            L.p(g0, "encoder");
            L.p(h0, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            h.write$Self(h0, d0, f0);
            d0.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((h)object0));
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] typeParametersSerializers() {
            return kotlinx.serialization.internal.M.a.a(this);
        }
    }

    @u
    public static final class b {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.h.b.a implements M {
            @l
            public static final com.vungle.ads.internal.model.h.b.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.h.b.a h$b$a0 = new com.vungle.ads.internal.model.h.b.a();
                com.vungle.ads.internal.model.h.b.a.INSTANCE = h$b$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.ConfigPayload.AutoRedirect", h$b$a0, 2);
                w00.k("allow_auto_redirect", true);
                w00.k("after_click_ms", true);
                com.vungle.ads.internal.model.h.b.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(h0.a)};
            }

            @l
            public b deserialize(@l e e0) {
                int v;
                Object object1;
                Object object0;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                if(c0.k()) {
                    object0 = c0.j(f0, 0, kotlinx.serialization.internal.i.a, null);
                    object1 = c0.j(f0, 1, h0.a, null);
                    v = 3;
                }
                else {
                    object0 = null;
                    Object object2 = null;
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
                                object0 = c0.j(f0, 0, kotlinx.serialization.internal.i.a, object0);
                                v1 |= 1;
                                break;
                            }
                            case 1: {
                                object2 = c0.j(f0, 1, h0.a, object2);
                                v1 |= 2;
                                break;
                            }
                            default: {
                                throw new E(v2);
                            }
                        }
                    }
                    object1 = object2;
                    v = v1;
                }
                c0.c(f0);
                return new b(v, ((Boolean)object0), ((Long)object1), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.h.b.a.descriptor;
            }

            public void serialize(@l g g0, @l b h$b0) {
                L.p(g0, "encoder");
                L.p(h$b0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                b.write$Self(h$b0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((b)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.h.b.b {
            private com.vungle.ads.internal.model.h.b.b() {
            }

            public com.vungle.ads.internal.model.h.b.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.h.b.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.h.b.b Companion;
        @y4.m
        private final Long afterClickDuration;
        @y4.m
        private final Boolean allowAutoRedirect;

        static {
            b.Companion = new com.vungle.ads.internal.model.h.b.b(null);
        }

        public b() {
            this(null, null, 3, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public b(int v, @t("allow_auto_redirect") Boolean boolean0, @t("after_click_ms") Long long0, H0 h00) {
            if((v & 1) == 0) {
                boolean0 = Boolean.FALSE;
            }
            this.allowAutoRedirect = boolean0;
            if((v & 2) == 0) {
                this.afterClickDuration = 0x7FFFFFFFFFFFFFFFL;
                return;
            }
            this.afterClickDuration = long0;
        }

        public b(@y4.m Boolean boolean0, @y4.m Long long0) {
            this.allowAutoRedirect = boolean0;
            this.afterClickDuration = long0;
        }

        public b(Boolean boolean0, Long long0, int v, w w0) {
            if((v & 1) != 0) {
                boolean0 = Boolean.FALSE;
            }
            if((v & 2) != 0) {
                long0 = 0x7FFFFFFFFFFFFFFFL;
            }
            this(boolean0, long0);
        }

        @y4.m
        public final Boolean component1() {
            return this.allowAutoRedirect;
        }

        @y4.m
        public final Long component2() {
            return this.afterClickDuration;
        }

        @l
        public final b copy(@y4.m Boolean boolean0, @y4.m Long long0) {
            return new b(boolean0, long0);
        }

        public static b copy$default(b h$b0, Boolean boolean0, Long long0, int v, Object object0) {
            if((v & 1) != 0) {
                boolean0 = h$b0.allowAutoRedirect;
            }
            if((v & 2) != 0) {
                long0 = h$b0.afterClickDuration;
            }
            return h$b0.copy(boolean0, long0);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof b)) {
                return false;
            }
            return L.g(this.allowAutoRedirect, ((b)object0).allowAutoRedirect) ? L.g(this.afterClickDuration, ((b)object0).afterClickDuration) : false;
        }

        @y4.m
        public final Long getAfterClickDuration() {
            return this.afterClickDuration;
        }

        @t("after_click_ms")
        public static void getAfterClickDuration$annotations() {
        }

        @y4.m
        public final Boolean getAllowAutoRedirect() {
            return this.allowAutoRedirect;
        }

        @t("allow_auto_redirect")
        public static void getAllowAutoRedirect$annotations() {
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.allowAutoRedirect == null ? 0 : this.allowAutoRedirect.hashCode();
            Long long0 = this.afterClickDuration;
            if(long0 != null) {
                v = long0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "AutoRedirect(allowAutoRedirect=" + this.allowAutoRedirect + ", afterClickDuration=" + this.afterClickDuration + ')';
        }

        @n
        public static final void write$Self(@l b h$b0, @l d d0, @l f f0) {
            L.p(h$b0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || !L.g(h$b0.allowAutoRedirect, Boolean.FALSE)) {
                d0.y(f0, 0, kotlinx.serialization.internal.i.a, h$b0.allowAutoRedirect);
            }
            if(d0.q(f0, 1) || (h$b0.afterClickDuration == null || ((long)h$b0.afterClickDuration) != 0x7FFFFFFFFFFFFFFFL)) {
                d0.y(f0, 1, h0.a, h$b0.afterClickDuration);
            }
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.h.c {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.h.c.a implements M {
            @l
            public static final com.vungle.ads.internal.model.h.c.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.h.c.a h$c$a0 = new com.vungle.ads.internal.model.h.c.a();
                com.vungle.ads.internal.model.h.c.a.INSTANCE = h$c$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.ConfigPayload.CleverCache", h$c$a0, 3);
                w00.k("enabled", true);
                w00.k("disk_size", true);
                w00.k("disk_percentage", true);
                com.vungle.ads.internal.model.h.c.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(h0.a), P3.a.u(W.a)};
            }

            @l
            public com.vungle.ads.internal.model.h.c deserialize(@l e e0) {
                int v;
                Object object3;
                Object object2;
                Object object1;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                Object object0 = null;
                if(c0.k()) {
                    object1 = c0.j(f0, 0, kotlinx.serialization.internal.i.a, null);
                    object2 = c0.j(f0, 1, h0.a, null);
                    object3 = c0.j(f0, 2, W.a, null);
                    v = 7;
                }
                else {
                    Object object4 = null;
                    Object object5 = null;
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
                                object0 = c0.j(f0, 0, kotlinx.serialization.internal.i.a, object0);
                                v1 |= 1;
                                break;
                            }
                            case 1: {
                                object4 = c0.j(f0, 1, h0.a, object4);
                                v1 |= 2;
                                break;
                            }
                            case 2: {
                                object5 = c0.j(f0, 2, W.a, object5);
                                v1 |= 4;
                                break;
                            }
                            default: {
                                throw new E(v2);
                            }
                        }
                    }
                    object2 = object4;
                    object3 = object5;
                    v = v1;
                    object1 = object0;
                }
                c0.c(f0);
                return new com.vungle.ads.internal.model.h.c(v, ((Boolean)object1), ((Long)object2), ((Integer)object3), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.h.c.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.h.c h$c0) {
                L.p(g0, "encoder");
                L.p(h$c0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                com.vungle.ads.internal.model.h.c.write$Self(h$c0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.h.c)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.h.c.b {
            private com.vungle.ads.internal.model.h.c.b() {
            }

            public com.vungle.ads.internal.model.h.c.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.h.c.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.h.c.b Companion;
        @y4.m
        private final Integer diskPercentage;
        @y4.m
        private final Long diskSize;
        @y4.m
        private final Boolean enabled;

        static {
            com.vungle.ads.internal.model.h.c.Companion = new com.vungle.ads.internal.model.h.c.b(null);
        }

        public com.vungle.ads.internal.model.h.c() {
            this(null, null, null, 7, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.h.c(int v, @t("enabled") Boolean boolean0, @t("disk_size") Long long0, @t("disk_percentage") Integer integer0, H0 h00) {
            if((v & 1) == 0) {
                boolean0 = Boolean.FALSE;
            }
            this.enabled = boolean0;
            this.diskSize = (v & 2) == 0 ? 1000L : long0;
            if((v & 4) == 0) {
                this.diskPercentage = 3;
                return;
            }
            this.diskPercentage = integer0;
        }

        public com.vungle.ads.internal.model.h.c(@y4.m Boolean boolean0, @y4.m Long long0, @y4.m Integer integer0) {
            this.enabled = boolean0;
            this.diskSize = long0;
            this.diskPercentage = integer0;
        }

        public com.vungle.ads.internal.model.h.c(Boolean boolean0, Long long0, Integer integer0, int v, w w0) {
            if((v & 1) != 0) {
                boolean0 = Boolean.FALSE;
            }
            if((v & 2) != 0) {
                long0 = 1000L;
            }
            if((v & 4) != 0) {
                integer0 = 3;
            }
            this(boolean0, long0, integer0);
        }

        @y4.m
        public final Boolean component1() {
            return this.enabled;
        }

        @y4.m
        public final Long component2() {
            return this.diskSize;
        }

        @y4.m
        public final Integer component3() {
            return this.diskPercentage;
        }

        @l
        public final com.vungle.ads.internal.model.h.c copy(@y4.m Boolean boolean0, @y4.m Long long0, @y4.m Integer integer0) {
            return new com.vungle.ads.internal.model.h.c(boolean0, long0, integer0);
        }

        public static com.vungle.ads.internal.model.h.c copy$default(com.vungle.ads.internal.model.h.c h$c0, Boolean boolean0, Long long0, Integer integer0, int v, Object object0) {
            if((v & 1) != 0) {
                boolean0 = h$c0.enabled;
            }
            if((v & 2) != 0) {
                long0 = h$c0.diskSize;
            }
            if((v & 4) != 0) {
                integer0 = h$c0.diskPercentage;
            }
            return h$c0.copy(boolean0, long0, integer0);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.vungle.ads.internal.model.h.c)) {
                return false;
            }
            if(!L.g(this.enabled, ((com.vungle.ads.internal.model.h.c)object0).enabled)) {
                return false;
            }
            return L.g(this.diskSize, ((com.vungle.ads.internal.model.h.c)object0).diskSize) ? L.g(this.diskPercentage, ((com.vungle.ads.internal.model.h.c)object0).diskPercentage) : false;
        }

        @y4.m
        public final Integer getDiskPercentage() {
            return this.diskPercentage;
        }

        @t("disk_percentage")
        public static void getDiskPercentage$annotations() {
        }

        @y4.m
        public final Long getDiskSize() {
            return this.diskSize;
        }

        @t("disk_size")
        public static void getDiskSize$annotations() {
        }

        @y4.m
        public final Boolean getEnabled() {
            return this.enabled;
        }

        @t("enabled")
        public static void getEnabled$annotations() {
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.enabled == null ? 0 : this.enabled.hashCode();
            int v2 = this.diskSize == null ? 0 : this.diskSize.hashCode();
            Integer integer0 = this.diskPercentage;
            if(integer0 != null) {
                v = integer0.hashCode();
            }
            return (v1 * 0x1F + v2) * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "CleverCache(enabled=" + this.enabled + ", diskSize=" + this.diskSize + ", diskPercentage=" + this.diskPercentage + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.h.c h$c0, @l d d0, @l f f0) {
            L.p(h$c0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || !L.g(h$c0.enabled, Boolean.FALSE)) {
                d0.y(f0, 0, kotlinx.serialization.internal.i.a, h$c0.enabled);
            }
            if(d0.q(f0, 1) || (h$c0.diskSize == null || ((long)h$c0.diskSize) != 1000L)) {
                d0.y(f0, 1, h0.a, h$c0.diskSize);
            }
            if(d0.q(f0, 2) || (h$c0.diskPercentage == null || ((int)h$c0.diskPercentage) != 3)) {
                d0.y(f0, 2, W.a, h$c0.diskPercentage);
            }
        }
    }

    public static final class com.vungle.ads.internal.model.h.d {
        private com.vungle.ads.internal.model.h.d() {
        }

        public com.vungle.ads.internal.model.h.d(w w0) {
        }

        @l
        public final i serializer() {
            return a.INSTANCE;
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.h.e {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.h.e.a implements M {
            @l
            public static final com.vungle.ads.internal.model.h.e.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.h.e.a h$e$a0 = new com.vungle.ads.internal.model.h.e.a();
                com.vungle.ads.internal.model.h.e.a.INSTANCE = h$e$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.ConfigPayload.ConfigSettings", h$e$a0, 1);
                w00.k("refresh_interval", true);
                com.vungle.ads.internal.model.h.e.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(h0.a)};
            }

            @l
            public com.vungle.ads.internal.model.h.e deserialize(@l e e0) {
                Object object0;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                int v = 1;
                if(c0.k()) {
                    object0 = c0.j(f0, 0, h0.a, null);
                }
                else {
                    object0 = null;
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
                                object0 = c0.j(f0, 0, h0.a, object0);
                                v1 = 1;
                                break;
                            }
                            default: {
                                throw new E(v2);
                            }
                        }
                    }
                    v = v1;
                }
                c0.c(f0);
                return new com.vungle.ads.internal.model.h.e(v, ((Long)object0), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.h.e.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.h.e h$e0) {
                L.p(g0, "encoder");
                L.p(h$e0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                com.vungle.ads.internal.model.h.e.write$Self(h$e0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.h.e)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.h.e.b {
            private com.vungle.ads.internal.model.h.e.b() {
            }

            public com.vungle.ads.internal.model.h.e.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.h.e.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.h.e.b Companion;
        @y4.m
        private final Long refreshTime;

        static {
            com.vungle.ads.internal.model.h.e.Companion = new com.vungle.ads.internal.model.h.e.b(null);
        }

        public com.vungle.ads.internal.model.h.e() {
            this(null, 1, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.h.e(int v, @t("refresh_interval") Long long0, H0 h00) {
            if((v & 1) == 0) {
                this.refreshTime = null;
                return;
            }
            this.refreshTime = long0;
        }

        public com.vungle.ads.internal.model.h.e(@y4.m Long long0) {
            this.refreshTime = long0;
        }

        public com.vungle.ads.internal.model.h.e(Long long0, int v, w w0) {
            if((v & 1) != 0) {
                long0 = null;
            }
            this(long0);
        }

        @y4.m
        public final Long component1() {
            return this.refreshTime;
        }

        @l
        public final com.vungle.ads.internal.model.h.e copy(@y4.m Long long0) {
            return new com.vungle.ads.internal.model.h.e(long0);
        }

        public static com.vungle.ads.internal.model.h.e copy$default(com.vungle.ads.internal.model.h.e h$e0, Long long0, int v, Object object0) {
            if((v & 1) != 0) {
                long0 = h$e0.refreshTime;
            }
            return h$e0.copy(long0);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof com.vungle.ads.internal.model.h.e ? L.g(this.refreshTime, ((com.vungle.ads.internal.model.h.e)object0).refreshTime) : false;
        }

        @y4.m
        public final Long getRefreshTime() {
            return this.refreshTime;
        }

        @t("refresh_interval")
        public static void getRefreshTime$annotations() {
        }

        @Override
        public int hashCode() {
            return this.refreshTime == null ? 0 : this.refreshTime.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "ConfigSettings(refreshTime=" + this.refreshTime + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.h.e h$e0, @l d d0, @l f f0) {
            L.p(h$e0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || h$e0.refreshTime != null) {
                d0.y(f0, 0, h0.a, h$e0.refreshTime);
            }
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.h.f {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.h.f.a implements M {
            @l
            public static final com.vungle.ads.internal.model.h.f.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.h.f.a h$f$a0 = new com.vungle.ads.internal.model.h.f.a();
                com.vungle.ads.internal.model.h.f.a.INSTANCE = h$f$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.ConfigPayload.Endpoints", h$f$a0, 5);
                w00.k("ads", true);
                w00.k("ri", true);
                w00.k("error_logs", true);
                w00.k("metrics", true);
                w00.k("mraid_js", true);
                com.vungle.ads.internal.model.h.f.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(N0.a)};
            }

            @l
            public com.vungle.ads.internal.model.h.f deserialize(@l e e0) {
                int v;
                Object object6;
                Object object5;
                Object object4;
                Object object2;
                Object object1;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                Object object0 = null;
                if(c0.k()) {
                    object1 = c0.j(f0, 0, N0.a, null);
                    object2 = c0.j(f0, 1, N0.a, null);
                    Object object3 = c0.j(f0, 2, N0.a, null);
                    object4 = c0.j(f0, 3, N0.a, null);
                    object5 = c0.j(f0, 4, N0.a, null);
                    object6 = object3;
                    v = 0x1F;
                }
                else {
                    Object object7 = null;
                    object6 = null;
                    Object object8 = null;
                    Object object9 = null;
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
                                object0 = c0.j(f0, 0, N0.a, object0);
                                v1 |= 1;
                                break;
                            }
                            case 1: {
                                object7 = c0.j(f0, 1, N0.a, object7);
                                v1 |= 2;
                                break;
                            }
                            case 2: {
                                object6 = c0.j(f0, 2, N0.a, object6);
                                v1 |= 4;
                                break;
                            }
                            case 3: {
                                object8 = c0.j(f0, 3, N0.a, object8);
                                v1 |= 8;
                                break;
                            }
                            case 4: {
                                object9 = c0.j(f0, 4, N0.a, object9);
                                v1 |= 16;
                                break;
                            }
                            default: {
                                throw new E(v2);
                            }
                        }
                    }
                    v = v1;
                    object1 = object0;
                    object2 = object7;
                    object4 = object8;
                    object5 = object9;
                }
                c0.c(f0);
                return new com.vungle.ads.internal.model.h.f(v, ((String)object1), ((String)object2), ((String)object6), ((String)object4), ((String)object5), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.h.f.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.h.f h$f0) {
                L.p(g0, "encoder");
                L.p(h$f0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                com.vungle.ads.internal.model.h.f.write$Self(h$f0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.h.f)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.h.f.b {
            private com.vungle.ads.internal.model.h.f.b() {
            }

            public com.vungle.ads.internal.model.h.f.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.h.f.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.h.f.b Companion;
        @y4.m
        private final String adsEndpoint;
        @y4.m
        private final String errorLogsEndpoint;
        @y4.m
        private final String metricsEndpoint;
        @y4.m
        private final String mraidEndpoint;
        @y4.m
        private final String riEndpoint;

        static {
            com.vungle.ads.internal.model.h.f.Companion = new com.vungle.ads.internal.model.h.f.b(null);
        }

        public com.vungle.ads.internal.model.h.f() {
            this(null, null, null, null, null, 0x1F, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.h.f(int v, @t("ads") String s, @t("ri") String s1, @t("error_logs") String s2, @t("metrics") String s3, @t("mraid_js") String s4, H0 h00) {
            this.adsEndpoint = (v & 1) == 0 ? null : s;
            this.riEndpoint = (v & 2) == 0 ? null : s1;
            this.errorLogsEndpoint = (v & 4) == 0 ? null : s2;
            this.metricsEndpoint = (v & 8) == 0 ? null : s3;
            if((v & 16) == 0) {
                this.mraidEndpoint = null;
                return;
            }
            this.mraidEndpoint = s4;
        }

        public com.vungle.ads.internal.model.h.f(@y4.m String s, @y4.m String s1, @y4.m String s2, @y4.m String s3, @y4.m String s4) {
            this.adsEndpoint = s;
            this.riEndpoint = s1;
            this.errorLogsEndpoint = s2;
            this.metricsEndpoint = s3;
            this.mraidEndpoint = s4;
        }

        public com.vungle.ads.internal.model.h.f(String s, String s1, String s2, String s3, String s4, int v, w w0) {
            this(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? s3 : null), ((v & 16) == 0 ? s4 : null));
        }

        @y4.m
        public final String component1() {
            return this.adsEndpoint;
        }

        @y4.m
        public final String component2() {
            return this.riEndpoint;
        }

        @y4.m
        public final String component3() {
            return this.errorLogsEndpoint;
        }

        @y4.m
        public final String component4() {
            return this.metricsEndpoint;
        }

        @y4.m
        public final String component5() {
            return this.mraidEndpoint;
        }

        @l
        public final com.vungle.ads.internal.model.h.f copy(@y4.m String s, @y4.m String s1, @y4.m String s2, @y4.m String s3, @y4.m String s4) {
            return new com.vungle.ads.internal.model.h.f(s, s1, s2, s3, s4);
        }

        public static com.vungle.ads.internal.model.h.f copy$default(com.vungle.ads.internal.model.h.f h$f0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
            if((v & 1) != 0) {
                s = h$f0.adsEndpoint;
            }
            if((v & 2) != 0) {
                s1 = h$f0.riEndpoint;
            }
            if((v & 4) != 0) {
                s2 = h$f0.errorLogsEndpoint;
            }
            if((v & 8) != 0) {
                s3 = h$f0.metricsEndpoint;
            }
            if((v & 16) != 0) {
                s4 = h$f0.mraidEndpoint;
            }
            return h$f0.copy(s, s1, s2, s3, s4);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.vungle.ads.internal.model.h.f)) {
                return false;
            }
            if(!L.g(this.adsEndpoint, ((com.vungle.ads.internal.model.h.f)object0).adsEndpoint)) {
                return false;
            }
            if(!L.g(this.riEndpoint, ((com.vungle.ads.internal.model.h.f)object0).riEndpoint)) {
                return false;
            }
            if(!L.g(this.errorLogsEndpoint, ((com.vungle.ads.internal.model.h.f)object0).errorLogsEndpoint)) {
                return false;
            }
            return L.g(this.metricsEndpoint, ((com.vungle.ads.internal.model.h.f)object0).metricsEndpoint) ? L.g(this.mraidEndpoint, ((com.vungle.ads.internal.model.h.f)object0).mraidEndpoint) : false;
        }

        @y4.m
        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        @t("ads")
        public static void getAdsEndpoint$annotations() {
        }

        @y4.m
        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        @t("error_logs")
        public static void getErrorLogsEndpoint$annotations() {
        }

        @y4.m
        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        @t("metrics")
        public static void getMetricsEndpoint$annotations() {
        }

        @y4.m
        public final String getMraidEndpoint() {
            return this.mraidEndpoint;
        }

        @t("mraid_js")
        public static void getMraidEndpoint$annotations() {
        }

        @y4.m
        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        @t("ri")
        public static void getRiEndpoint$annotations() {
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.adsEndpoint == null ? 0 : this.adsEndpoint.hashCode();
            int v2 = this.riEndpoint == null ? 0 : this.riEndpoint.hashCode();
            int v3 = this.errorLogsEndpoint == null ? 0 : this.errorLogsEndpoint.hashCode();
            int v4 = this.metricsEndpoint == null ? 0 : this.metricsEndpoint.hashCode();
            String s = this.mraidEndpoint;
            if(s != null) {
                v = s.hashCode();
            }
            return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "Endpoints(adsEndpoint=" + this.adsEndpoint + ", riEndpoint=" + this.riEndpoint + ", errorLogsEndpoint=" + this.errorLogsEndpoint + ", metricsEndpoint=" + this.metricsEndpoint + ", mraidEndpoint=" + this.mraidEndpoint + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.h.f h$f0, @l d d0, @l f f0) {
            L.p(h$f0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || h$f0.adsEndpoint != null) {
                d0.y(f0, 0, N0.a, h$f0.adsEndpoint);
            }
            if(d0.q(f0, 1) || h$f0.riEndpoint != null) {
                d0.y(f0, 1, N0.a, h$f0.riEndpoint);
            }
            if(d0.q(f0, 2) || h$f0.errorLogsEndpoint != null) {
                d0.y(f0, 2, N0.a, h$f0.errorLogsEndpoint);
            }
            if(d0.q(f0, 3) || h$f0.metricsEndpoint != null) {
                d0.y(f0, 3, N0.a, h$f0.metricsEndpoint);
            }
            if(d0.q(f0, 4) || h$f0.mraidEndpoint != null) {
                d0.y(f0, 4, N0.a, h$f0.mraidEndpoint);
            }
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.h.g {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.h.g.a implements M {
            @l
            public static final com.vungle.ads.internal.model.h.g.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.h.g.a h$g$a0 = new com.vungle.ads.internal.model.h.g.a();
                com.vungle.ads.internal.model.h.g.a.INSTANCE = h$g$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", h$g$a0, 6);
                w00.k("is_country_data_protected", true);
                w00.k("consent_title", true);
                w00.k("consent_message", true);
                w00.k("consent_message_version", true);
                w00.k("button_accept", true);
                w00.k("button_deny", true);
                com.vungle.ads.internal.model.h.g.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(N0.a)};
            }

            @l
            public com.vungle.ads.internal.model.h.g deserialize(@l e e0) {
                int v;
                Object object6;
                Object object5;
                Object object4;
                Object object3;
                Object object2;
                Object object1;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                Object object0 = null;
                if(c0.k()) {
                    object1 = c0.j(f0, 0, kotlinx.serialization.internal.i.a, null);
                    object2 = c0.j(f0, 1, N0.a, null);
                    object3 = c0.j(f0, 2, N0.a, null);
                    object4 = c0.j(f0, 3, N0.a, null);
                    object5 = c0.j(f0, 4, N0.a, null);
                    object6 = c0.j(f0, 5, N0.a, null);
                    v = 0x3F;
                }
                else {
                    Object object7 = null;
                    Object object8 = null;
                    Object object9 = null;
                    Object object10 = null;
                    Object object11 = null;
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
                                object0 = c0.j(f0, 0, kotlinx.serialization.internal.i.a, object0);
                                v1 |= 1;
                                break;
                            }
                            case 1: {
                                object7 = c0.j(f0, 1, N0.a, object7);
                                v1 |= 2;
                                break;
                            }
                            case 2: {
                                object8 = c0.j(f0, 2, N0.a, object8);
                                v1 |= 4;
                                break;
                            }
                            case 3: {
                                object9 = c0.j(f0, 3, N0.a, object9);
                                v1 |= 8;
                                break;
                            }
                            case 4: {
                                object10 = c0.j(f0, 4, N0.a, object10);
                                v1 |= 16;
                                break;
                            }
                            case 5: {
                                object11 = c0.j(f0, 5, N0.a, object11);
                                v1 |= 0x20;
                                break;
                            }
                            default: {
                                throw new E(v2);
                            }
                        }
                    }
                    object2 = object7;
                    object3 = object8;
                    object4 = object9;
                    object5 = object10;
                    object6 = object11;
                    v = v1;
                    object1 = object0;
                }
                c0.c(f0);
                return new com.vungle.ads.internal.model.h.g(v, ((Boolean)object1), ((String)object2), ((String)object3), ((String)object4), ((String)object5), ((String)object6), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.h.g.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.h.g h$g0) {
                L.p(g0, "encoder");
                L.p(h$g0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                com.vungle.ads.internal.model.h.g.write$Self(h$g0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.h.g)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.h.g.b {
            private com.vungle.ads.internal.model.h.g.b() {
            }

            public com.vungle.ads.internal.model.h.g.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.h.g.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.h.g.b Companion;
        @y4.m
        private final String buttonAccept;
        @y4.m
        private final String buttonDeny;
        @y4.m
        private final String consentMessage;
        @y4.m
        private final String consentMessageVersion;
        @y4.m
        private final String consentTitle;
        @y4.m
        private final Boolean isCountryDataProtected;

        static {
            com.vungle.ads.internal.model.h.g.Companion = new com.vungle.ads.internal.model.h.g.b(null);
        }

        public com.vungle.ads.internal.model.h.g() {
            this(null, null, null, null, null, null, 0x3F, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.h.g(int v, @t("is_country_data_protected") Boolean boolean0, @t("consent_title") String s, @t("consent_message") String s1, @t("consent_message_version") String s2, @t("button_accept") String s3, @t("button_deny") String s4, H0 h00) {
            this.isCountryDataProtected = (v & 1) == 0 ? null : boolean0;
            this.consentTitle = (v & 2) == 0 ? null : s;
            this.consentMessage = (v & 4) == 0 ? null : s1;
            this.consentMessageVersion = (v & 8) == 0 ? null : s2;
            this.buttonAccept = (v & 16) == 0 ? null : s3;
            if((v & 0x20) == 0) {
                this.buttonDeny = null;
                return;
            }
            this.buttonDeny = s4;
        }

        public com.vungle.ads.internal.model.h.g(@y4.m Boolean boolean0, @y4.m String s, @y4.m String s1, @y4.m String s2, @y4.m String s3, @y4.m String s4) {
            this.isCountryDataProtected = boolean0;
            this.consentTitle = s;
            this.consentMessage = s1;
            this.consentMessageVersion = s2;
            this.buttonAccept = s3;
            this.buttonDeny = s4;
        }

        public com.vungle.ads.internal.model.h.g(Boolean boolean0, String s, String s1, String s2, String s3, String s4, int v, w w0) {
            this(((v & 1) == 0 ? boolean0 : null), ((v & 2) == 0 ? s : null), ((v & 4) == 0 ? s1 : null), ((v & 8) == 0 ? s2 : null), ((v & 16) == 0 ? s3 : null), ((v & 0x20) == 0 ? s4 : null));
        }

        @y4.m
        public final Boolean component1() {
            return this.isCountryDataProtected;
        }

        @y4.m
        public final String component2() {
            return this.consentTitle;
        }

        @y4.m
        public final String component3() {
            return this.consentMessage;
        }

        @y4.m
        public final String component4() {
            return this.consentMessageVersion;
        }

        @y4.m
        public final String component5() {
            return this.buttonAccept;
        }

        @y4.m
        public final String component6() {
            return this.buttonDeny;
        }

        @l
        public final com.vungle.ads.internal.model.h.g copy(@y4.m Boolean boolean0, @y4.m String s, @y4.m String s1, @y4.m String s2, @y4.m String s3, @y4.m String s4) {
            return new com.vungle.ads.internal.model.h.g(boolean0, s, s1, s2, s3, s4);
        }

        public static com.vungle.ads.internal.model.h.g copy$default(com.vungle.ads.internal.model.h.g h$g0, Boolean boolean0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
            if((v & 1) != 0) {
                boolean0 = h$g0.isCountryDataProtected;
            }
            if((v & 2) != 0) {
                s = h$g0.consentTitle;
            }
            if((v & 4) != 0) {
                s1 = h$g0.consentMessage;
            }
            if((v & 8) != 0) {
                s2 = h$g0.consentMessageVersion;
            }
            if((v & 16) != 0) {
                s3 = h$g0.buttonAccept;
            }
            if((v & 0x20) != 0) {
                s4 = h$g0.buttonDeny;
            }
            return h$g0.copy(boolean0, s, s1, s2, s3, s4);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.vungle.ads.internal.model.h.g)) {
                return false;
            }
            if(!L.g(this.isCountryDataProtected, ((com.vungle.ads.internal.model.h.g)object0).isCountryDataProtected)) {
                return false;
            }
            if(!L.g(this.consentTitle, ((com.vungle.ads.internal.model.h.g)object0).consentTitle)) {
                return false;
            }
            if(!L.g(this.consentMessage, ((com.vungle.ads.internal.model.h.g)object0).consentMessage)) {
                return false;
            }
            if(!L.g(this.consentMessageVersion, ((com.vungle.ads.internal.model.h.g)object0).consentMessageVersion)) {
                return false;
            }
            return L.g(this.buttonAccept, ((com.vungle.ads.internal.model.h.g)object0).buttonAccept) ? L.g(this.buttonDeny, ((com.vungle.ads.internal.model.h.g)object0).buttonDeny) : false;
        }

        @y4.m
        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        @t("button_accept")
        public static void getButtonAccept$annotations() {
        }

        @y4.m
        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        @t("button_deny")
        public static void getButtonDeny$annotations() {
        }

        @y4.m
        public final String getConsentMessage() {
            return this.consentMessage;
        }

        @t("consent_message")
        public static void getConsentMessage$annotations() {
        }

        @y4.m
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        @t("consent_message_version")
        public static void getConsentMessageVersion$annotations() {
        }

        @y4.m
        public final String getConsentTitle() {
            return this.consentTitle;
        }

        @t("consent_title")
        public static void getConsentTitle$annotations() {
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.isCountryDataProtected == null ? 0 : this.isCountryDataProtected.hashCode();
            int v2 = this.consentTitle == null ? 0 : this.consentTitle.hashCode();
            int v3 = this.consentMessage == null ? 0 : this.consentMessage.hashCode();
            int v4 = this.consentMessageVersion == null ? 0 : this.consentMessageVersion.hashCode();
            int v5 = this.buttonAccept == null ? 0 : this.buttonAccept.hashCode();
            String s = this.buttonDeny;
            if(s != null) {
                v = s.hashCode();
            }
            return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
        }

        @y4.m
        public final Boolean isCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        @t("is_country_data_protected")
        public static void isCountryDataProtected$annotations() {
        }

        @Override
        @l
        public String toString() {
            return "GDPRSettings(isCountryDataProtected=" + this.isCountryDataProtected + ", consentTitle=" + this.consentTitle + ", consentMessage=" + this.consentMessage + ", consentMessageVersion=" + this.consentMessageVersion + ", buttonAccept=" + this.buttonAccept + ", buttonDeny=" + this.buttonDeny + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.h.g h$g0, @l d d0, @l f f0) {
            L.p(h$g0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || h$g0.isCountryDataProtected != null) {
                d0.y(f0, 0, kotlinx.serialization.internal.i.a, h$g0.isCountryDataProtected);
            }
            if(d0.q(f0, 1) || h$g0.consentTitle != null) {
                d0.y(f0, 1, N0.a, h$g0.consentTitle);
            }
            if(d0.q(f0, 2) || h$g0.consentMessage != null) {
                d0.y(f0, 2, N0.a, h$g0.consentMessage);
            }
            if(d0.q(f0, 3) || h$g0.consentMessageVersion != null) {
                d0.y(f0, 3, N0.a, h$g0.consentMessageVersion);
            }
            if(d0.q(f0, 4) || h$g0.buttonAccept != null) {
                d0.y(f0, 4, N0.a, h$g0.buttonAccept);
            }
            if(d0.q(f0, 5) || h$g0.buttonDeny != null) {
                d0.y(f0, 5, N0.a, h$g0.buttonDeny);
            }
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.h.h {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.h.h.a implements M {
            @l
            public static final com.vungle.ads.internal.model.h.h.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.h.h.a h$h$a0 = new com.vungle.ads.internal.model.h.h.a();
                com.vungle.ads.internal.model.h.h.a.INSTANCE = h$h$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.ConfigPayload.IABSettings", h$h$a0, 1);
                w00.k("tcf_status", true);
                com.vungle.ads.internal.model.h.h.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(W.a)};
            }

            @l
            public com.vungle.ads.internal.model.h.h deserialize(@l e e0) {
                Object object0;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                int v = 1;
                if(c0.k()) {
                    object0 = c0.j(f0, 0, W.a, null);
                }
                else {
                    object0 = null;
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
                                object0 = c0.j(f0, 0, W.a, object0);
                                v1 = 1;
                                break;
                            }
                            default: {
                                throw new E(v2);
                            }
                        }
                    }
                    v = v1;
                }
                c0.c(f0);
                return new com.vungle.ads.internal.model.h.h(v, ((Integer)object0), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.h.h.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.h.h h$h0) {
                L.p(g0, "encoder");
                L.p(h$h0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                com.vungle.ads.internal.model.h.h.write$Self(h$h0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.h.h)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.h.h.b {
            private com.vungle.ads.internal.model.h.h.b() {
            }

            public com.vungle.ads.internal.model.h.h.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.h.h.a.INSTANCE;
            }
        }

        public static enum com.vungle.ads.internal.model.h.h.c {
            public static final class com.vungle.ads.internal.model.h.h.c.a {
                private com.vungle.ads.internal.model.h.h.c.a() {
                }

                public com.vungle.ads.internal.model.h.h.c.a(w w0) {
                }

                @y4.m
                public final com.vungle.ads.internal.model.h.h.c fromRawValue(@y4.m Integer integer0) {
                    return (com.vungle.ads.internal.model.h.h.c)com.vungle.ads.internal.model.h.h.c.rawValueMap.get(integer0);
                }
            }

            ALLOW_ID(0),
            DISABLE_ID(1),
            LEGACY(2);

            @l
            public static final com.vungle.ads.internal.model.h.h.c.a Companion;
            private final int rawValue;
            @l
            private static final Map rawValueMap;

            private static final com.vungle.ads.internal.model.h.h.c[] $values() [...] // Inlined contents

            static {
                com.vungle.ads.internal.model.h.h.c.Companion = new com.vungle.ads.internal.model.h.h.c.a(null);
                com.vungle.ads.internal.model.h.h.c[] arr_h$h$c = (com.vungle.ads.internal.model.h.h.c[])com.vungle.ads.internal.model.h.h.c.$VALUES.clone();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(s.u(Y.j(arr_h$h$c.length), 16));
                for(int v = 0; v < arr_h$h$c.length; ++v) {
                    com.vungle.ads.internal.model.h.h.c h$h$c0 = arr_h$h$c[v];
                    linkedHashMap0.put(h$h$c0.rawValue, h$h$c0);
                }
                com.vungle.ads.internal.model.h.h.c.rawValueMap = linkedHashMap0;
            }

            private com.vungle.ads.internal.model.h.h.c(int v1) {
                this.rawValue = v1;
            }

            public final int getRawValue() {
                return this.rawValue;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.h.h.b Companion;
        @y4.m
        private final Integer tcfStatus;

        static {
            com.vungle.ads.internal.model.h.h.Companion = new com.vungle.ads.internal.model.h.h.b(null);
        }

        public com.vungle.ads.internal.model.h.h() {
            this(null, 1, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.h.h(int v, @t("tcf_status") Integer integer0, H0 h00) {
            if((v & 1) == 0) {
                this.tcfStatus = null;
                return;
            }
            this.tcfStatus = integer0;
        }

        public com.vungle.ads.internal.model.h.h(@y4.m Integer integer0) {
            this.tcfStatus = integer0;
        }

        public com.vungle.ads.internal.model.h.h(Integer integer0, int v, w w0) {
            if((v & 1) != 0) {
                integer0 = null;
            }
            this(integer0);
        }

        @y4.m
        public final Integer component1() {
            return this.tcfStatus;
        }

        @l
        public final com.vungle.ads.internal.model.h.h copy(@y4.m Integer integer0) {
            return new com.vungle.ads.internal.model.h.h(integer0);
        }

        public static com.vungle.ads.internal.model.h.h copy$default(com.vungle.ads.internal.model.h.h h$h0, Integer integer0, int v, Object object0) {
            if((v & 1) != 0) {
                integer0 = h$h0.tcfStatus;
            }
            return h$h0.copy(integer0);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof com.vungle.ads.internal.model.h.h ? L.g(this.tcfStatus, ((com.vungle.ads.internal.model.h.h)object0).tcfStatus) : false;
        }

        @y4.m
        public final Integer getTcfStatus() {
            return this.tcfStatus;
        }

        @t("tcf_status")
        public static void getTcfStatus$annotations() {
        }

        @Override
        public int hashCode() {
            return this.tcfStatus == null ? 0 : this.tcfStatus.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "IABSettings(tcfStatus=" + this.tcfStatus + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.h.h h$h0, @l d d0, @l f f0) {
            L.p(h$h0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || h$h0.tcfStatus != null) {
                d0.y(f0, 0, W.a, h$h0.tcfStatus);
            }
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.h.i {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.h.i.a implements M {
            @l
            public static final com.vungle.ads.internal.model.h.i.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.h.i.a h$i$a0 = new com.vungle.ads.internal.model.h.i.a();
                com.vungle.ads.internal.model.h.i.a.INSTANCE = h$i$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.ConfigPayload.LogMetricsSettings", h$i$a0, 2);
                w00.k("error_log_level", true);
                w00.k("metrics_is_enabled", true);
                com.vungle.ads.internal.model.h.i.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(W.a), P3.a.u(kotlinx.serialization.internal.i.a)};
            }

            @l
            public com.vungle.ads.internal.model.h.i deserialize(@l e e0) {
                int v;
                Object object1;
                Object object0;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                if(c0.k()) {
                    object0 = c0.j(f0, 0, W.a, null);
                    object1 = c0.j(f0, 1, kotlinx.serialization.internal.i.a, null);
                    v = 3;
                }
                else {
                    object0 = null;
                    Object object2 = null;
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
                                object0 = c0.j(f0, 0, W.a, object0);
                                v1 |= 1;
                                break;
                            }
                            case 1: {
                                object2 = c0.j(f0, 1, kotlinx.serialization.internal.i.a, object2);
                                v1 |= 2;
                                break;
                            }
                            default: {
                                throw new E(v2);
                            }
                        }
                    }
                    object1 = object2;
                    v = v1;
                }
                c0.c(f0);
                return new com.vungle.ads.internal.model.h.i(v, ((Integer)object0), ((Boolean)object1), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.h.i.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.h.i h$i0) {
                L.p(g0, "encoder");
                L.p(h$i0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                com.vungle.ads.internal.model.h.i.write$Self(h$i0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.h.i)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.h.i.b {
            private com.vungle.ads.internal.model.h.i.b() {
            }

            public com.vungle.ads.internal.model.h.i.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.h.i.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.h.i.b Companion;
        @y4.m
        private final Integer errorLogLevel;
        @y4.m
        private final Boolean metricsEnabled;

        static {
            com.vungle.ads.internal.model.h.i.Companion = new com.vungle.ads.internal.model.h.i.b(null);
        }

        public com.vungle.ads.internal.model.h.i() {
            this(null, null, 3, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.h.i(int v, @t("error_log_level") Integer integer0, @t("metrics_is_enabled") Boolean boolean0, H0 h00) {
            this.errorLogLevel = (v & 1) == 0 ? null : integer0;
            if((v & 2) == 0) {
                this.metricsEnabled = null;
                return;
            }
            this.metricsEnabled = boolean0;
        }

        public com.vungle.ads.internal.model.h.i(@y4.m Integer integer0, @y4.m Boolean boolean0) {
            this.errorLogLevel = integer0;
            this.metricsEnabled = boolean0;
        }

        public com.vungle.ads.internal.model.h.i(Integer integer0, Boolean boolean0, int v, w w0) {
            if((v & 1) != 0) {
                integer0 = null;
            }
            if((v & 2) != 0) {
                boolean0 = null;
            }
            this(integer0, boolean0);
        }

        @y4.m
        public final Integer component1() {
            return this.errorLogLevel;
        }

        @y4.m
        public final Boolean component2() {
            return this.metricsEnabled;
        }

        @l
        public final com.vungle.ads.internal.model.h.i copy(@y4.m Integer integer0, @y4.m Boolean boolean0) {
            return new com.vungle.ads.internal.model.h.i(integer0, boolean0);
        }

        public static com.vungle.ads.internal.model.h.i copy$default(com.vungle.ads.internal.model.h.i h$i0, Integer integer0, Boolean boolean0, int v, Object object0) {
            if((v & 1) != 0) {
                integer0 = h$i0.errorLogLevel;
            }
            if((v & 2) != 0) {
                boolean0 = h$i0.metricsEnabled;
            }
            return h$i0.copy(integer0, boolean0);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.vungle.ads.internal.model.h.i)) {
                return false;
            }
            return L.g(this.errorLogLevel, ((com.vungle.ads.internal.model.h.i)object0).errorLogLevel) ? L.g(this.metricsEnabled, ((com.vungle.ads.internal.model.h.i)object0).metricsEnabled) : false;
        }

        @y4.m
        public final Integer getErrorLogLevel() {
            return this.errorLogLevel;
        }

        @t("error_log_level")
        public static void getErrorLogLevel$annotations() {
        }

        @y4.m
        public final Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        @t("metrics_is_enabled")
        public static void getMetricsEnabled$annotations() {
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.errorLogLevel == null ? 0 : this.errorLogLevel.hashCode();
            Boolean boolean0 = this.metricsEnabled;
            if(boolean0 != null) {
                v = boolean0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "LogMetricsSettings(errorLogLevel=" + this.errorLogLevel + ", metricsEnabled=" + this.metricsEnabled + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.h.i h$i0, @l d d0, @l f f0) {
            L.p(h$i0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || h$i0.errorLogLevel != null) {
                d0.y(f0, 0, W.a, h$i0.errorLogLevel);
            }
            if(d0.q(f0, 1) || h$i0.metricsEnabled != null) {
                d0.y(f0, 1, kotlinx.serialization.internal.i.a, h$i0.metricsEnabled);
            }
        }
    }

    @u
    public static final class j {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.h.j.a implements M {
            @l
            public static final com.vungle.ads.internal.model.h.j.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.h.j.a h$j$a0 = new com.vungle.ads.internal.model.h.j.a();
                com.vungle.ads.internal.model.h.j.a.INSTANCE = h$j$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.ConfigPayload.UserPrivacy", h$j$a0, 2);
                w00.k("gdpr", true);
                w00.k("iab", true);
                com.vungle.ads.internal.model.h.j.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(com.vungle.ads.internal.model.h.g.a.INSTANCE), P3.a.u(com.vungle.ads.internal.model.h.h.a.INSTANCE)};
            }

            @l
            public j deserialize(@l e e0) {
                int v;
                Object object1;
                Object object0;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                if(c0.k()) {
                    object0 = c0.j(f0, 0, com.vungle.ads.internal.model.h.g.a.INSTANCE, null);
                    object1 = c0.j(f0, 1, com.vungle.ads.internal.model.h.h.a.INSTANCE, null);
                    v = 3;
                }
                else {
                    object0 = null;
                    Object object2 = null;
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
                                object0 = c0.j(f0, 0, com.vungle.ads.internal.model.h.g.a.INSTANCE, object0);
                                v1 |= 1;
                                break;
                            }
                            case 1: {
                                object2 = c0.j(f0, 1, com.vungle.ads.internal.model.h.h.a.INSTANCE, object2);
                                v1 |= 2;
                                break;
                            }
                            default: {
                                throw new E(v2);
                            }
                        }
                    }
                    object1 = object2;
                    v = v1;
                }
                c0.c(f0);
                return new j(v, ((com.vungle.ads.internal.model.h.g)object0), ((com.vungle.ads.internal.model.h.h)object1), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.h.j.a.descriptor;
            }

            public void serialize(@l g g0, @l j h$j0) {
                L.p(g0, "encoder");
                L.p(h$j0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                j.write$Self(h$j0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((j)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.h.j.b {
            private com.vungle.ads.internal.model.h.j.b() {
            }

            public com.vungle.ads.internal.model.h.j.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.h.j.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.h.j.b Companion;
        @y4.m
        private final com.vungle.ads.internal.model.h.g gdpr;
        @y4.m
        private final com.vungle.ads.internal.model.h.h iab;

        static {
            j.Companion = new com.vungle.ads.internal.model.h.j.b(null);
        }

        public j() {
            this(null, null, 3, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public j(int v, @t("gdpr") com.vungle.ads.internal.model.h.g h$g0, @t("iab") com.vungle.ads.internal.model.h.h h$h0, H0 h00) {
            this.gdpr = (v & 1) == 0 ? null : h$g0;
            if((v & 2) == 0) {
                this.iab = null;
                return;
            }
            this.iab = h$h0;
        }

        public j(@y4.m com.vungle.ads.internal.model.h.g h$g0, @y4.m com.vungle.ads.internal.model.h.h h$h0) {
            this.gdpr = h$g0;
            this.iab = h$h0;
        }

        public j(com.vungle.ads.internal.model.h.g h$g0, com.vungle.ads.internal.model.h.h h$h0, int v, w w0) {
            if((v & 1) != 0) {
                h$g0 = null;
            }
            if((v & 2) != 0) {
                h$h0 = null;
            }
            this(h$g0, h$h0);
        }

        @y4.m
        public final com.vungle.ads.internal.model.h.g component1() {
            return this.gdpr;
        }

        @y4.m
        public final com.vungle.ads.internal.model.h.h component2() {
            return this.iab;
        }

        @l
        public final j copy(@y4.m com.vungle.ads.internal.model.h.g h$g0, @y4.m com.vungle.ads.internal.model.h.h h$h0) {
            return new j(h$g0, h$h0);
        }

        public static j copy$default(j h$j0, com.vungle.ads.internal.model.h.g h$g0, com.vungle.ads.internal.model.h.h h$h0, int v, Object object0) {
            if((v & 1) != 0) {
                h$g0 = h$j0.gdpr;
            }
            if((v & 2) != 0) {
                h$h0 = h$j0.iab;
            }
            return h$j0.copy(h$g0, h$h0);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof j)) {
                return false;
            }
            return L.g(this.gdpr, ((j)object0).gdpr) ? L.g(this.iab, ((j)object0).iab) : false;
        }

        @y4.m
        public final com.vungle.ads.internal.model.h.g getGdpr() {
            return this.gdpr;
        }

        @t("gdpr")
        public static void getGdpr$annotations() {
        }

        @y4.m
        public final com.vungle.ads.internal.model.h.h getIab() {
            return this.iab;
        }

        @t("iab")
        public static void getIab$annotations() {
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.gdpr == null ? 0 : this.gdpr.hashCode();
            com.vungle.ads.internal.model.h.h h$h0 = this.iab;
            if(h$h0 != null) {
                v = h$h0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "UserPrivacy(gdpr=" + this.gdpr + ", iab=" + this.iab + ')';
        }

        @n
        public static final void write$Self(@l j h$j0, @l d d0, @l f f0) {
            L.p(h$j0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || h$j0.gdpr != null) {
                d0.y(f0, 0, com.vungle.ads.internal.model.h.g.a.INSTANCE, h$j0.gdpr);
            }
            if(d0.q(f0, 1) || h$j0.iab != null) {
                d0.y(f0, 1, com.vungle.ads.internal.model.h.h.a.INSTANCE, h$j0.iab);
            }
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.h.k {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.h.k.a implements M {
            @l
            public static final com.vungle.ads.internal.model.h.k.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.h.k.a h$k$a0 = new com.vungle.ads.internal.model.h.k.a();
                com.vungle.ads.internal.model.h.k.a.INSTANCE = h$k$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.ConfigPayload.ViewAbilitySettings", h$k$a0, 1);
                w00.k("om", true);
                com.vungle.ads.internal.model.h.k.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(kotlinx.serialization.internal.i.a)};
            }

            @l
            public com.vungle.ads.internal.model.h.k deserialize(@l e e0) {
                Object object0;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                int v = 1;
                if(c0.k()) {
                    object0 = c0.j(f0, 0, kotlinx.serialization.internal.i.a, null);
                }
                else {
                    object0 = null;
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
                                object0 = c0.j(f0, 0, kotlinx.serialization.internal.i.a, object0);
                                v1 = 1;
                                break;
                            }
                            default: {
                                throw new E(v2);
                            }
                        }
                    }
                    v = v1;
                }
                c0.c(f0);
                return new com.vungle.ads.internal.model.h.k(v, ((Boolean)object0), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.h.k.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.h.k h$k0) {
                L.p(g0, "encoder");
                L.p(h$k0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                com.vungle.ads.internal.model.h.k.write$Self(h$k0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.h.k)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.h.k.b {
            private com.vungle.ads.internal.model.h.k.b() {
            }

            public com.vungle.ads.internal.model.h.k.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.h.k.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.h.k.b Companion;
        @y4.m
        private final Boolean om;

        static {
            com.vungle.ads.internal.model.h.k.Companion = new com.vungle.ads.internal.model.h.k.b(null);
        }

        public com.vungle.ads.internal.model.h.k() {
            this(null, 1, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.h.k(int v, @t("om") Boolean boolean0, H0 h00) {
            if((v & 1) == 0) {
                this.om = null;
                return;
            }
            this.om = boolean0;
        }

        public com.vungle.ads.internal.model.h.k(@y4.m Boolean boolean0) {
            this.om = boolean0;
        }

        public com.vungle.ads.internal.model.h.k(Boolean boolean0, int v, w w0) {
            if((v & 1) != 0) {
                boolean0 = null;
            }
            this(boolean0);
        }

        @y4.m
        public final Boolean component1() {
            return this.om;
        }

        @l
        public final com.vungle.ads.internal.model.h.k copy(@y4.m Boolean boolean0) {
            return new com.vungle.ads.internal.model.h.k(boolean0);
        }

        public static com.vungle.ads.internal.model.h.k copy$default(com.vungle.ads.internal.model.h.k h$k0, Boolean boolean0, int v, Object object0) {
            if((v & 1) != 0) {
                boolean0 = h$k0.om;
            }
            return h$k0.copy(boolean0);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof com.vungle.ads.internal.model.h.k ? L.g(this.om, ((com.vungle.ads.internal.model.h.k)object0).om) : false;
        }

        @y4.m
        public final Boolean getOm() {
            return this.om;
        }

        @t("om")
        public static void getOm$annotations() {
        }

        @Override
        public int hashCode() {
            return this.om == null ? 0 : this.om.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "ViewAbilitySettings(om=" + this.om + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.h.k h$k0, @l d d0, @l f f0) {
            L.p(h$k0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || h$k0.om != null) {
                d0.y(f0, 0, kotlinx.serialization.internal.i.a, h$k0.om);
            }
        }
    }

    @l
    public static final com.vungle.ads.internal.model.h.d Companion;
    @y4.m
    private b autoRedirect;
    @y4.m
    private final com.vungle.ads.internal.model.h.c cleverCache;
    @y4.m
    private final String configExtension;
    @y4.m
    private Long configLastValidatedTimestamp;
    @y4.m
    private final com.vungle.ads.internal.model.h.e configSettings;
    @y4.m
    private final Boolean disableAdId;
    @y4.m
    private final com.vungle.ads.internal.model.h.f endpoints;
    @y4.m
    private final Boolean fpdEnabled;
    @y4.m
    private final Boolean isCacheableAssetsRequired;
    @y4.m
    private final Boolean isReportIncentivizedEnabled;
    @y4.m
    private final com.vungle.ads.internal.model.h.i logMetricsSettings;
    @y4.m
    private final List placements;
    @y4.m
    private final Boolean rtaDebugging;
    @y4.m
    private final Integer sessionTimeout;
    @y4.m
    private final Integer signalSessionTimeout;
    @y4.m
    private final Boolean signalsDisabled;
    @y4.m
    private final j userPrivacy;
    @y4.m
    private final com.vungle.ads.internal.model.h.k viewAbility;
    @y4.m
    private final Boolean waitForConnectivityForTPAT;

    static {
        h.Companion = new com.vungle.ads.internal.model.h.d(null);
    }

    public h() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x7FFFF, null);
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public h(int v, @t("reuse_assets") com.vungle.ads.internal.model.h.c h$c0, @t("config") com.vungle.ads.internal.model.h.e h$e0, @t("endpoints") com.vungle.ads.internal.model.h.f h$f0, @t("log_metrics") com.vungle.ads.internal.model.h.i h$i0, @t("placements") List list0, @t("user") j h$j0, @t("viewability") com.vungle.ads.internal.model.h.k h$k0, @t("config_extension") String s, @t("disable_ad_id") Boolean boolean0, @t("ri_enabled") Boolean boolean1, @t("session_timeout") Integer integer0, @t("wait_for_connectivity_for_tpat") Boolean boolean2, @t("sdk_session_timeout") Integer integer1, @t("cacheable_assets_required") Boolean boolean3, @t("signals_disabled") Boolean boolean4, @t("fpd_enabled") Boolean boolean5, @t("rta_debugging") Boolean boolean6, @t("config_last_validated_ts") Long long0, @t("auto_redirect") b h$b0, H0 h00) {
        this.cleverCache = (v & 1) == 0 ? null : h$c0;
        this.configSettings = (v & 2) == 0 ? null : h$e0;
        this.endpoints = (v & 4) == 0 ? null : h$f0;
        this.logMetricsSettings = (v & 8) == 0 ? null : h$i0;
        this.placements = (v & 16) == 0 ? null : list0;
        this.userPrivacy = (v & 0x20) == 0 ? null : h$j0;
        this.viewAbility = (v & 0x40) == 0 ? null : h$k0;
        this.configExtension = (v & 0x80) == 0 ? null : s;
        this.disableAdId = (v & 0x100) == 0 ? Boolean.TRUE : boolean0;
        this.isReportIncentivizedEnabled = (v & 0x200) == 0 ? null : boolean1;
        this.sessionTimeout = (v & 0x400) == 0 ? null : integer0;
        this.waitForConnectivityForTPAT = (v & 0x800) == 0 ? null : boolean2;
        this.signalSessionTimeout = (v & 0x1000) == 0 ? null : integer1;
        this.isCacheableAssetsRequired = (v & 0x2000) == 0 ? null : boolean3;
        this.signalsDisabled = (v & 0x4000) == 0 ? null : boolean4;
        this.fpdEnabled = (0x8000 & v) == 0 ? null : boolean5;
        this.rtaDebugging = (0x10000 & v) == 0 ? null : boolean6;
        this.configLastValidatedTimestamp = (0x20000 & v) == 0 ? null : long0;
        if((v & 0x40000) == 0) {
            this.autoRedirect = null;
            return;
        }
        this.autoRedirect = h$b0;
    }

    public h(@y4.m com.vungle.ads.internal.model.h.c h$c0, @y4.m com.vungle.ads.internal.model.h.e h$e0, @y4.m com.vungle.ads.internal.model.h.f h$f0, @y4.m com.vungle.ads.internal.model.h.i h$i0, @y4.m List list0, @y4.m j h$j0, @y4.m com.vungle.ads.internal.model.h.k h$k0, @y4.m String s, @y4.m Boolean boolean0, @y4.m Boolean boolean1, @y4.m Integer integer0, @y4.m Boolean boolean2, @y4.m Integer integer1, @y4.m Boolean boolean3, @y4.m Boolean boolean4, @y4.m Boolean boolean5, @y4.m Boolean boolean6, @y4.m Long long0, @y4.m b h$b0) {
        this.cleverCache = h$c0;
        this.configSettings = h$e0;
        this.endpoints = h$f0;
        this.logMetricsSettings = h$i0;
        this.placements = list0;
        this.userPrivacy = h$j0;
        this.viewAbility = h$k0;
        this.configExtension = s;
        this.disableAdId = boolean0;
        this.isReportIncentivizedEnabled = boolean1;
        this.sessionTimeout = integer0;
        this.waitForConnectivityForTPAT = boolean2;
        this.signalSessionTimeout = integer1;
        this.isCacheableAssetsRequired = boolean3;
        this.signalsDisabled = boolean4;
        this.fpdEnabled = boolean5;
        this.rtaDebugging = boolean6;
        this.configLastValidatedTimestamp = long0;
        this.autoRedirect = h$b0;
    }

    public h(com.vungle.ads.internal.model.h.c h$c0, com.vungle.ads.internal.model.h.e h$e0, com.vungle.ads.internal.model.h.f h$f0, com.vungle.ads.internal.model.h.i h$i0, List list0, j h$j0, com.vungle.ads.internal.model.h.k h$k0, String s, Boolean boolean0, Boolean boolean1, Integer integer0, Boolean boolean2, Integer integer1, Boolean boolean3, Boolean boolean4, Boolean boolean5, Boolean boolean6, Long long0, b h$b0, int v, w w0) {
        this(((v & 1) == 0 ? h$c0 : null), ((v & 2) == 0 ? h$e0 : null), ((v & 4) == 0 ? h$f0 : null), ((v & 8) == 0 ? h$i0 : null), ((v & 16) == 0 ? list0 : null), ((v & 0x20) == 0 ? h$j0 : null), ((v & 0x40) == 0 ? h$k0 : null), ((v & 0x80) == 0 ? s : null), ((v & 0x100) == 0 ? boolean0 : Boolean.TRUE), ((v & 0x200) == 0 ? boolean1 : null), ((v & 0x400) == 0 ? integer0 : null), ((v & 0x800) == 0 ? boolean2 : null), ((v & 0x1000) == 0 ? integer1 : null), ((v & 0x2000) == 0 ? boolean3 : null), ((v & 0x4000) == 0 ? boolean4 : null), ((v & 0x8000) == 0 ? boolean5 : null), ((v & 0x10000) == 0 ? boolean6 : null), ((v & 0x20000) == 0 ? long0 : null), ((v & 0x40000) == 0 ? h$b0 : null));
    }

    @y4.m
    public final com.vungle.ads.internal.model.h.c component1() {
        return this.cleverCache;
    }

    @y4.m
    public final Boolean component10() {
        return this.isReportIncentivizedEnabled;
    }

    @y4.m
    public final Integer component11() {
        return this.sessionTimeout;
    }

    @y4.m
    public final Boolean component12() {
        return this.waitForConnectivityForTPAT;
    }

    @y4.m
    public final Integer component13() {
        return this.signalSessionTimeout;
    }

    @y4.m
    public final Boolean component14() {
        return this.isCacheableAssetsRequired;
    }

    @y4.m
    public final Boolean component15() {
        return this.signalsDisabled;
    }

    @y4.m
    public final Boolean component16() {
        return this.fpdEnabled;
    }

    @y4.m
    public final Boolean component17() {
        return this.rtaDebugging;
    }

    @y4.m
    public final Long component18() {
        return this.configLastValidatedTimestamp;
    }

    @y4.m
    public final b component19() {
        return this.autoRedirect;
    }

    @y4.m
    public final com.vungle.ads.internal.model.h.e component2() {
        return this.configSettings;
    }

    @y4.m
    public final com.vungle.ads.internal.model.h.f component3() {
        return this.endpoints;
    }

    @y4.m
    public final com.vungle.ads.internal.model.h.i component4() {
        return this.logMetricsSettings;
    }

    @y4.m
    public final List component5() {
        return this.placements;
    }

    @y4.m
    public final j component6() {
        return this.userPrivacy;
    }

    @y4.m
    public final com.vungle.ads.internal.model.h.k component7() {
        return this.viewAbility;
    }

    @y4.m
    public final String component8() {
        return this.configExtension;
    }

    @y4.m
    public final Boolean component9() {
        return this.disableAdId;
    }

    @l
    public final h copy(@y4.m com.vungle.ads.internal.model.h.c h$c0, @y4.m com.vungle.ads.internal.model.h.e h$e0, @y4.m com.vungle.ads.internal.model.h.f h$f0, @y4.m com.vungle.ads.internal.model.h.i h$i0, @y4.m List list0, @y4.m j h$j0, @y4.m com.vungle.ads.internal.model.h.k h$k0, @y4.m String s, @y4.m Boolean boolean0, @y4.m Boolean boolean1, @y4.m Integer integer0, @y4.m Boolean boolean2, @y4.m Integer integer1, @y4.m Boolean boolean3, @y4.m Boolean boolean4, @y4.m Boolean boolean5, @y4.m Boolean boolean6, @y4.m Long long0, @y4.m b h$b0) {
        return new h(h$c0, h$e0, h$f0, h$i0, list0, h$j0, h$k0, s, boolean0, boolean1, integer0, boolean2, integer1, boolean3, boolean4, boolean5, boolean6, long0, h$b0);
    }

    public static h copy$default(h h0, com.vungle.ads.internal.model.h.c h$c0, com.vungle.ads.internal.model.h.e h$e0, com.vungle.ads.internal.model.h.f h$f0, com.vungle.ads.internal.model.h.i h$i0, List list0, j h$j0, com.vungle.ads.internal.model.h.k h$k0, String s, Boolean boolean0, Boolean boolean1, Integer integer0, Boolean boolean2, Integer integer1, Boolean boolean3, Boolean boolean4, Boolean boolean5, Boolean boolean6, Long long0, b h$b0, int v, Object object0) {
        com.vungle.ads.internal.model.h.c h$c1 = (v & 1) == 0 ? h$c0 : h0.cleverCache;
        com.vungle.ads.internal.model.h.e h$e1 = (v & 2) == 0 ? h$e0 : h0.configSettings;
        com.vungle.ads.internal.model.h.f h$f1 = (v & 4) == 0 ? h$f0 : h0.endpoints;
        com.vungle.ads.internal.model.h.i h$i1 = (v & 8) == 0 ? h$i0 : h0.logMetricsSettings;
        List list1 = (v & 16) == 0 ? list0 : h0.placements;
        j h$j1 = (v & 0x20) == 0 ? h$j0 : h0.userPrivacy;
        com.vungle.ads.internal.model.h.k h$k1 = (v & 0x40) == 0 ? h$k0 : h0.viewAbility;
        String s1 = (v & 0x80) == 0 ? s : h0.configExtension;
        Boolean boolean7 = (v & 0x100) == 0 ? boolean0 : h0.disableAdId;
        Boolean boolean8 = (v & 0x200) == 0 ? boolean1 : h0.isReportIncentivizedEnabled;
        Integer integer2 = (v & 0x400) == 0 ? integer0 : h0.sessionTimeout;
        Boolean boolean9 = (v & 0x800) == 0 ? boolean2 : h0.waitForConnectivityForTPAT;
        Integer integer3 = (v & 0x1000) == 0 ? integer1 : h0.signalSessionTimeout;
        Boolean boolean10 = (v & 0x2000) == 0 ? boolean3 : h0.isCacheableAssetsRequired;
        Boolean boolean11 = (v & 0x4000) == 0 ? boolean4 : h0.signalsDisabled;
        Boolean boolean12 = (v & 0x8000) == 0 ? boolean5 : h0.fpdEnabled;
        Boolean boolean13 = (v & 0x10000) == 0 ? boolean6 : h0.rtaDebugging;
        Long long1 = (v & 0x20000) == 0 ? long0 : h0.configLastValidatedTimestamp;
        return (v & 0x40000) == 0 ? h0.copy(h$c1, h$e1, h$f1, h$i1, list1, h$j1, h$k1, s1, boolean7, boolean8, integer2, boolean9, integer3, boolean10, boolean11, boolean12, boolean13, long1, h$b0) : h0.copy(h$c1, h$e1, h$f1, h$i1, list1, h$j1, h$k1, s1, boolean7, boolean8, integer2, boolean9, integer3, boolean10, boolean11, boolean12, boolean13, long1, h0.autoRedirect);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h)) {
            return false;
        }
        if(!L.g(this.cleverCache, ((h)object0).cleverCache)) {
            return false;
        }
        if(!L.g(this.configSettings, ((h)object0).configSettings)) {
            return false;
        }
        if(!L.g(this.endpoints, ((h)object0).endpoints)) {
            return false;
        }
        if(!L.g(this.logMetricsSettings, ((h)object0).logMetricsSettings)) {
            return false;
        }
        if(!L.g(this.placements, ((h)object0).placements)) {
            return false;
        }
        if(!L.g(this.userPrivacy, ((h)object0).userPrivacy)) {
            return false;
        }
        if(!L.g(this.viewAbility, ((h)object0).viewAbility)) {
            return false;
        }
        if(!L.g(this.configExtension, ((h)object0).configExtension)) {
            return false;
        }
        if(!L.g(this.disableAdId, ((h)object0).disableAdId)) {
            return false;
        }
        if(!L.g(this.isReportIncentivizedEnabled, ((h)object0).isReportIncentivizedEnabled)) {
            return false;
        }
        if(!L.g(this.sessionTimeout, ((h)object0).sessionTimeout)) {
            return false;
        }
        if(!L.g(this.waitForConnectivityForTPAT, ((h)object0).waitForConnectivityForTPAT)) {
            return false;
        }
        if(!L.g(this.signalSessionTimeout, ((h)object0).signalSessionTimeout)) {
            return false;
        }
        if(!L.g(this.isCacheableAssetsRequired, ((h)object0).isCacheableAssetsRequired)) {
            return false;
        }
        if(!L.g(this.signalsDisabled, ((h)object0).signalsDisabled)) {
            return false;
        }
        if(!L.g(this.fpdEnabled, ((h)object0).fpdEnabled)) {
            return false;
        }
        if(!L.g(this.rtaDebugging, ((h)object0).rtaDebugging)) {
            return false;
        }
        return L.g(this.configLastValidatedTimestamp, ((h)object0).configLastValidatedTimestamp) ? L.g(this.autoRedirect, ((h)object0).autoRedirect) : false;
    }

    @y4.m
    public final b getAutoRedirect() {
        return this.autoRedirect;
    }

    @t("auto_redirect")
    public static void getAutoRedirect$annotations() {
    }

    @y4.m
    public final com.vungle.ads.internal.model.h.c getCleverCache() {
        return this.cleverCache;
    }

    @t("reuse_assets")
    public static void getCleverCache$annotations() {
    }

    @y4.m
    public final String getConfigExtension() {
        return this.configExtension;
    }

    @t("config_extension")
    public static void getConfigExtension$annotations() {
    }

    @y4.m
    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    @t("config_last_validated_ts")
    public static void getConfigLastValidatedTimestamp$annotations() {
    }

    @y4.m
    public final com.vungle.ads.internal.model.h.e getConfigSettings() {
        return this.configSettings;
    }

    @t("config")
    public static void getConfigSettings$annotations() {
    }

    @y4.m
    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    @t("disable_ad_id")
    public static void getDisableAdId$annotations() {
    }

    @y4.m
    public final com.vungle.ads.internal.model.h.f getEndpoints() {
        return this.endpoints;
    }

    @t("endpoints")
    public static void getEndpoints$annotations() {
    }

    @y4.m
    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    @t("fpd_enabled")
    public static void getFpdEnabled$annotations() {
    }

    @y4.m
    public final com.vungle.ads.internal.model.h.i getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    @t("log_metrics")
    public static void getLogMetricsSettings$annotations() {
    }

    @y4.m
    public final List getPlacements() {
        return this.placements;
    }

    @t("placements")
    public static void getPlacements$annotations() {
    }

    @y4.m
    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    @t("rta_debugging")
    public static void getRtaDebugging$annotations() {
    }

    @y4.m
    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    @t("session_timeout")
    public static void getSessionTimeout$annotations() {
    }

    @y4.m
    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    @t("sdk_session_timeout")
    public static void getSignalSessionTimeout$annotations() {
    }

    @y4.m
    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    @t("signals_disabled")
    public static void getSignalsDisabled$annotations() {
    }

    @y4.m
    public final j getUserPrivacy() {
        return this.userPrivacy;
    }

    @t("user")
    public static void getUserPrivacy$annotations() {
    }

    @y4.m
    public final com.vungle.ads.internal.model.h.k getViewAbility() {
        return this.viewAbility;
    }

    @t("viewability")
    public static void getViewAbility$annotations() {
    }

    @y4.m
    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    @t("wait_for_connectivity_for_tpat")
    public static void getWaitForConnectivityForTPAT$annotations() {
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.cleverCache == null ? 0 : this.cleverCache.hashCode();
        int v2 = this.configSettings == null ? 0 : this.configSettings.hashCode();
        int v3 = this.endpoints == null ? 0 : this.endpoints.hashCode();
        int v4 = this.logMetricsSettings == null ? 0 : this.logMetricsSettings.hashCode();
        int v5 = this.placements == null ? 0 : this.placements.hashCode();
        int v6 = this.userPrivacy == null ? 0 : this.userPrivacy.hashCode();
        int v7 = this.viewAbility == null ? 0 : this.viewAbility.hashCode();
        int v8 = this.configExtension == null ? 0 : this.configExtension.hashCode();
        int v9 = this.disableAdId == null ? 0 : this.disableAdId.hashCode();
        int v10 = this.isReportIncentivizedEnabled == null ? 0 : this.isReportIncentivizedEnabled.hashCode();
        int v11 = this.sessionTimeout == null ? 0 : this.sessionTimeout.hashCode();
        int v12 = this.waitForConnectivityForTPAT == null ? 0 : this.waitForConnectivityForTPAT.hashCode();
        int v13 = this.signalSessionTimeout == null ? 0 : this.signalSessionTimeout.hashCode();
        int v14 = this.isCacheableAssetsRequired == null ? 0 : this.isCacheableAssetsRequired.hashCode();
        int v15 = this.signalsDisabled == null ? 0 : this.signalsDisabled.hashCode();
        int v16 = this.fpdEnabled == null ? 0 : this.fpdEnabled.hashCode();
        int v17 = this.rtaDebugging == null ? 0 : this.rtaDebugging.hashCode();
        int v18 = this.configLastValidatedTimestamp == null ? 0 : this.configLastValidatedTimestamp.hashCode();
        b h$b0 = this.autoRedirect;
        if(h$b0 != null) {
            v = h$b0.hashCode();
        }
        return (((((((((((((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v15) * 0x1F + v16) * 0x1F + v17) * 0x1F + v18) * 0x1F + v;
    }

    @y4.m
    public final Boolean isCacheableAssetsRequired() {
        return this.isCacheableAssetsRequired;
    }

    @t("cacheable_assets_required")
    public static void isCacheableAssetsRequired$annotations() {
    }

    @y4.m
    public final Boolean isReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    @t("ri_enabled")
    public static void isReportIncentivizedEnabled$annotations() {
    }

    public final void setAutoRedirect(@y4.m b h$b0) {
        this.autoRedirect = h$b0;
    }

    public final void setConfigLastValidatedTimestamp(@y4.m Long long0) {
        this.configLastValidatedTimestamp = long0;
    }

    @Override
    @l
    public String toString() {
        return "ConfigPayload(cleverCache=" + this.cleverCache + ", configSettings=" + this.configSettings + ", endpoints=" + this.endpoints + ", logMetricsSettings=" + this.logMetricsSettings + ", placements=" + this.placements + ", userPrivacy=" + this.userPrivacy + ", viewAbility=" + this.viewAbility + ", configExtension=" + this.configExtension + ", disableAdId=" + this.disableAdId + ", isReportIncentivizedEnabled=" + this.isReportIncentivizedEnabled + ", sessionTimeout=" + this.sessionTimeout + ", waitForConnectivityForTPAT=" + this.waitForConnectivityForTPAT + ", signalSessionTimeout=" + this.signalSessionTimeout + ", isCacheableAssetsRequired=" + this.isCacheableAssetsRequired + ", signalsDisabled=" + this.signalsDisabled + ", fpdEnabled=" + this.fpdEnabled + ", rtaDebugging=" + this.rtaDebugging + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ", autoRedirect=" + this.autoRedirect + ')';
    }

    @n
    public static final void write$Self(@l h h0, @l d d0, @l f f0) {
        L.p(h0, "self");
        L.p(d0, "output");
        L.p(f0, "serialDesc");
        if(d0.q(f0, 0) || h0.cleverCache != null) {
            d0.y(f0, 0, com.vungle.ads.internal.model.h.c.a.INSTANCE, h0.cleverCache);
        }
        if(d0.q(f0, 1) || h0.configSettings != null) {
            d0.y(f0, 1, com.vungle.ads.internal.model.h.e.a.INSTANCE, h0.configSettings);
        }
        if(d0.q(f0, 2) || h0.endpoints != null) {
            d0.y(f0, 2, com.vungle.ads.internal.model.h.f.a.INSTANCE, h0.endpoints);
        }
        if(d0.q(f0, 3) || h0.logMetricsSettings != null) {
            d0.y(f0, 3, com.vungle.ads.internal.model.h.i.a.INSTANCE, h0.logMetricsSettings);
        }
        if(d0.q(f0, 4) || h0.placements != null) {
            d0.y(f0, 4, new kotlinx.serialization.internal.f(com.vungle.ads.internal.model.m.a.INSTANCE), h0.placements);
        }
        if(d0.q(f0, 5) || h0.userPrivacy != null) {
            d0.y(f0, 5, com.vungle.ads.internal.model.h.j.a.INSTANCE, h0.userPrivacy);
        }
        if(d0.q(f0, 6) || h0.viewAbility != null) {
            d0.y(f0, 6, com.vungle.ads.internal.model.h.k.a.INSTANCE, h0.viewAbility);
        }
        if(d0.q(f0, 7) || h0.configExtension != null) {
            d0.y(f0, 7, N0.a, h0.configExtension);
        }
        if(d0.q(f0, 8) || !L.g(h0.disableAdId, Boolean.TRUE)) {
            d0.y(f0, 8, kotlinx.serialization.internal.i.a, h0.disableAdId);
        }
        if(d0.q(f0, 9) || h0.isReportIncentivizedEnabled != null) {
            d0.y(f0, 9, kotlinx.serialization.internal.i.a, h0.isReportIncentivizedEnabled);
        }
        if(d0.q(f0, 10) || h0.sessionTimeout != null) {
            d0.y(f0, 10, W.a, h0.sessionTimeout);
        }
        if(d0.q(f0, 11) || h0.waitForConnectivityForTPAT != null) {
            d0.y(f0, 11, kotlinx.serialization.internal.i.a, h0.waitForConnectivityForTPAT);
        }
        if(d0.q(f0, 12) || h0.signalSessionTimeout != null) {
            d0.y(f0, 12, W.a, h0.signalSessionTimeout);
        }
        if(d0.q(f0, 13) || h0.isCacheableAssetsRequired != null) {
            d0.y(f0, 13, kotlinx.serialization.internal.i.a, h0.isCacheableAssetsRequired);
        }
        if(d0.q(f0, 14) || h0.signalsDisabled != null) {
            d0.y(f0, 14, kotlinx.serialization.internal.i.a, h0.signalsDisabled);
        }
        if(d0.q(f0, 15) || h0.fpdEnabled != null) {
            d0.y(f0, 15, kotlinx.serialization.internal.i.a, h0.fpdEnabled);
        }
        if(d0.q(f0, 16) || h0.rtaDebugging != null) {
            d0.y(f0, 16, kotlinx.serialization.internal.i.a, h0.rtaDebugging);
        }
        if(d0.q(f0, 17) || h0.configLastValidatedTimestamp != null) {
            d0.y(f0, 17, h0.a, h0.configLastValidatedTimestamp);
        }
        if(d0.q(f0, 18) || h0.autoRedirect != null) {
            d0.y(f0, 18, com.vungle.ads.internal.model.h.b.a.INSTANCE, h0.autoRedirect);
        }
    }
}

