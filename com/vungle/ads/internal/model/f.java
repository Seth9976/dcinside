package com.vungle.ads.internal.model;

import java.util.List;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlinx.serialization.E;
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
public final class f {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final kotlinx.serialization.descriptors.f descriptor;

        static {
            a f$a0 = new a();
            a.INSTANCE = f$a0;
            w0 w00 = new w0("com.vungle.ads.internal.model.CommonRequestBody", f$a0, 5);
            w00.k("device", false);
            w00.k("app", true);
            w00.k("user", true);
            w00.k("ext", true);
            w00.k("request", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            i i0 = P3.a.u(com.vungle.ads.internal.model.d.a.INSTANCE);
            i i1 = P3.a.u(com.vungle.ads.internal.model.f.j.a.INSTANCE);
            i i2 = P3.a.u(com.vungle.ads.internal.model.f.h.a.INSTANCE);
            i i3 = P3.a.u(com.vungle.ads.internal.model.f.i.a.INSTANCE);
            return new i[]{com.vungle.ads.internal.model.j.a.INSTANCE, i0, i1, i2, i3};
        }

        @l
        public f deserialize(@l e e0) {
            int v;
            Object object5;
            Object object4;
            Object object3;
            Object object2;
            Object object1;
            L.p(e0, "decoder");
            kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            Object object0 = null;
            if(c0.k()) {
                object1 = c0.p(f0, 0, com.vungle.ads.internal.model.j.a.INSTANCE, null);
                object2 = c0.j(f0, 1, com.vungle.ads.internal.model.d.a.INSTANCE, null);
                object3 = c0.j(f0, 2, com.vungle.ads.internal.model.f.j.a.INSTANCE, null);
                object4 = c0.j(f0, 3, com.vungle.ads.internal.model.f.h.a.INSTANCE, null);
                object5 = c0.j(f0, 4, com.vungle.ads.internal.model.f.i.a.INSTANCE, null);
                v = 0x1F;
            }
            else {
                Object object6 = null;
                Object object7 = null;
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
                            object0 = c0.p(f0, 0, com.vungle.ads.internal.model.j.a.INSTANCE, object0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            object6 = c0.j(f0, 1, com.vungle.ads.internal.model.d.a.INSTANCE, object6);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            object7 = c0.j(f0, 2, com.vungle.ads.internal.model.f.j.a.INSTANCE, object7);
                            v1 |= 4;
                            break;
                        }
                        case 3: {
                            object8 = c0.j(f0, 3, com.vungle.ads.internal.model.f.h.a.INSTANCE, object8);
                            v1 |= 8;
                            break;
                        }
                        case 4: {
                            object9 = c0.j(f0, 4, com.vungle.ads.internal.model.f.i.a.INSTANCE, object9);
                            v1 |= 16;
                            break;
                        }
                        default: {
                            throw new E(v2);
                        }
                    }
                }
                object2 = object6;
                object3 = object7;
                object4 = object8;
                object5 = object9;
                v = v1;
                object1 = object0;
            }
            c0.c(f0);
            return new f(v, ((j)object1), ((d)object2), ((com.vungle.ads.internal.model.f.j)object3), ((h)object4), ((com.vungle.ads.internal.model.f.i)object5), null);
        }

        @Override  // kotlinx.serialization.d
        public Object deserialize(e e0) {
            return this.deserialize(e0);
        }

        @Override  // kotlinx.serialization.i
        @l
        public kotlinx.serialization.descriptors.f getDescriptor() {
            return a.descriptor;
        }

        public void serialize(@l g g0, @l f f0) {
            L.p(g0, "encoder");
            L.p(f0, "value");
            kotlinx.serialization.descriptors.f f1 = this.getDescriptor();
            kotlinx.serialization.encoding.d d0 = g0.b(f1);
            f.write$Self(f0, d0, f1);
            d0.c(f1);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((f)object0));
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
        public static final class com.vungle.ads.internal.model.f.b.a implements M {
            @l
            public static final com.vungle.ads.internal.model.f.b.a INSTANCE;
            public static final kotlinx.serialization.descriptors.f descriptor;

            static {
                com.vungle.ads.internal.model.f.b.a f$b$a0 = new com.vungle.ads.internal.model.f.b.a();
                com.vungle.ads.internal.model.f.b.a.INSTANCE = f$b$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam", f$b$a0, 2);
                w00.k("w", false);
                w00.k("h", false);
                com.vungle.ads.internal.model.f.b.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{W.a, W.a};
            }

            @l
            public b deserialize(@l e e0) {
                int v2;
                int v1;
                int v;
                L.p(e0, "decoder");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                if(c0.k()) {
                    v = c0.f(f0, 0);
                    v1 = c0.f(f0, 1);
                    v2 = 3;
                }
                else {
                    v = 0;
                    int v3 = 0;
                    int v4 = 0;
                    boolean z = true;
                    while(z) {
                        int v5 = c0.w(f0);
                        switch(v5) {
                            case -1: {
                                z = false;
                                break;
                            }
                            case 0: {
                                v = c0.f(f0, 0);
                                v4 |= 1;
                                break;
                            }
                            case 1: {
                                v3 = c0.f(f0, 1);
                                v4 |= 2;
                                break;
                            }
                            default: {
                                throw new E(v5);
                            }
                        }
                    }
                    v1 = v3;
                    v2 = v4;
                }
                c0.c(f0);
                return new b(v2, v, v1, null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return com.vungle.ads.internal.model.f.b.a.descriptor;
            }

            public void serialize(@l g g0, @l b f$b0) {
                L.p(g0, "encoder");
                L.p(f$b0, "value");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
                kotlinx.serialization.encoding.d d0 = g0.b(f0);
                b.write$Self(f$b0, d0, f0);
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

        public static final class com.vungle.ads.internal.model.f.b.b {
            private com.vungle.ads.internal.model.f.b.b() {
            }

            public com.vungle.ads.internal.model.f.b.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.f.b.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.f.b.b Companion;
        private final int height;
        private final int width;

        static {
            b.Companion = new com.vungle.ads.internal.model.f.b.b(null);
        }

        public b(int v, int v1) {
            this.width = v;
            this.height = v1;
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public b(int v, @t("w") int v1, @t("h") int v2, H0 h00) {
            if(3 != (v & 3)) {
                v0.b(v, 3, com.vungle.ads.internal.model.f.b.a.INSTANCE.getDescriptor());
            }
            super();
            this.width = v1;
            this.height = v2;
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        @l
        public final b copy(int v, int v1) {
            return new b(v, v1);
        }

        public static b copy$default(b f$b0, int v, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = f$b0.width;
            }
            if((v2 & 2) != 0) {
                v1 = f$b0.height;
            }
            return f$b0.copy(v, v1);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof b)) {
                return false;
            }
            return this.width == ((b)object0).width ? this.height == ((b)object0).height : false;
        }

        public final int getHeight() {
            return this.height;
        }

        @t("h")
        public static void getHeight$annotations() {
        }

        public final int getWidth() {
            return this.width;
        }

        @t("w")
        public static void getWidth$annotations() {
        }

        @Override
        public int hashCode() {
            return this.width * 0x1F + this.height;
        }

        @Override
        @l
        public String toString() {
            return "AdSizeParam(width=" + this.width + ", height=" + this.height + ')';
        }

        @n
        public static final void write$Self(@l b f$b0, @l kotlinx.serialization.encoding.d d0, @l kotlinx.serialization.descriptors.f f0) {
            L.p(f$b0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            d0.n(f0, 0, f$b0.width);
            d0.n(f0, 1, f$b0.height);
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.f.c {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.f.c.a implements M {
            @l
            public static final com.vungle.ads.internal.model.f.c.a INSTANCE;
            public static final kotlinx.serialization.descriptors.f descriptor;

            static {
                com.vungle.ads.internal.model.f.c.a f$c$a0 = new com.vungle.ads.internal.model.f.c.a();
                com.vungle.ads.internal.model.f.c.a.INSTANCE = f$c$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.CommonRequestBody.CCPA", f$c$a0, 1);
                w00.k("status", false);
                com.vungle.ads.internal.model.f.c.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{N0.a};
            }

            @l
            public com.vungle.ads.internal.model.f.c deserialize(@l e e0) {
                String s;
                L.p(e0, "decoder");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                int v = 1;
                if(c0.k()) {
                    s = c0.i(f0, 0);
                }
                else {
                    s = null;
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
                return new com.vungle.ads.internal.model.f.c(v, s, null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return com.vungle.ads.internal.model.f.c.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.f.c f$c0) {
                L.p(g0, "encoder");
                L.p(f$c0, "value");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
                kotlinx.serialization.encoding.d d0 = g0.b(f0);
                com.vungle.ads.internal.model.f.c.write$Self(f$c0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.f.c)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.f.c.b {
            private com.vungle.ads.internal.model.f.c.b() {
            }

            public com.vungle.ads.internal.model.f.c.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.f.c.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.f.c.b Companion;
        @l
        private final String status;

        static {
            com.vungle.ads.internal.model.f.c.Companion = new com.vungle.ads.internal.model.f.c.b(null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.f.c(int v, String s, H0 h00) {
            if(1 != (v & 1)) {
                v0.b(v, 1, com.vungle.ads.internal.model.f.c.a.INSTANCE.getDescriptor());
            }
            super();
            this.status = s;
        }

        public com.vungle.ads.internal.model.f.c(@l String s) {
            L.p(s, "status");
            super();
            this.status = s;
        }

        @l
        public final String component1() {
            return this.status;
        }

        @l
        public final com.vungle.ads.internal.model.f.c copy(@l String s) {
            L.p(s, "status");
            return new com.vungle.ads.internal.model.f.c(s);
        }

        public static com.vungle.ads.internal.model.f.c copy$default(com.vungle.ads.internal.model.f.c f$c0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = f$c0.status;
            }
            return f$c0.copy(s);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof com.vungle.ads.internal.model.f.c ? L.g(this.status, ((com.vungle.ads.internal.model.f.c)object0).status) : false;
        }

        @l
        public final String getStatus() {
            return this.status;
        }

        @Override
        public int hashCode() {
            return this.status.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "CCPA(status=" + this.status + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.f.c f$c0, @l kotlinx.serialization.encoding.d d0, @l kotlinx.serialization.descriptors.f f0) {
            L.p(f$c0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            d0.p(f0, 0, f$c0.status);
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.f.d {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.f.d.a implements M {
            @l
            public static final com.vungle.ads.internal.model.f.d.a INSTANCE;
            public static final kotlinx.serialization.descriptors.f descriptor;

            static {
                com.vungle.ads.internal.model.f.d.a f$d$a0 = new com.vungle.ads.internal.model.f.d.a();
                com.vungle.ads.internal.model.f.d.a.INSTANCE = f$d$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.CommonRequestBody.COPPA", f$d$a0, 1);
                w00.k("is_coppa", false);
                com.vungle.ads.internal.model.f.d.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(kotlinx.serialization.internal.i.a)};
            }

            @l
            public com.vungle.ads.internal.model.f.d deserialize(@l e e0) {
                Object object0;
                L.p(e0, "decoder");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
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
                return new com.vungle.ads.internal.model.f.d(v, ((Boolean)object0), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return com.vungle.ads.internal.model.f.d.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.f.d f$d0) {
                L.p(g0, "encoder");
                L.p(f$d0, "value");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
                kotlinx.serialization.encoding.d d0 = g0.b(f0);
                com.vungle.ads.internal.model.f.d.write$Self(f$d0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.f.d)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.f.d.b {
            private com.vungle.ads.internal.model.f.d.b() {
            }

            public com.vungle.ads.internal.model.f.d.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.f.d.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.f.d.b Companion;
        @y4.m
        private final Boolean isCoppa;

        static {
            com.vungle.ads.internal.model.f.d.Companion = new com.vungle.ads.internal.model.f.d.b(null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.f.d(int v, @t("is_coppa") Boolean boolean0, H0 h00) {
            if(1 != (v & 1)) {
                v0.b(v, 1, com.vungle.ads.internal.model.f.d.a.INSTANCE.getDescriptor());
            }
            super();
            this.isCoppa = boolean0;
        }

        public com.vungle.ads.internal.model.f.d(@y4.m Boolean boolean0) {
            this.isCoppa = boolean0;
        }

        @y4.m
        public final Boolean component1() {
            return this.isCoppa;
        }

        @l
        public final com.vungle.ads.internal.model.f.d copy(@y4.m Boolean boolean0) {
            return new com.vungle.ads.internal.model.f.d(boolean0);
        }

        public static com.vungle.ads.internal.model.f.d copy$default(com.vungle.ads.internal.model.f.d f$d0, Boolean boolean0, int v, Object object0) {
            if((v & 1) != 0) {
                boolean0 = f$d0.isCoppa;
            }
            return f$d0.copy(boolean0);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof com.vungle.ads.internal.model.f.d ? L.g(this.isCoppa, ((com.vungle.ads.internal.model.f.d)object0).isCoppa) : false;
        }

        @Override
        public int hashCode() {
            return this.isCoppa == null ? 0 : this.isCoppa.hashCode();
        }

        @y4.m
        public final Boolean isCoppa() {
            return this.isCoppa;
        }

        @t("is_coppa")
        public static void isCoppa$annotations() {
        }

        @Override
        @l
        public String toString() {
            return "COPPA(isCoppa=" + this.isCoppa + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.f.d f$d0, @l kotlinx.serialization.encoding.d d0, @l kotlinx.serialization.descriptors.f f0) {
            L.p(f$d0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            d0.y(f0, 0, kotlinx.serialization.internal.i.a, f$d0.isCoppa);
        }
    }

    public static final class com.vungle.ads.internal.model.f.e {
        private com.vungle.ads.internal.model.f.e() {
        }

        public com.vungle.ads.internal.model.f.e(w w0) {
        }

        @l
        public final i serializer() {
            return a.INSTANCE;
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.f.f {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.f.f.a implements M {
            @l
            public static final com.vungle.ads.internal.model.f.f.a INSTANCE;
            public static final kotlinx.serialization.descriptors.f descriptor;

            static {
                com.vungle.ads.internal.model.f.f.a f$f$a0 = new com.vungle.ads.internal.model.f.f.a();
                com.vungle.ads.internal.model.f.f.a.INSTANCE = f$f$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.CommonRequestBody.GDPR", f$f$a0, 4);
                w00.k("consent_status", false);
                w00.k("consent_source", false);
                w00.k("consent_timestamp", false);
                w00.k("consent_message_version", false);
                com.vungle.ads.internal.model.f.f.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{N0.a, N0.a, h0.a, N0.a};
            }

            @l
            public com.vungle.ads.internal.model.f.f deserialize(@l e e0) {
                int v2;
                long v1;
                String s4;
                String s3;
                String s2;
                L.p(e0, "decoder");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                if(c0.k()) {
                    String s = c0.i(f0, 0);
                    String s1 = c0.i(f0, 1);
                    long v = c0.e(f0, 2);
                    s2 = s;
                    s3 = c0.i(f0, 3);
                    s4 = s1;
                    v1 = v;
                    v2 = 15;
                }
                else {
                    String s5 = null;
                    String s6 = null;
                    long v3 = 0L;
                    int v4 = 0;
                    String s7 = null;
                    boolean z = true;
                    while(z) {
                        int v5 = c0.w(f0);
                        switch(v5) {
                            case -1: {
                                z = false;
                                break;
                            }
                            case 0: {
                                s5 = c0.i(f0, 0);
                                v4 |= 1;
                                break;
                            }
                            case 1: {
                                s6 = c0.i(f0, 1);
                                v4 |= 2;
                                break;
                            }
                            case 2: {
                                v3 = c0.e(f0, 2);
                                v4 |= 4;
                                break;
                            }
                            case 3: {
                                s7 = c0.i(f0, 3);
                                v4 |= 8;
                                break;
                            }
                            default: {
                                throw new E(v5);
                            }
                        }
                    }
                    s2 = s5;
                    s3 = s7;
                    v2 = v4;
                    s4 = s6;
                    v1 = v3;
                }
                c0.c(f0);
                return new com.vungle.ads.internal.model.f.f(v2, s2, s4, v1, s3, null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return com.vungle.ads.internal.model.f.f.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.f.f f$f0) {
                L.p(g0, "encoder");
                L.p(f$f0, "value");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
                kotlinx.serialization.encoding.d d0 = g0.b(f0);
                com.vungle.ads.internal.model.f.f.write$Self(f$f0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.f.f)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.f.f.b {
            private com.vungle.ads.internal.model.f.f.b() {
            }

            public com.vungle.ads.internal.model.f.f.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.f.f.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.f.f.b Companion;
        @l
        private final String consentMessageVersion;
        @l
        private final String consentSource;
        @l
        private final String consentStatus;
        private final long consentTimestamp;

        static {
            com.vungle.ads.internal.model.f.f.Companion = new com.vungle.ads.internal.model.f.f.b(null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.f.f(int v, @t("consent_status") String s, @t("consent_source") String s1, @t("consent_timestamp") long v1, @t("consent_message_version") String s2, H0 h00) {
            if(15 != (v & 15)) {
                v0.b(v, 15, com.vungle.ads.internal.model.f.f.a.INSTANCE.getDescriptor());
            }
            super();
            this.consentStatus = s;
            this.consentSource = s1;
            this.consentTimestamp = v1;
            this.consentMessageVersion = s2;
        }

        public com.vungle.ads.internal.model.f.f(@l String s, @l String s1, long v, @l String s2) {
            L.p(s, "consentStatus");
            L.p(s1, "consentSource");
            L.p(s2, "consentMessageVersion");
            super();
            this.consentStatus = s;
            this.consentSource = s1;
            this.consentTimestamp = v;
            this.consentMessageVersion = s2;
        }

        @l
        public final String component1() {
            return this.consentStatus;
        }

        @l
        public final String component2() {
            return this.consentSource;
        }

        public final long component3() {
            return this.consentTimestamp;
        }

        @l
        public final String component4() {
            return this.consentMessageVersion;
        }

        @l
        public final com.vungle.ads.internal.model.f.f copy(@l String s, @l String s1, long v, @l String s2) {
            L.p(s, "consentStatus");
            L.p(s1, "consentSource");
            L.p(s2, "consentMessageVersion");
            return new com.vungle.ads.internal.model.f.f(s, s1, v, s2);
        }

        public static com.vungle.ads.internal.model.f.f copy$default(com.vungle.ads.internal.model.f.f f$f0, String s, String s1, long v, String s2, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = f$f0.consentStatus;
            }
            if((v1 & 2) != 0) {
                s1 = f$f0.consentSource;
            }
            if((v1 & 4) != 0) {
                v = f$f0.consentTimestamp;
            }
            if((v1 & 8) != 0) {
                s2 = f$f0.consentMessageVersion;
            }
            return f$f0.copy(s, s1, v, s2);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.vungle.ads.internal.model.f.f)) {
                return false;
            }
            if(!L.g(this.consentStatus, ((com.vungle.ads.internal.model.f.f)object0).consentStatus)) {
                return false;
            }
            if(!L.g(this.consentSource, ((com.vungle.ads.internal.model.f.f)object0).consentSource)) {
                return false;
            }
            return this.consentTimestamp == ((com.vungle.ads.internal.model.f.f)object0).consentTimestamp ? L.g(this.consentMessageVersion, ((com.vungle.ads.internal.model.f.f)object0).consentMessageVersion) : false;
        }

        @l
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        @t("consent_message_version")
        public static void getConsentMessageVersion$annotations() {
        }

        @l
        public final String getConsentSource() {
            return this.consentSource;
        }

        @t("consent_source")
        public static void getConsentSource$annotations() {
        }

        @l
        public final String getConsentStatus() {
            return this.consentStatus;
        }

        @t("consent_status")
        public static void getConsentStatus$annotations() {
        }

        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }

        @t("consent_timestamp")
        public static void getConsentTimestamp$annotations() {
        }

        @Override
        public int hashCode() {
            return ((this.consentStatus.hashCode() * 0x1F + this.consentSource.hashCode()) * 0x1F + ((int)(this.consentTimestamp ^ this.consentTimestamp >>> 0x20))) * 0x1F + this.consentMessageVersion.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "GDPR(consentStatus=" + this.consentStatus + ", consentSource=" + this.consentSource + ", consentTimestamp=" + this.consentTimestamp + ", consentMessageVersion=" + this.consentMessageVersion + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.f.f f$f0, @l kotlinx.serialization.encoding.d d0, @l kotlinx.serialization.descriptors.f f0) {
            L.p(f$f0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            d0.p(f0, 0, f$f0.consentStatus);
            d0.p(f0, 1, f$f0.consentSource);
            d0.u(f0, 2, f$f0.consentTimestamp);
            d0.p(f0, 3, f$f0.consentMessageVersion);
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.f.g {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.f.g.a implements M {
            @l
            public static final com.vungle.ads.internal.model.f.g.a INSTANCE;
            public static final kotlinx.serialization.descriptors.f descriptor;

            static {
                com.vungle.ads.internal.model.f.g.a f$g$a0 = new com.vungle.ads.internal.model.f.g.a();
                com.vungle.ads.internal.model.f.g.a.INSTANCE = f$g$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.CommonRequestBody.IAB", f$g$a0, 1);
                w00.k("tcf", false);
                com.vungle.ads.internal.model.f.g.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{N0.a};
            }

            @l
            public com.vungle.ads.internal.model.f.g deserialize(@l e e0) {
                String s;
                L.p(e0, "decoder");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                int v = 1;
                if(c0.k()) {
                    s = c0.i(f0, 0);
                }
                else {
                    s = null;
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
                return new com.vungle.ads.internal.model.f.g(v, s, null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return com.vungle.ads.internal.model.f.g.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.f.g f$g0) {
                L.p(g0, "encoder");
                L.p(f$g0, "value");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
                kotlinx.serialization.encoding.d d0 = g0.b(f0);
                com.vungle.ads.internal.model.f.g.write$Self(f$g0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.f.g)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.f.g.b {
            private com.vungle.ads.internal.model.f.g.b() {
            }

            public com.vungle.ads.internal.model.f.g.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.f.g.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.f.g.b Companion;
        @l
        private final String tcf;

        static {
            com.vungle.ads.internal.model.f.g.Companion = new com.vungle.ads.internal.model.f.g.b(null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.f.g(int v, @t("tcf") String s, H0 h00) {
            if(1 != (v & 1)) {
                v0.b(v, 1, com.vungle.ads.internal.model.f.g.a.INSTANCE.getDescriptor());
            }
            super();
            this.tcf = s;
        }

        public com.vungle.ads.internal.model.f.g(@l String s) {
            L.p(s, "tcf");
            super();
            this.tcf = s;
        }

        @l
        public final String component1() {
            return this.tcf;
        }

        @l
        public final com.vungle.ads.internal.model.f.g copy(@l String s) {
            L.p(s, "tcf");
            return new com.vungle.ads.internal.model.f.g(s);
        }

        public static com.vungle.ads.internal.model.f.g copy$default(com.vungle.ads.internal.model.f.g f$g0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = f$g0.tcf;
            }
            return f$g0.copy(s);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof com.vungle.ads.internal.model.f.g ? L.g(this.tcf, ((com.vungle.ads.internal.model.f.g)object0).tcf) : false;
        }

        @l
        public final String getTcf() {
            return this.tcf;
        }

        @t("tcf")
        public static void getTcf$annotations() {
        }

        @Override
        public int hashCode() {
            return this.tcf.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "IAB(tcf=" + this.tcf + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.f.g f$g0, @l kotlinx.serialization.encoding.d d0, @l kotlinx.serialization.descriptors.f f0) {
            L.p(f$g0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            d0.p(f0, 0, f$g0.tcf);
        }
    }

    @u
    public static final class h {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.f.h.a implements M {
            @l
            public static final com.vungle.ads.internal.model.f.h.a INSTANCE;
            public static final kotlinx.serialization.descriptors.f descriptor;

            static {
                com.vungle.ads.internal.model.f.h.a f$h$a0 = new com.vungle.ads.internal.model.f.h.a();
                com.vungle.ads.internal.model.f.h.a.INSTANCE = f$h$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.CommonRequestBody.RequestExt", f$h$a0, 3);
                w00.k("config_extension", true);
                w00.k("signals", true);
                w00.k("config_last_validated_ts", true);
                com.vungle.ads.internal.model.f.h.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(h0.a)};
            }

            @l
            public h deserialize(@l e e0) {
                int v;
                Object object3;
                Object object2;
                L.p(e0, "decoder");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                Object object0 = null;
                if(c0.k()) {
                    Object object1 = c0.j(f0, 0, N0.a, null);
                    object2 = c0.j(f0, 1, N0.a, null);
                    object3 = c0.j(f0, 2, h0.a, null);
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
                                object5 = c0.j(f0, 2, h0.a, object5);
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
                return new h(v, ((String)object0), ((String)object2), ((Long)object3), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return com.vungle.ads.internal.model.f.h.a.descriptor;
            }

            public void serialize(@l g g0, @l h f$h0) {
                L.p(g0, "encoder");
                L.p(f$h0, "value");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
                kotlinx.serialization.encoding.d d0 = g0.b(f0);
                h.write$Self(f$h0, d0, f0);
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

        public static final class com.vungle.ads.internal.model.f.h.b {
            private com.vungle.ads.internal.model.f.h.b() {
            }

            public com.vungle.ads.internal.model.f.h.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.f.h.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.f.h.b Companion;
        @y4.m
        private final String configExtension;
        @y4.m
        private final Long configLastValidatedTimestamp;
        @y4.m
        private String signals;

        static {
            h.Companion = new com.vungle.ads.internal.model.f.h.b(null);
        }

        public h() {
            this(null, null, null, 7, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public h(int v, @t("config_extension") String s, @t("signals") String s1, @t("config_last_validated_ts") Long long0, H0 h00) {
            this.configExtension = (v & 1) == 0 ? null : s;
            this.signals = (v & 2) == 0 ? null : s1;
            if((v & 4) == 0) {
                this.configLastValidatedTimestamp = null;
                return;
            }
            this.configLastValidatedTimestamp = long0;
        }

        public h(@y4.m String s, @y4.m String s1, @y4.m Long long0) {
            this.configExtension = s;
            this.signals = s1;
            this.configLastValidatedTimestamp = long0;
        }

        public h(String s, String s1, Long long0, int v, w w0) {
            if((v & 1) != 0) {
                s = null;
            }
            if((v & 2) != 0) {
                s1 = null;
            }
            if((v & 4) != 0) {
                long0 = null;
            }
            this(s, s1, long0);
        }

        @y4.m
        public final String component1() {
            return this.configExtension;
        }

        @y4.m
        public final String component2() {
            return this.signals;
        }

        @y4.m
        public final Long component3() {
            return this.configLastValidatedTimestamp;
        }

        @l
        public final h copy(@y4.m String s, @y4.m String s1, @y4.m Long long0) {
            return new h(s, s1, long0);
        }

        public static h copy$default(h f$h0, String s, String s1, Long long0, int v, Object object0) {
            if((v & 1) != 0) {
                s = f$h0.configExtension;
            }
            if((v & 2) != 0) {
                s1 = f$h0.signals;
            }
            if((v & 4) != 0) {
                long0 = f$h0.configLastValidatedTimestamp;
            }
            return f$h0.copy(s, s1, long0);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof h)) {
                return false;
            }
            if(!L.g(this.configExtension, ((h)object0).configExtension)) {
                return false;
            }
            return L.g(this.signals, ((h)object0).signals) ? L.g(this.configLastValidatedTimestamp, ((h)object0).configLastValidatedTimestamp) : false;
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
        public final String getSignals() {
            return this.signals;
        }

        @t("signals")
        public static void getSignals$annotations() {
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.configExtension == null ? 0 : this.configExtension.hashCode();
            int v2 = this.signals == null ? 0 : this.signals.hashCode();
            Long long0 = this.configLastValidatedTimestamp;
            if(long0 != null) {
                v = long0.hashCode();
            }
            return (v1 * 0x1F + v2) * 0x1F + v;
        }

        public final void setSignals(@y4.m String s) {
            this.signals = s;
        }

        @Override
        @l
        public String toString() {
            return "RequestExt(configExtension=" + this.configExtension + ", signals=" + this.signals + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ')';
        }

        @n
        public static final void write$Self(@l h f$h0, @l kotlinx.serialization.encoding.d d0, @l kotlinx.serialization.descriptors.f f0) {
            L.p(f$h0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || f$h0.configExtension != null) {
                d0.y(f0, 0, N0.a, f$h0.configExtension);
            }
            if(d0.q(f0, 1) || f$h0.signals != null) {
                d0.y(f0, 1, N0.a, f$h0.signals);
            }
            if(d0.q(f0, 2) || f$h0.configLastValidatedTimestamp != null) {
                d0.y(f0, 2, h0.a, f$h0.configLastValidatedTimestamp);
            }
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.f.i {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.f.i.a implements M {
            @l
            public static final com.vungle.ads.internal.model.f.i.a INSTANCE;
            public static final kotlinx.serialization.descriptors.f descriptor;

            static {
                com.vungle.ads.internal.model.f.i.a f$i$a0 = new com.vungle.ads.internal.model.f.i.a();
                com.vungle.ads.internal.model.f.i.a.INSTANCE = f$i$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", f$i$a0, 6);
                w00.k("placements", true);
                w00.k("ad_size", true);
                w00.k("ad_start_time", true);
                w00.k("app_id", true);
                w00.k("placement_reference_id", true);
                w00.k("user", true);
                com.vungle.ads.internal.model.f.i.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(new kotlinx.serialization.internal.f(N0.a)), P3.a.u(com.vungle.ads.internal.model.f.b.a.INSTANCE), P3.a.u(h0.a), P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(N0.a)};
            }

            @l
            public com.vungle.ads.internal.model.f.i deserialize(@l e e0) {
                int v;
                Object object6;
                Object object5;
                Object object4;
                Object object3;
                Object object2;
                Object object1;
                L.p(e0, "decoder");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                Object object0 = null;
                if(c0.k()) {
                    object1 = c0.j(f0, 0, new kotlinx.serialization.internal.f(N0.a), null);
                    object2 = c0.j(f0, 1, com.vungle.ads.internal.model.f.b.a.INSTANCE, null);
                    object3 = c0.j(f0, 2, h0.a, null);
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
                                object0 = c0.j(f0, 0, new kotlinx.serialization.internal.f(N0.a), object0);
                                v1 |= 1;
                                break;
                            }
                            case 1: {
                                object7 = c0.j(f0, 1, com.vungle.ads.internal.model.f.b.a.INSTANCE, object7);
                                v1 |= 2;
                                break;
                            }
                            case 2: {
                                object8 = c0.j(f0, 2, h0.a, object8);
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
                return new com.vungle.ads.internal.model.f.i(v, ((List)object1), ((b)object2), ((Long)object3), ((String)object4), ((String)object5), ((String)object6), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return com.vungle.ads.internal.model.f.i.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.f.i f$i0) {
                L.p(g0, "encoder");
                L.p(f$i0, "value");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
                kotlinx.serialization.encoding.d d0 = g0.b(f0);
                com.vungle.ads.internal.model.f.i.write$Self(f$i0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.f.i)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.f.i.b {
            private com.vungle.ads.internal.model.f.i.b() {
            }

            public com.vungle.ads.internal.model.f.i.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.f.i.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.f.i.b Companion;
        @y4.m
        private b adSize;
        @y4.m
        private final Long adStartTime;
        @y4.m
        private final String advAppId;
        @y4.m
        private final String placementReferenceId;
        @y4.m
        private final List placements;
        @y4.m
        private final String user;

        static {
            com.vungle.ads.internal.model.f.i.Companion = new com.vungle.ads.internal.model.f.i.b(null);
        }

        public com.vungle.ads.internal.model.f.i() {
            this(null, null, null, null, null, null, 0x3F, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.f.i(int v, List list0, @t("ad_size") b f$b0, @t("ad_start_time") Long long0, @t("app_id") String s, @t("placement_reference_id") String s1, String s2, H0 h00) {
            this.placements = (v & 1) == 0 ? null : list0;
            this.adSize = (v & 2) == 0 ? null : f$b0;
            this.adStartTime = (v & 4) == 0 ? null : long0;
            this.advAppId = (v & 8) == 0 ? null : s;
            this.placementReferenceId = (v & 16) == 0 ? null : s1;
            if((v & 0x20) == 0) {
                this.user = null;
                return;
            }
            this.user = s2;
        }

        public com.vungle.ads.internal.model.f.i(@y4.m List list0, @y4.m b f$b0, @y4.m Long long0, @y4.m String s, @y4.m String s1, @y4.m String s2) {
            this.placements = list0;
            this.adSize = f$b0;
            this.adStartTime = long0;
            this.advAppId = s;
            this.placementReferenceId = s1;
            this.user = s2;
        }

        public com.vungle.ads.internal.model.f.i(List list0, b f$b0, Long long0, String s, String s1, String s2, int v, w w0) {
            this(((v & 1) == 0 ? list0 : null), ((v & 2) == 0 ? f$b0 : null), ((v & 4) == 0 ? long0 : null), ((v & 8) == 0 ? s : null), ((v & 16) == 0 ? s1 : null), ((v & 0x20) == 0 ? s2 : null));
        }

        @y4.m
        public final List component1() {
            return this.placements;
        }

        @y4.m
        public final b component2() {
            return this.adSize;
        }

        @y4.m
        public final Long component3() {
            return this.adStartTime;
        }

        @y4.m
        public final String component4() {
            return this.advAppId;
        }

        @y4.m
        public final String component5() {
            return this.placementReferenceId;
        }

        @y4.m
        public final String component6() {
            return this.user;
        }

        @l
        public final com.vungle.ads.internal.model.f.i copy(@y4.m List list0, @y4.m b f$b0, @y4.m Long long0, @y4.m String s, @y4.m String s1, @y4.m String s2) {
            return new com.vungle.ads.internal.model.f.i(list0, f$b0, long0, s, s1, s2);
        }

        public static com.vungle.ads.internal.model.f.i copy$default(com.vungle.ads.internal.model.f.i f$i0, List list0, b f$b0, Long long0, String s, String s1, String s2, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = f$i0.placements;
            }
            if((v & 2) != 0) {
                f$b0 = f$i0.adSize;
            }
            if((v & 4) != 0) {
                long0 = f$i0.adStartTime;
            }
            if((v & 8) != 0) {
                s = f$i0.advAppId;
            }
            if((v & 16) != 0) {
                s1 = f$i0.placementReferenceId;
            }
            if((v & 0x20) != 0) {
                s2 = f$i0.user;
            }
            return f$i0.copy(list0, f$b0, long0, s, s1, s2);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.vungle.ads.internal.model.f.i)) {
                return false;
            }
            if(!L.g(this.placements, ((com.vungle.ads.internal.model.f.i)object0).placements)) {
                return false;
            }
            if(!L.g(this.adSize, ((com.vungle.ads.internal.model.f.i)object0).adSize)) {
                return false;
            }
            if(!L.g(this.adStartTime, ((com.vungle.ads.internal.model.f.i)object0).adStartTime)) {
                return false;
            }
            if(!L.g(this.advAppId, ((com.vungle.ads.internal.model.f.i)object0).advAppId)) {
                return false;
            }
            return L.g(this.placementReferenceId, ((com.vungle.ads.internal.model.f.i)object0).placementReferenceId) ? L.g(this.user, ((com.vungle.ads.internal.model.f.i)object0).user) : false;
        }

        @y4.m
        public final b getAdSize() {
            return this.adSize;
        }

        @t("ad_size")
        public static void getAdSize$annotations() {
        }

        @y4.m
        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        @t("ad_start_time")
        public static void getAdStartTime$annotations() {
        }

        @y4.m
        public final String getAdvAppId() {
            return this.advAppId;
        }

        @t("app_id")
        public static void getAdvAppId$annotations() {
        }

        @y4.m
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        @t("placement_reference_id")
        public static void getPlacementReferenceId$annotations() {
        }

        @y4.m
        public final List getPlacements() {
            return this.placements;
        }

        @y4.m
        public final String getUser() {
            return this.user;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.placements == null ? 0 : this.placements.hashCode();
            int v2 = this.adSize == null ? 0 : this.adSize.hashCode();
            int v3 = this.adStartTime == null ? 0 : this.adStartTime.hashCode();
            int v4 = this.advAppId == null ? 0 : this.advAppId.hashCode();
            int v5 = this.placementReferenceId == null ? 0 : this.placementReferenceId.hashCode();
            String s = this.user;
            if(s != null) {
                v = s.hashCode();
            }
            return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
        }

        public final void setAdSize(@y4.m b f$b0) {
            this.adSize = f$b0;
        }

        @Override
        @l
        public String toString() {
            return "RequestParam(placements=" + this.placements + ", adSize=" + this.adSize + ", adStartTime=" + this.adStartTime + ", advAppId=" + this.advAppId + ", placementReferenceId=" + this.placementReferenceId + ", user=" + this.user + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.f.i f$i0, @l kotlinx.serialization.encoding.d d0, @l kotlinx.serialization.descriptors.f f0) {
            L.p(f$i0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || f$i0.placements != null) {
                d0.y(f0, 0, new kotlinx.serialization.internal.f(N0.a), f$i0.placements);
            }
            if(d0.q(f0, 1) || f$i0.adSize != null) {
                d0.y(f0, 1, com.vungle.ads.internal.model.f.b.a.INSTANCE, f$i0.adSize);
            }
            if(d0.q(f0, 2) || f$i0.adStartTime != null) {
                d0.y(f0, 2, h0.a, f$i0.adStartTime);
            }
            if(d0.q(f0, 3) || f$i0.advAppId != null) {
                d0.y(f0, 3, N0.a, f$i0.advAppId);
            }
            if(d0.q(f0, 4) || f$i0.placementReferenceId != null) {
                d0.y(f0, 4, N0.a, f$i0.placementReferenceId);
            }
            if(d0.q(f0, 5) || f$i0.user != null) {
                d0.y(f0, 5, N0.a, f$i0.user);
            }
        }
    }

    @u
    public static final class com.vungle.ads.internal.model.f.j {
        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public static final class com.vungle.ads.internal.model.f.j.a implements M {
            @l
            public static final com.vungle.ads.internal.model.f.j.a INSTANCE;
            public static final kotlinx.serialization.descriptors.f descriptor;

            static {
                com.vungle.ads.internal.model.f.j.a f$j$a0 = new com.vungle.ads.internal.model.f.j.a();
                com.vungle.ads.internal.model.f.j.a.INSTANCE = f$j$a0;
                w0 w00 = new w0("com.vungle.ads.internal.model.CommonRequestBody.User", f$j$a0, 5);
                w00.k("gdpr", true);
                w00.k("ccpa", true);
                w00.k("coppa", true);
                w00.k("fpd", true);
                w00.k("iab", true);
                com.vungle.ads.internal.model.f.j.a.descriptor = w00;
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] childSerializers() {
                return new i[]{P3.a.u(com.vungle.ads.internal.model.f.f.a.INSTANCE), P3.a.u(com.vungle.ads.internal.model.f.c.a.INSTANCE), P3.a.u(com.vungle.ads.internal.model.f.d.a.INSTANCE), P3.a.u(T2.c.a.INSTANCE), P3.a.u(com.vungle.ads.internal.model.f.g.a.INSTANCE)};
            }

            @l
            public com.vungle.ads.internal.model.f.j deserialize(@l e e0) {
                int v;
                Object object5;
                Object object4;
                Object object3;
                Object object2;
                Object object1;
                L.p(e0, "decoder");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
                c c0 = e0.b(f0);
                Object object0 = null;
                if(c0.k()) {
                    object1 = c0.j(f0, 0, com.vungle.ads.internal.model.f.f.a.INSTANCE, null);
                    object2 = c0.j(f0, 1, com.vungle.ads.internal.model.f.c.a.INSTANCE, null);
                    object3 = c0.j(f0, 2, com.vungle.ads.internal.model.f.d.a.INSTANCE, null);
                    object4 = c0.j(f0, 3, T2.c.a.INSTANCE, null);
                    object5 = c0.j(f0, 4, com.vungle.ads.internal.model.f.g.a.INSTANCE, null);
                    v = 0x1F;
                }
                else {
                    Object object6 = null;
                    Object object7 = null;
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
                                object0 = c0.j(f0, 0, com.vungle.ads.internal.model.f.f.a.INSTANCE, object0);
                                v1 |= 1;
                                break;
                            }
                            case 1: {
                                object6 = c0.j(f0, 1, com.vungle.ads.internal.model.f.c.a.INSTANCE, object6);
                                v1 |= 2;
                                break;
                            }
                            case 2: {
                                object7 = c0.j(f0, 2, com.vungle.ads.internal.model.f.d.a.INSTANCE, object7);
                                v1 |= 4;
                                break;
                            }
                            case 3: {
                                object8 = c0.j(f0, 3, T2.c.a.INSTANCE, object8);
                                v1 |= 8;
                                break;
                            }
                            case 4: {
                                object9 = c0.j(f0, 4, com.vungle.ads.internal.model.f.g.a.INSTANCE, object9);
                                v1 |= 16;
                                break;
                            }
                            default: {
                                throw new E(v2);
                            }
                        }
                    }
                    object2 = object6;
                    object3 = object7;
                    object4 = object8;
                    object5 = object9;
                    v = v1;
                    object1 = object0;
                }
                c0.c(f0);
                return new com.vungle.ads.internal.model.f.j(v, ((com.vungle.ads.internal.model.f.f)object1), ((com.vungle.ads.internal.model.f.c)object2), ((com.vungle.ads.internal.model.f.d)object3), ((T2.c)object4), ((com.vungle.ads.internal.model.f.g)object5), null);
            }

            @Override  // kotlinx.serialization.d
            public Object deserialize(e e0) {
                return this.deserialize(e0);
            }

            @Override  // kotlinx.serialization.i
            @l
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return com.vungle.ads.internal.model.f.j.a.descriptor;
            }

            public void serialize(@l g g0, @l com.vungle.ads.internal.model.f.j f$j0) {
                L.p(g0, "encoder");
                L.p(f$j0, "value");
                kotlinx.serialization.descriptors.f f0 = this.getDescriptor();
                kotlinx.serialization.encoding.d d0 = g0.b(f0);
                com.vungle.ads.internal.model.f.j.write$Self(f$j0, d0, f0);
                d0.c(f0);
            }

            @Override  // kotlinx.serialization.w
            public void serialize(g g0, Object object0) {
                this.serialize(g0, ((com.vungle.ads.internal.model.f.j)object0));
            }

            @Override  // kotlinx.serialization.internal.M
            @l
            public i[] typeParametersSerializers() {
                return kotlinx.serialization.internal.M.a.a(this);
            }
        }

        public static final class com.vungle.ads.internal.model.f.j.b {
            private com.vungle.ads.internal.model.f.j.b() {
            }

            public com.vungle.ads.internal.model.f.j.b(w w0) {
            }

            @l
            public final i serializer() {
                return com.vungle.ads.internal.model.f.j.a.INSTANCE;
            }
        }

        @l
        public static final com.vungle.ads.internal.model.f.j.b Companion;
        @y4.m
        private com.vungle.ads.internal.model.f.c ccpa;
        @y4.m
        private com.vungle.ads.internal.model.f.d coppa;
        @y4.m
        private T2.c fpd;
        @y4.m
        private com.vungle.ads.internal.model.f.f gdpr;
        @y4.m
        private com.vungle.ads.internal.model.f.g iab;

        static {
            com.vungle.ads.internal.model.f.j.Companion = new com.vungle.ads.internal.model.f.j.b(null);
        }

        public com.vungle.ads.internal.model.f.j() {
            this(null, null, null, null, null, 0x1F, null);
        }

        @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
        public com.vungle.ads.internal.model.f.j(int v, com.vungle.ads.internal.model.f.f f$f0, com.vungle.ads.internal.model.f.c f$c0, com.vungle.ads.internal.model.f.d f$d0, T2.c c0, com.vungle.ads.internal.model.f.g f$g0, H0 h00) {
            this.gdpr = (v & 1) == 0 ? null : f$f0;
            this.ccpa = (v & 2) == 0 ? null : f$c0;
            this.coppa = (v & 4) == 0 ? null : f$d0;
            this.fpd = (v & 8) == 0 ? null : c0;
            if((v & 16) == 0) {
                this.iab = null;
                return;
            }
            this.iab = f$g0;
        }

        public com.vungle.ads.internal.model.f.j(@y4.m com.vungle.ads.internal.model.f.f f$f0, @y4.m com.vungle.ads.internal.model.f.c f$c0, @y4.m com.vungle.ads.internal.model.f.d f$d0, @y4.m T2.c c0, @y4.m com.vungle.ads.internal.model.f.g f$g0) {
            this.gdpr = f$f0;
            this.ccpa = f$c0;
            this.coppa = f$d0;
            this.fpd = c0;
            this.iab = f$g0;
        }

        public com.vungle.ads.internal.model.f.j(com.vungle.ads.internal.model.f.f f$f0, com.vungle.ads.internal.model.f.c f$c0, com.vungle.ads.internal.model.f.d f$d0, T2.c c0, com.vungle.ads.internal.model.f.g f$g0, int v, w w0) {
            this(((v & 1) == 0 ? f$f0 : null), ((v & 2) == 0 ? f$c0 : null), ((v & 4) == 0 ? f$d0 : null), ((v & 8) == 0 ? c0 : null), ((v & 16) == 0 ? f$g0 : null));
        }

        @y4.m
        public final com.vungle.ads.internal.model.f.f component1() {
            return this.gdpr;
        }

        @y4.m
        public final com.vungle.ads.internal.model.f.c component2() {
            return this.ccpa;
        }

        @y4.m
        public final com.vungle.ads.internal.model.f.d component3() {
            return this.coppa;
        }

        @y4.m
        public final T2.c component4() {
            return this.fpd;
        }

        @y4.m
        public final com.vungle.ads.internal.model.f.g component5() {
            return this.iab;
        }

        @l
        public final com.vungle.ads.internal.model.f.j copy(@y4.m com.vungle.ads.internal.model.f.f f$f0, @y4.m com.vungle.ads.internal.model.f.c f$c0, @y4.m com.vungle.ads.internal.model.f.d f$d0, @y4.m T2.c c0, @y4.m com.vungle.ads.internal.model.f.g f$g0) {
            return new com.vungle.ads.internal.model.f.j(f$f0, f$c0, f$d0, c0, f$g0);
        }

        public static com.vungle.ads.internal.model.f.j copy$default(com.vungle.ads.internal.model.f.j f$j0, com.vungle.ads.internal.model.f.f f$f0, com.vungle.ads.internal.model.f.c f$c0, com.vungle.ads.internal.model.f.d f$d0, T2.c c0, com.vungle.ads.internal.model.f.g f$g0, int v, Object object0) {
            if((v & 1) != 0) {
                f$f0 = f$j0.gdpr;
            }
            if((v & 2) != 0) {
                f$c0 = f$j0.ccpa;
            }
            if((v & 4) != 0) {
                f$d0 = f$j0.coppa;
            }
            if((v & 8) != 0) {
                c0 = f$j0.fpd;
            }
            if((v & 16) != 0) {
                f$g0 = f$j0.iab;
            }
            return f$j0.copy(f$f0, f$c0, f$d0, c0, f$g0);
        }

        @Override
        public boolean equals(@y4.m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.vungle.ads.internal.model.f.j)) {
                return false;
            }
            if(!L.g(this.gdpr, ((com.vungle.ads.internal.model.f.j)object0).gdpr)) {
                return false;
            }
            if(!L.g(this.ccpa, ((com.vungle.ads.internal.model.f.j)object0).ccpa)) {
                return false;
            }
            if(!L.g(this.coppa, ((com.vungle.ads.internal.model.f.j)object0).coppa)) {
                return false;
            }
            return L.g(this.fpd, ((com.vungle.ads.internal.model.f.j)object0).fpd) ? L.g(this.iab, ((com.vungle.ads.internal.model.f.j)object0).iab) : false;
        }

        @y4.m
        public final com.vungle.ads.internal.model.f.c getCcpa() {
            return this.ccpa;
        }

        @y4.m
        public final com.vungle.ads.internal.model.f.d getCoppa() {
            return this.coppa;
        }

        @y4.m
        public final T2.c getFpd() {
            return this.fpd;
        }

        @y4.m
        public final com.vungle.ads.internal.model.f.f getGdpr() {
            return this.gdpr;
        }

        @y4.m
        public final com.vungle.ads.internal.model.f.g getIab() {
            return this.iab;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.gdpr == null ? 0 : this.gdpr.hashCode();
            int v2 = this.ccpa == null ? 0 : this.ccpa.hashCode();
            int v3 = this.coppa == null ? 0 : this.coppa.hashCode();
            int v4 = this.fpd == null ? 0 : this.fpd.hashCode();
            com.vungle.ads.internal.model.f.g f$g0 = this.iab;
            if(f$g0 != null) {
                v = f$g0.hashCode();
            }
            return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
        }

        public final void setCcpa(@y4.m com.vungle.ads.internal.model.f.c f$c0) {
            this.ccpa = f$c0;
        }

        public final void setCoppa(@y4.m com.vungle.ads.internal.model.f.d f$d0) {
            this.coppa = f$d0;
        }

        public final void setFpd(@y4.m T2.c c0) {
            this.fpd = c0;
        }

        public final void setGdpr(@y4.m com.vungle.ads.internal.model.f.f f$f0) {
            this.gdpr = f$f0;
        }

        public final void setIab(@y4.m com.vungle.ads.internal.model.f.g f$g0) {
            this.iab = f$g0;
        }

        @Override
        @l
        public String toString() {
            return "User(gdpr=" + this.gdpr + ", ccpa=" + this.ccpa + ", coppa=" + this.coppa + ", fpd=" + this.fpd + ", iab=" + this.iab + ')';
        }

        @n
        public static final void write$Self(@l com.vungle.ads.internal.model.f.j f$j0, @l kotlinx.serialization.encoding.d d0, @l kotlinx.serialization.descriptors.f f0) {
            L.p(f$j0, "self");
            L.p(d0, "output");
            L.p(f0, "serialDesc");
            if(d0.q(f0, 0) || f$j0.gdpr != null) {
                d0.y(f0, 0, com.vungle.ads.internal.model.f.f.a.INSTANCE, f$j0.gdpr);
            }
            if(d0.q(f0, 1) || f$j0.ccpa != null) {
                d0.y(f0, 1, com.vungle.ads.internal.model.f.c.a.INSTANCE, f$j0.ccpa);
            }
            if(d0.q(f0, 2) || f$j0.coppa != null) {
                d0.y(f0, 2, com.vungle.ads.internal.model.f.d.a.INSTANCE, f$j0.coppa);
            }
            if(d0.q(f0, 3) || f$j0.fpd != null) {
                d0.y(f0, 3, T2.c.a.INSTANCE, f$j0.fpd);
            }
            if(d0.q(f0, 4) || f$j0.iab != null) {
                d0.y(f0, 4, com.vungle.ads.internal.model.f.g.a.INSTANCE, f$j0.iab);
            }
        }
    }

    @l
    public static final com.vungle.ads.internal.model.f.e Companion;
    @y4.m
    private final d app;
    @l
    private final j device;
    @y4.m
    private h ext;
    @y4.m
    private com.vungle.ads.internal.model.f.i request;
    @y4.m
    private final com.vungle.ads.internal.model.f.j user;

    static {
        f.Companion = new com.vungle.ads.internal.model.f.e(null);
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public f(int v, j j0, d d0, com.vungle.ads.internal.model.f.j f$j0, h f$h0, com.vungle.ads.internal.model.f.i f$i0, H0 h00) {
        if(1 != (v & 1)) {
            v0.b(v, 1, a.INSTANCE.getDescriptor());
        }
        super();
        this.device = j0;
        this.app = (v & 2) == 0 ? null : d0;
        this.user = (v & 4) == 0 ? null : f$j0;
        this.ext = (v & 8) == 0 ? null : f$h0;
        if((v & 16) == 0) {
            this.request = null;
            return;
        }
        this.request = f$i0;
    }

    public f(@l j j0, @y4.m d d0, @y4.m com.vungle.ads.internal.model.f.j f$j0, @y4.m h f$h0, @y4.m com.vungle.ads.internal.model.f.i f$i0) {
        L.p(j0, "device");
        super();
        this.device = j0;
        this.app = d0;
        this.user = f$j0;
        this.ext = f$h0;
        this.request = f$i0;
    }

    public f(j j0, d d0, com.vungle.ads.internal.model.f.j f$j0, h f$h0, com.vungle.ads.internal.model.f.i f$i0, int v, w w0) {
        this(j0, ((v & 2) == 0 ? d0 : null), ((v & 4) == 0 ? f$j0 : null), ((v & 8) == 0 ? f$h0 : null), ((v & 16) == 0 ? f$i0 : null));
    }

    @l
    public final j component1() {
        return this.device;
    }

    @y4.m
    public final d component2() {
        return this.app;
    }

    @y4.m
    public final com.vungle.ads.internal.model.f.j component3() {
        return this.user;
    }

    @y4.m
    public final h component4() {
        return this.ext;
    }

    @y4.m
    public final com.vungle.ads.internal.model.f.i component5() {
        return this.request;
    }

    @l
    public final f copy(@l j j0, @y4.m d d0, @y4.m com.vungle.ads.internal.model.f.j f$j0, @y4.m h f$h0, @y4.m com.vungle.ads.internal.model.f.i f$i0) {
        L.p(j0, "device");
        return new f(j0, d0, f$j0, f$h0, f$i0);
    }

    public static f copy$default(f f0, j j0, d d0, com.vungle.ads.internal.model.f.j f$j0, h f$h0, com.vungle.ads.internal.model.f.i f$i0, int v, Object object0) {
        if((v & 1) != 0) {
            j0 = f0.device;
        }
        if((v & 2) != 0) {
            d0 = f0.app;
        }
        if((v & 4) != 0) {
            f$j0 = f0.user;
        }
        if((v & 8) != 0) {
            f$h0 = f0.ext;
        }
        if((v & 16) != 0) {
            f$i0 = f0.request;
        }
        return f0.copy(j0, d0, f$j0, f$h0, f$i0);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f)) {
            return false;
        }
        if(!L.g(this.device, ((f)object0).device)) {
            return false;
        }
        if(!L.g(this.app, ((f)object0).app)) {
            return false;
        }
        if(!L.g(this.user, ((f)object0).user)) {
            return false;
        }
        return L.g(this.ext, ((f)object0).ext) ? L.g(this.request, ((f)object0).request) : false;
    }

    @y4.m
    public final d getApp() {
        return this.app;
    }

    @l
    public final j getDevice() {
        return this.device;
    }

    @y4.m
    public final h getExt() {
        return this.ext;
    }

    @y4.m
    public final com.vungle.ads.internal.model.f.i getRequest() {
        return this.request;
    }

    @y4.m
    public final com.vungle.ads.internal.model.f.j getUser() {
        return this.user;
    }

    @Override
    public int hashCode() {
        int v = this.device.hashCode();
        int v1 = 0;
        int v2 = this.app == null ? 0 : this.app.hashCode();
        int v3 = this.user == null ? 0 : this.user.hashCode();
        int v4 = this.ext == null ? 0 : this.ext.hashCode();
        com.vungle.ads.internal.model.f.i f$i0 = this.request;
        if(f$i0 != null) {
            v1 = f$i0.hashCode();
        }
        return (((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1;
    }

    public final void setExt(@y4.m h f$h0) {
        this.ext = f$h0;
    }

    public final void setRequest(@y4.m com.vungle.ads.internal.model.f.i f$i0) {
        this.request = f$i0;
    }

    @Override
    @l
    public String toString() {
        return "CommonRequestBody(device=" + this.device + ", app=" + this.app + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ')';
    }

    @n
    public static final void write$Self(@l f f0, @l kotlinx.serialization.encoding.d d0, @l kotlinx.serialization.descriptors.f f1) {
        L.p(f0, "self");
        L.p(d0, "output");
        L.p(f1, "serialDesc");
        d0.G(f1, 0, com.vungle.ads.internal.model.j.a.INSTANCE, f0.device);
        if(d0.q(f1, 1) || f0.app != null) {
            d0.y(f1, 1, com.vungle.ads.internal.model.d.a.INSTANCE, f0.app);
        }
        if(d0.q(f1, 2) || f0.user != null) {
            d0.y(f1, 2, com.vungle.ads.internal.model.f.j.a.INSTANCE, f0.user);
        }
        if(d0.q(f1, 3) || f0.ext != null) {
            d0.y(f1, 3, com.vungle.ads.internal.model.f.h.a.INSTANCE, f0.ext);
        }
        if(d0.q(f1, 4) || f0.request != null) {
            d0.y(f1, 4, com.vungle.ads.internal.model.f.i.a.INSTANCE, f0.request);
        }
    }
}

