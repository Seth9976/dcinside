package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import java.lang.reflect.Method;

final class AudioTrackPositionTracker {
    public interface Listener {
        void a(long arg1);

        void b(long arg1, long arg2, long arg3, long arg4);

        void c(long arg1, long arg2, long arg3, long arg4);

        void d(int arg1, long arg2);

        void e(long arg1);
    }

    private long A;
    private long B;
    private long C;
    private long D;
    private boolean E;
    private long F;
    private long G;
    private boolean H;
    private long I;
    private Clock J;
    private static final int K = 1;
    private static final int L = 2;
    private static final int M = 3;
    private static final long N = 5000000L;
    private static final long O = 5000000L;
    private static final long P = 1000000L;
    private static final long Q = 5L;
    private static final long R = 200L;
    private static final int S = 10;
    private static final int T = 30000;
    private static final int U = 500000;
    private final Listener a;
    private final long[] b;
    @Nullable
    private AudioTrack c;
    private int d;
    private int e;
    @Nullable
    private AudioTimestampPoller f;
    private int g;
    private boolean h;
    private long i;
    private float j;
    private boolean k;
    private long l;
    private long m;
    @Nullable
    private Method n;
    private long o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private int w;
    private int x;
    private long y;
    private long z;

    public AudioTrackPositionTracker(Listener audioTrackPositionTracker$Listener0) {
        this.a = (Listener)Assertions.g(audioTrackPositionTracker$Listener0);
        try {
            this.n = AudioTrack.class.getMethod("getLatency", null);
        }
        catch(NoSuchMethodException unused_ex) {
        }
        this.b = new long[10];
        this.J = Clock.a;
    }

    public void a() {
        this.H = true;
        AudioTimestampPoller audioTimestampPoller0 = this.f;
        if(audioTimestampPoller0 != null) {
            audioTimestampPoller0.b();
        }
    }

    private boolean b() {
        return this.h && ((AudioTrack)Assertions.g(this.c)).getPlayState() == 2 && this.e() == 0L;
    }

    public int c(long v) {
        long v1 = this.e();
        return this.e - ((int)(v - v1 * ((long)this.d)));
    }

    public long d(boolean z) {
        long v1;
        if(((AudioTrack)Assertions.g(this.c)).getPlayState() == 3) {
            this.m();
        }
        long v = this.J.nanoTime();
        AudioTimestampPoller audioTimestampPoller0 = (AudioTimestampPoller)Assertions.g(this.f);
        boolean z1 = audioTimestampPoller0.e();
        if(z1) {
            v1 = Util.Y1(audioTimestampPoller0.c(), this.g) + Util.x0(v / 1000L - audioTimestampPoller0.d(), this.j);
        }
        else {
            v1 = this.x == 0 ? this.f() : Util.x0(this.l + v / 1000L, this.j);
            if(!z) {
                v1 = Math.max(0L, v1 - this.o);
            }
        }
        if(this.E != z1) {
            this.G = this.D;
            this.F = this.C;
        }
        long v2 = v / 1000L - this.G;
        if(v2 < 1000000L) {
            long v3 = v2 * 1000L / 1000000L;
            v1 = (v1 * v3 + (1000L - v3) * (this.F + Util.x0(v2, this.j))) / 1000L;
        }
        if(!this.k) {
            long v4 = this.C;
            if(v1 > v4) {
                this.k = true;
                long v5 = Util.D0(Util.B2(v1 - v4), this.j);
                long v6 = this.J.currentTimeMillis();
                long v7 = Util.B2(v5);
                this.a.a(v6 - v7);
            }
        }
        this.D = v / 1000L;
        this.C = v1;
        this.E = z1;
        return v1;
    }

    private long e() {
        long v = this.J.elapsedRealtime();
        if(this.y != 0x8000000000000001L) {
            if(((AudioTrack)Assertions.g(this.c)).getPlayState() == 2) {
                return this.A;
            }
            long v1 = Util.P(Util.x0(Util.F1(v) - this.y, this.j), this.g);
            return Math.min(this.B, this.A + v1);
        }
        if(v - this.s >= 5L) {
            this.w(v);
            this.s = v;
        }
        return this.t + this.I + (this.u << 0x20);
    }

    private long f() {
        return Util.Y1(this.e(), this.g);
    }

    public void g(long v) {
        this.A = this.e();
        this.y = Util.F1(this.J.elapsedRealtime());
        this.B = v;
    }

    // 去混淆评级： 低(20)
    public boolean h(long v) {
        return v > Util.P(this.d(false), this.g) || this.b();
    }

    public boolean i() {
        return ((AudioTrack)Assertions.g(this.c)).getPlayState() == 3;
    }

    public boolean j(long v) {
        return this.z != 0x8000000000000001L && v > 0L && this.J.elapsedRealtime() - this.z >= 200L;
    }

    public boolean k(long v) {
        int v1 = ((AudioTrack)Assertions.g(this.c)).getPlayState();
        if(this.h) {
            switch(v1) {
                case 1: {
                    if(this.e() == 0L) {
                        return false;
                    }
                    break;
                }
                case 2: {
                    this.p = false;
                    return false;
                }
            }
        }
        boolean z = this.p;
        boolean z1 = this.h(v);
        this.p = z1;
        if(z && !z1 && v1 != 1) {
            int v2 = this.e;
            long v3 = Util.B2(this.i);
            this.a.d(v2, v3);
        }
        return true;
    }

