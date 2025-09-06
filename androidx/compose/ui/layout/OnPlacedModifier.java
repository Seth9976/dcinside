package androidx.compose.ui.layout;

import A3.o;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public interface OnPlacedModifier extends Element {
    public static final class DefaultImpls {
        @Deprecated
        public static boolean a(@l OnPlacedModifier onPlacedModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.a(onPlacedModifier0, function10);
        }

        @Deprecated
        public static boolean b(@l OnPlacedModifier onPlacedModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.b(onPlacedModifier0, function10);
        }

        @Deprecated
        public static Object c(@l OnPlacedModifier onPlacedModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.c(onPlacedModifier0, object0, o0);
        }

        @Deprecated
        public static Object d(@l OnPlacedModifier onPlacedModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.d(onPlacedModifier0, object0, o0);
        }

        @Deprecated
        @l
        public static Modifier e(@l OnPlacedModifier onPlacedModifier0, @l Modifier modifier0) {
            L.p(modifier0, "other");
            return a.a(onPlacedModifier0, modifier0);
        }
    }

    void o(@l LayoutCoordinates arg1);
}

