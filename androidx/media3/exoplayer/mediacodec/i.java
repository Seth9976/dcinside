package androidx.media3.exoplayer.mediacodec;

public final class i implements Runnable {
    public final AsynchronousMediaCodecCallback a;

    public i(AsynchronousMediaCodecCallback asynchronousMediaCodecCallback0) {
        this.a = asynchronousMediaCodecCallback0;
    }

    @Override
    public final void run() {
        this.a.n();
    }
}

