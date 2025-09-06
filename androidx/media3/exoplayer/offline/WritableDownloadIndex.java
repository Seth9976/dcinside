package androidx.media3.exoplayer.offline;

import androidx.annotation.WorkerThread;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@WorkerThread
@UnstableApi
public interface WritableDownloadIndex extends DownloadIndex {
    void a(String arg1, int arg2) throws IOException;

    void b(Download arg1) throws IOException;

    void c(String arg1) throws IOException;

    void f(int arg1) throws IOException;

    void g() throws IOException;

    void h() throws IOException;
}

