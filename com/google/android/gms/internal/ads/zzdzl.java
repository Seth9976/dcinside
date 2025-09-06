package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import j..util.Objects;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import org.json.JSONObject;

public final class zzdzl extends zzbux {
    private final Context zza;
    private final zzgcs zzb;
    private final zzdzt zzc;
    private final zzckx zzd;
    private final ArrayDeque zze;
    private final zzfhk zzf;
    private final zzbvs zzg;

    public zzdzl(Context context0, zzgcs zzgcs0, zzbvs zzbvs0, zzckx zzckx0, zzdzt zzdzt0, ArrayDeque arrayDeque0, zzdzq zzdzq0, zzfhk zzfhk0) {
        zzbcl.zza(context0);
        this.zza = context0;
        this.zzb = zzgcs0;
        this.zzg = zzbvs0;
        this.zzc = zzdzt0;
        this.zzd = zzckx0;
        this.zze = arrayDeque0;
        this.zzf = zzfhk0;
    }

    public final t0 zzb(zzbvk zzbvk0, int v) {
        if(!((Boolean)zzbes.zza.zze()).booleanValue()) {
            return zzgch.zzg(new Exception("Split request is disabled."));
        }
        zzfed zzfed0 = zzbvk0.zzi;
        if(zzfed0 == null) {
            return zzgch.zzg(new Exception("Pool configuration missing from request."));
        }
        if(zzfed0.zzc != 0 && zzfed0.zzd != 0) {
            VersionInfoParcel versionInfoParcel0 = VersionInfoParcel.forPackage();
            zzbog zzbog0 = zzv.zzg().zzb(this.zza, versionInfoParcel0, this.zzf);
            zzeuu zzeuu0 = this.zzd.zzr(zzbvk0, v);
            zzfgn zzfgn0 = zzeuu0.zzc();
            t0 t00 = zzdzl.zzn(zzbvk0, zzfgn0, zzeuu0);
            zzfhh zzfhh0 = zzeuu0.zzd();
            zzfgw zzfgw0 = zzfgv.zza(this.zza, 9);
            t0 t01 = zzdzl.zzm(t00, zzfgn0, zzbog0, zzfhh0, zzfgw0);
            return zzfgn0.zza(zzfgh.zzz, new t0[]{t00, t01}).zza(() -> {
                String s = ((zzbvm)t01.get()).zze();
                Object object0 = t00.get();
                this.zzo(new zzdzi(((zzbvm)t01.get()), ((JSONObject)object0), zzbvk0.zzh, s, zzfgw0));
                return new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8));
            }).zza();
        }
        return zzgch.zzg(new Exception("Caching is disabled."));
    }

    public final t0 zzc(zzbvk zzbvk0, int v) {
        t0 t02;
        zzdzi zzdzi0 = null;
        VersionInfoParcel versionInfoParcel0 = VersionInfoParcel.forPackage();
        zzbog zzbog0 = zzv.zzg().zzb(this.zza, versionInfoParcel0, this.zzf);
        zzeuu zzeuu0 = this.zzd.zzr(zzbvk0, v);
        zzbnw zzbnw0 = zzbog0.zza("google.afma.response.normalize", zzdzk.zza, zzbod.zzb);
        if(((Boolean)zzbes.zza.zze()).booleanValue()) {
            zzdzi0 = this.zzl(zzbvk0.zzh);
            if(zzdzi0 == null) {
                zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        else if(zzbvk0.zzj != null && !zzbvk0.zzj.isEmpty()) {
            zze.zza("Request contained a PoolKey but split request is disabled.");
        }
        zzfgw zzfgw0 = zzdzi0 == null ? zzfgv.zza(this.zza, 9) : zzdzi0.zzd;
        zzfhh zzfhh0 = zzeuu0.zzd();
        zzfhh0.zzd(zzbvk0.zza.getStringArrayList("ad_types"));
        zzdzs zzdzs0 = new zzdzs(zzbvk0.zzg, zzfhh0, zzfgw0);
        zzdzp zzdzp0 = new zzdzp(this.zza, zzbvk0.zzb.afmaVersion, this.zzg, v);
        zzfgn zzfgn0 = zzeuu0.zzc();
        zzfgw zzfgw1 = zzfgv.zza(this.zza, 11);
        if(zzdzi0 == null) {
            t0 t00 = zzdzl.zzn(zzbvk0, zzfgn0, zzeuu0);
            t0 t01 = zzdzl.zzm(t00, zzfgn0, zzbog0, zzfhh0, zzfgw0);
            zzfgw zzfgw2 = zzfgv.zza(this.zza, 10);
            zzfft zzfft0 = zzfgn0.zza(zzfgh.zzi, new t0[]{t01, t00}).zza(new zzdyy(t01, zzbvk0, t00)).zze(zzdzs0).zze(new zzfhc(zzfgw2)).zze(zzdzp0).zza();
            zzfhg.zza(zzfft0, zzfhh0, zzfgw2);
            zzfhg.zzd(zzfft0, zzfgw1);
            t02 = zzfgn0.zza(zzfgh.zzk, new t0[]{t00, t01, zzfft0}).zza(new zzdyz(zzbvk0, zzfft0, t00, t01)).zzf(zzbnw0).zza();
        }
        else {
            zzdzr zzdzr0 = new zzdzr(zzdzi0.zzb, zzdzi0.zza);
            zzfgw zzfgw3 = zzfgv.zza(this.zza, 10);
            t0 t03 = zzgch.zzh(zzdzr0);
            zzfft zzfft1 = zzfgn0.zzb(zzfgh.zzi, t03).zze(zzdzs0).zze(new zzfhc(zzfgw3)).zze(zzdzp0).zza();
            zzfhg.zza(zzfft1, zzfhh0, zzfgw3);
            t0 t04 = zzgch.zzh(zzdzi0);
            zzfhg.zzd(zzfft1, zzfgw1);
            t02 = zzfgn0.zza(zzfgh.zzk, new t0[]{zzfft1, t04}).zza(new zzdyv(zzfft1, t04)).zzf(zzbnw0).zza();
        }
        zzfhg.zza(t02, zzfhh0, zzfgw1);
        return t02;
    }

    public final t0 zzd(zzbvk zzbvk0, int v) {
        VersionInfoParcel versionInfoParcel0 = VersionInfoParcel.forPackage();
        zzbog zzbog0 = zzv.zzg().zzb(this.zza, versionInfoParcel0, this.zzf);
        if(!((Boolean)zzbex.zza.zze()).booleanValue()) {
            return zzgch.zzg(new Exception("Signal collection disabled."));
        }
        zzeuu zzeuu0 = this.zzd.zzr(zzbvk0, v);
        zzetu zzetu0 = zzeuu0.zza();
        zzbnw zzbnw0 = zzbog0.zza("google.afma.request.getSignals", zzbod.zza, zzbod.zzb);
        zzfgw zzfgw0 = zzfgv.zza(this.zza, 22);
        zzfgn zzfgn0 = zzeuu0.zzc();
        t0 t00 = zzgch.zzh(zzbvk0.zza);
        t0 t01 = zzfgn0.zzb(zzfgh.zzl, t00).zze(new zzfhc(zzfgw0)).zzf(new zzdze(zzetu0, zzbvk0)).zzb(zzfgh.zzm).zzf(zzbnw0).zza();
        zzfhh zzfhh0 = zzeuu0.zzd();
        zzfhh0.zzd(zzbvk0.zza.getStringArrayList("ad_types"));
        zzfhh0.zzf(zzbvk0.zza.getBundle("extras"));
        zzfhg.zzb(t01, zzfhh0, zzfgw0);
        if(((Boolean)zzbel.zzf.zze()).booleanValue()) {
            Objects.requireNonNull(this.zzc);
            t01.addListener(new zzdzb(this.zzc), this.zzb);
        }
        return t01;
    }

    @Override  // com.google.android.gms.internal.ads.zzbuy
    public final void zze(zzbvk zzbvk0, zzbvc zzbvc0) {
        this.zzq(this.zzb(zzbvk0, Binder.getCallingUid()), zzbvc0, zzbvk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbuy
    public final void zzf(zzbvk zzbvk0, zzbvc zzbvc0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            Bundle bundle0 = zzbvk0.zzm;
            if(bundle0 != null) {
                bundle0.putLong("service-connected", zzv.zzC().currentTimeMillis());
            }
        }
        this.zzq(this.zzd(zzbvk0, Binder.getCallingUid()), zzbvc0, zzbvk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbuy
    public final void zzg(zzbvk zzbvk0, zzbvc zzbvc0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            Bundle bundle0 = zzbvk0.zzm;
            if(bundle0 != null) {
                bundle0.putLong("service-connected", zzv.zzC().currentTimeMillis());
            }
        }
        t0 t00 = this.zzc(zzbvk0, Binder.getCallingUid());
        this.zzq(t00, zzbvc0, zzbvk0);
        if(((Boolean)zzbel.zze.zze()).booleanValue()) {
            Objects.requireNonNull(this.zzc);
            t00.addListener(new zzdzb(this.zzc), this.zzb);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbuy
    public final void zzh(String s, zzbvc zzbvc0) {
        this.zzq(this.zzj(s), zzbvc0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbuy
    public final void zzi(zzbuu zzbuu0, zzbvd zzbvd0) {
        if(!((Boolean)zzbez.zza.zze()).booleanValue()) {
            try {
                zzbvd0.zzf("", zzbuu0);
            }
            catch(RemoteException remoteException0) {
                zze.zzb("Service can\'t call client", remoteException0);
            }
            return;
        }
        this.zzd.zzF();
        zzgch.zzr(zzgch.zzh(null), new zzdzf(this, zzbvd0, zzbuu0), zzbzw.zzg);
    }

    public final t0 zzj(String s) {
        if(!((Boolean)zzbes.zza.zze()).booleanValue()) {
            return zzgch.zzg(new Exception("Split request is disabled."));
        }
        zzdzg zzdzg0 = new zzdzg(this);
        return this.zzl(s) == null ? zzgch.zzg(new Exception("URL to be removed not found for cache key: " + s)) : zzgch.zzh(zzdzg0);
    }

    // 检测为 Lambda 实现
    final InputStream zzk(t0 t00, t0 t01, zzbvk zzbvk0, zzfgw zzfgw0) throws Exception [...]

    @Nullable
    private final zzdzi zzl(String s) {
        synchronized(this) {
            Iterator iterator0 = this.zze.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                zzdzi zzdzi0 = (zzdzi)object0;
                if(zzdzi0.zzc.equals(s)) {
                    iterator0.remove();
                    return zzdzi0;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
    }

    private static t0 zzm(t0 t00, zzfgn zzfgn0, zzbog zzbog0, zzfhh zzfhh0, zzfgw zzfgw0) {
        zzdzc zzdzc0 = new zzdzc();
        zzbnw zzbnw0 = zzbog0.zza("AFMA_getAdDictionary", zzbod.zza, zzdzc0);
        zzfhg.zzd(t00, zzfgw0);
        t0 t01 = zzfgn0.zzb(zzfgh.zzg, t00).zzf(zzbnw0).zza();
        zzfhg.zzc(t01, zzfhh0, zzfgw0);
        return t01;
    }

    private static t0 zzn(zzbvk zzbvk0, zzfgn zzfgn0, zzeuu zzeuu0) {
        zzdyw zzdyw0 = new zzdyw(zzeuu0, zzbvk0);
        zzdyx zzdyx0 = new zzdyx();
        t0 t00 = zzgch.zzh(zzbvk0.zza);
        return zzfgn0.zzb(zzfgh.zze, t00).zzf(zzdyw0).zze(zzdyx0).zza();
    }

    private final void zzo(zzdzi zzdzi0) {
        synchronized(this) {
            this.zzp();
            this.zze.addLast(zzdzi0);
        }
    }

    private final void zzp() {
        synchronized(this) {
            int v1 = ((Long)zzbes.zzb.zze()).intValue();
            while(this.zze.size() >= v1) {
                this.zze.removeFirst();
            }
        }
    }

    private final void zzq(t0 t00, zzbvc zzbvc0, zzbvk zzbvk0) {
        zzgch.zzr(zzgch.zzn(t00, new zzdzd(this), zzbzw.zza), new zzdzh(this, zzbvk0, zzbvc0), zzbzw.zzg);
    }
}

