package rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.h;
import rx.i;
import rx.j;
import rx.n;
import rx.o;

public final class d extends f {
    interface a {
        void a();

        void b(Object arg1);

        void c(Throwable arg1);

        Throwable d();

        boolean e();

        void f(b arg1);

        boolean isEmpty();

        Object last();

        int size();

        Object[] toArray(Object[] arg1);
    }

    static final class b extends AtomicInteger implements i, o {
        final n a;
        final AtomicLong b;
        final e c;
        int d;
        int e;
        Object f;
        private static final long g = -5006209596735204567L;

        public b(n n0, e d$e0) {
            this.a = n0;
            this.b = new AtomicLong();
            this.c = d$e0;
        }

        @Override  // rx.o
        public boolean j() {
            return this.a.j();
        }

        @Override  // rx.o
        public void l() {
            this.c.Q(this);
        }

        @Override  // rx.i
        public void request(long v) {
            int v1 = Long.compare(v, 0L);
            if(v1 > 0) {
                rx.internal.operators.a.b(this.b, v);
                this.c.a.f(this);
                return;
            }
            if(v1 < 0) {
                throw new IllegalArgumentException("n >= required but it was " + v);
            }
        }
    }

    static final class c implements a {
        static final class rx.subjects.d.c.a extends AtomicReference {
            final Object a;
            final long b;
            private static final long c = 0x33895503F3B7C21DL;

            public rx.subjects.d.c.a(Object object0, long v) {
                this.a = object0;
                this.b = v;
            }
        }

        final int a;
        final long b;
        final j c;
        volatile rx.subjects.d.c.a d;
        rx.subjects.d.c.a e;
        int f;
        volatile boolean g;
        Throwable h;

        public c(int v, long v1, j j0) {
            this.a = v;
            rx.subjects.d.c.a d$c$a0 = new rx.subjects.d.c.a(null, 0L);
            this.e = d$c$a0;
            this.d = d$c$a0;
            this.b = v1;
            this.c = j0;
        }

        @Override  // rx.subjects.d$a
        public void a() {
            this.g();
            this.g = true;
        }

        @Override  // rx.subjects.d$a
        public void b(Object object0) {
            rx.subjects.d.c.a d$c$a2;
            long v = this.c.b();
            rx.subjects.d.c.a d$c$a0 = new rx.subjects.d.c.a(object0, v);
            this.e.set(d$c$a0);
            this.e = d$c$a0;
            long v1 = v - this.b;
            int v2 = this.f;
            rx.subjects.d.c.a d$c$a1 = this.d;
            if(v2 == this.a) {
                d$c$a2 = (rx.subjects.d.c.a)d$c$a1.get();
            }
            else {
                ++v2;
                d$c$a2 = d$c$a1;
            }
            while(true) {
                rx.subjects.d.c.a d$c$a3 = (rx.subjects.d.c.a)d$c$a2.get();
                if(d$c$a3 == null || d$c$a3.b > v1) {
                    break;
                }
                --v2;
                d$c$a2 = d$c$a3;
            }
            this.f = v2;
            if(d$c$a2 != d$c$a1) {
                this.d = d$c$a2;
            }
        }

        @Override  // rx.subjects.d$a
        public void c(Throwable throwable0) {
            this.g();
            this.h = throwable0;
            this.g = true;
        }

        @Override  // rx.subjects.d$a
        public Throwable d() {
            return this.h;
        }

        @Override  // rx.subjects.d$a
        public boolean e() {
            return this.g;
        }

        @Override  // rx.subjects.d$a
        public void f(b d$b0) {
            boolean z;
            if(d$b0.getAndIncrement() != 0) {
                return;
            }
            n n0 = d$b0.a;
            int v = 1;
            do {
                long v1 = d$b0.b.get();
                rx.subjects.d.c.a d$c$a0 = (rx.subjects.d.c.a)d$b0.f;
                if(d$c$a0 == null) {
                    d$c$a0 = this.h();
                }
                long v2 = 0L;
                while(true) {
                    z = false;
                    int v3 = Long.compare(v2, v1);
                    if(v3 == 0) {
                        break;
                    }
                    if(n0.j()) {
                        d$b0.f = null;
                        return;
                    }
                    boolean z1 = this.g;
                    rx.subjects.d.c.a d$c$a1 = (rx.subjects.d.c.a)d$c$a0.get();
                    if(z1 && d$c$a1 == null) {
                        d$b0.f = null;
                        Throwable throwable0 = this.h;
                        if(throwable0 != null) {
                            n0.onError(throwable0);
                            return;
                        }
                        n0.d();
                        return;
                    }
                    if(d$c$a1 == null) {
                        break;
                    }
                    n0.onNext(d$c$a1.a);
                    ++v2;
                    d$c$a0 = d$c$a1;
                }
                if(v3 == 0) {
                    if(n0.j()) {
                        d$b0.f = null;
                        return;
                    }
                    boolean z2 = this.g;
                    if(d$c$a0.get() == null) {
                        z = true;
                    }
                    if(z2 && z) {
                        d$b0.f = null;
                        Throwable throwable1 = this.h;
                        if(throwable1 != null) {
                            n0.onError(throwable1);
                            return;
                        }
                        n0.d();
                        return;
                    }
                }
                if(v2 != 0L && v1 != 0x7FFFFFFFFFFFFFFFL) {
                    rx.internal.operators.a.i(d$b0.b, v2);
                }
                d$b0.f = d$c$a0;
                v = d$b0.addAndGet(-v);
            }
            while(v != 0);
        }

