package rx.internal.util.atomic;

public final class h extends b {
    public h() {
        c c0 = new c();
        this.h(c0);
        this.g(c0);
        c0.d(null);
    }

    @Override
    public boolean offer(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("null elements not allowed");
        }
        c c0 = new c(object0);
        this.b().d(c0);
        this.h(c0);
        return true;
    }

    @Override
    public Object peek() {
        c c0 = this.a().c();
        return c0 == null ? null : c0.b();
    }

    @Override
    public Object poll() {
        c c0 = this.a().c();
        if(c0 != null) {
            Object object0 = c0.a();
            this.g(c0);
            return object0;
        }
        return null;
    }
}

