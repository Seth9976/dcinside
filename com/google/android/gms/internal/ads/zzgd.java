package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import j..util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgd {
    public final Uri zza;
    public final int zzb;
    @Nullable
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;
    public static final int zzh;

    static {
        zzas.zzb("media3.datasource");
    }

    private zzgd(Uri uri0, long v, int v1, @Nullable byte[] arr_b, Map map0, long v2, long v3, @Nullable String s, int v4, @Nullable Object object0) {
        boolean z = false;
        zzcw.zzd(v2 >= 0L);
        zzcw.zzd(v2 >= 0L);
        if(v3 > 0L) {
            z = true;
        }
        else if(v3 == -1L) {
            v3 = -1L;
            z = true;
        }
        zzcw.zzd(z);
        uri0.getClass();
        this.zza = uri0;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = DesugarCollections.unmodifiableMap(new HashMap(map0));
        this.zze = v2;
        this.zzf = v3;
        this.zzg = v4;
    }

    zzgd(Uri uri0, long v, int v1, byte[] arr_b, Map map0, long v2, long v3, String s, int v4, Object object0, zzgc zzgc0) {
        this(uri0, 0L, 1, null, map0, v2, v3, null, v4, null);
    }

    @Deprecated
    public zzgd(Uri uri0, long v, long v1, @Nullable String s) {
        this(uri0, 0L, 1, null, Collections.emptyMap(), v, v1, null, 0, null);
    }

    // 去混淆评级： 低(40)
    @Override
    public final String toString() {
        return "DataSpec[GET " + this.zza.toString() + ", " + this.zze + ", " + this.zzf + ", null, " + this.zzg + "]";
    }

    public final zzgb zza() {
        return new zzgb(this, null);
    }

    public final boolean zzb(int v) {
        return (this.zzg & v) == v;
    }
}

