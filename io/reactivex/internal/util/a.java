package io.reactivex.internal.util;

import e3.r;
import io.reactivex.I;
import org.reactivestreams.d;

public class a {
    public interface io.reactivex.internal.util.a.a extends r {
        @Override  // e3.r
        boolean test(Object arg1);
    }

    final int a;
    final Object[] b;
    Object[] c;
    int d;

    public a(int v) {
        this.a = v;
        Object[] arr_object = new Object[v + 1];
        this.b = arr_object;
        this.c = arr_object;
    }

    public boolean a(I i0) {
        Object[] arr_object = this.b;
        int v = this.a;
        while(true) {
            if(arr_object == null) {
                break;
            }
            for(int v1 = 0; v1 < v; ++v1) {
                Object object0 = arr_object[v1];
                if(object0 == null) {
                    break;
                }
                if(q.c(object0, i0)) {
                    return true;
                }
            }
            arr_object = (Object[])arr_object[v];
        }
        return false;
    }

    public boolean b(d d0) {
        Object[] arr_object = this.b;
        int v = this.a;
        while(true) {
            if(arr_object == null) {
                break;
            }
            for(int v1 = 0; v1 < v; ++v1) {
                Object object0 = arr_object[v1];
                if(object0 == null) {
                    break;
                }
                if(q.d(object0, d0)) {
                    return true;
                }
            }
            arr_object = (Object[])arr_object[v];
        }
        return false;
    }

    public void c(Object object0) {
        int v = this.a;
        int v1 = this.d;
        if(v1 == v) {
            Object[] arr_object = new Object[v + 1];
            this.c[v] = arr_object;
            this.c = arr_object;
            v1 = 0;
        }
        this.c[v1] = object0;
        this.d = v1 + 1;
    }

    public void d(io.reactivex.internal.util.a.a a$a0) {
        Object[] arr_object = this.b;
        int v = this.a;
        while(arr_object != null) {
            for(int v1 = 0; v1 < v; ++v1) {
                Object object0 = arr_object[v1];
                if(object0 == null) {
                    break;
                }
                if(a$a0.test(object0)) {
                    return;
                }
            }
            arr_object = (Object[])arr_object[v];
        }
    }

    public void e(Object object0, e3.d d0) throws Exception {
        int v1;
        Object[] arr_object = this.b;
        int v = this.a;
        while(true) {
            v1 = 0;
        label_3:
            if(v1 < v) {
                break;
            }
            arr_object = (Object[])arr_object[v];
        }
        Object object1 = arr_object[v1];
        if(object1 == null) {
            return;
        }
        if(!d0.a(object0, object1)) {
            ++v1;
            goto label_3;
        }
    }

    public void f(Object object0) {
        this.b[0] = object0;
    }
}

