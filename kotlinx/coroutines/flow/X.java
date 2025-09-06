package kotlinx.coroutines.flow;

import A3.o;
import A3.p;
import A3.q;
import A3.r;
import A3.s;
import kotlin.S0;
import kotlin.b;
import kotlin.c0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import kotlin.y;
import kotlinx.coroutines.a0;
import y4.l;

@s0({"SMAP\nMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,492:1\n189#2:493\n*S KotlinDebug\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n*L\n431#1:493\n*E\n"})
final class x {
    @k(level = m.b, message = "Flow analogue of \'replay(bufferSize)\' is \'shareIn\' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \nreplay().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument.", replaceWith = @c0(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @l
    public static final i A(@l i i0, int v) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow has less verbose \'scan\' shortcut", replaceWith = @c0(expression = "scan(initial, operation)", imports = {}))
    @l
    public static final i B(@l i i0, Object object0, @b @l p p0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "\'scanReduce\' was renamed to \'runningReduce\' to be consistent with Kotlin standard library", replaceWith = @c0(expression = "runningReduce(operation)", imports = {}))
    @l
    public static final i C(@l i i0, @l p p0) {
        return kotlinx.coroutines.flow.k.z1(i0, p0);
    }

    @k(level = m.b, message = "Flow analogue of \'skip\' is \'drop\'", replaceWith = @c0(expression = "drop(count)", imports = {}))
    @l
    public static final i D(@l i i0, int v) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogue of \'startWith\' is \'onStart\'. Use \'onStart { emit(value) }\'", replaceWith = @c0(expression = "onStart { emit(value) }", imports = {}))
    @l
    public static final i E(@l i i0, Object object0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogue of \'startWith\' is \'onStart\'. Use \'onStart { emitAll(other) }\'", replaceWith = @c0(expression = "onStart { emitAll(other) }", imports = {}))
    @l
    public static final i F(@l i i0, @l i i1) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Use \'launchIn\' with \'onEach\', \'onCompletion\' and \'catch\' instead")
    public static final void G(@l i i0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Use \'launchIn\' with \'onEach\', \'onCompletion\' and \'catch\' instead")
    public static final void H(@l i i0, @l o o0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Use \'launchIn\' with \'onEach\', \'onCompletion\' and \'catch\' instead")
    public static final void I(@l i i0, @l o o0, @l o o1) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Use \'flowOn\' instead")
    @l
    public static final i J(@l i i0, @l g g0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogues of \'switchMap\' are \'transformLatest\', \'flatMapLatest\' and \'mapLatest\'", replaceWith = @c0(expression = "this.flatMapLatest(transform)", imports = {}))
    @l
    public static final i K(@l i i0, @l o o0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {0xBD, 0xBD}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n*L\n1#1,214:1\n*E\n"})
        public static final class e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            private Object l;
            Object m;
            final o n;

            public e(o o0, d d0) {
                this.n = o0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l j j0, Object object0, @y4.m d d0) {
                e x$e0 = new e(this.n, d0);
                x$e0.l = j0;
                x$e0.m = object0;
                return x$e0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((j)object0), object1, ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                j j0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        j0 = (j)this.l;
                        this.l = j0;
                        this.k = 1;
                        object0 = this.n.invoke(this.m, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        j0 = (j)this.l;
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                this.l = null;
                this.k = 2;
                return kotlinx.coroutines.flow.k.m0(j0, ((i)object0), this) == object1 ? object1 : S0.a;
            }
        }

        return kotlinx.coroutines.flow.k.c2(i0, new e(o0, null));
    }

    @k(level = m.b, message = "Flow analogue of \'cache()\' is \'shareIn\' with unlimited replay and \'started = SharingStared.Lazily\' argument\'", replaceWith = @c0(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @l
    public static final i a(@l i i0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogue of \'combineLatest\' is \'combine\'", replaceWith = @c0(expression = "this.combine(other, transform)", imports = {}))
    @l
    public static final i b(@l i i0, @l i i1, @l p p0) {
        return kotlinx.coroutines.flow.k.D(i0, i1, p0);
    }

    @k(level = m.b, message = "Flow analogue of \'combineLatest\' is \'combine\'", replaceWith = @c0(expression = "combine(this, other, other2, transform)", imports = {}))
    @l
    public static final i c(@l i i0, @l i i1, @l i i2, @l q q0) {
        return kotlinx.coroutines.flow.k.E(i0, i1, i2, q0);
    }

    @k(level = m.b, message = "Flow analogue of \'combineLatest\' is \'combine\'", replaceWith = @c0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @l
    public static final i d(@l i i0, @l i i1, @l i i2, @l i i3, @l r r0) {
        return kotlinx.coroutines.flow.k.F(i0, i1, i2, i3, r0);
    }

    @k(level = m.b, message = "Flow analogue of \'combineLatest\' is \'combine\'", replaceWith = @c0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @l
    public static final i e(@l i i0, @l i i1, @l i i2, @l i i3, @l i i4, @l s s0) {
        return kotlinx.coroutines.flow.k.G(i0, i1, i2, i3, i4, s0);
    }

    @k(level = m.b, message = "Flow analogue of \'compose\' is \'let\'", replaceWith = @c0(expression = "let(transformer)", imports = {}))
    @l
    public static final i f(@l i i0, @l Function1 function10) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogue of \'concatMap\' is \'flatMapConcat\'", replaceWith = @c0(expression = "flatMapConcat(mapper)", imports = {}))
    @l
    public static final i g(@l i i0, @l Function1 function10) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogue of \'concatWith\' is \'onCompletion\'. Use \'onCompletion { emit(value) }\'", replaceWith = @c0(expression = "onCompletion { emit(value) }", imports = {}))
    @l
    public static final i h(@l i i0, Object object0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogue of \'concatWith\' is \'onCompletion\'. Use \'onCompletion { if (it == null) emitAll(other) }\'", replaceWith = @c0(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @l
    public static final i i(@l i i0, @l i i1) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Use \'onEach { delay(timeMillis) }\'", replaceWith = @c0(expression = "onEach { delay(timeMillis) }", imports = {}))
    @l
    public static final i j(@l i i0, long v) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {423}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements o {
            int k;
            final long l;

            a(long v, d d0) {
                this.l = v;
                super(2, d0);
            }

            @y4.m
            public final Object a(Object object0, @y4.m d d0) {
                return ((a)this.create(object0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                return new a(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(object0, ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return a0.b(this.l, this) == object1 ? object1 : S0.a;
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

        return kotlinx.coroutines.flow.k.e1(i0, new a(v, null));
    }

    @k(level = m.b, message = "Use \'onStart { delay(timeMillis) }\'", replaceWith = @c0(expression = "onStart { delay(timeMillis) }", imports = {}))
    @l
    public static final i k(@l i i0, long v) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {411}, m = "invokeSuspend", n = {}, s = {})
        static final class kotlinx.coroutines.flow.x.b extends kotlin.coroutines.jvm.internal.o implements o {
            int k;
            final long l;

            kotlinx.coroutines.flow.x.b(long v, d d0) {
                this.l = v;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                return new kotlinx.coroutines.flow.x.b(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((j)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l j j0, @y4.m d d0) {
                return ((kotlinx.coroutines.flow.x.b)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return a0.b(this.l, this) == object1 ? object1 : S0.a;
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

        return kotlinx.coroutines.flow.k.l1(i0, new kotlinx.coroutines.flow.x.b(v, null));
    }

    @k(level = m.b, message = "Flow analogue is \'flatMapConcat\'", replaceWith = @c0(expression = "flatMapConcat(mapper)", imports = {}))
    @l
    public static final i l(@l i i0, @l o o0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogue of \'flatten\' is \'flattenConcat\'", replaceWith = @c0(expression = "flattenConcat()", imports = {}))
    @l
    public static final i m(@l i i0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogue of \'forEach\' is \'collect\'", replaceWith = @c0(expression = "collect(action)", imports = {}))
    public static final void n(@l i i0, @l o o0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogue of \'merge\' is \'flattenConcat\'", replaceWith = @c0(expression = "flattenConcat()", imports = {}))
    @l
    public static final i o(@l i i0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @l
    public static final Void p() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @k(level = m.b, message = "Collect flow in the desired context instead")
    @l
    public static final i q(@l i i0, @l g g0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { emitAll(fallback) }\'", replaceWith = @c0(expression = "catch { emitAll(fallback) }", imports = {}))
    @l
    public static final i r(@l i i0, @l i i1) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { emitAll(fallback) }\'", replaceWith = @c0(expression = "catch { emitAll(fallback) }", imports = {}))
    @l
    public static final i s(@l i i0, @l i i1) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { emit(fallback) }\'", replaceWith = @c0(expression = "catch { emit(fallback) }", imports = {}))
    @l
    public static final i t(@l i i0, Object object0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { e -> if (predicate(e)) emit(fallback) else throw e }\'", replaceWith = @c0(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @l
    public static final i u(@l i i0, Object object0, @l Function1 function10) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
        static final class kotlinx.coroutines.flow.x.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            private Object l;
            Object m;
            final Function1 n;
            final Object o;

            kotlinx.coroutines.flow.x.d(Function1 function10, Object object0, d d0) {
                this.n = function10;
                this.o = object0;
                super(3, d0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((j)object0), ((Throwable)object1), ((d)object2));
            }

            @y4.m
            public final Object invoke(@l j j0, @l Throwable throwable0, @y4.m d d0) {
                kotlinx.coroutines.flow.x.d x$d0 = new kotlinx.coroutines.flow.x.d(this.n, this.o, d0);
                x$d0.l = j0;
                x$d0.m = throwable0;
                return x$d0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        j j0 = (j)this.l;
                        Throwable throwable0 = (Throwable)this.m;
                        if(!((Boolean)this.n.invoke(throwable0)).booleanValue()) {
                            throw throwable0;
                        }
                        this.l = null;
                        this.k = 1;
                        return j0.emit(this.o, this) == object1 ? object1 : S0.a;
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

        return kotlinx.coroutines.flow.k.u(i0, new kotlinx.coroutines.flow.x.d(function10, object0, null));
    }

    public static i v(i i0, Object object0, Function1 function10, int v, Object object1) {
        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(1);
            }

            @l
            public final Boolean a(@l Throwable throwable0) {
                return true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }

        if((v & 2) != 0) {
            function10 = c.e;
        }
        return kotlinx.coroutines.flow.k.j1(i0, object0, function10);
    }

    @k(level = m.b, message = "Flow analogue of \'publish()\' is \'shareIn\'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \npublish().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument.", replaceWith = @c0(expression = "this.shareIn(scope, 0)", imports = {}))
    @l
    public static final i w(@l i i0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogue of \'publish(bufferSize)\' is \'buffer\' followed by \'shareIn\'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \npublish().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument.", replaceWith = @c0(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @l
    public static final i x(@l i i0, int v) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Collect flow in the desired context instead")
    @l
    public static final i y(@l i i0, @l g g0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }

    @k(level = m.b, message = "Flow analogue of \'replay()\' is \'shareIn\' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \nreplay().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument.", replaceWith = @c0(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @l
    public static final i z(@l i i0) {
        kotlinx.coroutines.flow.k.b1();
        throw new y();
    }
}

