package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.t.a;
import com.fasterxml.jackson.databind.type.b;
import com.fasterxml.jackson.databind.type.d;
import com.fasterxml.jackson.databind.type.i;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class e extends a implements Serializable {
    protected HashMap a;
    protected HashMap b;
    protected boolean c;
    private static final long d = 3L;

    public e() {
        this.a = null;
        this.b = null;
        this.c = false;
    }

    public e(List list0) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.l(list0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.t$a
    public r b(G g0, m m0, c c0) {
        Class class0 = m0.g();
        b b0 = new b(class0);
        if(class0.isInterface()) {
            HashMap hashMap0 = this.b;
            if(hashMap0 != null) {
                r r0 = (r)hashMap0.get(b0);
                if(r0 != null) {
                    return r0;
                }
            }
        }
        else {
            HashMap hashMap1 = this.a;
            if(hashMap1 != null) {
                r r1 = (r)hashMap1.get(b0);
                if(r1 != null) {
                    return r1;
                }
                if(this.c && m0.p()) {
                    b0.b(Enum.class);
                    r r2 = (r)this.a.get(b0);
                    if(r2 != null) {
                        return r2;
                    }
                }
                for(Class class1 = class0; class1 != null; class1 = class1.getSuperclass()) {
                    b0.b(class1);
                    r r3 = (r)this.a.get(b0);
                    if(r3 != null) {
                        return r3;
                    }
                }
            }
        }
        if(this.b != null) {
            r r4 = this.i(class0, b0);
            if(r4 != null) {
                return r4;
            }
            if(!class0.isInterface()) {
                while(true) {
                    class0 = class0.getSuperclass();
                    if(class0 == null) {
                        break;
                    }
                    r r5 = this.i(class0, b0);
                    if(r5 != null) {
                        return r5;
                    }
                }
            }
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.ser.t$a
    public r c(G g0, d d0, c c0, j j0, r r0) {
        return this.b(g0, d0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.t$a
    public r d(G g0, i i0, c c0, r r0, j j0, r r1) {
        return this.b(g0, i0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.t$a
    public r e(G g0, com.fasterxml.jackson.databind.type.j j0, c c0, r r0, j j1, r r1) {
        return this.b(g0, j0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.t$a
    public r f(G g0, com.fasterxml.jackson.databind.type.a a0, c c0, j j0, r r0) {
        return this.b(g0, a0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.t$a
    public r g(G g0, com.fasterxml.jackson.databind.type.e e0, c c0, j j0, r r0) {
        return this.b(g0, e0, c0);
    }

    protected void h(Class class0, r r0) {
        b b0 = new b(class0);
        if(class0.isInterface()) {
            if(this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(b0, r0);
            return;
        }
        if(this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(b0, r0);
        if(class0 == Enum.class) {
            this.c = true;
        }
    }

    protected r i(Class class0, b b0) {
        Class[] arr_class = class0.getInterfaces();
        for(int v = 0; v < arr_class.length; ++v) {
            Class class1 = arr_class[v];
            b0.b(class1);
            r r0 = (r)this.b.get(b0);
            if(r0 != null) {
                return r0;
            }
            r r1 = this.i(class1, b0);
            if(r1 != null) {
                return r1;
            }
        }
        return null;
    }

    public void j(r r0) {
        Class class0 = r0.g();
        if(class0 == null || class0 == Object.class) {
            throw new IllegalArgumentException("JsonSerializer of type " + r0.getClass().getName() + " does not define valid handledType() -- must either register with method that takes type argument  or make serializer extend \'com.fasterxml.jackson.databind.ser.std.StdSerializer\'");
        }
        this.h(class0, r0);
    }

    public void k(Class class0, r r0) {
        this.h(class0, r0);
    }

    public void l(List list0) {
        for(Object object0: list0) {
            this.j(((r)object0));
        }
    }
}

