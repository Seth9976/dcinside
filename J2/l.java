package J2;

public final class l implements Runnable {
    public final o a;
    public final float b;

    public l(o o0, float f) {
        this.a = o0;
        this.b = f;
    }

    @Override
    public final void run() {
        o.y(this.a, this.b);
    }
}

