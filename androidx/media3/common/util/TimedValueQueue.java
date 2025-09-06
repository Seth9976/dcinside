package androidx.media3.common.util;

import androidx.annotation.Nullable;
import java.util.Arrays;

@UnstableApi
public final class TimedValueQueue {
    private long[] a;
    private Object[] b;
    private int c;
    private int d;
    private static final int e = 10;

    public TimedValueQueue() {
        this(10);
    }

    public TimedValueQueue(int v) {
        this.a = new long[v];
        this.b = TimedValueQueue.f(v);
    }

    public void a(long v, Object object0) {
        synchronized(this) {
            this.d(v);
            this.e();
            this.b(v, object0);
        }
    }

    private void b(long v, Object object0) {
        int v1 = this.d;
        Object[] arr_object = this.b;
        int v2 = (this.c + v1) % arr_object.length;
        this.a[v2] = v;
        arr_object[v2] = object0;
        this.d = v1 + 1;
    }

    public void c() {
        synchronized(this) {
            this.c = 0;
            this.d = 0;
            Arrays.fill(this.b, null);
        }
    }

    private void d(long v) {
        if(this.d > 0 && v <= this.a[(this.c + this.d - 1) % this.b.length]) {
            this.c();
        }
    }

    private void e() {
        int v = this.b.length;
        if(this.d < v) {
            return;
        }
        long[] arr_v = new long[v * 2];
        Object[] arr_object = TimedValueQueue.f(v * 2);
        int v1 = v - this.c;
        System.arraycopy(this.a, this.c, arr_v, 0, v1);
        System.arraycopy(this.b, this.c, arr_object, 0, v1);
        int v2 = this.c;
        if(v2 > 0) {
            System.arraycopy(this.a, 0, arr_v, v1, v2);
            System.arraycopy(this.b, 0, arr_object, v1, this.c);
        }
        this.a = arr_v;
        this.b = arr_object;
        this.c = 0;
    }

    private static Object[] f(int v) {
        return new Object[v];
    }

    @Nullable
    public Object g(long v) {
        synchronized(this) {
            return this.h(v, false);
        }
    }

    @Nullable
    private Object h(long v, boolean z) {
        Object object0 = null;
        for(long v1 = 0x7FFFFFFFFFFFFFFFL; this.d > 0; v1 = v2) {
            long v2 = v - this.a[this.c];
            if(v2 < 0L && (z || -v2 >= v1)) {
                break;
            }
            object0 = this.k();
        }
        return object0;
    }

    @Nullable
    public Object i() {
        synchronized(this) {
            return this.d == 0 ? null : this.k();
        }
    }

    @Nullable
    public Object j(long v) {
        synchronized(this) {
            return this.h(v, true);
        }
    }

    @Nullable
    private Object k() {
        Assertions.i(this.d > 0);
        Object[] arr_object = this.b;
        int v = this.c;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        this.c = (v + 1) % arr_object.length;
        --this.d;
        return object0;
    }

    public int l() {
        synchronized(this) {
        }
        return this.d;
    }
}

