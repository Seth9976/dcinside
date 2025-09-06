package J2;

public final class h implements Runnable {
    public final o a;
    public final b b;

    public h(o o0, b a$b0) {
        this.a = o0;
        this.b = a$b0;
    }

    @Override
    public final void run() {
        o.s(this.a, this.b);
    }
}

