package com.google.android.gms.internal.ads;

import android.os.IBinder;
import androidx.annotation.Nullable;

final class zzfrv extends zzfsy {
    private final IBinder zza;
    @Nullable
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    @Nullable
    private final String zzf;

    zzfrv(IBinder iBinder0, String s, int v, float f, int v1, int v2, String s1, int v3, String s2, String s3, String s4, zzfru zzfru0) {
        this.zza = iBinder0;
        this.zzb = s;
        this.zzc = v;
        this.zzd = f;
        this.zze = v3;
        this.zzf = s3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzfsy) {
            IBinder iBinder0 = ((zzfsy)object0).zzf();
            if(this.zza.equals(iBinder0)) {
                String s = this.zzb;
                if(s != null) {
                    if(s.equals(((zzfsy)object0).zzh())) {
                    label_10:
                        int v = ((zzfsy)object0).zzc();
                        if(this.zzc == v) {
                            int v1 = Float.floatToIntBits(((zzfsy)object0).zza());
                            if(Float.floatToIntBits(this.zzd) == v1) {
                                ((zzfsy)object0).zzb();
                                ((zzfsy)object0).zzd();
                                ((zzfsy)object0).zzj();
                                int v2 = ((zzfsy)object0).zze();
                                if(this.zze == v2) {
                                    ((zzfsy)object0).zzi();
                                    String s1 = this.zzf;
                                    if(s1 != null) {
                                        if(s1.equals(((zzfsy)object0).zzg())) {
                                            ((zzfsy)object0).zzk();
                                            return true;
                                        }
                                    }
                                    else if(((zzfsy)object0).zzg() == null) {
                                        ((zzfsy)object0).zzk();
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
                else if(((zzfsy)object0).zzh() == null) {
                    goto label_10;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((this.zza.hashCode() ^ 1000003) * 1000003 ^ (this.zzb == null ? 0 : this.zzb.hashCode())) * 1000003 ^ this.zzc) * 1000003 ^ Float.floatToIntBits(this.zzd);
        int v2 = this.zze;
        String s = this.zzf;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 * 0x5AF15351 ^ v2) * 0xD5009D89 ^ v) * 1000003;
    }

    @Override
    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.zza.toString() + ", appId=" + this.zzb + ", layoutGravity=" + this.zzc + ", layoutVerticalMargin=" + this.zzd + ", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=" + this.zze + ", deeplinkUrl=null, adFieldEnifd=" + this.zzf + ", thirdPartyAuthCallerId=null}";
    }

    @Override  // com.google.android.gms.internal.ads.zzfsy
    public final float zza() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsy
    public final int zzb() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsy
    public final int zzc() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsy
    public final int zzd() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsy
    public final int zze() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsy
    public final IBinder zzf() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsy
    @Nullable
    public final String zzg() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsy
    @Nullable
    public final String zzh() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsy
    @Nullable
    public final String zzi() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsy
    @Nullable
    public final String zzj() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsy
    @Nullable
    public final String zzk() {
        return null;
    }
}

