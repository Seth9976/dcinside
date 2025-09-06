package androidx.media3.exoplayer.offline;

import java.io.IOException;

public final class f implements Runnable {
    public final DownloadHelper a;
    public final IOException b;

    public f(DownloadHelper downloadHelper0, IOException iOException0) {
        this.a = downloadHelper0;
        this.b = iOException0;
    }

    @Override
    public final void run() {
        this.a.M(this.b);
    }
}

