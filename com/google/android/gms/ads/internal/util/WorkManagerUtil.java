package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Configuration.Builder;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@KeepForSdk
public class WorkManagerUtil extends zzbq {
    private static void zzb(Context context0) {
        try {
            WorkManager.F(context0.getApplicationContext(), new Builder().a());
        }
        catch(IllegalStateException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(@NonNull IObjectWrapper iObjectWrapper0) {
        WorkManager workManager0;
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        WorkManagerUtil.zzb(context0);
        try {
            workManager0 = WorkManager.q(context0);
        }
        catch(IllegalStateException illegalStateException0) {
            zzo.zzk("Failed to instantiate WorkManager.", illegalStateException0);
            return;
        }
        workManager0.f("offline_ping_sender_work");
        Constraints constraints0 = new androidx.work.Constraints.Builder().d(NetworkType.b).b();
        workManager0.j(((OneTimeWorkRequest)((androidx.work.OneTimeWorkRequest.Builder)((androidx.work.OneTimeWorkRequest.Builder)new androidx.work.OneTimeWorkRequest.Builder(OfflinePingSender.class).o(constraints0)).a("offline_ping_sender_work")).b()));
    }

    @Override  // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(@NonNull IObjectWrapper iObjectWrapper0, @NonNull String s, @NonNull String s1) {
        return this.zzg(iObjectWrapper0, new zza(s, s1, ""));
    }

    @Override  // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(IObjectWrapper iObjectWrapper0, zza zza0) {
        WorkManager workManager0;
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        WorkManagerUtil.zzb(context0);
        Constraints constraints0 = new androidx.work.Constraints.Builder().d(NetworkType.b).b();
        Data data0 = new androidx.work.Data.Builder().r("uri", zza0.zza).r("gws_query_id", zza0.zzb).r("image_url", zza0.zzc).a();
        OneTimeWorkRequest oneTimeWorkRequest0 = (OneTimeWorkRequest)((androidx.work.OneTimeWorkRequest.Builder)((androidx.work.OneTimeWorkRequest.Builder)((androidx.work.OneTimeWorkRequest.Builder)new androidx.work.OneTimeWorkRequest.Builder(OfflineNotificationPoster.class).o(constraints0)).w(data0)).a("offline_notification_work")).b();
        try {
            workManager0 = WorkManager.q(context0);
        }
        catch(IllegalStateException illegalStateException0) {
            zzo.zzk("Failed to instantiate WorkManager.", illegalStateException0);
            return false;
        }
        workManager0.j(oneTimeWorkRequest0);
        return true;
    }
}

