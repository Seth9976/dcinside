package com.apm.insight;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONArray;

public final class b implements ICrashCallback, IOOMCallback {
    private IOOMCallback a;
    private ICrashCallback b;
    private String c;

    public b(String s, ICrashCallback iCrashCallback0) {
        this.c = s;
        this.b = iCrashCallback0;
    }

    public b(String s, IOOMCallback iOOMCallback0) {
        this.c = s;
        this.a = iOOMCallback0;
    }

    public final void a(@NonNull CrashType crashType0, @Nullable String s, @Nullable String s1, String s2) {
        if(this.b == null) {
            return;
        }
        d d0 = d.a(this.c);
        if(d0 != null && d0.a(s2, s1)) {
            this.b.onCrash(crashType0, s, null);
        }
    }

    public final void a(@NonNull CrashType crashType0, @Nullable String s, @Nullable Thread thread0, JSONArray jSONArray0) {
        if(this.b == null) {
            return;
        }
        if(jSONArray0 != null) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                if(TextUtils.equals(a.a(jSONArray0.optJSONObject(v), new String[]{"header", "aid"}), this.c)) {
                    this.b.onCrash(crashType0, s, thread0);
                }
            }
        }
    }

    public final void a(@NonNull CrashType crashType0, @Nullable Throwable throwable0, @Nullable Thread thread0, long v, JSONArray jSONArray0) {
        if(this.a == null) {
            return;
        }
        if(jSONArray0 != null) {
            for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                if(TextUtils.equals(a.a(jSONArray0.optJSONObject(v1), new String[]{"header", "aid"}), this.c)) {
                    this.a.onCrash(crashType0, throwable0, thread0, v);
                }
            }
        }
    }

    @Override  // com.apm.insight.ICrashCallback
    public final void onCrash(@NonNull CrashType crashType0, @Nullable String s, @Nullable Thread thread0) {
    }

    @Override  // com.apm.insight.IOOMCallback
    public final void onCrash(@NonNull CrashType crashType0, @Nullable Throwable throwable0, @Nullable Thread thread0, long v) {
    }
}

