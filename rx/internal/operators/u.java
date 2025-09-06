package rx.internal.operators;

import rx.g.a;
import rx.g.b;
import rx.n;
import rx.plugins.c;

public final class U implements a {
    final a a;
    final b b;

    public U(a g$a0, b g$b0) {
        this.a = g$a0;
        this.b = g$b0;
    }

    public void a(n n0) {
        try {
            n n1 = (n)c.M(this.b).b(n0);
            try {
                n1.onStart();
                this.a.b(n1);
            }
            catch(Throwable throwable1) {
                rx.exceptions.c.e(throwable1);
                n1.onError(throwable1);
            }
        }
        catch(Throwable throwable0) {
            rx.exceptions.c.e(throwable0);
            n0.onError(throwable0);
        }
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

