package androidx.compose.foundation;

import A3.o;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.b;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import java.util.List;
import kotlin.comparisons.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@RequiresApi(29)
@s0({"SMAP\nSystemGestureExclusion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureModifier\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1182#2:163\n1161#2,2:164\n138#3:166\n728#3,2:168\n1#4:167\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureModifier\n*L\n117#1:163\n117#1:164,2\n118#1:166\n123#1:168,2\n*E\n"})
final class ExcludeFromSystemGestureModifier implements OnGloballyPositionedModifier {
    @l
    private final View a;
    @m
    private final Function1 b;
    @m
    private Rect c;

    public ExcludeFromSystemGestureModifier(@l View view0, @m Function1 function10) {
        L.p(view0, "view");
        super();
        this.a = view0;
        this.b = function10;
    }

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
        Rect rect1;
        L.p(layoutCoordinates0, "coordinates");
        Function1 function10 = this.b;
        if(function10 == null) {
            androidx.compose.ui.geometry.Rect rect0 = LayoutCoordinatesKt.b(layoutCoordinates0);
            rect1 = new Rect(kotlin.math.b.L0(rect0.t()), kotlin.math.b.L0(rect0.B()), kotlin.math.b.L0(rect0.x()), kotlin.math.b.L0(rect0.j()));
        }
        else {
            rect1 = this.a(layoutCoordinates0, ((androidx.compose.ui.geometry.Rect)function10.invoke(layoutCoordinates0)));
        }
        this.m(rect1);
    }

    private final Rect a(LayoutCoordinates layoutCoordinates0, androidx.compose.ui.geometry.Rect rect0) {
        LayoutCoordinates layoutCoordinates1 = this.b(layoutCoordinates0);
        long v = layoutCoordinates1.P(layoutCoordinates0, rect0.E());
        long v1 = layoutCoordinates1.P(layoutCoordinates0, rect0.F());
        long v2 = layoutCoordinates1.P(layoutCoordinates0, rect0.m());
        long v3 = layoutCoordinates1.P(layoutCoordinates0, rect0.n());
        float f = a.l0(Offset.p(v), new float[]{Offset.p(v1), Offset.p(v2), Offset.p(v3)});
        float f1 = a.l0(Offset.r(v), new float[]{Offset.r(v1), Offset.r(v2), Offset.r(v3)});
        float f2 = a.Q(Offset.p(v), new float[]{Offset.p(v1), Offset.p(v2), Offset.p(v3)});
        float f3 = a.Q(Offset.r(v), new float[]{Offset.r(v1), Offset.r(v2), Offset.r(v3)});
        return new Rect(kotlin.math.b.L0(f), kotlin.math.b.L0(f1), kotlin.math.b.L0(f2), kotlin.math.b.L0(f3));
    }

    private final LayoutCoordinates b(LayoutCoordinates layoutCoordinates0) {
        LayoutCoordinates layoutCoordinates2;
        for(LayoutCoordinates layoutCoordinates1 = layoutCoordinates0.K(); true; layoutCoordinates1 = layoutCoordinates0.K()) {
            layoutCoordinates2 = layoutCoordinates0;
            layoutCoordinates0 = layoutCoordinates1;
            if(layoutCoordinates0 == null) {
                break;
            }
        }
        return layoutCoordinates2;
    }

    @m
    public final Function1 d() {
        return this.b;
    }

    @m
    public final Rect i() {
        return this.c;
    }

    @l
    public final View j() {
        return this.a;
    }

    public final void l() {
        this.m(null);
    }

    public final void m(@m Rect rect0) {
        MutableVector mutableVector0 = new MutableVector(new Rect[16], 0);
        List list0 = this.a.getSystemGestureExclusionRects();
        L.o(list0, "view.systemGestureExclusionRects");
        mutableVector0.e(mutableVector0.J(), list0);
        Rect rect1 = this.c;
        if(rect1 != null) {
            mutableVector0.a0(rect1);
        }
        if(rect0 != null && !rect0.isEmpty()) {
            mutableVector0.b(rect0);
        }
        List list1 = mutableVector0.k();
        this.a.setSystemGestureExclusionRects(list1);
        this.c = rect0;
    }

    public final void n(@m Rect rect0) {
        this.c = rect0;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return androidx.compose.ui.a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

