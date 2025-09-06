package androidx.media3.exoplayer.video;

public final class c implements Runnable {
    public final CompositingVideoSinkProvider a;

    public c(CompositingVideoSinkProvider compositingVideoSinkProvider0) {
        this.a = compositingVideoSinkProvider0;
    }

    @Override
    public final void run() {
        this.a.D();
    }
}

