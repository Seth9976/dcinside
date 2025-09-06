package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class zzfq extends zzfr {
    private final AssetManager zza;
    @Nullable
    private Uri zzb;
    @Nullable
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzfq(Context context0) {
        super(false);
        this.zza = context0.getAssets();
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) throws zzfp {
        int v3;
        if(v1 == 0) {
            return 0;
        }
        long v2 = this.zzd;
        if(v2 != 0L) {
            try {
                if(v2 != -1L) {
                    v1 = (int)Math.min(v2, v1);
                }
                v3 = this.zzc.read(arr_b, v, v1);
            }
            catch(IOException iOException0) {
                throw new zzfp(iOException0, 2000);
            }
            if(v3 == -1) {
                return -1;
            }
            long v4 = this.zzd;
            if(v4 != -1L) {
                this.zzd = v4 - ((long)v3);
            }
            this.zzg(v3);
            return v3;
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgd0) throws zzfp {
        try {
            this.zzb = zzgd0.zza;
            String s = zzgd0.zza.getPath();
            if(s == null) {
                throw null;
            }
            if(s.startsWith("/android_asset/")) {
                s = s.substring(15);
            }
            else if(s.startsWith("/")) {
                s = s.substring(1);
            }
            this.zzi(zzgd0);
            InputStream inputStream0 = this.zza.open(s, 1);
            this.zzc = inputStream0;
            if(inputStream0.skip(zzgd0.zze) < zzgd0.zze) {
                throw new zzfp(null, 2008);
            }
            long v = zzgd0.zzf;
            if(v == -1L) {
                long v1 = (long)this.zzc.available();
                this.zzd = v1;
                if(v1 == 0x7FFFFFFFL) {
                    this.zzd = -1L;
                }
            }
            else {
                this.zzd = v;
            }
            goto label_28;
        }
        catch(zzfp zzfp0) {
        }
        catch(IOException iOException0) {
            throw new zzfp(iOException0, (iOException0 instanceof FileNotFoundException ? 2005 : 2000));
        }
        throw zzfp0;
    label_28:
        this.zze = true;
        this.zzj(zzgd0);
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws zzfp {
        try {
            this.zzb = null;
            InputStream inputStream0 = this.zzc;
            if(inputStream0 != null) {
                inputStream0.close();
            }
        }
        catch(IOException iOException0) {
            throw new zzfp(iOException0, 2000);
        }
        finally {
            this.zzc = null;
            if(this.zze) {
                this.zze = false;
                this.zzh();
            }
        }
    }
}

