package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

public final class zzftq {
    private static final zzfto zza;

    static {
        zzftq.zza = new zzfto("PhoneskyVerificationUtils");
    }

    public static boolean zza(Context context0) {
        Signature[] arr_signature;
        try {
            if(!context0.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                goto label_4;
            }
            goto label_6;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            zzftq.zza.zzd("Play Store package is not found.", new Object[0]);
            return false;
        }
    label_4:
        zzftq.zza.zzd("Play Store package is disabled.", new Object[0]);
        return false;
        try {
        label_6:
            arr_signature = context0.getPackageManager().getPackageInfo("com.android.vending", 0x40).signatures;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            zzftq.zza.zzd("Play Store package is not found.", new Object[0]);
            return false;
        }
        if(arr_signature != null && arr_signature.length != 0) {
            ArrayList arrayList0 = new ArrayList();
            int v = 0;
            while(v < arr_signature.length) {
                String s = zzftp.zza(arr_signature[v].toByteArray());
                arrayList0.add(s);
                if(!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(s) && (!Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys") || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(s))) {
                    ++v;
                    continue;
                }
                return true;
            }
            zzfto zzfto0 = zzftq.zza;
            StringBuilder stringBuilder0 = new StringBuilder();
            Iterator iterator0 = arrayList0.iterator();
            if(iterator0.hasNext()) {
                while(true) {
                    Object object0 = iterator0.next();
                    stringBuilder0.append(((CharSequence)object0));
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    stringBuilder0.append(", ");
                }
            }
            zzfto0.zzd(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", stringBuilder0.toString()), new Object[0]);
            return false;
        }
        zzftq.zza.zzd("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
        return false;
    }
}

