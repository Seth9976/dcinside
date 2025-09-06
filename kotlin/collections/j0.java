package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n204#1:208\n204#1:209\n204#1:210\n1#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:208\n175#1:209\n188#1:210\n*E\n"})
final class j0 extends c implements RandomAccess {
    @l
    private final Object[] c;
    private final int d;
    private int e;
    private int f;

    public j0(int v) {
        this(new Object[v], 0);
    }

    public j0(@l Object[] arr_object, int v) {
        L.p(arr_object, "buffer");
        super();
        this.c = arr_object;
        if(v < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + v).toString());
        }
        if(v > arr_object.length) {
            throw new IllegalArgumentException(("ring buffer filled size: " + v + " cannot be larger than the buffer size: " + arr_object.length).toString());
        }
        this.d = arr_object.length;
        this.f = v;
    }

    @Override  // kotlin.collections.c
    public int a() {
        return this.f;
    }

    public final void g(Object object0) {
        if(this.j()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.c[(this.e + this.size()) % this.d] = object0;
        this.f = this.size() + 1;
    }

    @Override  // kotlin.collections.c
    public Object get(int v) {
        c.a.b(v, this.size());
        return this.c[(this.e + v) % this.d];
    }

    @l
    public final j0 h(int v) {
        int v1 = s.B(this.d + (this.d >> 1) + 1, v);
        if(this.e == 0) {
            Object[] arr_object = Arrays.copyOf(this.c, v1);
            L.o(arr_object, "copyOf(...)");
            return new j0(arr_object, this.size());
        }
        return new j0(this.toArray(new Object[v1]), this.size());
    }

    private final int i(int v, int v1) {
        return (v + v1) % this.d;
    }

    @Override  // kotlin.collections.c
    @l
    public Iterator iterator() {
        @s0({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,206:1\n204#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:207\n*E\n"})
        public static final class a extends b {
            private int c;
            private int d;
            final j0 e;

            a(j0 j00) {
                this.e = j00;
                super();
                this.c = j00.size();
                this.d = j00.e;
            }

            @Override  // kotlin.collections.b
            protected void a() {
                if(this.c == 0) {
                    this.b();
                    return;
                }
                this.c(this.e.c[this.d]);
                this.d = (this.d + 1) % this.e.d;
                --this.c;
            }
        }

        return new a(this);
    }

    public final boolean j() {
        return this.size() == this.d;
    }

    public final void k(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(("n shouldn\'t be negative but it is " + v).toString());
        }
        if(v > this.size()) {
            throw new IllegalArgumentException(("n shouldn\'t be greater than the buffer size: n = " + v + ", size = " + this.size()).toString());
        }
        if(v > 0) {
            int v1 = this.e;
            int v2 = (v1 + v) % this.d;
            if(v1 > v2) {
                kotlin.collections.l.M1(this.c, null, v1, this.d);
                kotlin.collections.l.M1(this.c, null, 0, v2);
            }
            else {
                kotlin.collections.l.M1(this.c, null, v1, v2);
            }
            this.e = v2;
            this.f = this.size() - v;
        }
    }

    @Override  // kotlin.collections.a
    @l
    public Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }

    @Override  // kotlin.collections.a
    @l
    public Object[] toArray(@l Object[] arr_object) {
        L.p(arr_object, "array");
        if(arr_object.length < this.size()) {
            arr_object = Arrays.copyOf(arr_object, this.size());
            L.o(arr_object, "copyOf(...)");
        }
        int v = this.size();
        int v1 = this.e;
        int v3 = 0;
        while(v3 < v && v1 < this.d) {
            arr_object[v3] = this.c[v1];
            ++v3;
            ++v1;
        }
        for(int v2 = 0; v3 < v; ++v2) {
            arr_object[v3] = this.c[v2];
            ++v3;
        }
        return u.n(v, arr_object);
    }
}

