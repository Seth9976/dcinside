package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.font.Typeface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import y4.l;

@s0({"SMAP\nFontResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,77:1\n76#2:78\n361#3,7:79\n*S KotlinDebug\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n*L\n55#1:78\n69#1:79,7\n*E\n"})
public final class FontResources_androidKt {
    @l
    private static final Object a;
    @GuardedBy("cacheLock")
    @l
    private static final Map b;

    static {
        FontResources_androidKt.a = new Object();
        FontResources_androidKt.b = new LinkedHashMap();
    }

    @Composable
    @ReadOnlyComposable
    @k(level = m.a, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @c0(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @l
    public static final Typeface a(@l FontFamily fontFamily0, @y4.m Composer composer0, int v) {
        L.p(fontFamily0, "fontFamily");
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xF4A02609, v, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        Typeface typeface0 = FontResources_androidKt.b(((Context)composer0.L(AndroidCompositionLocals_androidKt.g())), fontFamily0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return typeface0;
    }

    @k(level = m.a, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @c0(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    private static final Typeface b(Context context0, FontFamily fontFamily0) {
        if(!(fontFamily0 instanceof SystemFontFamily) && !(fontFamily0 instanceof LoadedFontFamily)) {
            return AndroidTypeface_androidKt.d(context0, fontFamily0, null, 4, null);
        }
        synchronized(FontResources_androidKt.a) {
            Map map0 = FontResources_androidKt.b;
            Typeface typeface0 = map0.get(fontFamily0);
            if(typeface0 == null) {
                typeface0 = AndroidTypeface_androidKt.d(context0, fontFamily0, null, 4, null);
                map0.put(fontFamily0, typeface0);
            }
            return typeface0;
        }
    }
}

