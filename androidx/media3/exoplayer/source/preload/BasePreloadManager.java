package androidx.media3.exoplayer.source.preload;

import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource.Factory;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

@UnstableApi
public abstract class BasePreloadManager {
    public static abstract class BuilderBase {
        protected final Comparator a;
        protected final TargetPreloadStatusControl b;
        protected final Factory c;

        public BuilderBase(Comparator comparator0, TargetPreloadStatusControl targetPreloadStatusControl0, Factory mediaSource$Factory0) {
            this.a = comparator0;
            this.b = targetPreloadStatusControl0;
            this.c = mediaSource$Factory0;
        }

        public abstract BasePreloadManager a();
    }

    final class MediaSourceHolder implements Comparable {
        public final MediaSource a;
        public final Object b;
        public final long c;
        final BasePreloadManager d;

        public MediaSourceHolder(MediaSource mediaSource0, Object object0) {
            this(mediaSource0, object0, 0x8000000000000001L);
        }

        public MediaSourceHolder(MediaSource mediaSource0, Object object0, long v) {
            this.a = mediaSource0;
            this.b = object0;
            this.c = v;
        }

        public int a(MediaSourceHolder basePreloadManager$MediaSourceHolder0) {
            return BasePreloadManager.this.b.compare(this.b, basePreloadManager$MediaSourceHolder0.b);
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((MediaSourceHolder)object0));
        }
    }

    private final Object a;
    protected final Comparator b;
    private final TargetPreloadStatusControl c;
    private final Factory d;
    private final Map e;
    private final Handler f;
    @GuardedBy("lock")
    private final PriorityQueue g;
    @GuardedBy("lock")
    @Nullable
    private PreloadStatus h;

    protected BasePreloadManager(Comparator comparator0, TargetPreloadStatusControl targetPreloadStatusControl0, Factory mediaSource$Factory0) {
        this.a = new Object();
        this.b = comparator0;
        this.c = targetPreloadStatusControl0;
        this.d = mediaSource$Factory0;
        this.e = new HashMap();
        this.f = Util.J();
        this.g = new PriorityQueue();
    }

    public final void b(MediaItem mediaItem0, Object object0) {
        this.c(this.d.g(mediaItem0), object0);
    }

    public final void c(MediaSource mediaSource0, Object object0) {
        MediaSource mediaSource1 = this.e(mediaSource0);
        MediaSourceHolder basePreloadManager$MediaSourceHolder0 = new MediaSourceHolder(this, mediaSource1, object0);
        MediaItem mediaItem0 = mediaSource1.d();
        this.e.put(mediaItem0, basePreloadManager$MediaSourceHolder0);
    }

    protected abstract void d(MediaSource arg1);

    protected MediaSource e(MediaSource mediaSource0) {
        return mediaSource0;
    }

    @Nullable
    public final MediaSource f(MediaItem mediaItem0) {
        return this.e.containsKey(mediaItem0) ? ((MediaSourceHolder)this.e.get(mediaItem0)).a : null;
    }

    public final int g() {
        return this.e.size();
    }

    @Nullable
    protected final PreloadStatus h(MediaSource mediaSource0) {
        synchronized(this.a) {
            return !this.g.isEmpty() && ((MediaSourceHolder)Assertions.g(((MediaSourceHolder)this.g.peek()))).a == mediaSource0 ? this.h : null;
        }
    }

    public final void i() {
        synchronized(this.a) {
            this.g.clear();
            Collection collection0 = this.e.values();
            this.g.addAll(collection0);
            while(!this.g.isEmpty() && !this.k()) {
                this.g.poll();
            }
        }
    }

    // 检测为 Lambda 实现
    private void j(MediaSource mediaSource0) [...]

    @GuardedBy("lock")
    private boolean k() {
        MediaSourceHolder basePreloadManager$MediaSourceHolder0 = (MediaSourceHolder)Assertions.g(((MediaSourceHolder)this.g.peek()));
        PreloadStatus targetPreloadStatusControl$PreloadStatus0 = this.c.a(basePreloadManager$MediaSourceHolder0.b);
        this.h = targetPreloadStatusControl$PreloadStatus0;
        if(targetPreloadStatusControl$PreloadStatus0 != null) {
            this.m(basePreloadManager$MediaSourceHolder0.a, basePreloadManager$MediaSourceHolder0.c);
            return true;
        }
        this.d(basePreloadManager$MediaSourceHolder0.a);
        return false;
    }

    protected final void l(MediaSource mediaSource0) {
        a a0 = () -> synchronized(this.a) {
            if(!this.g.isEmpty() && ((MediaSourceHolder)Assertions.g(((MediaSourceHolder)this.g.peek()))).a == mediaSource0) {
                do {
                    this.g.poll();
                }
                while(!this.g.isEmpty() && !this.k());
            }
        };
        this.f.post(a0);
    }

    protected abstract void m(MediaSource arg1, long arg2);

    public final void n() {
        this.s();
        this.o();
    }

    protected void o() {
    }

    protected abstract void p(MediaSource arg1);

    public final boolean q(MediaItem mediaItem0) {
        if(this.e.containsKey(mediaItem0)) {
            MediaSource mediaSource0 = ((MediaSourceHolder)this.e.get(mediaItem0)).a;
            this.e.remove(mediaItem0);
            this.p(mediaSource0);
            return true;
        }
        return false;
    }

    public final boolean r(MediaSource mediaSource0) {
        MediaItem mediaItem0 = mediaSource0.d();
        if(this.e.containsKey(mediaItem0) && mediaSource0 == ((MediaSourceHolder)this.e.get(mediaItem0)).a) {
            this.e.remove(mediaItem0);
            this.p(mediaSource0);
            return true;
        }
        return false;
    }

    public final void s() {
        for(Object object0: this.e.values()) {
            this.p(((MediaSourceHolder)object0).a);
        }
        this.e.clear();
        synchronized(this.a) {
            this.g.clear();
            this.h = null;
        }
    }

    protected boolean t() [...] // Inlined contents
}

