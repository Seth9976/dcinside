package com.google.android.gms.internal.ads;

import android.net.Network;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class zzfqr extends zzfqf {
    private zzfvf zza;
    private zzfvf zzb;
    @Nullable
    private zzfqq zzc;
    @Nullable
    private HttpURLConnection zzd;

    zzfqr() {
        this(() -> -1, () -> -1, null);
    }

    zzfqr(zzfvf zzfvf0, zzfvf zzfvf1, @Nullable zzfqq zzfqq0) {
        this.zza = zzfvf0;
        this.zzb = zzfvf1;
        this.zzc = zzfqq0;
    }

    @Override
    public void close() {
        zzfqr.zzs(this.zzd);
    }

    // 检测为 Lambda 实现
    static Integer zzf() [...]

    // 检测为 Lambda 实现
    static Integer zzg() [...]

    // 检测为 Lambda 实现
    static Integer zzh(int v) [...]

    // 检测为 Lambda 实现
    static Integer zzi(int v) [...]

    // 检测为 Lambda 实现
    static Integer zzj(int v) [...]

    // 检测为 Lambda 实现
    static Integer zzk(int v) [...]

    // 检测为 Lambda 实现
    static Integer zzl(int v) [...]

    public HttpURLConnection zzm() throws IOException {
        ((Integer)this.zza.zza()).intValue();
        ((Integer)this.zzb.zza()).intValue();
        zzfqq zzfqq0 = this.zzc;
        zzfqq0.getClass();
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)zzfqq0.zza();
        this.zzd = httpURLConnection0;
        return httpURLConnection0;
    }

    public HttpURLConnection zzn(zzfqq zzfqq0, int v, int v1) throws IOException {
        this.zza = () -> v;
        this.zzb = () -> v1;
        this.zzc = zzfqq0;
        return this.zzm();
    }

    @RequiresApi(21)
    public HttpURLConnection zzo(@NonNull Network network0, @NonNull URL uRL0, int v, int v1) throws IOException {
        this.zza = () -> v;
        this.zzb = () -> v1;
        this.zzc = new zzfqn(network0, uRL0);
        return this.zzm();
    }

    public URLConnection zzr(@NonNull URL uRL0, int v) throws IOException {
        this.zza = () -> v;
        this.zzc = new zzfqp(uRL0);
        return this.zzm();
    }

    public static void zzs(@Nullable HttpURLConnection httpURLConnection0) {
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
    }
}

