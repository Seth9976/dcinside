package J2;

public final class n implements Runnable {
    public final o a;
    public final d b;

    public n(o o0, d a$d0) {
        this.a = o0;
        this.b = a$d0;
    }

    @Override
    public final void run() {
        o.u(this.a, this.b);
    }
}

