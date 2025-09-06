package androidx.media3.exoplayer.offline;

public final class g implements Runnable {
    public final DownloadHelper a;
    public final Callback b;

    public g(DownloadHelper downloadHelper0, Callback downloadHelper$Callback0) {
        this.a = downloadHelper0;
        this.b = downloadHelper$Callback0;
    }

    @Override
    public final void run() {
        this.a.O(this.b);
    }
}

