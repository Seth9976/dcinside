package androidx.compose.ui.layout;

import A3.o;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface ParentDataModifier extends Element {
    public static final class DefaultImpls {
        @Deprecated
        public static boolean a(@l ParentDataModifier parentDataModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.a(parentDataModifier0, function10);
        }

        @Deprecated
        public static boolean b(@l ParentDataModifier parentDataModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.b(parentDataModifier0, function10);
        }

        @Deprecated
        public static Object c(@l ParentDataModifier parentDataModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.c(parentDataModifier0, object0, o0);
        }

        @Deprecated
        public static Object d(@l ParentDataModifier parentDataModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.d(parentDataModifier0, object0, o0);
        }

        @Deprecated
        @l
        public static Modifier e(@l ParentDataModifier parentDataModifier0, @l Modifier modifier0) {
            L.p(modifier0, "other");
            return a.a(parentDataModifier0, modifier0);
        }
    }

    @m
    Object E(@l Density arg1, @m Object arg2);
}

