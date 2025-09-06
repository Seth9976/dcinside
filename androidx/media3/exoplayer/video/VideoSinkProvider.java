package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface VideoSinkProvider {
    void c(Surface arg1, Size arg2);

    VideoFrameReleaseControl e();

    VideoSink f();

    void g();

    void release();
}

