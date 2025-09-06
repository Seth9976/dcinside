package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzesx implements zzetr {
    final String zza;
    public static final int zzb;
    private static final zzesy zzc;
    private final zzgcs zzd;
    private final ScheduledExecutorService zze;
    private final zzejj zzf;
    private final Context zzg;
    private final zzfcj zzh;
    private final zzejf zzi;
    private final zzdpm zzj;
    private final zzduc zzk;
    private final int zzl;

    static {
        zzesx.zzc = new zzesy("[]", new Bundle());
    }

    zzesx(zzgcs zzgcs0, ScheduledExecutorService scheduledExecutorService0, String s, zzejj zzejj0, Context context0, zzfcj zzfcj0, zzejf zzejf0, zzdpm zzdpm0, zzduc zzduc0, int v) {
        this.zzd = zzgcs0;
        this.zze = scheduledExecutorService0;
        this.zza = s;
        this.zzf = zzejj0;
        this.zzg = context0;
        this.zzh = zzfcj0;
        this.zzi = zzejf0;
        this.zzj = zzdpm0;
        this.zzk = zzduc0;
        this.zzl = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 0x20;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        if(this.zzl == 2) {
            return zzgch.zzh(zzesx.zzc);
        }
        zzfcj zzfcj0 = this.zzh;
        if(zzfcj0.zzr) {
            String s = zzaa.zzb(zzaa.zzc(zzfcj0.zzd));
            return Arrays.asList(((String)zzbe.zzc().zza(zzbcl.zzbN)).split(",")).contains(s) ? zzgch.zzk(() -> {
                String s = ((Boolean)zzbe.zzc().zza(zzbcl.zzkM)).booleanValue() ? this.zzh.zzf.toLowerCase(Locale.ROOT) : this.zzh.zzf;
                Bundle bundle0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzbL)).booleanValue() ? this.zzk.zzg() : new Bundle();
                ArrayList arrayList0 = new ArrayList();
                if(!((Boolean)zzbe.zzc().zza(zzbcl.zzbU)).booleanValue()) {
                    for(Object object0: ((zzfxq)this.zzf.zzb(this.zza, s)).zzh()) {
                        Object object1 = ((Map.Entry)object0).getKey();
                        arrayList0.add(this.zzg(((String)object1), ((List)((Map.Entry)object0).getValue()), this.zzf(((String)object1)), true, true));
                    }
                    this.zzi(arrayList0, this.zzf.zzc());
                    return zzgch.zzb(arrayList0).zza(new zzess(arrayList0, bundle0), this.zzd);
                }
                this.zzi(arrayList0, this.zzf.zza(this.zza, s));
                return zzgch.zzb(arrayList0).zza(new zzess(arrayList0, bundle0), this.zzd);
            }, this.zzd) : zzgch.zzh(zzesx.zzc);
        }
        return zzgch.zzk(() -> {
            String s = ((Boolean)zzbe.zzc().zza(zzbcl.zzkM)).booleanValue() ? this.zzh.zzf.toLowerCase(Locale.ROOT) : this.zzh.zzf;
            Bundle bundle0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzbL)).booleanValue() ? this.zzk.zzg() : new Bundle();
            ArrayList arrayList0 = new ArrayList();
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzbU)).booleanValue()) {
                for(Object object0: ((zzfxq)this.zzf.zzb(this.zza, s)).zzh()) {
                    Object object1 = ((Map.Entry)object0).getKey();
                    arrayList0.add(this.zzg(((String)object1), ((List)((Map.Entry)object0).getValue()), this.zzf(((String)object1)), true, true));
                }
                this.zzi(arrayList0, this.zzf.zzc());
                return zzgch.zzb(arrayList0).zza(new zzess(arrayList0, bundle0), this.zzd);
            }
            this.zzi(arrayList0, this.zzf.zza(this.zza, s));
            return zzgch.zzb(arrayList0).zza(new zzess(arrayList0, bundle0), this.zzd);
        }, this.zzd);
    }

    // 检测为 Lambda 实现
    public static t0 zzc(zzesx zzesx0) [...]

    // 检测为 Lambda 实现
    final t0 zzd(String s, List list0, Bundle bundle0, boolean z, boolean z1) throws Exception [...]

    // 检测为 Lambda 实现
    final void zze(zzbrd zzbrd0, Bundle bundle0, List list0, zzejm zzejm0, zzcab zzcab0) [...]

    @Nullable
    private final Bundle zzf(String s) {
        Bundle bundle0 = this.zzh.zzd.zzm;
        return bundle0 == null ? null : bundle0.getBundle(s);
    }

    private final zzgby zzg(String s, List list0, Bundle bundle0, boolean z, boolean z1) {
        zzgby zzgby0 = zzgby.zzu(zzgch.zzk(() -> {
            zzbrd zzbrd0;
            t0 t00 = new zzcab();
            if(!z1 || ((Boolean)zzbe.zzc().zza(zzbcl.zzbM)).booleanValue()) {
                try {
                    zzbrd0 = this.zzj.zzb(s);
                }
                catch(RemoteException remoteException0) {
                    zze.zzb("Couldn\'t create RTB adapter : ", remoteException0);
                    zzbrd0 = null;
                }
            }
            else {
                this.zzi.zzb(s);
                zzbrd0 = this.zzi.zza(s);
            }
            if(zzbrd0 == null) {
                if(!((Boolean)zzbe.zzc().zza(zzbcl.zzbC)).booleanValue()) {
                    throw null;
                }
                zzejm.zzb(s, ((zzcab)t00));
                return t00;
            }
            zzejm zzejm0 = new zzejm(s, zzbrd0, ((zzcab)t00), zzv.zzC().elapsedRealtime());
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzbH)).booleanValue()) {
                zzesw zzesw0 = new zzesw(zzejm0);
                long v = (long)(((Long)zzbe.zzc().zza(zzbcl.zzbA)));
                this.zze.schedule(zzesw0, v, TimeUnit.MILLISECONDS);
            }
            if(z) {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzbO)).booleanValue()) {
                    zzest zzest0 = () -> try {
                        this.zzh(zzbrd0, bundle0, list0, zzejm0);
                    }
                    catch(RemoteException remoteException0) {
                        ((zzcab)t00).zzd(remoteException0);
                    };
                    this.zzd.zza(zzest0);
                    return t00;
                }
                this.zzh(zzbrd0, bundle0, list0, zzejm0);
                return t00;
            }
            zzejm0.zzd();
            return t00;
        }, this.zzd));
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzbH)).booleanValue()) {
            zzgby0 = (zzgby)zzgch.zzo(zzgby0, ((long)(((Long)zzbe.zzc().zza(zzbcl.zzbA)))), TimeUnit.MILLISECONDS, this.zze);
        }
        zzesv zzesv0 = new zzesv(s);
        return (zzgby)zzgch.zze(zzgby0, Throwable.class, zzesv0, this.zzd);
    }

    private final void zzh(zzbrd zzbrd0, Bundle bundle0, @NonNull List list0, zzejm zzejm0) throws RemoteException {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zzg);
        Object object0 = list0.get(0);
        zzbrd0.zzh(iObjectWrapper0, this.zza, bundle0, ((Bundle)object0), this.zzh.zze, zzejm0);
    }

    private final void zzi(List list0, Map map0) {
        for(Object object0: map0.entrySet()) {
            zzejn zzejn0 = (zzejn)((Map.Entry)object0).getValue();
            Bundle bundle0 = this.zzf(zzejn0.zza);
            List list1 = Collections.singletonList(zzejn0.zze);
            list0.add(this.zzg(zzejn0.zza, list1, bundle0, zzejn0.zzb, zzejn0.zzc));
        }
    }
}

