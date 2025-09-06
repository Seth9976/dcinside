package j$.util.stream;

import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

final class j3 extends k3 implements Consumer {
    final Object[] b;

    j3(int v) {
        this.b = new Object[v];
    }

    @Override
    public final void accept(Object object0) {
        int v = this.a;
        this.a = v + 1;
        this.b[v] = object0;
    }

    @Override
    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

