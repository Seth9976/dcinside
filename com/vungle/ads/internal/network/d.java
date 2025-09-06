package com.vungle.ads.internal.network;

import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import kotlinx.serialization.internal.G;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.u;
import y4.l;

@u
public enum d {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a.INSTANCE = new a();
            G g0 = new G("com.vungle.ads.internal.network.HttpMethod", 2);
            g0.k("GET", false);
            g0.k("POST", false);
            a.descriptor = g0;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            return new i[0];
        }

        @l
        public d deserialize(@l e e0) {
            L.p(e0, "decoder");
            d[] arr_d = d.values();
            return arr_d[e0.s(this.getDescriptor())];
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
            g0.g(this.getDescriptor(), d0.ordinal());
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

    GET,
    POST;

    @l
    public static final b Companion;

    private static final d[] $values() [...] // Inlined contents

    static {
        d.Companion = new b(null);
    }
}

