package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;
import w4.d;

public final class zzlj extends zzh {
    @VisibleForTesting
    protected zzlk zza;
    private volatile zzlk zzb;
    private volatile zzlk zzc;
    private final Map zzd;
    @GuardedBy("activityLock")
    private Activity zze;
    @GuardedBy("activityLock")
    private volatile boolean zzf;
    private volatile zzlk zzg;
    private zzlk zzh;
    @GuardedBy("activityLock")
    private boolean zzi;
    private final Object zzj;

    public zzlj(zzhy zzhy0) {
        super(zzhy0);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    @VisibleForTesting
    private final String zza(Class class0, String s) {
        String s1 = class0.getCanonicalName();
        if(s1 == null) {
            return s;
        }
        String[] arr_s = s1.split("\\.");
        String s2 = arr_s.length <= 0 ? "" : arr_s[arr_s.length - 1];
        return s2.length() <= this.zze().zza(null, false) ? s2 : s2.substring(0, this.zze().zza(null, false));
    }

    @MainThread
    private final void zza(Activity activity0, zzlk zzlk0, boolean z) {
        zzlk zzlk2;
        zzlk zzlk1 = this.zzb == null ? this.zzc : this.zzb;
        if(zzlk0.zzb == null) {
            String s = activity0 == null ? null : this.zza(activity0.getClass(), "Activity");
            zzlk2 = new zzlk(zzlk0.zza, s, zzlk0.zzc, zzlk0.zze, zzlk0.zzf);
        }
        else {
            zzlk2 = zzlk0;
        }
        this.zzc = this.zzb;
        this.zzb = zzlk2;
        long v = this.zzb().elapsedRealtime();
        this.zzl().zzb(new zzll(this, zzlk2, zzlk1, v, z));
    }

    static void zza(zzlj zzlj0, Bundle bundle0, zzlk zzlk0, zzlk zzlk1, long v) {
        if(bundle0 != null) {
            bundle0.remove("screen_name");
            bundle0.remove("screen_class");
        }
        zzlj0.zza(zzlk0, zzlk1, v, true, zzlj0.zzq().zza(null, "screen_view", bundle0, null, false));
    }

    static void zza(zzlj zzlj0, zzlk zzlk0) {
        zzlj0.zzh = null;
    }

    static void zza(zzlj zzlj0, zzlk zzlk0, zzlk zzlk1, long v, boolean z, Bundle bundle0) {
        zzlj0.zza(zzlk0, zzlk1, v, z, null);
    }

    static void zza(zzlj zzlj0, zzlk zzlk0, boolean z, long v) {
        zzlj0.zza(zzlk0, false, v);
    }

    @WorkerThread
    private final void zza(zzlk zzlk0, zzlk zzlk1, long v, boolean z, Bundle bundle0) {
        long v4;
        this.zzt();
        boolean z1 = false;
        boolean z2 = zzlk1 == null || zzlk1.zzc != zzlk0.zzc || !Objects.equals(zzlk1.zzb, zzlk0.zzb) || !Objects.equals(zzlk1.zza, zzlk0.zza);
        if(z && this.zza != null) {
            z1 = true;
        }
        if(z2) {
            Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
            zzos.zza(zzlk0, bundle1, true);
            if(zzlk1 != null) {
                String s = zzlk1.zza;
                if(s != null) {
                    bundle1.putString("_pn", s);
                }
                String s1 = zzlk1.zzb;
                if(s1 != null) {
                    bundle1.putString("_pc", s1);
                }
                bundle1.putLong("_pi", zzlk1.zzc);
            }
            if(z1) {
                long v1 = this.zzp().zzb.zza(v);
                if(v1 > 0L) {
                    this.zzq().zza(bundle1, v1);
                }
            }
            if(!this.zze().zzw()) {
                bundle1.putLong("_mst", 1L);
            }
            String s2 = zzlk0.zze ? "app" : "auto";
            long v2 = this.zzb().currentTimeMillis();
            if(zzlk0.zze) {
                long v3 = zzlk0.zzf;
                v4 = v3 == 0L ? v2 : v3;
            }
            else {
                v4 = v2;
            }
            this.zzm().zza(s2, "_vs", v4, bundle1);
        }
        if(z1) {
            this.zza(this.zza, true, v);
        }
        this.zza = zzlk0;
        if(zzlk0.zze) {
            this.zzh = zzlk0;
        }
        this.zzo().zza(zzlk0);
    }

    @WorkerThread
    private final void zza(zzlk zzlk0, boolean z, long v) {
        this.zzc().zza(this.zzb().elapsedRealtime());
        boolean z1 = zzlk0 != null && zzlk0.zzd;
        if(this.zzp().zza(z1, z, v) && zzlk0 != null) {
            zzlk0.zzd = false;
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Context zza() {
        return super.zza();
    }

    @WorkerThread
    public final zzlk zza(boolean z) {
        this.zzu();
        this.zzt();
        if(!z) {
            return this.zza;
        }
        return this.zza == null ? this.zzh : this.zza;
    }

    @MainThread
    public final void zza(Activity activity0) {
        synchronized(this.zzj) {
            if(activity0 == this.zze) {
                this.zze = null;
            }
        }
        if(!this.zze().zzw()) {
            return;
        }
        this.zzd.remove(activity0.hashCode());
    }

    @MainThread
    public final void zza(Activity activity0, Bundle bundle0) {
        if(!this.zze().zzw()) {
            return;
        }
        if(bundle0 == null) {
            return;
        }
        Bundle bundle1 = bundle0.getBundle("com.google.app_measurement.screen_service");
        if(bundle1 == null) {
            return;
        }
        zzlk zzlk0 = new zzlk(bundle1.getString("name"), bundle1.getString("referrer_name"), bundle1.getLong("id"));
        this.zzd.put(activity0.hashCode(), zzlk0);
    }

    @Deprecated
    public final void zza(@NonNull Activity activity0, @Size(max = 36L, min = 1L) String s, @Size(max = 36L, min = 1L) String s1) {
        if(!this.zze().zzw()) {
            this.zzj().zzv().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzlk zzlk0 = this.zzb;
        if(zzlk0 == null) {
            this.zzj().zzv().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if(this.zzd.get(activity0.hashCode()) == null) {
            this.zzj().zzv().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if(s1 == null) {
            s1 = this.zza(activity0.getClass(), "Activity");
        }
        if(Objects.equals(zzlk0.zzb, s1) && Objects.equals(zzlk0.zza, s)) {
            this.zzj().zzv().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if(s != null && (s.length() <= 0 || s.length() > this.zze().zza(null, false))) {
            this.zzj().zzv().zza("Invalid screen name length in setCurrentScreen. Length", s.length());
            return;
        }
        if(s1 != null && (s1.length() <= 0 || s1.length() > this.zze().zza(null, false))) {
            this.zzj().zzv().zza("Invalid class name length in setCurrentScreen. Length", s1.length());
            return;
        }
        this.zzj().zzp().zza("Setting current screen to name, class", (s == null ? "null" : s), s1);
        zzlk zzlk1 = new zzlk(s, s1, this.zzq().zzn());
        this.zzd.put(activity0.hashCode(), zzlk1);
        this.zza(activity0, zzlk1, true);
    }

    public final void zza(Bundle bundle0, long v) {
        String s3;
        String s = null;
        synchronized(this.zzj) {
            if(!this.zzi) {
                this.zzj().zzv().zza("Cannot log screen view event when the app is in the background.");
                return;
            }
            if(bundle0 == null) {
                s3 = null;
            }
            else {
                String s1 = bundle0.getString("screen_name");
                if(s1 != null && (s1.length() <= 0 || s1.length() > this.zze().zza(null, false))) {
                    this.zzj().zzv().zza("Invalid screen name length for screen view. Length", s1.length());
                    return;
                }
                String s2 = bundle0.getString("screen_class");
                if(s2 != null && (s2.length() <= 0 || s2.length() > this.zze().zza(null, false))) {
                    this.zzj().zzv().zza("Invalid screen class length for screen view. Length", s2.length());
                    return;
                }
                s3 = s1;
                s = s2;
            }
            if(s == null) {
                s = this.zze == null ? "Activity" : this.zza(this.zze.getClass(), "Activity");
            }
            zzlk zzlk0 = this.zzb;
            if(this.zzf && zzlk0 != null) {
                this.zzf = false;
                if(Objects.equals(zzlk0.zzb, s) && Objects.equals(zzlk0.zza, s3)) {
                    this.zzj().zzv().zza("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
        }
        this.zzj().zzp().zza("Logging screen view with name, class", (s3 == null ? "null" : s3), (s == null ? "null" : s));
        zzlk zzlk1 = this.zzb == null ? this.zzc : this.zzb;
        zzlk zzlk2 = new zzlk(s3, s, this.zzq().zzn(), true, v);
        this.zzb = zzlk2;
        this.zzc = zzlk1;
        this.zzg = zzlk2;
        long v2 = this.zzb().elapsedRealtime();
        this.zzl().zzb(new zzlm(this, bundle0, zzlk2, zzlk1, v2));
    }

    public final zzlk zzaa() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    @MainThread
    public final void zzb(Activity activity0) {
        synchronized(this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long v = this.zzb().elapsedRealtime();
        if(!this.zze().zzw()) {
            this.zzb = null;
            this.zzl().zzb(new zzln(this, v));
            return;
        }
        zzlk zzlk0 = this.zzd(activity0);
        this.zzc = this.zzb;
        this.zzb = null;
        this.zzl().zzb(new zzlq(this, zzlk0, v));
    }

    @MainThread
    public final void zzb(Activity activity0, Bundle bundle0) {
        if(!this.zze().zzw()) {
            return;
        }
        if(bundle0 == null) {
            return;
        }
        zzlk zzlk0 = (zzlk)this.zzd.get(activity0.hashCode());
        if(zzlk0 == null) {
            return;
        }
        Bundle bundle1 = new Bundle();
        bundle1.putLong("id", zzlk0.zzc);
        bundle1.putString("name", zzlk0.zza);
        bundle1.putString("referrer_name", zzlk0.zzb);
        bundle0.putBundle("com.google.app_measurement.screen_service", bundle1);
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzb zzc() {
        return super.zzc();
    }

    @MainThread
    public final void zzc(Activity activity0) {
        synchronized(this.zzj) {
            this.zzi = true;
            if(activity0 != this.zze) {
                synchronized(this.zzj) {
                    this.zze = activity0;
                    this.zzf = false;
                }
                if(this.zze().zzw()) {
                    this.zzg = null;
                    this.zzl().zzb(new zzlp(this));
                }
            }
        }
        if(!this.zze().zzw()) {
            this.zzb = this.zzg;
            this.zzl().zzb(new zzlo(this));
            return;
        }
        this.zza(activity0, this.zzd(activity0), false);
        zzb zzb0 = this.zzc();
        long v1 = zzb0.zzb().elapsedRealtime();
        zzb0.zzl().zzb(new zzc(zzb0, v1));
    }

    @MainThread
    private final zzlk zzd(@NonNull Activity activity0) {
        Preconditions.checkNotNull(activity0);
        zzlk zzlk0 = (zzlk)this.zzd.get(activity0.hashCode());
        if(zzlk0 == null) {
            zzlk zzlk1 = new zzlk(null, this.zza(activity0.getClass(), "Activity"), this.zzq().zzn());
            this.zzd.put(activity0.hashCode(), zzlk1);
            zzlk0 = zzlk1;
        }
        return this.zzg == null ? zzlk0 : this.zzg;
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

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzgg zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzgf zzh() {
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

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzjq zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzlj zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzls zzo() {
        return super.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zznb zzp() {
        return super.zzp();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzos zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final void zzt() {
        super.zzt();
    }

    @Override  // com.google.android.gms.measurement.internal.zzh
    protected final boolean zzz() {
        return false;
    }
}

