package com.google.android.gms.internal.ads;

import android.app.ActivityManager.RunningTaskInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.List;

public final class zzelq implements zzetq {
    public final Context zza;
    public final zzs zzb;
    public final List zzc;

    public zzelq(Context context0, zzs zzs0, List list0) {
        this.zza = context0;
        this.zzb = zzs0;
        this.zzc = list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        if(!((Boolean)zzbeo.zza.zze()).booleanValue()) {
            return;
        }
        Bundle bundle0 = new Bundle();
        String s = null;
        try {
            ActivityManager activityManager0 = (ActivityManager)this.zza.getSystemService("activity");
            if(activityManager0 != null) {
                List list0 = activityManager0.getRunningTasks(1);
                if(list0 != null && !list0.isEmpty()) {
                    ActivityManager.RunningTaskInfo activityManager$RunningTaskInfo0 = (ActivityManager.RunningTaskInfo)list0.get(0);
                    if(activityManager$RunningTaskInfo0 != null && activityManager$RunningTaskInfo0.topActivity != null) {
                        s = activityManager$RunningTaskInfo0.topActivity.getClassName();
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
        bundle0.putString("activity", s);
        Bundle bundle1 = new Bundle();
        bundle1.putInt("width", this.zzb.zze);
        bundle1.putInt("height", this.zzb.zzb);
        bundle0.putBundle("size", bundle1);
        if(!this.zzc.isEmpty()) {
            bundle0.putParcelableArray("parents", ((Parcelable[])this.zzc.toArray(new Parcelable[this.zzc.size()])));
        }
        ((zzcuv)object0).zza.putBundle("view_hierarchy", bundle0);
    }
}

