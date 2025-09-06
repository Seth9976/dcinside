package androidx.compose.foundation.gestures;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.DragInteraction.Cancel;
import androidx.compose.foundation.interaction.DragInteraction.Start;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Velocity;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.g;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.channels.G;
import y4.l;
import y4.m;

@s0({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 5 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,461:1\n25#2:462\n1114#3,6:463\n135#4:469\n658#5,18:470\n676#5,4:497\n680#5,58:508\n581#5,6:566\n615#5,4:572\n619#5,2:585\n621#5,8:594\n588#5,10:602\n116#6,2:488\n33#6,6:490\n118#6:496\n33#6,6:501\n118#6:507\n116#6,2:576\n33#6,6:578\n118#6:584\n33#6,6:587\n118#6:593\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n141#1:462\n141#1:463,6\n209#1:469\n334#1:470,18\n334#1:497,4\n334#1:508,58\n387#1:566,6\n387#1:572,4\n387#1:585,2\n387#1:594,8\n387#1:602,10\n334#1:488,2\n334#1:490,6\n334#1:496\n334#1:501,6\n334#1:507\n387#1:576,2\n387#1:578,6\n387#1:584\n387#1:587,6\n387#1:593\n*E\n"})
public final class DraggableKt {
    @l
    public static final DraggableState a(@l Function1 function10) {
        L.p(function10, "onDelta");
        return new DefaultDraggableState(function10);
    }

    private static final Object g(AwaitPointerEventScope awaitPointerEventScope0, State state0, State state1, VelocityTracker velocityTracker0, Orientation orientation0, d d0) {
        long v15;
        Object object4;
        o o3;
        AwaitPointerEventScope awaitPointerEventScope6;
        int v10;
        Object object3;
        float f5;
        g l0$g3;
        AwaitPointerEventScope awaitPointerEventScope2;
        float f4;
        androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop.1 draggableKt$awaitDownAndSlop$11;
        g l0$g2;
        o o1;
        PointerDirectionConfig pointerDirectionConfig1;
        int v2;
        float f3;
        PointerInputChange pointerInputChange0;
        float f9;
        int v4;
        o o2;
        AwaitPointerEventScope awaitPointerEventScope3;
        g l0$g4;
        float f8;
        AwaitPointerEventScope awaitPointerEventScope4;
        VelocityTracker velocityTracker1;
        Orientation orientation1;
        State state4;
        VelocityTracker velocityTracker3;
        Orientation orientation3;
        State state2;
        androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop.1 draggableKt$awaitDownAndSlop$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop.1) {
            draggableKt$awaitDownAndSlop$10 = (androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop.1)d0;
            int v = draggableKt$awaitDownAndSlop$10.v;
            if((v & 0x80000000) == 0) {
                draggableKt$awaitDownAndSlop$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    Object p;
                    int q;
                    float r;
                    float s;
                    float t;
                    Object u;
                    int v;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.u = object0;
                        this.v |= 0x80000000;
                        return DraggableKt.g(null, null, null, null, null, this);
                    }
                };
            }
            else {
                draggableKt$awaitDownAndSlop$10.v = v ^ 0x80000000;
            }
        }
        else {
            draggableKt$awaitDownAndSlop$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                Object p;
                int q;
                float r;
                float s;
                float t;
                Object u;
                int v;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.u = object0;
                    this.v |= 0x80000000;
                    return DraggableKt.g(null, null, null, null, null, this);
                }
            };
        }
        Object object0 = draggableKt$awaitDownAndSlop$10.u;
        Object object1 = b.l();
        switch(draggableKt$awaitDownAndSlop$10.v) {
            case 0: {
                f0.n(object0);
                draggableKt$awaitDownAndSlop$10.k = awaitPointerEventScope0;
                state4 = state0;
                draggableKt$awaitDownAndSlop$10.l = state4;
                state2 = state1;
                draggableKt$awaitDownAndSlop$10.m = state2;
                velocityTracker3 = velocityTracker0;
                draggableKt$awaitDownAndSlop$10.n = velocityTracker3;
                orientation3 = orientation0;
                draggableKt$awaitDownAndSlop$10.o = orientation3;
                draggableKt$awaitDownAndSlop$10.v = 1;
                object0 = TapGestureDetectorKt.d(awaitPointerEventScope0, false, PointerEventPass.a, draggableKt$awaitDownAndSlop$10);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                Orientation orientation2 = (Orientation)draggableKt$awaitDownAndSlop$10.o;
                VelocityTracker velocityTracker2 = (VelocityTracker)draggableKt$awaitDownAndSlop$10.n;
                state2 = (State)draggableKt$awaitDownAndSlop$10.m;
                State state3 = (State)draggableKt$awaitDownAndSlop$10.l;
                AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope)draggableKt$awaitDownAndSlop$10.k;
                f0.n(object0);
                orientation3 = orientation2;
                awaitPointerEventScope0 = awaitPointerEventScope5;
                velocityTracker3 = velocityTracker2;
                state4 = state3;
                break;
            }
            case 2: {
                orientation1 = (Orientation)draggableKt$awaitDownAndSlop$10.m;
                velocityTracker1 = (VelocityTracker)draggableKt$awaitDownAndSlop$10.l;
                awaitPointerEventScope4 = (AwaitPointerEventScope)draggableKt$awaitDownAndSlop$10.k;
                f0.n(object0);
                goto label_99;
            }
            case 3: {
                float f6 = draggableKt$awaitDownAndSlop$10.t;
                float f7 = draggableKt$awaitDownAndSlop$10.s;
                f8 = draggableKt$awaitDownAndSlop$10.r;
                int v3 = draggableKt$awaitDownAndSlop$10.q;
                l0$g4 = (g)draggableKt$awaitDownAndSlop$10.o;
                PointerDirectionConfig pointerDirectionConfig2 = (PointerDirectionConfig)draggableKt$awaitDownAndSlop$10.n;
                awaitPointerEventScope3 = (AwaitPointerEventScope)draggableKt$awaitDownAndSlop$10.m;
                o2 = (o)draggableKt$awaitDownAndSlop$10.l;
                g l0$g5 = (g)draggableKt$awaitDownAndSlop$10.k;
                f0.n(object0);
                v4 = v3;
                f5 = f7;
                draggableKt$awaitDownAndSlop$11 = draggableKt$awaitDownAndSlop$10;
                f9 = f6;
                pointerDirectionConfig1 = pointerDirectionConfig2;
                l0$g3 = l0$g5;
                goto label_142;
            }
            case 4: {
                float f = draggableKt$awaitDownAndSlop$10.t;
                float f1 = draggableKt$awaitDownAndSlop$10.s;
                float f2 = draggableKt$awaitDownAndSlop$10.r;
                int v1 = draggableKt$awaitDownAndSlop$10.q;
                pointerInputChange0 = (PointerInputChange)draggableKt$awaitDownAndSlop$10.p;
                g l0$g0 = (g)draggableKt$awaitDownAndSlop$10.o;
                PointerDirectionConfig pointerDirectionConfig0 = (PointerDirectionConfig)draggableKt$awaitDownAndSlop$10.n;
                AwaitPointerEventScope awaitPointerEventScope1 = (AwaitPointerEventScope)draggableKt$awaitDownAndSlop$10.m;
                o o0 = (o)draggableKt$awaitDownAndSlop$10.l;
                g l0$g1 = (g)draggableKt$awaitDownAndSlop$10.k;
                f0.n(object0);
                f3 = f;
                v2 = v1;
                pointerDirectionConfig1 = pointerDirectionConfig0;
                o1 = o0;
                l0$g2 = l0$g0;
                draggableKt$awaitDownAndSlop$11 = draggableKt$awaitDownAndSlop$10;
                f4 = f2;
                awaitPointerEventScope2 = awaitPointerEventScope1;
                l0$g3 = l0$g1;
                f5 = f1;
                goto label_215;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Boolean)((Function1)state4.getValue()).invoke(((PointerInputChange)object0))).booleanValue()) {
            if(((Boolean)((a)state2.getValue()).invoke()).booleanValue()) {
                ((PointerInputChange)object0).a();
                VelocityTrackerKt.c(velocityTracker3, ((PointerInputChange)object0));
                return r0.a(((PointerInputChange)object0), Offset.d(0L));
            }
            draggableKt$awaitDownAndSlop$10.k = awaitPointerEventScope0;
            draggableKt$awaitDownAndSlop$10.l = velocityTracker3;
            draggableKt$awaitDownAndSlop$10.m = orientation3;
            draggableKt$awaitDownAndSlop$10.n = null;
            draggableKt$awaitDownAndSlop$10.o = null;
            draggableKt$awaitDownAndSlop$10.v = 2;
            object0 = TapGestureDetectorKt.f(awaitPointerEventScope0, false, null, draggableKt$awaitDownAndSlop$10, 2, null);
            if(object0 == object1) {
                return object1;
            }
            awaitPointerEventScope4 = awaitPointerEventScope0;
            velocityTracker1 = velocityTracker3;
            orientation1 = orientation3;
        label_99:
            VelocityTrackerKt.c(velocityTracker1, ((PointerInputChange)object0));
            g l0$g6 = new g();
            l0$g6.a = 0L;
            androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop.postPointerSlop.1 draggableKt$awaitDownAndSlop$postPointerSlop$10 = new o(velocityTracker1, l0$g6) {
                final VelocityTracker e;
                final g f;

                {
                    this.e = velocityTracker0;
                    this.f = l0$g0;
                    super(2);
                }

                public final void a(@l PointerInputChange pointerInputChange0, long v) {
                    L.p(pointerInputChange0, "event");
                    VelocityTrackerKt.c(this.e, pointerInputChange0);
                    pointerInputChange0.a();
                    this.f.a = v;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((PointerInputChange)object0), ((Offset)object1).A());
                    return S0.a;
                }
            };
            long v5 = ((PointerInputChange)object0).p();
            int v6 = ((PointerInputChange)object0).y();
            pointerDirectionConfig1 = DragGestureDetectorKt.E(orientation1);
            if(!DragGestureDetectorKt.C(awaitPointerEventScope4.m1(), v5)) {
                float f10 = DragGestureDetectorKt.D(awaitPointerEventScope4.getViewConfiguration(), v6);
                g l0$g7 = new g();
                l0$g7.a = v5;
                l0$g3 = l0$g6;
                o1 = draggableKt$awaitDownAndSlop$postPointerSlop$10;
                f5 = 0.0f;
                int v7 = 1;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                l0$g2 = l0$g7;
                draggableKt$awaitDownAndSlop$11 = draggableKt$awaitDownAndSlop$10;
                f4 = f10;
                f3 = 0.0f;
                while(true) {
                    draggableKt$awaitDownAndSlop$11.k = l0$g3;
                    draggableKt$awaitDownAndSlop$11.l = o1;
                    draggableKt$awaitDownAndSlop$11.m = awaitPointerEventScope2;
                    draggableKt$awaitDownAndSlop$11.n = pointerDirectionConfig1;
                    draggableKt$awaitDownAndSlop$11.o = l0$g2;
                    draggableKt$awaitDownAndSlop$11.p = null;
                    draggableKt$awaitDownAndSlop$11.q = v7;
                    draggableKt$awaitDownAndSlop$11.r = f4;
                    draggableKt$awaitDownAndSlop$11.s = f5;
                    draggableKt$awaitDownAndSlop$11.t = f3;
                    draggableKt$awaitDownAndSlop$11.v = 3;
                    Object object2 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope2, null, draggableKt$awaitDownAndSlop$11, 1, null);
                    if(object2 == object1) {
                        return object1;
                    }
                    f9 = f3;
                    object0 = object2;
                    v4 = v7;
                    o2 = o1;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    l0$g4 = l0$g2;
                    f8 = f4;
                label_142:
                    List list0 = ((PointerEvent)object0).e();
                    int v8 = list0.size();
                    int v9 = 0;
                    while(true) {
                        if(v9 < v8) {
                            object3 = list0.get(v9);
                            v10 = v4;
                            awaitPointerEventScope6 = awaitPointerEventScope3;
                            o3 = o2;
                            if(PointerId.d(((PointerInputChange)object3).p(), l0$g4.a)) {
                                break;
                            }
                            else {
                                ++v9;
                                v4 = v10;
                                o2 = o3;
                                awaitPointerEventScope3 = awaitPointerEventScope6;
                                continue;
                            }
                        }
                        awaitPointerEventScope6 = awaitPointerEventScope3;
                        o3 = o2;
                        v10 = v4;
                        object3 = null;
                        break;
                    }
                    pointerInputChange0 = (PointerInputChange)object3;
                    if(pointerInputChange0 == null) {
                        l0$g6 = l0$g3;
                        pointerInputChange0 = null;
                        return pointerInputChange0 != null ? r0.a(pointerInputChange0, Offset.d(l0$g6.a)) : null;
                    }
                    else if(pointerInputChange0.A()) {
                        break;
                    }
                    else if(PointerEventKt.e(pointerInputChange0)) {
                        List list1 = ((PointerEvent)object0).e();
                        int v11 = list1.size();
                        int v12 = 0;
                        while(true) {
                            object4 = null;
                            if(v12 < v11) {
                                Object object5 = list1.get(v12);
                                if(((PointerInputChange)object5).r()) {
                                    object4 = object5;
                                }
                                else {
                                    ++v12;
                                    continue;
                                }
                            }
                            break;
                        }
                        if(((PointerInputChange)object4) == null) {
                            l0$g6 = l0$g3;
                            pointerInputChange0 = null;
                        }
                        else {
                            l0$g4.a = ((PointerInputChange)object4).p();
                            v7 = v10;
                            o1 = o3;
                            f3 = f9;
                            f4 = f8;
                            l0$g2 = l0$g4;
                            awaitPointerEventScope2 = awaitPointerEventScope6;
                            continue;
                        }
                    }
                    else {
                        long v13 = pointerInputChange0.q();
                        long v14 = pointerInputChange0.u();
                        float f11 = pointerDirectionConfig1.a(v13) - pointerDirectionConfig1.a(v14) + f5;
                        float f12 = f9 + (pointerDirectionConfig1.c(v13) - pointerDirectionConfig1.c(v14));
                        float f13 = v10 == 0 ? Offset.m(pointerDirectionConfig1.b(f11, f12)) : Math.abs(f11);
                        if(f13 < f8) {
                            draggableKt$awaitDownAndSlop$11.k = l0$g3;
                            o1 = o3;
                            draggableKt$awaitDownAndSlop$11.l = o1;
                            draggableKt$awaitDownAndSlop$11.m = awaitPointerEventScope6;
                            draggableKt$awaitDownAndSlop$11.n = pointerDirectionConfig1;
                            draggableKt$awaitDownAndSlop$11.o = l0$g4;
                            draggableKt$awaitDownAndSlop$11.p = pointerInputChange0;
                            v2 = v10;
                            draggableKt$awaitDownAndSlop$11.q = v2;
                            draggableKt$awaitDownAndSlop$11.r = f8;
                            draggableKt$awaitDownAndSlop$11.s = f11;
                            draggableKt$awaitDownAndSlop$11.t = f12;
                            draggableKt$awaitDownAndSlop$11.v = 4;
                            if(awaitPointerEventScope6.l1(PointerEventPass.c, draggableKt$awaitDownAndSlop$11) == object1) {
                                return object1;
                            }
                            f5 = f11;
                            f3 = f12;
                            f4 = f8;
                            l0$g2 = l0$g4;
                            awaitPointerEventScope2 = awaitPointerEventScope6;
                        label_215:
                            if(pointerInputChange0.A()) {
                                l0$g6 = l0$g3;
                                pointerInputChange0 = null;
                            }
                            else {
                                v7 = v2;
                                continue;
                            }
                        }
                        else {
                            o1 = o3;
                            if(v10 == 0) {
                                long v16 = pointerDirectionConfig1.b(f11, f12);
                                v15 = Offset.u(v16, Offset.x(Offset.j(v16, f13), f8));
                            }
                            else {
                                v15 = pointerDirectionConfig1.b(f11 - Math.signum(f11) * f8, f12);
                            }
                            o1.invoke(pointerInputChange0, Offset.d(v15));
                            if(pointerInputChange0.A()) {
                                l0$g6 = l0$g3;
                            }
                            else {
                                f4 = f8;
                                l0$g2 = l0$g4;
                                awaitPointerEventScope2 = awaitPointerEventScope6;
                                v7 = v10;
                                f3 = 0.0f;
                                f5 = 0.0f;
                                continue;
                            }
                        }
                    }
                    return pointerInputChange0 != null ? r0.a(pointerInputChange0, Offset.d(l0$g6.a)) : null;
                }
                l0$g6 = l0$g3;
                pointerInputChange0 = null;
                return pointerInputChange0 != null ? r0.a(pointerInputChange0, Offset.d(l0$g6.a)) : null;
            }
            pointerInputChange0 = null;
            return pointerInputChange0 != null ? r0.a(pointerInputChange0, Offset.d(l0$g6.a)) : null;
        }
        return null;
    }

    private static final Object h(AwaitPointerEventScope awaitPointerEventScope0, PointerInputChange pointerInputChange0, long v, VelocityTracker velocityTracker0, G g0, boolean z, Orientation orientation0, d d0) {
        float f = Math.signum(Offset.p(pointerInputChange0.q()));
        float f1 = Math.signum(Offset.r(pointerInputChange0.q()));
        g0.l(new DragStarted(Offset.u(pointerInputChange0.q(), OffsetKt.a(Offset.p(v) * f, Offset.r(v) * f1)), null));
        g0.l(new DragDelta((z ? Offset.x(v, -1.0f) : v), null));
        return DraggableKt.m(awaitPointerEventScope0, orientation0, pointerInputChange0.p(), new Function1(velocityTracker0, g0, z) {
            final VelocityTracker e;
            final G f;
            final boolean g;

            {
                this.e = velocityTracker0;
                this.f = g0;
                this.g = z;
                super(1);
            }

            public final void a(@l PointerInputChange pointerInputChange0) {
                L.p(pointerInputChange0, "event");
                VelocityTrackerKt.c(this.e, pointerInputChange0);
                if(!PointerEventKt.e(pointerInputChange0)) {
                    long v = PointerEventKt.k(pointerInputChange0);
                    pointerInputChange0.a();
                    G g0 = this.f;
                    if(this.g) {
                        v = Offset.x(v, -1.0f);
                    }
                    g0.l(new DragDelta(v, null));
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PointerInputChange)object0));
                return S0.a;
            }
        }, d0);
    }

    @l
    public static final Modifier i(@l Modifier modifier0, @l DraggableState draggableState0, @l Orientation orientation0, boolean z, @m MutableInteractionSource mutableInteractionSource0, boolean z1, @l p p0, @l p p1, boolean z2) {
        L.p(modifier0, "<this>");
        L.p(draggableState0, "state");
        L.p(orientation0, "orientation");
        L.p(p0, "onDragStarted");
        L.p(p1, "onDragStopped");
        androidx.compose.foundation.gestures.DraggableKt.draggable.4 draggableKt$draggable$40 = new a(z1) {
            final boolean e;

            {
                this.e = z;
                super(0);
            }

            @l
            public final Boolean b() {
                return Boolean.valueOf(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        androidx.compose.foundation.gestures.DraggableKt.draggable.5 draggableKt$draggable$50 = new p(p1, orientation0, null) {
            int k;
            private Object l;
            long m;
            final p n;
            final Orientation o;

            {
                this.n = p0;
                this.o = orientation0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, long v, @m d d0) {
                androidx.compose.foundation.gestures.DraggableKt.draggable.5 draggableKt$draggable$50 = new androidx.compose.foundation.gestures.DraggableKt.draggable.5(this.n, this.o, d0);
                draggableKt$draggable$50.l = o0;
                draggableKt$draggable$50.m = v;
                return draggableKt$draggable$50.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((Velocity)object1).v(), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        Float float0 = kotlin.coroutines.jvm.internal.b.e(DraggableKt.p(this.m, this.o));
                        this.k = 1;
                        return this.n.invoke(o0, float0, this) == object1 ? object1 : S0.a;
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
        return DraggableKt.j(modifier0, draggableState0, androidx.compose.foundation.gestures.DraggableKt.draggable.3.e, orientation0, z, mutableInteractionSource0, draggableKt$draggable$40, p0, draggableKt$draggable$50, z2);

        final class androidx.compose.foundation.gestures.DraggableKt.draggable.3 extends N implements Function1 {
            public static final androidx.compose.foundation.gestures.DraggableKt.draggable.3 e;

            static {
                androidx.compose.foundation.gestures.DraggableKt.draggable.3.e = new androidx.compose.foundation.gestures.DraggableKt.draggable.3();
            }

            androidx.compose.foundation.gestures.DraggableKt.draggable.3() {
                super(1);
            }

            @l
            public final Boolean a(@l PointerInputChange pointerInputChange0) {
                L.p(pointerInputChange0, "it");
                return true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((PointerInputChange)object0));
            }
        }

    }

    @l
    public static final Modifier j(@l Modifier modifier0, @l DraggableState draggableState0, @l Function1 function10, @l Orientation orientation0, boolean z, @m MutableInteractionSource mutableInteractionSource0, @l a a0, @l p p0, @l p p1, boolean z1) {
        L.p(modifier0, "<this>");
        L.p(draggableState0, "state");
        L.p(function10, "canDrag");
        L.p(orientation0, "orientation");
        L.p(a0, "startDragImmediately");
        L.p(p0, "onDragStarted");
        L.p(p1, "onDragStopped");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(mutableInteractionSource0, a0, function10, p0, p1, draggableState0, orientation0, z, z1) {
            final MutableInteractionSource e;
            final a f;
            final Function1 g;
            final p h;
            final p i;
            final DraggableState j;
            final Orientation k;
            final boolean l;
            final boolean m;

            {
                this.e = mutableInteractionSource0;
                this.f = a0;
                this.g = function10;
                this.h = p0;
                this.i = p1;
                this.j = draggableState0;
                this.k = orientation0;
                this.l = z;
                this.m = z1;
                super(3);
            }

            @Composable
            @l
            public final Modifier b(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(597193710);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(597193710, v, -1, "androidx.compose.foundation.gestures.draggable.<anonymous> (Draggable.kt:220)");
                }
                composer0.V(0xE2A708A4);
                MutableState mutableState0 = composer0.W();
                Companion composer$Companion0 = Composer.a;
                if(mutableState0 == composer$Companion0.a()) {
                    mutableState0 = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
                    composer0.O(mutableState0);
                }
                composer0.g0();
                MutableInteractionSource mutableInteractionSource0 = this.e;
                composer0.V(0x1E7B2B64);
                boolean z = composer0.t(mutableState0);
                boolean z1 = composer0.t(mutableInteractionSource0);
                androidx.compose.foundation.gestures.DraggableKt.draggable.9.1.1 draggableKt$draggable$9$1$10 = composer0.W();
                if(z || z1 || draggableKt$draggable$9$1$10 == composer$Companion0.a()) {
                    draggableKt$draggable$9$1$10 = new Function1(mutableInteractionSource0) {
                        final MutableState e;
                        final MutableInteractionSource f;

                        {
                            this.e = mutableState0;
                            this.f = mutableInteractionSource0;
                            super(1);
                        }

                        @l
                        public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                            L.p(disposableEffectScope0, "$this$DisposableEffect");
                            return new DisposableEffectResult() {
                                @Override  // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    Start dragInteraction$Start0 = (Start)this.f.getValue();
                                    if(dragInteraction$Start0 != null) {
                                        MutableInteractionSource mutableInteractionSource0 = this.b;
                                        if(mutableInteractionSource0 != null) {
                                            mutableInteractionSource0.a(new Cancel(dragInteraction$Start0));
                                        }
                                        this.f.setValue(null);
                                    }
                                }
                            };
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((DisposableEffectScope)object0));
                        }
                    };
                    composer0.O(draggableKt$draggable$9$1$10);
                }
                composer0.g0();
                EffectsKt.c(mutableInteractionSource0, draggableKt$draggable$9$1$10, composer0, 0);
                composer0.V(0xE2A708A4);
                kotlinx.coroutines.channels.l l0 = composer0.W();
                if(l0 == composer$Companion0.a()) {
                    l0 = kotlinx.coroutines.channels.o.d(0x7FFFFFFF, null, null, 6, null);
                    composer0.O(l0);
                }
                composer0.g0();
                State state0 = SnapshotStateKt.t(this.f, composer0, 0);
                State state1 = SnapshotStateKt.t(this.g, composer0, 0);
                State state2 = SnapshotStateKt.t(new DragLogic(this.h, this.i, mutableState0, this.e), composer0, 8);
                androidx.compose.foundation.gestures.DraggableKt.draggable.9.2 draggableKt$draggable$9$20 = new o(this.j, state2, this.k, null) {
                    Object k;
                    Object l;
                    int m;
                    private Object n;
                    final kotlinx.coroutines.channels.l o;
                    final DraggableState p;
                    final State q;
                    final Orientation r;

                    {
                        this.o = l0;
                        this.p = draggableState0;
                        this.q = state0;
                        this.r = orientation0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new androidx.compose.foundation.gestures.DraggableKt.draggable.9.2(this.o, this.p, this.q, this.r, d0);
                        d1.n = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((androidx.compose.foundation.gestures.DraggableKt.draggable.9.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        O o3;
                        O o2;
                        h l0$h2;
                        O o1;
                        h l0$h1;
                        h l0$h0;
                        O o0;
                        Object object1 = b.l();
                        switch(this.m) {
                            case 0: {
                                f0.n(object0);
                                o0 = (O)this.n;
                                goto label_28;
                            }
                            case 1: {
                                l0$h0 = (h)this.l;
                                l0$h1 = (h)this.k;
                                o1 = (O)this.n;
                                f0.n(object0);
                                goto label_40;
                            }
                            case 2: {
                                l0$h2 = (h)this.k;
                                o2 = (O)this.n;
                                f0.n(object0);
                                goto label_55;
                            }
                            case 3: {
                                l0$h2 = (h)this.k;
                                o2 = (O)this.n;
                                try {
                                    f0.n(object0);
                                    goto label_61;
                                }
                                catch(CancellationException unused_ex) {
                                    goto label_77;
                                }
                            }
                            case 4: {
                                o3 = (O)this.n;
                                goto label_22;
                            }
                            case 5: {
                                o3 = (O)this.n;
                                try {
                                label_22:
                                    f0.n(object0);
                                    break;
                                }
                                catch(CancellationException unused_ex) {
                                    goto label_78;
                                }
                            }
                            case 6: {
                                o3 = (O)this.n;
                                f0.n(object0);
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        while(true) {
                            try {
                            label_27:
                                o0 = o3;
                            }
                            catch(CancellationException unused_ex) {
                                goto label_77;
                            }
                        label_28:
                            if(!P.k(o0)) {
                                return S0.a;
                            }
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
                        label_40:
                            l0$h0.a = object0;
                            if(!(l0$h1.a instanceof DragStarted)) {
                                o0 = o1;
                                goto label_28;
                            }
                            DragLogic dragLogic0 = androidx.compose.foundation.gestures.DraggableKt.draggable.9.c(this.q);
                            Object object3 = l0$h1.a;
                            L.n(object3, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStarted");
                            this.n = o1;
                            this.k = l0$h1;
                            this.l = null;
                            this.m = 2;
                            if(dragLogic0.f(o1, ((DragStarted)object3), this) == object1) {
                                return object1;
                            }
                            l0$h2 = l0$h1;
                            o2 = o1;
                            try {
                            label_55:
                                androidx.compose.foundation.gestures.DraggableKt.draggable.9.2.2 draggableKt$draggable$9$2$20 = new o(this.o, this.r, null) {
                                    Object k;
                                    int l;
                                    private Object m;
                                    final h n;
                                    final kotlinx.coroutines.channels.l o;
                                    final Orientation p;

                                    {
                                        this.n = l0$h0;
                                        this.o = l0;
                                        this.p = orientation0;
                                        super(2, d0);
                                    }

                                    @m
                                    public final Object a(@l DragScope dragScope0, @m d d0) {
                                        return ((androidx.compose.foundation.gestures.DraggableKt.draggable.9.2.2)this.create(dragScope0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        d d1 = new androidx.compose.foundation.gestures.DraggableKt.draggable.9.2.2(this.n, this.o, this.p, d0);
                                        d1.m = object0;
                                        return d1;
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.a(((DragScope)object0), ((d)object1));
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        h l0$h0;
                                        DragScope dragScope0;
                                        Object object1 = b.l();
                                        switch(this.l) {
                                            case 0: {
                                                f0.n(object0);
                                                dragScope0 = (DragScope)this.m;
                                                goto label_10;
                                            }
                                            case 1: {
                                                l0$h0 = (h)this.k;
                                                dragScope0 = (DragScope)this.m;
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
                                            if(object2 instanceof DragStopped || object2 instanceof DragCancelled) {
                                                break;
                                            }
                                            DragDelta dragEvent$DragDelta0 = object2 instanceof DragDelta ? ((DragDelta)object2) : null;
                                            if(dragEvent$DragDelta0 != null) {
                                                dragScope0.a(DraggableKt.o(dragEvent$DragDelta0.a(), this.p));
                                            }
                                            l0$h0 = this.n;
                                            this.m = dragScope0;
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
                                this.n = o2;
                                this.k = l0$h2;
                                this.m = 3;
                                if(this.p.c(MutatePriority.b, draggableKt$draggable$9$2$20, this) == object1) {
                                    return object1;
                                }
                            label_61:
                                DragLogic dragLogic1 = androidx.compose.foundation.gestures.DraggableKt.draggable.9.c(this.q);
                                Object object4 = l0$h2.a;
                                if(object4 instanceof DragStopped) {
                                    L.n(object4, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                                    this.n = o2;
                                    this.k = null;
                                    this.m = 4;
                                    if(dragLogic1.g(o2, ((DragStopped)object4), this) == object1) {
                                        return object1;
                                    }
                                }
                                else if(object4 instanceof DragCancelled) {
                                    this.n = o2;
                                    this.k = null;
                                    this.m = 5;
                                    if(dragLogic1.e(o2, this) != object1) {
                                        o3 = o2;
                                        goto label_27;
                                    }
                                    return object1;
                                }
                                else {
                                    o0 = o2;
                                    goto label_28;
                                }
                                o3 = o2;
                                goto label_27;
                            }
                            catch(CancellationException unused_ex) {
                            label_77:
                                o3 = o2;
                            }
                        label_78:
                            DragLogic dragLogic2 = androidx.compose.foundation.gestures.DraggableKt.draggable.9.c(this.q);
                            this.n = o3;
                            this.k = null;
                            this.m = 6;
                            if(dragLogic2.e(o3, this) != object1) {
                                goto label_27;
                            }
                            break;
                        }
                        return object1;
                    }
                };
                EffectsKt.g(this.j, draggableKt$draggable$9$20, composer0, 0x40);
                androidx.compose.foundation.gestures.DraggableKt.draggable.9.3 draggableKt$draggable$9$30 = new o(state1, state0, this.k, l0, this.m, null) {
                    int k;
                    private Object l;
                    final boolean m;
                    final State n;
                    final State o;
                    final Orientation p;
                    final kotlinx.coroutines.channels.l q;
                    final boolean r;

                    {
                        this.m = z;
                        this.n = state0;
                        this.o = state1;
                        this.p = orientation0;
                        this.q = l0;
                        this.r = z1;
                        super(2, d0);
                    }

                    @m
                    public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                        return ((androidx.compose.foundation.gestures.DraggableKt.draggable.9.3)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new androidx.compose.foundation.gestures.DraggableKt.draggable.9.3(this.m, this.n, this.o, this.p, this.q, this.r, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((PointerInputScope)object0), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                PointerInputScope pointerInputScope0 = (PointerInputScope)this.l;
                                if(!this.m) {
                                    return S0.a;
                                }
                                androidx.compose.foundation.gestures.DraggableKt.draggable.9.3.1 draggableKt$draggable$9$3$10 = new o(this.n, this.o, this.p, this.q, this.r, null) {
                                    int k;
                                    private Object l;
                                    final PointerInputScope m;
                                    final State n;
                                    final State o;
                                    final Orientation p;
                                    final kotlinx.coroutines.channels.l q;
                                    final boolean r;

                                    {
                                        this.m = pointerInputScope0;
                                        this.n = state0;
                                        this.o = state1;
                                        this.p = orientation0;
                                        this.q = l0;
                                        this.r = z;
                                        super(2, d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        d d1 = new androidx.compose.foundation.gestures.DraggableKt.draggable.9.3.1(this.m, this.n, this.o, this.p, this.q, this.r, d0);
                                        d1.l = object0;
                                        return d1;
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((O)object0), ((d)object1));
                                    }

                                    @m
                                    public final Object invoke(@l O o0, @m d d0) {
                                        return ((androidx.compose.foundation.gestures.DraggableKt.draggable.9.3.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        O o0;
                                        Object object1 = b.l();
                                        switch(this.k) {
                                            case 0: {
                                                f0.n(object0);
                                                O o1 = (O)this.l;
                                                try {
                                                    androidx.compose.foundation.gestures.DraggableKt.draggable.9.3.1.1 draggableKt$draggable$9$3$1$10 = new o(this.n, this.o, this.p, this.q, this.r, null) {
                                                        Object l;
                                                        Object m;
                                                        Object n;
                                                        boolean o;
                                                        int p;
                                                        int q;
                                                        private Object r;
                                                        final O s;
                                                        final State t;
                                                        final State u;
                                                        final Orientation v;
                                                        final kotlinx.coroutines.channels.l w;
                                                        final boolean x;

                                                        {
                                                            this.s = o0;
                                                            this.t = state0;
                                                            this.u = state1;
                                                            this.v = orientation0;
                                                            this.w = l0;
                                                            this.x = z;
                                                            super(2, d0);
                                                        }

                                                        @m
                                                        public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                                                            return ((androidx.compose.foundation.gestures.DraggableKt.draggable.9.3.1.1)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
                                                        }

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @l
                                                        public final d create(@m Object object0, @l d d0) {
                                                            d d1 = new androidx.compose.foundation.gestures.DraggableKt.draggable.9.3.1.1(this.s, this.t, this.u, this.v, this.w, this.x, d0);
                                                            d1.r = object0;
                                                            return d1;
                                                        }

                                                        @Override  // A3.o
                                                        public Object invoke(Object object0, Object object1) {
                                                            return this.a(((AwaitPointerEventScope)object0), ((d)object1));
                                                        }

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @m
                                                        public final Object invokeSuspend(@l Object object0) {
                                                            DragStopped dragEvent$DragStopped1;
                                                            AwaitPointerEventScope awaitPointerEventScope4;
                                                            O o2;
                                                            long v3;
                                                            VelocityTracker velocityTracker4;
                                                            kotlinx.coroutines.channels.l l2;
                                                            boolean z2;
                                                            PointerInputChange pointerInputChange0;
                                                            O o1;
                                                            boolean z1;
                                                            kotlinx.coroutines.channels.l l1;
                                                            Object object5;
                                                            Object object4;
                                                            AwaitPointerEventScope awaitPointerEventScope3;
                                                            VelocityTracker velocityTracker2;
                                                            kotlinx.coroutines.channels.l l0;
                                                            O o0;
                                                            boolean z;
                                                            int v1;
                                                            Object object3;
                                                            AwaitPointerEventScope awaitPointerEventScope2;
                                                            VelocityTracker velocityTracker1;
                                                            AwaitPointerEventScope awaitPointerEventScope0;
                                                            Object object1 = b.l();
                                                            float f = -1.0f;
                                                            int v = 0;
                                                            Object object2 = null;
                                                            switch(this.q) {
                                                                case 0: {
                                                                    f0.n(object0);
                                                                    awaitPointerEventScope0 = (AwaitPointerEventScope)this.r;
                                                                    goto label_42;
                                                                }
                                                                case 1: {
                                                                    VelocityTracker velocityTracker0 = (VelocityTracker)this.l;
                                                                    AwaitPointerEventScope awaitPointerEventScope1 = (AwaitPointerEventScope)this.r;
                                                                    f0.n(object0);
                                                                    velocityTracker1 = velocityTracker0;
                                                                    awaitPointerEventScope2 = awaitPointerEventScope1;
                                                                    object3 = object0;
                                                                    goto label_54;
                                                                }
                                                                case 2: {
                                                                    v1 = this.p;
                                                                    z = this.o;
                                                                    o0 = (O)this.n;
                                                                    l0 = (kotlinx.coroutines.channels.l)this.m;
                                                                    velocityTracker2 = (VelocityTracker)this.l;
                                                                    awaitPointerEventScope3 = (AwaitPointerEventScope)this.r;
                                                                    try {
                                                                        object4 = null;
                                                                        f0.n(object0);
                                                                        object5 = object0;
                                                                        break;
                                                                    }
                                                                    catch(CancellationException cancellationException0) {
                                                                        goto label_97;
                                                                    }
                                                                    catch(Throwable throwable0) {
                                                                    }
                                                                    v = v1;
                                                                    goto label_107;
                                                                }
                                                                default: {
                                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                                }
                                                            }
                                                        alab1:
                                                            while(true) {
                                                                try {
                                                                    if(((Boolean)object5).booleanValue()) {
                                                                        goto label_36;
                                                                    }
                                                                    else {
                                                                        goto label_38;
                                                                    }
                                                                    goto label_39;
                                                                }
                                                                catch(CancellationException cancellationException0) {
                                                                    goto label_97;
                                                                }
                                                                catch(Throwable throwable0) {
                                                                    v = v1;
                                                                    goto label_107;
                                                                }
                                                            label_36:
                                                                DragStopped dragEvent$DragStopped0 = new DragStopped(Velocity.s(velocityTracker2.b(), (z ? -1.0f : 1.0f)), ((w)object4));
                                                                goto label_39;
                                                            label_38:
                                                                dragEvent$DragStopped0 = DragCancelled.a;
                                                            label_39:
                                                                l0.l(dragEvent$DragStopped0);
                                                            alab2:
                                                                while(true) {
                                                                    awaitPointerEventScope0 = awaitPointerEventScope3;
                                                                    object2 = object4;
                                                                    while(true) {
                                                                    label_42:
                                                                        if(!P.k(this.s)) {
                                                                            break alab1;
                                                                        }
                                                                        VelocityTracker velocityTracker3 = new VelocityTracker();
                                                                        this.r = awaitPointerEventScope0;
                                                                        this.l = velocityTracker3;
                                                                        this.m = object2;
                                                                        this.n = object2;
                                                                        this.q = 1;
                                                                        object3 = DraggableKt.g(awaitPointerEventScope0, this.t, this.u, velocityTracker3, this.v, this);
                                                                        if(object3 == object1) {
                                                                            return object1;
                                                                        }
                                                                        velocityTracker1 = velocityTracker3;
                                                                        awaitPointerEventScope2 = awaitPointerEventScope0;
                                                                    label_54:
                                                                        V v2 = (V)object3;
                                                                        if(v2 != null) {
                                                                            try {
                                                                                l1 = this.w;
                                                                                z1 = this.x;
                                                                                o1 = this.s;
                                                                                pointerInputChange0 = (PointerInputChange)v2.e();
                                                                                z2 = z1;
                                                                                l2 = l1;
                                                                                velocityTracker4 = velocityTracker1;
                                                                                object4 = object2;
                                                                                v3 = ((Offset)v2.f()).A();
                                                                                this.r = awaitPointerEventScope2;
                                                                                this.l = velocityTracker1;
                                                                                this.m = l1;
                                                                                this.n = o1;
                                                                                this.o = z1;
                                                                                this.p = 0;
                                                                                this.q = 2;
                                                                                z2 = z1;
                                                                                o2 = o1;
                                                                                l2 = l1;
                                                                                velocityTracker4 = velocityTracker1;
                                                                                awaitPointerEventScope4 = awaitPointerEventScope2;
                                                                                object4 = object2;
                                                                                object5 = DraggableKt.h(awaitPointerEventScope2, pointerInputChange0, v3, velocityTracker1, l2, z2, this.v, this);
                                                                                goto label_116;
                                                                            }
                                                                            catch(CancellationException cancellationException0) {
                                                                            }
                                                                            catch(Throwable throwable0) {
                                                                                break alab2;
                                                                            }
                                                                            z2 = z1;
                                                                            o2 = o1;
                                                                            l2 = l1;
                                                                            velocityTracker4 = velocityTracker1;
                                                                            awaitPointerEventScope4 = awaitPointerEventScope2;
                                                                            object4 = object2;
                                                                            goto label_92;
                                                                            try {
                                                                                object5 = DraggableKt.h(awaitPointerEventScope2, pointerInputChange0, v3, velocityTracker1, l2, z2, this.v, this);
                                                                                goto label_116;
                                                                            }
                                                                            catch(CancellationException cancellationException0) {
                                                                            }
                                                                            catch(Throwable throwable0) {
                                                                                break alab2;
                                                                            }
                                                                        label_92:
                                                                            l0 = l2;
                                                                            velocityTracker2 = velocityTracker4;
                                                                            z = z2;
                                                                            o0 = o2;
                                                                            awaitPointerEventScope3 = awaitPointerEventScope4;
                                                                            try {
                                                                            label_97:
                                                                                if(!P.k(o0)) {
                                                                                    throw cancellationException0;
                                                                                }
                                                                            }
                                                                            catch(Throwable throwable0) {
                                                                                goto label_107;
                                                                            }
                                                                            l0.l(DragCancelled.a);
                                                                            break;
                                                                        }
                                                                        awaitPointerEventScope0 = awaitPointerEventScope2;
                                                                    }
                                                                }
                                                                l0 = l2;
                                                                velocityTracker2 = velocityTracker4;
                                                                z = z2;
                                                            label_107:
                                                                if(v == 0) {
                                                                    dragEvent$DragStopped1 = DragCancelled.a;
                                                                }
                                                                else {
                                                                    long v4 = velocityTracker2.b();
                                                                    if(!z) {
                                                                        f = 1.0f;
                                                                    }
                                                                    dragEvent$DragStopped1 = new DragStopped(Velocity.s(v4, f), ((w)object4));
                                                                }
                                                                l0.l(dragEvent$DragStopped1);
                                                                throw throwable0;
                                                            label_116:
                                                                if(object5 == object1) {
                                                                    return object1;
                                                                }
                                                                l0 = l2;
                                                                velocityTracker2 = velocityTracker4;
                                                                z = z2;
                                                                o0 = o2;
                                                                awaitPointerEventScope3 = awaitPointerEventScope4;
                                                                v1 = 0;
                                                            }
                                                            return S0.a;
                                                        }
                                                    };
                                                    this.l = o1;
                                                    this.k = 1;
                                                    return this.m.R0(draggableKt$draggable$9$3$1$10, this) == object1 ? object1 : S0.a;
                                                }
                                                catch(CancellationException cancellationException1) {
                                                    o0 = o1;
                                                    cancellationException0 = cancellationException1;
                                                }
                                            label_18:
                                                if(!P.k(o0)) {
                                                    throw cancellationException0;
                                                }
                                                return S0.a;
                                            }
                                            case 1: {
                                                o0 = (O)this.l;
                                                try {
                                                    f0.n(object0);
                                                    return S0.a;
                                                }
                                                catch(CancellationException cancellationException0) {
                                                    goto label_18;
                                                }
                                            }
                                            default: {
                                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                            }
                                        }
                                    }
                                };
                                this.k = 1;
                                return P.g(draggableKt$draggable$9$3$10, this) == object1 ? object1 : S0.a;
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
                Modifier modifier1 = SuspendingPointerInputFilterKt.e(Modifier.m0, new Object[]{this.k, Boolean.valueOf(this.l), Boolean.valueOf(this.m)}, draggableKt$draggable$9$30);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier1;
            }

            private static final DragLogic c(State state0) {
                return (DragLogic)state0.getValue();
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.b(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n1#1,170:1\n210#2,11:171\n*E\n"})
        public final class androidx.compose.foundation.gestures.DraggableKt.draggable..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final Function1 e;
            final Orientation f;
            final boolean g;
            final boolean h;
            final MutableInteractionSource i;
            final a j;
            final p k;
            final p l;
            final DraggableState m;

            public androidx.compose.foundation.gestures.DraggableKt.draggable..inlined.debugInspectorInfo.1(Function1 function10, Orientation orientation0, boolean z, boolean z1, MutableInteractionSource mutableInteractionSource0, a a0, p p0, p p1, DraggableState draggableState0) {
                this.e = function10;
                this.f = orientation0;
                this.g = z;
                this.h = z1;
                this.i = mutableInteractionSource0;
                this.j = a0;
                this.k = p0;
                this.l = p1;
                this.m = draggableState0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("draggable");
                inspectorInfo0.b().c("canDrag", this.e);
                inspectorInfo0.b().c("orientation", this.f);
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.g));
                inspectorInfo0.b().c("reverseDirection", Boolean.valueOf(this.h));
                inspectorInfo0.b().c("interactionSource", this.i);
                inspectorInfo0.b().c("startDragImmediately", this.j);
                inspectorInfo0.b().c("onDragStarted", this.k);
                inspectorInfo0.b().c("onDragStopped", this.l);
                inspectorInfo0.b().c("state", this.m);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier k(Modifier modifier0, DraggableState draggableState0, Orientation orientation0, boolean z, MutableInteractionSource mutableInteractionSource0, boolean z1, p p0, p p1, boolean z2, int v, Object object0) {
        boolean z3 = (v & 4) == 0 ? z : true;
        MutableInteractionSource mutableInteractionSource1 = (v & 8) == 0 ? mutableInteractionSource0 : null;
        boolean z4 = (v & 16) == 0 ? z1 : false;
        p p2 = (v & 0x20) == 0 ? p0 : new p(null) {
            int k;

            {
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, long v, @m d d0) {
                return new androidx.compose.foundation.gestures.DraggableKt.draggable.1(d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((Offset)object1).A(), ((d)object2));
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
        };
        if((v & 0x40) != 0) {
            p p3 = new p(null) {
                int k;

                {
                    super(3, d0);
                }

                @m
                public final Object a(@l O o0, float f, @m d d0) {
                    return new androidx.compose.foundation.gestures.DraggableKt.draggable.2(d0).invokeSuspend(S0.a);
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    return this.a(((O)object0), ((Number)object1).floatValue(), ((d)object2));
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
            };
            return (v & 0x80) == 0 ? DraggableKt.i(modifier0, draggableState0, orientation0, z3, mutableInteractionSource1, z4, p2, p3, z2) : DraggableKt.i(modifier0, draggableState0, orientation0, z3, mutableInteractionSource1, z4, p2, p3, false);
        }
        return (v & 0x80) == 0 ? DraggableKt.i(modifier0, draggableState0, orientation0, z3, mutableInteractionSource1, z4, p2, p1, z2) : DraggableKt.i(modifier0, draggableState0, orientation0, z3, mutableInteractionSource1, z4, p2, p1, false);
    }

    public static Modifier l(Modifier modifier0, DraggableState draggableState0, Function1 function10, Orientation orientation0, boolean z, MutableInteractionSource mutableInteractionSource0, a a0, p p0, p p1, boolean z1, int v, Object object0) {
        boolean z2 = (v & 8) == 0 ? z : true;
        MutableInteractionSource mutableInteractionSource1 = (v & 16) == 0 ? mutableInteractionSource0 : null;
        p p2 = (v & 0x40) == 0 ? p0 : new p(null) {
            int k;

            {
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, long v, @m d d0) {
                return new androidx.compose.foundation.gestures.DraggableKt.draggable.6(d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((Offset)object1).A(), ((d)object2));
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
        };
        if((v & 0x80) != 0) {
            p p3 = new p(null) {
                int k;

                {
                    super(3, d0);
                }

                @m
                public final Object a(@l O o0, long v, @m d d0) {
                    return new androidx.compose.foundation.gestures.DraggableKt.draggable.7(d0).invokeSuspend(S0.a);
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    return this.a(((O)object0), ((Velocity)object1).v(), ((d)object2));
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
            };
            return (v & 0x100) == 0 ? DraggableKt.j(modifier0, draggableState0, function10, orientation0, z2, mutableInteractionSource1, a0, p2, p3, z1) : DraggableKt.j(modifier0, draggableState0, function10, orientation0, z2, mutableInteractionSource1, a0, p2, p3, false);
        }
        return (v & 0x100) == 0 ? DraggableKt.j(modifier0, draggableState0, function10, orientation0, z2, mutableInteractionSource1, a0, p2, p1, z1) : DraggableKt.j(modifier0, draggableState0, function10, orientation0, z2, mutableInteractionSource1, a0, p2, p1, false);
    }

    private static final Object m(AwaitPointerEventScope awaitPointerEventScope0, Orientation orientation0, long v, Function1 function10, d d0) {
        Function1 function15;
        Object object3;
        AwaitPointerEventScope awaitPointerEventScope4;
        Object object2;
        androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.1 draggableKt$onDragOrUp$12;
        Function1 function13;
        AwaitPointerEventScope awaitPointerEventScope3;
        AwaitPointerEventScope awaitPointerEventScope2;
        g l0$g0;
        AwaitPointerEventScope awaitPointerEventScope1;
        androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.1 draggableKt$onDragOrUp$11;
        Function1 function12;
        PointerInputChange pointerInputChange0;
        Function1 function11;
        long v2;
        androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.1 draggableKt$onDragOrUp$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.1) {
            draggableKt$onDragOrUp$10 = (androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.1)d0;
            int v1 = draggableKt$onDragOrUp$10.q;
            if((v1 & 0x80000000) == 0) {
                draggableKt$onDragOrUp$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    Object p;
                    int q;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.p = object0;
                        this.q |= 0x80000000;
                        return DraggableKt.m(null, null, 0L, null, this);
                    }
                };
            }
            else {
                draggableKt$onDragOrUp$10.q = v1 ^ 0x80000000;
            }
        }
        else {
            draggableKt$onDragOrUp$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                Object p;
                int q;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.p = object0;
                    this.q |= 0x80000000;
                    return DraggableKt.m(null, null, 0L, null, this);
                }
            };
        }
        Object object0 = draggableKt$onDragOrUp$10.p;
        Object object1 = b.l();
        switch(draggableKt$onDragOrUp$10.q) {
            case 0: {
                f0.n(object0);
                androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.motionFromChange.1 draggableKt$onDragOrUp$motionFromChange$10 = orientation0 == Orientation.a ? androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.motionFromChange.1.e : androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.motionFromChange.2.e;
                v2 = v;
                if(DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v2)) {
                    function11 = function10;
                    pointerInputChange0 = null;
                    goto label_87;
                }
                function12 = draggableKt$onDragOrUp$motionFromChange$10;
                draggableKt$onDragOrUp$11 = draggableKt$onDragOrUp$10;
                awaitPointerEventScope1 = awaitPointerEventScope0;
                function11 = function10;
                goto label_78;
            }
            case 1: {
                l0$g0 = (g)draggableKt$onDragOrUp$10.o;
                awaitPointerEventScope2 = (AwaitPointerEventScope)draggableKt$onDragOrUp$10.n;
                awaitPointerEventScope3 = (AwaitPointerEventScope)draggableKt$onDragOrUp$10.m;
                function13 = (Function1)draggableKt$onDragOrUp$10.l;
                Function1 function14 = (Function1)draggableKt$onDragOrUp$10.k;
                f0.n(object0);
                draggableKt$onDragOrUp$12 = draggableKt$onDragOrUp$10;
                function11 = function14;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            List list0 = ((PointerEvent)object0).e();
            int v3 = list0.size();
            int v4 = 0;
            while(true) {
                if(v4 < v3) {
                    object2 = list0.get(v4);
                    awaitPointerEventScope4 = awaitPointerEventScope2;
                    if(PointerId.d(((PointerInputChange)object2).p(), l0$g0.a)) {
                        break;
                    }
                    else {
                        ++v4;
                        awaitPointerEventScope2 = awaitPointerEventScope4;
                        continue;
                    }
                }
                awaitPointerEventScope4 = awaitPointerEventScope2;
                object2 = null;
                break;
            }
            pointerInputChange0 = (PointerInputChange)object2;
            if(pointerInputChange0 == null) {
                pointerInputChange0 = null;
                goto label_70;
            }
            else {
                if(PointerEventKt.e(pointerInputChange0)) {
                    List list1 = ((PointerEvent)object0).e();
                    int v5 = list1.size();
                    int v6 = 0;
                    while(true) {
                        object3 = null;
                        if(v6 < v5) {
                            Object object4 = list1.get(v6);
                            if(((PointerInputChange)object4).r()) {
                                object3 = object4;
                            }
                            else {
                                ++v6;
                                continue;
                            }
                        }
                        break;
                    }
                    if(((PointerInputChange)object3) == null) {
                        goto label_70;
                    }
                    else {
                        l0$g0.a = ((PointerInputChange)object3).p();
                        goto label_91;
                    }
                    goto label_69;
                }
                else {
                label_69:
                    if(((Number)function13.invoke(pointerInputChange0)).floatValue() != 0.0f) {
                    label_70:
                        if(pointerInputChange0 == null) {
                            pointerInputChange0 = null;
                        }
                        else if(pointerInputChange0.A()) {
                            pointerInputChange0 = null;
                        }
                        else if(!PointerEventKt.e(pointerInputChange0)) {
                            function11.invoke(pointerInputChange0);
                            awaitPointerEventScope1 = awaitPointerEventScope3;
                            v2 = pointerInputChange0.p();
                            function12 = function13;
                            draggableKt$onDragOrUp$11 = draggableKt$onDragOrUp$12;
                        label_78:
                            g l0$g1 = new g();
                            l0$g1.a = v2;
                            awaitPointerEventScope2 = awaitPointerEventScope1;
                            function15 = function12;
                            l0$g0 = l0$g1;
                            goto label_95;
                        }
                    label_87:
                        if(pointerInputChange0 != null) {
                            function11.invoke(pointerInputChange0);
                            return S0.a == null ? kotlin.coroutines.jvm.internal.b.a(false) : kotlin.coroutines.jvm.internal.b.a(true);
                        }
                        return kotlin.coroutines.jvm.internal.b.a(false);
                    }
                }
            label_91:
                awaitPointerEventScope2 = awaitPointerEventScope4;
                awaitPointerEventScope1 = awaitPointerEventScope3;
                function15 = function13;
                draggableKt$onDragOrUp$11 = draggableKt$onDragOrUp$12;
            }
        label_95:
            draggableKt$onDragOrUp$11.k = function11;
            draggableKt$onDragOrUp$11.l = function15;
            draggableKt$onDragOrUp$11.m = awaitPointerEventScope1;
            draggableKt$onDragOrUp$11.n = awaitPointerEventScope2;
            draggableKt$onDragOrUp$11.o = l0$g0;
            draggableKt$onDragOrUp$11.q = 1;
            Object object5 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope2, null, draggableKt$onDragOrUp$11, 1, null);
            if(object5 == object1) {
                return object1;
            }
            awaitPointerEventScope3 = awaitPointerEventScope1;
            object0 = object5;
            draggableKt$onDragOrUp$12 = draggableKt$onDragOrUp$11;
            function13 = function15;
        }

        final class androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.motionFromChange.1 extends N implements Function1 {
            public static final androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.motionFromChange.1 e;

            static {
                androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.motionFromChange.1.e = new androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.motionFromChange.1();
            }

            androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.motionFromChange.1() {
                super(1);
            }

            @l
            public final Float a(@l PointerInputChange pointerInputChange0) {
                L.p(pointerInputChange0, "it");
                return Offset.r(PointerEventKt.m(pointerInputChange0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((PointerInputChange)object0));
            }
        }


        final class androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.motionFromChange.2 extends N implements Function1 {
            public static final androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.motionFromChange.2 e;

            static {
                androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.motionFromChange.2.e = new androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.motionFromChange.2();
            }

            androidx.compose.foundation.gestures.DraggableKt.onDragOrUp.motionFromChange.2() {
                super(1);
            }

            @l
            public final Float a(@l PointerInputChange pointerInputChange0) {
                L.p(pointerInputChange0, "it");
                return Offset.p(PointerEventKt.m(pointerInputChange0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((PointerInputChange)object0));
            }
        }

    }

    @Composable
    @l
    public static final DraggableState n(@l Function1 function10, @m Composer composer0, int v) {
        L.p(function10, "onDelta");
        composer0.V(0xF513E663);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xF513E663, v, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:138)");
        }
        State state0 = SnapshotStateKt.t(function10, composer0, v & 14);
        composer0.V(0xE2A708A4);
        DraggableState draggableState0 = composer0.W();
        if(draggableState0 == Composer.a.a()) {
            draggableState0 = DraggableKt.a(new Function1(state0) {
                final State e;

                {
                    this.e = state0;
                    super(1);
                }

                public final void b(float f) {
                    ((Function1)this.e.getValue()).invoke(f);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.b(((Number)object0).floatValue());
                    return S0.a;
                }
            });
            composer0.O(draggableState0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return draggableState0;
    }

    private static final float o(long v, Orientation orientation0) {
        return orientation0 == Orientation.a ? Offset.r(v) : Offset.p(v);
    }

    private static final float p(long v, Orientation orientation0) {
        return orientation0 == Orientation.a ? Velocity.n(v) : Velocity.l(v);
    }
}

