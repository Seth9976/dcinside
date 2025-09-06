package androidx.compose.foundation.text.selection;

import A3.o;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,144:1\n25#2:145\n36#2:152\n25#2:159\n25#2:166\n1114#3,6:146\n1114#3,6:153\n1114#3,6:160\n1114#3,6:167\n76#4:173\n76#4:174\n76#4:175\n76#5:176\n102#5,2:177\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n*L\n43#1:145\n47#1:152\n85#1:159\n86#1:166\n43#1:146,6\n47#1:153,6\n85#1:160,6\n86#1:167,6\n88#1:173\n89#1:174\n90#1:175\n43#1:176\n43#1:177,2\n*E\n"})
public final class SelectionContainerKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void a(@l o o0, @m Composer composer0, int v) {
        L.p(o0, "content");
        Composer composer1 = composer0.G(0x1407EC36);
        int v1 = (v & 14) == 0 ? (composer1.Y(o0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x1407EC36, v1, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:60)");
            }
            CompositionLocalKt.b(new ProvidedValue[]{SelectionRegistrarKt.a().f(null)}, o0, composer1, v1 << 3 & 0x70 | 8);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(o0, v) {
                final o e;
                final int f;

                {
                    this.e = o0;
                    this.f = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    SelectionContainerKt.a(this.e, composer0, (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void b(@m Modifier modifier0, @l o o0, @m Composer composer0, int v, int v1) {
        int v2;
        L.p(o0, "content");
        Composer composer1 = composer0.G(0xBFE532B0);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.Y(o0) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.c()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.m0;
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xBFE532B0, v2, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:41)");
            }
            composer1.V(0xE2A708A4);
            MutableState mutableState0 = composer1.W();
            Companion composer$Companion0 = Composer.a;
            if(mutableState0 == composer$Companion0.a()) {
                mutableState0 = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
                composer1.O(mutableState0);
            }
            composer1.g0();
            Selection selection0 = SelectionContainerKt.d(mutableState0);
            composer1.V(0x44FAF204);
            boolean z = composer1.t(mutableState0);
            androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.1.1 selectionContainerKt$SelectionContainer$1$10 = composer1.W();
            if(z || selectionContainerKt$SelectionContainer$1$10 == composer$Companion0.a()) {
                selectionContainerKt$SelectionContainer$1$10 = new Function1(mutableState0) {
                    final MutableState e;

                    {
                        this.e = mutableState0;
                        super(1);
                    }

                    public final void a(@m Selection selection0) {
                        SelectionContainerKt.e(this.e, selection0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((Selection)object0));
                        return S0.a;
                    }
                };
                composer1.O(selectionContainerKt$SelectionContainer$1$10);
            }
            composer1.g0();
            SelectionContainerKt.c(modifier0, selection0, selectionContainerKt$SelectionContainer$1$10, o0, composer1, v2 & 14 | v2 << 6 & 0x1C00, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier0, o0, v, v1) {
                final Modifier e;
                final o f;
                final int g;
                final int h;

                {
                    this.e = modifier0;
                    this.f = o0;
                    this.g = v;
                    this.h = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    SelectionContainerKt.b(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void c(@m Modifier modifier0, @m Selection selection0, @l Function1 function10, @l o o0, @m Composer composer0, int v, int v1) {
        int v2;
        L.p(function10, "onSelectionChange");
        L.p(o0, "children");
        Composer composer1 = composer0.G(2078139907);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.t(selection0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.Y(function10) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.Y(o0) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.c()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.m0;
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(2078139907, v2, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:75)");
            }
            composer1.V(0xE2A708A4);
            SelectionRegistrarImpl selectionRegistrarImpl0 = composer1.W();
            Companion composer$Companion0 = Composer.a;
            if(selectionRegistrarImpl0 == composer$Companion0.a()) {
                selectionRegistrarImpl0 = new SelectionRegistrarImpl();
                composer1.O(selectionRegistrarImpl0);
            }
            composer1.g0();
            composer1.V(0xE2A708A4);
            SelectionManager selectionManager0 = composer1.W();
            if(selectionManager0 == composer$Companion0.a()) {
                selectionManager0 = new SelectionManager(selectionRegistrarImpl0);
                composer1.O(selectionManager0);
            }
            composer1.g0();
            selectionManager0.Y(((HapticFeedback)composer1.L(CompositionLocalsKt.n())));
            selectionManager0.Q(((ClipboardManager)composer1.L(CompositionLocalsKt.h())));
            selectionManager0.d0(((TextToolbar)composer1.L(CompositionLocalsKt.u())));
            selectionManager0.a0(function10);
            selectionManager0.b0(selection0);
            selectionManager0.e0(true);
            ContextMenu_androidKt.a(selectionManager0, ComposableLambdaKt.b(composer1, -123806316, true, new o(selectionRegistrarImpl0, modifier0, selectionManager0, o0, v2) {
                final SelectionRegistrarImpl e;
                final Modifier f;
                final SelectionManager g;
                final o h;
                final int i;

                {
                    this.e = selectionRegistrarImpl0;
                    this.f = modifier0;
                    this.g = selectionManager0;
                    this.h = o0;
                    this.i = v;
                    super(2);
                }

                @Composable
                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                public final void a(@m Composer composer0, int v) {
                    if((v & 11) == 2 && composer0.c()) {
                        composer0.m();
                        return;
                    }
                    if(ComposerKt.g0()) {
                        ComposerKt.w0(-123806316, v, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous> (SelectionContainer.kt:94)");
                    }
                    CompositionLocalKt.b(new ProvidedValue[]{SelectionRegistrarKt.a().f(this.e)}, ComposableLambdaKt.b(composer0, 0x37C17254, true, new o(this.g, this.h, this.i) {
                        final Modifier e;
                        final SelectionManager f;
                        final o g;
                        final int h;

                        {
                            this.e = modifier0;
                            this.f = selectionManager0;
                            this.g = o0;
                            this.h = v;
                            super(2);
                        }

                        @Composable
                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        public final void a(@m Composer composer0, int v) {
                            if((v & 11) == 2 && composer0.c()) {
                                composer0.m();
                                return;
                            }
                            if(ComposerKt.g0()) {
                                ComposerKt.w0(0x37C17254, v, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:95)");
                            }
                            Modifier modifier0 = this.f.C();
                            SimpleLayoutKt.a(this.e.r0(modifier0), ComposableLambdaKt.b(composer0, 0x51F9571E, true, new o(this.h, this.f) {
                                final o e;
                                final int f;
                                final SelectionManager g;

                                {
                                    this.e = o0;
                                    this.f = v;
                                    this.g = selectionManager0;
                                    super(2);
                                }

                                @Composable
                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                public final void a(@m Composer composer0, int v) {
                                    int v3;
                                    if((v & 11) == 2 && composer0.c()) {
                                        composer0.m();
                                        return;
                                    }
                                    if(ComposerKt.g0()) {
                                        ComposerKt.w0(0x51F9571E, v, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:98)");
                                    }
                                    this.e.invoke(composer0, ((int)(this.f >> 9 & 14)));
                                    if(this.g.B()) {
                                        Selection selection0 = this.g.F();
                                        if(selection0 != null) {
                                            SelectionManager selectionManager0 = this.g;
                                            List list0 = u.O(new Boolean[]{Boolean.TRUE, Boolean.FALSE});
                                            int v1 = list0.size();
                                            for(int v2 = 0; v2 < v1; v2 = v3 + 1) {
                                                Boolean boolean0 = (Boolean)list0.get(v2);
                                                boolean z = boolean0.booleanValue();
                                                composer0.V(0x44FAF204);
                                                boolean z1 = composer0.t(boolean0);
                                                TextDragObserver textDragObserver0 = composer0.W();
                                                if(z1 || textDragObserver0 == Composer.a.a()) {
                                                    textDragObserver0 = selectionManager0.K(z);
                                                    composer0.O(textDragObserver0);
                                                }
                                                composer0.g0();
                                                Offset offset0 = z ? selectionManager0.H() : selectionManager0.y();
                                                ResolvedTextDirection resolvedTextDirection0 = z ? selection0.h().f() : selection0.f().f();
                                                if(offset0 == null) {
                                                    v3 = v2;
                                                }
                                                else {
                                                    androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.3.1.1.1.1.1 selectionContainerKt$SelectionContainer$3$1$1$1$1$10 = new o(null) {
                                                        int k;
                                                        private Object l;
                                                        final TextDragObserver m;

                                                        {
                                                            this.m = textDragObserver0;
                                                            super(2, d0);
                                                        }

                                                        @m
                                                        public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                                                            return ((androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.3.1.1.1.1.1)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
                                                        }

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @l
                                                        public final d create(@m Object object0, @l d d0) {
                                                            d d1 = new androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.3.1.1.1.1.1(this.m, d0);
                                                            d1.l = object0;
                                                            return d1;
                                                        }

                                                        @Override  // A3.o
                                                        public Object invoke(Object object0, Object object1) {
                                                            return this.a(((PointerInputScope)object0), ((d)object1));
                                                        }

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @m
                                                        public final Object invokeSuspend(@l Object object0) {
                                                            Object object1 = b.l();
                                                            switch(this.k) {
                                                                case 0: {
                                                                    f0.n(object0);
                                                                    this.k = 1;
                                                                    return LongPressTextDragObserverKt.c(((PointerInputScope)this.l), this.m, this) == object1 ? object1 : S0.a;
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
                                                    v3 = v2;
                                                    AndroidSelectionHandles_androidKt.c(offset0.A(), z, resolvedTextDirection0, selection0.g(), SuspendingPointerInputFilterKt.c(Modifier.m0, textDragObserver0, selectionContainerKt$SelectionContainer$3$1$1$1$1$10), null, composer0, 0x30000);
                                                }
                                            }
                                        }
                                    }
                                    if(ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    this.a(((Composer)object0), ((Number)object1).intValue());
                                    return S0.a;
                                }
                            }), composer0, 0x30, 0);
                            if(ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            this.a(((Composer)object0), ((Number)object1).intValue());
                            return S0.a;
                        }
                    }), composer0, 56);
                    if(ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            }), composer1, 56);
            EffectsKt.c(selectionManager0, new Function1(selectionManager0) {
                final SelectionManager e;

                {
                    this.e = selectionManager0;
                    super(1);
                }

                @l
                public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                    L.p(disposableEffectScope0, "$this$DisposableEffect");
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            this.a.L();
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((DisposableEffectScope)object0));
                }
            }, composer1, 8);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier0, selection0, function10, o0, v, v1) {
                final Modifier e;
                final Selection f;
                final Function1 g;
                final o h;
                final int i;
                final int j;

                {
                    this.e = modifier0;
                    this.f = selection0;
                    this.g = function10;
                    this.h = o0;
                    this.i = v;
                    this.j = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    SelectionContainerKt.c(this.e, this.f, this.g, this.h, composer0, (this.i | 1) & -920350135 | ((0x24924924 & (this.i | 1)) >> 1 | 306783378 & (this.i | 1)) | (306783378 & (this.i | 1)) << 1 & (0x24924924 & (this.i | 1)), this.j);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    private static final Selection d(MutableState mutableState0) {
        return (Selection)mutableState0.getValue();
    }

    private static final void e(MutableState mutableState0, Selection selection0) {
        mutableState0.setValue(selection0);
    }
}

