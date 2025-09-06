package com.vungle.ads.internal.model;

import androidx.annotation.VisibleForTesting;
import com.vungle.ads.Z0;
import com.vungle.ads.internal.util.o;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlin.text.r;
import kotlinx.serialization.D;
import kotlinx.serialization.E;
import kotlinx.serialization.c;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import kotlinx.serialization.internal.H0;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.internal.N0;
import kotlinx.serialization.internal.W;
import kotlinx.serialization.internal.b0;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.json.y;
import kotlinx.serialization.json.z;
import kotlinx.serialization.t;
import kotlinx.serialization.u;
import y4.l;
import z3.n;

@u
public final class b {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a b$a0 = new a();
            a.INSTANCE = b$a0;
            w0 w00 = new w0("com.vungle.ads.internal.model.AdPayload", b$a0, 5);
            w00.k("ads", true);
            w00.k("config", true);
            w00.k("mraidFiles", true);
            w00.k("incentivizedTextSettings", true);
            w00.k("assetsFullyDownloaded", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            return new i[]{P3.a.u(new kotlinx.serialization.internal.f(com.vungle.ads.internal.model.b.f.a.INSTANCE)), P3.a.u(com.vungle.ads.internal.model.h.a.INSTANCE), new c(m0.d(ConcurrentHashMap.class), null, new i[]{N0.a, N0.a}), new b0(N0.a, N0.a), kotlinx.serialization.internal.i.a};
        }

