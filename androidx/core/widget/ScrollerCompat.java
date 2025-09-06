package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
public final class ScrollerCompat {
    OverScroller a;

    ScrollerCompat(Context context0, Interpolator interpolator0) {
        this.a = interpolator0 == null ? new OverScroller(context0) : new OverScroller(context0, interpolator0);
    }

    @Deprecated
    public void a() {
        this.a.abortAnimation();
    }

    @Deprecated
    public boolean b() {
        return this.a.computeScrollOffset();
    }

    @Deprecated
    public static ScrollerCompat c(Context context0) {
        return ScrollerCompat.d(context0, null);
    }

    @Deprecated
    public static ScrollerCompat d(Context context0, Interpolator interpolator0) {
        return new ScrollerCompat(context0, interpolator0);
    }

    @Deprecated
    public void e(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        this.a.fling(v, v1, v2, v3, v4, v5, v6, v7);
    }

    @Deprecated
    public void f(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9) {
        this.a.fling(v, v1, v2, v3, v4, v5, v6, v7, v8, v9);
    }

    @Deprecated
    public float g() {
        return this.a.getCurrVelocity();
    }

    @Deprecated
    public int h() {
        return this.a.getCurrX();
    }

    @Deprecated
    public int i() {
        return this.a.getCurrY();
    }

    @Deprecated
    public int j() {
        return this.a.getFinalX();
    }

    @Deprecated
    public int k() {
        return this.a.getFinalY();
    }

    @Deprecated
    public boolean l() {
        return this.a.isFinished();
    }

    @Deprecated
    public boolean m() {
        return this.a.isOverScrolled();
    }

    @Deprecated
    public void n(int v, int v1, int v2) {
        this.a.notifyHorizontalEdgeReached(v, v1, v2);
    }

    @Deprecated
    public void o(int v, int v1, int v2) {
        this.a.notifyVerticalEdgeReached(v, v1, v2);
    }

    @Deprecated
    public boolean p(int v, int v1, int v2, int v3, int v4, int v5) {
        return this.a.springBack(v, v1, v2, v3, v4, v5);
    }

    @Deprecated
    public void q(int v, int v1, int v2, int v3) {
        this.a.startScroll(v, v1, v2, v3);
    }

    @Deprecated
    public void r(int v, int v1, int v2, int v3, int v4) {
        this.a.startScroll(v, v1, v2, v3, v4);
    }
}

