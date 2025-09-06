package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;

final class DefaultMediaClock implements MediaClock {
    public interface PlaybackParametersListener {
        void q(PlaybackParameters arg1);
    }

    private final StandaloneMediaClock a;
    private final PlaybackParametersListener b;
    @Nullable
    private Renderer c;
    @Nullable
    private MediaClock d;
    private boolean e;
    private boolean f;

    public DefaultMediaClock(PlaybackParametersListener defaultMediaClock$PlaybackParametersListener0, Clock clock0) {
        this.b = defaultMediaClock$PlaybackParametersListener0;
        this.a = new StandaloneMediaClock(clock0);
        this.e = true;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.MediaClock
    public long D() {
        return this.e ? this.a.D() : ((MediaClock)Assertions.g(this.d)).D();
    }

    public void a(Renderer renderer0) {
        if(renderer0 == this.c) {
            this.d = null;
            this.c = null;
            this.e = true;
        }
    }

    public void b(Renderer renderer0) throws ExoPlaybackException {
        MediaClock mediaClock0 = renderer0.t();
        if(mediaClock0 != null) {
            MediaClock mediaClock1 = this.d;
            if(mediaClock0 != mediaClock1) {
                if(mediaClock1 != null) {
                    throw ExoPlaybackException.o(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                }
                this.d = mediaClock0;
                this.c = renderer0;
                mediaClock0.l(this.a.m());
            }
        }
    }

    public void c(long v) {
        this.a.a(v);
    }

    // 去混淆评级： 中等(50)
    private boolean d(boolean z) {
        return this.c == null || this.c.b() || z && this.c.getState() != 2 || !this.c.isReady() && (z || this.c.h());
    }

    public void e() {
        this.f = true;
        this.a.b();
    }

    public void f() {
        this.f = false;
        this.a.c();
    }

    public long g(boolean z) {
        this.h(z);
        return this.D();
    }

    private void h(boolean z) {
        if(this.d(z)) {
            this.e = true;
            if(this.f) {
                this.a.b();
            }
            return;
        }
        MediaClock mediaClock0 = (MediaClock)Assertions.g(this.d);
        long v = mediaClock0.D();
        if(this.e) {
            if(v < this.a.D()) {
                this.a.c();
                return;
            }
            this.e = false;
            if(this.f) {
                this.a.b();
            }
        }
        this.a.a(v);
        PlaybackParameters playbackParameters0 = mediaClock0.m();
        if(!playbackParameters0.equals(this.a.m())) {
            this.a.l(playbackParameters0);
            this.b.q(playbackParameters0);
        }
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.media3.exoplayer.MediaClock
    public boolean j() {
        return this.e ? false : ((MediaClock)Assertions.g(this.d)).j();
    }

    @Override  // androidx.media3.exoplayer.MediaClock
    public void l(PlaybackParameters playbackParameters0) {
        MediaClock mediaClock0 = this.d;
        if(mediaClock0 != null) {
            mediaClock0.l(playbackParameters0);
            playbackParameters0 = this.d.m();
        }
        this.a.l(playbackParameters0);
    }

    @Override  // androidx.media3.exoplayer.MediaClock
    public PlaybackParameters m() {
        return this.d == null ? this.a.m() : this.d.m();
    }
}

