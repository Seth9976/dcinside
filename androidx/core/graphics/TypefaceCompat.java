package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.provider.FontsContractCompat.FontInfo;
import androidx.core.provider.FontsContractCompat.FontRequestCallback;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import java.util.List;

public class TypefaceCompat {
    @RestrictTo({Scope.a})
    public static class ResourcesCallbackAdapter extends FontRequestCallback {
        private FontCallback j;

        public ResourcesCallbackAdapter(FontCallback resourcesCompat$FontCallback0) {
            this.j = resourcesCompat$FontCallback0;
        }

        @Override  // androidx.core.provider.FontsContractCompat$FontRequestCallback
        public void a(int v) {
            FontCallback resourcesCompat$FontCallback0 = this.j;
            if(resourcesCompat$FontCallback0 != null) {
                resourcesCompat$FontCallback0.h(v);
            }
        }

        @Override  // androidx.core.provider.FontsContractCompat$FontRequestCallback
        public void b(Typeface typeface0) {
            FontCallback resourcesCompat$FontCallback0 = this.j;
            if(resourcesCompat$FontCallback0 != null) {
                resourcesCompat$FontCallback0.i(typeface0);
            }
        }
    }

    @RestrictTo({Scope.a})
    public static final boolean a = false;
    @RestrictTo({Scope.a})
    public static final boolean b = true;
    private static final TypefaceCompatBaseImpl c;
    private static final LruCache d;

