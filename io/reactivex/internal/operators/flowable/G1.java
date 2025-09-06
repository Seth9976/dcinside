package io.reactivex.internal.operators.flowable;

import e3.o;
import f3.h;
import io.reactivex.J;
import io.reactivex.exceptions.b;
import io.reactivex.flowables.a;
import io.reactivex.internal.disposables.g;
import io.reactivex.internal.subscribers.v;
import io.reactivex.internal.util.q;
import io.reactivex.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class g1 extends a implements h, g {
    static class io.reactivex.internal.operators.flowable.g1.a extends AtomicReference implements io.reactivex.internal.operators.flowable.g1.g {
        f a;
        int b;
        long c;
        private static final long d = 0x2090AEF8EFDE5E9EL;

        io.reactivex.internal.operators.flowable.g1.a() {
            f g1$f0 = new f(null, 0L);
            this.a = g1$f0;
            this.set(g1$f0);
        }

        @Override  // io.reactivex.internal.operators.flowable.g1$g
        public final void a() {
            long v = this.c + 1L;
            this.c = v;
            this.e(new f(this.g(q.e()), v));
            this.q();
        }

        @Override  // io.reactivex.internal.operators.flowable.g1$g
        public final void b(Object object0) {
            long v = this.c + 1L;
            this.c = v;
            this.e(new f(this.g(object0), v));
            this.p();
        }

        @Override  // io.reactivex.internal.operators.flowable.g1$g
        public final void c(Throwable throwable0) {
            Object object0 = this.g(q.g(throwable0));
            long v = this.c + 1L;
            this.c = v;
            this.e(new f(object0, v));
            this.q();
        }

        @Override  // io.reactivex.internal.operators.flowable.g1$g
        public final void d(d g1$d0) {
            __monitor_enter(g1$d0);
            if(g1$d0.e) {
                g1$d0.f = true;
                __monitor_exit(g1$d0);
                return;
            }
            g1$d0.e = true;
            __monitor_exit(g1$d0);
            while(true) {
                if(g1$d0.a()) {
                    g1$d0.c = null;
                    return;
                }
                long v = g1$d0.get();
                boolean z = v == 0x7FFFFFFFFFFFFFFFL;
                f g1$f0 = (f)g1$d0.b();
                if(g1$f0 == null) {
                    g1$f0 = this.h();
                    g1$d0.c = g1$f0;
                    io.reactivex.internal.util.d.a(g1$d0.d, g1$f0.b);
                }
                long v1 = 0L;
                while(v != 0L) {
                    f g1$f1 = (f)g1$f0.get();
                    if(g1$f1 == null) {
                        break;
                    }
                    Object object0 = this.k(g1$f1.a);
                    try {
                        if(q.b(object0, g1$d0.b)) {
                            g1$d0.c = null;
                            return;
                        }
                    }
                    catch(Throwable throwable0) {
                        b.b(throwable0);
                        g1$d0.c = null;
                        g1$d0.dispose();
                        if(!q.n(object0) && !q.l(object0)) {
                            g1$d0.b.onError(throwable0);
                        }
                        return;
                    }
                    ++v1;
                    --v;
                    if(g1$d0.a()) {
                        g1$d0.c = null;
                        return;
                    }
                    g1$f0 = g1$f1;
                }
                if(v1 != 0L) {
                    g1$d0.c = g1$f0;
                    if(!z) {
                        g1$d0.c(v1);
                    }
                }
                synchronized(g1$d0) {
                    if(!g1$d0.f) {
                        g1$d0.e = false;
                        return;
                    }
                    g1$d0.f = false;
                }
            }
        }

        final void e(f g1$f0) {
            this.a.set(g1$f0);
            this.a = g1$f0;
            ++this.b;
        }

        final void f(Collection collection0) {
            f g1$f0 = this.h();
            while(true) {
                g1$f0 = (f)g1$f0.get();
                if(g1$f0 == null) {
                    break;
                }
                Object object0 = this.k(g1$f0.a);
                if(q.l(object0) || q.n(object0)) {
                    break;
                }
                collection0.add(object0);
            }
        }

        Object g(Object object0) {
            return object0;
        }

        f h() {
            return (f)this.get();
        }

        boolean i() {
            Object object0 = this.a.a;
            return object0 != null && q.l(this.k(object0));
        }

        boolean j() {
            Object object0 = this.a.a;
            return object0 != null && q.n(this.k(object0));
        }

        Object k(Object object0) {
            return object0;
        }

        final void l() {
            f g1$f0 = (f)((f)this.get()).get();
            if(g1$f0 == null) {
                throw new IllegalStateException("Empty list!");
            }
            --this.b;
            this.n(g1$f0);
        }

        final void m(int v) {
            f g1$f0 = (f)this.get();
            while(v > 0) {
                g1$f0 = (f)g1$f0.get();
                --v;
                --this.b;
            }
            this.n(g1$f0);
            f g1$f1 = (f)this.get();
            if(g1$f1.get() == null) {
                this.a = g1$f1;
            }
        }

        final void n(f g1$f0) {
            this.set(g1$f0);
        }

        final void o() {
            f g1$f0 = (f)this.get();
            if(g1$f0.a != null) {
                f g1$f1 = new f(null, 0L);
                g1$f1.lazySet(g1$f0.get());
                this.set(g1$f1);
            }
        }

        void p() {
        }

        void q() {
            this.o();
        }
    }

    static final class io.reactivex.internal.operators.flowable.g1.b extends a {
        private final a b;
        private final l c;

        io.reactivex.internal.operators.flowable.g1.b(a a0, l l0) {
            this.b = a0;
            this.c = l0;
        }

        @Override  // io.reactivex.flowables.a
        public void S8(e3.g g0) {
            this.b.S8(g0);
        }

        @Override  // io.reactivex.l
        protected void m6(org.reactivestreams.d d0) {
            this.c.e(d0);
        }
    }

    static final class c implements Callable {
        @Override
        public Object call() {
            return new n(16);
        }
    }

    static final class d extends AtomicLong implements io.reactivex.disposables.c, e {
        final j a;
        final org.reactivestreams.d b;
        Object c;
        final AtomicLong d;
        boolean e;
        boolean f;
        private static final long g = 0xC23093C4D18F2746L;
        static final long h = 0x8000000000000000L;

        d(j g1$j0, org.reactivestreams.d d0) {
            this.a = g1$j0;
            this.b = d0;
            this.d = new AtomicLong();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get() == 0x8000000000000000L;
        }

        Object b() {
            return this.c;
        }

        public long c(long v) {
            return io.reactivex.internal.util.d.f(this, v);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.dispose();
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(this.getAndSet(0x8000000000000000L) != 0x8000000000000000L) {
                this.a.d(this);
                this.a.c();
                this.c = null;
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(io.reactivex.internal.subscriptions.j.j(v) && io.reactivex.internal.util.d.b(this, v) != 0x8000000000000000L) {
                io.reactivex.internal.util.d.a(this.d, v);
                this.a.c();
                this.a.a.d(this);
            }
        }
    }

    static final class io.reactivex.internal.operators.flowable.g1.e extends l {
        final class io.reactivex.internal.operators.flowable.g1.e.a implements e3.g {
            private final v a;
            final io.reactivex.internal.operators.flowable.g1.e b;

            io.reactivex.internal.operators.flowable.g1.e.a(v v0) {
                this.a = v0;
            }

            public void a(io.reactivex.disposables.c c0) {
                this.a.b(c0);
            }

            @Override  // e3.g
            public void accept(Object object0) throws Exception {
                this.a(((io.reactivex.disposables.c)object0));
            }
        }

        private final Callable b;
        private final o c;

        io.reactivex.internal.operators.flowable.g1.e(Callable callable0, o o0) {
            this.b = callable0;
            this.c = o0;
        }

        @Override  // io.reactivex.l
        protected void m6(org.reactivestreams.d d0) {
            org.reactivestreams.c c0;
            a a0;
            try {
                a0 = (a)io.reactivex.internal.functions.b.g(this.b.call(), "The connectableFactory returned null");
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                io.reactivex.internal.subscriptions.g.b(throwable0, d0);
                return;
            }
            try {
                c0 = (org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.c.apply(a0), "The selector returned a null Publisher");
            }
            catch(Throwable throwable1) {
                b.b(throwable1);
                io.reactivex.internal.subscriptions.g.b(throwable1, d0);
                return;
            }
            v v0 = new v(d0);
            c0.e(v0);
            a0.S8(new io.reactivex.internal.operators.flowable.g1.e.a(this, v0));
        }
    }

    static final class f extends AtomicReference {
        final Object a;
        final long b;
        private static final long c = 0x367AC732FAB94EAL;

        f(Object object0, long v) {
            this.a = object0;
            this.b = v;
        }
    }

    interface io.reactivex.internal.operators.flowable.g1.g {
        void a();

        void b(Object arg1);

        void c(Throwable arg1);

        void d(d arg1);
    }

    static final class io.reactivex.internal.operators.flowable.g1.h implements Callable {
        private final int a;

        io.reactivex.internal.operators.flowable.g1.h(int v) {
            this.a = v;
        }

        public io.reactivex.internal.operators.flowable.g1.g a() {
            return new m(this.a);
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    static final class i implements org.reactivestreams.c {
        private final AtomicReference a;
        private final Callable b;

        i(AtomicReference atomicReference0, Callable callable0) {
            this.a = atomicReference0;
            this.b = callable0;
        }

        @Override  // org.reactivestreams.c
        public void e(org.reactivestreams.d d0) {
            io.reactivex.internal.operators.flowable.g1.g g1$g0;
            j g1$j0;
            while(true) {
                g1$j0 = (j)this.a.get();
                if(g1$j0 != null) {
                    break;
                }
                try {
                    g1$g0 = (io.reactivex.internal.operators.flowable.g1.g)this.b.call();
                }
                catch(Throwable throwable0) {
                    b.b(throwable0);
                    io.reactivex.internal.subscriptions.g.b(throwable0, d0);
                    return;
                }
                j g1$j1 = new j(g1$g0);
                if(androidx.compose.animation.core.d.a(this.a, null, g1$j1)) {
                    g1$j0 = g1$j1;
                    break;
                }
            }
            d g1$d0 = new d(g1$j0, d0);
            d0.g(g1$d0);
            g1$j0.b(g1$d0);
            if(g1$d0.a()) {
                g1$j0.d(g1$d0);
                return;
            }
            g1$j0.c();
            g1$j0.a.d(g1$d0);
        }
    }

    static final class j extends AtomicReference implements io.reactivex.disposables.c, io.reactivex.q {
        final io.reactivex.internal.operators.flowable.g1.g a;
        boolean b;
        final AtomicReference c;
        final AtomicBoolean d;
        final AtomicInteger e;
        long f;
        long g;
        private static final long h = 7224554242710036740L;
        static final d[] i;
        static final d[] j;

        static {
            j.i = new d[0];
            j.j = new d[0];
        }

        j(io.reactivex.internal.operators.flowable.g1.g g1$g0) {
            this.a = g1$g0;
            this.e = new AtomicInteger();
            this.c = new AtomicReference(j.i);
            this.d = new AtomicBoolean();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c.get() == j.j;
        }

        boolean b(d g1$d0) {
            g1$d0.getClass();
            do {
                d[] arr_g1$d = (d[])this.c.get();
                if(arr_g1$d == j.j) {
                    return false;
                }
                d[] arr_g1$d1 = new d[arr_g1$d.length + 1];
                System.arraycopy(arr_g1$d, 0, arr_g1$d1, 0, arr_g1$d.length);
                arr_g1$d1[arr_g1$d.length] = g1$d0;
            }
            while(!androidx.compose.animation.core.d.a(this.c, arr_g1$d, arr_g1$d1));
            return true;
        }

        void c() {
            if(this.e.getAndIncrement() != 0) {
                return;
            }
            int v = 1;
            do {
                if(this.a()) {
                    return;
                }
                d[] arr_g1$d = (d[])this.c.get();
                long v1 = this.f;
                long v3 = v1;
                for(int v2 = 0; v2 < arr_g1$d.length; ++v2) {
                    v3 = Math.max(v3, arr_g1$d[v2].d.get());
                }
                long v4 = this.g;
                e e0 = (e)this.get();
                long v5 = v3 - v1;
                if(v5 != 0L) {
                    this.f = v3;
                    if(e0 == null) {
                        this.g = v4 + v5 >= 0L ? v4 + v5 : 0x7FFFFFFFFFFFFFFFL;
                    }
                    else if(v4 == 0L) {
                        e0.request(v5);
                    }
                    else {
                        this.g = 0L;
                        e0.request(v4 + v5);
                    }
                }
                else if(v4 != 0L && e0 != null) {
                    this.g = 0L;
                    e0.request(v4);
                }
                v = this.e.addAndGet(-v);
            }
            while(v != 0);
        }

        void d(d g1$d0) {
            d[] arr_g1$d1;
            do {
                d[] arr_g1$d = (d[])this.c.get();
                int v = arr_g1$d.length;
                if(v == 0) {
                    return;
                }
                int v1 = 0;
                while(true) {
                    if(v1 < v) {
                        if(arr_g1$d[v1].equals(g1$d0)) {
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
                    arr_g1$d1 = j.i;
                }
                else {
                    d[] arr_g1$d2 = new d[v - 1];
                    System.arraycopy(arr_g1$d, 0, arr_g1$d2, 0, v1);
                    System.arraycopy(arr_g1$d, v1 + 1, arr_g1$d2, v1, v - v1 - 1);
                    arr_g1$d1 = arr_g1$d2;
                }
            }
            while(!androidx.compose.animation.core.d.a(this.c, arr_g1$d, arr_g1$d1));
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.set(j.j);
            io.reactivex.internal.subscriptions.j.a(this);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(io.reactivex.internal.subscriptions.j.h(this, e0)) {
                this.c();
                d[] arr_g1$d = (d[])this.c.get();
                for(int v = 0; v < arr_g1$d.length; ++v) {
                    this.a.d(arr_g1$d[v]);
                }
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(!this.b) {
                this.b = true;
                this.a.a();
                d[] arr_g1$d = (d[])this.c.getAndSet(j.j);
                for(int v = 0; v < arr_g1$d.length; ++v) {
                    this.a.d(arr_g1$d[v]);
                }
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(!this.b) {
                this.b = true;
                this.a.c(throwable0);
                d[] arr_g1$d = (d[])this.c.getAndSet(j.j);
                for(int v = 0; v < arr_g1$d.length; ++v) {
                    this.a.d(arr_g1$d[v]);
                }
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(!this.b) {
                this.a.b(object0);
                d[] arr_g1$d = (d[])this.c.get();
                for(int v = 0; v < arr_g1$d.length; ++v) {
                    this.a.d(arr_g1$d[v]);
                }
            }
        }
    }

    static final class k implements Callable {
        private final int a;
        private final long b;
        private final TimeUnit c;
        private final J d;

        k(int v, long v1, TimeUnit timeUnit0, J j0) {
            this.a = v;
            this.b = v1;
            this.c = timeUnit0;
            this.d = j0;
        }

        public io.reactivex.internal.operators.flowable.g1.g a() {
            return new io.reactivex.internal.operators.flowable.g1.l(this.a, this.b, this.c, this.d);
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    static final class io.reactivex.internal.operators.flowable.g1.l extends io.reactivex.internal.operators.flowable.g1.a {
        final J e;
        final long f;
        final TimeUnit g;
        final int h;
        private static final long i = 0x2FFD21F3BEA38AACL;

        io.reactivex.internal.operators.flowable.g1.l(int v, long v1, TimeUnit timeUnit0, J j0) {
            this.e = j0;
            this.h = v;
            this.f = v1;
            this.g = timeUnit0;
        }

        @Override  // io.reactivex.internal.operators.flowable.g1$a
        Object g(Object object0) {
            return new io.reactivex.schedulers.d(object0, this.e.e(this.g), this.g);
        }

        @Override  // io.reactivex.internal.operators.flowable.g1$a
        f h() {
            f g1$f2;
            long v = this.e.e(this.g) - this.f;
            f g1$f0 = (f)this.get();
            for(f g1$f1 = (f)g1$f0.get(); true; g1$f1 = (f)g1$f0.get()) {
                g1$f2 = g1$f0;
                g1$f0 = g1$f1;
                if(g1$f0 == null) {
                    break;
                }
                io.reactivex.schedulers.d d0 = (io.reactivex.schedulers.d)g1$f0.a;
                if(q.l(d0.d()) || q.n(d0.d()) || d0.a() > v) {
                    break;
                }
            }
            return g1$f2;
        }

        @Override  // io.reactivex.internal.operators.flowable.g1$a
        Object k(Object object0) {
            return ((io.reactivex.schedulers.d)object0).d();
        }

        @Override  // io.reactivex.internal.operators.flowable.g1$a
        void p() {
            f g1$f2;
            long v = this.e.e(this.g) - this.f;
            f g1$f0 = (f)this.get();
            f g1$f1 = (f)g1$f0.get();
            int v1 = 0;
            while(true) {
                g1$f2 = g1$f0;
                g1$f0 = g1$f1;
                if(g1$f0 == null) {
                    break;
                }
                int v2 = this.b;
                if(v2 > this.h && v2 > 1) {
                    ++v1;
                    this.b = v2 - 1;
                }
                else {
                    if(((io.reactivex.schedulers.d)g1$f0.a).a() > v) {
                        break;
                    }
                    ++v1;
                    --this.b;
                }
                g1$f1 = (f)g1$f0.get();
            }
            if(v1 != 0) {
                this.n(g1$f2);
            }
        }

        @Override  // io.reactivex.internal.operators.flowable.g1$a
        void q() {
            f g1$f2;
            long v = this.e.e(this.g) - this.f;
            f g1$f0 = (f)this.get();
            f g1$f1 = (f)g1$f0.get();
            int v1 = 0;
            while(true) {
                g1$f2 = g1$f0;
                g1$f0 = g1$f1;
                if(g1$f0 == null || this.b <= 1 || ((io.reactivex.schedulers.d)g1$f0.a).a() > v) {
                    break;
                }
                ++v1;
                --this.b;
                g1$f1 = (f)g1$f0.get();
            }
            if(v1 != 0) {
                this.n(g1$f2);
            }
        }
    }

    static final class m extends io.reactivex.internal.operators.flowable.g1.a {
        final int e;
        private static final long f = 0xAE25160E83344772L;

        m(int v) {
            this.e = v;
        }

        @Override  // io.reactivex.internal.operators.flowable.g1$a
        void p() {
            if(this.b > this.e) {
                this.l();
            }
        }
    }

    static final class n extends ArrayList implements io.reactivex.internal.operators.flowable.g1.g {
        volatile int a;
        private static final long b = 0x62057D556FA2A2D8L;

        n(int v) {
            super(v);
        }

        @Override  // io.reactivex.internal.operators.flowable.g1$g
        public void a() {
            this.add(q.e());
            ++this.a;
        }

        @Override  // io.reactivex.internal.operators.flowable.g1$g
        public void b(Object object0) {
            this.add(object0);
            ++this.a;
        }

        @Override  // io.reactivex.internal.operators.flowable.g1$g
        public void c(Throwable throwable0) {
            this.add(q.g(throwable0));
            ++this.a;
        }

        @Override  // io.reactivex.internal.operators.flowable.g1$g
        public void d(d g1$d0) {
            __monitor_enter(g1$d0);
            if(g1$d0.e) {
                g1$d0.f = true;
                __monitor_exit(g1$d0);
                return;
            }
            g1$d0.e = true;
            __monitor_exit(g1$d0);
            org.reactivestreams.d d0 = g1$d0.b;
            while(true) {
                if(g1$d0.a()) {
                    return;
                }
                int v = this.a;
                Integer integer0 = (Integer)g1$d0.b();
                int v1 = integer0 == null ? 0 : ((int)integer0);
                long v2 = g1$d0.get();
                long v3 = v2;
                long v4;
                for(v4 = 0L; v3 != 0L && v1 < v; ++v4) {
                    Object object0 = this.get(v1);
                    try {
                        if(q.b(object0, d0)) {
                            return;
                        }
                    }
                    catch(Throwable throwable0) {
                        b.b(throwable0);
                        g1$d0.dispose();
                        if(!q.n(object0) && !q.l(object0)) {
                            d0.onError(throwable0);
                        }
                        return;
                    }
                    if(g1$d0.a()) {
                        return;
                    }
                    ++v1;
                    --v3;
                }
                if(v4 != 0L) {
                    g1$d0.c = v1;
                    if(v2 != 0x7FFFFFFFFFFFFFFFL) {
                        g1$d0.c(v4);
                    }
                }
                synchronized(g1$d0) {
                    if(!g1$d0.f) {
                        g1$d0.e = false;
                        return;
                    }
                    g1$d0.f = false;
                }
            }
        }
    }

    final l b;
    final AtomicReference c;
    final Callable d;
    final org.reactivestreams.c e;
    static final Callable f;

    static {
        g1.f = new c();
    }

    private g1(org.reactivestreams.c c0, l l0, AtomicReference atomicReference0, Callable callable0) {
        this.e = c0;
        this.b = l0;
        this.c = atomicReference0;
        this.d = callable0;
    }

    @Override  // io.reactivex.flowables.a
    public void S8(e3.g g0) {
        io.reactivex.internal.operators.flowable.g1.g g1$g0;
        j g1$j0;
        while(true) {
            g1$j0 = (j)this.c.get();
            if(g1$j0 != null && !g1$j0.a()) {
                break;
            }
            try {
                g1$g0 = (io.reactivex.internal.operators.flowable.g1.g)this.d.call();
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                throw io.reactivex.internal.util.k.f(throwable0);
            }
            j g1$j1 = new j(g1$g0);
            if(androidx.compose.animation.core.d.a(this.c, g1$j0, g1$j1)) {
                g1$j0 = g1$j1;
                break;
            }
        }
        boolean z = !g1$j0.d.get() && g1$j0.d.compareAndSet(false, true);
        try {
            g0.accept(g1$j0);
        }
        catch(Throwable throwable1) {
            if(z) {
                g1$j0.d.compareAndSet(true, false);
            }
            b.b(throwable1);
            throw io.reactivex.internal.util.k.f(throwable1);
        }
        if(z) {
            this.b.l6(g1$j0);
        }
    }

    public static a a9(l l0, int v) {
        return v == 0x7FFFFFFF ? g1.e9(l0) : g1.d9(l0, new io.reactivex.internal.operators.flowable.g1.h(v));
    }

    public static a b9(l l0, long v, TimeUnit timeUnit0, J j0) {
        return g1.c9(l0, v, timeUnit0, j0, 0x7FFFFFFF);
    }

    public static a c9(l l0, long v, TimeUnit timeUnit0, J j0, int v1) {
        return g1.d9(l0, new k(v1, v, timeUnit0, j0));
    }

    static a d9(l l0, Callable callable0) {
        AtomicReference atomicReference0 = new AtomicReference();
        return io.reactivex.plugins.a.T(new g1(new i(atomicReference0, callable0), l0, atomicReference0, callable0));
    }

    public static a e9(l l0) {
        return g1.d9(l0, g1.f);
    }

    @Override  // io.reactivex.internal.disposables.g
    public void f(io.reactivex.disposables.c c0) {
        androidx.compose.animation.core.d.a(this.c, ((j)c0), null);
    }

    public static l f9(Callable callable0, o o0) {
        return new io.reactivex.internal.operators.flowable.g1.e(callable0, o0);
    }

    public static a g9(a a0, J j0) {
        return io.reactivex.plugins.a.T(new io.reactivex.internal.operators.flowable.g1.b(a0, a0.n4(j0)));
    }

    @Override  // io.reactivex.l
    protected void m6(org.reactivestreams.d d0) {
        this.e.e(d0);
    }

    @Override  // f3.h
    public org.reactivestreams.c source() {
        return this.b;
    }
}

