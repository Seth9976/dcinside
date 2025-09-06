package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;

final class zzkw implements zzrb, zzur {
    final zzla zza;
    private final zzky zzb;

    public zzkw(zzla zzla0, zzky zzky0) {
        this.zza = zzla0;
        super();
        this.zzb = zzky0;
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zzaf(int v, @Nullable zzug zzug0, zzuc zzuc0) {
        Pair pair0 = this.zzf(0, zzug0);
        if(pair0 != null) {
            this.zza.zzi.zzh(new zzku(this, pair0, zzuc0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zzag(int v, @Nullable zzug zzug0, zztx zztx0, zzuc zzuc0) {
        Pair pair0 = this.zzf(0, zzug0);
        if(pair0 != null) {
            zzks zzks0 = new zzks(this, pair0, zztx0, zzuc0);
            this.zza.zzi.zzh(zzks0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zzah(int v, @Nullable zzug zzug0, zztx zztx0, zzuc zzuc0) {
        Pair pair0 = this.zzf(0, zzug0);
        if(pair0 != null) {
            zzkv zzkv0 = new zzkv(this, pair0, zztx0, zzuc0);
            this.zza.zzi.zzh(zzkv0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zzai(int v, @Nullable zzug zzug0, zztx zztx0, zzuc zzuc0, IOException iOException0, boolean z) {
        Pair pair0 = this.zzf(0, zzug0);
        if(pair0 != null) {
            zzkr zzkr0 = new zzkr(this, pair0, zztx0, zzuc0, iOException0, z);
            this.zza.zzi.zzh(zzkr0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zzaj(int v, @Nullable zzug zzug0, zztx zztx0, zzuc zzuc0) {
        Pair pair0 = this.zzf(0, zzug0);
        if(pair0 != null) {
            zzkt zzkt0 = new zzkt(this, pair0, zztx0, zzuc0);
            this.zza.zzi.zzh(zzkt0);
        }
    }

    @Nullable
    private final Pair zzf(int v, @Nullable zzug zzug0) {
        zzug zzug2;
        zzug zzug1 = null;
        if(zzug0 != null) {
            zzky zzky0 = this.zzb;
            for(int v1 = 0; true; ++v1) {
                zzug2 = null;
                if(v1 >= zzky0.zzc.size()) {
                    break;
                }
                if(((zzug)zzky0.zzc.get(v1)).zzd == zzug0.zzd) {
                    zzug2 = zzug0.zza(Pair.create(zzky0.zzb, zzug0.zza));
                    break;
                }
            }
            if(zzug2 == null) {
                return null;
            }
            zzug1 = zzug2;
        }
        return Pair.create(this.zzb.zzd, zzug1);
    }
}

