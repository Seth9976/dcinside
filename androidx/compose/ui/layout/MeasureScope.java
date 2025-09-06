package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.a;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public interface MeasureScope extends IntrinsicMeasureScope {
    public static final class DefaultImpls {
        @Deprecated
        @l
        public static MeasureResult a(@l MeasureScope measureScope0, int v, int v1, @l Map map0, @l Function1 function10) {
            L.p(map0, "alignmentLines");
            L.p(function10, "placementBlock");
            return MeasureScope.-CC.a(measureScope0, v, v1, map0, function10);
        }

        public static MeasureResult b(MeasureScope measureScope0, int v, int v1, Map map0, Function1 function10, int v2, Object object0) {
            return MeasureScope.-CC.p(measureScope0, v, v1, map0, function10, v2, object0);
        }

        @Stable
        @Deprecated
        public static int c(@l MeasureScope measureScope0, long v) {
            return a.a(measureScope0, v);
        }

        @Stable
        @Deprecated
        public static int d(@l MeasureScope measureScope0, float f) {
            return a.b(measureScope0, f);
        }

        @Stable
        @Deprecated
        public static float e(@l MeasureScope measureScope0, long v) {
            return a.c(measureScope0, v);
        }

        @Stable
        @Deprecated
        public static float f(@l MeasureScope measureScope0, float f) {
            return a.d(measureScope0, f);
        }

        @Stable
        @Deprecated
        public static float g(@l MeasureScope measureScope0, int v) {
            return a.e(measureScope0, v);
        }

        @Stable
        @Deprecated
        public static long h(@l MeasureScope measureScope0, long v) {
            return a.f(measureScope0, v);
        }

        @Stable
        @Deprecated
        public static float i(@l MeasureScope measureScope0, long v) {
            return a.g(measureScope0, v);
        }

        @Stable
        @Deprecated
        public static float j(@l MeasureScope measureScope0, float f) {
            return a.h(measureScope0, f);
        }

        @Stable
        @Deprecated
        @l
        public static Rect k(@l MeasureScope measureScope0, @l DpRect dpRect0) {
            L.p(dpRect0, "$receiver");
            return a.i(measureScope0, dpRect0);
        }

        @Stable
        @Deprecated
        public static long l(@l MeasureScope measureScope0, long v) {
            return a.j(measureScope0, v);
        }

        @Stable
        @Deprecated
        public static long m(@l MeasureScope measureScope0, float f) {
            return a.k(measureScope0, f);
        }

        @Stable
        @Deprecated
        public static long n(@l MeasureScope measureScope0, float f) {
            return a.l(measureScope0, f);
        }

        @Stable
        @Deprecated
        public static long o(@l MeasureScope measureScope0, int v) {
            return a.m(measureScope0, v);
        }
    }

    @l
    MeasureResult o1(int arg1, int arg2, @l Map arg3, @l Function1 arg4);
}

