package androidx.media3.exoplayer.audio;

public final class p implements Runnable {
    public final EventDispatcher a;
    public final AudioTrackConfig b;

    public p(EventDispatcher audioRendererEventListener$EventDispatcher0, AudioTrackConfig audioSink$AudioTrackConfig0) {
        this.a = audioRendererEventListener$EventDispatcher0;
        this.b = audioSink$AudioTrackConfig0;
    }

    @Override
    public final void run() {
        this.a.y(this.b);
    }
}

