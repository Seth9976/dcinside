package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import o3.h;
import org.bson.types.Decimal128;

final class u extends f0 {
    u(a a0, OsList osList0, Class class0) {
        super(a0, osList0, class0);
    }

    @Override  // io.realm.f0
    public void c(Object object0) {
        this.b.d(((Decimal128)object0));
    }

    @Override  // io.realm.f0
    protected void e(@h Object object0) {
        if(object0 == null) {
            return;
        }
        if(!(object0 instanceof Decimal128)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "org.bson.types.Decimal128", object0.getClass().getName()));
        }
    }

    @Override  // io.realm.f0
    public boolean i() {
        return false;
    }

    @Override  // io.realm.f0
    @h
    public Object j(int v) {
        return this.x(v);
    }

    @Override  // io.realm.f0
    public void n(int v, Object object0) {
        this.b.D(((long)v), ((Decimal128)object0));
    }

    @Override  // io.realm.f0
    protected void v(int v, Object object0) {
        this.b.X(((long)v), ((Decimal128)object0));
    }

    @h
    public Decimal128 x(int v) {
        return (Decimal128)this.b.z(((long)v));
    }
}

