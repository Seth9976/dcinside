package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzfob {
    private final Context zza;
    private final Executor zzb;
    private final zzfni zzc;
    private final zzfnk zzd;
    private final zzfoa zze;
    private final zzfoa zzf;
    private Task zzg;
    private Task zzh;

    @VisibleForTesting
    zzfob(Context context0, Executor executor0, zzfni zzfni0, zzfnk zzfnk0, zzfny zzfny0, zzfnz zzfnz0) {
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = zzfni0;
        this.zzd = zzfnk0;
        this.zze = zzfny0;
        this.zzf = zzfnz0;
    }

    public final zzasy zza() {
        return zzfob.zzg(this.zzg, this.zze.zza());
    }

    public final zzasy zzb() {
        return zzfob.zzg(this.zzh, this.zzf.zza());
    }

    // 检测为 Lambda 实现
    final zzasy zzc() throws Exception [...]

    // 检测为 Lambda 实现
    final zzasy zzd() throws Exception [...]

    public static zzfob zze(@NonNull Context context0, @NonNull Executor executor0, @NonNull zzfni zzfni0, @NonNull zzfnk zzfnk0) {
        zzfob zzfob0 = new zzfob(context0, executor0, zzfni0, zzfnk0, new zzfny(), new zzfnz());
        zzfob0.zzg = zzfob0.zzd.zzh() ? zzfob0.zzh(() -> {
            zzasc zzasc0 = zzasy.zza();
            Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(zzfob0.zza);
            String s = advertisingIdClient$Info0.getId();
            if(s != null && s.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uUID0 = UUID.fromString(s);
                byte[] arr_b = new byte[16];
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
                byteBuffer0.putLong(uUID0.getMostSignificantBits());
                byteBuffer0.putLong(uUID0.getLeastSignificantBits());
                s = Base64.encodeToString(arr_b, 11);
            }
            if(s != null) {
                zzasc0.zzs(s);
                zzasc0.zzr(advertisingIdClient$Info0.isLimitAdTrackingEnabled());
                zzasc0.zzab(6);
            }
            return (zzasy)zzasc0.zzbn();
        }) : Tasks.forResult(zzfob0.zze.zza());
        zzfob0.zzh = zzfob0.zzh(() -> {
            PackageInfo packageInfo0 = zzfob0.zza.getPackageManager().getPackageInfo("com.dcinside.app.android", 0);
            return zzfnq.zza(zzfob0.zza, "com.dcinside.app.android", Integer.toString(packageInfo0.versionCode));
        });
        return zzfob0;
    }

    // 检测为 Lambda 实现
    final void zzf(Exception exception0) [...]

    private static zzasy zzg(@NonNull Task task0, @NonNull zzasy zzasy0) {
        return task0.isSuccessful() ? ((zzasy)task0.getResult()) : zzasy0;
    }

    private final Task zzh(@NonNull Callable callable0) {
        Task task0 = Tasks.call(this.zzb, callable0);
        zzfnx zzfnx0 = (Exception exception0) -> {
            if(exception0 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            this.zzc.zzc(2025, -1L, exception0);
        };
        return task0.addOnFailureListener(this.zzb, zzfnx0);
    }
}