    static {
        Trace.c("TypefaceCompat static init");
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            TypefaceCompat.c = new TypefaceCompatApi29Impl();
        }
        else if(v >= 28) {
            TypefaceCompat.c = new TypefaceCompatApi28Impl();
        }
        else if(v >= 26) {
            TypefaceCompat.c = new TypefaceCompatApi26Impl();
        }
        else if(v < 24 || !TypefaceCompatApi24Impl.r()) {
            TypefaceCompat.c = new TypefaceCompatApi21Impl();
        }
        else {
            TypefaceCompat.c = new TypefaceCompatApi24Impl();
        }
        TypefaceCompat.d = new LruCache(16);
        Trace.f();
    }

    @RestrictTo({Scope.c})
    @VisibleForTesting
    public static void a() {
        TypefaceCompat.d.evictAll();
    }

    public static Typeface b(Context context0, Typeface typeface0, int v) {
        if(context0 == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        return Typeface.create(typeface0, v);
    }

    public static Typeface c(Context context0, Typeface typeface0, @IntRange(from = 1L, to = 1000L) int v, boolean z) {
        if(context0 == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        Preconditions.g(v, 1, 1000, "weight");
        if(typeface0 == null) {
            typeface0 = Typeface.DEFAULT;
        }
        return TypefaceCompat.c.h(context0, typeface0, v, z);
    }

    @RestrictTo({Scope.c})
    public static Typeface d(Context context0, CancellationSignal cancellationSignal0, FontInfo[] arr_fontsContractCompat$FontInfo, int v) {
        Trace.c("TypefaceCompat.createFromFontInfo");
        try {
            return TypefaceCompat.c.d(context0, cancellationSignal0, arr_fontsContractCompat$FontInfo, v);
        }
        finally {
            Trace.f();
        }
    }

    @RequiresApi(29)
    @RestrictTo({Scope.a})
    public static Typeface e(Context context0, CancellationSignal cancellationSignal0, List list0, int v) {
        Trace.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return TypefaceCompat.c.e(context0, cancellationSignal0, list0, v);
        }
        finally {
            Trace.f();
        }
    }

    @RestrictTo({Scope.c})
    @Deprecated
    public static Typeface f(Context context0, FamilyResourceEntry fontResourcesParserCompat$FamilyResourceEntry0, Resources resources0, int v, int v1, FontCallback resourcesCompat$FontCallback0, Handler handler0, boolean z) {
        return TypefaceCompat.g(context0, fontResourcesParserCompat$FamilyResourceEntry0, resources0, v, null, 0, v1, resourcesCompat$FontCallback0, handler0, z);
    }

    @RestrictTo({Scope.a})
    public static Typeface g(Context context0, FamilyResourceEntry fontResourcesParserCompat$FamilyResourceEntry0, Resources resources0, int v, String s, int v1, int v2, FontCallback resourcesCompat$FontCallback0, Handler handler0, boolean z) {
        Typeface typeface1;
        boolean z1;
        if(fontResourcesParserCompat$FamilyResourceEntry0 instanceof ProviderResourceEntry) {
            Typeface typeface0 = TypefaceCompat.n(((ProviderResourceEntry)fontResourcesParserCompat$FamilyResourceEntry0).d());
            if(typeface0 != null) {
                if(resourcesCompat$FontCallback0 != null) {
                    resourcesCompat$FontCallback0.d(typeface0, handler0);
                }
                return typeface0;
            }
            if(!z) {
                z1 = resourcesCompat$FontCallback0 == null;
            }
            else if(((ProviderResourceEntry)fontResourcesParserCompat$FamilyResourceEntry0).b() == 0) {
                z1 = true;
            }
            else {
                z1 = false;
            }
            int v3 = z ? ((ProviderResourceEntry)fontResourcesParserCompat$FamilyResourceEntry0).e() : -1;
            Handler handler1 = FontCallback.e(handler0);
            ResourcesCallbackAdapter typefaceCompat$ResourcesCallbackAdapter0 = new ResourcesCallbackAdapter(resourcesCompat$FontCallback0);
            typeface1 = FontsContractCompat.g(context0, (((ProviderResourceEntry)fontResourcesParserCompat$FamilyResourceEntry0).a() == null ? w.a(((ProviderResourceEntry)fontResourcesParserCompat$FamilyResourceEntry0).c()) : v.a(((ProviderResourceEntry)fontResourcesParserCompat$FamilyResourceEntry0).c(), ((ProviderResourceEntry)fontResourcesParserCompat$FamilyResourceEntry0).a())), v2, z1, v3, handler1, typefaceCompat$ResourcesCallbackAdapter0);
        }
        else {
            typeface1 = TypefaceCompat.c.b(context0, ((FontFamilyFilesResourceEntry)fontResourcesParserCompat$FamilyResourceEntry0), resources0, v2);
            if(resourcesCompat$FontCallback0 != null) {
                if(typeface1 == null) {
                    resourcesCompat$FontCallback0.c(-3, handler0);
                }
                else {
                    resourcesCompat$FontCallback0.d(typeface1, handler0);
                }
            }
        }
        if(typeface1 != null) {
            String s1 = TypefaceCompat.j(resources0, v, s, v1, v2);
            TypefaceCompat.d.put(s1, typeface1);
        }
        return typeface1;
    }

    @RestrictTo({Scope.c})
    @Deprecated
    public static Typeface h(Context context0, Resources resources0, int v, String s, int v1) {
        return TypefaceCompat.i(context0, resources0, v, s, 0, v1);
    }

    @RestrictTo({Scope.a})
    public static Typeface i(Context context0, Resources resources0, int v, String s, int v1, int v2) {
        Typeface typeface0 = TypefaceCompat.c.g(context0, resources0, v, s, v2);
        if(typeface0 != null) {
            String s1 = TypefaceCompat.j(resources0, v, s, v1, v2);
            TypefaceCompat.d.put(s1, typeface0);
        }
        return typeface0;
    }

    private static String j(Resources resources0, int v, String s, int v1, int v2) {
        return resources0.getResourcePackageName(v) + '-' + s + '-' + v1 + '-' + v + '-' + v2;
    }

    @RestrictTo({Scope.c})
    @Deprecated
    public static Typeface k(Resources resources0, int v, int v1) {
        return TypefaceCompat.l(resources0, v, null, 0, v1);
    }

    @RestrictTo({Scope.a})
    public static Typeface l(Resources resources0, int v, String s, int v1, int v2) {
        String s1 = TypefaceCompat.j(resources0, v, s, v1, v2);
        return (Typeface)TypefaceCompat.d.get(s1);
    }

    private static Typeface m(Context context0, Typeface typeface0, int v) {
        FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry0 = TypefaceCompat.c.n(typeface0);
        return fontResourcesParserCompat$FontFamilyFilesResourceEntry0 == null ? null : TypefaceCompat.c.b(context0, fontResourcesParserCompat$FontFamilyFilesResourceEntry0, context0.getResources(), v);
    }

    private static Typeface n(String s) {
        if(s != null && !s.isEmpty()) {
            Typeface typeface0 = Typeface.create(s, 0);
            return typeface0 == null || typeface0.equals(Typeface.create(Typeface.DEFAULT, 0)) ? null : typeface0;
        }
        return null;
    }
}

