package androidx.lifecycle;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.v;
import y4.l;
import y4.m;

final class Transformations.sam.androidx_lifecycle_Observer.0 implements Observer, D {
    private final Function1 a;

    Transformations.sam.androidx_lifecycle_Observer.0(Function1 function10) {
        L.p(function10, "function");
        super();
        this.a = function10;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@m Object object0) {
        return !(object0 instanceof Observer) || !(object0 instanceof D) ? false : L.g(this.getFunctionDelegate(), ((D)object0).getFunctionDelegate());
    }

    @Override  // kotlin.jvm.internal.D
    @l
    public final v getFunctionDelegate() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.getFunctionDelegate().hashCode();
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        this.a.invoke(object0);
    }
}

