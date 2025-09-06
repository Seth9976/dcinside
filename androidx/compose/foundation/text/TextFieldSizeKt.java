package androidx.compose.foundation.text;

import A3.p;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;
import y4.m;

public final class TextFieldSizeKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l TextStyle textStyle0) {
        L.p(modifier0, "<this>");
        L.p(textStyle0, "style");
        return ComposedModifierKt.j(modifier0, null, new p(textStyle0) {
            final TextStyle e;

            {
                this.e = textStyle0;
                super(3);
            }

            @Composable
            @l
            public final Modifier b(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x5E56A525);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x5E56A525, v, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:38)");
                }
                Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
                Resolver fontFamily$Resolver0 = (Resolver)composer0.L(CompositionLocalsKt.k());
                Object object0 = composer0.L(CompositionLocalsKt.p());
                TextStyle textStyle0 = this.e;
                composer0.V(0x1E7B2B64);
                boolean z = composer0.t(textStyle0);
                boolean z1 = composer0.t(((LayoutDirection)object0));
                TextStyle textStyle1 = composer0.W();
                if(z || z1 || textStyle1 == Composer.a.a()) {
                    textStyle1 = TextStyleKt.d(textStyle0, ((LayoutDirection)object0));
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
                TextStyle textStyle2 = this.e;
                composer0.V(0xE2A708A4);
                TextFieldSize textFieldSize0 = composer0.W();
                if(textFieldSize0 == Composer.a.a()) {
                    textFieldSize0 = new TextFieldSize(((LayoutDirection)object0), density0, fontFamily$Resolver0, textStyle2, androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize.1.c(state0));
                    composer0.O(textFieldSize0);
                }
                composer0.g0();
                textFieldSize0.m(((LayoutDirection)object0), density0, fontFamily$Resolver0, textStyle1, androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize.1.c(state0));
                androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize.1.1 textFieldSizeKt$textFieldMinSize$1$10 = new p() {
                    final TextFieldSize e;

                    {
                        this.e = textFieldSize0;
                        super(3);
                    }

                    @l
                    public final MeasureResult a(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
                        L.p(measureScope0, "$this$layout");
                        L.p(measurable0, "measurable");
                        SizeKt.h(Modifier.m0, 0.0f, 0.0f, 3, null);
                        long v1 = this.e.e();
                        Placeable placeable0 = measurable0.r1(Constraints.e(v, s.I(((int)(v1 >> 0x20)), Constraints.r(v), Constraints.p(v)), 0, s.I(((int)(v1 & 0xFFFFFFFFL)), Constraints.q(v), Constraints.o(v)), 0, 10, null));
                        return MeasureScope.-CC.p(measureScope0, placeable0.N1(), placeable0.K1(), null, new Function1() {
                            final Placeable e;

                            {
                                this.e = placeable0;
                                super(1);
                            }

                            public final void a(@l PlacementScope placeable$PlacementScope0) {
                                L.p(placeable$PlacementScope0, "$this$layout");
                                PlacementScope.v(placeable$PlacementScope0, this.e, 0, 0, 0.0f, 4, null);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((PlacementScope)object0));
                                return S0.a;
                            }
                        }, 4, null);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.a(((MeasureScope)object0), ((Measurable)object1), ((Constraints)object2).x());
                    }
                };
                Modifier modifier1 = LayoutModifierKt.a(Modifier.m0, textFieldSizeKt$textFieldMinSize$1$10);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier1;
            }

            private static final Object c(State state0) {
                return state0.getValue();
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.b(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        }, 1, null);
    }
}