    private void l(long v) {
        AudioTimestampPoller audioTimestampPoller0 = (AudioTimestampPoller)Assertions.g(this.f);
        if(!audioTimestampPoller0.g(v)) {
            return;
        }
        long v1 = audioTimestampPoller0.d();
        long v2 = audioTimestampPoller0.c();
        long v3 = this.f();
        if(Math.abs(v1 - v) > 5000000L) {
            this.a.c(v2, v1, v, v3);
            audioTimestampPoller0.h();
            return;
        }
        if(Math.abs(Util.Y1(v2, this.g) - v3) > 5000000L) {
            this.a.b(v2, v1, v, v3);
            audioTimestampPoller0.h();
            return;
        }
        audioTimestampPoller0.a();
    }

    private void m() {
        long v = this.J.nanoTime();
        if(v / 1000L - this.m >= 30000L) {
            long v1 = this.f();
            if(v1 == 0L) {
                return;
            }
            this.b[this.w] = Util.D0(v1, this.j) - v / 1000L;
            this.w = (this.w + 1) % 10;
            int v2 = this.x;
            if(v2 < 10) {
                this.x = v2 + 1;
            }
            this.m = v / 1000L;
            this.l = 0L;
            for(int v3 = 0; true; ++v3) {
                int v4 = this.x;
                if(v3 >= v4) {
                    break;
                }
                this.l += this.b[v3] / ((long)v4);
            }
        }
        if(this.h) {
            return;
        }
        this.l(v / 1000L);
        this.n(v / 1000L);
    }

    private void n(long v) {
        if(this.q) {
            Method method0 = this.n;
            if(method0 != null && v - this.r >= 500000L) {
                try {
                    long v1 = Math.max(((long)(((int)(((Integer)Util.o(((Integer)method0.invoke(Assertions.g(this.c), null)))))))) * 1000L - this.i, 0L);
                    this.o = v1;
                    if(v1 > 5000000L) {
                        this.a.e(v1);
                        this.o = 0L;
                    }
                }
                catch(Exception unused_ex) {
                    this.n = null;
                }
                this.r = v;
            }
        }
    }

    private static boolean o(int v) {
        return Util.a < 23 && (v == 5 || v == 6);
    }

    public boolean p() {
        this.r();
        if(this.y == 0x8000000000000001L) {
            ((AudioTimestampPoller)Assertions.g(this.f)).i();
            return true;
        }
        this.A = this.e();
        return false;
    }

    public void q() {
        this.r();
        this.c = null;
        this.f = null;
    }

    private void r() {
        this.l = 0L;
        this.x = 0;
        this.w = 0;
        this.m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.k = false;
    }

    public void s(AudioTrack audioTrack0, boolean z, int v, int v1, int v2) {
        this.c = audioTrack0;
        this.d = v1;
        this.e = v2;
        this.f = new AudioTimestampPoller(audioTrack0);
        this.g = audioTrack0.getSampleRate();
        this.h = z && AudioTrackPositionTracker.o(v);
        boolean z1 = Util.f1(v);
        this.q = z1;
        this.i = z1 ? Util.Y1(v2 / v1, this.g) : 0x8000000000000001L;
        this.t = 0L;
        this.u = 0L;
        this.H = false;
        this.I = 0L;
        this.v = 0L;
        this.p = false;
        this.y = 0x8000000000000001L;
        this.z = 0x8000000000000001L;
        this.r = 0L;
        this.o = 0L;
        this.j = 1.0f;
    }

    public void t(float f) {
        this.j = f;
        AudioTimestampPoller audioTimestampPoller0 = this.f;
        if(audioTimestampPoller0 != null) {
            audioTimestampPoller0.i();
        }
        this.r();
    }

    public void u(Clock clock0) {
        this.J = clock0;
    }

    public void v() {
        if(this.y != 0x8000000000000001L) {
            this.y = Util.F1(this.J.elapsedRealtime());
        }
        ((AudioTimestampPoller)Assertions.g(this.f)).i();
    }

    private void w(long v) {
        AudioTrack audioTrack0 = (AudioTrack)Assertions.g(this.c);
        int v1 = audioTrack0.getPlayState();
        if(v1 == 1) {
            return;
        }
        long v2 = ((long)audioTrack0.getPlaybackHeadPosition()) & 0xFFFFFFFFL;
        if(this.h) {
            if(v1 == 2 && v2 == 0L) {
                this.v = this.t;
            }
            v2 += this.v;
        }
        if(Util.a <= 29) {
            if(v2 == 0L && this.t > 0L && v1 == 3) {
                if(this.z == 0x8000000000000001L) {
                    this.z = v;
                }
                return;
            }
            this.z = 0x8000000000000001L;
        }
        long v3 = this.t;
        if(v3 > v2) {
            if(this.H) {
                this.I += v3;
                this.H = false;
            }
            else {
                ++this.u;
            }
        }
        this.t = v2;
    }
}

