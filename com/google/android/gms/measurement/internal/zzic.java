package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zznr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzic extends zzge {
    private final zznv zza;
    private Boolean zzb;
    private String zzc;

    public zzic(zznv zznv0) {
        this(zznv0, null);
    }

    private zzic(zznv zznv0, String s) {
        Preconditions.checkNotNull(zznv0);
        this.zza = zznv0;
        this.zzc = null;
    }

    @VisibleForTesting
    private final void zza(Runnable runnable0) {
        Preconditions.checkNotNull(runnable0);
        if(this.zza.zzl().zzg()) {
            runnable0.run();
            return;
        }
        this.zza.zzl().zzc(runnable0);
    }

    @BinderThread
    private final void zza(String s, boolean z) {
        if(!TextUtils.isEmpty(s)) {
            try {
                if(z) {
                    if(this.zzb == null) {
                        this.zzb = Boolean.valueOf("com.google.android.gms".equals(this.zzc) || UidVerifier.isGooglePlayServicesUid(this.zza.zza(), Binder.getCallingUid()) || GoogleSignatureVerifier.getInstance(this.zza.zza()).isUidGoogleSigned(Binder.getCallingUid()));
                    }
                    if(!this.zzb.booleanValue()) {
                        goto label_5;
                    }
                    return;
                }
            label_5:
                if(this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zza(), Binder.getCallingUid(), s)) {
                    this.zzc = s;
                }
                if(!s.equals(this.zzc)) {
                    throw new SecurityException(String.format("Unknown calling package name \'%s\'.", s));
                }
                return;
            }
            catch(SecurityException securityException0) {
            }
            this.zza.zzj().zzg().zza("Measurement Service called with invalid calling package. appId", zzgo.zza(s));
            throw securityException0;
        }
        this.zza.zzj().zzg().zza("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final zzaj zza(zzo zzo0) {
        this.zzb(zzo0, false);
        Preconditions.checkNotEmpty(zzo0.zza);
        Future future0 = this.zza.zzl().zzb(new zziv(this, zzo0));
        try {
            return (zzaj)future0.get(10000L, TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException | InterruptedException | ExecutionException timeoutException0) {
            this.zza.zzj().zzg().zza("Failed to get consent. appId", zzgo.zza(zzo0.zza), timeoutException0);
            return new zzaj(null);
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zza(zzo zzo0, Bundle bundle0) {
        this.zzb(zzo0, false);
        Preconditions.checkNotNull(zzo0.zza);
        Future future0 = this.zza.zzl().zza(new zziy(this, zzo0, bundle0));
        try {
            return (List)future0.get();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            this.zza.zzj().zzg().zza("Failed to get trigger URIs. appId", zzgo.zza(zzo0.zza), interruptedException0);
            return Collections.emptyList();
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zza(zzo zzo0, boolean z) {
        this.zzb(zzo0, false);
        Preconditions.checkNotNull(zzo0.zza);
        Future future0 = this.zza.zzl().zza(new zzjb(this, zzo0.zza));
        try {
            List list0 = (List)future0.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                zzop zzop0 = (zzop)object0;
                if(z || !zzos.zzg(zzop0.zzc)) {
                    list1.add(new zzon(zzop0));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        this.zza.zzj().zzg().zza("Failed to get user properties. appId", zzgo.zza(zzo0.zza), interruptedException0);
        return null;
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zza(String s, String s1, zzo zzo0) {
        this.zzb(zzo0, false);
        Preconditions.checkNotNull(zzo0.zza);
        Future future0 = this.zza.zzl().zza(new zzir(this, zzo0.zza, s, s1));
        try {
            return (List)future0.get();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            this.zza.zzj().zzg().zza("Failed to get conditional user properties", interruptedException0);
            return Collections.emptyList();
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zza(String s, String s1, String s2) {
        this.zza(s, true);
        Future future0 = this.zza.zzl().zza(new zziq(this, s, s1, s2));
        try {
            return (List)future0.get();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            this.zza.zzj().zzg().zza("Failed to get conditional user properties as", interruptedException0);
            return Collections.emptyList();
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zza(String s, String s1, String s2, boolean z) {
        this.zza(s, true);
        Future future0 = this.zza.zzl().zza(new zzio(this, s, s1, s2));
        try {
            List list0 = (List)future0.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                zzop zzop0 = (zzop)object0;
                if(z || !zzos.zzg(zzop0.zzc)) {
                    list1.add(new zzon(zzop0));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        this.zza.zzj().zzg().zza("Failed to get user properties as. appId", zzgo.zza(s), interruptedException0);
        return Collections.emptyList();
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zza(String s, String s1, boolean z, zzo zzo0) {
        this.zzb(zzo0, false);
        Preconditions.checkNotNull(zzo0.zza);
        Future future0 = this.zza.zzl().zza(new zzip(this, zzo0.zza, s, s1));
        try {
            List list0 = (List)future0.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                zzop zzop0 = (zzop)object0;
                if(z || !zzos.zzg(zzop0.zzc)) {
                    list1.add(new zzon(zzop0));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        this.zza.zzj().zzg().zza("Failed to query user properties. appId", zzgo.zza(zzo0.zza), interruptedException0);
        return Collections.emptyList();
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zza(long v, String s, String s1, String s2) {
        this.zzb(new zzik(this, s1, s2, s, v));
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zza(Bundle bundle0, zzo zzo0) {
        this.zzb(zzo0, false);
        Preconditions.checkNotNull(zzo0.zza);
        this.zzb(() -> {
            boolean z = this.zza.zze().zza(zzbh.zzde);
            boolean z1 = this.zza.zze().zza(zzbh.zzdg);
            if(bundle0.isEmpty() && z && z1) {
                this.zza.zzf().zzp(zzo0.zza);
                return;
            }
            this.zza.zzf().zzb(zzo0.zza, bundle0);
            if(z1 && this.zza.zzf().zzt(zzo0.zza)) {
                this.zza.zzf().zza(zzo0.zza, bundle0);
            }
        });
    }

    // 检测为 Lambda 实现
    final void zza(Bundle bundle0, String s) [...]

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zza(zzae zzae0) {
        Preconditions.checkNotNull(zzae0);
        Preconditions.checkNotNull(zzae0.zzc);
        Preconditions.checkNotEmpty(zzae0.zza);
        this.zza(zzae0.zza, true);
        this.zzb(new zzim(this, new zzae(zzae0)));
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zza(zzae zzae0, zzo zzo0) {
        Preconditions.checkNotNull(zzae0);
        Preconditions.checkNotNull(zzae0.zzc);
        this.zzb(zzo0, false);
        zzae zzae1 = new zzae(zzae0);
        zzae1.zza = zzo0.zza;
        this.zzb(new zzin(this, zzae1, zzo0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zza(zzbf zzbf0, zzo zzo0) {
        Preconditions.checkNotNull(zzbf0);
        this.zzb(zzo0, false);
        this.zzb(new zziu(this, zzbf0, zzo0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zza(zzbf zzbf0, String s, String s1) {
        Preconditions.checkNotNull(zzbf0);
        Preconditions.checkNotEmpty(s);
        this.zza(s, true);
        this.zzb(new zzix(this, zzbf0, s));
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zza(zzon zzon0, zzo zzo0) {
        Preconditions.checkNotNull(zzon0);
        this.zzb(zzo0, false);
        this.zzb(new zziz(this, zzon0, zzo0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final byte[] zza(zzbf zzbf0, String s) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(zzbf0);
        this.zza(s, true);
        this.zza.zzj().zzc().zza("Log and bundle. event", this.zza.zzg().zza(zzbf0.zza));
        long v = this.zza.zzb().nanoTime();
        Future future0 = this.zza.zzl().zzb(new zziw(this, zzbf0, s));
        try {
            byte[] arr_b = (byte[])future0.get();
            if(arr_b == null) {
                this.zza.zzj().zzg().zza("Log and bundle returned null. appId", zzgo.zza(s));
                arr_b = new byte[0];
            }
            long v1 = this.zza.zzb().nanoTime();
            this.zza.zzj().zzc().zza("Log and bundle processed. event, size, time_ms", this.zza.zzg().zza(zzbf0.zza), ((int)arr_b.length), ((long)(v1 / 1000000L - v / 1000000L)));
            return arr_b;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        this.zza.zzj().zzg().zza("Failed to log and bundle. appId, event, error", zzgo.zza(s), this.zza.zzg().zza(zzbf0.zza), interruptedException0);
        return null;
    }

    @BinderThread
    private final void zzb(zzo zzo0, boolean z) {
        Preconditions.checkNotNull(zzo0);
        Preconditions.checkNotEmpty(zzo0.zza);
        this.zza(zzo0.zza, false);
        this.zza.zzq().zza(zzo0.zzb, zzo0.zzp);
    }

    @VisibleForTesting
    private final void zzb(Runnable runnable0) {
        Preconditions.checkNotNull(runnable0);
        if(this.zza.zzl().zzg()) {
            runnable0.run();
            return;
        }
        this.zza.zzl().zzb(runnable0);
    }

    @VisibleForTesting
    final zzbf zzb(zzbf zzbf0, zzo zzo0) {
        if("_cmp".equals(zzbf0.zza) && (zzbf0.zzb != null && zzbf0.zzb.zza() != 0)) {
            String s = zzbf0.zzb.zzd("_cis");
            if("referrer broadcast".equals(s) || "referrer API".equals(s)) {
                this.zza.zzj().zzo().zza("Event has been filtered ", zzbf0.toString());
                return new zzbf("_cmpx", zzbf0.zzb, zzbf0.zzc, zzbf0.zzd);
            }
        }
        return zzbf0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final String zzb(zzo zzo0) {
        this.zzb(zzo0, false);
        return this.zza.zzb(zzo0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzb(Bundle bundle0, zzo zzo0) {
        if(zznr.zza() && this.zza.zze().zza(zzbh.zzdg)) {
            this.zzb(zzo0, false);
            Preconditions.checkNotNull(zzo0.zza);
            this.zzb(() -> {
                if(bundle0.isEmpty()) {
                    this.zza.zzf().zzp(zzo0.zza);
                    return;
                }
                this.zza.zzf().zzb(zzo0.zza, bundle0);
                this.zza.zzf().zza(zzo0.zza, bundle0);
            });
        }
    }

    // 检测为 Lambda 实现
    final void zzb(Bundle bundle0, String s) [...]

    final void zzc(zzbf zzbf0, zzo zzo0) {
        boolean z;
        if(!this.zza.zzi().zzk(zzo0.zza)) {
            this.zzd(zzbf0, zzo0);
            return;
        }
        this.zza.zzj().zzp().zza("EES config found for", zzo0.zza);
        zzhl zzhl0 = this.zza.zzi();
        zzb zzb0 = TextUtils.isEmpty(zzo0.zza) ? null : ((zzb)zzhl0.zza.get(zzo0.zza));
        if(zzb0 == null) {
            this.zza.zzj().zzp().zza("EES not loaded for", zzo0.zza);
            this.zzd(zzbf0, zzo0);
            return;
        }
        try {
            Map map0 = this.zza.zzp().zza(zzbf0.zzb.zzb(), true);
            String s = zzji.zza(zzbf0.zza);
            if(s == null) {
                s = zzbf0.zza;
            }
            z = zzb0.zza(new zzad(s, zzbf0.zzd, map0));
        }
        catch(zzc unused_ex) {
            this.zza.zzj().zzg().zza("EES error. appId, eventName", zzo0.zzb, zzbf0.zza);
            z = false;
        }
        if(!z) {
            this.zza.zzj().zzp().zza("EES was not applied to event", zzbf0.zza);
            this.zzd(zzbf0, zzo0);
            return;
        }
        if(zzb0.zzd()) {
            this.zza.zzj().zzp().zza("EES edited event", zzbf0.zza);
            this.zzd(this.zza.zzp().zza(zzb0.zza().zzb()), zzo0);
        }
        else {
            this.zzd(zzbf0, zzo0);
        }
        if(zzb0.zzc()) {
            for(Object object0: zzb0.zza().zzc()) {
                this.zza.zzj().zzp().zza("EES logging created event", ((zzad)object0).zzb());
                this.zzd(this.zza.zzp().zza(((zzad)object0)), zzo0);
            }
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzc(zzo zzo0) {
        this.zzb(zzo0, false);
        this.zzb(new zzil(this, zzo0));
    }

    private final void zzd(zzbf zzbf0, zzo zzo0) {
        this.zza.zzr();
        this.zza.zza(zzbf0, zzo0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzd(zzo zzo0) {
        this.zzb(zzo0, false);
        this.zzb(new zzii(this, zzo0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zze(zzo zzo0) {
        Preconditions.checkNotEmpty(zzo0.zza);
        this.zza(zzo0.zza, false);
        this.zzb(new zzit(this, zzo0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzf(zzo zzo0) {
        Preconditions.checkNotEmpty(zzo0.zza);
        Preconditions.checkNotNull(zzo0.zzt);
        this.zza(new zzis(this, zzo0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzg(zzo zzo0) {
        Preconditions.checkNotEmpty(zzo0.zza);
        Preconditions.checkNotNull(zzo0.zzt);
        this.zza(() -> {
            this.zza.zzr();
            this.zza.zzf(zzo0);
        });
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzh(zzo zzo0) {
        this.zzb(zzo0, false);
        this.zzb(new zzij(this, zzo0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzi(zzo zzo0) {
        Preconditions.checkNotEmpty(zzo0.zza);
        Preconditions.checkNotNull(zzo0.zzt);
        this.zza(() -> {
            this.zza.zzr();
            this.zza.zzg(zzo0);
        });
    }

    // 检测为 Lambda 实现
    final void zzj(zzo zzo0) [...]

    // 检测为 Lambda 实现
    final void zzk(zzo zzo0) [...]
}

