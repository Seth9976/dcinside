package androidx.media3.exoplayer;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class StandaloneMediaClock implements MediaClock {
    private final Clock a;
    private boolean b;
    private long c;
    private long d;
    private PlaybackParameters e;

    public StandaloneMediaClock(Clock clock0) {
        this.a = clock0;
        this.e = PlaybackParameters.d;
    }

    @Override  // androidx.media3.exoplayer.MediaClock
    public long D() {
        long v = this.c;
        if(this.b) {
            long v1 = this.a.elapsedRealtime() - this.d;
            return this.e.a == 1.0f ? v + Util.F1(v1) : v + this.e.b(v1);
        }
        return v;
    }

    public void a(long v) {
        this.c = v;
        if(this.b) {
            this.d = this.a.elapsedRealtime();
        }
    }

    public void b() {
        if(!this.b) {
            this.d = this.a.elapsedRealtime();
            this.b = true;
        }
    }

    public void c() {
        if(this.b) {
            this.a(this.D());
            this.b = false;
        }
    }

    @Override  // androidx.media3.exoplayer.MediaClock
    public boolean j() [...] // 潜在的解密器

    @Override  // androidx.media3.exoplayer.MediaClock
    public void l(PlaybackParameters playbackParameters0) {
        if(this.b) {
            this.a(this.D());
        }
        this.e = playbackParameters0;
    }

    @Override  // androidx.media3.exoplayer.MediaClock
    public PlaybackParameters m() {
        return this.e;
    }
}

