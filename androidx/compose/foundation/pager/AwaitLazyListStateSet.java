package androidx.compose.foundation.pager;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.k;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/AwaitLazyListStateSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
final class AwaitLazyListStateSet {
    @m
    private d a;
    private boolean b;

    public final void a() {
        if(!this.b) {
            this.b = true;
            d d0 = this.a;
            if(d0 != null) {
                d0.resumeWith(S0.a);
            }
            this.a = null;
        }
    }

    @m
    public final Object b(@l d d0) {
        d d2;
        androidx.compose.foundation.pager.AwaitLazyListStateSet.waitFinalLazyListSetting.1 awaitLazyListStateSet$waitFinalLazyListSetting$10;
        if(d0 instanceof androidx.compose.foundation.pager.AwaitLazyListStateSet.waitFinalLazyListSetting.1) {
            awaitLazyListStateSet$waitFinalLazyListSetting$10 = (androidx.compose.foundation.pager.AwaitLazyListStateSet.waitFinalLazyListSetting.1)d0;
            int v = awaitLazyListStateSet$waitFinalLazyListSetting$10.o;
            if((v & 0x80000000) == 0) {
                awaitLazyListStateSet$waitFinalLazyListSetting$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    int o;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.o |= 0x80000000;
                        return d0.b(this);
                    }
                };
            }
            else {
                awaitLazyListStateSet$waitFinalLazyListSetting$10.o = v ^ 0x80000000;
            }
        }
        else {
            awaitLazyListStateSet$waitFinalLazyListSetting$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                int o;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.o |= 0x80000000;
                    return d0.b(this);
                }
            };
        }
        Object object0 = awaitLazyListStateSet$waitFinalLazyListSetting$10.m;
        Object object1 = b.l();
        switch(awaitLazyListStateSet$waitFinalLazyListSetting$10.o) {
            case 0: {
                f0.n(object0);
                if(!this.b) {
                    d d1 = this.a;
                    awaitLazyListStateSet$waitFinalLazyListSetting$10.k = this;
                    awaitLazyListStateSet$waitFinalLazyListSetting$10.l = d1;
                    awaitLazyListStateSet$waitFinalLazyListSetting$10.o = 1;
                    k k0 = new k(b.e(awaitLazyListStateSet$waitFinalLazyListSetting$10));
                    this.a = k0;
                    Object object2 = k0.a();
                    if(object2 == b.l()) {
                        h.c(awaitLazyListStateSet$waitFinalLazyListSetting$10);
                    }
                    if(object2 == object1) {
                        return object1;
                    }
                    d2 = d1;
                    goto label_31;
                }
                break;
            }
            case 1: {
                d2 = (d)awaitLazyListStateSet$waitFinalLazyListSetting$10.l;
                AwaitLazyListStateSet awaitLazyListStateSet0 = (AwaitLazyListStateSet)awaitLazyListStateSet$waitFinalLazyListSetting$10.k;
                f0.n(object0);
            label_31:
                if(d2 != null) {
                    d2.resumeWith(S0.a);
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return S0.a;
    }
}

