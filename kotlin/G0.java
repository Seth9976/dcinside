package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

final class g0 implements Serializable, D {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private volatile A3.a a;
    @m
    private volatile Object b;
    @l
    private final Object c;
    @l
    public static final a d;
    private static final AtomicReferenceFieldUpdater e;

    static {
        g0.d = new a(null);
        g0.e = AtomicReferenceFieldUpdater.newUpdater(g0.class, Object.class, "b");
    }

    public g0(@l A3.a a0) {
        L.p(a0, "initializer");
        super();
        this.a = a0;
        this.b = L0.a;
        this.c = L0.a;
    }

    private final Object a() {
        return new x(this.getValue());
    }

    @Override  // kotlin.D
    public Object getValue() {
        Object object0 = this.b;
        L0 l00 = L0.a;
        if(object0 != l00) {
            return object0;
        }
        A3.a a0 = this.a;
        if(a0 != null) {
            Object object1 = a0.invoke();
            if(androidx.concurrent.futures.a.a(g0.e, this, l00, object1)) {
                this.a = null;
                return object1;
            }
        }
        return this.b;
    }

    @Override  // kotlin.D
    public boolean isInitialized() {
        return this.b != L0.a;
    }

    // 去混淆评级： 低(20)
    @Override
    @l
    public String toString() {
        return this.isInitialized() ? String.valueOf(this.getValue()) : "Lazy value not initialized yet.";
    }
}

