package rx.internal.util;

import java.util.Arrays;
import rx.functions.b;
import rx.internal.util.unsafe.p;

public final class k {
    final float a;
    int b;
    int c;
    int d;
    Object[] e;
    private static final int f = -1640531527;

    public k() {
        this(16, 0.75f);
    }

    public k(int v) {
        this(v, 0.75f);
    }

    public k(int v, float f) {
        this.a = f;
        int v1 = p.b(v);
        this.b = v1 - 1;
        this.d = (int)(f * ((float)v1));
        this.e = new Object[v1];
    }

    public boolean a(Object object0) {
        Object[] arr_object = this.e;
        int v = this.b;
        int v1 = k.d(object0.hashCode()) & v;
        Object object1 = arr_object[v1];
        if(object1 != null) {
            if(object1.equals(object0)) {
                return false;
            }
            while(true) {
                v1 = v1 + 1 & v;
                Object object2 = arr_object[v1];
                if(object2 == null) {
                    break;
                }
                if(object2.equals(object0)) {
                    return false;
                }
            }
        }
        arr_object[v1] = object0;
        int v2 = this.c + 1;
        this.c = v2;
        if(v2 >= this.d) {
            this.e();
        }
        return true;
    }

    public void b(b b0) {
        if(this.c == 0) {
            return;
        }
        Object[] arr_object = this.e;
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(object0 != null) {
                b0.b(object0);
            }
        }
        Arrays.fill(arr_object, null);
        this.c = 0;
    }

    public boolean c() {
        return this.c == 0;
    }

    static int d(int v) {
        return v * -1640531527 ^ v * -1640531527 >>> 16;
    }

    void e() {
        Object object0;
        Object[] arr_object = this.e;
        int v = arr_object.length;
        int v1 = v << 1;
        Object[] arr_object1 = new Object[v1];
        for(int v2 = this.c; v2 != 0; --v2) {
            do {
                --v;
                object0 = arr_object[v];
            }
            while(object0 == null);
            int v3 = k.d(object0.hashCode()) & v1 - 1;
            if(arr_object1[v3] != null) {
                while(true) {
                    v3 = v3 + 1 & v1 - 1;
                    if(arr_object1[v3] == null) {
                        break;
                    }
                }
            }
            arr_object1[v3] = arr_object[v];
        }
        this.b = v1 - 1;
        this.d = (int)(((float)v1) * this.a);
        this.e = arr_object1;
    }

    public boolean f(Object object0) {
        Object[] arr_object = this.e;
        int v = this.b;
        int v1 = k.d(object0.hashCode()) & v;
        Object object1 = arr_object[v1];
        if(object1 == null) {
            return false;
        }
        if(object1.equals(object0)) {
            return this.g(v1, arr_object, v);
        }
        do {
            v1 = v1 + 1 & v;
            Object object2 = arr_object[v1];
            if(object2 == null) {
                return false;
            }
        }
        while(!object2.equals(object0));
        return this.g(v1, arr_object, v);
    }

    boolean g(int v, Object[] arr_object, int v1) {
        --this.c;
        while(true) {
            int v2 = v + 1;
        label_2:
            int v3 = v2 & v1;
            Object object0 = arr_object[v3];
            if(object0 == null) {
                break;
            }
            int v4 = k.d(object0.hashCode()) & v1;
            if(v <= v3) {
                if(v < v4 && v4 <= v3) {
                    v2 = v3 + 1;
                    goto label_2;
                }
                else {
                    arr_object[v] = object0;
                    v = v3;
                    continue;
                }
                goto label_9;
            }
            else {
            label_9:
                if(v >= v4 && v4 > v3) {
                    arr_object[v] = object0;
                    v = v3;
                    continue;
                }
                v2 = v3 + 1;
                goto label_2;
            }
            arr_object[v] = object0;
            v = v3;
        }
        arr_object[v] = null;
        return true;
    }

    public void h() {
        this.c = 0;
        this.e = new Object[0];
    }

    public Object[] i() {
        return this.e;
    }
}

