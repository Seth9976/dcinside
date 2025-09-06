package kotlinx.serialization.json;

import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.w;
import y4.l;
import y4.m;

public interface q extends d, g {
    public static final class a {
        @l
        public static d a(@l q q0, @l f f0, int v) {
            L.p(f0, "descriptor");
            return kotlinx.serialization.encoding.g.a.a(q0, f0, v);
        }

        @kotlinx.serialization.f
        public static void b(@l q q0) {
        }

        @kotlinx.serialization.f
        public static void c(@l q q0, @l w w0, @m Object object0) {
            L.p(w0, "serializer");
            kotlinx.serialization.encoding.g.a.c(q0, w0, object0);
        }

        public static void d(@l q q0, @l w w0, Object object0) {
            L.p(w0, "serializer");
            kotlinx.serialization.encoding.g.a.d(q0, w0, object0);
        }

        @kotlinx.serialization.f
        public static boolean e(@l q q0, @l f f0, int v) {
            L.p(f0, "descriptor");
            return kotlinx.serialization.encoding.d.a.a(q0, f0, v);
        }
    }

    @l
    b d();

    void r(@l kotlinx.serialization.json.l arg1);
}

