package androidx.compose.foundation.text;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import y4.l;

@s0({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,319:1\n76#2:320\n76#2:321\n76#2:322\n76#2:330\n76#2:332\n76#2:355\n76#2:356\n76#2:357\n76#2:358\n76#2:367\n25#3:323\n286#3,8:338\n294#3,2:352\n25#3:359\n456#3,14:379\n1114#4,6:324\n1114#4,6:360\n120#5:331\n121#5,5:333\n127#5,6:346\n134#5:354\n74#5:366\n75#5,11:368\n88#5:393\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n*L\n81#1:320\n82#1:321\n83#1:322\n139#1:330\n142#1:332\n188#1:355\n189#1:356\n190#1:357\n191#1:358\n253#1:367\n103#1:323\n142#1:338,8\n142#1:352,2\n213#1:359\n253#1:379,14\n103#1:324,6\n213#1:360,6\n142#1:331\n142#1:333,5\n142#1:346,6\n142#1:354\n253#1:366\n253#1:368,11\n253#1:393\n*E\n"})
public final class BasicTextKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @k(level = m.c, message = "Maintained for binary compatibility")
    public static final void a(AnnotatedString annotatedString0, Modifier modifier0, TextStyle textStyle0, Function1 function10, int v, boolean z, int v1, Map map0, Composer composer0, int v2, int v3) {
        Map map1;
        int v6;
        boolean z1;
        Function1 function11;
        TextStyle textStyle1;
        int v5;
        Modifier modifier1;
        int v4;
        L.p(annotatedString0, "text");
        Composer composer1 = composer0.G(0xD9570F18);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.t(annotatedString0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.t(modifier0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.t(textStyle0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.Y(function10) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v4 |= (composer1.z(v) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v4 |= (composer1.v(z) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v4 |= (composer1.z(v1) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0x400000;
        }
        if((v3 & 0x80) != 0x80 || (0x16DB6DB & v4) != 4793490 || !composer1.c()) {
            Modifier modifier2 = (v3 & 2) == 0 ? modifier0 : Modifier.m0;
            TextStyle textStyle2 = (v3 & 4) == 0 ? textStyle0 : TextStyle.d.a();
            Function1 function12 = (v3 & 8) == 0 ? function10 : androidx.compose.foundation.text.BasicTextKt.BasicText.8.e;
            int v7 = (v3 & 16) == 0 ? v : 1;
            boolean z2 = (v3 & 0x20) == 0 ? z : true;
            int v8 = (v3 & 0x40) == 0 ? v1 : 0x7FFFFFFF;
            Map map2 = (v3 & 0x80) == 0 ? map0 : Y.z();
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xD9570F18, v4, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:288)");
            }
            BasicTextKt.d(annotatedString0, modifier2, textStyle2, function12, v7, z2, v8, 1, map2, composer1, 0x8C00000 | v4 & 14 | v4 & 0x70 | v4 & 0x380 | v4 & 0x1C00 | 0xE000 & v4 | v4 & 0x70000 | v4 & 0x380000, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            z1 = z2;
            v5 = v8;
            modifier1 = modifier2;
            textStyle1 = textStyle2;
            function11 = function12;
            v6 = v7;
            map1 = map2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            v5 = v1;
            textStyle1 = textStyle0;
            function11 = function10;
            z1 = z;
            v6 = v;
            map1 = map0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(annotatedString0, modifier1, textStyle1, function11, v6, z1, v5, map1, v2, v3) {
                final AnnotatedString e;
                final Modifier f;
                final TextStyle g;
                final Function1 h;
                final int i;
                final boolean j;
                final int k;
                final Map l;
                final int m;
                final int n;

                {
                    this.e = annotatedString0;
                    this.f = modifier0;
                    this.g = textStyle0;
                    this.h = function10;
                    this.i = v;
                    this.j = z;
                    this.k = v1;
                    this.l = map0;
                    this.m = v2;
                    this.n = v3;
                    super(2);
                }

                public final void a(@y4.m Composer composer0, int v) {
                    BasicTextKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, composer0, (this.m | 1) & -920350135 | ((0x24924924 & (this.m | 1)) >> 1 | 306783378 & (this.m | 1)) | (306783378 & (this.m | 1)) << 1 & (0x24924924 & (this.m | 1)), this.n);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.foundation.text.BasicTextKt.BasicText.8 extends N implements Function1 {
            public static final androidx.compose.foundation.text.BasicTextKt.BasicText.8 e;

            static {
                androidx.compose.foundation.text.BasicTextKt.BasicText.8.e = new androidx.compose.foundation.text.BasicTextKt.BasicText.8();
            }

            androidx.compose.foundation.text.BasicTextKt.BasicText.8() {
                super(1);
            }

            public final void a(@l TextLayoutResult textLayoutResult0) {
                L.p(textLayoutResult0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((TextLayoutResult)object0));
                return S0.a;
            }
        }

    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@l String s, @y4.m Modifier modifier0, @y4.m TextStyle textStyle0, @y4.m Function1 function10, int v, boolean z, int v1, int v2, @y4.m Composer composer0, int v3, int v4) {
        int v8;
        boolean z1;
        TextStyle textStyle2;
        Modifier modifier2;
        Function1 function11;
        int v7;
        int v6;
        int v14;
        int v13;
        TextController textController1;
        SelectionRegistrar selectionRegistrar1;
        TextState textState1;
        SelectionRegistrar selectionRegistrar0;
        TextStyle textStyle1;
        Modifier modifier1;
        int v5;
        L.p(s, "text");
        Composer composer1 = composer0.G(0x5BF3FBC9);
        if((v4 & 1) == 0) {
            v5 = (v3 & 14) == 0 ? (composer1.t(s) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v3 & 0x70) == 0) {
            modifier1 = modifier0;
            v5 |= (composer1.t(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((4 & v4) != 0) {
            v5 |= 0x180;
            textStyle1 = textStyle0;
        }
        else if((v3 & 0x380) == 0) {
            textStyle1 = textStyle0;
            v5 |= (composer1.t(textStyle1) ? 0x100 : 0x80);
        }
        else {
            textStyle1 = textStyle0;
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v3 & 0x1C00) == 0) {
            v5 |= (composer1.Y(function10) ? 0x800 : 0x400);
        }
        if((16 & v4) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0xE000) == 0) {
            v5 |= (composer1.z(v) ? 0x4000 : 0x2000);
        }
        if((0x20 & v4) != 0) {
            v5 |= 0x30000;
        }
        else if((v3 & 0x70000) == 0) {
            v5 |= (composer1.v(z) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x380000) == 0) {
            v5 |= (composer1.z(v1) ? 0x100000 : 0x80000);
        }
        if((0x80 & v4) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0x1C00000) == 0) {
            v5 |= (composer1.z(v2) ? 0x800000 : 0x400000);
        }
        if((v5 & 0x16DB6DB) != 4793490 || !composer1.c()) {
            if((v4 & 2) != 0) {
                modifier1 = Modifier.m0;
            }
            if((4 & v4) != 0) {
                textStyle1 = TextStyle.d.a();
            }
            Function1 function12 = (v4 & 8) == 0 ? function10 : androidx.compose.foundation.text.BasicTextKt.BasicText.1.e;
            int v9 = (16 & v4) == 0 ? v : 1;
            boolean z2 = (0x20 & v4) == 0 ? z : true;
            int v10 = (v4 & 0x40) == 0 ? v1 : 0x7FFFFFFF;
            int v11 = (0x80 & v4) == 0 ? v2 : 1;
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x5BF3FBC9, v3, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:60)");
            }
            HeightInLinesModifierKt.c(v11, v10);
            Object object0 = composer1.L(SelectionRegistrarKt.a());
            Object object1 = composer1.L(CompositionLocalsKt.i());
            Object object2 = composer1.L(CompositionLocalsKt.k());
            composer1.V(0x392CD219);
            long v12 = ((SelectionRegistrar)object0) == null ? 0L : ((Number)RememberSaveableKt.d(new Object[]{s, ((SelectionRegistrar)object0)}, BasicTextKt.e(((SelectionRegistrar)object0)), null, new a(((SelectionRegistrar)object0)) {
                final SelectionRegistrar e;

                {
                    this.e = selectionRegistrar0;
                    super(0);
                }

                @l
                public final Long invoke() {
                    return this.e.e();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.invoke();
                }
            }, composer1, 72, 4)).longValue();
            composer1.g0();
            composer1.V(0xE2A708A4);
            TextController textController0 = composer1.W();
            if(textController0 == Composer.a.a()) {
                AnnotatedString annotatedString0 = new AnnotatedString(s, null, null, 6, null);
                selectionRegistrar0 = (SelectionRegistrar)object0;
                textController0 = new TextController(new TextState(new TextDelegate(annotatedString0, textStyle1, v10, v11, z2, v9, ((Density)object1), ((Resolver)object2), null, 0x100, null), v12));
                composer1.O(textController0);
            }
            else {
                selectionRegistrar0 = (SelectionRegistrar)object0;
            }
            composer1.g0();
            TextState textState0 = textController0.l();
            if(composer1.E()) {
                selectionRegistrar1 = selectionRegistrar0;
                textState1 = textState0;
                textController1 = textController0;
                v13 = v11;
                v14 = v10;
            }
            else {
                textState1 = textState0;
                selectionRegistrar1 = selectionRegistrar0;
                textController1 = textController0;
                v13 = v11;
                v14 = v10;
                textController1.o(CoreTextKt.e(textState0.j(), s, textStyle1, ((Density)object1), ((Resolver)object2), z2, v9, v10, v13));
            }
            textState1.o(function12);
            textController1.p(selectionRegistrar1);
            composer1.V(959240076);
            if(selectionRegistrar1 != null) {
                textState1.r(((TextSelectionColors)composer1.L(TextSelectionColorsKt.c())).a());
            }
            composer1.g0();
            Modifier modifier3 = modifier1.r0(textController1.j());
            MeasurePolicy measurePolicy0 = textController1.i();
            composer1.V(0x207BAF9A);
            Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
            Modifier modifier4 = ComposedModifierKt.k(composer1, modifier3);
            Companion composeUiNode$Companion0 = ComposeUiNode.p0;
            a a0 = composeUiNode$Companion0.a();
            composer1.V(1405779621);
            if(!(composer1.H() instanceof Applier)) {
                ComposablesKt.n();
            }
            composer1.h();
            if(composer1.E()) {
                composer1.k(new a(a0) {
                    final a e;

                    {
                        this.e = a0;
                        super(0);
                    }

                    @Override  // A3.a
                    @l
                    public final Object invoke() {
                        return this.e.invoke();
                    }
                });
            }
            else {
                composer1.f();
            }
            Composer composer2 = Updater.b(composer1);
            Updater.j(composer2, measurePolicy0, composeUiNode$Companion0.d());
            Updater.j(composer2, density0, composeUiNode$Companion0.b());
            Updater.j(composer2, layoutDirection0, composeUiNode$Companion0.c());
            Updater.j(composer2, viewConfiguration0, composeUiNode$Companion0.f());
            Updater.j(composer2, modifier4, composeUiNode$Companion0.e());
            composer1.g();
            composer1.g0();
            composer1.g0();
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier2 = modifier1;
            textStyle2 = textStyle1;
            function11 = function12;
            v7 = v13;
            v6 = v14;
            v8 = v9;
            z1 = z2;
        }
        else {
            composer1.m();
            v6 = v1;
            v7 = v2;
            function11 = function10;
            modifier2 = modifier1;
            textStyle2 = textStyle1;
            z1 = z;
            v8 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(s, modifier2, textStyle2, function11, v8, z1, v6, v7, v3, v4) {
                final String e;
                final Modifier f;
                final TextStyle g;
                final Function1 h;
                final int i;
                final boolean j;
                final int k;
                final int l;
                final int m;
                final int n;

                {
                    this.e = s;
                    this.f = modifier0;
                    this.g = textStyle0;
                    this.h = function10;
                    this.i = v;
                    this.j = z;
                    this.k = v1;
                    this.l = v2;
                    this.m = v3;
                    this.n = v4;
                    super(2);
                }

                public final void a(@y4.m Composer composer0, int v) {
                    BasicTextKt.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, composer0, (this.m | 1) & -920350135 | ((0x24924924 & (this.m | 1)) >> 1 | 306783378 & (this.m | 1)) | (306783378 & (this.m | 1)) << 1 & (0x24924924 & (this.m | 1)), this.n);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.foundation.text.BasicTextKt.BasicText.1 extends N implements Function1 {
            public static final androidx.compose.foundation.text.BasicTextKt.BasicText.1 e;

            static {
                androidx.compose.foundation.text.BasicTextKt.BasicText.1.e = new androidx.compose.foundation.text.BasicTextKt.BasicText.1();
            }

            androidx.compose.foundation.text.BasicTextKt.BasicText.1() {
                super(1);
            }

            public final void a(@l TextLayoutResult textLayoutResult0) {
                L.p(textLayoutResult0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((TextLayoutResult)object0));
                return S0.a;
            }
        }

    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @k(level = m.c, message = "Maintained for binary compatibility")
    public static final void c(String s, Modifier modifier0, TextStyle textStyle0, Function1 function10, int v, boolean z, int v1, Composer composer0, int v2, int v3) {
        boolean z2;
        int v6;
        int v5;
        Function1 function11;
        TextStyle textStyle1;
        Modifier modifier1;
        boolean z1;
        int v4;
        L.p(s, "text");
        Composer composer1 = composer0.G(0x3CF10926);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.t(s) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.t(modifier0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.t(textStyle0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.Y(function10) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v4 |= (composer1.z(v) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) == 0) {
            z1 = z;
            if((v2 & 0x70000) == 0) {
                v4 |= (composer1.v(z1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v4 |= 0x30000;
            z1 = z;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v4 |= (composer1.z(v1) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x2DB6DB) != 0x92492 || !composer1.c()) {
            Modifier modifier2 = (v3 & 2) == 0 ? modifier0 : Modifier.m0;
            TextStyle textStyle2 = (v3 & 4) == 0 ? textStyle0 : TextStyle.d.a();
            Function1 function12 = (v3 & 8) == 0 ? function10 : androidx.compose.foundation.text.BasicTextKt.BasicText.6.e;
            int v7 = (v3 & 16) == 0 ? v : 1;
            if((v3 & 0x20) != 0) {
                z1 = true;
            }
            int v8 = (v3 & 0x40) == 0 ? v1 : 0x7FFFFFFF;
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x3CF10926, v4, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:265)");
            }
            BasicTextKt.b(s, modifier2, textStyle2, function12, v7, z1, v8, 1, composer1, 0xC00000 | v4 & 14 | v4 & 0x70 | v4 & 0x380 | v4 & 0x1C00 | 0xE000 & v4 | 0x70000 & v4 | v4 & 0x380000, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            v5 = v8;
            z2 = z1;
            modifier1 = modifier2;
            textStyle1 = textStyle2;
            function11 = function12;
            v6 = v7;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            textStyle1 = textStyle0;
            function11 = function10;
            v5 = v1;
            v6 = v;
            z2 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(s, modifier1, textStyle1, function11, v6, z2, v5, v2, v3) {
                final String e;
                final Modifier f;
                final TextStyle g;
                final Function1 h;
                final int i;
                final boolean j;
                final int k;
                final int l;
                final int m;

                {
                    this.e = s;
                    this.f = modifier0;
                    this.g = textStyle0;
                    this.h = function10;
                    this.i = v;
                    this.j = z;
                    this.k = v1;
                    this.l = v2;
                    this.m = v3;
                    super(2);
                }

                public final void a(@y4.m Composer composer0, int v) {
                    BasicTextKt.c(this.e, this.f, this.g, this.h, this.i, this.j, this.k, composer0, (this.l | 1) & -920350135 | ((0x24924924 & (this.l | 1)) >> 1 | 306783378 & (this.l | 1)) | (306783378 & (this.l | 1)) << 1 & (0x24924924 & (this.l | 1)), this.m);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.foundation.text.BasicTextKt.BasicText.6 extends N implements Function1 {
            public static final androidx.compose.foundation.text.BasicTextKt.BasicText.6 e;

            static {
                androidx.compose.foundation.text.BasicTextKt.BasicText.6.e = new androidx.compose.foundation.text.BasicTextKt.BasicText.6();
            }

            androidx.compose.foundation.text.BasicTextKt.BasicText.6() {
                super(1);
            }

            public final void a(@l TextLayoutResult textLayoutResult0) {
                L.p(textLayoutResult0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((TextLayoutResult)object0));
                return S0.a;
            }
        }

    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void d(@l AnnotatedString annotatedString0, @y4.m Modifier modifier0, @y4.m TextStyle textStyle0, @y4.m Function1 function10, int v, boolean z, int v1, int v2, @y4.m Map map0, @y4.m Composer composer0, int v3, int v4) {
        Map map1;
        Function1 function12;
        TextStyle textStyle1;
        Modifier modifier2;
        int v8;
        int v7;
        boolean z1;
        int v6;
        int v18;
        Modifier modifier3;
        int v17;
        int v16;
        Map map3;
        SelectionRegistrar selectionRegistrar0;
        long v15;
        Function1 function13;
        List list1;
        List list0;
        long v14;
        Function1 function11;
        Modifier modifier1;
        int v5;
        L.p(annotatedString0, "text");
        Composer composer1 = composer0.G(0x32BF773B);
        if((v4 & 1) == 0) {
            v5 = (v3 & 14) == 0 ? (composer1.t(annotatedString0) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v3 & 0x70) == 0) {
            modifier1 = modifier0;
            v5 |= (composer1.t(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((4 & v4) != 0) {
            v5 |= 0x180;
        }
        else if((v3 & 0x380) == 0) {
            v5 |= (composer1.t(textStyle0) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
            function11 = function10;
        }
        else if((v3 & 0x1C00) == 0) {
            function11 = function10;
            v5 |= (composer1.Y(function11) ? 0x800 : 0x400);
        }
        else {
            function11 = function10;
        }
        if((16 & v4) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0xE000) == 0) {
            v5 |= (composer1.z(v) ? 0x4000 : 0x2000);
        }
        if((0x20 & v4) != 0) {
            v5 |= 0x30000;
        }
        else if((v3 & 0x70000) == 0) {
            v5 |= (composer1.v(z) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x380000) == 0) {
            v5 |= (composer1.z(v1) ? 0x100000 : 0x80000);
        }
        if((0x80 & v4) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0x1C00000) == 0) {
            v5 |= (composer1.z(v2) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x2000000;
        }
        if((v4 & 0x100) != 0x100 || (0xB6DB6DB & v5) != 0x2492492 || !composer1.c()) {
            if((v4 & 2) != 0) {
                modifier1 = Modifier.m0;
            }
            TextStyle textStyle2 = (4 & v4) == 0 ? textStyle0 : TextStyle.d.a();
            if((v4 & 8) != 0) {
                function11 = androidx.compose.foundation.text.BasicTextKt.BasicText.3.e;
            }
            int v9 = (16 & v4) == 0 ? v : 1;
            boolean z2 = (0x20 & v4) == 0 ? z : true;
            int v10 = (v4 & 0x40) == 0 ? v1 : 0x7FFFFFFF;
            int v11 = (0x80 & v4) == 0 ? v2 : 1;
            Map map2 = (v4 & 0x100) == 0 ? map0 : Y.z();
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x32BF773B, v5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:170)");
            }
            HeightInLinesModifierKt.c(v11, v10);
            Object object0 = composer1.L(SelectionRegistrarKt.a());
            Object object1 = composer1.L(CompositionLocalsKt.i());
            Object object2 = composer1.L(CompositionLocalsKt.k());
            long v12 = ((TextSelectionColors)composer1.L(TextSelectionColorsKt.c())).a();
            V v13 = CoreTextKt.b(annotatedString0, map2);
            Object object3 = v13.a();
            Object object4 = v13.b();
            composer1.V(959243860);
            if(((SelectionRegistrar)object0) == null) {
                v14 = 0L;
                list0 = (List)object4;
            }
            else {
                Saver saver0 = BasicTextKt.e(((SelectionRegistrar)object0));
                list0 = (List)object4;
                v14 = ((Number)RememberSaveableKt.d(new Object[]{annotatedString0, ((SelectionRegistrar)object0)}, saver0, null, new a(((SelectionRegistrar)object0)) {
                    final SelectionRegistrar e;

                    {
                        this.e = selectionRegistrar0;
                        super(0);
                    }

                    @l
                    public final Long invoke() {
                        return this.e.e();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }, composer1, 72, 4)).longValue();
            }
            composer1.g0();
            composer1.V(0xE2A708A4);
            TextController textController0 = composer1.W();
            if(textController0 == Composer.a.a()) {
                list1 = list0;
                function13 = function11;
                v15 = v12;
                selectionRegistrar0 = (SelectionRegistrar)object0;
                map3 = map2;
                v16 = v5;
                v17 = v11;
                modifier3 = modifier1;
                v18 = v10;
                TextController textController1 = new TextController(new TextState(new TextDelegate(annotatedString0, textStyle2, v10, v11, z2, v9, ((Density)object1), ((Resolver)object2), ((List)object3), null), v14));
                composer1.O(textController1);
                textController0 = textController1;
            }
            else {
                list1 = list0;
                v15 = v12;
                selectionRegistrar0 = (SelectionRegistrar)object0;
                map3 = map2;
                v16 = v5;
                v17 = v11;
                modifier3 = modifier1;
                v18 = v10;
                function13 = function11;
            }
            composer1.g0();
            TextState textState0 = textController0.l();
            if(!composer1.E()) {
                textController0.o(CoreTextKt.c(textState0.j(), annotatedString0, textStyle2, ((Density)object1), ((Resolver)object2), z2, v9, v18, v17, ((List)object3)));
            }
            textState0.o(function13);
            textState0.r(v15);
            textController0.p(selectionRegistrar0);
            o o0 = list1.isEmpty() ? ComposableSingletons.BasicTextKt.a.a() : ComposableLambdaKt.b(composer1, 0x6845F796, true, new o(annotatedString0, list1, v16) {
                final AnnotatedString e;
                final List f;
                final int g;

                {
                    this.e = annotatedString0;
                    this.f = list0;
                    this.g = v;
                    super(2);
                }

                @Composable
                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                public final void a(@y4.m Composer composer0, int v) {
                    if((v & 11) == 2 && composer0.c()) {
                        composer0.m();
                        return;
                    }
                    if(ComposerKt.g0()) {
                        ComposerKt.w0(0x6845F796, v, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:256)");
                    }
                    CoreTextKt.a(this.e, this.f, composer0, this.g & 14 | 0x40);
                    if(ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
            Modifier modifier4 = modifier3.r0(textController0.j());
            MeasurePolicy measurePolicy0 = textController0.i();
            composer1.V(-1323940314);
            Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
            Companion composeUiNode$Companion0 = ComposeUiNode.p0;
            a a0 = composeUiNode$Companion0.a();
            p p0 = LayoutKt.f(modifier4);
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
            Updater.j(composer2, measurePolicy0, composeUiNode$Companion0.d());
            Updater.j(composer2, density0, composeUiNode$Companion0.b());
            Updater.j(composer2, layoutDirection0, composeUiNode$Companion0.c());
            Updater.j(composer2, viewConfiguration0, composeUiNode$Companion0.f());
            p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer1)), composer1, 0);
            composer1.V(2058660585);
            o0.invoke(composer1, 0);
            composer1.g0();
            composer1.g();
            composer1.g0();
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier2 = modifier3;
            function12 = function13;
            v6 = v9;
            v7 = v18;
            textStyle1 = textStyle2;
            z1 = z2;
            map1 = map3;
            v8 = v17;
        }
        else {
            composer1.m();
            v6 = v;
            z1 = z;
            v7 = v1;
            v8 = v2;
            modifier2 = modifier1;
            textStyle1 = textStyle0;
            function12 = function11;
            map1 = map0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(annotatedString0, modifier2, textStyle1, function12, v6, z1, v7, v8, map1, v3, v4) {
                final AnnotatedString e;
                final Modifier f;
                final TextStyle g;
                final Function1 h;
                final int i;
                final boolean j;
                final int k;
                final int l;
                final Map m;
                final int n;
                final int o;

                {
                    this.e = annotatedString0;
                    this.f = modifier0;
                    this.g = textStyle0;
                    this.h = function10;
                    this.i = v;
                    this.j = z;
                    this.k = v1;
                    this.l = v2;
                    this.m = map0;
                    this.n = v3;
                    this.o = v4;
                    super(2);
                }

                public final void a(@y4.m Composer composer0, int v) {
                    BasicTextKt.d(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, composer0, (this.n | 1) & -920350135 | ((0x24924924 & (this.n | 1)) >> 1 | 306783378 & (this.n | 1)) | (306783378 & (this.n | 1)) << 1 & (0x24924924 & (this.n | 1)), this.o);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.foundation.text.BasicTextKt.BasicText.3 extends N implements Function1 {
            public static final androidx.compose.foundation.text.BasicTextKt.BasicText.3 e;

            static {
                androidx.compose.foundation.text.BasicTextKt.BasicText.3.e = new androidx.compose.foundation.text.BasicTextKt.BasicText.3();
            }

            androidx.compose.foundation.text.BasicTextKt.BasicText.3() {
                super(1);
            }

            public final void a(@l TextLayoutResult textLayoutResult0) {
                L.p(textLayoutResult0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((TextLayoutResult)object0));
                return S0.a;
            }
        }

    }

    private static final Saver e(SelectionRegistrar selectionRegistrar0) {
        return SaverKt.a(new o(selectionRegistrar0) {
            final SelectionRegistrar e;

            {
                this.e = selectionRegistrar0;
                super(2);
            }

            @y4.m
            public final Long a(@l SaverScope saverScope0, long v) {
                L.p(saverScope0, "$this$Saver");
                return SelectionRegistrarKt.b(this.e, v) ? v : null;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((SaverScope)object0), ((Number)object1).longValue());
            }
        }, androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.2.e);

        final class androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.2 extends N implements Function1 {
            public static final androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.2 e;

            static {
                androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.2.e = new androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.2();
            }

            androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.2() {
                super(1);
            }

            @y4.m
            public final Long a(long v) {
                return v;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).longValue());
            }
        }

    }
}

