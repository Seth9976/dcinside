package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,325:1\n135#2:326\n135#2:327\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:326\n121#1:327\n*E\n"})
public final class AlignmentLineKt {
    private static final MeasureResult c(MeasureScope measureScope0, AlignmentLine alignmentLine0, float f, float f1, Measurable measurable0, long v) {
        int v7;
        Placeable placeable0 = measurable0.r1((AlignmentLineKt.d(alignmentLine0) ? Constraints.e(v, 0, 0, 0, 0, 11, null) : Constraints.e(v, 0, 0, 0, 0, 14, null)));
        int v1 = placeable0.v(alignmentLine0);
        if(v1 == 0x80000000) {
            v1 = 0;
        }
        int v2 = AlignmentLineKt.d(alignmentLine0) ? placeable0.K1() : placeable0.N1();
        int v3 = (AlignmentLineKt.d(alignmentLine0) ? Constraints.o(v) : Constraints.p(v)) - v2;
        int v4 = s.I((Dp.l(f, NaNf) ? 0 : measureScope0.b1(f)) - v1, 0, v3);
        int v5 = s.I((Dp.l(f1, NaNf) ? 0 : measureScope0.b1(f1)) - v2 + v1, 0, v3 - v4);
        int v6 = AlignmentLineKt.d(alignmentLine0) ? placeable0.N1() : Math.max(placeable0.N1() + v4 + v5, Constraints.r(v));
        if(AlignmentLineKt.d(alignmentLine0)) {
            v7 = Math.max(placeable0.K1() + v4 + v5, Constraints.q(v));
            return MeasureScope.-CC.p(measureScope0, v6, v7, null, new Function1(alignmentLine0, f, v4, v6, v5, placeable0, v7) {
                final AlignmentLine e;
                final float f;
                final int g;
                final int h;
                final int i;
                final Placeable j;
                final int k;

                {
                    this.e = alignmentLine0;
                    this.f = f;
                    this.g = v;
                    this.h = v1;
                    this.i = v2;
                    this.j = placeable0;
                    this.k = v3;
                    super(1);
                }

                public final void a(@l PlacementScope placeable$PlacementScope0) {
                    int v1;
                    int v;
                    L.p(placeable$PlacementScope0, "$this$layout");
                    if(AlignmentLineKt.d(this.e)) {
                        v = 0;
                    }
                    else {
                        v = Dp.l(this.f, NaNf) ? this.h - this.i - this.j.N1() : this.g;
                    }
                    if(AlignmentLineKt.d(this.e)) {
                        v1 = Dp.l(this.f, NaNf) ? this.k - this.i - this.j.K1() : this.g;
                    }
                    else {
                        v1 = 0;
                    }
                    PlacementScope.v(placeable$PlacementScope0, this.j, v, v1, 0.0f, 4, null);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((PlacementScope)object0));
                    return S0.a;
                }
            }, 4, null);
        }
        v7 = placeable0.K1();
        return MeasureScope.-CC.p(measureScope0, v6, v7, null, new Function1(alignmentLine0, f, v4, v6, v5, placeable0, v7) {
            final AlignmentLine e;
            final float f;
            final int g;
            final int h;
            final int i;
            final Placeable j;
            final int k;

            {
                this.e = alignmentLine0;
                this.f = f;
                this.g = v;
                this.h = v1;
                this.i = v2;
                this.j = placeable0;
                this.k = v3;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                int v1;
                int v;
                L.p(placeable$PlacementScope0, "$this$layout");
                if(AlignmentLineKt.d(this.e)) {
                    v = 0;
                }
                else {
                    v = Dp.l(this.f, NaNf) ? this.h - this.i - this.j.N1() : this.g;
                }
                if(AlignmentLineKt.d(this.e)) {
                    v1 = Dp.l(this.f, NaNf) ? this.k - this.i - this.j.K1() : this.g;
                }
                else {
                    v1 = 0;
                }
                PlacementScope.v(placeable$PlacementScope0, this.j, v, v1, 0.0f, 4, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }, 4, null);
    }

    private static final boolean d(AlignmentLine alignmentLine0) {
        return alignmentLine0 instanceof HorizontalAlignmentLine;
    }

    @Stable
    @l
    public static final Modifier e(@l Modifier modifier0, @l AlignmentLine alignmentLine0, float f, float f1) {
        L.p(modifier0, "$this$paddingFrom");
        L.p(alignmentLine0, "alignmentLine");
        return modifier0.r0(new AlignmentLineOffsetDp(alignmentLine0, f, f1, InspectableValueKt.b(), null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n1#1,170:1\n76#2,5:171\n*E\n"})
        public final class androidx.compose.foundation.layout.AlignmentLineKt.paddingFrom-4j6BHR0..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final AlignmentLine e;
            final float f;
            final float g;

            public androidx.compose.foundation.layout.AlignmentLineKt.paddingFrom-4j6BHR0..inlined.debugInspectorInfo.1(AlignmentLine alignmentLine0, float f, float f1) {
                this.e = alignmentLine0;
                this.f = f;
                this.g = f1;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("paddingFrom");
                inspectorInfo0.b().c("alignmentLine", this.e);
                inspectorInfo0.b().c("before", Dp.d(this.f));
                inspectorInfo0.b().c("after", Dp.d(this.g));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier f(Modifier modifier0, AlignmentLine alignmentLine0, float f, float f1, int v, Object object0) {
        if((v & 2) != 0) {
            f = NaNf;
        }
        if((v & 4) != 0) {
            f1 = NaNf;
        }
        return AlignmentLineKt.e(modifier0, alignmentLine0, f, f1);
    }

    @Stable
    @l
    public static final Modifier g(@l Modifier modifier0, @l AlignmentLine alignmentLine0, long v, long v1) {
        L.p(modifier0, "$this$paddingFrom");
        L.p(alignmentLine0, "alignmentLine");
        return modifier0.r0(new AlignmentLineOffsetTextUnit(alignmentLine0, v, v1, InspectableValueKt.b(), null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n1#1,170:1\n122#2,5:171\n*E\n"})
        public final class androidx.compose.foundation.layout.AlignmentLineKt.paddingFrom-Y_r0B1c..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final AlignmentLine e;
            final long f;
            final long g;

            public androidx.compose.foundation.layout.AlignmentLineKt.paddingFrom-Y_r0B1c..inlined.debugInspectorInfo.1(AlignmentLine alignmentLine0, long v, long v1) {
                this.e = alignmentLine0;
                this.f = v;
                this.g = v1;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("paddingFrom");
                inspectorInfo0.b().c("alignmentLine", this.e);
                inspectorInfo0.b().c("before", TextUnit.c(this.f));
                inspectorInfo0.b().c("after", TextUnit.c(this.g));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier h(Modifier modifier0, AlignmentLine alignmentLine0, long v, long v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0x7FC00000L;
        }
        if((v2 & 4) != 0) {
            v1 = 0x7FC00000L;
        }
        return AlignmentLineKt.g(modifier0, alignmentLine0, v, v1);
    }

    @Stable
    @l
    public static final Modifier i(@l Modifier modifier0, float f, float f1) {
        L.p(modifier0, "$this$paddingFromBaseline");
        Modifier modifier1 = Dp.l(f, NaNf) ? Modifier.m0 : AlignmentLineKt.f(Modifier.m0, androidx.compose.ui.layout.AlignmentLineKt.a(), f, 0.0f, 4, null);
        Modifier modifier2 = modifier0.r0(modifier1);
        return Dp.l(f1, NaNf) ? modifier2.r0(Modifier.m0) : modifier2.r0(AlignmentLineKt.f(Modifier.m0, androidx.compose.ui.layout.AlignmentLineKt.b(), 0.0f, f1, 2, null));
    }

    public static Modifier j(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        return AlignmentLineKt.i(modifier0, f, f1);
    }

    @Stable
    @l
    public static final Modifier k(@l Modifier modifier0, long v, long v1) {
        L.p(modifier0, "$this$paddingFromBaseline");
        Modifier modifier1 = TextUnitKt.s(v) ? Modifier.m0 : AlignmentLineKt.h(Modifier.m0, androidx.compose.ui.layout.AlignmentLineKt.a(), v, 0L, 4, null);
        Modifier modifier2 = modifier0.r0(modifier1);
        return TextUnitKt.s(v1) ? modifier2.r0(Modifier.m0) : modifier2.r0(AlignmentLineKt.h(Modifier.m0, androidx.compose.ui.layout.AlignmentLineKt.b(), 0L, v1, 2, null));
    }

    public static Modifier l(Modifier modifier0, long v, long v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0x7FC00000L;
        }
        if((v2 & 2) != 0) {
            v1 = 0x7FC00000L;
        }
        return AlignmentLineKt.k(modifier0, v, v1);
    }
}

