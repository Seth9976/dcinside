package rx.observers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import rx.exceptions.b;
import rx.f;
import rx.h;
import rx.n;

public class j extends n {
    static final class a implements h {
        @Override  // rx.h
        public void d() {
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
        }

        @Override  // rx.h
        public void onNext(Object object0) {
        }
    }

    private final h f;
    private final List g;
    private final List h;
    private int i;
    private final CountDownLatch j;
    private volatile int k;
    private volatile Thread l;
    private static final h m;

    static {
        j.m = new a();
    }

    public j() {
        this(-1L);
    }

    public j(long v) {
        this(j.m, v);
    }

    public j(h h0) {
        this(h0, -1L);
    }

    public j(h h0, long v) {
        this.j = new CountDownLatch(1);
        h0.getClass();
        this.f = h0;
        if(v >= 0L) {
            this.v(v);
        }
        this.g = new ArrayList();
        this.h = new ArrayList();
    }

    public j(n n0) {
        this(n0, -1L);
    }

    public final int I() {
        return this.i;
    }

    public Thread L() {
        return this.l;
    }

    public void Q(Class class0) {
        List list0 = this.h;
        if(list0.isEmpty()) {
            this.k0("No errors");
            return;
        }
        if(list0.size() <= 1) {
            if(class0.isInstance(list0.get(0))) {
                return;
            }
            AssertionError assertionError0 = new AssertionError("Exceptions differ; expected: " + class0 + ", actual: " + list0.get(0));
            assertionError0.initCause(((Throwable)list0.get(0)));
            throw assertionError0;
        }
        AssertionError assertionError1 = new AssertionError("Multiple errors: " + list0.size());
        assertionError1.initCause(new b(list0));
        throw assertionError1;
    }

    public void R(Throwable throwable0) {
        List list0 = this.h;
        if(list0.isEmpty()) {
            this.k0("No errors");
            return;
        }
        if(list0.size() > 1) {
            this.k0("Multiple errors");
            return;
        }
        if(!throwable0.equals(list0.get(0))) {
            this.k0("Exceptions differ; expected: " + throwable0 + ", actual: " + list0.get(0));
        }
    }

    public List S() {
        return this.g;
    }

    private void T(Object object0, int v) {
        Object object1 = this.g.get(v);
        if(object0 == null) {
            if(object1 != null) {
                this.k0("Value at index: " + v + " expected: [null] but was: [" + object1 + "]\n");
            }
        }
        else if(!object0.equals(object1)) {
            this.k0("Value at index: " + v + " expected: [" + object0 + "] (" + object0.getClass().getSimpleName() + ") but was: [" + object1 + "] (" + (object1 == null ? "null" : object1.getClass().getSimpleName()) + ")\n");
        }
    }

    public void Y() {
        if(!this.z().isEmpty()) {
            this.k0("Unexpected onError events");
        }
    }

    public void a0() {
        List list0 = this.h;
        int v = this.i;
        if(!list0.isEmpty() || v > 0) {
            if(list0.isEmpty()) {
                this.k0("Found " + list0.size() + " errors and " + v + " completion events instead of none");
                return;
            }
            if(list0.size() == 1) {
                this.k0("Found " + list0.size() + " errors and " + v + " completion events instead of none");
                return;
            }
            this.k0("Found " + list0.size() + " errors and " + v + " completion events instead of none");
        }
    }

    public void b0() {
        int v = this.g.size();
        if(v != 0) {
            this.k0("No onNext events expected yet some received: " + v);
        }
    }

    public void c0() {
        int v = this.i;
        if(v == 1) {
            this.k0("Completed!");
            return;
        }
        if(v > 1) {
            this.k0("Completed multiple times: " + v);
        }
    }

    @Override  // rx.h
    public void d() {
        try {
            ++this.i;
            this.l = Thread.currentThread();
            this.f.d();
        }
        finally {
            this.j.countDown();
        }
    }

    public void d0(List list0) {
        if(this.g.size() != list0.size()) {
            this.k0("Number of items does not match. Provided: " + list0.size() + "  Actual: " + this.g.size() + ".\nProvided values: " + list0 + "\nActual values: " + this.g + "\n");
        }
        for(int v = 0; v < list0.size(); ++v) {
            this.T(list0.get(v), v);
        }
    }

