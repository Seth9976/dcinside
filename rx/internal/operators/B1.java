package rx.internal.operators;

import androidx.compose.animation.core.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.functions.b;
import rx.functions.p;
import rx.g;
import rx.n;
import rx.o;
import rx.observables.c;
import rx.subscriptions.f;

public final class b1 extends c implements o {
    static final class a implements rx.functions.o {
        @Override  // rx.functions.o
        public Object call() {
            return new rx.internal.operators.b1.o(16);
        }
    }

    static class h extends AtomicReference implements k {
        j a;
        int b;
        long c;
        private static final long d = 0x2090AEF8EFDE5E9EL;

        public h() {
            j b1$j0 = new j(null, 0L);
            this.a = b1$j0;
            this.set(b1$j0);
        }

        @Override  // rx.internal.operators.b1$k
        public final void a() {
            long v = this.c + 1L;
            this.c = v;
            this.e(new j(this.g(x.b()), v));
            this.p();
        }

        @Override  // rx.internal.operators.b1$k
        public final void b(Object object0) {
            Object object1 = this.g(x.j(object0));
            long v = this.c + 1L;
            this.c = v;
            this.e(new j(object1, v));
            this.o();
        }

        @Override  // rx.internal.operators.b1$k
        public final void c(Throwable throwable0) {
            Object object0 = this.g(x.c(throwable0));
            long v = this.c + 1L;
            this.c = v;
            this.e(new j(object0, v));
            this.p();
        }

        @Override  // rx.internal.operators.b1$k
        public final void d(i b1$i0) {
            __monitor_enter(b1$i0);
            if(b1$i0.e) {
                b1$i0.f = true;
                __monitor_exit(b1$i0);
                return;
            }
            b1$i0.e = true;
            __monitor_exit(b1$i0);
            while(true) {
                if(b1$i0.j()) {
                    return;
                }
                j b1$j0 = (j)b1$i0.b();
                if(b1$j0 == null) {
                    b1$j0 = this.h();
                    b1$i0.c = b1$j0;
                    b1$i0.a(b1$j0.b);
                }
                if(b1$i0.j()) {
                    return;
                }
                n n0 = b1$i0.b;
                if(n0 == null) {
                    return;
                }
                long v = b1$i0.get();
                long v1 = 0L;
                while(v1 != v) {
                    j b1$j1 = (j)b1$j0.get();
                    if(b1$j1 == null) {
                        break;
                    }
                    Object object0 = this.k(b1$j1.a);
                    try {
                        if(x.a(n0, object0)) {
                            b1$i0.c = null;
                            return;
                        }
                    }
                    catch(Throwable throwable0) {
                        b1$i0.c = null;
                        rx.exceptions.c.e(throwable0);
                        b1$i0.l();
                        if(!x.g(object0) && !x.f(object0)) {
                            n0.onError(rx.exceptions.h.a(throwable0, x.e(object0)));
                        }
                        return;
                    }
                    ++v1;
                    if(b1$i0.j()) {
                        return;
                    }
                    b1$j0 = b1$j1;
                }
                if(v1 != 0L) {
                    b1$i0.c = b1$j0;
                    if(v != 0x7FFFFFFFFFFFFFFFL) {
                        b1$i0.c(v1);
                    }
                }
                synchronized(b1$i0) {
                    if(!b1$i0.f) {
                        b1$i0.e = false;
                        return;
                    }
                    b1$i0.f = false;
                }
            }
        }

        final void e(j b1$j0) {
            this.a.set(b1$j0);
            this.a = b1$j0;
            ++this.b;
        }

        final void f(Collection collection0) {
            j b1$j0 = this.h();
            while(true) {
                b1$j0 = (j)b1$j0.get();
                if(b1$j0 == null) {
                    break;
                }
                Object object0 = this.k(b1$j0.a);
                if(x.f(object0) || x.g(object0)) {
                    break;
                }
                collection0.add(x.e(object0));
            }
        }

        Object g(Object object0) {
            return object0;
        }

        j h() {
            return (j)this.get();
        }

        boolean i() {
            Object object0 = this.a.a;
            return object0 != null && x.f(this.k(object0));
        }

