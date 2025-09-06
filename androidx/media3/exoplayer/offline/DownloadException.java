package androidx.media3.exoplayer.offline;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
public final class DownloadException extends IOException {
    public DownloadException(String s) {
        super(s);
    }

    public DownloadException(Throwable throwable0) {
        super(throwable0);
    }
}

