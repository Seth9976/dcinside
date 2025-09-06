package androidx.compose.ui.modifier;

import A3.o;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

@Stable
public interface ModifierLocalConsumer extends Element {
    public static final class DefaultImpls {
        @Deprecated
        public static boolean a(@l ModifierLocalConsumer modifierLocalConsumer0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.a(modifierLocalConsumer0, function10);
        }

        @Deprecated
        public static boolean b(@l ModifierLocalConsumer modifierLocalConsumer0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.b(modifierLocalConsumer0, function10);
        }

        @Deprecated
        public static Object c(@l ModifierLocalConsumer modifierLocalConsumer0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.c(modifierLocalConsumer0, object0, o0);
        }

        @Deprecated
        public static Object d(@l ModifierLocalConsumer modifierLocalConsumer0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.d(modifierLocalConsumer0, object0, o0);
        }

        @Deprecated
        @l
        public static Modifier e(@l ModifierLocalConsumer modifierLocalConsumer0, @l Modifier modifier0) {
            L.p(modifier0, "other");
            return a.a(modifierLocalConsumer0, modifier0);
        }
    }

    void r1(@l ModifierLocalReadScope arg1);
}

