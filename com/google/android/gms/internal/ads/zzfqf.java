package com.google.android.gms.internal.ads;

import java.io.Closeable;

public abstract class zzfqf implements Closeable {
    public static zzfqr zza() {
        return new zzfqr();
    }

    public static zzfqr zzb(int v, zzfqq zzfqq0) {
        return new zzfqr(() -> v, () -> -1, zzfqq0);
    }

    public static zzfqr zzc(zzfvf zzfvf0, zzfvf zzfvf1, zzfqq zzfqq0) {
        return new zzfqr(zzfvf0, zzfvf1, zzfqq0);
    }

    // 检测为 Lambda 实现
    static Integer zzd(int v) [...]

    // 检测为 Lambda 实现
    static Integer zze() [...]
}

