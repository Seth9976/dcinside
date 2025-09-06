package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.c0;
import kotlin.coroutines.d;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public abstract class AndroidFont implements Font {
    public interface TypefaceLoader {
        @m
        Typeface a(@l Context arg1, @l AndroidFont arg2);

        @m
        Object b(@l Context arg1, @l AndroidFont arg2, @l d arg3);
    }

    private final int c;
    @l
    private final TypefaceLoader d;
    @l
    private final Settings e;
    public static final int f;

    static {
    }

    private AndroidFont(int v, TypefaceLoader androidFont$TypefaceLoader0) {
        this(v, androidFont$TypefaceLoader0, new Settings(new Setting[0]), null);
    }

    private AndroidFont(int v, TypefaceLoader androidFont$TypefaceLoader0, Settings fontVariation$Settings0) {
        this.c = v;
        this.d = androidFont$TypefaceLoader0;
        this.e = fontVariation$Settings0;
    }

    public AndroidFont(int v, TypefaceLoader androidFont$TypefaceLoader0, Settings fontVariation$Settings0, w w0) {
        this(v, androidFont$TypefaceLoader0, fontVariation$Settings0);
    }

    @k(message = "Replaced with fontVariation constructor", replaceWith = @c0(expression = "AndroidFont(loadingStrategy, typefaceLoader, FontVariation.Settings())", imports = {}))
    public AndroidFont(int v, TypefaceLoader androidFont$TypefaceLoader0, w w0) {
        this(v, androidFont$TypefaceLoader0);
    }

    @l
    public final TypefaceLoader a() {
        return this.d;
    }

    @Override  // androidx.compose.ui.text.font.Font
    public final int c() {
        return this.c;
    }

    @l
    public final Settings e() {
        return this.e;
    }
}

