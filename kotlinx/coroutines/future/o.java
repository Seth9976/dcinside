package kotlinx.coroutines.future;

import j..util.function.BiFunction.-CC;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlinx.coroutines.I0;

public final class o implements BiFunction {
    public final I0 a;

    public o(I0 i00) {
        this.a = i00;
    }

    @Override
    public BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0, Object object1) {
        return p.k(this.a, object0, ((Throwable)object1));
    }
}

