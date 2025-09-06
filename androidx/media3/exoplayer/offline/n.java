package androidx.media3.exoplayer.offline;

public final class n implements Runnable {
    public final DownloadManagerHelper a;
    public final DownloadService b;

    public n(DownloadManagerHelper downloadService$DownloadManagerHelper0, DownloadService downloadService0) {
        this.a = downloadService$DownloadManagerHelper0;
        this.b = downloadService0;
    }

    @Override
    public final void run() {
        this.a.m(this.b);
    }
}

