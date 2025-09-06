package androidx.compose.foundation.gestures;

import A3.p;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.channels.l;
import kotlinx.coroutines.channels.o;
import y4.m;

@s0({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,180:1\n135#2:181\n101#3,2:182\n33#3,6:184\n103#3:190\n33#3,6:191\n101#3,2:197\n33#3,6:199\n103#3:205\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n106#1:181\n137#1:182,2\n137#1:184,6\n137#1:190\n171#1:191,6\n178#1:197,2\n178#1:199,6\n178#1:205\n*E\n"})
public final class TransformableKt {
    private static final Object b(AwaitPointerEventScope awaitPointerEventScope0, State state0, l l0, d d0) {
        int v8;
        int v7;
        androidx.compose.foundation.gestures.TransformableKt.detectZoom.1 transformableKt$detectZoom$11;
        AwaitPointerEventScope awaitPointerEventScope2;
        l l2;
        State state2;
        float f4;
        float f3;
        AwaitPointerEventScope awaitPointerEventScope1;
        l l1;
        float f2;
        int v4;
        int v3;
        State state1;
        long v2;
        float f1;
        androidx.compose.foundation.gestures.TransformableKt.detectZoom.1 transformableKt$detectZoom$10;
        if(d0 instanceof androidx.compose.foundation.gestures.TransformableKt.detectZoom.1) {
            transformableKt$detectZoom$10 = (androidx.compose.foundation.gestures.TransformableKt.detectZoom.1)d0;
            int v = transformableKt$detectZoom$10.u;
            if((v & 0x80000000) == 0) {
                transformableKt$detectZoom$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    float n;
                    float o;
                    float p;
                    long q;
                    int r;
                    int s;
                    Object t;
                    int u;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@y4.l Object object0) {
                        this.t = object0;
                        this.u |= 0x80000000;
                        return TransformableKt.b(null, null, null, this);
                    }
                };
            }
            else {
                transformableKt$detectZoom$10.u = v ^ 0x80000000;
            }
        }
        else {
            transformableKt$detectZoom$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                float n;
                float o;
                float p;
                long q;
                int r;
                int s;
                Object t;
                int u;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@y4.l Object object0) {
                    this.t = object0;
                    this.u |= 0x80000000;
                    return TransformableKt.b(null, null, null, this);
                }
            };
        }
        Object object0 = transformableKt$detectZoom$10.t;
        Object object1 = b.l();
        int v1 = 0;
        switch(transformableKt$detectZoom$10.u) {
            case 0: {
                f0.n(object0);
                float f = awaitPointerEventScope0.getViewConfiguration().b();
                transformableKt$detectZoom$10.k = awaitPointerEventScope0;
                transformableKt$detectZoom$10.l = state0;
                transformableKt$detectZoom$10.m = l0;
                transformableKt$detectZoom$10.n = 0.0f;
                transformableKt$detectZoom$10.o = 1.0f;
                transformableKt$detectZoom$10.q = 0L;
                transformableKt$detectZoom$10.r = 0;
                transformableKt$detectZoom$10.p = f;
                transformableKt$detectZoom$10.s = 0;
                transformableKt$detectZoom$10.u = 1;
                if(TapGestureDetectorKt.f(awaitPointerEventScope0, false, null, transformableKt$detectZoom$10, 2, null) == object1) {
                    return object1;
                }
                f1 = f;
                v2 = 0L;
                state1 = state0;
                v3 = 0;
                v4 = 0;
                f2 = 1.0f;
                l1 = l0;
                awaitPointerEventScope1 = awaitPointerEventScope0;
                f3 = 0.0f;
                goto label_48;
            }
            case 1: {
                v3 = transformableKt$detectZoom$10.s;
                f1 = transformableKt$detectZoom$10.p;
                v4 = transformableKt$detectZoom$10.r;
                v2 = transformableKt$detectZoom$10.q;
                f2 = transformableKt$detectZoom$10.o;
                f3 = transformableKt$detectZoom$10.n;
                l1 = (l)transformableKt$detectZoom$10.m;
                state1 = (State)transformableKt$detectZoom$10.l;
                awaitPointerEventScope1 = (AwaitPointerEventScope)transformableKt$detectZoom$10.k;
                f0.n(object0);
            label_48:
                f4 = f3;
                state2 = state1;
                l2 = l1;
                awaitPointerEventScope2 = awaitPointerEventScope1;
                goto label_119;
            }
            case 2: {
                v3 = transformableKt$detectZoom$10.s;
                f1 = transformableKt$detectZoom$10.p;
                v4 = transformableKt$detectZoom$10.r;
                v2 = transformableKt$detectZoom$10.q;
                f2 = transformableKt$detectZoom$10.o;
                f4 = transformableKt$detectZoom$10.n;
                l2 = (l)transformableKt$detectZoom$10.m;
                state2 = (State)transformableKt$detectZoom$10.l;
                awaitPointerEventScope2 = (AwaitPointerEventScope)transformableKt$detectZoom$10.k;
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
            int v5 = list0.size();
            while(true) {
                boolean z = false;
                if(v1 < v5) {
                    if(((PointerInputChange)list0.get(v1)).A()) {
                        z = true;
                    }
                    else {
                        ++v1;
                        continue;
                    }
                }
                break;
            }
            if(z) {
                transformableKt$detectZoom$11 = transformableKt$detectZoom$10;
            }
            else {
                float f5 = TransformGestureDetectorKt.h(((PointerEvent)object0));
                float f6 = TransformGestureDetectorKt.g(((PointerEvent)object0));
                transformableKt$detectZoom$11 = transformableKt$detectZoom$10;
                long v6 = TransformGestureDetectorKt.f(((PointerEvent)object0));
                if(v4 == 0) {
                    f2 *= f5;
                    f4 += f6;
                    v2 = Offset.v(v2, v6);
                    float f7 = TransformGestureDetectorKt.d(((PointerEvent)object0), false);
                    v7 = 0;
                    float f8 = Math.abs(3.141593f * f4 * f7 / 180.0f);
                    if(Math.abs(1.0f - f2) * f7 > f1 || f8 > f1 || Offset.m(v2) > f1) {
                        v8 = !((Boolean)state2.getValue()).booleanValue() || f8 >= f1 ? 0 : 1;
                        l2.l(TransformStarted.a);
                        v7 = 1;
                        goto label_92;
                    }
                }
                else {
                    v7 = v4;
                }
                v8 = v3;
            label_92:
                if(v7 != 0) {
                    float f9 = v8 == 0 ? f6 : 0.0f;
                    if(f9 != 0.0f || f5 != 1.0f || !Offset.l(v6, 0L)) {
                        l2.l(new TransformDelta(f5, v6, f9, null));
                    }
                    List list1 = ((PointerEvent)object0).e();
                    int v9 = list1.size();
                    for(int v10 = 0; v10 < v9; ++v10) {
                        PointerInputChange pointerInputChange0 = (PointerInputChange)list1.get(v10);
                        if(PointerEventKt.p(pointerInputChange0)) {
                            pointerInputChange0.a();
                        }
                    }
                }
                v3 = v8;
                v4 = v7;
            }
            if(z) {
                break;
            }
            List list2 = ((PointerEvent)object0).e();
            int v11 = list2.size();
            int v12 = 0;
            while(true) {
                if(v12 >= v11) {
                    break;
                }
                if(!((PointerInputChange)list2.get(v12)).r()) {
                    ++v12;
                    continue;
                }
                transformableKt$detectZoom$10 = transformableKt$detectZoom$11;
                v1 = 0;
            label_119:
                transformableKt$detectZoom$10.k = awaitPointerEventScope2;
                transformableKt$detectZoom$10.l = state2;
                transformableKt$detectZoom$10.m = l2;
                transformableKt$detectZoom$10.n = f4;
                transformableKt$detectZoom$10.o = f2;
                transformableKt$detectZoom$10.q = v2;
                transformableKt$detectZoom$10.r = v4;
                transformableKt$detectZoom$10.p = f1;
                transformableKt$detectZoom$10.s = v3;
                transformableKt$detectZoom$10.u = 2;
                object0 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope2, null, transformableKt$detectZoom$10, 1, null);
                if(object0 != object1) {
                    continue alab1;
                }
                return object1;
            }
            break;
        }
        return S0.a;
    }

    @y4.l
    public static final Modifier c(@y4.l Modifier modifier0, @y4.l TransformableState transformableState0, boolean z, boolean z1) {
        L.p(modifier0, "<this>");
        L.p(transformableState0, "state");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(z, z1, transformableState0) {
            final boolean e;
            final boolean f;
            final TransformableState g;

            {
                this.e = z;
                this.f = z1;
                this.g = transformableState0;
                super(3);
            }

            @Composable
            @y4.l
            public final Modifier a(@y4.l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x59F6A32D);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x59F6A32D, v, -1, "androidx.compose.foundation.gestures.transformable.<anonymous> (Transformable.kt:65)");
                }
                State state0 = SnapshotStateKt.t(Boolean.valueOf(this.e), composer0, 0);
                composer0.V(0xE2A708A4);
                l l0 = composer0.W();
                Companion composer$Companion0 = Composer.a;
                if(l0 == composer$Companion0.a()) {
                    l0 = o.d(0x7FFFFFFF, null, null, 6, null);
                    composer0.O(l0);
                }
                composer0.g0();
                composer0.V(-2015617726);
                if(this.f) {
                    androidx.compose.foundation.gestures.TransformableKt.transformable.2.1 transformableKt$transformable$2$10 = new A3.o(this.g, null) {
                        Object k;
                        Object l;
                        int m;
                        private Object n;
                        final l o;
                        final TransformableState p;

                        {
                            this.o = l0;
                            this.p = transformableState0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @y4.l
                        public final d create(@m Object object0, @y4.l d d0) {
                            d d1 = new androidx.compose.foundation.gestures.TransformableKt.transformable.2.1(this.o, this.p, d0);
                            d1.n = object0;
                            return d1;
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@y4.l O o0, @m d d0) {
                            return ((androidx.compose.foundation.gestures.TransformableKt.transformable.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@y4.l Object object0) {
                            O o1;
                            h l0$h1;
                            h l0$h0;
                            O o0;
                            Object object1 = b.l();
                            switch(this.m) {
                                case 0: {
                                    f0.n(object0);
                                    o0 = (O)this.n;
                                    break;
                                }
                                case 1: {
                                    l0$h0 = (h)this.l;
                                    l0$h1 = (h)this.k;
                                    o1 = (O)this.n;
                                    f0.n(object0);
                                    goto label_26;
                                }
                                case 2: {
                                    O o2 = (O)this.n;
                                    try {
                                        f0.n(object0);
                                    }
                                    catch(CancellationException unused_ex) {
                                    }
                                    o0 = o2;
                                    break;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                            while(P.k(o0)) {
                                l0$h0 = new h();
                                this.n = o0;
                                this.k = l0$h0;
                                this.l = l0$h0;
                                this.m = 1;
                                Object object2 = this.o.F(this);
                                if(object2 == object1) {
                                    return object1;
                                }
                                o1 = o0;
                                object0 = object2;
                                l0$h1 = l0$h0;
                            label_26:
                                l0$h0.a = object0;
                                if(l0$h1.a instanceof TransformStarted) {
                                    try {
                                        androidx.compose.foundation.gestures.TransformableKt.transformable.2.1.1 transformableKt$transformable$2$1$10 = new A3.o(this.o, null) {
                                            Object k;
                                            int l;
                                            private Object m;
                                            final h n;
                                            final l o;

                                            {
                                                this.n = l0$h0;
                                                this.o = l0;
                                                super(2, d0);
                                            }

                                            @m
                                            public final Object a(@y4.l TransformScope transformScope0, @m d d0) {
                                                return ((androidx.compose.foundation.gestures.TransformableKt.transformable.2.1.1)this.create(transformScope0, d0)).invokeSuspend(S0.a);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @y4.l
                                            public final d create(@m Object object0, @y4.l d d0) {
                                                d d1 = new androidx.compose.foundation.gestures.TransformableKt.transformable.2.1.1(this.n, this.o, d0);
                                                d1.m = object0;
                                                return d1;
                                            }

                                            @Override  // A3.o
                                            public Object invoke(Object object0, Object object1) {
                                                return this.a(((TransformScope)object0), ((d)object1));
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @m
                                            public final Object invokeSuspend(@y4.l Object object0) {
                                                h l0$h0;
                                                TransformScope transformScope0;
                                                Object object1 = b.l();
                                                switch(this.l) {
                                                    case 0: {
                                                        f0.n(object0);
                                                        transformScope0 = (TransformScope)this.m;
                                                        goto label_10;
                                                    }
                                                    case 1: {
                                                        l0$h0 = (h)this.k;
                                                        transformScope0 = (TransformScope)this.m;
                                                        f0.n(object0);
                                                        break;
                                                    }
                                                    default: {
                                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                    }
                                                }
                                                while(true) {
                                                    l0$h0.a = object0;
                                                label_10:
                                                    Object object2 = this.n.a;
                                                    if(object2 instanceof TransformStopped) {
                                                        break;
                                                    }
                                                    TransformDelta transformEvent$TransformDelta0 = object2 instanceof TransformDelta ? ((TransformDelta)object2) : null;
                                                    if(transformEvent$TransformDelta0 != null) {
                                                        transformScope0.a(transformEvent$TransformDelta0.c(), transformEvent$TransformDelta0.a(), transformEvent$TransformDelta0.b());
                                                    }
                                                    l0$h0 = this.n;
                                                    this.m = transformScope0;
                                                    this.k = l0$h0;
                                                    this.l = 1;
                                                    object0 = this.o.F(this);
                                                    if(object0 != object1) {
                                                        continue;
                                                    }
                                                    return object1;
                                                }
                                                return S0.a;
                                            }
                                        };
                                        this.n = o1;
                                        this.k = null;
                                        this.l = null;
                                        this.m = 2;
                                        if(this.p.a(MutatePriority.b, transformableKt$transformable$2$1$10, this) == object1) {
                                            return object1;
                                        }
                                    }
                                    catch(CancellationException unused_ex) {
                                    }
                                }
                                o0 = o1;
                            }
                            return S0.a;
                        }
                    };
                    EffectsKt.g(this.g, transformableKt$transformable$2$10, composer0, 0x40);
                }
                composer0.g0();
                composer0.V(0xE2A708A4);
                androidx.compose.foundation.gestures.TransformableKt.transformable.2.block.1.1 transformableKt$transformable$2$block$1$10 = composer0.W();
                if(transformableKt$transformable$2$block$1$10 == composer$Companion0.a()) {
                    transformableKt$transformable$2$block$1$10 = new A3.o(l0, null) {
                        int k;
                        private Object l;
                        final State m;
                        final l n;

                        {
                            this.m = state0;
                            this.n = l0;
                            super(2, d0);
                        }

                        @m
                        public final Object a(@y4.l PointerInputScope pointerInputScope0, @m d d0) {
                            return ((androidx.compose.foundation.gestures.TransformableKt.transformable.2.block.1.1)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @y4.l
                        public final d create(@m Object object0, @y4.l d d0) {
                            d d1 = new androidx.compose.foundation.gestures.TransformableKt.transformable.2.block.1.1(this.m, this.n, d0);
                            d1.l = object0;
                            return d1;
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.a(((PointerInputScope)object0), ((d)object1));
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@y4.l Object object0) {
                            Object object1 = b.l();
                            switch(this.k) {
                                case 0: {
                                    f0.n(object0);
                                    androidx.compose.foundation.gestures.TransformableKt.transformable.2.block.1.1.1 transformableKt$transformable$2$block$1$1$10 = new A3.o(this.m, this.n, null) {
                                        int k;
                                        private Object l;
                                        final PointerInputScope m;
                                        final State n;
                                        final l o;

                                        {
                                            this.m = pointerInputScope0;
                                            this.n = state0;
                                            this.o = l0;
                                            super(2, d0);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @y4.l
                                        public final d create(@m Object object0, @y4.l d d0) {
                                            d d1 = new androidx.compose.foundation.gestures.TransformableKt.transformable.2.block.1.1.1(this.m, this.n, this.o, d0);
                                            d1.l = object0;
                                            return d1;
                                        }

                                        @Override  // A3.o
                                        public Object invoke(Object object0, Object object1) {
                                            return this.invoke(((O)object0), ((d)object1));
                                        }

                                        @m
                                        public final Object invoke(@y4.l O o0, @m d d0) {
                                            return ((androidx.compose.foundation.gestures.TransformableKt.transformable.2.block.1.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @m
                                        public final Object invokeSuspend(@y4.l Object object0) {
                                            Object object1 = b.l();
                                            switch(this.k) {
                                                case 0: {
                                                    f0.n(object0);
                                                    androidx.compose.foundation.gestures.TransformableKt.transformable.2.block.1.1.1.1 transformableKt$transformable$2$block$1$1$1$10 = new A3.o(this.o, ((O)this.l), null) {
                                                        int l;
                                                        private Object m;
                                                        final State n;
                                                        final l o;
                                                        final O p;

                                                        {
                                                            this.n = state0;
                                                            this.o = l0;
                                                            this.p = o0;
                                                            super(2, d0);
                                                        }

                                                        @m
                                                        public final Object a(@y4.l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                                                            return ((androidx.compose.foundation.gestures.TransformableKt.transformable.2.block.1.1.1.1)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
                                                        }

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @y4.l
                                                        public final d create(@m Object object0, @y4.l d d0) {
                                                            d d1 = new androidx.compose.foundation.gestures.TransformableKt.transformable.2.block.1.1.1.1(this.n, this.o, this.p, d0);
                                                            d1.m = object0;
                                                            return d1;
                                                        }

                                                        @Override  // A3.o
                                                        public Object invoke(Object object0, Object object1) {
                                                            return this.a(((AwaitPointerEventScope)object0), ((d)object1));
                                                        }

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @m
                                                        public final Object invokeSuspend(@y4.l Object object0) {
                                                            Object object1 = b.l();
                                                            switch(this.l) {
                                                                case 0: {
                                                                    f0.n(object0);
                                                                    AwaitPointerEventScope awaitPointerEventScope0 = (AwaitPointerEventScope)this.m;
                                                                    try {
                                                                        try {
                                                                            this.l = 1;
                                                                            if(TransformableKt.b(awaitPointerEventScope0, this.n, this.o, this) == object1) {
                                                                                return object1;
                                                                            label_8:
                                                                                f0.n(object0);
                                                                            }
                                                                        }
                                                                        catch(CancellationException cancellationException0) {
                                                                            if(!P.k(this.p)) {
                                                                                throw cancellationException0;
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                    catch(Throwable throwable0) {
                                                                        this.o.l(TransformStopped.a);
                                                                        throw throwable0;
                                                                    }
                                                                }
                                                                case 1: {
                                                                    goto label_8;
                                                                }
                                                                default: {
                                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                                }
                                                            }
                                                            this.o.l(TransformStopped.a);
                                                            return S0.a;
                                                        }
                                                    };
                                                    this.k = 1;
                                                    return ForEachGestureKt.d(this.m, transformableKt$transformable$2$block$1$1$1$10, this) == object1 ? object1 : S0.a;
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
                                    this.k = 1;
                                    return P.g(transformableKt$transformable$2$block$1$1$10, this) == object1 ? object1 : S0.a;
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
                    composer0.O(transformableKt$transformable$2$block$1$10);
                }
                composer0.g0();
                Modifier modifier1 = this.f ? SuspendingPointerInputFilterKt.c(Modifier.m0, S0.a, transformableKt$transformable$2$block$1$10) : Modifier.m0;
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier1;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n1#1,170:1\n107#2,5:171\n*E\n"})
        public final class androidx.compose.foundation.gestures.TransformableKt.transformable..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final TransformableState e;
            final boolean f;
            final boolean g;

            public androidx.compose.foundation.gestures.TransformableKt.transformable..inlined.debugInspectorInfo.1(TransformableState transformableState0, boolean z, boolean z1) {
                this.e = transformableState0;
                this.f = z;
                this.g = z1;
                super(1);
            }

            public final void a(@y4.l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("transformable");
                inspectorInfo0.b().c("state", this.e);
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.f));
                inspectorInfo0.b().c("lockRotationOnZoomPan", Boolean.valueOf(this.g));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier d(Modifier modifier0, TransformableState transformableState0, boolean z, boolean z1, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            z1 = true;
        }
        return TransformableKt.c(modifier0, transformableState0, z, z1);
    }
}

