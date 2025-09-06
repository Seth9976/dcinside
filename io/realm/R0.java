package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import o3.h;
import org.bson.types.ObjectId;

final class r0 extends f0 {
    r0(a a0, OsList osList0, Class class0) {
        super(a0, osList0, class0);
    }

    @Override  // io.realm.f0
    public void c(Object object0) {
        this.b.k(((ObjectId)object0));
    }

    @Override  // io.realm.f0
    protected void e(@h Object object0) {
        if(object0 == null) {
            return;
        }
        if(!(object0 instanceof ObjectId)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "org.bson.types.ObjectId", object0.getClass().getName()));
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
        this.b.I(((long)v), ((ObjectId)object0));
    }

    @Override  // io.realm.f0
    protected void v(int v, Object object0) {
        this.b.c0(((long)v), ((ObjectId)object0));
    }

    @h
    public ObjectId x(int v) {
        return (ObjectId)this.b.z(((long)v));
    }
}

