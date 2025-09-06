package com.kakao.adfit;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.kakao.adfit.m.A;
import kotlin.jvm.internal.L;

public final class AdFitSdkInitProvider extends ContentProvider {
    @Override  // android.content.ContentProvider
    public int delete(Uri uri0, String s, String[] arr_s) {
        L.p(uri0, "uri");
        return 0;
    }

    @Override  // android.content.ContentProvider
    public String getType(Uri uri0) {
        L.p(uri0, "uri");
        return null;
    }

    @Override  // android.content.ContentProvider
    public Uri insert(Uri uri0, ContentValues contentValues0) {
        L.p(uri0, "uri");
        return null;
    }

    @Override  // android.content.ContentProvider
    public boolean onCreate() {
        Context context0 = this.getContext();
        if(context0 != null) {
            A.a.b(context0);
            return true;
        }
        return false;
    }

    @Override  // android.content.ContentProvider
    public Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        L.p(uri0, "uri");
        return null;
    }

    @Override  // android.content.ContentProvider
    public int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        L.p(uri0, "uri");
        return 0;
    }
}

