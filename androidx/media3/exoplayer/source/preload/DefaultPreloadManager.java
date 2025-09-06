package androidx.media3.exoplayer.source.preload;

import android.os.Looper;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.base.I;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Comparator;

@UnstableApi
public final class DefaultPreloadManager extends BasePreloadManager {
    static final class RankingDataComparator implements Comparator {
        public int a;

        public RankingDataComparator() {
            this.a = -1;
        }

        public int b(Integer integer0, Integer integer1) {
            return Integer.compare(Math.abs(((int)integer0) - this.a), Math.abs(((int)integer1) - this.a));
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.b(((Integer)object0), ((Integer)object1));
        }
    }

    final class SourcePreloadControl implements PreloadControl {
        final DefaultPreloadManager a;

        private SourcePreloadControl() {
        }

        SourcePreloadControl(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.1 defaultPreloadManager$10) {
        }

        @Override  // androidx.media3.exoplayer.source.preload.PreloadMediaSource$PreloadControl
        public void a(PreloadMediaSource preloadMediaSource0) {
            DefaultPreloadManager.this.l(preloadMediaSource0);
        }

        @Override  // androidx.media3.exoplayer.source.preload.PreloadMediaSource$PreloadControl
        public boolean b(PreloadMediaSource preloadMediaSource0) {
            return this.i(preloadMediaSource0, (Status defaultPreloadManager$Status0) -> defaultPreloadManager$Status0.a() > 1, false);
        }

        @Override  // androidx.media3.exoplayer.source.preload.PreloadMediaSource$PreloadControl
        public void c(PreloadMediaSource preloadMediaSource0) {
            DefaultPreloadManager.this.l(preloadMediaSource0);
        }

        @Override  // androidx.media3.exoplayer.source.preload.PreloadMediaSource$PreloadControl
        public boolean d(PreloadMediaSource preloadMediaSource0, long v) {
            return this.i(preloadMediaSource0, (Status defaultPreloadManager$Status0) -> defaultPreloadManager$Status0.a() == 2 && defaultPreloadManager$Status0.getValue() > Util.B2(v), false);
        }

        @Override  // androidx.media3.exoplayer.source.preload.PreloadMediaSource$PreloadControl
        public boolean e(PreloadMediaSource preloadMediaSource0) {
            return this.i(preloadMediaSource0, (Status defaultPreloadManager$Status0) -> defaultPreloadManager$Status0.a() > 0, true);
        }

        private boolean i(PreloadMediaSource preloadMediaSource0, I i0, boolean z) {
            PreloadStatus targetPreloadStatusControl$PreloadStatus0 = DefaultPreloadManager.this.h(preloadMediaSource0);
            if(targetPreloadStatusControl$PreloadStatus0 != null) {
                if(i0.apply(((Status)Assertions.g(((Status)targetPreloadStatusControl$PreloadStatus0))))) {
                    return true;
                }
                if(z) {
                    DefaultPreloadManager.this.d(preloadMediaSource0);
                }
            }
            DefaultPreloadManager.this.l(preloadMediaSource0);
            return false;
        }

        // 检测为 Lambda 实现
        private static boolean j(long v, Status defaultPreloadManager$Status0) [...]

        // 检测为 Lambda 实现
        private static boolean k(Status defaultPreloadManager$Status0) [...]

        // 检测为 Lambda 实现
        private static boolean l(Status defaultPreloadManager$Status0) [...]
    }

    public static class Status implements PreloadStatus {
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @Target({ElementType.TYPE_USE})
        public @interface Stage {
        }

        private final int a;
        private final long b;
        public static final int c = 0;
        public static final int d = 1;
        public static final int e = 2;

        public Status(int v) {
            this(v, 0x8000000000000001L);
        }

        public Status(int v, long v1) {
            this.a = v;
            this.b = v1;
        }

        @Override  // androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl$PreloadStatus
        public int a() {
            return this.a;
        }

        @Override  // androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl$PreloadStatus
        public long getValue() {
            return this.b;
        }
    }

    private final RendererCapabilitiesList i;
    private final Factory j;

    public DefaultPreloadManager(TargetPreloadStatusControl targetPreloadStatusControl0, androidx.media3.exoplayer.source.MediaSource.Factory mediaSource$Factory0, TrackSelector trackSelector0, BandwidthMeter bandwidthMeter0, androidx.media3.exoplayer.RendererCapabilitiesList.Factory rendererCapabilitiesList$Factory0, Allocator allocator0, Looper looper0) {
        super(new RankingDataComparator(), targetPreloadStatusControl0, mediaSource$Factory0);
        RendererCapabilitiesList rendererCapabilitiesList0 = rendererCapabilitiesList$Factory0.a();
        this.i = rendererCapabilitiesList0;
        this.j = new Factory(mediaSource$Factory0, new SourcePreloadControl(this, null), trackSelector0, bandwidthMeter0, rendererCapabilitiesList0.a(), allocator0, looper0);
    }

    @Override  // androidx.media3.exoplayer.source.preload.BasePreloadManager
    protected void d(MediaSource mediaSource0) {
        Assertions.a(mediaSource0 instanceof PreloadMediaSource);
        ((PreloadMediaSource)mediaSource0).d1();
    }

    @Override  // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public MediaSource e(MediaSource mediaSource0) {
        return this.j.i(mediaSource0);
    }

    @Override  // androidx.media3.exoplayer.source.preload.BasePreloadManager
    protected void m(MediaSource mediaSource0, long v) {
        Assertions.a(mediaSource0 instanceof PreloadMediaSource);
        ((PreloadMediaSource)mediaSource0).m1(v);
    }

    @Override  // androidx.media3.exoplayer.source.preload.BasePreloadManager
    protected void o() {
        this.i.release();
    }

    @Override  // androidx.media3.exoplayer.source.preload.BasePreloadManager
    protected void p(MediaSource mediaSource0) {
        Assertions.a(mediaSource0 instanceof PreloadMediaSource);
        ((PreloadMediaSource)mediaSource0).n1();
    }

    public void u(int v) {
        ((RankingDataComparator)this.b).a = v;
    }

    class androidx.media3.exoplayer.source.preload.DefaultPreloadManager.1 {
    }

}

