package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.util.TypedValue;
import androidx.collection.LruCache;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.AndroidPreloadedFont;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidTypefaceCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
@k(message = "Duplicate cache")
public final class AndroidTypefaceCache {
    @l
    public static final AndroidTypefaceCache a;
    @l
    private static final LruCache b;

    static {
        AndroidTypefaceCache.a = new AndroidTypefaceCache();
        AndroidTypefaceCache.b = new LruCache(16);
    }

    @m
    public final String a(@l Context context0, @l Font font0) {
        L.p(context0, "context");
        L.p(font0, "font");
        if(font0 instanceof ResourceFont) {
            TypedValue typedValue0 = new TypedValue();
            context0.getResources().getValue(((ResourceFont)font0).i(), typedValue0, true);
            String s = typedValue0.string == null ? null : typedValue0.string.toString();
            L.m(s);
            return "res:" + s;
        }
        if(!(font0 instanceof AndroidPreloadedFont)) {
            throw new IllegalArgumentException("Unknown font type: " + font0);
        }
        return ((AndroidPreloadedFont)font0).g();
    }

    @l
    public final Typeface b(@l Context context0, @l Font font0) {
        Typeface typeface1;
        L.p(context0, "context");
        L.p(font0, "font");
        String s = this.a(context0, font0);
        if(s != null) {
            Typeface typeface0 = (Typeface)AndroidTypefaceCache.b.get(s);
            if(typeface0 != null) {
                L.o(typeface0, "it");
                return typeface0;
            }
        }
        if(font0 instanceof ResourceFont) {
            if(Build.VERSION.SDK_INT >= 26) {
                typeface1 = AndroidResourceFontLoaderHelper.a.a(context0, ((ResourceFont)font0).i());
                goto label_18;
            }
            typeface1 = ResourcesCompat.j(context0, ((ResourceFont)font0).i());
            L.m(typeface1);
            L.o(typeface1, "{\n                    Re…esId)!!\n                }");
        }
        else if(font0 instanceof AndroidFont) {
            typeface1 = ((AndroidFont)font0).a().a(context0, ((AndroidFont)font0));
        }
        else {
            throw new IllegalArgumentException("Unknown font type: " + font0);
        }
    label_18:
        if(typeface1 == null) {
            throw new IllegalArgumentException("Unable to load font " + font0);
        }
        if(s != null) {
            Typeface typeface2 = (Typeface)AndroidTypefaceCache.b.put(s, typeface1);
        }
        return typeface1;
    }
}

