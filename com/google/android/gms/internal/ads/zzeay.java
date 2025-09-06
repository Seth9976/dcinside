package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

final class zzeay extends zzebc {
    @Nullable
    private final String zza;
    private final String zzb;
    @Nullable
    private final Drawable zzc;

    zzeay(@Nullable String s, String s1, @Nullable Drawable drawable0) {
        this.zza = s;
        if(s1 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.zzb = s1;
        this.zzc = drawable0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzebc) {
            String s = this.zza;
            if(s != null) {
                if(s.equals(((zzebc)object0).zzb())) {
                label_8:
                    String s1 = ((zzebc)object0).zzc();
                    if(this.zzb.equals(s1)) {
                        return this.zzc == null ? ((zzebc)object0).zza() == null : this.zzc.equals(((zzebc)object0).zza());
                    }
                }
            }
            else if(((zzebc)object0).zzb() == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.zza == null ? 0 : this.zza.hashCode();
        int v2 = this.zzb.hashCode();
        Drawable drawable0 = this.zzc;
        if(drawable0 != null) {
            v = drawable0.hashCode();
        }
        return ((v1 ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "OfflineAdAssets{advertiserName=" + this.zza + ", imageUrl=" + this.zzb + ", icon=" + this.zzc + "}";
    }

    @Override  // com.google.android.gms.internal.ads.zzebc
    @Nullable
    final Drawable zza() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzebc
    @Nullable
    final String zzb() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzebc
    final String zzc() {
        return this.zzb;
    }
}

