package androidx.compose.foundation.text;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,702:1\n33#2,4:703\n38#2:738\n33#2,6:739\n71#3,4:707\n75#3,11:712\n88#3:737\n76#4:711\n456#5,14:723\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt\n*L\n81#1:703,4\n81#1:738\n682#1:739,6\n82#1:707,4\n82#1:712,11\n82#1:737\n82#1:711\n82#1:723,14\n*E\n"})
public final class CoreTextKt {
    @l
    private static final V a;

    static {
        CoreTextKt.a = new V(u.H(), u.H());
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@l AnnotatedString annotatedString0, @l List list0, @m Composer composer0, int v) {
        L.p(annotatedString0, "text");
        L.p(list0, "inlineContents");
        Composer composer1 = composer0.G(-110905764);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-110905764, v, -1, "androidx.compose.foundation.text.InlineChildren (CoreText.kt:76)");
        }
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Range annotatedString$Range0 = (Range)list0.get(v2);
            p p0 = (p)annotatedString$Range0.a();
            int v3 = annotatedString$Range0.b();
            int v4 = annotatedString$Range0.c();
            androidx.compose.foundation.text.CoreTextKt.InlineChildren.1.2 coreTextKt$InlineChildren$1$20 = androidx.compose.foundation.text.CoreTextKt.InlineChildren.1.2.a;
            composer1.V(-1323940314);
            Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
            Companion composeUiNode$Companion0 = ComposeUiNode.p0;
            a a0 = composeUiNode$Companion0.a();
            p p1 = LayoutKt.f(Modifier.m0);
            if(!(composer1.H() instanceof Applier)) {
                ComposablesKt.n();
            }
            composer1.h();
            if(composer1.E()) {
                composer1.k(a0);
            }
            else {
                composer1.f();
            }
            Composer composer2 = Updater.b(composer1);
            Updater.j(composer2, coreTextKt$InlineChildren$1$20, composeUiNode$Companion0.d());
            Updater.j(composer2, density0, composeUiNode$Companion0.b());
            Updater.j(composer2, layoutDirection0, composeUiNode$Companion0.c());
            Updater.j(composer2, viewConfiguration0, composeUiNode$Companion0.f());
            p1.invoke(SkippableUpdater.a(SkippableUpdater.b(composer1)), composer1, 0);
            composer1.V(2058660585);
            p0.invoke(annotatedString0.o(v3, v4).j(), composer1, 0);
            composer1.g0();
            composer1.g();
            composer1.g0();
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(annotatedString0, list0, v) {
                final AnnotatedString e;
                final List f;
                final int g;

                {
                    this.e = annotatedString0;
                    this.f = list0;
                    this.g = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    CoreTextKt.a(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        @s0({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt$InlineChildren$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,702:1\n151#2,3:703\n33#2,4:706\n154#2,2:710\n38#2:712\n156#2:713\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt$InlineChildren$1$2\n*L\n85#1:703,3\n85#1:706,4\n85#1:710,2\n85#1:712\n85#1:713\n*E\n"})
        final class androidx.compose.foundation.text.CoreTextKt.InlineChildren.1.2 implements MeasurePolicy {
            public static final androidx.compose.foundation.text.CoreTextKt.InlineChildren.1.2 a;

            static {
                androidx.compose.foundation.text.CoreTextKt.InlineChildren.1.2.a = new androidx.compose.foundation.text.CoreTextKt.InlineChildren.1.2();
            }

            androidx.compose.foundation.text.CoreTextKt.InlineChildren.1.2() {
                super();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            @l
            public final MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
                L.p(measureScope0, "$this$Layout");
                L.p(list0, "children");
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v1 = list0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    arrayList0.add(((Measurable)list0.get(v2)).r1(v));
                }
                return MeasureScope.-CC.p(measureScope0, Constraints.p(v), Constraints.o(v), null, new Function1() {
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
                            PlacementScope.v(placeable$PlacementScope0, ((Placeable)list0.get(v1)), 0, 0, 0.0f, 4, null);
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
            public int b(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return e.c(this, intrinsicMeasureScope0, list0, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int c(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return e.d(this, intrinsicMeasureScope0, list0, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int d(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return e.a(this, intrinsicMeasureScope0, list0, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int e(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return e.b(this, intrinsicMeasureScope0, list0, v);
            }
        }

    }

    @l
    public static final V b(@l AnnotatedString annotatedString0, @l Map map0) {
        L.p(annotatedString0, "text");
        L.p(map0, "inlineContent");
        if(map0.isEmpty()) {
            return CoreTextKt.a;
        }
        List list0 = annotatedString0.i("androidx.compose.foundation.text.inlineContent", 0, annotatedString0.length());
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        int v1 = list0.size();
        for(int v = 0; v < v1; ++v) {
            Range annotatedString$Range0 = (Range)list0.get(v);
            InlineTextContent inlineTextContent0 = (InlineTextContent)map0.get(annotatedString$Range0.h());
            if(inlineTextContent0 != null) {
                arrayList0.add(new Range(inlineTextContent0.b(), annotatedString$Range0.i(), annotatedString$Range0.g()));
                arrayList1.add(new Range(inlineTextContent0.a(), annotatedString$Range0.i(), annotatedString$Range0.g()));
            }
        }
        return new V(arrayList0, arrayList1);
    }

    @l
    public static final TextDelegate c(@l TextDelegate textDelegate0, @l AnnotatedString annotatedString0, @l TextStyle textStyle0, @l Density density0, @l Resolver fontFamily$Resolver0, boolean z, int v, int v1, int v2, @l List list0) {
        L.p(textDelegate0, "current");
        L.p(annotatedString0, "text");
        L.p(textStyle0, "style");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        L.p(list0, "placeholders");
        return !L.g(textDelegate0.n(), annotatedString0) || !L.g(textDelegate0.m(), textStyle0) || textDelegate0.l() != z || !TextOverflow.g(textDelegate0.i(), v) || textDelegate0.e() != v1 || textDelegate0.g() != v2 || !L.g(textDelegate0.a(), density0) || !L.g(textDelegate0.k(), list0) || textDelegate0.b() != fontFamily$Resolver0 ? new TextDelegate(annotatedString0, textStyle0, v1, v2, z, v, density0, fontFamily$Resolver0, list0, null) : textDelegate0;
    }

    public static TextDelegate d(TextDelegate textDelegate0, AnnotatedString annotatedString0, TextStyle textStyle0, Density density0, Resolver fontFamily$Resolver0, boolean z, int v, int v1, int v2, List list0, int v3, Object object0) {
        boolean z1 = (v3 & 0x20) == 0 ? z : true;
        int v4 = (v3 & 0x40) == 0 ? v : 1;
        int v5 = (v3 & 0x80) == 0 ? v1 : 0x7FFFFFFF;
        return (v3 & 0x100) == 0 ? CoreTextKt.c(textDelegate0, annotatedString0, textStyle0, density0, fontFamily$Resolver0, z1, v4, v5, v2, list0) : CoreTextKt.c(textDelegate0, annotatedString0, textStyle0, density0, fontFamily$Resolver0, z1, v4, v5, 1, list0);
    }

    @l
    public static final TextDelegate e(@l TextDelegate textDelegate0, @l String s, @l TextStyle textStyle0, @l Density density0, @l Resolver fontFamily$Resolver0, boolean z, int v, int v1, int v2) {
        L.p(textDelegate0, "current");
        L.p(s, "text");
        L.p(textStyle0, "style");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        return !L.g(textDelegate0.n().j(), s) || !L.g(textDelegate0.m(), textStyle0) || textDelegate0.l() != z || !TextOverflow.g(textDelegate0.i(), v) || textDelegate0.e() != v1 || textDelegate0.g() != v2 || !L.g(textDelegate0.a(), density0) || textDelegate0.b() != fontFamily$Resolver0 ? new TextDelegate(new AnnotatedString(s, null, null, 6, null), textStyle0, v1, v2, z, v, density0, fontFamily$Resolver0, null, 0x100, null) : textDelegate0;
    }

    public static TextDelegate f(TextDelegate textDelegate0, String s, TextStyle textStyle0, Density density0, Resolver fontFamily$Resolver0, boolean z, int v, int v1, int v2, int v3, Object object0) {
        boolean z1 = (v3 & 0x20) == 0 ? z : true;
        int v4 = (v3 & 0x40) == 0 ? v : 1;
        int v5 = (v3 & 0x80) == 0 ? v1 : 0x7FFFFFFF;
        return (v3 & 0x100) == 0 ? CoreTextKt.e(textDelegate0, s, textStyle0, density0, fontFamily$Resolver0, z1, v4, v5, v2) : CoreTextKt.e(textDelegate0, s, textStyle0, density0, fontFamily$Resolver0, z1, v4, v5, 1);
    }
}

