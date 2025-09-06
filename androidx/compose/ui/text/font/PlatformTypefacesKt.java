package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class PlatformTypefacesKt {
    @l
    public static final PlatformTypefaces a() {
        return Build.VERSION.SDK_INT >= 28 ? new PlatformTypefacesApi28() : new PlatformTypefacesApi();
    }

    @VisibleForTesting
    @l
    public static final String b(@l String s, @l FontWeight fontWeight0) {
        L.p(s, "name");
        L.p(fontWeight0, "fontWeight");
        int v = fontWeight0.w();
        if(v / 100 >= 0 && v / 100 < 2) {
            return s + "-thin";
        }
        if(2 <= v / 100 && v / 100 < 4) {
            return s + "-light";
        }
        switch(v / 100) {
            case 4: {
                return s;
            }
            case 5: {
                return s + "-medium";
            }
            default: {
                return 6 <= v / 100 && v / 100 < 8 || 8 > v / 100 || v / 100 >= 11 ? s : s + "-black";
            }
        }
    }

    @ExperimentalTextApi
    @m
    public static final Typeface c(@m Typeface typeface0, @l Settings fontVariation$Settings0, @l Context context0) {
        L.p(fontVariation$Settings0, "variationSettings");
        L.p(context0, "context");
        return Build.VERSION.SDK_INT < 26 ? typeface0 : TypefaceCompatApi26.a.a(typeface0, fontVariation$Settings0, context0);
    }
}

