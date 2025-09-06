package androidx.compose.runtime;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class StaticValueHolder implements State {
    private final Object a;

    public StaticValueHolder(Object object0) {
        this.a = object0;
    }

    @l
    public final StaticValueHolder b(Object object0) {
        return new StaticValueHolder(object0);
    }

    public static StaticValueHolder d(StaticValueHolder staticValueHolder0, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            object0 = staticValueHolder0.getValue();
        }
        return staticValueHolder0.b(object0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof StaticValueHolder ? L.g(this.getValue(), ((StaticValueHolder)object0).getValue()) : false;
    }

    @Override  // androidx.compose.runtime.State
    public Object getValue() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.getValue() == null ? 0 : this.getValue().hashCode();
    }

    public final Object l() {
        return this.getValue();
    }

    @Override
    @l
    public String toString() {
        return "StaticValueHolder(value=" + this.getValue() + ')';
    }
}

