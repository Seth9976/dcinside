package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry;
import androidx.core.provider.FontsContractCompat.FontInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import jeb.synthetic.TWR;

@RequiresApi(21)
@RestrictTo({Scope.c})
class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl {
    private static final String d = "TypefaceCompatApi21Impl";
    private static final String e = "android.graphics.FontFamily";
    private static final String f = "addFontWeightStyle";
    private static final String g = "createFromFamiliesWithDefault";
    private static Class h = null;
    private static Constructor i = null;
    private static Method j = null;
    private static Method k = null;
    private static boolean l = false;

    static {
    }

    @Override  // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface b(Context context0, FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry0, Resources resources0, int v) {
        Object object0 = TypefaceCompatApi21Impl.t();
        FontFileResourceEntry[] arr_fontResourcesParserCompat$FontFileResourceEntry = fontResourcesParserCompat$FontFamilyFilesResourceEntry0.a();
        for(int v1 = 0; v1 < arr_fontResourcesParserCompat$FontFileResourceEntry.length; ++v1) {
            FontFileResourceEntry fontResourcesParserCompat$FontFileResourceEntry0 = arr_fontResourcesParserCompat$FontFileResourceEntry[v1];
            File file0 = TypefaceCompatUtil.e(context0);
            if(file0 == null) {
                return null;
            }
            try {
                if(!TypefaceCompatUtil.c(file0, resources0, fontResourcesParserCompat$FontFileResourceEntry0.b())) {
                    return null;
                }
                if(!TypefaceCompatApi21Impl.p(object0, file0.getPath(), fontResourcesParserCompat$FontFileResourceEntry0.e(), fontResourcesParserCompat$FontFileResourceEntry0.f())) {
                    return null;
                }
            }
            catch(RuntimeException unused_ex) {
                return null;
            }
            finally {
                file0.delete();
            }
        }
        return TypefaceCompatApi21Impl.q(object0);
    }

    @Override  // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface d(Context context0, CancellationSignal cancellationSignal0, FontInfo[] arr_fontsContractCompat$FontInfo, int v) {
        if(arr_fontsContractCompat$FontInfo.length < 1) {
            return null;
        }
        FontInfo fontsContractCompat$FontInfo0 = this.m(arr_fontsContractCompat$FontInfo, v);
        ContentResolver contentResolver0 = context0.getContentResolver();
        try(ParcelFileDescriptor parcelFileDescriptor0 = contentResolver0.openFileDescriptor(fontsContractCompat$FontInfo0.d(), "r", cancellationSignal0)) {
            if(parcelFileDescriptor0 != null) {
                File file0 = this.r(parcelFileDescriptor0);
                if(file0 != null && file0.canRead()) {
                    return Typeface.createFromFile(file0);
                }
                FileInputStream fileInputStream0 = new FileInputStream(parcelFileDescriptor0.getFileDescriptor());
                TWR.declareResource(fileInputStream0);
                TWR.useResource$NT(fileInputStream0);
                return super.f(context0, fileInputStream0);
            }
        }
        catch(IOException unused_ex) {
        }
        return null;
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

    private static boolean p(Object object0, String s, int v, boolean z) {
        TypefaceCompatApi21Impl.s();
        try {
            return ((Boolean)TypefaceCompatApi21Impl.j.invoke(object0, s, v, Boolean.valueOf(z))).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }

    private static Typeface q(Object object0) {
        TypefaceCompatApi21Impl.s();
        try {
            Object object1 = Array.newInstance(TypefaceCompatApi21Impl.h, 1);
            Array.set(object1, 0, object0);
            return (Typeface)TypefaceCompatApi21Impl.k.invoke(null, object1);
        }
        catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }

    private File r(ParcelFileDescriptor parcelFileDescriptor0) {
        try {
            String s = Os.readlink(("/proc/self/fd/" + parcelFileDescriptor0.getFd()));
            return OsConstants.S_ISREG(Os.stat(s).st_mode) ? new File(s) : null;
        }
        catch(ErrnoException unused_ex) {
        }
        return null;
    }

    private static void s() {
        Method method1;
        Method method0;
        Class class0;
        Constructor constructor0;
        if(TypefaceCompatApi21Impl.l) {
            return;
        }
        try {
            TypefaceCompatApi21Impl.l = true;
            constructor0 = null;
            class0 = Class.forName("android.graphics.FontFamily");
            Constructor constructor1 = class0.getConstructor(null);
            method0 = class0.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            Class[] arr_class = {Array.newInstance(class0, 1).getClass()};
            method1 = Typeface.class.getMethod("createFromFamiliesWithDefault", arr_class);
            constructor0 = constructor1;
        }
        catch(ClassNotFoundException | NoSuchMethodException classNotFoundException0) {
            Log.e("TypefaceCompatApi21Impl", classNotFoundException0.getClass().getName(), classNotFoundException0);
            method1 = null;
            class0 = null;
            method0 = null;
        }
        TypefaceCompatApi21Impl.i = constructor0;
        TypefaceCompatApi21Impl.h = class0;
        TypefaceCompatApi21Impl.j = method0;
        TypefaceCompatApi21Impl.k = method1;
    }

    private static Object t() {
        TypefaceCompatApi21Impl.s();
        try {
            return TypefaceCompatApi21Impl.i.newInstance(null);
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }
}

