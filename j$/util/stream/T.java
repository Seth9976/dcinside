package j$.util.stream;

import j..util.function.BiFunction.-CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public final class t implements BinaryOperator {
    public final int a;
    public final BiConsumer b;

    public t(BiConsumer biConsumer0, int v) {
        this.a = v;
        this.b = biConsumer0;
        super();
    }

    @Override
    public final BiFunction andThen(Function function0) {
        switch(this.a) {
            case 0: {
                return BiFunction.-CC.$default$andThen(this, function0);
            }
            case 1: {
                return BiFunction.-CC.$default$andThen(this, function0);
            }
            default: {
                return BiFunction.-CC.$default$andThen(this, function0);
            }
        }
    }

    @Override
    public final Object apply(Object object0, Object object1) {
        switch(this.a) {
            case 0: {
                this.b.accept(object0, object1);
                return object0;
            }
            case 1: {
                this.b.accept(object0, object1);
                return object0;
            }
            default: {
                this.b.accept(object0, object1);
                return object0;
            }
        }
    }
}

