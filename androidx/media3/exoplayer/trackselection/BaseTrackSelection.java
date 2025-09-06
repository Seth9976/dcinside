package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.chunk.Chunk;
import java.util.Arrays;
import java.util.List;

@UnstableApi
public abstract class BaseTrackSelection implements ExoTrackSelection {
    protected final TrackGroup c;
    protected final int d;
    protected final int[] e;
    private final int f;
    private final Format[] g;
    private final long[] h;
    private int i;

    public BaseTrackSelection(TrackGroup trackGroup0, int[] arr_v) {
        this(trackGroup0, arr_v, 0);
    }

    public BaseTrackSelection(TrackGroup trackGroup0, int[] arr_v, int v) {
        Assertions.i(arr_v.length > 0);
        int v3;
        this.f = v;
        this.c = (TrackGroup)Assertions.g(trackGroup0);
        this.d = arr_v.length;
        this.g = new Format[arr_v.length];
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            this.g[v2] = trackGroup0.c(arr_v[v2]);
        }
        a a0 = (Format format0, Format format1) -> format1.i - format0.i;
        Arrays.sort(this.g, a0);
        this.e = new int[this.d];
        for(int v1 = 0; true; ++v1) {
            v3 = this.d;
            if(v1 >= v3) {
                break;
            }
            this.e[v1] = trackGroup0.d(this.g[v1]);
        }
        this.h = new long[v3];
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public long a() {
        return 0xFFFFFFFF80000001L;
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean b(int v, long v1) {
        return this.h[v] > v1;
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void c() {
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int e(int v) {
        return this.e[v];
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && (this.c.equals(((BaseTrackSelection)object0).c) && Arrays.equals(this.e, ((BaseTrackSelection)object0).e));
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean f(int v, long v1) {
        long v2 = SystemClock.elapsedRealtime();
        boolean z = this.b(v, v2);
        for(int v3 = 0; v3 < this.d && !z; ++v3) {
            z = v3 != v && !this.b(v3, v2);
        }
        if(!z) {
            return false;
        }
        this.h[v] = Math.max(this.h[v], Util.f(v2, v1, 0x7FFFFFFFFFFFFFFFL));
        return true;
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void g() {
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getType() {
        return this.f;
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int h(int v) {
        for(int v1 = 0; v1 < this.d; ++v1) {
            if(this.e[v1] == v) {
                return v1;
            }
        }
        return -1;
    }

    @Override
    public int hashCode() {
        if(this.i == 0) {
            int v = Arrays.hashCode(this.e);
            this.i = System.identityHashCode(this.c) * 0x1F + v;
        }
        return this.i;
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelection
    public final TrackGroup i() {
        return this.c;
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean j(long v, Chunk chunk0, List list0) {
        return false;
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void k() {
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int l(long v, List list0) {
        return list0.size();
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int length() {
        return this.e.length;
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int m() {
        return this.e[this.d()];
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final Format n() {
        return this.g[this.d()];
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void o() {
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int p(Format format0) {
        for(int v = 0; v < this.d; ++v) {
            if(this.g[v] == format0) {
                return v;
            }
        }
        return -1;
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelection
    public final Format q(int v) {
        return this.g[v];
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void s(float f) {
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void u(boolean z) {
    }

    // 检测为 Lambda 实现
    private static int x(Format format0, Format format1) [...]
}

