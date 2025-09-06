package com.bytedance.sdk.openadsdk.ub.ReZ;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;

public class PjT {
    private final SharedPreferences PjT;

    public PjT(Context context0) {
        this.PjT = context0.getSharedPreferences("pag_monitor_record", 0);
    }

    public long PjT() {
        return this.PjT.getLong("last_upload_time", 0L);
    }

    public void PjT(long v) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.PjT.edit();
        sharedPreferences$Editor0.putLong("last_upload_time", v);
        sharedPreferences$Editor0.apply();
    }
}

