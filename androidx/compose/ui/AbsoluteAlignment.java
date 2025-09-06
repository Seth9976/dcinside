package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import y4.l;

@StabilityInferred(parameters = 0)
public final class AbsoluteAlignment {
    @l
    public static final AbsoluteAlignment a;
    @l
    private static final Alignment b;
    @l
    private static final Alignment c;
    @l
    private static final Alignment d;
    @l
    private static final Alignment e;
    @l
    private static final Alignment f;
    @l
    private static final Alignment g;
    @l
    private static final Horizontal h;
    @l
    private static final Horizontal i;
    public static final int j;

    static {
        AbsoluteAlignment.a = new AbsoluteAlignment();
        AbsoluteAlignment.b = new BiasAbsoluteAlignment(-1.0f, -1.0f);
        AbsoluteAlignment.c = new BiasAbsoluteAlignment(1.0f, -1.0f);
        AbsoluteAlignment.d = new BiasAbsoluteAlignment(-1.0f, 0.0f);
        AbsoluteAlignment.e = new BiasAbsoluteAlignment(1.0f, 0.0f);
        AbsoluteAlignment.f = new BiasAbsoluteAlignment(-1.0f, 1.0f);
        AbsoluteAlignment.g = new BiasAbsoluteAlignment(1.0f, 1.0f);
        AbsoluteAlignment.h = new androidx.compose.ui.BiasAbsoluteAlignment.Horizontal(-1.0f);
        AbsoluteAlignment.i = new androidx.compose.ui.BiasAbsoluteAlignment.Horizontal(1.0f);
    }

    @l
    public final Alignment a() {
        return AbsoluteAlignment.f;
    }

    @Stable
    public static void b() {
    }

    @l
    public final Alignment c() {
        return AbsoluteAlignment.g;
    }

    @Stable
    public static void d() {
    }

    @l
    public final Alignment e() {
        return AbsoluteAlignment.d;
    }

    @Stable
    public static void f() {
    }

    @l
    public final Alignment g() {
        return AbsoluteAlignment.e;
    }

    @Stable
    public static void h() {
    }

    @l
    public final Horizontal i() {
        return AbsoluteAlignment.h;
    }

    @Stable
    public static void j() {
    }

    @l
    public final Horizontal k() {
        return AbsoluteAlignment.i;
    }

    @Stable
    public static void l() {
    }

    @l
    public final Alignment m() {
        return AbsoluteAlignment.b;
    }

    @Stable
    public static void n() {
    }

    @l
    public final Alignment o() {
        return AbsoluteAlignment.c;
    }

    @Stable
    public static void p() {
    }
}

