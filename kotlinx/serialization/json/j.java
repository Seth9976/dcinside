package kotlinx.serialization.json;

import kotlin.jvm.internal.L;
import kotlinx.serialization.d;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.c.b;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.e;
import y4.l;
import y4.m;

public interface j extends c, e {
    public static final class a {
        public static int a(@l j j0, @l f f0) {
            L.p(f0, "descriptor");
            return b.a(j0, f0);
        }

        @kotlinx.serialization.f
        @m
        public static Object b(@l j j0, @l d d0) {
            L.p(d0, "deserializer");
            return kotlinx.serialization.encoding.e.a.a(j0, d0);
        }

        @kotlinx.serialization.f
        public static boolean c(@l j j0) {
            return false;
        }

        public static Object d(@l j j0, @l d d0) {
            L.p(d0, "deserializer");
            return kotlinx.serialization.encoding.e.a.b(j0, d0);
        }
    }

    @l
    kotlinx.serialization.json.b d();

    @l
    kotlinx.serialization.json.l t();
}

