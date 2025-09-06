package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.t0;
import java.util.Collections;
import java.util.List;

public final class zzdif {
    private int zza;
    @Nullable
    private zzeb zzb;
    @Nullable
    private zzbfp zzc;
    @Nullable
    private View zzd;
    @Nullable
    private List zze;
    private List zzf;
    @Nullable
    private zzez zzg;
    @Nullable
    private Bundle zzh;
    @Nullable
    private zzcex zzi;
    @Nullable
    private zzcex zzj;
    @Nullable
    private zzcex zzk;
    @Nullable
    private zzecr zzl;
    @Nullable
    private t0 zzm;
    @Nullable
    private zzcab zzn;
    @Nullable
    private View zzo;
    @Nullable
    private View zzp;
    @Nullable
    private IObjectWrapper zzq;
    private double zzr;
    @Nullable
    private zzbfw zzs;
    @Nullable
    private zzbfw zzt;
    @Nullable
    private String zzu;
    private final SimpleArrayMap zzv;
    private final SimpleArrayMap zzw;
    private float zzx;
    @Nullable
    private String zzy;

    public zzdif() {
        this.zzv = new SimpleArrayMap();
        this.zzw = new SimpleArrayMap();
        this.zzf = Collections.emptyList();
    }

    @Nullable
    public final String zzA() {
        synchronized(this) {
        }
        return this.zzu;
    }

    @Nullable
    public final String zzB() {
        synchronized(this) {
            return this.zzF("headline");
        }
    }

    @Nullable
    public final String zzC() {
        synchronized(this) {
        }
        return this.zzy;
    }

    @Nullable
    public final String zzD() {
        synchronized(this) {
            return this.zzF("price");
        }
    }

    @Nullable
    public final String zzE() {
        synchronized(this) {
            return this.zzF("store");
        }
    }

    @Nullable
    public final String zzF(String s) {
        synchronized(this) {
            return (String)this.zzw.get(s);
        }
    }

    @Nullable
    public final List zzG() {
        synchronized(this) {
        }
        return this.zze;
    }

    public final List zzH() {
        synchronized(this) {
        }
        return this.zzf;
    }

    public final void zzI() {
        synchronized(this) {
            zzcex zzcex0 = this.zzi;
            if(zzcex0 != null) {
                zzcex0.destroy();
                this.zzi = null;
            }
            zzcex zzcex1 = this.zzj;
            if(zzcex1 != null) {
                zzcex1.destroy();
                this.zzj = null;
            }
            zzcex zzcex2 = this.zzk;
            if(zzcex2 != null) {
                zzcex2.destroy();
                this.zzk = null;
            }
            t0 t00 = this.zzm;
            if(t00 != null) {
                t00.cancel(false);
                this.zzm = null;
            }
            zzcab zzcab0 = this.zzn;
            if(zzcab0 != null) {
                zzcab0.cancel(false);
                this.zzn = null;
            }
            this.zzl = null;
            this.zzv.clear();
            this.zzw.clear();
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzh = null;
            this.zzo = null;
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            this.zzt = null;
            this.zzu = null;
        }
    }

    public final void zzJ(zzbfp zzbfp0) {
        synchronized(this) {
            this.zzc = zzbfp0;
        }
    }

    public final void zzK(String s) {
        synchronized(this) {
            this.zzu = s;
        }
    }

    public final void zzL(@Nullable zzez zzez0) {
        synchronized(this) {
            this.zzg = zzez0;
        }
    }

    public final void zzM(zzbfw zzbfw0) {
        synchronized(this) {
            this.zzs = zzbfw0;
        }
    }

    public final void zzN(String s, zzbfj zzbfj0) {
        synchronized(this) {
            if(zzbfj0 == null) {
                this.zzv.remove(s);
                return;
            }
            this.zzv.put(s, zzbfj0);
        }
    }

    public final void zzO(zzcex zzcex0) {
        synchronized(this) {
            this.zzj = zzcex0;
        }
    }

    public final void zzP(List list0) {
        synchronized(this) {
            this.zze = list0;
        }
    }

