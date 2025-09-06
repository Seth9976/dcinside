package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@Stable
@s0({"SMAP\nMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,163:1\n151#2,3:164\n33#2,4:167\n154#2,2:171\n38#2:173\n156#2:174\n151#2,3:175\n33#2,4:178\n154#2,2:182\n38#2:184\n156#2:185\n151#2,3:186\n33#2,4:189\n154#2,2:193\n38#2:195\n156#2:196\n151#2,3:197\n33#2,4:200\n154#2,2:204\n38#2:206\n156#2:207\n*S KotlinDebug\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n*L\n102#1:164,3\n102#1:167,4\n102#1:171,2\n102#1:173\n102#1:174\n120#1:175,3\n120#1:178,4\n120#1:182,2\n120#1:184\n120#1:185\n137#1:186,3\n137#1:189,4\n137#1:193,2\n137#1:195\n137#1:196\n154#1:197,3\n154#1:200,4\n154#1:204,2\n154#1:206\n154#1:207\n*E\n"})
public interface MeasurePolicy {
    public static final class DefaultImpls {
        @Deprecated
        public static int a(@l MeasurePolicy measurePolicy0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
            L.p(intrinsicMeasureScope0, "$receiver");
            L.p(list0, "measurables");
            return e.a(measurePolicy0, intrinsicMeasureScope0, list0, v);
        }

        @Deprecated
        public static int b(@l MeasurePolicy measurePolicy0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
            L.p(intrinsicMeasureScope0, "$receiver");
            L.p(list0, "measurables");
            return e.b(measurePolicy0, intrinsicMeasureScope0, list0, v);
        }

        @Deprecated
        public static int c(@l MeasurePolicy measurePolicy0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
            L.p(intrinsicMeasureScope0, "$receiver");
            L.p(list0, "measurables");
            return e.c(measurePolicy0, intrinsicMeasureScope0, list0, v);
        }

        @Deprecated
        public static int d(@l MeasurePolicy measurePolicy0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
            L.p(intrinsicMeasureScope0, "$receiver");
            L.p(list0, "measurables");
            return e.d(measurePolicy0, intrinsicMeasureScope0, list0, v);
        }
    }

    @l
    MeasureResult a(@l MeasureScope arg1, @l List arg2, long arg3);

    int b(@l IntrinsicMeasureScope arg1, @l List arg2, int arg3);

    int c(@l IntrinsicMeasureScope arg1, @l List arg2, int arg3);

    int d(@l IntrinsicMeasureScope arg1, @l List arg2, int arg3);

    int e(@l IntrinsicMeasureScope arg1, @l List arg2, int arg3);
}

