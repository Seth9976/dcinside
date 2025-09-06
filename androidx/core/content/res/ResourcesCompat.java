package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

public final class ResourcesCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static Drawable a(Resources resources0, int v, Resources.Theme resources$Theme0) {
            return resources0.getDrawable(v, resources$Theme0);
        }

        static Drawable b(Resources resources0, int v, int v1, Resources.Theme resources$Theme0) {
            return resources0.getDrawableForDensity(v, v1, resources$Theme0);
        }
    }

    @RequiresApi(23)
    static class Api23Impl {
        static int a(Resources resources0, int v, Resources.Theme resources$Theme0) {
            return resources0.getColor(v, resources$Theme0);
        }

        static ColorStateList b(Resources resources0, @ColorRes int v, Resources.Theme resources$Theme0) {
            return resources0.getColorStateList(v, resources$Theme0);
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        static float a(Resources resources0, @DimenRes int v) {
            return resources0.getFloat(v);
        }
    }

    static class ColorStateListCacheEntry {
        final ColorStateList a;
        final Configuration b;
        final int c;

        ColorStateListCacheEntry(ColorStateList colorStateList0, Configuration configuration0, Resources.Theme resources$Theme0) {
            this.a = colorStateList0;
            this.b = configuration0;
            this.c = resources$Theme0 == null ? 0 : resources$Theme0.hashCode();
        }
    }

    static final class ColorStateListCacheKey {
        final Resources a;
        final Resources.Theme b;

        ColorStateListCacheKey(Resources resources0, Resources.Theme resources$Theme0) {
            this.a = resources0;
            this.b = resources$Theme0;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return ColorStateListCacheKey.class == class0 && (this.a.equals(((ColorStateListCacheKey)object0).a) && ObjectsCompat.a(this.b, ((ColorStateListCacheKey)object0).b));
            }
            return false;
        }

        @Override
        public int hashCode() {
            return ObjectsCompat.b(new Object[]{this.a, this.b});
        }
    }

    public static abstract class FontCallback {
        @RestrictTo({Scope.c})
        public final void c(int v, Handler handler0) {
            FontCallback.e(handler0).post(() -> this.h(v));
        }

        @RestrictTo({Scope.c})
        public final void d(Typeface typeface0, Handler handler0) {
            FontCallback.e(handler0).post(() -> this.i(typeface0));
        }

        @RestrictTo({Scope.a})
        public static Handler e(Handler handler0) {
            return handler0 == null ? new Handler(Looper.getMainLooper()) : handler0;
        }

        // 检测为 Lambda 实现
        private void f(int v) [...]

        // 检测为 Lambda 实现
        private void g(Typeface typeface0) [...]

        public abstract void h(int arg1);

        public abstract void i(Typeface arg1);
    }

    public static final class ThemeCompat {
        @RequiresApi(23)
        static class androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl {
            private static final Object a;
            private static Method b;
            private static boolean c;

            static {
                androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.a = new Object();
            }

            @SuppressLint({"BanUncheckedReflection"})
            static void a(Resources.Theme resources$Theme0) {
                synchronized(androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.a) {
                    if(!androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.c) {
                        try {
                            Method method0 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.b = method0;
                            method0.setAccessible(true);
                        }
                        catch(NoSuchMethodException noSuchMethodException0) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", noSuchMethodException0);
                        }
                        androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.c = true;
                    }
                    Method method1 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.b;
                    if(method1 != null) {
                        try {
                            method1.invoke(resources$Theme0, null);
                        }
                        catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", illegalAccessException0);
                            androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.b = null;
                        }
                    }
                }
            }
        }

        @RequiresApi(29)
        static class androidx.core.content.res.ResourcesCompat.ThemeCompat.Api29Impl {
            static void a(Resources.Theme resources$Theme0) {
                resources$Theme0.rebase();
            }
        }

        public static void a(Resources.Theme resources$Theme0) {
            int v = Build.VERSION.SDK_INT;
            if(v >= 29) {
                androidx.core.content.res.ResourcesCompat.ThemeCompat.Api29Impl.a(resources$Theme0);
                return;
            }
            if(v >= 23) {
                androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.a(resources$Theme0);
            }
        }
    }

    private static final String a = "ResourcesCompat";
    private static final ThreadLocal b;
    @GuardedBy("sColorStateCacheLock")
    private static final WeakHashMap c;
    private static final Object d;
    @AnyRes
    public static final int e;

    static {
        ResourcesCompat.b = new ThreadLocal();
        ResourcesCompat.c = new WeakHashMap(0);
        ResourcesCompat.d = new Object();
    }

    private static void a(ColorStateListCacheKey resourcesCompat$ColorStateListCacheKey0, @ColorRes int v, ColorStateList colorStateList0, Resources.Theme resources$Theme0) {
        synchronized(ResourcesCompat.d) {
            WeakHashMap weakHashMap0 = ResourcesCompat.c;
            SparseArray sparseArray0 = (SparseArray)weakHashMap0.get(resourcesCompat$ColorStateListCacheKey0);
            if(sparseArray0 == null) {
                sparseArray0 = new SparseArray();
                weakHashMap0.put(resourcesCompat$ColorStateListCacheKey0, sparseArray0);
            }
            sparseArray0.append(v, new ColorStateListCacheEntry(colorStateList0, resourcesCompat$ColorStateListCacheKey0.a.getConfiguration(), resources$Theme0));
        }
    }

    public static void b(Resources.Theme resources$Theme0) {
        synchronized(ResourcesCompat.d) {
            Iterator iterator0 = ResourcesCompat.c.keySet().iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(((ColorStateListCacheKey)object1) != null && resources$Theme0.equals(((ColorStateListCacheKey)object1).b)) {
                    iterator0.remove();
                }
            }
        }
    }

    private static ColorStateList c(ColorStateListCacheKey resourcesCompat$ColorStateListCacheKey0, @ColorRes int v) {
        synchronized(ResourcesCompat.d) {
            SparseArray sparseArray0 = (SparseArray)ResourcesCompat.c.get(resourcesCompat$ColorStateListCacheKey0);
            if(sparseArray0 != null && sparseArray0.size() > 0) {
                ColorStateListCacheEntry resourcesCompat$ColorStateListCacheEntry0 = (ColorStateListCacheEntry)sparseArray0.get(v);
                if(resourcesCompat$ColorStateListCacheEntry0 != null) {
                    Configuration configuration0 = resourcesCompat$ColorStateListCacheKey0.a.getConfiguration();
                    if(resourcesCompat$ColorStateListCacheEntry0.b.equals(configuration0) && (resourcesCompat$ColorStateListCacheKey0.b == null && resourcesCompat$ColorStateListCacheEntry0.c == 0 || resourcesCompat$ColorStateListCacheKey0.b != null && resourcesCompat$ColorStateListCacheEntry0.c == resourcesCompat$ColorStateListCacheKey0.b.hashCode())) {
                        return resourcesCompat$ColorStateListCacheEntry0.a;
                    }
                    sparseArray0.remove(v);
                }
            }
            return null;
        }
    }

    // 去混淆评级： 低(20)
    public static Typeface d(Context context0, @FontRes int v) throws Resources.NotFoundException {
        return context0.isRestricted() ? null : ResourcesCompat.p(context0, v, new TypedValue(), 0, null, null, false, true);
    }

    @ColorInt
    public static int e(Resources resources0, @ColorRes int v, Resources.Theme resources$Theme0) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT < 23 ? resources0.getColor(v) : Api23Impl.a(resources0, v, resources$Theme0);
    }

    public static ColorStateList f(Resources resources0, @ColorRes int v, Resources.Theme resources$Theme0) throws Resources.NotFoundException {
        ColorStateListCacheKey resourcesCompat$ColorStateListCacheKey0 = new ColorStateListCacheKey(resources0, resources$Theme0);
        ColorStateList colorStateList0 = ResourcesCompat.c(resourcesCompat$ColorStateListCacheKey0, v);
        if(colorStateList0 != null) {
            return colorStateList0;
        }
        ColorStateList colorStateList1 = ResourcesCompat.n(resources0, v, resources$Theme0);
        if(colorStateList1 != null) {
            ResourcesCompat.a(resourcesCompat$ColorStateListCacheKey0, v, colorStateList1, resources$Theme0);
            return colorStateList1;
        }
        return Build.VERSION.SDK_INT < 23 ? resources0.getColorStateList(v) : Api23Impl.b(resources0, v, resources$Theme0);
    }

    public static Drawable g(Resources resources0, @DrawableRes int v, Resources.Theme resources$Theme0) throws Resources.NotFoundException {
        return Api21Impl.a(resources0, v, resources$Theme0);
    }

    public static Drawable h(Resources resources0, @DrawableRes int v, int v1, Resources.Theme resources$Theme0) throws Resources.NotFoundException {
        return Api21Impl.b(resources0, v, v1, resources$Theme0);
    }

    public static float i(Resources resources0, @DimenRes int v) {
        if(Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.a(resources0, v);
        }
        TypedValue typedValue0 = ResourcesCompat.m();
        resources0.getValue(v, typedValue0, true);
        if(typedValue0.type != 4) {
            throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(v) + " type #0x" + Integer.toHexString(typedValue0.type) + " is not valid");
        }
        return typedValue0.getFloat();
    }

    // 去混淆评级： 低(20)
    public static Typeface j(Context context0, @FontRes int v) throws Resources.NotFoundException {
        return context0.isRestricted() ? null : ResourcesCompat.p(context0, v, new TypedValue(), 0, null, null, false, false);
    }

    // 去混淆评级： 低(20)
    @RestrictTo({Scope.c})
    public static Typeface k(Context context0, @FontRes int v, TypedValue typedValue0, int v1, FontCallback resourcesCompat$FontCallback0) throws Resources.NotFoundException {
        return context0.isRestricted() ? null : ResourcesCompat.p(context0, v, typedValue0, v1, resourcesCompat$FontCallback0, null, true, false);
    }

    public static void l(Context context0, @FontRes int v, FontCallback resourcesCompat$FontCallback0, Handler handler0) throws Resources.NotFoundException {
        Preconditions.l(resourcesCompat$FontCallback0);
        if(context0.isRestricted()) {
            resourcesCompat$FontCallback0.c(-4, handler0);
            return;
        }
        ResourcesCompat.p(context0, v, new TypedValue(), 0, resourcesCompat$FontCallback0, handler0, false, false);
    }

    private static TypedValue m() {
        ThreadLocal threadLocal0 = ResourcesCompat.b;
        TypedValue typedValue0 = (TypedValue)threadLocal0.get();
        if(typedValue0 == null) {
            typedValue0 = new TypedValue();
            threadLocal0.set(typedValue0);
        }
        return typedValue0;
    }

    private static ColorStateList n(Resources resources0, int v, Resources.Theme resources$Theme0) {
        if(ResourcesCompat.o(resources0, v)) {
            return null;
        }
        XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
        try {
            return ColorStateListInflaterCompat.a(resources0, xmlResourceParser0, resources$Theme0);
        }
        catch(Exception exception0) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", exception0);
            return null;
        }
    }

    private static boolean o(Resources resources0, @ColorRes int v) {
        TypedValue typedValue0 = ResourcesCompat.m();
        resources0.getValue(v, typedValue0, true);
        return typedValue0.type >= 28 && typedValue0.type <= 0x1F;
    }

    private static Typeface p(Context context0, int v, TypedValue typedValue0, int v1, FontCallback resourcesCompat$FontCallback0, Handler handler0, boolean z, boolean z1) {
        Resources resources0 = context0.getResources();
        resources0.getValue(v, typedValue0, true);
        Typeface typeface0 = ResourcesCompat.q(context0, resources0, typedValue0, v, v1, resourcesCompat$FontCallback0, handler0, z, z1);
        if(typeface0 == null && resourcesCompat$FontCallback0 == null && !z1) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(v) + " could not be retrieved.");
        }
        return typeface0;
    }

    private static Typeface q(Context context0, Resources resources0, TypedValue typedValue0, int v, int v1, FontCallback resourcesCompat$FontCallback0, Handler handler0, boolean z, boolean z1) {
        CharSequence charSequence0 = typedValue0.string;
        if(charSequence0 == null) {
            throw new Resources.NotFoundException("Resource \"" + resources0.getResourceName(v) + "\" (" + Integer.toHexString(v) + ") is not a Font: " + typedValue0);
        }
        String s = charSequence0.toString();
        if(!s.startsWith("res/")) {
            if(resourcesCompat$FontCallback0 != null) {
                resourcesCompat$FontCallback0.c(-3, handler0);
            }
            return null;
        }
        Typeface typeface0 = TypefaceCompat.l(resources0, v, s, typedValue0.assetCookie, v1);
        if(typeface0 != null) {
            if(resourcesCompat$FontCallback0 != null) {
                resourcesCompat$FontCallback0.d(typeface0, handler0);
            }
            return typeface0;
        }
        if(z1) {
            return null;
        }
        try {
            if(s.toLowerCase().endsWith(".xml")) {
                FamilyResourceEntry fontResourcesParserCompat$FamilyResourceEntry0 = FontResourcesParserCompat.b(resources0.getXml(v), resources0);
                if(fontResourcesParserCompat$FamilyResourceEntry0 == null) {
                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                    if(resourcesCompat$FontCallback0 != null) {
                        resourcesCompat$FontCallback0.c(-3, handler0);
                        return null;
                    }
                    return null;
                }
                return TypefaceCompat.g(context0, fontResourcesParserCompat$FamilyResourceEntry0, resources0, v, s, typedValue0.assetCookie, v1, resourcesCompat$FontCallback0, handler0, z);
            }
            Typeface typeface1 = TypefaceCompat.i(context0, resources0, v, s, typedValue0.assetCookie, v1);
            if(resourcesCompat$FontCallback0 != null) {
                if(typeface1 != null) {
                    resourcesCompat$FontCallback0.d(typeface1, handler0);
                    return typeface1;
                }
                resourcesCompat$FontCallback0.c(-3, handler0);
            }
            return typeface1;
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            goto label_35;
        }
        Log.e("ResourcesCompat", "Failed to parse xml resource " + s, xmlPullParserException0);
        goto label_36;
    label_35:
        Log.e("ResourcesCompat", "Failed to read xml resource " + s, iOException0);
    label_36:
        if(resourcesCompat$FontCallback0 != null) {
            resourcesCompat$FontCallback0.c(-3, handler0);
        }
        return null;
    }
}

