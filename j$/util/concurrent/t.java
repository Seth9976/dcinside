package j$.util.concurrent;

import j..util.function.BiConsumer.-CC;
import j..util.function.BiFunction.-CC;
import j..util.function.Consumer.-CC;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public final class t implements BiConsumer, BiFunction, Consumer {
    public final int a;
    public final Object b;
    public final Object c;

    public t(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    public t(BiFunction biFunction0, Function function0) {
        this.a = 2;
        super();
        this.c = biFunction0;
        this.b = function0;
    }

    @Override
    public void accept(Object object0) {
        ((Consumer)this.b).accept(object0);
        ((Consumer)this.c).accept(object0);
    }

    @Override
    public void accept(Object object0, Object object1) {
        if(this.a != 0) {
            ((BiConsumer)this.b).accept(object0, object1);
            ((BiConsumer)this.c).accept(object0, object1);
            return;
        }
        do {
            Object object2 = ((BiFunction)this.c).apply(object0, object1);
            ConcurrentMap concurrentMap0 = (ConcurrentMap)this.b;
            if(concurrentMap0.replace(object0, object1, object2)) {
                break;
            }
            object1 = concurrentMap0.get(object0);
        }
        while(object1 != null);
    }

    @Override
    public BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }

    @Override
    public BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }

    @Override
    public Object apply(Object object0, Object object1) {
        Object object2 = ((BiFunction)this.c).apply(object0, object1);
        return ((Function)this.b).apply(object2);
    }
}

