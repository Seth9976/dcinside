package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface.Builder;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry;
import androidx.core.provider.FontsContractCompat.FontInfo;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

@RequiresApi(26)
@RestrictTo({Scope.c})
public class TypefaceCompatApi26Impl extends TypefaceCompatApi21Impl {
    private static final int A = -1;
    protected final Class m;
    protected final Constructor n;
    protected final Method o;
    protected final Method p;
    protected final Method q;
    protected final Method r;
    protected final Method s;
    private static final String t = "TypefaceCompatApi26Impl";
    private static final String u = "android.graphics.FontFamily";
    private static final String v = "addFontFromAssetManager";
    private static final String w = "addFontFromBuffer";
    private static final String x = "createFromFamiliesWithDefault";
    private static final String y = "freeze";
    private static final String z = "abortCreation";

    public TypefaceCompatApi26Impl() {
        Method method4;
        Method method3;
        Method method2;
        Method method1;
        Method method0;
        Constructor constructor0;
        Class class0;
        try {
            class0 = this.D();
            constructor0 = this.E(class0);
            method0 = this.A(class0);
            method1 = this.B(class0);
            method2 = this.F(class0);
            method3 = this.z(class0);
            method4 = this.C(class0);
        }
        catch(ClassNotFoundException | NoSuchMethodException classNotFoundException0) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + classNotFoundException0.getClass().getName(), classNotFoundException0);
            class0 = null;
            constructor0 = null;
            method0 = null;
            method1 = null;
            method2 = null;
            method3 = null;
            method4 = null;
        }
        this.m = class0;
        this.n = constructor0;
        this.o = method0;
        this.p = method1;
        this.q = method2;
        this.r = method3;
        this.s = method4;
    }

    protected Method A(Class class0) throws NoSuchMethodException {
        return class0.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
    }

    protected Method B(Class class0) throws NoSuchMethodException {
        return class0.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
    }

    protected Method C(Class class0) throws NoSuchMethodException {
        Class[] arr_class = {Array.newInstance(class0, 1).getClass(), Integer.TYPE, Integer.TYPE};
        Method method0 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", arr_class);
        method0.setAccessible(true);
        return method0;
    }

    protected Class D() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor E(Class class0) throws NoSuchMethodException {
        return class0.getConstructor(null);
    }

    protected Method F(Class class0) throws NoSuchMethodException {
        return class0.getMethod("freeze", null);
    }

    @Override  // androidx.core.graphics.TypefaceCompatApi21Impl
    public Typeface b(Context context0, FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry0, Resources resources0, int v) {
        if(!this.y()) {
            return super.b(context0, fontResourcesParserCompat$FontFamilyFilesResourceEntry0, resources0, v);
        }
        Object object0 = this.t();
        if(object0 == null) {
            return null;
        }
        FontFileResourceEntry[] arr_fontResourcesParserCompat$FontFileResourceEntry = fontResourcesParserCompat$FontFamilyFilesResourceEntry0.a();
        for(int v1 = 0; v1 < arr_fontResourcesParserCompat$FontFileResourceEntry.length; ++v1) {
            FontFileResourceEntry fontResourcesParserCompat$FontFileResourceEntry0 = arr_fontResourcesParserCompat$FontFileResourceEntry[v1];
            if(!this.v(context0, object0, fontResourcesParserCompat$FontFileResourceEntry0.a(), fontResourcesParserCompat$FontFileResourceEntry0.c(), fontResourcesParserCompat$FontFileResourceEntry0.e(), ((int)fontResourcesParserCompat$FontFileResourceEntry0.f()), FontVariationAxis.fromFontVariationSettings(fontResourcesParserCompat$FontFileResourceEntry0.d()))) {
                this.u(object0);
                return null;
            }
        }
        return this.x(object0) ? this.q(object0) : null;
    }

    @Override  // androidx.core.graphics.TypefaceCompatApi21Impl
    public Typeface d(Context context0, CancellationSignal cancellationSignal0, FontInfo[] arr_fontsContractCompat$FontInfo, int v) {
        if(arr_fontsContractCompat$FontInfo.length < 1) {
            return null;
        }
        if(!this.y()) {
            FontInfo fontsContractCompat$FontInfo0 = this.m(arr_fontsContractCompat$FontInfo, v);
            ContentResolver contentResolver0 = context0.getContentResolver();
            try(ParcelFileDescriptor parcelFileDescriptor0 = contentResolver0.openFileDescriptor(fontsContractCompat$FontInfo0.d(), "r", cancellationSignal0)) {
                if(parcelFileDescriptor0 != null) {
                    return new Typeface.Builder(parcelFileDescriptor0.getFileDescriptor()).setWeight(fontsContractCompat$FontInfo0.e()).setItalic(fontsContractCompat$FontInfo0.f()).build();
                }
            }
            catch(IOException unused_ex) {
            }
            return null;
        }
        Map map0 = TypefaceCompatUtil.h(context0, arr_fontsContractCompat$FontInfo, cancellationSignal0);
        Object object0 = this.t();
        if(object0 == null) {
            return null;
        }
        boolean z = false;
        for(int v1 = 0; v1 < arr_fontsContractCompat$FontInfo.length; ++v1) {
            FontInfo fontsContractCompat$FontInfo1 = arr_fontsContractCompat$FontInfo[v1];
            ByteBuffer byteBuffer0 = (ByteBuffer)map0.get(fontsContractCompat$FontInfo1.d());
            if(byteBuffer0 != null) {
                if(!this.w(object0, byteBuffer0, fontsContractCompat$FontInfo1.c(), fontsContractCompat$FontInfo1.e(), ((int)fontsContractCompat$FontInfo1.f()))) {
                    this.u(object0);
                    return null;
                }
                z = true;
            }
        }
        if(!z) {
            this.u(object0);
            return null;
        }
        if(!this.x(object0)) {
            return null;
        }
        Typeface typeface0 = this.q(object0);
        return typeface0 == null ? null : Typeface.create(typeface0, v);
    }

    @Override  // androidx.core.graphics.TypefaceCompatBaseImpl
    @RequiresApi(29)
    public Typeface e(Context context0, CancellationSignal cancellationSignal0, List list0, int v) {
        return super.e(context0, cancellationSignal0, list0, v);
    }

    @Override  // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface g(Context context0, Resources resources0, int v, String s, int v1) {
        if(!this.y()) {
            return super.g(context0, resources0, v, s, v1);
        }
        Object object0 = this.t();
        if(object0 == null) {
            return null;
        }
        if(!this.v(context0, object0, s, 0, -1, -1, null)) {
            this.u(object0);
            return null;
        }
        return this.x(object0) ? this.q(object0) : null;
    }

    @Override  // androidx.core.graphics.TypefaceCompatApi21Impl
    Typeface h(Context context0, Typeface typeface0, int v, boolean z) {
        Typeface typeface1 = null;
        try {
            typeface1 = WeightTypefaceApi26.b(typeface0, v, z);
        }
        catch(RuntimeException unused_ex) {
        }
        return typeface1 == null ? super.h(context0, typeface0, v, z) : typeface1;
    }

    protected Typeface q(Object object0) {
        try {
            Object object1 = Array.newInstance(this.m, 1);
            Array.set(object1, 0, object0);
            return (Typeface)this.s.invoke(null, object1, -1, -1);
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return null;
        }
    }

    private Object t() {
        try {
            return this.n.newInstance(null);
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException unused_ex) {
            return null;
        }
    }

    private void u(Object object0) {
        try {
            this.r.invoke(object0, null);
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
        }
    }

    private boolean v(Context context0, Object object0, String s, int v, int v1, int v2, FontVariationAxis[] arr_fontVariationAxis) {
        try {
            Object[] arr_object = {context0.getAssets(), s, 0, Boolean.FALSE, v, v1, v2, arr_fontVariationAxis};
            return ((Boolean)this.o.invoke(object0, arr_object)).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return false;
        }
    }

    private boolean w(Object object0, ByteBuffer byteBuffer0, int v, int v1, int v2) {
        try {
            return ((Boolean)this.p.invoke(object0, byteBuffer0, v, null, v1, v2)).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return false;
        }
    }

    private boolean x(Object object0) {
        try {
            return ((Boolean)this.q.invoke(object0, null)).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return false;
        }
    }

    private boolean y() {
        if(this.o == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.o != null;
    }

    protected Method z(Class class0) throws NoSuchMethodException {
        return class0.getMethod("abortCreation", null);
    }
}

