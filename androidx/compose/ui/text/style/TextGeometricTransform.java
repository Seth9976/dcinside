package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class TextGeometricTransform {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final TextGeometricTransform a() {
            return TextGeometricTransform.e;
        }

        @Stable
        public static void b() {
        }
    }

    private final float a;
    private final float b;
    @l
    public static final Companion c;
    public static final int d;
    @l
    private static final TextGeometricTransform e;

    static {
        TextGeometricTransform.c = new Companion(null);
        TextGeometricTransform.e = new TextGeometricTransform(1.0f, 0.0f);
    }

    public TextGeometricTransform() {
        this(0.0f, 0.0f, 3, null);
    }

    public TextGeometricTransform(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    public TextGeometricTransform(float f, float f1, int v, w w0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        this(f, f1);
    }

    @l
    public final TextGeometricTransform b(float f, float f1) {
        return new TextGeometricTransform(f, f1);
    }

    public static TextGeometricTransform c(TextGeometricTransform textGeometricTransform0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = textGeometricTransform0.a;
        }
        if((v & 2) != 0) {
            f1 = textGeometricTransform0.b;
        }
        return textGeometricTransform0.b(f, f1);
    }

    public final float d() {
        return this.a;
    }

    public final float e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof TextGeometricTransform ? this.a == ((TextGeometricTransform)object0).a && this.b == ((TextGeometricTransform)object0).b : false;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b);
    }

    @Override
    @l
    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.a + ", skewX=" + this.b + ')';
    }
}

