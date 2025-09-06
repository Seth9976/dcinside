package com.coupang.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class CoupangAdsInitializer extends ContentProvider {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final a a;
    @m
    private static com.coupang.ads.a b;

    static {
        CoupangAdsInitializer.a = new a(null);
    }

    private final com.coupang.ads.a a(Context context0) {
        com.coupang.ads.a a0 = CoupangAdsInitializer.b;
        if(a0 == null) {
            a0 = new com.coupang.ads.a(context0);
            CoupangAdsInitializer.b = a0;
        }
        L.m(a0);
        return a0;
    }

    @Override  // android.content.ContentProvider
    public int delete(@l Uri uri0, @m String s, @m String[] arr_s) {
        L.p(uri0, "uri");
        return 0;
    }

    @Override  // android.content.ContentProvider
    @m
    public String getType(@l Uri uri0) {
        L.p(uri0, "uri");
        return null;
    }

    @Override  // android.content.ContentProvider
    @m
    public Uri insert(@l Uri uri0, @m ContentValues contentValues0) {
        L.p(uri0, "uri");
        return null;
    }

    @Override  // android.content.ContentProvider
    public boolean onCreate() {
        Log.d("CoupangAdsInitializer", "onCreate");
        Context context0 = this.getContext();
        if(context0 == null) {
            return false;
        }
        this.a(context0);
        return true;
    }

    @Override  // android.content.ContentProvider
    @m
    public Cursor query(@l Uri uri0, @m String[] arr_s, @m String s, @m String[] arr_s1, @m String s1) {
        L.p(uri0, "uri");
        return null;
    }

    @Override  // android.content.ContentProvider
    public int update(@l Uri uri0, @m ContentValues contentValues0, @m String s, @m String[] arr_s) {
        L.p(uri0, "uri");
        return 0;
    }
}

