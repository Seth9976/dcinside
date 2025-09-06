package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class GmsLogger {
    private final String zza;
    @Nullable
    private final String zzb;

    @KeepForSdk
    public GmsLogger(@NonNull String s) {
        this(s, null);
    }

    @KeepForSdk
    public GmsLogger(@NonNull String s, @Nullable String s1) {
        Preconditions.checkNotNull(s, "log tag cannot be null");
        Object[] arr_object = new Object[2];
        boolean z = false;
        arr_object[0] = s;
        arr_object[1] = 23;
        if(s.length() <= 23) {
            z = true;
        }
        Preconditions.checkArgument(z, "tag \"%s\" is longer than the %d character maximum", arr_object);
        this.zza = s;
        if(s1 == null || s1.length() <= 0) {
            s1 = null;
        }
        this.zzb = s1;
    }

    @KeepForSdk
    public boolean canLog(int v) {
        return Log.isLoggable(this.zza, v);
    }

    @KeepForSdk
    public boolean canLogPii() {
        return false;
    }

    @KeepForSdk
    public void d(@NonNull String s, @NonNull String s1) {
        if(this.canLog(3)) {
            Log.d(s, this.zza(s1));
        }
    }

    @KeepForSdk
    public void d(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
        if(this.canLog(3)) {
            Log.d(s, this.zza(s1), throwable0);
        }
    }

    @KeepForSdk
    public void e(@NonNull String s, @NonNull String s1) {
        if(this.canLog(6)) {
            Log.e(s, this.zza(s1));
        }
    }

    @KeepForSdk
    public void e(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
        if(this.canLog(6)) {
            Log.e(s, this.zza(s1), throwable0);
        }
    }

    @KeepForSdk
    public void efmt(@NonNull String s, @NonNull String s1, @NonNull Object[] arr_object) {
        if(this.canLog(6)) {
            Log.e(s, this.zzb(s1, arr_object));
        }
    }

    @KeepForSdk
    public void i(@NonNull String s, @NonNull String s1) {
        if(this.canLog(4)) {
            Log.i(s, this.zza(s1));
        }
    }

    @KeepForSdk
    public void i(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
        if(this.canLog(4)) {
            Log.i(s, this.zza(s1), throwable0);
        }
    }

    @KeepForSdk
    public void pii(@NonNull String s, @NonNull String s1) {
    }

    @KeepForSdk
    public void pii(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
    }

    @KeepForSdk
    public void v(@NonNull String s, @NonNull String s1) {
        if(this.canLog(2)) {
            Log.v(s, this.zza(s1));
        }
    }

    @KeepForSdk
    public void v(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
        if(this.canLog(2)) {
            Log.v(s, this.zza(s1), throwable0);
        }
    }

    @KeepForSdk
    public void w(@NonNull String s, @NonNull String s1) {
        if(this.canLog(5)) {
            Log.w(s, this.zza(s1));
        }
    }

    @KeepForSdk
    public void w(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
        if(this.canLog(5)) {
            Log.w(s, this.zza(s1), throwable0);
        }
    }

    @KeepForSdk
    public void wfmt(@NonNull String s, @NonNull String s1, @NonNull Object[] arr_object) {
        if(this.canLog(5)) {
            String s2 = this.zzb(s1, arr_object);
            Log.w(this.zza, s2);
        }
    }

    @KeepForSdk
    public void wtf(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
        if(this.canLog(7)) {
            Log.e(s, this.zza(s1), throwable0);
            Log.wtf(s, this.zza(s1), throwable0);
        }
    }

    private final String zza(String s) {
        return this.zzb == null ? s : this.zzb + s;
    }

    private final String zzb(String s, Object[] arr_object) {
        String s1 = String.format(s, arr_object);
        return this.zzb == null ? s1 : this.zzb + s1;
    }
}

