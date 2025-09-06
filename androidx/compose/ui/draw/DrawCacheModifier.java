package androidx.compose.ui.draw;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public interface DrawCacheModifier extends DrawModifier {
    public static final class DefaultImpls {
        @Deprecated
        public static boolean a(@l DrawCacheModifier drawCacheModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.a(drawCacheModifier0, function10);
        }

        @Deprecated
        public static boolean b(@l DrawCacheModifier drawCacheModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.b(drawCacheModifier0, function10);
        }

        @Deprecated
        public static Object c(@l DrawCacheModifier drawCacheModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.c(drawCacheModifier0, object0, o0);
        }

        @Deprecated
        public static Object d(@l DrawCacheModifier drawCacheModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.d(drawCacheModifier0, object0, o0);
        }

        @Deprecated
        @l
        public static Modifier e(@l DrawCacheModifier drawCacheModifier0, @l Modifier modifier0) {
            L.p(modifier0, "other");
            return a.a(drawCacheModifier0, modifier0);
        }
    }

    void D0(@l BuildDrawCacheParams arg1);
}

