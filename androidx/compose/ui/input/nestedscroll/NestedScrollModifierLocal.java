package androidx.compose.ui.input.nestedscroll;

import A3.a;
import A3.o;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.b;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nNestedScrollModifierLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollModifierLocal.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,100:1\n76#2:101\n102#2,2:102\n*S KotlinDebug\n*F\n+ 1 NestedScrollModifierLocal.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal\n*L\n45#1:101\n45#1:102,2\n*E\n"})
public final class NestedScrollModifierLocal implements NestedScrollConnection, ModifierLocalConsumer, ModifierLocalProvider {
    @l
    private final NestedScrollDispatcher a;
    @l
    private final NestedScrollConnection b;
    @l
    private final MutableState c;

    public NestedScrollModifierLocal(@l NestedScrollDispatcher nestedScrollDispatcher0, @l NestedScrollConnection nestedScrollConnection0) {
        L.p(nestedScrollDispatcher0, "dispatcher");
        L.p(nestedScrollConnection0, "connection");
        super();
        this.a = nestedScrollDispatcher0;
        this.b = nestedScrollConnection0;
        nestedScrollDispatcher0.i(new a() {
            final NestedScrollModifierLocal e;

            {
                this.e = nestedScrollModifierLocal0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }

            @l
            public final O invoke() {
                return this.e.n();
            }
        });
        this.c = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return b.b(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, o o0) {
        return b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, o o0) {
        return b.d(this, object0, o0);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @m
    public Object a(long v, long v1, @l d d0) {
        NestedScrollModifierLocal nestedScrollModifierLocal0;
        long v5;
        long v4;
        androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.onPostFling.1 nestedScrollModifierLocal$onPostFling$10;
        if(d0 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.onPostFling.1) {
            nestedScrollModifierLocal$onPostFling$10 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.onPostFling.1)d0;
            int v2 = nestedScrollModifierLocal$onPostFling$10.p;
            if((v2 & 0x80000000) == 0) {
                nestedScrollModifierLocal$onPostFling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    long l;
                    long m;
                    Object n;
                    int p;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.n = object0;
                        this.p |= 0x80000000;
                        return d0.a(0L, 0L, this);
                    }
                };
            }
            else {
                nestedScrollModifierLocal$onPostFling$10.p = v2 ^ 0x80000000;
            }
        }
        else {
            nestedScrollModifierLocal$onPostFling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                long l;
                long m;
                Object n;
                int p;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.n = object0;
                    this.p |= 0x80000000;
                    return d0.a(0L, 0L, this);
                }
            };
        }
        Object object0 = nestedScrollModifierLocal$onPostFling$10.n;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(nestedScrollModifierLocal$onPostFling$10.p) {
            case 0: {
                f0.n(object0);
                nestedScrollModifierLocal$onPostFling$10.k = this;
                v4 = v;
                nestedScrollModifierLocal$onPostFling$10.l = v4;
                v5 = v1;
                nestedScrollModifierLocal$onPostFling$10.m = v5;
                nestedScrollModifierLocal$onPostFling$10.p = 1;
                object0 = this.b.a(v, v1, nestedScrollModifierLocal$onPostFling$10);
                if(object0 == object1) {
                    return object1;
                }
                nestedScrollModifierLocal0 = this;
                break;
            }
            case 1: {
                long v6 = nestedScrollModifierLocal$onPostFling$10.m;
                long v7 = nestedScrollModifierLocal$onPostFling$10.l;
                nestedScrollModifierLocal0 = (NestedScrollModifierLocal)nestedScrollModifierLocal$onPostFling$10.k;
                f0.n(object0);
                v5 = v6;
                v4 = v7;
                break;
            }
            case 2: {
                long v3 = nestedScrollModifierLocal$onPostFling$10.l;
                f0.n(object0);
                return Velocity.b(Velocity.q(v3, ((Velocity)object0).v()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        long v8 = ((Velocity)object0).v();
        NestedScrollModifierLocal nestedScrollModifierLocal1 = nestedScrollModifierLocal0.p();
        if(nestedScrollModifierLocal1 != null) {
            nestedScrollModifierLocal$onPostFling$10.k = null;
            nestedScrollModifierLocal$onPostFling$10.l = v8;
            nestedScrollModifierLocal$onPostFling$10.p = 2;
            object0 = nestedScrollModifierLocal1.a(Velocity.q(v4, v8), Velocity.p(v5, v8), nestedScrollModifierLocal$onPostFling$10);
            return object0 == object1 ? object1 : Velocity.b(Velocity.q(v8, ((Velocity)object0).v()));
        }
        return Velocity.b(Velocity.q(v8, 0L));
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long b(long v, long v1, int v2) {
        long v3 = this.b.b(v, v1, v2);
        NestedScrollModifierLocal nestedScrollModifierLocal0 = this.p();
        return nestedScrollModifierLocal0 == null ? Offset.v(v3, 0L) : Offset.v(v3, nestedScrollModifierLocal0.b(Offset.v(v, v3), Offset.u(v1, v3), v2));
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @m
    public Object d(long v, @l d d0) {
        long v3;
        NestedScrollModifierLocal nestedScrollModifierLocal1;
        androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.onPreFling.1 nestedScrollModifierLocal$onPreFling$10;
        if(d0 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.onPreFling.1) {
            nestedScrollModifierLocal$onPreFling$10 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.onPreFling.1)d0;
            int v1 = nestedScrollModifierLocal$onPreFling$10.o;
            if((v1 & 0x80000000) == 0) {
                nestedScrollModifierLocal$onPreFling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    long l;
                    Object m;
                    int o;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.o |= 0x80000000;
                        return d0.d(0L, this);
                    }
                };
            }
            else {
                nestedScrollModifierLocal$onPreFling$10.o = v1 ^ 0x80000000;
            }
        }
        else {
            nestedScrollModifierLocal$onPreFling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                long l;
                Object m;
                int o;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.o |= 0x80000000;
                    return d0.d(0L, this);
                }
            };
        }
        Object object0 = nestedScrollModifierLocal$onPreFling$10.m;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(nestedScrollModifierLocal$onPreFling$10.o) {
            case 0: {
                f0.n(object0);
                NestedScrollModifierLocal nestedScrollModifierLocal0 = this.p();
                if(nestedScrollModifierLocal0 == null) {
                    v3 = 0L;
                    nestedScrollModifierLocal1 = this;
                }
                else {
                    nestedScrollModifierLocal$onPreFling$10.k = this;
                    nestedScrollModifierLocal$onPreFling$10.l = v;
                    nestedScrollModifierLocal$onPreFling$10.o = 1;
                    object0 = nestedScrollModifierLocal0.d(v, nestedScrollModifierLocal$onPreFling$10);
                    if(object0 == object1) {
                        return object1;
                    }
                    nestedScrollModifierLocal1 = this;
                    v3 = ((Velocity)object0).v();
                }
                break;
            }
            case 1: {
                v = nestedScrollModifierLocal$onPreFling$10.l;
                nestedScrollModifierLocal1 = (NestedScrollModifierLocal)nestedScrollModifierLocal$onPreFling$10.k;
                f0.n(object0);
                v3 = ((Velocity)object0).v();
                break;
            }
            case 2: {
                long v2 = nestedScrollModifierLocal$onPreFling$10.l;
                f0.n(object0);
                return Velocity.b(Velocity.q(v2, ((Velocity)object0).v()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        nestedScrollModifierLocal$onPreFling$10.k = null;
        nestedScrollModifierLocal$onPreFling$10.l = v3;
        nestedScrollModifierLocal$onPreFling$10.o = 2;
        object0 = nestedScrollModifierLocal1.b.d(Velocity.p(v, v3), nestedScrollModifierLocal$onPreFling$10);
        return object0 == object1 ? object1 : Velocity.b(Velocity.q(v3, ((Velocity)object0).v()));
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    @l
    public ProvidableModifierLocal getKey() {
        return NestedScrollModifierLocalKt.a();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    public Object getValue() {
        return this;
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long i(long v, int v1) {
        NestedScrollModifierLocal nestedScrollModifierLocal0 = this.p();
        long v2 = nestedScrollModifierLocal0 == null ? 0L : nestedScrollModifierLocal0.i(v, v1);
        long v3 = Offset.u(v, v2);
        return Offset.v(v2, this.b.i(v3, v1));
    }

    @l
    public final NestedScrollConnection l() {
        return this.b;
    }

    @l
    public final NestedScrollDispatcher m() {
        return this.a;
    }

    private final O n() {
        O o0;
        NestedScrollModifierLocal nestedScrollModifierLocal0 = this.p();
        if(nestedScrollModifierLocal0 != null) {
            o0 = nestedScrollModifierLocal0.n();
            if(o0 == null) {
                goto label_4;
            }
            return o0;
        }
    label_4:
        o0 = this.a.g();
        if(o0 == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return o0;
    }

    private final NestedScrollModifierLocal p() {
        return (NestedScrollModifierLocal)this.c.getValue();
    }

    @l
    public NestedScrollModifierLocal q() [...] // Inlined contents

    private final void r(NestedScrollModifierLocal nestedScrollModifierLocal0) {
        this.c.setValue(nestedScrollModifierLocal0);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return androidx.compose.ui.a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void r1(@l ModifierLocalReadScope modifierLocalReadScope0) {
        L.p(modifierLocalReadScope0, "scope");
        this.r(((NestedScrollModifierLocal)modifierLocalReadScope0.a(NestedScrollModifierLocalKt.a())));
        NestedScrollModifierLocal nestedScrollModifierLocal0 = this.p();
        this.a.k(nestedScrollModifierLocal0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

