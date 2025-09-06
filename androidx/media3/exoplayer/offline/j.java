package androidx.media3.exoplayer.offline;

import android.os.Handler.Callback;
import android.os.Message;

public final class j implements Handler.Callback {
    public final DownloadManager a;

    public j(DownloadManager downloadManager0) {
        this.a = downloadManager0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        return this.a.n(message0);
    }
}

