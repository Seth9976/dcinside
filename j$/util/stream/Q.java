package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

final class q extends j2 {
    public final int b;
    Object c;

    public q(b b0, n2 n20, int v) {
        this.b = v;
        this.c = b0;
        super(n20);
    }

    public q(n2 n20) {
        this.b = 0;
        super(n20);
    }

    @Override
    public final void accept(Object object0) {
        switch(this.b) {
            case 0: {
                if(!((HashSet)this.c).contains(object0)) {
                    ((HashSet)this.c).add(object0);
                    this.a.accept(object0);
                }
                return;
            }
            case 1: {
                ((Consumer)((v)this.c).o).accept(object0);
                this.a.accept(object0);
                return;
            }
            case 2: {
                if(((Predicate)((v)this.c).o).test(object0)) {
                    this.a.accept(object0);
                }
                return;
            }
            case 3: {
                Object object1 = ((Function)((v)this.c).o).apply(object0);
                this.a.accept(object1);
                return;
            }
            case 4: {
                int v = ((ToIntFunction)((Y)this.c).o).applyAsInt(object0);
                this.a.accept(v);
                return;
            }
            case 5: {
                long v1 = ((ToLongFunction)((i0)this.c).o).applyAsLong(object0);
                this.a.accept(v1);
                return;
            }
            default: {
                double f = ((ToDoubleFunction)((A)this.c).o).applyAsDouble(object0);
                this.a.accept(f);
            }
        }
    }

    @Override  // j$.util.stream.j2
    public void k() {
        if(this.b != 0) {
            super.k();
            return;
        }
        this.c = null;
        this.a.k();
    }

    @Override  // j$.util.stream.j2
    public void l(long v) {
        switch(this.b) {
            case 0: {
                this.c = new HashSet();
                this.a.l(-1L);
                return;
            }
            case 2: {
                this.a.l(-1L);
                return;
            }
            default: {
                super.l(v);
            }
        }
    }
}