        boolean j() {
            Object object0 = this.a.a;
            return object0 != null && x.g(this.k(object0));
        }

        Object k(Object object0) {
            return object0;
        }

        final void l() {
            j b1$j0 = (j)((j)this.get()).get();
            if(b1$j0 == null) {
                throw new IllegalStateException("Empty list!");
            }
            --this.b;
            this.n(b1$j0);
        }

        final void m(int v) {
            j b1$j0 = (j)this.get();
            while(v > 0) {
                b1$j0 = (j)b1$j0.get();
                --v;
                --this.b;
            }
            this.n(b1$j0);
        }

        final void n(j b1$j0) {
            this.set(b1$j0);
        }

        void o() {
        }

        void p() {
        }
    }

    static final class i extends AtomicLong implements rx.i, o {
        final l a;
        n b;
        Object c;
        final AtomicLong d;
        boolean e;
        boolean f;
        private static final long g = 0xC23093C4D18F2746L;
        static final long h = 0x8000000000000000L;

        public i(l b1$l0, n n0) {
            this.a = b1$l0;
            this.b = n0;
            this.d = new AtomicLong();
        }

        void a(long v) {
            do {
                long v1 = this.d.get();
            }
            while(!this.d.compareAndSet(v1, (v1 + v >= 0L ? v1 + v : 0x7FFFFFFFFFFFFFFFL)));
        }

        Object b() {
            return this.c;
        }

        public long c(long v) {
            long v1;
            if(v <= 0L) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            while(true) {
                v1 = this.get();
                if(v1 == 0x8000000000000000L) {
                    return 0x8000000000000000L;
                }
                long v2 = v1 - v;
                if(v2 < 0L) {
                    break;
                }
                if(this.compareAndSet(v1, v2)) {
                    return v2;
                }
            }
            throw new IllegalStateException("More produced (" + v + ") than requested (" + v1 + ")");
        }

        @Override  // rx.o
        public boolean j() {
            return this.get() == 0x8000000000000000L;
        }

        @Override  // rx.o
        public void l() {
            if(this.get() != 0x8000000000000000L && this.getAndSet(0x8000000000000000L) != 0x8000000000000000L) {
                this.a.a0(this);
                this.a.Y(this);
                this.b = null;
            }
        }

        @Override  // rx.i
        public void request(long v) {
            int v1 = Long.compare(v, 0L);
            if(v1 < 0) {
                return;
            }
            do {
                long v2 = this.get();
                if(v2 == 0x8000000000000000L) {
                    return;
                }
                if(v2 >= 0L && v1 == 0) {
                    return;
                }
            }
            while(!this.compareAndSet(v2, (v2 + v >= 0L ? v2 + v : 0x7FFFFFFFFFFFFFFFL)));
            this.a(v);
            this.a.Y(this);
            this.a.f.d(this);
        }
    }

    static final class j extends AtomicReference {
        final Object a;
        final long b;
        private static final long c = 0x367AC732FAB94EAL;

        public j(Object object0, long v) {
            this.a = object0;
            this.b = v;
        }
    }

    interface k {
        void a();

        void b(Object arg1);

        void c(Throwable arg1);

        void d(i arg1);
    }

    static final class l extends n implements o {
        final k f;
        boolean g;
        volatile boolean h;
        final rx.internal.util.k i;
        i[] j;
        volatile long k;
        long l;
        final AtomicBoolean m;
        boolean n;
        boolean o;
        long p;
        long q;
        volatile rx.i r;
        List s;
        boolean t;
        static final i[] u;
        static final i[] v;

        static {
            l.u = new i[0];
            l.v = new i[0];
        }

        public l(k b1$k0) {
            this.f = b1$k0;
            this.i = new rx.internal.util.k();
            this.j = l.u;
            this.m = new AtomicBoolean();
            this.v(0L);
        }

        i[] Q() {
            synchronized(this.i) {
                Object[] arr_object = this.i.i();
                i[] arr_b1$i = new i[arr_object.length];
                System.arraycopy(arr_object, 0, arr_b1$i, 0, arr_object.length);
                return arr_b1$i;
            }
        }

