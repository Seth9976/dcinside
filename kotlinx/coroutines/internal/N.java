package kotlinx.coroutines.internal;

import androidx.concurrent.futures.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.e;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.D;
import kotlinx.coroutines.G;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.J;
import kotlinx.coroutines.K;
import kotlinx.coroutines.U;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.p;
import kotlinx.coroutines.w1;
import y4.l;
import y4.m;
import z3.f;

@b0
@s0({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,313:1\n239#1,8:377\n251#1:385\n252#1,2:396\n254#1:400\n1#2:314\n1#2:320\n1#2:361\n293#3,5:315\n298#3,12:321\n310#3:355\n293#3,5:356\n298#3,12:362\n310#3:415\n196#4,3:333\n199#4,14:341\n196#4,3:374\n199#4,14:401\n91#5,5:336\n103#5,10:386\n114#5,2:398\n103#5,13:416\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n*L\n220#1:377,8\n221#1:385\n221#1:396,2\n221#1:400\n198#1:320\n219#1:361\n198#1:315,5\n198#1:321,12\n198#1:355\n219#1:356,5\n219#1:362,12\n219#1:415\n198#1:333,3\n198#1:341,14\n219#1:374,3\n219#1:401,14\n199#1:336,5\n221#1:386,10\n221#1:398,2\n251#1:416,13\n*E\n"})
public final class n extends e0 implements d, e {
    private volatile Object _reusableCancellableContinuation$volatile;
    @l
    @f
    public final K d;
    @l
    @f
    public final d e;
    @m
    @f
    public Object f;
    @l
    @f
    public final Object g;
    private static final AtomicReferenceFieldUpdater h;

    static {
        n.h = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_reusableCancellableContinuation$volatile");
    }

    public n(@l K k0, @l d d0) {
        super(-1);
        this.d = k0;
        this.e = d0;
        this.f = o.a;
        this.g = kotlinx.coroutines.internal.b0.b(this.getContext());
    }

    @m
    public final Throwable A(@l kotlinx.coroutines.o o0) {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = n.h;
        while(true) {
            object0 = atomicReferenceFieldUpdater0.get(this);
            V v0 = o.b;
            if(object0 != v0) {
                break;
            }
            if(a.a(n.h, this, v0, o0)) {
                return null;
            }
        }
        if(!(object0 instanceof Throwable)) {
            throw new IllegalStateException(("Inconsistent state " + object0).toString());
        }
        if(!a.a(n.h, this, object0, null)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return (Throwable)object0;
    }

    @Override  // kotlinx.coroutines.e0
    public void b(@m Object object0, @l Throwable throwable0) {
        if(object0 instanceof D) {
            ((D)object0).b.invoke(throwable0);
        }
    }

    @Override  // kotlinx.coroutines.e0
    @l
    public d e() {
        return this;
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.coroutines.jvm.internal.e
    @m
    public e getCallerFrame() {
        return this.e instanceof e ? ((e)this.e) : null;
    }

    @Override  // kotlin.coroutines.d
    @l
    public g getContext() {
        return this.e.getContext();
    }

    @Override  // kotlin.coroutines.jvm.internal.e
    @m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override  // kotlinx.coroutines.e0
    @m
    public Object i() {
        Object object0 = this.f;
        this.f = o.a;
        return object0;
    }

    public final void j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = n.h;
        while(atomicReferenceFieldUpdater0.get(this) == o.b) {
        }
    }

    @m
    public final p l() {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = n.h;
        do {
            while(true) {
                object0 = atomicReferenceFieldUpdater0.get(this);
                if(object0 == null) {
                    n.h.set(this, o.b);
                    return null;
                }
                if(!(object0 instanceof p)) {
                    break;
                }
                if(a.a(n.h, this, object0, o.b)) {
                    return (p)object0;
                }
            }
        }
        while(object0 == o.b || object0 instanceof Throwable);
        throw new IllegalStateException(("Inconsistent state " + object0).toString());
    }

    public final void m(@l g g0, Object object0) {
        this.f = object0;
        this.c = 1;
        this.d.h1(g0, this);
    }

    private final p n() {
        Object object0 = n.h.get(this);
        return object0 instanceof p ? ((p)object0) : null;
    }

    private final Object o() {
        return this._reusableCancellableContinuation$volatile;
    }

    public static void q() {
    }

    public final boolean r() {
        return n.h.get(this) != null;
    }

    @Override  // kotlin.coroutines.d
    public void resumeWith(@l Object object0) {
        g g0 = this.e.getContext();
        Object object1 = G.d(object0, null, 1, null);
        if(this.d.i1(g0)) {
            this.f = object1;
            this.c = 0;
            this.d.b1(g0, this);
            return;
        }
        o0 o00 = m1.a.b();
        if(o00.o2()) {
            this.f = object1;
            this.c = 0;
            o00.d2(this);
            return;
        }
        o00.g2(true);
        try {
            g g1 = this.getContext();
            Object object2 = kotlinx.coroutines.internal.b0.c(g1, this.g);
            try {
                this.e.resumeWith(object0);
            }
            finally {
                kotlinx.coroutines.internal.b0.a(g1, object2);
            }
            while(o00.A2()) {
            }
        }
        catch(Throwable throwable0) {
            this.h(throwable0, null);
        }
        finally {
            o00.u1(true);
        }
    }

    private final void s(Object object0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, Function1 function10) {
        while(true) {
            function10.invoke(atomicReferenceFieldUpdater0.get(object0));
        }
    }

    public final boolean t(@l Throwable throwable0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = n.h;
        do {
            while(true) {
                Object object0 = atomicReferenceFieldUpdater0.get(this);
                V v0 = o.b;
                if(!L.g(object0, v0)) {
                    break;
                }
                if(a.a(n.h, this, v0, throwable0)) {
                    return true;
                }
            }
            if(object0 instanceof Throwable) {
                return true;
            }
        }
        while(!a.a(n.h, this, object0, null));
        return false;
    }

    @Override
    @l
    public String toString() {
        return "DispatchedContinuation[" + this.d + ", " + U.c(this.e) + ']';
    }

    public final void v() {
        this.j();
        p p0 = this.n();
        if(p0 != null) {
            p0.r();
        }
    }

    public final void w(@l Object object0, @m Function1 function10) {
        Object object2;
        g g2;
        Object object1 = G.b(object0, function10);
        g g0 = this.getContext();
        if(this.d.i1(g0)) {
            this.f = object1;
            this.c = 1;
            g g1 = this.getContext();
            this.d.b1(g1, this);
            return;
        }
        o0 o00 = m1.a.b();
        if(o00.o2()) {
            this.f = object1;
            this.c = 1;
            o00.d2(this);
            return;
        }
        o00.g2(true);
        try {
            I0 i00 = (I0)this.getContext().get(I0.B8);
            if(i00 == null || i00.isActive()) {
                g2 = this.e.getContext();
                object2 = kotlinx.coroutines.internal.b0.c(g2, this.g);
                w1 w10 = object2 == kotlinx.coroutines.internal.b0.a ? null : J.g(this.e, g2, object2);
                goto label_24;
            }
            else {
                CancellationException cancellationException0 = i00.L0();
                this.b(object1, cancellationException0);
                this.resumeWith(kotlin.e0.b(f0.a(cancellationException0)));
            }
            goto label_32;
        }
        catch(Throwable throwable0) {
            goto label_35;
        }
        try {
        label_24:
            this.e.resumeWith(object0);
            goto label_30;
        }
        catch(Throwable throwable1) {
            try {
                if(w10 == null || w10.Q1()) {
                    kotlinx.coroutines.internal.b0.a(g2, object2);
                }
                throw throwable1;
            label_30:
                if(w10 == null || w10.Q1()) {
                    kotlinx.coroutines.internal.b0.a(g2, object2);
                }
                while(true) {
                label_32:
                    if(!o00.A2()) {
                        goto label_40;
                    }
                }
            }
            catch(Throwable throwable0) {
            }
        }
        try {
        label_35:
            this.h(throwable0, null);
        }
        catch(Throwable throwable2) {
            o00.u1(true);
            throw throwable2;
        }
    label_40:
        o00.u1(true);
    }

    public final boolean x(@m Object object0) {
        I0 i00 = (I0)this.getContext().get(I0.B8);
        if(i00 != null && !i00.isActive()) {
            CancellationException cancellationException0 = i00.L0();
            this.b(object0, cancellationException0);
            this.resumeWith(kotlin.e0.b(f0.a(cancellationException0)));
            return true;
        }
        return false;
    }

    public final void y(@l Object object0) {
        g g0 = this.e.getContext();
        Object object1 = kotlinx.coroutines.internal.b0.c(g0, this.g);
        w1 w10 = object1 == kotlinx.coroutines.internal.b0.a ? null : J.g(this.e, g0, object1);
        try {
            this.e.resumeWith(object0);
        }
        finally {
            if(w10 == null || w10.Q1()) {
                kotlinx.coroutines.internal.b0.a(g0, object1);
            }
        }
    }

    private final void z(Object object0) {
        this._reusableCancellableContinuation$volatile = object0;
    }
}

