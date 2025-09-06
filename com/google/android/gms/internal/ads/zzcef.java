package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class zzcef extends zzcbj implements zzgy, zzlw {
    public static final int zza;
    private final Context zzb;
    private final zzcdq zzc;
    private final zzxt zzd;
    private final zzcbr zze;
    private final WeakReference zzf;
    private final zzvn zzg;
    @Nullable
    private zzim zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcbi zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private final Object zzq;
    @Nullable
    private Integer zzr;
    private final ArrayList zzs;
    @Nullable
    private volatile zzcds zzt;
    private final Set zzu;

    public zzcef(Context context0, zzcbr zzcbr0, zzcbs zzcbs0, @Nullable Integer integer0) {
        zzcdu zzcdu0;
        zzcdw zzcdw0;
        this.zzq = new Object();
        this.zzu = new HashSet();
        this.zzb = context0;
        this.zze = zzcbr0;
        this.zzr = integer0;
        this.zzf = new WeakReference(zzcbs0);
        zzcdq zzcdq0 = new zzcdq();
        this.zzc = zzcdq0;
        zzxt zzxt0 = new zzxt(context0);
        this.zzd = zzxt0;
        if(zze.zzc()) {
            zze.zza(("SimpleExoPlayerAdapter initialize " + this.toString()));
        }
        zzcbj.zzD().incrementAndGet();
        zzlq zzlq0 = new zzlq(context0, new zzced(this));
        zzlq0.zzb(zzxt0);
        zzlq0.zza(zzcdq0);
        zzlr zzlr0 = zzlq0.zzc();
        this.zzh = zzlr0;
        zzlr0.zzy(this);
        boolean z = false;
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        String s = null;
        this.zzt = null;
        if(zzcbs0 != null) {
            s = zzcbs0.zzr();
        }
        this.zzo = (String)zzful.zzd(s).zzb("");
        this.zzp = zzcbs0 == null ? 0 : zzcbs0.zzf();
        String s1 = zzv.zzq().zzc(context0, zzcbs0.zzn().afmaVersion);
        if(!this.zzj || this.zzi.limit() <= 0) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzcg)).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzbY)).booleanValue()) {
                z = true;
            }
            else if(!zzcbr0.zzi) {
                z = true;
            }
            if(zzcbr0.zzl) {
                zzcdw0 = () -> (z ? new zzcei(s1, this, this.zze.zzd, this.zze.zze, this.zze.zzm, this.zze.zzn) : new zzcei(s1, null, this.zze.zzd, this.zze.zze, this.zze.zzm, this.zze.zzn));
            }
            else if(zzcbr0.zzh > 0) {
                zzcdw0 = () -> {
                    zzfy zzfy0 = new zzcdp(s1, (z ? this : null), this.zze.zzd, this.zze.zze, this.zze.zzh);
                    WeakReference weakReference0 = new WeakReference(zzfy0);
                    this.zzu.add(weakReference0);
                    return zzfy0;
                };
            }
            else {
                zzcdw0 = () -> {
                    zzgg zzgg0 = new zzgg();
                    zzgg0.zzf(s1);
                    zzgg0.zze((z ? this : null));
                    zzgg0.zzc(this.zze.zzd);
                    zzgg0.zzd(this.zze.zze);
                    zzgg0.zzb(true);
                    return zzgg0.zzg();
                };
            }
            zzcdu0 = zzcbr0.zzi ? () -> {
                zzfy zzfy0 = zzcdw0.zza();
                zzcec zzcec0 = new zzcec(this);
                return new zzcds(this.zzb, zzfy0, this.zzo, this.zzp, this, zzcec0);
            } : zzcdw0;
            if(this.zzi != null && this.zzi.limit() > 0) {
                byte[] arr_b1 = new byte[this.zzi.limit()];
                this.zzi.get(arr_b1);
                zzcdu0 = new zzcea(zzcdu0, arr_b1);
            }
        }
        else {
            byte[] arr_b = new byte[this.zzi.limit()];
            this.zzi.get(arr_b);
            zzcdu0 = new zzcdu(arr_b);
        }
        zzcee zzcee0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzl)).booleanValue() ? new zzcee() : new zzcdv();
        this.zzg = new zzvn(zzcdu0, new zzvm(zzcee0));
    }

    @Override
    public final void finalize() {
        zzcbj.zzD().decrementAndGet();
        if(zze.zzc()) {
            zze.zza(("SimpleExoPlayerAdapter finalize " + this.toString()));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final long zzA() {
        return this.zzad() ? 0L : ((long)this.zzl);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final long zzB() {
        if(!this.zzad()) {
            Object object0 = this.zzq;
            synchronized(object0) {
                while(!this.zzs.isEmpty()) {
                    long v1 = this.zzn;
                    Map map0 = ((zzgt)this.zzs.remove(0)).zze();
                    long v2 = 0L;
                    if(map0 != null) {
                        for(Object object1: map0.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object1;
                            if(map$Entry0 != null) {
                                try {
                                    if(map$Entry0.getKey() != null && zzftt.zzc("content-length", ((CharSequence)map$Entry0.getKey())) && map$Entry0.getValue() != null && ((List)map$Entry0.getValue()).get(0) != null) {
                                        v2 = Long.parseLong(((String)((List)map$Entry0.getValue()).get(0)));
                                        break;
                                    }
                                }
                                catch(NumberFormatException unused_ex) {
                                    continue;
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                    }
                    this.zzn = v1 + v2;
                }
                return this.zzn;
            }
        }
        return this.zzt.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    @Nullable
    public final Integer zzC() {
        return this.zzr;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzF(Uri[] arr_uri, String s) {
        this.zzG(arr_uri, s, ByteBuffer.allocate(0), false);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzG(Uri[] arr_uri, String s, ByteBuffer byteBuffer0, boolean z) {
        zzui zzui0;
        if(this.zzh != null) {
            this.zzi = byteBuffer0;
            this.zzj = z;
            if(arr_uri.length == 1) {
                zzui0 = this.zzaa(arr_uri[0]);
            }
            else {
                zzui[] arr_zzui = new zzui[arr_uri.length];
                for(int v = 0; v < arr_uri.length; ++v) {
                    arr_zzui[v] = this.zzaa(arr_uri[v]);
                }
                zzui0 = new zzuy(false, false, new zztr(), arr_zzui);
            }
            this.zzh.zzB(zzui0);
            this.zzh.zzp();
            zzcbj.zzE().incrementAndGet();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzH() {
        zzim zzim0 = this.zzh;
        if(zzim0 != null) {
            zzim0.zzA(this);
            this.zzh.zzz();
            this.zzh = null;
            zzcbj.zzE().decrementAndGet();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzI(long v) {
        zzg zzg0 = (zzg)this.zzh;
        zzg0.zza(zzg0.zzd(), v, 5, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzJ(int v) {
        this.zzc.zzl(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzK(int v) {
        this.zzc.zzm(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzL(zzcbi zzcbi0) {
        this.zzk = zzcbi0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzM(int v) {
        this.zzc.zzn(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzN(int v) {
        this.zzc.zzo(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzO(boolean z) {
        this.zzh.zzq(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzP(@Nullable Integer integer0) {
        this.zzr = integer0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzQ(boolean z) {
        if(this.zzh != null) {
            for(int v = 0; true; ++v) {
                this.zzh.zzx();
                if(v >= 2) {
                    break;
                }
                zzxg zzxg0 = this.zzd.zzf().zzc();
                zzxg0.zzq(v, !z);
                this.zzd.zzl(zzxg0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzR(int v) {
        for(Object object0: this.zzu) {
            zzcdp zzcdp0 = (zzcdp)((WeakReference)object0).get();
            if(zzcdp0 != null) {
                zzcdp0.zzm(v);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzS(Surface surface0, boolean z) {
        zzim zzim0 = this.zzh;
        if(zzim0 != null) {
            zzim0.zzr(surface0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzT(float f, boolean z) {
        zzim zzim0 = this.zzh;
        if(zzim0 != null) {
            zzim0.zzs(f);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final void zzU() {
        this.zzh.zzt();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final boolean zzV() {
        return this.zzh != null;
    }

    // 检测为 Lambda 实现
    final zzfy zzW(String s, boolean z) [...]

    // 检测为 Lambda 实现
    final zzfy zzX(String s, boolean z) [...]

    // 检测为 Lambda 实现
    final zzfy zzY(String s, boolean z) [...]

    // 检测为 Lambda 实现
    final zzfy zzZ(zzfx zzfx0) [...]

    @Override  // com.google.android.gms.internal.ads.zzgy
    public final void zza(zzfy zzfy0, zzgd zzgd0, boolean z, int v) {
        this.zzl += v;
    }

    @VisibleForTesting
    final zzui zzaa(Uri uri0) {
        zzaf zzaf0 = new zzaf();
        zzaf0.zzb(uri0);
        zzar zzar0 = zzaf0.zzc();
        this.zzg.zza(this.zze.zzf);
        return this.zzg.zzb(zzar0);
    }

    final void zzab(boolean z, long v) {
        zzcbi zzcbi0 = this.zzk;
        if(zzcbi0 != null) {
            zzcbi0.zzi(z, v);
        }
    }

    final zzlj[] zzac(Handler handler0, zzabc zzabc0, zzpf zzpf0, zzwm zzwm0, zzte zzte0) {
        zzqm zzqm0 = new zzqa(this.zzb).zzd();
        zzrv zzrv0 = new zzrv(this.zzb);
        zzqs zzqs0 = new zzqs(this.zzb, zzrv0, zzsp.zza, false, handler0, zzpf0, zzqm0);
        zzrv zzrv1 = new zzrv(this.zzb);
        return new zzlj[]{zzqs0, new zzzp(this.zzb, zzrv1, zzsp.zza, 0L, false, handler0, zzabc0, -1, 30.0f)};
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzgy
    public final void zzb(zzfy zzfy0, zzgd zzgd0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzgy
    public final void zzc(zzfy zzfy0, zzgd zzgd0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzgy
    public final void zzd(zzfy zzfy0, zzgd zzgd0, boolean z) {
        if(zzfy0 instanceof zzgt) {
            synchronized(this.zzq) {
                this.zzs.add(((zzgt)zzfy0));
            }
            return;
        }
        if(zzfy0 instanceof zzcds) {
            this.zzt = (zzcds)zzfy0;
            zzcbs zzcbs0 = (zzcbs)this.zzf.get();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzbY)).booleanValue() && zzcbs0 != null && this.zzt.zzn()) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap0.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                zzceb zzceb0 = new zzceb(zzcbs0, hashMap0);
                zzs.zza.post(zzceb0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zze(zzlu zzlu0, zzab zzab0, @Nullable zzht zzht0) {
        zzcbs zzcbs0 = (zzcbs)this.zzf.get();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzbY)).booleanValue() && zzcbs0 != null) {
            HashMap hashMap0 = new HashMap();
            String s = zzab0.zzn;
            if(s != null) {
                hashMap0.put("audioMime", s);
            }
            String s1 = zzab0.zzo;
            if(s1 != null) {
                hashMap0.put("audioSampleMime", s1);
            }
            String s2 = zzab0.zzk;
            if(s2 != null) {
                hashMap0.put("audioCodec", s2);
            }
            zzcbs0.zzd("onMetadataEvent", hashMap0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzf(zzlu zzlu0, int v, long v1, long v2) {
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzg(zzlu zzlu0, zzuc zzuc0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzh(zzlu zzlu0, int v, long v1) {
        this.zzm += v;
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzi(zzbk zzbk0, zzlv zzlv0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzj(zzlu zzlu0, zztx zztx0, zzuc zzuc0, IOException iOException0, boolean z) {
        zzcbi zzcbi0 = this.zzk;
        if(zzcbi0 != null) {
            if(this.zze.zzj) {
                zzcbi0.zzl("onLoadException", iOException0);
                return;
            }
            zzcbi0.zzk("onLoadError", iOException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzk(zzlu zzlu0, int v) {
        zzcbi zzcbi0 = this.zzk;
        if(zzcbi0 != null) {
            zzcbi0.zzm(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzl(zzlu zzlu0, zzbd zzbd0) {
        zzcbi zzcbi0 = this.zzk;
        if(zzcbi0 != null) {
            zzcbi0.zzk("onPlayerError", zzbd0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzm(zzlu zzlu0, zzbi zzbi0, zzbi zzbi1, int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzn(zzlu zzlu0, Object object0, long v) {
        zzcbi zzcbi0 = this.zzk;
        if(zzcbi0 != null) {
            zzcbi0.zzv();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzo(zzlu zzlu0, zzhs zzhs0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzp(zzlu zzlu0, zzab zzab0, @Nullable zzht zzht0) {
        zzcbs zzcbs0 = (zzcbs)this.zzf.get();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzbY)).booleanValue() && zzcbs0 != null) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("frameRate", String.valueOf(zzab0.zzx));
            hashMap0.put("bitRate", String.valueOf(zzab0.zzj));
            hashMap0.put("resolution", zzab0.zzv + "x" + zzab0.zzw);
            String s = zzab0.zzn;
            if(s != null) {
                hashMap0.put("videoMime", s);
            }
            String s1 = zzab0.zzo;
            if(s1 != null) {
                hashMap0.put("videoSampleMime", s1);
            }
            String s2 = zzab0.zzk;
            if(s2 != null) {
                hashMap0.put("videoCodec", s2);
            }
            zzcbs0.zzd("onMetadataEvent", hashMap0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzq(zzlu zzlu0, zzcd zzcd0) {
        zzcbi zzcbi0 = this.zzk;
        if(zzcbi0 != null) {
            zzcbi0.zzD(zzcd0.zzb, zzcd0.zzc);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final int zzr() {
        return this.zzm;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final long zzw() {
        return (long)this.zzl;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final long zzx() {
        return !this.zzad() || !this.zzt.zzp() ? 0L : Math.min(this.zzl, this.zzt.zzk());
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbj
    public final long zzz() {
        return this.zzh.zzl();
    }
}

