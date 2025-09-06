package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdi;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.nativead.NativeAd.Image;
import com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzbsn extends NativeAd {
    private final zzbht zza;
    private final List zzb;
    @Nullable
    private final zzbsm zzc;
    @Nullable
    private final AdChoicesInfo zzd;
    private final List zze;

    public zzbsn(zzbht zzbht0) {
        zzbsm zzbsm1;
        this.zzb = new ArrayList();
        this.zze = new ArrayList();
        this.zza = zzbht0;
        AdChoicesInfo nativeAd$AdChoicesInfo0 = null;
        try {
            List list0 = zzbht0.zzu();
            if(list0 != null) {
                Iterator iterator0 = list0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    zzbfw zzbfw0 = object0 instanceof IBinder ? zzbfv.zzg(((IBinder)object0)) : null;
                    if(zzbfw0 != null) {
                        zzbsm zzbsm0 = new zzbsm(zzbfw0);
                        this.zzb.add(zzbsm0);
                    }
                }
            }
            goto label_18;
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzh("", remoteException0);
        try {
        label_18:
            List list1 = this.zza.zzv();
            if(list1 != null) {
                Iterator iterator1 = list1.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        break;
                    }
                    Object object1 = iterator1.next();
                    zzdh zzdh0 = object1 instanceof IBinder ? zzdg.zzb(((IBinder)object1)) : null;
                    if(zzdh0 != null) {
                        zzdi zzdi0 = new zzdi(zzdh0);
                        this.zze.add(zzdi0);
                    }
                }
            }
            goto label_31;
        }
        catch(RemoteException remoteException1) {
        }
        zzo.zzh("", remoteException1);
        try {
        label_31:
            zzbfw zzbfw1 = this.zza.zzk();
            if(zzbfw1 == null) {
                goto label_39;
            }
            else {
                zzbsm1 = new zzbsm(zzbfw1);
            }
        }
        catch(RemoteException remoteException2) {
            zzo.zzh("", remoteException2);
            zzbsm1 = null;
        }
        goto label_40;
    label_39:
        zzbsm1 = null;
        try {
        label_40:
            this.zzc = zzbsm1;
            if(this.zza.zzi() != null) {
                nativeAd$AdChoicesInfo0 = new zzbsk(this.zza.zzi());
            }
        }
        catch(RemoteException remoteException3) {
            zzo.zzh("", remoteException3);
        }
        this.zzd = nativeAd$AdChoicesInfo0;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzw();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Failed to cancelUnconfirmedClick", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.zza.zzx();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.zza.zzD();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final AdChoicesInfo getAdChoicesInfo() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final String getAdvertiser() {
        try {
            return this.zza.zzn();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final String getBody() {
        try {
            return this.zza.zzo();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final String getCallToAction() {
        try {
            return this.zza.zzp();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final Bundle getExtras() {
        try {
            Bundle bundle0 = this.zza.zzf();
            if(bundle0 != null) {
                return bundle0;
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
        return new Bundle();
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final String getHeadline() {
        try {
            return this.zza.zzq();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final Image getIcon() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final List getImages() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final MediaContent getMediaContent() {
        try {
            if(this.zza.zzj() != null) {
                return new zzfd(this.zza.zzj(), null);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final List getMuteThisAdReasons() {
        return this.zze;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final String getPrice() {
        try {
            return this.zza.zzs();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final ResponseInfo getResponseInfo() {
        try {
            return ResponseInfo.zza(this.zza.zzg());
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return ResponseInfo.zza(null);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final Double getStarRating() {
        try {
            double f = this.zza.zze();
            return f == -1.0 ? null : f;
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final String getStore() {
        try {
            return this.zza.zzt();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzH();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzI();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason0) {
        try {
            if(this.zza.zzI()) {
                goto label_5;
            }
            goto label_14;
        }
        catch(RemoteException remoteException0) {
            try {
                zzo.zzh("", remoteException0);
                goto label_14;
            label_5:
                if(muteThisAdReason0 == null) {
                    this.zza.zzy(null);
                    return;
                }
                if(muteThisAdReason0 instanceof zzdi) {
                    zzdh zzdh0 = ((zzdi)muteThisAdReason0).zza();
                    this.zza.zzy(zzdh0);
                    return;
                }
                zzo.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                return;
            label_14:
                zzo.zzg("Ad is not custom mute enabled");
                return;
            }
            catch(RemoteException remoteException1) {
            }
        }
        zzo.zzh("", remoteException1);
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(Bundle bundle0) {
        try {
            this.zza.zzz(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.zza.zzA();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    protected final void recordEvent(Bundle bundle0) {
        try {
            this.zza.zzB(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Failed to record native event", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle0) {
        try {
            return this.zza.zzJ(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle0) {
        try {
            this.zza.zzC(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener0) {
        try {
            zzde zzde0 = new zzde(muteThisAdListener0);
            this.zza.zzE(zzde0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener0) {
        try {
            zzfs zzfs0 = new zzfs(onPaidEventListener0);
            this.zza.zzF(zzfs0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Failed to setOnPaidEventListener", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(UnconfirmedClickListener nativeAd$UnconfirmedClickListener0) {
        try {
            zzbsu zzbsu0 = new zzbsu(nativeAd$UnconfirmedClickListener0);
            this.zza.zzG(zzbsu0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Failed to setUnconfirmedClickListener", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    protected final Object zza() {
        try {
            return this.zza.zzm();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }
}

