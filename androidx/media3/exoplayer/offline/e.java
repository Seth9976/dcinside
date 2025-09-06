package androidx.media3.exoplayer.offline;

public final class e implements Runnable {
    public final DownloadHelper a;

    public e(DownloadHelper downloadHelper0) {
        this.a = downloadHelper0;
    }

    @Override
    public final void run() {
        this.a.N();
    }
}

