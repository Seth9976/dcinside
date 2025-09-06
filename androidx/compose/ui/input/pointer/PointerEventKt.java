package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

public final class PointerEventKt {
    @k(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @c0(expression = "isConsumed", imports = {}))
    public static final boolean a(@l PointerInputChange pointerInputChange0) {
        L.p(pointerInputChange0, "<this>");
        return pointerInputChange0.A();
    }

    public static final boolean b(@l PointerInputChange pointerInputChange0) {
        L.p(pointerInputChange0, "<this>");
        return !pointerInputChange0.A() && !pointerInputChange0.v() && pointerInputChange0.r();
    }

    public static final boolean c(@l PointerInputChange pointerInputChange0) {
        L.p(pointerInputChange0, "<this>");
        return !pointerInputChange0.v() && pointerInputChange0.r();
    }

    public static final boolean d(@l PointerInputChange pointerInputChange0) {
        L.p(pointerInputChange0, "<this>");
        return !pointerInputChange0.A() && pointerInputChange0.v() && !pointerInputChange0.r();
    }

    public static final boolean e(@l PointerInputChange pointerInputChange0) {
        L.p(pointerInputChange0, "<this>");
        return pointerInputChange0.v() && !pointerInputChange0.r();
    }

    @k(message = "Use consume() instead", replaceWith = @c0(expression = "consume()", imports = {}))
    public static final void f(@l PointerInputChange pointerInputChange0) {
        L.p(pointerInputChange0, "<this>");
        pointerInputChange0.a();
    }

    @k(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @c0(expression = "if (pressed != previousPressed) consume()", imports = {}))
    public static final void g(@l PointerInputChange pointerInputChange0) {
        L.p(pointerInputChange0, "<this>");
        if(pointerInputChange0.r() != pointerInputChange0.v()) {
            pointerInputChange0.a();
        }
    }

    @k(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @c0(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    public static final void h(@l PointerInputChange pointerInputChange0) {
        L.p(pointerInputChange0, "<this>");
        if(!Offset.l(PointerEventKt.k(pointerInputChange0), 0L)) {
            pointerInputChange0.a();
        }
    }

    @k(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @c0(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    public static final boolean i(@l PointerInputChange pointerInputChange0, long v) {
        L.p(pointerInputChange0, "$this$isOutOfBounds");
        long v1 = pointerInputChange0.q();
        float f = Offset.p(v1);
        float f1 = Offset.r(v1);
        return f < 0.0f || f > ((float)(((int)(v >> 0x20)))) || f1 < 0.0f || f1 > ((float)(((int)(v & 0xFFFFFFFFL))));
    }

    public static final boolean j(@l PointerInputChange pointerInputChange0, long v, long v1) {
        L.p(pointerInputChange0, "$this$isOutOfBounds");
        if(!PointerType.i(pointerInputChange0.y(), 1)) {
            return PointerEventKt.i(pointerInputChange0, v);
        }
        long v2 = pointerInputChange0.q();
        float f = Offset.p(v2);
        float f1 = Offset.r(v2);
        return f < -Size.t(v1) || f > ((float)(((int)(v >> 0x20)))) + Size.t(v1) || f1 < -Size.m(v1) || f1 > ((float)(((int)(v & 0xFFFFFFFFL)))) + Size.m(v1);
    }

    public static final long k(@l PointerInputChange pointerInputChange0) {
        L.p(pointerInputChange0, "<this>");
        return PointerEventKt.n(pointerInputChange0, false);
    }

    @k(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @c0(expression = "isConsumed", imports = {}))
    public static final boolean l(@l PointerInputChange pointerInputChange0) {
        L.p(pointerInputChange0, "<this>");
        return pointerInputChange0.A();
    }

    public static final long m(@l PointerInputChange pointerInputChange0) {
        L.p(pointerInputChange0, "<this>");
        return PointerEventKt.n(pointerInputChange0, true);
    }

    // 去混淆评级： 低(40)
    private static final long n(PointerInputChange pointerInputChange0, boolean z) {
        return z || !pointerInputChange0.A() ? Offset.u(pointerInputChange0.q(), pointerInputChange0.u()) : 0L;
    }

    static long o(PointerInputChange pointerInputChange0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return PointerEventKt.n(pointerInputChange0, z);
    }

    public static final boolean p(@l PointerInputChange pointerInputChange0) {
        L.p(pointerInputChange0, "<this>");
        return !Offset.l(PointerEventKt.n(pointerInputChange0, false), 0L);
    }

    public static final boolean q(@l PointerInputChange pointerInputChange0) {
        L.p(pointerInputChange0, "<this>");
        return !Offset.l(PointerEventKt.n(pointerInputChange0, true), 0L);
    }
}

