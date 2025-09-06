package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.TimeUnit;

public final class zzcbt {
    private static final boolean zza;
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    @Nullable
    private final zzbcx zze;
    @Nullable
    private final zzbda zzf;
    private final zzbh zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcay zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        zzcbt.zza = zzbc.zze().nextInt(100) < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzmA))));
    }

    public zzcbt(Context context0, VersionInfoParcel versionInfoParcel0, String s, @Nullable zzbda zzbda0, @Nullable zzbcx zzbcx0) {
        zzbf zzbf0 = new zzbf();
        zzbf0.zza("min_1", 4.900000E-324, 1.0);
        zzbf0.zza("1_5", 1.0, 5.0);
        zzbf0.zza("5_10", 5.0, 10.0);
        zzbf0.zza("10_20", 10.0, 20.0);
        zzbf0.zza("20_30", 20.0, 30.0);
        zzbf0.zza("30_max", 30.0, 1.797693E+308);
        this.zzg = zzbf0.zzb();
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = -1L;
        this.zzb = context0;
        this.zzd = versionInfoParcel0;
        this.zzc = s;
        this.zzf = zzbda0;
        this.zze = zzbcx0;
        String s1 = (String)zzbe.zzc().zza(zzbcl.zzN);
        if(s1 == null) {
            this.zzi = new String[0];
            this.zzh = new long[0];
            return;
        }
        String[] arr_s = TextUtils.split(s1, ",");
        this.zzi = new String[arr_s.length];
        this.zzh = new long[arr_s.length];
        for(int v = 0; v < arr_s.length; ++v) {
            try {
                this.zzh[v] = Long.parseLong(arr_s[v]);
            }
            catch(NumberFormatException numberFormatException0) {
                zzo.zzk("Unable to parse frame hash target time number.", numberFormatException0);
                this.zzh[v] = -1L;
            }
        }
    }

    public final void zza(zzcay zzcay0) {
        zzbcs.zza(this.zzf, this.zze, new String[]{"vpc2"});
        this.zzj = true;
        String s = zzcay0.zzj();
        this.zzf.zzd("vpn", s);
        this.zzo = zzcay0;
    }

    public final void zzb() {
        if(this.zzj && !this.zzk) {
            zzbcs.zza(this.zzf, this.zze, new String[]{"vfr2"});
            this.zzk = true;
        }
    }

    public final void zzc() {
        this.zzn = true;
        if(this.zzk && !this.zzl) {
            zzbcs.zza(this.zzf, this.zze, new String[]{"vfp2"});
            this.zzl = true;
        }
    }

    public final void zzd() {
        if(zzcbt.zza && !this.zzp) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("type", "native-player-metrics");
            bundle0.putString("request", this.zzc);
            bundle0.putString("player", this.zzo.zzj());
            for(Object object0: this.zzg.zza()) {
                bundle0.putString("fps_c_" + ((com.google.android.gms.ads.internal.util.zzbe)object0).zza, Integer.toString(((com.google.android.gms.ads.internal.util.zzbe)object0).zze));
                bundle0.putString("fps_p_" + ((com.google.android.gms.ads.internal.util.zzbe)object0).zza, Double.toString(((com.google.android.gms.ads.internal.util.zzbe)object0).zzd));
            }
            for(int v = 0; true; ++v) {
                long[] arr_v = this.zzh;
                if(v >= arr_v.length) {
                    break;
                }
                String s = this.zzi[v];
                if(s != null) {
                    bundle0.putString("fh_" + ((long)arr_v[v]).toString(), s);
                }
            }
            zzv.zzq().zzi(this.zzb, this.zzd.afmaVersion, "gmob-apps", bundle0, true);
            this.zzp = true;
        }
    }

    public final void zze() {
        this.zzn = false;
    }

    public final void zzf(zzcay zzcay0) {
        if(this.zzl && !this.zzm) {
            if(zze.zzc() && !this.zzm) {
                zze.zza("VideoMetricsMixin first frame");
            }
            zzbcs.zza(this.zzf, this.zze, new String[]{"vff2"});
            this.zzm = true;
        }
        long v = zzv.zzC().nanoTime();
        if(this.zzn && this.zzq && this.zzr != -1L) {
            double f = (double)TimeUnit.SECONDS.toNanos(1L);
            this.zzg.zzb(f / ((double)(v - this.zzr)));
        }
        this.zzq = this.zzn;
        this.zzr = v;
        long v1 = (long)(((Long)zzbe.zzc().zza(zzbcl.zzO)));
        long v2 = (long)zzcay0.zza();
        for(int v3 = 0; true; ++v3) {
            String[] arr_s = this.zzi;
            if(v3 >= arr_s.length) {
                break;
            }
            if(arr_s[v3] == null && v1 > Math.abs(v2 - this.zzh[v3])) {
                String[] arr_s1 = this.zzi;
                Bitmap bitmap0 = zzcay0.getBitmap(8, 8);
                long v4 = 0x3FL;
                long v5 = 0L;
                for(int v6 = 0; v6 < 8; ++v6) {
                    for(int v7 = 0; v7 < 8; ++v7) {
                        int v8 = bitmap0.getPixel(v7, v6);
                        v5 |= (Color.blue(v8) + Color.red(v8) + Color.green(v8) <= 0x80 ? 0L : 1L) << ((int)v4);
                        --v4;
                    }
                }
                arr_s1[v3] = String.format("%016X", v5);
                return;
            }
        }
    }
}

