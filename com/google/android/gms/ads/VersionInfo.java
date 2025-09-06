package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import java.util.Locale;

public class VersionInfo {
    protected final int zza;
    protected final int zzb;
    protected final int zzc;

    public VersionInfo(int v, int v1, int v2) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
    }

    public int getMajorVersion() {
        return this.zza;
    }

    public int getMicroVersion() {
        return this.zzc;
    }

    public int getMinorVersion() {
        return this.zzb;
    }

    @Override
    @NonNull
    public String toString() {
        return String.format(Locale.US, "%d.%d.%d", this.zza, this.zzb, this.zzc);
    }
}

