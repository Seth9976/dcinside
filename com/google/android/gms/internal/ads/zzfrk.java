package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import o3.h;

public final class zzfrk {
    public static final int zza;
    public static final ClipData zzb;

    static {
        zzfrk.zza = Build.VERSION.SDK_INT <= 22 ? 0 : 0x4000000;
        zzfrk.zzb = ClipData.newIntent("", new Intent());
    }

    @h
    public static PendingIntent zza(Context context0, int v, Intent intent0, int v1) {
        return PendingIntent.getActivity(context0, 0, zzfrk.zzc(intent0, 0xC000000, 0), 0xC000000);
    }

    @h
    public static PendingIntent zzb(Context context0, int v, Intent intent0, int v1, int v2) {
        return PendingIntent.getService(context0, 0, zzfrk.zzc(intent0, v1, 0), v1);
    }

    private static Intent zzc(Intent intent0, int v, int v1) {
        boolean z = true;
        zzfun.zzf((v & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        zzfun.zzf((v & 1) == 0, "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        zzfun.zzf((v & 2) == 0, "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        zzfun.zzf((v & 4) == 0, "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        zzfun.zzf((v & 0x80) == 0, "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        zzfun.zzf(intent0.getComponent() != null, "Must set component on Intent.");
        if(Build.VERSION.SDK_INT >= 23 && !zzfrk.zzd(v, 0x4000000)) {
            z = false;
        }
        zzfun.zzf(z, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        Intent intent1 = new Intent(intent0);
        if(Build.VERSION.SDK_INT < 23 || !zzfrk.zzd(v, 0x4000000)) {
            if(intent1.getPackage() == null) {
                intent1.setPackage(intent1.getComponent().getPackageName());
            }
            if(intent1.getAction() == null) {
                intent1.setAction("");
            }
            if(intent1.getCategories() == null) {
                intent1.addCategory("");
            }
            if(intent1.getData() == null) {
                intent1.setDataAndType(Uri.EMPTY, "*/*");
            }
            if(intent1.getClipData() == null) {
                intent1.setClipData(zzfrk.zzb);
            }
        }
        return intent1;
    }

    private static boolean zzd(int v, int v1) [...] // 潜在的解密器
}

