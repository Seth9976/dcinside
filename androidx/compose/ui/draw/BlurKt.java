package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,153:1\n154#2:154\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n112#1:154\n*E\n"})
public final class BlurKt {
    @Stable
    @l
    public static final Modifier a(@l Modifier modifier0, float f, float f1, @l Shape shape0) {
        L.p(modifier0, "$this$blur");
        if(shape0 != null) {
            return GraphicsLayerModifierKt.a(modifier0, new Function1(f, f1, 0, shape0, true) {
                final float e;
                final float f;
                final int g;
                final Shape h;
                final boolean i;

                {
                    this.e = f;
                    this.f = f1;
                    this.g = v;
                    this.h = shape0;
                    this.i = z;
                    super(1);
                }

                public final void a(@l GraphicsLayerScope graphicsLayerScope0) {
                    L.p(graphicsLayerScope0, "$this$graphicsLayer");
                    float f = graphicsLayerScope0.y1(this.e);
                    float f1 = graphicsLayerScope0.y1(this.f);
                    graphicsLayerScope0.T((f <= 0.0f || f1 <= 0.0f ? null : RenderEffectKt.a(f, f1, this.g)));
                    graphicsLayerScope0.I0((this.h == null ? RectangleShapeKt.a() : this.h));
                    graphicsLayerScope0.o0(this.i);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((GraphicsLayerScope)object0));
                    return S0.a;
                }
            });
        }
        return Dp.f(f, 0.0f) <= 0 || Dp.f(f1, 0.0f) <= 0 ? modifier0 : GraphicsLayerModifierKt.a(modifier0, new Function1(f, f1, 3, null, false) {
            final float e;
            final float f;
            final int g;
            final Shape h;
            final boolean i;

            {
                this.e = f;
                this.f = f1;
                this.g = v;
                this.h = shape0;
                this.i = z;
                super(1);
            }

            public final void a(@l GraphicsLayerScope graphicsLayerScope0) {
                L.p(graphicsLayerScope0, "$this$graphicsLayer");
                float f = graphicsLayerScope0.y1(this.e);
                float f1 = graphicsLayerScope0.y1(this.f);
                graphicsLayerScope0.T((f <= 0.0f || f1 <= 0.0f ? null : RenderEffectKt.a(f, f1, this.g)));
                graphicsLayerScope0.I0((this.h == null ? RectangleShapeKt.a() : this.h));
                graphicsLayerScope0.o0(this.i);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((GraphicsLayerScope)object0));
                return S0.a;
            }
        });
    }

    public static Modifier b(Modifier modifier0, float f, float f1, BlurredEdgeTreatment blurredEdgeTreatment0, int v, Object object0) {
        if((v & 4) != 0) {
            blurredEdgeTreatment0 = BlurredEdgeTreatment.c(BlurredEdgeTreatment.b.a());
        }
        return BlurKt.a(modifier0, f, f1, blurredEdgeTreatment0.j());
    }

    @Stable
    @l
    public static final Modifier c(@l Modifier modifier0, float f, @l Shape shape0) {
        L.p(modifier0, "$this$blur");
        return BlurKt.a(modifier0, f, f, shape0);
    }

    public static Modifier d(Modifier modifier0, float f, BlurredEdgeTreatment blurredEdgeTreatment0, int v, Object object0) {
        if((v & 2) != 0) {
            blurredEdgeTreatment0 = BlurredEdgeTreatment.c(BlurredEdgeTreatment.b.a());
        }
        return BlurKt.c(modifier0, f, blurredEdgeTreatment0.j());
    }
}

