package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.annotation.GuardedBy;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.Consumer;
import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

class FontRequestWorker {
    static final class TypefaceResult {
        final Typeface a;
        final int b;

        TypefaceResult(int v) {
            this.a = null;
            this.b = v;
        }

        @SuppressLint({"WrongConstant"})
        TypefaceResult(Typeface typeface0) {
            this.a = typeface0;
            this.b = 0;
        }

        @SuppressLint({"WrongConstant"})
        boolean a() {
            return this.b == 0;
        }
    }

    static final LruCache a;
    private static final ExecutorService b;
    static final Object c;
    @GuardedBy("LOCK")
    static final SimpleArrayMap d;

    static {
        FontRequestWorker.a = new LruCache(16);
        FontRequestWorker.b = RequestExecutor.a("fonts-androidx", 10, 10000);
        FontRequestWorker.c = new Object();
        FontRequestWorker.d = new SimpleArrayMap();
    }

    private static String a(List list0, int v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            stringBuilder0.append(((FontRequest)list0.get(v1)).d());
            stringBuilder0.append("-");
            stringBuilder0.append(v);
            if(v1 < list0.size() - 1) {
                stringBuilder0.append(";");
            }
        }
        return stringBuilder0.toString();
    }

    @SuppressLint({"WrongConstant"})
    private static int b(FontFamilyResult fontsContractCompat$FontFamilyResult0) {
        int v = 1;
        switch(fontsContractCompat$FontFamilyResult0.e()) {
            case 0: {
                FontInfo[] arr_fontsContractCompat$FontInfo = fontsContractCompat$FontFamilyResult0.c();
                if(arr_fontsContractCompat$FontInfo != null && arr_fontsContractCompat$FontInfo.length != 0) {
                    v = 0;
                    for(int v1 = 0; v1 < arr_fontsContractCompat$FontInfo.length; ++v1) {
                        int v2 = arr_fontsContractCompat$FontInfo[v1].b();
                        if(v2 != 0) {
                            return v2 < 0 ? -3 : v2;
                        }
                    }
                }
                return v;
            }
            case 1: {
                return -2;
            }
            default: {
                return -3;
            }
        }
    }

    static TypefaceResult c(String s, Context context0, List list0, int v) {
        FontFamilyResult fontsContractCompat$FontFamilyResult0;
        Trace.c("getFontSync");
        try {
            LruCache lruCache0 = FontRequestWorker.a;
            Typeface typeface0 = (Typeface)lruCache0.get(s);
            if(typeface0 != null) {
                return new TypefaceResult(typeface0);
            }
            try {
                fontsContractCompat$FontFamilyResult0 = FontProvider.f(context0, list0, null);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                return new TypefaceResult(-1);
            }
            int v2 = FontRequestWorker.b(fontsContractCompat$FontFamilyResult0);
            if(v2 != 0) {
                return new TypefaceResult(v2);
            }
            Typeface typeface1 = !fontsContractCompat$FontFamilyResult0.f() || Build.VERSION.SDK_INT < 29 ? TypefaceCompat.d(context0, null, fontsContractCompat$FontFamilyResult0.c(), v) : TypefaceCompat.e(context0, null, fontsContractCompat$FontFamilyResult0.d(), v);
            if(typeface1 != null) {
                lruCache0.put(s, typeface1);
                return new TypefaceResult(typeface1);
            }
            return new TypefaceResult(-3);
        }
        finally {
            Trace.f();
        }
    }

    static Typeface d(Context context0, List list0, int v, Executor executor0, CallbackWrapper callbackWrapper0) {
        String s = FontRequestWorker.a(list0, v);
        Typeface typeface0 = (Typeface)FontRequestWorker.a.get(s);
        if(typeface0 != null) {
            callbackWrapper0.b(new TypefaceResult(typeface0));
            return typeface0;
        }
        androidx.core.provider.FontRequestWorker.2 fontRequestWorker$20 = new Consumer() {
            public void a(TypefaceResult fontRequestWorker$TypefaceResult0) {
                if(fontRequestWorker$TypefaceResult0 == null) {
                    fontRequestWorker$TypefaceResult0 = new TypefaceResult(-3);
                }
                callbackWrapper0.b(fontRequestWorker$TypefaceResult0);
            }

            @Override  // androidx.core.util.Consumer
            public void accept(Object object0) {
                this.a(((TypefaceResult)object0));
            }
        };
        synchronized(FontRequestWorker.c) {
            SimpleArrayMap simpleArrayMap0 = FontRequestWorker.d;
            ArrayList arrayList0 = (ArrayList)simpleArrayMap0.get(s);
            if(arrayList0 != null) {
                arrayList0.add(fontRequestWorker$20);
                return null;
            }
            ArrayList arrayList1 = new ArrayList();
            arrayList1.add(fontRequestWorker$20);
            simpleArrayMap0.put(s, arrayList1);
        }
        androidx.core.provider.FontRequestWorker.3 fontRequestWorker$30 = new Callable() {
            public TypefaceResult a() {
                try {
                    return FontRequestWorker.c(s, context0, list0, v);
                }
                catch(Throwable unused_ex) {
                    return new TypefaceResult(-3);
                }
            }

            @Override
            public Object call() throws Exception {
                return this.a();
            }
        };
        if(executor0 == null) {
            executor0 = FontRequestWorker.b;
        }
        RequestExecutor.c(executor0, fontRequestWorker$30, new Consumer() {
            public void a(TypefaceResult fontRequestWorker$TypefaceResult0) {
                ArrayList arrayList0;
                synchronized(FontRequestWorker.c) {
                    SimpleArrayMap simpleArrayMap0 = FontRequestWorker.d;
                    arrayList0 = (ArrayList)simpleArrayMap0.get(s);
                    if(arrayList0 == null) {
                        return;
                    }
                    simpleArrayMap0.remove(s);
                }
                for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                    ((Consumer)arrayList0.get(v1)).accept(fontRequestWorker$TypefaceResult0);
                }
            }

            @Override  // androidx.core.util.Consumer
            public void accept(Object object0) {
                this.a(((TypefaceResult)object0));
            }
        });
        return null;
    }

    static Typeface e(Context context0, FontRequest fontRequest0, CallbackWrapper callbackWrapper0, int v, int v1) {
        String s = FontRequestWorker.a(c.a(fontRequest0), v);
        Typeface typeface0 = (Typeface)FontRequestWorker.a.get(s);
        if(typeface0 != null) {
            callbackWrapper0.b(new TypefaceResult(typeface0));
            return typeface0;
        }
        if(v1 == -1) {
            TypefaceResult fontRequestWorker$TypefaceResult0 = FontRequestWorker.c(s, context0, d.a(fontRequest0), v);
            callbackWrapper0.b(fontRequestWorker$TypefaceResult0);
            return fontRequestWorker$TypefaceResult0.a;
        }
        androidx.core.provider.FontRequestWorker.1 fontRequestWorker$10 = new Callable() {
            public TypefaceResult a() {
                List list0 = e.a(fontRequest0);
                return FontRequestWorker.c(s, context0, list0, v);
            }

            @Override
            public Object call() throws Exception {
                return this.a();
            }
        };
        try {
            TypefaceResult fontRequestWorker$TypefaceResult1 = (TypefaceResult)RequestExecutor.d(FontRequestWorker.b, fontRequestWorker$10, v1);
            callbackWrapper0.b(fontRequestWorker$TypefaceResult1);
            return fontRequestWorker$TypefaceResult1.a;
        }
        catch(InterruptedException unused_ex) {
            callbackWrapper0.b(new TypefaceResult(-3));
            return null;
        }
    }

    static void f() {
        FontRequestWorker.a.evictAll();
    }
}

