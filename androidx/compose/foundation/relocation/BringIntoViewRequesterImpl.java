package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
@s0({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,154:1\n1182#2:155\n1161#2,2:156\n460#3,11:158\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n*L\n122#1:155\n122#1:156,2\n125#1:158,11\n*E\n"})
final class BringIntoViewRequesterImpl implements BringIntoViewRequester {
    @l
    private final MutableVector a;

    public BringIntoViewRequesterImpl() {
        this.a = new MutableVector(new BringIntoViewRequesterModifier[16], 0);
    }

    @Override  // androidx.compose.foundation.relocation.BringIntoViewRequester
    @m
    public Object a(@m Rect rect0, @l d d0) {
        int v2;
        Rect rect1;
        Object[] arr_object;
        int v1;
        androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.bringIntoView.1 bringIntoViewRequesterImpl$bringIntoView$10;
        if(d0 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.bringIntoView.1) {
            bringIntoViewRequesterImpl$bringIntoView$10 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.bringIntoView.1)d0;
            int v = bringIntoViewRequesterImpl$bringIntoView$10.q;
            if((v & 0x80000000) == 0) {
                bringIntoViewRequesterImpl$bringIntoView$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int m;
                    int n;
                    Object o;
                    int q;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.o = object0;
                        this.q |= 0x80000000;
                        return d0.a(null, this);
                    }
                };
            }
            else {
                bringIntoViewRequesterImpl$bringIntoView$10.q = v ^ 0x80000000;
            }
        }
        else {
            bringIntoViewRequesterImpl$bringIntoView$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                int m;
                int n;
                Object o;
                int q;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.o = object0;
                    this.q |= 0x80000000;
                    return d0.a(null, this);
                }
            };
        }
        Object object0 = bringIntoViewRequesterImpl$bringIntoView$10.o;
        Object object1 = b.l();
        switch(bringIntoViewRequesterImpl$bringIntoView$10.q) {
            case 0: {
                f0.n(object0);
                MutableVector mutableVector0 = this.a;
                v1 = mutableVector0.J();
                if(v1 <= 0) {
                    return S0.a;
                }
                arr_object = mutableVector0.F();
                rect1 = rect0;
                v2 = 0;
                goto label_30;
            }
            case 1: {
                v2 = bringIntoViewRequesterImpl$bringIntoView$10.n;
                v1 = bringIntoViewRequesterImpl$bringIntoView$10.m;
                arr_object = (Object[])bringIntoViewRequesterImpl$bringIntoView$10.l;
                Rect rect2 = (Rect)bringIntoViewRequesterImpl$bringIntoView$10.k;
                f0.n(object0);
                rect1 = rect2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            ++v2;
            if(v2 >= v1) {
                return S0.a;
            }
        label_30:
            bringIntoViewRequesterImpl$bringIntoView$10.k = rect1;
            bringIntoViewRequesterImpl$bringIntoView$10.l = arr_object;
            bringIntoViewRequesterImpl$bringIntoView$10.m = v1;
            bringIntoViewRequesterImpl$bringIntoView$10.n = v2;
            bringIntoViewRequesterImpl$bringIntoView$10.q = 1;
        }
        while(((BringIntoViewRequesterModifier)arr_object[v2]).i(rect1, bringIntoViewRequesterImpl$bringIntoView$10) != object1);
        return object1;
    }

    @l
    public final MutableVector b() {
        return this.a;
    }
}

