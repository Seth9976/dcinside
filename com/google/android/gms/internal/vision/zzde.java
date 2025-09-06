package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzde {
    public static int zza(int v, int v1) {
        String s;
        if(v >= 0 && v < v1) {
            return v;
        }
        if(v >= 0) {
            if(v1 < 0) {
                throw new IllegalArgumentException("negative size: " + v1);
            }
            s = zzdg.zza("%s (%s) must be less than size (%s)", new Object[]{"index", v, v1});
        }
        else {
            s = zzdg.zza("%s (%s) must not be negative", new Object[]{"index", v});
        }
        throw new IndexOutOfBoundsException(s);
    }

    @NonNullDecl
    public static Object zza(@NonNullDecl Object object0) {
        object0.getClass();
        return object0;
    }

    @NonNullDecl
    public static Object zza(@NonNullDecl Object object0, @NullableDecl Object object1) {
        if(object0 == null) {
            throw new NullPointerException(String.valueOf(object1));
        }
        return object0;
    }

    private static String zza(int v, int v1, @NullableDecl String s) {
        if(v < 0) {
            return zzdg.zza("%s (%s) must not be negative", new Object[]{s, v});
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("negative size: " + v1);
        }
        return zzdg.zza("%s (%s) must not be greater than size (%s)", new Object[]{s, v, v1});
    }

    public static void zza(int v, int v1, int v2) {
        String s;
        if(v >= 0 && v1 >= v && v1 <= v2) {
            return;
        }
        if(v < 0 || v > v2) {
            s = zzde.zza(v, v2, "start index");
        }
        else if(v1 >= 0 && v1 <= v2) {
            s = zzdg.zza("end index (%s) must not be less than start index (%s)", new Object[]{v1, v});
        }
        else {
            s = zzde.zza(v1, v2, "end index");
        }
        throw new IndexOutOfBoundsException(s);
    }

    public static void zza(boolean z, @NullableDecl Object object0) {
        if(!z) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
    }

    public static int zzb(int v, int v1) {
        if(v < 0 || v > v1) {
            throw new IndexOutOfBoundsException(zzde.zza(v, v1, "index"));
        }
        return v;
    }

    public static void zzb(boolean z, @NullableDecl Object object0) {
        if(!z) {
            throw new IllegalStateException(String.valueOf(object0));
        }
    }
}

