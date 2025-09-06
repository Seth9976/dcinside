package kotlinx.coroutines.future;

import A3.o;
import j..util.function.BiFunction.-CC;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class n implements BiFunction {
    public final o a;

    public n(o o0) {
        this.a = o0;
    }

    @Override
    public BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0, Object object1) {
        return p.f(this.a, object0, ((Throwable)object1));
    }
}

