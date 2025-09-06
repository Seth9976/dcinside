package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry;
import androidx.core.provider.FontsContractCompat.FontInfo;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

@RequiresApi(24)
@RestrictTo({Scope.c})
class TypefaceCompatApi24Impl extends TypefaceCompatBaseImpl {
    private static final String d = "TypefaceCompatApi24Impl";
    private static final String e = "android.graphics.FontFamily";
    private static final String f = "addFontWeightStyle";
    private static final String g = "createFromFamiliesWithDefault";
    private static final Class h;
    private static final Constructor i;
    private static final Method j;
    private static final Method k;

    static {
        Method method1;
        Method method0;
        Class class0;
        Constructor constructor0 = null;
        try {
            class0 = Class.forName("android.graphics.FontFamily");
            Constructor constructor1 = class0.getConstructor(null);
            method0 = class0.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            Class[] arr_class = {Array.newInstance(class0, 1).getClass()};
            method1 = Typeface.class.getMethod("createFromFamiliesWithDefault", arr_class);
            constructor0 = constructor1;
        }
        catch(ClassNotFoundException | NoSuchMethodException classNotFoundException0) {
            Log.e("TypefaceCompatApi24Impl", classNotFoundException0.getClass().getName(), classNotFoundException0);
            method1 = null;
            class0 = null;
            method0 = null;
        }
        TypefaceCompatApi24Impl.i = constructor0;
        TypefaceCompatApi24Impl.h = class0;
        TypefaceCompatApi24Impl.j = method0;
        TypefaceCompatApi24Impl.k = method1;
    }

    @Override  // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface b(Context context0, FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry0, Resources resources0, int v) {
        Object object0 = TypefaceCompatApi24Impl.s();
        if(object0 == null) {
            return null;
        }
        FontFileResourceEntry[] arr_fontResourcesParserCompat$FontFileResourceEntry = fontResourcesParserCompat$FontFamilyFilesResourceEntry0.a();
        for(int v1 = 0; v1 < arr_fontResourcesParserCompat$FontFileResourceEntry.length; ++v1) {
            FontFileResourceEntry fontResourcesParserCompat$FontFileResourceEntry0 = arr_fontResourcesParserCompat$FontFileResourceEntry[v1];
            ByteBuffer byteBuffer0 = TypefaceCompatUtil.b(context0, resources0, fontResourcesParserCompat$FontFileResourceEntry0.b());
            if(byteBuffer0 == null) {
                return null;
            }
            if(!TypefaceCompatApi24Impl.p(object0, byteBuffer0, fontResourcesParserCompat$FontFileResourceEntry0.c(), fontResourcesParserCompat$FontFileResourceEntry0.e(), fontResourcesParserCompat$FontFileResourceEntry0.f())) {
                return null;
            }
        }
        return TypefaceCompatApi24Impl.q(object0);
    }

    @Override  // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface d(Context context0, CancellationSignal cancellationSignal0, FontInfo[] arr_fontsContractCompat$FontInfo, int v) {
        Object object0 = TypefaceCompatApi24Impl.s();
        if(object0 == null) {
            return null;
        }
        SimpleArrayMap simpleArrayMap0 = new SimpleArrayMap();
        for(int v1 = 0; v1 < arr_fontsContractCompat$FontInfo.length; ++v1) {
            FontInfo fontsContractCompat$FontInfo0 = arr_fontsContractCompat$FontInfo[v1];
            Uri uri0 = fontsContractCompat$FontInfo0.d();
            ByteBuffer byteBuffer0 = (ByteBuffer)simpleArrayMap0.get(uri0);
            if(byteBuffer0 == null) {
                byteBuffer0 = TypefaceCompatUtil.f(context0, cancellationSignal0, uri0);
                simpleArrayMap0.put(uri0, byteBuffer0);
            }
            if(byteBuffer0 == null) {
                return null;
            }
            if(!TypefaceCompatApi24Impl.p(object0, byteBuffer0, fontsContractCompat$FontInfo0.c(), fontsContractCompat$FontInfo0.e(), fontsContractCompat$FontInfo0.f())) {
                return null;
            }
        }
        Typeface typeface0 = TypefaceCompatApi24Impl.q(object0);
        return typeface0 == null ? null : Typeface.create(typeface0, v);
    }

    @Override  // androidx.core.graphics.TypefaceCompatBaseImpl
    Typeface h(Context context0, Typeface typeface0, int v, boolean z) {
        Typeface typeface1 = null;
        try {
            typeface1 = WeightTypefaceApi21.b(typeface0, v, z);
        }
        catch(RuntimeException unused_ex) {
        }
        return typeface1 == null ? super.h(context0, typeface0, v, z) : typeface1;
    }

    private static boolean p(Object object0, ByteBuffer byteBuffer0, int v, int v1, boolean z) {
        try {
            return ((Boolean)TypefaceCompatApi24Impl.j.invoke(object0, byteBuffer0, v, null, v1, Boolean.valueOf(z))).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return false;
        }
    }

    private static Typeface q(Object object0) {
        try {
            Object object1 = Array.newInstance(TypefaceCompatApi24Impl.h, 1);
            Array.set(object1, 0, object0);
            return (Typeface)TypefaceCompatApi24Impl.k.invoke(null, object1);
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return null;
        }
    }

    public static boolean r() {
        Method method0 = TypefaceCompatApi24Impl.j;
        if(method0 == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method0 != null;
    }

    private static Object s() {
        try {
            return TypefaceCompatApi24Impl.i.newInstance(null);
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException unused_ex) {
            return null;
        }
    }
}

