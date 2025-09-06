package J2;

public final class d implements Runnable {
    public final o a;
    public final float b;

    public d(o o0, float f) {
        this.a = o0;
        this.b = f;
    }

    @Override
    public final void run() {
        o.v(this.a, this.b);
    }
}

