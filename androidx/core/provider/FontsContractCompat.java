package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.graphics.TypefaceCompat.ResourcesCallbackAdapter;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public class FontsContractCompat {
    public static final class Columns implements BaseColumns {
        public static final String a = "file_id";
        public static final String b = "font_ttc_index";
        public static final String c = "font_variation_settings";
        public static final String d = "font_weight";
        public static final String e = "font_italic";
        public static final String f = "result_code";
        public static final int g = 0;
        public static final int h = 1;
        public static final int i = 2;
        public static final int j = 3;

    }

    public static class FontFamilyResult {
        private final int a;
        private final List b;
        public static final int c = 0;
        public static final int d = 1;
        public static final int e = 2;

        FontFamilyResult(int v, List list0) {
            this.a = v;
            this.b = list0;
        }

        @RestrictTo({Scope.c})
        @Deprecated
        public FontFamilyResult(int v, FontInfo[] arr_fontsContractCompat$FontInfo) {
            this.a = v;
            this.b = Collections.singletonList(arr_fontsContractCompat$FontInfo);
        }

        static FontFamilyResult a(int v, List list0) {
            return new FontFamilyResult(v, list0);
        }

        static FontFamilyResult b(int v, FontInfo[] arr_fontsContractCompat$FontInfo) {
            return new FontFamilyResult(v, arr_fontsContractCompat$FontInfo);
        }

        public FontInfo[] c() {
            return (FontInfo[])this.b.get(0);
        }

        public List d() {
            return this.b;
        }

        public int e() {
            return this.a;
        }

        boolean f() {
            return this.b.size() > 1;
        }
    }

    public static class FontInfo {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;

        @RestrictTo({Scope.c})
        @Deprecated
        public FontInfo(Uri uri0, @IntRange(from = 0L) int v, @IntRange(from = 1L, to = 1000L) int v1, boolean z, int v2) {
            this.a = (Uri)Preconditions.l(uri0);
            this.b = v;
            this.c = v1;
            this.d = z;
            this.e = v2;
        }

        static FontInfo a(Uri uri0, @IntRange(from = 0L) int v, @IntRange(from = 1L, to = 1000L) int v1, boolean z, int v2) {
            return new FontInfo(uri0, v, v1, z, v2);
        }

        public int b() {
            return this.e;
        }

        @IntRange(from = 0L)
        public int c() {
            return this.b;
        }

        public Uri d() {
            return this.a;
        }

        @IntRange(from = 1L, to = 1000L)
        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.d;
        }
    }

    public static class FontRequestCallback {
        @RestrictTo({Scope.c})
        @Retention(RetentionPolicy.SOURCE)
        public @interface FontRequestFailReason {
        }

        @RestrictTo({Scope.c})
        @Deprecated
        public static final int a = 0;
        static final int b = 0;
        public static final int c = -1;
        public static final int d = -2;
        public static final int e = -3;
        public static final int f = -4;
        public static final int g = 1;
        public static final int h = 2;
        public static final int i = 3;

        public void a(int v) {
        }

        public void b(Typeface typeface0) {
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TypefaceStyle {
    }

    @RestrictTo({Scope.c})
    @Deprecated
    public static final String a = "font_results";
    @RestrictTo({Scope.c})
    @Deprecated
    static final int b = -1;
    @RestrictTo({Scope.c})
    @Deprecated
    static final int c = -2;

    public static Typeface a(Context context0, CancellationSignal cancellationSignal0, FontInfo[] arr_fontsContractCompat$FontInfo) {
        return TypefaceCompat.d(context0, cancellationSignal0, arr_fontsContractCompat$FontInfo, 0);
    }

    public static FontFamilyResult b(Context context0, CancellationSignal cancellationSignal0, FontRequest fontRequest0) throws PackageManager.NameNotFoundException {
        return FontProvider.f(context0, i.a(fontRequest0), cancellationSignal0);
    }

    @RestrictTo({Scope.c})
    @Deprecated
    public static Typeface c(Context context0, FontRequest fontRequest0, FontCallback resourcesCompat$FontCallback0, Handler handler0, boolean z, int v, int v1) {
        ResourcesCallbackAdapter typefaceCompat$ResourcesCallbackAdapter0 = new ResourcesCallbackAdapter(resourcesCompat$FontCallback0);
        Handler handler1 = FontCallback.e(handler0);
        return FontsContractCompat.g(context0, h.a(fontRequest0), v1, z, v, handler1, typefaceCompat$ResourcesCallbackAdapter0);
    }

    @RestrictTo({Scope.c})
    @VisibleForTesting
    @Deprecated
    public static ProviderInfo d(PackageManager packageManager0, FontRequest fontRequest0, Resources resources0) throws PackageManager.NameNotFoundException {
        return FontProvider.g(packageManager0, fontRequest0, resources0);
    }

    @RestrictTo({Scope.c})
    @Deprecated
    public static Map e(Context context0, FontInfo[] arr_fontsContractCompat$FontInfo, CancellationSignal cancellationSignal0) {
        return TypefaceCompatUtil.h(context0, arr_fontsContractCompat$FontInfo, cancellationSignal0);
    }

    @RestrictTo({Scope.c})
    public static Typeface f(Context context0, FontRequest fontRequest0, int v, boolean z, @IntRange(from = 0L) int v1, Handler handler0, FontRequestCallback fontsContractCompat$FontRequestCallback0) {
        return FontsContractCompat.g(context0, g.a(fontRequest0), v, z, v1, handler0, fontsContractCompat$FontRequestCallback0);
    }

    @RestrictTo({Scope.a})
    public static Typeface g(Context context0, List list0, int v, boolean z, @IntRange(from = 0L) int v1, Handler handler0, FontRequestCallback fontsContractCompat$FontRequestCallback0) {
        CallbackWrapper callbackWrapper0 = new CallbackWrapper(fontsContractCompat$FontRequestCallback0, RequestExecutor.b(handler0));
        if(z) {
            if(list0.size() > 1) {
                throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
            }
            return FontRequestWorker.e(context0, ((FontRequest)list0.get(0)), callbackWrapper0, v, v1);
        }
        return FontRequestWorker.d(context0, list0, v, null, callbackWrapper0);
    }

    public static void h(Context context0, FontRequest fontRequest0, int v, Executor executor0, Executor executor1, FontRequestCallback fontsContractCompat$FontRequestCallback0) {
        CallbackWrapper callbackWrapper0 = new CallbackWrapper(fontsContractCompat$FontRequestCallback0, executor1);
        FontRequestWorker.d(context0.getApplicationContext(), j.a(fontRequest0), v, executor0, callbackWrapper0);
    }

    @Deprecated
    public static void i(Context context0, FontRequest fontRequest0, FontRequestCallback fontsContractCompat$FontRequestCallback0, Handler handler0) {
        CallbackWrapper callbackWrapper0 = new CallbackWrapper(fontsContractCompat$FontRequestCallback0);
        Executor executor0 = RequestExecutor.b(handler0);
        FontRequestWorker.d(context0.getApplicationContext(), f.a(fontRequest0), 0, executor0, callbackWrapper0);
    }

    public static void j(Context context0, List list0, int v, Executor executor0, Executor executor1, FontRequestCallback fontsContractCompat$FontRequestCallback0) {
        CallbackWrapper callbackWrapper0 = new CallbackWrapper(fontsContractCompat$FontRequestCallback0, executor1);
        FontRequestWorker.d(context0.getApplicationContext(), list0, v, executor0, callbackWrapper0);
    }

    @RestrictTo({Scope.c})
    @Deprecated
    public static void k() {
        FontRequestWorker.f();
    }

    @RestrictTo({Scope.a})
    @VisibleForTesting
    public static void l() {
        FontRequestWorker.f();
    }
}

