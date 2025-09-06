package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

class zzfrd {
    static final String zza;
    final zzfrc zzb;
    final zzfrb zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    static {
        zzfrd.zza = "00000000-0000-0000-0000-000000000000";
    }

    zzfrd(Context context0, String s, String s1, String s2) {
        this.zzb = zzfrc.zzb(context0);
        this.zzc = zzfrb.zza(context0);
        this.zzd = s;
        this.zze = s + "_3p";
        this.zzf = s1;
        this.zzg = s1 + "_3p";
        this.zzh = s2;
    }

    // 去混淆评级： 低(20)
    final long zza(boolean z) {
        return z ? this.zzb.zza(this.zzg, -1L) : this.zzb.zza(this.zzf, -1L);
    }

    final zzfra zzb(@Nullable String s, @Nullable String s1, long v, boolean z) throws IOException {
        boolean z1 = true;
        if(s != null) {
            try {
                UUID.fromString(s);
            }
            catch(IllegalArgumentException unused_ex) {
                return new zzfra();
            }
            if(s.equals("00000000-0000-0000-0000-000000000000")) {
                return new zzfra();
            }
            String s2 = this.zze(true);
            String s3 = this.zzb.zzc("paid_3p_hash_key", null);
            if(s2 != null && s3 != null && !s2.equals(this.zzh(s, s1, s3))) {
                return this.zzc(s, s1);
            }
        }
        if(s == null) {
            z1 = false;
        }
        long v1 = System.currentTimeMillis();
        if(v1 < 0L) {
            throw new IllegalStateException(this.zzh + ": Invalid negative current timestamp. Updating PAID failed");
        }
        long v2 = this.zza(z1);
        if(v2 != -1L) {
            if(v1 < v2) {
                this.zzb.zzd((z1 ? this.zzg : this.zzf), v1);
            }
            else if(v1 >= v2 + v) {
                return this.zzc(s, s1);
            }
        }
        String s4 = this.zze(z1);
        return s4 != null || z ? new zzfra(s4, this.zza(z1)) : this.zzc(s, s1);
    }

    final zzfra zzc(String s, String s1) throws IOException {
        if(s == null) {
            return this.zzd("62a1ce9c-0124-4b78-8166-3c9882ca5a75", false);
        }
        this.zzb.zzd("paid_3p_hash_key", "3f5a6f04-61a2-4a7c-b593-3545990b228d");
        return this.zzd(this.zzh(s, s1, "3f5a6f04-61a2-4a7c-b593-3545990b228d"), true);
    }

    final zzfra zzd(String s, boolean z) throws IOException {
        long v = System.currentTimeMillis();
        if(v < 0L) {
            throw new IllegalStateException(this.zzh + ": Invalid negative current timestamp. Updating PAID failed");
        }
        this.zzb.zzd((z ? this.zzg : this.zzf), v);
        this.zzb.zzd((z ? this.zze : this.zzd), s);
        return new zzfra(s, v);
    }

    // 去混淆评级： 低(20)
    final String zze(boolean z) {
        return z ? this.zzb.zzc(this.zze, null) : this.zzb.zzc(this.zzd, null);
    }

    final void zzf(boolean z) throws IOException {
        this.zzb.zze((z ? this.zzg : this.zzf));
        this.zzb.zze((z ? this.zze : this.zzd));
    }

    final boolean zzg(boolean z) {
        return this.zzb.zzg(this.zzd);
    }

    private final String zzh(String s, String s1, String s2) {
        if(s1 != null && s2 != null) {
            return UUID.nameUUIDFromBytes((s + s1 + s2).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.zzh);
        stringBuilder0.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        String s3 = "not null";
        stringBuilder0.append((s1 == null ? "null" : "not null"));
        stringBuilder0.append(", hashKey is ");
        if(s2 == null) {
            s3 = "null";
        }
        stringBuilder0.append(s3);
        throw new IllegalArgumentException(stringBuilder0.toString());
    }
}

