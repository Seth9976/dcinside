package androidx.compose.foundation.text;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.J;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,369:1\n135#2:370\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n60#1:370\n*E\n"})
public final class TextFieldScrollKt {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[Orientation.values().length];
            try {
                arr_v[Orientation.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Orientation.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    private static final Rect b(Density density0, int v, TransformedText transformedText0, TextLayoutResult textLayoutResult0, boolean z, int v1) {
        Rect rect0;
        if(textLayoutResult0 == null) {
            rect0 = Rect.e.a();
        }
        else {
            rect0 = textLayoutResult0.e(transformedText0.a().b(v));
            if(rect0 == null) {
                rect0 = Rect.e.a();
            }
        }
        int v2 = density0.b1(2.0f);
        float f = z ? ((float)v1) - rect0.t() - ((float)v2) : rect0.t();
        return z ? Rect.h(rect0, f, 0.0f, ((float)v1) - rect0.t(), 0.0f, 10, null) : Rect.h(rect0, f, 0.0f, rect0.t() + ((float)v2), 0.0f, 10, null);
    }

    @l
    public static final Modifier c(@l Modifier modifier0, @l TextFieldScrollerPosition textFieldScrollerPosition0, @l TextFieldValue textFieldValue0, @l VisualTransformation visualTransformation0, @l a a0) {
        VerticalScrollLayoutModifier verticalScrollLayoutModifier0;
        L.p(modifier0, "<this>");
        L.p(textFieldScrollerPosition0, "scrollerPosition");
        L.p(textFieldValue0, "textFieldValue");
        L.p(visualTransformation0, "visualTransformation");
        L.p(a0, "textLayoutResultProvider");
        Orientation orientation0 = textFieldScrollerPosition0.f();
        int v = textFieldScrollerPosition0.e(textFieldValue0.h());
        textFieldScrollerPosition0.k(textFieldValue0.h());
        TransformedText transformedText0 = ValidatingOffsetMappingKt.a(visualTransformation0, textFieldValue0.f());
        switch(orientation0) {
            case 1: {
                verticalScrollLayoutModifier0 = new VerticalScrollLayoutModifier(textFieldScrollerPosition0, v, transformedText0, a0);
                return ClipKt.b(modifier0).r0(verticalScrollLayoutModifier0);
            }
            case 2: {
                verticalScrollLayoutModifier0 = new HorizontalScrollLayoutModifier(textFieldScrollerPosition0, v, transformedText0, a0);
                return ClipKt.b(modifier0).r0(verticalScrollLayoutModifier0);
            }
            default: {
                throw new J();
            }
        }
    }

    @l
    public static final Modifier d(@l Modifier modifier0, @l TextFieldScrollerPosition textFieldScrollerPosition0, @m MutableInteractionSource mutableInteractionSource0, boolean z) {
        L.p(modifier0, "<this>");
        L.p(textFieldScrollerPosition0, "scrollerPosition");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(textFieldScrollerPosition0, z, mutableInteractionSource0) {
            final TextFieldScrollerPosition e;
            final boolean f;
            final MutableInteractionSource g;

            {
                this.e = textFieldScrollerPosition0;
                this.f = z;
                this.g = mutableInteractionSource0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x3001DC2A);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x3001DC2A, v, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:65)");
                }
                boolean z = composer0.L(CompositionLocalsKt.p()) == LayoutDirection.b;
                boolean z1 = this.e.f() == Orientation.a || !z;
                TextFieldScrollerPosition textFieldScrollerPosition0 = this.e;
                composer0.V(0x44FAF204);
                boolean z2 = composer0.t(textFieldScrollerPosition0);
                androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable.2.scrollableState.1.1 textFieldScrollKt$textFieldScrollable$2$scrollableState$1$10 = composer0.W();
                if(z2 || textFieldScrollKt$textFieldScrollable$2$scrollableState$1$10 == Composer.a.a()) {
                    textFieldScrollKt$textFieldScrollable$2$scrollableState$1$10 = new Function1() {
                        final TextFieldScrollerPosition e;

                        {
                            this.e = textFieldScrollerPosition0;
                            super(1);
                        }

                        @l
                        public final Float b(float f) {
                            float f1 = this.e.d() + f;
                            if(f1 > this.e.c()) {
                                f = this.e.c() - this.e.d();
                            }
                            else if(f1 < 0.0f) {
                                f = -this.e.d();
                            }
                            float f2 = this.e.d();
                            this.e.i(f2 + f);
                            return f;
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.b(((Number)object0).floatValue());
                        }
                    };
                    composer0.O(textFieldScrollKt$textFieldScrollable$2$scrollableState$1$10);
                }
                composer0.g0();
                ScrollableState scrollableState0 = ScrollableStateKt.b(textFieldScrollKt$textFieldScrollable$2$scrollableState$1$10, composer0, 0);
                TextFieldScrollerPosition textFieldScrollerPosition1 = this.e;
                composer0.V(0x1E7B2B64);
                boolean z3 = composer0.t(scrollableState0);
                boolean z4 = composer0.t(textFieldScrollerPosition1);
                androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable.2.wrappedScrollableState.1.1 textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$10 = composer0.W();
                if(z3 || z4 || textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$10 == Composer.a.a()) {
                    textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$10 = new ScrollableState() {
                        private final ScrollableState a;
                        @l
                        private final State b;
                        @l
                        private final State c;

                        {
                            ScrollableState scrollableState0 = textFieldScrollerPosition1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                            this.a = scrollableState0;
                            this.b = SnapshotStateKt.c(new a() {
                                final TextFieldScrollerPosition e;

                                {
                                    this.e = textFieldScrollerPosition0;
                                    super(0);
                                }

                                @l
                                public final Boolean b() {
                                    return this.e.d() < this.e.c();
                                }

                                @Override  // A3.a
                                public Object invoke() {
                                    return this.b();
                                }
                            });
                            this.c = SnapshotStateKt.c(new a() {
                                final TextFieldScrollerPosition e;

                                {
                                    this.e = textFieldScrollerPosition0;
                                    super(0);
                                }

                                @l
                                public final Boolean b() {
                                    return this.e.d() > 0.0f;
                                }

                                @Override  // A3.a
                                public Object invoke() {
                                    return this.b();
                                }
                            });
                        }

                        @Override  // androidx.compose.foundation.gestures.ScrollableState
                        public boolean a() {
                            return ((Boolean)this.b.getValue()).booleanValue();
                        }

                        @Override  // androidx.compose.foundation.gestures.ScrollableState
                        public float b(float f) {
                            return this.a.b(f);
                        }

                        @Override  // androidx.compose.foundation.gestures.ScrollableState
                        public boolean c() {
                            return this.a.c();
                        }

                        @Override  // androidx.compose.foundation.gestures.ScrollableState
                        @m
                        public Object d(@l MutatePriority mutatePriority0, @l o o0, @l d d0) {
                            return this.a.d(mutatePriority0, o0, d0);
                        }

                        @Override  // androidx.compose.foundation.gestures.ScrollableState
                        public boolean e() {
                            return ((Boolean)this.c.getValue()).booleanValue();
                        }
                    };
                    composer0.O(textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$10);
                }
                composer0.g0();
                Orientation orientation0 = this.e.f();
                boolean z5 = this.f && this.e.c() != 0.0f;
                Modifier modifier1 = ScrollableKt.m(Modifier.m0, textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$10, orientation0, z5, z1, null, this.g, 16, null);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier1;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n1#1,170:1\n61#2,5:171\n*E\n"})
        public final class androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final TextFieldScrollerPosition e;
            final MutableInteractionSource f;
            final boolean g;

            public androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable..inlined.debugInspectorInfo.1(TextFieldScrollerPosition textFieldScrollerPosition0, MutableInteractionSource mutableInteractionSource0, boolean z) {
                this.e = textFieldScrollerPosition0;
                this.f = mutableInteractionSource0;
                this.g = z;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("textFieldScrollable");
                inspectorInfo0.b().c("scrollerPosition", this.e);
                inspectorInfo0.b().c("interactionSource", this.f);
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.g));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier e(Modifier modifier0, TextFieldScrollerPosition textFieldScrollerPosition0, MutableInteractionSource mutableInteractionSource0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            mutableInteractionSource0 = null;
        }
        if((v & 4) != 0) {
            z = true;
        }
        return TextFieldScrollKt.d(modifier0, textFieldScrollerPosition0, mutableInteractionSource0, z);
    }
}

