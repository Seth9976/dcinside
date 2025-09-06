package kotlin.jvm.internal;

import kotlin.h0;
import kotlin.reflect.c;
import kotlin.reflect.o;

public abstract class k0 extends q implements o {
    private final boolean syntheticJavaProperty;

    public k0() {
        this.syntheticJavaProperty = false;
    }

    @h0(version = "1.1")
    public k0(Object object0) {
        super(object0);
        this.syntheticJavaProperty = false;
    }

    @h0(version = "1.4")
    public k0(Object object0, Class class0, String s, String s1, int v) {
        boolean z = false;
        super(object0, class0, s, s1, (v & 1) == 1);
        if((v & 2) == 2) {
            z = true;
        }
        this.syntheticJavaProperty = z;
    }

    @Override  // kotlin.jvm.internal.q
    public c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof k0) {
            return this.getOwner().equals(((k0)object0).getOwner()) && this.getName().equals(((k0)object0).getName()) && this.getSignature().equals(((k0)object0).getSignature()) && L.g(this.getBoundReceiver(), ((k0)object0).getBoundReceiver());
        }
        return object0 instanceof o ? object0.equals(this.compute()) : false;
    }

    @Override  // kotlin.jvm.internal.q
    @h0(version = "1.1")
    protected c getReflected() {
        return this.getReflected();
    }

    @h0(version = "1.1")
    protected o getReflected() {
        if(this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (o)super.getReflected();
    }

    @Override
    public int hashCode() {
        return (this.getOwner().hashCode() * 0x1F + this.getName().hashCode()) * 0x1F + this.getSignature().hashCode();
    }

    @Override  // kotlin.reflect.o
    @h0(version = "1.1")
    public boolean isConst() {
        return this.getReflected().isConst();
    }

    @Override  // kotlin.reflect.o
    @h0(version = "1.1")
    public boolean isLateinit() {
        return this.getReflected().isLateinit();
    }

    @Override
    public String toString() {
        c c0 = this.compute();
        return c0 == this ? "property " + this.getName() + " (Kotlin reflection is not available)" : c0.toString();
    }
}

