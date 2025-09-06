package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;

public interface MediaSource {
    public interface Factory {
        @UnstableApi
        public static final Factory a;

        static {
            Factory.a = MediaSourceFactory.b;
        }

        @UnstableApi
        Factory a(androidx.media3.extractor.text.SubtitleParser.Factory arg1);

        @UnstableApi
        @Deprecated
        Factory b(boolean arg1);

        @UnstableApi
        Factory c(DrmSessionManagerProvider arg1);

        @UnstableApi
        int[] d();

        @UnstableApi
        Factory e(LoadErrorHandlingPolicy arg1);

        @UnstableApi
        Factory f(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory arg1);

        @UnstableApi
        MediaSource g(MediaItem arg1);
    }

    @UnstableApi
    public static final class MediaPeriodId {
        public final Object a;
        public final int b;
        public final int c;
        public final long d;
        public final int e;

        public MediaPeriodId(Object object0) {
            this(object0, -1L);
        }

        public MediaPeriodId(Object object0, int v, int v1, long v2) {
            this(object0, v, v1, v2, -1);
        }

        private MediaPeriodId(Object object0, int v, int v1, long v2, int v3) {
            this.a = object0;
            this.b = v;
            this.c = v1;
            this.d = v2;
            this.e = v3;
        }

        public MediaPeriodId(Object object0, long v) {
            this(object0, -1, -1, v, -1);
        }

        public MediaPeriodId(Object object0, long v, int v1) {
            this(object0, -1, -1, v, v1);
        }

        // 去混淆评级： 低(20)
        public MediaPeriodId a(Object object0) {
            return this.a.equals(object0) ? this : new MediaPeriodId(object0, this.b, this.c, this.d, this.e);
        }

        public MediaPeriodId b(long v) {
            return this.d == v ? this : new MediaPeriodId(this.a, this.b, this.c, v, this.e);
        }

        public boolean c() {
            return this.b != -1;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof MediaPeriodId ? this.a.equals(((MediaPeriodId)object0).a) && this.b == ((MediaPeriodId)object0).b && this.c == ((MediaPeriodId)object0).c && this.d == ((MediaPeriodId)object0).d && this.e == ((MediaPeriodId)object0).e : false;
        }

        @Override
        public int hashCode() {
            return ((((this.a.hashCode() + 0x20F) * 0x1F + this.b) * 0x1F + this.c) * 0x1F + ((int)this.d)) * 0x1F + this.e;
        }
    }

    @UnstableApi
    public interface MediaSourceCaller {
        void H(MediaSource arg1, Timeline arg2);
    }

    @UnstableApi
    void A(MediaSourceEventListener arg1);

    @UnstableApi
    MediaPeriod C(MediaPeriodId arg1, Allocator arg2, long arg3);

    @UnstableApi
    @Deprecated
    void E(MediaSourceCaller arg1, @Nullable TransferListener arg2);

    @UnstableApi
    void F(DrmSessionEventListener arg1);

    @UnstableApi
    void I(MediaSourceCaller arg1, @Nullable TransferListener arg2, PlayerId arg3);

    @UnstableApi
    void J(MediaSourceCaller arg1);

    @UnstableApi
    void L(MediaItem arg1);

    @UnstableApi
    void N(MediaSourceCaller arg1);

    @UnstableApi
    boolean R();

    @UnstableApi
    boolean S(MediaItem arg1);

    @UnstableApi
    void a(Handler arg1, MediaSourceEventListener arg2);

    @UnstableApi
    MediaItem d();

    @UnstableApi
    void q(Handler arg1, DrmSessionEventListener arg2);

    @UnstableApi
    void r(MediaPeriod arg1);

    @UnstableApi
    void u(MediaSourceCaller arg1);

    @UnstableApi
    void w() throws IOException;

    @Nullable
    @UnstableApi
    Timeline x();
}

