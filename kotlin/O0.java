package kotlin;

import A3.a;
import java.io.Serializable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

final class o0 implements Serializable, D {
    @m
    private a a;
    @m
    private volatile Object b;
    @l
    private final Object c;

    public o0(@l a a0, @m Object object0) {
        L.p(a0, "initializer");
        super();
        this.a = a0;
        this.b = L0.a;
        if(object0 == null) {
            object0 = this;
        }
        this.c = object0;
    }

    public o0(a a0, Object object0, int v, w w0) {
        if((v & 2) != 0) {
            object0 = null;
        }
        this(a0, object0);
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
        synchronized(this.c) {
            Object object2 = this.b;
            if(object2 == l00) {
                a a0 = this.a;
                L.m(a0);
                object2 = a0.invoke();
                this.b = object2;
                this.a = null;
            }
            return object2;
        }
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

