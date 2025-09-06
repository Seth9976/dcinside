package io.reactivex.internal.operators.mixed;

import e3.o;
import io.reactivex.I;
import io.reactivex.Q;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.operators.maybe.o0;
import io.reactivex.internal.operators.single.W;
import io.reactivex.y;
import java.util.concurrent.Callable;

final class r {
    private r() {
        throw new IllegalStateException("No instances!");
    }

    static boolean a(Object object0, o o0, f f0) {
        i i0;
        if(object0 instanceof Callable) {
            Callable callable0 = (Callable)object0;
            try {
                Object object1 = callable0.call();
                i0 = object1 == null ? null : ((i)b.g(o0.apply(object1), "The mapper returned a null CompletableSource"));
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                e.e(throwable0, f0);
                return true;
            }
            if(i0 == null) {
                e.b(f0);
                return true;
            }
            i0.e(f0);
            return true;
        }
        return false;
    }

    static boolean b(Object object0, o o0, I i0) {
        y y0;
        if(object0 instanceof Callable) {
            Callable callable0 = (Callable)object0;
            try {
                Object object1 = callable0.call();
                y0 = object1 == null ? null : ((y)b.g(o0.apply(object1), "The mapper returned a null MaybeSource"));
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                e.g(throwable0, i0);
                return true;
            }
            if(y0 == null) {
                e.d(i0);
                return true;
            }
            y0.a(o0.i8(i0));
            return true;
        }
        return false;
    }

    static boolean c(Object object0, o o0, I i0) {
        Q q0;
        if(object0 instanceof Callable) {
            Callable callable0 = (Callable)object0;
            try {
                Object object1 = callable0.call();
                q0 = object1 == null ? null : ((Q)b.g(o0.apply(object1), "The mapper returned a null SingleSource"));
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                e.g(throwable0, i0);
                return true;
            }
            if(q0 == null) {
                e.d(i0);
                return true;
            }
            q0.e(W.i8(i0));
            return true;
        }
        return false;
    }
}

