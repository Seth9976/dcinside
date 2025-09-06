package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;

final class zzfdx implements zzfdw {
    private final ConcurrentHashMap zza;
    private final zzfed zzb;
    private final zzfdz zzc;

    public zzfdx(zzfed zzfed0) {
        this.zza = new ConcurrentHashMap(zzfed0.zzd);
        this.zzb = zzfed0;
        this.zzc = new zzfdz();
    }

    @Override  // com.google.android.gms.internal.ads.zzfdw
    public final zzfed zza() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfdw
    @Nullable
    public final zzfef zzb(zzfeg zzfeg0) {
        zzfef zzfef0;
        synchronized(this) {
            zzfdv zzfdv0 = (zzfdv)this.zza.get(zzfeg0);
            if(zzfdv0 == null) {
                this.zzc.zzf();
                this.zzf();
                zzfef0 = null;
            }
            else {
                zzfef0 = zzfdv0.zze();
                if(zzfef0 == null) {
                    this.zzc.zze();
                }
                zzfet zzfet0 = zzfdv0.zzf();
                if(zzfef0 != null) {
                    zzbbq.zzb.zzc zzbbq$zzb$zzc0 = zzbbq.zzb.zzd();
                    zzbbq.zzb.zza.zza zzbbq$zzb$zza$zza0 = zzbbq.zzb.zza.zza();
                    zzbbq$zzb$zza$zza0.zzf(zzbbq.zzb.zzd.zzb);
                    zzbbq.zzb.zze.zza zzbbq$zzb$zze$zza0 = zzbbq.zzb.zze.zzb();
                    zzbbq$zzb$zze$zza0.zzd(zzfet0.zza);
                    zzbbq$zzb$zze$zza0.zze(zzfet0.zzb);
                    zzbbq$zzb$zza$zza0.zzg(zzbbq$zzb$zze$zza0);
                    zzbbq$zzb$zzc0.zzd(zzbbq$zzb$zza$zza0);
                    zzbbq.zzb zzbbq$zzb0 = (zzbbq.zzb)zzbbq$zzb$zzc0.zzbn();
                    zzfef0.zza.zzb().zzc().zzi(zzbbq$zzb0);
                }
                this.zzf();
            }
            return zzfef0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfdw
    @Deprecated
    public final zzfeg zzc(zzm zzm0, String s, zzy zzy0) {
        return new zzfeh(zzm0, s, new zzbvn(this.zzb.zza).zza().zzj, this.zzb.zzf, zzy0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfdw
    public final boolean zzd(zzfeg zzfeg0, zzfef zzfef0) {
        synchronized(this) {
            zzfdv zzfdv0 = (zzfdv)this.zza.get(zzfeg0);
            zzfef0.zzd = zzv.zzC().currentTimeMillis();
            if(zzfdv0 == null) {
                zzfdv zzfdv1 = new zzfdv(this.zzb.zzd, this.zzb.zze * 1000);
                if(this.zza.size() == this.zzb.zzc) {
                    long v1 = 0x7FFFFFFFFFFFFFFFL;
                    int v2 = this.zzb.zzg - 1;
                    zzfeg zzfeg1 = null;
                    if(this.zzb.zzg == 0) {
                        throw null;
                    }
                    switch(v2) {
                        case 0: {
                            for(Object object0: this.zza.entrySet()) {
                                Map.Entry map$Entry0 = (Map.Entry)object0;
                                if(((zzfdv)map$Entry0.getValue()).zzc() < v1) {
                                    v1 = ((zzfdv)map$Entry0.getValue()).zzc();
                                    zzfeg1 = (zzfeg)map$Entry0.getKey();
                                }
                            }
                            if(zzfeg1 != null) {
                                this.zza.remove(zzfeg1);
                            }
                            break;
                        }
                        case 1: {
                            for(Object object1: this.zza.entrySet()) {
                                Map.Entry map$Entry1 = (Map.Entry)object1;
                                if(((zzfdv)map$Entry1.getValue()).zzd() < v1) {
                                    v1 = ((zzfdv)map$Entry1.getValue()).zzd();
                                    zzfeg1 = (zzfeg)map$Entry1.getKey();
                                }
                            }
                            if(zzfeg1 != null) {
                                this.zza.remove(zzfeg1);
                            }
                            break;
                        }
                        case 2: {
                            int v3 = 0x7FFFFFFF;
                            for(Object object2: this.zza.entrySet()) {
                                Map.Entry map$Entry2 = (Map.Entry)object2;
                                if(((zzfdv)map$Entry2.getValue()).zza() < v3) {
                                    v3 = ((zzfdv)map$Entry2.getValue()).zza();
                                    zzfeg1 = (zzfeg)map$Entry2.getKey();
                                }
                            }
                            if(zzfeg1 != null) {
                                this.zza.remove(zzfeg1);
                            }
                        }
                    }
                    this.zzc.zzg();
                }
                this.zza.put(zzfeg0, zzfdv1);
                this.zzc.zzd();
                zzfdv0 = zzfdv1;
            }
            boolean z = zzfdv0.zzh(zzfef0);
            this.zzc.zzc();
            zzfdy zzfdy0 = this.zzc.zza();
            zzfet zzfet0 = zzfdv0.zzf();
            zzbbq.zzb.zzc zzbbq$zzb$zzc0 = zzbbq.zzb.zzd();
            zzbbq.zzb.zza.zza zzbbq$zzb$zza$zza0 = zzbbq.zzb.zza.zza();
            zzbbq$zzb$zza$zza0.zzf(zzbbq.zzb.zzd.zzb);
            zzbbq.zzb.zzg.zza zzbbq$zzb$zzg$zza0 = zzbbq.zzb.zzg.zzb();
            zzbbq$zzb$zzg$zza0.zze(zzfdy0.zza);
            zzbbq$zzb$zzg$zza0.zzf(zzfdy0.zzb);
            zzbbq$zzb$zzg$zza0.zzg(zzfet0.zzb);
            zzbbq$zzb$zza$zza0.zzi(zzbbq$zzb$zzg$zza0);
            zzbbq$zzb$zzc0.zzd(zzbbq$zzb$zza$zza0);
            zzbbq.zzb zzbbq$zzb0 = (zzbbq.zzb)zzbbq$zzb$zzc0.zzbn();
            zzfef0.zza.zzb().zzc().zzj(zzbbq$zzb0);
            this.zzf();
            return z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfdw
    public final boolean zze(zzfeg zzfeg0) {
        synchronized(this) {
            zzfdv zzfdv0 = (zzfdv)this.zza.get(zzfeg0);
            if(zzfdv0 != null) {
                int v1 = zzfdv0.zzb();
                return v1 < this.zzb.zzd;
            }
            return true;
        }
    }

    private final void zzf() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgh)).booleanValue()) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(this.zzb.zzb);
            stringBuilder0.append(" PoolCollection");
            stringBuilder0.append("\n\tPool does not exist: 0\n\tNew pools created: 0\n\tPools removed: 0\n\tEntries added: 0\n\tNo entries retrieved: 0\n");
            int v = 0;
            for(Object object0: this.zza.entrySet()) {
                ++v;
                stringBuilder0.append(v);
                stringBuilder0.append(". ");
                stringBuilder0.append(((Map.Entry)object0).getValue());
                stringBuilder0.append("#");
                stringBuilder0.append(((zzfeg)((Map.Entry)object0).getKey()).hashCode());
                stringBuilder0.append("    ");
                for(int v1 = 0; v1 < ((zzfdv)((Map.Entry)object0).getValue()).zzb(); ++v1) {
                    stringBuilder0.append("[O]");
                }
                for(int v2 = ((zzfdv)((Map.Entry)object0).getValue()).zzb(); v2 < this.zzb.zzd; ++v2) {
                    stringBuilder0.append("[ ]");
                }
                stringBuilder0.append("\n");
                stringBuilder0.append(((zzfdv)((Map.Entry)object0).getValue()).zzg());
                stringBuilder0.append("\n");
            }
            while(v < this.zzb.zzc) {
                ++v;
                stringBuilder0.append(v);
                stringBuilder0.append(".\n");
            }
            zzo.zze(stringBuilder0.toString());
        }
    }
}

