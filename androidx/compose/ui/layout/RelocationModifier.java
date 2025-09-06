package androidx.compose.ui.layout;

import A3.o;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.geometry.Rect;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;

@ExperimentalComposeUiApi
@k(level = m.b, message = "Please use BringIntoViewResponder instead.")
public interface RelocationModifier extends Element {
    public static final class DefaultImpls {
        @Deprecated
        public static boolean a(@l RelocationModifier relocationModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.a(relocationModifier0, function10);
        }

        @Deprecated
        public static boolean b(@l RelocationModifier relocationModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.b(relocationModifier0, function10);
        }

        @Deprecated
        public static Object c(@l RelocationModifier relocationModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.c(relocationModifier0, object0, o0);
        }

        @Deprecated
        public static Object d(@l RelocationModifier relocationModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.d(relocationModifier0, object0, o0);
        }

        @Deprecated
        @l
        public static Modifier e(@l RelocationModifier relocationModifier0, @l Modifier modifier0) {
            L.p(modifier0, "other");
            return a.a(relocationModifier0, modifier0);
        }
    }

    @l
    Rect S0(@l Rect arg1, @l LayoutCoordinates arg2);

    @y4.m
    Object z1(@l Rect arg1, @l Rect arg2, @l d arg3);
}

