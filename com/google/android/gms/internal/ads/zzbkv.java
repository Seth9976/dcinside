package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;

@RequiresApi(api = 21)
public final class zzbkv {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    @Nullable
    private zzbkr zzc;

    public zzbkv(Context context0, OnH5AdsEventListener onH5AdsEventListener0) {
        Preconditions.checkState(true, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(onH5AdsEventListener0);
        this.zza = context0;
        this.zzb = onH5AdsEventListener0;
        zzbcl.zza(context0);
    }

    public final void zza() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjN)).booleanValue()) {
            this.zzd();
            zzbkr zzbkr0 = this.zzc;
            if(zzbkr0 != null) {
                try {
                    zzbkr0.zze();
                }
                catch(RemoteException remoteException0) {
                    zzo.zzl("#007 Could not call remote method.", remoteException0);
                }
            }
        }
    }

    public final boolean zzb(String s) {
        if(!zzbkv.zzc(s)) {
            return false;
        }
        this.zzd();
        zzbkr zzbkr0 = this.zzc;
        if(zzbkr0 != null) {
            try {
                zzbkr0.zzf(s);
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
            return true;
        }
        return false;
    }

    public static final boolean zzc(String s) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzjN)).booleanValue()) {
            return false;
        }
        Preconditions.checkNotNull(s);
        if(s.length() > ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzjP))))) {
            zzo.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri uri0 = Uri.parse(s);
        return "gmsg".equals(uri0.getScheme()) && "mobileads.google.com".equals(uri0.getHost()) && "/h5ads".equals(uri0.getPath());
    }

    private final void zzd() {
        if(this.zzc != null) {
            return;
        }
        zzbpa zzbpa0 = new zzbpa();
        this.zzc = zzbc.zza().zzn(this.zza, zzbpa0, this.zzb);
    }
}

