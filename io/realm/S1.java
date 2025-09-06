package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import o3.h;

final class s1 extends f0 {
    s1(a a0, OsList osList0, Class class0) {
        super(a0, osList0, class0);
    }

    @Override  // io.realm.f0
    public void c(Object object0) {
        this.b.n(((String)object0));
    }

    @Override  // io.realm.f0
    protected void e(@h Object object0) {
        if(object0 == null) {
            return;
        }
        if(!(object0 instanceof String)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.String", object0.getClass().getName()));
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
        this.b.L(((long)v), ((String)object0));
    }

    @Override  // io.realm.f0
    protected void v(int v, Object object0) {
        this.b.f0(((long)v), ((String)object0));
    }

    @h
    public String x(int v) {
        return (String)this.b.z(((long)v));
    }
}

