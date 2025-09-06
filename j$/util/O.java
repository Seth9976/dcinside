package j$.util;

import j..util.function.Consumer.-CC;
import java.util.Map.Entry;
import java.util.function.Consumer;

public final class o implements Consumer {
    public final Consumer a;

    public o(Consumer consumer0) {
        this.a = consumer0;
    }

    @Override
    public final void accept(Object object0) {
        p p0 = new p(((Map.Entry)object0));
        this.a.accept(p0);
    }

    @Override
    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

