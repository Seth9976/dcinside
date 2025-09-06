package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import y4.m;
import z3.f;

public final class k extends WeakReference {
    @f
    public final int a;

    public k(Object object0, @m ReferenceQueue referenceQueue0) {
        super(object0, referenceQueue0);
        this.a = object0 == null ? 0 : object0.hashCode();
    }
}

