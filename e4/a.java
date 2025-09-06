package E4;

import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.i;
import rx.n;
import rx.observers.j;

public class a extends n implements rx.observers.a {
    private final j f;

    public a(j j0) {
        this.f = j0;
    }

    @Override  // rx.observers.a
    public rx.observers.a A(long v, TimeUnit timeUnit0) {
        this.f.n0(v, timeUnit0);
        return this;
    }

    @Override  // rx.observers.a
    public final rx.observers.a B(int v, long v1, TimeUnit timeUnit0) {
        if(!this.f.o0(v, v1, timeUnit0)) {
            throw new AssertionError("Did not receive enough values in time. Expected: " + v + ", Actual: " + this.f.getValueCount());
        }
        return this;
    }

    @Override  // rx.observers.a
    public rx.observers.a C() {
        this.f.c0();
        return this;
    }

    @Override  // rx.observers.a
    public rx.observers.a D(List list0) {
        this.f.d0(list0);
        return this;
    }

    @Override  // rx.observers.a
    public rx.observers.a E(Throwable throwable0) {
        this.f.R(throwable0);
        return this;
    }

    @Override  // rx.observers.a
    public rx.observers.a F(Object object0) {
        this.f.g0(object0);
        return this;
    }

    @Override  // rx.observers.a
    public rx.observers.a G() {
        this.f.f0();
        return this;
    }

    @Override  // rx.observers.a
    public rx.observers.a H(Object[] arr_object) {
        this.f.i0(arr_object);
        return this;
    }

    @Override  // rx.observers.a
    public final int I() {
        return this.f.I();
    }

    @Override  // rx.observers.a
    public rx.observers.a J(long v) {
        this.f.v0(v);
        return this;
    }

    @Override  // rx.observers.a
    public final rx.observers.a K(Class class0, String s, Object[] arr_object) {
        this.f.i0(arr_object);
        this.f.Q(class0);
        this.f.c0();
        String s1 = ((Throwable)this.f.z().get(0)).getMessage();
        if(s1 != s && (s == null || !s.equals(s1))) {
            throw new AssertionError("Error message differs. Expected: \'" + s + "\', Received: \'" + s1 + "\'");
        }
        return this;
    }

    @Override  // rx.observers.a
    public Thread L() {
        return this.f.L();
    }

    @Override  // rx.observers.a
    public rx.observers.a M(Class class0) {
        this.f.Q(class0);
        return this;
    }

    @Override  // rx.observers.a
    public rx.observers.a N() {
        this.f.b0();
        return this;
    }

    @Override  // rx.observers.a
    public rx.observers.a O() {
        this.f.x();
        return this;
    }

    @Override  // rx.observers.a
    public rx.observers.a P() {
        this.f.a0();
        return this;
    }

    @Override  // rx.observers.a
    public List S() {
        return this.f.S();
    }

    @Override  // rx.observers.a
    public rx.observers.a U(int v) {
        this.f.h0(v);
        return this;
    }

    @Override  // rx.observers.a
    public rx.observers.a V(long v, TimeUnit timeUnit0) {
        this.f.m0(v, timeUnit0);
        return this;
    }

    @Override  // rx.observers.a
    public final rx.observers.a W(Class class0, Object[] arr_object) {
        this.f.i0(arr_object);
        this.f.Q(class0);
        this.f.c0();
        return this;
    }

    @Override  // rx.n, rx.observers.a
    public void X(i i0) {
        this.f.X(i0);
    }

    @Override  // rx.observers.a
    public final rx.observers.a Z(rx.functions.a a0) {
        a0.call();
        return this;
    }

    @Override  // rx.h
    public void d() {
        this.f.d();
    }

    @Override  // rx.observers.a
    public final int getValueCount() {
        return this.f.getValueCount();
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        this.f.onError(throwable0);
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        this.f.onNext(object0);
    }

    @Override  // rx.n, rx.observers.a
    public void onStart() {
        this.f.onStart();
    }

    @Override  // rx.observers.a
    public rx.observers.a r() {
        this.f.l0();
        return this;
    }

    @Override  // rx.observers.a
    public final rx.observers.a s(Object object0, Object[] arr_object) {
        this.f.j0(object0, arr_object);
        return this;
    }

    @Override
    public String toString() {
        return this.f.toString();
    }

    @Override  // rx.observers.a
    public final rx.observers.a u(Object[] arr_object) {
        this.f.i0(arr_object);
        this.f.Y();
        this.f.x();
        return this;
    }

    @Override  // rx.observers.a
    public rx.observers.a w() {
        this.f.e0();
        return this;
    }

    public static a x(long v) {
        j j0 = new j(v);
        a a0 = new a(j0);
        a0.q(j0);
        return a0;
    }

    @Override  // rx.observers.a
    public rx.observers.a y() {
        this.f.Y();
        return this;
    }

    @Override  // rx.observers.a
    public List z() {
        return this.f.z();
    }
}

