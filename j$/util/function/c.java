package j$.util.function;

import java.util.function.Function;

public final class c implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return object0;
    }

    @Override
    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

