package androidx.compose.foundation.text;

import A3.o;
import A3.p;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

@s0({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,100:1\n154#2:101\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n*L\n95#1:101\n*E\n"})
public final class TextFieldCursorKt {
    @l
    private static final AnimationSpec a;
    private static final float b;

    static {
        TextFieldCursorKt.a = AnimationSpecKt.f(AnimationSpecKt.g(TextFieldCursorKt.cursorAnimationSpec.1.e), null, 0L, 6, null);
        TextFieldCursorKt.b = 2.0f;
    }

    @l
    public static final Modifier b(@l Modifier modifier0, @l TextFieldState textFieldState0, @l TextFieldValue textFieldValue0, @l OffsetMapping offsetMapping0, @l Brush brush0, boolean z) {
        L.p(modifier0, "<this>");
        L.p(textFieldState0, "state");
        L.p(textFieldValue0, "value");
        L.p(offsetMapping0, "offsetMapping");
        L.p(brush0, "cursorBrush");
        return z ? ComposedModifierKt.j(modifier0, null, new p(brush0, textFieldState0, textFieldValue0, offsetMapping0) {
            final Brush e;
            final TextFieldState f;
            final TextFieldValue g;
            final OffsetMapping h;

            {
                this.e = brush0;
                this.f = textFieldState0;
                this.g = textFieldValue0;
                this.h = offsetMapping0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                Modifier modifier1;
                L.p(modifier0, "$this$composed");
                composer0.V(1634330012);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(1634330012, v, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
                }
                composer0.V(0xE2A708A4);
                Animatable animatable0 = composer0.W();
                if(animatable0 == Composer.a.a()) {
                    animatable0 = AnimatableKt.b(1.0f, 0.0f, 2, null);
                    composer0.O(animatable0);
                }
                composer0.g0();
                boolean z = !(this.e instanceof SolidColor) || ((SolidColor)this.e).c() != 16L;
                if(!this.f.d() || !TextRange.h(this.g.h()) || !z) {
                    modifier1 = Modifier.m0;
                }
                else {
                    TextRange textRange0 = TextRange.b(this.g.h());
                    androidx.compose.foundation.text.TextFieldCursorKt.cursor.1.1 textFieldCursorKt$cursor$1$10 = new o(null) {
                        int k;
                        final Animatable l;

                        {
                            this.l = animatable0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new androidx.compose.foundation.text.TextFieldCursorKt.cursor.1.1(this.l, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((androidx.compose.foundation.text.TextFieldCursorKt.cursor.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = b.l();
                            switch(this.k) {
                                case 0: {
                                    f0.n(object0);
                                    androidx.compose.foundation.text.TextFieldCursorKt.cursor.1.1.1 textFieldCursorKt$cursor$1$1$10 = new o(null) {
                                        int k;
                                        final Animatable l;

                                        {
                                            this.l = animatable0;
                                            super(2, d0);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @l
                                        public final d create(@m Object object0, @l d d0) {
                                            return new androidx.compose.foundation.text.TextFieldCursorKt.cursor.1.1.1(this.l, d0);
                                        }

                                        @Override  // A3.o
                                        public Object invoke(Object object0, Object object1) {
                                            return this.invoke(((O)object0), ((d)object1));
                                        }

                                        @m
                                        public final Object invoke(@l O o0, @m d d0) {
                                            return ((androidx.compose.foundation.text.TextFieldCursorKt.cursor.1.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @m
                                        public final Object invokeSuspend(@l Object object0) {
                                            Object object1 = b.l();
                                            switch(this.k) {
                                                case 0: {
                                                    f0.n(object0);
                                                    this.k = 1;
                                                    if(this.l.B(kotlin.coroutines.jvm.internal.b.e(1.0f), this) == object1) {
                                                        return object1;
                                                    }
                                                    break;
                                                }
                                                case 1: {
                                                    f0.n(object0);
                                                    break;
                                                }
                                                case 2: {
                                                    f0.n(object0);
                                                    return S0.a;
                                                }
                                                default: {
                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                }
                                            }
                                            this.k = 2;
                                            return Animatable.i(this.l, kotlin.coroutines.jvm.internal.b.e(0.0f), TextFieldCursorKt.a, null, null, this, 12, null) == object1 ? object1 : S0.a;
                                        }
                                    };
                                    this.k = 1;
                                    return i.h(FixedMotionDurationScale.a, textFieldCursorKt$cursor$1$1$10, this) == object1 ? object1 : S0.a;
                                }
                                case 1: {
                                    f0.n(object0);
                                    return S0.a;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                        }
                    };
                    EffectsKt.h(this.g.f(), textRange0, textFieldCursorKt$cursor$1$10, composer0, 0x200);
                    modifier1 = DrawModifierKt.c(modifier0, new Function1(this.h, this.g, this.f, this.e) {
                        final Animatable e;
                        final OffsetMapping f;
                        final TextFieldValue g;
                        final TextFieldState h;
                        final Brush i;

                        {
                            this.e = animatable0;
                            this.f = offsetMapping0;
                            this.g = textFieldValue0;
                            this.h = textFieldState0;
                            this.i = brush0;
                            super(1);
                        }

                        public final void a(@l ContentDrawScope contentDrawScope0) {
                            Rect rect0;
                            L.p(contentDrawScope0, "$this$drawWithContent");
                            contentDrawScope0.Q0();
                            float f = s.H(((Number)this.e.u()).floatValue(), 0.0f, 1.0f);
                            if(f != 0.0f) {
                                int v = this.f.b(TextRange.n(this.g.h()));
                                TextLayoutResultProxy textLayoutResultProxy0 = this.h.g();
                                if(textLayoutResultProxy0 == null) {
                                    rect0 = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                                }
                                else {
                                    TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.i();
                                    if(textLayoutResult0 == null) {
                                        rect0 = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                                    }
                                    else {
                                        rect0 = textLayoutResult0.e(v);
                                        if(rect0 == null) {
                                            rect0 = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                                        }
                                    }
                                }
                                float f1 = contentDrawScope0.y1(2.0f);
                                float f2 = s.A(rect0.t() + f1 / 2.0f, Size.t(contentDrawScope0.b()) - f1 / 2.0f);
                                androidx.compose.ui.graphics.drawscope.b.B(contentDrawScope0, this.i, OffsetKt.a(f2, rect0.B()), OffsetKt.a(f2, rect0.j()), f1, 0, null, f, null, 0, 0x1B0, null);
                            }
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((ContentDrawScope)object0));
                            return S0.a;
                        }
                    });
                }
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
        }, 1, null) : modifier0;
    }

    public static final float c() [...] // 潜在的解密器
}

