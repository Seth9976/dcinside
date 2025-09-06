package androidx.compose.foundation.lazy.layout;

import A3.o;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.a;
import kotlin.jvm.internal.l0.e;
import kotlin.jvm.internal.l0.f;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,264:1\n154#2:265\n154#2:266\n154#2:267\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n34#1:265\n35#1:266\n36#1:267\n*E\n"})
public final class LazyAnimateScrollKt {
    private static final float a = 0.0f;
    private static final float b = 0.0f;
    private static final float c = 0.0f;
    private static final boolean d = false;

    static {
        LazyAnimateScrollKt.a = 2500.0f;
        LazyAnimateScrollKt.b = 1500.0f;
        LazyAnimateScrollKt.c = 50.0f;
    }

    public static final float a() [...] // 潜在的解密器

    public static final float b() [...] // 潜在的解密器

    public static final float c() [...] // 潜在的解密器

    @m
    public static final Object d(@l LazyAnimateScrollScope lazyAnimateScrollScope0, int v, int v1, @l d d0) {
        Object object0 = lazyAnimateScrollScope0.b(new o(v, lazyAnimateScrollScope0, v1, null) {
            Object k;
            Object l;
            Object m;
            float n;
            float o;
            float p;
            int q;
            int r;
            private Object s;
            final int t;
            final LazyAnimateScrollScope u;
            final int v;

            {
                this.t = v;
                this.u = lazyAnimateScrollScope0;
                this.v = v1;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2(this.t, this.u, this.v, d0);
                d1.s = object0;
                return d1;
            }

            @m
            public final Object f(@l ScrollScope scrollScope0, @m d d0) {
                return ((androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2)this.create(scrollScope0, d0)).invokeSuspend(S0.a);
            }

            private static final boolean g(boolean z, LazyAnimateScrollScope lazyAnimateScrollScope0, int v, int v1) {
                if(z) {
                    return lazyAnimateScrollScope0.c() <= v ? lazyAnimateScrollScope0.c() == v && lazyAnimateScrollScope0.h() > v1 : true;
                }
                return lazyAnimateScrollScope0.c() < v || lazyAnimateScrollScope0.c() == v && lazyAnimateScrollScope0.h() < v1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.f(((ScrollScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                ScrollScope scrollScope4;
                float f11;
                float f10;
                ScrollScope scrollScope2;
                ItemFoundInScroll itemFoundInScroll1;
                f l0$f1;
                int v2;
                float f5;
                ScrollScope scrollScope1;
                float f4;
                float f3;
                h l0$h0;
                a l0$a0;
                Object object1 = b.l();
            alab1:
                switch(this.r) {
                    case 0: {
                        f0.n(object0);
                        ScrollScope scrollScope0 = (ScrollScope)this.s;
                        int v = this.t;
                        if(((float)v) >= 0.0f) {
                            try {
                                float f = this.u.getDensity().y1(2500.0f);
                                float f1 = this.u.getDensity().y1(1500.0f);
                                float f2 = this.u.getDensity().y1(50.0f);
                                l0$a0 = new a();
                                l0$a0.a = true;
                                l0$h0 = new h();
                                l0$h0.a = AnimationStateKt.c(0.0f, 0.0f, 0L, 0L, false, 30, null);
                                Integer integer0 = this.u.f(this.t);
                                if(integer0 != null) {
                                    throw new ItemFoundInScroll(((int)integer0), ((AnimationState)l0$h0.a));
                                }
                                int v1 = this.u.c();
                                f l0$f0 = new f();
                                l0$f0.a = 1;
                                f3 = f1;
                                f4 = f2;
                                scrollScope1 = scrollScope0;
                                f5 = f;
                                v2 = this.t <= v1 ? 0 : 1;
                                l0$f1 = l0$f0;
                                goto label_53;
                            }
                            catch(ItemFoundInScroll itemFoundInScroll0) {
                                itemFoundInScroll1 = itemFoundInScroll0;
                                scrollScope2 = scrollScope0;
                                goto label_89;
                            }
                        }
                        throw new IllegalArgumentException(("Index should be non-negative (" + v + ')').toString());
                    }
                    case 1: {
                        v2 = this.q;
                        float f6 = this.p;
                        float f7 = this.o;
                        float f8 = this.n;
                        f l0$f2 = (f)this.m;
                        l0$h0 = (h)this.l;
                        a l0$a1 = (a)this.k;
                        ScrollScope scrollScope3 = (ScrollScope)this.s;
                        try {
                            f0.n(object0);
                            f4 = f6;
                            f3 = f7;
                            f5 = f8;
                            scrollScope1 = scrollScope3;
                            l0$f1 = l0$f2;
                            l0$a0 = l0$a1;
                        }
                        catch(ItemFoundInScroll itemFoundInScroll2) {
                            itemFoundInScroll1 = itemFoundInScroll2;
                            scrollScope2 = scrollScope3;
                            goto label_89;
                        }
                        while(true) {
                            ++l0$f1.a;
                            try {
                            label_53:
                                if(!l0$a0.a || this.u.getItemCount() <= 0) {
                                    break alab1;
                                }
                                float f9 = this.u.a(this.t, this.v);
                                if(Math.abs(f9) < f5) {
                                    f10 = Math.max(Math.abs(f9), f4);
                                    if(v2 == 0) {
                                        f10 = -f10;
                                    }
                                }
                                else if(v2 == 0) {
                                    f10 = -f5;
                                }
                                else {
                                    f11 = f5;
                                    goto label_65;
                                }
                                f11 = f10;
                            label_65:
                                l0$h0.a = AnimationStateKt.g(((AnimationState)l0$h0.a), 0.0f, 0.0f, 0L, 0L, false, 30, null);
                                e l0$e0 = new e();
                                AnimationState animationState0 = (AnimationState)l0$h0.a;
                                boolean z = ((Number)((AnimationState)l0$h0.a).h()).floatValue() != 0.0f;
                                androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.3 lazyAnimateScrollKt$animateScrollToItem$2$30 = new Function1(this.t, f11, l0$e0, scrollScope1, l0$a0, v2 != 0, f3, l0$f1, this.v, l0$h0) {
                                    final LazyAnimateScrollScope e;
                                    final int f;
                                    final float g;
                                    final e h;
                                    final ScrollScope i;
                                    final a j;
                                    final boolean k;
                                    final float l;
                                    final f m;
                                    final int n;
                                    final h o;

                                    {
                                        this.e = lazyAnimateScrollScope0;
                                        this.f = v;
                                        this.g = f;
                                        this.h = l0$e0;
                                        this.i = scrollScope0;
                                        this.j = l0$a0;
                                        this.k = z;
                                        this.l = f1;
                                        this.m = l0$f0;
                                        this.n = v1;
                                        this.o = l0$h0;
                                        super(1);
                                    }

                                    public final void a(@l AnimationScope animationScope0) {
                                        L.p(animationScope0, "$this$animateTo");
                                        Integer integer0 = this.e.f(this.f);
                                        if(integer0 == null) {
                                            float f = (this.g > 0.0f ? s.A(((Number)animationScope0.g()).floatValue(), this.g) : s.t(((Number)animationScope0.g()).floatValue(), this.g)) - this.h.a;
                                            float f1 = this.i.a(f);
                                            Integer integer1 = this.e.f(this.f);
                                            if(integer1 == null && !androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.g(this.k, this.e, this.f, this.n)) {
                                                if(f != f1) {
                                                    animationScope0.a();
                                                    this.j.a = false;
                                                    return;
                                                }
                                                this.h.a += f;
                                                if(!this.k) {
                                                    if(((Number)animationScope0.g()).floatValue() < -this.l) {
                                                        animationScope0.a();
                                                    }
                                                }
                                                else if(((Number)animationScope0.g()).floatValue() > this.l) {
                                                    animationScope0.a();
                                                }
                                                if(!this.k) {
                                                    if(this.m.a >= 2) {
                                                        int v3 = this.e.c();
                                                        int v4 = this.e.g();
                                                        if(v3 - this.f > v4) {
                                                            int v5 = this.e.g();
                                                            this.e.d(this.i, this.f + v5, 0);
                                                        }
                                                    }
                                                }
                                                else if(this.m.a >= 2) {
                                                    int v = this.e.e();
                                                    int v1 = this.e.g();
                                                    if(this.f - v > v1) {
                                                        int v2 = this.e.g();
                                                        this.e.d(this.i, this.f - v2, 0);
                                                    }
                                                }
                                            }
                                            integer0 = integer1;
                                        }
                                        if(androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.g(this.k, this.e, this.f, this.n)) {
                                            this.e.d(this.i, this.f, this.n);
                                            this.j.a = false;
                                            animationScope0.a();
                                            return;
                                        }
                                        if(integer0 != null) {
                                            throw new ItemFoundInScroll(((int)integer0), ((AnimationState)this.o.a));
                                        }
                                    }

                                    @Override  // kotlin.jvm.functions.Function1
                                    public Object invoke(Object object0) {
                                        this.a(((AnimationScope)object0));
                                        return S0.a;
                                    }
                                };
                                this.s = scrollScope1;
                                this.k = l0$a0;
                                this.l = l0$h0;
                                this.m = l0$f1;
                                this.n = f5;
                                this.o = f3;
                                this.p = f4;
                                this.q = v2;
                                this.r = 1;
                                scrollScope4 = scrollScope1;
                            }
                            catch(ItemFoundInScroll itemFoundInScroll3) {
                                scrollScope4 = scrollScope1;
                                goto label_87;
                            }
                            try {
                                if(SuspendAnimationKt.m(animationState0, kotlin.coroutines.jvm.internal.b.e(f11), null, z, lazyAnimateScrollKt$animateScrollToItem$2$30, this, 2, null) == object1) {
                                    return object1;
                                }
                                goto label_104;
                            }
                            catch(ItemFoundInScroll itemFoundInScroll3) {
                            }
                        label_87:
                            itemFoundInScroll1 = itemFoundInScroll3;
                            scrollScope2 = scrollScope4;
                        label_89:
                            AnimationState animationState1 = AnimationStateKt.g(itemFoundInScroll1.b(), 0.0f, 0.0f, 0L, 0L, false, 30, null);
                            float f12 = (float)(itemFoundInScroll1.a() + this.v);
                            e l0$e1 = new e();
                            int v3 = ((Number)animationState1.h()).floatValue() == 0.0f ? 1 : 0;
                            androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.5 lazyAnimateScrollKt$animateScrollToItem$2$50 = new Function1(l0$e1, scrollScope2) {
                                final float e;
                                final e f;
                                final ScrollScope g;

                                {
                                    this.e = f;
                                    this.f = l0$e0;
                                    this.g = scrollScope0;
                                    super(1);
                                }

                                public final void a(@l AnimationScope animationScope0) {
                                    L.p(animationScope0, "$this$animateTo");
                                    float f = this.e;
                                    float f1 = 0.0f;
                                    if(f > 0.0f) {
                                        f1 = s.A(((Number)animationScope0.g()).floatValue(), this.e);
                                    }
                                    else if(f < 0.0f) {
                                        f1 = s.t(((Number)animationScope0.g()).floatValue(), this.e);
                                    }
                                    float f2 = f1 - this.f.a;
                                    if(f2 != this.g.a(f2) || f1 != ((Number)animationScope0.g()).floatValue()) {
                                        animationScope0.a();
                                    }
                                    this.f.a += f2;
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    this.a(((AnimationScope)object0));
                                    return S0.a;
                                }
                            };
                            this.s = scrollScope2;
                            this.k = null;
                            this.l = null;
                            this.m = null;
                            this.r = 2;
                            if(SuspendAnimationKt.m(animationState1, kotlin.coroutines.jvm.internal.b.e(f12), null, ((boolean)(1 ^ v3)), lazyAnimateScrollKt$animateScrollToItem$2$50, this, 2, null) == object1) {
                                return object1;
                            }
                            this.u.d(scrollScope2, this.t, this.v);
                            return S0.a;
                        label_104:
                            scrollScope1 = scrollScope4;
                        }
                    }
                    case 2: {
                        scrollScope2 = (ScrollScope)this.s;
                        f0.n(object0);
                        this.u.d(scrollScope2, this.t, this.v);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return S0.a;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private static final void e(A3.a a0) {
    }
}

