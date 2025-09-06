package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Clock;
import j..util.Map.-EL;
import j..util.Objects;
import j..util.Optional;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.FIN;

public final class zzfjv {
    private final ConcurrentMap zza;
    private final ConcurrentMap zzb;
    private final zzfki zzc;
    private final zzfjp zzd;
    private final Context zze;
    @Nullable
    private volatile ConnectivityManager zzf;
    private final Clock zzg;
    private AtomicInteger zzh;

    zzfjv(zzfki zzfki0, zzfjp zzfjp0, Context context0, Clock clock0) {
        this.zza = new ConcurrentHashMap();
        this.zzb = new ConcurrentHashMap();
        this.zzc = zzfki0;
        this.zzd = zzfjp0;
        this.zze = context0;
        this.zzg = clock0;
    }

    @Nullable
    public final zzbad zza(String s) {
        synchronized(this) {
            return (zzbad)this.zzp(zzbad.class, s, AdFormat.APP_OPEN_AD).orElse(null);
        }
    }

    @Nullable
    public final zzby zzb(String s) {
        synchronized(this) {
            return (zzby)this.zzp(zzby.class, s, AdFormat.INTERSTITIAL).orElse(null);
        }
    }

    @Nullable
    public final zzbwp zzc(String s) {
        synchronized(this) {
            return (zzbwp)this.zzp(zzbwp.class, s, AdFormat.REWARDED).orElse(null);
        }
    }

    static String zzd(String s, @Nullable AdFormat adFormat0) {
        return adFormat0 == null ? s + "#" + "NULL" : s + "#" + adFormat0.name();
    }

    // 检测为 Lambda 实现
    final void zzg(AdFormat adFormat0, Optional optional0, Object object0) [...]

