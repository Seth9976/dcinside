package kotlin;

import A3.p;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import y4.l;
import y4.m;

final class j extends i implements d {
    @l
    private p a;
    @m
    private Object b;
    @m
    private d c;
    @l
    private Object d;

    public j(@l p p0, Object object0) {
        L.p(p0, "block");
        super(null);
        this.a = p0;
        this.b = object0;
        L.n(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.c = this;
        this.d = h.a;
    }

    @Override  // kotlin.i
    @m
    public Object a(Object object0, @l d d0) {
        L.n(d0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.c = d0;
        this.b = object0;
        Object object1 = b.l();
        if(object1 == b.l()) {
            kotlin.coroutines.jvm.internal.h.c(d0);
        }
        return object1;
    }

    @Override  // kotlin.i
    @m
    public Object b(@l g g0, Object object0, @l d d0) {
        p p0 = g0.a();
        L.n(p0, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }");
        p p1 = this.a;
        if(p0 == p1) {
            L.n(d0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.c = d0;
        }
        else {
            this.a = p0;
            L.n(d0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.c = this.h(p1, d0);
        }
        this.b = object0;
        Object object1 = b.l();
        if(object1 == b.l()) {
            kotlin.coroutines.jvm.internal.h.c(d0);
        }
        return object1;
    }

    @Override  // kotlin.coroutines.d
    @l
    public kotlin.coroutines.g getContext() {
        return kotlin.coroutines.i.a;
    }

    private final d h(p p0, d d0) {
        @s0({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n+ 2 DeepRecursive.kt\nkotlin/DeepRecursiveScopeImpl\n*L\n1#1,71:1\n182#2,6:72\n*E\n"})
        public static final class a implements d {
            final kotlin.coroutines.g a;
            final j b;
            final p c;
            final d d;

            public a(kotlin.coroutines.g g0, j j0, p p0, d d0) {
                this.a = g0;
                this.b = j0;
                this.c = p0;
                this.d = d0;
                super();
            }

            @Override  // kotlin.coroutines.d
            public kotlin.coroutines.g getContext() {
                return this.a;
            }

            @Override  // kotlin.coroutines.d
            public void resumeWith(Object object0) {
                this.b.a = this.c;
                this.b.c = this.d;
                this.b.d = object0;
            }
        }

        return new a(kotlin.coroutines.i.a, this, p0, d0);
    }

    public final Object i() {
        Object object2;
        Object object0;
        while(true) {
            object0 = this.d;
            d d0 = this.c;
            if(d0 == null) {
                break;
            }
            if(e0.d(h.a, object0)) {
                try {
                    p p0 = this.a;
                    Object object1 = this.b;
                    object2 = p0 instanceof kotlin.coroutines.jvm.internal.a ? ((p)v0.q(p0, 3)).invoke(this, object1, d0) : b.j(p0, this, object1, d0);
                }
                catch(Throwable throwable0) {
                    d0.resumeWith(e0.b(f0.a(throwable0)));
                    continue;
                }
                if(object2 == b.l()) {
                    continue;
                }
                d0.resumeWith(object2);
            }
            else {
                this.d = h.a;
                d0.resumeWith(object0);
            }
        }
        f0.n(object0);
        return object0;
    }

    @Override  // kotlin.coroutines.d
    public void resumeWith(@l Object object0) {
        this.c = null;
        this.d = object0;
    }
}

