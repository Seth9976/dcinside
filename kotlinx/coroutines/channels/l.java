package kotlinx.coroutines.channels;

import kotlin.c0;
import kotlin.coroutines.d;
import kotlin.internal.h;
import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.internal.Y;
import kotlinx.coroutines.selects.g;

public interface l extends F, G {
    public static final class a {
        @k(level = m.c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static void a(l l0) {
            kotlinx.coroutines.channels.F.a.a(l0);
        }

        @y4.l
        public static g b(@y4.l l l0) {
            return kotlinx.coroutines.channels.F.a.d(l0);
        }

        @k(level = m.b, message = "Deprecated in the favour of \'trySend\' method", replaceWith = @c0(expression = "trySend(element).isSuccess", imports = {}))
        public static boolean c(@y4.l l l0, Object object0) {
            return kotlinx.coroutines.channels.G.a.c(l0, object0);
        }

        @k(level = m.b, message = "Deprecated in the favour of \'tryReceive\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'poll\' did, for the precise replacement please refer to the \'poll\' documentation", replaceWith = @c0(expression = "tryReceive().getOrNull()", imports = {}))
        @y4.m
        public static Object d(@y4.l l l0) {
            return kotlinx.coroutines.channels.F.a.h(l0);
        }

        @h
        @k(level = m.b, message = "Deprecated in favor of \'receiveCatching\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'receiveOrNull\' did, for the detailed replacement please refer to the \'receiveOrNull\' documentation", replaceWith = @c0(expression = "receiveCatching().getOrNull()", imports = {}))
        @y4.m
        public static Object e(@y4.l l l0, @y4.l d d0) {
            return kotlinx.coroutines.channels.F.a.i(l0, d0);
        }
    }

    public static final class b {
        static final b a = null;
        public static final int b = 0x7FFFFFFF;
        public static final int c = 0;
        public static final int d = -1;
        public static final int e = -2;
        public static final int f = -3;
        @y4.l
        public static final String g = "kotlinx.coroutines.channels.defaultBuffer";
        private static final int h;

        static {
            b.a = new b();
            b.h = Y.b("kotlinx.coroutines.channels.defaultBuffer", 0x40, 1, 0x7FFFFFFE);
        }

        public final int a() [...] // 潜在的解密器
    }

    @y4.l
    public static final b C8 = null;
    public static final int D8 = 0x7FFFFFFF;
    public static final int E8 = 0;
    public static final int F8 = -1;
    public static final int G8 = -2;
    public static final int H8 = -3;
    @y4.l
    public static final String I8 = "kotlinx.coroutines.channels.defaultBuffer";

    static {
        l.C8 = b.a;
    }
}

