package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;

public final class zzib extends zzbd {
    public final int zzc;
    @Nullable
    public final String zzd;
    public final int zze;
    @Nullable
    public final zzab zzf;
    public final int zzg;
    @Nullable
    public final zzug zzh;
    final boolean zzi;

    static {
    }

    private zzib(int v, Throwable throwable0, int v1) {
        this(v, throwable0, null, v1, null, -1, null, 4, false);
    }

    private zzib(int v, @Nullable Throwable throwable0, @Nullable String s, int v1, @Nullable String s1, int v2, @Nullable zzab zzab0, int v3, boolean z) {
        String s2;
        String s4;
        switch(v) {
            case 0: {
                s2 = "Source error";
                break;
            }
            case 1: {
                String s3 = String.valueOf(zzab0);
                switch(v3) {
                    case 0: {
                        s4 = "NO";
                        break;
                    }
                    case 1: {
                        s4 = "NO_UNSUPPORTED_TYPE";
                        break;
                    }
                    case 2: {
                        s4 = "NO_UNSUPPORTED_DRM";
                        break;
                    }
                    case 3: {
                        s4 = "NO_EXCEEDS_CAPABILITIES";
                        break;
                    }
                    case 4: {
                        s4 = "YES";
                        break;
                    }
                    default: {
                        throw new IllegalStateException();
                    }
                }
                s2 = s1 + " error, index=" + v2 + ", format=" + s3 + ", format_supported=" + s4;
                break;
            }
            default: {
                s2 = "Unexpected runtime error";
            }
        }
        if(!TextUtils.isEmpty(null)) {
            s2 = s2 + ": null";
        }
        this(s2, throwable0, v1, v, s1, v2, zzab0, v3, null, SystemClock.elapsedRealtime(), z);
    }

    private zzib(String s, @Nullable Throwable throwable0, int v, int v1, @Nullable String s1, int v2, @Nullable zzab zzab0, int v3, @Nullable zzug zzug0, long v4, boolean z) {
        super(s, throwable0, v, Bundle.EMPTY, v4);
        boolean z2;
        int v5;
        boolean z1 = false;
        if(z) {
            v5 = v1;
            if(v5 == 1) {
                v5 = 1;
                z2 = true;
            }
            else {
                z2 = false;
            }
        }
        else {
            v5 = v1;
            z2 = true;
        }
        zzcw.zzd(z2);
        if(throwable0 != null) {
            z1 = true;
        }
        zzcw.zzd(z1);
        this.zzc = v5;
        this.zzd = s1;
        this.zze = v2;
        this.zzf = zzab0;
        this.zzg = v3;
        this.zzh = zzug0;
        this.zzi = z;
    }

    @CheckResult
    final zzib zza(@Nullable zzug zzug0) {
        return new zzib(this.getMessage(), this.getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzug0, this.zzb, this.zzi);
    }

    public static zzib zzb(Throwable throwable0, String s, int v, @Nullable zzab zzab0, int v1, boolean z, int v2) {
        return zzab0 == null ? new zzib(1, throwable0, null, v2, s, v, null, 4, z) : new zzib(1, throwable0, null, v2, s, v, zzab0, v1, z);
    }

    public static zzib zzc(IOException iOException0, int v) {
        return new zzib(0, iOException0, v);
    }

    public static zzib zzd(RuntimeException runtimeException0, int v) {
        return new zzib(2, runtimeException0, v);
    }
}

