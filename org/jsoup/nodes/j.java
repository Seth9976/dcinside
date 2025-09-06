package org.jsoup.nodes;

import j..util.DesugarCollections;
import j..util.function.Function.-CC;
import java.util.List;
import java.util.function.Function;

public final class j implements Function {
    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return DesugarCollections.unmodifiableList(((List)object0));
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

