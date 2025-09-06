package j$.util.function;

import java.util.function.Function;

public final class d implements Function {
    public final int a;
    public final Function b;
    public final Function c;

    public d(Function function0, Function function1, int v) {
        this.a = v;
        this.b = function0;
        this.c = function1;
        super();
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        if(this.a != 0) {
            Object object1 = this.c.apply(object0);
            return this.b.apply(object1);
        }
        Object object2 = this.b.apply(object0);
        return this.c.apply(object2);
    }

    @Override
    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

