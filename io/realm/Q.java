package io.realm;

import io.realm.internal.OsList;
import java.util.Date;
import java.util.Locale;
import o3.h;

final class q extends f0 {
    q(a a0, OsList osList0, Class class0) {
        super(a0, osList0, class0);
    }

    @Override  // io.realm.f0
    public void c(Object object0) {
        this.b.c(((Date)object0));
    }

    @Override  // io.realm.f0
    protected void e(@h Object object0) {
        if(object0 == null) {
            return;
        }
        if(!(object0 instanceof Date)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.util.Date", object0.getClass().getName()));
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
        this.b.C(((long)v), ((Date)object0));
    }

    @Override  // io.realm.f0
    protected void v(int v, Object object0) {
        this.b.W(((long)v), ((Date)object0));
    }

    @h
    public Date x(int v) {
        return (Date)this.b.z(((long)v));
    }
}

