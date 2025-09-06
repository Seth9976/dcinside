package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.S0;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import y4.l;

@s0({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,123:1\n154#2:124\n154#2:125\n154#2:128\n135#3:126\n146#3:127\n*S KotlinDebug\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n64#1:124\n101#1:125\n98#1:128\n103#1:126\n102#1:127\n*E\n"})
public final class ShadowKt {
    @Stable
    @l
    public static final Modifier a(@l Modifier modifier0, float f, @l Shape shape0, boolean z, long v, long v1) {
        L.p(modifier0, "$this$shadow");
        L.p(shape0, "shape");
        if(Dp.f(f, 0.0f) > 0 || z) {
            androidx.compose.ui.draw.ShadowKt.shadow.2.1 shadowKt$shadow$2$10 = new Function1(f, shape0, z, v, v1) {
                final float e;
                final Shape f;
                final boolean g;
                final long h;
                final long i;

                {
                    this.e = f;
                    this.f = shape0;
                    this.g = z;
                    this.h = v;
                    this.i = v1;
                    super(1);
                }

                public final void a(@l GraphicsLayerScope graphicsLayerScope0) {
                    L.p(graphicsLayerScope0, "$this$graphicsLayer");
                    graphicsLayerScope0.q0(graphicsLayerScope0.y1(this.e));
                    graphicsLayerScope0.I0(this.f);
                    graphicsLayerScope0.o0(this.g);
                    graphicsLayerScope0.Z0(this.h);
                    graphicsLayerScope0.c1(this.i);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((GraphicsLayerScope)object0));
                    return S0.a;
                }
            };
            return InspectableValueKt.d(modifier0, InspectableValueKt.b(), GraphicsLayerModifierKt.a(Modifier.m0, shadowKt$shadow$2$10));
        }
        return modifier0;

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n1#1,170:1\n104#2,7:171\n*E\n"})
        public final class androidx.compose.ui.draw.ShadowKt.shadow-s4CzXII..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final Shape f;
            final boolean g;
            final long h;
            final long i;

            public androidx.compose.ui.draw.ShadowKt.shadow-s4CzXII..inlined.debugInspectorInfo.1(float f, Shape shape0, boolean z, long v, long v1) {
                this.e = f;
                this.f = shape0;
                this.g = z;
                this.h = v;
                this.i = v1;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("shadow");
                inspectorInfo0.b().c("elevation", Dp.d(this.e));
                inspectorInfo0.b().c("shape", this.f);
                inspectorInfo0.b().c("clip", Boolean.valueOf(this.g));
                inspectorInfo0.b().c("ambientColor", Color.n(this.h));
                inspectorInfo0.b().c("spotColor", Color.n(this.i));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier b(Modifier modifier0, float f, Shape shape0, boolean z, long v, long v1, int v2, Object object0) {
        Shape shape1 = (v2 & 2) == 0 ? shape0 : RectangleShapeKt.a();
        boolean z1 = false;
        if((v2 & 4) == 0) {
            z1 = z;
        }
        else if(Dp.f(f, 0.0f) > 0) {
            z1 = true;
        }
        long v3 = (v2 & 8) == 0 ? v : 0xFF00000000000000L;
        return (v2 & 16) == 0 ? ShadowKt.a(modifier0, f, shape1, z1, v3, v1) : ShadowKt.a(modifier0, f, shape1, z1, v3, 0xFF00000000000000L);
    }

    @Stable
    @k(level = m.c, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @c0(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    public static final Modifier c(Modifier modifier0, float f, Shape shape0, boolean z) {
        L.p(modifier0, "$this$shadow");
        L.p(shape0, "shape");
        return ShadowKt.a(modifier0, f, shape0, z, 0xFF00000000000000L, 0xFF00000000000000L);
    }

    public static Modifier d(Modifier modifier0, float f, Shape shape0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            shape0 = RectangleShapeKt.a();
        }
        if((v & 4) != 0) {
            z = false;
            if(Dp.f(f, 0.0f) > 0) {
                z = true;
            }
        }
        return ShadowKt.c(modifier0, f, shape0, z);
    }
}

