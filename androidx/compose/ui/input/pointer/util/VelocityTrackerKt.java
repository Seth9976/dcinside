package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,599:1\n33#2,6:600\n1#3:606\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n297#1:600,6\n*E\n"})
public final class VelocityTrackerKt {
    private static final int a = 40;
    private static final int b = 20;
    private static final int c = 100;
    private static final float d = 1.0f;

    public static final void c(@l VelocityTracker velocityTracker0, @l PointerInputChange pointerInputChange0) {
        L.p(velocityTracker0, "<this>");
        L.p(pointerInputChange0, "event");
        if(PointerEventKt.c(pointerInputChange0)) {
            velocityTracker0.e(pointerInputChange0.q());
            velocityTracker0.d();
        }
        long v = pointerInputChange0.u();
        List list0 = pointerInputChange0.n();
        int v1 = list0.size();
        int v2 = 0;
        while(v2 < v1) {
            HistoricalChange historicalChange0 = (HistoricalChange)list0.get(v2);
            velocityTracker0.e(Offset.v(velocityTracker0.c(), Offset.u(historicalChange0.a(), v)));
            velocityTracker0.a(historicalChange0.b(), velocityTracker0.c());
            ++v2;
            v = historicalChange0.a();
        }
        velocityTracker0.e(Offset.v(velocityTracker0.c(), Offset.u(pointerInputChange0.q(), v)));
        velocityTracker0.a(pointerInputChange0.z(), velocityTracker0.c());
    }

    private static final float d(List list0, List list1, boolean z) {
        int v = list0.size();
        float f = 0.0f;
        if(v < 2) {
            return 0.0f;
        }
        if(v == 2) {
            if(((Number)list1.get(0)).floatValue() == ((Number)list1.get(1)).floatValue()) {
                return 0.0f;
            }
            return z ? ((Number)list0.get(0)).floatValue() / (((Number)list1.get(0)).floatValue() - ((Number)list1.get(1)).floatValue()) : (((Number)list0.get(0)).floatValue() - ((Number)list0.get(1)).floatValue()) / (((Number)list1.get(0)).floatValue() - ((Number)list1.get(1)).floatValue());
        }
        for(int v1 = v - 1; v1 > 0; --v1) {
            if(((Number)list1.get(v1)).floatValue() != ((Number)list1.get(v1 - 1)).floatValue()) {
                float f1 = (z ? -((Number)list0.get(v1 - 1)).floatValue() : ((Number)list0.get(v1)).floatValue() - ((Number)list0.get(v1 - 1)).floatValue()) / (((Number)list1.get(v1)).floatValue() - ((Number)list1.get(v1 - 1)).floatValue());
                f += (f1 - VelocityTrackerKt.e(f)) * Math.abs(f1);
                if(v1 == v - 1) {
                    f *= 0.5f;
                }
            }
        }
        return VelocityTrackerKt.e(f);
    }

    private static final float e(float f) {
        return Math.signum(f) * ((float)Math.sqrt(2.0f * Math.abs(f)));
    }

    @l
    public static final List f(@l List list0, @l List list1, int v) {
        L.p(list0, "x");
        L.p(list1, "y");
        if(v < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        }
        if(list0.size() != list1.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        }
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        int v1 = v < list0.size() ? v : list0.size() - 1;
        List list2 = new ArrayList(v + 1);
        for(int v3 = 0; v3 < v + 1; ++v3) {
            ((ArrayList)list2).add(0.0f);
        }
        int v4 = list0.size();
        Matrix matrix0 = new Matrix(v1 + 1, v4);
        for(int v5 = 0; v5 < v4; ++v5) {
            matrix0.c(0, v5, 1.0f);
            for(int v6 = 1; v6 < v1 + 1; ++v6) {
                matrix0.c(v6, v5, matrix0.a(v6 - 1, v5) * ((Number)list0.get(v5)).floatValue());
            }
        }
        Matrix matrix1 = new Matrix(v1 + 1, v4);
        Matrix matrix2 = new Matrix(v1 + 1, v1 + 1);
        for(int v7 = 0; v7 < v1 + 1; ++v7) {
            for(int v8 = 0; v8 < v4; ++v8) {
                matrix1.c(v7, v8, matrix0.a(v7, v8));
            }
            for(int v9 = 0; v9 < v7; ++v9) {
                float f = matrix1.b(v7).f(matrix1.b(v9));
                for(int v10 = 0; v10 < v4; ++v10) {
                    matrix1.c(v7, v10, matrix1.a(v7, v10) - matrix1.a(v9, v10) * f);
                }
            }
            float f1 = matrix1.b(v7).d();
            if(((double)f1) < 0.000001) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f2 = 1.0f / f1;
            for(int v11 = 0; v11 < v4; ++v11) {
                matrix1.c(v7, v11, matrix1.a(v7, v11) * f2);
            }
            for(int v12 = 0; v12 < v1 + 1; ++v12) {
                matrix2.c(v7, v12, (v12 >= v7 ? matrix1.b(v7).f(matrix0.b(v12)) : 0.0f));
            }
        }
        Vector vector0 = new Vector(v4);
        for(int v2 = 0; v2 < v4; ++v2) {
            vector0.e(v2, ((Number)list1.get(v2)).floatValue() * 1.0f);
        }
        for(int v13 = v1; -1 < v13; --v13) {
            list2.set(v13, matrix1.b(v13).f(vector0));
            int v14 = v13 + 1;
            if(v14 <= v1) {
                for(int v15 = v1; true; --v15) {
                    list2.set(v13, ((float)(((Number)list2.get(v13)).floatValue() - matrix2.a(v13, v15) * ((Number)list2.get(v15)).floatValue())));
                    if(v15 == v14) {
                        break;
                    }
                }
            }
            list2.set(v13, ((float)(((Number)list2.get(v13)).floatValue() / matrix2.a(v13, v13))));
        }
        return list2;
    }

    private static final void g(DataPointAtTime[] arr_dataPointAtTime, int v, long v1, float f) {
        DataPointAtTime dataPointAtTime0 = arr_dataPointAtTime[v];
        if(dataPointAtTime0 == null) {
            arr_dataPointAtTime[v] = new DataPointAtTime(v1, f);
            return;
        }
        dataPointAtTime0.h(v1);
        dataPointAtTime0.g(f);
    }
}

