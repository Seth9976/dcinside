package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.exceptions.b;
import io.reactivex.f;
import io.reactivex.h;
import io.reactivex.i;
import io.reactivex.plugins.a;

public final class y extends c {
    final i a;
    final h b;

    public y(i i0, h h0) {
        this.a = i0;
        this.b = h0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        try {
            f f1 = this.b.a(f0);
            this.a.e(f1);
        }
        catch(NullPointerException nullPointerException0) {
            throw nullPointerException0;
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            a.Y(throwable0);
        }
    }
}