    public final void zzQ(zzbfw zzbfw0) {
        synchronized(this) {
            this.zzt = zzbfw0;
        }
    }

    public final void zzR(float f) {
        synchronized(this) {
            this.zzx = f;
        }
    }

    public final void zzS(List list0) {
        synchronized(this) {
            this.zzf = list0;
        }
    }

    public final void zzT(zzcex zzcex0) {
        synchronized(this) {
            this.zzk = zzcex0;
        }
    }

    public final void zzU(t0 t00) {
        synchronized(this) {
            this.zzm = t00;
        }
    }

    public final void zzV(@Nullable String s) {
        synchronized(this) {
            this.zzy = s;
        }
    }

    public final void zzW(zzecr zzecr0) {
        synchronized(this) {
            this.zzl = zzecr0;
        }
    }

    public final void zzX(zzcab zzcab0) {
        synchronized(this) {
            this.zzn = zzcab0;
        }
    }

    public final void zzY(double f) {
        synchronized(this) {
            this.zzr = f;
        }
    }

    public final void zzZ(String s, @Nullable String s1) {
        synchronized(this) {
            if(s1 == null) {
                this.zzw.remove(s);
                return;
            }
            this.zzw.put(s, s1);
        }
    }

    public final double zza() {
        synchronized(this) {
        }
        return this.zzr;
    }

    public final void zzaa(int v) {
        synchronized(this) {
            this.zza = v;
        }
    }

    public final void zzab(zzeb zzeb0) {
        synchronized(this) {
            this.zzb = zzeb0;
        }
    }

    public final void zzac(View view0) {
        synchronized(this) {
            this.zzo = view0;
        }
    }

    public final void zzad(zzcex zzcex0) {
        synchronized(this) {
            this.zzi = zzcex0;
        }
    }

    public final void zzae(View view0) {
        synchronized(this) {
            this.zzp = view0;
        }
    }

    public final boolean zzaf() {
        synchronized(this) {
        }
        return this.zzj != null;
    }

    @Nullable
    public static zzdif zzag(zzbpp zzbpp0) {
        try {
            zzdie zzdie0 = zzdif.zzak(zzbpp0.zzg(), null);
            zzbfp zzbfp0 = zzbpp0.zzh();
            View view0 = (View)zzdif.zzam(zzbpp0.zzj());
            String s = zzbpp0.zzo();
            List list0 = zzbpp0.zzr();
            String s1 = zzbpp0.zzm();
            Bundle bundle0 = zzbpp0.zzf();
            String s2 = zzbpp0.zzn();
            View view1 = (View)zzdif.zzam(zzbpp0.zzk());
            IObjectWrapper iObjectWrapper0 = zzbpp0.zzl();
            String s3 = zzbpp0.zzq();
            String s4 = zzbpp0.zzp();
            double f = zzbpp0.zze();
            zzbfw zzbfw0 = zzbpp0.zzi();
            zzdif zzdif0 = new zzdif();
            zzdif0.zza = 2;
            zzdif0.zzb = zzdie0;
            zzdif0.zzc = zzbfp0;
            zzdif0.zzd = view0;
            zzdif0.zzZ("headline", s);
            zzdif0.zze = list0;
            zzdif0.zzZ("body", s1);
            zzdif0.zzh = bundle0;
            zzdif0.zzZ("call_to_action", s2);
            zzdif0.zzo = view1;
            zzdif0.zzq = iObjectWrapper0;
            zzdif0.zzZ("store", s3);
            zzdif0.zzZ("price", s4);
            zzdif0.zzr = f;
            zzdif0.zzs = zzbfw0;
            return zzdif0;
        }
        catch(RemoteException remoteException0) {
            zzo.zzk("Failed to get native ad from app install ad mapper", remoteException0);
            return null;
        }
    }

