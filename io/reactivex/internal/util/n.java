package io.reactivex.internal.util;

import java.util.ArrayList;

public class n {
    final int a;
    Object[] b;
    Object[] c;
    volatile int d;
    int e;

    public n(int v) {
        this.a = v;
    }

    public void a(Object object0) {
        if(this.d == 0) {
            Object[] arr_object = new Object[this.a + 1];
            this.b = arr_object;
            this.c = arr_object;
            arr_object[0] = object0;
            this.e = 1;
            this.d = 1;
            return;
        }
        int v = this.e;
        int v1 = this.a;
        if(v == v1) {
            Object[] arr_object1 = new Object[v1 + 1];
            arr_object1[0] = object0;
            this.c[v1] = arr_object1;
            this.c = arr_object1;
            this.e = 1;
            ++this.d;
            return;
        }
        this.c[v] = object0;
        this.e = v + 1;
        ++this.d;
    }

    public Object[] b() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    @Override
    public String toString() {
        int v = this.a;
        int v1 = this.d;
        ArrayList arrayList0 = new ArrayList(v1 + 1);
        Object[] arr_object = this.b();
        int v2 = 0;
    alab1:
        while(true) {
            for(int v3 = 0; true; ++v3) {
                if(v2 >= v1) {
                    break alab1;
                }
                arrayList0.add(arr_object[v3]);
                ++v2;
                if(v3 + 1 == v) {
                    arr_object = (Object[])arr_object[v];
                    break;
                }
            }
        }
        return arrayList0.toString();
    }
}

