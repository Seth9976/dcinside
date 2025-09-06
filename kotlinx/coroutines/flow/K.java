package kotlinx.coroutines.flow;

import A3.a;
import A3.o;
import A3.p;
import A3.q;
import A3.s;
import A3.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.b0;
import kotlin.b;
import kotlin.c0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.channels.F;
import kotlinx.coroutines.x0;
import kotlinx.coroutines.y0;
import y4.l;
import y4.m;

public final class k {
    @l
    public static final String a = "kotlinx.coroutines.flow.defaultConcurrency";

    @m
    public static final Object A(@l i i0, @l o o0, @l d d0) {
        return n.f(i0, o0, d0);
    }

    @x0
    @l
    public static final i A0(@l i i0, @l o o0) {
        return w.a(i0, o0);
    }

    @y0
    @l
    public static final i A1(@l i i0, long v) {
        return r.g(i0, v);
    }

    @m
    public static final Object B(@l i i0, @l o o0, @l d d0) {
        return v.b(i0, o0, d0);
    }

    @x0
    @l
    public static final i B0(@l i i0, @b @l o o0) {
        return w.b(i0, o0);
    }

    @y0
    @l
    public static final i B1(@l i i0, long v) {
        return r.h(i0, v);
    }

    public static final i C(Iterable iterable0, o o0) {
        return B.b(iterable0, o0);
    }

    @x0
    @l
    public static final i C0(@l i i0, int v, @l o o0) {
        return w.c(i0, v, o0);
    }

    @l
    public static final i C1(@l i i0, Object object0, @b @l p p0) {
        return A.k(i0, object0, p0);
    }

    @l
    public static final i D(@l i i0, @l i i1, @l p p0) {
        return B.c(i0, i1, p0);
    }

