package com.google.android.gms.internal.vision;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzu {
    public static boolean zza(Context context0, String s) {
        return DynamiteModule.getLocalVersion(context0, s) > DynamiteModule.getRemoteVersion(context0, "com.google.android.gms.vision.dynamite");
    }
}

