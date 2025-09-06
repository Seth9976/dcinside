package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import androidx.browser.trusted.h;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbbq.zzq;
import com.google.android.gms.internal.ads.zzbcl;

@TargetApi(26)
public class zzv extends zzu {
    @Override  // com.google.android.gms.ads.internal.util.zzaa
    @Nullable
    public final Intent zzf(Activity activity0) {
        Intent intent0 = new Intent();
        intent0.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent0.putExtra("android.provider.extra.APP_PACKAGE", "com.dcinside.app.android");
        return intent0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final zzbbq.zzq zzg(Context context0, TelephonyManager telephonyManager0) {
        return !zzs.zzB(context0, "android.permission.ACCESS_NETWORK_STATE") || !telephonyManager0.isDataEnabled() ? zzbbq.zzq.zza : zzbbq.zzq.zzb;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final void zzh(Context context0, String s, String s1) {
        NotificationChannel notificationChannel0 = h.a("offline_notification_channel", "AdMob Offline Notifications", ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzir)))));
        notificationChannel0.setShowBadge(false);
        ((NotificationManager)context0.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel0);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zzi(Context context0, String s) {
        NotificationChannel notificationChannel0 = ((NotificationManager)context0.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel0 == null ? false : notificationChannel0.getImportance() == 0;
    }
}

