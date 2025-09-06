package androidx.work.impl;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class b implements Callable {
    public final Processor a;
    public final ArrayList b;
    public final String c;

    public b(Processor processor0, ArrayList arrayList0, String s) {
        this.a = processor0;
        this.b = arrayList0;
        this.c = s;
    }

    @Override
    public final Object call() {
        return this.a.n(this.b, this.c);
    }
}

