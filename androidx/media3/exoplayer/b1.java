package androidx.media3.exoplayer;

public final class b1 implements Runnable {
    public final StreamVolumeManager a;

    public b1(StreamVolumeManager streamVolumeManager0) {
        this.a = streamVolumeManager0;
    }

    @Override
    public final void run() {
        this.a.o();
    }
}

