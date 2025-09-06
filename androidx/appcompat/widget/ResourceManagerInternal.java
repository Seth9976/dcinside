package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.appcompat.resources.Compatibility.Api21Impl;
import androidx.appcompat.resources.R.drawable;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.c})
public final class ResourceManagerInternal {
    static class AsldcInflateDelegate implements InflateDelegate {
        @Override  // androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate
        public Drawable a(@NonNull Context context0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) {
            try {
                return AnimatedStateListDrawableCompat.C(context0, context0.getResources(), xmlPullParser0, attributeSet0, resources$Theme0);
            }
            catch(Exception exception0) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", exception0);
                return null;
            }
        }
    }

    static class AvdcInflateDelegate implements InflateDelegate {
        @Override  // androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate
        public Drawable a(@NonNull Context context0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) {
            try {
                return AnimatedVectorDrawableCompat.f(context0, context0.getResources(), xmlPullParser0, attributeSet0, resources$Theme0);
            }
            catch(Exception exception0) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", exception0);
                return null;
            }
        }
    }

    static class ColorFilterLruCache extends LruCache {
        public ColorFilterLruCache(int v) {
            super(v);
        }

        private static int b(int v, PorterDuff.Mode porterDuff$Mode0) {
            return (v + 0x1F) * 0x1F + porterDuff$Mode0.hashCode();
        }

        PorterDuffColorFilter c(int v, PorterDuff.Mode porterDuff$Mode0) {
            return (PorterDuffColorFilter)this.get(ColorFilterLruCache.b(v, porterDuff$Mode0));
        }

        PorterDuffColorFilter d(int v, PorterDuff.Mode porterDuff$Mode0, PorterDuffColorFilter porterDuffColorFilter0) {
            return (PorterDuffColorFilter)this.put(ColorFilterLruCache.b(v, porterDuff$Mode0), porterDuffColorFilter0);
        }
    }

    static class DrawableDelegate implements InflateDelegate {
        @Override  // androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate
        public Drawable a(@NonNull Context context0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) {
            String s = attributeSet0.getClassAttribute();
            if(s != null) {
                try {
                    Drawable drawable0 = (Drawable)DrawableDelegate.class.getClassLoader().loadClass(s).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    Api21Impl.c(drawable0, context0.getResources(), xmlPullParser0, attributeSet0, resources$Theme0);
                    return drawable0;
                }
                catch(Exception exception0) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", exception0);
                }
            }
            return null;
        }
    }

    interface InflateDelegate {
        Drawable a(@NonNull Context arg1, @NonNull XmlPullParser arg2, @NonNull AttributeSet arg3, @Nullable Resources.Theme arg4);
    }

    @RestrictTo({Scope.c})
    public interface ResourceManagerHooks {
        @Nullable
        Drawable a(@NonNull ResourceManagerInternal arg1, @NonNull Context arg2, @DrawableRes int arg3);

        @Nullable
        ColorStateList b(@NonNull Context arg1, @DrawableRes int arg2);

        @Nullable
        PorterDuff.Mode c(int arg1);

        boolean d(@NonNull Context arg1, @DrawableRes int arg2, @NonNull Drawable arg3);

        boolean e(@NonNull Context arg1, @DrawableRes int arg2, @NonNull Drawable arg3);
    }

    static class VdcInflateDelegate implements InflateDelegate {
        @Override  // androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate
        public Drawable a(@NonNull Context context0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) {
            try {
                return VectorDrawableCompat.f(context0.getResources(), xmlPullParser0, attributeSet0, resources$Theme0);
            }
            catch(Exception exception0) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", exception0);
                return null;
            }
        }
    }

    private WeakHashMap a;
    private SimpleArrayMap b;
    private SparseArrayCompat c;
    private final WeakHashMap d;
    private TypedValue e;
    private boolean f;
    private ResourceManagerHooks g;
    private static final String h = "ResourceManagerInternal";
    private static final boolean i = false;
    private static final PorterDuff.Mode j = null;
    private static final String k = "appcompat_skip_skip";
    private static final String l = "android.graphics.drawable.VectorDrawable";
    private static ResourceManagerInternal m;
    private static final ColorFilterLruCache n;

    static {
        ResourceManagerInternal.j = PorterDuff.Mode.SRC_IN;
        ResourceManagerInternal.n = new ColorFilterLruCache(6);
    }

    public ResourceManagerInternal() {
        this.d = new WeakHashMap(0);
    }

    private void a(@NonNull String s, @NonNull InflateDelegate resourceManagerInternal$InflateDelegate0) {
        if(this.b == null) {
            this.b = new SimpleArrayMap();
        }
        this.b.put(s, resourceManagerInternal$InflateDelegate0);
    }

    private boolean b(@NonNull Context context0, long v, @NonNull Drawable drawable0) {
        synchronized(this) {
            Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
            if(drawable$ConstantState0 != null) {
                LongSparseArray longSparseArray0 = (LongSparseArray)this.d.get(context0);
                if(longSparseArray0 == null) {
                    longSparseArray0 = new LongSparseArray();
                    this.d.put(context0, longSparseArray0);
                }
                longSparseArray0.n(v, new WeakReference(drawable$ConstantState0));
                return true;
            }
            return false;
        }
    }

    private void c(@NonNull Context context0, @DrawableRes int v, @NonNull ColorStateList colorStateList0) {
        if(this.a == null) {
            this.a = new WeakHashMap();
        }
        SparseArrayCompat sparseArrayCompat0 = (SparseArrayCompat)this.a.get(context0);
        if(sparseArrayCompat0 == null) {
            sparseArrayCompat0 = new SparseArrayCompat();
            this.a.put(context0, sparseArrayCompat0);
        }
        sparseArrayCompat0.a(v, colorStateList0);
    }

    private void d(@NonNull Context context0) {
        if(this.f) {
            return;
        }
        this.f = true;
        Drawable drawable0 = this.j(context0, drawable.abc_vector_test);
        if(drawable0 != null && ResourceManagerInternal.q(drawable0)) {
            return;
        }
        this.f = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    private static long e(TypedValue typedValue0) {
        return ((long)typedValue0.assetCookie) << 0x20 | ((long)typedValue0.data);
    }

    private Drawable f(@NonNull Context context0, @DrawableRes int v) {
        if(this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue0 = this.e;
        context0.getResources().getValue(v, typedValue0, true);
        long v1 = ResourceManagerInternal.e(typedValue0);
        Drawable drawable0 = this.i(context0, v1);
        if(drawable0 != null) {
            return drawable0;
        }
        Drawable drawable1 = this.g == null ? null : this.g.a(this, context0, v);
        if(drawable1 != null) {
            drawable1.setChangingConfigurations(typedValue0.changingConfigurations);
            this.b(context0, v1, drawable1);
        }
        return drawable1;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0, int[] arr_v) {
        return colorStateList0 == null || porterDuff$Mode0 == null ? null : ResourceManagerInternal.l(colorStateList0.getColorForState(arr_v, 0), porterDuff$Mode0);
    }

    public static ResourceManagerInternal h() {
        synchronized(ResourceManagerInternal.class) {
            if(ResourceManagerInternal.m == null) {
                ResourceManagerInternal resourceManagerInternal0 = new ResourceManagerInternal();
                ResourceManagerInternal.m = resourceManagerInternal0;
                ResourceManagerInternal.p(resourceManagerInternal0);
            }
            return ResourceManagerInternal.m;
        }
    }

    private Drawable i(@NonNull Context context0, long v) {
        synchronized(this) {
            LongSparseArray longSparseArray0 = (LongSparseArray)this.d.get(context0);
            if(longSparseArray0 == null) {
                return null;
            }
            WeakReference weakReference0 = (WeakReference)longSparseArray0.g(v);
            if(weakReference0 != null) {
                Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)weakReference0.get();
                if(drawable$ConstantState0 != null) {
                    return drawable$ConstantState0.newDrawable(context0.getResources());
                }
                longSparseArray0.q(v);
            }
            return null;
        }
    }

    public Drawable j(@NonNull Context context0, @DrawableRes int v) {
        synchronized(this) {
            return this.k(context0, v, false);
        }
    }

    Drawable k(@NonNull Context context0, @DrawableRes int v, boolean z) {
        synchronized(this) {
            this.d(context0);
            Drawable drawable0 = this.r(context0, v);
            if(drawable0 == null) {
                drawable0 = this.f(context0, v);
            }
            if(drawable0 == null) {
                drawable0 = ContextCompat.getDrawable(context0, v);
            }
            if(drawable0 != null) {
                drawable0 = this.v(context0, v, z, drawable0);
            }
            if(drawable0 != null) {
                DrawableUtils.b(drawable0);
            }
            return drawable0;
        }
    }

    public static PorterDuffColorFilter l(int v, PorterDuff.Mode porterDuff$Mode0) {
        synchronized(ResourceManagerInternal.class) {
            ColorFilterLruCache resourceManagerInternal$ColorFilterLruCache0 = ResourceManagerInternal.n;
            PorterDuffColorFilter porterDuffColorFilter0 = resourceManagerInternal$ColorFilterLruCache0.c(v, porterDuff$Mode0);
            if(porterDuffColorFilter0 == null) {
                porterDuffColorFilter0 = new PorterDuffColorFilter(v, porterDuff$Mode0);
                resourceManagerInternal$ColorFilterLruCache0.d(v, porterDuff$Mode0, porterDuffColorFilter0);
            }
            return porterDuffColorFilter0;
        }
    }

    ColorStateList m(@NonNull Context context0, @DrawableRes int v) {
        synchronized(this) {
            ColorStateList colorStateList0 = this.n(context0, v);
            if(colorStateList0 == null) {
                colorStateList0 = this.g == null ? null : this.g.b(context0, v);
                if(colorStateList0 != null) {
                    this.c(context0, v, colorStateList0);
                }
            }
            return colorStateList0;
        }
    }

    private ColorStateList n(@NonNull Context context0, @DrawableRes int v) {
        WeakHashMap weakHashMap0 = this.a;
        if(weakHashMap0 != null) {
            SparseArrayCompat sparseArrayCompat0 = (SparseArrayCompat)weakHashMap0.get(context0);
            return sparseArrayCompat0 == null ? null : ((ColorStateList)sparseArrayCompat0.g(v));
        }
        return null;
    }

    PorterDuff.Mode o(int v) {
        return this.g == null ? null : this.g.c(v);
    }

    private static void p(@NonNull ResourceManagerInternal resourceManagerInternal0) {
        if(Build.VERSION.SDK_INT < 24) {
            resourceManagerInternal0.a("vector", new VdcInflateDelegate());
            resourceManagerInternal0.a("animated-vector", new AvdcInflateDelegate());
            resourceManagerInternal0.a("animated-selector", new AsldcInflateDelegate());
            resourceManagerInternal0.a("drawable", new DrawableDelegate());
        }
    }

    // 去混淆评级： 低(20)
    private static boolean q(@NonNull Drawable drawable0) {
        return drawable0 instanceof VectorDrawableCompat || "android.graphics.drawable.VectorDrawable".equals(drawable0.getClass().getName());
    }

    private Drawable r(@NonNull Context context0, @DrawableRes int v) {
        if(this.b != null && !this.b.isEmpty()) {
            SparseArrayCompat sparseArrayCompat0 = this.c;
            if(sparseArrayCompat0 == null) {
                this.c = new SparseArrayCompat();
            }
            else {
                String s = (String)sparseArrayCompat0.g(v);
                if("appcompat_skip_skip".equals(s) || s != null && this.b.get(s) == null) {
                    return null;
                }
            }
            if(this.e == null) {
                this.e = new TypedValue();
            }
            TypedValue typedValue0 = this.e;
            Resources resources0 = context0.getResources();
            resources0.getValue(v, typedValue0, true);
            long v1 = ResourceManagerInternal.e(typedValue0);
            Drawable drawable0 = this.i(context0, v1);
            if(drawable0 != null) {
                return drawable0;
            }
            if(typedValue0.string != null && typedValue0.string.toString().endsWith(".xml")) {
                try {
                    XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
                    AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
                    do {
                        int v2 = xmlResourceParser0.next();
                    }
                    while(v2 != 1 && v2 != 2);
                    if(v2 != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    String s1 = xmlResourceParser0.getName();
                    this.c.a(v, s1);
                    InflateDelegate resourceManagerInternal$InflateDelegate0 = (InflateDelegate)this.b.get(s1);
                    if(resourceManagerInternal$InflateDelegate0 != null) {
                        drawable0 = resourceManagerInternal$InflateDelegate0.a(context0, xmlResourceParser0, attributeSet0, context0.getTheme());
                    }
                    if(drawable0 != null) {
                        drawable0.setChangingConfigurations(typedValue0.changingConfigurations);
                        this.b(context0, v1, drawable0);
                    }
                    goto label_34;
                }
                catch(Exception exception0) {
                }
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", exception0);
            }
        label_34:
            if(drawable0 == null) {
                this.c.a(v, "appcompat_skip_skip");
            }
            return drawable0;
        }
        return null;
    }

    public void s(@NonNull Context context0) {
        synchronized(this) {
            LongSparseArray longSparseArray0 = (LongSparseArray)this.d.get(context0);
            if(longSparseArray0 != null) {
                longSparseArray0.b();
            }
        }
    }

    Drawable t(@NonNull Context context0, @NonNull VectorEnabledTintResources vectorEnabledTintResources0, @DrawableRes int v) {
        synchronized(this) {
            Drawable drawable0 = this.r(context0, v);
            if(drawable0 == null) {
                drawable0 = vectorEnabledTintResources0.a(v);
            }
            return drawable0 != null ? this.v(context0, v, false, drawable0) : null;
        }
    }

    public void u(ResourceManagerHooks resourceManagerInternal$ResourceManagerHooks0) {
        synchronized(this) {
            this.g = resourceManagerInternal$ResourceManagerHooks0;
        }
    }

    private Drawable v(@NonNull Context context0, @DrawableRes int v, boolean z, @NonNull Drawable drawable0) {
        ColorStateList colorStateList0 = this.m(context0, v);
        if(colorStateList0 != null) {
            drawable0 = DrawableCompat.r(drawable0.mutate());
            DrawableCompat.o(drawable0, colorStateList0);
            PorterDuff.Mode porterDuff$Mode0 = this.o(v);
            if(porterDuff$Mode0 != null) {
                DrawableCompat.p(drawable0, porterDuff$Mode0);
                return drawable0;
            }
            return drawable0;
        }
        return this.g != null && this.g.d(context0, v, drawable0) || this.x(context0, v, drawable0) || !z ? drawable0 : null;
    }

    static void w(Drawable drawable0, TintInfo tintInfo0, int[] arr_v) {
        int[] arr_v1 = drawable0.getState();
        if(drawable0.mutate() == drawable0) {
            if(drawable0 instanceof LayerDrawable && drawable0.isStateful()) {
                drawable0.setState(new int[0]);
                drawable0.setState(arr_v1);
            }
            boolean z = tintInfo0.d;
            if(z || tintInfo0.c) {
                drawable0.setColorFilter(ResourceManagerInternal.g((z ? tintInfo0.a : null), (tintInfo0.c ? tintInfo0.b : ResourceManagerInternal.j), arr_v));
            }
            else {
                drawable0.clearColorFilter();
            }
            if(Build.VERSION.SDK_INT <= 23) {
                drawable0.invalidateSelf();
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    boolean x(@NonNull Context context0, @DrawableRes int v, @NonNull Drawable drawable0) {
        return this.g != null && this.g.e(context0, v, drawable0);
    }
}

