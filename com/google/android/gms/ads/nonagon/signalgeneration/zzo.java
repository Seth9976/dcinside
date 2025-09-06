package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzdsb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzo {
    private final Map zza;
    private final Map zzb;
    private final Context zzc;
    private final zzdsb zzd;
    private final ExecutorService zze;

    zzo(Context context0, zzdsb zzdsb0, ExecutorService executorService0) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = context0;
        this.zzd = zzdsb0;
        this.zze = executorService0;
    }

    // 检测为 Lambda 实现
    final Object zza(AdRequest adRequest0, zzp zzp0) throws Exception [...]

    public final void zzb() {
        synchronized(this) {
            this.zzh(true);
            this.zzh(false);
        }
    }

    // 检测为 Lambda 实现
    final void zzc(boolean z) [...]

    // 检测为 Lambda 实现
    final void zzd(boolean z, boolean z1) [...]

    // 检测为 Lambda 实现
    final void zze(Object object0, Pair pair0) [...]

    final void zzf(boolean z, zzq zzq0) {
        synchronized(this) {
            Boolean boolean0 = Boolean.valueOf(z);
            zzq zzq1 = (zzq)this.zza.get(boolean0);
            if(zzq1 == null || zzq1.zze() || zzq1.zzb() == null || zzq0.zzb() != null) {
                this.zza.put(boolean0, zzq0);
            }
            long v1 = (long)(zzq0.zzb() == null ? ((Long)zzbeq.zze.zze()) : ((Long)zzbeq.zzd.zze()));
            zzl zzl0 = () -> this.zzj(z, zzq0.zzb() == null);
            zzbzw.zzd.schedule(zzl0, v1, TimeUnit.SECONDS);
            List list0 = (List)this.zzb.get(boolean0);
            ArrayList arrayList0 = new ArrayList();
            this.zzb.put(boolean0, arrayList0);
            if(list0 != null) {
                for(Object object0: list0) {
                    this.zzi(zzq0, ((Pair)object0), false);
                }
            }
        }
    }

    public final void zzg(Object object0, QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        synchronized(this) {
            zzk zzk0 = () -> {
                boolean z = false;
                if(object0 instanceof WebView) {
                    CookieManager cookieManager0 = zzv.zzr().zza(this.zzc);
                    if(cookieManager0 != null) {
                        z = cookieManager0.acceptThirdPartyCookies(((WebView)object0));
                    }
                }
                Boolean boolean0 = Boolean.valueOf(z);
                zzq zzq0 = (zzq)this.zza.get(boolean0);
                if(zzq0 != null && !zzq0.zze()) {
                    this.zzi(zzq0, new Pair(queryInfoGenerationCallback0, zzv.zzC().currentTimeMillis()), true);
                    return;
                }
                List list0 = (List)this.zzb.get(boolean0);
                if(list0 == null) {
                    list0 = new ArrayList();
                    this.zzb.put(boolean0, list0);
                }
                list0.add(new Pair(queryInfoGenerationCallback0, zzv.zzC().currentTimeMillis()));
            };
            zzbzw.zzf.execute(zzk0);
        }
    }

    private final void zzh(boolean z) {
        Boolean boolean0 = Boolean.valueOf(z);
        if(!this.zzb.containsKey(boolean0)) {
            ArrayList arrayList0 = new ArrayList();
            this.zzb.put(boolean0, arrayList0);
            zzm zzm0 = () -> this.zzj(z, false);
            this.zze.submit(zzm0);
        }
    }

    private final void zzi(zzq zzq0, Pair pair0, boolean z) {
        zzq0.zzd();
        QueryInfo queryInfo0 = zzq0.zzb();
        if(queryInfo0 == null) {
            ((QueryInfoGenerationCallback)pair0.first).onFailure(zzq0.zzc());
        }
        else {
            ((QueryInfoGenerationCallback)pair0.first).onSuccess(queryInfo0);
        }
        Pair pair1 = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", "BANNER");
        Pair pair3 = new Pair("rtype", "6");
        Pair pair4 = new Pair("scar", "true");
        Pair pair5 = new Pair("lat_ms", Long.toString(zzv.zzC().currentTimeMillis() - ((long)(((Long)pair0.second)))));
        Pair pair6 = new Pair("sgpc_h", Boolean.toString(z));
        zzaa.zzd(this.zzd, null, "sgpcr", new Pair[]{pair1, pair2, pair3, pair4, pair5, pair6, new Pair("sgpc_rs", Boolean.toString(zzq0.zzb() != null))});
    }

    private final void zzj(boolean z, boolean z1) {
        synchronized(this) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("query_info_type", "requester_type_6");
            bundle0.putBoolean("accept_3p_cookie", z);
            Boolean boolean0 = Boolean.valueOf(z);
            zzq zzq0 = (zzq)this.zza.get(boolean0);
            zzq zzq1 = (zzq)this.zza.get(boolean0);
            zzp zzp0 = new zzp(this, z, (z1 && zzq0 != null ? zzq0.zza() + 1 : 0), (zzq1 == null ? null : Boolean.valueOf(zzq1.zzf())), this.zzd);
            AdRequest adRequest0 = ((Builder)new Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle0)).build();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzkV)).booleanValue()) {
                zzn zzn0 = () -> {
                    QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequest0, zzp0);
                    return true;
                };
                this.zze.submit(zzn0);
                return;
            }
            QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequest0, zzp0);
        }
    }
}

