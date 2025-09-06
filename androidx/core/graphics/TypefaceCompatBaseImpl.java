package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry;
import androidx.core.provider.FontsContractCompat.FontInfo;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;

@RestrictTo({Scope.c})
class TypefaceCompatBaseImpl {
    interface StyleExtractor {
        int a(Object arg1);

        boolean b(Object arg1);
    }

    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap a;
    private static final String b = "TypefaceCompatBaseImpl";
    private static final int c;

    TypefaceCompatBaseImpl() {
        this.a = new ConcurrentHashMap();
    }

    private void a(Typeface typeface0, FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry0) {
        long v = TypefaceCompatBaseImpl.o(typeface0);
        if(v != 0L) {
            this.a.put(v, fontResourcesParserCompat$FontFamilyFilesResourceEntry0);
        }
    }

    public Typeface b(Context context0, FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry0, Resources resources0, int v) {
        FontFileResourceEntry fontResourcesParserCompat$FontFileResourceEntry0 = this.i(fontResourcesParserCompat$FontFamilyFilesResourceEntry0, v);
        if(fontResourcesParserCompat$FontFileResourceEntry0 == null) {
            return null;
        }
        Typeface typeface0 = TypefaceCompat.i(context0, resources0, fontResourcesParserCompat$FontFileResourceEntry0.b(), fontResourcesParserCompat$FontFileResourceEntry0.a(), 0, v);
        this.a(typeface0, fontResourcesParserCompat$FontFamilyFilesResourceEntry0);
        return typeface0;
    }

    Typeface c(Context context0, FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry0, Resources resources0, int v, boolean z) {
        FontFileResourceEntry fontResourcesParserCompat$FontFileResourceEntry0 = this.j(fontResourcesParserCompat$FontFamilyFilesResourceEntry0, v, z);
        if(fontResourcesParserCompat$FontFileResourceEntry0 == null) {
            return null;
        }
        Typeface typeface0 = TypefaceCompat.i(context0, resources0, fontResourcesParserCompat$FontFileResourceEntry0.b(), fontResourcesParserCompat$FontFileResourceEntry0.a(), 0, 0);
        this.a(typeface0, fontResourcesParserCompat$FontFamilyFilesResourceEntry0);
        return typeface0;
    }

    public Typeface d(Context context0, CancellationSignal cancellationSignal0, FontInfo[] arr_fontsContractCompat$FontInfo, int v) {
        InputStream inputStream0;
        if(arr_fontsContractCompat$FontInfo.length < 1) {
            return null;
        }
        FontInfo fontsContractCompat$FontInfo0 = this.m(arr_fontsContractCompat$FontInfo, v);
        try {
            inputStream0 = null;
            inputStream0 = context0.getContentResolver().openInputStream(fontsContractCompat$FontInfo0.d());
            return this.f(context0, inputStream0);
        }
        catch(IOException unused_ex) {
            return null;
        }
        finally {
            TypefaceCompatUtil.a(inputStream0);
        }
    }

    @RequiresApi(29)
    public Typeface e(Context context0, CancellationSignal cancellationSignal0, List list0, int v) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface f(Context context0, InputStream inputStream0) {
        File file0 = TypefaceCompatUtil.e(context0);
        if(file0 == null) {
            return null;
        }
        try {
            return TypefaceCompatUtil.d(file0, inputStream0) ? Typeface.createFromFile(file0.getPath()) : null;
        }
        catch(RuntimeException unused_ex) {
            return null;
        }
        finally {
            file0.delete();
        }
    }

    public Typeface g(Context context0, Resources resources0, int v, String s, int v1) {
        File file0 = TypefaceCompatUtil.e(context0);
        if(file0 == null) {
            return null;
        }
        try {
            return TypefaceCompatUtil.c(file0, resources0, v) ? Typeface.createFromFile(file0.getPath()) : null;
        }
        catch(RuntimeException unused_ex) {
            return null;
        }
        finally {
            file0.delete();
        }
    }

    Typeface h(Context context0, Typeface typeface0, int v, boolean z) {
        Typeface typeface1 = null;
        try {
            typeface1 = WeightTypefaceApi14.a(this, context0, typeface0, v, z);
        }
        catch(RuntimeException unused_ex) {
        }
        return typeface1 == null ? typeface0 : typeface1;
    }

