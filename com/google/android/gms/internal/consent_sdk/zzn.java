package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.ump.a;
import com.google.android.ump.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

final class zzn {
    private final zzl zza;
    private final Activity zzb;
    private final a zzc;
    private final d zzd;

    zzn(zzl zzl0, Activity activity0, a a0, d d0, zzm zzm0) {
        this.zza = zzl0;
        this.zzb = activity0;
        this.zzc = a0;
        this.zzd = d0;
    }

    static zzci zza(zzn zzn0) {
        PackageInfo packageInfo0;
        List list1;
        List list0;
        Bundle bundle0;
        zzci zzci0 = new zzci();
        String s = zzn0.zzd.c();
        String s1 = null;
        if(TextUtils.isEmpty(s)) {
            try {
                bundle0 = null;
                bundle0 = zzn0.zza.zza.getPackageManager().getApplicationInfo("com.dcinside.app.android", 0x80).metaData;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            if(bundle0 != null) {
                s = bundle0.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if(TextUtils.isEmpty(s)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzci0.zza = s;
        if(zzn0.zzc.b()) {
            list0 = new ArrayList();
            switch(zzn0.zzc.a()) {
                case 1: {
                    list0.add(zzcd.zzc);
                    break;
                }
                case 2: {
                    list0.add(zzcd.zzd);
                }
            }
            list0.add(zzcd.zze);
        }
        else {
            list0 = Collections.emptyList();
        }
        zzci0.zzi = list0;
        zzci0.zze = zzn0.zza.zzb.zzc();
        zzci0.zzd = Boolean.valueOf(zzn0.zzd.b());
        zzci0.zzc = Locale.getDefault().toLanguageTag();
        zzce zzce0 = new zzce();
        int v = Build.VERSION.SDK_INT;
        zzce0.zzb = v;
        zzce0.zza = Build.MODEL;
        zzce0.zzc = 2;
        zzci0.zzb = zzce0;
        Configuration configuration0 = zzn0.zza.zza.getResources().getConfiguration();
        zzn0.zza.zza.getResources().getConfiguration();
        zzcg zzcg0 = new zzcg();
        zzcg0.zza = configuration0.screenWidthDp;
        zzcg0.zzb = configuration0.screenHeightDp;
        zzcg0.zzc = (double)zzn0.zza.zza.getResources().getDisplayMetrics().density;
        if(v < 28) {
            list1 = Collections.emptyList();
        }
        else {
            Window window0 = zzn0.zzb == null ? null : zzn0.zzb.getWindow();
            View view0 = window0 == null ? null : window0.getDecorView();
            WindowInsets windowInsets0 = view0 == null ? null : view0.getRootWindowInsets();
            DisplayCutout displayCutout0 = windowInsets0 == null ? null : windowInsets0.getDisplayCutout();
            if(displayCutout0 == null) {
                list1 = Collections.emptyList();
            }
            else {
                displayCutout0.getSafeInsetBottom();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: displayCutout0.getBoundingRects()) {
                    Rect rect0 = (Rect)object0;
                    if(rect0 != null) {
                        zzcf zzcf0 = new zzcf();
                        zzcf0.zzb = rect0.left;
                        zzcf0.zzc = rect0.right;
                        zzcf0.zza = rect0.top;
                        zzcf0.zzd = rect0.bottom;
                        arrayList0.add(zzcf0);
                    }
                }
                list1 = arrayList0;
            }
        }
        try {
            zzcg0.zzd = list1;
            zzci0.zzf = zzcg0;
            packageInfo0 = null;
            packageInfo0 = zzn0.zza.zza.getPackageManager().getPackageInfo("com.dcinside.app.android", 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        zzcc zzcc0 = new zzcc();
        zzcc0.zza = "com.dcinside.app.android";
        CharSequence charSequence0 = zzn0.zza.zza.getPackageManager().getApplicationLabel(zzn0.zza.zza.getApplicationInfo());
        if(charSequence0 != null) {
            s1 = charSequence0.toString();
        }
        zzcc0.zzb = s1;
        if(packageInfo0 != null) {
            zzcc0.zzc = Long.toString((Build.VERSION.SDK_INT < 28 ? ((long)packageInfo0.versionCode) : packageInfo0.getLongVersionCode()));
        }
        zzci0.zzg = zzcc0;
        zzch zzch0 = new zzch();
        zzch0.zza = "3.0.0";
        zzci0.zzh = zzch0;
        return zzci0;
    }
}

