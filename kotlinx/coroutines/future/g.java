package kotlinx.coroutines.future;

import j..util.function.BiFunction.-CC;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.e0;
import kotlin.f0;
import y4.m;
import z3.f;

final class g implements BiFunction {
    @m
    @f
    public volatile d cont;

    public g(@m d d0) {
        this.cont = d0;
    }

    public void a(@m Object object0, @m Throwable throwable0) {
        d d0 = this.cont;
        if(d0 == null) {
            return;
        }
        if(throwable0 == null) {
            d0.resumeWith(object0);
            return;
        }
        CompletionException completionException0 = kotlinx.coroutines.future.d.a(throwable0) ? ((CompletionException)throwable0) : null;
        if(completionException0 != null) {
            Throwable throwable1 = completionException0.getCause();
            if(throwable1 != null) {
                throwable0 = throwable1;
            }
        }
        d0.resumeWith(e0.b(f0.a(throwable0)));
    }

    @Override
    public BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public Object apply(Object object0, Object object1) {
        this.a(object0, ((Throwable)object1));
        return S0.a;
    }
}

