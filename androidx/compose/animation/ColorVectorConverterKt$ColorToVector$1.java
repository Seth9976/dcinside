package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.ranges.s;
import y4.l;

final class ColorVectorConverterKt.ColorToVector.1 extends N implements Function1 {
    public static final ColorVectorConverterKt.ColorToVector.1 e;

    static {
        ColorVectorConverterKt.ColorToVector.1.e = new ColorVectorConverterKt.ColorToVector.1();
    }

    ColorVectorConverterKt.ColorToVector.1() {
        super(1);
    }

    @l
    public final TwoWayConverter a(@l ColorSpace colorSpace0) {
        L.p(colorSpace0, "colorSpace");
        androidx.compose.animation.ColorVectorConverterKt.ColorToVector.1.2 colorVectorConverterKt$ColorToVector$1$20 = new Function1() {
            final ColorSpace e;

            {
                this.e = colorSpace0;
                super(1);
            }

            public final long a(@l AnimationVector4D animationVector4D0) {
                L.p(animationVector4D0, "it");
                float f = (float)Math.pow(animationVector4D0.g(), 3.0);
                float f1 = (float)Math.pow(animationVector4D0.h(), 3.0);
                float f2 = (float)Math.pow(animationVector4D0.i(), 3.0);
                float f3 = ColorVectorConverterKt.e(0, f, f1, f2, ColorVectorConverterKt.c);
                float f4 = ColorVectorConverterKt.e(1, f, f1, f2, ColorVectorConverterKt.c);
                float f5 = ColorVectorConverterKt.e(2, f, f1, f2, ColorVectorConverterKt.c);
                float f6 = s.H(animationVector4D0.f(), 0.0f, 1.0f);
                return Color.u(ColorKt.a(s.H(f3, -2.0f, 2.0f), s.H(f4, -2.0f, 2.0f), s.H(f5, -2.0f, 2.0f), f6, ColorSpaces.a.k()), this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Color.n(this.a(((AnimationVector4D)object0)));
            }
        };
        return VectorConvertersKt.a(androidx.compose.animation.ColorVectorConverterKt.ColorToVector.1.1.e, colorVectorConverterKt$ColorToVector$1$20);

        final class androidx.compose.animation.ColorVectorConverterKt.ColorToVector.1.1 extends N implements Function1 {
            public static final androidx.compose.animation.ColorVectorConverterKt.ColorToVector.1.1 e;

            static {
                androidx.compose.animation.ColorVectorConverterKt.ColorToVector.1.1.e = new androidx.compose.animation.ColorVectorConverterKt.ColorToVector.1.1();
            }

            androidx.compose.animation.ColorVectorConverterKt.ColorToVector.1.1() {
                super(1);
            }

            @l
            public final AnimationVector4D a(long v) {
                long v1 = Color.u(v, ColorSpaces.a.k());
                float f = Color.I(v1);
                float f1 = Color.G(v1);
                float f2 = Color.C(v1);
                return new AnimationVector4D(Color.A(v), ((float)Math.pow(ColorVectorConverterKt.e(0, f, f1, f2, ColorVectorConverterKt.b), 0.333333)), ((float)Math.pow(ColorVectorConverterKt.e(1, f, f1, f2, ColorVectorConverterKt.b), 0.333333)), ((float)Math.pow(ColorVectorConverterKt.e(2, f, f1, f2, ColorVectorConverterKt.b), 0.333333)));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Color)object0).M());
            }
        }

    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((ColorSpace)object0));
    }
}

