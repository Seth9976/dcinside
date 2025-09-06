package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class zzfhh implements Runnable {
    private final List zza;
    private final zzfhk zzb;
    private String zzc;
    private zzfhm zzd;
    private String zze;
    private zzfbz zzf;
    private zze zzg;
    private Future zzh;
    private int zzi;

    zzfhh(zzfhk zzfhk0) {
        this.zza = new ArrayList();
        this.zzi = 2;
        this.zzd = zzfhm.zzb;
        this.zzb = zzfhk0;
    }

    @Override
    public final void run() {
        synchronized(this) {
            this.zzh();
        }
    }

    public final zzfhh zza(zzfgw zzfgw0) {
        synchronized(this) {
            if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
                zzfgw0.zzj();
                this.zza.add(zzfgw0);
                Future future0 = this.zzh;
                if(future0 != null) {
                    future0.cancel(false);
                }
                long v1 = (long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zziG)))));
                this.zzh = zzbzw.zzd.schedule(this, v1, TimeUnit.MILLISECONDS);
            }
            return this;
        }
    }

    public final zzfhh zzb(String s) {
        synchronized(this) {
            if(((Boolean)zzbee.zzc.zze()).booleanValue() && zzfhg.zze(s)) {
                this.zzc = s;
            }
            return this;
        }
    }

    public final zzfhh zzc(zze zze0) {
        synchronized(this) {
            if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
                this.zzg = zze0;
            }
            return this;
        }
    }

    public final zzfhh zzd(ArrayList arrayList0) {
        synchronized(this) {
            if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
                if(arrayList0.contains("banner") || arrayList0.contains("BANNER")) {
                    this.zzi = 3;
                }
                else if(arrayList0.contains("interstitial") || arrayList0.contains("INTERSTITIAL")) {
                    this.zzi = 4;
                }
                else if(arrayList0.contains("native") || arrayList0.contains("NATIVE")) {
                    this.zzi = 8;
                }
                else if(arrayList0.contains("rewarded") || arrayList0.contains("REWARDED")) {
                    this.zzi = 5;
                }
                else if(arrayList0.contains("app_open_ad")) {
                    this.zzi = 7;
                }
                else if(arrayList0.contains("rewarded_interstitial") || arrayList0.contains("REWARDED_INTERSTITIAL")) {
                    this.zzi = 6;
                }
            }
            return this;
        }
    }

    public final zzfhh zze(String s) {
        synchronized(this) {
            if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
                this.zze = s;
            }
            return this;
        }
    }

    public final zzfhh zzf(Bundle bundle0) {
        synchronized(this) {
            if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
                this.zzd = zzaa.zza(bundle0);
            }
            return this;
        }
    }

    public final zzfhh zzg(zzfbz zzfbz0) {
        synchronized(this) {
            if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
                this.zzf = zzfbz0;
            }
            return this;
        }
    }

    public final void zzh() {
        synchronized(this) {
            if(!((Boolean)zzbee.zzc.zze()).booleanValue()) {
                return;
            }
            Future future0 = this.zzh;
            if(future0 != null) {
                future0.cancel(false);
            }
            for(Object object0: this.zza) {
                zzfgw zzfgw0 = (zzfgw)object0;
                int v1 = this.zzi;
                if(v1 != 2) {
                    zzfgw0.zzn(v1);
                }
                if(!TextUtils.isEmpty(this.zzc)) {
                    zzfgw0.zze(this.zzc);
                }
                if(!TextUtils.isEmpty(this.zze) && !zzfgw0.zzl()) {
                    zzfgw0.zzd(this.zze);
                }
                zzfbz zzfbz0 = this.zzf;
                if(zzfbz0 == null) {
                    zze zze0 = this.zzg;
                    if(zze0 != null) {
                        zzfgw0.zza(zze0);
                    }
                }
                else {
                    zzfgw0.zzb(zzfbz0);
                }
                zzfgw0.zzf(this.zzd);
                zzfha zzfha0 = zzfgw0.zzm();
                this.zzb.zzb(zzfha0);
            }
            this.zza.clear();
        }
    }

    public final zzfhh zzi(int v) {
        synchronized(this) {
            if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
                this.zzi = v;
            }
            return this;
        }
    }
}

