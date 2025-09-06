package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public final class zzfw extends zzfr {
    @Nullable
    private zzgd zza;
    @Nullable
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfw() {
        super(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) {
        if(v1 == 0) {
            return 0;
        }
        int v2 = this.zzd;
        if(v2 == 0) {
            return -1;
        }
        int v3 = Math.min(v1, v2);
        System.arraycopy(this.zzb, this.zzc, arr_b, v, v3);
        this.zzc += v3;
        this.zzd -= v3;
        this.zzg(v3);
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgd0) throws IOException {
        this.zzi(zzgd0);
        this.zza = zzgd0;
        Uri uri0 = zzgd0.zza.normalizeScheme();
        String s = uri0.getScheme();
        zzcw.zze("data".equals(s), "Unsupported scheme: " + s);
        String[] arr_s = uri0.getSchemeSpecificPart().split(",", -1);
        if(arr_s.length != 2) {
            throw zzbc.zzb(("Unexpected URI format: " + uri0), null);
        }
        String s1 = arr_s[1];
        if(arr_s[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(s1, 0);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw zzbc.zzb(("Error while parsing Base64 encoded string: " + s1), illegalArgumentException0);
            }
        }
        else {
            this.zzb = URLDecoder.decode(s1, "US-ASCII").getBytes(StandardCharsets.UTF_8);
        }
        long v = zzgd0.zze;
        int v1 = this.zzb.length;
        if(v <= ((long)v1)) {
            this.zzc = (int)v;
            int v2 = v1 - ((int)v);
            this.zzd = v2;
            long v3 = zzgd0.zzf;
            if(v3 != -1L) {
                this.zzd = (int)Math.min(v2, v3);
            }
            this.zzj(zzgd0);
            return zzgd0.zzf == -1L ? ((long)this.zzd) : zzgd0.zzf;
        }
        this.zzb = null;
        throw new zzfz(2008);
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zza == null ? null : this.zza.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzd() {
        if(this.zzb != null) {
            this.zzb = null;
            this.zzh();
        }
        this.zza = null;
    }
}

