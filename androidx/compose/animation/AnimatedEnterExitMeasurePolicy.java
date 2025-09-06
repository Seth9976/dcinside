package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.p;
import y4.l;

@s0({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,863:1\n1549#2:864\n1620#2,3:865\n145#3,13:868\n145#3,13:881\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n*L\n795#1:864\n795#1:865,3\n796#1:868,13\n797#1:881,13\n*E\n"})
final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {
    @l
    private final AnimatedVisibilityScopeImpl a;

    public AnimatedEnterExitMeasurePolicy(@l AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl0) {
        L.p(animatedVisibilityScopeImpl0, "scope");
        super();
        this.a = animatedVisibilityScopeImpl0;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    @l
    public MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
        Object object2;
        L.p(measureScope0, "$this$measure");
        L.p(list0, "measurables");
        ArrayList arrayList0 = new ArrayList(u.b0(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(((Measurable)object0).r1(v));
        }
        Object object1 = null;
        if(arrayList0.isEmpty()) {
            object2 = null;
        }
        else {
            object2 = arrayList0.get(0);
            int v2 = ((Placeable)object2).N1();
            int v3 = u.J(arrayList0);
            if(1 <= v3) {
                for(int v4 = 1; true; ++v4) {
                    Object object3 = arrayList0.get(v4);
                    int v5 = ((Placeable)object3).N1();
                    if(v2 < v5) {
                        object2 = object3;
                        v2 = v5;
                    }
                    if(v4 == v3) {
                        break;
                    }
                }
            }
        }
        int v6 = ((Placeable)object2) == null ? 0 : ((Placeable)object2).N1();
        if(!arrayList0.isEmpty()) {
            Object object4 = arrayList0.get(0);
            int v7 = ((Placeable)object4).K1();
            int v8 = u.J(arrayList0);
            if(1 <= v8) {
                for(int v1 = 1; true; ++v1) {
                    Object object5 = arrayList0.get(v1);
                    int v9 = ((Placeable)object5).K1();
                    if(v7 < v9) {
                        object4 = object5;
                        v7 = v9;
                    }
                    if(v1 == v8) {
                        break;
                    }
                }
            }
            object1 = object4;
        }
        int v10 = ((Placeable)object1) == null ? 0 : ((Placeable)object1).K1();
        this.a.c().setValue(IntSize.b(IntSizeKt.a(v6, v10)));
        return MeasureScope.-CC.p(measureScope0, v6, v10, null, new Function1() {
            final List e;

            {
                this.e = list0;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                List list0 = this.e;
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    PlacementScope.p(placeable$PlacementScope0, ((Placeable)list0.get(v1)), 0, 0, 0.0f, 4, null);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }, 4, null);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int b(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(list0, "measurables");
        Integer integer0 = (Integer)p.C1(p.k1(u.A1(list0), new Function1() {
            final int e;

            {
                this.e = v;
                super(1);
            }

            @l
            public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0) {
                L.p(intrinsicMeasurable0, "it");
                return intrinsicMeasurable0.D0(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((IntrinsicMeasurable)object0));
            }
        }));
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int c(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(list0, "measurables");
        Integer integer0 = (Integer)p.C1(p.k1(u.A1(list0), new Function1() {
            final int e;

            {
                this.e = v;
                super(1);
            }

            @l
            public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0) {
                L.p(intrinsicMeasurable0, "it");
                return intrinsicMeasurable0.S0(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((IntrinsicMeasurable)object0));
            }
        }));
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int d(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(list0, "measurables");
        Integer integer0 = (Integer)p.C1(p.k1(u.A1(list0), new Function1() {
            final int e;

            {
                this.e = v;
                super(1);
            }

            @l
            public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0) {
                L.p(intrinsicMeasurable0, "it");
                return intrinsicMeasurable0.g(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((IntrinsicMeasurable)object0));
            }
        }));
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int e(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(list0, "measurables");
        Integer integer0 = (Integer)p.C1(p.k1(u.A1(list0), new Function1() {
            final int e;

            {
                this.e = v;
                super(1);
            }

            @l
            public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0) {
                L.p(intrinsicMeasurable0, "it");
                return intrinsicMeasurable0.h1(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((IntrinsicMeasurable)object0));
            }
        }));
        return integer0 == null ? 0 : ((int)integer0);
    }

    @l
    public final AnimatedVisibilityScopeImpl f() {
        return this.a;
    }
}

