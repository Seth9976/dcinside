package androidx.media3.common;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

@UnstableApi
public class ForwardingPlayer implements Player {
    static final class ForwardingListener implements Listener {
        private final ForwardingPlayer a;
        private final Listener b;

        public ForwardingListener(ForwardingPlayer forwardingPlayer0, Listener player$Listener0) {
            this.a = forwardingPlayer0;
            this.b = player$Listener0;
        }

        @Override  // androidx.media3.common.Player$Listener
        public void A(int v) {
            this.b.A(v);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void C(boolean z) {
            this.b.p0(z);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void E(int v) {
            this.b.E(v);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void F(boolean z) {
            this.b.F(z);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void H(int v, boolean z) {
            this.b.H(v, z);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void I(MediaMetadata mediaMetadata0) {
            this.b.I(mediaMetadata0);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void J(PlaybackException playbackException0) {
            this.b.J(playbackException0);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void L(Commands player$Commands0) {
            this.b.L(player$Commands0);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void N(Player player0, Events player$Events0) {
            this.b.N(this.a, player$Events0);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void Q(Timeline timeline0, int v) {
            this.b.Q(timeline0, v);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void R(long v) {
            this.b.R(v);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void S(Tracks tracks0) {
            this.b.S(tracks0);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void T(DeviceInfo deviceInfo0) {
            this.b.T(deviceInfo0);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void V(boolean z, int v) {
            this.b.V(z, v);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void Y(PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1, int v) {
            this.b.Y(player$PositionInfo0, player$PositionInfo1, v);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void Z(boolean z) {
            this.b.Z(z);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void a(VideoSize videoSize0) {
            this.b.a(videoSize0);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void a0(int v) {
            this.b.a0(v);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void c0(int v) {
            this.b.c0(v);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void d(boolean z) {
            this.b.d(z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ForwardingListener)) {
                return false;
            }
            return this.a.equals(((ForwardingListener)object0).a) ? this.b.equals(((ForwardingListener)object0).b) : false;
        }

        @Override  // androidx.media3.common.Player$Listener
        public void f0(long v) {
            this.b.f0(v);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void g0(TrackSelectionParameters trackSelectionParameters0) {
            this.b.g0(trackSelectionParameters0);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void h0() {
            this.b.h0();
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() * 0x1F + this.b.hashCode();
        }

        @Override  // androidx.media3.common.Player$Listener
        public void i0(@Nullable MediaItem mediaItem0, int v) {
            this.b.i0(mediaItem0, v);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void l0(int v, int v1) {
            this.b.l0(v, v1);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void o0(int v) {
            this.b.o0(v);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void p0(boolean z) {
            this.b.p0(z);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void q(PlaybackParameters playbackParameters0) {
            this.b.q(playbackParameters0);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void q0(float f) {
            this.b.q0(f);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void r(List list0) {
            this.b.r(list0);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void r0(AudioAttributes audioAttributes0) {
            this.b.r0(audioAttributes0);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void u0(boolean z, int v) {
            this.b.u0(z, v);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void v0(MediaMetadata mediaMetadata0) {
            this.b.v0(mediaMetadata0);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void w(CueGroup cueGroup0) {
            this.b.w(cueGroup0);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void w0(@Nullable PlaybackException playbackException0) {
            this.b.w0(playbackException0);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void x(Metadata metadata0) {
            this.b.x(metadata0);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void x0(long v) {
            this.b.x0(v);
        }
    }

    private final Player b1;

    public ForwardingPlayer(Player player0) {
        this.b1 = player0;
    }

    @Override  // androidx.media3.common.Player
    public void A(int v, MediaItem mediaItem0) {
        this.b1.A(v, mediaItem0);
    }

    @Override  // androidx.media3.common.Player
    public TrackSelectionParameters A0() {
        return this.b1.A0();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public int A1() {
        return this.b1.A1();
    }

    @Override  // androidx.media3.common.Player
    public void B(@Nullable TextureView textureView0) {
        this.b1.B(textureView0);
    }

    @Override  // androidx.media3.common.Player
    public void B1() {
        this.b1.B1();
    }

    @Override  // androidx.media3.common.Player
    public void C(AudioAttributes audioAttributes0, boolean z) {
        this.b1.C(audioAttributes0, z);
    }

    @Override  // androidx.media3.common.Player
    public long C0() {
        return this.b1.C0();
    }

    @Override  // androidx.media3.common.Player
    public boolean D() {
        return this.b1.D();
    }

    @Override  // androidx.media3.common.Player
    public boolean D0() {
        return this.b1.D0();
    }

    @Override  // androidx.media3.common.Player
    public void D1(boolean z) {
        this.b1.D1(z);
    }

    @Override  // androidx.media3.common.Player
    public void E0(boolean z) {
        this.b1.E0(z);
    }

    @Override  // androidx.media3.common.Player
    public void F1(int v) {
        this.b1.F1(v);
    }

    @Override  // androidx.media3.common.Player
    public void G(@Nullable Surface surface0) {
        this.b1.G(surface0);
    }

    @Override  // androidx.media3.common.Player
    public MediaItem G0(int v) {
        return this.b1.G0(v);
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public void H() {
        this.b1.H();
    }

    @Override  // androidx.media3.common.Player
    public long H0() {
        return this.b1.H0();
    }

    @Override  // androidx.media3.common.Player
    public void H1(MediaItem mediaItem0) {
        this.b1.H1(mediaItem0);
    }

    @Override  // androidx.media3.common.Player
    public void I(int v, int v1, List list0) {
        this.b1.I(v, v1, list0);
    }

    @Override  // androidx.media3.common.Player
    public int I1() {
        return this.b1.I1();
    }

    @Override  // androidx.media3.common.Player
    public void J1(Listener player$Listener0) {
        ForwardingListener forwardingPlayer$ForwardingListener0 = new ForwardingListener(this, player$Listener0);
        this.b1.J1(forwardingPlayer$ForwardingListener0);
    }

    @Override  // androidx.media3.common.Player
    public long K0() {
        return this.b1.K0();
    }

    @Override  // androidx.media3.common.Player
    public CueGroup L() {
        return this.b1.L();
    }

    @Override  // androidx.media3.common.Player
    public int L0() {
        return this.b1.L0();
    }

    @Override  // androidx.media3.common.Player
    public boolean L1() {
        return this.b1.L1();
    }

    @Override  // androidx.media3.common.Player
    public void M1(Listener player$Listener0) {
        ForwardingListener forwardingPlayer$ForwardingListener0 = new ForwardingListener(this, player$Listener0);
        this.b1.M1(forwardingPlayer$ForwardingListener0);
    }

    @Override  // androidx.media3.common.Player
    public void N(@Nullable TextureView textureView0) {
        this.b1.N(textureView0);
    }

    @Override  // androidx.media3.common.Player
    public int N0() {
        return this.b1.N0();
    }

    @Override  // androidx.media3.common.Player
    public int N1() {
        return this.b1.N1();
    }

    @Override  // androidx.media3.common.Player
    public VideoSize O() {
        return this.b1.O();
    }

    @Override  // androidx.media3.common.Player
    public Timeline O1() {
        return this.b1.O1();
    }

    @Override  // androidx.media3.common.Player
    public void P(long v) {
        this.b1.P(v);
    }

    @Override  // androidx.media3.common.Player
    public Looper P1() {
        return this.b1.P1();
    }

    @Override  // androidx.media3.common.Player
    public void Q() {
        this.b1.Q();
    }

    @Override  // androidx.media3.common.Player
    public void R0(List list0, int v, long v1) {
        this.b1.R0(list0, v, v1);
    }

    @Override  // androidx.media3.common.Player
    public void R1() {
        this.b1.R1();
    }

    @Override  // androidx.media3.common.Player
    public void S(@Nullable SurfaceView surfaceView0) {
        this.b1.S(surfaceView0);
    }

    @Override  // androidx.media3.common.Player
    public void S0(int v) {
        this.b1.S0(v);
    }

    @Override  // androidx.media3.common.Player
    public long T0() {
        return this.b1.T0();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public void U(int v) {
        this.b1.U(v);
    }

    @Override  // androidx.media3.common.Player
    public boolean V0() {
        return this.b1.V0();
    }

    @Override  // androidx.media3.common.Player
    public void V1(int v, MediaItem mediaItem0) {
        this.b1.V1(v, mediaItem0);
    }

    @Override  // androidx.media3.common.Player
    public boolean W() {
        return this.b1.W();
    }

    @Override  // androidx.media3.common.Player
    public MediaMetadata W0() {
        return this.b1.W0();
    }

    @Override  // androidx.media3.common.Player
    public void W1(int v, long v1) {
        this.b1.W1(v, v1);
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public boolean X() {
        return this.b1.X();
    }

    @Override  // androidx.media3.common.Player
    public Commands X1() {
        return this.b1.X1();
    }

    @Override  // androidx.media3.common.Player
    public long Y() {
        return this.b1.Y();
    }

    @Override  // androidx.media3.common.Player
    public void Y1(int v, int v1) {
        this.b1.Y1(v, v1);
    }

    @Override  // androidx.media3.common.Player
    public void Z0(TrackSelectionParameters trackSelectionParameters0) {
        this.b1.Z0(trackSelectionParameters0);
    }

    @Override  // androidx.media3.common.Player
    public boolean Z1() {
        return this.b1.Z1();
    }

    @Override  // androidx.media3.common.Player
    public boolean a() {
        return this.b1.a();
    }

    @Override  // androidx.media3.common.Player
    public int b() {
        return this.b1.b();
    }

    @Override  // androidx.media3.common.Player
    public void b1(int v, int v1) {
        this.b1.b1(v, v1);
    }

    @Override  // androidx.media3.common.Player
    public void c() {
        this.b1.c();
    }

    @Override  // androidx.media3.common.Player
    public void c0(List list0, boolean z) {
        this.b1.c0(list0, z);
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public boolean c2() {
        return this.b1.c2();
    }

    @Override  // androidx.media3.common.Player
    public AudioAttributes d() {
        return this.b1.d();
    }

    @Override  // androidx.media3.common.Player
    public long d2() {
        return this.b1.d2();
    }

    @Override  // androidx.media3.common.Player
    public long e1() {
        return this.b1.e1();
    }

    @Override  // androidx.media3.common.Player
    @Nullable
    public PlaybackException f() {
        return this.b1.f();
    }

    @Override  // androidx.media3.common.Player
    public void f1() {
        this.b1.f1();
    }

    @Override  // androidx.media3.common.Player
    public void f2(int v, List list0) {
        this.b1.f2(v, list0);
    }

    @Override  // androidx.media3.common.Player
    public void g0(int v) {
        this.b1.g0(v);
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public int g2() {
        return this.b1.g2();
    }

    @Override  // androidx.media3.common.Player
    public long getCurrentPosition() {
        return this.b1.getCurrentPosition();
    }

    @Override  // androidx.media3.common.Player
    public DeviceInfo getDeviceInfo() {
        return this.b1.getDeviceInfo();
    }

    @Override  // androidx.media3.common.Player
    public long getDuration() {
        return this.b1.getDuration();
    }

    @Override  // androidx.media3.common.Player
    public float getVolume() {
        return this.b1.getVolume();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public boolean hasNext() {
        return this.b1.hasNext();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public boolean hasPrevious() {
        return this.b1.hasPrevious();
    }

    @Override  // androidx.media3.common.Player
    public int i() {
        return this.b1.i();
    }

    @Override  // androidx.media3.common.Player
    public void i0(MediaMetadata mediaMetadata0) {
        this.b1.i0(mediaMetadata0);
    }

    @Override  // androidx.media3.common.Player
    public void i1(List list0) {
        this.b1.i1(list0);
    }

    @Override  // androidx.media3.common.Player
    public long i2() {
        return this.b1.i2();
    }

    @Override  // androidx.media3.common.Player
    public boolean isPlaying() {
        return this.b1.isPlaying();
    }

    @Override  // androidx.media3.common.Player
    public boolean j0() {
        return this.b1.j0();
    }

    @Override  // androidx.media3.common.Player
    public boolean j1() {
        return this.b1.j1();
    }

    @Override  // androidx.media3.common.Player
    public void j2(MediaItem mediaItem0, boolean z) {
        this.b1.j2(mediaItem0, z);
    }

    @Override  // androidx.media3.common.Player
    public void k0(int v, int v1) {
        this.b1.k0(v, v1);
    }

    @Override  // androidx.media3.common.Player
    public void k1(boolean z, int v) {
        this.b1.k1(z, v);
    }

    @Override  // androidx.media3.common.Player
    public void l(PlaybackParameters playbackParameters0) {
        this.b1.l(playbackParameters0);
    }

    @Override  // androidx.media3.common.Player
    public void l1() {
        this.b1.l1();
    }

    @Override  // androidx.media3.common.Player
    public void l2(MediaItem mediaItem0, long v) {
        this.b1.l2(mediaItem0, v);
    }

    @Override  // androidx.media3.common.Player
    public PlaybackParameters m() {
        return this.b1.m();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public void m0() {
        this.b1.m0();
    }

    @Override  // androidx.media3.common.Player
    @Nullable
    public MediaItem m1() {
        return this.b1.m1();
    }

    @Override  // androidx.media3.common.Player
    public void n() {
        this.b1.n();
    }

    @Override  // androidx.media3.common.Player
    @Nullable
    public Object n0() {
        return this.b1.n0();
    }

    @Override  // androidx.media3.common.Player
    public int n1() {
        return this.b1.n1();
    }

    @Override  // androidx.media3.common.Player
    public int n2() {
        return this.b1.n2();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public void next() {
        this.b1.next();
    }

    @Override  // androidx.media3.common.Player
    public void o(float f) {
        this.b1.o(f);
    }

    @Override  // androidx.media3.common.Player
    public int o1() {
        return this.b1.o1();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public int o2() {
        return this.b1.o2();
    }

    @Override  // androidx.media3.common.Player
    public void p(float f) {
        this.b1.p(f);
    }

    @Override  // androidx.media3.common.Player
    public void p0(MediaItem mediaItem0) {
        this.b1.p0(mediaItem0);
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public boolean p1() {
        return this.b1.p1();
    }

    @Override  // androidx.media3.common.Player
    public void pause() {
        this.b1.pause();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public void previous() {
        this.b1.previous();
    }

    @Override  // androidx.media3.common.Player
    public void q(int v) {
        this.b1.q(v);
    }

    @Override  // androidx.media3.common.Player
    public void q0() {
        this.b1.q0();
    }

    @Override  // androidx.media3.common.Player
    public void q1() {
        this.b1.q1();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public boolean q2() {
        return this.b1.q2();
    }

    @Override  // androidx.media3.common.Player
    public Tracks r0() {
        return this.b1.r0();
    }

    @Override  // androidx.media3.common.Player
    public void r1() {
        this.b1.r1();
    }

    @Override  // androidx.media3.common.Player
    public void r2(int v, int v1, int v2) {
        this.b1.r2(v, v1, v2);
    }

    @Override  // androidx.media3.common.Player
    public void release() {
        this.b1.release();
    }

    @Override  // androidx.media3.common.Player
    public void s(@Nullable Surface surface0) {
        this.b1.s(surface0);
    }

    @Override  // androidx.media3.common.Player
    public void s2(List list0) {
        this.b1.s2(list0);
    }

    @Override  // androidx.media3.common.Player
    public void stop() {
        this.b1.stop();
    }

    @Override  // androidx.media3.common.Player
    public void t(@Nullable SurfaceView surfaceView0) {
        this.b1.t(surfaceView0);
    }

    @Override  // androidx.media3.common.Player
    public boolean t0() {
        return this.b1.t0();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public void t1() {
        this.b1.t1();
    }

    @Override  // androidx.media3.common.Player
    public boolean t2() {
        return this.b1.t2();
    }

    @Override  // androidx.media3.common.Player
    public void u(@Nullable SurfaceHolder surfaceHolder0) {
        this.b1.u(surfaceHolder0);
    }

    @Override  // androidx.media3.common.Player
    public int u0() {
        return this.b1.u0();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public boolean u1() {
        return this.b1.u1();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public void v(boolean z) {
        this.b1.v(z);
    }

    @Override  // androidx.media3.common.Player
    public boolean v0(int v) {
        return this.b1.v0(v);
    }

    @Override  // androidx.media3.common.Player
    public Size v1() {
        return this.b1.v1();
    }

    @Override  // androidx.media3.common.Player
    public void v2() {
        this.b1.v2();
    }

    @Override  // androidx.media3.common.Player
    @Deprecated
    public void w() {
        this.b1.w();
    }

    @Override  // androidx.media3.common.Player
    public MediaMetadata w2() {
        return this.b1.w2();
    }

    @Override  // androidx.media3.common.Player
    public void x(@Nullable SurfaceHolder surfaceHolder0) {
        this.b1.x(surfaceHolder0);
    }

    @Override  // androidx.media3.common.Player
    public void x1(int v) {
        this.b1.x1(v);
    }

    @Override  // androidx.media3.common.Player
    public long x2() {
        return this.b1.x2();
    }

    @Override  // androidx.media3.common.Player
    public int y1() {
        return this.b1.y1();
    }

    public Player y2() {
        return this.b1;
    }

    @Override  // androidx.media3.common.Player
    public int z() {
        return this.b1.z();
    }
}

