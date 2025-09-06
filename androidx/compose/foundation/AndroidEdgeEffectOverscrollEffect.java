package androidx.compose.foundation;

import A3.o;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,589:1\n33#2,6:590\n101#2,2:597\n33#2,6:599\n103#2:605\n33#2,6:607\n135#3:596\n245#4:606\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n123#1:590,6\n266#1:597,2\n266#1:599,6\n266#1:605\n445#1:607,6\n341#1:596\n351#1:606\n*E\n"})
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    @l
    private final OverscrollConfiguration a;
    @m
    private Offset b;
    @l
    private final EdgeEffect c;
    @l
    private final EdgeEffect d;
    @l
    private final EdgeEffect e;
    @l
    private final EdgeEffect f;
    @l
    private final List g;
    @l
    private final EdgeEffect h;
    @l
    private final EdgeEffect i;
    @l
    private final EdgeEffect j;
    @l
    private final EdgeEffect k;
    @l
    private final MutableState l;
    private boolean m;
    private boolean n;
    private long o;
    @l
    private final Function1 p;
    @m
    private PointerId q;
    @l
    private final Modifier r;

    public AndroidEdgeEffectOverscrollEffect(@l Context context0, @l OverscrollConfiguration overscrollConfiguration0) {
        L.p(context0, "context");
        L.p(overscrollConfiguration0, "overscrollConfig");
        super();
        this.a = overscrollConfiguration0;
        EdgeEffect edgeEffect0 = EdgeEffectCompat.a.a(context0, null);
        this.c = edgeEffect0;
        EdgeEffect edgeEffect1 = EdgeEffectCompat.a.a(context0, null);
        this.d = edgeEffect1;
        EdgeEffect edgeEffect2 = EdgeEffectCompat.a.a(context0, null);
        this.e = edgeEffect2;
        EdgeEffect edgeEffect3 = EdgeEffectCompat.a.a(context0, null);
        this.f = edgeEffect3;
        EdgeEffect[] arr_edgeEffect = new EdgeEffect[4];
        arr_edgeEffect[0] = edgeEffect2;
        arr_edgeEffect[1] = edgeEffect0;
        arr_edgeEffect[2] = edgeEffect3;
        arr_edgeEffect[3] = edgeEffect1;
        List list0 = u.O(arr_edgeEffect);
        this.g = list0;
        this.h = EdgeEffectCompat.a.a(context0, null);
        this.i = EdgeEffectCompat.a.a(context0, null);
        this.j = EdgeEffectCompat.a.a(context0, null);
        this.k = EdgeEffectCompat.a.a(context0, null);
        int v1 = list0.size();
        for(int v = 0; v < v1; ++v) {
            ((EdgeEffect)list0.get(v)).setColor(ColorKt.r(this.a.b()));
        }
        SnapshotMutationPolicy snapshotMutationPolicy0 = SnapshotStateKt.l();
        this.l = SnapshotStateKt.j(S0.a, snapshotMutationPolicy0);
        this.m = true;
        this.o = 0L;
        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.onNewSize.1 androidEdgeEffectOverscrollEffect$onNewSize$10 = new Function1() {
            final AndroidEdgeEffectOverscrollEffect e;

            {
                this.e = androidEdgeEffectOverscrollEffect0;
                super(1);
            }

            public final void a(long v) {
                boolean z = Size.k(IntSizeKt.f(v), this.e.o);
                this.e.o = IntSizeKt.f(v);
                if(!z) {
                    this.e.c.setSize(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
                    this.e.d.setSize(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
                    this.e.e.setSize(((int)(v & 0xFFFFFFFFL)), ((int)(v >> 0x20)));
                    this.e.f.setSize(((int)(v & 0xFFFFFFFFL)), ((int)(v >> 0x20)));
                    this.e.h.setSize(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
                    this.e.i.setSize(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
                    this.e.j.setSize(((int)(v & 0xFFFFFFFFL)), ((int)(v >> 0x20)));
                    this.e.k.setSize(((int)(v & 0xFFFFFFFFL)), ((int)(v >> 0x20)));
                }
                if(!z) {
                    this.e.B();
                    this.e.t();
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((IntSize)object0).q());
                return S0.a;
            }
        };
        this.p = androidEdgeEffectOverscrollEffect$onNewSize$10;
        Modifier modifier0 = Modifier.m0.r0(AndroidOverscrollKt.a);
        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.effectModifier.1 androidEdgeEffectOverscrollEffect$effectModifier$10 = new o(null) {
            int k;
            private Object l;
            final AndroidEdgeEffectOverscrollEffect m;

            {
                this.m = androidEdgeEffectOverscrollEffect0;
                super(2, d0);
            }

            @m
            public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                return ((androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.effectModifier.1)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.effectModifier.1(this.m, d0);
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
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.effectModifier.1.1 androidEdgeEffectOverscrollEffect$effectModifier$1$10 = new o(null) {
                            int l;
                            private Object m;
                            final AndroidEdgeEffectOverscrollEffect n;

                            {
                                this.n = androidEdgeEffectOverscrollEffect0;
                                super(2, d0);
                            }

                            @m
                            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                                return ((androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.effectModifier.1.1)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                d d1 = new androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.effectModifier.1.1(this.n, d0);
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
                                AwaitPointerEventScope awaitPointerEventScope0;
                                Object object1 = b.l();
                                switch(this.l) {
                                    case 0: {
                                        f0.n(object0);
                                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.m;
                                        this.m = awaitPointerEventScope0;
                                        this.l = 1;
                                        object0 = TapGestureDetectorKt.f(awaitPointerEventScope0, false, null, this, 2, null);
                                        if(object0 == object1) {
                                            return object1;
                                        }
                                        goto label_12;
                                    }
                                    case 1: {
                                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.m;
                                        f0.n(object0);
                                    label_12:
                                        PointerId pointerId0 = PointerId.a(((PointerInputChange)object0).p());
                                        this.n.q = pointerId0;
                                        Offset offset0 = Offset.d(((PointerInputChange)object0).q());
                                        this.n.b = offset0;
                                        goto label_52;
                                    }
                                    case 2: {
                                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.m;
                                        f0.n(object0);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                do {
                                    List list0 = ((PointerEvent)object0).e();
                                    ArrayList arrayList0 = new ArrayList(list0.size());
                                    int v = list0.size();
                                    int v1 = 0;
                                    for(int v2 = 0; v2 < v; ++v2) {
                                        Object object2 = list0.get(v2);
                                        if(((PointerInputChange)object2).r()) {
                                            arrayList0.add(object2);
                                        }
                                    }
                                    AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect0 = this.n;
                                    int v3 = arrayList0.size();
                                    while(true) {
                                        object3 = null;
                                        if(v1 < v3) {
                                            Object object4 = arrayList0.get(v1);
                                            if(PointerId.c(((PointerInputChange)object4).p(), androidEdgeEffectOverscrollEffect0.q)) {
                                                object3 = object4;
                                            }
                                            else {
                                                ++v1;
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                    PointerInputChange pointerInputChange0 = (PointerInputChange)object3;
                                    if(pointerInputChange0 == null) {
                                        pointerInputChange0 = (PointerInputChange)u.G2(arrayList0);
                                    }
                                    if(pointerInputChange0 != null) {
                                        PointerId pointerId1 = PointerId.a(pointerInputChange0.p());
                                        this.n.q = pointerId1;
                                        Offset offset1 = Offset.d(pointerInputChange0.q());
                                        this.n.b = offset1;
                                    }
                                    if(arrayList0.isEmpty()) {
                                        this.n.q = null;
                                        return S0.a;
                                    }
                                label_52:
                                    this.m = awaitPointerEventScope0;
                                    this.l = 2;
                                    object0 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope0, null, this, 1, null);
                                }
                                while(object0 != object1);
                                return object1;
                            }
                        };
                        this.k = 1;
                        return ForEachGestureKt.d(pointerInputScope0, androidEdgeEffectOverscrollEffect$effectModifier$1$10, this) == object1 ? object1 : S0.a;
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
        this.r = OnRemeasuredModifierKt.a(SuspendingPointerInputFilterKt.c(modifier0, S0.a, androidEdgeEffectOverscrollEffect$effectModifier$10), androidEdgeEffectOverscrollEffect$onNewSize$10).r0(new DrawOverscrollModifier(this, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n1#1,170:1\n342#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.special..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final AndroidEdgeEffectOverscrollEffect e;

            public androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.special..inlined.debugInspectorInfo.1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect0) {
                this.e = androidEdgeEffectOverscrollEffect0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("overscroll");
                inspectorInfo0.e(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @VisibleForTesting
    public static void A() {
    }

    private final void B() {
        if(this.m) {
            this.l.setValue(S0.a);
        }
    }

    private final float C(long v, long v1) {
        float f = Offset.p(v1);
        float f1 = Size.t(this.o);
        float f2 = Offset.r(v);
        float f3 = Size.m(this.o);
        float f4 = -EdgeEffectCompat.a.d(this.d, -(f2 / f3), 1.0f - f / f1) * Size.m(this.o);
        return EdgeEffectCompat.a.b(this.d) == 0.0f ? f4 : Offset.r(v);
    }

    private final float D(long v, long v1) {
        float f = Offset.r(v1);
        float f1 = Size.m(this.o);
        float f2 = Offset.p(v);
        float f3 = Size.t(this.o);
        float f4 = EdgeEffectCompat.a.d(this.e, f2 / f3, 1.0f - f / f1) * Size.t(this.o);
        return EdgeEffectCompat.a.b(this.e) == 0.0f ? f4 : Offset.p(v);
    }

    private final float E(long v, long v1) {
        float f = Offset.r(v1);
        float f1 = Size.m(this.o);
        float f2 = Offset.p(v);
        float f3 = Size.t(this.o);
        float f4 = -EdgeEffectCompat.a.d(this.f, -(f2 / f3), f / f1) * Size.t(this.o);
        return EdgeEffectCompat.a.b(this.f) == 0.0f ? f4 : Offset.p(v);
    }

    private final float F(long v, long v1) {
        float f = Offset.p(v1);
        float f1 = Size.t(this.o);
        float f2 = Offset.r(v);
        float f3 = Size.m(this.o);
        float f4 = EdgeEffectCompat.a.d(this.c, f2 / f3, f / f1) * Size.m(this.o);
        return EdgeEffectCompat.a.b(this.c) == 0.0f ? f4 : Offset.r(v);
    }

    private final boolean G(long v) {
        boolean z;
        if(this.e.isFinished() || Offset.p(v) >= 0.0f) {
            z = false;
        }
        else {
            float f = Offset.p(v);
            EdgeEffectCompat.a.e(this.e, f);
            z = this.e.isFinished();
        }
        if(!this.f.isFinished() && Offset.p(v) > 0.0f) {
            float f1 = Offset.p(v);
            EdgeEffectCompat.a.e(this.f, f1);
            z = z || this.f.isFinished();
        }
        if(!this.c.isFinished() && Offset.r(v) < 0.0f) {
            float f2 = Offset.r(v);
            EdgeEffectCompat.a.e(this.c, f2);
            z = z || this.c.isFinished();
        }
        if(!this.d.isFinished() && Offset.r(v) > 0.0f) {
            float f3 = Offset.r(v);
            EdgeEffectCompat.a.e(this.d, f3);
            return z || this.d.isFinished();
        }
        return z;
    }

    public final void H(boolean z) {
        this.m = z;
    }

    private final boolean I() {
        boolean z;
        long v = SizeKt.b(this.o);
        EdgeEffectCompat edgeEffectCompat0 = EdgeEffectCompat.a;
        if(edgeEffectCompat0.b(this.e) == 0.0f) {
            z = false;
        }
        else {
            this.D(0L, v);
            z = true;
        }
        if(edgeEffectCompat0.b(this.f) != 0.0f) {
            this.E(0L, v);
            z = true;
        }
        if(edgeEffectCompat0.b(this.c) != 0.0f) {
            this.F(0L, v);
            z = true;
        }
        if(edgeEffectCompat0.b(this.d) == 0.0f) {
            return z;
        }
        this.C(0L, v);
        return true;
    }

    @Override  // androidx.compose.foundation.OverscrollEffect
    public boolean a() {
        List list0 = this.g;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            EdgeEffect edgeEffect0 = (EdgeEffect)list0.get(v1);
            if(EdgeEffectCompat.a.b(edgeEffect0) != 0.0f) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.compose.foundation.OverscrollEffect
    @l
    public Modifier b() {
        return this.r;
    }

    @Override  // androidx.compose.foundation.OverscrollEffect
    public long c(long v, int v1, @l Function1 function10) {
        boolean z1;
        boolean z;
        float f2;
        float f1;
        int v2 = 1;
        L.p(function10, "performScroll");
        if(Size.v(this.o)) {
            return ((Offset)function10.invoke(Offset.d(v))).A();
        }
        if(!this.n) {
            this.I();
            this.n = true;
        }
        Offset offset0 = this.b;
        long v3 = offset0 == null ? SizeKt.b(this.o) : offset0.A();
        float f = 0.0f;
        if(Offset.r(v) == 0.0f) {
            f1 = 0.0f;
        }
        else {
            EdgeEffectCompat edgeEffectCompat0 = EdgeEffectCompat.a;
            if(edgeEffectCompat0.b(this.c) != 0.0f) {
                f1 = this.F(v, v3);
                if(edgeEffectCompat0.b(this.c) == 0.0f) {
                    this.c.onRelease();
                }
            }
            else if(edgeEffectCompat0.b(this.d) != 0.0f) {
                f1 = this.C(v, v3);
                if(edgeEffectCompat0.b(this.d) == 0.0f) {
                    this.d.onRelease();
                }
            }
            else {
                f1 = 0.0f;
            }
        }
        if(Offset.p(v) != 0.0f) {
            EdgeEffectCompat edgeEffectCompat1 = EdgeEffectCompat.a;
            if(edgeEffectCompat1.b(this.e) != 0.0f) {
                f2 = this.D(v, v3);
                if(edgeEffectCompat1.b(this.e) == 0.0f) {
                    this.e.onRelease();
                }
                f = f2;
            }
            else if(edgeEffectCompat1.b(this.f) != 0.0f) {
                f2 = this.E(v, v3);
                if(edgeEffectCompat1.b(this.f) == 0.0f) {
                    this.f.onRelease();
                }
                f = f2;
            }
        }
        long v4 = OffsetKt.a(f, f1);
        if(!Offset.l(v4, 0L)) {
            this.B();
        }
        long v5 = Offset.u(v, v4);
        long v6 = ((Offset)function10.invoke(Offset.d(v5))).A();
        long v7 = Offset.u(v5, v6);
        int v8 = 0;
        if(NestedScrollSource.g(v1, 1)) {
            if(Offset.p(v7) > 0.5f) {
                this.D(v7, v3);
                z = true;
            }
            else if(Offset.p(v7) < -0.5f) {
                this.E(v7, v3);
                z = true;
            }
            else {
                z = false;
            }
            if(Offset.r(v7) > 0.5f) {
                this.F(v7, v3);
                z1 = true;
            }
            else if(Offset.r(v7) < -0.5f) {
                this.C(v7, v3);
                z1 = true;
            }
            else {
                z1 = false;
            }
            if(!z && !z1) {
                v2 = 0;
            }
            v8 = v2;
        }
        if(this.G(v) || v8 != 0) {
            this.B();
        }
        return Offset.v(v4, v6);
    }

    @Override  // androidx.compose.foundation.OverscrollEffect
    @m
    public Object d(long v, @l o o0, @l d d0) {
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect0;
        long v7;
        float f1;
        float f;
        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.applyToFling.1 androidEdgeEffectOverscrollEffect$applyToFling$10;
        if(d0 instanceof androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.applyToFling.1) {
            androidEdgeEffectOverscrollEffect$applyToFling$10 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.applyToFling.1)d0;
            int v1 = androidEdgeEffectOverscrollEffect$applyToFling$10.o;
            if((v1 & 0x80000000) == 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    long l;
                    Object m;
                    int o;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.o |= 0x80000000;
                        return d0.d(0L, null, this);
                    }
                };
            }
            else {
                androidEdgeEffectOverscrollEffect$applyToFling$10.o = v1 ^ 0x80000000;
            }
        }
        else {
            androidEdgeEffectOverscrollEffect$applyToFling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                long l;
                Object m;
                int o;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.o |= 0x80000000;
                    return d0.d(0L, null, this);
                }
            };
        }
        Object object0 = androidEdgeEffectOverscrollEffect$applyToFling$10.m;
        Object object1 = b.l();
        switch(androidEdgeEffectOverscrollEffect$applyToFling$10.o) {
            case 0: {
                f0.n(object0);
                if(Size.v(this.o)) {
                    Velocity velocity0 = Velocity.b(v);
                    androidEdgeEffectOverscrollEffect$applyToFling$10.o = 1;
                    return o0.invoke(velocity0, androidEdgeEffectOverscrollEffect$applyToFling$10) == object1 ? object1 : S0.a;
                }
                if(Velocity.l(v) > 0.0f) {
                    EdgeEffectCompat edgeEffectCompat0 = EdgeEffectCompat.a;
                    if(edgeEffectCompat0.b(this.e) != 0.0f) {
                        int v2 = kotlin.math.b.L0(Velocity.l(v));
                        edgeEffectCompat0.c(this.e, v2);
                        f = Velocity.l(v);
                        goto label_39;
                    }
                    goto label_29;
                }
                else {
                label_29:
                    if(Velocity.l(v) < 0.0f) {
                        EdgeEffectCompat edgeEffectCompat1 = EdgeEffectCompat.a;
                        if(edgeEffectCompat1.b(this.f) == 0.0f) {
                            f = 0.0f;
                        }
                        else {
                            int v3 = kotlin.math.b.L0(Velocity.l(v));
                            edgeEffectCompat1.c(this.f, -v3);
                            f = Velocity.l(v);
                        }
                    }
                    else {
                        f = 0.0f;
                    }
                }
            label_39:
                if(Velocity.n(v) > 0.0f) {
                    EdgeEffectCompat edgeEffectCompat2 = EdgeEffectCompat.a;
                    if(edgeEffectCompat2.b(this.c) != 0.0f) {
                        int v4 = kotlin.math.b.L0(Velocity.n(v));
                        edgeEffectCompat2.c(this.c, v4);
                        f1 = Velocity.n(v);
                        goto label_56;
                    }
                    goto label_46;
                }
                else {
                label_46:
                    if(Velocity.n(v) < 0.0f) {
                        EdgeEffectCompat edgeEffectCompat3 = EdgeEffectCompat.a;
                        if(edgeEffectCompat3.b(this.d) == 0.0f) {
                            f1 = 0.0f;
                        }
                        else {
                            int v5 = kotlin.math.b.L0(Velocity.n(v));
                            edgeEffectCompat3.c(this.d, -v5);
                            f1 = Velocity.n(v);
                        }
                    }
                    else {
                        f1 = 0.0f;
                    }
                }
            label_56:
                long v6 = VelocityKt.a(f, f1);
                if(!Velocity.j(v6, 0L)) {
                    this.B();
                }
                v7 = Velocity.p(v, v6);
                Velocity velocity1 = Velocity.b(v7);
                androidEdgeEffectOverscrollEffect$applyToFling$10.k = this;
                androidEdgeEffectOverscrollEffect$applyToFling$10.l = v7;
                androidEdgeEffectOverscrollEffect$applyToFling$10.o = 2;
                object0 = o0.invoke(velocity1, androidEdgeEffectOverscrollEffect$applyToFling$10);
                if(object0 == object1) {
                    return object1;
                }
                androidEdgeEffectOverscrollEffect0 = this;
                break;
            }
            case 1: {
                f0.n(object0);
                return S0.a;
            }
            case 2: {
                v7 = androidEdgeEffectOverscrollEffect$applyToFling$10.l;
                androidEdgeEffectOverscrollEffect0 = (AndroidEdgeEffectOverscrollEffect)androidEdgeEffectOverscrollEffect$applyToFling$10.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        long v8 = Velocity.p(v7, ((Velocity)object0).v());
        androidEdgeEffectOverscrollEffect0.n = false;
        if(Velocity.l(v8) > 0.0f) {
            int v9 = kotlin.math.b.L0(Velocity.l(v8));
            EdgeEffectCompat.a.c(androidEdgeEffectOverscrollEffect0.e, v9);
        }
        else if(Velocity.l(v8) < 0.0f) {
            int v10 = kotlin.math.b.L0(Velocity.l(v8));
            EdgeEffectCompat.a.c(androidEdgeEffectOverscrollEffect0.f, -v10);
        }
        if(Velocity.n(v8) > 0.0f) {
            int v11 = kotlin.math.b.L0(Velocity.n(v8));
            EdgeEffectCompat.a.c(androidEdgeEffectOverscrollEffect0.c, v11);
        }
        else if(Velocity.n(v8) < 0.0f) {
            int v12 = kotlin.math.b.L0(Velocity.n(v8));
            EdgeEffectCompat.a.c(androidEdgeEffectOverscrollEffect0.d, -v12);
        }
        if(!Velocity.j(v8, 0L)) {
            androidEdgeEffectOverscrollEffect0.B();
        }
        androidEdgeEffectOverscrollEffect0.t();
        return S0.a;
    }

    private final void t() {
        List list0 = this.g;
        int v = list0.size();
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            EdgeEffect edgeEffect0 = (EdgeEffect)list0.get(v1);
            edgeEffect0.onRelease();
            z = edgeEffect0.isFinished() || z;
        }
        if(z) {
            this.B();
        }
    }

    private final boolean u(DrawScope drawScope0, EdgeEffect edgeEffect0, Canvas canvas0) {
        int v = canvas0.save();
        canvas0.rotate(180.0f);
        float f = drawScope0.y1(this.a.a().a());
        canvas0.translate(-Size.t(this.o), f - Size.m(this.o));
        boolean z = edgeEffect0.draw(canvas0);
        canvas0.restoreToCount(v);
        return z;
    }

    private final boolean v(DrawScope drawScope0, EdgeEffect edgeEffect0, Canvas canvas0) {
        int v = canvas0.save();
        canvas0.rotate(270.0f);
        float f = Size.m(this.o);
        LayoutDirection layoutDirection0 = drawScope0.getLayoutDirection();
        canvas0.translate(-f, drawScope0.y1(this.a.a().b(layoutDirection0)));
        boolean z = edgeEffect0.draw(canvas0);
        canvas0.restoreToCount(v);
        return z;
    }

    public final void w(@l DrawScope drawScope0) {
        boolean z1;
        L.p(drawScope0, "<this>");
        if(Size.v(this.o)) {
            return;
        }
        androidx.compose.ui.graphics.Canvas canvas0 = drawScope0.J0().a();
        this.l.getValue();
        Canvas canvas1 = AndroidCanvas_androidKt.d(canvas0);
        EdgeEffectCompat edgeEffectCompat0 = EdgeEffectCompat.a;
        if(edgeEffectCompat0.b(this.j) != 0.0f) {
            this.x(drawScope0, this.j, canvas1);
            this.j.finish();
        }
        boolean z = false;
        if(this.e.isFinished()) {
            z1 = false;
        }
        else {
            z1 = this.v(drawScope0, this.e, canvas1);
            float f = edgeEffectCompat0.b(this.e);
            edgeEffectCompat0.d(this.j, f, 0.0f);
        }
        if(edgeEffectCompat0.b(this.h) != 0.0f) {
            this.u(drawScope0, this.h, canvas1);
            this.h.finish();
        }
        if(!this.c.isFinished()) {
            z1 = this.y(drawScope0, this.c, canvas1) || z1;
            float f1 = edgeEffectCompat0.b(this.c);
            edgeEffectCompat0.d(this.h, f1, 0.0f);
        }
        if(edgeEffectCompat0.b(this.k) != 0.0f) {
            this.v(drawScope0, this.k, canvas1);
            this.k.finish();
        }
        if(!this.f.isFinished()) {
            z1 = this.x(drawScope0, this.f, canvas1) || z1;
            float f2 = edgeEffectCompat0.b(this.f);
            edgeEffectCompat0.d(this.k, f2, 0.0f);
        }
        if(edgeEffectCompat0.b(this.i) != 0.0f) {
            this.y(drawScope0, this.i, canvas1);
            this.i.finish();
        }
        if(!this.d.isFinished()) {
            if(this.u(drawScope0, this.d, canvas1) || z1) {
                z = true;
            }
            float f3 = edgeEffectCompat0.b(this.d);
            edgeEffectCompat0.d(this.i, f3, 0.0f);
            z1 = z;
        }
        if(z1) {
            this.B();
        }
    }

    private final boolean x(DrawScope drawScope0, EdgeEffect edgeEffect0, Canvas canvas0) {
        int v = canvas0.save();
        int v1 = kotlin.math.b.L0(Size.t(this.o));
        LayoutDirection layoutDirection0 = drawScope0.getLayoutDirection();
        float f = this.a.a().c(layoutDirection0);
        canvas0.rotate(90.0f);
        canvas0.translate(0.0f, drawScope0.y1(f) - ((float)v1));
        boolean z = edgeEffect0.draw(canvas0);
        canvas0.restoreToCount(v);
        return z;
    }

    private final boolean y(DrawScope drawScope0, EdgeEffect edgeEffect0, Canvas canvas0) {
        int v = canvas0.save();
        canvas0.translate(0.0f, drawScope0.y1(this.a.a().d()));
        boolean z = edgeEffect0.draw(canvas0);
        canvas0.restoreToCount(v);
        return z;
    }

    public final boolean z() {
        return this.m;
    }
}

