package androidx.compose.ui.semantics;

import A3.o;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.b;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

public interface SemanticsModifier extends Element {
    public static final class DefaultImpls {
        @Deprecated
        public static boolean a(@l SemanticsModifier semanticsModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.a(semanticsModifier0, function10);
        }

        @Deprecated
        public static boolean b(@l SemanticsModifier semanticsModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.b(semanticsModifier0, function10);
        }

        @Deprecated
        public static Object c(@l SemanticsModifier semanticsModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.c(semanticsModifier0, object0, o0);
        }

        @Deprecated
        public static Object d(@l SemanticsModifier semanticsModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.d(semanticsModifier0, object0, o0);
        }

        @Deprecated
        public static int e(@l SemanticsModifier semanticsModifier0) {
            return a.f(semanticsModifier0);
        }

        @k(message = "SemanticsModifier.id is now unused and has been set to a fixed value. Retrieve the id from LayoutInfo instead.", replaceWith = @c0(expression = "", imports = {}))
        public static void f() {
        }

        @Deprecated
        @l
        public static Modifier g(@l SemanticsModifier semanticsModifier0, @l Modifier modifier0) {
            L.p(modifier0, "other");
            return androidx.compose.ui.a.a(semanticsModifier0, modifier0);
        }
    }

    @l
    SemanticsConfiguration c0();

    int getId();
}

