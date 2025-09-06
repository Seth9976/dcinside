package androidx.media3.exoplayer;

import O1.a;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import java.util.HashMap;

@UnstableApi
public class DefaultLoadControl implements LoadControl {
    public static final class Builder {
        @Nullable
        private DefaultAllocator a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private boolean g;
        private int h;
        private boolean i;
        private boolean j;

        public Builder() {
            this.b = 50000;
            this.c = 50000;
            this.d = 2500;
            this.e = 5000;
            this.f = -1;
            this.g = false;
            this.h = 0;
            this.i = false;
        }

        public DefaultLoadControl a() {
            Assertions.i(!this.j);
            this.j = true;
            if(this.a == null) {
                this.a = new DefaultAllocator(true, 0x10000);
            }
            return new DefaultLoadControl(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        @a
        public Builder b(DefaultAllocator defaultAllocator0) {
            Assertions.i(!this.j);
            this.a = defaultAllocator0;
            return this;
        }

        @a
        public Builder c(int v, boolean z) {
            Assertions.i(!this.j);
            DefaultLoadControl.u(v, 0, "backBufferDurationMs", "0");
            this.h = v;
            this.i = z;
            return this;
        }

        @a
        public Builder d(int v, int v1, int v2, int v3) {
            Assertions.i(!this.j);
            DefaultLoadControl.u(v2, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.u(v3, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.u(v, v2, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.u(v, v3, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.u(v1, v, "maxBufferMs", "minBufferMs");
            this.b = v;
            this.c = v1;
            this.d = v2;
            this.e = v3;
            return this;
        }

        @a
        public Builder e(boolean z) {
            Assertions.i(!this.j);
            this.g = z;
            return this;
        }

        @a
        public Builder f(int v) {
            Assertions.i(!this.j);
            this.f = v;
            return this;
        }
    }

    static class PlayerLoadingState {
        public boolean a;
        public int b;

        private PlayerLoadingState() {
        }

        PlayerLoadingState(androidx.media3.exoplayer.DefaultLoadControl.1 defaultLoadControl$10) {
        }
    }

    public static final int A = 0x89A0000;
    public static final int B = 0xC80000;
    private final DefaultAllocator b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final int g;
    private final boolean h;
    private final long i;
    private final boolean j;
    private final HashMap k;
    private long l;
    public static final int m = 50000;
    public static final int n = 50000;
    public static final int o = 2500;
    public static final int p = 5000;
    public static final int q = -1;
    public static final boolean r = false;
    public static final int s = 0;
    public static final boolean t = false;
    public static final int u = 0x7D00000;
    public static final int v = 0xC80000;
    public static final int w = 0x20000;
    public static final int x = 0x20000;
    public static final int y = 0x20000;
    public static final int z = 0x20000;

    public DefaultLoadControl() {
        this(new DefaultAllocator(true, 0x10000), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    protected DefaultLoadControl(DefaultAllocator defaultAllocator0, int v, int v1, int v2, int v3, int v4, boolean z, int v5, boolean z1) {
        DefaultLoadControl.u(v2, 0, "bufferForPlaybackMs", "0");
        DefaultLoadControl.u(v3, 0, "bufferForPlaybackAfterRebufferMs", "0");
        DefaultLoadControl.u(v, v2, "minBufferMs", "bufferForPlaybackMs");
        DefaultLoadControl.u(v, v3, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        DefaultLoadControl.u(v1, v, "maxBufferMs", "minBufferMs");
        DefaultLoadControl.u(v5, 0, "backBufferDurationMs", "0");
        this.b = defaultAllocator0;
        this.c = Util.F1(v);
        this.d = Util.F1(v1);
        this.e = Util.F1(v2);
        this.f = Util.F1(v3);
        this.g = v4;
        this.h = z;
        this.i = Util.F1(v5);
        this.j = z1;
        this.k = new HashMap();
        this.l = -1L;
    }

    private void A() {
        if(this.k.isEmpty()) {
            this.b.g();
            return;
        }
        int v = this.w();
        this.b.h(v);
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public boolean a() {
        return F0.l(this);
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public void b(Renderer[] arr_renderer, TrackGroupArray trackGroupArray0, ExoTrackSelection[] arr_exoTrackSelection) {
        F0.k(this, arr_renderer, trackGroupArray0, arr_exoTrackSelection);
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public void c() {
        F0.c(this);
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public void d(PlayerId playerId0) {
        long v = Thread.currentThread().getId();
        Assertions.j(this.l == -1L || this.l == v, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.l = v;
        if(!this.k.containsKey(playerId0)) {
            PlayerLoadingState defaultLoadControl$PlayerLoadingState0 = new PlayerLoadingState(null);
            this.k.put(playerId0, defaultLoadControl$PlayerLoadingState0);
        }
        this.z(playerId0);
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public void e(Timeline timeline0, MediaPeriodId mediaSource$MediaPeriodId0, Renderer[] arr_renderer, TrackGroupArray trackGroupArray0, ExoTrackSelection[] arr_exoTrackSelection) {
        F0.i(this, timeline0, mediaSource$MediaPeriodId0, arr_renderer, trackGroupArray0, arr_exoTrackSelection);
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public boolean f(Parameters loadControl$Parameters0) {
        PlayerLoadingState defaultLoadControl$PlayerLoadingState0 = (PlayerLoadingState)Assertions.g(((PlayerLoadingState)this.k.get(loadControl$Parameters0.a)));
        boolean z = true;
        boolean z1 = this.b.b() >= this.w();
        long v = this.c;
        float f = loadControl$Parameters0.f;
        if(f > 1.0f) {
            v = Math.min(Util.x0(v, f), this.d);
        }
        long v1 = loadControl$Parameters0.e;
        if(v1 < Math.max(v, 500000L)) {
            if(!this.h && z1) {
                z = false;
            }
            defaultLoadControl$PlayerLoadingState0.a = z;
            if(!z && v1 < 500000L) {
                Log.n("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                return defaultLoadControl$PlayerLoadingState0.a;
            }
        }
        else if(v1 >= this.d || z1) {
            defaultLoadControl$PlayerLoadingState0.a = false;
        }
        return defaultLoadControl$PlayerLoadingState0.a;
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public void g(PlayerId playerId0, Timeline timeline0, MediaPeriodId mediaSource$MediaPeriodId0, Renderer[] arr_renderer, TrackGroupArray trackGroupArray0, ExoTrackSelection[] arr_exoTrackSelection) {
        PlayerLoadingState defaultLoadControl$PlayerLoadingState0 = (PlayerLoadingState)Assertions.g(((PlayerLoadingState)this.k.get(playerId0)));
        defaultLoadControl$PlayerLoadingState0.b = this.g == -1 ? this.v(arr_renderer, arr_exoTrackSelection) : this.g;
        this.A();
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public void h() {
        F0.e(this);
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public boolean i(long v, long v1, float f) {
        return F0.n(this, v, v1, f);
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public long j(PlayerId playerId0) {
        return this.i;
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public boolean k(Parameters loadControl$Parameters0) {
        long v = Util.D0(loadControl$Parameters0.e, loadControl$Parameters0.f);
        long v1 = loadControl$Parameters0.h ? this.f : this.e;
        long v2 = loadControl$Parameters0.i;
        if(v2 != 0x8000000000000001L) {
            v1 = Math.min(v2 / 2L, v1);
        }
        return v1 <= 0L || v >= v1 || !this.h && this.b.b() >= this.w();
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public long l() {
        return F0.a(this);
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public boolean m(long v, float f, boolean z, long v1) {
        return F0.p(this, v, f, z, v1);
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public Allocator n() {
        return this.b;
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public void o() {
        F0.g(this);
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public void p(PlayerId playerId0) {
        this.y(playerId0);
        if(this.k.isEmpty()) {
            this.l = -1L;
        }
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public void q(PlayerId playerId0) {
        this.y(playerId0);
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public boolean r(Timeline timeline0, MediaPeriodId mediaSource$MediaPeriodId0, long v, float f, boolean z, long v1) {
        return F0.q(this, timeline0, mediaSource$MediaPeriodId0, v, f, z, v1);
    }

    @Override  // androidx.media3.exoplayer.LoadControl
    public boolean s(PlayerId playerId0) {
        return this.j;
    }

    private static void u(int v, int v1, String s, String s1) {
        Assertions.b(v >= v1, s + " cannot be less than " + s1);
    }

    protected int v(Renderer[] arr_renderer, ExoTrackSelection[] arr_exoTrackSelection) {
        int v1 = 0;
        for(int v = 0; v < arr_renderer.length; ++v) {
            if(arr_exoTrackSelection[v] != null) {
                v1 += DefaultLoadControl.x(arr_renderer[v].g());
            }
        }
        return Math.max(0xC80000, v1);
    }

    @VisibleForTesting
    int w() {
        int v = 0;
        for(Object object0: this.k.values()) {
            v += ((PlayerLoadingState)object0).b;
        }
        return v;
    }

    private static int x(int v) {
        switch(v) {
            case -2: {
                return 0;
            }
            case 0: {
                return 0x89A0000;
            }
            case 1: {
                return 0xC80000;
            }
            case 2: {
                return 0x7D00000;
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                return 0x20000;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    private void y(PlayerId playerId0) {
        if(this.k.remove(playerId0) != null) {
            this.A();
        }
    }

    private void z(PlayerId playerId0) {
        PlayerLoadingState defaultLoadControl$PlayerLoadingState0 = (PlayerLoadingState)Assertions.g(((PlayerLoadingState)this.k.get(playerId0)));
        defaultLoadControl$PlayerLoadingState0.b = this.g == -1 ? 0xC80000 : this.g;
        defaultLoadControl$PlayerLoadingState0.a = false;
    }

    class androidx.media3.exoplayer.DefaultLoadControl.1 {
    }

}

