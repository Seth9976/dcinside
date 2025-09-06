package J2;

public final class i implements Runnable {
    public final o a;
    public final String b;

    public i(o o0, String s) {
        this.a = o0;
        this.b = s;
    }

    @Override
    public final void run() {
        o.x(this.a, this.b);
    }
}

