package com.bytedance.sdk.openadsdk.cr.PjT;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.component.cz.PjT.Zh.Zh.Zh;
import com.bytedance.sdk.openadsdk.multipro.PjT;

public class JQp implements PjT {
    private final Zh PjT;

    public JQp(Zh zh0) {
        this.PjT = zh0;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public int PjT(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        return 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public int PjT(Uri uri0, String s, String[] arr_s) {
        return 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public Cursor PjT(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public Uri PjT(Uri uri0, ContentValues contentValues0) {
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public String PjT() {
        return this.PjT == null ? null : "ad_log_event";
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public String PjT(Uri uri0) {
        return this.PjT == null ? null : this.PjT.PjT(uri0);
    }
}

