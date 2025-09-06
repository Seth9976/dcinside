package kotlinx.coroutines.debug.internal;

import A3.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.b0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.k;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.p;
import y4.l;
import y4.m;
import z3.f;

@b0
@s0({"SMAP\nDebugCoroutineInfoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugCoroutineInfoImpl.kt\nkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
public final class e {
    @m
    @f
    public volatile WeakReference _lastObservedFrame;
    @l
    @f
    public volatile String _state;
    @m
    private final kotlinx.coroutines.debug.internal.m a;
    @f
    public final long b;
    @l
    private final WeakReference c;
    private int d;
    @m
    @f
    public volatile Thread lastObservedThread;

    public e(@m g g0, @m kotlinx.coroutines.debug.internal.m m0, long v) {
        this.a = m0;
        this.b = v;
        this.c = new WeakReference(g0);
        this._state = "CREATED";
    }

    private final List b() {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {0xA2}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends k implements o {
            int l;
            private Object m;
            final e n;
            final kotlinx.coroutines.debug.internal.m o;

            a(e e0, kotlinx.coroutines.debug.internal.m m0, d d0) {
                this.n = e0;
                this.o = m0;
                super(2, d0);
            }

            @m
            public final Object a(@l kotlin.sequences.o o0, @m d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new a(this.n, this.o, d0);
                d1.m = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((kotlin.sequences.o)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        this.l = 1;
                        return this.n.k(((kotlin.sequences.o)this.m), this.o.getCallerFrame(), this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        return this.a == null ? u.H() : p.c3(p.b(new a(this, this.a, null)));
    }

    @m
    public final g c() {
        return (g)this.c.get();
    }

    @m
    public final kotlinx.coroutines.debug.internal.m d() {
        return this.a;
    }

    @l
    public final List e() {
        return this.b();
    }

    @m
    public final kotlin.coroutines.jvm.internal.e f() {
        return this._lastObservedFrame == null ? null : ((kotlin.coroutines.jvm.internal.e)this._lastObservedFrame.get());
    }

    @l
    public final String g() {
        return this._state;
    }

    @l
    public final List h() {
        kotlin.coroutines.jvm.internal.e e0 = this.f();
        if(e0 == null) {
            return u.H();
        }
        List list0 = new ArrayList();
        while(e0 != null) {
            StackTraceElement stackTraceElement0 = e0.getStackTraceElement();
            if(stackTraceElement0 != null) {
                ((ArrayList)list0).add(stackTraceElement0);
            }
            e0 = e0.getCallerFrame();
        }
        return list0;
    }

    public final void i(@m kotlin.coroutines.jvm.internal.e e0) {
        this._lastObservedFrame = e0 == null ? null : new WeakReference(e0);
    }

    public final void j(@l String s, @l d d0, boolean z) {
        synchronized(this) {
            if(L.g(this._state, "RUNNING") && L.g(s, "RUNNING") && z) {
                ++this.d;
            }
            else if(this.d > 0 && L.g(s, "SUSPENDED")) {
                --this.d;
                return;
            }
            if(L.g(this._state, s) && L.g(s, "SUSPENDED") && this.f() != null) {
                return;
            }
            this._state = s;
            Thread thread0 = null;
            this.i((d0 instanceof kotlin.coroutines.jvm.internal.e ? ((kotlin.coroutines.jvm.internal.e)d0) : null));
            if(L.g(s, "RUNNING")) {
                thread0 = Thread.currentThread();
            }
            this.lastObservedThread = thread0;
        }
    }

    private final Object k(kotlin.sequences.o o0, kotlin.coroutines.jvm.internal.e e0, d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {0, 0, 0}, l = {0xA7}, m = "yieldFrames", n = {"this", "$this$yieldFrames", "frame"}, s = {"L$0", "L$1", "L$2"})
        static final class kotlinx.coroutines.debug.internal.e.b extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            final e o;
            int p;

            kotlinx.coroutines.debug.internal.e.b(e e0, d d0) {
                this.o = e0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.p |= 0x80000000;
                return this.o.k(null, null, this);
            }
        }

        kotlin.sequences.o o1;
        kotlin.coroutines.jvm.internal.e e2;
        e e1;
        kotlinx.coroutines.debug.internal.e.b e$b0;
        if(d0 instanceof kotlinx.coroutines.debug.internal.e.b) {
            e$b0 = (kotlinx.coroutines.debug.internal.e.b)d0;
            int v = e$b0.p;
            if((v & 0x80000000) == 0) {
                e$b0 = new kotlinx.coroutines.debug.internal.e.b(this, d0);
            }
            else {
                e$b0.p = v ^ 0x80000000;
            }
        }
        else {
            e$b0 = new kotlinx.coroutines.debug.internal.e.b(this, d0);
        }
        Object object0 = e$b0.n;
        Object object1 = b.l();
        switch(e$b0.p) {
            case 0: {
                f0.n(object0);
                e1 = this;
                goto label_25;
            }
            case 1: {
                e2 = (kotlin.coroutines.jvm.internal.e)e$b0.m;
                o1 = (kotlin.sequences.o)e$b0.l;
                e1 = (e)e$b0.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            e0 = e2;
            o0 = o1;
            do {
                e0 = e0.getCallerFrame();
                if(e0 == null) {
                    return S0.a;
                }
            label_25:
                if(e0 == null) {
                    return S0.a;
                }
                StackTraceElement stackTraceElement0 = e0.getStackTraceElement();
            }
            while(stackTraceElement0 == null);
            e$b0.k = e1;
            e$b0.l = o0;
            e$b0.m = e0;
            e$b0.p = 1;
            if(o0.a(stackTraceElement0, e$b0) == object1) {
                return object1;
            }
            o1 = o0;
            e2 = e0;
        }
    }

    @Override
    @l
    public String toString() {
        return "DebugCoroutineInfo(state=" + this.g() + ",context=" + this.c() + ')';
    }
}