        void R() {
            class rx.internal.operators.b1.l.a implements rx.functions.a {
                final l a;

                @Override  // rx.functions.a
                public void call() {
                    if(!l.this.h) {
                        rx.internal.util.k k0 = l.this.i;
                        synchronized(k0) {
                            if(!l.this.h) {
                                l.this.i.h();
                                ++l.this.k;
                                l.this.h = true;
                            }
                        }
                    }
                }
            }

            this.q(f.a(new rx.internal.operators.b1.l.a(this)));
        }

        void T(long v, long v1) {
            long v2 = this.q;
            rx.i i0 = this.r;
            long v3 = v - v1;
            if(v3 != 0L) {
                this.p = v;
                if(i0 != null) {
                    if(v2 != 0L) {
                        this.q = 0L;
                        i0.request(v2 + v3);
                        return;
                    }
                    i0.request(v3);
                    return;
                }
                this.q = v2 + v3 >= 0L ? v2 + v3 : 0x7FFFFFFFFFFFFFFFL;
                return;
            }
            if(v2 != 0L && i0 != null) {
                this.q = 0L;
                i0.request(v2);
            }
        }

        @Override  // rx.n
        public void X(rx.i i0) {
            if(this.r != null) {
                throw new IllegalStateException("Only a single producer can be set on a Subscriber.");
            }
            this.r = i0;
            this.Y(null);
            this.b0();
        }

        void Y(i b1$i0) {
            long v5;
            long v1;
            if(this.j()) {
                return;
            }
            synchronized(this) {
                if(this.n) {
                    if(b1$i0 == null) {
                        this.t = true;
                    }
                    else {
                        List list0 = this.s;
                        if(list0 == null) {
                            list0 = new ArrayList();
                            this.s = list0;
                        }
                        list0.add(b1$i0);
                    }
                    this.o = true;
                    return;
                }
                goto label_15;
            }
            return;
        label_15:
            this.n = true;
            long v = this.p;
            if(b1$i0 == null) {
                i[] arr_b1$i = this.Q();
                long v2 = v;
                for(int v3 = 0; v3 < arr_b1$i.length; ++v3) {
                    i b1$i1 = arr_b1$i[v3];
                    if(b1$i1 != null) {
                        v2 = Math.max(v2, b1$i1.d.get());
                    }
                }
                v1 = v2;
            }
            else {
                v1 = Math.max(v, b1$i0.d.get());
            }
            this.T(v1, v);
            while(true) {
                if(this.j()) {
                    return;
                }
                synchronized(this) {
                    if(!this.o) {
                        this.n = false;
                        return;
                    }
                    this.o = false;
                    List list1 = this.s;
                    this.s = null;
                    boolean z = this.t;
                    this.t = false;
                }
                long v4 = this.p;
                if(list1 == null) {
                    v5 = v4;
                }
                else {
                    v5 = v4;
                    for(Object object0: list1) {
                        v5 = Math.max(v5, ((i)object0).d.get());
                    }
                }
                if(z) {
                    i[] arr_b1$i1 = this.Q();
                    for(int v6 = 0; v6 < arr_b1$i1.length; ++v6) {
                        i b1$i2 = arr_b1$i1[v6];
                        if(b1$i2 != null) {
                            v5 = Math.max(v5, b1$i2.d.get());
                        }
                    }
                }
                this.T(v5, v4);
            }
        }

        void a0(i b1$i0) {
            if(this.h) {
                return;
            }
            synchronized(this.i) {
                if(this.h) {
                    return;
                }
                this.i.f(b1$i0);
                if(this.i.c()) {
                    this.j = l.u;
                }
                ++this.k;
            }
        }

        void b0() {
            i[] arr_b1$i = this.j;
            if(this.l != this.k) {
                synchronized(this.i) {
                    arr_b1$i = this.j;
                    Object[] arr_object = this.i.i();
                    if(arr_b1$i.length != arr_object.length) {
                        arr_b1$i = new i[arr_object.length];
                        this.j = arr_b1$i;
                    }
                    System.arraycopy(arr_object, 0, arr_b1$i, 0, arr_object.length);
                    this.l = this.k;
                }
            }
            k b1$k0 = this.f;
            for(int v = 0; v < arr_b1$i.length; ++v) {
                i b1$i0 = arr_b1$i[v];
                if(b1$i0 != null) {
                    b1$k0.d(b1$i0);
                }
            }
        }