        void g() {
            long v = this.c.b() - this.b;
            rx.subjects.d.c.a d$c$a0 = this.d;
            rx.subjects.d.c.a d$c$a1;
            for(d$c$a1 = d$c$a0; true; d$c$a1 = d$c$a2) {
                rx.subjects.d.c.a d$c$a2 = (rx.subjects.d.c.a)d$c$a1.get();
                if(d$c$a2 == null || d$c$a2.b > v) {
                    break;
                }
            }
            if(d$c$a0 != d$c$a1) {
                this.d = d$c$a1;
            }
        }

        rx.subjects.d.c.a h() {
            long v = this.c.b() - this.b;
            rx.subjects.d.c.a d$c$a0;
            for(d$c$a0 = this.d; true; d$c$a0 = d$c$a1) {
                rx.subjects.d.c.a d$c$a1 = (rx.subjects.d.c.a)d$c$a0.get();
                if(d$c$a1 == null || d$c$a1.b > v) {
                    break;
                }
            }
            return d$c$a0;
        }

        @Override  // rx.subjects.d$a
        public boolean isEmpty() {
            return this.h().get() == null;
        }

        @Override  // rx.subjects.d$a
        public Object last() {
            rx.subjects.d.c.a d$c$a0 = this.h();
            rx.subjects.d.c.a d$c$a1;
            while((d$c$a1 = (rx.subjects.d.c.a)d$c$a0.get()) != null) {
                d$c$a0 = d$c$a1;
            }
            return d$c$a0.a;
        }

        @Override  // rx.subjects.d$a
        public int size() {
            rx.subjects.d.c.a d$c$a0 = (rx.subjects.d.c.a)this.h().get();
            int v;
            for(v = 0; d$c$a0 != null && v != 0x7FFFFFFF; ++v) {
                d$c$a0 = (rx.subjects.d.c.a)d$c$a0.get();
            }
            return v;
        }

        @Override  // rx.subjects.d$a
        public Object[] toArray(Object[] arr_object) {
            ArrayList arrayList0 = new ArrayList();
            for(rx.subjects.d.c.a d$c$a0 = (rx.subjects.d.c.a)this.h().get(); d$c$a0 != null; d$c$a0 = (rx.subjects.d.c.a)d$c$a0.get()) {
                arrayList0.add(d$c$a0.a);
            }
            return arrayList0.toArray(arr_object);
        }
    }

    static final class rx.subjects.d.d implements a {
        static final class rx.subjects.d.d.a extends AtomicReference {
            final Object a;
            private static final long b = 0x33895503F3B7C21DL;

            public rx.subjects.d.d.a(Object object0) {
                this.a = object0;
            }
        }

        final int a;
        volatile rx.subjects.d.d.a b;
        rx.subjects.d.d.a c;
        int d;
        volatile boolean e;
        Throwable f;

        public rx.subjects.d.d(int v) {
            this.a = v;
            rx.subjects.d.d.a d$d$a0 = new rx.subjects.d.d.a(null);
            this.c = d$d$a0;
            this.b = d$d$a0;
        }

        @Override  // rx.subjects.d$a
        public void a() {
            this.e = true;
        }

        @Override  // rx.subjects.d$a
        public void b(Object object0) {
            rx.subjects.d.d.a d$d$a0 = new rx.subjects.d.d.a(object0);
            this.c.set(d$d$a0);
            this.c = d$d$a0;
            int v = this.d;
            if(v == this.a) {
                this.b = (rx.subjects.d.d.a)this.b.get();
                return;
            }
            this.d = v + 1;
        }

        @Override  // rx.subjects.d$a
        public void c(Throwable throwable0) {
            this.f = throwable0;
            this.e = true;
        }

