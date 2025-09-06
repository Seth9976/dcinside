package androidx.compose.ui.focus;

import A3.o;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

@k(message = "Use Modifier.focusProperties() instead")
public interface FocusOrderModifier extends Element {
    public static final class DefaultImpls {
        @Deprecated
        public static boolean a(@l FocusOrderModifier focusOrderModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.a(focusOrderModifier0, function10);
        }

        @Deprecated
        public static boolean b(@l FocusOrderModifier focusOrderModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.b(focusOrderModifier0, function10);
        }

        @Deprecated
        public static Object c(@l FocusOrderModifier focusOrderModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.c(focusOrderModifier0, object0, o0);
        }

        @Deprecated
        public static Object d(@l FocusOrderModifier focusOrderModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.d(focusOrderModifier0, object0, o0);
        }

        @Deprecated
        @l
        public static Modifier e(@l FocusOrderModifier focusOrderModifier0, @l Modifier modifier0) {
            L.p(modifier0, "other");
            return a.a(focusOrderModifier0, modifier0);
        }
    }

    void G0(@l FocusOrder arg1);
}

