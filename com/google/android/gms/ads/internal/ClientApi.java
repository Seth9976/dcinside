package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzah;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbyu;
import com.google.android.gms.internal.ads.zzcgx;
import com.google.android.gms.internal.ads.zzdiz;
import com.google.android.gms.internal.ads.zzdjb;
import com.google.android.gms.internal.ads.zzdtg;
import com.google.android.gms.internal.ads.zzejq;
import com.google.android.gms.internal.ads.zzewo;
import com.google.android.gms.internal.ads.zzeyc;
import com.google.android.gms.internal.ads.zzezt;
import com.google.android.gms.internal.ads.zzfbh;
import java.util.HashMap;

public class ClientApi extends zzco {
    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbu zzb(IObjectWrapper iObjectWrapper0, String s, zzbpe zzbpe0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        return new zzejq(zzcgx.zzb(context0, zzbpe0, v), context0, s);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzc(IObjectWrapper iObjectWrapper0, zzs zzs0, String s, zzbpe zzbpe0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzewo zzewo0 = zzcgx.zzb(context0, zzbpe0, v).zzt();
        zzewo0.zza(s);
        zzewo0.zzb(context0);
        return zzewo0.zzc().zza();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzd(IObjectWrapper iObjectWrapper0, zzs zzs0, String s, zzbpe zzbpe0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzeyc zzeyc0 = zzcgx.zzb(context0, zzbpe0, v).zzu();
        zzeyc0.zzc(context0);
        zzeyc0.zza(zzs0);
        zzeyc0.zzb(s);
        return zzeyc0.zzd().zza();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zze(IObjectWrapper iObjectWrapper0, zzs zzs0, String s, zzbpe zzbpe0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzezt zzezt0 = zzcgx.zzb(context0, zzbpe0, v).zzv();
        zzezt0.zzc(context0);
        zzezt0.zza(zzs0);
        zzezt0.zzb(s);
        return zzezt0.zzd().zza();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzf(IObjectWrapper iObjectWrapper0, zzs zzs0, String s, int v) {
        return new zzu(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), zzs0, s, new VersionInfoParcel(244410000, v, true, false));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzci zzg(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v) {
        return zzcgx.zzb(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), zzbpe0, v).zzA();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzcz zzh(IObjectWrapper iObjectWrapper0, int v) {
        return zzcgx.zzb(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), null, v).zzc();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzdu zzi(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v) {
        return zzcgx.zzb(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), zzbpe0, v).zzm();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbga zzj(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1) {
        return new zzdjb(((FrameLayout)ObjectWrapper.unwrap(iObjectWrapper0)), ((FrameLayout)ObjectWrapper.unwrap(iObjectWrapper1)), 244410000);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbgg zzk(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) {
        return new zzdiz(((View)ObjectWrapper.unwrap(iObjectWrapper0)), ((HashMap)ObjectWrapper.unwrap(iObjectWrapper1)), ((HashMap)ObjectWrapper.unwrap(iObjectWrapper2)));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbkr zzl(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v, zzbko zzbko0) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzdtg zzdtg0 = zzcgx.zzb(context0, zzbpe0, v).zzk();
        zzdtg0.zzb(context0);
        zzdtg0.zza(zzbko0);
        return zzdtg0.zzc().zzd();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbsx zzm(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v) {
        return zzcgx.zzb(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), zzbpe0, v).zzn();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbte zzn(IObjectWrapper iObjectWrapper0) {
        Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
        AdOverlayInfoParcel adOverlayInfoParcel0 = AdOverlayInfoParcel.zza(activity0.getIntent());
        if(adOverlayInfoParcel0 == null) {
            return new zzw(activity0);
        }
        switch(adOverlayInfoParcel0.zzk) {
            case 1: {
                return new zzv(activity0);
            }
            case 2: {
                return new zzah(activity0);
            }
            case 3: {
                return new zzai(activity0);
            }
            case 4: {
                return new zzab(activity0, adOverlayInfoParcel0);
            }
            case 5: {
                return new zzaf(activity0);
            }
            default: {
                return new zzw(activity0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbvz zzo(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzfbh zzfbh0 = zzcgx.zzb(context0, zzbpe0, v).zzw();
        zzfbh0.zzb(context0);
        return zzfbh0.zzc().zzb();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbwp zzp(IObjectWrapper iObjectWrapper0, String s, zzbpe zzbpe0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzfbh zzfbh0 = zzcgx.zzb(context0, zzbpe0, v).zzw();
        zzfbh0.zzb(context0);
        zzfbh0.zza(s);
        return zzfbh0.zzc().zza();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbyu zzq(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v) {
        return zzcgx.zzb(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), zzbpe0, v).zzq();
    }
}

