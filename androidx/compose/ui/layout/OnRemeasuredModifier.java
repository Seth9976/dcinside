package androidx.compose.ui.layout;

import A3.o;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public interface OnRemeasuredModifier extends Element {
    public static final class DefaultImpls {
        @Deprecated
        public static boolean a(@l OnRemeasuredModifier onRemeasuredModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.a(onRemeasuredModifier0, function10);
        }

        @Deprecated
        public static boolean b(@l OnRemeasuredModifier onRemeasuredModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.b(onRemeasuredModifier0, function10);
        }

        @Deprecated
        public static Object c(@l OnRemeasuredModifier onRemeasuredModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.c(onRemeasuredModifier0, object0, o0);
        }

        @Deprecated
        public static Object d(@l OnRemeasuredModifier onRemeasuredModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.d(onRemeasuredModifier0, object0, o0);
        }

        @Deprecated
        @l
        public static Modifier e(@l OnRemeasuredModifier onRemeasuredModifier0, @l Modifier modifier0) {
            L.p(modifier0, "other");
            return a.a(onRemeasuredModifier0, modifier0);
        }
    }

    void L(long arg1);
}

