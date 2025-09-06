package androidx.compose.ui.layout;

import A3.o;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public interface LayoutModifier extends Element {
    public static final class DefaultImpls {
        @Deprecated
        public static boolean a(@l LayoutModifier layoutModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.a(layoutModifier0, function10);
        }

        @Deprecated
        public static boolean b(@l LayoutModifier layoutModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.b(layoutModifier0, function10);
        }

        @Deprecated
        public static Object c(@l LayoutModifier layoutModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.c(layoutModifier0, object0, o0);
        }

        @Deprecated
        public static Object d(@l LayoutModifier layoutModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.d(layoutModifier0, object0, o0);
        }

        @Deprecated
        public static int e(@l LayoutModifier layoutModifier0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
            L.p(intrinsicMeasureScope0, "$receiver");
            L.p(intrinsicMeasurable0, "measurable");
            return c.a(layoutModifier0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
        }

        @Deprecated
        public static int f(@l LayoutModifier layoutModifier0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
            L.p(intrinsicMeasureScope0, "$receiver");
            L.p(intrinsicMeasurable0, "measurable");
            return c.b(layoutModifier0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
        }

        @Deprecated
        public static int g(@l LayoutModifier layoutModifier0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
            L.p(intrinsicMeasureScope0, "$receiver");
            L.p(intrinsicMeasurable0, "measurable");
            return c.c(layoutModifier0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
        }

        @Deprecated
        public static int h(@l LayoutModifier layoutModifier0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
            L.p(intrinsicMeasureScope0, "$receiver");
            L.p(intrinsicMeasurable0, "measurable");
            return c.d(layoutModifier0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
        }

        @Deprecated
        @l
        public static Modifier i(@l LayoutModifier layoutModifier0, @l Modifier modifier0) {
            L.p(modifier0, "other");
            return a.a(layoutModifier0, modifier0);
        }
    }

    int c(@l IntrinsicMeasureScope arg1, @l IntrinsicMeasurable arg2, int arg3);

    int e(@l IntrinsicMeasureScope arg1, @l IntrinsicMeasurable arg2, int arg3);

    int f(@l IntrinsicMeasureScope arg1, @l IntrinsicMeasurable arg2, int arg3);

    int g(@l IntrinsicMeasureScope arg1, @l IntrinsicMeasurable arg2, int arg3);

    @l
    MeasureResult h(@l MeasureScope arg1, @l Measurable arg2, long arg3);
}

