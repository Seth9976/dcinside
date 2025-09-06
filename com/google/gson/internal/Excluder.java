package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.e;
import com.google.gson.b;
import com.google.gson.reflect.a;
import com.google.gson.stream.d;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Excluder implements y, Cloneable {
    private double a;
    private int b;
    private boolean c;
    private boolean d;
    private List e;
    private List f;
    private static final double g = -1.0;
    public static final Excluder h;

    static {
        Excluder.h = new Excluder();
    }

    public Excluder() {
        this.a = -1.0;
        this.b = 0x88;
        this.c = true;
        this.e = Collections.emptyList();
        this.f = Collections.emptyList();
    }

    @Override  // com.google.gson.y
    public TypeAdapter a(Gson gson0, a a0) {
        Class class0 = a0.f();
        boolean z = this.e(class0);
        boolean z1 = z || this.f(class0, true);
        boolean z2 = z || this.f(class0, false);
        return !z1 && !z2 ? null : new TypeAdapter() {
            private TypeAdapter a;
            final Excluder f;

            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                if(z2) {
                    a0.Y1();
                    return null;
                }
                return this.j().e(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                if(z1) {
                    d0.v();
                    return;
                }
                this.j().i(d0, object0);
            }

            private TypeAdapter j() {
                TypeAdapter typeAdapter0 = this.a;
                if(typeAdapter0 == null) {
                    typeAdapter0 = gson0.v(Excluder.this, a0);
                    this.a = typeAdapter0;
                }
                return typeAdapter0;
            }
        };
    }

    protected Excluder b() {
        try {
            return (Excluder)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new AssertionError(cloneNotSupportedException0);
        }
    }

    public Excluder c() {
        Excluder excluder0 = this.b();
        excluder0.c = false;
        return excluder0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.b();
    }

    // 去混淆评级： 低(20)
    public boolean d(Class class0, boolean z) {
        return this.e(class0) || this.f(class0, z);
    }

    private boolean e(Class class0) {
        if(this.a != -1.0 && !this.o(((com.google.gson.annotations.d)class0.getAnnotation(com.google.gson.annotations.d.class)), ((e)class0.getAnnotation(e.class)))) {
            return true;
        }
        return this.c || !this.k(class0) ? this.j(class0) : true;
    }

    private boolean f(Class class0, boolean z) {
        for(Object object0: (z ? this.e : this.f)) {
            if(((com.google.gson.a)object0).a(class0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public boolean g(Field field0, boolean z) {
        if((this.b & field0.getModifiers()) != 0) {
            return true;
        }
        if(this.a != -1.0 && !this.o(((com.google.gson.annotations.d)field0.getAnnotation(com.google.gson.annotations.d.class)), ((e)field0.getAnnotation(e.class)))) {
            return true;
        }
        if(field0.isSynthetic()) {
            return true;
        }
        if(this.d) {
            com.google.gson.annotations.a a0 = (com.google.gson.annotations.a)field0.getAnnotation(com.google.gson.annotations.a.class);
            if(a0 == null) {
                return true;
            }
            if(z) {
                if(!a0.serialize()) {
                    return true;
                }
            }
            else if(!a0.deserialize()) {
                return true;
            }
        }
        if(!this.c && this.k(field0.getType())) {
            return true;
        }
        if(this.j(field0.getType())) {
            return true;
        }
        List list0 = z ? this.e : this.f;
        if(!list0.isEmpty()) {
            b b0 = new b(field0);
            for(Object object0: list0) {
                if(((com.google.gson.a)object0).b(b0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public Excluder h() {
        Excluder excluder0 = this.b();
        excluder0.d = true;
        return excluder0;
    }

    // 去混淆评级： 低(40)
    private boolean j(Class class0) {
        return !Enum.class.isAssignableFrom(class0) && !this.l(class0) && (class0.isAnonymousClass() || class0.isLocalClass());
    }

    // 去混淆评级： 低(20)
    private boolean k(Class class0) {
        return class0.isMemberClass() && !this.l(class0);
    }

    private boolean l(Class class0) {
        return (class0.getModifiers() & 8) != 0;
    }

    private boolean m(com.google.gson.annotations.d d0) {
        if(d0 != null) {
            double f = d0.value();
            return this.a >= f;
        }
        return true;
    }

    private boolean n(e e0) {
        if(e0 != null) {
            double f = e0.value();
            return this.a < f;
        }
        return true;
    }

    // 去混淆评级： 低(20)
    private boolean o(com.google.gson.annotations.d d0, e e0) {
        return this.m(d0) && this.n(e0);
    }

    public Excluder p(com.google.gson.a a0, boolean z, boolean z1) {
        Excluder excluder0 = this.b();
        if(z) {
            ArrayList arrayList0 = new ArrayList(this.e);
            excluder0.e = arrayList0;
            arrayList0.add(a0);
        }
        if(z1) {
            ArrayList arrayList1 = new ArrayList(this.f);
            excluder0.f = arrayList1;
            arrayList1.add(a0);
        }
        return excluder0;
    }

    public Excluder q(int[] arr_v) {
        Excluder excluder0 = this.b();
        excluder0.b = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            excluder0.b |= arr_v[v];
        }
        return excluder0;
    }

    public Excluder r(double f) {
        Excluder excluder0 = this.b();
        excluder0.a = f;
        return excluder0;
    }
}