        @Override  // rx.subjects.d$a
        public Throwable d() {
            return this.f;
        }

        @Override  // rx.subjects.d$a
        public boolean e() {
            return this.e;
        }

        @Override  // rx.subjects.d$a
        public void f(b d$b0) {
            boolean z;
            if(d$b0.getAndIncrement() != 0) {
                return;
            }
            n n0 = d$b0.a;
            int v = 1;
            do {
                long v1 = d$b0.b.get();
                rx.subjects.d.d.a d$d$a0 = (rx.subjects.d.d.a)d$b0.f;
                if(d$d$a0 == null) {
                    d$d$a0 = this.b;
                }
                long v2 = 0L;
                while(true) {
                    z = false;
                    int v3 = Long.compare(v2, v1);
                    if(v3 == 0) {
                        break;
                    }
                    if(n0.j()) {
                        d$b0.f = null;
                        return;
                    }
                    boolean z1 = this.e;
                    rx.subjects.d.d.a d$d$a1 = (rx.subjects.d.d.a)d$d$a0.get();
                    if(z1 && d$d$a1 == null) {
                        d$b0.f = null;
                        Throwable throwable0 = this.f;
                        if(throwable0 != null) {
                            n0.onError(throwable0);
                            return;
                        }
                        n0.d();
                        return;
                    }
                    if(d$d$a1 == null) {
                        break;
                    }
                    n0.onNext(d$d$a1.a);
                    ++v2;
                    d$d$a0 = d$d$a1;
                }
                if(v3 == 0) {
                    if(n0.j()) {
                        d$b0.f = null;
                        return;
                    }
                    boolean z2 = this.e;
                    if(d$d$a0.get() == null) {
                        z = true;
                    }
                    if(z2 && z) {
                        d$b0.f = null;
                        Throwable throwable1 = this.f;
                        if(throwable1 != null) {
                            n0.onError(throwable1);
                            return;
                        }
                        n0.d();
                        return;
                    }
                }
                if(v2 != 0L && v1 != 0x7FFFFFFFFFFFFFFFL) {
                    rx.internal.operators.a.i(d$b0.b, v2);
                }
                d$b0.f = d$d$a0;
                v = d$b0.addAndGet(-v);
            }
            while(v != 0);
        }

        @Override  // rx.subjects.d$a
        public boolean isEmpty() {
            return this.b.get() == null;
        }

        @Override  // rx.subjects.d$a
        public Object last() {
            rx.subjects.d.d.a d$d$a0 = this.b;
            rx.subjects.d.d.a d$d$a1;
            while((d$d$a1 = (rx.subjects.d.d.a)d$d$a0.get()) != null) {
                d$d$a0 = d$d$a1;
            }
            return d$d$a0.a;
        }

        @Override  // rx.subjects.d$a
        public int size() {
            rx.subjects.d.d.a d$d$a0 = (rx.subjects.d.d.a)this.b.get();
            int v;
            for(v = 0; d$d$a0 != null && v != 0x7FFFFFFF; ++v) {
                d$d$a0 = (rx.subjects.d.d.a)d$d$a0.get();
            }
            return v;
        }

        @Override  // rx.subjects.d$a
        public Object[] toArray(Object[] arr_object) {
            ArrayList arrayList0 = new ArrayList();
            for(rx.subjects.d.d.a d$d$a0 = (rx.subjects.d.d.a)this.b.get(); d$d$a0 != null; d$d$a0 = (rx.subjects.d.d.a)d$d$a0.get()) {
                arrayList0.add(d$d$a0.a);
            }
            return arrayList0.toArray(arr_object);
        }
    }

    static final class e extends AtomicReference implements rx.g.a, h {
        final a a;
        private static final long b = 0x529B0A217109D450L;
        static final b[] c;
        static final b[] d;

        static {
            e.c = new b[0];
            e.d = new b[0];
        }

        public e(a d$a0) {
            this.a = d$a0;
            this.lazySet(e.c);
        }

        void Q(b d$b0) {
            b[] arr_d$b1;
            do {
                b[] arr_d$b = (b[])this.get();
                if(arr_d$b == e.d || arr_d$b == e.c) {
                    break;
                }
                int v = arr_d$b.length;
                int v1 = 0;
                while(true) {
                    if(v1 < v) {
                        if(arr_d$b[v1] == d$b0) {
                            break;
                        }
                        else {
                            ++v1;
                            continue;
                        }
                    }
                    v1 = -1;
                    break;
                }
                if(v1 < 0) {
                    return;
                }
                if(v == 1) {
                    arr_d$b1 = e.c;
                }
                else {
                    b[] arr_d$b2 = new b[v - 1];
                    System.arraycopy(arr_d$b, 0, arr_d$b2, 0, v1);
                    System.arraycopy(arr_d$b, v1 + 1, arr_d$b2, v1, v - v1 - 1);
                    arr_d$b1 = arr_d$b2;
                }
            }
            while(!this.compareAndSet(arr_d$b, arr_d$b1));
        }

