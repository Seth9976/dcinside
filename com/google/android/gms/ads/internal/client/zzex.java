package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration.Builder;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus.State;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzblv;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzfve;
import j..util.DesugarCollections;
import j..util.Map.-EL;
import j..util.Objects;
import j..util.Optional;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class zzex {
    public static final Set zza;
    private static zzex zzb;
    private final Object zzc;
    private final Object zzd;
    private final ArrayList zze;
    private boolean zzf;
    private boolean zzg;
    private final Object zzh;
    private zzcz zzi;
    @Nullable
    private OnAdInspectorClosedListener zzj;
    @NonNull
    private RequestConfiguration zzk;

    static {
        zzex.zza = new HashSet(Arrays.asList(new AdFormat[]{AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED}));
    }

    private zzex() {
        this.zzc = new Object();
        this.zzd = new Object();
        this.zzf = false;
        this.zzg = false;
        this.zzh = new Object();
        this.zzj = null;
        this.zzk = new Builder().build();
        this.zze = new ArrayList();
    }

    private static InitializationStatus zzA(List list0) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            hashMap0.put(((zzbln)object0).zza, new zzblv((((zzbln)object0).zzb ? State.READY : State.NOT_READY), ((zzbln)object0).zzd, ((zzbln)object0).zzc));
        }
        return new zzblw(hashMap0);
    }

    private final void zzB(Context context0, @Nullable String s) {
        try {
            zzbow.zza().zzb(context0, null);
            this.zzi.zzk();
            this.zzi.zzl(null, ObjectWrapper.wrap(null));
        }
        catch(RemoteException remoteException0) {
            zzo.zzk("MobileAdsSettingManager initialization failed", remoteException0);
        }
    }

    private final void zzC(Context context0) {
        if(this.zzi == null) {
            this.zzi = (zzcz)new zzav(zzbc.zza(), context0).zzd(context0, false);
        }
    }

    private final void zzD(@NonNull RequestConfiguration requestConfiguration0) {
        try {
            this.zzi.zzu(new zzfv(requestConfiguration0));
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Unable to set request configuration parcel.", remoteException0);
        }
    }

    public final float zza() {
        synchronized(this.zzh) {
            zzcz zzcz0 = this.zzi;
            float f = 1.0f;
            if(zzcz0 == null) {
                return 1.0f;
            }
            try {
                f = zzcz0.zze();
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to get app volume.", remoteException0);
            }
            return f;
        }
    }

    @NonNull
    public final RequestConfiguration zzc() {
        return this.zzk;
    }

    public final InitializationStatus zze() {
        synchronized(this.zzh) {
            Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                return zzex.zzA(this.zzi.zzg());
            }
            catch(RemoteException unused_ex) {
                zzo.zzg("Unable to get Initialization status.");
                return new zzem(this);
            }
        }
    }

    public static zzex zzf() {
        synchronized(zzex.class) {
            if(zzex.zzb == null) {
                zzex.zzb = new zzex();
            }
            return zzex.zzb;
        }
    }

    public final Status zzg(@NonNull Context context0, @NonNull List list0, @NonNull PreloadCallback preloadCallback0) {
        int v6;
        int v4;
        int v3;
        Status status0;
        HashSet hashSet0 = new HashSet();
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            String s = ((PreloadConfiguration)object0).getAdFormat() + "#" + ((PreloadConfiguration)object0).getAdUnitId();
            hashMap0.put(s, ((int)(((int)(((Integer)Map.-EL.getOrDefault(hashMap0, s, 0)))) + 1)));
        }
        boolean z = false;
        for(Object object1: hashMap0.entrySet()) {
            if(((int)(((Integer)((Map.Entry)object1).getValue()))) > 1) {
                hashSet0.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z = true;
                break;
            }
        }
        HashMap hashMap1 = new HashMap();
        for(Object object2: list0) {
            PreloadConfiguration preloadConfiguration0 = (PreloadConfiguration)object2;
            AdFormat adFormat0 = preloadConfiguration0.getAdFormat();
            if(zzex.zza.contains(preloadConfiguration0.getAdFormat())) {
                Map.-EL.compute(hashMap1, adFormat0, new zzen());
                if(preloadConfiguration0.getBufferSize() > 15) {
                    hashSet0.add(String.format(Locale.US, "Preload configurations\' buffer size exceeds the maximum limit %d for %s", 15, adFormat0.name()));
                }
                else {
                    if(preloadConfiguration0.getBufferSize() >= 0) {
                        continue;
                    }
                    hashSet0.add(String.format(Locale.US, "Preload configurations\' buffer size less than 0 for %s", adFormat0.name()));
                }
            }
            else {
                hashSet0.add("PreloadConfiguration ad format is not supported:" + preloadConfiguration0.getAdFormat());
            }
            z = true;
        }
        Integer integer0 = (Integer)zzbe.zzc().zza(zzbcl.zzeB);
        Integer integer1 = (Integer)zzbe.zzc().zza(zzbcl.zzez);
        Integer integer2 = (Integer)zzbe.zzc().zza(zzbcl.zzeA);
        Map.Entry[] arr_map$Entry = {new AbstractMap.SimpleEntry(AdFormat.APP_OPEN_AD, integer0), new AbstractMap.SimpleEntry(AdFormat.INTERSTITIAL, integer1), new AbstractMap.SimpleEntry(AdFormat.REWARDED, integer2)};
        HashMap hashMap2 = new HashMap(3);
        int v = 0;
        while(v < 3) {
            Map.Entry map$Entry0 = arr_map$Entry[v];
            Object object3 = map$Entry0.getKey();
            Objects.requireNonNull(object3);
            Object object4 = map$Entry0.getValue();
            Objects.requireNonNull(object4);
            if(hashMap2.put(object3, object4) == null) {
                ++v;
                continue;
            }
            object3.toString();
            throw new IllegalArgumentException("duplicate key: " + object3);
        }
        Map map0 = DesugarCollections.unmodifiableMap(hashMap2);
        for(Object object5: hashMap1.entrySet()) {
            AdFormat adFormat1 = (AdFormat)((Map.Entry)object5).getKey();
            int v1 = (int)(((Integer)((Map.Entry)object5).getValue()));
            Integer integer3 = (Integer)Map.-EL.getOrDefault(map0, adFormat1, 0);
            if(v1 > ((int)integer3)) {
                hashSet0.add(String.format(Locale.US, "Preload configurations\' size exceeds the maximum limit %d for %s", integer3, adFormat1.name()));
                z = true;
            }
        }
        if(z) {
            StringBuilder stringBuilder0 = new StringBuilder();
            Iterator iterator4 = hashSet0.iterator();
            while(iterator4.hasNext()) {
                Object object6 = iterator4.next();
                stringBuilder0.append(((String)object6));
                if(iterator4.hasNext()) {
                    stringBuilder0.append(", ");
                }
            }
            String s1 = stringBuilder0.toString();
            zzo.zzg(s1);
            status0 = new Status(13, s1);
        }
        else {
            status0 = Status.RESULT_SUCCESS;
        }
        String s2 = status0.getStatusMessage();
        if(s2 == null) {
            s2 = "";
        }
        Preconditions.checkArgument(status0.isSuccess(), s2);
        zzbcl.zza(context0);
        synchronized(this.zzd) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object8: list0) {
                PreloadConfiguration preloadConfiguration1 = (PreloadConfiguration)object8;
                zzm zzm0 = zzr.zza.zza(context0, preloadConfiguration1.getAdRequest().zza());
                zzm0.zzc.putBoolean("is_sdk_preload", true);
                if(preloadConfiguration1.getBufferSize() <= 0) {
                    switch(preloadConfiguration1.getAdFormat().ordinal()) {
                        case 1: {
                            v3 = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzF)));
                            break;
                        }
                        case 2: {
                            v3 = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzG)));
                            break;
                        }
                        case 5: {
                            v3 = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzE)));
                            break;
                        }
                        default: {
                            v3 = 1;
                        }
                    }
                }
                else {
                    v3 = preloadConfiguration1.getBufferSize();
                }
                switch(preloadConfiguration1.getAdFormat().ordinal()) {
                    case 1: {
                        v4 = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzC)));
                        break;
                    }
                    case 2: {
                        v4 = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzD)));
                        break;
                    }
                    case 5: {
                        v4 = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzB)));
                        break;
                    }
                    default: {
                        v4 = 1;
                    }
                }
                int v5 = Math.max(Math.min(v4, 15), 1);
                switch(preloadConfiguration1.getAdFormat().ordinal()) {
                    case 1: {
                        v6 = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzI)));
                        break;
                    }
                    case 2: {
                        v6 = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzJ)));
                        break;
                    }
                    case 5: {
                        v6 = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzH)));
                        break;
                    }
                    default: {
                        v6 = 1;
                    }
                }
                arrayList0.add(new zzft(preloadConfiguration1.getAdUnitId(), preloadConfiguration1.getAdFormat().getValue(), zzm0, Math.max(Math.min(v3, v5), Math.min(v6, v5))));
            }
            try {
                zzb.zza(context0).zzi(arrayList0, new zzes(this, preloadCallback0));
                return Status.RESULT_SUCCESS;
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to start preload.", remoteException0);
                return Status.RESULT_INTERNAL_ERROR;
            }
        }
    }

    public final String zzi() {
        synchronized(this.zzh) {
            Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                return zzfve.zzc(this.zzi.zzf());
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to get internal version.", remoteException0);
                return "";
            }
        }
    }

    static Optional zzk(zzex zzex0, zzft zzft0) {
        String s = zzft0.zza;
        AdFormat adFormat0 = AdFormat.getAdFormat(zzft0.zzb);
        if(adFormat0 == null) {
            return Optional.empty();
        }
        zzm zzm0 = zzft0.zzc;
        com.google.android.gms.ads.AdRequest.Builder adRequest$Builder0 = new com.google.android.gms.ads.AdRequest.Builder();
        List list0 = zzm0.zze;
        if(list0 != null) {
            for(Object object0: list0) {
                adRequest$Builder0.addKeyword(((String)object0));
            }
        }
        adRequest$Builder0.zzc(zzm0.zzm);
        for(Object object1: zzm0.zzn.keySet()) {
            adRequest$Builder0.addCustomTargeting(((String)object1), zzm0.zzn.getString(((String)object1)));
        }
        adRequest$Builder0.setAdString(zzm0.zzx);
        Optional.ofNullable(zzm0.zzl).ifPresent(new zzq(adRequest$Builder0));
        adRequest$Builder0.setNeighboringContentUrls(zzm0.zzv);
        adRequest$Builder0.setRequestAgent(zzm0.zzp);
        AdRequest adRequest0 = adRequest$Builder0.build();
        com.google.android.gms.ads.preload.PreloadConfiguration.Builder preloadConfiguration$Builder0 = new com.google.android.gms.ads.preload.PreloadConfiguration.Builder(s, adFormat0);
        preloadConfiguration$Builder0.setAdRequest(adRequest0);
        preloadConfiguration$Builder0.setBufferSize(zzft0.zzd);
        return Optional.of(preloadConfiguration$Builder0.build());
    }

    static void zzl(zzex zzex0, boolean z) {
        zzex0.zzg = true;
    }

    static void zzm(zzex zzex0, boolean z) {
        zzex0.zzf = false;
    }

    public final void zzn(Context context0) {
        synchronized(this.zzh) {
            this.zzC(context0);
            try {
                this.zzi.zzi();
            }
            catch(RemoteException unused_ex) {
                zzo.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzo(Context context0, @Nullable String s, @Nullable OnInitializationCompleteListener onInitializationCompleteListener0) {
        synchronized(this.zzc) {
            if(this.zzf) {
                if(onInitializationCompleteListener0 != null) {
                    this.zze.add(onInitializationCompleteListener0);
                }
                return;
            }
            if(this.zzg) {
                if(onInitializationCompleteListener0 != null) {
                    onInitializationCompleteListener0.onInitializationComplete(this.zze());
                }
                return;
            }
            this.zzf = true;
            if(onInitializationCompleteListener0 != null) {
                this.zze.add(onInitializationCompleteListener0);
            }
        }
        if(context0 == null) {
            throw new IllegalArgumentException("Context cannot be null.");
        }
        synchronized(this.zzh) {
            try {
                this.zzC(context0);
                this.zzi.zzs(new zzev(this, null));
                this.zzi.zzo(new zzbpa());
                if(this.zzk.getTagForChildDirectedTreatment() != -1 || this.zzk.getTagForUnderAgeOfConsent() != -1) {
                    this.zzD(this.zzk);
                }
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("MobileAdsSettingManager initialization failed", remoteException0);
            }
        }
        zzbcl.zza(context0);
        if(((Boolean)zzbej.zza.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzkZ)).booleanValue()) {
            zzo.zze("Initializing on bg thread");
            zzeo zzeo0 = () -> synchronized(this.zzh) {
                this.zzB(context0, null);
            };
            com.google.android.gms.ads.internal.util.client.zzb.zza.execute(zzeo0);
        }
        else if(!((Boolean)zzbej.zzb.zze()).booleanValue() || !((Boolean)zzbe.zzc().zza(zzbcl.zzkZ)).booleanValue()) {
            zzo.zze("Initializing on calling thread");
            this.zzB(context0, null);
        }
        else {
            zzep zzep0 = () -> synchronized(this.zzh) {
                this.zzB(context0, null);
            };
            com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(zzep0);
        }
    }

    // 检测为 Lambda 实现
    final void zzp(Context context0, String s) [...]

    // 检测为 Lambda 实现
    final void zzq(Context context0, String s) [...]

    public final void zzr(Context context0, OnAdInspectorClosedListener onAdInspectorClosedListener0) {
        synchronized(this.zzh) {
            this.zzC(context0);
            this.zzj = onAdInspectorClosedListener0;
            try {
                this.zzi.zzm(new zzeu(null));
            }
            catch(RemoteException unused_ex) {
                zzo.zzg("Unable to open the ad inspector.");
                if(onAdInspectorClosedListener0 != null) {
                    onAdInspectorClosedListener0.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", "com.google.android.gms.ads"));
                }
            }
        }
    }

    public final void zzs(Context context0, String s) {
        synchronized(this.zzh) {
            Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzi.zzn(ObjectWrapper.wrap(context0), s);
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to open debug menu.", remoteException0);
            }
        }
    }

    public final void zzt(Class class0) {
        synchronized(this.zzh) {
            try {
                this.zzi.zzh(class0.getCanonicalName());
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to register RtbAdapter", remoteException0);
            }
        }
    }

    public final void zzu(boolean z) {
        synchronized(this.zzh) {
            Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzi.zzp(z);
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to set app mute state.", remoteException0);
            }
        }
    }

    public final void zzv(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized(this.zzh) {
            if(this.zzi == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzi.zzq(f);
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to set app volume.", remoteException0);
            }
        }
    }

    public final void zzw(String s) {
        synchronized(this.zzh) {
            Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzi.zzt(s);
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to set plugin.", remoteException0);
            }
        }
    }

    public final void zzx(@NonNull RequestConfiguration requestConfiguration0) {
        Preconditions.checkArgument(requestConfiguration0 != null, "Null passed to setRequestConfiguration.");
        synchronized(this.zzh) {
            RequestConfiguration requestConfiguration1 = this.zzk;
            this.zzk = requestConfiguration0;
            if(this.zzi == null) {
                return;
            }
            if(requestConfiguration1.getTagForChildDirectedTreatment() != requestConfiguration0.getTagForChildDirectedTreatment() || requestConfiguration1.getTagForUnderAgeOfConsent() != requestConfiguration0.getTagForUnderAgeOfConsent()) {
                this.zzD(requestConfiguration0);
            }
        }
    }

    public final boolean zzy() {
        synchronized(this.zzh) {
            zzcz zzcz0 = this.zzi;
            boolean z = false;
            if(zzcz0 == null) {
                return false;
            }
            try {
                z = zzcz0.zzv();
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to get app mute state.", remoteException0);
            }
            return z;
        }
    }

    public final boolean zzz(boolean z) {
        synchronized(this.zzh) {
            Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
            try {
                this.zzi.zzj(z);
                return true;
            }
            catch(RemoteException remoteException0) {
                zzo.zzh(("Unable to " + (z ? "enable" : "disable") + " the publisher first-party ID."), remoteException0);
                return false;
            }
        }
    }
}