        @Override  // rx.h
        public void d() {
            if(!this.g) {
                try {
                    this.g = true;
                    this.f.a();
                    this.b0();
                }
                finally {
                    this.l();
                }
            }
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(!this.g) {
                try {
                    this.g = true;
                    this.f.c(throwable0);
                    this.b0();
                }
                finally {
                    this.l();
                }
            }
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            if(!this.g) {
                this.f.b(object0);
                this.b0();
            }
        }

        boolean x(i b1$i0) {
            b1$i0.getClass();
            if(this.h) {
                return false;
            }
            synchronized(this.i) {
                if(this.h) {
                    return false;
                }
                this.i.a(b1$i0);
                ++this.k;
                return true;
            }
        }
    }

    static final class m extends h {
        final rx.j e;
        final long f;
        final int g;
        private static final long h = 0x2FFD21F3BEA38AACL;

        public m(int v, long v1, rx.j j0) {
            this.e = j0;
            this.g = v;
            this.f = v1;
        }

        @Override  // rx.internal.operators.b1$h
        Object g(Object object0) {
            return new rx.schedulers.f(this.e.b(), object0);
        }

        @Override  // rx.internal.operators.b1$h
        j h() {
            j b1$j2;
            long v = this.e.b() - this.f;
            j b1$j0 = (j)this.get();
            for(j b1$j1 = (j)b1$j0.get(); true; b1$j1 = (j)b1$j0.get()) {
                b1$j2 = b1$j0;
                b1$j0 = b1$j1;
                if(b1$j0 == null) {
                    break;
                }
                Object object0 = this.k(b1$j0.a);
                if(x.f(object0) || x.g(object0) || ((rx.schedulers.f)b1$j0.a).a() > v) {
                    break;
                }
            }
            return b1$j2;
        }

        @Override  // rx.internal.operators.b1$h
        Object k(Object object0) {
            return ((rx.schedulers.f)object0).b();
        }

        @Override  // rx.internal.operators.b1$h
        void o() {
            j b1$j2;
            long v = this.e.b() - this.f;
            j b1$j0 = (j)this.get();
            j b1$j1 = (j)b1$j0.get();
            int v1 = 0;
            while(true) {
                b1$j2 = b1$j0;
                b1$j0 = b1$j1;
                if(b1$j0 == null) {
                    break;
                }
                int v2 = this.b;
                if(v2 > this.g) {
                    ++v1;
                    this.b = v2 - 1;
                }
                else {
                    if(((rx.schedulers.f)b1$j0.a).a() > v) {
                        break;
                    }
                    ++v1;
                    --this.b;
                }
                b1$j1 = (j)b1$j0.get();
            }
            if(v1 != 0) {
                this.n(b1$j2);
            }
        }

        @Override  // rx.internal.operators.b1$h
        void p() {
            j b1$j2;
            long v = this.e.b() - this.f;
            j b1$j0 = (j)this.get();
            j b1$j1 = (j)b1$j0.get();
            int v1 = 0;
            while(true) {
                b1$j2 = b1$j0;
                b1$j0 = b1$j1;
                if(b1$j0 == null || this.b <= 1 || ((rx.schedulers.f)b1$j0.a).a() > v) {
                    break;
                }
                ++v1;
                --this.b;
                b1$j1 = (j)b1$j0.get();
            }
            if(v1 != 0) {
                this.n(b1$j2);
            }
        }
    }

    static final class rx.internal.operators.b1.n extends h {
        final int e;
        private static final long f = 0xAE25160E83344772L;

        public rx.internal.operators.b1.n(int v) {
            this.e = v;
        }

        @Override  // rx.internal.operators.b1$h
        void o() {
            if(this.b > this.e) {
                this.l();
            }
        }
    }

    static final class rx.internal.operators.b1.o extends ArrayList implements k {
        volatile int a;
        private static final long b = 0x62057D556FA2A2D8L;

        public rx.internal.operators.b1.o(int v) {
            super(v);
        }

        @Override  // rx.internal.operators.b1$k
        public void a() {
            this.add(x.b());
            ++this.a;
        }

