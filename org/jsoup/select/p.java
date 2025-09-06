package org.jsoup.select;

import j..util.function.Function.-CC;
import java.util.function.Function;
import org.jsoup.nodes.o;

public final class p implements Function {
    public final r a;
    public final o b;

    public p(r r0, o o0) {
        this.a = r0;
        this.b = o0;
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return this.a.h(this.b, ((o)object0));
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

