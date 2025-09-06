package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import java.lang.reflect.Field;

@RestrictTo({Scope.a})
final class WeightTypefaceApi14 {
    private static final String a = "WeightTypeface";
    private static final String b = "native_instance";
    private static final Field c;
    @GuardedBy("sWeightCacheLock")
    private static final LongSparseArray d;
    private static final Object e;

    static {
        Field field0;
        try {
            field0 = Typeface.class.getDeclaredField("native_instance");
            field0.setAccessible(true);
        }
        catch(Exception exception0) {
            Log.e("WeightTypeface", exception0.getClass().getName(), exception0);
            field0 = null;
        }
        WeightTypefaceApi14.c = field0;
        WeightTypefaceApi14.d = new LongSparseArray(3);
        WeightTypefaceApi14.e = new Object();
    }

    // 去混淆评级： 低(30)
    static Typeface a(TypefaceCompatBaseImpl typefaceCompatBaseImpl0, Context context0, Typeface typeface0, int v, boolean z) {
        return null;
    }

    private static Typeface b(TypefaceCompatBaseImpl typefaceCompatBaseImpl0, Context context0, Typeface typeface0, int v, boolean z) {
        FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry0 = typefaceCompatBaseImpl0.n(typeface0);
        return fontResourcesParserCompat$FontFamilyFilesResourceEntry0 == null ? null : typefaceCompatBaseImpl0.c(context0, fontResourcesParserCompat$FontFamilyFilesResourceEntry0, context0.getResources(), v, z);
    }

    private static long c(Typeface typeface0) {
        try {
            return ((Number)WeightTypefaceApi14.c.get(typeface0)).longValue();
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }

    private static boolean d() [...] // 潜在的解密器

    private static Typeface e(Typeface typeface0, int v, boolean z) {
        int v1 = 0;
        if(v >= 600 || z) {
            if(v < 600) {
                return Typeface.create(typeface0, 2);
            }
            if(!z) {
                return Typeface.create(typeface0, 1);
            }
            v1 = 3;
        }
        return Typeface.create(typeface0, v1);
    }
}

