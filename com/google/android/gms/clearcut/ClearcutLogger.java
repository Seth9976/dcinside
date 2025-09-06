package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.clearcut.zzaa;
import com.google.android.gms.internal.clearcut.zzge.zzv.zzb;
import com.google.android.gms.internal.clearcut.zzha;
import com.google.android.gms.internal.clearcut.zzp;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import java.util.TimeZone;
import o3.h;

@KeepForSdk
public final class ClearcutLogger {
    public class LogEventBuilder {
        private final zzha zzaa;
        private boolean zzab;
        private final ClearcutLogger zzac;
        private String zzj;
        private int zzk;
        private String zzl;
        private String zzm;
        private zzb zzo;
        private final com.google.android.gms.clearcut.ClearcutLogger.zzb zzt;
        private ArrayList zzu;
        private ArrayList zzv;
        private ArrayList zzw;
        private ArrayList zzx;
        private ArrayList zzy;
        private boolean zzz;

        private LogEventBuilder(byte[] arr_b) {
            this(arr_b, null);
        }

        private LogEventBuilder(byte[] arr_b, com.google.android.gms.clearcut.ClearcutLogger.zzb clearcutLogger$zzb0) {
            this.zzk = clearcutLogger0.zzk;
            this.zzj = clearcutLogger0.zzj;
            this.zzl = clearcutLogger0.zzl;
            this.zzm = null;
            this.zzo = clearcutLogger0.zzo;
            this.zzu = null;
            this.zzv = null;
            this.zzw = null;
            this.zzx = null;
            this.zzy = null;
            this.zzz = true;
            zzha zzha0 = new zzha();
            this.zzaa = zzha0;
            this.zzab = false;
            this.zzl = clearcutLogger0.zzl;
            this.zzm = null;
            zzha0.zzbkc = zzaa.zze(clearcutLogger0.zzh);
            zzha0.zzbjf = clearcutLogger0.zzq.currentTimeMillis();
            zzha0.zzbjg = clearcutLogger0.zzq.elapsedRealtime();
            long v = zzha0.zzbjf;
            zzha0.zzbju = (long)(TimeZone.getDefault().getOffset(v) / 1000);
            if(arr_b != null) {
                zzha0.zzbjp = arr_b;
            }
            this.zzt = null;
        }

        LogEventBuilder(byte[] arr_b, zza zza0) {
            this(arr_b);
        }

        @KeepForSdk
        public void log() {
            if(this.zzab) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            this.zzab = true;
            zzr zzr0 = new zzr(ClearcutLogger.this.packageName, ClearcutLogger.this.zzi, this.zzk, this.zzj, this.zzl, this.zzm, ClearcutLogger.this.zzn, this.zzo);
            int[] arr_v = ClearcutLogger.zzb(null);
            int[] arr_v1 = ClearcutLogger.zzb(null);
            zze zze0 = new zze(zzr0, this.zzaa, null, null, arr_v, null, arr_v1, null, null, this.zzz);
            if(ClearcutLogger.this.zzs.zza(zze0)) {
                ClearcutLogger.this.zzp.zzb(zze0);
                return;
            }
            PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, null);
        }

        @KeepForSdk
        public LogEventBuilder setEventCode(int v) {
            this.zzaa.zzbji = v;
            return this;
        }
    }

    public interface com.google.android.gms.clearcut.ClearcutLogger.zza {
        boolean zza(zze arg1);
    }

    public interface com.google.android.gms.clearcut.ClearcutLogger.zzb {
        byte[] zza();
    }

    public static final class zzc {
    }

    @Deprecated
    public static final Api API;
    private static final AbstractClientBuilder CLIENT_BUILDER;
    private static final ClientKey CLIENT_KEY;
    private final String packageName;
    private static final ExperimentTokens[] zze;
    private static final String[] zzf;
    private static final byte[][] zzg;
    private final Context zzh;
    private final int zzi;
    private String zzj;
    private int zzk;
    private String zzl;
    private String zzm;
    private final boolean zzn;
    private zzb zzo;
    private final com.google.android.gms.clearcut.zzb zzp;
    private final Clock zzq;
    private zzc zzr;
    private final com.google.android.gms.clearcut.ClearcutLogger.zza zzs;

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        ClearcutLogger.CLIENT_KEY = api$ClientKey0;
        zza zza0 = new zza();
        ClearcutLogger.CLIENT_BUILDER = zza0;
        ClearcutLogger.API = new Api("ClearcutLogger.API", zza0, api$ClientKey0);
        ClearcutLogger.zze = new ExperimentTokens[0];
        ClearcutLogger.zzf = new String[0];
        ClearcutLogger.zzg = new byte[0][];
    }

    @VisibleForTesting
    private ClearcutLogger(Context context0, int v, String s, String s1, String s2, boolean z, com.google.android.gms.clearcut.zzb zzb0, Clock clock0, zzc clearcutLogger$zzc0, com.google.android.gms.clearcut.ClearcutLogger.zza clearcutLogger$zza0) {
        this.zzk = -1;
        this.zzo = zzb.zzbhk;
        this.zzh = context0;
        this.packageName = "com.dcinside.app.android";
        this.zzi = ClearcutLogger.zza(context0);
        this.zzk = -1;
        this.zzj = s;
        this.zzl = s1;
        this.zzm = null;
        this.zzn = z;
        this.zzp = zzb0;
        this.zzq = clock0;
        this.zzr = new zzc();
        this.zzo = zzb.zzbhk;
        this.zzs = clearcutLogger$zza0;
        if(z) {
            Preconditions.checkArgument(s1 == null, "can\'t be anonymous with an upload account");
        }
    }

    @KeepForSdk
    public ClearcutLogger(Context context0, String s, @h String s1) {
        this(context0, -1, s, s1, null, false, com.google.android.gms.internal.clearcut.zze.zzb(context0), DefaultClock.getInstance(), null, new zzp(context0));
    }

    @KeepForSdk
    public static ClearcutLogger anonymousLogger(Context context0, String s) {
        return new ClearcutLogger(context0, -1, s, null, null, true, com.google.android.gms.internal.clearcut.zze.zzb(context0), DefaultClock.getInstance(), null, new zzp(context0));
    }

    @KeepForSdk
    public final LogEventBuilder newEvent(@h byte[] arr_b) {
        return new LogEventBuilder(this, arr_b, null);
    }

    private static int zza(Context context0) {
        try {
            return context0.getPackageManager().getPackageInfo("com.dcinside.app.android", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.wtf("ClearcutLogger", "This can\'t happen.", packageManager$NameNotFoundException0);
            return 0;
        }
    }

    private static int[] zza(ArrayList arrayList0) [...] // Inlined contents

    static int[] zzb(ArrayList arrayList0) {
        return null;
    }

    static zzc zzg(ClearcutLogger clearcutLogger0) {
        return clearcutLogger0.zzr;
    }
}

