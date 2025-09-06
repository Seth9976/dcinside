package androidx.media3.common.audio;

import androidx.annotation.GuardedBy;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.SpeedProviderUtil;
import androidx.media3.common.util.TimestampConsumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import h4.d;
import h4.m;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

@UnstableApi
public final class SpeedChangingAudioProcessor extends BaseAudioProcessor {
    private final Object i;
    private final SpeedProvider j;
    private final SynchronizedSonicAudioProcessor k;
    @GuardedBy("lock")
    private final LongArrayQueue l;
    @GuardedBy("lock")
    private final Queue m;
    @GuardedBy("lock")
    private LongArray n;
    @GuardedBy("lock")
    private LongArray o;
    @GuardedBy("lock")
    private long p;
    @GuardedBy("lock")
    private long q;
    @GuardedBy("lock")
    private long r;
    @GuardedBy("lock")
    private long s;
    @GuardedBy("lock")
    private float t;
    private long u;
    private boolean v;

    public SpeedChangingAudioProcessor(SpeedProvider speedProvider0) {
        this.j = speedProvider0;
        Object object0 = new Object();
        this.i = object0;
        this.k = new SynchronizedSonicAudioProcessor(object0);
        this.l = new LongArrayQueue();
        this.m = new ArrayDeque();
        this.s = 0x8000000000000001L;
        this.u();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    public boolean b() {
        return super.b() && this.k.b();
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer0) {
        int v3;
        long v = Util.Z1(this.u, 1000000L, ((long)this.b.a) * ((long)this.b.d));
        this.w(this.j.b(v), v);
        int v1 = byteBuffer0.limit();
        long v2 = this.j.a(v);
        if(v2 == 0x8000000000000001L) {
            v3 = -1;
        }
        else {
            v3 = (int)Util.c2(v2 - v, ((long)this.b.a) * ((long)this.b.d), 1000000L, RoundingMode.CEILING);
            int v4 = this.b.d;
            int v5 = v4 - v3 % v4;
            if(v5 != v4) {
                v3 += v5;
            }
            byteBuffer0.limit(Math.min(v1, byteBuffer0.position() + v3));
        }
        long v6 = (long)byteBuffer0.position();
        if(this.s()) {
            this.k.c(byteBuffer0);
            if(v3 != -1 && ((long)byteBuffer0.position()) - v6 == ((long)v3)) {
                this.k.d();
                this.v = true;
            }
        }
        else {
            ByteBuffer byteBuffer1 = this.l(byteBuffer0.remaining());
            if(byteBuffer0.hasRemaining()) {
                byteBuffer1.put(byteBuffer0);
            }
            byteBuffer1.flip();
        }
        this.u += ((long)byteBuffer0.position()) - v6;
        this.v();
        byteBuffer0.limit(v1);
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    public ByteBuffer e() {
        ByteBuffer byteBuffer0 = this.s() ? this.k.e() : super.e();
        this.t();
        return byteBuffer0;
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    public long g(long v) {
        return SpeedProviderUtil.a(this.j, v);
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    public AudioFormat h(AudioFormat audioProcessor$AudioFormat0) throws UnhandledAudioFormatException {
        return this.k.f(audioProcessor$AudioFormat0);
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    protected void i() {
        this.u();
        this.k.flush();
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    protected void j() {
        if(!this.v) {
            this.k.d();
            this.v = true;
        }
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    protected void k() {
        this.u();
        this.k.reset();
    }

    private long m(long v) {
        long v2;
        int v1;
        for(v1 = this.n.c() - 1; v1 > 0 && this.n.b(v1) > v; --v1) {
        }
        if(v1 == this.n.c() - 1) {
            if(this.q < this.n.b(v1)) {
                this.q = this.n.b(v1);
                this.r = this.o.b(v1);
            }
            v2 = this.q(v - this.q);
        }
        else {
            v2 = Math.round(((double)(v - this.q)) * SpeedChangingAudioProcessor.n(this.o.b(v1 + 1) - this.o.b(v1), this.n.b(v1 + 1) - this.n.b(v1)));
        }
        this.q = v;
        long v3 = this.r + v2;
        this.r = v3;
        return v3;
    }

    private static double n(long v, long v1) {
        return ((double)v) / ((double)v1);
    }

    public long o(long v) {
        long v4;
        synchronized(this.i) {
            int v2;
            for(v2 = this.o.c() - 1; v2 > 0 && this.o.b(v2) > v; --v2) {
            }
            long v3 = v - this.o.b(v2);
            v4 = v2 == this.o.c() - 1 ? this.p(v3) : Math.round(((double)v3) * SpeedChangingAudioProcessor.n(this.n.b(v2 + 1) - this.n.b(v2), this.o.b(v2 + 1) - this.o.b(v2)));
        }
        return this.n.b(v2) + v4;
    }

    // 去混淆评级： 低(20)
    private long p(long v) {
        return this.s() ? this.k.a(v) : v;
    }

    // 去混淆评级： 低(20)
    private long q(long v) {
        return this.s() ? this.k.h(v) : v;
    }

    public void r(long v, TimestampConsumer timestampConsumer0) {
        synchronized(this.i) {
            Assertions.a(this.s < v);
            this.s = v;
            if(v <= this.p && this.l.f() || this.b()) {
                timestampConsumer0.a(this.m(v));
                return;
            }
            this.l.a(v);
            this.m.add(timestampConsumer0);
        }
    }

    private boolean s() {
        synchronized(this.i) {
        }
        return this.t != 1.0f;
    }

    private void t() {
        synchronized(this.i) {
            while(!this.m.isEmpty() && (this.l.e() <= this.p || this.b())) {
                ((TimestampConsumer)this.m.remove()).a(this.m(this.l.g()));
            }
        }
    }

    @d({"inputSegmentStartTimesUs", "outputSegmentStartTimesUs"})
    @m({"lock"})
    private void u() {
        synchronized(this.i) {
            this.n = new LongArray();
            this.o = new LongArray();
            this.n.a(0L);
            this.o.a(0L);
            this.p = 0L;
            this.q = 0L;
            this.r = 0L;
            this.t = 1.0f;
        }
        this.u = 0L;
        this.v = false;
    }

    private void v() {
        synchronized(this.i) {
            if(this.s()) {
                long v1 = Util.Z1(this.k.i(), 1000000L, ((long)this.b.d) * ((long)this.b.a));
                this.p = this.n.b(this.n.c() - 1) + v1;
            }
            else {
                this.p = Util.Z1(this.u, 1000000L, ((long)this.b.d) * ((long)this.b.a));
            }
        }
    }

    private void w(float f, long v) {
        synchronized(this.i) {
            if(f != this.t) {
                this.x(v);
                this.t = f;
                if(this.s()) {
                    this.k.l(f);
                    this.k.k(f);
                }
                this.k.flush();
                this.v = false;
                super.e();
            }
        }
    }

    private void x(long v) {
        long v1 = this.o.b(this.o.c() - 1);
        long v2 = this.n.b(this.n.c() - 1);
        this.n.a(v);
        this.o.a(v1 + this.q(v - v2));
    }
}

