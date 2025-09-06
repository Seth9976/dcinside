package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.tracing.Trace;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class FontProvider {
    interface ContentQueryWrapper {
        Cursor a(Uri arg1, String[] arg2, String arg3, String[] arg4, String arg5, CancellationSignal arg6);

        void close();
    }

    static class ContentQueryWrapperApi16Impl implements ContentQueryWrapper {
        private final ContentProviderClient a;

        ContentQueryWrapperApi16Impl(Context context0, Uri uri0) {
            this.a = context0.getContentResolver().acquireUnstableContentProviderClient(uri0);
        }

        @Override  // androidx.core.provider.FontProvider$ContentQueryWrapper
        public Cursor a(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1, CancellationSignal cancellationSignal0) {
            ContentProviderClient contentProviderClient0 = this.a;
            if(contentProviderClient0 == null) {
                return null;
            }
            try {
                return contentProviderClient0.query(uri0, arr_s, s, arr_s1, s1, cancellationSignal0);
            }
            catch(RemoteException remoteException0) {
                Log.w("FontsProvider", "Unable to query the content provider", remoteException0);
                return null;
            }
        }

        @Override  // androidx.core.provider.FontProvider$ContentQueryWrapper
        public void close() {
            ContentProviderClient contentProviderClient0 = this.a;
            if(contentProviderClient0 != null) {
                contentProviderClient0.release();
            }
        }
    }

    @RequiresApi(24)
    static class ContentQueryWrapperApi24Impl implements ContentQueryWrapper {
        private final ContentProviderClient a;

        ContentQueryWrapperApi24Impl(Context context0, Uri uri0) {
            this.a = context0.getContentResolver().acquireUnstableContentProviderClient(uri0);
        }

        @Override  // androidx.core.provider.FontProvider$ContentQueryWrapper
        public Cursor a(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1, CancellationSignal cancellationSignal0) {
            ContentProviderClient contentProviderClient0 = this.a;
            if(contentProviderClient0 == null) {
                return null;
            }
            try {
                return contentProviderClient0.query(uri0, arr_s, s, arr_s1, s1, cancellationSignal0);
            }
            catch(RemoteException remoteException0) {
                Log.w("FontsProvider", "Unable to query the content provider", remoteException0);
                return null;
            }
        }

        @Override  // androidx.core.provider.FontProvider$ContentQueryWrapper
        public void close() {
            ContentProviderClient contentProviderClient0 = this.a;
            if(contentProviderClient0 != null) {
                contentProviderClient0.release();
            }
        }
    }

    static class ProviderCacheKey {
        String a;
        String b;
        List c;

        ProviderCacheKey(String s, String s1, List list0) {
            this.a = s;
            this.b = s1;
            this.c = list0;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ProviderCacheKey ? Objects.equals(this.a, ((ProviderCacheKey)object0).a) && Objects.equals(this.b, ((ProviderCacheKey)object0).b) && Objects.equals(this.c, ((ProviderCacheKey)object0).c) : false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b, this.c});
        }
    }

    private static final LruCache a;
    private static final Comparator b;

    static {
        FontProvider.a = new LruCache(2);
        FontProvider.b = (byte[] arr_b, byte[] arr_b1) -> {
            if(arr_b.length != arr_b1.length) {
                return arr_b.length - arr_b1.length;
            }
            for(int v = 0; v < arr_b.length; ++v) {
                int v1 = arr_b[v];
                int v2 = arr_b1[v];
                if(v1 != v2) {
                    return v1 - v2;
                }
            }
            return 0;
        };
    }

    @VisibleForTesting
    static void b() {
        FontProvider.a.evictAll();
    }

    private static List c(Signature[] arr_signature) {
        List list0 = new ArrayList();
        for(int v = 0; v < arr_signature.length; ++v) {
            list0.add(arr_signature[v].toByteArray());
        }
        return list0;
    }

    private static boolean d(List list0, List list1) {
        if(list0.size() != list1.size()) {
            return false;
        }
        for(int v = 0; v < list0.size(); ++v) {
            if(!Arrays.equals(((byte[])list0.get(v)), ((byte[])list1.get(v)))) {
                return false;
            }
        }
        return true;
    }

    private static List e(FontRequest fontRequest0, Resources resources0) {
        return fontRequest0.b() == null ? FontResourcesParserCompat.c(resources0, fontRequest0.c()) : fontRequest0.b();
    }

    static FontFamilyResult f(Context context0, List list0, CancellationSignal cancellationSignal0) throws PackageManager.NameNotFoundException {
        Trace.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                FontRequest fontRequest0 = (FontRequest)list0.get(v1);
                ProviderInfo providerInfo0 = FontProvider.g(context0.getPackageManager(), fontRequest0, context0.getResources());
                if(providerInfo0 == null) {
                    return FontFamilyResult.b(1, null);
                }
                arrayList0.add(FontProvider.i(context0, fontRequest0, providerInfo0.authority, cancellationSignal0));
            }
            return FontFamilyResult.a(0, arrayList0);
        }
        finally {
            Trace.f();
        }
    }

    @VisibleForTesting
    static ProviderInfo g(PackageManager packageManager0, FontRequest fontRequest0, Resources resources0) throws PackageManager.NameNotFoundException {
        String s;
        Trace.c("FontProvider.getProvider");
        try {
            List list0 = FontProvider.e(fontRequest0, resources0);
            ProviderCacheKey fontProvider$ProviderCacheKey0 = new ProviderCacheKey(fontRequest0.f(), fontRequest0.g(), list0);
            ProviderInfo providerInfo0 = (ProviderInfo)FontProvider.a.get(fontProvider$ProviderCacheKey0);
            if(providerInfo0 != null) {
                return providerInfo0;
            }
            s = fontRequest0.f();
            ProviderInfo providerInfo1 = packageManager0.resolveContentProvider(s, 0);
            if(providerInfo1 != null) {
                if(!providerInfo1.packageName.equals(fontRequest0.g())) {
                    throw new PackageManager.NameNotFoundException("Found content provider " + s + ", but package was not " + fontRequest0.g());
                }
                List list1 = FontProvider.c(packageManager0.getPackageInfo(providerInfo1.packageName, 0x40).signatures);
                Collections.sort(list1, FontProvider.b);
                for(int v1 = 0; v1 < list0.size(); ++v1) {
                    ArrayList arrayList0 = new ArrayList(((Collection)list0.get(v1)));
                    Collections.sort(arrayList0, FontProvider.b);
                    if(FontProvider.d(list1, arrayList0)) {
                        FontProvider.a.put(fontProvider$ProviderCacheKey0, providerInfo1);
                        return providerInfo1;
                    }
                }
                return null;
            }
        }
        finally {
            Trace.f();
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + s);
    }

    // 检测为 Lambda 实现
    private static int h(byte[] arr_b, byte[] arr_b1) [...]

    @VisibleForTesting
    static FontInfo[] i(Context context0, FontRequest fontRequest0, String s, CancellationSignal cancellationSignal0) {
        Uri uri2;
        ArrayList arrayList2;
        Cursor cursor0;
        Trace.c("FontProvider.query");
        try {
            ArrayList arrayList0 = new ArrayList();
            Uri uri0 = new Uri.Builder().scheme("content").authority(s).build();
            Uri uri1 = new Uri.Builder().scheme("content").authority(s).appendPath("file").build();
            ContentQueryWrapper fontProvider$ContentQueryWrapper0 = b.a(context0, uri0);
            try {
                Trace.c("ContentQueryWrapper.query");
                try {
                    cursor0 = fontProvider$ContentQueryWrapper0.a(uri0, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{fontRequest0.h()}, null, cancellationSignal0);
                }
                catch(Throwable throwable0) {
                    Trace.f();
                    throw throwable0;
                }
                Trace.f();
                if(cursor0 != null && cursor0.getCount() > 0) {
                    int v2 = cursor0.getColumnIndex("result_code");
                    ArrayList arrayList1 = new ArrayList();
                    int v3 = cursor0.getColumnIndex("_id");
                    int v4 = cursor0.getColumnIndex("file_id");
                    int v5 = cursor0.getColumnIndex("font_ttc_index");
                    int v6 = cursor0.getColumnIndex("font_weight");
                    int v7 = cursor0.getColumnIndex("font_italic");
                    while(cursor0.moveToNext()) {
                        int v8 = v2 == -1 ? 0 : cursor0.getInt(v2);
                        int v9 = v5 == -1 ? 0 : cursor0.getInt(v5);
                        if(v4 == -1) {
                            arrayList2 = arrayList1;
                            uri2 = ContentUris.withAppendedId(uri0, cursor0.getLong(v3));
                        }
                        else {
                            arrayList2 = arrayList1;
                            uri2 = ContentUris.withAppendedId(uri1, cursor0.getLong(v4));
                        }
                        arrayList1 = arrayList2;
                        arrayList1.add(FontInfo.a(uri2, v9, (v6 == -1 ? 400 : cursor0.getInt(v6)), v7 != -1 && cursor0.getInt(v7) == 1, v8));
                    }
                    arrayList0 = arrayList1;
                }
            }
            finally {
                if(cursor0 != null) {
                    cursor0.close();
                }
                fontProvider$ContentQueryWrapper0.close();
            }
            return (FontInfo[])arrayList0.toArray(new FontInfo[0]);
        }
        finally {
            Trace.f();
        }
    }
}

