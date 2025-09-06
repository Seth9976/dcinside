package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnknownNull;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.io.IOException;
import java.util.HashMap;

@UnstableApi
public abstract class CompositeMediaSource extends BaseMediaSource {
    final class ForwardingEventListener implements DrmSessionEventListener, MediaSourceEventListener {
        @UnknownNull
        private final Object a;
        private EventDispatcher b;
        private androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher c;
        final CompositeMediaSource d;

        public ForwardingEventListener(@UnknownNull Object object0) {
            this.b = compositeMediaSource0.a0(null);
            this.c = compositeMediaSource0.V(null);
            this.a = object0;
        }

        @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void G(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            if(this.a(v, mediaSource$MediaPeriodId0)) {
                this.c.h();
            }
        }

        @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void K(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, IOException iOException0, boolean z) {
            if(this.a(v, mediaSource$MediaPeriodId0)) {
                this.b.x(loadEventInfo0, this.d(mediaLoadData0, mediaSource$MediaPeriodId0), iOException0, z);
            }
        }

        @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void M(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
            if(this.a(v, mediaSource$MediaPeriodId0)) {
                this.b.r(loadEventInfo0, this.d(mediaLoadData0, mediaSource$MediaPeriodId0));
            }
        }

        @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void P(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, MediaLoadData mediaLoadData0) {
            if(this.a(v, mediaSource$MediaPeriodId0)) {
                this.b.i(this.d(mediaLoadData0, mediaSource$MediaPeriodId0));
            }
        }

        @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void W(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            if(this.a(v, mediaSource$MediaPeriodId0)) {
                this.c.m();
            }
        }

        private boolean a(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            MediaPeriodId mediaSource$MediaPeriodId1;
            if(mediaSource$MediaPeriodId0 == null) {
                mediaSource$MediaPeriodId1 = null;
            }
            else {
                mediaSource$MediaPeriodId1 = CompositeMediaSource.this.x0(this.a, mediaSource$MediaPeriodId0);
                if(mediaSource$MediaPeriodId1 == null) {
                    return false;
                }
            }
            int v1 = CompositeMediaSource.this.z0(this.a, v);
            if(this.b.a != v1 || !Util.g(this.b.b, mediaSource$MediaPeriodId1)) {
                this.b = CompositeMediaSource.this.Y(v1, mediaSource$MediaPeriodId1);
            }
            if(this.c.a != v1 || !Util.g(this.c.b, mediaSource$MediaPeriodId1)) {
                this.c = CompositeMediaSource.this.T(v1, mediaSource$MediaPeriodId1);
            }
            return true;
        }

        @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void b0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, MediaLoadData mediaLoadData0) {
            if(this.a(v, mediaSource$MediaPeriodId0)) {
                this.b.D(this.d(mediaLoadData0, mediaSource$MediaPeriodId0));
            }
        }

        private MediaLoadData d(MediaLoadData mediaLoadData0, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            long v = CompositeMediaSource.this.y0(this.a, mediaLoadData0.f, mediaSource$MediaPeriodId0);
            long v1 = CompositeMediaSource.this.y0(this.a, mediaLoadData0.g, mediaSource$MediaPeriodId0);
            return v != mediaLoadData0.f || v1 != mediaLoadData0.g ? new MediaLoadData(mediaLoadData0.a, mediaLoadData0.b, mediaLoadData0.c, mediaLoadData0.d, mediaLoadData0.e, v, v1) : mediaLoadData0;
        }

