package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o3.g;

public final class zzbub {
    @g
    private final View zza;
    @Nullable
    private final Map zzb;
    @Nullable
    private final zzbyu zzc;

    public zzbub(zzbua zzbua0) {
        View view0 = zzbua0.zza;
        this.zza = view0;
        Map map0 = zzbua0.zzb;
        this.zzb = map0;
        zzbyu zzbyu0 = zzbtv.zza(zzbua0.zza.getContext());
        this.zzc = zzbyu0;
        if(zzbyu0 != null && !map0.isEmpty()) {
            try {
                zzbyu0.zzg(new zzbuc(ObjectWrapper.wrap(view0).asBinder(), ObjectWrapper.wrap(map0).asBinder()));
            }
            catch(RemoteException unused_ex) {
                zzo.zzg("Failed to call remote method.");
            }
        }
    }

    public final void zza(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            if(this.zzc == null) {
                zzo.zzj("Failed to get internal reporting info generator in recordClick.");
            }
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                zzbtz zzbtz0 = new zzbtz(this, list0);
                this.zzc.zzh(list0, iObjectWrapper0, zzbtz0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzg(("RemoteException recording click: " + remoteException0.toString()));
            }
            return;
        }
        zzo.zzj("No click urls were passed to recordClick");
    }

    public final void zzb(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            zzbyu zzbyu0 = this.zzc;
            if(zzbyu0 != null) {
                try {
                    zzbyu0.zzi(list0, ObjectWrapper.wrap(this.zza), new zzbty(this, list0));
                }
                catch(RemoteException remoteException0) {
                    zzo.zzg(("RemoteException recording impression urls: " + remoteException0.toString()));
                }
                return;
            }
            zzo.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        zzo.zzj("No impression urls were passed to recordImpression");
    }

    public final void zzc(MotionEvent motionEvent0) {
        zzbyu zzbyu0 = this.zzc;
        if(zzbyu0 != null) {
            try {
                zzbyu0.zzk(ObjectWrapper.wrap(motionEvent0));
            }
            catch(RemoteException unused_ex) {
                zzo.zzg("Failed to call remote method.");
            }
            return;
        }
        zzo.zze("Failed to get internal reporting info generator.");
    }

    public final void zzd(Uri uri0, UpdateClickUrlCallback updateClickUrlCallback0) {
        try {
            ArrayList arrayList0 = new ArrayList(Arrays.asList(new Uri[]{uri0}));
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
            zzbtx zzbtx0 = new zzbtx(this, updateClickUrlCallback0);
            this.zzc.zzl(arrayList0, iObjectWrapper0, zzbtx0);
        }
        catch(RemoteException unused_ex) {
        }
    }

    public final void zze(List list0, UpdateImpressionUrlsCallback updateImpressionUrlsCallback0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
            zzbtw zzbtw0 = new zzbtw(this, updateImpressionUrlsCallback0);
            this.zzc.zzm(list0, iObjectWrapper0, zzbtw0);
        }
        catch(RemoteException unused_ex) {
        }
    }
}