    public final void zzh() {
        if(this.zzf == null) {
            synchronized(this) {
                if(this.zzf == null) {
                    try {
                        this.zzf = (ConnectivityManager)this.zze.getSystemService("connectivity");
                    }
                    catch(ClassCastException classCastException0) {
                        zzo.zzk("Failed to get connectivity manager", classCastException0);
                    }
                }
            }
        }
        if(this.zzf != null) {
            try {
                this.zzf.registerDefaultNetworkCallback(new zzfju(this));
            }
            catch(RuntimeException runtimeException0) {
                zzo.zzk("Failed to register network callback", runtimeException0);
                this.zzh = new AtomicInteger(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzy)))));
            }
            return;
        }
        this.zzh = new AtomicInteger(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzy)))));
    }

    public final void zzi(zzbpe zzbpe0) {
        this.zzc.zzb(zzbpe0);
    }

    public final void zzj(List list0, zzcf zzcf0) {
        synchronized(this) {
            List list1 = this.zzo(list0);
            EnumMap enumMap0 = new EnumMap(AdFormat.class);
            for(Object object0: list1) {
                String s = ((zzft)object0).zza;
                AdFormat adFormat0 = AdFormat.getAdFormat(((zzft)object0).zzb);
                zzfkh zzfkh0 = this.zzc.zza(((zzft)object0), zzcf0);
                if(adFormat0 != null && zzfkh0 != null) {
                    AtomicInteger atomicInteger0 = this.zzh;
                    if(atomicInteger0 != null) {
                        zzfkh0.zzo(atomicInteger0.get());
                    }
                    zzfkh0.zzq(this.zzd);
                    this.zzq(zzfjv.zzd(s, adFormat0), zzfkh0);
                    enumMap0.put(adFormat0, ((int)(((int)(((Integer)Map.-EL.getOrDefault(enumMap0, adFormat0, 0)))) + 1)));
                }
            }
            long v1 = this.zzg.currentTimeMillis();
            this.zzd.zzf(enumMap0, v1);
            zzv.zzb().zzc(new zzfjt(this));
        }
    }

    public final boolean zzk(String s) {
        synchronized(this) {
            return this.zzt(s, AdFormat.APP_OPEN_AD);
        }
    }

    public final boolean zzl(String s) {
        synchronized(this) {
            return this.zzt(s, AdFormat.INTERSTITIAL);
        }
    }

    public final boolean zzm(String s) {
        synchronized(this) {
            return this.zzt(s, AdFormat.REWARDED);
        }
    }

    @Nullable
    private final zzfkh zzn(String s, AdFormat adFormat0) {
        synchronized(this) {
            String s1 = zzfjv.zzd(s, adFormat0);
            return (zzfkh)this.zza.get(s1);
        }
    }

    private final List zzo(List list0) {
        synchronized(this) {
            HashSet hashSet0 = new HashSet();
            List list1 = new ArrayList();
            for(Object object0: list0) {
                zzft zzft0 = (zzft)object0;
                AdFormat adFormat0 = AdFormat.getAdFormat(zzft0.zzb);
                String s = zzfjv.zzd(zzft0.zza, adFormat0);
                hashSet0.add(s);
                zzfkh zzfkh0 = (zzfkh)this.zza.get(s);
                if(zzfkh0 != null) {
                    if(zzfkh0.zze.equals(zzft0)) {
                        zzfkh0.zzs(zzft0.zzd);
                    }
                    else {
                        this.zzb.put(s, zzfkh0);
                        this.zza.remove(s);
                    }
                }
                else if(this.zzb.containsKey(s)) {
                    zzfkh zzfkh1 = (zzfkh)this.zzb.get(s);
                    if(!zzfkh1.zze.equals(zzft0)) {
                        continue;
                    }
                    zzfkh1.zzs(zzft0.zzd);
                    zzfkh1.zzp();
                    this.zza.put(s, zzfkh1);
                    this.zzb.remove(s);
                }
                else {
                    list1.add(zzft0);
                }
            }
            Iterator iterator1 = this.zza.entrySet().iterator();
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(!hashSet0.contains(((String)map$Entry0.getKey()))) {
                    String s1 = (String)map$Entry0.getKey();
                    zzfkh zzfkh2 = (zzfkh)map$Entry0.getValue();
                    this.zzb.put(s1, zzfkh2);
                    iterator1.remove();
                }
            }
            Iterator iterator2 = this.zzb.entrySet().iterator();
            while(iterator2.hasNext()) {
                Object object2 = iterator2.next();
                zzfkh zzfkh3 = (zzfkh)((Map.Entry)object2).getValue();
                zzfkh3.zzr();
                if(!zzfkh3.zzt()) {
                    iterator2.remove();
                }
            }
            return list1;
        }
    }

    private final Optional zzp(Class class0, String s, AdFormat adFormat0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        long v1 = this.zzg.currentTimeMillis();
        this.zzd.zzd(adFormat0, v1);
        zzfkh zzfkh0 = this.zzn(s, adFormat0);
        if(zzfkh0 == null) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
            return Optional.empty();
        }
        try {
            Optional optional0 = zzfkh0.zzf();
            Optional optional1 = Optional.ofNullable(zzfkh0.zze());
            Objects.requireNonNull(class0);
            Optional optional2 = optional1.map(new zzfjr(class0));
            optional2.ifPresent((Object object0) -> {
                long v = this.zzg.currentTimeMillis();
                this.zzd.zze(adFormat0, v, optional0);
            });
            FIN.finallyExec$NT(v);
            return optional2;
        }
        catch(ClassCastException classCastException0) {
            zzv.zzp().zzw(classCastException0, "PreloadAdManager.pollAd");
            zze.zzb(("Unable to cast ad to the requested type:" + class0.getName()), classCastException0);
            FIN.finallyExec$NT(v);
            return Optional.empty();
        }
    }

    private final void zzq(String s, zzfkh zzfkh0) {
        synchronized(this) {
            zzfkh0.zzc();
            this.zza.put(s, zzfkh0);
        }
    }

    private final void zzr(boolean z) {
        synchronized(this) {
            if(z) {
                for(Object object0: this.zza.values()) {
                    ((zzfkh)object0).zzp();
                }
            }
            else {
                for(Object object1: this.zza.values()) {
                    ((zzfkh)object1).zzf.set(false);
                }
            }
        }
    }

    private final void zzs(boolean z) {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzt)).booleanValue()) {
                this.zzr(z);
            }
        }
    }

    private final boolean zzt(String s, AdFormat adFormat0) {
        synchronized(this) {
            long v1 = this.zzg.currentTimeMillis();
            zzfkh zzfkh0 = this.zzn(s, adFormat0);
            Optional optional0 = zzfkh0 == null || !zzfkh0.zzt() ? Optional.empty() : Optional.of(this.zzg.currentTimeMillis());
            Optional optional1 = zzfkh0 == null ? Optional.empty() : zzfkh0.zzf();
            this.zzd.zza(adFormat0, v1, optional0, optional1);
            return false;
        }
    }
}