    public void e0() {
        if(this.h.size() > 1) {
            this.k0("Too many onError events: " + this.h.size());
        }
        if(this.i > 1) {
            this.k0("Too many onCompleted events: " + this.i);
        }
        if(this.i == 1 && this.h.size() == 1) {
            this.k0("Received both an onError and onCompleted. Should be one or the other.");
        }
        if(this.i == 0 && this.h.isEmpty()) {
            this.k0("No terminal events received.");
        }
    }

    public void f0() {
        if(!this.j()) {
            this.k0("Not unsubscribed.");
        }
    }

    public void g0(Object object0) {
        this.d0(Collections.singletonList(object0));
    }

    public final int getValueCount() {
        return this.k;
    }

    public void h0(int v) {
        int v1 = this.g.size();
        if(v1 != v) {
            this.k0("Number of onNext events differ; expected: " + v + ", actual: " + v1);
        }
    }

    public void i0(Object[] arr_object) {
        this.d0(Arrays.asList(arr_object));
    }

    public final void j0(Object object0, Object[] arr_object) {
        this.h0(arr_object.length + 1);
        this.T(object0, 0);
        int v = 0;
        while(v < arr_object.length) {
            Object object1 = arr_object[v];
            ++v;
            this.T(object1, v);
        }
        this.g.clear();
        this.k = 0;
    }

    final void k0(String s) {
        StringBuilder stringBuilder0 = new StringBuilder(s.length() + 0x20);
        stringBuilder0.append(s);
        stringBuilder0.append(" (");
        int v = this.i;
        stringBuilder0.append(v);
        stringBuilder0.append(" completion");
        if(v != 1) {
            stringBuilder0.append('s');
        }
        stringBuilder0.append(')');
        if(!this.h.isEmpty()) {
            int v1 = this.h.size();
            stringBuilder0.append(" (+");
            stringBuilder0.append(v1);
            stringBuilder0.append(" error");
            if(v1 != 1) {
                stringBuilder0.append('s');
            }
            stringBuilder0.append(')');
        }
        AssertionError assertionError0 = new AssertionError(stringBuilder0.toString());
        if(!this.h.isEmpty()) {
            if(this.h.size() == 1) {
                assertionError0.initCause(((Throwable)this.h.get(0)));
            }
            else {
                assertionError0.initCause(new b(this.h));
            }
        }
        throw assertionError0;
    }

    public void l0() {
        try {
            this.j.await();
        }
        catch(InterruptedException interruptedException0) {
            throw new IllegalStateException("Interrupted", interruptedException0);
        }
    }

    public void m0(long v, TimeUnit timeUnit0) {
        try {
            this.j.await(v, timeUnit0);
        }
        catch(InterruptedException interruptedException0) {
            throw new IllegalStateException("Interrupted", interruptedException0);
        }
    }

    public void n0(long v, TimeUnit timeUnit0) {
        try {
            if(!this.j.await(v, timeUnit0)) {
                this.l();
            }
        }
        catch(InterruptedException unused_ex) {
            this.l();
        }
    }

    public final boolean o0(int v, long v1, TimeUnit timeUnit0) {
        while(v1 != 0L && this.k < v) {
            try {
                timeUnit0.sleep(1L);
                --v1;
            }
            catch(InterruptedException interruptedException0) {
                throw new IllegalStateException("Interrupted", interruptedException0);
            }
        }
        return this.k >= v;
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        try {
            this.l = Thread.currentThread();
            this.h.add(throwable0);
            this.f.onError(throwable0);
        }
        finally {
            this.j.countDown();
        }
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        this.l = Thread.currentThread();
        this.g.add(object0);
        this.k = this.g.size();
        this.f.onNext(object0);
    }

    public static j p0() {
        return new j();
    }

    public static j q0(long v) {
        return new j(v);
    }

    public static j r0(h h0) {
        return new j(h0);
    }

    public static j s0(h h0, long v) {
        return new j(h0, v);
    }

    public static j t0(n n0) {
        return new j(n0);
    }

    @Deprecated
    public List u0() {
        int v = this.i;
        List list0 = new ArrayList((v == 0 ? 1 : v));
        for(int v1 = 0; v1 < v; ++v1) {
            list0.add(f.b());
        }
        return list0;
    }

    public void v0(long v) {
        this.v(v);
    }

    public void x() {
        int v = this.i;
        if(v == 0) {
            this.k0("Not completed!");
            return;
        }
        if(v > 1) {
            this.k0("Completed multiple times: " + v);
        }
    }

    public List z() {
        return this.h;
    }
}

