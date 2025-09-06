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

@k(message = "Use FocusEventModifierNode instead")
public interface FocusEventModifier extends Element {
    public static final class DefaultImpls {
        @Deprecated
        public static boolean a(@l FocusEventModifier focusEventModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.a(focusEventModifier0, function10);
        }

        @Deprecated
        public static boolean b(@l FocusEventModifier focusEventModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.b(focusEventModifier0, function10);
        }

        @Deprecated
        public static Object c(@l FocusEventModifier focusEventModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.c(focusEventModifier0, object0, o0);
        }

        @Deprecated
        public static Object d(@l FocusEventModifier focusEventModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.d(focusEventModifier0, object0, o0);
        }

        @Deprecated
        @l
        public static Modifier e(@l FocusEventModifier focusEventModifier0, @l Modifier modifier0) {
            L.p(modifier0, "other");
            return a.a(focusEventModifier0, modifier0);
        }
    }

    void K(@l FocusState arg1);
}

