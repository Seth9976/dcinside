package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.h0;
import kotlin.reflect.h;

@h0(version = "1.4")
public class a implements Serializable, E {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public a(int v, Class class0, String s, String s1, int v1) {
        this(v, q.NO_RECEIVER, class0, s, s1, v1);
    }

    public a(int v, Object object0, Class class0, String s, String s1, int v1) {
        this.receiver = object0;
        this.owner = class0;
        this.name = s;
        this.signature = s1;
        this.isTopLevel = (v1 & 1) == 1;
        this.arity = v;
        this.flags = v1 >> 1;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a ? this.isTopLevel == ((a)object0).isTopLevel && this.arity == ((a)object0).arity && this.flags == ((a)object0).flags && L.g(this.receiver, ((a)object0).receiver) && L.g(this.owner, ((a)object0).owner) && this.name.equals(((a)object0).name) && this.signature.equals(((a)object0).signature) : false;
    }

    @Override  // kotlin.jvm.internal.E
    public int getArity() {
        return this.arity;
    }

    public h getOwner() {
        Class class0 = this.owner;
        if(class0 == null) {
            return null;
        }
        return this.isTopLevel ? m0.g(class0) : m0.d(class0);
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.receiver == null ? 0 : this.receiver.hashCode();
        Class class0 = this.owner;
        if(class0 != null) {
            v = class0.hashCode();
        }
        int v2 = this.name.hashCode();
        int v3 = this.signature.hashCode();
        return this.isTopLevel ? (((((v1 * 0x1F + v) * 0x1F + v2) * 0x1F + v3) * 0x1F + 0x4CF) * 0x1F + this.arity) * 0x1F + this.flags : (((((v1 * 0x1F + v) * 0x1F + v2) * 0x1F + v3) * 0x1F + 0x4D5) * 0x1F + this.arity) * 0x1F + this.flags;
    }

    @Override
    public String toString() {
        return m0.w(this);
    }
}