    @Nullable
    public static zzdif zzah(zzbpq zzbpq0) {
        try {
            zzdie zzdie0 = zzdif.zzak(zzbpq0.zzf(), null);
            zzbfp zzbfp0 = zzbpq0.zzg();
            View view0 = (View)zzdif.zzam(zzbpq0.zzi());
            String s = zzbpq0.zzo();
            List list0 = zzbpq0.zzp();
            String s1 = zzbpq0.zzm();
            Bundle bundle0 = zzbpq0.zze();
            String s2 = zzbpq0.zzn();
            View view1 = (View)zzdif.zzam(zzbpq0.zzj());
            IObjectWrapper iObjectWrapper0 = zzbpq0.zzk();
            String s3 = zzbpq0.zzl();
            zzbfw zzbfw0 = zzbpq0.zzh();
            zzdif zzdif0 = new zzdif();
            zzdif0.zza = 1;
            zzdif0.zzb = zzdie0;
            zzdif0.zzc = zzbfp0;
            zzdif0.zzd = view0;
            zzdif0.zzZ("headline", s);
            zzdif0.zze = list0;
            zzdif0.zzZ("body", s1);
            zzdif0.zzh = bundle0;
            zzdif0.zzZ("call_to_action", s2);
            zzdif0.zzo = view1;
            zzdif0.zzq = iObjectWrapper0;
            zzdif0.zzZ("advertiser", s3);
            zzdif0.zzt = zzbfw0;
            return zzdif0;
        }
        catch(RemoteException remoteException0) {
            zzo.zzk("Failed to get native ad from content ad mapper", remoteException0);
            return null;
        }
    }

    @Nullable
    public static zzdif zzai(zzbpp zzbpp0) {
        try {
            return zzdif.zzal(zzdif.zzak(zzbpp0.zzg(), null), zzbpp0.zzh(), ((View)zzdif.zzam(zzbpp0.zzj())), zzbpp0.zzo(), zzbpp0.zzr(), zzbpp0.zzm(), zzbpp0.zzf(), zzbpp0.zzn(), ((View)zzdif.zzam(zzbpp0.zzk())), zzbpp0.zzl(), zzbpp0.zzq(), zzbpp0.zzp(), zzbpp0.zze(), zzbpp0.zzi(), null, 0.0f);
        }
        catch(RemoteException remoteException0) {
            zzo.zzk("Failed to get native ad assets from app install ad mapper", remoteException0);
            return null;
        }
    }

    @Nullable
    public static zzdif zzaj(zzbpq zzbpq0) {
        try {
            return zzdif.zzal(zzdif.zzak(zzbpq0.zzf(), null), zzbpq0.zzg(), ((View)zzdif.zzam(zzbpq0.zzi())), zzbpq0.zzo(), zzbpq0.zzp(), zzbpq0.zzm(), zzbpq0.zze(), zzbpq0.zzn(), ((View)zzdif.zzam(zzbpq0.zzj())), zzbpq0.zzk(), null, null, -1.0, zzbpq0.zzh(), zzbpq0.zzl(), 0.0f);
        }
        catch(RemoteException remoteException0) {
            zzo.zzk("Failed to get native ad assets from content ad mapper", remoteException0);
            return null;
        }
    }

    @Nullable
    private static zzdie zzak(@Nullable zzeb zzeb0, @Nullable zzbpt zzbpt0) {
        return zzeb0 == null ? null : new zzdie(zzeb0, zzbpt0);
    }

    private static zzdif zzal(@Nullable zzeb zzeb0, zzbfp zzbfp0, @Nullable View view0, String s, List list0, String s1, Bundle bundle0, String s2, @Nullable View view1, IObjectWrapper iObjectWrapper0, @Nullable String s3, @Nullable String s4, double f, zzbfw zzbfw0, @Nullable String s5, float f1) {
        zzdif zzdif0 = new zzdif();
        zzdif0.zza = 6;
        zzdif0.zzb = zzeb0;
        zzdif0.zzc = zzbfp0;
        zzdif0.zzd = view0;
        zzdif0.zzZ("headline", s);
        zzdif0.zze = list0;
        zzdif0.zzZ("body", s1);
        zzdif0.zzh = bundle0;
        zzdif0.zzZ("call_to_action", s2);
        zzdif0.zzo = view1;
        zzdif0.zzq = iObjectWrapper0;
        zzdif0.zzZ("store", s3);
        zzdif0.zzZ("price", s4);
        zzdif0.zzr = f;
        zzdif0.zzs = zzbfw0;
        zzdif0.zzZ("advertiser", s5);
        zzdif0.zzR(f1);
        return zzdif0;
    }

