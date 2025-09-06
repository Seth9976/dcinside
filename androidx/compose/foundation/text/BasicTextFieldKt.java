package androidx.compose.foundation.text;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import y4.l;
import y4.m;

@s0({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,390:1\n25#2:391\n25#2:398\n50#2:405\n49#2:406\n36#2:413\n67#2,3:420\n66#2:423\n25#2:430\n50#2:437\n49#2:438\n25#2:445\n25#2:452\n1114#3,6:392\n1114#3,6:399\n1114#3,6:407\n1114#3,6:414\n1114#3,6:424\n1114#3,6:431\n1114#3,6:439\n1114#3,6:446\n1114#3,6:453\n76#4:459\n102#4,2:460\n76#4:462\n102#4,2:463\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n*L\n137#1:391\n144#1:398\n150#1:405\n150#1:406\n159#1:413\n163#1:420,3\n163#1:423\n283#1:430\n290#1:437\n290#1:438\n327#1:445\n367#1:452\n137#1:392,6\n144#1:399,6\n150#1:407,6\n159#1:414,6\n163#1:424,6\n283#1:431,6\n290#1:439,6\n327#1:446,6\n367#1:453,6\n144#1:459\n144#1:460,2\n159#1:462\n159#1:463,2\n*E\n"})
public final class BasicTextFieldKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    public static final void a(@l TextFieldValue textFieldValue0, @l Function1 function10, @m Modifier modifier0, boolean z, boolean z1, @m TextStyle textStyle0, @m KeyboardOptions keyboardOptions0, @m KeyboardActions keyboardActions0, boolean z2, int v, int v1, @m VisualTransformation visualTransformation0, @m Function1 function11, @m MutableInteractionSource mutableInteractionSource0, @m Brush brush0, @m p p0, @m Composer composer0, int v2, int v3, int v4) {
        int v11;
        p p1;
        Brush brush1;
        MutableInteractionSource mutableInteractionSource1;
        Function1 function12;
        VisualTransformation visualTransformation1;
        int v10;
        boolean z5;
        KeyboardActions keyboardActions1;
        KeyboardOptions keyboardOptions1;
        TextStyle textStyle1;
        boolean z4;
        boolean z3;
        Modifier modifier1;
        int v14;
        p p2;
        Brush brush2;
        MutableInteractionSource mutableInteractionSource2;
        Function1 function13;
        VisualTransformation visualTransformation2;
        int v13;
        int v12;
        boolean z8;
        KeyboardActions keyboardActions2;
        KeyboardOptions keyboardOptions2;
        TextStyle textStyle2;
        boolean z7;
        boolean z6;
        Modifier modifier2;
        Brush brush3;
        int v17;
        MutableInteractionSource mutableInteractionSource5;
        MutableInteractionSource mutableInteractionSource4;
        boolean z12;
        int v15;
        int v8;
        int v5;
        L.p(textFieldValue0, "value");
        L.p(function10, "onValueChange");
        Composer composer1 = composer0.G(1804514146);
        if((v4 & 1) == 0) {
            v5 = (v2 & 14) == 0 ? (composer1.t(textFieldValue0) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.Y(function10) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v5 |= (composer1.t(modifier0) ? 0x100 : 0x80);
        }
        int v6 = 0x400;
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v5 |= (composer1.v(z) ? 0x800 : 0x400);
        }
        int v7 = 0x2000;
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v5 |= (composer1.v(z1) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v5 |= (composer1.t(textStyle0) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v5 |= (composer1.t(keyboardOptions0) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v5 |= (composer1.t(keyboardActions0) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v2 & 0xE000000) == 0) {
            v5 |= (composer1.v(z2) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x70000000) == 0) {
            v5 |= ((v4 & 0x200) != 0 || !composer1.z(v) ? 0x10000000 : 0x20000000);
        }
        if((v4 & 0x400) == 0) {
            v8 = (v3 & 14) == 0 ? v3 | (composer1.z(v1) ? 4 : 2) : v3;
        }
        else {
            v8 = v3 | 6;
        }
        if((v4 & 0x800) != 0) {
            v8 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v8 |= (composer1.t(visualTransformation0) ? 0x20 : 16);
        }
        int v9 = v8;
        if((v4 & 0x1000) != 0) {
            v9 |= 0x180;
        }
        else if((v3 & 0x380) == 0) {
            v9 |= (composer1.Y(function11) ? 0x100 : 0x80);
        }
        if((v4 & 0x2000) != 0) {
            v9 |= 0xC00;
        }
        else if((v3 & 0x1C00) == 0) {
            if(composer1.t(mutableInteractionSource0)) {
                v6 = 0x800;
            }
            v9 |= v6;
        }
        if((v4 & 0x4000) != 0) {
            v9 |= 0x6000;
        }
        else if((v3 & 0xE000) == 0) {
            if(composer1.t(brush0)) {
                v7 = 0x4000;
            }
            v9 |= v7;
        }
        if((v4 & 0x8000) != 0) {
            v9 |= 0x30000;
        }
        else if((v3 & 0x70000) == 0) {
            v9 |= (composer1.Y(p0) ? 0x20000 : 0x10000);
        }
        if((v5 & 0x5B6DB6DB) != 306783378 || (0x5B6DB & v9) != 74898 || !composer1.c()) {
            composer1.Z();
            if((v2 & 1) == 0 || composer1.p()) {
                Modifier modifier3 = (v4 & 4) == 0 ? modifier0 : Modifier.m0;
                boolean z9 = (v4 & 8) == 0 ? z : true;
                boolean z10 = (v4 & 16) == 0 ? z1 : false;
                TextStyle textStyle3 = (v4 & 0x20) == 0 ? textStyle0 : TextStyle.d.a();
                KeyboardOptions keyboardOptions3 = (v4 & 0x40) == 0 ? keyboardOptions0 : KeyboardOptions.e.a();
                KeyboardActions keyboardActions3 = (v4 & 0x80) == 0 ? keyboardActions0 : KeyboardActions.g.a();
                boolean z11 = (v4 & 0x100) == 0 ? z2 : false;
                if((v4 & 0x200) == 0) {
                    v15 = v;
                }
                else {
                    v15 = z11 ? 1 : 0x7FFFFFFF;
                    v5 &= 0x8FFFFFFF;
                }
                int v16 = (v4 & 0x400) == 0 ? v1 : 1;
                VisualTransformation visualTransformation3 = (v4 & 0x800) == 0 ? visualTransformation0 : VisualTransformation.a.a();
                Function1 function14 = (v4 & 0x1000) == 0 ? function11 : androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.6.e;
                if((v4 & 0x2000) == 0) {
                    z12 = z11;
                    mutableInteractionSource4 = mutableInteractionSource0;
                }
                else {
                    composer1.V(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.W();
                    z12 = z11;
                    if(mutableInteractionSource3 == Composer.a.a()) {
                        mutableInteractionSource3 = InteractionSourceKt.a();
                        composer1.O(mutableInteractionSource3);
                    }
                    composer1.g0();
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                if((v4 & 0x4000) == 0) {
                    mutableInteractionSource5 = mutableInteractionSource4;
                    v17 = v5;
                    brush3 = brush0;
                }
                else {
                    mutableInteractionSource5 = mutableInteractionSource4;
                    v17 = v5;
                    brush3 = new SolidColor(0xFF00000000000000L, null);
                }
                if((v4 & 0x8000) == 0) {
                    v14 = v17;
                    mutableInteractionSource2 = mutableInteractionSource5;
                    p2 = p0;
                    v13 = v16;
                    visualTransformation2 = visualTransformation3;
                    modifier2 = modifier3;
                    function13 = function14;
                    keyboardActions2 = keyboardActions3;
                    brush2 = brush3;
                    z6 = z9;
                    v12 = v15;
                    z7 = z10;
                    textStyle2 = textStyle3;
                    keyboardOptions2 = keyboardOptions3;
                    z8 = z12;
                }
                else {
                    mutableInteractionSource2 = mutableInteractionSource5;
                    p2 = ComposableSingletons.BasicTextFieldKt.a.b();
                    v13 = v16;
                    visualTransformation2 = visualTransformation3;
                    modifier2 = modifier3;
                    function13 = function14;
                    keyboardActions2 = keyboardActions3;
                    brush2 = brush3;
                    z6 = z9;
                    v12 = v15;
                    z7 = z10;
                    textStyle2 = textStyle3;
                    keyboardOptions2 = keyboardOptions3;
                    z8 = z12;
                    v14 = v17;
                }
            }
            else {
                composer1.m();
                if((v4 & 0x200) != 0) {
                    v5 &= 0x8FFFFFFF;
                }
                modifier2 = modifier0;
                z6 = z;
                z7 = z1;
                textStyle2 = textStyle0;
                keyboardOptions2 = keyboardOptions0;
                keyboardActions2 = keyboardActions0;
                z8 = z2;
                v12 = v;
                v13 = v1;
                visualTransformation2 = visualTransformation0;
                function13 = function11;
                mutableInteractionSource2 = mutableInteractionSource0;
                brush2 = brush0;
                p2 = p0;
                v14 = v5;
            }
            composer1.P();
            if(ComposerKt.g0()) {
                ComposerKt.w0(1804514146, v14, v9, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:268)");
            }
            ImeOptions imeOptions0 = keyboardOptions2.h(z8);
            composer1.V(0x1E7B2B64);
            boolean z13 = composer1.t(textFieldValue0);
            boolean z14 = composer1.t(function10);
            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.8.1 basicTextFieldKt$BasicTextField$8$10 = composer1.W();
            if(z13 || z14 || basicTextFieldKt$BasicTextField$8$10 == Composer.a.a()) {
                basicTextFieldKt$BasicTextField$8$10 = new Function1(textFieldValue0, function10) {
                    final TextFieldValue e;
                    final Function1 f;

                    {
                        this.e = textFieldValue0;
                        this.f = function10;
                        super(1);
                    }

                    public final void a(@l TextFieldValue textFieldValue0) {
                        L.p(textFieldValue0, "it");
                        if(!L.g(this.e, textFieldValue0)) {
                            this.f.invoke(textFieldValue0);
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((TextFieldValue)object0));
                        return S0.a;
                    }
                };
                composer1.O(basicTextFieldKt$BasicTextField$8$10);
            }
            composer1.g0();
            CoreTextFieldKt.a(textFieldValue0, basicTextFieldKt$BasicTextField$8$10, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, !z8, (z8 ? 1 : v12), (z8 ? 1 : v13), imeOptions0, keyboardActions2, z6, z7, p2, composer1, v14 & 910 | v14 >> 6 & 0x1C00 | v9 << 9 & 0xE000 | v9 << 9 & 0x70000 | 0x380000 & v9 << 9 | v9 << 9 & 0x1C00000, v14 & 0xE000 | (v14 >> 15 & 0x380 | v14 & 0x1C00) | v9 & 0x70000, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            z3 = z6;
            z4 = z7;
            textStyle1 = textStyle2;
            z5 = z8;
            keyboardActions1 = keyboardActions2;
            v11 = v12;
            v10 = v13;
            visualTransformation1 = visualTransformation2;
            function12 = function13;
            keyboardOptions1 = keyboardOptions2;
            mutableInteractionSource1 = mutableInteractionSource2;
            brush1 = brush2;
            p1 = p2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            z3 = z;
            z4 = z1;
            textStyle1 = textStyle0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActions1 = keyboardActions0;
            z5 = z2;
            v10 = v1;
            visualTransformation1 = visualTransformation0;
            function12 = function11;
            mutableInteractionSource1 = mutableInteractionSource0;
            brush1 = brush0;
            p1 = p0;
            v11 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(textFieldValue0, function10, modifier1, z3, z4, textStyle1, keyboardOptions1, keyboardActions1, z5, v11, v10, visualTransformation1, function12, mutableInteractionSource1, brush1, p1, v2, v3, v4) {
                final TextFieldValue e;
                final Function1 f;
                final Modifier g;
                final boolean h;
                final boolean i;
                final TextStyle j;
                final KeyboardOptions k;
                final KeyboardActions l;
                final boolean m;
                final int n;
                final int o;
                final VisualTransformation p;
                final Function1 q;
                final MutableInteractionSource r;
                final Brush s;
                final p t;
                final int u;
                final int v;
                final int w;

                {
                    this.e = textFieldValue0;
                    this.f = function10;
                    this.g = modifier0;
                    this.h = z;
                    this.i = z1;
                    this.j = textStyle0;
                    this.k = keyboardOptions0;
                    this.l = keyboardActions0;
                    this.m = z2;
                    this.n = v;
                    this.o = v1;
                    this.p = visualTransformation0;
                    this.q = function11;
                    this.r = mutableInteractionSource0;
                    this.s = brush0;
                    this.t = p0;
                    this.u = v2;
                    this.v = v3;
                    this.w = v4;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    BasicTextFieldKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, composer0, (this.u | 1) & -920350135 | ((0x24924924 & (this.u | 1)) >> 1 | 306783378 & (this.u | 1)) | (306783378 & (this.u | 1)) << 1 & (0x24924924 & (this.u | 1)), this.v & -920350135 | ((0x24924924 & this.v) >> 1 | 306783378 & this.v) | (306783378 & this.v) << 1 & (0x24924924 & this.v), this.w);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.6 extends N implements Function1 {
            public static final androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.6 e;

            static {
                androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.6.e = new androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.6();
            }

            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.6() {
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
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @k(level = kotlin.m.c, message = "Maintained for binary compatibility")
    public static final void b(TextFieldValue textFieldValue0, Function1 function10, Modifier modifier0, boolean z, boolean z1, TextStyle textStyle0, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, boolean z2, int v, VisualTransformation visualTransformation0, Function1 function11, MutableInteractionSource mutableInteractionSource0, Brush brush0, p p0, Composer composer0, int v1, int v2, int v3) {
        boolean z5;
        p p1;
        Brush brush1;
        MutableInteractionSource mutableInteractionSource1;
        Function1 function12;
        VisualTransformation visualTransformation1;
        int v9;
        KeyboardActions keyboardActions1;
        KeyboardOptions keyboardOptions1;
        TextStyle textStyle1;
        boolean z4;
        boolean z3;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource3;
        int v7;
        int v4;
        L.p(textFieldValue0, "value");
        L.p(function10, "onValueChange");
        Composer composer1 = composer0.G(-560482651);
        if((v3 & 1) == 0) {
            v4 = (v1 & 14) == 0 ? (composer1.t(textFieldValue0) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v4 |= (composer1.Y(function10) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v4 |= (composer1.t(modifier0) ? 0x100 : 0x80);
        }
        int v5 = 0x400;
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v4 |= (composer1.v(z) ? 0x800 : 0x400);
        }
        int v6 = 0x2000;
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            v4 |= (composer1.v(z1) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x70000) == 0) {
            v4 |= (composer1.t(textStyle0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v4 |= (composer1.t(keyboardOptions0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v1 & 0x1C00000) == 0) {
            v4 |= (composer1.t(keyboardActions0) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v1 & 0xE000000) == 0) {
            v4 |= (composer1.v(z2) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((v1 & 0x70000000) == 0) {
            v4 |= (composer1.z(v) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v7 = (v2 & 14) == 0 ? v2 | (composer1.t(visualTransformation0) ? 4 : 2) : v2;
        }
        else {
            v7 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v7 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v7 |= (composer1.Y(function11) ? 0x20 : 16);
        }
        int v8 = v7;
        if((v3 & 0x1000) != 0) {
            v8 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v8 |= (composer1.t(mutableInteractionSource0) ? 0x100 : 0x80);
        }
        if((v3 & 0x2000) != 0) {
            v8 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            if(composer1.t(brush0)) {
                v5 = 0x800;
            }
            v8 |= v5;
        }
        if((v3 & 0x4000) != 0) {
            v8 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            if(composer1.Y(p0)) {
                v6 = 0x4000;
            }
            v8 |= v6;
        }
        if((v4 & 0x5B6DB6DB) != 306783378 || (0xB6DB & v8) != 9362 || !composer1.c()) {
            Modifier modifier2 = (v3 & 4) == 0 ? modifier0 : Modifier.m0;
            boolean z6 = (v3 & 8) == 0 ? z : true;
            boolean z7 = (v3 & 16) == 0 ? z1 : false;
            TextStyle textStyle2 = (v3 & 0x20) == 0 ? textStyle0 : TextStyle.d.a();
            KeyboardOptions keyboardOptions2 = (v3 & 0x40) == 0 ? keyboardOptions0 : KeyboardOptions.e.a();
            KeyboardActions keyboardActions2 = (v3 & 0x80) == 0 ? keyboardActions0 : KeyboardActions.g.a();
            boolean z8 = (v3 & 0x100) == 0 ? z2 : false;
            int v10 = (v3 & 0x200) == 0 ? v : 0x7FFFFFFF;
            VisualTransformation visualTransformation2 = (v3 & 0x400) == 0 ? visualTransformation0 : VisualTransformation.a.a();
            Function1 function13 = (v3 & 0x800) == 0 ? function11 : androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.13.e;
            if((v3 & 0x1000) == 0) {
                mutableInteractionSource3 = mutableInteractionSource0;
            }
            else {
                composer1.V(0xE2A708A4);
                MutableInteractionSource mutableInteractionSource2 = composer1.W();
                if(mutableInteractionSource2 == Composer.a.a()) {
                    mutableInteractionSource2 = InteractionSourceKt.a();
                    composer1.O(mutableInteractionSource2);
                }
                composer1.g0();
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            Brush brush2 = (v3 & 0x2000) == 0 ? brush0 : new SolidColor(0xFF00000000000000L, null);
            p p2 = (v3 & 0x4000) == 0 ? p0 : ComposableSingletons.BasicTextFieldKt.a.d();
            if(ComposerKt.g0()) {
                ComposerKt.w0(-560482651, v4, v8, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:353)");
            }
            BasicTextFieldKt.a(textFieldValue0, function10, modifier2, z6, z7, textStyle2, keyboardOptions2, keyboardActions2, z8, v10, 1, visualTransformation2, function13, mutableInteractionSource3, brush2, p2, composer1, v4 & 0x7FFFFFFE, v8 << 3 & 0x70 | 6 | v8 << 3 & 0x380 | v8 << 3 & 0x1C00 | v8 << 3 & 0xE000 | v8 << 3 & 0x70000, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            z3 = z6;
            z4 = z7;
            textStyle1 = textStyle2;
            keyboardOptions1 = keyboardOptions2;
            keyboardActions1 = keyboardActions2;
            z5 = z8;
            v9 = v10;
            visualTransformation1 = visualTransformation2;
            function12 = function13;
            mutableInteractionSource1 = mutableInteractionSource3;
            brush1 = brush2;
            p1 = p2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            z3 = z;
            z4 = z1;
            textStyle1 = textStyle0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActions1 = keyboardActions0;
            v9 = v;
            visualTransformation1 = visualTransformation0;
            function12 = function11;
            mutableInteractionSource1 = mutableInteractionSource0;
            brush1 = brush0;
            p1 = p0;
            z5 = z2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(textFieldValue0, function10, modifier1, z3, z4, textStyle1, keyboardOptions1, keyboardActions1, z5, v9, visualTransformation1, function12, mutableInteractionSource1, brush1, p1, v1, v2, v3) {
                final TextFieldValue e;
                final Function1 f;
                final Modifier g;
                final boolean h;
                final boolean i;
                final TextStyle j;
                final KeyboardOptions k;
                final KeyboardActions l;
                final boolean m;
                final int n;
                final VisualTransformation o;
                final Function1 p;
                final MutableInteractionSource q;
                final Brush r;
                final p s;
                final int t;
                final int u;
                final int v;

                {
                    this.e = textFieldValue0;
                    this.f = function10;
                    this.g = modifier0;
                    this.h = z;
                    this.i = z1;
                    this.j = textStyle0;
                    this.k = keyboardOptions0;
                    this.l = keyboardActions0;
                    this.m = z2;
                    this.n = v;
                    this.o = visualTransformation0;
                    this.p = function11;
                    this.q = mutableInteractionSource0;
                    this.r = brush0;
                    this.s = p0;
                    this.t = v1;
                    this.u = v2;
                    this.v = v3;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    BasicTextFieldKt.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, composer0, (this.t | 1) & -920350135 | ((0x24924924 & (this.t | 1)) >> 1 | 306783378 & (this.t | 1)) | (306783378 & (this.t | 1)) << 1 & (0x24924924 & (this.t | 1)), this.u & -920350135 | ((0x24924924 & this.u) >> 1 | 306783378 & this.u) | (306783378 & this.u) << 1 & (0x24924924 & this.u), this.v);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.13 extends N implements Function1 {
            public static final androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.13 e;

            static {
                androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.13.e = new androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.13();
            }

            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.13() {
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
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    public static final void c(@l String s, @l Function1 function10, @m Modifier modifier0, boolean z, boolean z1, @m TextStyle textStyle0, @m KeyboardOptions keyboardOptions0, @m KeyboardActions keyboardActions0, boolean z2, int v, int v1, @m VisualTransformation visualTransformation0, @m Function1 function11, @m MutableInteractionSource mutableInteractionSource0, @m Brush brush0, @m p p0, @m Composer composer0, int v2, int v3, int v4) {
        p p1;
        Brush brush1;
        MutableInteractionSource mutableInteractionSource1;
        Function1 function12;
        VisualTransformation visualTransformation1;
        int v11;
        int v10;
        boolean z5;
        KeyboardActions keyboardActions1;
        KeyboardOptions keyboardOptions1;
        TextStyle textStyle1;
        boolean z4;
        boolean z3;
        Modifier modifier1;
        boolean z11;
        int v18;
        TextStyle textStyle2;
        int v14;
        p p2;
        Function1 function13;
        VisualTransformation visualTransformation2;
        int v13;
        int v12;
        boolean z8;
        KeyboardOptions keyboardOptions2;
        boolean z7;
        boolean z6;
        Modifier modifier2;
        Brush brush2;
        int v17;
        int v16;
        MutableInteractionSource mutableInteractionSource3;
        boolean z10;
        int v8;
        int v5;
        L.p(s, "value");
        L.p(function10, "onValueChange");
        Composer composer1 = composer0.G(0x3857730F);
        if((v4 & 1) == 0) {
            v5 = (v2 & 14) == 0 ? (composer1.t(s) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.Y(function10) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v5 |= (composer1.t(modifier0) ? 0x100 : 0x80);
        }
        int v6 = 0x400;
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v5 |= (composer1.v(z) ? 0x800 : 0x400);
        }
        int v7 = 0x2000;
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v5 |= (composer1.v(z1) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v5 |= (composer1.t(textStyle0) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v5 |= (composer1.t(keyboardOptions0) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v5 |= (composer1.t(keyboardActions0) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v2 & 0xE000000) == 0) {
            v5 |= (composer1.v(z2) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x70000000) == 0) {
            v5 |= ((v4 & 0x200) != 0 || !composer1.z(v) ? 0x10000000 : 0x20000000);
        }
        if((v4 & 0x400) == 0) {
            v8 = (v3 & 14) == 0 ? v3 | (composer1.z(v1) ? 4 : 2) : v3;
        }
        else {
            v8 = v3 | 6;
        }
        if((v4 & 0x800) != 0) {
            v8 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v8 |= (composer1.t(visualTransformation0) ? 0x20 : 16);
        }
        int v9 = v8;
        if((v4 & 0x1000) != 0) {
            v9 |= 0x180;
        }
        else if((v3 & 0x380) == 0) {
            v9 |= (composer1.Y(function11) ? 0x100 : 0x80);
        }
        if((v4 & 0x2000) != 0) {
            v9 |= 0xC00;
        }
        else if((v3 & 0x1C00) == 0) {
            if(composer1.t(mutableInteractionSource0)) {
                v6 = 0x800;
            }
            v9 |= v6;
        }
        if((v4 & 0x4000) != 0) {
            v9 |= 0x6000;
        }
        else if((v3 & 0xE000) == 0) {
            if(composer1.t(brush0)) {
                v7 = 0x4000;
            }
            v9 |= v7;
        }
        if((v4 & 0x8000) != 0) {
            v9 |= 0x30000;
        }
        else if((v3 & 0x70000) == 0) {
            v9 |= (composer1.Y(p0) ? 0x20000 : 0x10000);
        }
        if((v5 & 0x5B6DB6DB) != 306783378 || (0x5B6DB & v9) != 74898 || !composer1.c()) {
            composer1.Z();
            if((v2 & 1) == 0 || composer1.p()) {
                modifier2 = (v4 & 4) == 0 ? modifier0 : Modifier.m0;
                z6 = (v4 & 8) == 0 ? z : true;
                TextStyle textStyle3 = (v4 & 0x20) == 0 ? textStyle0 : TextStyle.d.a();
                KeyboardOptions keyboardOptions3 = (v4 & 0x40) == 0 ? keyboardOptions0 : KeyboardOptions.e.a();
                keyboardActions1 = (v4 & 0x80) == 0 ? keyboardActions0 : KeyboardActions.g.a();
                boolean z9 = (v4 & 0x100) == 0 ? z2 : false;
                if((v4 & 0x200) == 0) {
                    v12 = v;
                }
                else {
                    v12 = z9 ? 1 : 0x7FFFFFFF;
                    v5 &= 0x8FFFFFFF;
                }
                int v15 = (v4 & 0x400) == 0 ? v1 : 1;
                VisualTransformation visualTransformation3 = (v4 & 0x800) == 0 ? visualTransformation0 : VisualTransformation.a.a();
                Function1 function14 = (v4 & 0x1000) == 0 ? function11 : androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1.e;
                if((v4 & 0x2000) == 0) {
                    z10 = z9;
                    mutableInteractionSource3 = mutableInteractionSource0;
                }
                else {
                    composer1.V(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource2 = composer1.W();
                    z10 = z9;
                    if(mutableInteractionSource2 == Composer.a.a()) {
                        mutableInteractionSource2 = InteractionSourceKt.a();
                        composer1.O(mutableInteractionSource2);
                    }
                    composer1.g0();
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if((v4 & 0x4000) == 0) {
                    v16 = v5;
                    v17 = v15;
                    brush2 = brush0;
                }
                else {
                    v16 = v5;
                    v17 = v15;
                    brush2 = new SolidColor(0xFF00000000000000L, null);
                }
                if((v4 & 0x8000) == 0) {
                    v13 = v17;
                    p2 = p0;
                    mutableInteractionSource1 = mutableInteractionSource3;
                }
                else {
                    v13 = v17;
                    mutableInteractionSource1 = mutableInteractionSource3;
                    p2 = ComposableSingletons.BasicTextFieldKt.a.a();
                }
                function13 = function14;
                brush1 = brush2;
                z7 = (v4 & 16) == 0 ? z1 : false;
                textStyle2 = textStyle3;
                keyboardOptions2 = keyboardOptions3;
                v14 = v16;
                visualTransformation2 = visualTransformation3;
                z8 = z10;
            }
            else {
                composer1.m();
                if((v4 & 0x200) != 0) {
                    v5 &= 0x8FFFFFFF;
                }
                modifier2 = modifier0;
                z6 = z;
                z7 = z1;
                keyboardOptions2 = keyboardOptions0;
                keyboardActions1 = keyboardActions0;
                z8 = z2;
                v12 = v;
                v13 = v1;
                visualTransformation2 = visualTransformation0;
                function13 = function11;
                mutableInteractionSource1 = mutableInteractionSource0;
                brush1 = brush0;
                p2 = p0;
                v14 = v5;
                textStyle2 = textStyle0;
            }
            composer1.P();
            if(ComposerKt.g0()) {
                v18 = v12;
                ComposerKt.w0(0x3857730F, v14, v9, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:122)");
            }
            else {
                v18 = v12;
            }
            composer1.V(0xE2A708A4);
            MutableState mutableState0 = composer1.W();
            Companion composer$Companion0 = Composer.a;
            if(mutableState0 == composer$Companion0.a()) {
                z11 = z7;
                mutableState0 = SnapshotStateKt__SnapshotStateKt.g(new TextFieldValue(s, 0L, null, 6, null), null, 2, null);
                composer1.O(mutableState0);
            }
            else {
                z11 = z7;
            }
            composer1.g0();
            TextFieldValue textFieldValue0 = TextFieldValue.e(BasicTextFieldKt.e(mutableState0), s, 0L, null, 6, null);
            composer1.V(0x1E7B2B64);
            boolean z12 = composer1.t(textFieldValue0);
            boolean z13 = composer1.t(mutableState0);
            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.3.1 basicTextFieldKt$BasicTextField$3$10 = composer1.W();
            if(z12 || z13 || basicTextFieldKt$BasicTextField$3$10 == composer$Companion0.a()) {
                basicTextFieldKt$BasicTextField$3$10 = new a(textFieldValue0, mutableState0) {
                    final TextFieldValue e;
                    final MutableState f;

                    {
                        this.e = textFieldValue0;
                        this.f = mutableState0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        if(!TextRange.g(this.e.h(), BasicTextFieldKt.e(this.f).h()) || !L.g(this.e.g(), BasicTextFieldKt.e(this.f).g())) {
                            BasicTextFieldKt.f(this.f, this.e);
                        }
                    }
                };
                composer1.O(basicTextFieldKt$BasicTextField$3$10);
            }
            composer1.g0();
            EffectsKt.k(basicTextFieldKt$BasicTextField$3$10, composer1, 0);
            composer1.V(0x44FAF204);
            boolean z14 = composer1.t(s);
            MutableState mutableState1 = composer1.W();
            if(z14 || mutableState1 == composer$Companion0.a()) {
                mutableState1 = SnapshotStateKt__SnapshotStateKt.g(s, null, 2, null);
                composer1.O(mutableState1);
            }
            composer1.g0();
            ImeOptions imeOptions0 = keyboardOptions2.h(z8);
            composer1.V(0x607FB4C4);
            boolean z15 = composer1.t(mutableState0);
            boolean z16 = composer1.t(mutableState1);
            boolean z17 = composer1.t(function10);
            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.4.1 basicTextFieldKt$BasicTextField$4$10 = composer1.W();
            if((z15 | z16 | z17) != 0 || basicTextFieldKt$BasicTextField$4$10 == composer$Companion0.a()) {
                basicTextFieldKt$BasicTextField$4$10 = new Function1(function10, mutableState0, mutableState1) {
                    final Function1 e;
                    final MutableState f;
                    final MutableState g;

                    {
                        this.e = function10;
                        this.f = mutableState0;
                        this.g = mutableState1;
                        super(1);
                    }

                    public final void a(@l TextFieldValue textFieldValue0) {
                        L.p(textFieldValue0, "newTextFieldValueState");
                        BasicTextFieldKt.f(this.f, textFieldValue0);
                        boolean z = L.g(BasicTextFieldKt.g(this.g), textFieldValue0.i());
                        String s = textFieldValue0.i();
                        BasicTextFieldKt.h(this.g, s);
                        if(!z) {
                            String s1 = textFieldValue0.i();
                            this.e.invoke(s1);
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((TextFieldValue)object0));
                        return S0.a;
                    }
                };
                composer1.O(basicTextFieldKt$BasicTextField$4$10);
            }
            composer1.g0();
            CoreTextFieldKt.a(textFieldValue0, basicTextFieldKt$BasicTextField$4$10, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource1, brush1, !z8, (z8 ? 1 : v18), (z8 ? 1 : v13), imeOptions0, keyboardActions1, z6, z11, p2, composer1, v14 & 0x380 | v14 >> 6 & 0x1C00 | v9 << 9 & 0xE000 | v9 << 9 & 0x70000 | 0x380000 & v9 << 9 | v9 << 9 & 0x1C00000, v14 >> 15 & 0x380 | v14 & 0x1C00 | v14 & 0xE000 | v9 & 0x70000, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            z3 = z6;
            keyboardOptions1 = keyboardOptions2;
            v11 = v13;
            z4 = z11;
            textStyle1 = textStyle2;
            visualTransformation1 = visualTransformation2;
            function12 = function13;
            p1 = p2;
            z5 = z8;
            v10 = v18;
            modifier1 = modifier2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            z3 = z;
            z4 = z1;
            textStyle1 = textStyle0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActions1 = keyboardActions0;
            z5 = z2;
            v10 = v;
            v11 = v1;
            visualTransformation1 = visualTransformation0;
            function12 = function11;
            mutableInteractionSource1 = mutableInteractionSource0;
            brush1 = brush0;
            p1 = p0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(s, function10, modifier1, z3, z4, textStyle1, keyboardOptions1, keyboardActions1, z5, v10, v11, visualTransformation1, function12, mutableInteractionSource1, brush1, p1, v2, v3, v4) {
                final String e;
                final Function1 f;
                final Modifier g;
                final boolean h;
                final boolean i;
                final TextStyle j;
                final KeyboardOptions k;
                final KeyboardActions l;
                final boolean m;
                final int n;
                final int o;
                final VisualTransformation p;
                final Function1 q;
                final MutableInteractionSource r;
                final Brush s;
                final p t;
                final int u;
                final int v;
                final int w;

                {
                    this.e = s;
                    this.f = function10;
                    this.g = modifier0;
                    this.h = z;
                    this.i = z1;
                    this.j = textStyle0;
                    this.k = keyboardOptions0;
                    this.l = keyboardActions0;
                    this.m = z2;
                    this.n = v;
                    this.o = v1;
                    this.p = visualTransformation0;
                    this.q = function11;
                    this.r = mutableInteractionSource0;
                    this.s = brush0;
                    this.t = p0;
                    this.u = v2;
                    this.v = v3;
                    this.w = v4;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    BasicTextFieldKt.c(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, composer0, (this.u | 1) & -920350135 | ((0x24924924 & (this.u | 1)) >> 1 | 306783378 & (this.u | 1)) | (306783378 & (this.u | 1)) << 1 & (0x24924924 & (this.u | 1)), this.v & -920350135 | ((0x24924924 & this.v) >> 1 | 306783378 & this.v) | (306783378 & this.v) << 1 & (0x24924924 & this.v), this.w);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1 extends N implements Function1 {
            public static final androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1 e;

            static {
                androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1.e = new androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1();
            }

            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1() {
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
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @k(level = kotlin.m.c, message = "Maintained for binary compatibility")
    public static final void d(String s, Function1 function10, Modifier modifier0, boolean z, boolean z1, TextStyle textStyle0, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, boolean z2, int v, VisualTransformation visualTransformation0, Function1 function11, MutableInteractionSource mutableInteractionSource0, Brush brush0, p p0, Composer composer0, int v1, int v2, int v3) {
        boolean z5;
        p p1;
        Brush brush1;
        MutableInteractionSource mutableInteractionSource1;
        Function1 function12;
        VisualTransformation visualTransformation1;
        int v9;
        KeyboardActions keyboardActions1;
        KeyboardOptions keyboardOptions1;
        TextStyle textStyle1;
        boolean z4;
        boolean z3;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource3;
        int v7;
        int v4;
        L.p(s, "value");
        L.p(function10, "onValueChange");
        Composer composer1 = composer0.G(-454732590);
        if((v3 & 1) == 0) {
            v4 = (v1 & 14) == 0 ? (composer1.t(s) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v4 |= (composer1.Y(function10) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v4 |= (composer1.t(modifier0) ? 0x100 : 0x80);
        }
        int v5 = 0x400;
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v4 |= (composer1.v(z) ? 0x800 : 0x400);
        }
        int v6 = 0x2000;
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            v4 |= (composer1.v(z1) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x70000) == 0) {
            v4 |= (composer1.t(textStyle0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v4 |= (composer1.t(keyboardOptions0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v1 & 0x1C00000) == 0) {
            v4 |= (composer1.t(keyboardActions0) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v1 & 0xE000000) == 0) {
            v4 |= (composer1.v(z2) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((v1 & 0x70000000) == 0) {
            v4 |= (composer1.z(v) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v7 = (v2 & 14) == 0 ? v2 | (composer1.t(visualTransformation0) ? 4 : 2) : v2;
        }
        else {
            v7 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v7 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v7 |= (composer1.Y(function11) ? 0x20 : 16);
        }
        int v8 = v7;
        if((v3 & 0x1000) != 0) {
            v8 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v8 |= (composer1.t(mutableInteractionSource0) ? 0x100 : 0x80);
        }
        if((v3 & 0x2000) != 0) {
            v8 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            if(composer1.t(brush0)) {
                v5 = 0x800;
            }
            v8 |= v5;
        }
        if((v3 & 0x4000) != 0) {
            v8 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            if(composer1.Y(p0)) {
                v6 = 0x4000;
            }
            v8 |= v6;
        }
        if((v4 & 0x5B6DB6DB) != 306783378 || (0xB6DB & v8) != 9362 || !composer1.c()) {
            Modifier modifier2 = (v3 & 4) == 0 ? modifier0 : Modifier.m0;
            boolean z6 = (v3 & 8) == 0 ? z : true;
            boolean z7 = (v3 & 16) == 0 ? z1 : false;
            TextStyle textStyle2 = (v3 & 0x20) == 0 ? textStyle0 : TextStyle.d.a();
            KeyboardOptions keyboardOptions2 = (v3 & 0x40) == 0 ? keyboardOptions0 : KeyboardOptions.e.a();
            KeyboardActions keyboardActions2 = (v3 & 0x80) == 0 ? keyboardActions0 : KeyboardActions.g.a();
            boolean z8 = (v3 & 0x100) == 0 ? z2 : false;
            int v10 = (v3 & 0x200) == 0 ? v : 0x7FFFFFFF;
            VisualTransformation visualTransformation2 = (v3 & 0x400) == 0 ? visualTransformation0 : VisualTransformation.a.a();
            Function1 function13 = (v3 & 0x800) == 0 ? function11 : androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.10.e;
            if((v3 & 0x1000) == 0) {
                mutableInteractionSource3 = mutableInteractionSource0;
            }
            else {
                composer1.V(0xE2A708A4);
                MutableInteractionSource mutableInteractionSource2 = composer1.W();
                if(mutableInteractionSource2 == Composer.a.a()) {
                    mutableInteractionSource2 = InteractionSourceKt.a();
                    composer1.O(mutableInteractionSource2);
                }
                composer1.g0();
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            Brush brush2 = (v3 & 0x2000) == 0 ? brush0 : new SolidColor(0xFF00000000000000L, null);
            p p2 = (v3 & 0x4000) == 0 ? p0 : ComposableSingletons.BasicTextFieldKt.a.c();
            if(ComposerKt.g0()) {
                ComposerKt.w0(-454732590, v4, v8, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:313)");
            }
            BasicTextFieldKt.c(s, function10, modifier2, z6, z7, textStyle2, keyboardOptions2, keyboardActions2, z8, v10, 1, visualTransformation2, function13, mutableInteractionSource3, brush2, p2, composer1, v4 & 0x7FFFFFFE, v8 << 3 & 0x70 | 6 | v8 << 3 & 0x380 | v8 << 3 & 0x1C00 | v8 << 3 & 0xE000 | v8 << 3 & 0x70000, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            z3 = z6;
            z4 = z7;
            textStyle1 = textStyle2;
            keyboardOptions1 = keyboardOptions2;
            keyboardActions1 = keyboardActions2;
            z5 = z8;
            v9 = v10;
            visualTransformation1 = visualTransformation2;
            function12 = function13;
            mutableInteractionSource1 = mutableInteractionSource3;
            brush1 = brush2;
            p1 = p2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            z3 = z;
            z4 = z1;
            textStyle1 = textStyle0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActions1 = keyboardActions0;
            v9 = v;
            visualTransformation1 = visualTransformation0;
            function12 = function11;
            mutableInteractionSource1 = mutableInteractionSource0;
            brush1 = brush0;
            p1 = p0;
            z5 = z2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(s, function10, modifier1, z3, z4, textStyle1, keyboardOptions1, keyboardActions1, z5, v9, visualTransformation1, function12, mutableInteractionSource1, brush1, p1, v1, v2, v3) {
                final String e;
                final Function1 f;
                final Modifier g;
                final boolean h;
                final boolean i;
                final TextStyle j;
                final KeyboardOptions k;
                final KeyboardActions l;
                final boolean m;
                final int n;
                final VisualTransformation o;
                final Function1 p;
                final MutableInteractionSource q;
                final Brush r;
                final p s;
                final int t;
                final int u;
                final int v;

                {
                    this.e = s;
                    this.f = function10;
                    this.g = modifier0;
                    this.h = z;
                    this.i = z1;
                    this.j = textStyle0;
                    this.k = keyboardOptions0;
                    this.l = keyboardActions0;
                    this.m = z2;
                    this.n = v;
                    this.o = visualTransformation0;
                    this.p = function11;
                    this.q = mutableInteractionSource0;
                    this.r = brush0;
                    this.s = p0;
                    this.t = v1;
                    this.u = v2;
                    this.v = v3;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    BasicTextFieldKt.d(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, composer0, (this.t | 1) & -920350135 | ((0x24924924 & (this.t | 1)) >> 1 | 306783378 & (this.t | 1)) | (306783378 & (this.t | 1)) << 1 & (0x24924924 & (this.t | 1)), this.u & -920350135 | ((0x24924924 & this.u) >> 1 | 306783378 & this.u) | (306783378 & this.u) << 1 & (0x24924924 & this.u), this.v);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.10 extends N implements Function1 {
            public static final androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.10 e;

            static {
                androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.10.e = new androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.10();
            }

            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.10() {
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

    private static final TextFieldValue e(MutableState mutableState0) {
        return (TextFieldValue)mutableState0.getValue();
    }

    private static final void f(MutableState mutableState0, TextFieldValue textFieldValue0) {
        mutableState0.setValue(textFieldValue0);
    }

    private static final String g(MutableState mutableState0) {
        return (String)mutableState0.getValue();
    }

    private static final void h(MutableState mutableState0, String s) {
        mutableState0.setValue(s);
    }
}

