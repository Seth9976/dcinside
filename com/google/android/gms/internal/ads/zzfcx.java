package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public final class zzfcx {
    public static Bundle zza(Bundle bundle0, String s) {
        Bundle bundle1 = bundle0.getBundle(s);
        return bundle1 == null ? new Bundle() : bundle1;
    }

    public static void zzb(Bundle bundle0, @Nullable String s, @Nullable Bundle bundle1) {
        if(bundle1 != null) {
            bundle0.putBundle(s, bundle1);
        }
    }

    public static void zzc(Bundle bundle0, @Nullable String s, @Nullable String s1) {
        if(s1 != null) {
            bundle0.putString(s, s1);
        }
    }

    public static void zzd(Bundle bundle0, @Nullable String s, @Nullable List list0) {
        if(list0 != null) {
            bundle0.putStringArrayList(s, new ArrayList(list0));
        }
    }

    public static void zze(Bundle bundle0, @Nullable String s, int v, boolean z) {
        if(z) {
            bundle0.putInt(s, v);
        }
    }

    public static void zzf(Bundle bundle0, @Nullable String s, @Nullable String s1, boolean z) {
        if(z && s1 != null) {
            bundle0.putString(s, s1);
        }
    }

    public static void zzg(Bundle bundle0, @Nullable String s, boolean z, boolean z1) {
        if(z1) {
            bundle0.putBoolean(s, z);
        }
    }
}

