package com.google.android.gms.appset;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AppSetIdInfo {
    @Retention(RetentionPolicy.SOURCE)
    public @interface Scope {
    }

    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;
    @NonNull
    private final String zza;
    private final int zzb;

    public AppSetIdInfo(@NonNull String s, int v) {
        this.zza = s;
        this.zzb = v;
    }

    @NonNull
    public String getId() {
        return this.zza;
    }

    public int getScope() {
        return this.zzb;
    }
}

