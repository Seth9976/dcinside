package androidx.lifecycle.viewmodel;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class ViewModelInitializer {
    @l
    private final Class a;
    @l
    private final Function1 b;

    public ViewModelInitializer(@l Class class0, @l Function1 function10) {
        L.p(class0, "clazz");
        L.p(function10, "initializer");
        super();
        this.a = class0;
        this.b = function10;
    }

    @l
    public final Class a() {
        return this.a;
    }

    @l
    public final Function1 b() {
        return this.b;
    }
}

