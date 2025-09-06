package androidx.compose.foundation.layout;

import A3.o;
import A3.p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,124:1\n50#2:125\n49#2:126\n1057#3,6:127\n*S KotlinDebug\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n*L\n67#1:125\n67#1:126\n67#1:127,6\n*E\n"})
public final class BoxWithConstraintsKt {
    @Composable
    @UiComposable
    public static final void a(@m Modifier modifier0, @m Alignment alignment0, boolean z, @l p p0, @m Composer composer0, int v, int v1) {
        int v2;
        L.p(p0, "content");
        Composer composer1 = composer0.G(0x6A3450FD);
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
            v2 |= (composer1.t(alignment0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.v(z) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(p0) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.c()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.m0;
            }
            if((v1 & 2) != 0) {
                alignment0 = Alignment.a.C();
            }
            if((v1 & 4) != 0) {
                z = false;
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x6A3450FD, v2, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:58)");
            }
            MeasurePolicy measurePolicy0 = BoxKt.k(alignment0, z, composer1, v2 >> 3 & 0x7E);
            composer1.V(0x1E7B2B64);
            boolean z1 = composer1.t(p0);
            boolean z2 = composer1.t(measurePolicy0);
            androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints.1.1 boxWithConstraintsKt$BoxWithConstraints$1$10 = composer1.W();
            if(z1 || z2 || boxWithConstraintsKt$BoxWithConstraints$1$10 == Composer.a.a()) {
                boxWithConstraintsKt$BoxWithConstraints$1$10 = new o(measurePolicy0, p0, v2) {
                    final MeasurePolicy e;
                    final p f;
                    final int g;

                    {
                        this.e = measurePolicy0;
                        this.f = p0;
                        this.g = v;
                        super(2);
                    }

                    @l
                    public final MeasureResult a(@l SubcomposeMeasureScope subcomposeMeasureScope0, long v) {
                        L.p(subcomposeMeasureScope0, "$this$SubcomposeLayout");
                        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl0 = new BoxWithConstraintsScopeImpl(subcomposeMeasureScope0, v, null);
                        ComposableLambda composableLambda0 = ComposableLambdaKt.c(-1945019079, true, new o(boxWithConstraintsScopeImpl0, this.g) {
                            final p e;
                            final BoxWithConstraintsScopeImpl f;
                            final int g;

                            {
                                this.e = p0;
                                this.f = boxWithConstraintsScopeImpl0;
                                this.g = v;
                                super(2);
                            }

                            @Composable
                            public final void a(@m Composer composer0, int v) {
                                if((v & 11) == 2 && composer0.c()) {
                                    composer0.m();
                                    return;
                                }
                                if(ComposerKt.g0()) {
                                    ComposerKt.w0(-1945019079, v, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                                }
                                this.e.invoke(this.f, composer0, ((int)(this.g >> 6 & 0x70)));
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
                        List list0 = subcomposeMeasureScope0.d0(S0.a, composableLambda0);
                        return this.e.a(subcomposeMeasureScope0, list0, v);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((SubcomposeMeasureScope)object0), ((Constraints)object1).x());
                    }
                };
                composer1.O(boxWithConstraintsKt$BoxWithConstraints$1$10);
            }
            composer1.g0();
            SubcomposeLayoutKt.a(modifier0, boxWithConstraintsKt$BoxWithConstraints$1$10, composer1, v2 & 14, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier0, alignment0, z, p0, v, v1) {
                final Modifier e;
                final Alignment f;
                final boolean g;
                final p h;
                final int i;
                final int j;

                {
                    this.e = modifier0;
                    this.f = alignment0;
                    this.g = z;
                    this.h = p0;
                    this.i = v;
                    this.j = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    BoxWithConstraintsKt.a(this.e, this.f, this.g, this.h, composer0, this.i | 1, this.j);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }
}

