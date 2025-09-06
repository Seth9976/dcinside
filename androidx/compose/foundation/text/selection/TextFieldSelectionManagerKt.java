package androidx.compose.foundation.text.selection;

import A3.o;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.J;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,906:1\n50#2:907\n49#2:908\n1114#3,6:909\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n*L\n809#1:907\n809#1:908\n809#1:909,6\n*E\n"})
public final class TextFieldSelectionManagerKt {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[Handle.values().length];
            try {
                arr_v[Handle.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Handle.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Handle.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void a(boolean z, @l ResolvedTextDirection resolvedTextDirection0, @l TextFieldSelectionManager textFieldSelectionManager0, @m Composer composer0, int v) {
        L.p(resolvedTextDirection0, "direction");
        L.p(textFieldSelectionManager0, "manager");
        Composer composer1 = composer0.G(0xAFDBA8B8);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xAFDBA8B8, v, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:803)");
        }
        composer1.V(0x1E7B2B64);
        boolean z1 = composer1.t(Boolean.valueOf(z));
        boolean z2 = composer1.t(textFieldSelectionManager0);
        TextDragObserver textDragObserver0 = composer1.W();
        if(z1 || z2 || textDragObserver0 == Composer.a.a()) {
            textDragObserver0 = textFieldSelectionManager0.M(z);
            composer1.O(textDragObserver0);
        }
        composer1.g0();
        long v1 = textFieldSelectionManager0.B(z);
        boolean z3 = TextRange.m(textFieldSelectionManager0.K().h());
        androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.TextFieldSelectionHandle.1 textFieldSelectionManagerKt$TextFieldSelectionHandle$10 = new o(textDragObserver0, null) {
            int k;
            private Object l;
            final TextDragObserver m;

            {
                this.m = textDragObserver0;
                super(2, d0);
            }

            @m
            public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                return ((androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.TextFieldSelectionHandle.1)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.TextFieldSelectionHandle.1(this.m, d0);
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
        AndroidSelectionHandles_androidKt.c(v1, z, resolvedTextDirection0, z3, SuspendingPointerInputFilterKt.c(Modifier.m0, textDragObserver0, textFieldSelectionManagerKt$TextFieldSelectionHandle$10), null, composer1, v << 3 & 0x70 | 0x30000 | v << 3 & 0x380);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(z, resolvedTextDirection0, textFieldSelectionManager0, v) {
                final boolean e;
                final ResolvedTextDirection f;
                final TextFieldSelectionManager g;
                final int h;

                {
                    this.e = z;
                    this.f = resolvedTextDirection0;
                    this.g = textFieldSelectionManager0;
                    this.h = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    TextFieldSelectionManagerKt.a(this.e, this.f, this.g, composer0, (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    public static final long b(@l TextFieldSelectionManager textFieldSelectionManager0, long v) {
        int v2;
        L.p(textFieldSelectionManager0, "manager");
        if(textFieldSelectionManager0.K().i().length() == 0) {
            return 0x7FC000007FC00000L;
        }
        Handle handle0 = textFieldSelectionManager0.y();
        int v1 = handle0 == null ? -1 : WhenMappings.a[handle0.ordinal()];
        if(v1 != -1) {
            if(v1 == 1 || v1 == 2) {
                v2 = TextRange.n(textFieldSelectionManager0.K().h());
            }
            else {
                if(v1 != 3) {
                    throw new J();
                }
                v2 = TextRange.i(textFieldSelectionManager0.K().h());
            }
            int v3 = textFieldSelectionManager0.E().b(v2);
            TextFieldState textFieldState0 = textFieldSelectionManager0.G();
            if(textFieldState0 != null) {
                TextLayoutResultProxy textLayoutResultProxy0 = textFieldState0.g();
                if(textLayoutResultProxy0 != null) {
                    TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.i();
                    if(textLayoutResult0 != null) {
                        TextFieldState textFieldState1 = textFieldSelectionManager0.G();
                        if(textFieldState1 != null) {
                            TextDelegate textDelegate0 = textFieldState1.r();
                            if(textDelegate0 != null) {
                                AnnotatedString annotatedString0 = textDelegate0.n();
                                if(annotatedString0 != null) {
                                    int v4 = s.J(v3, v.i3(annotatedString0));
                                    long v5 = textLayoutResult0.d(v4).o();
                                    TextFieldState textFieldState2 = textFieldSelectionManager0.G();
                                    if(textFieldState2 != null) {
                                        LayoutCoordinates layoutCoordinates0 = textFieldState2.f();
                                        if(layoutCoordinates0 != null) {
                                            TextFieldState textFieldState3 = textFieldSelectionManager0.G();
                                            if(textFieldState3 != null) {
                                                TextLayoutResultProxy textLayoutResultProxy1 = textFieldState3.g();
                                                if(textLayoutResultProxy1 != null) {
                                                    LayoutCoordinates layoutCoordinates1 = textLayoutResultProxy1.c();
                                                    if(layoutCoordinates1 != null) {
                                                        Offset offset0 = textFieldSelectionManager0.w();
                                                        if(offset0 != null) {
                                                            float f = Offset.p(layoutCoordinates1.P(layoutCoordinates0, offset0.A()));
                                                            int v6 = textLayoutResult0.q(v4);
                                                            int v7 = textLayoutResult0.u(v6);
                                                            int v8 = textLayoutResult0.o(v6, true);
                                                            boolean z = TextRange.n(textFieldSelectionManager0.K().h()) > TextRange.i(textFieldSelectionManager0.K().h());
                                                            float f1 = TextSelectionDelegateKt.a(textLayoutResult0, v7, true, z);
                                                            float f2 = TextSelectionDelegateKt.a(textLayoutResult0, v8, false, z);
                                                            float f3 = s.H(f, Math.min(f1, f2), Math.max(f1, f2));
                                                            return Math.abs(f - f3) > ((float)(((int)(v >> 0x20)) / 2)) ? 0x7FC000007FC00000L : layoutCoordinates0.P(layoutCoordinates1, OffsetKt.a(f3, Offset.r(v5)));
                                                        }
                                                        return 0x7FC000007FC00000L;
                                                    }
                                                }
                                            }
                                            return 0x7FC000007FC00000L;
                                        }
                                    }
                                    return 0x7FC000007FC00000L;
                                }
                            }
                        }
                        return 0x7FC000007FC00000L;
                    }
                }
            }
            return 0x7FC000007FC00000L;
        }
        return 0x7FC000007FC00000L;
    }

    public static final boolean c(@l TextFieldSelectionManager textFieldSelectionManager0, boolean z) {
        L.p(textFieldSelectionManager0, "<this>");
        TextFieldState textFieldState0 = textFieldSelectionManager0.G();
        if(textFieldState0 != null) {
            LayoutCoordinates layoutCoordinates0 = textFieldState0.f();
            if(layoutCoordinates0 != null) {
                Rect rect0 = SelectionManagerKt.f(layoutCoordinates0);
                return rect0 == null ? false : SelectionManagerKt.c(rect0, textFieldSelectionManager0.B(z));
            }
        }
        return false;
    }
}