    @Nullable
    private static Object zzam(@Nullable IObjectWrapper iObjectWrapper0) {
        return iObjectWrapper0 == null ? null : ObjectWrapper.unwrap(iObjectWrapper0);
    }

    public final float zzb() {
        synchronized(this) {
        }
        return this.zzx;
    }

    public final int zzc() {
        synchronized(this) {
        }
        return this.zza;
    }

    public final Bundle zzd() {
        synchronized(this) {
            if(this.zzh == null) {
                this.zzh = new Bundle();
            }
            return this.zzh;
        }
    }

    @Nullable
    public final View zze() {
        synchronized(this) {
        }
        return this.zzd;
    }

    @Nullable
    public final View zzf() {
        synchronized(this) {
        }
        return this.zzo;
    }

    @Nullable
    public final View zzg() {
        synchronized(this) {
        }
        return this.zzp;
    }

    @Nullable
    public final SimpleArrayMap zzh() {
        synchronized(this) {
        }
        return this.zzv;
    }

    public final SimpleArrayMap zzi() {
        synchronized(this) {
        }
        return this.zzw;
    }

    @Nullable
    public final zzeb zzj() {
        synchronized(this) {
        }
        return this.zzb;
    }

    @Nullable
    public final zzez zzk() {
        synchronized(this) {
        }
        return this.zzg;
    }

    @Nullable
    public final zzbfp zzl() {
        synchronized(this) {
        }
        return this.zzc;
    }

    @Nullable
    public final zzbfw zzm() {
        if(this.zze != null && !this.zze.isEmpty()) {
            Object object0 = this.zze.get(0);
            return object0 instanceof IBinder ? zzbfv.zzg(((IBinder)object0)) : null;
        }
        return null;
    }

    @Nullable
    public final zzbfw zzn() {
        synchronized(this) {
        }
        return this.zzs;
    }

    @Nullable
    public final zzbfw zzo() {
        synchronized(this) {
        }
        return this.zzt;
    }

    @Nullable
    public final zzcab zzp() {
        synchronized(this) {
        }
        return this.zzn;
    }

    @Nullable
    public final zzcex zzq() {
        synchronized(this) {
        }
        return this.zzj;
    }

    @Nullable
    public final zzcex zzr() {
        synchronized(this) {
        }
        return this.zzk;
    }

    @Nullable
    public final zzcex zzs() {
        synchronized(this) {
        }
        return this.zzi;
    }

    @Nullable
    public static zzdif zzt(zzbpt zzbpt0) {
        try {
            return zzdif.zzal(zzdif.zzak(zzbpt0.zzj(), zzbpt0), zzbpt0.zzk(), ((View)zzdif.zzam(zzbpt0.zzm())), zzbpt0.zzs(), zzbpt0.zzv(), zzbpt0.zzq(), zzbpt0.zzi(), zzbpt0.zzr(), ((View)zzdif.zzam(zzbpt0.zzn())), zzbpt0.zzo(), zzbpt0.zzu(), zzbpt0.zzt(), zzbpt0.zze(), zzbpt0.zzl(), zzbpt0.zzp(), zzbpt0.zzf());
        }
        catch(RemoteException remoteException0) {
            zzo.zzk("Failed to get native ad assets from unified ad mapper", remoteException0);
            return null;
        }
    }

    @Nullable
    public final zzecr zzu() {
        synchronized(this) {
        }
        return this.zzl;
    }

    @Nullable
    public final IObjectWrapper zzv() {
        synchronized(this) {
        }
        return this.zzq;
    }

    @Nullable
    public final t0 zzw() {
        synchronized(this) {
        }
        return this.zzm;
    }

    @Nullable
    public final String zzx() {
        synchronized(this) {
            return this.zzF("advertiser");
        }
    }

    @Nullable
    public final String zzy() {
        synchronized(this) {
            return this.zzF("body");
        }
    }

    @Nullable
    public final String zzz() {
        synchronized(this) {
            return this.zzF("call_to_action");
        }
    }
}

