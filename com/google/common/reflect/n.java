package com.google.common.reflect;

import com.google.common.base.H;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import o3.a;

@d
public abstract class n extends m {
    final TypeVariable a;

    protected n() {
        Type type0 = this.a();
        H.u(type0 instanceof TypeVariable, "%s should be a type variable.", type0);
        this.a = (TypeVariable)type0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@a Object object0) {
        return object0 instanceof n ? this.a.equals(((n)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

