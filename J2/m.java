package J2;

public final class m implements Runnable {
    public final o a;
    public final c b;

    public m(o o0, c a$c0) {
        this.a = o0;
        this.b = a$c0;
    }

    @Override
    public final void run() {
        o.q(this.a, this.b);
    }
}

