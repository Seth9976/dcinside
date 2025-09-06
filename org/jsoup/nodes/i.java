package org.jsoup.nodes;

import j..util.function.Function.-CC;
import java.util.function.Function;

public final class i implements Function {
    public final Class a;

    public i(Class class0) {
        this.a = class0;
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return this.a.cast(((t)object0));
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