        @Override  // rx.functions.b
        public void b(Object object0) {
            this.q(((n)object0));
        }

        @Override  // rx.h
        public void d() {
            a d$a0 = this.a;
            d$a0.a();
            b[] arr_d$b = (b[])this.getAndSet(e.d);
            for(int v = 0; v < arr_d$b.length; ++v) {
                d$a0.f(arr_d$b[v]);
            }
        }

        boolean o(b d$b0) {
            do {
                b[] arr_d$b = (b[])this.get();
                if(arr_d$b == e.d) {
                    return false;
                }
                b[] arr_d$b1 = new b[arr_d$b.length + 1];
                System.arraycopy(arr_d$b, 0, arr_d$b1, 0, arr_d$b.length);
                arr_d$b1[arr_d$b.length] = d$b0;
            }
            while(!this.compareAndSet(arr_d$b, arr_d$b1));
            return true;
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            a d$a0 = this.a;
            d$a0.c(throwable0);
            b[] arr_d$b = (b[])this.getAndSet(e.d);
            List list0 = null;
            for(int v = 0; v < arr_d$b.length; ++v) {
                b d$b0 = arr_d$b[v];
                try {
                    d$a0.f(d$b0);
                }
                catch(Throwable throwable1) {
                    if(list0 == null) {
                        list0 = new ArrayList();
                    }
                    list0.add(throwable1);
                }
            }
            rx.exceptions.c.d(list0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            a d$a0 = this.a;
            d$a0.b(object0);
            b[] arr_d$b = (b[])this.get();
            for(int v = 0; v < arr_d$b.length; ++v) {
                d$a0.f(arr_d$b[v]);
            }
        }

        public void q(n n0) {
            b d$b0 = new b(n0, this);
            n0.q(d$b0);
            n0.X(d$b0);
            if(this.o(d$b0) && d$b0.j()) {
                this.Q(d$b0);
                return;
            }
            this.a.f(d$b0);
        }

        boolean x() {
            return this.get() == e.d;
        }
    }

    static final class rx.subjects.d.f implements a {
        final int a;
        volatile int b;
        final Object[] c;
        Object[] d;
        int e;
        volatile boolean f;
        Throwable g;

        public rx.subjects.d.f(int v) {
            this.a = v;
            Object[] arr_object = new Object[v + 1];
            this.c = arr_object;
            this.d = arr_object;
        }

        @Override  // rx.subjects.d$a
        public void a() {
            this.f = true;
        }

        @Override  // rx.subjects.d$a
        public void b(Object object0) {
            if(this.f) {
                return;
            }
            int v = this.e;
            Object[] arr_object = this.d;
            if(v == arr_object.length - 1) {
                Object[] arr_object1 = new Object[arr_object.length];
                arr_object1[0] = object0;
                this.e = 1;
                arr_object[v] = arr_object1;
                this.d = arr_object1;
            }
            else {
                arr_object[v] = object0;
                this.e = v + 1;
            }
            ++this.b;
        }

        @Override  // rx.subjects.d$a
        public void c(Throwable throwable0) {
            if(this.f) {
                rx.plugins.c.I(throwable0);
                return;
            }
            this.g = throwable0;
            this.f = true;
        }

        @Override  // rx.subjects.d$a
        public Throwable d() {
            return this.g;
        }

        @Override  // rx.subjects.d$a
        public boolean e() {
            return this.f;
        }

