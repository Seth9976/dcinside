package androidx.compose.ui.draw;

import A3.o;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public interface DrawModifier extends Element {
    public static final class DefaultImpls {
        @Deprecated
        public static boolean a(@l DrawModifier drawModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.a(drawModifier0, function10);
        }

        @Deprecated
        public static boolean b(@l DrawModifier drawModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.b(drawModifier0, function10);
        }

        @Deprecated
        public static Object c(@l DrawModifier drawModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.c(drawModifier0, object0, o0);
        }

        @Deprecated
        public static Object d(@l DrawModifier drawModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.d(drawModifier0, object0, o0);
        }

        @Deprecated
        @l
        public static Modifier e(@l DrawModifier drawModifier0, @l Modifier modifier0) {
            L.p(modifier0, "other");
            return a.a(drawModifier0, modifier0);
        }
    }

    void v(@l ContentDrawScope arg1);
}

