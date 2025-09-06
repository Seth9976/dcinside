package androidx.compose.ui.graphics.vector;

import A3.a;
import A3.o;
import A3.q;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,420:1\n76#2:421\n102#2,2:422\n76#2:424\n102#2,2:425\n76#2:427\n102#2,2:428\n281#3:430\n282#3:448\n173#4,6:431\n261#4,11:437\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n*L\n178#1:421\n178#1:422,2\n180#1:424\n180#1:425,2\n219#1:427\n219#1:428,2\n255#1:430\n255#1:448\n255#1:431,6\n255#1:437,11\n*E\n"})
public final class VectorPainter extends Painter {
    @l
    private final MutableState g;
    @l
    private final MutableState h;
    @l
    private final VectorComponent i;
    @m
    private Composition j;
    @l
    private final MutableState k;
    private float l;
    @m
    private ColorFilter m;
    public static final int n = 8;

    static {
    }

    public VectorPainter() {
        this.g = SnapshotStateKt__SnapshotStateKt.g(Size.c(0L), null, 2, null);
        this.h = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        VectorComponent vectorComponent0 = new VectorComponent();
        vectorComponent0.o(new a() {
            final VectorPainter e;

            {
                this.e = vectorPainter0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.u(true);
            }
        });
        this.i = vectorComponent0;
        this.k = SnapshotStateKt__SnapshotStateKt.g(Boolean.TRUE, null, 2, null);
        this.l = 1.0f;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected boolean a(float f) {
        this.l = f;
        return true;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected boolean b(@m ColorFilter colorFilter0) {
        this.m = colorFilter0;
        return true;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public long i() {
        return this.r();
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected void k(@l DrawScope drawScope0) {
        L.p(drawScope0, "<this>");
        VectorComponent vectorComponent0 = this.i;
        ColorFilter colorFilter0 = this.m == null ? vectorComponent0.h() : this.m;
        if(!this.p() || drawScope0.getLayoutDirection() != LayoutDirection.b) {
            vectorComponent0.g(drawScope0, this.l, colorFilter0);
        }
        else {
            long v = drawScope0.I();
            DrawContext drawContext0 = drawScope0.J0();
            long v1 = drawContext0.b();
            drawContext0.a().f();
            drawContext0.d().f(-1.0f, 1.0f, v);
            vectorComponent0.g(drawScope0, this.l, colorFilter0);
            drawContext0.a().v();
            drawContext0.c(v1);
        }
        if(this.s()) {
            this.u(false);
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void l(@l String s, float f, float f1, @l q q0, @m Composer composer0, int v) {
        L.p(s, "name");
        L.p(q0, "content");
        Composer composer1 = composer0.G(0x4B64C23F);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x4B64C23F, v, -1, "androidx.compose.ui.graphics.vector.VectorPainter.RenderVector (VectorPainter.kt:221)");
        }
        this.i.p(s);
        this.i.r(f);
        this.i.q(f1);
        Composition composition0 = this.o(ComposablesKt.u(composer1, 0), q0);
        EffectsKt.c(composition0, new Function1() {
            final Composition e;

            {
                this.e = composition0;
                super(1);
            }

            @l
            public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                L.p(disposableEffectScope0, "$this$DisposableEffect");
                return new DisposableEffectResult() {
                    @Override  // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.a.dispose();
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
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(s, f, f1, q0, v) {
                final VectorPainter e;
                final String f;
                final float g;
                final float h;
                final q i;
                final int j;

                {
                    this.e = vectorPainter0;
                    this.f = s;
                    this.g = f;
                    this.h = f1;
                    this.i = q0;
                    this.j = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    this.e.l(this.f, this.g, this.h, this.i, composer0, (this.j | 1) & -920350135 | ((0x24924924 & (this.j | 1)) >> 1 | 306783378 & (this.j | 1)) | (306783378 & (this.j | 1)) << 1 & (0x24924924 & (this.j | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private final Composition o(CompositionContext compositionContext0, q q0) {
        Composition composition0 = this.j != null && !this.j.a() ? this.j : CompositionKt.a(new VectorApplier(this.i.k()), compositionContext0);
        this.j = composition0;
        composition0.b(ComposableLambdaKt.c(-1916507005, true, new o(this) {
            final q e;
            final VectorPainter f;

            {
                this.e = q0;
                this.f = vectorPainter0;
                super(2);
            }

            @Composable
            public final void a(@m Composer composer0, int v) {
                if((v & 11) == 2 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(-1916507005, v, -1, "androidx.compose.ui.graphics.vector.VectorPainter.composeVector.<anonymous> (VectorPainter.kt:212)");
                }
                this.e.T0(this.f.i.m(), this.f.i.l(), composer0, 0);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((Composer)object0), ((Number)object1).intValue());
                return S0.a;
            }
        }));
        return composition0;
    }

    public final boolean p() {
        return ((Boolean)this.h.getValue()).booleanValue();
    }

    @m
    public final ColorFilter q() {
        return this.i.h();
    }

    public final long r() {
        return ((Size)this.g.getValue()).y();
    }

    private final boolean s() {
        return ((Boolean)this.k.getValue()).booleanValue();
    }

    public final void t(boolean z) {
        this.h.setValue(Boolean.valueOf(z));
    }

    private final void u(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    public final void v(@m ColorFilter colorFilter0) {
        this.i.n(colorFilter0);
    }

    public final void w(long v) {
        Size size0 = Size.c(v);
        this.g.setValue(size0);
    }
}

