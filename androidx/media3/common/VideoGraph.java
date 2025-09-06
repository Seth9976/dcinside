package androidx.media3.common;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface VideoGraph {
    @UnstableApi
    public interface Listener {
        void a(VideoFrameProcessingException arg1);

        void b(long arg1);

        void d(int arg1, int arg2);

        void h(long arg1);
    }

    VideoFrameProcessor a(int arg1);

    void b(@Nullable SurfaceInfo arg1);

    boolean d();

    void e(@IntRange(from = 0L) int arg1) throws VideoFrameProcessingException;

    void initialize() throws VideoFrameProcessingException;

    void release();
}

