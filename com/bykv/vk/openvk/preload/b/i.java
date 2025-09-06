package com.bykv.vk.openvk.preload.b;

import java.util.List;

final class i implements b {
    static final class a extends Exception {
        a(Throwable throwable0) {
            super(throwable0);
        }
    }

    protected e a;
    private int b;
    private List c;
    private d d;

    i(List list0, int v, e e0, d d0) {
        this.c = list0;
        this.b = v;
        this.a = e0;
        this.d = d0;
    }

    @Override  // com.bykv.vk.openvk.preload.b.b
    public final Object a(Class class0) {
        d d0 = this.c(class0);
        if(d0 == null) {
            throw new IllegalArgumentException("can not find pre Interceptor , class:" + class0);
        }
        return d0.b;
    }

    @Override  // com.bykv.vk.openvk.preload.b.b
    public final Object a(Object object0) throws Exception {
        Object object1;
        d d0 = this.d;
        if(d0 != null) {
            d0.c = object0;
            d0.e();
        }
        if(this.b >= this.c.size()) {
            return object0;
        }
        h h0 = (h)this.c.get(this.b);
        Class class0 = h0.a;
        d d1 = (d)this.a.a(class0);
        if(d1 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + object0 + " , class: " + class0);
        }
        i i0 = new i(this.c, this.b + 1, this.a, d1);
        d1.a(i0, this.d, object0, h0.a(), h0.b());
        d1.c();
        try {
            object1 = d1.a(i0, object0);
        }
        catch(a i$a0) {
            d1.c(i$a0.getCause());
            throw i$a0;
        }
        catch(Throwable throwable0) {
            d1.b(throwable0);
            throw new a(throwable0);
        }
        d1.d();
        return object1;
    }

    @Override  // com.bykv.vk.openvk.preload.b.b
    public final Object b(Class class0) {
        d d0 = this.c(class0);
        if(d0 == null) {
            throw new IllegalArgumentException("can not find pre Interceptor , class:" + class0);
        }
        return d0.c;
    }

    private d c(Class class0) {
        d d0;
        for(d0 = this.d; d0 != null && d0.getClass() != class0; d0 = d0.a) {
        }
        return d0;
    }
}

