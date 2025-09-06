package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.internal.measurement.zznm;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.common.util.concurrent.h0;
import com.google.common.util.concurrent.t0;
import j..util.Comparator.-CC;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import w4.d;

public final class zzjq extends zzh {
    final zzu zza;
    @VisibleForTesting
    private zzkz zzb;
    private zzjm zzc;
    private final Set zzd;
    private boolean zze;
    private final AtomicReference zzf;
    private final Object zzg;
    private boolean zzh;
    private int zzi;
    private zzav zzj;
    private PriorityQueue zzk;
    private boolean zzl;
    @GuardedBy("consentLock")
    private zzje zzm;
    private final AtomicLong zzn;
    private long zzo;
    @VisibleForTesting
    private boolean zzp;
    private zzav zzq;
    private SharedPreferences.OnSharedPreferenceChangeListener zzr;
    private zzav zzs;
    private final zzor zzt;

    protected zzjq(zzhy zzhy0) {
        super(zzhy0);
        this.zzd = new CopyOnWriteArraySet();
        this.zzg = new Object();
        this.zzh = false;
        this.zzi = 1;
        this.zzp = true;
        this.zzt = new zzkr(this);
        this.zzf = new AtomicReference();
        this.zzm = zzje.zza;
        this.zzo = -1L;
        this.zzn = new AtomicLong(0L);
        this.zza = new zzu(zzhy0);
    }

    static int zza(zzjq zzjq0, Throwable throwable0) {
        String s = throwable0.getMessage();
        zzjq0.zzl = false;
        if(s != null) {
            if(!(throwable0 instanceof IllegalStateException) && !s.contains("garbage collected") && !throwable0.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                return !(throwable0 instanceof SecurityException) || s.endsWith("READ_DEVICE_CONFIG") ? 2 : 3;
            }
            if(s.contains("Background")) {
                zzjq0.zzl = true;
            }
            return 1;
        }
        return 2;
    }

    // 检测为 Lambda 实现
    static int zza(Long long0, Long long1) [...]

    public static int zza(String s) {
        Preconditions.checkNotEmpty(s);
        return 25;
    }

    @VisibleForTesting
    private final void zza(Bundle bundle0, int v, long v1) {
        this.zzu();
        String s = zzje.zza(bundle0);
        if(s != null) {
            this.zzj().zzv().zza("Ignoring invalid consent setting", s);
            this.zzj().zzv().zza("Valid consent values are \'granted\', \'denied\'");
        }
        boolean z = this.zzl().zzg();
        zzje zzje0 = zzje.zza(bundle0, v);
        if(zzje0.zzi()) {
            this.zza(zzje0, v1, z);
        }
        zzax zzax0 = zzax.zza(bundle0, v);
        if(zzax0.zzg()) {
            this.zza(zzax0, z);
        }
        Boolean boolean0 = zzax.zza(bundle0);
        if(boolean0 != null) {
            String s1 = v == -30 ? "tcf" : "app";
            if(this.zze().zza(zzbh.zzcs) && z) {
                this.zza(s1, "allow_personalized_ads", boolean0.toString(), v1);
                return;
            }
            this.zza(s1, "allow_personalized_ads", boolean0.toString(), false, v1);
        }
    }

