package j$.util.stream;

import j..util.Map.-EL;
import j..util.Objects;
import j..util.function.BiConsumer.-CC;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public final class l implements BiConsumer {
    public final int a;
    public final Function b;
    public final Object c;
    public final Object d;

    public l(Function function0, Object object0, Object object1, int v) {
        this.a = v;
        this.b = function0;
        this.c = object0;
        this.d = object1;
        super();
    }

    @Override
    public final void accept(Object object0, Object object1) {
        Object object2 = this.d;
        Object object3 = this.c;
        Function function0 = this.b;
        if(this.a != 0) {
            ((BiConsumer)object2).accept(Map.-EL.computeIfAbsent(((Map)object0), Objects.requireNonNull(function0.apply(object1), "element cannot be mapped to a null key"), new a(1, ((Supplier)object3))), object1);
            return;
        }
        Map.-EL.merge(((Map)object0), function0.apply(object1), ((Function)object3).apply(object1), ((BinaryOperator)object2));
    }

    @Override
    public final BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

