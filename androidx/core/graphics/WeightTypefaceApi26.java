package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressLint({"SoonBlockedPrivateApi"})
@RequiresApi(26)
@RestrictTo({Scope.a})
final class WeightTypefaceApi26 {
    private static final String a = "WeightTypeface";
    private static final String b = "native_instance";
    private static final String c = "nativeCreateFromTypefaceWithExactStyle";
    private static final Field d;
    private static final Method e;
    private static final Constructor f;
    @GuardedBy("sWeightCacheLock")
    private static final LongSparseArray g;
    private static final Object h;

    static {
        Constructor constructor0;
        Method method0;
        Field field0;
        try {
            field0 = Typeface.class.getDeclaredField("native_instance");
            Class class0 = Long.TYPE;
            method0 = Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", class0, Integer.TYPE, Boolean.TYPE);
            method0.setAccessible(true);
            constructor0 = Typeface.class.getDeclaredConstructor(class0);
            constructor0.setAccessible(true);
        }
        catch(NoSuchFieldException | NoSuchMethodException noSuchFieldException0) {
            Log.e("WeightTypeface", noSuchFieldException0.getClass().getName(), noSuchFieldException0);
            field0 = null;
            constructor0 = null;
            method0 = null;
        }
        WeightTypefaceApi26.d = field0;
        WeightTypefaceApi26.e = method0;
        WeightTypefaceApi26.f = constructor0;
        WeightTypefaceApi26.g = new LongSparseArray(3);
        WeightTypefaceApi26.h = new Object();
    }

    private static Typeface a(long v) {
        try {
            return (Typeface)WeightTypefaceApi26.f.newInstance(v);
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException unused_ex) {
            return null;
        }
    }

    // 去混淆评级： 低(30)
    static Typeface b(Typeface typeface0, int v, boolean z) {
        return null;
    }

    private static long c(Typeface typeface0) {
        try {
            return WeightTypefaceApi26.d.getLong(typeface0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }

    private static boolean d() [...] // 潜在的解密器

    @SuppressLint({"BanUncheckedReflection"})
    private static long e(long v, int v1, boolean z) {
        try {
            return (long)(((Long)WeightTypefaceApi26.e.invoke(null, v, v1, Boolean.valueOf(z))));
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
    }
}

