package androidx.compose.foundation.gestures;

import A3.o;
import A3.p;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import y4.l;
import y4.m;

@s0({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,376:1\n33#2,6:377\n101#2,2:383\n33#2,6:385\n103#2:391\n86#2,2:392\n33#2,6:394\n88#2:400\n86#2,2:401\n33#2,6:403\n88#2:409\n101#2,2:410\n33#2,6:412\n103#2:418\n101#2,2:419\n33#2,6:421\n103#2:427\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n*L\n196#1:377,6\n197#1:383,2\n197#1:385,6\n197#1:391\n281#1:392,2\n281#1:394,6\n281#1:400\n306#1:401,2\n306#1:403,6\n306#1:409\n311#1:410,2\n311#1:412,6\n311#1:418\n321#1:419,2\n321#1:421,6\n321#1:427\n*E\n"})
public final class TapGestureDetectorKt {
    @l
    private static final p a;

    static {
        TapGestureDetectorKt.a = new TapGestureDetectorKt.NoPressGesture.1(null);
    }

    @m
    public static final Object d(@l AwaitPointerEventScope awaitPointerEventScope0, boolean z, @l PointerEventPass pointerEventPass0, @l d d0) {
        androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown.2 tapGestureDetectorKt$awaitFirstDown$20;
        if(d0 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown.2) {
            tapGestureDetectorKt$awaitFirstDown$20 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown.2)d0;
            int v = tapGestureDetectorKt$awaitFirstDown$20.o;
            if((v & 0x80000000) == 0) {
                tapGestureDetectorKt$awaitFirstDown$20 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    boolean m;
                    Object n;
                    int o;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.n = object0;
                        this.o |= 0x80000000;
                        return TapGestureDetectorKt.d(null, false, null, this);
                    }
                };
            }
            else {
                tapGestureDetectorKt$awaitFirstDown$20.o = v ^ 0x80000000;
            }
        }
        else {
            tapGestureDetectorKt$awaitFirstDown$20 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                boolean m;
                Object n;
                int o;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.n = object0;
                    this.o |= 0x80000000;
                    return TapGestureDetectorKt.d(null, false, null, this);
                }
            };
        }
        Object object0 = tapGestureDetectorKt$awaitFirstDown$20.n;
        Object object1 = b.l();
        switch(tapGestureDetectorKt$awaitFirstDown$20.o) {
            case 0: {
                f0.n(object0);
                goto label_36;
            }
            case 1: {
                boolean z1 = tapGestureDetectorKt$awaitFirstDown$20.m;
                PointerEventPass pointerEventPass1 = (PointerEventPass)tapGestureDetectorKt$awaitFirstDown$20.l;
                AwaitPointerEventScope awaitPointerEventScope1 = (AwaitPointerEventScope)tapGestureDetectorKt$awaitFirstDown$20.k;
                f0.n(object0);
                z = z1;
                awaitPointerEventScope0 = awaitPointerEventScope1;
                pointerEventPass0 = pointerEventPass1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            List list0 = ((PointerEvent)object0).e();
            int v1 = list0.size();
            int v2 = 0;
            while(true) {
                boolean z2 = true;
                if(v2 < v1) {
                    PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v2);
                    if((z ? PointerEventKt.b(pointerInputChange0) : PointerEventKt.c(pointerInputChange0))) {
                        ++v2;
                        continue;
                    }
                    else {
                        z2 = false;
                    }
                }
                break;
            }
            if(z2) {
                return ((PointerEvent)object0).e().get(0);
            }
        label_36:
            tapGestureDetectorKt$awaitFirstDown$20.k = awaitPointerEventScope0;
            tapGestureDetectorKt$awaitFirstDown$20.l = pointerEventPass0;
            tapGestureDetectorKt$awaitFirstDown$20.m = z;
            tapGestureDetectorKt$awaitFirstDown$20.o = 1;
            object0 = awaitPointerEventScope0.l1(pointerEventPass0, tapGestureDetectorKt$awaitFirstDown$20);
        }
        while(object0 != object1);
        return object1;
    }

    @k(level = kotlin.m.c, message = "Maintained for binary compatibility. Use version with PointerEventPass instead.")
    public static final Object e(AwaitPointerEventScope awaitPointerEventScope0, boolean z, d d0) {
        return TapGestureDetectorKt.d(awaitPointerEventScope0, z, PointerEventPass.b, d0);
    }

    public static Object f(AwaitPointerEventScope awaitPointerEventScope0, boolean z, PointerEventPass pointerEventPass0, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            pointerEventPass0 = PointerEventPass.b;
        }
        return TapGestureDetectorKt.d(awaitPointerEventScope0, z, pointerEventPass0, d0);
    }

    public static Object g(AwaitPointerEventScope awaitPointerEventScope0, boolean z, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        return TapGestureDetectorKt.e(awaitPointerEventScope0, z, d0);
    }

    private static final Object h(AwaitPointerEventScope awaitPointerEventScope0, PointerInputChange pointerInputChange0, d d0) {
        return awaitPointerEventScope0.N0(awaitPointerEventScope0.getViewConfiguration().c(), new o(pointerInputChange0, null) {
            long l;
            int m;
            private Object n;
            final PointerInputChange o;

            {
                this.o = pointerInputChange0;
                super(2, d0);
            }

            @m
            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitSecondDown.2)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitSecondDown.2(this.o, d0);
                d1.n = object0;
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
                long v;
                Object object1 = b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        AwaitPointerEventScope awaitPointerEventScope0 = (AwaitPointerEventScope)this.n;
                        v = this.o.z() + awaitPointerEventScope0.getViewConfiguration().a();
                        awaitPointerEventScope1 = awaitPointerEventScope0;
                        goto label_13;
                    }
                    case 1: {
                        v = this.l;
                        awaitPointerEventScope1 = (AwaitPointerEventScope)this.n;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                do {
                    if(((PointerInputChange)object0).z() >= v) {
                        return (PointerInputChange)object0;
                    }
                label_13:
                    this.n = awaitPointerEventScope1;
                    this.l = v;
                    this.m = 1;
                    object0 = TapGestureDetectorKt.f(awaitPointerEventScope1, false, null, this, 3, null);
                }
                while(object0 != object1);
                return object1;
            }
        }, d0);
    }

    private static final Object i(AwaitPointerEventScope awaitPointerEventScope0, d d0) {
        androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp.1 tapGestureDetectorKt$consumeUntilUp$10;
        if(d0 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp.1) {
            tapGestureDetectorKt$consumeUntilUp$10 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp.1)d0;
            int v = tapGestureDetectorKt$consumeUntilUp$10.m;
            if((v & 0x80000000) == 0) {
                tapGestureDetectorKt$consumeUntilUp$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    int m;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.m |= 0x80000000;
                        return TapGestureDetectorKt.i(null, this);
                    }
                };
            }
            else {
                tapGestureDetectorKt$consumeUntilUp$10.m = v ^ 0x80000000;
            }
        }
        else {
            tapGestureDetectorKt$consumeUntilUp$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                int m;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.m |= 0x80000000;
                    return TapGestureDetectorKt.i(null, this);
                }
            };
        }
        Object object0 = tapGestureDetectorKt$consumeUntilUp$10.l;
        Object object1 = b.l();
        switch(tapGestureDetectorKt$consumeUntilUp$10.m) {
            case 0: {
                f0.n(object0);
                goto label_31;
            }
            case 1: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)tapGestureDetectorKt$consumeUntilUp$10.k;
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
            for(int v3 = 0; v3 < v1; ++v3) {
                ((PointerInputChange)list0.get(v3)).a();
            }
            List list1 = ((PointerEvent)object0).e();
            int v4 = list1.size();
            while(true) {
                if(v2 >= v4) {
                    break alab1;
                }
                if(!((PointerInputChange)list1.get(v2)).r()) {
                    ++v2;
                    continue;
                }
            label_31:
                tapGestureDetectorKt$consumeUntilUp$10.k = awaitPointerEventScope0;
                tapGestureDetectorKt$consumeUntilUp$10.m = 1;
                object0 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope0, null, tapGestureDetectorKt$consumeUntilUp$10, 1, null);
                if(object0 != object1) {
                    break;
                }
                return object1;
            }
        }
        return S0.a;
    }

    @m
    public static final Object j(@l PointerInputScope pointerInputScope0, @l p p0, @m Function1 function10, @l d d0) {
        Object object0 = P.g(new o(pointerInputScope0, p0, function10, new PressGestureScopeImpl(pointerInputScope0), null) {
            int k;
            private Object l;
            final PointerInputScope m;
            final p n;
            final Function1 o;
            final PressGestureScopeImpl p;

            {
                this.m = pointerInputScope0;
                this.n = p0;
                this.o = function10;
                this.p = pressGestureScopeImpl0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2(this.m, this.n, this.o, this.p, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2.1 tapGestureDetectorKt$detectTapAndPress$2$10 = new o(this.n, this.o, this.p, null) {
                            int l;
                            private Object m;
                            final O n;
                            final p o;
                            final Function1 p;
                            final PressGestureScopeImpl q;

                            {
                                this.n = o0;
                                this.o = p0;
                                this.p = function10;
                                this.q = pressGestureScopeImpl0;
                                super(2, d0);
                            }

                            @m
                            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2.1)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                d d1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2.1(this.n, this.o, this.p, this.q, d0);
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
                                Object object3;
                                Object object2;
                                AwaitPointerEventScope awaitPointerEventScope0;
                                Object object1 = b.l();
                                switch(this.l) {
                                    case 0: {
                                        f0.n(object0);
                                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.m;
                                        androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2.1.1 tapGestureDetectorKt$detectTapAndPress$2$1$10 = new o(null) {
                                            int k;
                                            final PressGestureScopeImpl l;

                                            {
                                                this.l = pressGestureScopeImpl0;
                                                super(2, d0);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @l
                                            public final d create(@m Object object0, @l d d0) {
                                                return new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2.1.1(this.l, d0);
                                            }

                                            @Override  // A3.o
                                            public Object invoke(Object object0, Object object1) {
                                                return this.invoke(((O)object0), ((d)object1));
                                            }

                                            @m
                                            public final Object invoke(@l O o0, @m d d0) {
                                                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @m
                                            public final Object invokeSuspend(@l Object object0) {
                                                Object object1 = b.l();
                                                switch(this.k) {
                                                    case 0: {
                                                        f0.n(object0);
                                                        this.k = 1;
                                                        return this.l.f(this) == object1 ? object1 : S0.a;
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
                                        kotlinx.coroutines.k.f(this.n, null, null, tapGestureDetectorKt$detectTapAndPress$2$1$10, 3, null);
                                        this.m = awaitPointerEventScope0;
                                        this.l = 1;
                                        object2 = TapGestureDetectorKt.f(awaitPointerEventScope0, false, null, this, 3, null);
                                        if(object2 == object1) {
                                            return object1;
                                        }
                                        goto label_16;
                                    }
                                    case 1: {
                                        AwaitPointerEventScope awaitPointerEventScope1 = (AwaitPointerEventScope)this.m;
                                        f0.n(object0);
                                        awaitPointerEventScope0 = awaitPointerEventScope1;
                                        object2 = object0;
                                    label_16:
                                        ((PointerInputChange)object2).a();
                                        if(this.o != TapGestureDetectorKt.a) {
                                            androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2.1.2 tapGestureDetectorKt$detectTapAndPress$2$1$20 = new o(this.q, ((PointerInputChange)object2), null) {
                                                int k;
                                                final p l;
                                                final PressGestureScopeImpl m;
                                                final PointerInputChange n;

                                                {
                                                    this.l = p0;
                                                    this.m = pressGestureScopeImpl0;
                                                    this.n = pointerInputChange0;
                                                    super(2, d0);
                                                }

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @l
                                                public final d create(@m Object object0, @l d d0) {
                                                    return new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2.1.2(this.l, this.m, this.n, d0);
                                                }

                                                @Override  // A3.o
                                                public Object invoke(Object object0, Object object1) {
                                                    return this.invoke(((O)object0), ((d)object1));
                                                }

                                                @m
                                                public final Object invoke(@l O o0, @m d d0) {
                                                    return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2.1.2)this.create(o0, d0)).invokeSuspend(S0.a);
                                                }

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @m
                                                public final Object invokeSuspend(@l Object object0) {
                                                    Object object1 = b.l();
                                                    switch(this.k) {
                                                        case 0: {
                                                            f0.n(object0);
                                                            Offset offset0 = Offset.d(this.n.q());
                                                            this.k = 1;
                                                            return this.l.invoke(this.m, offset0, this) == object1 ? object1 : S0.a;
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
                                            kotlinx.coroutines.k.f(this.n, null, null, tapGestureDetectorKt$detectTapAndPress$2$1$20, 3, null);
                                        }
                                        this.m = null;
                                        this.l = 2;
                                        object3 = TapGestureDetectorKt.p(awaitPointerEventScope0, null, this, 1, null);
                                        if(object3 == object1) {
                                            return object1;
                                        }
                                        goto label_27;
                                    }
                                    case 2: {
                                        break;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                f0.n(object0);
                                object3 = object0;
                            label_27:
                                if(((PointerInputChange)object3) == null) {
                                    androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2.1.3 tapGestureDetectorKt$detectTapAndPress$2$1$30 = new o(null) {
                                        int k;
                                        final PressGestureScopeImpl l;

                                        {
                                            this.l = pressGestureScopeImpl0;
                                            super(2, d0);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @l
                                        public final d create(@m Object object0, @l d d0) {
                                            return new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2.1.3(this.l, d0);
                                        }

                                        @Override  // A3.o
                                        public Object invoke(Object object0, Object object1) {
                                            return this.invoke(((O)object0), ((d)object1));
                                        }

                                        @m
                                        public final Object invoke(@l O o0, @m d d0) {
                                            return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2.1.3)this.create(o0, d0)).invokeSuspend(S0.a);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @m
                                        public final Object invokeSuspend(@l Object object0) {
                                            if(this.k != 0) {
                                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                            }
                                            f0.n(object0);
                                            this.l.c();
                                            return S0.a;
                                        }
                                    };
                                    kotlinx.coroutines.k.f(this.n, null, null, tapGestureDetectorKt$detectTapAndPress$2$1$30, 3, null);
                                    return S0.a;
                                }
                                ((PointerInputChange)object3).a();
                                androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2.1.4 tapGestureDetectorKt$detectTapAndPress$2$1$40 = new o(null) {
                                    int k;
                                    final PressGestureScopeImpl l;

                                    {
                                        this.l = pressGestureScopeImpl0;
                                        super(2, d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        return new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2.1.4(this.l, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((O)object0), ((d)object1));
                                    }

                                    @m
                                    public final Object invoke(@l O o0, @m d d0) {
                                        return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress.2.1.4)this.create(o0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        if(this.k != 0) {
                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                        }
                                        f0.n(object0);
                                        this.l.e();
                                        return S0.a;
                                    }
                                };
                                kotlinx.coroutines.k.f(this.n, null, null, tapGestureDetectorKt$detectTapAndPress$2$1$40, 3, null);
                                Function1 function10 = this.p;
                                if(function10 != null) {
                                    function10.invoke(Offset.d(((PointerInputChange)object3).q()));
                                }
                                return S0.a;
                            }
                        };
                        this.k = 1;
                        return ForEachGestureKt.d(this.m, tapGestureDetectorKt$detectTapAndPress$2$10, this) == object1 ? object1 : S0.a;
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

    public static Object k(PointerInputScope pointerInputScope0, p p0, Function1 function10, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            p0 = TapGestureDetectorKt.a;
        }
        if((v & 2) != 0) {
            function10 = null;
        }
        return TapGestureDetectorKt.j(pointerInputScope0, p0, function10, d0);
    }

    @m
    public static final Object l(@l PointerInputScope pointerInputScope0, @m Function1 function10, @m Function1 function11, @l p p0, @m Function1 function12, @l d d0) {
        Object object0 = P.g(new o(pointerInputScope0, p0, function11, function10, function12, null) {
            int k;
            private Object l;
            final PointerInputScope m;
            final p n;
            final Function1 o;
            final Function1 p;
            final Function1 q;

            {
                this.m = pointerInputScope0;
                this.n = p0;
                this.o = function10;
                this.p = function11;
                this.q = function12;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2(this.m, this.n, this.o, this.p, this.q, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        PressGestureScopeImpl pressGestureScopeImpl0 = new PressGestureScopeImpl(this.m);
                        androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1 tapGestureDetectorKt$detectTapGestures$2$10 = new o(this.n, this.o, this.p, this.q, pressGestureScopeImpl0, null) {
                            Object l;
                            Object m;
                            Object n;
                            long o;
                            int p;
                            private Object q;
                            final O r;
                            final p s;
                            final Function1 t;
                            final Function1 u;
                            final Function1 v;
                            final PressGestureScopeImpl w;

                            {
                                this.r = o0;
                                this.s = p0;
                                this.t = function10;
                                this.u = function11;
                                this.v = function12;
                                this.w = pressGestureScopeImpl0;
                                super(2, d0);
                            }

                            @m
                            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                d d1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1(this.r, this.s, this.t, this.u, this.v, this.w, d0);
                                d1.q = object0;
                                return d1;
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.a(((AwaitPointerEventScope)object0), ((d)object1));
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                AwaitPointerEventScope awaitPointerEventScope0;
                                h l0$h0;
                                PointerInputChange pointerInputChange0;
                                androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.10 tapGestureDetectorKt$detectTapGestures$2$1$100;
                                AwaitPointerEventScope awaitPointerEventScope6;
                                Object object6;
                                h l0$h2;
                                PointerInputChange pointerInputChange2;
                                AwaitPointerEventScope awaitPointerEventScope5;
                                AwaitPointerEventScope awaitPointerEventScope4;
                                Object object3;
                                h l0$h1;
                                long v;
                                PointerInputChange pointerInputChange1;
                                AwaitPointerEventScope awaitPointerEventScope2;
                                Object object2;
                                Object object1 = b.l();
                                switch(this.p) {
                                    case 0: {
                                        f0.n(object0);
                                        AwaitPointerEventScope awaitPointerEventScope1 = (AwaitPointerEventScope)this.q;
                                        this.q = awaitPointerEventScope1;
                                        this.p = 1;
                                        object2 = TapGestureDetectorKt.f(awaitPointerEventScope1, false, null, this, 3, null);
                                        if(object2 == object1) {
                                            return object1;
                                        }
                                        awaitPointerEventScope2 = awaitPointerEventScope1;
                                        goto label_22;
                                    }
                                    case 1: {
                                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope)this.q;
                                        f0.n(object0);
                                        awaitPointerEventScope2 = awaitPointerEventScope3;
                                        object2 = object0;
                                    label_22:
                                        pointerInputChange1 = (PointerInputChange)object2;
                                        pointerInputChange1.a();
                                        androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.1 tapGestureDetectorKt$detectTapGestures$2$1$10 = new o(null) {
                                            int k;
                                            final PressGestureScopeImpl l;

                                            {
                                                this.l = pressGestureScopeImpl0;
                                                super(2, d0);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @l
                                            public final d create(@m Object object0, @l d d0) {
                                                return new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.1(this.l, d0);
                                            }

                                            @Override  // A3.o
                                            public Object invoke(Object object0, Object object1) {
                                                return this.invoke(((O)object0), ((d)object1));
                                            }

                                            @m
                                            public final Object invoke(@l O o0, @m d d0) {
                                                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @m
                                            public final Object invokeSuspend(@l Object object0) {
                                                Object object1 = b.l();
                                                switch(this.k) {
                                                    case 0: {
                                                        f0.n(object0);
                                                        this.k = 1;
                                                        return this.l.f(this) == object1 ? object1 : S0.a;
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
                                        kotlinx.coroutines.k.f(this.r, null, null, tapGestureDetectorKt$detectTapGestures$2$1$10, 3, null);
                                        if(this.s != TapGestureDetectorKt.a) {
                                            androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.2 tapGestureDetectorKt$detectTapGestures$2$1$20 = new o(this.w, pointerInputChange1, null) {
                                                int k;
                                                final p l;
                                                final PressGestureScopeImpl m;
                                                final PointerInputChange n;

                                                {
                                                    this.l = p0;
                                                    this.m = pressGestureScopeImpl0;
                                                    this.n = pointerInputChange0;
                                                    super(2, d0);
                                                }

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @l
                                                public final d create(@m Object object0, @l d d0) {
                                                    return new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.2(this.l, this.m, this.n, d0);
                                                }

                                                @Override  // A3.o
                                                public Object invoke(Object object0, Object object1) {
                                                    return this.invoke(((O)object0), ((d)object1));
                                                }

                                                @m
                                                public final Object invoke(@l O o0, @m d d0) {
                                                    return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.2)this.create(o0, d0)).invokeSuspend(S0.a);
                                                }

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @m
                                                public final Object invokeSuspend(@l Object object0) {
                                                    Object object1 = b.l();
                                                    switch(this.k) {
                                                        case 0: {
                                                            f0.n(object0);
                                                            Offset offset0 = Offset.d(this.n.q());
                                                            this.k = 1;
                                                            return this.l.invoke(this.m, offset0, this) == object1 ? object1 : S0.a;
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
                                            kotlinx.coroutines.k.f(this.r, null, null, tapGestureDetectorKt$detectTapGestures$2$1$20, 3, null);
                                        }
                                        v = this.t == null ? 0x3FFFFFFFFFFFFFFFL : awaitPointerEventScope2.getViewConfiguration().d();
                                        l0$h1 = new h();
                                        try {
                                            androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.3 tapGestureDetectorKt$detectTapGestures$2$1$30 = new o() {
                                                int l;
                                                private Object m;

                                                {
                                                    super(2, d0);
                                                }

                                                @m
                                                public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                                                    return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.3)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
                                                }

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @l
                                                public final d create(@m Object object0, @l d d0) {
                                                    d d1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.3(d0);
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
                                                            object0 = TapGestureDetectorKt.p(((AwaitPointerEventScope)this.m), null, this, 1, null);
                                                            return object0 == object1 ? object1 : object0;
                                                        }
                                                        case 1: {
                                                            f0.n(object0);
                                                            return object0;
                                                        }
                                                        default: {
                                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                        }
                                                    }
                                                }
                                            };
                                            this.q = awaitPointerEventScope2;
                                            this.l = pointerInputChange1;
                                            this.m = l0$h1;
                                            this.n = l0$h1;
                                            this.o = v;
                                            this.p = 2;
                                            object3 = awaitPointerEventScope2.k0(v, tapGestureDetectorKt$detectTapGestures$2$1$30, this);
                                        }
                                        catch(PointerEventTimeoutCancellationException unused_ex) {
                                            awaitPointerEventScope4 = awaitPointerEventScope2;
                                            goto label_75;
                                        }
                                        if(object3 == object1) {
                                            return object1;
                                        }
                                        awaitPointerEventScope5 = awaitPointerEventScope2;
                                        pointerInputChange2 = pointerInputChange1;
                                        l0$h2 = l0$h1;
                                        goto label_62;
                                    }
                                    case 2: {
                                        v = this.o;
                                        l0$h1 = (h)this.n;
                                        h l0$h3 = (h)this.m;
                                        pointerInputChange1 = (PointerInputChange)this.l;
                                        awaitPointerEventScope2 = (AwaitPointerEventScope)this.q;
                                        try {
                                            f0.n(object0);
                                            awaitPointerEventScope5 = awaitPointerEventScope2;
                                            pointerInputChange2 = pointerInputChange1;
                                            l0$h2 = l0$h3;
                                            object3 = object0;
                                        }
                                        catch(PointerEventTimeoutCancellationException unused_ex) {
                                            l0$h1 = l0$h3;
                                            awaitPointerEventScope4 = awaitPointerEventScope2;
                                            goto label_75;
                                        }
                                        try {
                                        label_62:
                                            l0$h1.a = object3;
                                            Object object4 = l0$h2.a;
                                            if(object4 == null) {
                                                androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.4 tapGestureDetectorKt$detectTapGestures$2$1$40 = new o(null) {
                                                    int k;
                                                    final PressGestureScopeImpl l;

                                                    {
                                                        this.l = pressGestureScopeImpl0;
                                                        super(2, d0);
                                                    }

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @l
                                                    public final d create(@m Object object0, @l d d0) {
                                                        return new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.4(this.l, d0);
                                                    }

                                                    @Override  // A3.o
                                                    public Object invoke(Object object0, Object object1) {
                                                        return this.invoke(((O)object0), ((d)object1));
                                                    }

                                                    @m
                                                    public final Object invoke(@l O o0, @m d d0) {
                                                        return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.4)this.create(o0, d0)).invokeSuspend(S0.a);
                                                    }

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @m
                                                    public final Object invokeSuspend(@l Object object0) {
                                                        if(this.k != 0) {
                                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                        }
                                                        f0.n(object0);
                                                        this.l.c();
                                                        return S0.a;
                                                    }
                                                };
                                                kotlinx.coroutines.k.f(this.r, null, null, tapGestureDetectorKt$detectTapGestures$2$1$40, 3, null);
                                            }
                                            else {
                                                ((PointerInputChange)object4).a();
                                                androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.5 tapGestureDetectorKt$detectTapGestures$2$1$50 = new o(null) {
                                                    int k;
                                                    final PressGestureScopeImpl l;

                                                    {
                                                        this.l = pressGestureScopeImpl0;
                                                        super(2, d0);
                                                    }

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @l
                                                    public final d create(@m Object object0, @l d d0) {
                                                        return new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.5(this.l, d0);
                                                    }

                                                    @Override  // A3.o
                                                    public Object invoke(Object object0, Object object1) {
                                                        return this.invoke(((O)object0), ((d)object1));
                                                    }

                                                    @m
                                                    public final Object invoke(@l O o0, @m d d0) {
                                                        return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.5)this.create(o0, d0)).invokeSuspend(S0.a);
                                                    }

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @m
                                                    public final Object invokeSuspend(@l Object object0) {
                                                        if(this.k != 0) {
                                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                        }
                                                        f0.n(object0);
                                                        this.l.e();
                                                        return S0.a;
                                                    }
                                                };
                                                kotlinx.coroutines.k.f(this.r, null, null, tapGestureDetectorKt$detectTapGestures$2$1$50, 3, null);
                                            }
                                            goto label_94;
                                        }
                                        catch(PointerEventTimeoutCancellationException unused_ex) {
                                            l0$h1 = l0$h2;
                                            pointerInputChange1 = pointerInputChange2;
                                            awaitPointerEventScope4 = awaitPointerEventScope5;
                                        }
                                    label_75:
                                        Function1 function10 = this.t;
                                        if(function10 != null) {
                                            function10.invoke(Offset.d(pointerInputChange1.q()));
                                        }
                                        this.q = awaitPointerEventScope4;
                                        this.l = l0$h1;
                                        this.m = null;
                                        this.n = null;
                                        this.o = v;
                                        this.p = 3;
                                        if(TapGestureDetectorKt.i(awaitPointerEventScope4, this) == object1) {
                                            return object1;
                                        }
                                        goto label_90;
                                    }
                                    case 3: {
                                        v = this.o;
                                        l0$h1 = (h)this.l;
                                        awaitPointerEventScope4 = (AwaitPointerEventScope)this.q;
                                        f0.n(object0);
                                    label_90:
                                        androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.6 tapGestureDetectorKt$detectTapGestures$2$1$60 = new o(null) {
                                            int k;
                                            final PressGestureScopeImpl l;

                                            {
                                                this.l = pressGestureScopeImpl0;
                                                super(2, d0);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @l
                                            public final d create(@m Object object0, @l d d0) {
                                                return new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.6(this.l, d0);
                                            }

                                            @Override  // A3.o
                                            public Object invoke(Object object0, Object object1) {
                                                return this.invoke(((O)object0), ((d)object1));
                                            }

                                            @m
                                            public final Object invoke(@l O o0, @m d d0) {
                                                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.6)this.create(o0, d0)).invokeSuspend(S0.a);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @m
                                            public final Object invokeSuspend(@l Object object0) {
                                                if(this.k != 0) {
                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                }
                                                f0.n(object0);
                                                this.l.e();
                                                return S0.a;
                                            }
                                        };
                                        kotlinx.coroutines.k.f(this.r, null, null, tapGestureDetectorKt$detectTapGestures$2$1$60, 3, null);
                                        l0$h2 = l0$h1;
                                        awaitPointerEventScope5 = awaitPointerEventScope4;
                                    label_94:
                                        Object object5 = l0$h2.a;
                                        if(object5 != null) {
                                            if(this.u == null) {
                                                Function1 function11 = this.v;
                                                if(function11 != null) {
                                                    function11.invoke(Offset.d(((PointerInputChange)object5).q()));
                                                    return S0.a;
                                                }
                                            }
                                            else {
                                                this.q = awaitPointerEventScope5;
                                                this.l = l0$h2;
                                                this.m = null;
                                                this.n = null;
                                                this.o = v;
                                                this.p = 4;
                                                object6 = TapGestureDetectorKt.h(awaitPointerEventScope5, ((PointerInputChange)object5), this);
                                                if(object6 == object1) {
                                                    return object1;
                                                }
                                                awaitPointerEventScope6 = awaitPointerEventScope5;
                                                goto label_118;
                                            }
                                        }
                                        break;
                                    }
                                    case 4: {
                                        v = this.o;
                                        h l0$h4 = (h)this.l;
                                        awaitPointerEventScope6 = (AwaitPointerEventScope)this.q;
                                        f0.n(object0);
                                        l0$h2 = l0$h4;
                                        object6 = object0;
                                    label_118:
                                        PointerInputChange pointerInputChange3 = (PointerInputChange)object6;
                                        if(pointerInputChange3 == null) {
                                            Function1 function12 = this.v;
                                            if(function12 != null) {
                                                function12.invoke(Offset.d(((PointerInputChange)l0$h2.a).q()));
                                                return S0.a;
                                            }
                                        }
                                        else {
                                            androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.7 tapGestureDetectorKt$detectTapGestures$2$1$70 = new o(null) {
                                                int k;
                                                final PressGestureScopeImpl l;

                                                {
                                                    this.l = pressGestureScopeImpl0;
                                                    super(2, d0);
                                                }

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @l
                                                public final d create(@m Object object0, @l d d0) {
                                                    return new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.7(this.l, d0);
                                                }

                                                @Override  // A3.o
                                                public Object invoke(Object object0, Object object1) {
                                                    return this.invoke(((O)object0), ((d)object1));
                                                }

                                                @m
                                                public final Object invoke(@l O o0, @m d d0) {
                                                    return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.7)this.create(o0, d0)).invokeSuspend(S0.a);
                                                }

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @m
                                                public final Object invokeSuspend(@l Object object0) {
                                                    Object object1 = b.l();
                                                    switch(this.k) {
                                                        case 0: {
                                                            f0.n(object0);
                                                            this.k = 1;
                                                            return this.l.f(this) == object1 ? object1 : S0.a;
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
                                            kotlinx.coroutines.k.f(this.r, null, null, tapGestureDetectorKt$detectTapGestures$2$1$70, 3, null);
                                            if(this.s != TapGestureDetectorKt.a) {
                                                androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.8 tapGestureDetectorKt$detectTapGestures$2$1$80 = new o(this.w, pointerInputChange3, null) {
                                                    int k;
                                                    final p l;
                                                    final PressGestureScopeImpl m;
                                                    final PointerInputChange n;

                                                    {
                                                        this.l = p0;
                                                        this.m = pressGestureScopeImpl0;
                                                        this.n = pointerInputChange0;
                                                        super(2, d0);
                                                    }

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @l
                                                    public final d create(@m Object object0, @l d d0) {
                                                        return new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.8(this.l, this.m, this.n, d0);
                                                    }

                                                    @Override  // A3.o
                                                    public Object invoke(Object object0, Object object1) {
                                                        return this.invoke(((O)object0), ((d)object1));
                                                    }

                                                    @m
                                                    public final Object invoke(@l O o0, @m d d0) {
                                                        return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.8)this.create(o0, d0)).invokeSuspend(S0.a);
                                                    }

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @m
                                                    public final Object invokeSuspend(@l Object object0) {
                                                        Object object1 = b.l();
                                                        switch(this.k) {
                                                            case 0: {
                                                                f0.n(object0);
                                                                Offset offset0 = Offset.d(this.n.q());
                                                                this.k = 1;
                                                                return this.l.invoke(this.m, offset0, this) == object1 ? object1 : S0.a;
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
                                                kotlinx.coroutines.k.f(this.r, null, null, tapGestureDetectorKt$detectTapGestures$2$1$80, 3, null);
                                            }
                                            try {
                                                androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.9 tapGestureDetectorKt$detectTapGestures$2$1$90 = new o(this.u, this.v, l0$h2, this.w, null) {
                                                    int l;
                                                    private Object m;
                                                    final O n;
                                                    final Function1 o;
                                                    final Function1 p;
                                                    final h q;
                                                    final PressGestureScopeImpl r;

                                                    {
                                                        this.n = o0;
                                                        this.o = function10;
                                                        this.p = function11;
                                                        this.q = l0$h0;
                                                        this.r = pressGestureScopeImpl0;
                                                        super(2, d0);
                                                    }

                                                    @m
                                                    public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                                                        return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.9)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
                                                    }

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @l
                                                    public final d create(@m Object object0, @l d d0) {
                                                        d d1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.9(this.n, this.o, this.p, this.q, this.r, d0);
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
                                                                object0 = TapGestureDetectorKt.p(((AwaitPointerEventScope)this.m), null, this, 1, null);
                                                                if(object0 == object1) {
                                                                    return object1;
                                                                }
                                                                break;
                                                            }
                                                            case 1: {
                                                                f0.n(object0);
                                                                break;
                                                            }
                                                            default: {
                                                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                            }
                                                        }
                                                        if(((PointerInputChange)object0) != null) {
                                                            ((PointerInputChange)object0).a();
                                                            androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.9.1 tapGestureDetectorKt$detectTapGestures$2$1$9$10 = new o(null) {
                                                                int k;
                                                                final PressGestureScopeImpl l;

                                                                {
                                                                    this.l = pressGestureScopeImpl0;
                                                                    super(2, d0);
                                                                }

                                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                                @l
                                                                public final d create(@m Object object0, @l d d0) {
                                                                    return new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.9.1(this.l, d0);
                                                                }

                                                                @Override  // A3.o
                                                                public Object invoke(Object object0, Object object1) {
                                                                    return this.invoke(((O)object0), ((d)object1));
                                                                }

                                                                @m
                                                                public final Object invoke(@l O o0, @m d d0) {
                                                                    return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.9.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                                                }

                                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                                @m
                                                                public final Object invokeSuspend(@l Object object0) {
                                                                    if(this.k != 0) {
                                                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                                    }
                                                                    f0.n(object0);
                                                                    this.l.e();
                                                                    return S0.a;
                                                                }
                                                            };
                                                            kotlinx.coroutines.k.f(this.n, null, null, tapGestureDetectorKt$detectTapGestures$2$1$9$10, 3, null);
                                                            Offset offset0 = Offset.d(((PointerInputChange)object0).q());
                                                            this.o.invoke(offset0);
                                                            return S0.a;
                                                        }
                                                        androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.9.2 tapGestureDetectorKt$detectTapGestures$2$1$9$20 = new o(null) {
                                                            int k;
                                                            final PressGestureScopeImpl l;

                                                            {
                                                                this.l = pressGestureScopeImpl0;
                                                                super(2, d0);
                                                            }

                                                            @Override  // kotlin.coroutines.jvm.internal.a
                                                            @l
                                                            public final d create(@m Object object0, @l d d0) {
                                                                return new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.9.2(this.l, d0);
                                                            }

                                                            @Override  // A3.o
                                                            public Object invoke(Object object0, Object object1) {
                                                                return this.invoke(((O)object0), ((d)object1));
                                                            }

                                                            @m
                                                            public final Object invoke(@l O o0, @m d d0) {
                                                                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.9.2)this.create(o0, d0)).invokeSuspend(S0.a);
                                                            }

                                                            @Override  // kotlin.coroutines.jvm.internal.a
                                                            @m
                                                            public final Object invokeSuspend(@l Object object0) {
                                                                if(this.k != 0) {
                                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                                }
                                                                f0.n(object0);
                                                                this.l.c();
                                                                return S0.a;
                                                            }
                                                        };
                                                        kotlinx.coroutines.k.f(this.n, null, null, tapGestureDetectorKt$detectTapGestures$2$1$9$20, 3, null);
                                                        Function1 function10 = this.p;
                                                        if(function10 != null) {
                                                            function10.invoke(Offset.d(((PointerInputChange)this.q.a).q()));
                                                            return S0.a;
                                                        }
                                                        return null;
                                                    }
                                                };
                                                this.q = awaitPointerEventScope6;
                                                this.l = l0$h2;
                                                this.m = pointerInputChange3;
                                                this.p = 5;
                                                if(awaitPointerEventScope6.k0(v, tapGestureDetectorKt$detectTapGestures$2$1$90, this) == object1) {
                                                    return object1;
                                                }
                                                break;
                                            }
                                            catch(PointerEventTimeoutCancellationException unused_ex) {
                                                pointerInputChange0 = pointerInputChange3;
                                                awaitPointerEventScope0 = awaitPointerEventScope6;
                                                l0$h0 = l0$h2;
                                            }
                                        label_139:
                                            Function1 function13 = this.v;
                                            if(function13 != null) {
                                                function13.invoke(Offset.d(((PointerInputChange)l0$h0.a).q()));
                                            }
                                            Function1 function14 = this.t;
                                            if(function14 != null) {
                                                function14.invoke(Offset.d(pointerInputChange0.q()));
                                            }
                                            this.q = null;
                                            this.l = null;
                                            this.m = null;
                                            this.p = 6;
                                            if(TapGestureDetectorKt.i(awaitPointerEventScope0, this) == object1) {
                                                return object1;
                                            }
                                            tapGestureDetectorKt$detectTapGestures$2$1$100 = new o(null) {
                                                int k;
                                                final PressGestureScopeImpl l;

                                                {
                                                    this.l = pressGestureScopeImpl0;
                                                    super(2, d0);
                                                }

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @l
                                                public final d create(@m Object object0, @l d d0) {
                                                    return new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.10(this.l, d0);
                                                }

                                                @Override  // A3.o
                                                public Object invoke(Object object0, Object object1) {
                                                    return this.invoke(((O)object0), ((d)object1));
                                                }

                                                @m
                                                public final Object invoke(@l O o0, @m d d0) {
                                                    return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.10)this.create(o0, d0)).invokeSuspend(S0.a);
                                                }

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @m
                                                public final Object invokeSuspend(@l Object object0) {
                                                    if(this.k != 0) {
                                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                    }
                                                    f0.n(object0);
                                                    this.l.e();
                                                    return S0.a;
                                                }
                                            };
                                            kotlinx.coroutines.k.f(this.r, null, null, tapGestureDetectorKt$detectTapGestures$2$1$100, 3, null);
                                            return S0.a;
                                        }
                                        break;
                                    }
                                    case 5: {
                                        pointerInputChange0 = (PointerInputChange)this.m;
                                        l0$h0 = (h)this.l;
                                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                                        try {
                                            f0.n(object0);
                                            return S0.a;
                                        }
                                        catch(PointerEventTimeoutCancellationException unused_ex) {
                                            goto label_139;
                                        }
                                    }
                                    case 6: {
                                        f0.n(object0);
                                        tapGestureDetectorKt$detectTapGestures$2$1$100 = new o(null) {
                                            int k;
                                            final PressGestureScopeImpl l;

                                            {
                                                this.l = pressGestureScopeImpl0;
                                                super(2, d0);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @l
                                            public final d create(@m Object object0, @l d d0) {
                                                return new androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.10(this.l, d0);
                                            }

                                            @Override  // A3.o
                                            public Object invoke(Object object0, Object object1) {
                                                return this.invoke(((O)object0), ((d)object1));
                                            }

                                            @m
                                            public final Object invoke(@l O o0, @m d d0) {
                                                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures.2.1.10)this.create(o0, d0)).invokeSuspend(S0.a);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @m
                                            public final Object invokeSuspend(@l Object object0) {
                                                if(this.k != 0) {
                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                }
                                                f0.n(object0);
                                                this.l.e();
                                                return S0.a;
                                            }
                                        };
                                        kotlinx.coroutines.k.f(this.r, null, null, tapGestureDetectorKt$detectTapGestures$2$1$100, 3, null);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                return S0.a;
                            }
                        };
                        this.k = 1;
                        return ForEachGestureKt.d(this.m, tapGestureDetectorKt$detectTapGestures$2$10, this) == object1 ? object1 : S0.a;
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

    public static Object m(PointerInputScope pointerInputScope0, Function1 function10, Function1 function11, p p0, Function1 function12, d d0, int v, Object object0) {
        Function1 function13 = (v & 1) == 0 ? function10 : null;
        Function1 function14 = (v & 2) == 0 ? function11 : null;
        if((v & 4) != 0) {
            p0 = TapGestureDetectorKt.a;
        }
        return (v & 8) == 0 ? TapGestureDetectorKt.l(pointerInputScope0, function13, function14, p0, function12, d0) : TapGestureDetectorKt.l(pointerInputScope0, function13, function14, p0, null, d0);
    }

    @m
    public static final Object n(@l AwaitPointerEventScope awaitPointerEventScope0, @l PointerEventPass pointerEventPass0, @l d d0) {
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerEventPass pointerEventPass2;
        PointerEventPass pointerEventPass1;
        androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation.2 tapGestureDetectorKt$waitForUpOrCancellation$21;
        AwaitPointerEventScope awaitPointerEventScope1;
        androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation.2 tapGestureDetectorKt$waitForUpOrCancellation$20;
        if(d0 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation.2) {
            tapGestureDetectorKt$waitForUpOrCancellation$20 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation.2)d0;
            int v = tapGestureDetectorKt$waitForUpOrCancellation$20.n;
            if((v & 0x80000000) == 0) {
                tapGestureDetectorKt$waitForUpOrCancellation$20 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.n |= 0x80000000;
                        return TapGestureDetectorKt.n(null, null, this);
                    }
                };
            }
            else {
                tapGestureDetectorKt$waitForUpOrCancellation$20.n = v ^ 0x80000000;
            }
        }
        else {
            tapGestureDetectorKt$waitForUpOrCancellation$20 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.n |= 0x80000000;
                    return TapGestureDetectorKt.n(null, null, this);
                }
            };
        }
        Object object0 = tapGestureDetectorKt$waitForUpOrCancellation$20.m;
        Object object1 = b.l();
        switch(tapGestureDetectorKt$waitForUpOrCancellation$20.n) {
            case 0: {
                f0.n(object0);
                awaitPointerEventScope1 = awaitPointerEventScope0;
                tapGestureDetectorKt$waitForUpOrCancellation$21 = tapGestureDetectorKt$waitForUpOrCancellation$20;
                pointerEventPass1 = pointerEventPass0;
                goto label_36;
            }
            case 1: {
                pointerEventPass2 = (PointerEventPass)tapGestureDetectorKt$waitForUpOrCancellation$20.l;
                awaitPointerEventScope2 = (AwaitPointerEventScope)tapGestureDetectorKt$waitForUpOrCancellation$20.k;
                f0.n(object0);
                goto label_46;
            }
            case 2: {
                pointerEventPass2 = (PointerEventPass)tapGestureDetectorKt$waitForUpOrCancellation$20.l;
                awaitPointerEventScope2 = (AwaitPointerEventScope)tapGestureDetectorKt$waitForUpOrCancellation$20.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            tapGestureDetectorKt$waitForUpOrCancellation$21 = tapGestureDetectorKt$waitForUpOrCancellation$20;
            pointerEventPass1 = pointerEventPass2;
            List list0 = ((PointerEvent)object0).e();
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((PointerInputChange)list0.get(v2)).A()) {
                    return null;
                }
            }
            awaitPointerEventScope1 = awaitPointerEventScope2;
        label_36:
            tapGestureDetectorKt$waitForUpOrCancellation$21.k = awaitPointerEventScope1;
            tapGestureDetectorKt$waitForUpOrCancellation$21.l = pointerEventPass1;
            tapGestureDetectorKt$waitForUpOrCancellation$21.n = 1;
            Object object2 = awaitPointerEventScope1.l1(pointerEventPass1, tapGestureDetectorKt$waitForUpOrCancellation$21);
            if(object2 == object1) {
                return object1;
            }
            awaitPointerEventScope2 = awaitPointerEventScope1;
            object0 = object2;
            pointerEventPass2 = pointerEventPass1;
            tapGestureDetectorKt$waitForUpOrCancellation$20 = tapGestureDetectorKt$waitForUpOrCancellation$21;
        label_46:
            List list1 = ((PointerEvent)object0).e();
            int v3 = list1.size();
            int v4 = 0;
            while(true) {
                if(v4 >= v3) {
                    break alab1;
                }
                if(PointerEventKt.d(((PointerInputChange)list1.get(v4)))) {
                    ++v4;
                    continue;
                }
                List list2 = ((PointerEvent)object0).e();
                int v5 = list2.size();
                int v6 = 0;
                while(v6 < v5) {
                    PointerInputChange pointerInputChange0 = (PointerInputChange)list2.get(v6);
                    if(!pointerInputChange0.A() && !PointerEventKt.j(pointerInputChange0, awaitPointerEventScope2.a(), awaitPointerEventScope2.S())) {
                        ++v6;
                        continue;
                    }
                    return null;
                }
                tapGestureDetectorKt$waitForUpOrCancellation$20.k = awaitPointerEventScope2;
                tapGestureDetectorKt$waitForUpOrCancellation$20.l = pointerEventPass2;
                tapGestureDetectorKt$waitForUpOrCancellation$20.n = 2;
                object0 = awaitPointerEventScope2.l1(PointerEventPass.c, tapGestureDetectorKt$waitForUpOrCancellation$20);
                if(object0 != object1) {
                    break;
                }
                return object1;
            }
        }
        return ((PointerEvent)object0).e().get(0);
    }

    @k(level = kotlin.m.c, message = "Maintained for binary compatibility. Use version with PointerEventPass instead.")
    public static final Object o(AwaitPointerEventScope awaitPointerEventScope0, d d0) {
        return TapGestureDetectorKt.n(awaitPointerEventScope0, PointerEventPass.b, d0);
    }

    public static Object p(AwaitPointerEventScope awaitPointerEventScope0, PointerEventPass pointerEventPass0, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            pointerEventPass0 = PointerEventPass.b;
        }
        return TapGestureDetectorKt.n(awaitPointerEventScope0, pointerEventPass0, d0);
    }
}

