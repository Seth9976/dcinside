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
@RequiresApi(21)
@RestrictTo({Scope.a})
final class WeightTypefaceApi21 {
    private static final String a = "WeightTypeface";
    private static final String b = "native_instance";
    private static final String c = "nativeCreateFromTypeface";
    private static final String d = "nativeCreateWeightAlias";
    private static final Field e;
    private static final Method f;
    private static final Method g;
    private static final Constructor h;
    @GuardedBy("sWeightCacheLock")
    private static final LongSparseArray i;
    private static final Object j;

    static {
        Constructor constructor0;
        Method method1;
        Method method0;
        Field field0;
        try {
            field0 = Typeface.class.getDeclaredField("native_instance");
            Class class0 = Long.TYPE;
            Class class1 = Integer.TYPE;
            method0 = Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", class0, class1);
            method0.setAccessible(true);
            method1 = Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", class0, class1);
            method1.setAccessible(true);
            constructor0 = Typeface.class.getDeclaredConstructor(class0);
            constructor0.setAccessible(true);
        }
        catch(NoSuchFieldException | NoSuchMethodException noSuchFieldException0) {
            Log.e("WeightTypeface", noSuchFieldException0.getClass().getName(), noSuchFieldException0);
            field0 = null;
            method1 = null;
            constructor0 = null;
            method0 = null;
        }
        WeightTypefaceApi21.e = field0;
        WeightTypefaceApi21.f = method0;
        WeightTypefaceApi21.g = method1;
        WeightTypefaceApi21.h = constructor0;
        WeightTypefaceApi21.i = new LongSparseArray(3);
        WeightTypefaceApi21.j = new Object();
    }

    private static Typeface a(long v) {
        try {
            return (Typeface)WeightTypefaceApi21.h.newInstance(v);
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
            return WeightTypefaceApi21.e.getLong(typeface0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }

    private static boolean d() [...] // 潜在的解密器

    @SuppressLint({"BanUncheckedReflection"})
    private static long e(long v, int v1, boolean z) {
        try {
            Long long0 = (Long)WeightTypefaceApi21.f.invoke(null, v, ((int)(z ? 2 : 0)));
            long0.longValue();
            return (long)(((Long)WeightTypefaceApi21.g.invoke(null, long0, v1)));
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long f(long v, int v1) {
        try {
            return (long)(((Long)WeightTypefaceApi21.g.invoke(null, v, v1)));
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
    }
}

