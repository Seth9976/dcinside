package kotlinx.coroutines;

import androidx.concurrent.futures.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.y;
import kotlinx.coroutines.internal.S;
import kotlinx.coroutines.internal.V;
import y4.l;
import y4.m;
import z3.i;

@b0
@s0({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,681:1\n226#1,10:685\n226#1,10:695\n226#1,10:706\n1#2:682\n20#3:683\n20#3:684\n18#3:705\n17#3:716\n18#3,3:717\n17#3:720\n18#3,3:721\n18#3:728\n17#3,4:729\n57#4,2:724\n57#4,2:726\n57#4,2:733\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n242#1:685,10\n245#1:695,10\n250#1:706,10\n68#1:683\n154#1:684\n248#1:705\n273#1:716\n274#1:717,3\n283#1:720\n284#1:721,3\n385#1:728\n388#1:729,4\n325#1:724,2\n335#1:726,2\n605#1:733,2\n*E\n"})
public class p extends e0 implements e, o, y1 {
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    @l
    private final d d;
    @l
    private final g e;
    private static final AtomicIntegerFieldUpdater f;
    private static final AtomicReferenceFieldUpdater g;
    private static final AtomicReferenceFieldUpdater h;

    static {
        p.f = AtomicIntegerFieldUpdater.newUpdater(p.class, "_decisionAndIndex$volatile");
        p.g = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state$volatile");
        p.h = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_parentHandle$volatile");
    }

    public p(@l d d0, int v) {
        super(v);
        this.d = d0;
        this.e = d0.getContext();
        this._decisionAndIndex$volatile = 0x1FFFFFFF;
        this._state$volatile = kotlinx.coroutines.d.a;
    }

    private final int A() {
        return this._decisionAndIndex$volatile;
    }

    @Override  // kotlinx.coroutines.o
    public void B(Object object0, @m Function1 function10) {
        this.Y(object0, this.c, function10);
    }

    private final Object D() {
        return this._parentHandle$volatile;
    }

    @Override  // kotlinx.coroutines.o
    public void E(@l Object object0) {
        this.t(this.c);
    }

    private final Object G() {
        return this._state$volatile;
    }

    @Override  // kotlinx.coroutines.o
    @m
    public Object H(Object object0, @m Object object1) {
        return this.g0(object0, object1, null);
    }

    private final k0 J() {
        b g$b0 = this.getContext().get(I0.B8);
        if(((I0)g$b0) == null) {
            return null;
        }
        k0 k00 = O0.B(((I0)g$b0), true, false, new t(this), 2, null);
        a.a(p.h, this, null, k00);
        return k00;
    }

    @Override  // kotlinx.coroutines.o
    public void K(@l Function1 function10) {
        r.c(this, new kotlinx.coroutines.n.a(function10));
    }

    private final void L(Object object0) {
        Object object1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = p.g;
        while(true) {
            while(true) {
                while(true) {
                label_1:
                    object1 = atomicReferenceFieldUpdater0.get(this);
                    if(!(object1 instanceof kotlinx.coroutines.d)) {
                        break;
                    }
                    if(a.a(p.g, this, object1, object0)) {
                        return;
                    }
                }
                if((object1 instanceof n ? true : object1 instanceof S)) {
                    this.R(object0, object1);
                    goto label_1;
                }
                if(object1 instanceof C) {
                    C c0 = (C)object1;
                    if(!c0.d()) {
                        this.R(object0, object1);
                    }
                    Throwable throwable0 = null;
                    if(object1 instanceof s) {
                        if(!(object1 instanceof C)) {
                            c0 = null;
                        }
                        if(c0 != null) {
                            throwable0 = c0.a;
                        }
                        if(object0 instanceof n) {
                            this.l(((n)object0), throwable0);
                            return;
                        }
                        L.n(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        this.p(((S)object0), throwable0);
                    }
                    return;
                }
                if(!(object1 instanceof B)) {
                    break;
                }
                if(((B)object1).b != null) {
                    this.R(object0, object1);
                }
                if(object0 instanceof S) {
                    return;
                }
                L.n(object0, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                if(((B)object1).h()) {
                    this.l(((n)object0), ((B)object1).e);
                    return;
                }
                if(a.a(p.g, this, object1, B.g(((B)object1), null, ((n)object0), null, null, null, 29, null))) {
                    return;
                }
            }
            if(object0 instanceof S) {
                return;
            }
            L.n(object0, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            if(!a.a(p.g, this, object1, new B(object1, ((n)object0), null, null, null, 28, null))) {
                goto label_1;
            }
            break;
        }
    }

    public final void M(@l n n0) {
        this.L(n0);
    }

    private final boolean N() {
        if(f0.d(this.c)) {
            L.n(this.d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            return ((kotlinx.coroutines.internal.n)this.d).r();
        }
        return false;
    }

    private final void O(Object object0, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0, Function1 function10) {
        while(true) {
            function10.invoke(atomicIntegerFieldUpdater0.get(object0));
        }
    }

    @Override  // kotlinx.coroutines.o
    @m
    public Object P(@l Throwable throwable0) {
        return this.g0(new C(throwable0, false, 2, null), null, null);
    }

    private final void Q(Object object0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, Function1 function10) {
        while(true) {
            function10.invoke(atomicReferenceFieldUpdater0.get(object0));
        }
    }

    private final void R(Object object0, Object object1) {
        throw new IllegalStateException(("It\'s prohibited to register multiple handlers, tried to register " + object0 + ", already has " + object1).toString());
    }

    @l
    protected String S() [...] // 潜在的解密器

    public final void T(@l Throwable throwable0) {
        if(this.q(throwable0)) {
            return;
        }
        this.c(throwable0);
        this.s();
    }

    @Override  // kotlinx.coroutines.o
    @m
    public Object U(Object object0, @m Object object1, @m Function1 function10) {
        return this.g0(object0, object1, function10);
    }

    public final void V() {
        kotlinx.coroutines.internal.n n0 = this.d instanceof kotlinx.coroutines.internal.n ? ((kotlinx.coroutines.internal.n)this.d) : null;
        if(n0 != null) {
            Throwable throwable0 = n0.A(this);
            if(throwable0 != null) {
                this.r();
                this.c(throwable0);
            }
        }
    }

    @i(name = "resetStateReusable")
    public final boolean W() {
        Object object0 = p.g.get(this);
        if(object0 instanceof B && ((B)object0).d != null) {
            this.r();
            return false;
        }
        p.f.set(this, 0x1FFFFFFF);
        p.g.set(this, kotlinx.coroutines.d.a);
        return true;
    }

    @Override  // kotlinx.coroutines.o
    public void X(@l K k0, Object object0) {
        K k1 = null;
        kotlinx.coroutines.internal.n n0 = this.d instanceof kotlinx.coroutines.internal.n ? ((kotlinx.coroutines.internal.n)this.d) : null;
        if(n0 != null) {
            k1 = n0.d;
        }
        p.Z(this, object0, (k1 == k0 ? 4 : this.c), null, 4, null);
    }

    private final void Y(Object object0, int v, Function1 function10) {
        Object object1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = p.g;
        while(true) {
            object1 = atomicReferenceFieldUpdater0.get(this);
            if(!(object1 instanceof Y0)) {
                break;
            }
            if(a.a(p.g, this, object1, this.a0(((Y0)object1), object0, v, function10, null))) {
                this.s();
                this.t(v);
                return;
            }
        }
        if(object1 instanceof s && ((s)object1).h()) {
            if(function10 != null) {
                this.o(function10, ((s)object1).a);
            }
            return;
        }
        this.j(object0);
        throw new y();
    }

    static void Z(p p0, Object object0, int v, Function1 function10, int v1, Object object1) {
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if((v1 & 4) != 0) {
            function10 = null;
        }
        p0.Y(object0, v, function10);
    }

    private final Object a0(Y0 y00, Object object0, int v, Function1 function10, Object object1) {
        if(!(object0 instanceof C) && (f0.c(v) || object1 != null) && (function10 != null || y00 instanceof n || object1 != null)) {
            return y00 instanceof n ? new B(object0, ((n)y00), function10, object1, null, 16, null) : new B(object0, null, function10, object1, null, 16, null);
        }
        return object0;
    }

    @Override  // kotlinx.coroutines.e0
    public void b(@m Object object0, @l Throwable throwable0) {
        Object object1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = p.g;
    alab1:
        while(true) {
            do {
                object1 = atomicReferenceFieldUpdater0.get(this);
                if(object1 instanceof Y0) {
                    break alab1;
                }
                if(object1 instanceof C) {
                    return;
                }
                if(!(object1 instanceof B)) {
                    goto label_11;
                }
                if(((B)object1).h()) {
                    throw new IllegalStateException("Must be called at most once");
                }
            }
            while(!a.a(p.g, this, object1, B.g(((B)object1), null, null, null, null, throwable0, 15, null)));
            ((B)object1).i(this, throwable0);
            return;
        label_11:
            if(a.a(p.g, this, object1, new B(object1, null, null, null, throwable0, 14, null))) {
                return;
            }
        }
        throw new IllegalStateException("Not completed");
    }

    private final void b0(int v) {
        this._decisionAndIndex$volatile = v;
    }

    @Override  // kotlinx.coroutines.o
    public boolean c(@m Throwable throwable0) {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = p.g;
        do {
            object0 = atomicReferenceFieldUpdater0.get(this);
            boolean z = false;
            if(!(object0 instanceof Y0)) {
                return false;
            }
            if(object0 instanceof n || object0 instanceof S) {
                z = true;
            }
        }
        while(!a.a(p.g, this, object0, new s(this, throwable0, z)));
        if(((Y0)object0) instanceof n) {
            this.l(((n)object0), throwable0);
        }
        else if(((Y0)object0) instanceof S) {
            this.p(((S)object0), throwable0);
        }
        this.s();
        this.t(this.c);
        return true;
    }

    @Override  // kotlinx.coroutines.o
    public void c0() {
        k0 k00 = this.J();
        if(k00 == null) {
            return;
        }
        if(this.k()) {
            k00.dispose();
            p.h.set(this, X0.a);
        }
    }

    @Override  // kotlinx.coroutines.y1
    public void d(@l S s0, int v) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = p.f;
        while(true) {
            int v1 = atomicIntegerFieldUpdater0.get(this);
            if((v1 & 0x1FFFFFFF) != 0x1FFFFFFF) {
                break;
            }
            if(atomicIntegerFieldUpdater0.compareAndSet(this, v1, (v1 >> 29 << 29) + v)) {
                this.L(s0);
                return;
            }
        }
        throw new IllegalStateException("invokeOnCancellation should be called at most once");
    }

    private final void d0(Object object0) {
        this._parentHandle$volatile = object0;
    }

    @Override  // kotlinx.coroutines.e0
    @l
    public final d e() {
        return this.d;
    }

    private final void e0(Object object0) {
        this._state$volatile = object0;
    }

    @Override  // kotlinx.coroutines.e0
    @m
    public Throwable f(@m Object object0) {
        Throwable throwable0 = super.f(object0);
        return throwable0 == null ? null : throwable0;
    }

    private final boolean f0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = p.f;
    alab1:
        while(true) {
            int v = atomicIntegerFieldUpdater0.get(this);
            switch(v >> 29) {
                case 0: {
                    if(!p.f.compareAndSet(this, v, 0x40000000 + (0x1FFFFFFF & v))) {
                        break;
                    }
                    break alab1;
                }
                case 1: {
                    return false;
                }
                default: {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
        return true;
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.coroutines.e0
    public Object g(@m Object object0) {
        return object0 instanceof B ? ((B)object0).a : object0;
    }

    private final V g0(Object object0, Object object1, Function1 function10) {
        Object object2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = p.g;
        while(true) {
            object2 = atomicReferenceFieldUpdater0.get(this);
            if(!(object2 instanceof Y0)) {
                break;
            }
            if(a.a(p.g, this, object2, this.a0(((Y0)object2), object0, this.c, function10, object1))) {
                this.s();
                return q.g;
            }
        }
        return !(object2 instanceof B) || object1 == null || ((B)object2).d != object1 ? null : q.g;
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.coroutines.jvm.internal.e
    @m
    public e getCallerFrame() {
        return this.d instanceof e ? ((e)this.d) : null;
    }

    @Override  // kotlin.coroutines.d
    @l
    public g getContext() {
        return this.e;
    }

    @Override  // kotlin.coroutines.jvm.internal.e
    @m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    private final boolean h0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = p.f;
    alab1:
        while(true) {
            int v = atomicIntegerFieldUpdater0.get(this);
            switch(v >> 29) {
                case 0: {
                    if(!p.f.compareAndSet(this, v, 0x20000000 + (0x1FFFFFFF & v))) {
                        break;
                    }
                    break alab1;
                }
                case 2: {
                    return false;
                }
                default: {
                    throw new IllegalStateException("Already suspended");
                }
            }
        }
        return true;
    }

    @Override  // kotlinx.coroutines.e0
    @m
    public Object i() {
        return this.y();
    }

    private final void i0(Object object0, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0, Function1 function10) {
        do {
            int v = atomicIntegerFieldUpdater0.get(object0);
        }
        while(!atomicIntegerFieldUpdater0.compareAndSet(object0, v, ((Number)function10.invoke(v)).intValue()));
    }

    @Override  // kotlinx.coroutines.o
    public boolean isActive() {
        return this.y() instanceof Y0;
    }

    @Override  // kotlinx.coroutines.o
    public boolean isCancelled() {
        return this.y() instanceof s;
    }

    private final Void j(Object object0) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + object0).toString());
    }

    @Override  // kotlinx.coroutines.o
    public boolean k() {
        return !(this.y() instanceof Y0);
    }

    public final void l(@l n n0, @m Throwable throwable0) {
        try {
            n0.a(throwable0);
        }
        catch(Throwable throwable1) {
            kotlinx.coroutines.L.b(this.getContext(), new E("Exception in invokeOnCancellation handler for " + this, throwable1));
        }
    }

    private final void m(D0 d00, Throwable throwable0) {
        try {
            d00.a(throwable0);
        }
        catch(Throwable throwable1) {
            kotlinx.coroutines.L.b(this.getContext(), new E("Exception in invokeOnCancellation handler for " + this, throwable1));
        }
    }

    private final void n(A3.a a0) {
        try {
            a0.invoke();
        }
        catch(Throwable throwable0) {
            kotlinx.coroutines.L.b(this.getContext(), new E("Exception in invokeOnCancellation handler for " + this, throwable0));
        }
    }

    public final void o(@l Function1 function10, @l Throwable throwable0) {
        try {
            function10.invoke(throwable0);
        }
        catch(Throwable throwable1) {
            kotlinx.coroutines.L.b(this.getContext(), new E("Exception in resume onCancellation handler for " + this, throwable1));
        }
    }

    private final void p(S s0, Throwable throwable0) {
        int v = p.f.get(this);
        if((v & 0x1FFFFFFF) == 0x1FFFFFFF) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            s0.z(v & 0x1FFFFFFF, throwable0, this.getContext());
        }
        catch(Throwable throwable1) {
            kotlinx.coroutines.L.b(this.getContext(), new E("Exception in invokeOnCancellation handler for " + this, throwable1));
        }
    }

    private final boolean q(Throwable throwable0) {
        if(!this.N()) {
            return false;
        }
        L.n(this.d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((kotlinx.coroutines.internal.n)this.d).t(throwable0);
    }

    public final void r() {
        k0 k00 = this.w();
        if(k00 == null) {
            return;
        }
        k00.dispose();
        p.h.set(this, X0.a);
    }

    @Override  // kotlin.coroutines.d
    public void resumeWith(@l Object object0) {
        p.Z(this, G.c(object0, this), this.c, null, 4, null);
    }

    private final void s() {
        if(!this.N()) {
            this.r();
        }
    }

    private final void t(int v) {
        if(this.f0()) {
            return;
        }
        f0.a(this, v);
    }

    // 去混淆评级： 低(20)
    @Override
    @l
    public String toString() {
        return "CancellableContinuation" + '(' + U.c(this.d) + "){" + this.z() + "}@" + U.b(this);
    }

    @Override  // kotlinx.coroutines.o
    public void u(@l K k0, @l Throwable throwable0) {
        K k1 = null;
        kotlinx.coroutines.internal.n n0 = this.d instanceof kotlinx.coroutines.internal.n ? ((kotlinx.coroutines.internal.n)this.d) : null;
        C c0 = new C(throwable0, false, 2, null);
        if(n0 != null) {
            k1 = n0.d;
        }
        p.Z(this, c0, (k1 == k0 ? 4 : this.c), null, 4, null);
    }

    @l
    public Throwable v(@l I0 i00) {
        return i00.L0();
    }

    private final k0 w() {
        return (k0)p.h.get(this);
    }

    @b0
    @m
    public final Object x() {
        boolean z = this.N();
        if(this.h0()) {
            if(this.w() == null) {
                this.J();
            }
            if(z) {
                this.V();
            }
            return kotlin.coroutines.intrinsics.b.l();
        }
        if(z) {
            this.V();
        }
        Object object0 = this.y();
        if(object0 instanceof C) {
            throw ((C)object0).a;
        }
        if(f0.c(this.c)) {
            I0 i00 = (I0)this.getContext().get(I0.B8);
            if(i00 != null && !i00.isActive()) {
                CancellationException cancellationException0 = i00.L0();
                this.b(object0, cancellationException0);
                throw cancellationException0;
            }
        }
        return this.g(object0);
    }

    @m
    public final Object y() {
        return p.g.get(this);
    }

    private final String z() {
        Object object0 = this.y();
        if(object0 instanceof Y0) {
            return "Active";
        }
        return object0 instanceof s ? "Cancelled" : "Completed";
    }
}

