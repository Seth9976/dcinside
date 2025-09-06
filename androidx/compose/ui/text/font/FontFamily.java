package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.State;
import kotlin.coroutines.d;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

@Immutable
public abstract class FontFamily {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final GenericFontFamily a() {
            return FontFamily.h;
        }

        @l
        public final SystemFontFamily b() {
            return FontFamily.d;
        }

        @l
        public final GenericFontFamily c() {
            return FontFamily.g;
        }

        @l
        public final GenericFontFamily d() {
            return FontFamily.e;
        }

        @l
        public final GenericFontFamily e() {
            return FontFamily.f;
        }
    }

    public interface Resolver {
        @m
        Object a(@l FontFamily arg1, @l d arg2);

        @l
        State b(@m FontFamily arg1, @l FontWeight arg2, int arg3, int arg4);
    }

    private final boolean a;
    @l
    public static final Companion b;
    public static final int c;
    @l
    private static final SystemFontFamily d;
    @l
    private static final GenericFontFamily e;
    @l
    private static final GenericFontFamily f;
    @l
    private static final GenericFontFamily g;
    @l
    private static final GenericFontFamily h;

    static {
        FontFamily.b = new Companion(null);
        FontFamily.d = new DefaultFontFamily();
        FontFamily.e = new GenericFontFamily("sans-serif", "FontFamily.SansSerif");
        FontFamily.f = new GenericFontFamily("serif", "FontFamily.Serif");
        FontFamily.g = new GenericFontFamily("monospace", "FontFamily.Monospace");
        FontFamily.h = new GenericFontFamily("cursive", "FontFamily.Cursive");
    }

    private FontFamily(boolean z) {
        this.a = z;
    }

    public FontFamily(boolean z, w w0) {
        this(z);
    }

    @k(level = kotlin.m.b, message = "Unused property that has no meaning. Do not use.")
    public final boolean h() {
        return this.a;
    }

    public static void i() {
    }
}

