package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.List;

@VisibleForTesting
public final class zzbka {
    @Nullable
    public static final Intent zza(Uri uri0, Context context0, zzava zzava0, View view0, zzfcn zzfcn0) {
        if(uri0 == null) {
            return null;
        }
        Intent intent0 = new Intent("android.intent.action.VIEW");
        intent0.addFlags(0x10000000);
        intent0.setData(uri0);
        intent0.setAction("android.intent.action.VIEW");
        return intent0;
    }

    public static final Intent zzb(Intent intent0, ResolveInfo resolveInfo0, Context context0, zzava zzava0, View view0, zzfcn zzfcn0) {
        Intent intent1 = new Intent(intent0);
        intent1.setClassName(resolveInfo0.activityInfo.packageName, resolveInfo0.activityInfo.name);
        return intent1;
    }

    @VisibleForTesting
    public static final ResolveInfo zzc(Intent intent0, Context context0, zzava zzava0, View view0, zzfcn zzfcn0) {
        return zzbka.zzd(intent0, new ArrayList(), context0, zzava0, view0, zzfcn0);
    }

    @Nullable
    @VisibleForTesting
    public static final ResolveInfo zzd(Intent intent0, ArrayList arrayList0, Context context0, zzava zzava0, View view0, zzfcn zzfcn0) {
        ResolveInfo resolveInfo0 = null;
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                return null;
            }
            List list0 = packageManager0.queryIntentActivities(intent0, 0x10000);
            ResolveInfo resolveInfo1 = packageManager0.resolveActivity(intent0, 0x10000);
            if(list0 != null && resolveInfo1 != null) {
                for(int v = 0; v < list0.size(); ++v) {
                    ResolveInfo resolveInfo2 = (ResolveInfo)list0.get(v);
                    if(resolveInfo1.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                        resolveInfo0 = resolveInfo1;
                        break;
                    }
                }
            }
            arrayList0.addAll(list0);
        }
        catch(Throwable throwable0) {
            zzv.zzp().zzw(throwable0, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        return resolveInfo0;
    }
}

