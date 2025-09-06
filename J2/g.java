package J2;

public final class g implements Runnable {
    public final o a;
    public final float b;

    public g(o o0, float f) {
        this.a = o0;
        this.b = f;
    }

    @Override
    public final void run() {
        o.w(this.a, this.b);
    }
}

