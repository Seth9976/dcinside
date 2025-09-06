package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.t0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

final class zzeuc implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    public zzeuc(zzgcs zzgcs0, Context context0) {
        this.zza = zzgcs0;
        this.zzb = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 38;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzeub zzeub0 = () -> {
            String s5;
            String s4;
            String s3;
            String s2;
            PackageManager packageManager0 = this.zzb.getPackageManager();
            Locale locale0 = Locale.getDefault();
            ResolveInfo resolveInfo0 = zzeuc.zzd(packageManager0, "geo:0,0?q=donuts");
            ResolveInfo resolveInfo1 = zzeuc.zzd(packageManager0, "http://www.google.com");
            String s = locale0.getCountry();
            boolean z = zzf.zzr();
            boolean z1 = DeviceProperties.isLatchsky(this.zzb);
            boolean z2 = DeviceProperties.isSidewinder(this.zzb);
            String s1 = locale0.getLanguage();
            ArrayList arrayList0 = new ArrayList();
            if(Build.VERSION.SDK_INT >= 24) {
                LocaleList localeList0 = LocaleList.getDefault();
                for(int v = 0; v < localeList0.size(); ++v) {
                    arrayList0.add(localeList0.get(v).getLanguage());
                }
            }
            Context context0 = this.zzb;
            ResolveInfo resolveInfo2 = zzeuc.zzd(packageManager0, "market://details?id=com.google.android.gms.ads");
            if(resolveInfo2 != null) {
                ActivityInfo activityInfo0 = resolveInfo2.activityInfo;
                if(activityInfo0 != null) {
                    try {
                        PackageInfo packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(activityInfo0.packageName, 0);
                        if(packageInfo0 != null) {
                            s2 = packageInfo0.versionCode + "." + activityInfo0.packageName;
                            goto label_27;
                        }
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                    }
                }
            }
            s2 = null;
            try {
            label_27:
                PackageInfo packageInfo1 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 0x80);
                s3 = null;
                if(packageInfo1 != null) {
                    s3 = packageInfo1.versionCode + "." + packageInfo1.packageName;
                }
            }
            catch(Exception unused_ex) {
            }
            boolean z3 = false;
            Context context1 = this.zzb;
            if(packageManager0 == null) {
                s4 = s3;
            }
            else {
                s4 = s3;
                Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveInfo3 = packageManager0.resolveActivity(intent0, 0);
                List list0 = packageManager0.queryIntentActivities(intent0, 0x10000);
                if(list0 != null && resolveInfo3 != null) {
                    for(int v1 = 0; v1 < list0.size(); ++v1) {
                        ResolveInfo resolveInfo4 = (ResolveInfo)list0.get(v1);
                        if(resolveInfo3.activityInfo.name.equals(resolveInfo4.activityInfo.name)) {
                            z3 = resolveInfo3.activityInfo.packageName.equals(zzhfk.zza(context1));
                            break;
                        }
                    }
                }
            }
            long v2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes();
            boolean z4 = ((Boolean)zzbe.zzc().zza(zzbcl.zzlj)).booleanValue() && zzs.zzC(this.zzb);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzln)).booleanValue()) {
                try {
                    Bundle bundle0 = Wrappers.packageManager(this.zzb).getApplicationInfo("com.dcinside.app.android", 0x80).metaData;
                    s5 = null;
                    if(bundle0 != null && bundle0.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                        s5 = bundle0.getString("com.google.unity.ads.UNITY_VERSION");
                    }
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
            }
            else {
                s5 = "";
            }
            boolean z5 = resolveInfo1 != null;
            return resolveInfo0 == null ? new zzeua(false, z5, s, z, z1, z2, s1, arrayList0, s2, s4, "google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys", z3, Build.MODEL, v2 / 0x400L, z4, s5, Build.VERSION.SDK_INT) : new zzeua(true, z5, s, z, z1, z2, s1, arrayList0, s2, s4, "google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys", z3, Build.MODEL, v2 / 0x400L, z4, s5, Build.VERSION.SDK_INT);
        };
        return this.zza.zzb(zzeub0);
    }

    // 检测为 Lambda 实现
    final zzeua zzc() throws Exception [...]

    @Nullable
    private static ResolveInfo zzd(PackageManager packageManager0, String s) {
        return packageManager0.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0x10000);
    }
}

