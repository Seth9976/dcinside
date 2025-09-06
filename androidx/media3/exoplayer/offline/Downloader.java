package androidx.media3.exoplayer.offline;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
public interface Downloader {
    public interface ProgressListener {
        void a(long arg1, long arg2, float arg3);
    }

    void a(@Nullable ProgressListener arg1) throws IOException, InterruptedException;

    void cancel();

    void remove();
}

