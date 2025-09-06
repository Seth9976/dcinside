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
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.S0;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.p;
import y4.l;

@s0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,780:1\n49#2,6:781\n49#2,6:787\n14166#3,14:793\n14166#3,14:807\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n*L\n730#1:781,6\n737#1:787,6\n743#1:793,14\n744#1:807,14\n*E\n"})
final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    @l
    private final AnimatedContentScope a;

    public AnimatedContentMeasurePolicy(@l AnimatedContentScope animatedContentScope0) {
        L.p(animatedContentScope0, "rootScope");
        super();
        this.a = animatedContentScope0;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    @l
    public MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
        Placeable placeable0;
        ChildData animatedContentScope$ChildData0;
        L.p(measureScope0, "$this$measure");
        L.p(list0, "measurables");
        int v1 = list0.size();
        Placeable[] arr_placeable = new Placeable[v1];
        int v2 = list0.size();
        for(int v3 = 0; true; ++v3) {
            animatedContentScope$ChildData0 = null;
            if(v3 >= v2) {
                break;
            }
            Measurable measurable0 = (Measurable)list0.get(v3);
            Object object0 = measurable0.c();
            if(object0 instanceof ChildData) {
                animatedContentScope$ChildData0 = (ChildData)object0;
            }
            if(animatedContentScope$ChildData0 != null && animatedContentScope$ChildData0.i()) {
                arr_placeable[v3] = measurable0.r1(v);
            }
        }
        int v4 = list0.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            Measurable measurable1 = (Measurable)list0.get(v5);
            if(arr_placeable[v5] == null) {
                arr_placeable[v5] = measurable1.r1(v);
            }
        }
        if(v1 == 0) {
            placeable0 = null;
        }
        else {
            placeable0 = arr_placeable[0];
            int v6 = kotlin.collections.l.we(arr_placeable);
            if(v6 != 0) {
                int v7 = placeable0 == null ? 0 : placeable0.N1();
                T t0 = new kotlin.ranges.l(1, v6).j();
                while(t0.hasNext()) {
                    Placeable placeable1 = arr_placeable[t0.b()];
                    int v8 = placeable1 == null ? 0 : placeable1.N1();
                    if(v7 < v8) {
                        placeable0 = placeable1;
                        v7 = v8;
                    }
                }
            }
        }
        int v9 = placeable0 == null ? 0 : placeable0.N1();
        if(v1 != 0) {
            animatedContentScope$ChildData0 = arr_placeable[0];
            int v10 = kotlin.collections.l.we(arr_placeable);
            if(v10 != 0) {
                int v11 = animatedContentScope$ChildData0 == null ? 0 : ((Placeable)animatedContentScope$ChildData0).K1();
                T t1 = new kotlin.ranges.l(1, v10).j();
                while(t1.hasNext()) {
                    Placeable placeable2 = arr_placeable[t1.b()];
                    int v12 = placeable2 == null ? 0 : placeable2.K1();
                    if(v11 < v12) {
                        animatedContentScope$ChildData0 = placeable2;
                        v11 = v12;
                    }
                }
            }
        }
        int v13 = animatedContentScope$ChildData0 == null ? 0 : ((Placeable)animatedContentScope$ChildData0).K1();
        this.a.v(IntSizeKt.a(v9, v13));
        return MeasureScope.-CC.p(measureScope0, v9, v13, null, new Function1(this, v9, v13) {
            final Placeable[] e;
            final AnimatedContentMeasurePolicy f;
            final int g;
            final int h;

            {
                this.e = arr_placeable;
                this.f = animatedContentMeasurePolicy0;
                this.g = v;
                this.h = v1;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                Placeable[] arr_placeable = this.e;
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy0 = this.f;
                int v = this.g;
                int v1 = this.h;
                for(int v2 = 0; v2 < arr_placeable.length; ++v2) {
                    Placeable placeable0 = arr_placeable[v2];
                    if(placeable0 != null) {
                        long v3 = animatedContentMeasurePolicy0.f().k().a(IntSizeKt.a(placeable0.N1(), placeable0.K1()), IntSizeKt.a(v, v1), LayoutDirection.a);
                        PlacementScope.p(placeable$PlacementScope0, placeable0, ((int)(v3 >> 0x20)), ((int)(v3 & 0xFFFFFFFFL)), 0.0f, 4, null);
                    }
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
    public final AnimatedContentScope f() {
        return this.a;
    }
}