        @Override  // rx.subjects.d$a
        public void f(b d$b0) {
            if(d$b0.getAndIncrement() != 0) {
                return;
            }
            n n0 = d$b0.a;
            int v = this.a;
            int v1 = 1;
            do {
                long v2 = d$b0.b.get();
                Object[] arr_object = (Object[])d$b0.f;
                if(arr_object == null) {
                    arr_object = this.c;
                }
                int v3 = d$b0.e;
                int v4 = d$b0.d;
                long v5 = 0L;
                int v6;
                while((v6 = Long.compare(v5, v2)) != 0) {
                    if(n0.j()) {
                        d$b0.f = null;
                        return;
                    }
                    boolean z = v4 == this.b;
                    if(this.f && z) {
                        d$b0.f = null;
                        Throwable throwable0 = this.g;
                        if(throwable0 != null) {
                            n0.onError(throwable0);
                            return;
                        }
                        n0.d();
                        return;
                    }
                    if(z) {
                        break;
                    }
                    if(v3 == v) {
                        arr_object = (Object[])arr_object[v3];
                        v3 = 0;
                    }
                    n0.onNext(arr_object[v3]);
                    ++v5;
                    ++v3;
                    ++v4;
                }
                if(v6 == 0) {
                    if(n0.j()) {
                        d$b0.f = null;
                        return;
                    }
                    if(this.f && v4 == this.b) {
                        d$b0.f = null;
                        Throwable throwable1 = this.g;
                        if(throwable1 != null) {
                            n0.onError(throwable1);
                            return;
                        }
                        n0.d();
                        return;
                    }
                }
                if(v5 != 0L && v2 != 0x7FFFFFFFFFFFFFFFL) {
                    rx.internal.operators.a.i(d$b0.b, v5);
                }
                d$b0.d = v4;
                d$b0.e = v3;
                d$b0.f = arr_object;
                v1 = d$b0.addAndGet(-v1);
            }
            while(v1 != 0);
        }

        @Override  // rx.subjects.d$a
        public boolean isEmpty() {
            return this.b == 0;
        }

        @Override  // rx.subjects.d$a
        public Object last() {
            int v = this.b;
            if(v == 0) {
                return null;
            }
            Object[] arr_object = this.c;
            int v1 = this.a;
            while(v >= v1) {
                arr_object = (Object[])arr_object[v1];
                v -= v1;
            }
            return arr_object[v - 1];
        }

        @Override  // rx.subjects.d$a
        public int size() {
            return this.b;
        }

        @Override  // rx.subjects.d$a
        public Object[] toArray(Object[] arr_object) {
            int v = this.b;
            if(arr_object.length < v) {
                arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
            }
            Object[] arr_object1 = this.c;
            int v1 = this.a;
            int v2 = 0;
            int v3;
            while((v3 = v2 + v1) < v) {
                System.arraycopy(arr_object1, 0, arr_object, v2, v1);
                arr_object1 = (Object[])arr_object1[v1];
                v2 = v3;
            }
            System.arraycopy(arr_object1, 0, arr_object, v2, v - v2);
            if(arr_object.length > v) {
                arr_object[v] = null;
            }
            return arr_object;
        }
    }

    final e b;
    private static final Object[] c;

    static {
        d.c = new Object[0];
    }

    d(e d$e0) {
        super(d$e0);
        this.b = d$e0;
    }

    @Override  // rx.subjects.f
    public boolean A7() {
        return ((b[])this.b.get()).length != 0;
    }

    public static d C7() {
        return d.D7(16);
    }

    public static d D7(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("capacity > 0 required but it was " + v);
        }
        return new d(new e(new rx.subjects.d.f(v)));
    }

    static d E7() {
        return new d(new e(new rx.subjects.d.d(0x7FFFFFFF)));
    }

    static d F7() {
        return new d(new e(new c(0x7FFFFFFF, 0x7FFFFFFFFFFFFFFFL, rx.schedulers.c.d())));
    }

    public static d G7(int v) {
        return new d(new e(new rx.subjects.d.d(v)));
    }

    public static d H7(long v, TimeUnit timeUnit0, j j0) {
        return d.I7(v, timeUnit0, 0x7FFFFFFF, j0);
    }

    public static d I7(long v, TimeUnit timeUnit0, int v1, j j0) {
        return new d(new e(new c(v1, timeUnit0.toMillis(v), j0)));
    }

    // 去混淆评级： 低(20)
    public Throwable J7() {
        return this.b.x() ? this.b.a.d() : null;
    }

    public Object K7() {
        return this.b.a.last();
    }

    public Object[] L7() {
        Object[] arr_object = this.M7(d.c);
        return arr_object == d.c ? new Object[0] : arr_object;
    }

    public Object[] M7(Object[] arr_object) {
        return this.b.a.toArray(arr_object);
    }

    public boolean N7() {
        return !this.b.a.isEmpty();
    }

    public boolean O7() {
        return this.b.x() && this.b.a.d() == null;
    }

    public boolean P7() {
        return this.b.x() && this.b.a.d() != null;
    }

    public boolean Q7() {
        return this.N7();
    }

    public int R7() {
        return this.b.a.size();
    }

    int S7() {
        return ((b[])this.b.get()).length;
    }

    @Override  // rx.h
    public void d() {
        this.b.d();
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        this.b.onError(throwable0);
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        this.b.onNext(object0);
    }
}

