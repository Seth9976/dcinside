package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import o3.h;

final class c0 extends f0 {
    c0(a a0, OsList osList0, Class class0) {
        super(a0, osList0, class0);
    }

    @Override  // io.realm.f0
    public void c(Object object0) {
        this.b.i(((Number)object0).longValue());
    }

    @Override  // io.realm.f0
    protected void e(@h Object object0) {
        if(object0 == null) {
            return;
        }
        if(!(object0 instanceof Number)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Long, java.lang.Integer, java.lang.Short, java.lang.Byte", object0.getClass().getName()));
        }
    }

    @Override  // io.realm.f0
    public boolean i() {
        return false;
    }

    @Override  // io.realm.f0
    @h
    public Object j(int v) {
        Long long0 = (Long)this.b.z(((long)v));
        if(long0 == null) {
            return null;
        }
        Class class0 = this.c;
        if(class0 == Long.class) {
            return long0;
        }
        if(class0 == Integer.class) {
            return class0.cast(long0.intValue());
        }
        if(class0 == Short.class) {
            return class0.cast(long0.shortValue());
        }
        if(class0 != Byte.class) {
            throw new IllegalStateException("Unexpected element type: " + this.c.getName());
        }
        return class0.cast(long0.byteValue());
    }

    @Override  // io.realm.f0
    public void n(int v, Object object0) {
        this.b.G(((long)v), ((Number)object0).longValue());
    }

    @Override  // io.realm.f0
    protected void v(int v, Object object0) {
        this.b.a0(((long)v), ((Number)object0).longValue());
    }
}