    private FontFileResourceEntry i(FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry0, int v) {
        return (FontFileResourceEntry)TypefaceCompatBaseImpl.k(fontResourcesParserCompat$FontFamilyFilesResourceEntry0.a(), v, new StyleExtractor() {
            final TypefaceCompatBaseImpl a;

            @Override  // androidx.core.graphics.TypefaceCompatBaseImpl$StyleExtractor
            public int a(Object object0) {
                return this.c(((FontFileResourceEntry)object0));
            }

            @Override  // androidx.core.graphics.TypefaceCompatBaseImpl$StyleExtractor
            public boolean b(Object object0) {
                return this.d(((FontFileResourceEntry)object0));
            }

            public int c(FontFileResourceEntry fontResourcesParserCompat$FontFileResourceEntry0) {
                return fontResourcesParserCompat$FontFileResourceEntry0.e();
            }

            public boolean d(FontFileResourceEntry fontResourcesParserCompat$FontFileResourceEntry0) {
                return fontResourcesParserCompat$FontFileResourceEntry0.f();
            }
        });
    }

    private FontFileResourceEntry j(FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry0, int v, boolean z) {
        return (FontFileResourceEntry)TypefaceCompatBaseImpl.l(fontResourcesParserCompat$FontFamilyFilesResourceEntry0.a(), v, z, new StyleExtractor() {
            final TypefaceCompatBaseImpl a;

            @Override  // androidx.core.graphics.TypefaceCompatBaseImpl$StyleExtractor
            public int a(Object object0) {
                return this.c(((FontFileResourceEntry)object0));
            }

            @Override  // androidx.core.graphics.TypefaceCompatBaseImpl$StyleExtractor
            public boolean b(Object object0) {
                return this.d(((FontFileResourceEntry)object0));
            }

            public int c(FontFileResourceEntry fontResourcesParserCompat$FontFileResourceEntry0) {
                return fontResourcesParserCompat$FontFileResourceEntry0.e();
            }

            public boolean d(FontFileResourceEntry fontResourcesParserCompat$FontFileResourceEntry0) {
                return fontResourcesParserCompat$FontFileResourceEntry0.f();
            }
        });
    }

    private static Object k(Object[] arr_object, int v, StyleExtractor typefaceCompatBaseImpl$StyleExtractor0) {
        int v1 = (v & 1) == 0 ? 400 : 700;
        return (v & 2) == 0 ? TypefaceCompatBaseImpl.l(arr_object, v1, false, typefaceCompatBaseImpl$StyleExtractor0) : TypefaceCompatBaseImpl.l(arr_object, v1, true, typefaceCompatBaseImpl$StyleExtractor0);
    }

    private static Object l(Object[] arr_object, int v, boolean z, StyleExtractor typefaceCompatBaseImpl$StyleExtractor0) {
        Object object0 = null;
        int v1 = 0x7FFFFFFF;
        for(int v2 = 0; v2 < arr_object.length; ++v2) {
            Object object1 = arr_object[v2];
            int v3 = Math.abs(typefaceCompatBaseImpl$StyleExtractor0.a(object1) - v) * 2 + (typefaceCompatBaseImpl$StyleExtractor0.b(object1) == z ? 0 : 1);
            if(object0 == null || v1 > v3) {
                object0 = object1;
                v1 = v3;
            }
        }
        return object0;
    }

    protected FontInfo m(FontInfo[] arr_fontsContractCompat$FontInfo, int v) {
        return (FontInfo)TypefaceCompatBaseImpl.k(arr_fontsContractCompat$FontInfo, v, new StyleExtractor() {
            final TypefaceCompatBaseImpl a;

            @Override  // androidx.core.graphics.TypefaceCompatBaseImpl$StyleExtractor
            public int a(Object object0) {
                return this.c(((FontInfo)object0));
            }

            @Override  // androidx.core.graphics.TypefaceCompatBaseImpl$StyleExtractor
            public boolean b(Object object0) {
                return this.d(((FontInfo)object0));
            }

            public int c(FontInfo fontsContractCompat$FontInfo0) {
                return fontsContractCompat$FontInfo0.e();
            }

            public boolean d(FontInfo fontsContractCompat$FontInfo0) {
                return fontsContractCompat$FontInfo0.f();
            }
        });
    }

    FontFamilyFilesResourceEntry n(Typeface typeface0) {
        long v = TypefaceCompatBaseImpl.o(typeface0);
        return v == 0L ? null : ((FontFamilyFilesResourceEntry)this.a.get(v));
    }

    private static long o(Typeface typeface0) {
        if(typeface0 == null) {
            return 0L;
        }
        try {
            Field field0 = Typeface.class.getDeclaredField("native_instance");
            field0.setAccessible(true);
            return ((Number)field0.get(typeface0)).longValue();
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", noSuchFieldException0);
            return 0L;
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", illegalAccessException0);
            return 0L;
        }
    }
}

