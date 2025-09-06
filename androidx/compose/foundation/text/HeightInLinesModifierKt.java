package androidx.compose.foundation.text;

import A3.p;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,134:1\n135#2:135\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n53#1:135\n*E\n"})
public final class HeightInLinesModifierKt {
    public static final int a = 1;

    @l
    public static final Modifier a(@l Modifier modifier0, @l TextStyle textStyle0, int v, int v1) {
        L.p(modifier0, "<this>");
        L.p(textStyle0, "textStyle");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(v, v1, textStyle0) {
            final int e;
            final int f;
            final TextStyle g;

            {
                this.e = v;
                this.f = v1;
                this.g = textStyle0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(408240218);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(408240218, v, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:58)");
                }
                HeightInLinesModifierKt.c(this.e, this.f);
                if(this.e == 1 && this.f == 0x7FFFFFFF) {
                    Modifier modifier1 = Modifier.m0;
                    if(ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    composer0.g0();
                    return modifier1;
                }
                Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
                Resolver fontFamily$Resolver0 = (Resolver)composer0.L(CompositionLocalsKt.k());
                LayoutDirection layoutDirection0 = (LayoutDirection)composer0.L(CompositionLocalsKt.p());
                TextStyle textStyle0 = this.g;
                composer0.V(0x1E7B2B64);
                boolean z = composer0.t(textStyle0);
                boolean z1 = composer0.t(layoutDirection0);
                TextStyle textStyle1 = composer0.W();
                if(z || z1 || textStyle1 == Composer.a.a()) {
                    textStyle1 = TextStyleKt.d(textStyle0, layoutDirection0);
                    composer0.O(textStyle1);
                }
                composer0.g0();
                composer0.V(0x1E7B2B64);
                boolean z2 = composer0.t(fontFamily$Resolver0);
                boolean z3 = composer0.t(textStyle1);
                State state0 = composer0.W();
                if(z2 || z3 || state0 == Composer.a.a()) {
                    FontFamily fontFamily0 = textStyle1.u();
                    FontWeight fontWeight0 = textStyle1.z();
                    if(fontWeight0 == null) {
                        fontWeight0 = FontWeight.b.m();
                    }
                    FontStyle fontStyle0 = textStyle1.x();
                    FontSynthesis fontSynthesis0 = textStyle1.y();
                    state0 = fontFamily$Resolver0.b(fontFamily0, fontWeight0, (fontStyle0 == null ? 0 : fontStyle0.j()), (fontSynthesis0 == null ? 1 : fontSynthesis0.m()));
                    composer0.O(state0);
                }
                composer0.g0();
                Object object0 = androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines.2.b(state0);
                Object[] arr_object = {density0, fontFamily$Resolver0, this.g, layoutDirection0, object0};
                composer0.V(0xDE219177);
                boolean z4 = false;
                for(int v2 = 0; v2 < 5; ++v2) {
                    z4 |= composer0.t(arr_object[v2]);
                }
                Integer integer0 = composer0.W();
                if(z4 || integer0 == Composer.a.a()) {
                    integer0 = IntSize.j(TextFieldDelegateKt.a(textStyle1, density0, fontFamily$Resolver0, "HHHHHHHHHH", 1));
                    composer0.O(integer0);
                }
                composer0.g0();
                int v3 = integer0.intValue();
                Object object1 = androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines.2.b(state0);
                Object[] arr_object1 = {density0, fontFamily$Resolver0, this.g, layoutDirection0, object1};
                composer0.V(0xDE219177);
                boolean z5 = false;
                for(int v1 = 0; v1 < 5; ++v1) {
                    z5 |= composer0.t(arr_object1[v1]);
                }
                Integer integer1 = composer0.W();
                if(z5 || integer1 == Composer.a.a()) {
                    integer1 = IntSize.j(TextFieldDelegateKt.a(textStyle1, density0, fontFamily$Resolver0, "HHHHHHHHHH" + '\n' + "HHHHHHHHHH", 2));
                    composer0.O(integer1);
                }
                composer0.g0();
                int v4 = integer1.intValue() - v3;
                Integer integer2 = null;
                Integer integer3 = this.e == 1 ? null : ((int)((this.e - 1) * v4 + v3));
                int v5 = this.f;
                if(v5 != 0x7FFFFFFF) {
                    integer2 = (int)(v3 + v4 * (v5 - 1));
                }
                float f = integer3 == null ? NaNf : density0.C(((int)integer3));
                Modifier modifier2 = SizeKt.p(Modifier.m0, f, (integer2 == null ? NaNf : density0.C(((int)integer2))));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier2;
            }

            private static final Object b(State state0) {
                return state0.getValue();
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n1#1,170:1\n54#2,5:171\n*E\n"})
        public final class androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final int e;
            final int f;
            final TextStyle g;

            public androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines..inlined.debugInspectorInfo.1(int v, int v1, TextStyle textStyle0) {
                this.e = v;
                this.f = v1;
                this.g = textStyle0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("heightInLines");
                inspectorInfo0.b().c("minLines", this.e);
                inspectorInfo0.b().c("maxLines", this.f);
                inspectorInfo0.b().c("textStyle", this.g);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier b(Modifier modifier0, TextStyle textStyle0, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 1;
        }
        if((v2 & 4) != 0) {
            v1 = 0x7FFFFFFF;
        }
        return HeightInLinesModifierKt.a(modifier0, textStyle0, v, v1);
    }

    public static final void c(int v, int v1) {
        if(v <= 0 || v1 <= 0) {
            throw new IllegalArgumentException(("both minLines " + v + " and maxLines " + v1 + " must be greater than zero").toString());
        }
        if(v > v1) {
            throw new IllegalArgumentException(("minLines " + v + " must be less than or equal to maxLines " + v1).toString());
        }
    }
}

