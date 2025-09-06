package androidx.compose.foundation.text.selection;

import A3.a;
import A3.p;
import android.annotation.SuppressLint;
import android.view.KeyEvent;
import androidx.compose.foundation.MagnifierKt;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class SelectionManager_androidKt {
    public static final boolean a(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "keyEvent");
        return KeyMapping_androidKt.a().a(keyEvent0) == KeyCommand.r;
    }

    @SuppressLint({"ModifierInspectorInfo"})
    @l
    public static final Modifier b(@l Modifier modifier0, @l SelectionManager selectionManager0) {
        L.p(modifier0, "<this>");
        L.p(selectionManager0, "manager");
        return MagnifierStyle.g.c().i() ? ComposedModifierKt.j(modifier0, null, new p(selectionManager0) {
            final SelectionManager e;

            {
                this.e = selectionManager0;
                super(3);
            }

            @Composable
            @l
            public final Modifier c(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(-1914520728);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(-1914520728, v, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:47)");
                }
                Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
                composer0.V(0xE2A708A4);
                MutableState mutableState0 = composer0.W();
                Companion composer$Companion0 = Composer.a;
                if(mutableState0 == composer$Companion0.a()) {
                    mutableState0 = SnapshotStateKt__SnapshotStateKt.g(IntSize.b(0L), null, 2, null);
                    composer0.O(mutableState0);
                }
                composer0.g0();
                androidx.compose.foundation.text.selection.SelectionManager_androidKt.selectionMagnifier.1.1 selectionManager_androidKt$selectionMagnifier$1$10 = new a(mutableState0) {
                    final SelectionManager e;
                    final MutableState f;

                    {
                        this.e = selectionManager0;
                        this.f = mutableState0;
                        super(0);
                    }

                    public final long b() {
                        long v = androidx.compose.foundation.text.selection.SelectionManager_androidKt.selectionMagnifier.1.d(this.f);
                        return SelectionManagerKt.a(this.e, v);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return Offset.d(this.b());
                    }
                };
                composer0.V(0x1E7B2B64);
                boolean z = composer0.t(mutableState0);
                boolean z1 = composer0.t(density0);
                androidx.compose.foundation.text.selection.SelectionManager_androidKt.selectionMagnifier.1.2.1 selectionManager_androidKt$selectionMagnifier$1$2$10 = composer0.W();
                if(z || z1 || selectionManager_androidKt$selectionMagnifier$1$2$10 == composer$Companion0.a()) {
                    selectionManager_androidKt$selectionMagnifier$1$2$10 = new Function1(mutableState0) {
                        final Density e;
                        final MutableState f;

                        {
                            this.e = density0;
                            this.f = mutableState0;
                            super(1);
                        }

                        @l
                        public final Modifier a(@l a a0) {
                            L.p(a0, "center");
                            MagnifierStyle magnifierStyle0 = MagnifierStyle.g.c();
                            androidx.compose.foundation.text.selection.SelectionManager_androidKt.selectionMagnifier.1.2.1.1 selectionManager_androidKt$selectionMagnifier$1$2$1$10 = new Function1() {
                                final a e;

                                {
                                    this.e = a0;
                                    super(1);
                                }

                                public final long a(@l Density density0) {
                                    L.p(density0, "$this$magnifier");
                                    return ((Offset)this.e.invoke()).A();
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    return Offset.d(this.a(((Density)object0)));
                                }
                            };
                            androidx.compose.foundation.text.selection.SelectionManager_androidKt.selectionMagnifier.1.2.1.2 selectionManager_androidKt$selectionMagnifier$1$2$1$20 = new Function1(this.f) {
                                final Density e;
                                final MutableState f;

                                {
                                    this.e = density0;
                                    this.f = mutableState0;
                                    super(1);
                                }

                                public final void a(long v) {
                                    float f = DpSize.p(v);
                                    int v1 = this.e.b1(f);
                                    float f1 = DpSize.m(v);
                                    long v2 = IntSizeKt.a(v1, this.e.b1(f1));
                                    androidx.compose.foundation.text.selection.SelectionManager_androidKt.selectionMagnifier.1.e(this.f, v2);
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    this.a(((DpSize)object0).x());
                                    return S0.a;
                                }
                            };
                            return MagnifierKt.f(Modifier.m0, selectionManager_androidKt$selectionMagnifier$1$2$1$10, null, 0.0f, magnifierStyle0, selectionManager_androidKt$selectionMagnifier$1$2$1$20, 6, null);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((a)object0));
                        }
                    };
                    composer0.O(selectionManager_androidKt$selectionMagnifier$1$2$10);
                }
                composer0.g0();
                Modifier modifier1 = SelectionMagnifierKt.g(modifier0, selectionManager_androidKt$selectionMagnifier$1$10, selectionManager_androidKt$selectionMagnifier$1$2$10);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier1;
            }

            private static final long d(MutableState mutableState0) {
                return ((IntSize)mutableState0.getValue()).q();
            }

            private static final void e(MutableState mutableState0, long v) {
                mutableState0.setValue(IntSize.b(v));
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.c(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        }, 1, null) : modifier0;
    }
}