        @l
        public b deserialize(@l e e0) {
            boolean z1;
            int v;
            Object object3;
            Object object2;
            Object object1;
            Object object0;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            kotlinx.serialization.encoding.c c0 = e0.b(f0);
            boolean z = c0.k();
            Class class0 = ConcurrentHashMap.class;
            if(z) {
                object0 = c0.j(f0, 0, new kotlinx.serialization.internal.f(com.vungle.ads.internal.model.b.f.a.INSTANCE), null);
                object1 = c0.j(f0, 1, com.vungle.ads.internal.model.h.a.INSTANCE, null);
                object2 = c0.p(f0, 2, new c(m0.d(class0), null, new i[]{N0.a, N0.a}), null);
                object3 = c0.p(f0, 3, new b0(N0.a, N0.a), null);
                v = 0x1F;
                z1 = c0.C(f0, 4);
            }
            else {
                object0 = null;
                Object object4 = null;
                Object object5 = null;
                Object object6 = null;
                boolean z2 = false;
                int v1 = 0;
                boolean z3 = true;
                while(z3) {
                    int v2 = c0.w(f0);
                    switch(v2) {
                        case -1: {
                            z3 = false;
                            break;
                        }
                        case 0: {
                            object0 = c0.j(f0, 0, new kotlinx.serialization.internal.f(com.vungle.ads.internal.model.b.f.a.INSTANCE), object0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            object6 = c0.j(f0, 1, com.vungle.ads.internal.model.h.a.INSTANCE, object6);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            object4 = c0.p(f0, 2, new c(m0.d(class0), null, new i[]{N0.a, N0.a}), object4);
                            v1 |= 4;
                            break;
                        }
                        case 3: {
                            object5 = c0.p(f0, 3, new b0(N0.a, N0.a), object5);
                            v1 |= 8;
                            break;
                        }
                        case 4: {
                            z2 = c0.C(f0, 4);
                            v1 |= 16;
                            break;
                        }
                        default: {
                            throw new E(v2);
                        }
                    }
                }
                object2 = object4;
                object3 = object5;
                z1 = z2;
                v = v1;
                object1 = object6;
            }
            c0.c(f0);
            return new b(v, ((List)object0), ((h)object1), ((ConcurrentHashMap)object2), ((Map)object3), z1, null);
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

        public void serialize(@l g g0, @l b b0) {
            L.p(g0, "encoder");
            L.p(b0, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            b.write$Self(b0, d0, f0);
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

    @u
    public static final class com.vungle.ads.internal.model.b.b {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.b.b.a implements M {
            @l
            public static final com.vungle.ads.internal.model.b.b.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.b.b.a b$b$a0 = new com.vungle.ads.internal.model.b.b.a();
                com.vungle.ads.internal.model.b.b.a.INSTANCE = b$b$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.AdPayload.AdSizeInfo", b$b$a0, 2);
                w00.k("w", true);
                w00.k("h", true);
                com.vungle.ads.internal.model.b.b.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(W.a), P3.a.u(W.a)};
            }

            @l
            public com.vungle.ads.internal.model.b.b deserialize(@l e e0) {
                int v;
                Object object1;
                Object object0;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                kotlinx.serialization.encoding.c c0 = e0.b(f0);
                if(c0.k()) {
                    object0 = c0.j(f0, 0, W.a, null);
                    object1 = c0.j(f0, 1, W.a, null);
                    v = 3;
                }
                else {
                    object1 = null;
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
                                object2 = c0.j(f0, 0, W.a, object2);
                                v1 |= 1;
                                break;
                            }
                            case 1: {
                                object1 = c0.j(f0, 1, W.a, object1);
                                v1 |= 2;
                                break;
                            }
                            default: {
                                throw new E(v2);
                            }
                        }
                    }
                    v = v1;
                    object0 = object2;
                }
                c0.c(f0);
                return new com.vungle.ads.internal.model.b.b(v, ((Integer)object0), ((Integer)object1), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.b.b.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.b.b b$b0) {
                L.p(g0, "encoder");
                L.p(b$b0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                com.vungle.ads.internal.model.b.b.write$Self(b$b0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.b.b)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.b.b.b {
            private com.vungle.ads.internal.model.b.b.b() {
            }

            public com.vungle.ads.internal.model.b.b.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.b.b.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.b.b.b Companion;
        @y4.m
        private final Integer height;
        @y4.m
        private final Integer width;

        static {
            com.vungle.ads.internal.model.b.b.Companion = new com.vungle.ads.internal.model.b.b.b(null);
        }

        public com.vungle.ads.internal.model.b.b() {
            this(null, null, 3, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.b.b(int v, @t("w") Integer integer0, @t("h") Integer integer1, H0 h00) {
            if((v & 1) == 0) {
                integer0 = 0;
            }
            this.width = integer0;
            if((v & 2) == 0) {
                this.height = 0;
                return;
            }
            this.height = integer1;
        }

        public com.vungle.ads.internal.model.b.b(@y4.m Integer integer0, @y4.m Integer integer1) {
            this.width = integer0;
            this.height = integer1;
        }

        public com.vungle.ads.internal.model.b.b(Integer integer0, Integer integer1, int v, w w0) {
            if((v & 1) != 0) {
                integer0 = 0;
            }
            if((v & 2) != 0) {
                integer1 = 0;
            }
            this(integer0, integer1);
        }

        @y4.m
        public final Integer component1() {
            return this.width;
        }

        @y4.m
        public final Integer component2() {
            return this.height;
        }

        @l
        public final com.vungle.ads.internal.model.b.b copy(@y4.m Integer integer0, @y4.m Integer integer1) {
            return new com.vungle.ads.internal.model.b.b(integer0, integer1);
        }

        public static com.vungle.ads.internal.model.b.b copy$default(com.vungle.ads.internal.model.b.b b$b0, Integer integer0, Integer integer1, int v, Object object0) {
            if((v & 1) != 0) {
                integer0 = b$b0.width;
            }
            if((v & 2) != 0) {
                integer1 = b$b0.height;
            }
            return b$b0.copy(integer0, integer1);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.vungle.ads.internal.model.b.b)) {
                return false;
            }
            return L.g(this.width, ((com.vungle.ads.internal.model.b.b)object0).width) ? L.g(this.height, ((com.vungle.ads.internal.model.b.b)object0).height) : false;
        }

        @y4.m
        public final Integer getHeight() {
            return this.height;
        }

        @t("h")
        public static void getHeight$annotations() {
        }

        @y4.m
        public final Integer getWidth() {
            return this.width;
        }

        @t("w")
        public static void getWidth$annotations() {
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.width == null ? 0 : this.width.hashCode();
            Integer integer0 = this.height;
            if(integer0 != null) {
                v = integer0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "AdSizeInfo(width=" + this.width + ", height=" + this.height + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.b.b b$b0, @l d d0, @l f f0) {
            L.p(b$b0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || (b$b0.width == null || ((int)b$b0.width) != 0)) {
                d0.y(f0, 0, W.a, b$b0.width);
            }
            if(d0.q(f0, 1) || (b$b0.height == null || ((int)b$b0.height) != 0)) {
                d0.y(f0, 1, W.a, b$b0.height);
            }
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.b.c {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.b.c.a implements M {
            @l
            public static final com.vungle.ads.internal.model.b.c.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.b.c.a b$c$a0 = new com.vungle.ads.internal.model.b.c.a();
                com.vungle.ads.internal.model.b.c.a.INSTANCE = b$c$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.AdPayload.AdUnit", b$c$a0, 25);
                w00.k("id", true);
                w00.k("ad_type", true);
                w00.k("ad_source", true);
                w00.k("expiry", true);
                w00.k("deeplink_url", true);
                w00.k("click_coordinates_enabled", true);
                w00.k("ad_load_optimization", true);
                w00.k("template_heartbeat_check", true);
                w00.k("info", true);
                w00.k("sleep", true);
                w00.k("error_code", true);
                w00.k("tpat", true);
                w00.k("vm_url", true);
                w00.k("ad_market_id", true);
                w00.k("notification", true);
                w00.k("load_ad", true);
                w00.k("viewability", true);
                w00.k("template_url", true);
                w00.k("template_type", true);
                w00.k("template_settings", true);
                w00.k("creative_id", true);
                w00.k("app_id", true);
                w00.k("show_close", true);
                w00.k("show_close_incentivized", true);
                w00.k("ad_size", true);
                com.vungle.ads.internal.model.b.c.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(W.a), P3.a.u(N0.a), P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(N0.a), P3.a.u(W.a), P3.a.u(W.a), P3.a.u(com.vungle.ads.internal.model.b.h.INSTANCE), P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(new kotlinx.serialization.internal.f(N0.a)), P3.a.u(new kotlinx.serialization.internal.f(N0.a)), P3.a.u(com.vungle.ads.internal.model.b.i.a.INSTANCE), P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(com.vungle.ads.internal.model.b.g.a.INSTANCE), P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(W.a), P3.a.u(W.a), P3.a.u(com.vungle.ads.internal.model.b.b.a.INSTANCE)};
            }

            @l
            public com.vungle.ads.internal.model.b.c deserialize(@l e e0) {
                Object object59;
                Object object38;
                Object object37;
                Object object36;
                Object object35;
                Object object34;
                Object object33;
                int v;
                Object object32;
                Object object31;
                Object object30;
                Object object29;
                Object object28;
                Object object23;
                Object object22;
                Object object21;
                Object object18;
                Object object17;
                Object object16;
                Object object15;
                Object object14;
                Object object11;
                Object object9;
                Object object7;
                Object object2;
                Object object1;
                Object object0;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                kotlinx.serialization.encoding.c c0 = e0.b(f0);
                if(c0.k()) {
                    object0 = c0.j(f0, 0, N0.a, null);
                    object1 = c0.j(f0, 1, N0.a, null);
                    object2 = c0.j(f0, 2, N0.a, null);
                    Object object3 = c0.j(f0, 3, W.a, null);
                    Object object4 = c0.j(f0, 4, N0.a, null);
                    Object object5 = c0.j(f0, 5, kotlinx.serialization.internal.i.a, null);
                    Object object6 = c0.j(f0, 6, kotlinx.serialization.internal.i.a, null);
                    object7 = c0.j(f0, 7, kotlinx.serialization.internal.i.a, null);
                    Object object8 = c0.j(f0, 8, N0.a, null);
                    object9 = c0.j(f0, 9, W.a, null);
                    Object object10 = c0.j(f0, 10, W.a, null);
                    object11 = object3;
                    Object object12 = c0.j(f0, 11, com.vungle.ads.internal.model.b.h.INSTANCE, null);
                    Object object13 = c0.j(f0, 12, N0.a, null);
                    object14 = object12;
                    object15 = c0.j(f0, 13, N0.a, null);
                    object16 = object13;
                    object17 = c0.j(f0, 14, new kotlinx.serialization.internal.f(N0.a), null);
                    object18 = c0.j(f0, 15, new kotlinx.serialization.internal.f(N0.a), null);
                    Object object19 = c0.j(f0, 16, com.vungle.ads.internal.model.b.i.a.INSTANCE, null);
                    Object object20 = c0.j(f0, 17, N0.a, null);
                    object21 = object19;
                    object22 = c0.j(f0, 18, N0.a, null);
                    object23 = object20;
                    Object object24 = c0.j(f0, 19, com.vungle.ads.internal.model.b.g.a.INSTANCE, null);
                    Object object25 = c0.j(f0, 20, N0.a, null);
                    Object object26 = c0.j(f0, 21, N0.a, null);
                    Object object27 = c0.j(f0, 22, W.a, null);
                    object28 = object4;
                    object29 = object8;
                    object30 = object10;
                    object31 = object6;
                    object32 = c0.j(f0, 23, W.a, null);
                    v = 0x1FFFFFF;
                    object33 = c0.j(f0, 24, com.vungle.ads.internal.model.b.b.a.INSTANCE, null);
                    object34 = object27;
                    object35 = object25;
                    object36 = object26;
                    object37 = object5;
                    object38 = object24;
                }
                else {
                    Object object39 = null;
                    Object object40 = null;
                    object38 = null;
                    object35 = null;
                    object33 = null;
                    Object object41 = null;
                    Object object42 = null;
                    Object object43 = null;
                    Object object44 = null;
                    Object object45 = null;
                    Object object46 = null;
                    object32 = null;
                    object34 = null;
                    Object object47 = null;
                    Object object48 = null;
                    Object object49 = null;
                    Object object50 = null;
                    Object object51 = null;
                    Object object52 = null;
                    Object object53 = null;
                    Object object54 = null;
                    Object object55 = null;
                    Object object56 = null;
                    Object object57 = null;
                    Object object58 = null;
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
                                object47 = c0.j(f0, 0, N0.a, object47);
                                v1 |= 1;
                                continue;
                            }
                            case 1: {
                                object48 = c0.j(f0, 1, N0.a, object48);
                                v1 |= 2;
                                continue;
                            }
                            case 2: {
                                object49 = c0.j(f0, 2, N0.a, object49);
                                v1 |= 4;
                                continue;
                            }
                            case 3: {
                                object50 = c0.j(f0, 3, W.a, object50);
                                v1 |= 8;
                                continue;
                            }
                            case 4: {
                                object51 = c0.j(f0, 4, N0.a, object51);
                                v1 |= 16;
                                continue;
                            }
                            case 5: {
                                object52 = c0.j(f0, 5, kotlinx.serialization.internal.i.a, object52);
                                v1 |= 0x20;
                                continue;
                            }
                            case 6: {
                                object53 = c0.j(f0, 6, kotlinx.serialization.internal.i.a, object53);
                                v1 |= 0x40;
                                continue;
                            }
                            case 7: {
                                object54 = c0.j(f0, 7, kotlinx.serialization.internal.i.a, object54);
                                v1 |= 0x80;
                                continue;
                            }
                            case 8: {
                                object55 = c0.j(f0, 8, N0.a, object55);
                                v1 |= 0x100;
                                continue;
                            }
                            case 9: {
                                object56 = c0.j(f0, 9, W.a, object56);
                                v1 |= 0x200;
                                continue;
                            }
                            case 10: {
                                object57 = c0.j(f0, 10, W.a, object57);
                                v1 |= 0x400;
                                continue;
                            }
                            case 11: {
                                object58 = c0.j(f0, 11, com.vungle.ads.internal.model.b.h.INSTANCE, object58);
                                v1 |= 0x800;
                                continue;
                            }
                            case 12: {
                                v1 |= 0x1000;
                                object46 = c0.j(f0, 12, N0.a, object46);
                                continue;
                            }
                            case 13: {
                                object39 = c0.j(f0, 13, N0.a, object39);
                                v1 |= 0x2000;
                                continue;
                            }
                            case 14: {
                                object59 = object39;
                                object44 = c0.j(f0, 14, new kotlinx.serialization.internal.f(N0.a), object44);
                                v1 |= 0x4000;
                                break;
                            }
                            case 15: {
                                object59 = object39;
                                object45 = c0.j(f0, 15, new kotlinx.serialization.internal.f(N0.a), object45);
                                v1 |= 0x8000;
                                break;
                            }
                            case 16: {
                                object59 = object39;
                                object43 = c0.j(f0, 16, com.vungle.ads.internal.model.b.i.a.INSTANCE, object43);
                                v1 |= 0x10000;
                                break;
                            }
                            case 17: {
                                object59 = object39;
                                object42 = c0.j(f0, 17, N0.a, object42);
                                v1 |= 0x20000;
                                break;
                            }
                            case 18: {
                                object59 = object39;
                                object41 = c0.j(f0, 18, N0.a, object41);
                                v1 |= 0x40000;
                                break;
                            }
                            case 19: {
                                object59 = object39;
                                object38 = c0.j(f0, 19, com.vungle.ads.internal.model.b.g.a.INSTANCE, object38);
                                v1 |= 0x80000;
                                break;
                            }
                            case 20: {
                                object59 = object39;
                                object35 = c0.j(f0, 20, N0.a, object35);
                                v1 |= 0x100000;
                                break;
                            }
                            case 21: {
                                object59 = object39;
                                object40 = c0.j(f0, 21, N0.a, object40);
                                v1 |= 0x200000;
                                break;
                            }
                            case 22: {
                                object59 = object39;
                                object34 = c0.j(f0, 22, W.a, object34);
                                v1 |= 0x400000;
                                break;
                            }
                            case 23: {
                                object59 = object39;
                                object32 = c0.j(f0, 23, W.a, object32);
                                v1 |= 0x800000;
                                break;
                            }
                            case 24: {
                                object59 = object39;
                                object33 = c0.j(f0, 24, com.vungle.ads.internal.model.b.b.a.INSTANCE, object33);
                                v1 |= 0x1000000;
                                break;
                            }
                            default: {
                                throw new E(v2);
                            }
                        }
                        object39 = object59;
                    }
                    object16 = object46;
                    object28 = object51;
                    object31 = object53;
                    object29 = object55;
                    object22 = object41;
                    object23 = object42;
                    object21 = object43;
                    object17 = object44;
                    object18 = object45;
                    object36 = object40;
                    object15 = object39;
                    object14 = object58;
                    object1 = object48;
                    object2 = object49;
                    object11 = object50;
                    object7 = object54;
                    object9 = object56;
                    object0 = object47;
                    object37 = object52;
                    v = v1;
                    object30 = object57;
                }
                c0.c(f0);
                return new com.vungle.ads.internal.model.b.c(v, ((String)object0), ((String)object1), ((String)object2), ((Integer)object11), ((String)object28), ((Boolean)object37), ((Boolean)object31), ((Boolean)object7), ((String)object29), ((Integer)object9), ((Integer)object30), ((Map)object14), ((String)object16), ((String)object15), ((List)object17), ((List)object18), ((com.vungle.ads.internal.model.b.i)object21), ((String)object23), ((String)object22), ((com.vungle.ads.internal.model.b.g)object38), ((String)object35), ((String)object36), ((Integer)object34), ((Integer)object32), ((com.vungle.ads.internal.model.b.b)object33), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.b.c.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.b.c b$c0) {
                L.p(g0, "encoder");
                L.p(b$c0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                com.vungle.ads.internal.model.b.c.write$Self(b$c0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.b.c)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.b.c.b {
            private com.vungle.ads.internal.model.b.c.b() {
            }

            public com.vungle.ads.internal.model.b.c.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.b.c.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.b.c.b Companion;
        @y4.m
        private final Boolean adLoadOptimizationEnabled;
        @y4.m
        private final String adMarketId;
        @y4.m
        private final com.vungle.ads.internal.model.b.b adSizeInfo;
        @y4.m
        private final String adSource;
        @y4.m
        private final String adType;
        @y4.m
        private final String advAppId;
        @y4.m
        private final Boolean clickCoordinatesEnabled;
        @y4.m
        private final String creativeId;
        @y4.m
        private final String deeplinkUrl;
        @y4.m
        private final Integer errorCode;
        @y4.m
        private final Integer expiry;
        @y4.m
        private final String id;
        @y4.m
        private final String info;
        @y4.m
        private final List loadAdUrls;
        @y4.m
        private final List notification;
        @y4.m
        private final Integer showClose;
        @y4.m
        private final Integer showCloseIncentivized;
        @y4.m
        private final Integer sleep;
        @y4.m
        private final Boolean templateHeartbeatCheck;
        @y4.m
        private final com.vungle.ads.internal.model.b.g templateSettings;
        @y4.m
        private final String templateType;
        @y4.m
        private final String templateURL;
        @y4.m
        private final Map tpat;
        @y4.m
        private final com.vungle.ads.internal.model.b.i viewAbility;
        @y4.m
        private final String vmURL;

        static {
            com.vungle.ads.internal.model.b.c.Companion = new com.vungle.ads.internal.model.b.c.b(null);
        }

        public com.vungle.ads.internal.model.b.c() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFFFF, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.b.c(int v, @t("id") String s, @t("ad_type") String s1, @t("ad_source") String s2, @t("expiry") Integer integer0, @t("deeplink_url") String s3, @t("click_coordinates_enabled") Boolean boolean0, @t("ad_load_optimization") Boolean boolean1, @t("template_heartbeat_check") Boolean boolean2, @t("info") String s4, @t("sleep") Integer integer1, @t("error_code") Integer integer2, @u(with = com.vungle.ads.internal.model.b.h.class) Map map0, @t("vm_url") String s5, @t("ad_market_id") String s6, @t("notification") List list0, @t("load_ad") List list1, @t("viewability") com.vungle.ads.internal.model.b.i b$i0, @t("template_url") String s7, @t("template_type") String s8, @t("template_settings") com.vungle.ads.internal.model.b.g b$g0, @t("creative_id") String s9, @t("app_id") String s10, @t("show_close") Integer integer3, @t("show_close_incentivized") Integer integer4, @t("ad_size") com.vungle.ads.internal.model.b.b b$b0, H0 h00) {
            this.id = (v & 1) == 0 ? null : s;
            this.adType = (v & 2) == 0 ? null : s1;
            this.adSource = (v & 4) == 0 ? null : s2;
            this.expiry = (v & 8) == 0 ? null : integer0;
            this.deeplinkUrl = (v & 16) == 0 ? null : s3;
            this.clickCoordinatesEnabled = (v & 0x20) == 0 ? null : boolean0;
            this.adLoadOptimizationEnabled = (v & 0x40) == 0 ? null : boolean1;
            this.templateHeartbeatCheck = (v & 0x80) == 0 ? null : boolean2;
            this.info = (v & 0x100) == 0 ? null : s4;
            this.sleep = (v & 0x200) == 0 ? null : integer1;
            this.errorCode = (v & 0x400) == 0 ? null : integer2;
            this.tpat = (v & 0x800) == 0 ? null : map0;
            this.vmURL = (v & 0x1000) == 0 ? null : s5;
            this.adMarketId = (v & 0x2000) == 0 ? null : s6;
            this.notification = (v & 0x4000) == 0 ? null : list0;
            this.loadAdUrls = (0x8000 & v) == 0 ? null : list1;
            this.viewAbility = (0x10000 & v) == 0 ? null : b$i0;
            this.templateURL = (0x20000 & v) == 0 ? null : s7;
            this.templateType = (0x40000 & v) == 0 ? null : s8;
            this.templateSettings = (0x80000 & v) == 0 ? null : b$g0;
            this.creativeId = (0x100000 & v) == 0 ? null : s9;
            this.advAppId = (0x200000 & v) == 0 ? null : s10;
            this.showClose = (0x400000 & v) == 0 ? 0 : integer3;
            this.showCloseIncentivized = (0x800000 & v) == 0 ? 0 : integer4;
            if((v & 0x1000000) == 0) {
                this.adSizeInfo = null;
                return;
            }
            this.adSizeInfo = b$b0;
        }

        public com.vungle.ads.internal.model.b.c(@y4.m String s, @y4.m String s1, @y4.m String s2, @y4.m Integer integer0, @y4.m String s3, @y4.m Boolean boolean0, @y4.m Boolean boolean1, @y4.m Boolean boolean2, @y4.m String s4, @y4.m Integer integer1, @y4.m Integer integer2, @y4.m Map map0, @y4.m String s5, @y4.m String s6, @y4.m List list0, @y4.m List list1, @y4.m com.vungle.ads.internal.model.b.i b$i0, @y4.m String s7, @y4.m String s8, @y4.m com.vungle.ads.internal.model.b.g b$g0, @y4.m String s9, @y4.m String s10, @y4.m Integer integer3, @y4.m Integer integer4, @y4.m com.vungle.ads.internal.model.b.b b$b0) {
            this.id = s;
            this.adType = s1;
            this.adSource = s2;
            this.expiry = integer0;
            this.deeplinkUrl = s3;
            this.clickCoordinatesEnabled = boolean0;
            this.adLoadOptimizationEnabled = boolean1;
            this.templateHeartbeatCheck = boolean2;
            this.info = s4;
            this.sleep = integer1;
            this.errorCode = integer2;
            this.tpat = map0;
            this.vmURL = s5;
            this.adMarketId = s6;
            this.notification = list0;
            this.loadAdUrls = list1;
            this.viewAbility = b$i0;
            this.templateURL = s7;
            this.templateType = s8;
            this.templateSettings = b$g0;
            this.creativeId = s9;
            this.advAppId = s10;
            this.showClose = integer3;
            this.showCloseIncentivized = integer4;
            this.adSizeInfo = b$b0;
        }

        public com.vungle.ads.internal.model.b.c(String s, String s1, String s2, Integer integer0, String s3, Boolean boolean0, Boolean boolean1, Boolean boolean2, String s4, Integer integer1, Integer integer2, Map map0, String s5, String s6, List list0, List list1, com.vungle.ads.internal.model.b.i b$i0, String s7, String s8, com.vungle.ads.internal.model.b.g b$g0, String s9, String s10, Integer integer3, Integer integer4, com.vungle.ads.internal.model.b.b b$b0, int v, w w0) {
            this(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? integer0 : null), ((v & 16) == 0 ? s3 : null), ((v & 0x20) == 0 ? boolean0 : null), ((v & 0x40) == 0 ? boolean1 : null), ((v & 0x80) == 0 ? boolean2 : null), ((v & 0x100) == 0 ? s4 : null), ((v & 0x200) == 0 ? integer1 : null), ((v & 0x400) == 0 ? integer2 : null), ((v & 0x800) == 0 ? map0 : null), ((v & 0x1000) == 0 ? s5 : null), ((v & 0x2000) == 0 ? s6 : null), ((v & 0x4000) == 0 ? list0 : null), ((v & 0x8000) == 0 ? list1 : null), ((v & 0x10000) == 0 ? b$i0 : null), ((v & 0x20000) == 0 ? s7 : null), ((v & 0x40000) == 0 ? s8 : null), ((v & 0x80000) == 0 ? b$g0 : null), ((v & 0x100000) == 0 ? s9 : null), ((v & 0x200000) == 0 ? s10 : null), ((v & 0x400000) == 0 ? integer3 : 0), ((v & 0x800000) == 0 ? integer4 : 0), ((v & 0x1000000) == 0 ? b$b0 : null));
        }

        @y4.m
        public final String component1() {
            return this.id;
        }

        @y4.m
        public final Integer component10() {
            return this.sleep;
        }

        @y4.m
        public final Integer component11() {
            return this.errorCode;
        }

        @y4.m
        public final Map component12() {
            return this.tpat;
        }

        @y4.m
        public final String component13() {
            return this.vmURL;
        }

        @y4.m
        public final String component14() {
            return this.adMarketId;
        }

        @y4.m
        public final List component15() {
            return this.notification;
        }

        @y4.m
        public final List component16() {
            return this.loadAdUrls;
        }

        @y4.m
        public final com.vungle.ads.internal.model.b.i component17() {
            return this.viewAbility;
        }

        @y4.m
        public final String component18() {
            return this.templateURL;
        }

        @y4.m
        public final String component19() {
            return this.templateType;
        }

        @y4.m
        public final String component2() {
            return this.adType;
        }

        @y4.m
        public final com.vungle.ads.internal.model.b.g component20() {
            return this.templateSettings;
        }

        @y4.m
        public final String component21() {
            return this.creativeId;
        }

        @y4.m
        public final String component22() {
            return this.advAppId;
        }

        @y4.m
        public final Integer component23() {
            return this.showClose;
        }

        @y4.m
        public final Integer component24() {
            return this.showCloseIncentivized;
        }

        @y4.m
        public final com.vungle.ads.internal.model.b.b component25() {
            return this.adSizeInfo;
        }

        @y4.m
        public final String component3() {
            return this.adSource;
        }

        @y4.m
        public final Integer component4() {
            return this.expiry;
        }

        @y4.m
        public final String component5() {
            return this.deeplinkUrl;
        }

        @y4.m
        public final Boolean component6() {
            return this.clickCoordinatesEnabled;
        }

        @y4.m
        public final Boolean component7() {
            return this.adLoadOptimizationEnabled;
        }

        @y4.m
        public final Boolean component8() {
            return this.templateHeartbeatCheck;
        }

        @y4.m
        public final String component9() {
            return this.info;
        }

        @l
        public final com.vungle.ads.internal.model.b.c copy(@y4.m String s, @y4.m String s1, @y4.m String s2, @y4.m Integer integer0, @y4.m String s3, @y4.m Boolean boolean0, @y4.m Boolean boolean1, @y4.m Boolean boolean2, @y4.m String s4, @y4.m Integer integer1, @y4.m Integer integer2, @y4.m Map map0, @y4.m String s5, @y4.m String s6, @y4.m List list0, @y4.m List list1, @y4.m com.vungle.ads.internal.model.b.i b$i0, @y4.m String s7, @y4.m String s8, @y4.m com.vungle.ads.internal.model.b.g b$g0, @y4.m String s9, @y4.m String s10, @y4.m Integer integer3, @y4.m Integer integer4, @y4.m com.vungle.ads.internal.model.b.b b$b0) {
            return new com.vungle.ads.internal.model.b.c(s, s1, s2, integer0, s3, boolean0, boolean1, boolean2, s4, integer1, integer2, map0, s5, s6, list0, list1, b$i0, s7, s8, b$g0, s9, s10, integer3, integer4, b$b0);
        }

        public static com.vungle.ads.internal.model.b.c copy$default(com.vungle.ads.internal.model.b.c b$c0, String s, String s1, String s2, Integer integer0, String s3, Boolean boolean0, Boolean boolean1, Boolean boolean2, String s4, Integer integer1, Integer integer2, Map map0, String s5, String s6, List list0, List list1, com.vungle.ads.internal.model.b.i b$i0, String s7, String s8, com.vungle.ads.internal.model.b.g b$g0, String s9, String s10, Integer integer3, Integer integer4, com.vungle.ads.internal.model.b.b b$b0, int v, Object object0) {
            String s11 = (v & 1) == 0 ? s : b$c0.id;
            String s12 = (v & 2) == 0 ? s1 : b$c0.adType;
            String s13 = (v & 4) == 0 ? s2 : b$c0.adSource;
            Integer integer5 = (v & 8) == 0 ? integer0 : b$c0.expiry;
            String s14 = (v & 16) == 0 ? s3 : b$c0.deeplinkUrl;
            Boolean boolean3 = (v & 0x20) == 0 ? boolean0 : b$c0.clickCoordinatesEnabled;
            Boolean boolean4 = (v & 0x40) == 0 ? boolean1 : b$c0.adLoadOptimizationEnabled;
            Boolean boolean5 = (v & 0x80) == 0 ? boolean2 : b$c0.templateHeartbeatCheck;
            String s15 = (v & 0x100) == 0 ? s4 : b$c0.info;
            Integer integer6 = (v & 0x200) == 0 ? integer1 : b$c0.sleep;
            Integer integer7 = (v & 0x400) == 0 ? integer2 : b$c0.errorCode;
            Map map1 = (v & 0x800) == 0 ? map0 : b$c0.tpat;
            String s16 = (v & 0x1000) == 0 ? s5 : b$c0.vmURL;
            String s17 = (v & 0x2000) == 0 ? s6 : b$c0.adMarketId;
            List list2 = (v & 0x4000) == 0 ? list0 : b$c0.notification;
            List list3 = (v & 0x8000) == 0 ? list1 : b$c0.loadAdUrls;
            com.vungle.ads.internal.model.b.i b$i1 = (v & 0x10000) == 0 ? b$i0 : b$c0.viewAbility;
            String s18 = (v & 0x20000) == 0 ? s7 : b$c0.templateURL;
            String s19 = (v & 0x40000) == 0 ? s8 : b$c0.templateType;
            com.vungle.ads.internal.model.b.g b$g1 = (v & 0x80000) == 0 ? b$g0 : b$c0.templateSettings;
            String s20 = (v & 0x100000) == 0 ? s9 : b$c0.creativeId;
            String s21 = (v & 0x200000) == 0 ? s10 : b$c0.advAppId;
            Integer integer8 = (v & 0x400000) == 0 ? integer3 : b$c0.showClose;
            Integer integer9 = (v & 0x800000) == 0 ? integer4 : b$c0.showCloseIncentivized;
            return (v & 0x1000000) == 0 ? b$c0.copy(s11, s12, s13, integer5, s14, boolean3, boolean4, boolean5, s15, integer6, integer7, map1, s16, s17, list2, list3, b$i1, s18, s19, b$g1, s20, s21, integer8, integer9, b$b0) : b$c0.copy(s11, s12, s13, integer5, s14, boolean3, boolean4, boolean5, s15, integer6, integer7, map1, s16, s17, list2, list3, b$i1, s18, s19, b$g1, s20, s21, integer8, integer9, b$c0.adSizeInfo);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.vungle.ads.internal.model.b.c)) {
                return false;
            }
            com.vungle.ads.internal.model.b.c b$c0 = (com.vungle.ads.internal.model.b.c)object0;
            if(!L.g(this.id, b$c0.id)) {
                return false;
            }
            if(!L.g(this.adType, b$c0.adType)) {
                return false;
            }
            if(!L.g(this.adSource, b$c0.adSource)) {
                return false;
            }
            if(!L.g(this.expiry, b$c0.expiry)) {
                return false;
            }
            if(!L.g(this.deeplinkUrl, b$c0.deeplinkUrl)) {
                return false;
            }
            if(!L.g(this.clickCoordinatesEnabled, b$c0.clickCoordinatesEnabled)) {
                return false;
            }
            if(!L.g(this.adLoadOptimizationEnabled, b$c0.adLoadOptimizationEnabled)) {
                return false;
            }
            if(!L.g(this.templateHeartbeatCheck, b$c0.templateHeartbeatCheck)) {
                return false;
            }
            if(!L.g(this.info, b$c0.info)) {
                return false;
            }
            if(!L.g(this.sleep, b$c0.sleep)) {
                return false;
            }
            if(!L.g(this.errorCode, b$c0.errorCode)) {
                return false;
            }
            if(!L.g(this.tpat, b$c0.tpat)) {
                return false;
            }
            if(!L.g(this.vmURL, b$c0.vmURL)) {
                return false;
            }
            if(!L.g(this.adMarketId, b$c0.adMarketId)) {
                return false;
            }
            if(!L.g(this.notification, b$c0.notification)) {
                return false;
            }
            if(!L.g(this.loadAdUrls, b$c0.loadAdUrls)) {
                return false;
            }
            if(!L.g(this.viewAbility, b$c0.viewAbility)) {
                return false;
            }
            if(!L.g(this.templateURL, b$c0.templateURL)) {
                return false;
            }
            if(!L.g(this.templateType, b$c0.templateType)) {
                return false;
            }
            if(!L.g(this.templateSettings, b$c0.templateSettings)) {
                return false;
            }
            if(!L.g(this.creativeId, b$c0.creativeId)) {
                return false;
            }
            if(!L.g(this.advAppId, b$c0.advAppId)) {
                return false;
            }
            if(!L.g(this.showClose, b$c0.showClose)) {
                return false;
            }
            return L.g(this.showCloseIncentivized, b$c0.showCloseIncentivized) ? L.g(this.adSizeInfo, b$c0.adSizeInfo) : false;
        }

        @y4.m
        public final Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        @t("ad_load_optimization")
        public static void getAdLoadOptimizationEnabled$annotations() {
        }

        @y4.m
        public final String getAdMarketId() {
            return this.adMarketId;
        }

        @t("ad_market_id")
        public static void getAdMarketId$annotations() {
        }

        @y4.m
        public final com.vungle.ads.internal.model.b.b getAdSizeInfo() {
            return this.adSizeInfo;
        }

        @t("ad_size")
        public static void getAdSizeInfo$annotations() {
        }

        @y4.m
        public final String getAdSource() {
            return this.adSource;
        }

        @t("ad_source")
        public static void getAdSource$annotations() {
        }

        @y4.m
        public final String getAdType() {
            return this.adType;
        }

        @t("ad_type")
        public static void getAdType$annotations() {
        }

        @y4.m
        public final String getAdvAppId() {
            return this.advAppId;
        }

        @t("app_id")
        public static void getAdvAppId$annotations() {
        }

        @y4.m
        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        @t("click_coordinates_enabled")
        public static void getClickCoordinatesEnabled$annotations() {
        }

        @y4.m
        public final String getCreativeId() {
            return this.creativeId;
        }

        @t("creative_id")
        public static void getCreativeId$annotations() {
        }

        @y4.m
        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        @t("deeplink_url")
        public static void getDeeplinkUrl$annotations() {
        }

        @y4.m
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        @t("error_code")
        public static void getErrorCode$annotations() {
        }

        @y4.m
        public final Integer getExpiry() {
            return this.expiry;
        }

        @t("expiry")
        public static void getExpiry$annotations() {
        }

        @y4.m
        public final String getId() {
            return this.id;
        }

        @t("id")
        public static void getId$annotations() {
        }

        @y4.m
        public final String getInfo() {
            return this.info;
        }

        @t("info")
        public static void getInfo$annotations() {
        }

        @y4.m
        public final List getLoadAdUrls() {
            return this.loadAdUrls;
        }

        @t("load_ad")
        public static void getLoadAdUrls$annotations() {
        }

        @y4.m
        public final List getNotification() {
            return this.notification;
        }

        @t("notification")
        public static void getNotification$annotations() {
        }

        @y4.m
        public final Integer getShowClose() {
            return this.showClose;
        }

        @t("show_close")
        public static void getShowClose$annotations() {
        }

        @y4.m
        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        @t("show_close_incentivized")
        public static void getShowCloseIncentivized$annotations() {
        }

        @y4.m
        public final Integer getSleep() {
            return this.sleep;
        }

        @t("sleep")
        public static void getSleep$annotations() {
        }

        @y4.m
        public final Boolean getTemplateHeartbeatCheck() {
            return this.templateHeartbeatCheck;
        }

        @t("template_heartbeat_check")
        public static void getTemplateHeartbeatCheck$annotations() {
        }

        @y4.m
        public final com.vungle.ads.internal.model.b.g getTemplateSettings() {
            return this.templateSettings;
        }

        @t("template_settings")
        public static void getTemplateSettings$annotations() {
        }

        @y4.m
        public final String getTemplateType() {
            return this.templateType;
        }

        @t("template_type")
        public static void getTemplateType$annotations() {
        }

        @y4.m
        public final String getTemplateURL() {
            return this.templateURL;
        }

        @t("template_url")
        public static void getTemplateURL$annotations() {
        }

        @y4.m
        public final Map getTpat() {
            return this.tpat;
        }

        @u(with = com.vungle.ads.internal.model.b.h.class)
        public static void getTpat$annotations() {
        }

        @y4.m
        public final com.vungle.ads.internal.model.b.i getViewAbility() {
            return this.viewAbility;
        }

        @t("viewability")
        public static void getViewAbility$annotations() {
        }

        @y4.m
        public final String getVmURL() {
            return this.vmURL;
        }

        @t("vm_url")
        public static void getVmURL$annotations() {
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.id == null ? 0 : this.id.hashCode();
            int v2 = this.adType == null ? 0 : this.adType.hashCode();
            int v3 = this.adSource == null ? 0 : this.adSource.hashCode();
            int v4 = this.expiry == null ? 0 : this.expiry.hashCode();
            int v5 = this.deeplinkUrl == null ? 0 : this.deeplinkUrl.hashCode();
            int v6 = this.clickCoordinatesEnabled == null ? 0 : this.clickCoordinatesEnabled.hashCode();
            int v7 = this.adLoadOptimizationEnabled == null ? 0 : this.adLoadOptimizationEnabled.hashCode();
            int v8 = this.templateHeartbeatCheck == null ? 0 : this.templateHeartbeatCheck.hashCode();
            int v9 = this.info == null ? 0 : this.info.hashCode();
            int v10 = this.sleep == null ? 0 : this.sleep.hashCode();
            int v11 = this.errorCode == null ? 0 : this.errorCode.hashCode();
            int v12 = this.tpat == null ? 0 : this.tpat.hashCode();
            int v13 = this.vmURL == null ? 0 : this.vmURL.hashCode();
            int v14 = this.adMarketId == null ? 0 : this.adMarketId.hashCode();
            int v15 = this.notification == null ? 0 : this.notification.hashCode();
            int v16 = this.loadAdUrls == null ? 0 : this.loadAdUrls.hashCode();
            int v17 = this.viewAbility == null ? 0 : this.viewAbility.hashCode();
            int v18 = this.templateURL == null ? 0 : this.templateURL.hashCode();
            int v19 = this.templateType == null ? 0 : this.templateType.hashCode();
            int v20 = this.templateSettings == null ? 0 : this.templateSettings.hashCode();
            int v21 = this.creativeId == null ? 0 : this.creativeId.hashCode();
            int v22 = this.advAppId == null ? 0 : this.advAppId.hashCode();
            int v23 = this.showClose == null ? 0 : this.showClose.hashCode();
            int v24 = this.showCloseIncentivized == null ? 0 : this.showCloseIncentivized.hashCode();
            com.vungle.ads.internal.model.b.b b$b0 = this.adSizeInfo;
            if(b$b0 != null) {
                v = b$b0.hashCode();
            }
            return (((((((((((((((((((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v15) * 0x1F + v16) * 0x1F + v17) * 0x1F + v18) * 0x1F + v19) * 0x1F + v20) * 0x1F + v21) * 0x1F + v22) * 0x1F + v23) * 0x1F + v24) * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "AdUnit(id=" + this.id + ", adType=" + this.adType + ", adSource=" + this.adSource + ", expiry=" + this.expiry + ", deeplinkUrl=" + this.deeplinkUrl + ", clickCoordinatesEnabled=" + this.clickCoordinatesEnabled + ", adLoadOptimizationEnabled=" + this.adLoadOptimizationEnabled + ", templateHeartbeatCheck=" + this.templateHeartbeatCheck + ", info=" + this.info + ", sleep=" + this.sleep + ", errorCode=" + this.errorCode + ", tpat=" + this.tpat + ", vmURL=" + this.vmURL + ", adMarketId=" + this.adMarketId + ", notification=" + this.notification + ", loadAdUrls=" + this.loadAdUrls + ", viewAbility=" + this.viewAbility + ", templateURL=" + this.templateURL + ", templateType=" + this.templateType + ", templateSettings=" + this.templateSettings + ", creativeId=" + this.creativeId + ", advAppId=" + this.advAppId + ", showClose=" + this.showClose + ", showCloseIncentivized=" + this.showCloseIncentivized + ", adSizeInfo=" + this.adSizeInfo + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.b.c b$c0, @l d d0, @l f f0) {
            L.p(b$c0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || b$c0.id != null) {
                d0.y(f0, 0, N0.a, b$c0.id);
            }
            if(d0.q(f0, 1) || b$c0.adType != null) {
                d0.y(f0, 1, N0.a, b$c0.adType);
            }
            if(d0.q(f0, 2) || b$c0.adSource != null) {
                d0.y(f0, 2, N0.a, b$c0.adSource);
            }
            if(d0.q(f0, 3) || b$c0.expiry != null) {
                d0.y(f0, 3, W.a, b$c0.expiry);
            }
            if(d0.q(f0, 4) || b$c0.deeplinkUrl != null) {
                d0.y(f0, 4, N0.a, b$c0.deeplinkUrl);
            }
            if(d0.q(f0, 5) || b$c0.clickCoordinatesEnabled != null) {
                d0.y(f0, 5, kotlinx.serialization.internal.i.a, b$c0.clickCoordinatesEnabled);
            }
            if(d0.q(f0, 6) || b$c0.adLoadOptimizationEnabled != null) {
                d0.y(f0, 6, kotlinx.serialization.internal.i.a, b$c0.adLoadOptimizationEnabled);
            }
            if(d0.q(f0, 7) || b$c0.templateHeartbeatCheck != null) {
                d0.y(f0, 7, kotlinx.serialization.internal.i.a, b$c0.templateHeartbeatCheck);
            }
            if(d0.q(f0, 8) || b$c0.info != null) {
                d0.y(f0, 8, N0.a, b$c0.info);
            }
            if(d0.q(f0, 9) || b$c0.sleep != null) {
                d0.y(f0, 9, W.a, b$c0.sleep);
            }
            if(d0.q(f0, 10) || b$c0.errorCode != null) {
                d0.y(f0, 10, W.a, b$c0.errorCode);
            }
            if(d0.q(f0, 11) || b$c0.tpat != null) {
                d0.y(f0, 11, com.vungle.ads.internal.model.b.h.INSTANCE, b$c0.tpat);
            }
            if(d0.q(f0, 12) || b$c0.vmURL != null) {
                d0.y(f0, 12, N0.a, b$c0.vmURL);
            }
            if(d0.q(f0, 13) || b$c0.adMarketId != null) {
                d0.y(f0, 13, N0.a, b$c0.adMarketId);
            }
            if(d0.q(f0, 14) || b$c0.notification != null) {
                d0.y(f0, 14, new kotlinx.serialization.internal.f(N0.a), b$c0.notification);
            }
            if(d0.q(f0, 15) || b$c0.loadAdUrls != null) {
                d0.y(f0, 15, new kotlinx.serialization.internal.f(N0.a), b$c0.loadAdUrls);
            }
            if(d0.q(f0, 16) || b$c0.viewAbility != null) {
                d0.y(f0, 16, com.vungle.ads.internal.model.b.i.a.INSTANCE, b$c0.viewAbility);
            }
            if(d0.q(f0, 17) || b$c0.templateURL != null) {
                d0.y(f0, 17, N0.a, b$c0.templateURL);
            }
            if(d0.q(f0, 18) || b$c0.templateType != null) {
                d0.y(f0, 18, N0.a, b$c0.templateType);
            }
            if(d0.q(f0, 19) || b$c0.templateSettings != null) {
                d0.y(f0, 19, com.vungle.ads.internal.model.b.g.a.INSTANCE, b$c0.templateSettings);
            }
            if(d0.q(f0, 20) || b$c0.creativeId != null) {
                d0.y(f0, 20, N0.a, b$c0.creativeId);
            }
            if(d0.q(f0, 21) || b$c0.advAppId != null) {
                d0.y(f0, 21, N0.a, b$c0.advAppId);
            }
            if(d0.q(f0, 22) || (b$c0.showClose == null || ((int)b$c0.showClose) != 0)) {
                d0.y(f0, 22, W.a, b$c0.showClose);
            }
            if(d0.q(f0, 23) || (b$c0.showCloseIncentivized == null || ((int)b$c0.showCloseIncentivized) != 0)) {
                d0.y(f0, 23, W.a, b$c0.showCloseIncentivized);
            }
            if(d0.q(f0, 24) || b$c0.adSizeInfo != null) {
                d0.y(f0, 24, com.vungle.ads.internal.model.b.b.a.INSTANCE, b$c0.adSizeInfo);
            }
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.b.d {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.b.d.a implements M {
            @l
            public static final com.vungle.ads.internal.model.b.d.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.b.d.a b$d$a0 = new com.vungle.ads.internal.model.b.d.a();
                com.vungle.ads.internal.model.b.d.a.INSTANCE = b$d$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.AdPayload.CacheableReplacement", b$d$a0, 3);
                w00.k("url", true);
                w00.k("extension", true);
                w00.k("required", true);
                com.vungle.ads.internal.model.b.d.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(kotlinx.serialization.internal.i.a)};
            }

            @l
            public com.vungle.ads.internal.model.b.d deserialize(@l e e0) {
                int v;
                Object object3;
                Object object2;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                kotlinx.serialization.encoding.c c0 = e0.b(f0);
                Object object0 = null;
                if(c0.k()) {
                    Object object1 = c0.j(f0, 0, N0.a, null);
                    object2 = c0.j(f0, 1, N0.a, null);
                    object3 = c0.j(f0, 2, kotlinx.serialization.internal.i.a, null);
                    object0 = object1;
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
                                object0 = c0.j(f0, 0, N0.a, object0);
                                v1 |= 1;
                                break;
                            }
                            case 1: {
                                object4 = c0.j(f0, 1, N0.a, object4);
                                v1 |= 2;
                                break;
                            }
                            case 2: {
                                object5 = c0.j(f0, 2, kotlinx.serialization.internal.i.a, object5);
                                v1 |= 4;
                                break;
                            }
                            default: {
                                throw new E(v2);
                            }
                        }
                    }
                    v = v1;
                    object2 = object4;
                    object3 = object5;
                }
                c0.c(f0);
                return new com.vungle.ads.internal.model.b.d(v, ((String)object0), ((String)object2), ((Boolean)object3), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.b.d.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.b.d b$d0) {
                L.p(g0, "encoder");
                L.p(b$d0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                com.vungle.ads.internal.model.b.d.write$Self(b$d0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.b.d)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.b.d.b {
            private com.vungle.ads.internal.model.b.d.b() {
            }

            public com.vungle.ads.internal.model.b.d.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.b.d.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.b.d.b Companion;
        @y4.m
        private final String extension;
        @y4.m
        private final Boolean required;
        @y4.m
        private final String url;

        static {
            com.vungle.ads.internal.model.b.d.Companion = new com.vungle.ads.internal.model.b.d.b(null);
        }

        public com.vungle.ads.internal.model.b.d() {
            this(null, null, null, 7, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.b.d(int v, String s, String s1, Boolean boolean0, H0 h00) {
            this.url = (v & 1) == 0 ? null : s;
            this.extension = (v & 2) == 0 ? null : s1;
            if((v & 4) == 0) {
                this.required = null;
                return;
            }
            this.required = boolean0;
        }

        public com.vungle.ads.internal.model.b.d(@y4.m String s, @y4.m String s1, @y4.m Boolean boolean0) {
            this.url = s;
            this.extension = s1;
            this.required = boolean0;
        }

        public com.vungle.ads.internal.model.b.d(String s, String s1, Boolean boolean0, int v, w w0) {
            if((v & 1) != 0) {
                s = null;
            }
            if((v & 2) != 0) {
                s1 = null;
            }
            if((v & 4) != 0) {
                boolean0 = null;
            }
            this(s, s1, boolean0);
        }

        @y4.m
        public final String component1() {
            return this.url;
        }

        @y4.m
        public final String component2() {
            return this.extension;
        }

        @y4.m
        public final Boolean component3() {
            return this.required;
        }

        @l
        public final com.vungle.ads.internal.model.b.d copy(@y4.m String s, @y4.m String s1, @y4.m Boolean boolean0) {
            return new com.vungle.ads.internal.model.b.d(s, s1, boolean0);
        }

        public static com.vungle.ads.internal.model.b.d copy$default(com.vungle.ads.internal.model.b.d b$d0, String s, String s1, Boolean boolean0, int v, Object object0) {
            if((v & 1) != 0) {
                s = b$d0.url;
            }
            if((v & 2) != 0) {
                s1 = b$d0.extension;
            }
            if((v & 4) != 0) {
                boolean0 = b$d0.required;
            }
            return b$d0.copy(s, s1, boolean0);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.vungle.ads.internal.model.b.d)) {
                return false;
            }
            if(!L.g(this.url, ((com.vungle.ads.internal.model.b.d)object0).url)) {
                return false;
            }
            return L.g(this.extension, ((com.vungle.ads.internal.model.b.d)object0).extension) ? L.g(this.required, ((com.vungle.ads.internal.model.b.d)object0).required) : false;
        }

        @y4.m
        public final String getExtension() {
            return this.extension;
        }

        @y4.m
        public final Boolean getRequired() {
            return this.required;
        }

        @y4.m
        public final String getUrl() {
            return this.url;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.url == null ? 0 : this.url.hashCode();
            int v2 = this.extension == null ? 0 : this.extension.hashCode();
            Boolean boolean0 = this.required;
            if(boolean0 != null) {
                v = boolean0.hashCode();
            }
            return (v1 * 0x1F + v2) * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "CacheableReplacement(url=" + this.url + ", extension=" + this.extension + ", required=" + this.required + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.b.d b$d0, @l d d0, @l f f0) {
            L.p(b$d0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || b$d0.url != null) {
                d0.y(f0, 0, N0.a, b$d0.url);
            }
            if(d0.q(f0, 1) || b$d0.extension != null) {
                d0.y(f0, 1, N0.a, b$d0.extension);
            }
            if(d0.q(f0, 2) || b$d0.required != null) {
                d0.y(f0, 2, kotlinx.serialization.internal.i.a, b$d0.required);
            }
        }
    }

    public static final class com.vungle.ads.internal.model.b.e {
        private com.vungle.ads.internal.model.b.e() {
        }

        public com.vungle.ads.internal.model.b.e(w w0) {
        }

        @l
        public final i serializer() {
            return a.INSTANCE;
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.b.f {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.b.f.a implements M {
            @l
            public static final com.vungle.ads.internal.model.b.f.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.b.f.a b$f$a0 = new com.vungle.ads.internal.model.b.f.a();
                com.vungle.ads.internal.model.b.f.a.INSTANCE = b$f$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.AdPayload.PlacementAdUnit", b$f$a0, 2);
                w00.k("placement_reference_id", true);
                w00.k("ad_markup", true);
                com.vungle.ads.internal.model.b.f.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(N0.a), P3.a.u(com.vungle.ads.internal.model.b.c.a.INSTANCE)};
            }

            @l
            public com.vungle.ads.internal.model.b.f deserialize(@l e e0) {
                int v;
                Object object1;
                Object object0;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                kotlinx.serialization.encoding.c c0 = e0.b(f0);
                if(c0.k()) {
                    object0 = c0.j(f0, 0, N0.a, null);
                    object1 = c0.j(f0, 1, com.vungle.ads.internal.model.b.c.a.INSTANCE, null);
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
                                object0 = c0.j(f0, 0, N0.a, object0);
                                v1 |= 1;
                                break;
                            }
                            case 1: {
                                object2 = c0.j(f0, 1, com.vungle.ads.internal.model.b.c.a.INSTANCE, object2);
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
                return new com.vungle.ads.internal.model.b.f(v, ((String)object0), ((com.vungle.ads.internal.model.b.c)object1), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.b.f.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.b.f b$f0) {
                L.p(g0, "encoder");
                L.p(b$f0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                com.vungle.ads.internal.model.b.f.write$Self(b$f0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.b.f)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.b.f.b {
            private com.vungle.ads.internal.model.b.f.b() {
            }

            public com.vungle.ads.internal.model.b.f.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.b.f.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.b.f.b Companion;
        @y4.m
        private final com.vungle.ads.internal.model.b.c adMarkup;
        @y4.m
        private final String placementReferenceId;

        static {
            com.vungle.ads.internal.model.b.f.Companion = new com.vungle.ads.internal.model.b.f.b(null);
        }

        public com.vungle.ads.internal.model.b.f() {
            this(null, null, 3, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.b.f(int v, @t("placement_reference_id") String s, @t("ad_markup") com.vungle.ads.internal.model.b.c b$c0, H0 h00) {
            this.placementReferenceId = (v & 1) == 0 ? null : s;
            if((v & 2) == 0) {
                this.adMarkup = null;
                return;
            }
            this.adMarkup = b$c0;
        }

        public com.vungle.ads.internal.model.b.f(@y4.m String s, @y4.m com.vungle.ads.internal.model.b.c b$c0) {
            this.placementReferenceId = s;
            this.adMarkup = b$c0;
        }

        public com.vungle.ads.internal.model.b.f(String s, com.vungle.ads.internal.model.b.c b$c0, int v, w w0) {
            if((v & 1) != 0) {
                s = null;
            }
            if((v & 2) != 0) {
                b$c0 = null;
            }
            this(s, b$c0);
        }

        @y4.m
        public final String component1() {
            return this.placementReferenceId;
        }

        @y4.m
        public final com.vungle.ads.internal.model.b.c component2() {
            return this.adMarkup;
        }

        @l
        public final com.vungle.ads.internal.model.b.f copy(@y4.m String s, @y4.m com.vungle.ads.internal.model.b.c b$c0) {
            return new com.vungle.ads.internal.model.b.f(s, b$c0);
        }

        public static com.vungle.ads.internal.model.b.f copy$default(com.vungle.ads.internal.model.b.f b$f0, String s, com.vungle.ads.internal.model.b.c b$c0, int v, Object object0) {
            if((v & 1) != 0) {
                s = b$f0.placementReferenceId;
            }
            if((v & 2) != 0) {
                b$c0 = b$f0.adMarkup;
            }
            return b$f0.copy(s, b$c0);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.vungle.ads.internal.model.b.f)) {
                return false;
            }
            return L.g(this.placementReferenceId, ((com.vungle.ads.internal.model.b.f)object0).placementReferenceId) ? L.g(this.adMarkup, ((com.vungle.ads.internal.model.b.f)object0).adMarkup) : false;
        }

        @y4.m
        public final com.vungle.ads.internal.model.b.c getAdMarkup() {
            return this.adMarkup;
        }

        @t("ad_markup")
        public static void getAdMarkup$annotations() {
        }

        @y4.m
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        @t("placement_reference_id")
        public static void getPlacementReferenceId$annotations() {
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.placementReferenceId == null ? 0 : this.placementReferenceId.hashCode();
            com.vungle.ads.internal.model.b.c b$c0 = this.adMarkup;
            if(b$c0 != null) {
                v = b$c0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.b.f b$f0, @l d d0, @l f f0) {
            L.p(b$f0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || b$f0.placementReferenceId != null) {
                d0.y(f0, 0, N0.a, b$f0.placementReferenceId);
            }
            if(d0.q(f0, 1) || b$f0.adMarkup != null) {
                d0.y(f0, 1, com.vungle.ads.internal.model.b.c.a.INSTANCE, b$f0.adMarkup);
            }
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.b.g {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.b.g.a implements M {
            @l
            public static final com.vungle.ads.internal.model.b.g.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.b.g.a b$g$a0 = new com.vungle.ads.internal.model.b.g.a();
                com.vungle.ads.internal.model.b.g.a.INSTANCE = b$g$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.AdPayload.TemplateSettings", b$g$a0, 2);
                w00.k("normal_replacements", true);
                w00.k("cacheable_replacements", true);
                com.vungle.ads.internal.model.b.g.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(new b0(N0.a, N0.a)), P3.a.u(new b0(N0.a, com.vungle.ads.internal.model.b.d.a.INSTANCE))};
            }

            @l
            public com.vungle.ads.internal.model.b.g deserialize(@l e e0) {
                int v;
                Object object1;
                Object object0;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                kotlinx.serialization.encoding.c c0 = e0.b(f0);
                if(c0.k()) {
                    object0 = c0.j(f0, 0, new b0(N0.a, N0.a), null);
                    object1 = c0.j(f0, 1, new b0(N0.a, com.vungle.ads.internal.model.b.d.a.INSTANCE), null);
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
                                object0 = c0.j(f0, 0, new b0(N0.a, N0.a), object0);
                                v1 |= 1;
                                break;
                            }
                            case 1: {
                                object2 = c0.j(f0, 1, new b0(N0.a, com.vungle.ads.internal.model.b.d.a.INSTANCE), object2);
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
                return new com.vungle.ads.internal.model.b.g(v, ((Map)object0), ((Map)object1), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.b.g.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.b.g b$g0) {
                L.p(g0, "encoder");
                L.p(b$g0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                com.vungle.ads.internal.model.b.g.write$Self(b$g0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.b.g)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.b.g.b {
            private com.vungle.ads.internal.model.b.g.b() {
            }

            public com.vungle.ads.internal.model.b.g.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.b.g.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.b.g.b Companion;
        @y4.m
        private final Map cacheableReplacements;
        @y4.m
        private final Map normalReplacements;

        static {
            com.vungle.ads.internal.model.b.g.Companion = new com.vungle.ads.internal.model.b.g.b(null);
        }

        public com.vungle.ads.internal.model.b.g() {
            this(null, null, 3, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.b.g(int v, @t("normal_replacements") Map map0, @t("cacheable_replacements") Map map1, H0 h00) {
            this.normalReplacements = (v & 1) == 0 ? null : map0;
            if((v & 2) == 0) {
                this.cacheableReplacements = null;
                return;
            }
            this.cacheableReplacements = map1;
        }

        public com.vungle.ads.internal.model.b.g(@y4.m Map map0, @y4.m Map map1) {
            this.normalReplacements = map0;
            this.cacheableReplacements = map1;
        }

        public com.vungle.ads.internal.model.b.g(Map map0, Map map1, int v, w w0) {
            if((v & 1) != 0) {
                map0 = null;
            }
            if((v & 2) != 0) {
                map1 = null;
            }
            this(map0, map1);
        }

        @y4.m
        public final Map component1() {
            return this.normalReplacements;
        }

        @y4.m
        public final Map component2() {
            return this.cacheableReplacements;
        }

        @l
        public final com.vungle.ads.internal.model.b.g copy(@y4.m Map map0, @y4.m Map map1) {
            return new com.vungle.ads.internal.model.b.g(map0, map1);
        }

        public static com.vungle.ads.internal.model.b.g copy$default(com.vungle.ads.internal.model.b.g b$g0, Map map0, Map map1, int v, Object object0) {
            if((v & 1) != 0) {
                map0 = b$g0.normalReplacements;
            }
            if((v & 2) != 0) {
                map1 = b$g0.cacheableReplacements;
            }
            return b$g0.copy(map0, map1);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.vungle.ads.internal.model.b.g)) {
                return false;
            }
            return L.g(this.normalReplacements, ((com.vungle.ads.internal.model.b.g)object0).normalReplacements) ? L.g(this.cacheableReplacements, ((com.vungle.ads.internal.model.b.g)object0).cacheableReplacements) : false;
        }

        @y4.m
        public final Map getCacheableReplacements() {
            return this.cacheableReplacements;
        }

        @t("cacheable_replacements")
        public static void getCacheableReplacements$annotations() {
        }

        @y4.m
        public final Map getNormalReplacements() {
            return this.normalReplacements;
        }

        @t("normal_replacements")
        public static void getNormalReplacements$annotations() {
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.normalReplacements == null ? 0 : this.normalReplacements.hashCode();
            Map map0 = this.cacheableReplacements;
            if(map0 != null) {
                v = map0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "TemplateSettings(normalReplacements=" + this.normalReplacements + ", cacheableReplacements=" + this.cacheableReplacements + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.b.g b$g0, @l d d0, @l f f0) {
            L.p(b$g0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || b$g0.normalReplacements != null) {
                d0.y(f0, 0, new b0(N0.a, N0.a), b$g0.normalReplacements);
            }
            if(d0.q(f0, 1) || b$g0.cacheableReplacements != null) {
                d0.y(f0, 1, new b0(N0.a, com.vungle.ads.internal.model.b.d.a.INSTANCE), b$g0.cacheableReplacements);
            }
        }
    }

    public static final class com.vungle.ads.internal.model.b.h extends kotlinx.serialization.json.E {
        @l
        public static final com.vungle.ads.internal.model.b.h INSTANCE;

        static {
            com.vungle.ads.internal.model.b.h.INSTANCE = new com.vungle.ads.internal.model.b.h();
        }

        private com.vungle.ads.internal.model.b.h() {
            super(P3.a.l(P3.a.J(u0.a), P3.a.i(P3.a.J(u0.a))));
        }

        @Override  // kotlinx.serialization.json.E
        @l
        protected kotlinx.serialization.json.l transformDeserialize(@l kotlinx.serialization.json.l l0) {
            L.p(l0, "element");
            y y0 = kotlinx.serialization.json.n.q(l0);
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            for(Object object0: y0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(!L.g(((String)map$Entry0.getKey()), "moat")) {
                    linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                }
            }
            return new y(linkedHashMap0);
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.b.i {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.b.i.a implements M {
            @l
            public static final com.vungle.ads.internal.model.b.i.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.b.i.a b$i$a0 = new com.vungle.ads.internal.model.b.i.a();
                com.vungle.ads.internal.model.b.i.a.INSTANCE = b$i$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.AdPayload.ViewAbility", b$i$a0, 1);
                w00.k("om", true);
                com.vungle.ads.internal.model.b.i.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(com.vungle.ads.internal.model.b.j.a.INSTANCE)};
            }

            @l
            public com.vungle.ads.internal.model.b.i deserialize(@l e e0) {
                Object object0;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                kotlinx.serialization.encoding.c c0 = e0.b(f0);
                int v = 1;
                if(c0.k()) {
                    object0 = c0.j(f0, 0, com.vungle.ads.internal.model.b.j.a.INSTANCE, null);
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
                                object0 = c0.j(f0, 0, com.vungle.ads.internal.model.b.j.a.INSTANCE, object0);
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
                return new com.vungle.ads.internal.model.b.i(v, ((j)object0), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.b.i.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.b.i b$i0) {
                L.p(g0, "encoder");
                L.p(b$i0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                com.vungle.ads.internal.model.b.i.write$Self(b$i0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.b.i)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.b.i.b {
            private com.vungle.ads.internal.model.b.i.b() {
            }

            public com.vungle.ads.internal.model.b.i.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.b.i.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.b.i.b Companion;
        @y4.m
        private final j om;

        static {
            com.vungle.ads.internal.model.b.i.Companion = new com.vungle.ads.internal.model.b.i.b(null);
        }

        public com.vungle.ads.internal.model.b.i() {
            this(null, 1, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.b.i(int v, j b$j0, H0 h00) {
            if((v & 1) == 0) {
                this.om = null;
                return;
            }
            this.om = b$j0;
        }

        public com.vungle.ads.internal.model.b.i(@y4.m j b$j0) {
            this.om = b$j0;
        }

        public com.vungle.ads.internal.model.b.i(j b$j0, int v, w w0) {
            if((v & 1) != 0) {
                b$j0 = null;
            }
            this(b$j0);
        }

        @y4.m
        public final j component1() {
            return this.om;
        }

        @l
        public final com.vungle.ads.internal.model.b.i copy(@y4.m j b$j0) {
            return new com.vungle.ads.internal.model.b.i(b$j0);
        }

        public static com.vungle.ads.internal.model.b.i copy$default(com.vungle.ads.internal.model.b.i b$i0, j b$j0, int v, Object object0) {
            if((v & 1) != 0) {
                b$j0 = b$i0.om;
            }
            return b$i0.copy(b$j0);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof com.vungle.ads.internal.model.b.i ? L.g(this.om, ((com.vungle.ads.internal.model.b.i)object0).om) : false;
        }

        @y4.m
        public final j getOm() {
            return this.om;
        }

        @Override
        public int hashCode() {
            return this.om == null ? 0 : this.om.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "ViewAbility(om=" + this.om + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.b.i b$i0, @l d d0, @l f f0) {
            L.p(b$i0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || b$i0.om != null) {
                d0.y(f0, 0, com.vungle.ads.internal.model.b.j.a.INSTANCE, b$i0.om);
            }
        }
    }

    @u
    public static final class j {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.b.j.a implements M {
            @l
            public static final com.vungle.ads.internal.model.b.j.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.b.j.a b$j$a0 = new com.vungle.ads.internal.model.b.j.a();
                com.vungle.ads.internal.model.b.j.a.INSTANCE = b$j$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo", b$j$a0, 2);
                w00.k("is_enabled", true);
                w00.k("extra_vast", true);
                com.vungle.ads.internal.model.b.j.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(N0.a)};
            }

            @l
            public j deserialize(@l e e0) {
                int v;
                Object object1;
                Object object0;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                kotlinx.serialization.encoding.c c0 = e0.b(f0);
                if(c0.k()) {
                    object0 = c0.j(f0, 0, kotlinx.serialization.internal.i.a, null);
                    object1 = c0.j(f0, 1, N0.a, null);
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
                                object2 = c0.j(f0, 1, N0.a, object2);
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
                return new j(v, ((Boolean)object0), ((String)object1), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.b.j.a.descriptor;
            }

            public void serialize(@l g g0, @l j b$j0) {
                L.p(g0, "encoder");
                L.p(b$j0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                j.write$Self(b$j0, d0, f0);
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

        public static final class com.vungle.ads.internal.model.b.j.b {
            private com.vungle.ads.internal.model.b.j.b() {
            }

            public com.vungle.ads.internal.model.b.j.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.b.j.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.b.j.b Companion;
        @y4.m
        private final String extraVast;
        @y4.m
        private final Boolean isEnabled;

        static {
            j.Companion = new com.vungle.ads.internal.model.b.j.b(null);
        }

        public j() {
            this(null, null, 3, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public j(int v, @t("is_enabled") Boolean boolean0, @t("extra_vast") String s, H0 h00) {
            this.isEnabled = (v & 1) == 0 ? null : boolean0;
            if((v & 2) == 0) {
                this.extraVast = null;
                return;
            }
            this.extraVast = s;
        }

        public j(@y4.m Boolean boolean0, @y4.m String s) {
            this.isEnabled = boolean0;
            this.extraVast = s;
        }

        public j(Boolean boolean0, String s, int v, w w0) {
            if((v & 1) != 0) {
                boolean0 = null;
            }
            if((v & 2) != 0) {
                s = null;
            }
            this(boolean0, s);
        }

        @y4.m
        public final Boolean component1() {
            return this.isEnabled;
        }

        @y4.m
        public final String component2() {
            return this.extraVast;
        }

        @l
        public final j copy(@y4.m Boolean boolean0, @y4.m String s) {
            return new j(boolean0, s);
        }

        public static j copy$default(j b$j0, Boolean boolean0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                boolean0 = b$j0.isEnabled;
            }
            if((v & 2) != 0) {
                s = b$j0.extraVast;
            }
            return b$j0.copy(boolean0, s);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof j)) {
                return false;
            }
            return L.g(this.isEnabled, ((j)object0).isEnabled) ? L.g(this.extraVast, ((j)object0).extraVast) : false;
        }

        @y4.m
        public final String getExtraVast() {
            return this.extraVast;
        }

        @t("extra_vast")
        public static void getExtraVast$annotations() {
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.isEnabled == null ? 0 : this.isEnabled.hashCode();
            String s = this.extraVast;
            if(s != null) {
                v = s.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @y4.m
        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        @t("is_enabled")
        public static void isEnabled$annotations() {
        }

        @Override
        @l
        public String toString() {
            return "ViewAbilityInfo(isEnabled=" + this.isEnabled + ", extraVast=" + this.extraVast + ')';
        }

        @n
        public static final void write$Self(@l j b$j0, @l d d0, @l f f0) {
            L.p(b$j0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || b$j0.isEnabled != null) {
                d0.y(f0, 0, kotlinx.serialization.internal.i.a, b$j0.isEnabled);
            }
            if(d0.q(f0, 1) || b$j0.extraVast != null) {
                d0.y(f0, 1, N0.a, b$j0.extraVast);
            }
        }
    }

    @l
    public static final com.vungle.ads.internal.model.b.e Companion = null;
    @l
    public static final String FILE_SCHEME = "file://";
    @l
    public static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";
    @l
    public static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";
    @l
    public static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";
    @l
    public static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";
    @l
    public static final String KEY_TEMPLATE = "template";
    @l
    public static final String KEY_VM = "vmURL";
    @l
    public static final String TPAT_CLICK_COORDINATES_URLS = "video.clickCoordinates";
    @l
    private static final String UNKNOWN = "unknown";
    @y4.m
    private com.vungle.ads.d adConfig;
    @y4.m
    private final List ads;
    @y4.m
    private File assetDirectory;
    private boolean assetsFullyDownloaded;
    @y4.m
    private final h config;
    @l
    private Map incentivizedTextSettings;
    @y4.m
    private o logEntry;
    @l
    private ConcurrentHashMap mraidFiles;

    static {
        b.Companion = new com.vungle.ads.internal.model.b.e(null);
    }

    public b() {
        this(null, null, 3, null);
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public b(int v, @t("ads") List list0, @t("config") h h0, @kotlinx.serialization.b ConcurrentHashMap concurrentHashMap0, @VisibleForTesting Map map0, boolean z, H0 h00) {
        this.ads = (v & 1) == 0 ? null : list0;
        this.config = (v & 2) == 0 ? null : h0;
        this.mraidFiles = (v & 4) == 0 ? new ConcurrentHashMap() : concurrentHashMap0;
        this.incentivizedTextSettings = (v & 8) == 0 ? new HashMap() : map0;
        this.assetsFullyDownloaded = (v & 16) == 0 ? false : z;
        this.adConfig = null;
        this.logEntry = null;
        this.assetDirectory = null;
    }

    public b(@y4.m List list0, @y4.m h h0) {
        this.ads = list0;
        this.config = h0;
        this.mraidFiles = new ConcurrentHashMap();
        this.incentivizedTextSettings = new HashMap();
    }

    public b(List list0, h h0, int v, w w0) {
        if((v & 1) != 0) {
            list0 = null;
        }
        if((v & 2) != 0) {
            h0 = null;
        }
        this(list0, h0);
    }

    public final int adHeight() {
        com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
        if(b$c0 != null) {
            com.vungle.ads.internal.model.b.b b$b0 = b$c0.getAdSizeInfo();
            if(b$b0 != null) {
                Integer integer0 = b$b0.getHeight();
                return integer0 == null ? 0 : ((int)integer0);
            }
        }
        return 0;
    }

    public final boolean adLoadOptimizationEnabled() {
        com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
        if(b$c0 != null) {
            Boolean boolean0 = b$c0.getAdLoadOptimizationEnabled();
            return boolean0 == null ? true : boolean0.booleanValue();
        }
        return true;
    }

    @y4.m
    public final com.vungle.ads.internal.model.b.c adUnit() {
        return this.getAdMarkup();
    }

    public final int adWidth() {
        com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
        if(b$c0 != null) {
            com.vungle.ads.internal.model.b.b b$b0 = b$c0.getAdSizeInfo();
            if(b$b0 != null) {
                Integer integer0 = b$b0.getWidth();
                return integer0 == null ? 0 : ((int)integer0);
            }
        }
        return 0;
    }

    @y4.m
    public final String advAppId() {
        com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
        return b$c0 == null ? null : b$c0.getAdvAppId();
    }

    private final String complexReplace(String s, String s1, String s2) {
        String s3 = Pattern.quote(s1);
        L.o(s3, "quote(oldValue)");
        return new r(s3).m(s, this.valueOrEmpty(s2));
    }

    @y4.m
    public final h config() {
        return this.config;
    }

    @l
    public final y createMRAIDArgs() {
        Map map0 = this.getMRAIDArgsInMap();
        z z0 = new z();
        for(Object object0: map0.entrySet()) {
            kotlinx.serialization.json.m.k(z0, ((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        return z0.a();
    }

    @y4.m
    public final String eventId() {
        com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
        return b$c0 == null ? null : b$c0.getId();
    }

    private final com.vungle.ads.internal.model.b.f getAd() {
        return this.ads == null || this.ads.isEmpty() ? null : ((com.vungle.ads.internal.model.b.f)this.ads.get(0));
    }

    @y4.m
    public final com.vungle.ads.d getAdConfig() {
        return this.adConfig;
    }

    @D
    public static void getAdConfig$annotations() {
    }

    private final com.vungle.ads.internal.model.b.c getAdMarkup() {
        com.vungle.ads.internal.model.b.f b$f0 = this.getAd();
        return b$f0 == null ? null : b$f0.getAdMarkup();
    }

    @y4.m
    public final String getAdSource() {
        com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
        return b$c0 == null ? null : b$c0.getAdSource();
    }

    @t("ads")
    private static void getAds$annotations() {
    }

    @y4.m
    public final File getAssetDirectory() {
        return this.assetDirectory;
    }

    @D
    public static void getAssetDirectory$annotations() {
    }

    public final boolean getAssetsFullyDownloaded() {
        return this.assetsFullyDownloaded;
    }

    @t("config")
    private static void getConfig$annotations() {
    }

    @l
    public final String getCreativeId() [...] // 潜在的解密器

    @l
    public final List getDownloadableAssets(@l File file0) {
        public static final class com.vungle.ads.internal.model.b.k implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(Boolean.valueOf(((com.vungle.ads.internal.model.a)object1).isRequired()), Boolean.valueOf(((com.vungle.ads.internal.model.a)object0).isRequired()));
            }
        }

        L.p(file0, "dir");
        this.assetDirectory = file0;
        List list0 = new ArrayList();
        if(!this.isNativeTemplateType()) {
            com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
            if(b$c0 == null) {
            label_13:
                com.vungle.ads.internal.model.b.c b$c1 = this.getAdMarkup();
                if(b$c1 != null) {
                    String s2 = b$c1.getTemplateURL();
                    if(s2 != null && com.vungle.ads.internal.util.h.INSTANCE.isValidUrl(s2)) {
                        String s3 = new File(file0, "template").getAbsolutePath();
                        L.o(s3, "filePath");
                        list0.add(new com.vungle.ads.internal.model.a("template", s2, s3, com.vungle.ads.internal.model.a.a.ZIP, true));
                    }
                }
            }
            else {
                String s = b$c0.getVmURL();
                if(s == null) {
                    goto label_13;
                }
                else if(com.vungle.ads.internal.util.h.INSTANCE.isValidUrl(s)) {
                    String s1 = new File(file0, "index.html").getAbsolutePath();
                    L.o(s1, "filePath");
                    list0.add(new com.vungle.ads.internal.model.a("vmURL", s, s1, com.vungle.ads.internal.model.a.a.ASSET, true));
                }
            }
        }
        com.vungle.ads.internal.model.b.c b$c2 = this.getAdMarkup();
        if(b$c2 != null) {
            com.vungle.ads.internal.model.b.g b$g0 = b$c2.getTemplateSettings();
            if(b$g0 != null) {
                Map map0 = b$g0.getCacheableReplacements();
                if(map0 != null) {
                    for(Object object0: map0.entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object0;
                        com.vungle.ads.internal.model.b.d b$d0 = (com.vungle.ads.internal.model.b.d)map$Entry0.getValue();
                        if(b$d0.getUrl() != null) {
                            com.vungle.ads.internal.util.h h0 = com.vungle.ads.internal.util.h.INSTANCE;
                            if(h0.isValidUrl(b$d0.getUrl())) {
                                Boolean boolean0 = b$d0.getRequired();
                                boolean z = boolean0 == null ? false : boolean0.booleanValue();
                                boolean z1 = this.isNativeTemplateType() || !this.adLoadOptimizationEnabled();
                                String s4 = new File(file0, h0.guessFileName(b$d0.getUrl(), b$d0.getExtension())).getAbsolutePath();
                                Object object1 = map$Entry0.getKey();
                                L.o(s4, "filePath");
                                list0.add(new com.vungle.ads.internal.model.a(((String)object1), b$d0.getUrl(), s4, com.vungle.ads.internal.model.a.a.ASSET, z1));
                            }
                        }
                    }
                }
            }
        }
        if(list0.size() > 1) {
            kotlin.collections.u.p0(list0, new com.vungle.ads.internal.model.b.k());
        }
        return list0;
    }

    @l
    public final Map getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    @VisibleForTesting
    public static void getIncentivizedTextSettings$annotations() {
    }

    @y4.m
    public final o getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    @D
    public static void getLogEntry$vungle_ads_release$annotations() {
    }

    @l
    public final Map getMRAIDArgsInMap() {
        com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
        if((b$c0 == null ? null : b$c0.getTemplateSettings()) == null) {
            throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!");
        }
        Map map0 = new LinkedHashMap();
        com.vungle.ads.internal.model.b.c b$c1 = this.getAdMarkup();
        if(b$c1 != null) {
            com.vungle.ads.internal.model.b.g b$g0 = b$c1.getTemplateSettings();
            if(b$g0 != null) {
                Map map1 = b$g0.getNormalReplacements();
                if(map1 != null) {
                    map0.putAll(map1);
                }
            }
        }
        com.vungle.ads.internal.model.b.c b$c2 = this.getAdMarkup();
        if(b$c2 != null) {
            com.vungle.ads.internal.model.b.g b$g1 = b$c2.getTemplateSettings();
            if(b$g1 != null) {
                Map map2 = b$g1.getCacheableReplacements();
                if(map2 != null) {
                    for(Object object0: map2.entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object0;
                        String s = ((com.vungle.ads.internal.model.b.d)map$Entry0.getValue()).getUrl();
                        if(s != null) {
                            map0.put(map$Entry0.getKey(), s);
                        }
                    }
                }
            }
        }
        if(!this.mraidFiles.isEmpty()) {
            map0.putAll(this.mraidFiles);
        }
        if(!this.incentivizedTextSettings.isEmpty()) {
            map0.putAll(this.incentivizedTextSettings);
        }
        return map0;
    }

    @kotlinx.serialization.b
    private static void getMraidFiles$annotations() {
    }

    public final int getShowCloseDelay(@y4.m Boolean boolean0) {
        if(L.g(boolean0, Boolean.TRUE)) {
            com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
            if(b$c0 != null) {
                Integer integer0 = b$c0.getShowCloseIncentivized();
                return integer0 == null ? 0 : integer0.intValue() * 1000;
            }
            return 0;
        }
        com.vungle.ads.internal.model.b.c b$c1 = this.getAdMarkup();
        if(b$c1 != null) {
            Integer integer1 = b$c1.getShowClose();
            return integer1 == null ? 0 : integer1.intValue() * 1000;
        }
        return 0;
    }

    @y4.m
    public final List getTpatUrls(@l String s, @y4.m String s1, @y4.m String s2) {
        ArrayList arrayList0;
        List list0;
        L.p(s, "event");
        com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
        if(b$c0 != null) {
            Map map0 = b$c0.getTpat();
            if(map0 != null && !map0.containsKey(s)) {
                new Z0(com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_TPAT_KEY, "Arbitrary tpat key: " + s).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
                return null;
            }
        }
        com.vungle.ads.internal.model.b.c b$c1 = this.getAdMarkup();
        if(b$c1 == null) {
            list0 = null;
        }
        else {
            Map map1 = b$c1.getTpat();
            list0 = map1 == null ? null : ((List)map1.get(s));
        }
        if(list0 != null && !list0.isEmpty()) {
            switch(s) {
                case "ad.close": {
                    arrayList0 = new ArrayList(kotlin.collections.u.b0(list0, 10));
                    for(Object object3: list0) {
                        arrayList0.add(this.complexReplace(this.complexReplace(((String)object3), "{{{dur}}}", s1), "{{{vol}}}", s2));
                    }
                    return arrayList0;
                }
                case "ad.loadDuration": {
                    arrayList0 = new ArrayList(kotlin.collections.u.b0(list0, 10));
                    for(Object object2: list0) {
                        arrayList0.add(this.complexReplace(((String)object2), "{{{time_dl}}}", s1));
                    }
                    return arrayList0;
                }
                case "checkpoint.0": {
                    arrayList0 = new ArrayList(kotlin.collections.u.b0(list0, 10));
                    for(Object object0: list0) {
                        arrayList0.add(this.complexReplace(this.complexReplace(this.complexReplace(((String)object0), "{{{remote_play}}}", String.valueOf(!this.assetsFullyDownloaded)), "{{{carrier}}}", s1), "{{{vol}}}", s2));
                    }
                    return arrayList0;
                }
                case "deeplink.click": {
                    arrayList0 = new ArrayList(kotlin.collections.u.b0(list0, 10));
                    for(Object object4: list0) {
                        arrayList0.add(this.complexReplace(((String)object4), "{{{is_success}}}", s1));
                    }
                    return arrayList0;
                }
                case "video.length": {
                    arrayList0 = new ArrayList(kotlin.collections.u.b0(list0, 10));
                    for(Object object1: list0) {
                        arrayList0.add(this.complexReplace(((String)object1), "{{{vlen}}}", s1));
                    }
                    return arrayList0;
                }
                default: {
                    return list0;
                }
            }
        }
        new Z0(com.vungle.ads.internal.protos.Sdk.SDKError.b.EMPTY_TPAT_ERROR, "Empty tpat key: " + s).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
        return null;
    }

    public static List getTpatUrls$default(b b0, String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = null;
        }
        return b0.getTpatUrls(s, s1, s2);
    }

    @y4.m
    public final List getWinNotifications() {
        com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
        return b$c0 == null ? null : b$c0.getNotification();
    }

    public final boolean hasExpired() {
        com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
        if(b$c0 != null) {
            Integer integer0 = b$c0.getExpiry();
            return integer0 != null && ((long)integer0.intValue()) < System.currentTimeMillis() / 1000L;
        }
        return false;
    }

    public final boolean heartbeatEnabled() {
        com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
        if(b$c0 != null) {
            Boolean boolean0 = b$c0.getTemplateHeartbeatCheck();
            return boolean0 == null ? false : boolean0.booleanValue();
        }
        return false;
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
        if(b$c0 != null) {
            Boolean boolean0 = b$c0.getClickCoordinatesEnabled();
            return boolean0 == null ? false : boolean0.booleanValue();
        }
        return false;
    }

    public final boolean isCriticalAsset(@l String s) {
        L.p(s, "failingUrl");
        if(!this.isNativeTemplateType()) {
            com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
            if(L.g((b$c0 == null ? null : b$c0.getTemplateURL()), s)) {
                return true;
            }
        }
        com.vungle.ads.internal.model.b.c b$c1 = this.getAdMarkup();
        if(b$c1 != null) {
            com.vungle.ads.internal.model.b.g b$g0 = b$c1.getTemplateSettings();
            if(b$g0 != null) {
                Map map0 = b$g0.getCacheableReplacements();
                if(map0 != null) {
                    LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                    for(Object object0: map0.entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object0;
                        if(L.g(((com.vungle.ads.internal.model.b.d)map$Entry0.getValue()).getUrl(), s)) {
                            linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                        }
                    }
                    return !linkedHashMap0.isEmpty();
                }
            }
        }
        return false;
    }

    public final boolean isNativeTemplateType() {
        return L.g(this.templateType(), "native");
    }

    public final boolean omEnabled() {
        com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
        if(b$c0 != null) {
            com.vungle.ads.internal.model.b.i b$i0 = b$c0.getViewAbility();
            if(b$i0 != null) {
                j b$j0 = b$i0.getOm();
                if(b$j0 != null) {
                    Boolean boolean0 = b$j0.isEnabled();
                    return boolean0 == null ? false : boolean0.booleanValue();
                }
            }
        }
        return false;
    }

    @y4.m
    public final String placementId() {
        com.vungle.ads.internal.model.b.f b$f0 = this.getAd();
        return b$f0 == null ? null : b$f0.getPlacementReferenceId();
    }

    public final void setAdConfig(@y4.m com.vungle.ads.d d0) {
        this.adConfig = d0;
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final void setAssetsFullyDownloaded(boolean z) {
        this.assetsFullyDownloaded = z;
    }

    public final void setIncentivizedText(@l String s, @l String s1, @l String s2, @l String s3) {
        L.p(s, "title");
        L.p(s1, "body");
        L.p(s2, "keepWatching");
        L.p(s3, "close");
        if(s.length() > 0) {
            this.incentivizedTextSettings.put("INCENTIVIZED_TITLE_TEXT", s);
        }
        if(s1.length() > 0) {
            this.incentivizedTextSettings.put("INCENTIVIZED_BODY_TEXT", s1);
        }
        if(s2.length() > 0) {
            this.incentivizedTextSettings.put("INCENTIVIZED_CONTINUE_TEXT", s2);
        }
        if(s3.length() > 0) {
            this.incentivizedTextSettings.put("INCENTIVIZED_CLOSE_TEXT", s3);
        }
    }

    public final void setIncentivizedTextSettings(@l Map map0) {
        L.p(map0, "<set-?>");
        this.incentivizedTextSettings = map0;
    }

    public final void setLogEntry$vungle_ads_release(@y4.m o o0) {
        this.logEntry = o0;
    }

    @y4.m
    public final String templateType() {
        com.vungle.ads.internal.model.b.c b$c0 = this.getAdMarkup();
        return b$c0 == null ? null : b$c0.getTemplateType();
    }

    public final void updateAdAssetPath(@y4.m com.vungle.ads.internal.model.a a0) {
        synchronized(this) {
            if(a0 != null && !L.g("template", a0.getAdIdentifier())) {
                File file0 = new File(a0.getLocalPath());
                if(file0.exists()) {
                    String s = (String)this.mraidFiles.put(a0.getAdIdentifier(), "file://" + file0.getPath());
                }
            }
        }
    }

    private final String valueOrEmpty(String s) {
        return s == null ? "" : s;
    }

    @n
    public static final void write$Self(@l b b0, @l d d0, @l f f0) {
        L.p(b0, "self");
        L.p(d0, "output");
        L.p(f0, "serialDesc");
        if(d0.q(f0, 0) || b0.ads != null) {
            d0.y(f0, 0, new kotlinx.serialization.internal.f(com.vungle.ads.internal.model.b.f.a.INSTANCE), b0.ads);
        }
        if(d0.q(f0, 1) || b0.config != null) {
            d0.y(f0, 1, com.vungle.ads.internal.model.h.a.INSTANCE, b0.config);
        }
        if(d0.q(f0, 2) || !L.g(b0.mraidFiles, new ConcurrentHashMap())) {
            d0.G(f0, 2, new c(m0.d(ConcurrentHashMap.class), null, new i[]{N0.a, N0.a}), b0.mraidFiles);
        }
        if(d0.q(f0, 3) || !L.g(b0.incentivizedTextSettings, new HashMap())) {
            d0.G(f0, 3, new b0(N0.a, N0.a), b0.incentivizedTextSettings);
        }
        if(d0.q(f0, 4) || b0.assetsFullyDownloaded) {
            d0.o(f0, 4, b0.assetsFullyDownloaded);
        }
    }
}

