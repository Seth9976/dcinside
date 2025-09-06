package androidx.compose.foundation.gestures;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.o;
import y4.l;
import y4.m;

@s0({"SMAP\nBringIntoViewRequestPriorityQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,137:1\n1182#2:138\n1161#2,2:139\n53#3:141\n523#3:142\n523#3:143\n492#3,11:144\n53#3:155\n523#3:156\n48#3:157\n664#3,2:158\n523#3:160\n13579#4,2:161\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n*L\n43#1:138\n43#1:139,2\n72#1:141\n73#1:142\n91#1:143\n107#1:144,11\n111#1:155\n112#1:156\n121#1:157\n132#1:158,2\n132#1:160\n132#1:161,2\n*E\n"})
public final class BringIntoViewRequestPriorityQueue {
    @l
    private final MutableVector a;

    public BringIntoViewRequestPriorityQueue() {
        this.a = new MutableVector(new Request[16], 0);
    }

    public final void b(@m Throwable throwable0) {
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.J();
        o[] arr_o = new o[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_o[v2] = ((Request)mutableVector0.F()[v2]).a();
        }
        for(int v1 = 0; v1 < v; ++v1) {
            arr_o[v1].c(throwable0);
        }
        if(!this.a.N()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final boolean c(@l Request contentInViewModifier$Request0) {
        L.p(contentInViewModifier$Request0, "request");
        Rect rect0 = (Rect)contentInViewModifier$Request0.b().invoke();
        if(rect0 == null) {
            contentInViewModifier$Request0.a().resumeWith(S0.a);
            return false;
        }
        contentInViewModifier$Request0.a().K(new Function1(contentInViewModifier$Request0) {
            final BringIntoViewRequestPriorityQueue e;
            final Request f;

            {
                this.e = bringIntoViewRequestPriorityQueue0;
                this.f = contentInViewModifier$Request0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                this.e.a.a0(this.f);
            }
        });
        kotlin.ranges.l l0 = new kotlin.ranges.l(0, this.a.J() - 1);
        int v = l0.g();
        int v1 = l0.h();
        if(v <= v1) {
            while(true) {
                Rect rect1 = (Rect)((Request)this.a.F()[v1]).b().invoke();
                if(rect1 != null) {
                    Rect rect2 = rect0.J(rect1);
                    if(L.g(rect2, rect0)) {
                        this.a.a(v1 + 1, contentInViewModifier$Request0);
                        return true;
                    }
                    if(!L.g(rect2, rect1)) {
                        CancellationException cancellationException0 = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int v2 = this.a.J() - 1;
                        if(v2 <= v1) {
                            while(true) {
                                ((Request)this.a.F()[v1]).a().c(cancellationException0);
                                if(v2 == v1) {
                                    break;
                                }
                                ++v2;
                            }
                        }
                    }
                }
                if(v1 == v) {
                    break;
                }
                --v1;
            }
        }
        this.a.a(0, contentInViewModifier$Request0);
        return true;
    }

    public final void d(@l Function1 function10) {
        L.p(function10, "block");
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.J();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = mutableVector0.F();
            while(true) {
                function10.invoke(((Request)arr_object[v1]).b().invoke());
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
    }

    public final int e() {
        return this.a.J();
    }

    public final boolean f() {
        return this.a.N();
    }

    public final void g() {
        kotlin.ranges.l l0 = new kotlin.ranges.l(0, this.a.J() - 1);
        int v = l0.g();
        int v1 = l0.h();
        if(v <= v1) {
            while(true) {
                ((Request)this.a.F()[v]).a().resumeWith(S0.a);
                if(v == v1) {
                    break;
                }
                ++v;
            }
        }
        this.a.l();
    }

    public final void h(@l Function1 function10) {
        L.p(function10, "block");
        while(this.a.O() && ((Boolean)function10.invoke(((Request)this.a.P()).b().invoke())).booleanValue()) {
            ((Request)this.a.e0(this.a.J() - 1)).a().resumeWith(S0.a);
        }
    }
}

