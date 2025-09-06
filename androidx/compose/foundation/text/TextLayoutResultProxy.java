package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.b;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nTextLayoutResultProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
public final class TextLayoutResultProxy {
    @l
    private final TextLayoutResult a;
    @m
    private LayoutCoordinates b;
    @m
    private LayoutCoordinates c;

    public TextLayoutResultProxy(@l TextLayoutResult textLayoutResult0) {
        L.p(textLayoutResult0, "value");
        super();
        this.a = textLayoutResult0;
    }

    private final long a(long v) {
        Rect rect0;
        LayoutCoordinates layoutCoordinates0 = this.b;
        if(layoutCoordinates0 != null) {
            if(layoutCoordinates0.o()) {
                LayoutCoordinates layoutCoordinates1 = this.c;
                rect0 = null;
                if(layoutCoordinates1 != null) {
                    rect0 = b.c(layoutCoordinates1, layoutCoordinates0, false, 2, null);
                    return rect0 == null ? TextLayoutResultProxyKt.b(v, Rect.e.a()) : TextLayoutResultProxyKt.b(v, rect0);
                }
            }
            else {
                rect0 = Rect.e.a();
            }
            return rect0 == null ? TextLayoutResultProxyKt.b(v, Rect.e.a()) : TextLayoutResultProxyKt.b(v, rect0);
        }
        return TextLayoutResultProxyKt.b(v, Rect.e.a());
    }

    @m
    public final LayoutCoordinates b() {
        return this.c;
    }

    @m
    public final LayoutCoordinates c() {
        return this.b;
    }

    public final int d(int v, boolean z) {
        return this.a.o(v, z);
    }

    public static int e(TextLayoutResultProxy textLayoutResultProxy0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        return textLayoutResultProxy0.d(v, z);
    }

    public final int f(float f) {
        float f1 = Offset.r(this.k(this.a(OffsetKt.a(0.0f, f))));
        return this.a.r(f1);
    }

    public final int g(long v, boolean z) {
        if(z) {
            v = this.a(v);
        }
        long v1 = this.k(v);
        return this.a.x(v1);
    }

    public static int h(TextLayoutResultProxy textLayoutResultProxy0, long v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = true;
        }
        return textLayoutResultProxy0.g(v, z);
    }

    @l
    public final TextLayoutResult i() {
        return this.a;
    }

    public final boolean j(long v) {
        long v1 = this.k(this.a(v));
        float f = Offset.r(v1);
        int v2 = this.a.r(f);
        return Offset.p(v1) >= this.a.s(v2) && Offset.p(v1) <= this.a.t(v2);
    }

    private final long k(long v) {
        LayoutCoordinates layoutCoordinates0 = this.b;
        if(layoutCoordinates0 != null) {
            LayoutCoordinates layoutCoordinates1 = this.c;
            if(layoutCoordinates1 == null) {
                throw new NullPointerException();
            }
            Offset offset0 = Offset.d((!layoutCoordinates0.o() || !layoutCoordinates1.o() ? v : layoutCoordinates0.P(layoutCoordinates1, v)));
            return offset0 == null ? v : offset0.A();
        }
        return v;
    }

    public final void l(@m LayoutCoordinates layoutCoordinates0) {
        this.c = layoutCoordinates0;
    }

    public final void m(@m LayoutCoordinates layoutCoordinates0) {
        this.b = layoutCoordinates0;
    }
}

