package androidx.compose.foundation.gestures;

import A3.o;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.c0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlinx.coroutines.M0;
import y4.l;
import y4.m;

@s0({"SMAP\nForEachGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,121:1\n329#2:122\n329#2:141\n101#3,2:123\n33#3,6:125\n103#3:131\n101#3,2:132\n33#3,6:134\n103#3:140\n*S KotlinDebug\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n*L\n45#1:122\n100#1:141\n71#1:123,2\n71#1:125,6\n71#1:131\n87#1:132,2\n87#1:134,6\n87#1:140\n*E\n"})
public final class ForEachGestureKt {
    public static final boolean a(@l AwaitPointerEventScope awaitPointerEventScope0) {
        L.p(awaitPointerEventScope0, "<this>");
        List list0 = awaitPointerEventScope0.m1().e();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((PointerInputChange)list0.get(v1)).r()) {
                return 0;
            }
        }
        return 1;
    }

    @m
    public static final Object b(@l AwaitPointerEventScope awaitPointerEventScope0, @l d d0) {
        androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp.3 forEachGestureKt$awaitAllPointersUp$30;
        if(d0 instanceof androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp.3) {
            forEachGestureKt$awaitAllPointersUp$30 = (androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp.3)d0;
            int v = forEachGestureKt$awaitAllPointersUp$30.m;
            if((v & 0x80000000) == 0) {
                forEachGestureKt$awaitAllPointersUp$30 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    int m;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.m |= 0x80000000;
                        return ForEachGestureKt.b(null, this);
                    }
                };
            }
            else {
                forEachGestureKt$awaitAllPointersUp$30.m = v ^ 0x80000000;
            }
        }
        else {
            forEachGestureKt$awaitAllPointersUp$30 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                int m;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.m |= 0x80000000;
                    return ForEachGestureKt.b(null, this);
                }
            };
        }
        Object object0 = forEachGestureKt$awaitAllPointersUp$30.l;
        Object object1 = b.l();
        switch(forEachGestureKt$awaitAllPointersUp$30.m) {
            case 0: {
                f0.n(object0);
                if(!ForEachGestureKt.a(awaitPointerEventScope0)) {
                    goto label_25;
                }
                return S0.a;
            }
            case 1: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)forEachGestureKt$awaitAllPointersUp$30.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            List list0 = ((PointerEvent)object0).e();
            int v1 = list0.size();
            int v2 = 0;
            while(true) {
                if(v2 >= v1) {
                    break alab1;
                }
                if(!((PointerInputChange)list0.get(v2)).r()) {
                    ++v2;
                    continue;
                }
            label_25:
                forEachGestureKt$awaitAllPointersUp$30.k = awaitPointerEventScope0;
                forEachGestureKt$awaitAllPointersUp$30.m = 1;
                object0 = awaitPointerEventScope0.l1(PointerEventPass.c, forEachGestureKt$awaitAllPointersUp$30);
                if(object0 != object1) {
                    break;
                }
                return object1;
            }
        }
        return S0.a;
    }

    @m
    public static final Object c(@l PointerInputScope pointerInputScope0, @l d d0) {
        Object object0 = pointerInputScope0.R0(new o(null) {
            int l;
            private Object m;

            {
                super(2, d0);
            }

            @m
            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp.2)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp.2(d0);
                d1.m = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((AwaitPointerEventScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        this.l = 1;
                        return ForEachGestureKt.b(((AwaitPointerEventScope)this.m), this) == object1 ? object1 : S0.a;
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
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @m
    public static final Object d(@l PointerInputScope pointerInputScope0, @l o o0, @l d d0) {
        Object object0 = pointerInputScope0.R0(new o(d0.getContext(), o0, null) {
            int l;
            private Object m;
            final g n;
            final o o;

            {
                this.n = g0;
                this.o = o0;
                super(2, d0);
            }

            @m
            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture.2)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture.2(this.n, this.o, d0);
                d1.m = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((AwaitPointerEventScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                AwaitPointerEventScope awaitPointerEventScope1;
                AwaitPointerEventScope awaitPointerEventScope0;
                Object object1 = b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.m;
                        goto label_15;
                    }
                    case 1: {
                        awaitPointerEventScope1 = (AwaitPointerEventScope)this.m;
                        try {
                            f0.n(object0);
                            goto label_26;
                        }
                        catch(CancellationException cancellationException0) {
                            goto label_31;
                        }
                    }
                    case 2: {
                        awaitPointerEventScope1 = (AwaitPointerEventScope)this.m;
                        try {
                            f0.n(object0);
                            break;
                        }
                        catch(CancellationException cancellationException0) {
                            goto label_31;
                        }
                    }
                    case 3: {
                        awaitPointerEventScope1 = (AwaitPointerEventScope)this.m;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                do {
                    while(true) {
                        awaitPointerEventScope0 = awaitPointerEventScope1;
                    label_15:
                        if(!M0.E(this.n)) {
                            return S0.a;
                        }
                        try {
                            this.m = awaitPointerEventScope0;
                            this.l = 1;
                            if(this.o.invoke(awaitPointerEventScope0, this) == object1) {
                                return object1;
                            }
                        }
                        catch(CancellationException cancellationException1) {
                            awaitPointerEventScope1 = awaitPointerEventScope0;
                            cancellationException0 = cancellationException1;
                            break;
                        }
                        awaitPointerEventScope1 = awaitPointerEventScope0;
                        try {
                        label_26:
                            this.m = awaitPointerEventScope1;
                            this.l = 2;
                            if(ForEachGestureKt.b(awaitPointerEventScope1, this) != object1) {
                                continue;
                            }
                            return object1;
                        }
                        catch(CancellationException cancellationException0) {
                        }
                        break;
                    }
                label_31:
                    if(!M0.E(this.n)) {
                        throw cancellationException0;
                    }
                    this.m = awaitPointerEventScope1;
                    this.l = 3;
                }
                while(ForEachGestureKt.b(awaitPointerEventScope1, this) != object1);
                return object1;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @k(message = "Use awaitEachGesture instead. forEachGesture() can drop events between gestures.", replaceWith = @c0(expression = "awaitEachGesture(block)", imports = {}))
    @m
    public static final Object e(@l PointerInputScope pointerInputScope0, @l o o0, @l d d0) {
        PointerInputScope pointerInputScope1;
        g g1;
        g g0;
        androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture.1 forEachGestureKt$forEachGesture$10;
        if(d0 instanceof androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture.1) {
            forEachGestureKt$forEachGesture$10 = (androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture.1)d0;
            int v = forEachGestureKt$forEachGesture$10.o;
            if((v & 0x80000000) == 0) {
                forEachGestureKt$forEachGesture$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    int o;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.n = object0;
                        this.o |= 0x80000000;
                        return ForEachGestureKt.e(null, null, this);
                    }
                };
            }
            else {
                forEachGestureKt$forEachGesture$10.o = v ^ 0x80000000;
            }
        }
        else {
            forEachGestureKt$forEachGesture$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                Object n;
                int o;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.n = object0;
                    this.o |= 0x80000000;
                    return ForEachGestureKt.e(null, null, this);
                }
            };
        }
        Object object0 = forEachGestureKt$forEachGesture$10.n;
        Object object1 = b.l();
        switch(forEachGestureKt$forEachGesture$10.o) {
            case 0: {
                f0.n(object0);
                g0 = forEachGestureKt$forEachGesture$10.getContext();
                goto label_32;
            }
            case 1: {
                g1 = (g)forEachGestureKt$forEachGesture$10.m;
                o0 = (o)forEachGestureKt$forEachGesture$10.l;
                pointerInputScope1 = (PointerInputScope)forEachGestureKt$forEachGesture$10.k;
                try {
                    f0.n(object0);
                    goto label_47;
                }
                catch(CancellationException cancellationException0) {
                    goto label_54;
                }
            }
            case 2: {
                g1 = (g)forEachGestureKt$forEachGesture$10.m;
                o0 = (o)forEachGestureKt$forEachGesture$10.l;
                pointerInputScope1 = (PointerInputScope)forEachGestureKt$forEachGesture$10.k;
                try {
                    f0.n(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_54;
                }
            }
            case 3: {
                g1 = (g)forEachGestureKt$forEachGesture$10.m;
                o0 = (o)forEachGestureKt$forEachGesture$10.l;
                pointerInputScope1 = (PointerInputScope)forEachGestureKt$forEachGesture$10.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            while(true) {
                g0 = g1;
                pointerInputScope0 = pointerInputScope1;
            label_32:
                if(!M0.E(g0)) {
                    return S0.a;
                }
                try {
                    forEachGestureKt$forEachGesture$10.k = pointerInputScope0;
                    forEachGestureKt$forEachGesture$10.l = o0;
                    forEachGestureKt$forEachGesture$10.m = g0;
                    forEachGestureKt$forEachGesture$10.o = 1;
                    if(o0.invoke(pointerInputScope0, forEachGestureKt$forEachGesture$10) == object1) {
                        return object1;
                    }
                }
                catch(CancellationException cancellationException1) {
                    pointerInputScope1 = pointerInputScope0;
                    g1 = g0;
                    cancellationException0 = cancellationException1;
                    break;
                }
                pointerInputScope1 = pointerInputScope0;
                g1 = g0;
                try {
                label_47:
                    forEachGestureKt$forEachGesture$10.k = pointerInputScope1;
                    forEachGestureKt$forEachGesture$10.l = o0;
                    forEachGestureKt$forEachGesture$10.m = g1;
                    forEachGestureKt$forEachGesture$10.o = 2;
                    if(ForEachGestureKt.c(pointerInputScope1, forEachGestureKt$forEachGesture$10) != object1) {
                        continue;
                    }
                    return object1;
                }
                catch(CancellationException cancellationException0) {
                }
                break;
            }
        label_54:
            if(!M0.E(g1)) {
                throw cancellationException0;
            }
            forEachGestureKt$forEachGesture$10.k = pointerInputScope1;
            forEachGestureKt$forEachGesture$10.l = o0;
            forEachGestureKt$forEachGesture$10.m = g1;
            forEachGestureKt$forEachGesture$10.o = 3;
        }
        while(ForEachGestureKt.c(pointerInputScope1, forEachGestureKt$forEachGesture$10) != object1);
        return object1;
    }
}

