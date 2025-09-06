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
import kotlinx.serialization.internal.W;
import kotlinx.serialization.internal.v0;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.t;
import kotlinx.serialization.u;
import y4.l;
import z3.n;

@u
public final class j {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a j$a0 = new a();
            a.INSTANCE = j$a0;
            w0 w00 = new w0("com.vungle.ads.internal.model.DeviceNode", j$a0, 11);
            w00.k("make", false);
            w00.k("model", false);
            w00.k("osv", false);
            w00.k("carrier", true);
            w00.k("os", false);
            w00.k("w", false);
            w00.k("h", false);
            w00.k("ua", true);
            w00.k("ifa", true);
            w00.k("lmt", true);
            w00.k("ext", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            i i0 = P3.a.u(N0.a);
            i i1 = P3.a.u(N0.a);
            i i2 = P3.a.u(N0.a);
            i i3 = P3.a.u(W.a);
            i i4 = P3.a.u(com.vungle.ads.internal.model.j.c.a.INSTANCE);
            return new i[]{N0.a, N0.a, N0.a, i0, N0.a, W.a, W.a, i1, i2, i3, i4};
        }

        @l
        public j deserialize(@l e e0) {
            int v4;
            String s7;
            String s6;
            String s5;
            int v3;
            int v2;
            String s4;
            Object object4;
            Object object3;
            Object object2;
            Object object1;
            Object object0;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            if(c0.k()) {
                String s = c0.i(f0, 0);
                String s1 = c0.i(f0, 1);
                String s2 = c0.i(f0, 2);
                object0 = c0.j(f0, 3, N0.a, null);
                String s3 = c0.i(f0, 4);
                int v = c0.f(f0, 5);
                int v1 = c0.f(f0, 6);
                object1 = c0.j(f0, 7, N0.a, null);
                object2 = c0.j(f0, 8, N0.a, null);
                object3 = c0.j(f0, 9, W.a, null);
                object4 = c0.j(f0, 10, com.vungle.ads.internal.model.j.c.a.INSTANCE, null);
                s4 = s;
                v2 = v1;
                v3 = v;
                s5 = s3;
                s6 = s2;
                s7 = s1;
                v4 = 0x7FF;
            }
            else {
                Object object5 = null;
                Object object6 = null;
                Object object7 = null;
                Object object8 = null;
                Object object9 = null;
                String s8 = null;
                String s9 = null;
                String s10 = null;
                String s11 = null;
                int v5 = 0;
                int v6 = 0;
                int v7 = 0;
                boolean z = true;
                while(z) {
                    int v8 = c0.w(f0);
                    switch(v8) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            s8 = c0.i(f0, 0);
                            v7 |= 1;
                            break;
                        }
                        case 1: {
                            s9 = c0.i(f0, 1);
                            v7 |= 2;
                            break;
                        }
                        case 2: {
                            s10 = c0.i(f0, 2);
                            v7 |= 4;
                            break;
                        }
                        case 3: {
                            object9 = c0.j(f0, 3, N0.a, object9);
                            v7 |= 8;
                            break;
                        }
                        case 4: {
                            s11 = c0.i(f0, 4);
                            v7 |= 16;
                            break;
                        }
                        case 5: {
                            v6 = c0.f(f0, 5);
                            v7 |= 0x20;
                            break;
                        }
                        case 6: {
                            v5 = c0.f(f0, 6);
                            v7 |= 0x40;
                            break;
                        }
                        case 7: {
                            object8 = c0.j(f0, 7, N0.a, object8);
                            v7 |= 0x80;
                            break;
                        }
                        case 8: {
                            object7 = c0.j(f0, 8, N0.a, object7);
                            v7 |= 0x100;
                            break;
                        }
                        case 9: {
                            object5 = c0.j(f0, 9, W.a, object5);
                            v7 |= 0x200;
                            break;
                        }
                        case 10: {
                            object6 = c0.j(f0, 10, com.vungle.ads.internal.model.j.c.a.INSTANCE, object6);
                            v7 |= 0x400;
                            break;
                        }
                        default: {
                            throw new E(v8);
                        }
                    }
                }
                v2 = v5;
                object3 = object5;
                object4 = object6;
                object2 = object7;
                object1 = object8;
                object0 = object9;
                v3 = v6;
                v4 = v7;
                s4 = s8;
                s7 = s9;
                s6 = s10;
                s5 = s11;
            }
            c0.c(f0);
            return new j(v4, s4, s7, s6, ((String)object0), s5, v3, v2, ((String)object1), ((String)object2), ((Integer)object3), ((com.vungle.ads.internal.model.j.c)object4), null);
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

        public void serialize(@l g g0, @l j j0) {
            L.p(g0, "encoder");
            L.p(j0, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            j.write$Self(j0, d0, f0);
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

    @u
    public static final class com.vungle.ads.internal.model.j.c {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.j.c.a implements M {
            @l
            public static final com.vungle.ads.internal.model.j.c.a INSTANCE;
            public static final f descriptor;

            static {
                com.vungle.ads.internal.model.j.c.a j$c$a0 = new com.vungle.ads.internal.model.j.c.a();
                com.vungle.ads.internal.model.j.c.a.INSTANCE = j$c$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.DeviceNode.VungleExt", j$c$a0, 18);
                w00.k("is_google_play_services_available", true);
                w00.k("app_set_id", true);
                w00.k("app_set_id_scope", true);
                w00.k("battery_level", true);
                w00.k("battery_state", true);
                w00.k("battery_saver_enabled", true);
                w00.k("connection_type", true);
                w00.k("connection_type_detail", true);
                w00.k("locale", true);
                w00.k("language", true);
                w00.k("time_zone", true);
                w00.k("volume_level", true);
                w00.k("sound_enabled", true);
                w00.k("is_tv", true);
                w00.k("sd_card_available", true);
                w00.k("is_sideload_enabled", true);
                w00.k("gaid", true);
                w00.k("amazon_advertising_id", true);
                com.vungle.ads.internal.model.j.c.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                i i0 = P3.a.u(N0.a);
                i i1 = P3.a.u(W.a);
                i i2 = P3.a.u(N0.a);
                i i3 = P3.a.u(N0.a);
                i i4 = P3.a.u(N0.a);
                i i5 = P3.a.u(N0.a);
                i i6 = P3.a.u(N0.a);
                i i7 = P3.a.u(N0.a);
                i i8 = P3.a.u(N0.a);
                i i9 = P3.a.u(N0.a);
                return new i[]{kotlinx.serialization.internal.i.a, i0, i1, kotlinx.serialization.internal.L.a, i2, W.a, i3, i4, i5, i6, i7, kotlinx.serialization.internal.L.a, W.a, kotlinx.serialization.internal.i.a, W.a, kotlinx.serialization.internal.i.a, i8, i9};
            }

            @l
            public com.vungle.ads.internal.model.j.c deserialize(@l e e0) {
                boolean z10;
                Object object14;
                Object object13;
                Object object12;
                Object object11;
                int v7;
                boolean z5;
                boolean z4;
                int v6;
                boolean z3;
                Object object10;
                float f4;
                Object object9;
                int v5;
                float f3;
                int v4;
                Object object7;
                Object object5;
                Object object4;
                Object object1;
                L.p(e0, "decoder");
                f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                int v = 0;
                if(c0.k()) {
                    boolean z = c0.C(f0, 0);
                    Object object0 = c0.j(f0, 1, N0.a, null);
                    object1 = c0.j(f0, 2, W.a, null);
                    float f1 = c0.z(f0, 3);
                    Object object2 = c0.j(f0, 4, N0.a, null);
                    int v1 = c0.f(f0, 5);
                    Object object3 = c0.j(f0, 6, N0.a, null);
                    object4 = c0.j(f0, 7, N0.a, null);
                    object5 = c0.j(f0, 8, N0.a, null);
                    Object object6 = c0.j(f0, 9, N0.a, null);
                    object7 = c0.j(f0, 10, N0.a, null);
                    float f2 = c0.z(f0, 11);
                    int v2 = c0.f(f0, 12);
                    boolean z1 = c0.C(f0, 13);
                    int v3 = c0.f(f0, 14);
                    boolean z2 = c0.C(f0, 15);
                    Object object8 = c0.j(f0, 16, N0.a, null);
                    v4 = v2;
                    f3 = f1;
                    v5 = v1;
                    object9 = object2;
                    f4 = f2;
                    object10 = object0;
                    z3 = z2;
                    v6 = v3;
                    z4 = z1;
                    z5 = z;
                    v7 = 0x3FFFF;
                    object11 = object3;
                    object12 = object6;
                    object13 = c0.j(f0, 17, N0.a, null);
                    object14 = object8;
                }
                else {
                    Object object15 = null;
                    Object object16 = null;
                    Object object17 = null;
                    object13 = null;
                    Object object18 = null;
                    object12 = null;
                    Object object19 = null;
                    object11 = null;
                    Object object20 = null;
                    Object object21 = null;
                    boolean z6 = false;
                    boolean z7 = false;
                    int v8 = 0;
                    boolean z8 = false;
                    int v9 = 0;
                    float f5 = 0.0f;
                    int v10 = 0;
                    float f6 = 0.0f;
                    boolean z9 = true;
                    while(z9) {
                        int v11 = c0.w(f0);
                        switch(v11) {
                            case -1: {
                                z9 = false;
                                continue;
                            }
                            case 0: {
                                v |= 1;
                                z6 = c0.C(f0, 0);
                                continue;
                            }
                            case 1: {
                                v |= 2;
                                object21 = c0.j(f0, 1, N0.a, object21);
                                continue;
                            }
                            case 2: {
                                z10 = z6;
                                object15 = c0.j(f0, 2, W.a, object15);
                                v |= 4;
                                break;
                            }
                            case 3: {
                                z10 = z6;
                                f5 = c0.z(f0, 3);
                                v |= 8;
                                break;
                            }
                            case 4: {
                                z10 = z6;
                                object17 = c0.j(f0, 4, N0.a, object17);
                                v |= 16;
                                break;
                            }
                            case 5: {
                                z10 = z6;
                                v10 = c0.f(f0, 5);
                                v |= 0x20;
                                break;
                            }
                            case 6: {
                                z10 = z6;
                                object11 = c0.j(f0, 6, N0.a, object11);
                                v |= 0x40;
                                break;
                            }
                            case 7: {
                                z10 = z6;
                                object20 = c0.j(f0, 7, N0.a, object20);
                                v |= 0x80;
                                break;
                            }
                            case 8: {
                                z10 = z6;
                                object19 = c0.j(f0, 8, N0.a, object19);
                                v |= 0x100;
                                break;
                            }
                            case 9: {
                                z10 = z6;
                                object12 = c0.j(f0, 9, N0.a, object12);
                                v |= 0x200;
                                break;
                            }
                            case 10: {
                                object18 = c0.j(f0, 10, N0.a, object18);
                                v |= 0x400;
                                continue;
                            }
                            case 11: {
                                z10 = z6;
                                f6 = c0.z(f0, 11);
                                v |= 0x800;
                                break;
                            }
                            case 12: {
                                z10 = z6;
                                v9 = c0.f(f0, 12);
                                v |= 0x1000;
                                break;
                            }
                            case 13: {
                                z10 = z6;
                                v |= 0x2000;
                                z7 = c0.C(f0, 13);
                                break;
                            }
                            case 14: {
                                z10 = z6;
                                v |= 0x4000;
                                v8 = c0.f(f0, 14);
                                break;
                            }
                            case 15: {
                                z10 = z6;
                                z8 = c0.C(f0, 15);
                                v |= 0x8000;
                                break;
                            }
                            case 16: {
                                z10 = z6;
                                object16 = c0.j(f0, 16, N0.a, object16);
                                v |= 0x10000;
                                break;
                            }
                            case 17: {
                                z10 = z6;
                                object13 = c0.j(f0, 17, N0.a, object13);
                                v |= 0x20000;
                                break;
                            }
                            default: {
                                throw new E(v11);
                            }
                        }
                        z6 = z10;
                    }
                    object14 = object16;
                    v7 = v;
                    z4 = z7;
                    v6 = v8;
                    object10 = object21;
                    object7 = object18;
                    object5 = object19;
                    object4 = object20;
                    z3 = z8;
                    v4 = v9;
                    f3 = f5;
                    v5 = v10;
                    f4 = f6;
                    z5 = z6;
                    object9 = object17;
                    object1 = object15;
                }
                c0.c(f0);
                return new com.vungle.ads.internal.model.j.c(v7, z5, ((String)object10), ((Integer)object1), f3, ((String)object9), v5, ((String)object11), ((String)object4), ((String)object5), ((String)object12), ((String)object7), f4, v4, z4, v6, z3, ((String)object14), ((String)object13), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public f getDescriptor() {
                return com.vungle.ads.internal.model.j.c.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.j.c j$c0) {
                L.p(g0, "encoder");
                L.p(j$c0, "value");
                f f0 = this.getDescriptor();
                d d0 = g0.b(f0);
                com.vungle.ads.internal.model.j.c.write$Self(j$c0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.j.c)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.j.c.b {
            private com.vungle.ads.internal.model.j.c.b() {
            }

            public com.vungle.ads.internal.model.j.c.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.j.c.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.j.c.b Companion;
        @y4.m
        private String amazonAdvertisingId;
        @y4.m
        private String appSetId;
        @y4.m
        private Integer appSetIdScope;
        private float batteryLevel;
        private int batterySaverEnabled;
        @y4.m
        private String batteryState;
        @y4.m
        private String connectionType;
        @y4.m
        private String connectionTypeDetail;
        @y4.m
        private String gaid;
        private boolean isGooglePlayServicesAvailable;
        private boolean isSideloadEnabled;
        private boolean isTv;
        @y4.m
        private String language;
        @y4.m
        private String locale;
        private int sdCardAvailable;
        private int soundEnabled;
        @y4.m
        private String timeZone;
        private float volumeLevel;

        static {
            com.vungle.ads.internal.model.j.c.Companion = new com.vungle.ads.internal.model.j.c.b(null);
        }

        public com.vungle.ads.internal.model.j.c() {
            this(false, null, null, 0.0f, null, 0, null, null, null, null, null, 0.0f, 0, false, 0, false, null, null, 0x3FFFF, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.j.c(int v, @t("is_google_play_services_available") boolean z, @t("app_set_id") String s, @t("app_set_id_scope") Integer integer0, @t("battery_level") float f, @t("battery_state") String s1, @t("battery_saver_enabled") int v1, @t("connection_type") String s2, @t("connection_type_detail") String s3, @t("locale") String s4, @t("language") String s5, @t("time_zone") String s6, @t("volume_level") float f1, @t("sound_enabled") int v2, @t("is_tv") boolean z1, @t("sd_card_available") int v3, @t("is_sideload_enabled") boolean z2, @t("gaid") String s7, @t("amazon_advertising_id") String s8, H0 h00) {
            this.isGooglePlayServicesAvailable = (v & 1) == 0 ? false : z;
            this.appSetId = (v & 2) == 0 ? null : s;
            this.appSetIdScope = (v & 4) == 0 ? null : integer0;
            this.batteryLevel = (v & 8) == 0 ? 0.0f : f;
            this.batteryState = (v & 16) == 0 ? null : s1;
            this.batterySaverEnabled = (v & 0x20) == 0 ? 0 : v1;
            this.connectionType = (v & 0x40) == 0 ? null : s2;
            this.connectionTypeDetail = (v & 0x80) == 0 ? null : s3;
            this.locale = (v & 0x100) == 0 ? null : s4;
            this.language = (v & 0x200) == 0 ? null : s5;
            this.timeZone = (v & 0x400) == 0 ? null : s6;
            this.volumeLevel = (v & 0x800) == 0 ? 0.0f : f1;
            this.soundEnabled = (v & 0x1000) == 0 ? 1 : v2;
            this.isTv = (v & 0x2000) == 0 ? false : z1;
            this.sdCardAvailable = (v & 0x4000) == 0 ? 1 : v3;
            this.isSideloadEnabled = (0x8000 & v) == 0 ? false : z2;
            this.gaid = (0x10000 & v) == 0 ? null : s7;
            if((v & 0x20000) == 0) {
                this.amazonAdvertisingId = null;
                return;
            }
            this.amazonAdvertisingId = s8;
        }

        public com.vungle.ads.internal.model.j.c(boolean z, @y4.m String s, @y4.m Integer integer0, float f, @y4.m String s1, int v, @y4.m String s2, @y4.m String s3, @y4.m String s4, @y4.m String s5, @y4.m String s6, float f1, int v1, boolean z1, int v2, boolean z2, @y4.m String s7, @y4.m String s8) {
            this.isGooglePlayServicesAvailable = z;
            this.appSetId = s;
            this.appSetIdScope = integer0;
            this.batteryLevel = f;
            this.batteryState = s1;
            this.batterySaverEnabled = v;
            this.connectionType = s2;
            this.connectionTypeDetail = s3;
            this.locale = s4;
            this.language = s5;
            this.timeZone = s6;
            this.volumeLevel = f1;
            this.soundEnabled = v1;
            this.isTv = z1;
            this.sdCardAvailable = v2;
            this.isSideloadEnabled = z2;
            this.gaid = s7;
            this.amazonAdvertisingId = s8;
        }

        public com.vungle.ads.internal.model.j.c(boolean z, String s, Integer integer0, float f, String s1, int v, String s2, String s3, String s4, String s5, String s6, float f1, int v1, boolean z1, int v2, boolean z2, String s7, String s8, int v3, w w0) {
            this(((v3 & 1) == 0 ? z : false), ((v3 & 2) == 0 ? s : null), ((v3 & 4) == 0 ? integer0 : null), ((v3 & 8) == 0 ? f : 0.0f), ((v3 & 16) == 0 ? s1 : null), ((v3 & 0x20) == 0 ? v : 0), ((v3 & 0x40) == 0 ? s2 : null), ((v3 & 0x80) == 0 ? s3 : null), ((v3 & 0x100) == 0 ? s4 : null), ((v3 & 0x200) == 0 ? s5 : null), ((v3 & 0x400) == 0 ? s6 : null), ((v3 & 0x800) == 0 ? f1 : 0.0f), ((v3 & 0x1000) == 0 ? v1 : 1), ((v3 & 0x2000) == 0 ? z1 : false), ((v3 & 0x4000) == 0 ? v2 : 1), ((0x8000 & v3) == 0 ? z2 : false), ((v3 & 0x10000) == 0 ? s7 : null), ((v3 & 0x20000) == 0 ? s8 : null));
        }

        public final boolean component1() {
            return this.isGooglePlayServicesAvailable;
        }

        @y4.m
        public final String component10() {
            return this.language;
        }

        @y4.m
        public final String component11() {
            return this.timeZone;
        }

        public final float component12() {
            return this.volumeLevel;
        }

        public final int component13() {
            return this.soundEnabled;
        }

        public final boolean component14() {
            return this.isTv;
        }

        public final int component15() {
            return this.sdCardAvailable;
        }

        public final boolean component16() {
            return this.isSideloadEnabled;
        }

        @y4.m
        public final String component17() {
            return this.gaid;
        }

        @y4.m
        public final String component18() {
            return this.amazonAdvertisingId;
        }

        @y4.m
        public final String component2() {
            return this.appSetId;
        }

        @y4.m
        public final Integer component3() {
            return this.appSetIdScope;
        }

        public final float component4() {
            return this.batteryLevel;
        }

        @y4.m
        public final String component5() {
            return this.batteryState;
        }

        public final int component6() {
            return this.batterySaverEnabled;
        }

        @y4.m
        public final String component7() {
            return this.connectionType;
        }

        @y4.m
        public final String component8() {
            return this.connectionTypeDetail;
        }

        @y4.m
        public final String component9() {
            return this.locale;
        }

        @l
        public final com.vungle.ads.internal.model.j.c copy(boolean z, @y4.m String s, @y4.m Integer integer0, float f, @y4.m String s1, int v, @y4.m String s2, @y4.m String s3, @y4.m String s4, @y4.m String s5, @y4.m String s6, float f1, int v1, boolean z1, int v2, boolean z2, @y4.m String s7, @y4.m String s8) {
            return new com.vungle.ads.internal.model.j.c(z, s, integer0, f, s1, v, s2, s3, s4, s5, s6, f1, v1, z1, v2, z2, s7, s8);
        }

        public static com.vungle.ads.internal.model.j.c copy$default(com.vungle.ads.internal.model.j.c j$c0, boolean z, String s, Integer integer0, float f, String s1, int v, String s2, String s3, String s4, String s5, String s6, float f1, int v1, boolean z1, int v2, boolean z2, String s7, String s8, int v3, Object object0) {
            boolean z3 = (v3 & 1) == 0 ? z : j$c0.isGooglePlayServicesAvailable;
            String s9 = (v3 & 2) == 0 ? s : j$c0.appSetId;
            Integer integer1 = (v3 & 4) == 0 ? integer0 : j$c0.appSetIdScope;
            float f2 = (v3 & 8) == 0 ? f : j$c0.batteryLevel;
            String s10 = (v3 & 16) == 0 ? s1 : j$c0.batteryState;
            int v4 = (v3 & 0x20) == 0 ? v : j$c0.batterySaverEnabled;
            String s11 = (v3 & 0x40) == 0 ? s2 : j$c0.connectionType;
            String s12 = (v3 & 0x80) == 0 ? s3 : j$c0.connectionTypeDetail;
            String s13 = (v3 & 0x100) == 0 ? s4 : j$c0.locale;
            String s14 = (v3 & 0x200) == 0 ? s5 : j$c0.language;
            String s15 = (v3 & 0x400) == 0 ? s6 : j$c0.timeZone;
            float f3 = (v3 & 0x800) == 0 ? f1 : j$c0.volumeLevel;
            int v5 = (v3 & 0x1000) == 0 ? v1 : j$c0.soundEnabled;
            boolean z4 = (v3 & 0x2000) == 0 ? z1 : j$c0.isTv;
            int v6 = (v3 & 0x4000) == 0 ? v2 : j$c0.sdCardAvailable;
            boolean z5 = (v3 & 0x8000) == 0 ? z2 : j$c0.isSideloadEnabled;
            String s16 = (v3 & 0x10000) == 0 ? s7 : j$c0.gaid;
            return (v3 & 0x20000) == 0 ? j$c0.copy(z3, s9, integer1, f2, s10, v4, s11, s12, s13, s14, s15, f3, v5, z4, v6, z5, s16, s8) : j$c0.copy(z3, s9, integer1, f2, s10, v4, s11, s12, s13, s14, s15, f3, v5, z4, v6, z5, s16, j$c0.amazonAdvertisingId);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.vungle.ads.internal.model.j.c)) {
                return false;
            }
            if(this.isGooglePlayServicesAvailable != ((com.vungle.ads.internal.model.j.c)object0).isGooglePlayServicesAvailable) {
                return false;
            }
            if(!L.g(this.appSetId, ((com.vungle.ads.internal.model.j.c)object0).appSetId)) {
                return false;
            }
            if(!L.g(this.appSetIdScope, ((com.vungle.ads.internal.model.j.c)object0).appSetIdScope)) {
                return false;
            }
            if(!L.g(this.batteryLevel, ((com.vungle.ads.internal.model.j.c)object0).batteryLevel)) {
                return false;
            }
            if(!L.g(this.batteryState, ((com.vungle.ads.internal.model.j.c)object0).batteryState)) {
                return false;
            }
            if(this.batterySaverEnabled != ((com.vungle.ads.internal.model.j.c)object0).batterySaverEnabled) {
                return false;
            }
            if(!L.g(this.connectionType, ((com.vungle.ads.internal.model.j.c)object0).connectionType)) {
                return false;
            }
            if(!L.g(this.connectionTypeDetail, ((com.vungle.ads.internal.model.j.c)object0).connectionTypeDetail)) {
                return false;
            }
            if(!L.g(this.locale, ((com.vungle.ads.internal.model.j.c)object0).locale)) {
                return false;
            }
            if(!L.g(this.language, ((com.vungle.ads.internal.model.j.c)object0).language)) {
                return false;
            }
            if(!L.g(this.timeZone, ((com.vungle.ads.internal.model.j.c)object0).timeZone)) {
                return false;
            }
            if(!L.g(this.volumeLevel, ((com.vungle.ads.internal.model.j.c)object0).volumeLevel)) {
                return false;
            }
            if(this.soundEnabled != ((com.vungle.ads.internal.model.j.c)object0).soundEnabled) {
                return false;
            }
            if(this.isTv != ((com.vungle.ads.internal.model.j.c)object0).isTv) {
                return false;
            }
            if(this.sdCardAvailable != ((com.vungle.ads.internal.model.j.c)object0).sdCardAvailable) {
                return false;
            }
            if(this.isSideloadEnabled != ((com.vungle.ads.internal.model.j.c)object0).isSideloadEnabled) {
                return false;
            }
            return L.g(this.gaid, ((com.vungle.ads.internal.model.j.c)object0).gaid) ? L.g(this.amazonAdvertisingId, ((com.vungle.ads.internal.model.j.c)object0).amazonAdvertisingId) : false;
        }

        @y4.m
        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        @t("amazon_advertising_id")
        public static void getAmazonAdvertisingId$annotations() {
        }

        @y4.m
        public final String getAppSetId() {
            return this.appSetId;
        }

        @t("app_set_id")
        public static void getAppSetId$annotations() {
        }

        @y4.m
        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        @t("app_set_id_scope")
        public static void getAppSetIdScope$annotations() {
        }

        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        @t("battery_level")
        public static void getBatteryLevel$annotations() {
        }

        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        @t("battery_saver_enabled")
        public static void getBatterySaverEnabled$annotations() {
        }

        @y4.m
        public final String getBatteryState() {
            return this.batteryState;
        }

        @t("battery_state")
        public static void getBatteryState$annotations() {
        }

        @y4.m
        public final String getConnectionType() {
            return this.connectionType;
        }

        @t("connection_type")
        public static void getConnectionType$annotations() {
        }

        @y4.m
        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        @t("connection_type_detail")
        public static void getConnectionTypeDetail$annotations() {
        }

        @y4.m
        public final String getGaid() {
            return this.gaid;
        }

        @t("gaid")
        public static void getGaid$annotations() {
        }

        @y4.m
        public final String getLanguage() {
            return this.language;
        }

        @t("language")
        public static void getLanguage$annotations() {
        }

        @y4.m
        public final String getLocale() {
            return this.locale;
        }

        @t("locale")
        public static void getLocale$annotations() {
        }

        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        @t("sd_card_available")
        public static void getSdCardAvailable$annotations() {
        }

        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        @t("sound_enabled")
        public static void getSoundEnabled$annotations() {
        }

        @y4.m
        public final String getTimeZone() {
            return this.timeZone;
        }

        @t("time_zone")
        public static void getTimeZone$annotations() {
        }

        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        @t("volume_level")
        public static void getVolumeLevel$annotations() {
        }

        @Override
        public int hashCode() {
            int v = this.isGooglePlayServicesAvailable;
            int v1 = 1;
            if(v) {
                v = 1;
            }
            int v2 = 0;
            int v3 = ((((((((((((v * 0x1F + (this.appSetId == null ? 0 : this.appSetId.hashCode())) * 0x1F + (this.appSetIdScope == null ? 0 : this.appSetIdScope.hashCode())) * 0x1F + Float.floatToIntBits(this.batteryLevel)) * 0x1F + (this.batteryState == null ? 0 : this.batteryState.hashCode())) * 0x1F + this.batterySaverEnabled) * 0x1F + (this.connectionType == null ? 0 : this.connectionType.hashCode())) * 0x1F + (this.connectionTypeDetail == null ? 0 : this.connectionTypeDetail.hashCode())) * 0x1F + (this.locale == null ? 0 : this.locale.hashCode())) * 0x1F + (this.language == null ? 0 : this.language.hashCode())) * 0x1F + (this.timeZone == null ? 0 : this.timeZone.hashCode())) * 0x1F + Float.floatToIntBits(this.volumeLevel)) * 0x1F + this.soundEnabled) * 0x1F;
            int v4 = this.isTv;
            if(v4) {
                v4 = 1;
            }
            int v5 = ((v3 + v4) * 0x1F + this.sdCardAvailable) * 0x1F;
            if(!this.isSideloadEnabled) {
                v1 = false;
            }
            int v6 = this.gaid == null ? 0 : this.gaid.hashCode();
            String s = this.amazonAdvertisingId;
            if(s != null) {
                v2 = s.hashCode();
            }
            return ((v5 + v1) * 0x1F + v6) * 0x1F + v2;
        }

        public final boolean isGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        @t("is_google_play_services_available")
        public static void isGooglePlayServicesAvailable$annotations() {
        }

        public final boolean isSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        @t("is_sideload_enabled")
        public static void isSideloadEnabled$annotations() {
        }

        public final boolean isTv() {
            return this.isTv;
        }

        @t("is_tv")
        public static void isTv$annotations() {
        }

        public final void setAmazonAdvertisingId(@y4.m String s) {
            this.amazonAdvertisingId = s;
        }

        public final void setAppSetId(@y4.m String s) {
            this.appSetId = s;
        }

        public final void setAppSetIdScope(@y4.m Integer integer0) {
            this.appSetIdScope = integer0;
        }

        public final void setBatteryLevel(float f) {
            this.batteryLevel = f;
        }

        public final void setBatterySaverEnabled(int v) {
            this.batterySaverEnabled = v;
        }

        public final void setBatteryState(@y4.m String s) {
            this.batteryState = s;
        }

        public final void setConnectionType(@y4.m String s) {
            this.connectionType = s;
        }

        public final void setConnectionTypeDetail(@y4.m String s) {
            this.connectionTypeDetail = s;
        }

        public final void setGaid(@y4.m String s) {
            this.gaid = s;
        }

        public final void setGooglePlayServicesAvailable(boolean z) {
            this.isGooglePlayServicesAvailable = z;
        }

        public final void setLanguage(@y4.m String s) {
            this.language = s;
        }

        public final void setLocale(@y4.m String s) {
            this.locale = s;
        }

        public final void setSdCardAvailable(int v) {
            this.sdCardAvailable = v;
        }

        public final void setSideloadEnabled(boolean z) {
            this.isSideloadEnabled = z;
        }

        public final void setSoundEnabled(int v) {
            this.soundEnabled = v;
        }

        public final void setTimeZone(@y4.m String s) {
            this.timeZone = s;
        }

        public final void setTv(boolean z) {
            this.isTv = z;
        }

        public final void setVolumeLevel(float f) {
            this.volumeLevel = f;
        }

        @Override
        @l
        public String toString() {
            return "VungleExt(isGooglePlayServicesAvailable=" + this.isGooglePlayServicesAvailable + ", appSetId=" + this.appSetId + ", appSetIdScope=" + this.appSetIdScope + ", batteryLevel=" + this.batteryLevel + ", batteryState=" + this.batteryState + ", batterySaverEnabled=" + this.batterySaverEnabled + ", connectionType=" + this.connectionType + ", connectionTypeDetail=" + this.connectionTypeDetail + ", locale=" + this.locale + ", language=" + this.language + ", timeZone=" + this.timeZone + ", volumeLevel=" + this.volumeLevel + ", soundEnabled=" + this.soundEnabled + ", isTv=" + this.isTv + ", sdCardAvailable=" + this.sdCardAvailable + ", isSideloadEnabled=" + this.isSideloadEnabled + ", gaid=" + this.gaid + ", amazonAdvertisingId=" + this.amazonAdvertisingId + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.j.c j$c0, @l d d0, @l f f0) {
            L.p(j$c0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || j$c0.isGooglePlayServicesAvailable) {
                d0.o(f0, 0, j$c0.isGooglePlayServicesAvailable);
            }
            if(d0.q(f0, 1) || j$c0.appSetId != null) {
                d0.y(f0, 1, N0.a, j$c0.appSetId);
            }
            if(d0.q(f0, 2) || j$c0.appSetIdScope != null) {
                d0.y(f0, 2, W.a, j$c0.appSetIdScope);
            }
            if(d0.q(f0, 3) || !L.g(j$c0.batteryLevel, 0.0f)) {
                d0.D(f0, 3, j$c0.batteryLevel);
            }
            if(d0.q(f0, 4) || j$c0.batteryState != null) {
                d0.y(f0, 4, N0.a, j$c0.batteryState);
            }
            if(d0.q(f0, 5) || j$c0.batterySaverEnabled != 0) {
                d0.n(f0, 5, j$c0.batterySaverEnabled);
            }
            if(d0.q(f0, 6) || j$c0.connectionType != null) {
                d0.y(f0, 6, N0.a, j$c0.connectionType);
            }
            if(d0.q(f0, 7) || j$c0.connectionTypeDetail != null) {
                d0.y(f0, 7, N0.a, j$c0.connectionTypeDetail);
            }
            if(d0.q(f0, 8) || j$c0.locale != null) {
                d0.y(f0, 8, N0.a, j$c0.locale);
            }
            if(d0.q(f0, 9) || j$c0.language != null) {
                d0.y(f0, 9, N0.a, j$c0.language);
            }
            if(d0.q(f0, 10) || j$c0.timeZone != null) {
                d0.y(f0, 10, N0.a, j$c0.timeZone);
            }
            if(d0.q(f0, 11) || !L.g(j$c0.volumeLevel, 0.0f)) {
                d0.D(f0, 11, j$c0.volumeLevel);
            }
            if(d0.q(f0, 12) || j$c0.soundEnabled != 1) {
                d0.n(f0, 12, j$c0.soundEnabled);
            }
            if(d0.q(f0, 13) || j$c0.isTv) {
                d0.o(f0, 13, j$c0.isTv);
            }
            if(d0.q(f0, 14) || j$c0.sdCardAvailable != 1) {
                d0.n(f0, 14, j$c0.sdCardAvailable);
            }
            if(d0.q(f0, 15) || j$c0.isSideloadEnabled) {
                d0.o(f0, 15, j$c0.isSideloadEnabled);
            }
            if(d0.q(f0, 16) || j$c0.gaid != null) {
                d0.y(f0, 16, N0.a, j$c0.gaid);
            }
            if(d0.q(f0, 17) || j$c0.amazonAdvertisingId != null) {
                d0.y(f0, 17, N0.a, j$c0.amazonAdvertisingId);
            }
        }
    }

    @l
    public static final b Companion;
    @y4.m
    private final String carrier;
    @y4.m
    private com.vungle.ads.internal.model.j.c ext;
    private final int h;
    @y4.m
    private String ifa;
    @y4.m
    private Integer lmt;
    @l
    private final String make;
    @l
    private final String model;
    @l
    private final String os;
    @l
    private final String osv;
    @y4.m
    private String ua;
    private final int w;

    static {
        j.Companion = new b(null);
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public j(int v, String s, String s1, String s2, String s3, String s4, int v1, int v2, String s5, String s6, Integer integer0, com.vungle.ads.internal.model.j.c j$c0, H0 h00) {
        if(0x77 != (v & 0x77)) {
            v0.b(v, 0x77, a.INSTANCE.getDescriptor());
        }
        super();
        this.make = s;
        this.model = s1;
        this.osv = s2;
        this.carrier = (v & 8) == 0 ? null : s3;
        this.os = s4;
        this.w = v1;
        this.h = v2;
        this.ua = (v & 0x80) == 0 ? null : s5;
        this.ifa = (v & 0x100) == 0 ? null : s6;
        this.lmt = (v & 0x200) == 0 ? null : integer0;
        if((v & 0x400) == 0) {
            this.ext = null;
            return;
        }
        this.ext = j$c0;
    }

    public j(@l String s, @l String s1, @l String s2, @y4.m String s3, @l String s4, int v, int v1, @y4.m String s5, @y4.m String s6, @y4.m Integer integer0, @y4.m com.vungle.ads.internal.model.j.c j$c0) {
        L.p(s, "make");
        L.p(s1, "model");
        L.p(s2, "osv");
        L.p(s4, "os");
        super();
        this.make = s;
        this.model = s1;
        this.osv = s2;
        this.carrier = s3;
        this.os = s4;
        this.w = v;
        this.h = v1;
        this.ua = s5;
        this.ifa = s6;
        this.lmt = integer0;
        this.ext = j$c0;
    }

    public j(String s, String s1, String s2, String s3, String s4, int v, int v1, String s5, String s6, Integer integer0, com.vungle.ads.internal.model.j.c j$c0, int v2, w w0) {
        this(s, s1, s2, ((v2 & 8) == 0 ? s3 : null), s4, v, v1, ((v2 & 0x80) == 0 ? s5 : null), ((v2 & 0x100) == 0 ? s6 : null), ((v2 & 0x200) == 0 ? integer0 : null), ((v2 & 0x400) == 0 ? j$c0 : null));
    }

    @l
    public final String component1() {
        return this.make;
    }

    @y4.m
    public final Integer component10() {
        return this.lmt;
    }

    @y4.m
    public final com.vungle.ads.internal.model.j.c component11() {
        return this.ext;
    }

    @l
    public final String component2() {
        return this.model;
    }

    @l
    public final String component3() {
        return this.osv;
    }

    @y4.m
    public final String component4() {
        return this.carrier;
    }

    @l
    public final String component5() {
        return this.os;
    }

    public final int component6() {
        return this.w;
    }

    public final int component7() {
        return this.h;
    }

    @y4.m
    public final String component8() {
        return this.ua;
    }

    @y4.m
    public final String component9() {
        return this.ifa;
    }

    @l
    public final j copy(@l String s, @l String s1, @l String s2, @y4.m String s3, @l String s4, int v, int v1, @y4.m String s5, @y4.m String s6, @y4.m Integer integer0, @y4.m com.vungle.ads.internal.model.j.c j$c0) {
        L.p(s, "make");
        L.p(s1, "model");
        L.p(s2, "osv");
        L.p(s4, "os");
        return new j(s, s1, s2, s3, s4, v, v1, s5, s6, integer0, j$c0);
    }

    public static j copy$default(j j0, String s, String s1, String s2, String s3, String s4, int v, int v1, String s5, String s6, Integer integer0, com.vungle.ads.internal.model.j.c j$c0, int v2, Object object0) {
        String s7 = (v2 & 1) == 0 ? s : j0.make;
        String s8 = (v2 & 2) == 0 ? s1 : j0.model;
        String s9 = (v2 & 4) == 0 ? s2 : j0.osv;
        String s10 = (v2 & 8) == 0 ? s3 : j0.carrier;
        String s11 = (v2 & 16) == 0 ? s4 : j0.os;
        int v3 = (v2 & 0x20) == 0 ? v : j0.w;
        int v4 = (v2 & 0x40) == 0 ? v1 : j0.h;
        String s12 = (v2 & 0x80) == 0 ? s5 : j0.ua;
        String s13 = (v2 & 0x100) == 0 ? s6 : j0.ifa;
        Integer integer1 = (v2 & 0x200) == 0 ? integer0 : j0.lmt;
        return (v2 & 0x400) == 0 ? j0.copy(s7, s8, s9, s10, s11, v3, v4, s12, s13, integer1, j$c0) : j0.copy(s7, s8, s9, s10, s11, v3, v4, s12, s13, integer1, j0.ext);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j)) {
            return false;
        }
        if(!L.g(this.make, ((j)object0).make)) {
            return false;
        }
        if(!L.g(this.model, ((j)object0).model)) {
            return false;
        }
        if(!L.g(this.osv, ((j)object0).osv)) {
            return false;
        }
        if(!L.g(this.carrier, ((j)object0).carrier)) {
            return false;
        }
        if(!L.g(this.os, ((j)object0).os)) {
            return false;
        }
        if(this.w != ((j)object0).w) {
            return false;
        }
        if(this.h != ((j)object0).h) {
            return false;
        }
        if(!L.g(this.ua, ((j)object0).ua)) {
            return false;
        }
        if(!L.g(this.ifa, ((j)object0).ifa)) {
            return false;
        }
        return L.g(this.lmt, ((j)object0).lmt) ? L.g(this.ext, ((j)object0).ext) : false;
    }

    @y4.m
    public final String getCarrier() {
        return this.carrier;
    }

    @y4.m
    public final com.vungle.ads.internal.model.j.c getExt() {
        return this.ext;
    }

    public final int getH() {
        return this.h;
    }

    @y4.m
    public final String getIfa() {
        return this.ifa;
    }

    @y4.m
    public final Integer getLmt() {
        return this.lmt;
    }

    @l
    public final String getMake() {
        return this.make;
    }

    @l
    public final String getModel() {
        return this.model;
    }

    @l
    public final String getOs() {
        return this.os;
    }

    @l
    public final String getOsv() {
        return this.osv;
    }

    @y4.m
    public final String getUa() {
        return this.ua;
    }

    public final int getW() {
        return this.w;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = ((((((this.make.hashCode() * 0x1F + this.model.hashCode()) * 0x1F + this.osv.hashCode()) * 0x1F + (this.carrier == null ? 0 : this.carrier.hashCode())) * 0x1F + this.os.hashCode()) * 0x1F + this.w) * 0x1F + this.h) * 0x1F;
        int v2 = this.ua == null ? 0 : this.ua.hashCode();
        int v3 = this.ifa == null ? 0 : this.ifa.hashCode();
        int v4 = this.lmt == null ? 0 : this.lmt.hashCode();
        com.vungle.ads.internal.model.j.c j$c0 = this.ext;
        if(j$c0 != null) {
            v = j$c0.hashCode();
        }
        return (((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    public final void setExt(@y4.m com.vungle.ads.internal.model.j.c j$c0) {
        this.ext = j$c0;
    }

    public final void setIfa(@y4.m String s) {
        this.ifa = s;
    }

    public final void setLmt(@y4.m Integer integer0) {
        this.lmt = integer0;
    }

    public final void setUa(@y4.m String s) {
        this.ua = s;
    }

    @Override
    @l
    public String toString() {
        return "DeviceNode(make=" + this.make + ", model=" + this.model + ", osv=" + this.osv + ", carrier=" + this.carrier + ", os=" + this.os + ", w=" + this.w + ", h=" + this.h + ", ua=" + this.ua + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", ext=" + this.ext + ')';
    }

    @n
    public static final void write$Self(@l j j0, @l d d0, @l f f0) {
        L.p(j0, "self");
        L.p(d0, "output");
        L.p(f0, "serialDesc");
        d0.p(f0, 0, j0.make);
        d0.p(f0, 1, j0.model);
        d0.p(f0, 2, j0.osv);
        if(d0.q(f0, 3) || j0.carrier != null) {
            d0.y(f0, 3, N0.a, j0.carrier);
        }
        d0.p(f0, 4, j0.os);
        d0.n(f0, 5, j0.w);
        d0.n(f0, 6, j0.h);
        if(d0.q(f0, 7) || j0.ua != null) {
            d0.y(f0, 7, N0.a, j0.ua);
        }
        if(d0.q(f0, 8) || j0.ifa != null) {
            d0.y(f0, 8, N0.a, j0.ifa);
        }
        if(d0.q(f0, 9) || j0.lmt != null) {
            d0.y(f0, 9, W.a, j0.lmt);
        }
        if(d0.q(f0, 10) || j0.ext != null) {
            d0.y(f0, 10, com.vungle.ads.internal.model.j.c.a.INSTANCE, j0.ext);
        }
    }
}

