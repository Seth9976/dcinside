package androidx.compose.foundation.lazy;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.k;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/AwaitFirstLayoutModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n1#2:458\n*E\n"})
public final class AwaitFirstLayoutModifier implements OnGloballyPositionedModifier {
    private boolean a;
    @m
    private d b;

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

    @Override  // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void X(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "coordinates");
        if(!this.a) {
            this.a = true;
            d d0 = this.b;
            if(d0 != null) {
                d0.resumeWith(S0.a);
            }
            this.b = null;
        }
    }

    @m
    public final Object a(@l d d0) {
        d d2;
        androidx.compose.foundation.lazy.AwaitFirstLayoutModifier.waitForFirstLayout.1 awaitFirstLayoutModifier$waitForFirstLayout$10;
        if(d0 instanceof androidx.compose.foundation.lazy.AwaitFirstLayoutModifier.waitForFirstLayout.1) {
            awaitFirstLayoutModifier$waitForFirstLayout$10 = (androidx.compose.foundation.lazy.AwaitFirstLayoutModifier.waitForFirstLayout.1)d0;
            int v = awaitFirstLayoutModifier$waitForFirstLayout$10.o;
            if((v & 0x80000000) == 0) {
                awaitFirstLayoutModifier$waitForFirstLayout$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    int o;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.o |= 0x80000000;
                        return d0.a(this);
                    }
                };
            }
            else {
                awaitFirstLayoutModifier$waitForFirstLayout$10.o = v ^ 0x80000000;
            }
        }
        else {
            awaitFirstLayoutModifier$waitForFirstLayout$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                int o;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.o |= 0x80000000;
                    return d0.a(this);
                }
            };
        }
        Object object0 = awaitFirstLayoutModifier$waitForFirstLayout$10.m;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(awaitFirstLayoutModifier$waitForFirstLayout$10.o) {
            case 0: {
                f0.n(object0);
                if(!this.a) {
                    d d1 = this.b;
                    awaitFirstLayoutModifier$waitForFirstLayout$10.k = this;
                    awaitFirstLayoutModifier$waitForFirstLayout$10.l = d1;
                    awaitFirstLayoutModifier$waitForFirstLayout$10.o = 1;
                    k k0 = new k(kotlin.coroutines.intrinsics.b.e(awaitFirstLayoutModifier$waitForFirstLayout$10));
                    this.b = k0;
                    Object object2 = k0.a();
                    if(object2 == kotlin.coroutines.intrinsics.b.l()) {
                        h.c(awaitFirstLayoutModifier$waitForFirstLayout$10);
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
                d2 = (d)awaitFirstLayoutModifier$waitForFirstLayout$10.l;
                AwaitFirstLayoutModifier awaitFirstLayoutModifier0 = (AwaitFirstLayoutModifier)awaitFirstLayoutModifier$waitForFirstLayout$10.k;
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

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