        @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void e0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
            if(this.a(v, mediaSource$MediaPeriodId0)) {
                this.b.A(loadEventInfo0, this.d(mediaLoadData0, mediaSource$MediaPeriodId0));
            }
        }

        @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void j0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, int v1) {
            if(this.a(v, mediaSource$MediaPeriodId0)) {
                this.c.k(v1);
            }
        }

        @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void k0(int v, MediaPeriodId mediaSource$MediaPeriodId0) {
        }

        @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void m0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            if(this.a(v, mediaSource$MediaPeriodId0)) {
                this.c.i();
            }
        }

        @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void n0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, Exception exception0) {
            if(this.a(v, mediaSource$MediaPeriodId0)) {
                this.c.l(exception0);
            }
        }

        @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void s0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
            if(this.a(v, mediaSource$MediaPeriodId0)) {
                this.b.u(loadEventInfo0, this.d(mediaLoadData0, mediaSource$MediaPeriodId0));
            }
        }

        @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void t0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            if(this.a(v, mediaSource$MediaPeriodId0)) {
                this.c.j();
            }
        }
    }

    static final class MediaSourceAndListener {
        public final MediaSource a;
        public final MediaSourceCaller b;
        public final ForwardingEventListener c;

        public MediaSourceAndListener(MediaSource mediaSource0, MediaSourceCaller mediaSource$MediaSourceCaller0, ForwardingEventListener compositeMediaSource$ForwardingEventListener0) {
            this.a = mediaSource0;
            this.b = mediaSource$MediaSourceCaller0;
            this.c = compositeMediaSource$ForwardingEventListener0;
        }
    }

    private final HashMap h;
    @Nullable
    private Handler i;
    @Nullable
    private TransferListener j;

    protected CompositeMediaSource() {
        this.h = new HashMap();
    }

    // 检测为 Lambda 实现
    private void A0(Object object0, MediaSource mediaSource0, Timeline timeline0) [...]

    protected abstract void B0(@UnknownNull Object arg1, MediaSource arg2, Timeline arg3);

    protected final void C0(@UnknownNull Object object0, MediaSource mediaSource0) {
        Assertions.a(!this.h.containsKey(object0));
        b b0 = (MediaSource mediaSource0, Timeline timeline0) -> this.B0(object0, mediaSource0, timeline0);
        ForwardingEventListener compositeMediaSource$ForwardingEventListener0 = new ForwardingEventListener(this, object0);
        MediaSourceAndListener compositeMediaSource$MediaSourceAndListener0 = new MediaSourceAndListener(mediaSource0, b0, compositeMediaSource$ForwardingEventListener0);
        this.h.put(object0, compositeMediaSource$MediaSourceAndListener0);
        mediaSource0.a(((Handler)Assertions.g(this.i)), compositeMediaSource$ForwardingEventListener0);
        mediaSource0.q(((Handler)Assertions.g(this.i)), compositeMediaSource$ForwardingEventListener0);
        mediaSource0.I(b0, this.j, this.h0());
        if(!this.i0()) {
            mediaSource0.N(b0);
        }
    }

    protected final void D0(@UnknownNull Object object0) {
        MediaSourceAndListener compositeMediaSource$MediaSourceAndListener0 = (MediaSourceAndListener)Assertions.g(((MediaSourceAndListener)this.h.remove(object0)));
        compositeMediaSource$MediaSourceAndListener0.a.u(compositeMediaSource$MediaSourceAndListener0.b);
        compositeMediaSource$MediaSourceAndListener0.a.A(compositeMediaSource$MediaSourceAndListener0.c);
        compositeMediaSource$MediaSourceAndListener0.a.F(compositeMediaSource$MediaSourceAndListener0.c);
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    @CallSuper
    protected void f0() {
        for(Object object0: this.h.values()) {
            ((MediaSourceAndListener)object0).a.N(((MediaSourceAndListener)object0).b);
        }
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    @CallSuper
    protected void g0() {
        for(Object object0: this.h.values()) {
            ((MediaSourceAndListener)object0).a.J(((MediaSourceAndListener)object0).b);
        }
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    @CallSuper
    protected void o0(@Nullable TransferListener transferListener0) {
        this.j = transferListener0;
        this.i = Util.H();
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    @CallSuper
    protected void q0() {
        for(Object object0: this.h.values()) {
            ((MediaSourceAndListener)object0).a.u(((MediaSourceAndListener)object0).b);
            ((MediaSourceAndListener)object0).a.A(((MediaSourceAndListener)object0).c);
            ((MediaSourceAndListener)object0).a.F(((MediaSourceAndListener)object0).c);
        }
        this.h.clear();
    }

    protected final void v0(@UnknownNull Object object0) {
        MediaSourceAndListener compositeMediaSource$MediaSourceAndListener0 = (MediaSourceAndListener)Assertions.g(((MediaSourceAndListener)this.h.get(object0)));
        compositeMediaSource$MediaSourceAndListener0.a.N(compositeMediaSource$MediaSourceAndListener0.b);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    @CallSuper
    public void w() throws IOException {
        for(Object object0: this.h.values()) {
            ((MediaSourceAndListener)object0).a.w();
        }
    }

    protected final void w0(@UnknownNull Object object0) {
        MediaSourceAndListener compositeMediaSource$MediaSourceAndListener0 = (MediaSourceAndListener)Assertions.g(((MediaSourceAndListener)this.h.get(object0)));
        compositeMediaSource$MediaSourceAndListener0.a.J(compositeMediaSource$MediaSourceAndListener0.b);
    }

    @Nullable
    protected MediaPeriodId x0(@UnknownNull Object object0, MediaPeriodId mediaSource$MediaPeriodId0) {
        return mediaSource$MediaPeriodId0;
    }

    protected long y0(@UnknownNull Object object0, long v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        return v;
    }

    protected int z0(@UnknownNull Object object0, int v) {
        return v;
    }
}

