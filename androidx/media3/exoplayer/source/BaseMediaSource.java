package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.ArrayList;
import java.util.HashSet;

@UnstableApi
public abstract class BaseMediaSource implements MediaSource {
    private final ArrayList a;
    private final HashSet b;
    private final EventDispatcher c;
    private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher d;
    @Nullable
    private Looper e;
    @Nullable
    private Timeline f;
    @Nullable
    private PlayerId g;

    public BaseMediaSource() {
        this.a = new ArrayList(1);
        this.b = new HashSet(1);
        this.c = new EventDispatcher();
        this.d = new androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher();
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    @UnstableApi
    public final void A(MediaSourceEventListener mediaSourceEventListener0) {
        this.c.B(mediaSourceEventListener0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    @UnstableApi
    public final void E(MediaSourceCaller mediaSource$MediaSourceCaller0, @Nullable TransferListener transferListener0) {
        this.I(mediaSource$MediaSourceCaller0, transferListener0, PlayerId.d);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    @UnstableApi
    public final void F(DrmSessionEventListener drmSessionEventListener0) {
        this.d.t(drmSessionEventListener0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    @UnstableApi
    public final void I(MediaSourceCaller mediaSource$MediaSourceCaller0, @Nullable TransferListener transferListener0, PlayerId playerId0) {
        Looper looper0 = Looper.myLooper();
        Assertions.a(this.e == null || this.e == looper0);
        this.g = playerId0;
        Timeline timeline0 = this.f;
        this.a.add(mediaSource$MediaSourceCaller0);
        if(this.e == null) {
            this.e = looper0;
            this.b.add(mediaSource$MediaSourceCaller0);
            this.o0(transferListener0);
            return;
        }
        if(timeline0 != null) {
            this.J(mediaSource$MediaSourceCaller0);
            mediaSource$MediaSourceCaller0.H(this, timeline0);
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    @UnstableApi
    public final void J(MediaSourceCaller mediaSource$MediaSourceCaller0) {
        Assertions.g(this.e);
        this.b.add(mediaSource$MediaSourceCaller0);
        if(this.b.isEmpty()) {
            this.g0();
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void L(MediaItem mediaItem0) {
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    @UnstableApi
    public final void N(MediaSourceCaller mediaSource$MediaSourceCaller0) {
        this.b.remove(mediaSource$MediaSourceCaller0);
        if(!this.b.isEmpty() && this.b.isEmpty()) {
            this.f0();
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public boolean R() {
        return true;
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public boolean S(MediaItem mediaItem0) {
        return false;
    }

    protected final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher T(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        return this.d.u(v, mediaSource$MediaPeriodId0);
    }

    protected final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher V(@Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        return this.d.u(0, mediaSource$MediaPeriodId0);
    }

    protected final EventDispatcher Y(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        return this.c.E(v, mediaSource$MediaPeriodId0);
    }

    @Deprecated
    protected final EventDispatcher Z(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, long v1) {
        return this.c.E(v, mediaSource$MediaPeriodId0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    @UnstableApi
    public final void a(Handler handler0, MediaSourceEventListener mediaSourceEventListener0) {
        Assertions.g(handler0);
        Assertions.g(mediaSourceEventListener0);
        this.c.g(handler0, mediaSourceEventListener0);
    }

    protected final EventDispatcher a0(@Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        return this.c.E(0, mediaSource$MediaPeriodId0);
    }

    @Deprecated
    protected final EventDispatcher c0(MediaPeriodId mediaSource$MediaPeriodId0, long v) {
        Assertions.g(mediaSource$MediaPeriodId0);
        return this.c.E(0, mediaSource$MediaPeriodId0);
    }

    protected void f0() {
    }

    protected void g0() {
    }

    protected final PlayerId h0() {
        return (PlayerId)Assertions.k(this.g);
    }

    protected final boolean i0() {
        return !this.b.isEmpty();
    }

    protected final boolean l0() {
        return !this.a.isEmpty();
    }

    protected abstract void o0(@Nullable TransferListener arg1);

    protected final void p0(Timeline timeline0) {
        this.f = timeline0;
        for(Object object0: this.a) {
            ((MediaSourceCaller)object0).H(this, timeline0);
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    @UnstableApi
    public final void q(Handler handler0, DrmSessionEventListener drmSessionEventListener0) {
        Assertions.g(handler0);
        Assertions.g(drmSessionEventListener0);
        this.d.g(handler0, drmSessionEventListener0);
    }

    protected abstract void q0();

    protected final void r0(PlayerId playerId0) {
        this.g = playerId0;
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    @UnstableApi
    public final void u(MediaSourceCaller mediaSource$MediaSourceCaller0) {
        this.a.remove(mediaSource$MediaSourceCaller0);
        if(this.a.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            this.q0();
            return;
        }
        this.N(mediaSource$MediaSourceCaller0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public Timeline x() {
        return null;
    }
}

