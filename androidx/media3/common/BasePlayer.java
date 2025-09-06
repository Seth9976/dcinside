package androidx.media3.common;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O2;
import java.util.List;

@UnstableApi
public abstract class BasePlayer implements Player {
    protected final Window b1;

    protected BasePlayer() {
        this.b1 = new Window();
    }

    @Override  // androidx.media3.common.Player
    public final void A(int v, MediaItem mediaItem0) {
        this.I(v, v + 1, O2.B(mediaItem0));
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final int A1() {
        return this.n2();
    }

    private void A2(int v) {
        this.B2(this.n2(), 0x8000000000000001L, v, true);
    }

    @Override  // androidx.media3.common.Player
    public final void B1() {
        if(!this.O1().w() && !this.W()) {
            boolean z = this.Z1();
            if(this.j1() && !this.V0()) {
                if(z) {
                    this.G2(7);
                    return;
                }
                this.z2(7);
                return;
            }
            if(z && this.getCurrentPosition() <= this.H0()) {
                this.G2(7);
                return;
            }
            this.C2(0L, 7);
            return;
        }
        this.z2(7);
    }

    @VisibleForTesting(otherwise = 4)
    public abstract void B2(int arg1, long arg2, int arg3, boolean arg4);

    @Override  // androidx.media3.common.Player
    public final long C0() {
        Timeline timeline0 = this.O1();
        if(timeline0.w()) {
            return 0x8000000000000001L;
        }
        return timeline0.t(this.n2(), this.b1).f == 0x8000000000000001L ? 0x8000000000000001L : this.b1.b() - this.b1.f - this.d2();
    }

    private void C2(long v, int v1) {
        this.B2(this.n2(), v, v1, false);
    }

    private void D2(int v, int v1) {
        this.B2(v, 0x8000000000000001L, v1, false);
    }

    private void E2(int v) {
        int v1 = this.I1();
        if(v1 == -1) {
            this.z2(v);
            return;
        }
        if(v1 == this.n2()) {
            this.A2(v);
            return;
        }
        this.D2(v1, v);
    }

    private void F2(long v, int v1) {
        long v2 = this.getCurrentPosition() + v;
        long v3 = this.getDuration();
        if(v3 != 0x8000000000000001L) {
            v2 = Math.min(v2, v3);
        }
        this.C2(Math.max(v2, 0L), v1);
    }

    @Override  // androidx.media3.common.Player
    public final MediaItem G0(int v) {
        return this.O1().t(v, this.b1).c;
    }

    private void G2(int v) {
        int v1 = this.o1();
        if(v1 == -1) {
            this.z2(v);
            return;
        }
        if(v1 == this.n2()) {
            this.A2(v);
            return;
        }
        this.D2(v1, v);
    }

    @Override  // androidx.media3.common.Player
    public final void H1(MediaItem mediaItem0) {
        this.s2(O2.B(mediaItem0));
    }

    @Override  // androidx.media3.common.Player
    public final int I1() {
        Timeline timeline0 = this.O1();
        return timeline0.w() ? -1 : timeline0.i(this.n2(), this.y2(), this.t2());
    }

    @Override  // androidx.media3.common.Player
    public final long K0() {
        Timeline timeline0 = this.O1();
        return timeline0.w() ? 0x8000000000000001L : timeline0.t(this.n2(), this.b1).e();
    }

    @Override  // androidx.media3.common.Player
    public final boolean L1() {
        Timeline timeline0 = this.O1();
        return !timeline0.w() && timeline0.t(this.n2(), this.b1).i;
    }

    @Override  // androidx.media3.common.Player
    public final void P(long v) {
        this.C2(v, 5);
    }

    @Override  // androidx.media3.common.Player
    public final void R1() {
        if(!this.O1().w() && !this.W()) {
            if(this.t0()) {
                this.E2(9);
                return;
            }
            if(this.j1() && this.L1()) {
                this.D2(this.n2(), 9);
                return;
            }
            this.z2(9);
            return;
        }
        this.z2(9);
    }

    @Override  // androidx.media3.common.Player
    public final void S0(int v) {
        this.D2(v, 10);
    }

    @Override  // androidx.media3.common.Player
    public final boolean V0() {
        Timeline timeline0 = this.O1();
        return !timeline0.w() && timeline0.t(this.n2(), this.b1).h;
    }

    @Override  // androidx.media3.common.Player
    public final void V1(int v, MediaItem mediaItem0) {
        this.f2(v, O2.B(mediaItem0));
    }

    @Override  // androidx.media3.common.Player
    public final void W1(int v, long v1) {
        this.B2(v, v1, 10, false);
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final boolean X() {
        return this.t0();
    }

    @Override  // androidx.media3.common.Player
    public final boolean Z1() {
        return this.o1() != -1;
    }

    @Override  // androidx.media3.common.Player
    public final void b1(int v, int v1) {
        if(v != v1) {
            this.r2(v, v + 1, v1);
        }
    }

    @Override  // androidx.media3.common.Player
    public final void c() {
        this.D1(true);
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final boolean c2() {
        return this.Z1();
    }

    @Override  // androidx.media3.common.Player
    public final void f1() {
        this.F2(this.T0(), 12);
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final int g2() {
        return this.o1();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final boolean hasNext() {
        return this.t0();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final boolean hasPrevious() {
        return this.Z1();
    }

    @Override  // androidx.media3.common.Player
    public final void i1(List list0) {
        this.c0(list0, true);
    }

    @Override  // androidx.media3.common.Player
    public final boolean isPlaying() {
        return this.b() == 3 && this.D0() && this.N1() == 0;
    }

    @Override  // androidx.media3.common.Player
    public final boolean j0() {
        return true;
    }

    @Override  // androidx.media3.common.Player
    public final boolean j1() {
        Timeline timeline0 = this.O1();
        return !timeline0.w() && timeline0.t(this.n2(), this.b1).i();
    }

    @Override  // androidx.media3.common.Player
    public final void j2(MediaItem mediaItem0, boolean z) {
        this.c0(O2.B(mediaItem0), z);
    }

    @Override  // androidx.media3.common.Player
    public final void l1() {
        this.k0(0, 0x7FFFFFFF);
    }

    @Override  // androidx.media3.common.Player
    public final void l2(MediaItem mediaItem0, long v) {
        this.R0(O2.B(mediaItem0), 0, v);
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final void m0() {
        this.q1();
    }

    @Override  // androidx.media3.common.Player
    @Nullable
    public final MediaItem m1() {
        Timeline timeline0 = this.O1();
        return timeline0.w() ? null : timeline0.t(this.n2(), this.b1).c;
    }

    @Override  // androidx.media3.common.Player
    @Nullable
    public final Object n0() {
        Timeline timeline0 = this.O1();
        return timeline0.w() ? null : timeline0.t(this.n2(), this.b1).d;
    }

    @Override  // androidx.media3.common.Player
    public final int n1() {
        long v = this.i2();
        long v1 = this.getDuration();
        if(v != 0x8000000000000001L && v1 != 0x8000000000000001L) {
            return v1 == 0L ? 100 : Util.w(((int)(v * 100L / v1)), 0, 100);
        }
        return 0;
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final void next() {
        this.q0();
    }

    @Override  // androidx.media3.common.Player
    public final int o1() {
        Timeline timeline0 = this.O1();
        return timeline0.w() ? -1 : timeline0.r(this.n2(), this.y2(), this.t2());
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final int o2() {
        return this.I1();
    }

    @Override  // androidx.media3.common.Player
    public final void p(float f) {
        this.l(this.m().d(f));
    }

    @Override  // androidx.media3.common.Player
    public final void p0(MediaItem mediaItem0) {
        this.i1(O2.B(mediaItem0));
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final boolean p1() {
        return this.V0();
    }

    @Override  // androidx.media3.common.Player
    public final void pause() {
        this.D1(false);
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final void previous() {
        this.q1();
    }

    @Override  // androidx.media3.common.Player
    public final void q0() {
        this.E2(8);
    }

    @Override  // androidx.media3.common.Player
    public final void q1() {
        this.G2(6);
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final boolean q2() {
        return this.j1();
    }

    @Override  // androidx.media3.common.Player
    public final void r1() {
        this.D2(this.n2(), 4);
    }

    @Override  // androidx.media3.common.Player
    public final void s2(List list0) {
        this.f2(0x7FFFFFFF, list0);
    }

    @Override  // androidx.media3.common.Player
    public final boolean t0() {
        return this.I1() != -1;
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final void t1() {
        this.q0();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final boolean u1() {
        return this.L1();
    }

    @Override  // androidx.media3.common.Player
    public final boolean v0(int v) {
        return this.X1().c(v);
    }

    @Override  // androidx.media3.common.Player
    public final void v2() {
        this.F2(-this.x2(), 11);
    }

    @Override  // androidx.media3.common.Player
    public final void x1(int v) {
        this.k0(v, v + 1);
    }

    @Override  // androidx.media3.common.Player
    public final int y1() {
        return this.O1().v();
    }

    private int y2() {
        int v = this.i();
        return v == 1 ? 0 : v;
    }

    private void z2(int v) {
        this.B2(-1, 0x8000000000000001L, v, false);
    }
}

