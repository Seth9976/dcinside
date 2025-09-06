package androidx.compose.ui.input.pointer;

import A3.p;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nPointerInputTestUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,148:1\n33#2,6:149\n*S KotlinDebug\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n*L\n144#1:149,6\n*E\n"})
public final class PointerInputTestUtilKt {
    @l
    public static final PointerInputChange a(long v, long v1, float f, float f1) {
        return new PointerInputChange(v, v1, OffsetKt.a(f, f1), true, 1.0f, v1, OffsetKt.a(f, f1), false, false, 0, 0L, 0x600, null);
    }

    public static PointerInputChange b(long v, long v1, float f, float f1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0L;
        }
        float f2 = (v2 & 4) == 0 ? f : 0.0f;
        return (v2 & 8) == 0 ? PointerInputTestUtilKt.a(v, v1, f2, f1) : PointerInputTestUtilKt.a(v, v1, f2, 0.0f);
    }

    public static final void c(@l p p0, @l PointerEvent pointerEvent0, long v) {
        L.p(p0, "$this$invokeOverAllPasses");
        L.p(pointerEvent0, "pointerEvent");
        PointerInputTestUtilKt.g(p0, pointerEvent0, u.O(new PointerEventPass[]{PointerEventPass.a, PointerEventPass.b, PointerEventPass.c}), v);
    }

    public static void d(p p0, PointerEvent pointerEvent0, long v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x7FFFFFFF7FFFFFFFL;
        }
        PointerInputTestUtilKt.c(p0, pointerEvent0, v);
    }

    public static final void e(@l p p0, @l PointerEvent pointerEvent0, @l PointerEventPass pointerEventPass0, long v) {
        L.p(p0, "$this$invokeOverPass");
        L.p(pointerEvent0, "pointerEvent");
        L.p(pointerEventPass0, "pointerEventPass");
        PointerInputTestUtilKt.g(p0, pointerEvent0, u.k(pointerEventPass0), v);
    }

    public static void f(p p0, PointerEvent pointerEvent0, PointerEventPass pointerEventPass0, long v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0x7FFFFFFF7FFFFFFFL;
        }
        PointerInputTestUtilKt.e(p0, pointerEvent0, pointerEventPass0, v);
    }

    public static final void g(@l p p0, @l PointerEvent pointerEvent0, @l List list0, long v) {
        L.p(p0, "$this$invokeOverPasses");
        L.p(pointerEvent0, "pointerEvent");
        L.p(list0, "pointerEventPasses");
        if(pointerEvent0.e().isEmpty() || list0.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            p0.invoke(pointerEvent0, ((PointerEventPass)list0.get(v2)), IntSize.b(v));
        }
    }

    public static final void h(@l p p0, @l PointerEvent pointerEvent0, @l PointerEventPass[] arr_pointerEventPass, long v) {
        L.p(p0, "$this$invokeOverPasses");
        L.p(pointerEvent0, "pointerEvent");
        L.p(arr_pointerEventPass, "pointerEventPasses");
        PointerInputTestUtilKt.g(p0, pointerEvent0, kotlin.collections.l.Ky(arr_pointerEventPass), v);
    }

    public static void i(p p0, PointerEvent pointerEvent0, List list0, long v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0x7FFFFFFF7FFFFFFFL;
        }
        PointerInputTestUtilKt.g(p0, pointerEvent0, list0, v);
    }

    public static void j(p p0, PointerEvent pointerEvent0, PointerEventPass[] arr_pointerEventPass, long v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0x7FFFFFFF7FFFFFFFL;
        }
        PointerInputTestUtilKt.h(p0, pointerEvent0, arr_pointerEventPass, v);
    }

    @l
    public static final PointerInputChange k(@l PointerInputChange pointerInputChange0, long v, float f, float f1) {
        L.p(pointerInputChange0, "<this>");
        return new PointerInputChange(pointerInputChange0.p(), pointerInputChange0.z() + v, OffsetKt.a(Offset.p(pointerInputChange0.q()) + f, Offset.r(pointerInputChange0.q()) + f1), true, 1.0f, pointerInputChange0.z(), pointerInputChange0.q(), pointerInputChange0.r(), false, 0, 0L, 0x600, null);
    }

    public static PointerInputChange l(PointerInputChange pointerInputChange0, long v, float f, float f1, int v1, Object object0) {
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        if((v1 & 4) != 0) {
            f1 = 0.0f;
        }
        return PointerInputTestUtilKt.k(pointerInputChange0, v, f, f1);
    }

    @l
    public static final PointerInputChange m(@l PointerInputChange pointerInputChange0, long v, float f, float f1) {
        L.p(pointerInputChange0, "<this>");
        return new PointerInputChange(pointerInputChange0.p(), v, OffsetKt.a(f, f1), true, 1.0f, pointerInputChange0.z(), pointerInputChange0.q(), pointerInputChange0.r(), false, 0, 0L, 0x600, null);
    }

    public static PointerInputChange n(PointerInputChange pointerInputChange0, long v, float f, float f1, int v1, Object object0) {
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        if((v1 & 4) != 0) {
            f1 = 0.0f;
        }
        return PointerInputTestUtilKt.m(pointerInputChange0, v, f, f1);
    }

    @l
    public static final PointerInputChange o(@l PointerInputChange pointerInputChange0, long v) {
        L.p(pointerInputChange0, "<this>");
        return new PointerInputChange(pointerInputChange0.p(), v, pointerInputChange0.q(), false, 1.0f, pointerInputChange0.z(), pointerInputChange0.q(), pointerInputChange0.r(), false, 0, 0L, 0x600, null);
    }
}

