package androidx.compose.ui.input.pointer;

import A3.o;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public interface PointerInputModifier extends Element {
    public static final class DefaultImpls {
        @Deprecated
        public static boolean a(@l PointerInputModifier pointerInputModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.a(pointerInputModifier0, function10);
        }

        @Deprecated
        public static boolean b(@l PointerInputModifier pointerInputModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.b(pointerInputModifier0, function10);
        }

        @Deprecated
        public static Object c(@l PointerInputModifier pointerInputModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.c(pointerInputModifier0, object0, o0);
        }

        @Deprecated
        public static Object d(@l PointerInputModifier pointerInputModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.d(pointerInputModifier0, object0, o0);
        }

        @Deprecated
        @l
        public static Modifier e(@l PointerInputModifier pointerInputModifier0, @l Modifier modifier0) {
            L.p(modifier0, "other");
            return a.a(pointerInputModifier0, modifier0);
        }
    }

    @l
    PointerInputFilter t1();
}

