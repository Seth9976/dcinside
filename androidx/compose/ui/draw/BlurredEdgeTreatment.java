package androidx.compose.ui.draw;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.g;

@Immutable
@g
public final class BlurredEdgeTreatment {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Shape a() {
            return BlurredEdgeTreatment.c;
        }

        @l
        public final Shape b() {
            return BlurredEdgeTreatment.d;
        }
    }

    @m
    private final Shape a;
    @l
    public static final Companion b;
    @l
    private static final Shape c;
    @l
    private static final Shape d;

    static {
        BlurredEdgeTreatment.b = new Companion(null);
        BlurredEdgeTreatment.c = RectangleShapeKt.a();
        BlurredEdgeTreatment.d = null;
    }

    private BlurredEdgeTreatment(Shape shape0) {
        this.a = shape0;
    }

    public static final BlurredEdgeTreatment c(Shape shape0) {
        return new BlurredEdgeTreatment(shape0);
    }

    @l
    public static Shape d(@m Shape shape0) [...] // Inlined contents

    // 去混淆评级： 低(20)
    public static boolean e(Shape shape0, Object object0) {
        return object0 instanceof BlurredEdgeTreatment ? L.g(shape0, ((BlurredEdgeTreatment)object0).j()) : false;
    }

    @Override
    public boolean equals(Object object0) {
        return BlurredEdgeTreatment.e(this.a, object0);
    }

    public static final boolean f(Shape shape0, Shape shape1) {
        return L.g(shape0, shape1);
    }

    @m
    public final Shape g() {
        return this.a;
    }

    public static int h(Shape shape0) {
        return shape0 == null ? 0 : shape0.hashCode();
    }

    @Override
    public int hashCode() {
        return BlurredEdgeTreatment.h(this.a);
    }

    public static String i(Shape shape0) [...] // Inlined contents

    public final Shape j() {
        return this.a;
    }

    @Override
    public String toString() {
        return "BlurredEdgeTreatment(shape=" + this.a + ')';
    }
}

