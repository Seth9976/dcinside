package rx.observables;

import rx.functions.b;
import rx.functions.m;
import rx.g.a;
import rx.g;
import rx.internal.operators.e0;
import rx.internal.operators.z;
import rx.o;

public abstract class c extends g {
    protected c(a g$a0) {
        super(g$a0);
    }

    public g A7() {
        return this.B7(1);
    }

    public g B7(int v) {
        return this.C7(v, m.a());
    }

    public g C7(int v, b b0) {
        if(v <= 0) {
            this.E7(b0);
            return this;
        }
        return g.M6(new z(this, v, b0));
    }

    public final o D7() {
        class rx.observables.c.a implements b {
            final o[] a;
            final c b;

            rx.observables.c.a(o[] arr_o) {
                this.a = arr_o;
                super();
            }

            public void a(o o0) {
                this.a[0] = o0;
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((o)object0));
            }
        }

        o[] arr_o = new o[1];
        this.E7(new rx.observables.c.a(this, arr_o));
        return arr_o[0];
    }

    public abstract void E7(b arg1);

    public g F7() {
        return g.M6(new e0(this));
    }
}

