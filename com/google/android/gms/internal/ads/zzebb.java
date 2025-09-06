package com.google.android.gms.internal.ads;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzm;

final class zzebb extends zzebx {
    private final Activity zza;
    @Nullable
    private final zzm zzb;
    @Nullable
    private final String zzc;
    @Nullable
    private final String zzd;

    zzebb(Activity activity0, zzm zzm0, String s, String s1, zzeba zzeba0) {
        this.zza = activity0;
        this.zzb = zzm0;
        this.zzc = s;
        this.zzd = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzebx) {
            Activity activity0 = ((zzebx)object0).zza();
            if(this.zza.equals(activity0)) {
                zzm zzm0 = this.zzb;
                if(zzm0 != null) {
                    if(zzm0.equals(((zzebx)object0).zzb())) {
                    label_10:
                        String s = this.zzc;
                        if(s == null) {
                            if(((zzebx)object0).zzc() == null) {
                                return this.zzd == null ? ((zzebx)object0).zzd() == null : this.zzd.equals(((zzebx)object0).zzd());
                            }
                        }
                        else if(s.equals(((zzebx)object0).zzc())) {
                            return this.zzd == null ? ((zzebx)object0).zzd() == null : this.zzd.equals(((zzebx)object0).zzd());
                        }
                    }
                }
                else if(((zzebx)object0).zzb() == null) {
                    goto label_10;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zza.hashCode();
        int v1 = 0;
        int v2 = this.zzb == null ? 0 : this.zzb.hashCode();
        int v3 = this.zzc == null ? 0 : this.zzc.hashCode();
        String s = this.zzd;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        return "OfflineUtilsParams{activity=" + this.zza.toString() + ", adOverlay=" + this.zzb + ", gwsQueryId=" + this.zzc + ", uri=" + this.zzd + "}";
    }

    @Override  // com.google.android.gms.internal.ads.zzebx
    public final Activity zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzebx
    @Nullable
    public final zzm zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzebx
    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzebx
    @Nullable
    public final String zzd() {
        return this.zzd;
    }
}

