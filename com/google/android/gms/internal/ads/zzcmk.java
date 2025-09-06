package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.common.util.concurrent.t0;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzcmk {
    @VisibleForTesting
    zzbuj zza;
    @VisibleForTesting
    zzbuj zzb;
    private final Context zzc;
    private final zzg zzd;
    private final zzecs zze;
    private final zzdpb zzf;
    private final zzgcs zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    zzcmk(Context context0, zzg zzg0, zzecs zzecs0, zzdpb zzdpb0, zzgcs zzgcs0, zzgcs zzgcs1, ScheduledExecutorService scheduledExecutorService0) {
        this.zzc = context0;
        this.zzd = zzg0;
        this.zze = zzecs0;
        this.zzf = zzdpb0;
        this.zzg = zzgcs0;
        this.zzh = zzgcs1;
        this.zzi = scheduledExecutorService0;
    }

    public final t0 zzb(String s, Random random0) {
        if(TextUtils.isEmpty(s)) {
            return zzgch.zzh(s);
        }
        t0 t00 = this.zzk(s, this.zzf.zza(), random0);
        zzcmb zzcmb0 = (Throwable throwable0) -> {
            zzcmd zzcmd0 = () -> {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzkh)).booleanValue()) {
                    zzbuj zzbuj0 = zzbuh.zzc(this.zzc);
                    this.zzb = zzbuj0;
                    zzbuj0.zzh(throwable0, "AttributionReporting.getUpdatedUrlAndRegisterSource");
                    return;
                }
                zzbuj zzbuj1 = zzbuh.zza(this.zzc);
                this.zza = zzbuj1;
                zzbuj1.zzh(throwable0, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
            };
            this.zzg.zza(zzcmd0);
            return zzgch.zzh(s);
        };
        return zzgch.zzf(t00, Throwable.class, zzcmb0, this.zzg);
    }

    // 检测为 Lambda 实现
    final t0 zzc(String s, Throwable throwable0) throws Exception [...]

    // 检测为 Lambda 实现
    final t0 zzd(Uri.Builder uri$Builder0, String s, InputEvent inputEvent0, Integer integer0) throws Exception [...]

    // 检测为 Lambda 实现
    final t0 zze(Uri.Builder uri$Builder0, Throwable throwable0) throws Exception [...]

    // 检测为 Lambda 实现
    final void zzg(Throwable throwable0) [...]

    // 检测为 Lambda 实现
    final void zzh(Throwable throwable0) [...]

    public final void zzi(String s, zzfja zzfja0, Random random0, @Nullable zzv zzv0) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        zzgch.zzr(zzgch.zzo(this.zzk(s, this.zzf.zza(), random0), ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzkg)))))), TimeUnit.MILLISECONDS, this.zzi), new zzcmj(this, zzfja0, s, zzv0), this.zzg);
    }

    // 去混淆评级： 低(20)
    public static boolean zzj(String s) {
        return TextUtils.isEmpty(s) ? false : s.contains(((CharSequence)zzbe.zzc().zza(zzbcl.zzka)));
    }

    private final t0 zzk(String s, @Nullable InputEvent inputEvent0, Random random0) {
        try {
            if(s.contains(((CharSequence)zzbe.zzc().zza(zzbcl.zzka))) && !this.zzd.zzN()) {
                Uri.Builder uri$Builder0 = Uri.parse(s).buildUpon();
                String s1 = String.valueOf(random0.nextInt(0x7FFFFFFF));
                uri$Builder0.appendQueryParameter(((String)zzbe.zzc().zza(zzbcl.zzkb)), s1);
                if(inputEvent0 == null) {
                    uri$Builder0.appendQueryParameter(((String)zzbe.zzc().zza(zzbcl.zzkc)), "11");
                    return zzgch.zzh(uri$Builder0.toString());
                }
                zzgby zzgby0 = (zzgby)zzgch.zzn(zzgby.zzu(this.zze.zza()), (Integer integer0) -> {
                    if(((int)integer0) == 1) {
                        Uri.Builder uri$Builder1 = uri$Builder0.build().buildUpon();
                        uri$Builder1.appendQueryParameter(((String)zzbe.zzc().zza(zzbcl.zzkd)), "1");
                        uri$Builder1.appendQueryParameter(((String)zzbe.zzc().zza(zzbcl.zzkc)), "12");
                        if(s.contains(((CharSequence)zzbe.zzc().zza(zzbcl.zzke)))) {
                            uri$Builder1.authority(((String)zzbe.zzc().zza(zzbcl.zzkf)));
                        }
                        Uri uri0 = uri$Builder1.build();
                        return (zzgby)zzgch.zzn(zzgby.zzu(this.zze.zzb(uri0, inputEvent0)), new zzcmg(uri$Builder0), this.zzh);
                    }
                    uri$Builder0.appendQueryParameter(((String)zzbe.zzc().zza(zzbcl.zzkc)), "10");
                    return zzgch.zzh(uri$Builder0.toString());
                }, this.zzh);
                zzcmf zzcmf0 = (Throwable throwable0) -> {
                    zzcmc zzcmc0 = () -> {
                        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkh)).booleanValue()) {
                            zzbuj zzbuj0 = zzbuh.zzc(this.zzc);
                            this.zzb = zzbuj0;
                            zzbuj0.zzh(throwable0, "AttributionReporting");
                            return;
                        }
                        zzbuj zzbuj1 = zzbuh.zza(this.zzc);
                        this.zza = zzbuj1;
                        zzbuj1.zzh(throwable0, "AttributionReportingSampled");
                    };
                    this.zzg.zza(zzcmc0);
                    uri$Builder0.appendQueryParameter(((String)zzbe.zzc().zza(zzbcl.zzkc)), "9");
                    return zzgch.zzh(uri$Builder0.toString());
                };
                return (zzgby)zzgch.zzf(zzgby0, Throwable.class, zzcmf0, this.zzg);
            }
            return zzgch.zzh(s);
        }
        catch(Exception exception0) {
            return zzgch.zzg(exception0);
        }
    }
}

