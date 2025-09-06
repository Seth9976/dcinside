package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

public class zzbc extends IOException {
    public final boolean zza;
    public final int zzb;

    protected zzbc(@Nullable String s, @Nullable Throwable throwable0, boolean z, int v) {
        super(s, throwable0);
        this.zza = z;
        this.zzb = v;
    }

    @Override
    @Nullable
    public final String getMessage() {
        return super.getMessage() + " {contentIsMalformed=" + this.zza + ", dataType=" + this.zzb + "}";
    }

    public static zzbc zza(@Nullable String s, @Nullable Throwable throwable0) {
        return new zzbc(s, throwable0, true, 1);
    }

    public static zzbc zzb(@Nullable String s, @Nullable Throwable throwable0) {
        return new zzbc(s, throwable0, true, 0);
    }

    public static zzbc zzc(@Nullable String s) {
        return new zzbc(s, null, false, 1);
    }
}

