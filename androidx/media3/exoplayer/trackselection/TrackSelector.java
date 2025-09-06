package androidx.media3.exoplayer.trackselection;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities.Listener;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.upstream.BandwidthMeter;

@UnstableApi
public abstract class TrackSelector {
    public interface InvalidationListener {
        void a(Renderer arg1);

        void b();
    }

    @Nullable
    private InvalidationListener a;
    @Nullable
    private BandwidthMeter b;

    protected final BandwidthMeter b() {
        return (BandwidthMeter)Assertions.k(this.b);
    }

    public TrackSelectionParameters c() {
        return TrackSelectionParameters.C;
    }

    @Nullable
    public Listener d() {
        return null;
    }

    @CallSuper
    public void e(InvalidationListener trackSelector$InvalidationListener0, BandwidthMeter bandwidthMeter0) {
        this.a = trackSelector$InvalidationListener0;
        this.b = bandwidthMeter0;
    }

    protected final void f() {
        InvalidationListener trackSelector$InvalidationListener0 = this.a;
        if(trackSelector$InvalidationListener0 != null) {
            trackSelector$InvalidationListener0.b();
        }
    }

    protected final void g(Renderer renderer0) {
        InvalidationListener trackSelector$InvalidationListener0 = this.a;
        if(trackSelector$InvalidationListener0 != null) {
            trackSelector$InvalidationListener0.a(renderer0);
        }
    }

    public boolean h() {
        return false;
    }

    public abstract void i(@Nullable Object arg1);

    @CallSuper
    public void j() {
        this.a = null;
        this.b = null;
    }

    public abstract TrackSelectorResult k(RendererCapabilities[] arg1, TrackGroupArray arg2, MediaPeriodId arg3, Timeline arg4) throws ExoPlaybackException;

    public void l(AudioAttributes audioAttributes0) {
    }

    public void m(TrackSelectionParameters trackSelectionParameters0) {
    }
}

