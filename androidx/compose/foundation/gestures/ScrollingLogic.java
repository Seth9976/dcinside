package androidx.compose.foundation.gestures;

import A3.o;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.g;
import y4.l;
import y4.m;

final class ScrollingLogic {
    @l
    private final Orientation a;
    private final boolean b;
    @l
    private final State c;
    @l
    private final ScrollableState d;
    @l
    private final FlingBehavior e;
    @m
    private final OverscrollEffect f;
    @l
    private final MutableState g;

    public ScrollingLogic(@l Orientation orientation0, boolean z, @l State state0, @l ScrollableState scrollableState0, @l FlingBehavior flingBehavior0, @m OverscrollEffect overscrollEffect0) {
        L.p(orientation0, "orientation");
        L.p(state0, "nestedScrollDispatcher");
        L.p(scrollableState0, "scrollableState");
        L.p(flingBehavior0, "flingBehavior");
        super();
        this.a = orientation0;
        this.b = z;
        this.c = state0;
        this.d = scrollableState0;
        this.e = flingBehavior0;
        this.f = overscrollEffect0;
        this.g = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
    }

    public final long a(@l ScrollScope scrollScope0, long v, int v1) {
        L.p(scrollScope0, "$this$dispatchScroll");
        long v2 = this.p(v);
        androidx.compose.foundation.gestures.ScrollingLogic.dispatchScroll.performScroll.1 scrollingLogic$dispatchScroll$performScroll$10 = new Function1(v1, scrollScope0) {
            final ScrollingLogic e;
            final int f;
            final ScrollScope g;

            {
                this.e = scrollingLogic0;
                this.f = v;
                this.g = scrollScope0;
                super(1);
            }

            public final long a(long v) {
                Object object0 = this.e.d().getValue();
                long v1 = ((NestedScrollDispatcher)object0).d(v, this.f);
                long v2 = Offset.u(v, v1);
                long v3 = this.e.n(v2);
                float f = this.e.s(v3);
                float f1 = this.g.a(f);
                long v4 = this.e.t(f1);
                long v5 = this.e.n(v4);
                long v6 = ((NestedScrollDispatcher)object0).b(v5, Offset.u(v2, v5), this.f);
                return Offset.v(Offset.v(v1, v5), v6);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Offset.d(this.a(((Offset)object0).A()));
            }
        };
        return this.f == null || !this.i() ? ((Offset)scrollingLogic$dispatchScroll$performScroll$10.invoke(Offset.d(v2))).A() : this.f.c(v2, v1, scrollingLogic$dispatchScroll$performScroll$10);
    }

