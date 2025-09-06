package kotlinx.coroutines.channels;

import kotlin.c0;
import kotlin.coroutines.d;
import kotlin.internal.h;
import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.O;
import kotlinx.coroutines.Z0;
import kotlinx.coroutines.selects.g;
import y4.l;

@Z0
public interface c extends O, F {
    public static final class a {
        @k(level = m.c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static void a(c c0) {
            kotlinx.coroutines.channels.F.a.a(c0);
        }

        @l
        public static g b(@l c c0) {
            return kotlinx.coroutines.channels.F.a.d(c0);
        }

        @k(level = m.b, message = "Deprecated in the favour of \'tryReceive\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'poll\' did, for the precise replacement please refer to the \'poll\' documentation", replaceWith = @c0(expression = "tryReceive().getOrNull()", imports = {}))
        @y4.m
        public static Object c(@l c c0) {
            return kotlinx.coroutines.channels.F.a.h(c0);
        }

        @h
        @k(level = m.b, message = "Deprecated in favor of \'receiveCatching\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'receiveOrNull\' did, for the detailed replacement please refer to the \'receiveOrNull\' documentation", replaceWith = @c0(expression = "receiveCatching().getOrNull()", imports = {}))
        @y4.m
        public static Object d(@l c c0, @l d d0) {
            return kotlinx.coroutines.channels.F.a.i(c0, d0);
        }
    }

    @l
    kotlinx.coroutines.channels.l b();
}

