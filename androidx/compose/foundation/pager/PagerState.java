package androidx.compose.foundation.pager;

import A3.a;
import A3.o;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.unit.Density;
import java.util.List;
import java.util.ListIterator;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.math.b;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
@Stable
@s0({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,455:1\n76#2:456\n102#2,2:457\n76#2:459\n102#2,2:460\n76#2:462\n102#2,2:463\n76#2:484\n76#2:485\n102#2,2:486\n76#2:488\n102#2,2:489\n76#2:491\n76#2:492\n76#2:493\n171#3,13:465\n533#4,6:478\n452#5,4:494\n452#5,4:498\n452#5,4:502\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n96#1:456\n96#1:457,2\n98#1:459\n98#1:460,2\n100#1:462\n100#1:463,2\n177#1:484\n179#1:485\n179#1:486,2\n181#1:488\n181#1:489,2\n191#1:491\n204#1:492\n238#1:493\n133#1:465,13\n144#1:478,6\n262#1:494,4\n312#1:498,4\n328#1:502,4\n*E\n"})
public final class PagerState implements ScrollableState {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Saver a() {
            return PagerState.o;
        }
    }

    private final int a;
    private final float b;
    @l
    private final MutableState c;
    @l
    private final MutableState d;
    @l
    private final MutableState e;
    @l
    private final AwaitLazyListStateSet f;
    @l
    private final State g;
    @l
    private final MutableState h;
    @l
    private final MutableState i;
    @l
    private final State j;
    @l
    private final State k;
    @l
    private final State l;
    @l
    public static final Companion m;
    public static final int n;
    @l
    private static final Saver o;

    static {
        PagerState.m = new Companion(null);
        PagerState.o = ListSaverKt.a(PagerState.Companion.Saver.1.e, PagerState.Companion.Saver.2.e);
    }

    public PagerState() {
        this(0, 0.0f, 3, null);
    }

    public PagerState(int v, float f) {
        this.a = v;
        this.b = f;
        if(-0.5 > ((double)f) || ((double)f) > 0.5) {
            throw new IllegalArgumentException(("initialPageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
        }
        this.c = SnapshotStateKt__SnapshotStateKt.g(0.0f, null, 2, null);
        this.d = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.e = SnapshotStateKt__SnapshotStateKt.g(0, null, 2, null);
        this.f = new AwaitLazyListStateSet();
        this.g = SnapshotStateKt.c(new a() {
            final PagerState e;

            {
                this.e = pagerState0;
                super(0);
            }

            @l
            public final Integer b() {
                LazyListItemInfo lazyListItemInfo0 = this.e.s();
                return lazyListItemInfo0 == null ? this.e.y() : lazyListItemInfo0.getIndex();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        this.h = SnapshotStateKt__SnapshotStateKt.g(-1, null, 2, null);
        this.i = SnapshotStateKt__SnapshotStateKt.g(v, null, 2, null);
        this.j = SnapshotStateKt.c(new a() {
            final PagerState e;

            {
                this.e = pagerState0;
                super(0);
            }

            @l
            public final Integer b() {
                if(this.e.E() == 0) {
                    return 0;
                }
                int v = this.e.J();
                return this.e.q(v);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        this.k = SnapshotStateKt.c(new a() {
            final PagerState e;

            {
                this.e = pagerState0;
                super(0);
            }

            @l
            public final Integer b() {
                int v;
                if(!this.e.c()) {
                    v = this.e.t();
                    return this.e.q(v);
                }
                if(this.e.r() != -1) {
                    v = this.e.r();
                    return this.e.q(v);
                }
                if(this.e.K() == 0.0f) {
                    if(Math.abs(this.e.u()) >= Math.abs(this.e.H())) {
                        v = this.e.t() + ((int)Math.signum(this.e.u()));
                        return this.e.q(v);
                    }
                    v = this.e.t();
                    return this.e.q(v);
                }
                float f = this.e.K() / ((float)this.e.D());
                int v1 = this.e.t();
                v = b.L0(f) + v1;
                return this.e.q(v);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        this.l = SnapshotStateKt.c(new a() {
            final PagerState e;

            {
                this.e = pagerState0;
                super(0);
            }

            @l
            public final Float b() {
                LazyListItemInfo lazyListItemInfo0 = this.e.s();
                int v = lazyListItemInfo0 == null ? 0 : lazyListItemInfo0.getOffset();
                float f = (float)this.e.D();
                return f == 0.0f ? this.e.z() : s.H(((float)(-v)) / f, -0.5f, 0.5f);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    public PagerState(int v, float f, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        this(v, f);
    }

    @l
    public final InteractionSource A() {
        LazyListState lazyListState0 = this.C();
        if(lazyListState0 != null) {
            InteractionSource interactionSource0 = lazyListState0.p();
            if(interactionSource0 != null) {
                return interactionSource0;
            }
        }
        return PagerStateKt.h;
    }

    @l
    public final LazyListLayoutInfo B() {
        LazyListState lazyListState0 = this.C();
        if(lazyListState0 != null) {
            LazyListLayoutInfo lazyListLayoutInfo0 = lazyListState0.r();
            if(lazyListLayoutInfo0 != null) {
                return lazyListLayoutInfo0;
            }
        }
        return PagerStateKt.f;
    }

    private final LazyListState C() {
        return (LazyListState)this.d.getValue();
    }

    private final int D() {
        return this.F() + this.G();
    }

    public final int E() {
        return this.B().c();
    }

    public final int F() {
        LazyListItemInfo lazyListItemInfo0 = (LazyListItemInfo)u.G2(this.M());
        return lazyListItemInfo0 == null ? 0 : lazyListItemInfo0.getSize();
    }

    public final int G() {
        return ((Number)this.e.getValue()).intValue();
    }

    // 去混淆评级： 低(20)
    private final float H() {
        return Math.min(this.v().y1(56.0f), ((float)this.F()) / 2.0f) / ((float)this.F());
    }

    public final int I() {
        return ((Number)this.j.getValue()).intValue();
    }

    private final int J() {
        return ((Number)this.i.getValue()).intValue();
    }

    public final float K() {
        return ((Number)this.c.getValue()).floatValue();
    }

    public final int L() {
        return ((Number)this.k.getValue()).intValue();
    }

    private final List M() {
        return this.B().f();
    }

    public final void N(@l LazyListState lazyListState0) {
        L.p(lazyListState0, "newState");
        this.R(lazyListState0);
        this.f.a();
    }

    @m
    public final Object O(int v, float f, @l d d0) {
        PagerState pagerState0;
        androidx.compose.foundation.pager.PagerState.scrollToPage.1 pagerState$scrollToPage$10;
        if(d0 instanceof androidx.compose.foundation.pager.PagerState.scrollToPage.1) {
            pagerState$scrollToPage$10 = (androidx.compose.foundation.pager.PagerState.scrollToPage.1)d0;
            int v1 = pagerState$scrollToPage$10.p;
            if((v1 & 0x80000000) == 0) {
                pagerState$scrollToPage$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    int l;
                    float m;
                    Object n;
                    int p;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.n = object0;
                        this.p |= 0x80000000;
                        return d0.O(0, 0.0f, this);
                    }
                };
            }
            else {
                pagerState$scrollToPage$10.p = v1 ^ 0x80000000;
            }
        }
        else {
            pagerState$scrollToPage$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                int l;
                float m;
                Object n;
                int p;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.n = object0;
                    this.p |= 0x80000000;
                    return d0.O(0, 0.0f, this);
                }
            };
        }
        Object object0 = pagerState$scrollToPage$10.n;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(pagerState$scrollToPage$10.p) {
            case 0: {
                f0.n(object0);
                pagerState$scrollToPage$10.k = this;
                pagerState$scrollToPage$10.l = v;
                pagerState$scrollToPage$10.m = f;
                pagerState$scrollToPage$10.p = 1;
                if(this.p(pagerState$scrollToPage$10) == object1) {
                    return object1;
                }
                pagerState0 = this;
                break;
            }
            case 1: {
                f = pagerState$scrollToPage$10.m;
                v = pagerState$scrollToPage$10.l;
                pagerState0 = (PagerState)pagerState$scrollToPage$10.k;
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
        if(-0.5 > ((double)f) || ((double)f) > 0.5) {
            throw new IllegalArgumentException(("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
        }
        int v2 = pagerState0.q(v);
        int v3 = b.L0(((float)pagerState0.D()) * f);
        LazyListState lazyListState0 = pagerState0.C();
        if(lazyListState0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        pagerState$scrollToPage$10.k = null;
        pagerState$scrollToPage$10.p = 2;
        return lazyListState0.D(v2, v3, pagerState$scrollToPage$10) == object1 ? object1 : S0.a;
    }

    public static Object P(PagerState pagerState0, int v, float f, d d0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState0.O(v, f, d0);
    }

    private final void Q(int v) {
        this.h.setValue(v);
    }

    private final void R(LazyListState lazyListState0) {
        this.d.setValue(lazyListState0);
    }

    public final void S(int v) {
        this.e.setValue(v);
    }

    private final void T(int v) {
        this.i.setValue(v);
    }

    public final void U(float f) {
        this.c.setValue(f);
    }

    public final void V() {
        this.T(this.t());
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean a() {
        LazyListState lazyListState0 = this.C();
        return lazyListState0 == null ? true : lazyListState0.a();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public float b(float f) {
        LazyListState lazyListState0 = this.C();
        return lazyListState0 == null ? 0.0f : lazyListState0.b(f);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean c() {
        LazyListState lazyListState0 = this.C();
        return lazyListState0 == null ? false : lazyListState0.c();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    @m
    public Object d(@l MutatePriority mutatePriority0, @l o o0, @l d d0) {
        LazyListState lazyListState0 = this.C();
        if(lazyListState0 != null) {
            Object object0 = lazyListState0.d(mutatePriority0, o0, d0);
            return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
        }
        return S0.a;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean e() {
        LazyListState lazyListState0 = this.C();
        return lazyListState0 == null ? true : lazyListState0.e();
    }

    @m
    public final Object n(int v, float f, @l AnimationSpec animationSpec0, @l d d0) {
        int v7;
        float f1;
        PagerState pagerState2;
        AnimationSpec animationSpec1;
        int v6;
        PagerState pagerState3;
        int v3;
        int v2;
        PagerState pagerState0;
        androidx.compose.foundation.pager.PagerState.animateScrollToPage.1 pagerState$animateScrollToPage$10;
        if(d0 instanceof androidx.compose.foundation.pager.PagerState.animateScrollToPage.1) {
            pagerState$animateScrollToPage$10 = (androidx.compose.foundation.pager.PagerState.animateScrollToPage.1)d0;
            int v1 = pagerState$animateScrollToPage$10.r;
            if((v1 & 0x80000000) == 0) {
                pagerState$animateScrollToPage$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int m;
                    int n;
                    float o;
                    Object p;
                    int r;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.p = object0;
                        this.r |= 0x80000000;
                        return d0.n(0, 0.0f, null, this);
                    }
                };
            }
            else {
                pagerState$animateScrollToPage$10.r = v1 ^ 0x80000000;
            }
        }
        else {
            pagerState$animateScrollToPage$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                int m;
                int n;
                float o;
                Object p;
                int r;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.p = object0;
                    this.r |= 0x80000000;
                    return d0.n(0, 0.0f, null, this);
                }
            };
        }
        Object object0 = pagerState$animateScrollToPage$10.p;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(pagerState$animateScrollToPage$10.r) {
            case 0: {
                f0.n(object0);
                if(v == this.t()) {
                    return S0.a;
                }
                pagerState$animateScrollToPage$10.k = this;
                pagerState$animateScrollToPage$10.l = animationSpec0;
                pagerState$animateScrollToPage$10.m = v;
                pagerState$animateScrollToPage$10.o = f;
                pagerState$animateScrollToPage$10.r = 1;
                if(this.p(pagerState$animateScrollToPage$10) == object1) {
                    return object1;
                }
                pagerState0 = this;
                goto label_31;
            }
            case 1: {
                f = pagerState$animateScrollToPage$10.o;
                v = pagerState$animateScrollToPage$10.m;
                animationSpec0 = (AnimationSpec)pagerState$animateScrollToPage$10.l;
                PagerState pagerState1 = (PagerState)pagerState$animateScrollToPage$10.k;
                f0.n(object0);
                pagerState0 = pagerState1;
            label_31:
                if(-0.5 > ((double)f) || ((double)f) > 0.5) {
                    throw new IllegalArgumentException(("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
                }
                v2 = pagerState0.t();
                v3 = pagerState0.q(v);
                pagerState0.Q(v3);
                int v4 = ((LazyListItemInfo)u.B2(pagerState0.M())).getIndex();
                int v5 = ((LazyListItemInfo)u.p3(pagerState0.M())).getIndex();
                if((v <= pagerState0.t() || v <= v5) && (v >= pagerState0.t() || v >= v4) || Math.abs(v - pagerState0.t()) < 3) {
                    pagerState3 = pagerState0;
                }
                else {
                    v6 = v <= pagerState0.t() ? v + s.B(pagerState0.M().size(), v2) : s.u(v - pagerState0.M().size(), v2);
                    LazyListState lazyListState0 = pagerState0.C();
                    if(lazyListState0 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    pagerState$animateScrollToPage$10.k = pagerState0;
                    pagerState$animateScrollToPage$10.l = animationSpec0;
                    pagerState$animateScrollToPage$10.o = f;
                    pagerState$animateScrollToPage$10.m = v3;
                    pagerState$animateScrollToPage$10.n = v6;
                    pagerState$animateScrollToPage$10.r = 2;
                    if(LazyListState.E(lazyListState0, v6, 0, pagerState$animateScrollToPage$10, 2, null) == object1) {
                        return object1;
                    }
                    animationSpec1 = animationSpec0;
                    pagerState2 = pagerState0;
                    f1 = f;
                    v7 = v3;
                    goto label_64;
                }
                goto label_69;
            }
            case 2: {
                v6 = pagerState$animateScrollToPage$10.n;
                v7 = pagerState$animateScrollToPage$10.m;
                f1 = pagerState$animateScrollToPage$10.o;
                animationSpec1 = (AnimationSpec)pagerState$animateScrollToPage$10.l;
                pagerState2 = (PagerState)pagerState$animateScrollToPage$10.k;
                f0.n(object0);
            label_64:
                v3 = v7;
                f = f1;
                animationSpec0 = animationSpec1;
                v2 = v6;
                pagerState3 = pagerState2;
            label_69:
                float f2 = ((float)(v3 * pagerState3.D() - v2 * pagerState3.D())) + (pagerState3.w() + f * ((float)pagerState3.D()));
                LazyListState lazyListState1 = pagerState3.C();
                if(lazyListState1 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                pagerState$animateScrollToPage$10.k = pagerState3;
                pagerState$animateScrollToPage$10.l = null;
                pagerState$animateScrollToPage$10.r = 3;
                if(ScrollExtensionsKt.a(lazyListState1, f2, animationSpec0, pagerState$animateScrollToPage$10) == object1) {
                    return object1;
                }
                pagerState3.Q(-1);
                return S0.a;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        pagerState3 = (PagerState)pagerState$animateScrollToPage$10.k;
        f0.n(object0);
        pagerState3.Q(-1);
        return S0.a;
    }

    public static Object o(PagerState pagerState0, int v, float f, AnimationSpec animationSpec0, d d0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        if((v1 & 4) != 0) {
            animationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, null, 5, null);
        }
        return pagerState0.n(v, f, animationSpec0, d0);
    }

    private final Object p(d d0) {
        PagerState pagerState0;
        androidx.compose.foundation.pager.PagerState.awaitScrollDependencies.1 pagerState$awaitScrollDependencies$10;
        if(d0 instanceof androidx.compose.foundation.pager.PagerState.awaitScrollDependencies.1) {
            pagerState$awaitScrollDependencies$10 = (androidx.compose.foundation.pager.PagerState.awaitScrollDependencies.1)d0;
            int v = pagerState$awaitScrollDependencies$10.n;
            if((v & 0x80000000) == 0) {
                pagerState$awaitScrollDependencies$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return d0.p(this);
                    }
                };
            }
            else {
                pagerState$awaitScrollDependencies$10.n = v ^ 0x80000000;
            }
        }
        else {
            pagerState$awaitScrollDependencies$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.n |= 0x80000000;
                    return d0.p(this);
                }
            };
        }
        Object object0 = pagerState$awaitScrollDependencies$10.l;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(pagerState$awaitScrollDependencies$10.n) {
            case 0: {
                f0.n(object0);
                pagerState$awaitScrollDependencies$10.k = this;
                pagerState$awaitScrollDependencies$10.n = 1;
                if(this.f.b(pagerState$awaitScrollDependencies$10) == object1) {
                    return object1;
                }
                pagerState0 = this;
                break;
            }
            case 1: {
                pagerState0 = (PagerState)pagerState$awaitScrollDependencies$10.k;
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
        LazyListState lazyListState0 = pagerState0.C();
        if(lazyListState0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        pagerState$awaitScrollDependencies$10.k = null;
        pagerState$awaitScrollDependencies$10.n = 2;
        return lazyListState0.l().a(pagerState$awaitScrollDependencies$10) == object1 ? object1 : S0.a;
    }

    private final int q(int v) {
        return this.E() <= 0 ? 0 : s.I(v, 0, this.E() - 1);
    }

    private final int r() {
        return ((Number)this.h.getValue()).intValue();
    }

    private final LazyListItemInfo s() {
        List list0 = this.M();
        if(list0.isEmpty()) {
            return null;
        }
        Object object0 = list0.get(0);
        float f = -Math.abs(LazyListSnapLayoutInfoProviderKt.c(this.v(), this.B(), ((LazyListItemInfo)object0), PagerStateKt.h()));
        int v = u.J(list0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = list0.get(v1);
                float f1 = -Math.abs(LazyListSnapLayoutInfoProviderKt.c(this.v(), this.B(), ((LazyListItemInfo)object1), PagerStateKt.h()));
                if(Float.compare(f, f1) < 0) {
                    object0 = object1;
                    f = f1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return (LazyListItemInfo)object0;
    }

    public final int t() {
        return ((Number)this.g.getValue()).intValue();
    }

    public final float u() {
        return ((Number)this.l.getValue()).floatValue();
    }

    private final Density v() {
        LazyListState lazyListState0 = this.C();
        if(lazyListState0 != null) {
            Density density0 = lazyListState0.m();
            if(density0 != null) {
                return density0;
            }
        }
        return PagerStateKt.g;
    }

    private final float w() {
        LazyListItemInfo lazyListItemInfo0 = this.s();
        return lazyListItemInfo0 == null ? 0.0f : LazyListSnapLayoutInfoProviderKt.c(this.v(), this.B(), lazyListItemInfo0, PagerStateKt.h());
    }

    @m
    public final LazyListItemInfo x() {
        List list0 = this.M();
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            Object object0 = listIterator0.previous();
            if(LazyListSnapLayoutInfoProviderKt.c(this.v(), this.B(), ((LazyListItemInfo)object0), PagerStateKt.h()) <= 0.0f) {
                return (LazyListItemInfo)object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final int y() {
        return this.a;
    }

    public final float z() {
        return this.b;
    }
}

