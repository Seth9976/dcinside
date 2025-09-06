package androidx.compose.foundation;

import A3.o;
import androidx.compose.runtime.Stable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.I0.a;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.sync.c;
import y4.l;
import y4.m;

@Stable
public final class MutatorMutex {
    static final class Mutator {
        @l
        private final MutatePriority a;
        @l
        private final I0 b;

        public Mutator(@l MutatePriority mutatePriority0, @l I0 i00) {
            L.p(mutatePriority0, "priority");
            L.p(i00, "job");
            super();
            this.a = mutatePriority0;
            this.b = i00;
        }

        public final boolean a(@l Mutator mutatorMutex$Mutator0) {
            L.p(mutatorMutex$Mutator0, "other");
            return this.a.compareTo(mutatorMutex$Mutator0.a) >= 0;
        }

        public final void b() {
            a.b(this.b, null, 1, null);
        }

        @l
        public final I0 c() {
            return this.b;
        }

        @l
        public final MutatePriority d() {
            return this.a;
        }
    }

    @l
    private final AtomicReference a;
    @l
    private final kotlinx.coroutines.sync.a b;
    public static final int c;

    static {
    }

    public MutatorMutex() {
        this.a = new AtomicReference(null);
        this.b = c.b(false, 1, null);
    }

    @m
    public final Object d(@l MutatePriority mutatePriority0, @l Function1 function10, @l d d0) {
        return P.g(new o(this, function10, null) {
            Object k;
            Object l;
            Object m;
            int n;
            private Object o;
            final MutatePriority p;
            final MutatorMutex q;
            final Function1 r;

            {
                this.p = mutatePriority0;
                this.q = mutatorMutex0;
                this.r = function10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.MutatorMutex.mutate.2(this.p, this.q, this.r, d0);
                d1.o = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.MutatorMutex.mutate.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                MutatorMutex mutatorMutex2;
                Throwable throwable1;
                kotlinx.coroutines.sync.a a2;
                Mutator mutatorMutex$Mutator2;
                Object object2;
                MutatorMutex mutatorMutex1;
                Mutator mutatorMutex$Mutator1;
                Function1 function11;
                kotlinx.coroutines.sync.a a0;
                Object object1 = b.l();
                switch(this.n) {
                    case 0: {
                        f0.n(object0);
                        kotlin.coroutines.g.b g$b0 = ((O)this.o).getCoroutineContext().get(I0.B8);
                        L.m(g$b0);
                        Mutator mutatorMutex$Mutator0 = new Mutator(this.p, ((I0)g$b0));
                        this.q.h(mutatorMutex$Mutator0);
                        a0 = this.q.b;
                        Function1 function10 = this.r;
                        MutatorMutex mutatorMutex0 = this.q;
                        this.o = mutatorMutex$Mutator0;
                        this.k = a0;
                        this.l = function10;
                        this.m = mutatorMutex0;
                        this.n = 1;
                        if(a0.h(null, this) == object1) {
                            return object1;
                        }
                        function11 = function10;
                        mutatorMutex$Mutator1 = mutatorMutex$Mutator0;
                        mutatorMutex1 = mutatorMutex0;
                        goto label_28;
                    }
                    case 1: {
                        mutatorMutex1 = (MutatorMutex)this.m;
                        function11 = (Function1)this.l;
                        kotlinx.coroutines.sync.a a1 = (kotlinx.coroutines.sync.a)this.k;
                        mutatorMutex$Mutator1 = (Mutator)this.o;
                        f0.n(object0);
                        a0 = a1;
                        try {
                        label_28:
                            this.o = mutatorMutex$Mutator1;
                            this.k = a0;
                            this.l = mutatorMutex1;
                            this.m = null;
                            this.n = 2;
                            object2 = function11.invoke(this);
                        }
                        catch(Throwable throwable0) {
                            mutatorMutex$Mutator2 = mutatorMutex$Mutator1;
                            a2 = a0;
                            throwable1 = throwable0;
                            mutatorMutex2 = mutatorMutex1;
                            goto label_54;
                        }
                        if(object2 == object1) {
                            return object1;
                        }
                        mutatorMutex2 = mutatorMutex1;
                        a2 = a0;
                        object0 = object2;
                        mutatorMutex$Mutator2 = mutatorMutex$Mutator1;
                        goto label_56;
                    }
                    case 2: {
                        mutatorMutex2 = (MutatorMutex)this.l;
                        a2 = (kotlinx.coroutines.sync.a)this.k;
                        mutatorMutex$Mutator2 = (Mutator)this.o;
                        try {
                            f0.n(object0);
                            goto label_56;
                        }
                        catch(Throwable throwable1) {
                        }
                        try {
                        label_54:
                            androidx.compose.animation.core.d.a(mutatorMutex2.a, mutatorMutex$Mutator2, null);
                            throw throwable1;
                        label_56:
                            androidx.compose.animation.core.d.a(mutatorMutex2.a, mutatorMutex$Mutator2, null);
                            goto label_61;
                        }
                        catch(Throwable throwable2) {
                        }
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                a2.i(null);
                throw throwable2;
            label_61:
                a2.i(null);
                return object0;
            }
        }, d0);
    }

    public static Object e(MutatorMutex mutatorMutex0, MutatePriority mutatePriority0, Function1 function10, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.a;
        }
        return mutatorMutex0.d(mutatePriority0, function10, d0);
    }

    @m
    public final Object f(Object object0, @l MutatePriority mutatePriority0, @l o o0, @l d d0) {
        return P.g(new o(this, o0, object0, null) {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;
            private Object p;
            final MutatePriority q;
            final MutatorMutex r;
            final o s;
            final Object t;

            {
                this.q = mutatePriority0;
                this.r = mutatorMutex0;
                this.s = o0;
                this.t = object0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.MutatorMutex.mutateWith.2(this.q, this.r, this.s, this.t, d0);
                d1.p = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.MutatorMutex.mutateWith.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                MutatorMutex mutatorMutex2;
                Throwable throwable1;
                kotlinx.coroutines.sync.a a2;
                Mutator mutatorMutex$Mutator2;
                Object object4;
                MutatorMutex mutatorMutex1;
                Mutator mutatorMutex$Mutator1;
                Object object3;
                o o0;
                kotlinx.coroutines.sync.a a0;
                Object object1 = b.l();
                switch(this.o) {
                    case 0: {
                        f0.n(object0);
                        kotlin.coroutines.g.b g$b0 = ((O)this.p).getCoroutineContext().get(I0.B8);
                        L.m(g$b0);
                        Mutator mutatorMutex$Mutator0 = new Mutator(this.q, ((I0)g$b0));
                        this.r.h(mutatorMutex$Mutator0);
                        a0 = this.r.b;
                        o0 = this.s;
                        Object object2 = this.t;
                        MutatorMutex mutatorMutex0 = this.r;
                        this.p = mutatorMutex$Mutator0;
                        this.k = a0;
                        this.l = o0;
                        this.m = object2;
                        this.n = mutatorMutex0;
                        this.o = 1;
                        if(a0.h(null, this) == object1) {
                            return object1;
                        }
                        object3 = object2;
                        mutatorMutex$Mutator1 = mutatorMutex$Mutator0;
                        mutatorMutex1 = mutatorMutex0;
                        goto label_31;
                    }
                    case 1: {
                        mutatorMutex1 = (MutatorMutex)this.n;
                        object3 = this.m;
                        o0 = (o)this.l;
                        kotlinx.coroutines.sync.a a1 = (kotlinx.coroutines.sync.a)this.k;
                        mutatorMutex$Mutator1 = (Mutator)this.p;
                        f0.n(object0);
                        a0 = a1;
                        try {
                        label_31:
                            this.p = mutatorMutex$Mutator1;
                            this.k = a0;
                            this.l = mutatorMutex1;
                            this.m = null;
                            this.n = null;
                            this.o = 2;
                            object4 = o0.invoke(object3, this);
                        }
                        catch(Throwable throwable0) {
                            mutatorMutex$Mutator2 = mutatorMutex$Mutator1;
                            a2 = a0;
                            throwable1 = throwable0;
                            mutatorMutex2 = mutatorMutex1;
                            goto label_58;
                        }
                        if(object4 == object1) {
                            return object1;
                        }
                        mutatorMutex2 = mutatorMutex1;
                        a2 = a0;
                        object0 = object4;
                        mutatorMutex$Mutator2 = mutatorMutex$Mutator1;
                        goto label_60;
                    }
                    case 2: {
                        mutatorMutex2 = (MutatorMutex)this.l;
                        a2 = (kotlinx.coroutines.sync.a)this.k;
                        mutatorMutex$Mutator2 = (Mutator)this.p;
                        try {
                            f0.n(object0);
                            goto label_60;
                        }
                        catch(Throwable throwable1) {
                        }
                        try {
                        label_58:
                            androidx.compose.animation.core.d.a(mutatorMutex2.a, mutatorMutex$Mutator2, null);
                            throw throwable1;
                        label_60:
                            androidx.compose.animation.core.d.a(mutatorMutex2.a, mutatorMutex$Mutator2, null);
                            goto label_65;
                        }
                        catch(Throwable throwable2) {
                        }
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                a2.i(null);
                throw throwable2;
            label_65:
                a2.i(null);
                return object0;
            }
        }, d0);
    }

    public static Object g(MutatorMutex mutatorMutex0, Object object0, MutatePriority mutatePriority0, o o0, d d0, int v, Object object1) {
        if((v & 2) != 0) {
            mutatePriority0 = MutatePriority.a;
        }
        return mutatorMutex0.f(object0, mutatePriority0, o0, d0);
    }

    private final void h(Mutator mutatorMutex$Mutator0) {
        Mutator mutatorMutex$Mutator1;
        do {
            mutatorMutex$Mutator1 = (Mutator)this.a.get();
            if(mutatorMutex$Mutator1 != null && !mutatorMutex$Mutator0.a(mutatorMutex$Mutator1)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        }
        while(!androidx.compose.animation.core.d.a(this.a, mutatorMutex$Mutator1, mutatorMutex$Mutator0));
        if(mutatorMutex$Mutator1 != null) {
            mutatorMutex$Mutator1.b();
        }
    }
}

