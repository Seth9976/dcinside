package androidx.compose.ui.graphics.vector;

import A3.o;
import A3.q;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.c0;
import kotlin.collections.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import y4.l;
import y4.m;

@s0({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,420:1\n76#2:421\n1#3:422\n50#4:423\n49#4:424\n25#4:431\n1114#5,6:425\n1114#5,6:432\n173#6,6:438\n261#6,11:444\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n*L\n127#1:421\n134#1:423\n134#1:424\n142#1:431\n134#1:425,6\n142#1:432,6\n281#1:438,6\n281#1:444,11\n*E\n"})
public final class VectorPainterKt {
    @l
    public static final String a = "VectorRootGroup";

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    public static final void a(@l VectorGroup vectorGroup0, @m Map map0, @m Composer composer0, int v, int v1) {
        Map map1;
        Map map3;
        int v2;
        L.p(vectorGroup0, "group");
        Composer composer1 = composer0.G(0xE567D85F);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(vectorGroup0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 16;
        }
        if((v1 & 2) != 2 || (v2 & 91) != 18 || !composer1.c()) {
            Map map2 = (v1 & 2) == 0 ? map0 : Y.z();
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xE567D85F, v, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:327)");
            }
            for(Object object0: vectorGroup0) {
                VectorNode vectorNode0 = (VectorNode)object0;
                if(vectorNode0 instanceof VectorPath) {
                    composer1.V(0xEC8D4659);
                    VectorConfig vectorConfig0 = (VectorConfig)map2.get(((VectorPath)vectorNode0).c());
                    if(vectorConfig0 == null) {
                        vectorConfig0 = new VectorConfig() {
                            @Override  // androidx.compose.ui.graphics.vector.VectorConfig
                            public Object a(VectorProperty vectorProperty0, Object object0) {
                                return a.a(this, vectorProperty0, object0);
                            }
                        };
                    }
                    List list0 = ((VectorPath)vectorNode0).d();
                    List list1 = (List)vectorConfig0.a(PathData.b, list0);
                    int v3 = ((VectorPath)vectorNode0).g();
                    String s = ((VectorPath)vectorNode0).c();
                    Brush brush0 = ((VectorPath)vectorNode0).a();
                    Brush brush1 = (Brush)vectorConfig0.a(Fill.b, brush0);
                    Float float0 = ((VectorPath)vectorNode0).b();
                    float f = ((Number)vectorConfig0.a(FillAlpha.b, float0)).floatValue();
                    Brush brush2 = ((VectorPath)vectorNode0).h();
                    Brush brush3 = (Brush)vectorConfig0.a(Stroke.b, brush2);
                    Float float1 = ((VectorPath)vectorNode0).i();
                    float f1 = ((Number)vectorConfig0.a(StrokeAlpha.b, float1)).floatValue();
                    Float float2 = ((VectorPath)vectorNode0).m();
                    float f2 = ((Number)vectorConfig0.a(StrokeLineWidth.b, float2)).floatValue();
                    int v4 = ((VectorPath)vectorNode0).j();
                    int v5 = ((VectorPath)vectorNode0).k();
                    float f3 = ((VectorPath)vectorNode0).l();
                    Float float3 = ((VectorPath)vectorNode0).q();
                    float f4 = ((Number)vectorConfig0.a(TrimPathStart.b, float3)).floatValue();
                    Float float4 = ((VectorPath)vectorNode0).o();
                    float f5 = ((Number)vectorConfig0.a(TrimPathEnd.b, float4)).floatValue();
                    Float float5 = ((VectorPath)vectorNode0).p();
                    VectorComposeKt.b(list1, v3, s, brush1, f, brush3, f1, f2, v4, v5, f3, f4, f5, ((Number)vectorConfig0.a(TrimPathOffset.b, float5)).floatValue(), composer1, 8, 0, 0);
                    composer1.g0();
                }
                else {
                    if(vectorNode0 instanceof VectorGroup) {
                        composer1.V(0xEC8D4D9B);
                        map3 = map2;
                        VectorConfig vectorConfig1 = (VectorConfig)map3.get("");
                        if(vectorConfig1 == null) {
                            vectorConfig1 = new VectorConfig() {
                                @Override  // androidx.compose.ui.graphics.vector.VectorConfig
                                public Object a(VectorProperty vectorProperty0, Object object0) {
                                    return a.a(this, vectorProperty0, object0);
                                }
                            };
                        }
                        Float float6 = ((VectorGroup)vectorNode0).i();
                        float f6 = ((Number)vectorConfig1.a(Rotation.b, float6)).floatValue();
                        Float float7 = ((VectorGroup)vectorNode0).j();
                        float f7 = ((Number)vectorConfig1.a(ScaleX.b, float7)).floatValue();
                        Float float8 = ((VectorGroup)vectorNode0).k();
                        float f8 = ((Number)vectorConfig1.a(ScaleY.b, float8)).floatValue();
                        Float float9 = ((VectorGroup)vectorNode0).m();
                        float f9 = ((Number)vectorConfig1.a(TranslateX.b, float9)).floatValue();
                        Float float10 = ((VectorGroup)vectorNode0).o();
                        float f10 = ((Number)vectorConfig1.a(TranslateY.b, float10)).floatValue();
                        Float float11 = ((VectorGroup)vectorNode0).g();
                        float f11 = ((Number)vectorConfig1.a(PivotX.b, float11)).floatValue();
                        Float float12 = ((VectorGroup)vectorNode0).h();
                        float f12 = ((Number)vectorConfig1.a(PivotY.b, float12)).floatValue();
                        List list2 = ((VectorGroup)vectorNode0).c();
                        VectorComposeKt.a("", f6, f11, f12, f7, f8, f9, f10, ((List)vectorConfig1.a(PathData.b, list2)), ComposableLambdaKt.b(composer1, 1450046638, true, new o(vectorNode0, map3) {
                            final VectorNode e;
                            final Map f;

                            {
                                this.e = vectorNode0;
                                this.f = map0;
                                super(2);
                            }

                            @Composable
                            @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
                            public final void a(@m Composer composer0, int v) {
                                if((v & 11) == 2 && composer0.c()) {
                                    composer0.m();
                                    return;
                                }
                                if(ComposerKt.g0()) {
                                    ComposerKt.w0(1450046638, v, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:413)");
                                }
                                VectorPainterKt.a(((VectorGroup)this.e), this.f, composer0, 0x40, 0);
                                if(ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                this.a(((Composer)object0), ((Number)object1).intValue());
                                return S0.a;
                            }
                        }), composer1, 0x38000000, 0);
                    }
                    else {
                        map3 = map2;
                        composer1.V(-326282407);
                    }
                    composer1.g0();
                    map2 = map3;
                }
            }
            map1 = map2;
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
            map1 = map0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(vectorGroup0, map1, v, v1) {
                final VectorGroup e;
                final Map f;
                final int g;
                final int h;

                {
                    this.e = vectorGroup0;
                    this.f = map0;
                    this.g = v;
                    this.h = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    VectorPainterKt.a(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    private static final void b(DrawScope drawScope0, Function1 function10) {
        long v = drawScope0.I();
        DrawContext drawContext0 = drawScope0.J0();
        long v1 = drawContext0.b();
        drawContext0.a().f();
        drawContext0.d().f(-1.0f, 1.0f, v);
        function10.invoke(drawScope0);
        drawContext0.a().v();
        drawContext0.c(v1);
    }

    @Composable
    @l
    public static final VectorPainter c(@l ImageVector imageVector0, @m Composer composer0, int v) {
        L.p(imageVector0, "image");
        composer0.V(0x544566B0);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x544566B0, v, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:157)");
        }
        VectorPainter vectorPainter0 = VectorPainterKt.e(imageVector0.c(), imageVector0.b(), imageVector0.i(), imageVector0.h(), imageVector0.d(), imageVector0.g(), imageVector0.f(), imageVector0.a(), ComposableLambdaKt.b(composer0, 0x6FA7E78E, true, new q(imageVector0) {
            final ImageVector e;

            {
                this.e = imageVector0;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((Number)object0).floatValue(), ((Number)object1).floatValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
            public final void a(float f, float f1, @m Composer composer0, int v) {
                if((v & 11) == 2 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x6FA7E78E, v, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous> (VectorPainter.kt:167)");
                }
                VectorPainterKt.a(this.e.e(), null, composer0, 0, 2);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        }), composer0, 0x6000000, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return vectorPainter0;
    }

    @Composable
    @ComposableOpenTarget(index = -1)
    @k(message = "Replace rememberVectorPainter graphicsLayer that consumes the auto mirror flag", replaceWith = @c0(expression = "rememberVectorPainter(defaultWidth, defaultHeight, viewportWidth, viewportHeight, name, tintColor, tintBlendMode, false, content)", imports = {"androidx.compose.ui.graphics.vector"}))
    @l
    public static final VectorPainter d(float f, float f1, float f2, float f3, @m String s, long v, int v1, @l q q0, @m Composer composer0, int v2, int v3) {
        L.p(q0, "content");
        composer0.V(0xC684F466);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xC684F466, v2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:73)");
        }
        VectorPainter vectorPainter0 = VectorPainterKt.e(f, f1, ((v3 & 4) == 0 ? f2 : NaNf), ((v3 & 8) == 0 ? f3 : NaNf), ((v3 & 16) == 0 ? s : "VectorRootGroup"), ((v3 & 0x20) == 0 ? v : 16L), ((v3 & 0x40) == 0 ? v1 : 5), false, q0, composer0, v2 & 14 | 0xC00000 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00 | 0xE000 & v2 | 0x70000 & v2 | 0x380000 & v2 | v2 << 3 & 0xE000000, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return vectorPainter0;
    }

    @Composable
    @ComposableOpenTarget(index = -1)
    @l
    public static final VectorPainter e(float f, float f1, float f2, float f3, @m String s, long v, int v1, boolean z, @l q q0, @m Composer composer0, int v2, int v3) {
        L.p(q0, "content");
        composer0.V(1068590786);
        float f4 = NaNf;
        float f5 = (v3 & 4) == 0 ? f2 : NaNf;
        if((v3 & 8) == 0) {
            f4 = f3;
        }
        long v4 = (v3 & 0x20) == 0 ? v : 16L;
        int v5 = (v3 & 0x40) == 0 ? v1 : 5;
        if(ComposerKt.g0()) {
            ComposerKt.w0(1068590786, v2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:115)");
        }
        Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
        float f6 = density0.y1(f);
        float f7 = density0.y1(f1);
        if(Float.isNaN(f5)) {
            f5 = f6;
        }
        if(Float.isNaN(f4)) {
            f4 = f7;
        }
        Color color0 = Color.n(v4);
        BlendMode blendMode0 = BlendMode.D(v5);
        composer0.V(0x1E7B2B64);
        boolean z1 = composer0.t(color0);
        boolean z2 = composer0.t(blendMode0);
        ColorFilter colorFilter0 = composer0.W();
        if(z1 || z2 || colorFilter0 == Composer.a.a()) {
            colorFilter0 = Color.y(v4, 16L) ? null : ColorFilter.b.c(v4, v5);
            composer0.O(colorFilter0);
        }
        composer0.g0();
        composer0.V(0xE2A708A4);
        VectorPainter vectorPainter0 = composer0.W();
        if(vectorPainter0 == Composer.a.a()) {
            vectorPainter0 = new VectorPainter();
            composer0.O(vectorPainter0);
        }
        composer0.g0();
        vectorPainter0.w(SizeKt.a(f6, f7));
        vectorPainter0.t(((v3 & 0x80) == 0 ? z : false));
        vectorPainter0.v(colorFilter0);
        vectorPainter0.l(((v3 & 16) == 0 ? s : "VectorRootGroup"), f5, f4, q0, composer0, v2 >> 12 & 14 | 0x8000 | v2 >> 15 & 0x1C00);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return vectorPainter0;
    }
}

