package androidx.media3.exoplayer.offline;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@WorkerThread
@UnstableApi
public interface DownloadIndex {
    DownloadCursor d(int[] arg1) throws IOException;

    @Nullable
    Download e(String arg1) throws IOException;
}

