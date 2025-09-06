package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class PagerWrapperFlingBehavior implements FlingBehavior {
    @l
    private final SnapFlingBehavior a;
    @l
    private final PagerState b;

    public PagerWrapperFlingBehavior(@l SnapFlingBehavior snapFlingBehavior0, @l PagerState pagerState0) {
        L.p(snapFlingBehavior0, "originalFlingBehavior");
        L.p(pagerState0, "pagerState");
        super();
        this.a = snapFlingBehavior0;
        this.b = pagerState0;
    }

    @Override  // androidx.compose.foundation.gestures.FlingBehavior
    @m
    public Object a(@l ScrollScope scrollScope0, float f, @l d d0) {
        androidx.compose.foundation.pager.PagerWrapperFlingBehavior.performFling.1 pagerWrapperFlingBehavior$performFling$10;
        if(d0 instanceof androidx.compose.foundation.pager.PagerWrapperFlingBehavior.performFling.1) {
            pagerWrapperFlingBehavior$performFling$10 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior.performFling.1)d0;
            int v = pagerWrapperFlingBehavior$performFling$10.m;
            if((v & 0x80000000) == 0) {
                pagerWrapperFlingBehavior$performFling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    int m;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.m |= 0x80000000;
                        return d0.a(null, 0.0f, this);
                    }
                };
            }
            else {
                pagerWrapperFlingBehavior$performFling$10.m = v ^ 0x80000000;
            }
        }
        else {
            pagerWrapperFlingBehavior$performFling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                int m;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.k = object0;
                    this.m |= 0x80000000;
                    return d0.a(null, 0.0f, this);
                }
            };
        }
        Object object0 = pagerWrapperFlingBehavior$performFling$10.k;
        Object object1 = b.l();
        switch(pagerWrapperFlingBehavior$performFling$10.m) {
            case 0: {
                f0.n(object0);
                androidx.compose.foundation.pager.PagerWrapperFlingBehavior.performFling.2.1 pagerWrapperFlingBehavior$performFling$2$10 = new Function1() {
                    final PagerWrapperFlingBehavior e;

                    {
                        this.e = pagerWrapperFlingBehavior0;
                        super(1);
                    }

                    public final void b(float f) {
                        this.e.c().U(f);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.b(((Number)object0).floatValue());
                        return S0.a;
                    }
                };
                pagerWrapperFlingBehavior$performFling$10.m = 1;
                object0 = this.a.k(scrollScope0, f, pagerWrapperFlingBehavior$performFling$2$10, pagerWrapperFlingBehavior$performFling$10);
                return object0 == object1 ? object1 : kotlin.coroutines.jvm.internal.b.e(((Number)object0).floatValue());
            }
            case 1: {
                f0.n(object0);
                return kotlin.coroutines.jvm.internal.b.e(((Number)object0).floatValue());
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @l
    public final SnapFlingBehavior b() {
        return this.a;
    }

    @l
    public final PagerState c() {
        return this.b;
    }
}

