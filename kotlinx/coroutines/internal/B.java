package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.E0;
import y4.l;
import y4.m;

@s0({"SMAP\nAtomic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Atomic.kt\nkotlinx/coroutines/internal/AtomicOp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
@E0
public abstract class b extends M {
    private volatile Object _consensus$volatile;
    private static final AtomicReferenceFieldUpdater a;

    static {
        b.a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    }

    public b() {
        this._consensus$volatile = a.a;
    }

    @Override  // kotlinx.coroutines.internal.M
    @l
    public b a() {
        return this;
    }

    @Override  // kotlinx.coroutines.internal.M
    @m
    public final Object b(@m Object object0) {
        Object object1 = b.a.get(this);
        if(object1 == a.a) {
            object1 = this.d(this.g(object0));
        }
        this.c(object0, object1);
        return object1;
    }

    public abstract void c(Object arg1, @m Object arg2);

    private final Object d(Object object0) {
        Object object1 = b.a.get(this);
        Object object2 = a.a;
        if(object1 != object2) {
            return object1;
        }
        return androidx.concurrent.futures.a.a(b.a, this, object2, object0) ? object0 : b.a.get(this);
    }

    private final Object e() {
        return this._consensus$volatile;
    }

    @m
    public abstract Object g(Object arg1);

    private final void h(Object object0) {
        this._consensus$volatile = object0;
    }
}