    static void zza(zzjq zzjq0, Bundle bundle0) {
        zzbf zzbf0;
        zzjq0.zzt();
        zzjq0.zzu();
        Preconditions.checkNotNull(bundle0);
        String s = Preconditions.checkNotEmpty(bundle0.getString("name"));
        if(!zzjq0.zzu.zzac()) {
            zzjq0.zzj().zzp().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzon zzon0 = new zzon(s, 0L, null, "");
        try {
            zzbf0 = zzjq0.zzq().zza(bundle0.getString("app_id"), bundle0.getString("expired_event_name"), bundle0.getBundle("expired_event_params"), "", bundle0.getLong("creation_timestamp"), true, true);
        }
        catch(IllegalArgumentException unused_ex) {
            return;
        }
        zzae zzae0 = new zzae(bundle0.getString("app_id"), "", zzon0, bundle0.getLong("creation_timestamp"), bundle0.getBoolean("active"), bundle0.getString("trigger_event_name"), null, bundle0.getLong("trigger_timeout"), null, bundle0.getLong("time_to_live"), zzbf0);
        zzjq0.zzo().zza(zzae0);
    }

    static void zza(zzjq zzjq0, zzje zzje0, long v, boolean z, boolean z1) {
        zzjq0.zzt();
        zzjq0.zzu();
        zzje zzje1 = zzjq0.zzk().zzo();
        if(v <= zzjq0.zzo && zzje.zza(zzje1.zza(), zzje0.zza())) {
            zzjq0.zzj().zzo().zza("Dropped out-of-date consent setting, proposed settings", zzje0);
            return;
        }
        if(zzjq0.zzk().zza(zzje0)) {
            zzjq0.zzj().zzp().zza("Setting storage consent(FE)", zzje0);
            zzjq0.zzo = v;
            if(zzjq0.zzo().zzao()) {
                zzjq0.zzo().zzb(z);
            }
            else {
                zzjq0.zzo().zza(z);
            }
            if(z1) {
                zzjq0.zzo().zza(new AtomicReference());
            }
        }
        else {
            zzjq0.zzj().zzo().zza("Lower precedence consent source ignored, proposed source", zzje0.zza());
        }
    }

    static void zza(zzjq zzjq0, zzje zzje0, zzje zzje1) {
        if((!zznm.zza() || !zzjq0.zze().zza(zzbh.zzcx)) && (zzje0.zza(zzje1, new zza[]{zza.zzb, zza.zza}) || zzje0.zzb(zzje1, new zza[]{zza.zzb, zza.zza}))) {
            zzjq0.zzg().zzag();
        }
    }

    static void zza(zzjq zzjq0, Boolean boolean0, boolean z) {
        zzjq0.zza(boolean0, true);
    }

    static void zza(zzjq zzjq0, boolean z) {
        zzjq0.zzh = false;
    }

    @WorkerThread
    private final void zza(Boolean boolean0, boolean z) {
        this.zzt();
        this.zzu();
        this.zzj().zzc().zza("Setting app measurement enabled (FE)", boolean0);
        this.zzk().zza(boolean0);
        if(z) {
            this.zzk().zzb(boolean0);
        }
        if(this.zzu.zzad() || boolean0 != null && !boolean0.booleanValue()) {
            this.zzav();
        }
    }

    private final void zza(String s, String s1, long v, Object object0) {
        this.zzl().zzb(new zzkh(this, s, s1, object0, v));
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Context zza() {
        return super.zza();
    }

    public final ArrayList zza(String s, String s1) {
        if(this.zzl().zzg()) {
            this.zzj().zzg().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if(zzab.zza()) {
            this.zzj().zzg().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference0 = new AtomicReference();
        this.zzu.zzl().zza(atomicReference0, 5000L, "get conditional user properties", new zzkq(this, atomicReference0, null, s, s1));
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            this.zzj().zzg().zza("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return zzos.zzb(list0);
    }

    public final List zza(boolean z) {
        this.zzu();
        this.zzj().zzp().zza("Getting user properties (FE)");
        if(this.zzl().zzg()) {
            this.zzj().zzg().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        if(zzab.zza()) {
            this.zzj().zzg().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference0 = new AtomicReference();
        this.zzu.zzl().zza(atomicReference0, 5000L, "get user properties", new zzkk(this, atomicReference0, z));
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            this.zzj().zzg().zza("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyList();
        }
        return list0;
    }

    public final Map zza(String s, String s1, boolean z) {
        if(this.zzl().zzg()) {
            this.zzj().zzg().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if(zzab.zza()) {
            this.zzj().zzg().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference0 = new AtomicReference();
        this.zzu.zzl().zza(atomicReference0, 5000L, "get user properties", new zzkp(this, atomicReference0, null, s, s1, z));
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            this.zzj().zzg().zza("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        Map map0 = new ArrayMap(list0.size());
        for(Object object0: list0) {
            zzon zzon0 = (zzon)object0;
            Object object1 = zzon0.zza();
            if(object1 != null) {
                map0.put(zzon0.zza, object1);
            }
        }
        return map0;
    }

    public final void zza(long v) {
        this.zzc(null);
        this.zzl().zzb(new zzkl(this, v));
    }

    final void zza(long v, boolean z) {
        this.zzt();
        this.zzu();
        this.zzj().zzc().zza("Resetting analytics data (FE)");
        zznb zznb0 = this.zzp();
        zznb0.zzt();
        zznb0.zzb.zza();
        this.zzg().zzag();
        boolean z1 = this.zzu.zzac();
        zzha zzha0 = this.zzk();
        zzha0.zzc.zza(v);
        if(!TextUtils.isEmpty(zzha0.zzk().zzq.zza())) {
            zzha0.zzq.zza(null);
        }
        zzha0.zzk.zza(0L);
        zzha0.zzl.zza(0L);
        if(!zzha0.zze().zzx()) {
            zzha0.zzb(!z1);
        }
        zzha0.zzr.zza(null);
        zzha0.zzs.zza(0L);
        zzha0.zzt.zza(null);
        if(z) {
            this.zzo().zzai();
        }
        this.zzp().zza.zza();
        this.zzp = !z1;
    }

    @WorkerThread
    public final void zza(Intent intent0) {
        if(zzpu.zza() && this.zze().zza(zzbh.zzby)) {
            Uri uri0 = intent0.getData();
            if(uri0 == null) {
                this.zzj().zzo().zza("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String s = uri0.getQueryParameter("sgtm_debug_enable");
            if(s == null || !s.equals("1")) {
                this.zzj().zzo().zza("Preview Mode was not enabled.");
                this.zze().zzh(null);
            }
            else {
                String s1 = uri0.getQueryParameter("sgtm_preview_key");
                if(!TextUtils.isEmpty(s1)) {
                    this.zzj().zzo().zza("Preview Mode was enabled. Using the sgtmPreviewKey: ", s1);
                    this.zze().zzh(s1);
                }
            }
        }
    }

    // 检测为 Lambda 实现
    final void zza(SharedPreferences sharedPreferences0, String s) [...]

    // 检测为 Lambda 实现
    final void zza(Bundle bundle0) [...]

    // 检测为 Lambda 实现
    final void zza(Bundle bundle0, long v) [...]

    public final void zza(zzdo zzdo0) throws RemoteException {
        this.zzl().zzb(new zzks(this, zzdo0));
    }

    final void zza(zzax zzax0, boolean z) {
        zzky zzky0 = new zzky(this, zzax0);
        if(z) {
            this.zzt();
            zzky0.run();
            return;
        }
        this.zzl().zzb(zzky0);
    }

    @WorkerThread
    final void zza(zzje zzje0) {
        this.zzt();
        boolean z = zzje0.zzh() && zzje0.zzg() || this.zzo().zzan();
        if(z != this.zzu.zzad()) {
            this.zzu.zzb(z);
            Boolean boolean0 = this.zzk().zzu();
            if(!z || boolean0 == null || boolean0.booleanValue()) {
                this.zza(Boolean.valueOf(z), false);
            }
        }
    }

    public final void zza(zzje zzje0, long v, boolean z) {
        zzje zzje2;
        boolean z3;
        boolean z2;
        zzje zzje1 = zzje0;
        this.zzu();
        int v1 = zzje0.zza();
        if(v1 != -10 && (zzje0.zzc() == zzjh.zza && zzje0.zzd() == zzjh.zza)) {
            this.zzj().zzv().zza("Ignoring empty consent settings");
            return;
        }
        synchronized(this.zzg) {
            zzje2 = this.zzm;
            boolean z1 = false;
            if(zzje.zza(v1, zzje2.zza())) {
                z2 = zzje0.zzc(this.zzm);
                if(zzje0.zzh() && !this.zzm.zzh()) {
                    z1 = true;
                }
                zzje1 = zzje0.zzb(this.zzm);
                this.zzm = zzje1;
                z3 = z1;
                z1 = true;
            }
            else {
                z2 = false;
                z3 = false;
            }
        }
        if(!z1) {
            this.zzj().zzo().zza("Ignoring lower-priority consent settings, proposed settings", zzje1);
            return;
        }
        long v3 = this.zzn.getAndIncrement();
        if(z2) {
            this.zzc(null);
            zzkx zzkx0 = new zzkx(this, zzje1, v, v3, z3, zzje2);
            if(z) {
                this.zzt();
                zzkx0.run();
                return;
            }
            this.zzl().zzc(zzkx0);
            return;
        }
        zzla zzla0 = new zzla(this, zzje1, v3, z3, zzje2);
        if(z) {
            this.zzt();
            zzla0.run();
            return;
        }
        if(v1 != -10 && v1 != 30) {
            this.zzl().zzb(zzla0);
            return;
        }
        this.zzl().zzc(zzla0);
    }

    public final void zza(zzjl zzjl0) {
        this.zzu();
        Preconditions.checkNotNull(zzjl0);
        if(!this.zzd.add(zzjl0)) {
            this.zzj().zzu().zza("OnEventListener already registered");
        }
    }

    @WorkerThread
    public final void zza(zzjm zzjm0) {
        this.zzt();
        this.zzu();
        if(zzjm0 != null) {
            zzjm zzjm1 = this.zzc;
            if(zzjm0 != zzjm1) {
                Preconditions.checkState(zzjm1 == null, "EventInterceptor already set.");
            }
        }
        this.zzc = zzjm0;
    }

    public final void zza(Boolean boolean0) {
        this.zzu();
        this.zzl().zzb(new zzkv(this, boolean0));
    }

    public final void zza(String s, long v) {
        if(s != null && TextUtils.isEmpty(s)) {
            this.zzu.zzj().zzu().zza("User ID must be non-empty or null");
            return;
        }
        this.zzl().zzb(() -> if(this.zzg().zzb(s)) {
            this.zzg().zzag();
        });
        this.zza(null, "_id", s, true, v);
    }

    @WorkerThread
    final void zza(String s, String s1, long v, Bundle bundle0) {
        this.zzt();
        this.zza(s, s1, v, bundle0, true, this.zzc == null || zzos.zzg(s1), true, null);
    }

    @WorkerThread
    protected final void zza(String s, String s1, long v, Bundle bundle0, boolean z, boolean z1, boolean z2, String s2) {
        int v1 = 0;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(bundle0);
        this.zzt();
        this.zzu();
        if(!this.zzu.zzac()) {
            this.zzj().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List list0 = this.zzg().zzaf();
        if(list0 != null && !list0.contains(s1)) {
            this.zzj().zzc().zza("Dropping non-safelisted event. event name, origin", s1, s);
            return;
        }
        if(!this.zze) {
            try {
                this.zze = true;
                Class class0 = this.zzu.zzag() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService") : Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zza().getClassLoader());
                try {
                    class0.getDeclaredMethod("initialize", Context.class).invoke(null, this.zza());
                }
                catch(Exception exception0) {
                    this.zzj().zzu().zza("Failed to invoke Tag Manager\'s initialize() method", exception0);
                }
            }
            catch(ClassNotFoundException unused_ex) {
                this.zzj().zzo().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if("_cmp".equals(s1) && bundle0.containsKey("gclid")) {
            this.zza("auto", "_lgclid", bundle0.getString("gclid"), this.zzb().currentTimeMillis());
        }
        if(z && zzos.zzj(s1)) {
            this.zzq().zza(bundle0, this.zzk().zzt.zza());
        }
        if(!z2 && !"_iap".equals(s1)) {
            zzos zzos0 = this.zzu.zzt();
            int v2 = 2;
            if(zzos0.zzc("event", s1)) {
                if(!zzos0.zza("event", zzji.zza, zzji.zzb, s1)) {
                    v2 = 13;
                }
                else if(zzos0.zza("event", 40, s1)) {
                    v2 = 0;
                }
            }
            if(v2 != 0) {
                this.zzj().zzm().zza("Invalid public event name. Event will not be logged (FE)", this.zzi().zza(s1));
                this.zzu.zzt();
                String s3 = zzos.zza(s1, 40, true);
                if(s1 != null) {
                    v1 = s1.length();
                }
                this.zzu.zzt();
                zzos.zza(this.zzt, v2, "_ev", s3, v1);
                return;
            }
        }
        zzlk zzlk0 = this.zzn().zza(false);
        if(zzlk0 != null && !bundle0.containsKey("_sc")) {
            zzlk0.zzd = true;
        }
        zzos.zza(zzlk0, bundle0, z && !z2);
        boolean z3 = "am".equals(s);
        boolean z4 = zzos.zzg(s1);
        if(z && this.zzc != null && !z4 && !z3) {
            this.zzj().zzc().zza("Passing event to registered event handler (FE)", this.zzi().zza(s1), this.zzi().zza(bundle0));
            Preconditions.checkNotNull(this.zzc);
            this.zzc.interceptEvent(s, s1, bundle0, v);
            return;
        }
        if(!this.zzu.zzaf()) {
            return;
        }
        int v3 = this.zzq().zza(s1);
        if(v3 != 0) {
            this.zzj().zzm().zza("Invalid event name. Event will not be logged (FE)", this.zzi().zza(s1));
            this.zzq();
            String s4 = zzos.zza(s1, 40, true);
            if(s1 != null) {
                v1 = s1.length();
            }
            this.zzu.zzt();
            zzos.zza(this.zzt, s2, v3, "_ev", s4, v1);
            return;
        }
        List list1 = CollectionUtils.listOf(new String[]{"_o", "_sn", "_sc", "_si"});
        Bundle bundle1 = this.zzq().zza(s2, s1, bundle0, list1, z2);
        Preconditions.checkNotNull(bundle1);
        if(this.zzn().zza(false) != null && "_ae".equals(s1)) {
            zznb zznb0 = this.zzp();
            long v4 = zznb0.zzb.zzb.zzb().elapsedRealtime();
            long v5 = v4 - zznb0.zzb.zza;
            zznb0.zzb.zza = v4;
            if(v5 > 0L) {
                this.zzq().zza(bundle1, v5);
            }
        }
        if(!"auto".equals(s) && "_ssr".equals(s1)) {
            zzos zzos1 = this.zzq();
            String s5 = bundle1.getString("_ffr");
            if(Strings.isEmptyOrWhitespace(s5)) {
                s5 = null;
            }
            else if(s5 != null) {
                s5 = s5.trim();
            }
            if(Objects.equals(s5, zzos1.zzk().zzq.zza())) {
                zzos1.zzj().zzc().zza("Not logging duplicate session_start_with_rollout event");
                return;
            }
            zzos1.zzk().zzq.zza(s5);
        }
        else if("_ae".equals(s1)) {
            String s6 = this.zzq().zzk().zzq.zza();
            if(!TextUtils.isEmpty(s6)) {
                bundle1.putString("_ffr", s6);
            }
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(bundle1);
        boolean z5 = this.zze().zza(zzbh.zzco) ? this.zzp().zzaa() : this.zzk().zzn.zza();
        if(this.zzk().zzk.zza() > 0L && this.zzk().zza(v) && z5) {
            this.zzj().zzp().zza("Current session is expired, remove the session number, ID, and engagement time");
            this.zza("auto", "_sid", null, this.zzb().currentTimeMillis());
            this.zza("auto", "_sno", null, this.zzb().currentTimeMillis());
            this.zza("auto", "_se", null, this.zzb().currentTimeMillis());
            this.zzk().zzl.zza(0L);
        }
        if(bundle1.getLong("extend_session", 0L) == 1L) {
            this.zzj().zzp().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
            this.zzu.zzs().zza.zza(v, true);
        }
        ArrayList arrayList1 = new ArrayList(bundle1.keySet());
        Collections.sort(arrayList1);
        int v6 = arrayList1.size();
        int v7 = 0;
        while(v7 < v6) {
            Object object0 = arrayList1.get(v7);
            ++v7;
            String s7 = (String)object0;
            if(s7 != null) {
                this.zzq();
                Bundle[] arr_bundle = zzos.zzb(bundle1.get(s7));
                if(arr_bundle != null) {
                    bundle1.putParcelableArray(s7, arr_bundle);
                }
            }
        }
        for(int v8 = 0; v8 < arrayList0.size(); ++v8) {
            Bundle bundle2 = (Bundle)arrayList0.get(v8);
            bundle2.putString("_o", s);
            if(z1) {
                bundle2 = this.zzq().zza(bundle2, null);
            }
            Bundle bundle3 = bundle2;
            zzbf zzbf0 = new zzbf((v8 == 0 ? s1 : "_ep"), new zzbe(bundle3), s, v);
            this.zzo().zza(zzbf0, s2);
            if(!z3) {
                for(Object object1: this.zzd) {
                    ((zzjl)object1).onEvent(s, s1, new Bundle(bundle3), v);
                }
            }
        }
        if(this.zzn().zza(false) != null && "_ae".equals(s1)) {
            this.zzp().zza(true, true, this.zzb().elapsedRealtime());
        }
    }

    public final void zza(String s, String s1, Bundle bundle0) {
        long v = this.zzb().currentTimeMillis();
        Preconditions.checkNotEmpty(s);
        Bundle bundle1 = new Bundle();
        bundle1.putString("name", s);
        bundle1.putLong("creation_timestamp", v);
        if(s1 != null) {
            bundle1.putString("expired_event_name", s1);
            bundle1.putBundle("expired_event_params", bundle0);
        }
        this.zzl().zzb(new zzkn(this, bundle1));
    }

    public final void zza(String s, String s1, Bundle bundle0, long v) {
        this.zza(s, s1, bundle0, true, false, v);
    }

    public final void zza(String s, String s1, Bundle bundle0, String s2) {
        this.zzs();
        this.zzb(s, s1, this.zzb().currentTimeMillis(), bundle0, false, true, true, s2);
    }

    public final void zza(String s, String s1, Bundle bundle0, boolean z, boolean z1, long v) {
        Bundle bundle1 = bundle0 == null ? new Bundle() : bundle0;
        if(Objects.equals(s1, "screen_view")) {
            this.zzn().zza(bundle1, v);
            return;
        }
        this.zzb((s == null ? "app" : s), s1, v, bundle1, z1, !z1 || this.zzc == null || zzos.zzg(s1), z, null);
    }

    @WorkerThread
    final void zza(String s, String s1, Object object0, long v) {
        String s2 = "false";
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzt();
        this.zzu();
        if("allow_personalized_ads".equals(s1)) {
            if(object0 instanceof String && !TextUtils.isEmpty(((String)object0))) {
                Long long0 = (long)("false".equals(((String)object0).toLowerCase(Locale.ENGLISH)) ? 1L : 0L);
                zzhd zzhd0 = this.zzk().zzh;
                if(((long)long0) == 1L) {
                    s2 = "true";
                }
                zzhd0.zza(s2);
                object0 = long0;
                s1 = "_npa";
            }
            else if(object0 == null) {
                this.zzk().zzh.zza("unset");
                s1 = "_npa";
            }
            this.zzj().zzp().zza("Setting user property(FE)", "non_personalized_ads(_npa)", object0);
        }
        if(!this.zzu.zzac()) {
            this.zzj().zzp().zza("User property not set since app measurement is disabled");
            return;
        }
        if(!this.zzu.zzaf()) {
            return;
        }
        zzon zzon0 = new zzon(s1, v, object0, s);
        this.zzo().zza(zzon0);
    }

    public final void zza(String s, String s1, Object object0, boolean z) {
        this.zza(s, s1, object0, z, this.zzb().currentTimeMillis());
    }

    public final void zza(String s, String s1, Object object0, boolean z, long v) {
        int v2;
        if(s == null) {
            s = "app";
        }
        int v1 = 0;
        if(z) {
            v2 = this.zzq().zzb(s1);
        }
        else {
            zzos zzos0 = this.zzq();
            if(!zzos0.zzc("user property", s1)) {
                v2 = 6;
            }
            else if(!zzos0.zza("user property", zzjj.zza, s1)) {
                v2 = 15;
            }
            else if(zzos0.zza("user property", 24, s1)) {
                v2 = 0;
            }
            else {
                v2 = 6;
            }
        }
        if(v2 != 0) {
            this.zzq();
            String s2 = zzos.zza(s1, 24, true);
            if(s1 != null) {
                v1 = s1.length();
            }
            this.zzu.zzt();
            zzos.zza(this.zzt, v2, "_ev", s2, v1);
            return;
        }
        if(object0 != null) {
            int v3 = this.zzq().zza(s1, object0);
            if(v3 != 0) {
                this.zzq();
                String s3 = zzos.zza(s1, 24, true);
                if(object0 instanceof String || object0 instanceof CharSequence) {
                    v1 = String.valueOf(object0).length();
                }
                this.zzu.zzt();
                zzos.zza(this.zzt, v3, "_ev", s3, v1);
                return;
            }
            Object object1 = this.zzq().zzc(s1, object0);
            if(object1 != null) {
                this.zza(s, s1, v, object1);
            }
            return;
        }
        this.zza(s, s1, v, null);
    }

    // 检测为 Lambda 实现
    final void zza(List list0) [...]

    // 检测为 Lambda 实现
    final void zza(AtomicReference atomicReference0) [...]

    public final Application.ActivityLifecycleCallbacks zzaa() {
        return this.zzb;
    }

    @WorkerThread
    public final zzaj zzab() {
        this.zzt();
        return this.zzo().zzaa();
    }

    public final Boolean zzac() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Boolean)this.zzl().zza(atomicReference0, 15000L, "boolean test flag value", new zzka(this, atomicReference0));
    }

    public final Double zzad() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Double)this.zzl().zza(atomicReference0, 15000L, "double test flag value", new zzkw(this, atomicReference0));
    }

    public final Integer zzae() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Integer)this.zzl().zza(atomicReference0, 15000L, "int test flag value", new zzkt(this, atomicReference0));
    }

    public final Long zzaf() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Long)this.zzl().zza(atomicReference0, 15000L, "long test flag value", new zzku(this, atomicReference0));
    }

    public final String zzag() {
        return (String)this.zzf.get();
    }

    public final String zzah() {
        zzlk zzlk0 = this.zzu.zzq().zzaa();
        return zzlk0 == null ? null : zzlk0.zzb;
    }

    public final String zzai() {
        zzlk zzlk0 = this.zzu.zzq().zzaa();
        return zzlk0 == null ? null : zzlk0.zza;
    }

    public final String zzaj() {
        if(this.zzu.zzu() != null) {
            return this.zzu.zzu();
        }
        try {
            return new zzhs(this.zza(), this.zzu.zzx()).zza("google_app_id");
        }
        catch(IllegalStateException illegalStateException0) {
            this.zzu.zzj().zzg().zza("getGoogleAppId failed with exception", illegalStateException0);
            return null;
        }
    }

    public final String zzak() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (String)this.zzl().zza(atomicReference0, 15000L, "String test flag value", new zzkj(this, atomicReference0));
    }

    @TargetApi(30)
    final PriorityQueue zzal() {
        if(this.zzk == null) {
            this.zzk = b.a(Comparator.-CC.comparing(new zzjp(), (Long long0, Long long1) -> Long.compare(((long)long0), ((long)long1))));
        }
        return this.zzk;
    }

    @WorkerThread
    public final void zzam() {
        this.zzt();
        this.zzu();
        if(this.zze().zza(zzbh.zzdd)) {
            zzls zzls0 = this.zzo();
            zzls0.zzt();
            zzls0.zzu();
            if(!zzls0.zzap() || zzls0.zzq().zzg() >= 242600) {
                this.zzo().zzac();
            }
        }
    }

    @WorkerThread
    public final void zzan() {
        this.zzt();
        this.zzu();
        if(!this.zzu.zzaf()) {
            return;
        }
        Boolean boolean0 = this.zze().zze("google_analytics_deferred_deep_link_enabled");
        if(boolean0 != null && boolean0.booleanValue()) {
            this.zzj().zzc().zza("Deferred Deep Link feature enabled.");
            this.zzl().zzb(() -> {
                this.zzt();
                if(this.zzk().zzo.zza()) {
                    this.zzj().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                    return;
                }
                long v = this.zzk().zzp.zza();
                this.zzk().zzp.zza(v + 1L);
                if(v >= 5L) {
                    this.zzj().zzu().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                    this.zzk().zzo.zza(true);
                    return;
                }
                if(this.zzq == null) {
                    this.zzq = new zzkm(this, this.zzu);
                }
                this.zzq.zza(0L);
            });
        }
        this.zzo().zzad();
        this.zzp = false;
        String s = this.zzk().zzw();
        if(!TextUtils.isEmpty(s)) {
            this.zzf().zzac();
            if(!s.equals(Build.VERSION.RELEASE)) {
                Bundle bundle0 = new Bundle();
                bundle0.putString("_po", s);
                this.zzc("auto", "_ou", bundle0);
            }
        }
    }

    public final void zzao() {
        if(this.zza().getApplicationContext() instanceof Application && this.zzb != null) {
            ((Application)this.zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zzb);
        }
    }

    final void zzap() {
        if(zzpn.zza() && this.zze().zza(zzbh.zzci)) {
            if(this.zzl().zzg()) {
                this.zzj().zzg().zza("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if(zzab.zza()) {
                this.zzj().zzg().zza("Cannot get trigger URIs from main thread");
                return;
            }
            this.zzu();
            this.zzj().zzp().zza("Getting trigger URIs (FE)");
            AtomicReference atomicReference0 = new AtomicReference();
            this.zzl().zza(atomicReference0, 5000L, "get trigger URIs", () -> {
                Bundle bundle0 = this.zzk().zzi.zza();
                zzls zzls0 = this.zzo();
                if(bundle0 == null) {
                    bundle0 = new Bundle();
                }
                zzls0.zza(atomicReference0, bundle0);
            });
            List list0 = (List)atomicReference0.get();
            if(list0 == null) {
                this.zzj().zzg().zza("Timed out waiting for get trigger URIs");
                return;
            }
            this.zzl().zzb(() -> {
                this.zzt();
                if(Build.VERSION.SDK_INT >= 30) {
                    SparseArray sparseArray0 = this.zzk().zzm();
                    for(Object object0: list0) {
                        zzno zzno0 = (zzno)object0;
                        if(!sparseArray0.contains(zzno0.zzc) || ((long)(((Long)sparseArray0.get(zzno0.zzc)))) < zzno0.zzb) {
                            this.zzal().add(zzno0);
                        }
                    }
                    this.zzas();
                }
            });
        }
    }

    // 检测为 Lambda 实现
    @WorkerThread
    public final void zzaq() [...]

    @WorkerThread
    public final void zzar() {
        this.zzt();
        this.zzj().zzc().zza("Handle tcf update.");
        com.google.android.gms.measurement.internal.zznm zznm0 = com.google.android.gms.measurement.internal.zznm.zza(this.zzk().zzc());
        this.zzj().zzp().zza("Tcf preferences read", zznm0);
        if(this.zzk().zza(zznm0)) {
            Bundle bundle0 = zznm0.zza();
            this.zzj().zzp().zza("Consent generated from Tcf", bundle0);
            if(bundle0 != Bundle.EMPTY) {
                this.zza(bundle0, -30, this.zzb().currentTimeMillis());
            }
            Bundle bundle1 = new Bundle();
            bundle1.putString("_tcfd", zznm0.zzb());
            this.zzc("auto", "_tcf", bundle1);
        }
    }

    @TargetApi(30)
    @WorkerThread
    final void zzas() {
        this.zzt();
        this.zzl = false;
        if(!this.zzal().isEmpty() && !this.zzh) {
            zzno zzno0 = (zzno)this.zzal().poll();
            if(zzno0 == null) {
                return;
            }
            MeasurementManagerFutures measurementManagerFutures0 = this.zzq().zzo();
            if(measurementManagerFutures0 == null) {
                return;
            }
            this.zzh = true;
            this.zzj().zzp().zza("Registering trigger URI", zzno0.zza);
            t0 t00 = measurementManagerFutures0.e(Uri.parse(zzno0.zza));
            if(t00 == null) {
                this.zzh = false;
                this.zzal().add(zzno0);
                return;
            }
            if(!this.zze().zza(zzbh.zzcn)) {
                SparseArray sparseArray0 = this.zzk().zzm();
                sparseArray0.put(zzno0.zzc, zzno0.zzb);
                this.zzk().zza(sparseArray0);
            }
            zzjz zzjz0 = new zzjz(this);
            h0.c(t00, new zzkc(this, zzno0), zzjz0);
        }
    }

    @WorkerThread
    public final void zzat() {
        this.zzt();
        this.zzj().zzc().zza("Register tcfPrefChangeListener.");
        if(this.zzr == null) {
            this.zzs = new zzkf(this, this.zzu);
            this.zzr = (SharedPreferences sharedPreferences0, String s) -> if("IABTCF_TCString".equals(s)) {
                this.zzj().zzp().zza("IABTCF_TCString change picked up in listener.");
                ((zzav)Preconditions.checkNotNull(this.zzs)).zza(500L);
            };
        }
        this.zzk().zzc().registerOnSharedPreferenceChangeListener(this.zzr);
    }

    final boolean zzau() {
        return this.zzl;
    }

    @WorkerThread
    private final void zzav() {
        this.zzt();
        String s = this.zzk().zzh.zza();
        if(s != null) {
            if("unset".equals(s)) {
                this.zza("app", "_npa", null, this.zzb().currentTimeMillis());
            }
            else {
                this.zza("app", "_npa", ((long)("true".equals(s) ? 1L : 0L)), this.zzb().currentTimeMillis());
            }
        }
        if(this.zzu.zzac() && this.zzp) {
            this.zzj().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
            this.zzan();
            this.zzp().zza.zza();
            this.zzl().zzb(new zzkd(this));
            return;
        }
        this.zzj().zzc().zza("Updating Scion state (FE)");
        this.zzo().zzak();
    }

    static void zzb(zzjq zzjq0, int v) {
        if(zzjq0.zzj == null) {
            zzjq0.zzj = new zzkb(zzjq0, zzjq0.zzu);
        }
        zzjq0.zzj.zza(((long)(v * 1000)));
    }

    static void zzb(zzjq zzjq0, Bundle bundle0) {
        zzbf zzbf2;
        zzbf zzbf1;
        zzbf zzbf0;
        zzjq0.zzt();
        zzjq0.zzu();
        Preconditions.checkNotNull(bundle0);
        String s = bundle0.getString("name");
        String s1 = bundle0.getString("origin");
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        Preconditions.checkNotNull(bundle0.get("value"));
        if(!zzjq0.zzu.zzac()) {
            zzjq0.zzj().zzp().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        zzon zzon0 = new zzon(s, bundle0.getLong("triggered_timestamp"), bundle0.get("value"), s1);
        try {
            zzbf0 = zzjq0.zzq().zza(bundle0.getString("app_id"), bundle0.getString("triggered_event_name"), bundle0.getBundle("triggered_event_params"), s1, 0L, true, true);
            zzbf1 = zzjq0.zzq().zza(bundle0.getString("app_id"), bundle0.getString("timed_out_event_name"), bundle0.getBundle("timed_out_event_params"), s1, 0L, true, true);
            zzbf2 = zzjq0.zzq().zza(bundle0.getString("app_id"), bundle0.getString("expired_event_name"), bundle0.getBundle("expired_event_params"), s1, 0L, true, true);
        }
        catch(IllegalArgumentException unused_ex) {
            return;
        }
        zzae zzae0 = new zzae(bundle0.getString("app_id"), s1, zzon0, bundle0.getLong("creation_timestamp"), false, bundle0.getString("trigger_event_name"), zzbf1, bundle0.getLong("trigger_timeout"), zzbf0, bundle0.getLong("time_to_live"), zzbf2);
        zzjq0.zzo().zza(zzae0);
    }

    private final void zzb(String s, String s1, long v, Bundle bundle0, boolean z, boolean z1, boolean z2, String s2) {
        Bundle bundle1 = zzos.zza(bundle0);
        this.zzl().zzb(new zzki(this, s, s1, v, bundle1, z, z1, z2, s2));
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    @WorkerThread
    final void zzb(long v) {
        this.zza(v, true);
    }

    public final void zzb(Bundle bundle0) {
        this.zzb(bundle0, this.zzb().currentTimeMillis());
    }

    public final void zzb(Bundle bundle0, long v) {
        Preconditions.checkNotNull(bundle0);
        Bundle bundle1 = new Bundle(bundle0);
        if(!TextUtils.isEmpty(bundle1.getString("app_id"))) {
            this.zzj().zzu().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle1.remove("app_id");
        Preconditions.checkNotNull(bundle1);
        zzjf.zza(bundle1, "app_id", String.class, null);
        zzjf.zza(bundle1, "origin", String.class, null);
        zzjf.zza(bundle1, "name", String.class, null);
        zzjf.zza(bundle1, "value", Object.class, null);
        zzjf.zza(bundle1, "trigger_event_name", String.class, null);
        zzjf.zza(bundle1, "trigger_timeout", Long.class, 0L);
        zzjf.zza(bundle1, "timed_out_event_name", String.class, null);
        zzjf.zza(bundle1, "timed_out_event_params", Bundle.class, null);
        zzjf.zza(bundle1, "triggered_event_name", String.class, null);
        zzjf.zza(bundle1, "triggered_event_params", Bundle.class, null);
        zzjf.zza(bundle1, "time_to_live", Long.class, 0L);
        zzjf.zza(bundle1, "expired_event_name", String.class, null);
        zzjf.zza(bundle1, "expired_event_params", Bundle.class, null);
        Preconditions.checkNotEmpty(bundle1.getString("name"));
        Preconditions.checkNotEmpty(bundle1.getString("origin"));
        Preconditions.checkNotNull(bundle1.get("value"));
        bundle1.putLong("creation_timestamp", v);
        String s = bundle1.getString("name");
        Object object0 = bundle1.get("value");
        if(this.zzq().zzb(s) != 0) {
            this.zzj().zzg().zza("Invalid conditional user property name", this.zzi().zzc(s));
            return;
        }
        if(this.zzq().zza(s, object0) != 0) {
            this.zzj().zzg().zza("Invalid conditional user property value", this.zzi().zzc(s), object0);
            return;
        }
        Object object1 = this.zzq().zzc(s, object0);
        if(object1 == null) {
            this.zzj().zzg().zza("Unable to normalize conditional user property value", this.zzi().zzc(s), object0);
            return;
        }
        zzjf.zza(bundle1, object1);
        long v1 = bundle1.getLong("trigger_timeout");
        if(!TextUtils.isEmpty(bundle1.getString("trigger_event_name")) && (v1 > 15552000000L || v1 < 1L)) {
            this.zzj().zzg().zza("Invalid conditional user property timeout", this.zzi().zzc(s), v1);
            return;
        }
        long v2 = bundle1.getLong("time_to_live");
        if(v2 <= 15552000000L && v2 >= 1L) {
            this.zzl().zzb(new zzko(this, bundle1));
            return;
        }
        this.zzj().zzg().zza("Invalid conditional user property time to live", this.zzi().zzc(s), v2);
    }

    public final void zzb(zzjl zzjl0) {
        this.zzu();
        Preconditions.checkNotNull(zzjl0);
        if(!this.zzd.remove(zzjl0)) {
            this.zzj().zzu().zza("OnEventListener had not been registered");
        }
    }

    // 检测为 Lambda 实现
    final void zzb(String s) [...]

    public final void zzb(String s, String s1, Bundle bundle0) {
        this.zza(s, s1, bundle0, true, true, this.zzb().currentTimeMillis());
    }

    public final void zzb(boolean z) {
        if(this.zza().getApplicationContext() instanceof Application) {
            Application application0 = (Application)this.zza().getApplicationContext();
            if(this.zzb == null) {
                this.zzb = new zzkz(this);
            }
            if(z) {
                application0.unregisterActivityLifecycleCallbacks(this.zzb);
                application0.registerActivityLifecycleCallbacks(this.zzb);
                this.zzj().zzp().zza("Registered activity lifecycle callback");
            }
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzb zzc() {
        return super.zzc();
    }

    public final void zzc(long v) {
        this.zzl().zzb(new zzkg(this, v));
    }

    public final void zzc(Bundle bundle0) {
        Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
        this.zzl().zzb(() -> {
            Bundle bundle1;
            if(bundle1.isEmpty()) {
                bundle1 = bundle1;
            }
            else {
                bundle1 = this.zzk().zzt.zza();
                if(this.zze().zza(zzbh.zzdh)) {
                    bundle1 = new Bundle(bundle1);
                }
                for(Object object0: bundle1.keySet()) {
                    String s = (String)object0;
                    Object object1 = bundle1.get(s);
                    if(object1 != null && !(object1 instanceof String) && !(object1 instanceof Long) && !(object1 instanceof Double)) {
                        this.zzq();
                        if(zzos.zza(object1)) {
                            this.zzq();
                            zzos.zza(this.zzt, 27, null, null, 0);
                        }
                        this.zzj().zzv().zza("Invalid default event parameter type. Name, value", s, object1);
                    }
                    else if(zzos.zzg(s)) {
                        this.zzj().zzv().zza("Invalid default event parameter name. Name", s);
                    }
                    else if(object1 == null) {
                        bundle1.remove(s);
                    }
                    else if(this.zzq().zza("param", s, this.zze().zza(null, false), object1)) {
                        this.zzq().zza(bundle1, s, object1);
                    }
                }
                this.zzq();
                if(zzos.zza(bundle1, this.zze().zzc())) {
                    this.zzq();
                    zzos.zza(this.zzt, 26, null, null, 0);
                    this.zzj().zzv().zza("Too many default event parameters set. Discarding beyond event parameter limit");
                }
            }
            this.zzk().zzt.zza(bundle1);
            if(!bundle1.isEmpty() || this.zze().zza(zzbh.zzdf)) {
                this.zzo().zza(bundle1);
            }
        });
    }

    public final void zzc(Bundle bundle0, long v) {
        this.zzl().zzc(() -> {
            if(TextUtils.isEmpty(this.zzg().zzae())) {
                this.zza(bundle0, 0, v);
                return;
            }
            this.zzj().zzv().zza("Using developer consent only; google app id found");
        });
    }

    final void zzc(String s) {
        this.zzf.set(s);
    }

    @WorkerThread
    final void zzc(String s, String s1, Bundle bundle0) {
        this.zzt();
        this.zza(s, s1, this.zzb().currentTimeMillis(), bundle0);
    }

    public final void zzc(boolean z) {
        this.zzu();
        this.zzl().zzb(new zzke(this, z));
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzab zzd() {
        return super.zzd();
    }

    public final void zzd(Bundle bundle0, long v) {
        this.zza(bundle0, -20, v);
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

