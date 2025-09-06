package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzhfk {
    private static String zza;

    public static String zza(Context context0) {
        String s = zzhfk.zza;
        if(s != null) {
            return s;
        }
        PackageManager packageManager0 = context0.getPackageManager();
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfo0 = packageManager0.resolveActivity(intent0, 0);
        String s1 = resolveInfo0 == null ? null : resolveInfo0.activityInfo.packageName;
        List list0 = packageManager0.queryIntentActivities(intent0, 0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            ResolveInfo resolveInfo1 = (ResolveInfo)object0;
            Intent intent1 = new Intent();
            intent1.setAction("android.support.customtabs.action.CustomTabsService");
            intent1.setPackage(resolveInfo1.activityInfo.packageName);
            if(packageManager0.resolveService(intent1, 0) != null) {
                arrayList0.add(resolveInfo1.activityInfo.packageName);
            }
        }
        if(arrayList0.isEmpty()) {
            zzhfk.zza = null;
            return null;
        }
        if(arrayList0.size() == 1) {
            zzhfk.zza = (String)arrayList0.get(0);
            return zzhfk.zza;
        }
        if(!TextUtils.isEmpty(s1)) {
            try {
                List list1 = context0.getPackageManager().queryIntentActivities(intent0, 0x40);
                if(list1 != null && list1.size() != 0) {
                    Iterator iterator1 = list1.iterator();
                    while(true) {
                    label_29:
                        if(!iterator1.hasNext()) {
                            break;
                        }
                        Object object1 = iterator1.next();
                        ResolveInfo resolveInfo2 = (ResolveInfo)object1;
                        IntentFilter intentFilter0 = resolveInfo2.filter;
                        if(intentFilter0 == null || intentFilter0.countDataAuthorities() == 0 || intentFilter0.countDataPaths() == 0) {
                            continue;
                        }
                        goto label_37;
                    }
                }
            }
            catch(RuntimeException unused_ex) {
                Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
            }
            goto label_39;
        label_37:
            if(resolveInfo2.activityInfo == null) {
                goto label_29;
            }
            goto label_42;
        label_39:
            if(arrayList0.contains(s1)) {
                zzhfk.zza = s1;
                return zzhfk.zza;
            }
        }
    label_42:
        if(arrayList0.contains("com.android.chrome")) {
            zzhfk.zza = "com.android.chrome";
            return "com.android.chrome";
        }
        if(arrayList0.contains("com.chrome.beta")) {
            zzhfk.zza = "com.chrome.beta";
            return "com.chrome.beta";
        }
        if(arrayList0.contains("com.chrome.dev")) {
            zzhfk.zza = "com.chrome.dev";
        }
        return zzhfk.zza;
    }
}

