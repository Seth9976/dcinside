package k;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import codes.side.andcolorpicker.model.a;
import codes.side.andcolorpicker.model.b;
import kotlin.J;
import kotlin.jvm.internal.L;
import y4.l;

public final class c {
    public static final int a(@l a a0) {
        L.p(a0, "$this$getBInt");
        return Color.blue(c.e(a0));
    }

    public static final int b(@l a a0) {
        L.p(a0, "$this$getGInt");
        return Color.green(c.e(a0));
    }

    public static final int c(@l a a0) {
        L.p(a0, "$this$getRInt");
        return Color.red(c.e(a0));
    }

    public static final void d(@l a a0, @ColorInt int v) {
        L.p(a0, "$this$setFromColorInt");
        b b0 = a0.N1();
        d.b.a(b0).d(a0, v);
    }

    @ColorInt
    public static final int e(@l a a0) {
        L.p(a0, "$this$toColorInt");
        b b0 = a0.N1();
        return d.b.a(b0).b(a0);
    }

    @ColorInt
    public static final int f(@l a a0, @l e e0) {
        L.p(a0, "$this$toContrastColor");
        L.p(e0, "mode");
        int v = ((float)c.c(a0)) * 0.299f + ((float)c.b(a0)) * 0.587f + ((float)c.a(a0)) * 0.114f > 186.0f ? 0xFF000000 : -1;
        switch(k.b.a[e0.ordinal()]) {
            case 1: {
                return v;
            }
            case 2: {
                return a0.i() < 0.5f ? 0xFF000000 : v;
            }
            case 3: {
                return a0.i() < 0.5f ? -1 : v;
            }
            default: {
                throw new J();
            }
        }
    }

    public static int g(a a0, e e0, int v, Object object0) {
        if((v & 1) != 0) {
            e0 = e.a;
        }
        return c.f(a0, e0);
    }

    @ColorInt
    public static final int h(@l a a0) {
        L.p(a0, "$this$toOpaqueColorInt");
        b b0 = a0.N1();
        return d.b.a(b0).c(a0);
    }

    @ColorInt
    public static final int i(@l a a0) {
        L.p(a0, "$this$toPureHueColorInt");
        b b0 = a0.N1();
        return d.b.a(b0).a(a0);
    }
}

