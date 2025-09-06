package androidx.compose.foundation.gestures;

import A3.o;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.l0.e;
import y4.l;
import y4.m;

public final class ScrollExtensionsKt {
    @m
    public static final Object a(@l ScrollableState scrollableState0, float f, @l AnimationSpec animationSpec0, @l d d0) {
        androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy.1 scrollExtensionsKt$animateScrollBy$10;
        if(d0 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy.1) {
            scrollExtensionsKt$animateScrollBy$10 = (androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy.1)d0;
            int v = scrollExtensionsKt$animateScrollBy$10.m;
            if((v & 0x80000000) == 0) {
                scrollExtensionsKt$animateScrollBy$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    int m;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.m |= 0x80000000;
                        return ScrollExtensionsKt.a(null, 0.0f, null, this);
                    }
                };
            }
            else {
                scrollExtensionsKt$animateScrollBy$10.m = v ^ 0x80000000;
            }
        }
        else {
            scrollExtensionsKt$animateScrollBy$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                int m;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.m |= 0x80000000;
                    return ScrollExtensionsKt.a(null, 0.0f, null, this);
                }
            };
        }
        Object object0 = scrollExtensionsKt$animateScrollBy$10.l;
        Object object1 = b.l();
        switch(scrollExtensionsKt$animateScrollBy$10.m) {
            case 0: {
                f0.n(object0);
                e l0$e0 = new e();
                androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy.2 scrollExtensionsKt$animateScrollBy$20 = new o(f, animationSpec0, l0$e0, null) {
                    int k;
                    private Object l;
                    final float m;
                    final AnimationSpec n;
                    final e o;

                    {
                        this.m = f;
                        this.n = animationSpec0;
                        this.o = l0$e0;
                        super(2, d0);
                    }

                    @m
                    public final Object a(@l ScrollScope scrollScope0, @m d d0) {
                        return ((androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy.2)this.create(scrollScope0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy.2(this.m, this.n, this.o, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((ScrollScope)object0), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy.2.1 scrollExtensionsKt$animateScrollBy$2$10 = new o(((ScrollScope)this.l)) {
                                    final e e;
                                    final ScrollScope f;

                                    {
                                        this.e = l0$e0;
                                        this.f = scrollScope0;
                                        super(2);
                                    }

                                    public final void a(float f, float f1) {
                                        float f2 = this.e.a;
                                        this.e.a = f2 + this.f.a(f - f2);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        this.a(((Number)object0).floatValue(), ((Number)object1).floatValue());
                                        return S0.a;
                                    }
                                };
                                this.k = 1;
                                return SuspendAnimationKt.f(0.0f, this.m, 0.0f, this.n, scrollExtensionsKt$animateScrollBy$2$10, this, 4, null) == object1 ? object1 : S0.a;
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
                };
                scrollExtensionsKt$animateScrollBy$10.k = l0$e0;
                scrollExtensionsKt$animateScrollBy$10.m = 1;
                return c.e(scrollableState0, null, scrollExtensionsKt$animateScrollBy$20, scrollExtensionsKt$animateScrollBy$10, 1, null) == object1 ? object1 : kotlin.coroutines.jvm.internal.b.e(l0$e0.a);
            }
            case 1: {
                e l0$e1 = (e)scrollExtensionsKt$animateScrollBy$10.k;
                f0.n(object0);
                return kotlin.coroutines.jvm.internal.b.e(l0$e1.a);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static Object b(ScrollableState scrollableState0, float f, AnimationSpec animationSpec0, d d0, int v, Object object0) {
        if((v & 2) != 0) {
            animationSpec0 = AnimationSpecKt.o(0.0f, 0.0f, null, 7, null);
        }
        return ScrollExtensionsKt.a(scrollableState0, f, animationSpec0, d0);
    }

    @m
    public static final Object c(@l ScrollableState scrollableState0, float f, @l d d0) {
        androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy.1 scrollExtensionsKt$scrollBy$10;
        if(d0 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy.1) {
            scrollExtensionsKt$scrollBy$10 = (androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy.1)d0;
            int v = scrollExtensionsKt$scrollBy$10.m;
            if((v & 0x80000000) == 0) {
                scrollExtensionsKt$scrollBy$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    int m;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.m |= 0x80000000;
                        return ScrollExtensionsKt.c(null, 0.0f, this);
                    }
                };
            }
            else {
                scrollExtensionsKt$scrollBy$10.m = v ^ 0x80000000;
            }
        }
        else {
            scrollExtensionsKt$scrollBy$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                int m;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.m |= 0x80000000;
                    return ScrollExtensionsKt.c(null, 0.0f, this);
                }
            };
        }
        Object object0 = scrollExtensionsKt$scrollBy$10.l;
        Object object1 = b.l();
        switch(scrollExtensionsKt$scrollBy$10.m) {
            case 0: {
                f0.n(object0);
                e l0$e0 = new e();
                androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy.2 scrollExtensionsKt$scrollBy$20 = new o(l0$e0, f, null) {
                    int k;
                    private Object l;
                    final e m;
                    final float n;

                    {
                        this.m = l0$e0;
                        this.n = f;
                        super(2, d0);
                    }

                    @m
                    public final Object a(@l ScrollScope scrollScope0, @m d d0) {
                        return ((androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy.2)this.create(scrollScope0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy.2(this.m, this.n, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((ScrollScope)object0), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.m.a = ((ScrollScope)this.l).a(this.n);
                        return S0.a;
                    }
                };
                scrollExtensionsKt$scrollBy$10.k = l0$e0;
                scrollExtensionsKt$scrollBy$10.m = 1;
                return c.e(scrollableState0, null, scrollExtensionsKt$scrollBy$20, scrollExtensionsKt$scrollBy$10, 1, null) == object1 ? object1 : kotlin.coroutines.jvm.internal.b.e(l0$e0.a);
            }
            case 1: {
                e l0$e1 = (e)scrollExtensionsKt$scrollBy$10.k;
                f0.n(object0);
                return kotlin.coroutines.jvm.internal.b.e(l0$e1.a);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @m
    public static final Object d(@l ScrollableState scrollableState0, @l MutatePriority mutatePriority0, @l d d0) {
        Object object0 = scrollableState0.d(mutatePriority0, new o(null) {
            int k;

            {
                super(2, d0);
            }

            @m
            public final Object a(@l ScrollScope scrollScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.ScrollExtensionsKt.stopScroll.2)this.create(scrollScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.foundation.gestures.ScrollExtensionsKt.stopScroll.2(d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((ScrollScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return S0.a;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    public static Object e(ScrollableState scrollableState0, MutatePriority mutatePriority0, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.a;
        }
        return ScrollExtensionsKt.d(scrollableState0, mutatePriority0, d0);
    }
}