    public static i D0(i i0, int v, o o0, int v1, Object object0) {
        return w.d(i0, v, o0, v1, object0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow has less verbose \'scan\' shortcut", replaceWith = @c0(expression = "scan(initial, operation)", imports = {}))
    @l
    public static final i D1(@l i i0, Object object0, @b @l p p0) {
        return x.B(i0, object0, p0);
    }

    @l
    public static final i E(@l i i0, @l i i1, @l i i2, @b @l q q0) {
        return B.d(i0, i1, i2, q0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'flatten\' is \'flattenConcat\'", replaceWith = @c0(expression = "flattenConcat()", imports = {}))
    @l
    public static final i E0(@l i i0) {
        return x.m(i0);
    }

    @kotlin.k(level = kotlin.m.b, message = "\'scanReduce\' was renamed to \'runningReduce\' to be consistent with Kotlin standard library", replaceWith = @c0(expression = "runningReduce(operation)", imports = {}))
    @l
    public static final i E1(@l i i0, @l p p0) {
        return x.C(i0, p0);
    }

    @l
    public static final i F(@l i i0, @l i i1, @l i i2, @l i i3, @l A3.r r0) {
        return B.e(i0, i1, i2, i3, r0);
    }

    @x0
    @l
    public static final i F0(@l i i0) {
        return w.e(i0);
    }

    @l
    public static final I F1(@l i i0, @l O o0, @l kotlinx.coroutines.flow.O o1, int v) {
        return z.g(i0, o0, o1, v);
    }

    @l
    public static final i G(@l i i0, @l i i1, @l i i2, @l i i3, @l i i4, @l s s0) {
        return B.f(i0, i1, i2, i3, i4, s0);
    }

    @x0
    @l
    public static final i G0(@l i i0, int v) {
        return w.f(i0, v);
    }

    public static I G1(i i0, O o0, kotlinx.coroutines.flow.O o1, int v, int v1, Object object0) {
        return z.h(i0, o0, o1, v, v1, object0);
    }

    public static final i H(i[] arr_i, o o0) {
        return B.g(arr_i, o0);
    }

    public static i H0(i i0, int v, int v1, Object object0) {
        return w.g(i0, v, v1, object0);
    }

    @m
    public static final Object H1(@l i i0, @l d d0) {
        return y.j(i0, d0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'combineLatest\' is \'combine\'", replaceWith = @c0(expression = "this.combine(other, transform)", imports = {}))
    @l
    public static final i I(@l i i0, @l i i1, @l p p0) {
        return x.b(i0, i1, p0);
    }

    @l
    public static final i I0(@b @l o o0) {
        return kotlinx.coroutines.flow.l.n(o0);
    }

    @m
    public static final Object I1(@l i i0, @l d d0) {
        return y.k(i0, d0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'combineLatest\' is \'combine\'", replaceWith = @c0(expression = "combine(this, other, other2, transform)", imports = {}))
    @l
    public static final i J(@l i i0, @l i i1, @l i i2, @l q q0) {
        return x.c(i0, i1, i2, q0);
    }

    @l
    @z3.i(name = "flowCombine")
    public static final i J0(@l i i0, @l i i1, @l p p0) {
        return B.p(i0, i1, p0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'skip\' is \'drop\'", replaceWith = @c0(expression = "drop(count)", imports = {}))
    @l
    public static final i J1(@l i i0, int v) {
        return x.D(i0, v);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'combineLatest\' is \'combine\'", replaceWith = @c0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @l
    public static final i K(@l i i0, @l i i1, @l i i2, @l i i3, @l A3.r r0) {
        return x.d(i0, i1, i2, i3, r0);
    }

    @l
    @z3.i(name = "flowCombineTransform")
    public static final i K0(@l i i0, @l i i1, @b @l q q0) {
        return B.q(i0, i1, q0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'startWith\' is \'onStart\'. Use \'onStart { emit(value) }\'", replaceWith = @c0(expression = "onStart { emit(value) }", imports = {}))
    @l
    public static final i K1(@l i i0, Object object0) {
        return x.E(i0, object0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'combineLatest\' is \'combine\'", replaceWith = @c0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @l
    public static final i L(@l i i0, @l i i1, @l i i2, @l i i3, @l i i4, @l s s0) {
        return x.e(i0, i1, i2, i3, i4, s0);
    }

    @l
    public static final i L0(Object object0) {
        return kotlinx.coroutines.flow.l.o(object0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'startWith\' is \'onStart\'. Use \'onStart { emitAll(other) }\'", replaceWith = @c0(expression = "onStart { emitAll(other) }", imports = {}))
    @l
    public static final i L1(@l i i0, @l i i1) {
        return x.F(i0, i1);
    }

    public static final i M(Iterable iterable0, @b p p0) {
        return B.h(iterable0, p0);
    }

    @l
    public static final i M0(@l Object[] arr_object) {
        return kotlinx.coroutines.flow.l.p(arr_object);
    }

    @m
    public static final Object M1(@l i i0, @l O o0, @l d d0) {
        return z.i(i0, o0, d0);
    }

    @l
    public static final i N(@l i i0, @l i i1, @b @l q q0) {
        return B.i(i0, i1, q0);
    }

    @l
    public static final i N0(@l i i0, @l g g0) {
        return kotlinx.coroutines.flow.p.h(i0, g0);
    }

    @l
    public static final U N1(@l i i0, @l O o0, @l kotlinx.coroutines.flow.O o1, Object object0) {
        return z.j(i0, o0, o1, object0);
    }

    @l
    public static final i O(@l i i0, @l i i1, @l i i2, @b @l A3.r r0) {
        return B.j(i0, i1, i2, r0);
    }

    @m
    public static final Object O0(@l i i0, Object object0, @l p p0, @l d d0) {
        return y.e(i0, object0, p0, d0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Use \'launchIn\' with \'onEach\', \'onCompletion\' and \'catch\' instead")
    public static final void O1(@l i i0) {
        x.G(i0);
    }

    @l
    public static final i P(@l i i0, @l i i1, @l i i2, @l i i3, @b @l s s0) {
        return B.k(i0, i1, i2, i3, s0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'forEach\' is \'collect\'", replaceWith = @c0(expression = "collect(action)", imports = {}))
    public static final void P0(@l i i0, @l o o0) {
        x.n(i0, o0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Use \'launchIn\' with \'onEach\', \'onCompletion\' and \'catch\' instead")
    public static final void P1(@l i i0, @l o o0) {
        x.H(i0, o0);
    }

    @l
    public static final i Q(@l i i0, @l i i1, @l i i2, @l i i3, @l i i4, @b @l t t0) {
        return B.l(i0, i1, i2, i3, i4, t0);
    }

    // 去混淆评级： 低(20)
    public static final int Q0() {
        return 16;
    }

    @kotlin.k(level = kotlin.m.b, message = "Use \'launchIn\' with \'onEach\', \'onCompletion\' and \'catch\' instead")
    public static final void Q1(@l i i0, @l o o0, @l o o1) {
        x.I(i0, o0, o1);
    }

    public static final i R(i[] arr_i, @b p p0) {
        return B.m(arr_i, p0);
    }

    @y0
    public static void R0() {
    }

    @kotlin.k(level = kotlin.m.b, message = "Use \'flowOn\' instead")
    @l
    public static final i R1(@l i i0, @l g g0) {
        return x.J(i0, g0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'compose\' is \'let\'", replaceWith = @c0(expression = "let(transformer)", imports = {}))
    @l
    public static final i S(@l i i0, @l Function1 function10) {
        return x.f(i0, function10);
    }

    @m
    public static final Object S0(@l i i0, @l d d0) {
        return y.g(i0, d0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogues of \'switchMap\' are \'transformLatest\', \'flatMapLatest\' and \'mapLatest\'", replaceWith = @c0(expression = "this.flatMapLatest(transform)", imports = {}))
    @l
    public static final i S1(@l i i0, @l o o0) {
        return x.K(i0, o0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'concatMap\' is \'flatMapConcat\'", replaceWith = @c0(expression = "flatMapConcat(mapper)", imports = {}))
    @l
    public static final i T(@l i i0, @l Function1 function10) {
        return x.g(i0, function10);
    }

    @m
    public static final Object T0(@l i i0, @l d d0) {
        return y.h(i0, d0);
    }

    @l
    public static final i T1(@l i i0, int v) {
        return v.g(i0, v);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'concatWith\' is \'onCompletion\'. Use \'onCompletion { emit(value) }\'", replaceWith = @c0(expression = "onCompletion { emit(value) }", imports = {}))
    @l
    public static final i U(@l i i0, Object object0) {
        return x.h(i0, object0);
    }

    @l
    public static final I0 U0(@l i i0, @l O o0) {
        return n.h(i0, o0);
    }

    @l
    public static final i U1(@l i i0, @l o o0) {
        return v.h(i0, o0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'concatWith\' is \'onCompletion\'. Use \'onCompletion { if (it == null) emitAll(other) }\'", replaceWith = @c0(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @l
    public static final i V(@l i i0, @l i i1) {
        return x.i(i0, i1);
    }

    @l
    public static final i V0(@l i i0, @l o o0) {
        return A.f(i0, o0);
    }

    @y0
    @l
    public static final i V1(@l i i0, long v) {
        return r.i(i0, v);
    }

    @l
    public static final i W(@l i i0) {
        return kotlinx.coroutines.flow.p.g(i0);
    }

    @x0
    @l
    public static final i W0(@l i i0, @b @l o o0) {
        return w.k(i0, o0);
    }

    @m
    public static final Object W1(@l i i0, @l Collection collection0, @l d d0) {
        return kotlinx.coroutines.flow.o.a(i0, collection0, d0);
    }

    @l
    public static final i X(@l F f0) {
        return kotlinx.coroutines.flow.m.c(f0);
    }

    @l
    public static final i X0(@l i i0, @l o o0) {
        return A.g(i0, o0);
    }

    @m
    public static final Object X1(@l i i0, @l List list0, @l d d0) {
        return kotlinx.coroutines.flow.o.b(i0, list0, d0);
    }

    @m
    public static final Object Y(@l i i0, @l o o0, @l d d0) {
        return kotlinx.coroutines.flow.q.a(i0, o0, d0);
    }

    @l
    public static final i Y0(@l Iterable iterable0) {
        return w.l(iterable0);
    }

    @m
    public static final Object Z(@l i i0, @l d d0) {
        return kotlinx.coroutines.flow.q.b(i0, d0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'merge\' is \'flattenConcat\'", replaceWith = @c0(expression = "flattenConcat()", imports = {}))
    @l
    public static final i Z0(@l i i0) {
        return x.o(i0);
    }

    @m
    public static final Object Z1(@l i i0, @l Set set0, @l d d0) {
        return kotlinx.coroutines.flow.o.d(i0, set0, d0);
    }

    @l
    public static final i a(@l a a0) {
        return kotlinx.coroutines.flow.l.a(a0);
    }

    @y0
    @l
    public static final i a0(@l i i0, long v) {
        return r.a(i0, v);
    }

    @l
    public static final i a1(@l i[] arr_i) {
        return w.m(arr_i);
    }

    @l
    public static final i b(@l Iterable iterable0) {
        return kotlinx.coroutines.flow.l.b(iterable0);
    }

    @kotlin.U
    @y0
    @l
    public static final i b0(@l i i0, @l Function1 function10) {
        return r.b(i0, function10);
    }

    @l
    public static final Void b1() {
        return x.p();
    }

    @l
    public static final i b2(@l i i0, @b @l p p0) {
        return kotlinx.coroutines.flow.t.g(i0, p0);
    }

    @l
    public static final i c(@l Iterator iterator0) {
        return kotlinx.coroutines.flow.l.c(iterator0);
    }

    @y0
    @l
    public static final i c0(@l i i0, long v) {
        return r.c(i0, v);
    }

    @kotlin.k(level = kotlin.m.b, message = "Collect flow in the desired context instead")
    @l
    public static final i c1(@l i i0, @l g g0) {
        return x.q(i0, g0);
    }

    @x0
    @l
    public static final i c2(@l i i0, @b @l p p0) {
        return w.n(i0, p0);
    }

    @l
    public static final i d(@l Function1 function10) {
        return kotlinx.coroutines.flow.l.d(function10);
    }

    @kotlin.U
    @y0
    @l
    @z3.i(name = "debounceDuration")
    public static final i d0(@l i i0, @l Function1 function10) {
        return r.d(i0, function10);
    }

    @l
    public static final i d1(@l i i0, @l p p0) {
        return kotlinx.coroutines.flow.t.d(i0, p0);
    }

    @l
    public static final i d2(@l i i0, @b @l p p0) {
        return v.i(i0, p0);
    }

    @l
    public static final i e(@l kotlin.ranges.l l0) {
        return kotlinx.coroutines.flow.l.e(l0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Use \'onEach { delay(timeMillis) }\'", replaceWith = @c0(expression = "onEach { delay(timeMillis) }", imports = {}))
    @l
    public static final i e0(@l i i0, long v) {
        return x.j(i0, v);
    }

    @l
    public static final i e1(@l i i0, @l o o0) {
        return A.h(i0, o0);
    }

    @b0
    @l
    public static final i e2(@l i i0, @b @l p p0) {
        return kotlinx.coroutines.flow.t.h(i0, p0);
    }

    @l
    public static final i f(@l kotlin.ranges.o o0) {
        return kotlinx.coroutines.flow.l.f(o0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Use \'onStart { delay(timeMillis) }\'", replaceWith = @c0(expression = "onStart { delay(timeMillis) }", imports = {}))
    @l
    public static final i f0(@l i i0, long v) {
        return x.k(i0, v);
    }

    @l
    public static final i f1(@l i i0, @l o o0) {
        return kotlinx.coroutines.flow.t.e(i0, o0);
    }

    @l
    public static final i f2(@l i i0) {
        return A.l(i0);
    }

    @l
    public static final i g(@l kotlin.sequences.m m0) {
        return kotlinx.coroutines.flow.l.g(m0);
    }

    @l
    public static final i g0(@l i i0) {
        return kotlinx.coroutines.flow.s.a(i0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { emitAll(fallback) }\'", replaceWith = @c0(expression = "catch { emitAll(fallback) }", imports = {}))
    @l
    public static final i g1(@l i i0, @l i i1) {
        return x.r(i0, i1);
    }

    @l
    public static final i g2(@l i i0, @l i i1, @l p p0) {
        return B.s(i0, i1, p0);
    }

    @kotlin.k(level = kotlin.m.b, message = "\'BroadcastChannel\' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @l
    public static final i h(@l kotlinx.coroutines.channels.d d0) {
        return kotlinx.coroutines.flow.m.b(d0);
    }

    @l
    public static final i h0(@l i i0, @l o o0) {
        return kotlinx.coroutines.flow.s.b(i0, o0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { emitAll(fallback) }\'", replaceWith = @c0(expression = "catch { emitAll(fallback) }", imports = {}))
    @l
    public static final i h1(@l i i0, @l i i1) {
        return x.s(i0, i1);
    }

    @l
    public static final i i(@l int[] arr_v) {
        return kotlinx.coroutines.flow.l.h(arr_v);
    }

    @l
    public static final i i0(@l i i0, @l Function1 function10) {
        return kotlinx.coroutines.flow.s.c(i0, function10);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { emit(fallback) }\'", replaceWith = @c0(expression = "catch { emit(fallback) }", imports = {}))
    @l
    public static final i i1(@l i i0, Object object0) {
        return x.t(i0, object0);
    }

    @l
    public static final i j(@l long[] arr_v) {
        return kotlinx.coroutines.flow.l.i(arr_v);
    }

    @l
    public static final i j0(@l i i0, int v) {
        return v.d(i0, v);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { e -> if (predicate(e)) emit(fallback) else throw e }\'", replaceWith = @c0(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @l
    public static final i j1(@l i i0, Object object0, @l Function1 function10) {
        return x.u(i0, object0, function10);
    }

    @l
    public static final i k(@l Object[] arr_object) {
        return kotlinx.coroutines.flow.l.j(arr_object);
    }

    @l
    public static final i k0(@l i i0, @l o o0) {
        return v.e(i0, o0);
    }

    public static i k1(i i0, Object object0, Function1 function10, int v, Object object1) {
        return x.v(i0, object0, function10, v, object1);
    }

    @l
    public static final I l(@l D d0) {
        return z.a(d0);
    }

    @m
    public static final Object l0(@l j j0, @l F f0, @l d d0) {
        return kotlinx.coroutines.flow.m.d(j0, f0, d0);
    }

    @l
    public static final i l1(@l i i0, @l o o0) {
        return kotlinx.coroutines.flow.t.f(i0, o0);
    }

    @l
    public static final U m(@l E e0) {
        return z.b(e0);
    }

    @m
    public static final Object m0(@l j j0, @l i i0, @l d d0) {
        return n.g(j0, i0, d0);
    }

    @l
    public static final I m1(@l I i0, @l o o0) {
        return z.f(i0, o0);
    }

    @l
    public static final i n0() {
        return kotlinx.coroutines.flow.l.m();
    }

    @l
    public static final F n1(@l i i0, @l O o0) {
        return kotlinx.coroutines.flow.m.f(i0, o0);
    }

    @l
    public static final i o(@l i i0, int v, @l kotlinx.coroutines.channels.i i1) {
        return kotlinx.coroutines.flow.p.b(i0, v, i1);
    }

    public static final void o0(@l j j0) {
        kotlinx.coroutines.flow.t.b(j0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'publish()\' is \'shareIn\'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \npublish().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument.", replaceWith = @c0(expression = "this.shareIn(scope, 0)", imports = {}))
    @l
    public static final i o1(@l i i0) {
        return x.w(i0);
    }

    public static i p(i i0, int v, int v1, Object object0) {
        return kotlinx.coroutines.flow.p.c(i0, v, v1, object0);
    }

    @l
    public static final i p0(@l i i0, @l o o0) {
        return A.a(i0, o0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'publish(bufferSize)\' is \'buffer\' followed by \'shareIn\'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \npublish().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument.", replaceWith = @c0(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @l
    public static final i p1(@l i i0, int v) {
        return x.x(i0, v);
    }

    public static final i q0(i i0) {
        return A.b(i0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Collect flow in the desired context instead")
    @l
    public static final i q1(@l i i0, @l g g0) {
        return x.y(i0, g0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'cache()\' is \'shareIn\' with unlimited replay and \'started = SharingStared.Lazily\' argument\'", replaceWith = @c0(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @l
    public static final i r(@l i i0) {
        return x.a(i0);
    }

    @l
    public static final i r0(@l i i0, @l kotlin.reflect.d d0) {
        return A.c(i0, d0);
    }

    @l
    public static final i r1(@l F f0) {
        return kotlinx.coroutines.flow.m.g(f0);
    }

    @l
    public static final i s(@b @l o o0) {
        return kotlinx.coroutines.flow.l.k(o0);
    }

    @l
    public static final i s0(@l i i0, @l o o0) {
        return A.d(i0, o0);
    }

    @m
    public static final Object s1(@l i i0, @l p p0, @l d d0) {
        return y.i(i0, p0, d0);
    }

    @l
    public static final i t(@l i i0) {
        return kotlinx.coroutines.flow.p.e(i0);
    }

    @l
    public static final i t0(@l i i0) {
        return A.e(i0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'replay()\' is \'shareIn\' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \nreplay().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument.", replaceWith = @c0(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @l
    public static final i t1(@l i i0) {
        return x.z(i0);
    }

    @l
    public static final i u(@l i i0, @l p p0) {
        return u.a(i0, p0);
    }

    @m
    public static final Object u0(@l i i0, @l o o0, @l d d0) {
        return y.a(i0, o0, d0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue of \'replay(bufferSize)\' is \'shareIn\' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \nreplay().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument.", replaceWith = @c0(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @l
    public static final i u1(@l i i0, int v) {
        return x.A(i0, v);
    }

    @m
    public static final Object v(@l i i0, @l j j0, @l d d0) {
        return u.b(i0, j0, d0);
    }

    @m
    public static final Object v0(@l i i0, @l d d0) {
        return y.b(i0, d0);
    }

    @l
    public static final i v1(@l i i0, long v, @l o o0) {
        return u.e(i0, v, o0);
    }

    @l
    public static final i w(@b @l o o0) {
        return kotlinx.coroutines.flow.l.l(o0);
    }

    @m
    public static final Object w0(@l i i0, @l o o0, @l d d0) {
        return y.c(i0, o0, d0);
    }

    public static i w1(i i0, long v, o o0, int v1, Object object0) {
        return u.f(i0, v, o0, v1, object0);
    }

    @kotlin.k(level = kotlin.m.c, message = "Backwards compatibility with JS and K/N")
    public static final Object x(i i0, o o0, d d0) {
        return n.a(i0, o0, d0);
    }

    @m
    public static final Object x0(@l i i0, @l d d0) {
        return y.d(i0, d0);
    }

    @l
    public static final i x1(@l i i0, @l q q0) {
        return u.g(i0, q0);
    }

    @m
    public static final Object y(@l i i0, @l d d0) {
        return n.b(i0, d0);
    }

    @l
    public static final F y0(@l O o0, long v) {
        return r.f(o0, v);
    }

    @l
    public static final i y1(@l i i0, Object object0, @b @l p p0) {
        return A.i(i0, object0, p0);
    }

    @m
    public static final Object z(@l i i0, @l p p0, @l d d0) {
        return n.d(i0, p0, d0);
    }

    @kotlin.k(level = kotlin.m.b, message = "Flow analogue is \'flatMapConcat\'", replaceWith = @c0(expression = "flatMapConcat(mapper)", imports = {}))
    @l
    public static final i z0(@l i i0, @l o o0) {
        return x.l(i0, o0);
    }

    @l
    public static final i z1(@l i i0, @l p p0) {
        return A.j(i0, p0);
    }
}