    @m
    public final Object b(long v, @l d d0) {
        androidx.compose.foundation.gestures.ScrollingLogic.doFlingAnimation.1 scrollingLogic$doFlingAnimation$10;
        if(d0 instanceof androidx.compose.foundation.gestures.ScrollingLogic.doFlingAnimation.1) {
            scrollingLogic$doFlingAnimation$10 = (androidx.compose.foundation.gestures.ScrollingLogic.doFlingAnimation.1)d0;
            int v1 = scrollingLogic$doFlingAnimation$10.n;
            if((v1 & 0x80000000) == 0) {
                scrollingLogic$doFlingAnimation$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return d0.b(0L, this);
                    }
                };
            }
            else {
                scrollingLogic$doFlingAnimation$10.n = v1 ^ 0x80000000;
            }
        }
        else {
            scrollingLogic$doFlingAnimation$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.n |= 0x80000000;
                    return d0.b(0L, this);
                }
            };
        }
        Object object0 = scrollingLogic$doFlingAnimation$10.l;
        Object object1 = b.l();
        switch(scrollingLogic$doFlingAnimation$10.n) {
            case 0: {
                f0.n(object0);
                g l0$g0 = new g();
                l0$g0.a = v;
                androidx.compose.foundation.gestures.ScrollingLogic.doFlingAnimation.2 scrollingLogic$doFlingAnimation$20 = new o(l0$g0, v, null) {
                    Object k;
                    Object l;
                    long m;
                    int n;
                    private Object o;
                    final ScrollingLogic p;
                    final g q;
                    final long r;

                    {
                        this.p = scrollingLogic0;
                        this.q = l0$g0;
                        this.r = v;
                        super(2, d0);
                    }

                    @m
                    public final Object a(@l ScrollScope scrollScope0, @m d d0) {
                        return ((androidx.compose.foundation.gestures.ScrollingLogic.doFlingAnimation.2)this.create(scrollScope0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new androidx.compose.foundation.gestures.ScrollingLogic.doFlingAnimation.2(this.p, this.q, this.r, d0);
                        d1.o = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((ScrollScope)object0), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        long v1;
                        ScrollingLogic scrollingLogic1;
                        g l0$g1;
                        ScrollingLogic scrollingLogic0;
                        Object object1 = b.l();
                        switch(this.n) {
                            case 0: {
                                f0.n(object0);
                                androidx.compose.foundation.gestures.ScrollingLogic.doFlingAnimation.2.outerScopeScroll.1 scrollingLogic$doFlingAnimation$2$outerScopeScroll$10 = new Function1(((ScrollScope)this.o)) {
                                    final ScrollingLogic e;
                                    final ScrollScope f;

                                    {
                                        this.e = scrollingLogic0;
                                        this.f = scrollScope0;
                                        super(1);
                                    }

                                    public final long a(long v) {
                                        long v1 = this.e.n(v);
                                        long v2 = this.e.a(this.f, v1, 2);
                                        return this.e.n(v2);
                                    }

                                    @Override  // kotlin.jvm.functions.Function1
                                    public Object invoke(Object object0) {
                                        return Offset.d(this.a(((Offset)object0).A()));
                                    }
                                };
                                androidx.compose.foundation.gestures.ScrollingLogic.doFlingAnimation.2.scope.1 scrollingLogic$doFlingAnimation$2$scope$10 = new ScrollScope() {
                                    @Override  // androidx.compose.foundation.gestures.ScrollScope
                                    public float a(float f) {
                                        Offset offset0 = Offset.d(scrollingLogic$doFlingAnimation$2$outerScopeScroll$10.t(f));
                                        long v = ((Offset)this.b.invoke(offset0)).A();
                                        return scrollingLogic$doFlingAnimation$2$outerScopeScroll$10.s(v);
                                    }
                                };
                                scrollingLogic0 = this.p;
                                g l0$g0 = this.q;
                                long v = l0$g0.a;
                                float f = scrollingLogic0.m(scrollingLogic0.r(this.r));
                                this.o = scrollingLogic0;
                                this.k = scrollingLogic0;
                                this.l = l0$g0;
                                this.m = v;
                                this.n = 1;
                                object0 = scrollingLogic0.c().a(scrollingLogic$doFlingAnimation$2$scope$10, f, this);
                                if(object0 == object1) {
                                    return object1;
                                }
                                l0$g1 = l0$g0;
                                scrollingLogic1 = scrollingLogic0;
                                v1 = v;
                                break;
                            }
                            case 1: {
                                v1 = this.m;
                                l0$g1 = (g)this.l;
                                scrollingLogic0 = (ScrollingLogic)this.k;
                                scrollingLogic1 = (ScrollingLogic)this.o;
                                f0.n(object0);
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        l0$g1.a = scrollingLogic0.u(v1, scrollingLogic1.m(((Number)object0).floatValue()));
                        return S0.a;
                    }
                };
                scrollingLogic$doFlingAnimation$10.k = l0$g0;
                scrollingLogic$doFlingAnimation$10.n = 1;
                return c.e(this.d, null, scrollingLogic$doFlingAnimation$20, scrollingLogic$doFlingAnimation$10, 1, null) == object1 ? object1 : Velocity.b(l0$g0.a);
            }
            case 1: {
                g l0$g1 = (g)scrollingLogic$doFlingAnimation$10.k;
                f0.n(object0);
                return Velocity.b(l0$g1.a);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @l
    public final FlingBehavior c() {
        return this.e;
    }

    @l
    public final State d() {
        return this.c;
    }

    @l
    public final Orientation e() {
        return this.a;
    }

    @m
    public final OverscrollEffect f() {
        return this.f;
    }

    public final boolean g() {
        return this.b;
    }

    @l
    public final ScrollableState h() {
        return this.d;
    }

    // 去混淆评级： 低(20)
    private final boolean i() {
        return this.d.a() || this.d.e();
    }

    @m
    public final Object j(long v, @l d d0) {
        ScrollingLogic scrollingLogic0;
        androidx.compose.foundation.gestures.ScrollingLogic.onDragStopped.1 scrollingLogic$onDragStopped$10;
        if(d0 instanceof androidx.compose.foundation.gestures.ScrollingLogic.onDragStopped.1) {
            scrollingLogic$onDragStopped$10 = (androidx.compose.foundation.gestures.ScrollingLogic.onDragStopped.1)d0;
            int v1 = scrollingLogic$onDragStopped$10.n;
            if((v1 & 0x80000000) == 0) {
                scrollingLogic$onDragStopped$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return d0.j(0L, this);
                    }
                };
            }
            else {
                scrollingLogic$onDragStopped$10.n = v1 ^ 0x80000000;
            }
        }
        else {
            scrollingLogic$onDragStopped$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.n |= 0x80000000;
                    return d0.j(0L, this);
                }
            };
        }
        Object object0 = scrollingLogic$onDragStopped$10.l;
        Object object1 = b.l();
        switch(scrollingLogic$onDragStopped$10.n) {
            case 0: {
                f0.n(object0);
                this.l(true);
                long v2 = this.q(v);
                androidx.compose.foundation.gestures.ScrollingLogic.onDragStopped.performFling.1 scrollingLogic$onDragStopped$performFling$10 = new o(null) {
                    long k;
                    int l;
                    long m;
                    final ScrollingLogic n;

                    {
                        this.n = scrollingLogic0;
                        super(2, d0);
                    }

                    @m
                    public final Object a(long v, @m d d0) {
                        return ((androidx.compose.foundation.gestures.ScrollingLogic.onDragStopped.performFling.1)this.create(Velocity.b(v), d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new androidx.compose.foundation.gestures.ScrollingLogic.onDragStopped.performFling.1(this.n, d0);
                        d1.m = ((Velocity)object0).v();
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((Velocity)object0).v(), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        long v6;
                        long v5;
                        Object object3;
                        long v3;
                        Object object2;
                        Object object1 = b.l();
                        switch(this.l) {
                            case 0: {
                                f0.n(object0);
                                long v2 = this.m;
                                NestedScrollDispatcher nestedScrollDispatcher0 = (NestedScrollDispatcher)this.n.d().getValue();
                                this.m = v2;
                                this.l = 1;
                                object2 = nestedScrollDispatcher0.c(v2, this);
                                if(object2 == object1) {
                                    return object1;
                                }
                                v3 = v2;
                                goto label_20;
                            }
                            case 1: {
                                v3 = this.m;
                                f0.n(object0);
                                object2 = object0;
                            label_20:
                                long v4 = Velocity.p(v3, ((Velocity)object2).v());
                                this.m = v3;
                                this.k = v4;
                                this.l = 2;
                                object3 = this.n.b(v4, this);
                                if(object3 == object1) {
                                    return object1;
                                }
                                v5 = v4;
                                v6 = v3;
                                break;
                            }
                            case 2: {
                                v5 = this.k;
                                long v7 = this.m;
                                f0.n(object0);
                                object3 = object0;
                                v6 = v7;
                                break;
                            }
                            case 3: {
                                long v = this.k;
                                long v1 = this.m;
                                f0.n(object0);
                                return Velocity.b(Velocity.p(v1, Velocity.p(v, ((Velocity)object0).v())));
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        long v8 = ((Velocity)object3).v();
                        NestedScrollDispatcher nestedScrollDispatcher1 = (NestedScrollDispatcher)this.n.d().getValue();
                        this.m = v6;
                        this.k = v8;
                        this.l = 3;
                        Object object4 = nestedScrollDispatcher1.a(Velocity.p(v5, v8), v8, this);
                        return object4 == object1 ? object1 : Velocity.b(Velocity.p(v6, Velocity.p(v8, ((Velocity)object4).v())));
                    }
                };
                if(this.f == null || !this.i()) {
                    Velocity velocity0 = Velocity.b(v2);
                    scrollingLogic$onDragStopped$10.k = this;
                    scrollingLogic$onDragStopped$10.n = 2;
                    if(scrollingLogic$onDragStopped$performFling$10.invoke(velocity0, scrollingLogic$onDragStopped$10) == object1) {
                        return object1;
                    }
                }
                else {
                    scrollingLogic$onDragStopped$10.k = this;
                    scrollingLogic$onDragStopped$10.n = 1;
                    if(this.f.d(v2, scrollingLogic$onDragStopped$performFling$10, scrollingLogic$onDragStopped$10) == object1) {
                        return object1;
                    }
                }
                scrollingLogic0 = this;
                break;
            }
            case 1: 
            case 2: {
                scrollingLogic0 = (ScrollingLogic)scrollingLogic$onDragStopped$10.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        scrollingLogic0.l(false);
        return S0.a;
    }

    public final long k(long v) {
        if(this.d.c()) {
            return 0L;
        }
        float f = this.m(this.s(v));
        return this.t(this.m(this.d.b(f)));
    }

    public final void l(boolean z) {
        this.g.setValue(Boolean.valueOf(z));
    }

    // 去混淆评级： 低(20)
    public final float m(float f) {
        return this.b ? f * -1.0f : f;
    }

    // 去混淆评级： 低(20)
    public final long n(long v) {
        return this.b ? Offset.x(v, -1.0f) : v;
    }

    public final boolean o() {
        if(!this.d.c() && !((Boolean)this.g.getValue()).booleanValue()) {
            return this.f == null ? false : this.f.a();
        }
        return true;
    }

    public final long p(long v) {
        return this.a == Orientation.b ? Offset.i(v, 0.0f, 0.0f, 1, null) : Offset.i(v, 0.0f, 0.0f, 2, null);
    }

    public final long q(long v) {
        return this.a == Orientation.b ? Velocity.g(v, 0.0f, 0.0f, 1, null) : Velocity.g(v, 0.0f, 0.0f, 2, null);
    }

    public final float r(long v) {
        return this.a == Orientation.b ? Velocity.l(v) : Velocity.n(v);
    }

    public final float s(long v) {
        return this.a == Orientation.b ? Offset.p(v) : Offset.r(v);
    }

    public final long t(float f) {
        if(f == 0.0f) {
            return 0L;
        }
        return this.a == Orientation.b ? OffsetKt.a(f, 0.0f) : OffsetKt.a(0.0f, f);
    }

    public final long u(long v, float f) {
        return this.a == Orientation.b ? Velocity.g(v, f, 0.0f, 2, null) : Velocity.g(v, 0.0f, f, 1, null);
    }
}

