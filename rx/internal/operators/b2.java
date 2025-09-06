package rx.internal.operators;

import rx.functions.p;

public class b2 implements p {
    final Class a;

    public b2(Class class0) {
        this.a = class0;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a.cast(object0);
    }
}

