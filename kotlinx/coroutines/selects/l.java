package kotlinx.coroutines.selects;

import A3.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.S0;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlinx.coroutines.internal.S;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.n;
import kotlinx.coroutines.x0;
import y4.m;
import z3.f;
import z3.i;

@b0
@s0({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,879:1\n1#2:880\n2624#3,3:881\n1855#3,2:893\n1855#3,2:901\n1855#3,2:903\n318#4,9:884\n327#4,2:895\n149#5,4:897\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n512#1:881,3\n576#1:893,2\n732#1:901,2\n757#1:903,2\n552#1:884,9\n552#1:895,2\n717#1:897,4\n*E\n"})
public class l implements n, c, kotlinx.coroutines.selects.n {
    @s0({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,879:1\n1#2:880\n*E\n"})
    public final class a {
        @y4.l
        @f
        public final Object a;
        @y4.l
        private final p b;
        @y4.l
        private final p c;
        @m
        private final Object d;
        @y4.l
        private final Object e;
        @m
        @f
        public final p f;
        @m
        @f
        public Object g;
        @f
        public int h;
        final l i;

        public a(@y4.l Object object0, @y4.l p p0, @y4.l p p1, @m Object object1, @y4.l Object object2, @m p p2) {
            this.a = object0;
            this.b = p0;
            this.c = p1;
            this.d = object1;
            this.e = object2;
            this.f = p2;
            this.h = -1;
        }

        @m
        public final Function1 a(@y4.l kotlinx.coroutines.selects.m m0, @m Object object0) {
            return this.f == null ? null : ((Function1)this.f.invoke(m0, this.d, object0));
        }

        public final void b() {
            Object object0 = this.g;
            l l0 = l.this;
            k0 k00 = null;
            if(object0 instanceof S) {
                ((S)object0).z(this.h, null, l0.getContext());
                return;
            }
            if(object0 instanceof k0) {
                k00 = (k0)object0;
            }
            if(k00 != null) {
                k00.dispose();
            }
        }

        @m
        public final Object c(@m Object object0, @y4.l d d0) {
            Object object1 = this.e;
            if(this.d == o.l()) {
                L.n(object1, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((Function1)object1).invoke(d0);
            }
            L.n(object1, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((A3.o)object1).invoke(object0, d0);
        }

        @m
        public final Object d(@m Object object0) {
            return this.c.invoke(this.a, this.d, object0);
        }

        public final boolean e(@y4.l l l0) {
            this.b.invoke(this.a, l0, this.d);
            return l0.e == o.i;
        }
    }

    @y4.l
    private final g a;
    @m
    private List b;
    @m
    private Object c;
    private int d;
    @m
    private Object e;
    private static final AtomicReferenceFieldUpdater f;
    private volatile Object state$volatile;

    static {
        l.f = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "state$volatile");
    }

    public l(@y4.l g g0) {
        this.a = g0;
        this.state$volatile = o.f;
        this.b = new ArrayList(2);
        this.d = -1;
        this.e = o.i;
    }

    private final boolean A() {
        Object object0 = l.f.get(this);
        return object0 == o.f || object0 instanceof List;
    }

    private final Object B() {
        return this.state$volatile;
    }

    private final boolean D() {
        return l.f.get(this) == o.h;
    }

    private final boolean E() {
        return l.f.get(this) instanceof a;
    }

    private final void F(Object object0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, Function1 function10) {
        while(true) {
            function10.invoke(atomicReferenceFieldUpdater0.get(object0));
        }
    }

    private final Object G(a l$a0, Object object0, d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {712}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
        static final class kotlinx.coroutines.selects.l.c extends kotlin.coroutines.jvm.internal.d {
            Object k;
            final l l;
            int m;

            kotlinx.coroutines.selects.l.c(l l0, d d0) {
                this.l = l0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                this.k = object0;
                this.m |= 0x80000000;
                return this.l.G(null, null, this);
            }
        }

        kotlinx.coroutines.selects.l.c l$c0;
        if(d0 instanceof kotlinx.coroutines.selects.l.c) {
            l$c0 = (kotlinx.coroutines.selects.l.c)d0;
            int v = l$c0.m;
            if((v & 0x80000000) == 0) {
                l$c0 = new kotlinx.coroutines.selects.l.c(this, d0);
            }
            else {
                l$c0.m = v ^ 0x80000000;
            }
        }
        else {
            l$c0 = new kotlinx.coroutines.selects.l.c(this, d0);
        }
        Object object1 = l$c0.k;
        Object object2 = b.l();
        switch(l$c0.m) {
            case 0: {
                f0.n(object1);
                Object object3 = l$a0.d(object0);
                l$c0.m = 1;
                object1 = l$a0.c(object3, l$c0);
                return object1 == object2 ? object2 : object1;
            }
            case 1: {
                f0.n(object1);
                return object1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @i(name = "register")
    public final void H(@y4.l a l$a0, boolean z) {
        if(l.f.get(this) instanceof a) {
            return;
        }
        if(!z) {
            this.t(l$a0.a);
        }
        if(l$a0.e(this)) {
            if(!z) {
                List list0 = this.b;
                L.m(list0);
                list0.add(l$a0);
            }
            l$a0.g = this.c;
            l$a0.h = this.d;
            this.c = null;
            this.d = -1;
            return;
        }
        l.f.set(this, l$a0);
    }

    public static void I(l l0, a l$a0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if((v & 1) != 0) {
            z = false;
        }
        l0.H(l$a0, z);
    }

    private final void J(Object object0) {
        a l$a0 = this.z(object0);
        L.m(l$a0);
        l$a0.g = null;
        l$a0.h = -1;
        this.H(l$a0, true);
    }

    private final void K(Object object0) {
        this.state$volatile = object0;
    }

    @y4.l
    public final r L(@y4.l Object object0, @m Object object1) {
        return o.d(this.M(object0, object1));
    }

    private final int M(Object object0, Object object1) {
        Object object2;
        while(true) {
            while(true) {
            alab1:
                while(true) {
                    do {
                        object2 = l.f.get(this);
                        if(!(object2 instanceof kotlinx.coroutines.o)) {
                            break alab1;
                        }
                        a l$a0 = this.z(object0);
                        if(l$a0 == null) {
                            continue alab1;
                        }
                        Function1 function10 = l$a0.a(this, object1);
                    }
                    while(!androidx.concurrent.futures.a.a(l.f, this, object2, l$a0));
                    this.e = object1;
                    if(o.o(((kotlinx.coroutines.o)object2), function10)) {
                        return 0;
                    }
                    this.e = o.i;
                    return 2;
                }
                if((L.g(object2, o.g) ? true : object2 instanceof a)) {
                    return 3;
                }
                if(L.g(object2, o.h)) {
                    return 2;
                }
                if(!L.g(object2, o.f)) {
                    break;
                }
                if(androidx.concurrent.futures.a.a(l.f, this, object2, u.k(object0))) {
                    return 1;
                }
            }
            if(!(object2 instanceof List)) {
                break;
            }
            if(androidx.concurrent.futures.a.a(l.f, this, object2, u.E4(((Collection)object2), object0))) {
                return 1;
            }
        }
        throw new IllegalStateException(("Unexpected state: " + object2).toString());
    }

    private final void N(Object object0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, Function1 function10) {
        do {
            Object object1 = atomicReferenceFieldUpdater0.get(object0);
        }
        while(!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater0, object0, object1, function10.invoke(object1)));
    }

    private final Object O(d d0) {
        Iterator iterator0;
        Object object0;
        kotlinx.coroutines.p p0 = new kotlinx.coroutines.p(b.e(d0), 1);
        p0.c0();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = l.f;
        do {
            do {
                do {
                    object0 = atomicReferenceFieldUpdater0.get(this);
                    if(object0 != o.f) {
                        goto label_8;
                    }
                }
                while(!androidx.concurrent.futures.a.a(l.f, this, object0, p0));
                kotlinx.coroutines.r.c(p0, this);
                goto label_18;
            label_8:
                if(!(object0 instanceof List)) {
                    goto label_15;
                }
            }
            while(!androidx.concurrent.futures.a.a(l.f, this, object0, o.f));
            iterator0 = ((Iterable)object0).iterator();
        label_11:
        }
        while(!iterator0.hasNext());
        Object object1 = iterator0.next();
        this.J(object1);
        goto label_11;
    label_15:
        if(!(object0 instanceof a)) {
            throw new IllegalStateException(("unexpected state: " + object0).toString());
        }
        Function1 function10 = ((a)object0).a(this, this.e);
        p0.B(S0.a, function10);
    label_18:
        Object object2 = p0.x();
        if(object2 == b.l()) {
            h.c(d0);
        }
        return object2 == b.l() ? object2 : S0.a;
    }

    @Override  // kotlinx.coroutines.n
    public void a(@m Throwable throwable0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = l.f;
        do {
            Object object0 = atomicReferenceFieldUpdater0.get(this);
            if(object0 == o.g) {
                return;
            }
        }
        while(!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater0, this, object0, o.h));
        List list0 = this.b;
        if(list0 == null) {
            return;
        }
        for(Object object1: list0) {
            ((a)object1).b();
        }
        this.e = o.i;
        this.b = null;
    }

    @Override  // kotlinx.coroutines.selects.c
    public void b(@y4.l e e0, @y4.l Function1 function10) {
        l.I(this, new a(this, e0.d(), e0.c(), e0.b(), o.l(), function10, e0.a()), false, 1, null);
    }

    @Override  // kotlinx.coroutines.selects.c
    @kotlin.internal.h
    @k(level = kotlin.m.b, message = "Replaced with the same extension function", replaceWith = @c0(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @x0
    public void c(long v, @y4.l Function1 function10) {
        kotlinx.coroutines.selects.c.a.b(this, v, function10);
    }

    @Override  // kotlinx.coroutines.y1
    public void d(@y4.l S s0, int v) {
        this.c = s0;
        this.d = v;
    }

    @Override  // kotlinx.coroutines.selects.c
    public void e(@y4.l kotlinx.coroutines.selects.i i0, Object object0, @y4.l A3.o o0) {
        l.I(this, new a(this, i0.d(), i0.c(), i0.b(), object0, o0, i0.a()), false, 1, null);
    }

    @Override  // kotlinx.coroutines.selects.c
    public void f(@y4.l kotlinx.coroutines.selects.g g0, @y4.l A3.o o0) {
        l.I(this, new a(this, g0.d(), g0.c(), g0.b(), null, o0, g0.a()), false, 1, null);
    }

    @Override  // kotlinx.coroutines.selects.m
    public void g(@m Object object0) {
        this.e = object0;
    }

    @Override  // kotlinx.coroutines.selects.m
    @y4.l
    public g getContext() {
        return this.a;
    }

    @Override  // kotlinx.coroutines.selects.m
    public void h(@y4.l k0 k00) {
        this.c = k00;
    }

    @Override  // kotlinx.coroutines.selects.c
    public void i(@y4.l kotlinx.coroutines.selects.i i0, @y4.l A3.o o0) {
        kotlinx.coroutines.selects.c.a.a(this, i0, o0);
    }

    @Override  // kotlinx.coroutines.selects.m
    public boolean j(@y4.l Object object0, @m Object object1) {
        return this.M(object0, object1) == 0;
    }

    public static final Object k(l l0, d d0) {
        return l0.v(d0);
    }

    public static final boolean m(l l0) {
        return l0.A();
    }

    public static final boolean p(l l0) {
        return l0.D();
    }

    public static final Object s(l l0, d d0) {
        return l0.O(d0);
    }

    private final void t(Object object0) {
        List list0 = this.b;
        L.m(list0);
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object1: list0) {
                if(((a)object1).a == object0) {
                    throw new IllegalStateException(("Cannot use select clauses on the same object: " + object0).toString());
                }
                if(false) {
                    break;
                }
            }
        }
    }

    private final void u(a l$a0) {
        List list0 = this.b;
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            a l$a1 = (a)object0;
            if(l$a1 != l$a0) {
                l$a1.b();
            }
        }
        l.f.set(this, o.g);
        this.e = o.i;
        this.b = null;
    }

    private final Object v(d d0) {
        Object object0 = l.f.get(this);
        L.n(object0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        Object object1 = this.e;
        this.u(((a)object0));
        return ((a)object0).c(((a)object0).d(object1), d0);
    }

    @b0
    @m
    public Object w(@y4.l d d0) {
        return l.x(this, d0);
    }

    // 去混淆评级： 低(20)
    @b0
    static Object x(l l0, d d0) {
        return l0.E() ? l0.v(d0) : l0.y(d0);
    }

    private final Object y(d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {438, 441}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
        static final class kotlinx.coroutines.selects.l.b extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            final l m;
            int n;

            kotlinx.coroutines.selects.l.b(l l0, d d0) {
                this.m = l0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                this.l = object0;
                this.n |= 0x80000000;
                return this.m.y(this);
            }
        }

        l l0;
        kotlinx.coroutines.selects.l.b l$b0;
        if(d0 instanceof kotlinx.coroutines.selects.l.b) {
            l$b0 = (kotlinx.coroutines.selects.l.b)d0;
            int v = l$b0.n;
            if((v & 0x80000000) == 0) {
                l$b0 = new kotlinx.coroutines.selects.l.b(this, d0);
            }
            else {
                l$b0.n = v ^ 0x80000000;
            }
        }
        else {
            l$b0 = new kotlinx.coroutines.selects.l.b(this, d0);
        }
        Object object0 = l$b0.l;
        Object object1 = b.l();
        switch(l$b0.n) {
            case 0: {
                f0.n(object0);
                l$b0.k = this;
                l$b0.n = 1;
                if(this.O(l$b0) == object1) {
                    return object1;
                }
                l0 = this;
                break;
            }
            case 1: {
                l0 = (l)l$b0.k;
                f0.n(object0);
                break;
            }
            case 2: {
                f0.n(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        l$b0.k = null;
        l$b0.n = 2;
        object0 = l0.v(l$b0);
        return object0 == object1 ? object1 : object0;
    }

    private final a z(Object object0) {
        List list0 = this.b;
        Object object1 = null;
        if(list0 == null) {
            return null;
        }
        for(Object object2: list0) {
            if(((a)object2).a == object0) {
                object1 = object2;
                break;
            }
            if(false) {
                break;
            }
        }
        if(((a)object1) == null) {
            throw new IllegalStateException(("Clause with object " + object0 + " is not found").toString());
        }
        return (a)object1;
    }
}

