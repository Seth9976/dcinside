package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class ImageBitmapConfig {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final int a() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int b() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int c() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int d() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int e() [...] // 潜在的解密器
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;

    static {
        ImageBitmapConfig.b = new Companion(null);
        ImageBitmapConfig.c = 0;
        ImageBitmapConfig.d = 1;
        ImageBitmapConfig.e = 2;
        ImageBitmapConfig.f = 3;
        ImageBitmapConfig.g = 4;
    }

    private ImageBitmapConfig(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final int e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return ImageBitmapConfig.h(this.a, object0);
    }

    public static final ImageBitmapConfig f(int v) {
        return new ImageBitmapConfig(v);
    }

    public static int g(int v) [...] // Inlined contents

    public static boolean h(int v, Object object0) {
        return object0 instanceof ImageBitmapConfig ? v == ((ImageBitmapConfig)object0).m() : false;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public static final boolean i(int v, int v1) {
        return v == v1;
    }

    public final int j() {
        return this.a;
    }

    public static int k(int v) [...] // Inlined contents

    @l
    public static String l(int v) {
        if(ImageBitmapConfig.i(v, 0)) {
            return "Argb8888";
        }
        if(ImageBitmapConfig.i(v, 1)) {
            return "Alpha8";
        }
        if(ImageBitmapConfig.i(v, ImageBitmapConfig.e)) {
            return "Rgb565";
        }
        if(ImageBitmapConfig.i(v, ImageBitmapConfig.f)) {
            return "F16";
        }
        return ImageBitmapConfig.i(v, ImageBitmapConfig.g) ? "Gpu" : "Unknown";
    }

    public final int m() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return ImageBitmapConfig.l(this.a);
    }
}

