package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.SampleStream;
import java.io.IOException;

@UnstableApi
public abstract class NoSampleRenderer implements Renderer, RendererCapabilities {
    private RendererConfiguration a;
    private int b;
    private int c;
    @Nullable
    private SampleStream d;
    private boolean e;

    @Override  // androidx.media3.exoplayer.Renderer
    public void A(Timeline timeline0) {
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final RendererCapabilities B() {
        return this;
    }

    @Override  // androidx.media3.exoplayer.RendererCapabilities
    public void C(Listener rendererCapabilities$Listener0) {
    }

    protected void D() {
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public void E(float f, float f1) {
    }

    @Override  // androidx.media3.exoplayer.RendererCapabilities
    public int F() throws ExoPlaybackException {
        return 0;
    }

    protected void G() throws ExoPlaybackException {
    }

    protected void H() {
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.RendererCapabilities
    public int a(Format format0) throws ExoPlaybackException {
        return 0x80;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public boolean b() {
        return true;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void c() {
        Assertions.i(this.c == 1);
        this.c = 0;
        this.d = null;
        this.e = false;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    @Nullable
    public final SampleStream e() {
        return this.d;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public void f() {
    }

    @Override  // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int g() {
        return -2;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final int getState() {
        return this.c;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final boolean h() {
        return true;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void i(RendererConfiguration rendererConfiguration0, Format[] arr_format, SampleStream sampleStream0, long v, boolean z, boolean z1, long v1, long v2, MediaPeriodId mediaSource$MediaPeriodId0) throws ExoPlaybackException {
        Assertions.i(this.c == 0);
        this.a = rendererConfiguration0;
        this.c = 1;
        this.n(arr_format, sampleStream0, v1, v2, mediaSource$MediaPeriodId0);
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    @Nullable
    protected final RendererConfiguration j() {
        return this.a;
    }

    @Override  // androidx.media3.exoplayer.PlayerMessage$Target
    public void k(int v, @Nullable Object object0) throws ExoPlaybackException {
    }

    protected final int l() {
        return this.b;
    }

    protected void m() {
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void n(Format[] arr_format, SampleStream sampleStream0, long v, long v1, MediaPeriodId mediaSource$MediaPeriodId0) throws ExoPlaybackException {
        Assertions.i(!this.e);
        this.d = sampleStream0;
    }

    protected void o(boolean z) throws ExoPlaybackException {
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final boolean p() {
        return this.e;
    }

    protected void q(long v, boolean z) throws ExoPlaybackException {
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public long r() {
        return 0x8000000000000000L;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public void release() {
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void reset() {
        Assertions.i(this.c == 0);
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void s(long v) throws ExoPlaybackException {
        this.e = false;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void start() throws ExoPlaybackException {
        Assertions.i(this.c == 1);
        this.c = 2;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void stop() {
        Assertions.i(this.c == 2);
        this.c = 1;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    @Nullable
    public MediaClock t() {
        return null;
    }

    @Override  // androidx.media3.exoplayer.RendererCapabilities
    public void u() {
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void v(int v, PlayerId playerId0, Clock clock0) {
        this.b = v;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void w() {
        this.e = true;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public final void x() throws IOException {
    }

    protected void y(long v) throws ExoPlaybackException {
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public long z(long v, long v1) {
        return 10000L;
    }
}

