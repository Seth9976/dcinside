package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzava;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbuc;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcgx;
import com.google.android.gms.internal.ads.zzcva;
import com.google.android.gms.internal.ads.zzdbk;
import com.google.android.gms.internal.ads.zzdnl;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzfch;
import com.google.android.gms.internal.ads.zzfcn;
import com.google.android.gms.internal.ads.zzfdi;
import com.google.android.gms.internal.ads.zzfgv;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfhk;
import com.google.android.gms.internal.ads.zzfja;
import com.google.android.gms.internal.ads.zzfve;
import com.google.android.gms.internal.ads.zzgby;
import com.google.android.gms.internal.ads.zzgch;
import com.google.android.gms.internal.ads.zzgcs;
import com.google.common.util.concurrent.t0;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public final class zzau extends zzbyt {
    private final String zzA;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final AtomicBoolean zzF;
    private final AtomicBoolean zzG;
    private final AtomicInteger zzH;
    private final zzbdq zzI;
    private final zzo zzJ;
    private final zzf zzK;
    protected static final List zza;
    protected static final List zzb;
    protected static final List zzc;
    protected static final List zzd;
    public static final int zze;
    private final zzcgx zzf;
    private Context zzg;
    private final zzava zzh;
    private final zzfcn zzi;
    private final zzfdi zzj;
    private final zzgcs zzk;
    private final ScheduledExecutorService zzl;
    @Nullable
    private zzbuc zzm;
    private Point zzn;
    private Point zzo;
    private final zzdsb zzp;
    private final zzfja zzq;
    private final boolean zzr;
    private final boolean zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final String zzv;
    private final String zzw;
    private final AtomicInteger zzx;
    private final VersionInfoParcel zzy;
    private String zzz;

    static {
        zzau.zza = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click", "/dbm/clk"}));
        zzau.zzb = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));
        zzau.zzc = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"}));
        zzau.zzd = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));
    }

    zzau(zzcgx zzcgx0, Context context0, zzava zzava0, zzfdi zzfdi0, zzgcs zzgcs0, ScheduledExecutorService scheduledExecutorService0, zzdsb zzdsb0, zzfja zzfja0, VersionInfoParcel versionInfoParcel0, zzbdq zzbdq0, zzfcn zzfcn0, zzo zzo0, zzf zzf0) {
        List list0;
        this.zzn = new Point();
        this.zzo = new Point();
        this.zzx = new AtomicInteger(0);
        this.zzF = new AtomicBoolean(false);
        this.zzG = new AtomicBoolean(false);
        this.zzH = new AtomicInteger(0);
        this.zzf = zzcgx0;
        this.zzg = context0;
        this.zzh = zzava0;
        this.zzi = zzfcn0;
        this.zzj = zzfdi0;
        this.zzk = zzgcs0;
        this.zzl = scheduledExecutorService0;
        this.zzp = zzdsb0;
        this.zzq = zzfja0;
        this.zzy = versionInfoParcel0;
        this.zzI = zzbdq0;
        this.zzr = ((Boolean)zzbe.zzc().zza(zzbcl.zzha)).booleanValue();
        this.zzs = ((Boolean)zzbe.zzc().zza(zzbcl.zzgZ)).booleanValue();
        this.zzt = ((Boolean)zzbe.zzc().zza(zzbcl.zzhc)).booleanValue();
        this.zzu = ((Boolean)zzbe.zzc().zza(zzbcl.zzhe)).booleanValue();
        this.zzv = (String)zzbe.zzc().zza(zzbcl.zzhd);
        this.zzw = (String)zzbe.zzc().zza(zzbcl.zzhf);
        this.zzA = (String)zzbe.zzc().zza(zzbcl.zzhg);
        this.zzJ = zzo0;
        this.zzK = zzf0;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhh)).booleanValue()) {
            this.zzB = zzau.zzaa(((String)zzbe.zzc().zza(zzbcl.zzhi)));
            this.zzC = zzau.zzaa(((String)zzbe.zzc().zza(zzbcl.zzhj)));
            this.zzD = zzau.zzaa(((String)zzbe.zzc().zza(zzbcl.zzhk)));
            list0 = zzau.zzaa(((String)zzbe.zzc().zza(zzbcl.zzhl)));
        }
        else {
            this.zzB = zzau.zza;
            this.zzC = zzau.zzb;
            this.zzD = zzau.zzc;
            list0 = zzau.zzd;
        }
        this.zzE = list0;
    }

    // 检测为 Lambda 实现
    final ArrayList zzB(List list0, String s) [...]

    // 检测为 Lambda 实现
    final ArrayList zzC(List list0, IObjectWrapper iObjectWrapper0) throws Exception [...]

    static void zzH(zzau zzau0, List list0) {
        for(Object object0: list0) {
            if(zzau0.zzO(((Uri)object0))) {
                zzau0.zzx.getAndIncrement();
                return;
            }
            if(false) {
                break;
            }
        }
    }

    // 检测为 Lambda 实现
    final void zzJ(zzdnl[] arr_zzdnl) [...]

    @VisibleForTesting
    final boolean zzO(@NonNull Uri uri0) {
        return zzau.zzX(uri0, this.zzB, this.zzC);
    }

    @VisibleForTesting
    final boolean zzP(@NonNull Uri uri0) {
        return zzau.zzX(uri0, this.zzD, this.zzE);
    }

    // 检测为 Lambda 实现
    static final Uri zzQ(Uri uri0, String s) [...]

    private final zzac zzR(Context context0, String s, String s1, zzs zzs0, zzm zzm0, int v, @Nullable String s2, Bundle bundle0, @Nullable zzbyy zzbyy0) {
        zzs zzs1;
        zzfch zzfch0 = new zzfch();
        if("REWARDED".equals(s1)) {
            zzfch0.zzp().zza(2);
        }
        else if("REWARDED_INTERSTITIAL".equals(s1)) {
            zzfch0.zzp().zza(3);
        }
        zzab zzab0 = this.zzf.zzp();
        zzcva zzcva0 = new zzcva();
        zzcva0.zzf(context0);
        zzfch0.zzt((s == null ? "adUnitId" : s));
        zzfch0.zzH((zzm0 == null ? new zzn().zza() : zzm0));
        if(zzs0 == null) {
            switch(s1) {
                case "APP_OPEN_AD": {
                    zzs1 = zzs.zzb();
                    break;
                }
                case "BANNER": {
                    zzs1 = new zzs(context0, AdSize.BANNER);
                    break;
                }
                case "NATIVE": {
                    zzs1 = zzs.zzc();
                    break;
                }
                case "REWARDED": {
                    zzs1 = zzs.zzd();
                    break;
                }
                case "REWARDED_INTERSTITIAL": {
                    zzs1 = zzs.zzd();
                    break;
                }
                default: {
                    zzs1 = new zzs();
                }
            }
        }
        else {
            zzs1 = zzs0;
        }
        zzfch0.zzs(zzs1);
        zzfch0.zzz(true);
        zzfch0.zzA(bundle0);
        zzcva0.zzk(zzfch0.zzJ());
        zzcva0.zzi(v);
        zzab0.zza(zzcva0.zzl());
        zzax zzax0 = new zzax();
        zzax0.zzb(s1);
        zzax0.zzc(s2);
        zzax0.zzd(zzbyy0);
        zzab0.zzb(new zzaz(zzax0, null));
        new zzdbk();
        return zzab0.zzc();
    }

    private final t0 zzS(String s) {
        zzdnl[] arr_zzdnl = new zzdnl[1];
        t0 t00 = zzgch.zzn(this.zzj.zza(), (zzdnl zzdnl0) -> {
            arr_zzdnl[0] = zzdnl0;
            Map map0 = this.zzm.zzb;
            JSONObject jSONObject0 = zzbv.zzd(this.zzg, map0, map0, this.zzm.zza, null);
            JSONObject jSONObject1 = zzbv.zzg(this.zzg, this.zzm.zza);
            JSONObject jSONObject2 = zzbv.zzf(this.zzm.zza);
            JSONObject jSONObject3 = zzbv.zze(this.zzg, this.zzm.zza);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("asset_view_signal", jSONObject0);
            jSONObject4.put("ad_view_signal", jSONObject1);
            jSONObject4.put("scroll_view_signal", jSONObject2);
            jSONObject4.put("lock_screen_signal", jSONObject3);
            if("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(s)) {
                jSONObject4.put("click_signal", zzbv.zzc(null, this.zzg, this.zzo, this.zzn));
            }
            return zzdnl0.zzg(s, jSONObject4);
        }, this.zzk);
        t00.addListener(() -> {
            zzdnl zzdnl0 = arr_zzdnl[0];
            if(zzdnl0 != null) {
                t0 t00 = zzgch.zzh(zzdnl0);
                this.zzj.zzb(t00);
            }
        }, this.zzk);
        zzgby zzgby0 = (zzgby)zzgch.zzm(((zzgby)zzgch.zzo(zzgby.zzu(t00), ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzhy)))))), TimeUnit.MILLISECONDS, this.zzl)), new zzam(), this.zzk);
        zzan zzan0 = new zzan();
        return (zzgby)zzgch.zze(zzgby0, Exception.class, zzan0, this.zzk);
    }

    private final void zzT() {
        if(((Boolean)zzbeq.zzc.zze()).booleanValue()) {
            this.zzJ.zzb();
            return;
        }
        zzgch.zzr((((Boolean)zzbe.zzc().zza(zzbcl.zzkV)).booleanValue() ? zzgch.zzk(() -> // 去混淆评级： 低(20)
        this.zzR(this.zzg, null, "BANNER", null, null, 0, null, new Bundle(), null).zzb(), zzbzw.zza) : this.zzR(this.zzg, null, "BANNER", null, null, 0, null, new Bundle(), null).zzb()), new zzat(this), this.zzf.zzC());
    }

    private final void zzU() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzju)).booleanValue() && !((Boolean)zzbe.zzc().zza(zzbcl.zzjx)).booleanValue() && (!((Boolean)zzbe.zzc().zza(zzbcl.zzjB)).booleanValue() || !this.zzF.getAndSet(true))) {
            this.zzT();
        }
    }

    private final void zzV(List list0, IObjectWrapper iObjectWrapper0, zzbtt zzbtt0, boolean z) {
        t0 t00;
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzhx)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The updating URL feature is not enabled.");
            try {
                zzbtt0.zze("The updating URL feature is not enabled.");
            }
            catch(RemoteException remoteException0) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", remoteException0);
            }
            return;
        }
        int v = 0;
        for(Object object0: list0) {
            if(this.zzO(((Uri)object0))) {
                ++v;
            }
        }
        if(v > 1) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(("Multiple google urls found: " + list0));
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: list0) {
            Uri uri0 = (Uri)object1;
            if(this.zzO(uri0)) {
                zzah zzah0 = () -> {
                    try {
                        if(((Boolean)zzbe.zzc().zza(zzbcl.zzlR)).booleanValue()) {
                            zzfcn zzfcn0 = this.zzi;
                            if(zzfcn0 != null) {
                                uri0 = zzfcn0.zza(uri0, this.zzg, ((View)ObjectWrapper.unwrap(iObjectWrapper0)), null);
                                goto label_11;
                            }
                            goto label_5;
                        }
                        else {
                        label_5:
                            Context context0 = this.zzg;
                            View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
                            uri0 = this.zzh.zza(uri0, context0, view0, null);
                        }
                    }
                    catch(zzavb zzavb0) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzk("", zzavb0);
                    }
                label_11:
                    if(uri0.getQueryParameter("ms") == null) {
                        throw new Exception("Failed to append spam signals to click url.");
                    }
                    return uri0;
                };
                t00 = this.zzk.zzb(zzah0);
                if(this.zzY()) {
                    t00 = zzgch.zzn(t00, (Uri uri0) -> zzgch.zzm(this.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), (String s) -> (TextUtils.isEmpty(s) ? uri0 : zzau.zzZ(uri0, "nas", s)), this.zzk), this.zzk);
                }
                else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Asset view map is empty.");
                }
            }
            else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj(("Not a Google URL: " + uri0));
                t00 = zzgch.zzh(uri0);
            }
            arrayList0.add(t00);
        }
        zzgch.zzr(zzgch.zzd(arrayList0), new zzas(this, zzbtt0, z), this.zzf.zzC());
    }

    private final void zzW(List list0, IObjectWrapper iObjectWrapper0, zzbtt zzbtt0, boolean z) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzhx)).booleanValue()) {
            try {
                zzbtt0.zze("The updating URL feature is not enabled.");
            }
            catch(RemoteException remoteException0) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", remoteException0);
            }
            return;
        }
        zzao zzao0 = () -> {
            String s = this.zzh.zzc() == null ? "" : this.zzh.zzc().zzh(this.zzg, ((View)ObjectWrapper.unwrap(iObjectWrapper0)), null);
            if(TextUtils.isEmpty(s)) {
                throw new Exception("Failed to get view signals.");
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                Uri uri0 = (Uri)object0;
                if(this.zzP(uri0)) {
                    arrayList0.add(zzau.zzZ(uri0, "ms", s));
                }
                else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj(("Not a Google URL: " + uri0));
                    arrayList0.add(uri0);
                }
            }
            if(arrayList0.isEmpty()) {
                throw new Exception("Empty impression URLs result.");
            }
            return arrayList0;
        };
        t0 t00 = this.zzk.zzb(zzao0);
        if(this.zzY()) {
            t00 = zzgch.zzn(t00, (ArrayList arrayList0) -> zzgch.zzm(this.zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), (String s) -> {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: arrayList0) {
                    Uri uri0 = (Uri)object0;
                    if(this.zzP(uri0) && !TextUtils.isEmpty(s)) {
                        arrayList0.add(zzau.zzZ(uri0, "nas", s));
                    }
                    else {
                        arrayList0.add(uri0);
                    }
                }
                return arrayList0;
            }, this.zzk), this.zzk);
        }
        else {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Asset view map is empty.");
        }
        zzgch.zzr(t00, new zzar(this, zzbtt0, z), this.zzf.zzC());
    }

    private static boolean zzX(@NonNull Uri uri0, List list0, List list1) {
        String s = uri0.getHost();
        String s1 = uri0.getPath();
        if(s != null && s1 != null) {
            for(Object object0: list0) {
                if(s1.contains(((String)object0))) {
                    for(Object object1: list1) {
                        if(s.endsWith(((String)object1))) {
                            return true;
                        }
                        if(false) {
                            break;
                        }
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzY() {
        return this.zzm != null && (this.zzm.zzb != null && !this.zzm.zzb.isEmpty());
    }

    private static final Uri zzZ(Uri uri0, String s, String s1) {
        String s2 = uri0.toString();
        int v = s2.indexOf("&adurl=");
        if(v == -1) {
            v = s2.indexOf("?adurl=");
        }
        return v == -1 ? uri0.buildUpon().appendQueryParameter(s, s1).build() : Uri.parse((s2.substring(0, v + 1) + s + "=" + s1 + "&" + s2.substring(v + 1)));
    }

    private static final List zzaa(String s) {
        String[] arr_s = TextUtils.split(s, ",");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(!zzfve.zzd(s1)) {
                list0.add(s1);
            }
        }
        return list0;
    }

    static Uri zzd(zzau zzau0, Uri uri0, String s, String s1) {
        return zzau.zzZ(uri0, s, "1");
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, String s, IObjectWrapper iObjectWrapper2) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzjH)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        CustomTabsClient customTabsClient0 = (CustomTabsClient)ObjectWrapper.unwrap(iObjectWrapper1);
        CustomTabsCallback customTabsCallback0 = (CustomTabsCallback)ObjectWrapper.unwrap(iObjectWrapper2);
        this.zzI.zzg(context0, customTabsClient0, s, customTabsCallback0);
        if(((Boolean)zzbeq.zzc.zze()).booleanValue()) {
            this.zzJ.zzb();
        }
        if(((Boolean)zzbeq.zza.zze()).booleanValue()) {
            this.zzK.zzb();
        }
        return ObjectWrapper.wrap(this.zzI.zzb());
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final void zzf(IObjectWrapper iObjectWrapper0, zzbyy zzbyy0, @Nullable zzbyr zzbyr0) {
        t0 t02;
        t0 t01;
        t0 t00;
        int v;
        Bundle bundle0 = new Bundle();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            bundle0.putLong("api-call", zzbyy0.zzd.zzz);
            bundle0.putLong("dynamite-enter", zzv.zzC().currentTimeMillis());
        }
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        this.zzg = context0;
        zzfgw zzfgw0 = zzfgv.zza(context0, 22);
        zzfgw0.zzi();
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzhq)).booleanValue() || !zzbyy0.zzd.zzc.getBoolean("optimize_for_app_start", false)) {
            v = 0;
        }
        else if(Objects.equals(zzaa.zzc(zzbyy0.zzd), "requester_type_8")) {
            v = zzbyy0.zze == 2 ? 2 : 1;
        }
        else {
            v = 0;
        }
        if("UNKNOWN".equals(zzbyy0.zzb)) {
            List list0 = new ArrayList();
            zzbcc zzbcc0 = zzbcl.zzhp;
            if(!((String)zzbe.zzc().zza(zzbcc0)).isEmpty()) {
                list0 = Arrays.asList(((String)zzbe.zzc().zza(zzbcc0)).split(","));
            }
            if(list0.contains(zzaa.zzc(zzbyy0.zzd))) {
                t00 = zzgch.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                t01 = zzgch.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                zzgch.zzr(t01, new zzaq(this, t00, zzbyy0, zzbyr0, zzfgw0), this.zzf.zzC());
                return;
            }
            goto label_24;
        }
        else {
        label_24:
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzkV)).booleanValue()) {
                zzak zzak0 = () -> this.zzR(this.zzg, zzbyy0.zza, zzbyy0.zzb, zzbyy0.zzc, zzbyy0.zzd, v, zzbyy0.zzf, bundle0, zzbyy0);
                t02 = zzbzw.zza.zzb(zzak0);
                t01 = zzgch.zzn(t02, new zzal(), zzbzw.zza);
            }
            else {
                zzac zzac0 = this.zzR(this.zzg, zzbyy0.zza, zzbyy0.zzb, zzbyy0.zzc, zzbyy0.zzd, v, zzbyy0.zzf, bundle0, zzbyy0);
                t02 = zzgch.zzh(zzac0);
                t01 = zzac0.zzb();
            }
            t00 = t02;
        }
        zzgch.zzr(t01, new zzaq(this, t00, zzbyy0, zzbyr0, zzfgw0), this.zzf.zzC());
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final void zzg(zzbuc zzbuc0) {
        this.zzm = zzbuc0;
        this.zzj.zzc(1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final void zzh(List list0, IObjectWrapper iObjectWrapper0, zzbtt zzbtt0) {
        this.zzV(list0, iObjectWrapper0, zzbtt0, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final void zzi(List list0, IObjectWrapper iObjectWrapper0, zzbtt zzbtt0) {
        this.zzW(list0, iObjectWrapper0, zzbtt0, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzj(IObjectWrapper iObjectWrapper0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjt)).booleanValue()) {
            zzbcc zzbcc0 = zzbcl.zzho;
            if(!((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                this.zzU();
            }
            WebView webView0 = (WebView)ObjectWrapper.unwrap(iObjectWrapper0);
            if(webView0 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("The webView cannot be null.");
                return;
            }
            zzj zzj0 = new zzj(webView0, this.zzK, zzbzw.zzf);
            webView0.addJavascriptInterface(new TaggingLibraryJsInterface(webView0, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, this.zzK, zzj0), "gmaSdk");
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzjD)).booleanValue()) {
                zzv.zzp().zzs();
            }
            if(((Boolean)zzbeq.zza.zze()).booleanValue()) {
                this.zzK.zzb();
                if(((Boolean)zzbeq.zzb.zze()).booleanValue()) {
                    int v = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzjE)));
                    zzi zzi0 = new zzi(zzj0);
                    zzbzw.zzd.scheduleWithFixedDelay(zzi0, 0L, ((long)v), TimeUnit.MILLISECONDS);
                }
            }
            if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                this.zzU();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final void zzk(IObjectWrapper iObjectWrapper0) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzhx)).booleanValue()) {
            return;
        }
        MotionEvent motionEvent0 = (MotionEvent)ObjectWrapper.unwrap(iObjectWrapper0);
        this.zzn = zzbv.zza(motionEvent0, (this.zzm == null ? null : this.zzm.zza));
        if(motionEvent0.getAction() == 0) {
            this.zzo = this.zzn;
        }
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.setLocation(((float)this.zzn.x), ((float)this.zzn.y));
        this.zzh.zzd(motionEvent1);
        motionEvent1.recycle();
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final void zzl(List list0, IObjectWrapper iObjectWrapper0, zzbtt zzbtt0) {
        this.zzV(list0, iObjectWrapper0, zzbtt0, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final void zzm(List list0, IObjectWrapper iObjectWrapper0, zzbtt zzbtt0) {
        this.zzW(list0, iObjectWrapper0, zzbtt0, false);
    }

    // 检测为 Lambda 实现
    final Uri zzn(Uri uri0, IObjectWrapper iObjectWrapper0) throws Exception [...]

    // 检测为 Lambda 实现
    final zzac zzq(zzbyy zzbyy0, int v, Bundle bundle0) throws Exception [...]

    static zzfhh zzr(t0 t00, zzbyy zzbyy0) {
        if(zzfhk.zza() && ((Boolean)zzbee.zze.zze()).booleanValue()) {
            try {
                zzfhh zzfhh0 = ((zzac)zzgch.zzp(t00)).zza();
                zzfhh0.zzd(new ArrayList(Collections.singletonList(zzbyy0.zzb)));
                zzfhh0.zzb((zzbyy0.zzd == null ? "" : zzbyy0.zzd.zzp));
                zzfhh0.zzf(zzbyy0.zzd.zzm);
                return zzfhh0;
            }
            catch(ExecutionException executionException0) {
            }
            zzv.zzp().zzw(executionException0, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
        }
        return null;
    }

    // 检测为 Lambda 实现
    public static t0 zzt(zzau zzau0, Uri uri0) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    final t0 zzu() throws Exception [...]

    // 检测为 Lambda 实现
    final t0 zzv(zzdnl[] arr_zzdnl, String s, zzdnl zzdnl0) throws Exception [...]

    // 检测为 Lambda 实现
    final t0 zzw(ArrayList arrayList0) throws Exception [...]
}

