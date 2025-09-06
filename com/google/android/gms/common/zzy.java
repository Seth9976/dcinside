package com.google.android.gms.common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzak;
import java.util.List;

final class zzy {
    @Nullable
    private String zza;
    private long zzb;
    private zzak zzc;
    private zzak zzd;

    zzy() {
        this.zza = null;
        this.zzb = -1L;
        this.zzc = zzak.zzl();
        this.zzd = zzak.zzl();
    }

    final zzy zza(long v) {
        this.zzb = v;
        return this;
    }

    final zzy zzb(List list0) {
        Preconditions.checkNotNull(list0);
        this.zzd = zzak.zzk(list0);
        return this;
    }

    final zzy zzc(List list0) {
        Preconditions.checkNotNull(list0);
        this.zzc = zzak.zzk(list0);
        return this;
    }

    final zzy zzd(String s) {
        this.zza = s;
        return this;
    }

    final zzaa zze() {
        if(this.zza == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if(this.zzb < 0L) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if(this.zzc.isEmpty() && this.zzd.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new zzaa(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}

