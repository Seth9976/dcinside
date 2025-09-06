package bolts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class j {
    public class p extends k {
        final j b;

    }

    public interface q {
        void a(j arg1, m arg2);
    }

    private final Object a;
    private boolean b;
    private boolean c;
    private Object d;
    private Exception e;
    private boolean f;
    private l g;
    private List h;
    public static final ExecutorService i;
    private static final Executor j;
    public static final Executor k;
    private static volatile q l;
    private static j m;
    private static j n;
    private static j o;
    private static j p;

    static {
        j.i = c.a();
        j.j = c.b();
        j.k = b.d();
        j.m = new j(null);
        j.n = new j(Boolean.TRUE);
        j.o = new j(Boolean.FALSE);
        j.p = new j(true);
    }

    j() {
        this.a = new Object();
        this.h = new ArrayList();
    }

    private j(Object object0) {
        this.a = new Object();
        this.h = new ArrayList();
        this.X(object0);
    }

    private j(boolean z) {
        this.a = new Object();
        this.h = new ArrayList();
        if(z) {
            this.V();
            return;
        }
        this.X(null);
    }

    public static j A(long v, d d0) {
        return j.B(v, c.d(), d0);
    }

    static j B(long v, ScheduledExecutorService scheduledExecutorService0, d d0) {
        static final class g implements Runnable {
            final k a;

            g(k k0) {
                this.a = k0;
                super();
            }

            @Override
            public void run() {
                this.a.g(null);
            }
        }


        static final class h implements Runnable {
            final ScheduledFuture a;
            final k b;

            h(ScheduledFuture scheduledFuture0, k k0) {
                this.a = scheduledFuture0;
                this.b = k0;
                super();
            }

            @Override
            public void run() {
                this.a.cancel(true);
                this.b.e();
            }
        }

        if(d0 != null && d0.a()) {
            return j.i();
        }
        if(v <= 0L) {
            return j.D(null);
        }
        k k0 = new k();
        ScheduledFuture scheduledFuture0 = scheduledExecutorService0.schedule(new g(k0), v, TimeUnit.MILLISECONDS);
        if(d0 != null) {
            d0.b(new h(scheduledFuture0, k0));
        }
        return k0.a();
    }

    public static j C(Exception exception0) {
        k k0 = new k();
        k0.c(exception0);
        return k0.a();
    }

    public static j D(Object object0) {
        if(object0 == null) {
            return j.m;
        }
        if(object0 instanceof Boolean) {
            return ((Boolean)object0).booleanValue() ? j.n : j.o;
        }
        k k0 = new k();
        k0.d(object0);
        return k0.a();
    }

    public Exception E() {
        synchronized(this.a) {
            if(this.e != null) {
                this.f = true;
                l l0 = this.g;
                if(l0 != null) {
                    l0.a();
                    this.g = null;
                }
            }
            return this.e;
        }
    }

    public Object F() {
        synchronized(this.a) {
        }
        return this.d;
    }

    public static q G() {
        return j.l;
    }

    public boolean H() {
        synchronized(this.a) {
        }
        return this.c;
    }

    public boolean I() {
        synchronized(this.a) {
        }
        return this.b;
    }

    public boolean J() {
        synchronized(this.a) {
            return this.E() != null;
        }
    }

    public j K() {
        class i implements bolts.h {
            final j a;

            @Override  // bolts.h
            public Object a(j j0) throws Exception {
                return this.b(j0);
            }

            public j b(j j0) throws Exception {
                if(j0.H()) {
                    return j.i();
                }
                return j0.J() ? j.C(j0.E()) : j.D(null);
            }
        }

        return this.u(new i(this));
    }

    public j L(bolts.h h0) {
        return this.O(h0, j.j, null);
    }

    public j M(bolts.h h0, d d0) {
        return this.O(h0, j.j, d0);
    }

    public j N(bolts.h h0, Executor executor0) {
        return this.O(h0, executor0, null);
    }

    public j O(bolts.h h0, Executor executor0, d d0) {
        class bolts.j.c implements bolts.h {
            final d a;
            final bolts.h b;
            final j c;

            bolts.j.c(d d0, bolts.h h0) {
                this.a = d0;
                this.b = h0;
                super();
            }

            @Override  // bolts.h
            public Object a(j j0) throws Exception {
                return this.b(j0);
            }

            public j b(j j0) {
                if(this.a != null && this.a.a()) {
                    return j.i();
                }
                if(j0.J()) {
                    return j.C(j0.E());
                }
                return j0.H() ? j.i() : j0.q(this.b);
            }
        }

        return this.w(new bolts.j.c(this, d0, h0), executor0);
    }

    public j P(bolts.h h0) {
        return this.R(h0, j.j);
    }

    public j Q(bolts.h h0, d d0) {
        return this.S(h0, j.j, d0);
    }

    public j R(bolts.h h0, Executor executor0) {
        return this.S(h0, executor0, null);
    }

    public j S(bolts.h h0, Executor executor0, d d0) {
        class bolts.j.d implements bolts.h {
            final d a;
            final bolts.h b;
            final j c;

            bolts.j.d(d d0, bolts.h h0) {
                this.a = d0;
                this.b = h0;
                super();
            }

            @Override  // bolts.h
            public Object a(j j0) throws Exception {
                return this.b(j0);
            }

            public j b(j j0) {
                if(this.a != null && this.a.a()) {
                    return j.i();
                }
                if(j0.J()) {
                    return j.C(j0.E());
                }
                return j0.H() ? j.i() : j0.u(this.b);
            }
        }

        return this.w(new bolts.j.d(this, d0, h0), executor0);
    }

    private void T() {
        synchronized(this.a) {
            for(Object object1: this.h) {
                bolts.h h0 = (bolts.h)object1;
                try {
                    h0.a(this);
                }
                catch(RuntimeException runtimeException0) {
                    throw runtimeException0;
                }
                catch(Exception exception0) {
                    throw new RuntimeException(exception0);
                }
            }
            this.h = null;
        }
    }

    public static void U(q j$q0) {
        j.l = j$q0;
    }

    boolean V() {
        synchronized(this.a) {
            if(this.b) {
                return false;
            }
            this.b = true;
            this.c = true;
            this.a.notifyAll();
            this.T();
            return true;
        }
    }

    boolean W(Exception exception0) {
        synchronized(this.a) {
            if(this.b) {
                return false;
            }
            this.b = true;
            this.e = exception0;
            this.f = false;
            this.a.notifyAll();
            this.T();
            if(!this.f && j.G() != null) {
                this.g = new l(this);
            }
            return true;
        }
    }

    boolean X(Object object0) {
        synchronized(this.a) {
            if(this.b) {
                return false;
            }
            this.b = true;
            this.d = object0;
            this.a.notifyAll();
            this.T();
            return true;
        }
    }

    public void Y() throws InterruptedException {
        synchronized(this.a) {
            if(!this.I()) {
                this.a.wait();
            }
        }
    }

    public boolean Z(long v, TimeUnit timeUnit0) throws InterruptedException {
        synchronized(this.a) {
            if(!this.I()) {
                long v2 = timeUnit0.toMillis(v);
                this.a.wait(v2);
            }
        }
        return this.I();
    }

    public static j a0(Collection collection0) {
        static final class n implements bolts.h {
            final Object a;
            final ArrayList b;
            final AtomicBoolean c;
            final AtomicInteger d;
            final k e;

            n(Object object0, ArrayList arrayList0, AtomicBoolean atomicBoolean0, AtomicInteger atomicInteger0, k k0) {
                this.a = object0;
                this.b = arrayList0;
                this.c = atomicBoolean0;
                this.d = atomicInteger0;
                this.e = k0;
                super();
            }

            @Override  // bolts.h
            public Object a(j j0) throws Exception {
                return this.b(j0);
            }

            public Void b(j j0) {
                if(j0.J()) {
                    synchronized(this.a) {
                        Exception exception0 = j0.E();
                        this.b.add(exception0);
                    }
                }
                if(j0.H()) {
                    this.c.set(true);
                }
                if(this.d.decrementAndGet() == 0) {
                    switch(this.b.size()) {
                        case 0: {
                            if(this.c.get()) {
                                this.e.b();
                                return null;
                            }
                            this.e.d(null);
                            break;
                        }
                        case 1: {
                            Exception exception1 = (Exception)this.b.get(0);
                            this.e.c(exception1);
                            return null;
                        }
                        default: {
                            a a0 = new a(String.format("There were %d exceptions.", this.b.size()), this.b);
                            this.e.c(a0);
                            return null;
                        }
                    }
                }
                return null;
            }
        }

        if(collection0.size() == 0) {
            return j.D(null);
        }
        k k0 = new k();
        ArrayList arrayList0 = new ArrayList();
        Object object0 = new Object();
        AtomicInteger atomicInteger0 = new AtomicInteger(collection0.size());
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        for(Object object1: collection0) {
            ((j)object1).q(new n(object0, arrayList0, atomicBoolean0, atomicInteger0, k0));
        }
        return k0.a();
    }

    public static j b0(Collection collection0) {
        static final class bolts.j.m implements bolts.h {
            final Collection a;

            bolts.j.m(Collection collection0) {
                this.a = collection0;
                super();
            }

            @Override  // bolts.h
            public Object a(j j0) throws Exception {
                return this.b(j0);
            }

            public List b(j j0) throws Exception {
                if(this.a.size() == 0) {
                    return Collections.emptyList();
                }
                List list0 = new ArrayList();
                for(Object object0: this.a) {
                    list0.add(((j)object0).F());
                }
                return list0;
            }
        }

        return j.a0(collection0).L(new bolts.j.m(collection0));
    }

    public static j c(Callable callable0) {
        return j.f(callable0, j.j, null);
    }

    public static j c0(Collection collection0) {
        static final class bolts.j.l implements bolts.h {
            final AtomicBoolean a;
            final k b;

            bolts.j.l(AtomicBoolean atomicBoolean0, k k0) {
                this.a = atomicBoolean0;
                this.b = k0;
                super();
            }

            @Override  // bolts.h
            public Object a(j j0) throws Exception {
                return this.b(j0);
            }

            public Void b(j j0) {
                if(this.a.compareAndSet(false, true)) {
                    this.b.d(j0);
                    return null;
                }
                j0.E();
                return null;
            }
        }

        if(collection0.size() == 0) {
            return j.D(null);
        }
        k k0 = new k();
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        for(Object object0: collection0) {
            ((j)object0).q(new bolts.j.l(atomicBoolean0, k0));
        }
        return k0.a();
    }

    public static j d(Callable callable0, d d0) {
        return j.f(callable0, j.j, d0);
    }

    public static j d0(Collection collection0) {
        static final class bolts.j.k implements bolts.h {
            final AtomicBoolean a;
            final k b;

            bolts.j.k(AtomicBoolean atomicBoolean0, k k0) {
                this.a = atomicBoolean0;
                this.b = k0;
                super();
            }

            @Override  // bolts.h
            public Object a(j j0) throws Exception {
                return this.b(j0);
            }

            public Void b(j j0) {
                if(this.a.compareAndSet(false, true)) {
                    this.b.d(j0);
                    return null;
                }
                j0.E();
                return null;
            }
        }

        if(collection0.size() == 0) {
            return j.D(null);
        }
        k k0 = new k();
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        for(Object object0: collection0) {
            ((j)object0).q(new bolts.j.k(atomicBoolean0, k0));
        }
        return k0.a();
    }

    public static j e(Callable callable0, Executor executor0) {
        return j.f(callable0, executor0, null);
    }

    public static j f(Callable callable0, Executor executor0, d d0) {
        static final class bolts.j.j implements Runnable {
            final d a;
            final k b;
            final Callable c;

            bolts.j.j(d d0, k k0, Callable callable0) {
                this.a = d0;
                this.b = k0;
                this.c = callable0;
                super();
            }

            @Override
            public void run() {
                if(this.a != null && this.a.a()) {
                    this.b.b();
                    return;
                }
                try {
                    Object object0 = this.c.call();
                    this.b.d(object0);
                }
                catch(CancellationException unused_ex) {
                    this.b.b();
                }
                catch(Exception exception0) {
                    this.b.c(exception0);
                }
            }
        }

        k k0 = new k();
        try {
            executor0.execute(new bolts.j.j(d0, k0, callable0));
            return k0.a();
        }
        catch(Exception exception0) {
            k0.c(new bolts.i(exception0));
            return k0.a();
        }
    }

    public static j g(Callable callable0) {
        return j.f(callable0, j.i, null);
    }

    public static j h(Callable callable0, d d0) {
        return j.f(callable0, j.i, d0);
    }

    public static j i() {
        return j.p;
    }

    public j j() {
        return this;
    }

    private static void k(k k0, bolts.h h0, j j0, Executor executor0, d d0) {
        static final class f implements Runnable {
            final d a;
            final k b;
            final bolts.h c;
            final j d;

            f(d d0, k k0, bolts.h h0, j j0) {
                this.a = d0;
                this.b = k0;
                this.c = h0;
                this.d = j0;
                super();
            }

            @Override
            public void run() {
                class bolts.j.f.a implements bolts.h {
                    final f a;

                    @Override  // bolts.h
                    public Object a(j j0) throws Exception {
                        return this.b(j0);
                    }

                    public Void b(j j0) {
                        d d0 = f.this.a;
                        if(d0 != null && d0.a()) {
                            f.this.b.b();
                            return null;
                        }
                        if(j0.H()) {
                            f.this.b.b();
                            return null;
                        }
                        if(j0.J()) {
                            Exception exception0 = j0.E();
                            f.this.b.c(exception0);
                            return null;
                        }
                        Object object0 = j0.F();
                        f.this.b.d(object0);
                        return null;
                    }
                }

                if(this.a != null && this.a.a()) {
                    this.b.b();
                    return;
                }
                try {
                    j j0 = (j)this.c.a(this.d);
                    if(j0 == null) {
                        this.b.d(null);
                        return;
                    }
                    j0.q(new bolts.j.f.a(this));
                    return;
                }
                catch(CancellationException unused_ex) {
                }
                catch(Exception exception0) {
                    this.b.c(exception0);
                    return;
                }
                this.b.b();
            }
        }

        try {
            executor0.execute(new f(d0, k0, h0, j0));
        }
        catch(Exception exception0) {
            k0.c(new bolts.i(exception0));
        }
    }

    private static void l(k k0, bolts.h h0, j j0, Executor executor0, d d0) {
        static final class e implements Runnable {
            final d a;
            final k b;
            final bolts.h c;
            final j d;

            e(d d0, k k0, bolts.h h0, j j0) {
                this.a = d0;
                this.b = k0;
                this.c = h0;
                this.d = j0;
                super();
            }

            @Override
            public void run() {
                if(this.a != null && this.a.a()) {
                    this.b.b();
                    return;
                }
                try {
                    Object object0 = this.c.a(this.d);
                    this.b.d(object0);
                }
                catch(CancellationException unused_ex) {
                    this.b.b();
                }
                catch(Exception exception0) {
                    this.b.c(exception0);
                }
            }
        }

        try {
            executor0.execute(new e(d0, k0, h0, j0));
        }
        catch(Exception exception0) {
            k0.c(new bolts.i(exception0));
        }
    }

    public j m(Callable callable0, bolts.h h0) {
        return this.p(callable0, h0, j.j, null);
    }

    public j n(Callable callable0, bolts.h h0, d d0) {
        return this.p(callable0, h0, j.j, d0);
    }

    public j o(Callable callable0, bolts.h h0, Executor executor0) {
        return this.p(callable0, h0, executor0, null);
    }

    public j p(Callable callable0, bolts.h h0, Executor executor0, d d0) {
        class o implements bolts.h {
            final d a;
            final Callable b;
            final bolts.h c;
            final Executor d;
            final bolts.g e;
            final j f;

            o(d d0, Callable callable0, bolts.h h0, Executor executor0, bolts.g g0) {
                this.a = d0;
                this.b = callable0;
                this.c = h0;
                this.d = executor0;
                this.e = g0;
                super();
            }

            @Override  // bolts.h
            public Object a(j j0) throws Exception {
                return this.b(j0);
            }

            public j b(j j0) throws Exception {
                if(this.a != null && this.a.a()) {
                    return j.i();
                }
                return ((Boolean)this.b.call()).booleanValue() ? j.D(null).R(this.c, this.d).R(((bolts.h)this.e.a()), this.d) : j.D(null);
            }
        }

        bolts.g g0 = new bolts.g();
        g0.b(new o(this, d0, callable0, h0, executor0, g0));
        return this.K().w(((bolts.h)g0.a()), executor0);
    }

    public j q(bolts.h h0) {
        return this.t(h0, j.j, null);
    }

    public j r(bolts.h h0, d d0) {
        return this.t(h0, j.j, d0);
    }

    public j s(bolts.h h0, Executor executor0) {
        return this.t(h0, executor0, null);
    }

    public j t(bolts.h h0, Executor executor0, d d0) {
        class bolts.j.a implements bolts.h {
            final k a;
            final bolts.h b;
            final Executor c;
            final d d;
            final j e;

            bolts.j.a(k k0, bolts.h h0, Executor executor0, d d0) {
                this.a = k0;
                this.b = h0;
                this.c = executor0;
                this.d = d0;
                super();
            }

            @Override  // bolts.h
            public Object a(j j0) throws Exception {
                return this.b(j0);
            }

            public Void b(j j0) {
                j.l(this.a, this.b, j0, this.c, this.d);
                return null;
            }
        }

        k k0 = new k();
        synchronized(this.a) {
            boolean z = this.I();
            if(!z) {
                this.h.add(new bolts.j.a(this, k0, h0, executor0, d0));
            }
        }
        if(z) {
            j.l(k0, h0, this, executor0, d0);
        }
        return k0.a();
    }

    public j u(bolts.h h0) {
        return this.x(h0, j.j, null);
    }

    public j v(bolts.h h0, d d0) {
        return this.x(h0, j.j, d0);
    }

    public j w(bolts.h h0, Executor executor0) {
        return this.x(h0, executor0, null);
    }

    public j x(bolts.h h0, Executor executor0, d d0) {
        class bolts.j.b implements bolts.h {
            final k a;
            final bolts.h b;
            final Executor c;
            final d d;
            final j e;

            bolts.j.b(k k0, bolts.h h0, Executor executor0, d d0) {
                this.a = k0;
                this.b = h0;
                this.c = executor0;
                this.d = d0;
                super();
            }

            @Override  // bolts.h
            public Object a(j j0) throws Exception {
                return this.b(j0);
            }

            public Void b(j j0) {
                j.k(this.a, this.b, j0, this.c, this.d);
                return null;
            }
        }

        k k0 = new k();
        synchronized(this.a) {
            boolean z = this.I();
            if(!z) {
                this.h.add(new bolts.j.b(this, k0, h0, executor0, d0));
            }
        }
        if(z) {
            j.k(k0, h0, this, executor0, d0);
        }
        return k0.a();
    }

    public static p y() {
        return new p(new j());
    }

    public static j z(long v) {
        return j.B(v, c.d(), null);
    }
}

