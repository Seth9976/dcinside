package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzfsc;
import com.google.android.gms.internal.ads.zzfsd;
import com.google.android.gms.internal.ads.zzfse;
import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfsy;
import com.google.android.gms.internal.ads.zzfta;
import com.google.android.gms.internal.ads.zzftb;
import com.google.android.gms.internal.ads.zzftc;
import com.google.android.gms.internal.ads.zzftd;
import com.google.android.gms.internal.ads.zzftq;
import java.util.HashMap;
import java.util.Map;

public final class zzz {
    @Nullable
    private String zza;
    @Nullable
    private String zzb;
    @Nullable
    private zzcex zzc;
    @Nullable
    private zzfse zzd;
    private boolean zze;
    private zzftb zzf;

    public zzz() {
        this.zzc = null;
        this.zze = false;
        this.zza = null;
        this.zzd = null;
        this.zzb = null;
    }

    public final void zza(@Nullable zzcex zzcex0, Context context0) {
        synchronized(this) {
            this.zzc = zzcex0;
            if(!this.zzk(context0)) {
                this.zzf("Unable to bind", "on_play_store_bind");
                return;
            }
            HashMap hashMap0 = new HashMap();
            hashMap0.put("action", "fetch_completed");
            this.zze("on_play_store_bind", hashMap0);
        }
    }

    public final void zzb() {
        if(this.zze) {
            zzfse zzfse0 = this.zzd;
            if(zzfse0 != null) {
                zzfse0.zza(this.zzl(), this.zzf);
                this.zzd("onLMDOverlayCollapse");
                return;
            }
        }
        zze.zza("LastMileDelivery not connected");
    }

    public final void zzc() {
        if(this.zze) {
            zzfse zzfse0 = this.zzd;
            if(zzfse0 != null) {
                zzfsc zzfsc0 = zzfsd.zzc();
                if(!((Boolean)zzbe.zzc().zza(zzbcl.zzlq)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
                    String s = this.zza;
                    if(s == null) {
                        this.zzf("Missing session token and/or appId", "onLMDupdate");
                    }
                    else {
                        zzfsc0.zzb(s);
                    }
                }
                else {
                    zzfsc0.zza(this.zzb);
                }
                zzfse0.zzb(zzfsc0.zzc(), this.zzf);
                return;
            }
        }
        zze.zza("LastMileDelivery not connected");
    }

    @VisibleForTesting
    final void zzd(String s) {
        this.zze(s, new HashMap());
    }

    @VisibleForTesting
    final void zze(String s, Map map0) {
        zzx zzx0 = () -> {
            zzcex zzcex0 = this.zzc;
            if(zzcex0 != null) {
                zzcex0.zzd(s, map0);
            }
        };
        zzbzw.zzf.execute(zzx0);
    }

    @VisibleForTesting
    final void zzf(String s, String s1) {
        zze.zza(s);
        if(this.zzc != null) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("message", s);
            hashMap0.put("action", s1);
            this.zze("onError", hashMap0);
        }
    }

    public final void zzg() {
        if(this.zze) {
            zzfse zzfse0 = this.zzd;
            if(zzfse0 != null) {
                zzfse0.zzc(this.zzl(), this.zzf);
                this.zzd("onLMDOverlayExpand");
                return;
            }
        }
        zze.zza("LastMileDelivery not connected");
    }

    // 检测为 Lambda 实现
    final void zzh(String s, Map map0) [...]

    @VisibleForTesting
    final void zzi(zzfta zzfta0) {
        if(!TextUtils.isEmpty(zzfta0.zzb()) && !((Boolean)zzbe.zzc().zza(zzbcl.zzlq)).booleanValue()) {
            this.zza = zzfta0.zzb();
        }
        switch(zzfta0.zza()) {
            case 0x1FD8: {
                this.zzd("onLMDOverlayOpened");
                return;
            }
            case 0x1FD9: {
                this.zzd("onLMDOverlayClicked");
                return;
            }
            case 0x1FDB: {
                this.zzd("onLMDOverlayClose");
                return;
            }
            case 0x1FDD: {
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                return;
            }
            case 0x1FE0: 
            case 0x1FE1: 
            case 0x1FE2: {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("error", String.valueOf(zzfta0.zza()));
                this.zze("onLMDOverlayFailedToOpen", hashMap0);
            }
        }
    }

    public final void zzj(@Nullable zzcex zzcex0, @Nullable zzfsy zzfsy0) {
        if(zzcex0 == null) {
            this.zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcex0;
        if(!this.zze && !this.zzk(zzcex0.getContext())) {
            this.zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzlq)).booleanValue()) {
            this.zzb = zzfsy0.zzh();
        }
        this.zzm();
        zzfse zzfse0 = this.zzd;
        if(zzfse0 != null) {
            zzfse0.zzd(zzfsy0, this.zzf);
        }
    }

    public final boolean zzk(Context context0) {
        synchronized(this) {
            if(!zzftq.zza(context0)) {
                return false;
            }
            try {
                this.zzd = zzfsf.zza(context0);
            }
            catch(NullPointerException nullPointerException0) {
                zze.zza("Error connecting LMD Overlay service");
                zzv.zzp().zzw(nullPointerException0, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
            }
            if(this.zzd == null) {
                this.zze = false;
                return false;
            }
            this.zzm();
            this.zze = true;
            return true;
        }
    }

    private final zzftd zzl() {
        zzftc zzftc0 = zzftd.zzc();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzlq)).booleanValue() && !TextUtils.isEmpty(this.zzb)) {
            zzftc0.zza(this.zzb);
            return zzftc0.zzc();
        }
        String s = this.zza;
        if(s != null) {
            zzftc0.zzb(s);
            return zzftc0.zzc();
        }
        this.zzf("Missing session token and/or appId", "onLMDupdate");
        return zzftc0.zzc();
    }

    private final void zzm() {
        if(this.zzf == null) {
            this.zzf = new zzy(this);
        }
    }
}

