package rx;

import rx.internal.util.q;

public abstract class m implements o {
    private final q a;

    public m() {
        this.a = new q();
    }

    public final void c(o o0) {
        this.a.a(o0);
    }

    public abstract void e(Object arg1);

    @Override  // rx.o
    public final boolean j() {
        return this.a.j();
    }

    @Override  // rx.o
    public final void l() {
        this.a.l();
    }

    public abstract void onError(Throwable arg1);
}

