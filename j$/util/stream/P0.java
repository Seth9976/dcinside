package j$.util.stream;

import java.util.function.Predicate;

final class p0 extends t0 {
    final u0 c;
    final Predicate d;

    p0(u0 u00, Predicate predicate0) {
        this.c = u00;
        this.d = predicate0;
        super(u00);
    }

    @Override
    public final void accept(Object object0) {
        if(!this.a) {
            boolean z = this.d.test(object0);
            u0 u00 = this.c;
            if(z == u00.a) {
                this.a = true;
                this.b = u00.b;
            }
        }
    }
}

