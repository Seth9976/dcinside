package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.layout.LayoutCoordinates;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public abstract class PointerInputFilter {
    @m
    private LayoutCoordinates a;
    private boolean b;
    public static final int c = 8;

    static {
    }

    public boolean A1() {
        return false;
    }

    @m
    public final LayoutCoordinates Q() {
        return this.a;
    }

    @ExperimentalComposeUiApi
    public boolean Z() {
        return false;
    }

    // 去混淆评级： 低(20)
    public final long a() {
        return this.a == null ? 0L : this.a.a();
    }

    @ExperimentalComposeUiApi
    public static void e0() {
    }

    public final boolean f0() {
        return this.b;
    }

    public abstract void j0();

    public abstract void m0(@l PointerEvent arg1, @l PointerEventPass arg2, long arg3);

    public final void t0(boolean z) {
        this.b = z;
    }

    public final void y0(@m LayoutCoordinates layoutCoordinates0) {
        this.a = layoutCoordinates0;
    }
}

