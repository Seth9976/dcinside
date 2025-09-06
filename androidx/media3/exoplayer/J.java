package androidx.media3.exoplayer;

public final class j implements Runnable {
    public final AudioFocusListener a;
    public final int b;

    public j(AudioFocusListener audioFocusManager$AudioFocusListener0, int v) {
        this.a = audioFocusManager$AudioFocusListener0;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.b(this.b);
    }
}