        @Override  // rx.internal.operators.b1$k
        public void b(Object object0) {
            this.add(x.j(object0));
            ++this.a;
        }

        @Override  // rx.internal.operators.b1$k
        public void c(Throwable throwable0) {
            this.add(x.c(throwable0));
            ++this.a;
        }

        @Override  // rx.internal.operators.b1$k
        public void d(i b1$i0) {
            __monitor_enter(b1$i0);
            if(b1$i0.e) {
                b1$i0.f = true;
                __monitor_exit(b1$i0);
                return;
            }
            b1$i0.e = true;
            __monitor_exit(b1$i0);
            while(true) {
                if(b1$i0.j()) {
                    return;
                }
                int v = this.a;
                Integer integer0 = (Integer)b1$i0.b();
                int v1 = integer0 == null ? 0 : ((int)integer0);
                n n0 = b1$i0.b;
                if(n0 == null) {
                    return;
                }
                long v2 = b1$i0.get();
                long v3;
                for(v3 = 0L; v3 != v2 && v1 < v; ++v3) {
                    Object object0 = this.get(v1);
                    try {
                        if(x.a(n0, object0)) {
                            return;
                        }
                    }
                    catch(Throwable throwable0) {
                        rx.exceptions.c.e(throwable0);
                        b1$i0.l();
                        if(!x.g(object0) && !x.f(object0)) {
                            n0.onError(rx.exceptions.h.a(throwable0, x.e(object0)));
                        }
                        return;
                    }
                    if(b1$i0.j()) {
                        return;
                    }
                    ++v1;
                }
                if(v3 != 0L) {
                    b1$i0.c = v1;
                    if(v2 != 0x7FFFFFFFFFFFFFFFL) {
                        b1$i0.c(v3);
                    }
                }
                synchronized(b1$i0) {
                    if(!b1$i0.f) {
                        b1$i0.e = false;
                        return;
                    }
                    b1$i0.f = false;
                }
            }
        }
    }

    final g b;
    final AtomicReference c;
    final rx.functions.o d;
    static final rx.functions.o e;

    static {
        b1.e = new a();
    }

    private b1(rx.g.a g$a0, g g0, AtomicReference atomicReference0, rx.functions.o o0) {
        super(g$a0);
        this.b = g0;
        this.c = atomicReference0;
        this.d = o0;
    }

    @Override  // rx.observables.c
    public void E7(b b0) {
        l b1$l0;
        while(true) {
            b1$l0 = (l)this.c.get();
            if(b1$l0 != null && !b1$l0.j()) {
                break;
            }
            l b1$l1 = new l(((k)this.d.call()));
            b1$l1.R();
            if(d.a(this.c, b1$l0, b1$l1)) {
                b1$l0 = b1$l1;
                break;
            }
        }
        boolean z = !b1$l0.m.get() && b1$l0.m.compareAndSet(false, true);
        b0.b(b1$l0);
        if(z) {
            this.b.N6(b1$l0);
        }
    }

    public static c G7(g g0) {
        return b1.K7(g0, b1.e);
    }

    public static c H7(g g0, int v) {
        static final class e implements rx.functions.o {
            final int a;

            e(int v) {
                this.a = v;
                super();
            }

            public k a() {
                return new rx.internal.operators.b1.n(this.a);
            }

            @Override  // rx.functions.o
            public Object call() {
                return this.a();
            }
        }

        return v == 0x7FFFFFFF ? b1.G7(g0) : b1.K7(g0, new e(v));
    }

    public static c I7(g g0, long v, TimeUnit timeUnit0, rx.j j0) {
        return b1.J7(g0, v, timeUnit0, j0, 0x7FFFFFFF);
    }

    public static c J7(g g0, long v, TimeUnit timeUnit0, rx.j j0, int v1) {
        static final class rx.internal.operators.b1.f implements rx.functions.o {
            final int a;
            final long b;
            final rx.j c;

            rx.internal.operators.b1.f(int v, long v1, rx.j j0) {
                this.a = v;
                this.b = v1;
                this.c = j0;
                super();
            }

            public k a() {
                return new m(this.a, this.b, this.c);
            }

            @Override  // rx.functions.o
            public Object call() {
                return this.a();
            }
        }

        return b1.K7(g0, new rx.internal.operators.b1.f(v1, timeUnit0.toMillis(v), j0));
    }

