package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.Clock;
import j..util.Objects;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import w4.d;

public final class zzmw extends zznr {
    public final zzhb zza;
    public final zzhb zzb;
    public final zzhb zzc;
    public final zzhb zzd;
    public final zzhb zze;
    public final zzhb zzf;
    private final Map zzh;

    zzmw(zznv zznv0) {
        super(zznv0);
        this.zzh = new HashMap();
        zzha zzha0 = this.zzk();
        Objects.requireNonNull(zzha0);
        this.zza = new zzhb(zzha0, "last_delete_stale", 0L);
        zzha zzha1 = this.zzk();
        Objects.requireNonNull(zzha1);
        this.zzb = new zzhb(zzha1, "last_delete_stale_batch", 0L);
        zzha zzha2 = this.zzk();
        Objects.requireNonNull(zzha2);
        this.zzc = new zzhb(zzha2, "backoff", 0L);
        zzha zzha3 = this.zzk();
        Objects.requireNonNull(zzha3);
        this.zzd = new zzhb(zzha3, "last_upload", 0L);
        zzha zzha4 = this.zzk();
        Objects.requireNonNull(zzha4);
        this.zze = new zzhb(zzha4, "last_upload_attempt", 0L);
        zzha zzha5 = this.zzk();
        Objects.requireNonNull(zzha5);
        this.zzf = new zzhb(zzha5, "midnight_offset", 0L);
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzoo g_() {
        return super.g_();
    }

    @WorkerThread
    @Deprecated
    private final Pair zza(String s) {
        zzmv zzmv1;
        Info advertisingIdClient$Info0;
        this.zzt();
        long v = this.zzb().elapsedRealtime();
        zzmv zzmv0 = (zzmv)this.zzh.get(s);
        if(zzmv0 != null && v < zzmv0.zzc) {
            return new Pair(zzmv0.zza, Boolean.valueOf(zzmv0.zzb));
        }
        long v1 = this.zze().zzd(s) + v;
        try {
            try {
                advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(this.zza());
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                if(zzmv0 != null) {
                    long v2 = this.zze().zzc(s, zzbh.zzb);
                    if(v < zzmv0.zzc + v2) {
                        return new Pair(zzmv0.zza, Boolean.valueOf(zzmv0.zzb));
                    }
                }
                advertisingIdClient$Info0 = null;
            }
            if(advertisingIdClient$Info0 == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String s1 = advertisingIdClient$Info0.getId();
            zzmv1 = s1 == null ? new zzmv("", advertisingIdClient$Info0.isLimitAdTrackingEnabled(), v1) : new zzmv(s1, advertisingIdClient$Info0.isLimitAdTrackingEnabled(), v1);
        }
        catch(Exception exception0) {
            this.zzj().zzc().zza("Unable to get advertising id", exception0);
            zzmv1 = new zzmv("", false, v1);
        }
        this.zzh.put(s, zzmv1);
        return new Pair(zzmv1.zza, Boolean.valueOf(zzmv1.zzb));
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Context zza() {
        return super.zza();
    }

    // 去混淆评级： 低(20)
    @WorkerThread
    final Pair zza(String s, zzje zzje0) {
        return zzje0.zzg() ? this.zza(s) : new Pair("", Boolean.FALSE);
    }

    @WorkerThread
    @Deprecated
    final String zza(String s, boolean z) {
        this.zzt();
        String s1 = z ? ((String)this.zza(s).first) : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigest0 = zzos.zzu();
        return messageDigest0 == null ? null : String.format(Locale.US, "%032X", new BigInteger(1, messageDigest0.digest(s1.getBytes())));
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzab zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzag zze() {
        return super.zze();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzaz zzf() {
        return super.zzf();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzt zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzal zzh() {
        return super.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgh zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzgo zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzha zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzhv zzl() {
        return super.zzl();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzhl zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzmw zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zznu zzo() {
        return super.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzos zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzt() {
        super.zzt();
    }
}

