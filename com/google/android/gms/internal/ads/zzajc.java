package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzajc {
    public final boolean zza;
    @Nullable
    public final String zzb;
    public final zzads zzc;
    public final int zzd;
    @Nullable
    public final byte[] zze;

    public zzajc(boolean z, @Nullable String s, int v, byte[] arr_b, int v1, int v2, @Nullable byte[] arr_b1) {
        int v3 = 1;
        zzcw.zzd(((boolean)((v == 0 ? 1 : 0) ^ (arr_b1 == null ? 1 : 0))));
        this.zza = z;
        this.zzb = s;
        this.zzd = v;
        this.zze = arr_b1;
        if(s != null) {
            switch(s) {
                case "cbc1": 
                case "cbcs": {
                    v3 = 2;
                    break;
                }
                case "cenc": 
                case "cens": {
                    break;
                }
                default: {
                    zzdo.zzf("TrackEncryptionBox", "Unsupported protection scheme type \'" + s + "\'. Assuming AES-CTR crypto mode.");
                }
            }
        }
        this.zzc = new zzads(v3, arr_b, v1, v2);
    }
}

