package j$.util.stream;

import j..util.Map.-EL;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import j..util.function.BiConsumer.-CC;
import j..util.function.Consumer.-CC;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public final class k implements BiConsumer, Consumer, Supplier {
    public final int a;
    public final Object b;
    public final Object c;

    public k(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override
    public void accept(Object object0) {
        switch(this.a) {
            case 2: {
                ((q3)this.b).b(((Consumer)this.c), object0);
                return;
            }
            case 3: {
                if(object0 == null) {
                    ((AtomicBoolean)this.b).set(true);
                    return;
                }
                ((ConcurrentHashMap)this.c).putIfAbsent(object0, Boolean.TRUE);
                return;
            }
            default: {
                ((BiConsumer)this.b).accept(this.c, object0);
            }
        }
    }

    @Override
    public void accept(Object object0, Object object1) {
        Object object2 = ((Function)this.b).apply(object1);
        Object object3 = Objects.requireNonNull(((Function)this.c).apply(object1));
        Object object4 = Map.-EL.putIfAbsent(((Map)object0), object2, object3);
        if(object4 != null) {
            throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", object2, object4, object3));
        }
    }

    @Override
    public BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        switch(this.a) {
            case 2: {
                return Consumer.-CC.$default$andThen(this, consumer0);
            }
            case 3: {
                return Consumer.-CC.$default$andThen(this, consumer0);
            }
            default: {
                return Consumer.-CC.$default$andThen(this, consumer0);
            }
        }
    }

    @Override
    public Object get() {
        return new p0(((u0)this.b), ((Predicate)this.c));
    }
}

