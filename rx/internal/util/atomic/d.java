package rx.internal.util.atomic;

public final class d extends b {
    public d() {
        c c0 = new c();
        this.g(c0);
        this.i(c0);
    }

    @Override
    public boolean offer(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("null elements not allowed");
        }
        c c0 = new c(object0);
        this.i(c0).d(c0);
        return true;
    }

    @Override
    public Object peek() {
        c c2;
        c c0 = this.a();
        c c1 = c0.c();
        if(c1 != null) {
            return c1.b();
        }
        if(c0 != this.d()) {
            do {
                c2 = c0.c();
            }
            while(c2 == null);
            return c2.b();
        }
        return null;
    }

    @Override
    public Object poll() {
        c c2;
        c c0 = this.a();
        c c1 = c0.c();
        if(c1 != null) {
            Object object0 = c1.a();
            this.g(c1);
            return object0;
        }
        if(c0 != this.d()) {
            do {
                c2 = c0.c();
            }
            while(c2 == null);
            Object object1 = c2.a();
            this.g(c2);
            return object1;
        }
        return null;
    }
}

