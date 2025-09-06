package androidx.media3.exoplayer.offline;

import androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher;

public final class k implements Listener {
    public final DownloadManager a;

    public k(DownloadManager downloadManager0) {
        this.a = downloadManager0;
    }

    @Override  // androidx.media3.exoplayer.scheduler.RequirementsWatcher$Listener
    public final void a(RequirementsWatcher requirementsWatcher0, int v) {
        this.a.w(requirementsWatcher0, v);
    }
}

