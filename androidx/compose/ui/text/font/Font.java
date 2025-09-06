package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import kotlin.c0;
import kotlin.k;
import y4.l;

@Immutable
public interface Font {
    public static final class Companion {
        static final Companion a = null;
        public static final long b = 15000L;

        static {
            Companion.a = new Companion();
        }
    }

    @k(message = "Replaced with FontFamily.Resolver during the introduction of async fonts, all usages should be replaced. Custom subclasses can be converted into a FontFamily.Resolver by calling createFontFamilyResolver(myFontFamilyResolver, context)")
    public interface ResourceLoader {
        @k(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @c0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
        @l
        Object a(@l Font arg1);
    }

    @l
    public static final Companion a = null;
    public static final long b = 15000L;

    static {
        Font.a = Companion.a;
    }

    @l
    FontWeight b();

    int c();

    int d();
}

