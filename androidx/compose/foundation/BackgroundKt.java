package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,147:1\n135#2:148\n135#2:149\n*S KotlinDebug\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n49#1:148\n78#1:149\n*E\n"})
public final class BackgroundKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l Brush brush0, @l Shape shape0, float f) {
        L.p(modifier0, "<this>");
        L.p(brush0, "brush");
        L.p(shape0, "shape");
        return modifier0.r0(new Background(null, brush0, f, shape0, InspectableValueKt.b(), 1, null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n1#1,170:1\n79#2,5:171\n*E\n"})
        public final class androidx.compose.foundation.BackgroundKt.background..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final Brush f;
            final Shape g;

            public androidx.compose.foundation.BackgroundKt.background..inlined.debugInspectorInfo.1(float f, Brush brush0, Shape shape0) {
                this.e = f;
                this.f = brush0;
                this.g = shape0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("background");
                inspectorInfo0.b().c("alpha", this.e);
                inspectorInfo0.b().c("brush", this.f);
                inspectorInfo0.b().c("shape", this.g);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier b(Modifier modifier0, Brush brush0, Shape shape0, float f, int v, Object object0) {
        if((v & 2) != 0) {
            shape0 = RectangleShapeKt.a();
        }
        if((v & 4) != 0) {
            f = 1.0f;
        }
        return BackgroundKt.a(modifier0, brush0, shape0, f);
    }

    @l
    public static final Modifier c(@l Modifier modifier0, long v, @l Shape shape0) {
        L.p(modifier0, "$this$background");
        L.p(shape0, "shape");
        return modifier0.r0(new Background(Color.n(v), null, 0.0f, shape0, InspectableValueKt.b(), 6, null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n1#1,170:1\n50#2,5:171\n*E\n"})
        public final class androidx.compose.foundation.BackgroundKt.background-bw27NRU..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final long e;
            final Shape f;

            public androidx.compose.foundation.BackgroundKt.background-bw27NRU..inlined.debugInspectorInfo.1(long v, Shape shape0) {
                this.e = v;
                this.f = shape0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("background");
                inspectorInfo0.e(Color.n(this.e));
                inspectorInfo0.b().c("color", Color.n(this.e));
                inspectorInfo0.b().c("shape", this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier d(Modifier modifier0, long v, Shape shape0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            shape0 = RectangleShapeKt.a();
        }
        return BackgroundKt.c(modifier0, v, shape0);
    }
}

