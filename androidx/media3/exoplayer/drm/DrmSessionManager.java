package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;

@UnstableApi
public interface DrmSessionManager {
    public interface DrmSessionReference {
        public static final DrmSessionReference a;

        static {
            DrmSessionReference.a = new r();
        }

        void release();
    }

    public static final DrmSessionManager a;

    static {
        DrmSessionManager.a = new DrmSessionManager() {
            @Override  // androidx.media3.exoplayer.drm.DrmSessionManager
            public int a(Format format0) {
                return format0.r == null ? 0 : 1;
            }

            @Override  // androidx.media3.exoplayer.drm.DrmSessionManager
            public void b(Looper looper0, PlayerId playerId0) {
            }

            @Override  // androidx.media3.exoplayer.drm.DrmSessionManager
            @Nullable
            public DrmSession c(@Nullable EventDispatcher drmSessionEventListener$EventDispatcher0, Format format0) {
                return format0.r == null ? null : new ErrorStateDrmSession(new DrmSessionException(new UnsupportedDrmException(1), 6001));
            }

            @Override  // androidx.media3.exoplayer.drm.DrmSessionManager
            public DrmSessionReference d(EventDispatcher drmSessionEventListener$EventDispatcher0, Format format0) {
                return q.a(this, drmSessionEventListener$EventDispatcher0, format0);
            }

            @Override  // androidx.media3.exoplayer.drm.DrmSessionManager
            public void n() {
            }

            @Override  // androidx.media3.exoplayer.drm.DrmSessionManager
            public void release() {
            }
        };
    }

    int a(Format arg1);

    void b(Looper arg1, PlayerId arg2);

    @Nullable
    DrmSession c(@Nullable EventDispatcher arg1, Format arg2);

    DrmSessionReference d(@Nullable EventDispatcher arg1, Format arg2);

    void n();

    void release();
}

