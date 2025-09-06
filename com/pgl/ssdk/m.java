package com.pgl.ssdk;

public final class m {
    private final Object a;
    private final Object b;

    public m(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
    }

    public static m a(Object object0, Object object1) {
        return new m(object0, object1);
    }

    public Object a() {
        return this.a;
    }

    public Object b() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        Class class0 = object0.getClass();
        if(m.class != class0) {
            return false;
        }
        Object object1 = this.a;
        if(object1 == null) {
            if(((m)object0).a != null) {
                return false;
            }
        }
        else if(!object1.equals(((m)object0).a)) {
            return false;
        }
        return this.b == null ? ((m)object0).b == null : this.b.equals(((m)object0).b);
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Object object0 = this.b;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return (v1 + 0x1F) * 0x1F + v;
    }
}

