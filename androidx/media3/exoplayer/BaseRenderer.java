package androidx.media3.exoplayer;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.SampleStream;
import java.io.IOException;

@UnstableApi
public abstract class BaseRenderer implements Renderer, RendererCapabilities {
    private final Object a;
    private final int b;
    private final FormatHolder c;
    @Nullable
    private RendererConfiguration d;
    private int e;
    private PlayerId f;
    private Clock g;
    private int h;
    @Nullable
    private SampleStream i;
    @Nullable
    private Format[] j;
    private long k;
    private long l;
    private long m;
    private boolean n;
    private boolean o;
    private Timeline p;
    @GuardedBy("lock")
    @Nullable
    private Listener q;

    public BaseRenderer(int v) {
        this.a = new Object();
        this.b = v;
        this.c = new FormatHolder();
        this.m = 0x8000000000000000L;
        this.p = Timeline.a;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void A(Timeline timeline0) {
        if(!Util.g(this.p, timeline0)) {
            this.p = timeline0;
        }
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final RendererCapabilities B() {
        return this;
    }

    @Override  // androidx.media3.exoplayer.RendererCapabilities
    public final void C(Listener rendererCapabilities$Listener0) {
        synchronized(this.a) {
            this.q = rendererCapabilities$Listener0;
        }
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public void E(float f, float f1) {
    }

    @Override  // androidx.media3.exoplayer.RendererCapabilities
    public int F() throws ExoPlaybackException {
        return 0;
    }

    protected final ExoPlaybackException G(Throwable throwable0, @Nullable Format format0, int v) {
        return this.H(throwable0, format0, false, v);
    }

    protected final ExoPlaybackException H(Throwable throwable0, @Nullable Format format0, boolean z, int v) {
        int v2;
        if(format0 != null && !this.o) {
            try {
                this.o = true;
                v2 = Y0.k(this.a(format0));
            }
            catch(ExoPlaybackException unused_ex) {
                this.o = false;
                return ExoPlaybackException.l(throwable0, this.getName(), this.L(), format0, 4, z, v);
            }
            finally {
                this.o = false;
            }
            return ExoPlaybackException.l(throwable0, this.getName(), this.L(), format0, v2, z, v);
        }
        return ExoPlaybackException.l(throwable0, this.getName(), this.L(), format0, 4, z, v);
    }

    protected final Clock I() {
        return (Clock)Assertions.g(this.g);
    }

    protected final RendererConfiguration J() {
        return (RendererConfiguration)Assertions.g(this.d);
    }

    protected final FormatHolder K() {
        this.c.a();
        return this.c;
    }

    protected final int L() {
        return this.e;
    }

    protected final long M() {
        return this.l;
    }

    protected final PlayerId N() {
        return (PlayerId)Assertions.g(this.f);
    }

    protected final Format[] O() {
        return (Format[])Assertions.g(this.j);
    }

    protected final Timeline P() {
        return this.p;
    }

    // 去混淆评级： 低(20)
    protected final boolean Q() {
        return this.h() ? this.n : ((SampleStream)Assertions.g(this.i)).isReady();
    }

    protected void R() {
    }

    protected void S(boolean z, boolean z1) throws ExoPlaybackException {
    }

    protected void T() {
    }

    protected void U(long v, boolean z) throws ExoPlaybackException {
    }

    protected void V() {
    }

    protected final void W() {
        Listener rendererCapabilities$Listener0;
        synchronized(this.a) {
            rendererCapabilities$Listener0 = this.q;
        }
        if(rendererCapabilities$Listener0 != null) {
            rendererCapabilities$Listener0.a(this);
        }
    }

    protected void X() {
    }

    protected void Y() throws ExoPlaybackException {
    }

    protected void Z() {
    }

    protected void a0(Format[] arr_format, long v, long v1, MediaPeriodId mediaSource$MediaPeriodId0) throws ExoPlaybackException {
    }

    protected void b0(Timeline timeline0) {
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void c() {
        Assertions.i(this.h == 1);
        this.c.a();
        this.h = 0;
        this.i = null;
        this.j = null;
        this.n = false;
        this.R();
    }

    protected final int c0(FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, int v) {
        int v1 = ((SampleStream)Assertions.g(this.i)).m(formatHolder0, decoderInputBuffer0, v);
        if(v1 == -4) {
            if(decoderInputBuffer0.j()) {
                this.m = 0x8000000000000000L;
                return this.n ? -4 : -3;
            }
            long v2 = decoderInputBuffer0.f + this.k;
            decoderInputBuffer0.f = v2;
            this.m = Math.max(this.m, v2);
            return -4;
        }
        if(v1 == -5) {
            Format format0 = (Format)Assertions.g(formatHolder0.b);
            if(format0.s != 0x7FFFFFFFFFFFFFFFL) {
                formatHolder0.b = format0.a().s0(format0.s + this.k).K();
            }
        }
        return v1;
    }

    private void d0(long v, boolean z) throws ExoPlaybackException {
        this.n = false;
        this.l = v;
        this.m = v;
        this.U(v, z);
    }

    @Override  // androidx.media3.exoplayer.Renderer
    @Nullable
    public final SampleStream e() {
        return this.i;
    }

    protected int e0(long v) {
        return ((SampleStream)Assertions.g(this.i)).p(v - this.k);
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public void f() {
    }

    @Override  // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int g() {
        return this.b;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final int getState() {
        return this.h;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final boolean h() {
        return this.m == 0x8000000000000000L;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void i(RendererConfiguration rendererConfiguration0, Format[] arr_format, SampleStream sampleStream0, long v, boolean z, boolean z1, long v1, long v2, MediaPeriodId mediaSource$MediaPeriodId0) throws ExoPlaybackException {
        Assertions.i(this.h == 0);
        this.d = rendererConfiguration0;
        this.h = 1;
        this.S(z, z1);
        this.n(arr_format, sampleStream0, v1, v2, mediaSource$MediaPeriodId0);
        this.d0(v1, z);
    }

    @Override  // androidx.media3.exoplayer.PlayerMessage$Target
    public void k(int v, @Nullable Object object0) throws ExoPlaybackException {
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void n(Format[] arr_format, SampleStream sampleStream0, long v, long v1, MediaPeriodId mediaSource$MediaPeriodId0) throws ExoPlaybackException {
        Assertions.i(!this.n);
        this.i = sampleStream0;
        if(this.m == 0x8000000000000000L) {
            this.m = v;
        }
        this.j = arr_format;
        this.k = v1;
        this.a0(arr_format, v, v1, mediaSource$MediaPeriodId0);
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final boolean p() {
        return this.n;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final long r() {
        return this.m;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void release() {
        Assertions.i(this.h == 0);
        this.V();
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void reset() {
        Assertions.i(this.h == 0);
        this.c.a();
        this.X();
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void s(long v) throws ExoPlaybackException {
        this.d0(v, false);
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void start() throws ExoPlaybackException {
        Assertions.i(this.h == 1);
        this.h = 2;
        this.Y();
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void stop() {
        Assertions.i(this.h == 2);
        this.h = 1;
        this.Z();
    }

    @Override  // androidx.media3.exoplayer.Renderer
    @Nullable
    public MediaClock t() {
        return null;
    }

    @Override  // androidx.media3.exoplayer.RendererCapabilities
    public final void u() {
        synchronized(this.a) {
            this.q = null;
        }
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void v(int v, PlayerId playerId0, Clock clock0) {
        this.e = v;
        this.f = playerId0;
        this.g = clock0;
        this.T();
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void w() {
        this.n = true;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void x() throws IOException {
        ((SampleStream)Assertions.g(this.i)).b();
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public long z(long v, long v1) {
        return 10000L;
    }
}