    static c K7(g g0, rx.functions.o o0) {
        static final class rx.internal.operators.b1.g implements rx.g.a {
            final AtomicReference a;
            final rx.functions.o b;

            rx.internal.operators.b1.g(AtomicReference atomicReference0, rx.functions.o o0) {
                this.a = atomicReference0;
                this.b = o0;
                super();
            }

            public void a(n n0) {
                l b1$l0;
                while(true) {
                    b1$l0 = (l)this.a.get();
                    if(b1$l0 != null) {
                        break;
                    }
                    l b1$l1 = new l(((k)this.b.call()));
                    b1$l1.R();
                    if(d.a(this.a, null, b1$l1)) {
                        b1$l0 = b1$l1;
                        break;
                    }
                }
                i b1$i0 = new i(b1$l0, n0);
                b1$l0.x(b1$i0);
                n0.q(b1$i0);
                b1$l0.f.d(b1$i0);
                n0.X(b1$i0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((n)object0));
            }
        }

        AtomicReference atomicReference0 = new AtomicReference();
        return new b1(new rx.internal.operators.b1.g(atomicReference0, o0), g0, atomicReference0, o0);
    }

    public static g L7(rx.functions.o o0, p p0) {
        static final class rx.internal.operators.b1.b implements rx.g.a {
            final rx.functions.o a;
            final p b;

            rx.internal.operators.b1.b(rx.functions.o o0, p p0) {
                this.a = o0;
                this.b = p0;
                super();
            }

            public void a(n n0) {
                class rx.internal.operators.b1.b.a implements b {
                    final n a;
                    final rx.internal.operators.b1.b b;

                    rx.internal.operators.b1.b.a(n n0) {
                        this.a = n0;
                        super();
                    }

                    public void a(o o0) {
                        this.a.q(o0);
                    }

                    @Override  // rx.functions.b
                    public void b(Object object0) {
                        this.a(((o)object0));
                    }
                }

                g g0;
                c c0;
                try {
                    c0 = (c)this.a.call();
                    g0 = (g)this.b.b(c0);
                }
                catch(Throwable throwable0) {
                    rx.exceptions.c.f(throwable0, n0);
                    return;
                }
                g0.v5(n0);
                c0.E7(new rx.internal.operators.b1.b.a(this, n0));
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((n)object0));
            }
        }

        return g.M6(new rx.internal.operators.b1.b(o0, p0));
    }

    public static c M7(c c0, rx.j j0) {
        static final class rx.internal.operators.b1.c implements rx.g.a {
            final g a;

            rx.internal.operators.b1.c(g g0) {
                this.a = g0;
                super();
            }

            public void a(n n0) {
                class rx.internal.operators.b1.c.a extends n {
                    final n f;
                    final rx.internal.operators.b1.c g;

                    rx.internal.operators.b1.c.a(n n0, n n1) {
                        this.f = n1;
                        super(n0);
                    }

                    @Override  // rx.h
                    public void d() {
                        this.f.d();
                    }

                    @Override  // rx.h
                    public void onError(Throwable throwable0) {
                        this.f.onError(throwable0);
                    }

                    @Override  // rx.h
                    public void onNext(Object object0) {
                        this.f.onNext(object0);
                    }
                }

                rx.internal.operators.b1.c.a b1$c$a0 = new rx.internal.operators.b1.c.a(this, n0, n0);
                this.a.N6(b1$c$a0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((n)object0));
            }
        }


        static final class rx.internal.operators.b1.d extends c {
            final c b;

            rx.internal.operators.b1.d(rx.g.a g$a0, c c0) {
                this.b = c0;
                super(g$a0);
            }

            @Override  // rx.observables.c
            public void E7(b b0) {
                this.b.E7(b0);
            }
        }

        return new rx.internal.operators.b1.d(new rx.internal.operators.b1.c(c0.M3(j0)), c0);
    }

    @Override  // rx.o
    public boolean j() {
        l b1$l0 = (l)this.c.get();
        return b1$l0 == null || b1$l0.j();
    }

    @Override  // rx.o
    public void l() {
        this.c.lazySet(null);
    }
}

