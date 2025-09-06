package androidx.media3.exoplayer;

public final class e0 implements PlaybackInfoUpdateListener {
    public final ExoPlayerImpl a;

    public e0(ExoPlayerImpl exoPlayerImpl0) {
        this.a = exoPlayerImpl0;
    }

    @Override  // androidx.media3.exoplayer.ExoPlayerImplInternal$PlaybackInfoUpdateListener
    public final void a(PlaybackInfoUpdate exoPlayerImplInternal$PlaybackInfoUpdate0) {
        this.a.m4(exoPlayerImplInternal$PlaybackInfoUpdate0);
    }
}

