package com.google.android.gms.measurement.internal;

import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfy.zzf;
import com.google.android.gms.internal.measurement.zzfy.zzh;
import com.google.android.gms.internal.measurement.zzfy.zzj.zza;
import com.google.android.gms.internal.measurement.zzfy.zzj;
import com.google.android.gms.internal.measurement.zzfy.zzk;
import com.google.android.gms.internal.measurement.zzfy.zzl;
import com.google.android.gms.internal.measurement.zzfy.zzo;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzpo;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class zzli extends zznr {
    public zzli(zznv zznv0) {
        super(zznv0);
    }

    private static String zza(String s, String s1) {
        throw new SecurityException("This implementation should not be used.");
    }

    @WorkerThread
    public final byte[] zza(@NonNull zzbf zzbf0, @Size(min = 1L) String s) {
        long v2;
        zzbb zzbb1;
        zzg zzg1;
        zza zzfy$zzj$zza1;
        com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza2;
        Bundle bundle1;
        Object object0;
        this.zzt();
        this.zzu.zzy();
        Preconditions.checkNotNull(zzbf0);
        Preconditions.checkNotEmpty(s);
        if(!this.zze().zze(s, zzbh.zzbl)) {
            this.zzj().zzc().zza("Generating ScionPayload disabled. packageName", s);
            return new byte[0];
        }
        if(!"_iap".equals(zzbf0.zza) && !"_iapx".equals(zzbf0.zza)) {
            this.zzj().zzc().zza("Generating a payload for this event is not available. package_name, event_name", s, zzbf0.zza);
            return null;
        }
        zza zzfy$zzj$zza0 = zzj.zzb();
        this.zzh().zzp();
        try {
            zzg zzg0 = this.zzh().zze(s);
            if(zzg0 == null) {
                this.zzj().zzc().zza("Log and bundle not available. package_name", s);
                return new byte[0];
            }
            if(!zzg0.zzar()) {
                this.zzj().zzc().zza("Log and bundle disabled. package_name", s);
                return new byte[0];
            }
            com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza0 = zzk.zzw().zzh(1).zzp("android");
            if(!TextUtils.isEmpty(zzg0.zzac())) {
                zzfy$zzk$zza0.zzb(zzg0.zzac());
            }
            if(!TextUtils.isEmpty(zzg0.zzae())) {
                zzfy$zzk$zza0.zzd(((String)Preconditions.checkNotNull(zzg0.zzae())));
            }
            if(!TextUtils.isEmpty(zzg0.zzaf())) {
                zzfy$zzk$zza0.zze(((String)Preconditions.checkNotNull(zzg0.zzaf())));
            }
            if(zzg0.zze() != 0xFFFFFFFF80000000L) {
                zzfy$zzk$zza0.zze(((int)zzg0.zze()));
            }
            zzfy$zzk$zza0.zzf(zzg0.zzq()).zzd(zzg0.zzo());
            String s1 = zzg0.zzah();
            String s2 = zzg0.zzaa();
            if(!TextUtils.isEmpty(s1)) {
                zzfy$zzk$zza0.zzm(s1);
            }
            else if(!TextUtils.isEmpty(s2)) {
                zzfy$zzk$zza0.zza(s2);
            }
            zzfy$zzk$zza0.zzj(zzg0.zzw());
            zzje zzje0 = this.zzg.zzb(s);
            zzfy$zzk$zza0.zzc(zzg0.zzn());
            if(this.zzu.zzac() && this.zze().zzj(zzfy$zzk$zza0.zzt()) && zzje0.zzg() && !TextUtils.isEmpty(null)) {
                zzfy$zzk$zza0.zzj(null);
            }
            zzfy$zzk$zza0.zzg(zzje0.zze());
            if(zzje0.zzg() && zzg0.zzaq()) {
                Pair pair0 = this.zzn().zza(zzg0.zzac(), zzje0);
                if(zzg0.zzaq() && pair0 != null && !TextUtils.isEmpty(((CharSequence)pair0.first))) {
                    try {
                        zzfy$zzk$zza0.zzq(zzli.zza(((String)pair0.first), Long.toString(zzbf0.zzd)));
                        object0 = pair0.second;
                    }
                    catch(SecurityException securityException0) {
                        this.zzj().zzc().zza("Resettable device id encryption failed", securityException0.getMessage());
                        return new byte[0];
                    }
                    if(object0 != null) {
                        zzfy$zzk$zza0.zzc(((Boolean)object0).booleanValue());
                    }
                }
            }
            this.zzf().zzac();
            com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza1 = zzfy$zzk$zza0.zzi(Build.MODEL);
            this.zzf().zzac();
            zzfy$zzk$zza1.zzo(Build.VERSION.RELEASE).zzj(((int)this.zzf().zzc())).zzs(this.zzf().zzg());
            try {
                if(zzje0.zzh() && zzg0.zzad() != null) {
                    zzfy$zzk$zza0.zzc(zzli.zza(((String)Preconditions.checkNotNull(zzg0.zzad())), Long.toString(zzbf0.zzd)));
                }
            }
            catch(SecurityException securityException1) {
                this.zzj().zzc().zza("app instance id encryption failed", securityException1.getMessage());
                return new byte[0];
            }
            if(!TextUtils.isEmpty(zzg0.zzag())) {
                zzfy$zzk$zza0.zzl(((String)Preconditions.checkNotNull(zzg0.zzag())));
            }
            zzop zzop0 = null;
            String s3 = zzg0.zzac();
            List list0 = this.zzh().zzl(s3);
            for(Object object1: list0) {
                zzop zzop1 = (zzop)object1;
                if("_lte".equals(zzop1.zzc)) {
                    zzop0 = zzop1;
                    break;
                }
            }
            if(zzop0 == null || zzop0.zze == null) {
                zzop zzop2 = new zzop(s3, "auto", "_lte", this.zzb().currentTimeMillis(), 0L);
                list0.add(zzop2);
                this.zzh().zza(zzop2);
            }
            zzo[] arr_zzfy$zzo = new zzo[list0.size()];
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                com.google.android.gms.internal.measurement.zzfy.zzo.zza zzfy$zzo$zza0 = zzo.zze().zza(((zzop)list0.get(v1)).zzc).zzb(((zzop)list0.get(v1)).zzd);
                this.g_().zza(zzfy$zzo$zza0, ((zzop)list0.get(v1)).zze);
                arr_zzfy$zzo[v1] = (zzo)(((zzjt)zzfy$zzo$zza0.zzai()));
            }
            zzfy$zzk$zza0.zze(Arrays.asList(arr_zzfy$zzo));
            this.zzg.zza(zzg0, zzfy$zzk$zza0);
            if(zzov.zza() && this.zze().zza(zzbh.zzcu)) {
                this.zzg.zzb(zzg0, zzfy$zzk$zza0);
            }
            zzgs zzgs0 = zzgs.zza(zzbf0);
            this.zzq().zza(zzgs0.zzc, this.zzh().zzd(s));
            this.zzq().zza(zzgs0, this.zze().zzb(s));
            Bundle bundle0 = zzgs0.zzc;
            bundle0.putLong("_c", 1L);
            this.zzj().zzc().zza("Marking in-app purchase as real-time");
            bundle0.putLong("_r", 1L);
            bundle0.putString("_o", zzbf0.zzc);
            if(this.zzq().zzd(zzfy$zzk$zza0.zzt(), zzg0.zzam())) {
                this.zzq().zza(bundle0, "_dbg", 1L);
                this.zzq().zza(bundle0, "_r", 1L);
            }
            zzbb zzbb0 = this.zzh().zzd(s, zzbf0.zza);
            if(zzbb0 == null) {
                bundle1 = bundle0;
                zzfy$zzk$zza2 = zzfy$zzk$zza0;
                zzfy$zzj$zza1 = zzfy$zzj$zza0;
                zzg1 = zzg0;
                zzbb1 = new zzbb(s, zzbf0.zza, 0L, 0L, zzbf0.zzd, 0L, null, null, null, null);
                v2 = 0L;
            }
            else {
                bundle1 = bundle0;
                zzfy$zzk$zza2 = zzfy$zzk$zza0;
                zzfy$zzj$zza1 = zzfy$zzj$zza0;
                zzg1 = zzg0;
                zzbb zzbb2 = zzbb0.zza(zzbf0.zzd);
                v2 = zzbb0.zzf;
                zzbb1 = zzbb2;
            }
            this.zzh().zza(zzbb1);
            zzbc zzbc0 = new zzbc(this.zzu, zzbf0.zzc, s, zzbf0.zza, zzbf0.zzd, v2, bundle1);
            com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza0 = zzf.zze().zzb(zzbc0.zzd).zza(zzbc0.zzb).zza(zzbc0.zze);
            for(Object object2: zzbc0.zzf) {
                com.google.android.gms.internal.measurement.zzfy.zzh.zza zzfy$zzh$zza0 = zzh.zze().zza(((String)object2));
                Object object3 = zzbc0.zzf.zzc(((String)object2));
                if(object3 != null) {
                    this.g_().zza(zzfy$zzh$zza0, object3);
                    zzfy$zzf$zza0.zza(zzfy$zzh$zza0);
                }
            }
            zzfy$zzk$zza2.zza(zzfy$zzf$zza0).zza(zzl.zza().zza(com.google.android.gms.internal.measurement.zzfy.zzg.zza().zza(zzbb1.zzc).zza(zzbf0.zza)));
            zzfy$zzk$zza2.zza(this.zzg().zza(zzg1.zzac(), Collections.emptyList(), zzfy$zzk$zza2.zzab(), zzfy$zzf$zza0.zzc(), zzfy$zzf$zza0.zzc()));
            if(zzfy$zzf$zza0.zzg()) {
                zzfy$zzk$zza2.zzi(zzfy$zzf$zza0.zzc()).zze(zzfy$zzf$zza0.zzc());
            }
            long v3 = zzg1.zzs();
            int v4 = Long.compare(v3, 0L);
            if(v4 != 0) {
                zzfy$zzk$zza2.zzg(v3);
            }
            long v5 = zzg1.zzu();
            if(v5 != 0L) {
                zzfy$zzk$zza2.zzh(v5);
            }
            else if(v4 != 0) {
                zzfy$zzk$zza2.zzh(v3);
            }
            String s4 = zzg1.zzal();
            if(zzpo.zza() && this.zze().zze(s, zzbh.zzbw) && s4 != null) {
                zzfy$zzk$zza2.zzr(s4);
            }
            zzg1.zzap();
            zzfy$zzk$zza2.zzf(((int)zzg1.zzt())).zzl(106000L).zzk(this.zzb().currentTimeMillis()).zzd(true);
            String s5 = zzfy$zzk$zza2.zzt();
            this.zzg.zza(s5, zzfy$zzk$zza2);
            zzfy$zzj$zza1.zza(zzfy$zzk$zza2);
            zzg1.zzr(zzfy$zzk$zza2.zzf());
            zzg1.zzp(zzfy$zzk$zza2.zze());
            this.zzh().zza(zzg1, false, false);
            this.zzh().zzw();
        }
        finally {
            this.zzh().zzu();
        }
        try {
            return this.g_().zzb(((zzj)(((zzjt)zzfy$zzj$zza1.zzai()))).zzca());
        }
        catch(IOException iOException0) {
            this.zzj().zzg().zza("Data loss. Failed to bundle and serialize. appId", zzgo.zza(s), iOException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }
}

