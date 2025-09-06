package io.reactivex.internal.operators.observable;

import io.reactivex.F;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.internal.functions.b;

public final class w0 extends a {
    final F b;

    public w0(G g0, F f0) {
        super(g0);
        this.b = f0;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        I i1;
        try {
            i1 = (I)b.g(this.b.a(i0), "Operator " + this.b + " returned a null Observer");
        }
        catch(NullPointerException nullPointerException0) {
            throw nullPointerException0;
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            io.reactivex.plugins.a.Y(throwable0);
            NullPointerException nullPointerException1 = new NullPointerException("Actually not, but can\'t throw other exceptions due to RS");
            nullPointerException1.initCause(throwable0);
            throw nullPointerException1;
        }
        this.a.d(i1);
    }
}

