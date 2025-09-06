package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.List;
import o3.j;

@j
public final class zzbdm {
    @Nullable
    private CustomTabsSession zza;
    @Nullable
    private CustomTabsClient zzb;
    @Nullable
    private CustomTabsServiceConnection zzc;
    @Nullable
    private zzbdl zzd;

    @Nullable
    public final CustomTabsSession zza() {
        CustomTabsClient customTabsClient0 = this.zzb;
        if(customTabsClient0 == null) {
            this.zza = null;
            return null;
        }
        if(this.zza == null) {
            this.zza = customTabsClient0.k(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity0) {
        if(this.zzb == null) {
            String s = zzhfk.zza(activity0);
            if(s != null) {
                zzhfl zzhfl0 = new zzhfl(this);
                this.zzc = zzhfl0;
                CustomTabsClient.b(activity0, s, zzhfl0);
            }
        }
    }

    public final void zzc(CustomTabsClient customTabsClient0) {
        this.zzb = customTabsClient0;
        customTabsClient0.n(0L);
        zzbdl zzbdl0 = this.zzd;
        if(zzbdl0 != null) {
            zzbdl0.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbdl zzbdl0) {
        this.zzd = zzbdl0;
    }

    public final void zzf(Activity activity0) {
        CustomTabsServiceConnection customTabsServiceConnection0 = this.zzc;
        if(customTabsServiceConnection0 == null) {
            return;
        }
        activity0.unbindService(customTabsServiceConnection0);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    public static boolean zzg(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        if(packageManager0 != null) {
            Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfo0 = packageManager0.resolveActivity(intent0, 0);
            List list0 = packageManager0.queryIntentActivities(intent0, 0x10000);
            if(list0 != null && resolveInfo0 != null) {
                for(int v = 0; v < list0.size(); ++v) {
                    ResolveInfo resolveInfo1 = (ResolveInfo)list0.get(v);
                    if(resolveInfo0.activityInfo.name.equals(resolveInfo1.activityInfo.name)) {
                        return resolveInfo0.activityInfo.packageName.equals(zzhfk.zza(context0));
                    }
                }
            }
        }
        return false;
    }
}

