package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzfr.zzd;
import com.google.android.gms.internal.measurement.zzfy.zzc;
import com.google.android.gms.internal.measurement.zzfy.zzf;
import com.google.android.gms.internal.measurement.zzfy.zzh;
import com.google.android.gms.internal.measurement.zzfy.zzj;
import com.google.android.gms.internal.measurement.zzfy.zzk;
import com.google.android.gms.internal.measurement.zzfy.zzo;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.internal.measurement.zznm;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzow;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpo;
import com.google.android.gms.internal.measurement.zzpu;
import j..util.Objects;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zznv implements zzjc {
    final class zza implements zzas {
        zzk zza;
        List zzb;
        List zzc;
        private long zzd;
        private final zznv zze;

        private zza() {
        }

        zza(zzoi zzoi0) {
        }

        private static long zza(zzf zzfy$zzf0) {
            return zzfy$zzf0.zzd() / 1000L / 60L / 60L;
        }

        @Override  // com.google.android.gms.measurement.internal.zzas
        public final void zza(zzk zzfy$zzk0) {
            Preconditions.checkNotNull(zzfy$zzk0);
            this.zza = zzfy$zzk0;
        }

        @Override  // com.google.android.gms.measurement.internal.zzas
        public final boolean zza(long v, zzf zzfy$zzf0) {
            Preconditions.checkNotNull(zzfy$zzf0);
            if(this.zzc == null) {
                this.zzc = new ArrayList();
            }
            if(this.zzb == null) {
                this.zzb = new ArrayList();
            }
            if(!this.zzc.isEmpty() && zza.zza(((zzf)this.zzc.get(0))) != zza.zza(zzfy$zzf0)) {
                return false;
            }
            long v1 = this.zzd + ((long)zzfy$zzf0.zzcb());
            zznv.this.zze();
            if(v1 >= ((long)Math.max(0, ((int)(((Integer)zzbh.zzi.zza(null))))))) {
                return false;
            }
            this.zzd = v1;
            this.zzc.add(zzfy$zzf0);
            this.zzb.add(v);
            int v2 = this.zzc.size();
            zznv.this.zze();
            return v2 < Math.max(1, ((int)(((Integer)zzbh.zzj.zza(null)))));
        }
    }

    final class zzb {
        final String zza;
        long zzb;

        private zzb() {
            this(zznv0.zzq().zzp());
        }

        zzb(zzoi zzoi0) {
        }

        private zzb(String s) {
            this.zza = s;
            this.zzb = zznv0.zzb().elapsedRealtime();
        }

        zzb(String s, zzoi zzoi0) {
            this(s);
        }
    }

    private static volatile zznv zza;
    private List zzaa;
    private long zzab;
    private final Map zzac;
    private final Map zzad;
    private final Map zzae;
    private zzlk zzaf;
    private String zzag;
    private final zzor zzah;
    private zzhl zzb;
    private zzgr zzc;
    private zzal zzd;
    private zzgy zze;
    private zznq zzf;
    private zzt zzg;
    private final zzoo zzh;
    private zzli zzi;
    private zzmw zzj;
    private final zznu zzk;
    private zzhf zzl;
    private final zzhy zzm;
    private boolean zzn;
    private boolean zzo;
    @VisibleForTesting
    private long zzp;
    private List zzq;
    private final Set zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private FileLock zzx;
    private FileChannel zzy;
    private List zzz;

    private zznv(zzok zzok0) {
        this(zzok0, null);
    }

    private zznv(zzok zzok0, zzhy zzhy0) {
        this.zzn = false;
        this.zzr = new HashSet();
        this.zzah = new zzof(this);
        Preconditions.checkNotNull(zzok0);
        this.zzm = zzhy.zza(zzok0.zza, null, null);
        this.zzab = -1L;
        this.zzk = new zznu(this);
        zzoo zzoo0 = new zzoo(this);
        zzoo0.zzam();
        this.zzh = zzoo0;
        zzgr zzgr0 = new zzgr(this);
        zzgr0.zzam();
        this.zzc = zzgr0;
        zzhl zzhl0 = new zzhl(this);
        zzhl0.zzam();
        this.zzb = zzhl0;
        this.zzac = new HashMap();
        this.zzad = new HashMap();
        this.zzae = new HashMap();
        this.zzl().zzb(new zznx(this, zzok0));
    }

    private final int zza(String s, zzah zzah0) {
        if(this.zzb.zzb(s) == null) {
            zzah0.zza(com.google.android.gms.measurement.internal.zzje.zza.zzd, zzak.zzi);
            return 1;
        }
        zzg zzg0 = this.zzf().zze(s);
        if(zzg0 != null && com.google.android.gms.measurement.internal.zzf.zza(zzg0.zzak()).zza() == zzjh.zzb) {
            com.google.android.gms.measurement.internal.zzje.zza zzje$zza0 = com.google.android.gms.measurement.internal.zzje.zza.zzd;
            zzjh zzjh0 = this.zzb.zza(s, zzje$zza0);
            if(zzjh0 != zzjh.zza) {
                zzah0.zza(zzje$zza0, zzak.zzh);
                return zzjh0 == zzjh.zzd ? 0 : 1;
            }
        }
        zzah0.zza(com.google.android.gms.measurement.internal.zzje.zza.zzd, zzak.zzb);
        return this.zzb.zzc(s, com.google.android.gms.measurement.internal.zzje.zza.zzd) ? 0 : 1;
    }

    @VisibleForTesting
    @WorkerThread
    private final int zza(FileChannel fileChannel0) {
        this.zzl().zzt();
        if(fileChannel0 != null && fileChannel0.isOpen()) {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
            try {
                fileChannel0.position(0L);
                int v = fileChannel0.read(byteBuffer0);
                switch(v) {
                    case -1: {
                        return 0;
                    }
                    case 4: {
                        byteBuffer0.flip();
                        return byteBuffer0.getInt();
                    }
                    default: {
                        this.zzj().zzu().zza("Unexpected data length. Bytes read", v);
                        return 0;
                    }
                }
            }
            catch(IOException iOException0) {
            }
            this.zzj().zzg().zza("Failed to read from channel", iOException0);
            return 0;
        }
        this.zzj().zzg().zza("Bad channel to read from");
        return 0;
    }

    @VisibleForTesting
    @WorkerThread
    private final zzax zza(String s, zzax zzax0, zzje zzje0, zzah zzah0) {
        int v = 90;
        if(this.zzi().zzb(s) == null) {
            if(zzax0.zzc() == zzjh.zzc) {
                v = zzax0.zza();
                zzah0.zza(com.google.android.gms.measurement.internal.zzje.zza.zzc, v);
                return new zzax(Boolean.FALSE, v, Boolean.TRUE, "-");
            }
            zzah0.zza(com.google.android.gms.measurement.internal.zzje.zza.zzc, zzak.zzi);
            return new zzax(Boolean.FALSE, 90, Boolean.TRUE, "-");
        }
        zzjh zzjh0 = zzax0.zzc();
        zzjh zzjh1 = zzjh.zzd;
        if(zzjh0 == zzjh1) {
            v = zzax0.zza();
            zzah0.zza(com.google.android.gms.measurement.internal.zzje.zza.zzc, v);
        }
        else {
            zzjh zzjh2 = zzjh.zzc;
            if(zzjh0 == zzjh2) {
                v = zzax0.zza();
                zzah0.zza(com.google.android.gms.measurement.internal.zzje.zza.zzc, v);
            }
            else if(zzjh0 == zzjh.zzb) {
                com.google.android.gms.measurement.internal.zzje.zza zzje$zza0 = com.google.android.gms.measurement.internal.zzje.zza.zzc;
                zzjh zzjh3 = this.zzb.zza(s, zzje$zza0);
                if(zzjh3 != zzjh.zza) {
                    zzah0.zza(zzje$zza0, zzak.zzh);
                    zzjh0 = zzjh3;
                    goto label_38;
                }
                goto label_20;
            }
            else {
            label_20:
                com.google.android.gms.measurement.internal.zzje.zza zzje$zza1 = com.google.android.gms.measurement.internal.zzje.zza.zzc;
                com.google.android.gms.measurement.internal.zzje.zza zzje$zza2 = this.zzb.zzb(s, zzje$zza1);
                zzjh zzjh4 = zzje0.zzc();
                if(zzje$zza2 != com.google.android.gms.measurement.internal.zzje.zza.zza || zzjh4 != zzjh1 && zzjh4 != zzjh2) {
                    zzah0.zza(zzje$zza1, zzak.zzb);
                    zzjh0 = this.zzb.zzc(s, zzje$zza1) ? zzjh1 : zzjh2;
                }
                else {
                    zzah0.zza(zzje$zza1, zzak.zzc);
                    zzjh0 = zzjh4;
                }
            }
        }
    label_38:
        boolean z = this.zzb.zzm(s);
        SortedSet sortedSet0 = this.zzi().zzh(s);
        if(zzjh0 != zzjh.zzc && !sortedSet0.isEmpty()) {
            String s1 = z ? TextUtils.join("", sortedSet0) : "";
            return new zzax(Boolean.TRUE, v, Boolean.valueOf(z), s1);
        }
        return new zzax(Boolean.FALSE, v, Boolean.valueOf(z), "-");
    }

    private static zznr zza(zznr zznr0) {
        if(zznr0 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if(!zznr0.zzan()) {
            throw new IllegalStateException("Component not initialized: " + zznr0.getClass());
        }
        return zznr0;
    }

    public static zznv zza(Context context0) {
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(context0.getApplicationContext());
        if(zznv.zza == null) {
            synchronized(zznv.class) {
                if(zznv.zza == null) {
                    zznv.zza = new zznv(((zzok)Preconditions.checkNotNull(new zzok(context0))));
                }
            }
        }
        return zznv.zza;
    }

    @WorkerThread
    private final Boolean zza(zzg zzg0) {
        try {
            if(zzg0.zze() != 0xFFFFFFFF80000000L) {
                int v = Wrappers.packageManager(this.zzm.zza()).getPackageInfo(zzg0.zzac(), 0).versionCode;
                return zzg0.zze() == ((long)v);
            }
            String s = Wrappers.packageManager(this.zzm.zza()).getPackageInfo(zzg0.zzac(), 0).versionName;
            String s1 = zzg0.zzaf();
            return s1 == null || !s1.equals(s) ? false : true;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }

    @WorkerThread
    private final String zza(zzje zzje0) {
        if(zzje0.zzh()) {
            byte[] arr_b = new byte[16];
            this.zzq().zzv().nextBytes(arr_b);
            return String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
        }
        return null;
    }

    private static String zza(Map map0, String s) {
        if(map0 == null) {
            return null;
        }
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(s.equalsIgnoreCase(((String)map$Entry0.getKey()))) {
                return ((List)map$Entry0.getValue()).isEmpty() ? null : ((String)((List)map$Entry0.getValue()).get(0));
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @VisibleForTesting
    private static void zza(com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza0, int v, String s) {
        List list0 = zzfy$zzf$zza0.zzf();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            if("_err".equals(((zzh)list0.get(v1)).zzg())) {
                return;
            }
        }
        zzh zzfy$zzh0 = (zzh)(((zzjt)zzh.zze().zza("_err").zza(((long)v)).zzai()));
        zzh zzfy$zzh1 = (zzh)(((zzjt)zzh.zze().zza("_ev").zzb(s).zzai()));
        zzfy$zzf$zza0.zza(zzfy$zzh0).zza(zzfy$zzh1);
    }

    @VisibleForTesting
    private static void zza(com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza0, @NonNull String s) {
        List list0 = zzfy$zzf$zza0.zzf();
        for(int v = 0; v < list0.size(); ++v) {
            if(s.equals(((zzh)list0.get(v)).zzg())) {
                zzfy$zzf$zza0.zza(v);
                return;
            }
        }
    }

    @VisibleForTesting
    private final void zza(com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza0, long v, boolean z) {
        String s = z ? "_se" : "_lte";
        zzop zzop0 = this.zzf().zze(zzfy$zzk$zza0.zzt(), s);
        zzop zzop1 = zzop0 == null || zzop0.zze == null ? new zzop(zzfy$zzk$zza0.zzt(), "auto", s, this.zzb().currentTimeMillis(), v) : new zzop(zzfy$zzk$zza0.zzt(), "auto", s, this.zzb().currentTimeMillis(), ((long)(((long)(((Long)zzop0.zze))) + v)));
        zzo zzfy$zzo0 = (zzo)(((zzjt)zzo.zze().zza(s).zzb(this.zzb().currentTimeMillis()).zza(((long)(((Long)zzop1.zze)))).zzai()));
        int v1 = zzoo.zza(zzfy$zzk$zza0, s);
        if(v1 >= 0) {
            zzfy$zzk$zza0.zza(v1, zzfy$zzo0);
        }
        else {
            zzfy$zzk$zza0.zza(zzfy$zzo0);
        }
        if(v > 0L) {
            this.zzf().zza(zzop1);
            this.zzj().zzp().zza("Updated engagement user property. scope, value", (z ? "session-scoped" : "lifetime"), zzop1.zze);
        }
    }

    static void zza(zznv zznv0, zzok zzok0) {
        zznv0.zzl().zzt();
        zznv0.zzl = new zzhf(zznv0);
        zzal zzal0 = new zzal(zznv0);
        zzal0.zzam();
        zznv0.zzd = zzal0;
        zznv0.zze().zza(((zzai)Preconditions.checkNotNull(zznv0.zzb)));
        zzmw zzmw0 = new zzmw(zznv0);
        zzmw0.zzam();
        zznv0.zzj = zzmw0;
        zzt zzt0 = new zzt(zznv0);
        zzt0.zzam();
        zznv0.zzg = zzt0;
        zzli zzli0 = new zzli(zznv0);
        zzli0.zzam();
        zznv0.zzi = zzli0;
        zznq zznq0 = new zznq(zznv0);
        zznq0.zzam();
        zznv0.zzf = zznq0;
        zznv0.zze = new zzgy(zznv0);
        if(zznv0.zzs != zznv0.zzt) {
            zznv0.zzj().zzg().zza("Not all upload components initialized", zznv0.zzs, zznv0.zzt);
        }
        zznv0.zzn = true;
    }

    @VisibleForTesting
    private final void zza(String s, com.google.android.gms.internal.measurement.zzfy.zzh.zza zzfy$zzh$zza0, Bundle bundle0, String s1) {
        List list0 = CollectionUtils.listOf(new String[]{"_o", "_sn", "_sc", "_si"});
        int v = zzos.zzg(zzfy$zzh$zza0.zzf()) || zzos.zzg(s) ? this.zze().zzb(s1, true) : this.zze().zza(s1, true);
        long v1 = (long)zzfy$zzh$zza0.zzg().codePointCount(0, zzfy$zzh$zza0.zzg().length());
        this.zzq();
        String s2 = zzfy$zzh$zza0.zzf();
        this.zze();
        String s3 = zzos.zza(s2, 40, true);
        if(v1 > ((long)v) && !list0.contains(zzfy$zzh$zza0.zzf())) {
            if("_ev".equals(zzfy$zzh$zza0.zzf())) {
                this.zzq();
                bundle0.putString("_ev", zzos.zza(zzfy$zzh$zza0.zzg(), this.zze().zzb(s1, true), true));
                return;
            }
            this.zzj().zzv().zza("Param value is too long; discarded. Name, value length", s3, v1);
            if(bundle0.getLong("_err") == 0L) {
                bundle0.putLong("_err", 4L);
                if(bundle0.getString("_ev") == null) {
                    bundle0.putString("_ev", s3);
                    bundle0.putLong("_el", v1);
                }
            }
            bundle0.remove(zzfy$zzh$zza0.zzf());
        }
    }

    @WorkerThread
    private final void zza(String s, zzje zzje0) {
        this.zzl().zzt();
        this.zzs();
        this.zzac.put(s, zzje0);
        this.zzf().zzb(s, zzje0);
    }

    @WorkerThread
    private final void zza(String s, boolean z, Long long0, Long long1) {
        zzg zzg0 = this.zzf().zze(s);
        if(zzg0 != null) {
            zzg0.zzd(z);
            zzg0.zza(long0);
            zzg0.zzb(long1);
            if(zzg0.zzas()) {
                this.zzf().zza(zzg0, false, false);
            }
        }
    }

    @VisibleForTesting
    private final void zza(List list0) {
        Preconditions.checkArgument(!list0.isEmpty());
        if(this.zzz != null) {
            this.zzj().zzg().zza("Set uploading progress before finishing the previous upload");
            return;
        }
        this.zzz = new ArrayList(list0);
    }

    @VisibleForTesting
    @WorkerThread
    private final boolean zza(int v, FileChannel fileChannel0) {
        this.zzl().zzt();
        if(fileChannel0 != null && fileChannel0.isOpen()) {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
            byteBuffer0.putInt(v);
            byteBuffer0.flip();
            try {
                fileChannel0.truncate(0L);
                fileChannel0.write(byteBuffer0);
                fileChannel0.force(true);
                if(fileChannel0.size() != 4L) {
                    this.zzj().zzg().zza("Error writing to channel. Bytes written", fileChannel0.size());
                    return true;
                }
                return true;
            }
            catch(IOException iOException0) {
                this.zzj().zzg().zza("Failed to write to channel", iOException0);
                return false;
            }
        }
        this.zzj().zzg().zza("Bad channel to read from");
        return false;
    }

    private final boolean zza(com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza0, com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza1) {
        Preconditions.checkArgument("_e".equals(zzfy$zzf$zza0.zze()));
        this.zzp();
        String s = null;
        String s1 = zzoo.zza(((zzf)(((zzjt)zzfy$zzf$zza0.zzai()))), "_sc") == null ? null : "";
        this.zzp();
        if(zzoo.zza(((zzf)(((zzjt)zzfy$zzf$zza1.zzai()))), "_pc") != null) {
            s = "";
        }
        if(s != null && s.equals(s1)) {
            Preconditions.checkArgument("_e".equals(zzfy$zzf$zza0.zze()));
            this.zzp();
            zzh zzfy$zzh0 = zzoo.zza(((zzf)(((zzjt)zzfy$zzf$zza0.zzai()))), "_et");
            if(zzfy$zzh0 != null && zzfy$zzh0.zzl() && zzfy$zzh0.zzd() > 0L) {
                long v = zzfy$zzh0.zzd();
                this.zzp();
                zzh zzfy$zzh1 = zzoo.zza(((zzf)(((zzjt)zzfy$zzf$zza1.zzai()))), "_et");
                if(zzfy$zzh1 != null && zzfy$zzh1.zzd() > 0L) {
                    v += zzfy$zzh1.zzd();
                }
                this.zzp();
                zzoo.zza(zzfy$zzf$zza1, "_et", v);
                this.zzp();
                zzoo.zza(zzfy$zzf$zza0, "_fr", 1L);
            }
            return true;
        }
        return false;
    }

    @WorkerThread
    private final boolean zza(String s, long v) {
        zza zznv$zza2;
        com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza3;
        int v31;
        long v30;
        int v29;
        SecureRandom secureRandom1;
        com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza2;
        zza zznv$zza1;
        long v28;
        int v12;
        com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza5;
        com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza4;
        com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza1;
        int v10;
        boolean z1;
        com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza0;
        String s5;
        String[] arr_s2;
        zzk zzfy$zzk0;
        Throwable throwable2;
        String s4;
        String s2;
        SQLiteException sQLiteException1;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0;
        String s1;
        this.zzf().zzp();
        try {
            zza zznv$zza0 = new zza(this, null);
            zzal zzal0 = this.zzf();
            long v2 = this.zzab;
            Preconditions.checkNotNull(zznv$zza0);
            zzal0.zzt();
            zzal0.zzal();
            try {
                s1 = "";
                sQLiteDatabase0 = zzal0.e_();
                if(TextUtils.isEmpty(s)) {
                    goto label_31;
                }
                else {
                    int v3 = Long.compare(v2, -1L);
                    String[] arr_s = v3 == 0 ? new String[]{s} : new String[]{s, String.valueOf(v2)};
                    if(v3 != 0) {
                        s1 = " and rowid <= ?";
                    }
                    cursor0 = sQLiteDatabase0.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + s1 + " order by rowid limit 1;", arr_s);
                    goto label_21;
                }
                goto label_107;
            }
            catch(SQLiteException sQLiteException0) {
                sQLiteException1 = sQLiteException0;
                s2 = s;
                cursor0 = null;
                goto label_92;
            }
            catch(Throwable throwable0) {
                throwable2 = throwable0;
                cursor0 = null;
                goto label_98;
            }
            try {
            label_21:
                if(cursor0.moveToFirst()) {
                    String s3 = cursor0.getString(0);
                    cursor0.close();
                    s4 = s3;
                    s2 = s;
                    goto label_54;
                }
                else {
                    goto label_77;
                }
                goto label_107;
            }
            catch(SQLiteException sQLiteException2) {
                sQLiteException1 = sQLiteException2;
                s2 = s;
                goto label_92;
                try {
                label_31:
                    int v4 = Long.compare(v2, -1L);
                    String[] arr_s1 = v4 == 0 ? new String[]{String.valueOf(v)} : new String[]{String.valueOf(v2), String.valueOf(v)};
                    if(v4 != 0) {
                        s1 = "rowid <= ? and ";
                    }
                    cursor0 = sQLiteDatabase0.rawQuery("select app_id, metadata_fingerprint from raw_events where " + s1 + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", arr_s1);
                }
                catch(SQLiteException sQLiteException3) {
                    s2 = s;
                    sQLiteException1 = sQLiteException3;
                    cursor0 = null;
                    goto label_92;
                }
                catch(Throwable throwable0) {
                    throwable2 = throwable0;
                    cursor0 = null;
                    goto label_98;
                }
                try {
                    if(cursor0.moveToFirst()) {
                        s2 = cursor0.getString(0);
                        goto label_52;
                    }
                    else {
                        goto label_106;
                    }
                    goto label_107;
                }
                catch(SQLiteException sQLiteException4) {
                }
                catch(Throwable throwable1) {
                    goto label_97;
                }
                s2 = s;
                goto label_91;
                try {
                label_52:
                    s4 = cursor0.getString(1);
                    cursor0.close();
                label_54:
                    cursor0 = sQLiteDatabase0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{s2, s4}, null, null, "rowid", "2");
                    if(cursor0.moveToFirst()) {
                        byte[] arr_b = cursor0.getBlob(0);
                        try {
                            zzfy$zzk0 = (zzk)(((zzjt)((com.google.android.gms.internal.measurement.zzfy.zzk.zza)zzoo.zza(zzk.zzw(), arr_b)).zzai()));
                        }
                        catch(IOException iOException0) {
                            zzal0.zzj().zzg().zza("Data loss. Failed to merge raw event metadata. appId", zzgo.zza(s2), iOException0);
                            goto label_77;
                        }
                        if(cursor0.moveToNext()) {
                            zzal0.zzj().zzu().zza("Get multiple raw event metadata records, expected one. appId", zzgo.zza(s2));
                        }
                        cursor0.close();
                        zznv$zza0.zza(zzfy$zzk0);
                        if(v2 == -1L) {
                            s5 = "app_id = ? and metadata_fingerprint = ?";
                            arr_s2 = new String[]{s2, s4};
                        }
                        else {
                            arr_s2 = new String[]{s2, s4, String.valueOf(v2)};
                            s5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                        }
                        cursor0 = sQLiteDatabase0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, s5, arr_s2, null, null, "rowid", null);
                        if(cursor0.moveToFirst()) {
                            goto label_79;
                        }
                        else {
                            zzal0.zzj().zzu().zza("Raw event data disappeared while in transaction. appId", zzgo.zza(s2));
                            goto label_77;
                        }
                    }
                    else {
                        zzal0.zzj().zzg().zza("Raw event metadata record is missing. appId", zzgo.zza(s2));
                        goto label_77;
                    }
                    goto label_107;
                }
                catch(SQLiteException sQLiteException4) {
                    goto label_91;
                }
                catch(Throwable throwable1) {
                    goto label_97;
                }
            label_77:
                cursor0.close();
                goto label_107;
                try {
                    do {
                    label_79:
                        long v5 = cursor0.getLong(0);
                        byte[] arr_b1 = cursor0.getBlob(3);
                        try {
                            zzfy$zzf$zza0 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza)zzoo.zza(zzf.zze(), arr_b1);
                        }
                        catch(IOException iOException1) {
                            zzal0.zzj().zzg().zza("Data loss. Failed to merge raw event. appId", zzgo.zza(s2), iOException1);
                            continue;
                        }
                        zzfy$zzf$zza0.zza(cursor0.getString(1)).zzb(cursor0.getLong(2));
                        if(!zznv$zza0.zza(v5, ((zzf)(((zzjt)zzfy$zzf$zza0.zzai()))))) {
                            goto label_104;
                        }
                    }
                    while(cursor0.moveToNext());
                    goto label_102;
                }
                catch(SQLiteException sQLiteException4) {
                }
                catch(Throwable throwable1) {
                    goto label_97;
                }
            label_91:
                sQLiteException1 = sQLiteException4;
                try {
                label_92:
                    zzal0.zzj().zzg().zza("Data loss. Error selecting raw event. appId", zzgo.zza(s2), sQLiteException1);
                    if(cursor0 != null) {
                        goto label_94;
                    }
                    goto label_107;
                }
                catch(Throwable throwable1) {
                    goto label_97;
                }
            label_94:
                cursor0.close();
                goto label_107;
            }
            catch(Throwable throwable1) {
            label_97:
                throwable2 = throwable1;
            }
        label_98:
            if(cursor0 != null) {
                cursor0.close();
            }
            throw throwable2;
        label_102:
            cursor0.close();
            goto label_107;
        label_104:
            cursor0.close();
            goto label_107;
        label_106:
            cursor0.close();
        label_107:
            if(zznv$zza0.zzc != null && !zznv$zza0.zzc.isEmpty()) {
                com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza0 = ((com.google.android.gms.internal.measurement.zzfy.zzk.zza)zznv$zza0.zza.zzcd()).zzl();
                com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza1 = null;
                com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza2 = null;
                int v6 = 0;
                boolean z = false;
                int v7 = 0;
                int v8 = -1;
                int v9 = -1;
                while(true) {
                    z1 = z;
                    if(v6 >= zznv$zza0.zzc.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza3 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza)((zzf)zznv$zza0.zzc.get(v6)).zzcd();
                    if(this.zzi().zzd("", zzfy$zzf$zza3.zze())) {
                        zzgq zzgq0 = this.zzj().zzu();
                        Object object0 = zzgo.zza("");
                        String s6 = zzfy$zzf$zza3.zze();
                        zzgq0.zza("Dropping blocked raw event. appId", object0, this.zzm.zzk().zza(s6));
                        if(!this.zzi().zzl("") && !this.zzi().zzn("") && !"_err".equals(zzfy$zzf$zza3.zze())) {
                            this.zzq();
                            String s7 = zzfy$zzf$zza3.zze();
                            zzos.zza(this.zzah, "", 11, "_ev", s7, 0);
                        }
                        v10 = v6;
                    }
                    else {
                        if(zzfy$zzf$zza3.zze().equals("ad_impression")) {
                            zzfy$zzf$zza3.zza("_ai");
                            this.zzj().zzp().zza("Renaming ad_impression to _ai");
                            if(this.zzj().zza(5)) {
                                for(int v11 = 0; v11 < zzfy$zzf$zza3.zza(); ++v11) {
                                }
                            }
                        }
                        boolean z2 = this.zzi().zzc("", zzfy$zzf$zza3.zze());
                        if(z2) {
                            zzfy$zzf$zza4 = zzfy$zzf$zza1;
                            int v13 = 0;
                            while(true) {
                                zzfy$zzk$zza1 = zzfy$zzk$zza0;
                                if(v13 >= zzfy$zzf$zza3.zza()) {
                                    break;
                                }
                                ++v13;
                                zzfy$zzk$zza0 = zzfy$zzk$zza1;
                            }
                            zzfy$zzf$zza5 = zzfy$zzf$zza2;
                            if(z2) {
                                zzgq zzgq1 = this.zzj().zzp();
                                String s9 = zzfy$zzf$zza3.zze();
                                zzgq1.zza("Marking event as conversion", this.zzm.zzk().zza(s9));
                                zzfy$zzf$zza3.zza(zzh.zze().zza("_c").zza(1L));
                            }
                            zzgq zzgq2 = this.zzj().zzp();
                            String s10 = zzfy$zzf$zza3.zze();
                            zzgq2.zza("Marking event as real-time", this.zzm.zzk().zza(s10));
                            zzfy$zzf$zza3.zza(zzh.zze().zza("_r").zza(1L));
                            v12 = v9;
                            if(this.zzf().zza(this.zzx(), "", false, false, false, false, true, false, false).zze > ((long)this.zze().zzc(""))) {
                                zznv.zza(zzfy$zzf$zza3, "_r");
                            }
                            else {
                                z1 = true;
                            }
                            if(zzos.zzh(zzfy$zzf$zza3.zze()) && z2 && this.zzf().zza(this.zzx(), "", false, false, true, false, false, false, false).zzc > ((long)this.zze().zzb("", zzbh.zzn))) {
                                this.zzj().zzu().zza("Too many conversions. Not logging as conversion. appId", zzgo.zza(""));
                                for(int v14 = 0; v14 < zzfy$zzf$zza3.zza(); ++v14) {
                                    zzfy$zzf$zza3.zzb(v14);
                                }
                                this.zzj().zzg().zza("Did not find conversion parameter. appId", zzgo.zza(""));
                            }
                        }
                        else {
                            this.zzp();
                            String s8 = zzfy$zzf$zza3.zze();
                            Preconditions.checkNotEmpty(s8);
                            if(s8.hashCode() != 95027 || !s8.equals("_ui")) {
                                zzfy$zzk$zza1 = zzfy$zzk$zza0;
                                zzfy$zzf$zza4 = zzfy$zzf$zza1;
                                zzfy$zzf$zza5 = zzfy$zzf$zza2;
                                v12 = v9;
                            }
                        }
                        if(z2) {
                            ArrayList arrayList0 = new ArrayList(zzfy$zzf$zza3.zzf());
                            for(int v15 = 0; v15 < arrayList0.size(); ++v15) {
                            }
                        }
                        if("_e".equals(zzfy$zzf$zza3.zze())) {
                            this.zzp();
                            if(zzoo.zza(((zzf)(((zzjt)zzfy$zzf$zza3.zzai()))), "_fr") == null) {
                                if(zzfy$zzf$zza5 != null && Math.abs(zzfy$zzf$zza5.zzc() - zzfy$zzf$zza3.zzc()) <= 1000L) {
                                    com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza6 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza)(((com.google.android.gms.internal.measurement.zzjt.zzb)zzfy$zzf$zza5.clone()));
                                    if(this.zza(zzfy$zzf$zza3, zzfy$zzf$zza6)) {
                                        zzfy$zzk$zza0 = zzfy$zzk$zza1;
                                        zzfy$zzk$zza0.zza(v12, zzfy$zzf$zza6);
                                        v9 = v12;
                                        zzfy$zzf$zza4 = null;
                                        zzfy$zzf$zza5 = null;
                                        goto label_220;
                                    }
                                }
                                zzfy$zzk$zza0 = zzfy$zzk$zza1;
                                v8 = v7;
                                v9 = v12;
                                zzfy$zzf$zza4 = zzfy$zzf$zza3;
                                goto label_220;
                            }
                            else {
                                zzfy$zzk$zza0 = zzfy$zzk$zza1;
                                goto label_219;
                            }
                            goto label_204;
                        }
                        else {
                        label_204:
                            zzfy$zzk$zza0 = zzfy$zzk$zza1;
                            if("_vs".equals(zzfy$zzf$zza3.zze())) {
                                this.zzp();
                                if(zzoo.zza(((zzf)(((zzjt)zzfy$zzf$zza3.zzai()))), "_et") == null) {
                                    if(zzfy$zzf$zza4 != null && Math.abs(zzfy$zzf$zza4.zzc() - zzfy$zzf$zza3.zzc()) <= 1000L) {
                                        com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza7 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza)(((com.google.android.gms.internal.measurement.zzjt.zzb)zzfy$zzf$zza4.clone()));
                                        if(this.zza(zzfy$zzf$zza7, zzfy$zzf$zza3)) {
                                            zzfy$zzk$zza0.zza(v8, zzfy$zzf$zza7);
                                            v9 = v12;
                                            zzfy$zzf$zza4 = null;
                                            zzfy$zzf$zza5 = null;
                                            goto label_220;
                                        }
                                    }
                                    v9 = v7;
                                    zzfy$zzf$zza5 = zzfy$zzf$zza3;
                                    goto label_220;
                                }
                            }
                        }
                    label_219:
                        v9 = v12;
                    label_220:
                        if(zzfy$zzf$zza3.zza() != 0) {
                            this.zzp();
                            Bundle bundle0 = zzoo.zza(zzfy$zzf$zza3.zzf());
                            for(int v16 = 0; v16 < zzfy$zzf$zza3.zza(); ++v16) {
                                this.zza(zzfy$zzf$zza3.zze(), ((com.google.android.gms.internal.measurement.zzfy.zzh.zza)zzfy$zzf$zza3.zzb(v16).zzcd()), bundle0, "");
                            }
                            zzfy$zzf$zza3.zzd();
                            zzoo zzoo0 = this.zzp();
                            ArrayList arrayList1 = new ArrayList();
                            for(Object object1: bundle0.keySet()) {
                                com.google.android.gms.internal.measurement.zzfy.zzh.zza zzfy$zzh$zza0 = zzh.zze().zza(((String)object1));
                                Object object2 = bundle0.get(((String)object1));
                                if(object2 != null) {
                                    zzoo0.zza(zzfy$zzh$zza0, object2);
                                    arrayList1.add(((zzh)(((zzjt)zzfy$zzh$zza0.zzai()))));
                                }
                            }
                            int v17 = arrayList1.size();
                            int v18 = 0;
                            while(v18 < v17) {
                                Object object3 = arrayList1.get(v18);
                                ++v18;
                                zzfy$zzf$zza3.zza(((zzh)object3));
                            }
                        }
                        v10 = v6;
                        zznv$zza0.zzc.set(v10, ((zzf)(((zzjt)zzfy$zzf$zza3.zzai()))));
                        ++v7;
                        zzfy$zzk$zza0.zza(zzfy$zzf$zza3);
                        zzfy$zzf$zza1 = zzfy$zzf$zza4;
                        zzfy$zzf$zza2 = zzfy$zzf$zza5;
                    }
                    v6 = v10 + 1;
                    z = z1;
                }
                long v19 = 0L;
                for(int v20 = 0; v20 < v7; ++v20) {
                    zzf zzfy$zzf0 = zzfy$zzk$zza0.zza(v20);
                    this.zzp();
                    zzh zzfy$zzh0 = zzoo.zza(zzfy$zzf0, "_et");
                    if(zzfy$zzh0 != null) {
                        Long long0 = zzfy$zzh0.zzl() ? zzfy$zzh0.zzd() : null;
                        if(long0 != null && ((long)long0) > 0L) {
                            v19 += (long)long0;
                        }
                    }
                }
                this.zza(zzfy$zzk$zza0, v19, false);
                Iterator iterator1 = zzfy$zzk$zza0.zzaa().iterator();
                while(iterator1.hasNext()) {
                    iterator1.next();
                }
                if(zzoo.zza(zzfy$zzk$zza0, "_sid") >= 0) {
                    this.zza(zzfy$zzk$zza0, v19, true);
                }
                else {
                    int v21 = zzoo.zza(zzfy$zzk$zza0, "_se");
                    if(v21 >= 0) {
                        zzfy$zzk$zza0.zzc(v21);
                        this.zzj().zzg().zza("Session engagement user property is in the bundle without session ID. appId", zzgo.zza(""));
                    }
                }
                this.zzl().zzt();
                this.zzs();
                zzg zzg0 = this.zzf().zze("");
                if(zzg0 == null) {
                    this.zzj().zzg().zza("Cannot fix consent fields without appInfo. appId", zzgo.zza(""));
                }
                else {
                    this.zza(zzg0, zzfy$zzk$zza0);
                }
                if(zzov.zza() && this.zze().zza(zzbh.zzcu)) {
                    this.zzl().zzt();
                    this.zzs();
                    zzg zzg1 = this.zzf().zze("");
                    if(zzg1 == null) {
                        this.zzj().zzu().zza("Cannot populate ad_campaign_info without appInfo. appId", zzgo.zza(""));
                    }
                    else {
                        this.zzb(zzg1, zzfy$zzk$zza0);
                    }
                }
                zzfy$zzk$zza0.zzi(0x7FFFFFFFFFFFFFFFL).zze(0x8000000000000000L);
                for(int v22 = 0; v22 < zzfy$zzk$zza0.zzc(); ++v22) {
                    zzf zzfy$zzf1 = zzfy$zzk$zza0.zza(v22);
                    if(zzfy$zzf1.zzd() < zzfy$zzk$zza0.zzf()) {
                        zzfy$zzk$zza0.zzi(zzfy$zzf1.zzd());
                    }
                    if(zzfy$zzf1.zzd() > zzfy$zzk$zza0.zze()) {
                        zzfy$zzk$zza0.zze(zzfy$zzf1.zzd());
                    }
                }
                zzfy$zzk$zza0.zzs();
                zzje zzje0 = zzje.zza;
                if(zznm.zza() && this.zze().zza(zzbh.zzcy)) {
                    zzje0 = this.zzb("").zza(zzje.zzb(""));
                    zzje zzje1 = this.zzf().zzh("");
                    this.zzf().zza("", zzje0);
                    if(!zzje0.zzh() && zzje1.zzh()) {
                        this.zzf().zzq("");
                    }
                    else if(zzje0.zzh() && !zzje1.zzh()) {
                        this.zzf().zzr("");
                    }
                    if(!zzje0.zzg()) {
                        zzfy$zzk$zza0.zzq();
                        zzfy$zzk$zza0.zzn();
                        zzfy$zzk$zza0.zzk();
                    }
                    if(!zzje0.zzh()) {
                        zzfy$zzk$zza0.zzh();
                        zzfy$zzk$zza0.zzr();
                    }
                }
                if(zzpn.zza() && this.zze().zze("", zzbh.zzch)) {
                    this.zzq();
                    if(zzos.zzd("") && this.zzb("").zzg() && zznv$zza0.zza.zzat()) {
                        for(int v23 = 0; v23 < zzfy$zzk$zza0.zzc(); ++v23) {
                            Iterator iterator2 = ((com.google.android.gms.internal.measurement.zzfy.zzf.zza)zzfy$zzk$zza0.zza(v23).zzcd()).zzf().iterator();
                            while(iterator2.hasNext()) {
                                iterator2.next();
                            }
                        }
                    }
                }
                if(!zznm.zza() || !this.zze().zza(zzbh.zzcy)) {
                    zzfy$zzk$zza0.zzi().zza(this.zzc().zza("", zzfy$zzk$zza0.zzaa(), zzfy$zzk$zza0.zzab(), zzfy$zzk$zza0.zzf(), zzfy$zzk$zza0.zze()));
                }
                else {
                    zzfy$zzk$zza0.zzi().zza(this.zzc().zza("", zzfy$zzk$zza0.zzaa(), zzfy$zzk$zza0.zzab(), zzfy$zzk$zza0.zzf(), zzfy$zzk$zza0.zze(), !zzje0.zzh()));
                }
                if(this.zze().zzk("")) {
                    HashMap hashMap0 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    SecureRandom secureRandom0 = this.zzq().zzv();
                    int v24 = 0;
                    while(v24 < zzfy$zzk$zza0.zzc()) {
                        com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza8 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza)zzfy$zzk$zza0.zza(v24).zzcd();
                        if(zzfy$zzf$zza8.zze().equals("_ep")) {
                            this.zzp();
                            String s11 = (String)zzoo.zzb(((zzf)(((zzjt)zzfy$zzf$zza8.zzai()))), "_en");
                            zzbb zzbb0 = (zzbb)hashMap0.get(s11);
                            if(zzbb0 == null) {
                                zzbb0 = this.zzf().zzd("", ((String)Preconditions.checkNotNull(s11)));
                                if(zzbb0 != null) {
                                    hashMap0.put(s11, zzbb0);
                                }
                            }
                            if(zzbb0 != null && zzbb0.zzi == null) {
                                if(zzbb0.zzj != null && ((long)zzbb0.zzj) > 1L) {
                                    this.zzp();
                                    zzoo.zza(zzfy$zzf$zza8, "_sr", zzbb0.zzj);
                                }
                                if(zzbb0.zzk != null && zzbb0.zzk.booleanValue()) {
                                    this.zzp();
                                    zzoo.zza(zzfy$zzf$zza8, "_efs", 1L);
                                }
                                arrayList2.add(((zzf)(((zzjt)zzfy$zzf$zza8.zzai()))));
                            }
                            zzfy$zzk$zza0.zza(v24, zzfy$zzf$zza8);
                            goto label_398;
                        }
                        else {
                            long v25 = this.zzi().zza("");
                            this.zzq();
                            long v26 = zzos.zza(zzfy$zzf$zza8.zzc(), v25);
                            zzf zzfy$zzf2 = (zzf)(((zzjt)zzfy$zzf$zza8.zzai()));
                            if(!TextUtils.isEmpty("_dbg")) {
                                for(Object object4: zzfy$zzf2.zzh()) {
                                    zzh zzfy$zzh1 = (zzh)object4;
                                }
                            }
                            int v27 = this.zzi().zzb("", zzfy$zzf$zza8.zze());
                            if(v27 <= 0) {
                                this.zzj().zzu().zza("Sample rate must be positive. event, rate", zzfy$zzf$zza8.zze(), v27);
                                arrayList2.add(((zzf)(((zzjt)zzfy$zzf$zza8.zzai()))));
                                zzfy$zzk$zza0.zza(v24, zzfy$zzf$zza8);
                                goto label_398;
                            }
                            else {
                                zzbb zzbb1 = (zzbb)hashMap0.get(zzfy$zzf$zza8.zze());
                                if(zzbb1 == null) {
                                    v28 = v25;
                                    zzbb zzbb2 = this.zzf().zzd("", zzfy$zzf$zza8.zze());
                                    if(zzbb2 == null) {
                                        this.zzj().zzu().zza("Event being bundled has no eventAggregate. appId, eventName", "", zzfy$zzf$zza8.zze());
                                        zzbb1 = new zzbb("", zzfy$zzf$zza8.zze(), 1L, 1L, 1L, zzfy$zzf$zza8.zzc(), 0L, null, null, null, null);
                                    }
                                    else {
                                        zzbb1 = zzbb2;
                                    }
                                }
                                else {
                                    v28 = v25;
                                }
                                this.zzp();
                                Long long1 = (Long)zzoo.zzb(((zzf)(((zzjt)zzfy$zzf$zza8.zzai()))), "_eid");
                                boolean z3 = long1 != null;
                                if(v27 == 1) {
                                    arrayList2.add(((zzf)(((zzjt)zzfy$zzf$zza8.zzai()))));
                                    if(z3 && (zzbb1.zzi != null || zzbb1.zzj != null || zzbb1.zzk != null)) {
                                        hashMap0.put(zzfy$zzf$zza8.zze(), zzbb1.zza(null, null, null));
                                    }
                                    zzfy$zzk$zza0.zza(v24, zzfy$zzf$zza8);
                                label_398:
                                    zznv$zza1 = zznv$zza0;
                                    zzfy$zzk$zza2 = zzfy$zzk$zza0;
                                    secureRandom1 = secureRandom0;
                                    v29 = v24;
                                }
                                else {
                                    if(secureRandom0.nextInt(v27) == 0) {
                                        this.zzp();
                                        zznv$zza1 = zznv$zza0;
                                        zzoo.zza(zzfy$zzf$zza8, "_sr", ((long)v27));
                                        arrayList2.add(((zzf)(((zzjt)zzfy$zzf$zza8.zzai()))));
                                        if(z3) {
                                            zzbb1 = zzbb1.zza(null, ((long)v27), null);
                                        }
                                        hashMap0.put(zzfy$zzf$zza8.zze(), zzbb1.zza(zzfy$zzf$zza8.zzc(), v26));
                                        secureRandom1 = secureRandom0;
                                        v29 = v24;
                                    }
                                    else {
                                        zznv$zza1 = zznv$zza0;
                                        Long long2 = zzbb1.zzh;
                                        if(long2 == null) {
                                            this.zzq();
                                            secureRandom1 = secureRandom0;
                                            v31 = v24;
                                            v30 = zzos.zza(zzfy$zzf$zza8.zzb(), v28);
                                        }
                                        else {
                                            v30 = (long)long2;
                                            secureRandom1 = secureRandom0;
                                            v31 = v24;
                                        }
                                        if(v30 != v26) {
                                            this.zzp();
                                            zzoo.zza(zzfy$zzf$zza8, "_efs", 1L);
                                            this.zzp();
                                            zzoo.zza(zzfy$zzf$zza8, "_sr", ((long)v27));
                                            arrayList2.add(((zzf)(((zzjt)zzfy$zzf$zza8.zzai()))));
                                            if(z3) {
                                                zzbb1 = zzbb1.zza(null, ((long)v27), Boolean.TRUE);
                                            }
                                            hashMap0.put(zzfy$zzf$zza8.zze(), zzbb1.zza(zzfy$zzf$zza8.zzc(), v26));
                                        }
                                        else if(z3) {
                                            hashMap0.put(zzfy$zzf$zza8.zze(), zzbb1.zza(long1, null, null));
                                        }
                                        v29 = v31;
                                    }
                                    zzfy$zzk$zza2 = zzfy$zzk$zza0;
                                    zzfy$zzk$zza2.zza(v29, zzfy$zzf$zza8);
                                }
                            }
                        }
                        secureRandom0 = secureRandom1;
                        zzfy$zzk$zza0 = zzfy$zzk$zza2;
                        v24 = v29 + 1;
                        zznv$zza0 = zznv$zza1;
                    }
                    zzfy$zzk$zza3 = zzfy$zzk$zza0;
                    if(arrayList2.size() < zzfy$zzk$zza3.zzc()) {
                        zzfy$zzk$zza3.zzl().zzb(arrayList2);
                    }
                    for(Object object5: hashMap0.entrySet()) {
                        this.zzf().zza(((zzbb)((Map.Entry)object5).getValue()));
                    }
                }
                else {
                    zzfy$zzk$zza3 = zzfy$zzk$zza0;
                }
                zznv$zza2 = zznv$zza0;
                zzg zzg2 = this.zzf().zze("");
                if(zzg2 == null) {
                    this.zzj().zzg().zza("Bundling raw events w/o app info. appId", zzgo.zza(""));
                }
                else if(zzfy$zzk$zza3.zzc() > 0) {
                    long v32 = zzg2.zzs();
                    if(v32 == 0L) {
                        zzfy$zzk$zza3.zzo();
                    }
                    else {
                        zzfy$zzk$zza3.zzg(v32);
                    }
                    long v33 = zzg2.zzu();
                    if(v33 != 0L) {
                        v32 = v33;
                    }
                    if(v32 == 0L) {
                        zzfy$zzk$zza3.zzp();
                    }
                    else {
                        zzfy$zzk$zza3.zzh(v32);
                    }
                    if(!zzpu.zza() || !this.zze().zza(zzbh.zzbx)) {
                        zzg2.zzap();
                    }
                    else {
                        this.zzq();
                        if(zzos.zzf(zzg2.zzac())) {
                            zzg2.zza(((long)zzfy$zzk$zza3.zzc()));
                            zzfy$zzk$zza3.zzg(((int)zzg2.zzr()));
                        }
                        else {
                            zzg2.zzap();
                        }
                    }
                    zzfy$zzk$zza3.zzf(((int)zzg2.zzt()));
                    zzg2.zzr(zzfy$zzk$zza3.zzf());
                    zzg2.zzp(zzfy$zzk$zza3.zze());
                    String s12 = zzg2.zzab();
                    if(s12 == null) {
                        zzfy$zzk$zza3.zzm();
                    }
                    else {
                        zzfy$zzk$zza3.zzn(s12);
                    }
                    this.zzf().zza(zzg2, false, false);
                }
                if(zzfy$zzk$zza3.zzc() > 0) {
                    zzd zzfr$zzd0 = this.zzi().zzc("");
                    if(zzfr$zzd0 == null || !zzfr$zzd0.zzr()) {
                        zzfy$zzk$zza3.zzb(-1L);
                    }
                    else {
                        zzfy$zzk$zza3.zzb(zzfr$zzd0.zzc());
                    }
                    this.zzf().zza(((zzk)(((zzjt)zzfy$zzk$zza3.zzai()))), z1);
                }
                zzal zzal1 = this.zzf();
                List list0 = zznv$zza2.zzb;
                Preconditions.checkNotNull(list0);
                zzal1.zzt();
                zzal1.zzal();
                StringBuilder stringBuilder0 = new StringBuilder("rowid in (");
                for(int v34 = 0; v34 < list0.size(); ++v34) {
                    if(v34 != 0) {
                        stringBuilder0.append(",");
                    }
                    stringBuilder0.append(((long)(((Long)list0.get(v34)))));
                }
                stringBuilder0.append(")");
                int v35 = zzal1.e_().delete("raw_events", stringBuilder0.toString(), null);
                if(v35 != list0.size()) {
                    zzal1.zzj().zzg().zza("Deleted fewer rows from raw events table than expected", v35, list0.size());
                }
                zzal zzal2 = this.zzf();
                SQLiteDatabase sQLiteDatabase1 = zzal2.e_();
                try {
                    sQLiteDatabase1.execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{"", ""});
                }
                catch(SQLiteException sQLiteException5) {
                    zzal2.zzj().zzg().zza("Failed to remove unused event metadata. appId", zzgo.zza(""), sQLiteException5);
                }
                this.zzf().zzw();
                return true;
            }
            this.zzf().zzw();
            return false;
        }
        finally {
            this.zzf().zzu();
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzjc
    public final Context zza() {
        return this.zzm.zza();
    }

    @WorkerThread
    final Bundle zza(String s) {
        this.zzl().zzt();
        this.zzs();
        if(this.zzi().zzb(s) == null) {
            return null;
        }
        Bundle bundle0 = new Bundle();
        zzje zzje0 = this.zzb(s);
        bundle0.putAll(zzje0.zzb());
        bundle0.putAll(this.zza(s, this.zzd(s), zzje0, new zzah()).zzb());
        zzop zzop0 = this.zzf().zze(s, "_npa");
        boolean z = zzop0 == null ? this.zza(s, new zzah()) : zzop0.zze.equals(1L);
        bundle0.putString("ad_personalization", (z ? "denied" : "granted"));
        return bundle0;
    }

    @WorkerThread
    final zzg zza(com.google.android.gms.measurement.internal.zzo zzo0) {
        boolean z;
        this.zzl().zzt();
        this.zzs();
        Preconditions.checkNotNull(zzo0);
        Preconditions.checkNotEmpty(zzo0.zza);
        if(!zzo0.zzu.isEmpty()) {
            zzb zznv$zzb0 = new zzb(this, zzo0.zzu, null);
            this.zzae.put(zzo0.zza, zznv$zzb0);
        }
        zzg zzg0 = this.zzf().zze(zzo0.zza);
        zzje zzje0 = this.zzb(zzo0.zza).zza(zzje.zzb(zzo0.zzt));
        String s = zzje0.zzg() ? this.zzj.zza(zzo0.zza, zzo0.zzn) : "";
        if(zzg0 == null) {
            zzg0 = new zzg(this.zzm, zzo0.zza);
            if(zzje0.zzh()) {
                zzg0.zzb(this.zza(zzje0));
            }
            if(zzje0.zzg()) {
                zzg0.zzh(s);
            }
            z = false;
        }
        else if(!zzje0.zzg() || s == null || s.equals(zzg0.zzaj())) {
            if(TextUtils.isEmpty(zzg0.zzad()) && zzje0.zzh()) {
                zzg0.zzb(this.zza(zzje0));
            }
            z = false;
        }
        else {
            boolean z1 = TextUtils.isEmpty(zzg0.zzaj());
            zzg0.zzh(s);
            if(!zzo0.zzn || "00000000-0000-0000-0000-000000000000".equals(this.zzj.zza(zzo0.zza, zzje0).first) || z1) {
                if(TextUtils.isEmpty(zzg0.zzad()) && zzje0.zzh()) {
                    zzg0.zzb(this.zza(zzje0));
                }
                z = false;
            }
            else {
                if(!zznm.zza() || !this.zze().zza(zzbh.zzcy) || zzje0.zzh()) {
                    zzg0.zzb(this.zza(zzje0));
                    z = false;
                }
                else {
                    z = true;
                }
                if(this.zzf().zze(zzo0.zza, "_id") != null && this.zzf().zze(zzo0.zza, "_lair") == null) {
                    long v = this.zzb().currentTimeMillis();
                    zzop zzop0 = new zzop(zzo0.zza, "auto", "_lair", v, 1L);
                    this.zzf().zza(zzop0);
                }
            }
        }
        zzg0.zzf(zzo0.zzb);
        zzg0.zza(zzo0.zzp);
        if(!TextUtils.isEmpty(zzo0.zzk)) {
            zzg0.zze(zzo0.zzk);
        }
        long v1 = zzo0.zze;
        if(v1 != 0L) {
            zzg0.zzn(v1);
        }
        if(!TextUtils.isEmpty(zzo0.zzc)) {
            zzg0.zzd(zzo0.zzc);
        }
        zzg0.zzb(zzo0.zzj);
        String s1 = zzo0.zzd;
        if(s1 != null) {
            zzg0.zzc(s1);
        }
        zzg0.zzk(zzo0.zzf);
        zzg0.zzb(zzo0.zzh);
        if(!TextUtils.isEmpty(zzo0.zzg)) {
            zzg0.zzg(zzo0.zzg);
        }
        zzg0.zza(zzo0.zzn);
        zzg0.zza(zzo0.zzq);
        zzg0.zzl(zzo0.zzr);
        zzg0.zzj(zzo0.zzv);
        if(zzny.zza() && this.zze().zza(zzbh.zzbv)) {
            zzg0.zza(zzo0.zzs);
        }
        else if(zzny.zza() && this.zze().zza(zzbh.zzbu)) {
            zzg0.zza(null);
        }
        if(zzpu.zza() && this.zze().zza(zzbh.zzbx)) {
            this.zzq();
            if(zzos.zzf(zzg0.zzac())) {
                zzg0.zzc(zzo0.zzw);
                if(this.zze().zza(zzbh.zzby)) {
                    zzg0.zzk(zzo0.zzac);
                }
            }
        }
        if(zzpn.zza() && this.zze().zza(zzbh.zzch)) {
            zzg0.zza(zzo0.zzaa);
        }
        zzg0.zzt(zzo0.zzx);
        zzg0.zzi(zzo0.zzad);
        if(zznm.zza() && this.zze().zza(zzbh.zzcy)) {
            if(zzg0.zzas() || z) {
                this.zzf().zza(zzg0, z, false);
                return zzg0;
            }
        }
        else if(zzg0.zzas()) {
            this.zzf().zza(zzg0, false, false);
        }
        return zzg0;
    }

    @WorkerThread
    final void zza(zzae zzae0) {
        com.google.android.gms.measurement.internal.zzo zzo0 = this.zzc(((String)Preconditions.checkNotNull(zzae0.zza)));
        if(zzo0 != null) {
            this.zza(zzae0, zzo0);
        }
    }

    @WorkerThread
    final void zza(zzae zzae0, com.google.android.gms.measurement.internal.zzo zzo0) {
        Preconditions.checkNotNull(zzae0);
        Preconditions.checkNotEmpty(zzae0.zza);
        Preconditions.checkNotNull(zzae0.zzc);
        Preconditions.checkNotEmpty(zzae0.zzc.zza);
        this.zzl().zzt();
        this.zzs();
        if(!zznv.zzi(zzo0)) {
            return;
        }
        if(!zzo0.zzh) {
            this.zza(zzo0);
            return;
        }
        this.zzf().zzp();
        try {
            this.zza(zzo0);
            Object object0 = Preconditions.checkNotNull(zzae0.zza);
            zzae zzae1 = this.zzf().zzc(((String)object0), zzae0.zzc.zza);
            if(zzae1 == null) {
                this.zzj().zzu().zza("Conditional user property doesn\'t exist", zzgo.zza(zzae0.zza), this.zzm.zzk().zzc(zzae0.zzc.zza));
            }
            else {
                this.zzj().zzc().zza("Removing conditional user property", zzae0.zza, this.zzm.zzk().zzc(zzae0.zzc.zza));
                this.zzf().zza(((String)object0), zzae0.zzc.zza);
                if(zzae1.zze) {
                    this.zzf().zzh(((String)object0), zzae0.zzc.zza);
                }
                zzbf zzbf0 = zzae0.zzk;
                if(zzbf0 != null) {
                    Bundle bundle0 = zzbf0.zzb == null ? null : zzbf0.zzb.zzb();
                    this.zzc(((zzbf)Preconditions.checkNotNull(this.zzq().zza(((String)object0), ((zzbf)Preconditions.checkNotNull(zzae0.zzk)).zza, bundle0, zzae1.zzb, zzae0.zzk.zzd, true, true))), zzo0);
                }
            }
            this.zzf().zzw();
        }
        finally {
            this.zzf().zzu();
        }
    }

    @WorkerThread
    final void zza(zzbf zzbf0, com.google.android.gms.measurement.internal.zzo zzo0) {
        List list3;
        List list2;
        List list1;
        zzbf zzbf2;
        Preconditions.checkNotNull(zzo0);
        Preconditions.checkNotEmpty(zzo0.zza);
        this.zzl().zzt();
        this.zzs();
        String s = zzo0.zza;
        long v = zzbf0.zzd;
        zzgs zzgs0 = zzgs.zza(zzbf0);
        this.zzl().zzt();
        zzos.zza((this.zzaf == null || (this.zzag == null || !this.zzag.equals(s)) ? null : this.zzaf), zzgs0.zzc, false);
        zzbf zzbf1 = zzgs0.zza();
        this.zzp();
        if(!zzoo.zza(zzbf1, zzo0)) {
            return;
        }
        if(!zzo0.zzh) {
            this.zza(zzo0);
            return;
        }
        List list0 = zzo0.zzs;
        if(list0 == null) {
            zzbf2 = zzbf1;
        }
        else {
            if(list0.contains(zzbf1.zza)) {
                Bundle bundle0 = zzbf1.zzb.zzb();
                bundle0.putLong("ga_safelisted", 1L);
                zzbe zzbe0 = new zzbe(bundle0);
                zzbf2 = new zzbf(zzbf1.zza, zzbe0, zzbf1.zzc, zzbf1.zzd);
                goto label_27;
            }
            this.zzj().zzc().zza("Dropping non-safelisted event. appId, event name, origin", s, zzbf1.zza, zzbf1.zzc);
            return;
        }
    label_27:
        this.zzf().zzp();
        try {
            zzal zzal0 = this.zzf();
            Preconditions.checkNotEmpty(s);
            zzal0.zzt();
            zzal0.zzal();
            int v2 = Long.compare(v, 0L);
            if(v2 < 0) {
                zzal0.zzj().zzu().zza("Invalid time querying timed out conditional properties", zzgo.zza(s), v);
                list1 = Collections.emptyList();
            }
            else {
                list1 = zzal0.zza("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{s, String.valueOf(v)});
            }
            for(Object object0: list1) {
                zzae zzae0 = (zzae)object0;
                if(zzae0 != null) {
                    this.zzj().zzp().zza("User property timed out", zzae0.zza, this.zzm.zzk().zzc(zzae0.zzc.zza), zzae0.zzc.zza());
                    if(zzae0.zzg != null) {
                        this.zzc(new zzbf(zzae0.zzg, v), zzo0);
                    }
                    this.zzf().zza(s, zzae0.zzc.zza);
                }
            }
            zzal zzal1 = this.zzf();
            Preconditions.checkNotEmpty(s);
            zzal1.zzt();
            zzal1.zzal();
            if(v2 < 0) {
                zzal1.zzj().zzu().zza("Invalid time querying expired conditional properties", zzgo.zza(s), v);
                list2 = Collections.emptyList();
            }
            else {
                list2 = zzal1.zza("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{s, String.valueOf(v)});
            }
            ArrayList arrayList0 = new ArrayList(list2.size());
            for(Object object1: list2) {
                zzae zzae1 = (zzae)object1;
                if(zzae1 != null) {
                    this.zzj().zzp().zza("User property expired", zzae1.zza, this.zzm.zzk().zzc(zzae1.zzc.zza), zzae1.zzc.zza());
                    this.zzf().zzh(s, zzae1.zzc.zza);
                    zzbf zzbf3 = zzae1.zzk;
                    if(zzbf3 != null) {
                        arrayList0.add(zzbf3);
                    }
                    this.zzf().zza(s, zzae1.zzc.zza);
                }
            }
            int v3 = arrayList0.size();
            int v4 = 0;
            while(v4 < v3) {
                Object object2 = arrayList0.get(v4);
                ++v4;
                this.zzc(new zzbf(((zzbf)object2), v), zzo0);
            }
            zzal zzal2 = this.zzf();
            String s1 = zzbf2.zza;
            Preconditions.checkNotEmpty(s);
            Preconditions.checkNotEmpty(s1);
            zzal2.zzt();
            zzal2.zzal();
            if(v2 < 0) {
                zzal2.zzj().zzu().zza("Invalid time querying triggered conditional properties", zzgo.zza(s), zzal2.zzi().zza(s1), v);
                list3 = Collections.emptyList();
            }
            else {
                list3 = zzal2.zza("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{s, s1, String.valueOf(v)});
            }
            ArrayList arrayList1 = new ArrayList(list3.size());
            for(Object object3: list3) {
                zzae zzae2 = (zzae)object3;
                if(zzae2 != null) {
                    zzon zzon0 = zzae2.zzc;
                    String s2 = (String)Preconditions.checkNotNull(zzae2.zza);
                    String s3 = zzae2.zzb;
                    Object object4 = Preconditions.checkNotNull(zzon0.zza());
                    zzop zzop0 = new zzop(s2, s3, zzon0.zza, v, object4);
                    if(this.zzf().zza(zzop0)) {
                        this.zzj().zzp().zza("User property triggered", zzae2.zza, this.zzm.zzk().zzc(zzop0.zzc), zzop0.zze);
                    }
                    else {
                        this.zzj().zzg().zza("Too many active user properties, ignoring", zzgo.zza(zzae2.zza), this.zzm.zzk().zzc(zzop0.zzc), zzop0.zze);
                    }
                    zzbf zzbf4 = zzae2.zzi;
                    if(zzbf4 != null) {
                        arrayList1.add(zzbf4);
                    }
                    zzae2.zzc = new zzon(zzop0);
                    zzae2.zze = true;
                    this.zzf().zza(zzae2);
                }
            }
            this.zzc(zzbf2, zzo0);
            int v5 = arrayList1.size();
            int v6 = 0;
            while(v6 < v5) {
                Object object5 = arrayList1.get(v6);
                ++v6;
                this.zzc(new zzbf(((zzbf)object5), v), zzo0);
            }
            this.zzf().zzw();
        }
        finally {
            this.zzf().zzu();
        }
    }

    @WorkerThread
    final void zza(zzbf zzbf0, String s) {
        zzg zzg0 = this.zzf().zze(s);
        if(zzg0 != null && !TextUtils.isEmpty(zzg0.zzaf())) {
            Boolean boolean0 = this.zza(zzg0);
            if(boolean0 != null) {
                if(!boolean0.booleanValue()) {
                    this.zzj().zzg().zza("App version does not match; dropping event. appId", zzgo.zza(s));
                    return;
                }
            }
            else if(!"_ui".equals(zzbf0.zza)) {
                this.zzj().zzu().zza("Could not find package. appId", zzgo.zza(s));
            }
            this.zzb(zzbf0, new com.google.android.gms.measurement.internal.zzo(s, zzg0.zzah(), zzg0.zzaf(), zzg0.zze(), zzg0.zzae(), zzg0.zzq(), zzg0.zzn(), null, zzg0.zzar(), false, zzg0.zzag(), zzg0.zzd(), 0L, 0, zzg0.zzaq(), false, zzg0.zzaa(), zzg0.zzx(), zzg0.zzo(), zzg0.zzan(), null, this.zzb(s).zzf(), "", null, zzg0.zzat(), zzg0.zzw(), this.zzb(s).zza(), this.zzd(s).zzf(), zzg0.zza(), zzg0.zzf(), zzg0.zzam(), zzg0.zzak()));
            return;
        }
        this.zzj().zzc().zza("No app data available; dropping event", s);
    }

    @WorkerThread
    final void zza(zzg zzg0, com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza0) {
        this.zzl().zzt();
        this.zzs();
        zzah zzah0 = zzah.zza("");
        String s = zzg0.zzac();
        this.zzl().zzt();
        this.zzs();
        zzje zzje0 = this.zzb(s);
        int[] arr_v = zzoa.zza;
        switch(arr_v[zzje0.zzc().ordinal()]) {
            case 1: {
                zzah0.zza(com.google.android.gms.measurement.internal.zzje.zza.zza, zzak.zzh);
                break;
            }
            case 2: 
            case 3: {
                zzah0.zza(com.google.android.gms.measurement.internal.zzje.zza.zza, zzje0.zza());
                break;
            }
            default: {
                zzah0.zza(com.google.android.gms.measurement.internal.zzje.zza.zza, zzak.zzi);
            }
        }
        switch(arr_v[zzje0.zzd().ordinal()]) {
            case 1: {
                zzah0.zza(com.google.android.gms.measurement.internal.zzje.zza.zzb, zzak.zzh);
                break;
            }
            case 2: 
            case 3: {
                zzah0.zza(com.google.android.gms.measurement.internal.zzje.zza.zzb, zzje0.zza());
                break;
            }
            default: {
                zzah0.zza(com.google.android.gms.measurement.internal.zzje.zza.zzb, zzak.zzi);
            }
        }
        String s1 = zzg0.zzac();
        this.zzl().zzt();
        this.zzs();
        zzax zzax0 = this.zza(s1, this.zzd(s1), this.zzb(s1), zzah0);
        zzfy$zzk$zza0.zzb(((Boolean)Preconditions.checkNotNull(zzax0.zzd())).booleanValue());
        if(!TextUtils.isEmpty(zzax0.zze())) {
            zzfy$zzk$zza0.zzh(zzax0.zze());
        }
        this.zzl().zzt();
        this.zzs();
        for(Object object0: zzfy$zzk$zza0.zzab()) {
            zzo zzfy$zzo0 = (zzo)object0;
        }
        int v = this.zza(zzg0.zzac(), zzah0);
        zzfy$zzk$zza0.zza(((zzo)(((zzjt)zzo.zze().zza("_npa").zzb(this.zzb().currentTimeMillis()).zza(((long)v)).zzai()))));
        this.zzj().zzp().zza("Setting user property", "non_personalized_ads(_npa)", v);
        zzfy$zzk$zza0.zzf(zzah0.toString());
        this.zzb.zzm(zzg0.zzac());
        List list0 = zzfy$zzk$zza0.zzaa();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
        }
    }

    @WorkerThread
    final void zza(zzon zzon0, com.google.android.gms.measurement.internal.zzo zzo0) {
        long v3;
        this.zzl().zzt();
        this.zzs();
        if(!zznv.zzi(zzo0)) {
            return;
        }
        if(!zzo0.zzh) {
            this.zza(zzo0);
            return;
        }
        int v = this.zzq().zzb(zzon0.zza);
        if(v != 0) {
            this.zzq();
            this.zze();
            String s = zzos.zza(zzon0.zza, 24, true);
            this.zzq();
            zzos.zza(this.zzah, zzo0.zza, v, "_ev", s, (zzon0.zza == null ? 0 : zzon0.zza.length()));
            return;
        }
        zzos zzos0 = this.zzq();
        Object object0 = zzon0.zza();
        int v1 = zzos0.zza(zzon0.zza, object0);
        if(v1 != 0) {
            this.zzq();
            this.zze();
            String s1 = zzos.zza(zzon0.zza, 24, true);
            Object object1 = zzon0.zza();
            this.zzq();
            zzos.zza(this.zzah, zzo0.zza, v1, "_ev", s1, (object1 == null || !(object1 instanceof String) && !(object1 instanceof CharSequence) ? 0 : String.valueOf(object1).length()));
            return;
        }
        zzos zzos1 = this.zzq();
        Object object2 = zzon0.zza();
        Object object3 = zzos1.zzc(zzon0.zza, object2);
        if(object3 == null) {
            return;
        }
        if("_sid".equals(zzon0.zza)) {
            long v2 = zzon0.zzb;
            String s2 = zzon0.zze;
            String s3 = (String)Preconditions.checkNotNull(zzo0.zza);
            zzop zzop0 = this.zzf().zze(s3, "_sno");
            if(zzop0 == null) {
            label_41:
                if(zzop0 != null) {
                    this.zzj().zzu().zza("Retrieved last session number from database does not contain a valid (long) value", zzop0.zze);
                }
                zzbb zzbb0 = this.zzf().zzd(s3, "_s");
                if(zzbb0 == null) {
                    v3 = 0L;
                }
                else {
                    v3 = zzbb0.zzc;
                    this.zzj().zzp().zza("Backfill the session number. Last used session number", v3);
                }
            }
            else {
                Object object4 = zzop0.zze;
                if(object4 instanceof Long) {
                    v3 = (long)(((Long)object4));
                    goto label_49;
                }
                goto label_41;
            }
        label_49:
            this.zza(new zzon("_sno", v2, ((long)(v3 + 1L)), s2), zzo0);
        }
        zzop zzop1 = new zzop(((String)Preconditions.checkNotNull(zzo0.zza)), ((String)Preconditions.checkNotNull(zzon0.zze)), zzon0.zza, zzon0.zzb, object3);
        this.zzj().zzp().zza("Setting user property", this.zzm.zzk().zzc(zzop1.zzc), object3);
        this.zzf().zzp();
        try {
            if("_id".equals(zzop1.zzc)) {
                zzop zzop2 = this.zzf().zze(zzo0.zza, "_id");
                if(zzop2 != null && !zzop1.zze.equals(zzop2.zze)) {
                    this.zzf().zzh(zzo0.zza, "_lair");
                }
            }
            this.zza(zzo0);
            boolean z = this.zzf().zza(zzop1);
            if("_sid".equals(zzon0.zza)) {
                long v5 = this.zzp().zza(zzo0.zzv);
                zzg zzg0 = this.zzf().zze(zzo0.zza);
                if(zzg0 != null) {
                    zzg0.zzs(v5);
                    if(zzg0.zzas()) {
                        this.zzf().zza(zzg0, false, false);
                    }
                }
            }
            this.zzf().zzw();
            if(!z) {
                this.zzj().zzg().zza("Too many unique user properties are set. Ignoring user property", this.zzm.zzk().zzc(zzop1.zzc), zzop1.zze);
                this.zzq();
                zzos.zza(this.zzah, zzo0.zza, 9, null, null, 0);
            }
        }
        finally {
            this.zzf().zzu();
        }
    }

    @WorkerThread
    final void zza(Runnable runnable0) {
        this.zzl().zzt();
        if(this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable0);
    }

    @VisibleForTesting
    @WorkerThread
    final void zza(@NonNull String s, int v, Throwable throwable0, byte[] arr_b, zzoj zzoj0) {
        this.zzl().zzt();
        this.zzs();
        try {
            if(arr_b == null) {
                arr_b = new byte[0];
            }
            if(v != 200 && v != 204 || throwable0 != null) {
                String s1 = new String(arr_b, StandardCharsets.UTF_8);
                String s2 = s1.substring(0, Math.min(0x20, s1.length()));
                zzgq zzgq0 = this.zzj().zzv();
                Integer integer0 = v;
                if(throwable0 == null) {
                    throwable0 = s2;
                }
                zzgq0.zza("Network upload failed. Will retry later. appId, status, error", s, integer0, throwable0);
                if(zzoj0 != null) {
                    this.zzf().zza(zzoj0.zza());
                }
                this.zzac();
            }
            else {
                if(zzoj0 != null) {
                    zzal zzal0 = this.zzf();
                    Long long0 = zzoj0.zza();
                    zzal0.zzt();
                    zzal0.zzal();
                    Preconditions.checkNotNull(long0);
                    if(!zzpu.zza() || zzal0.zze().zza(zzbh.zzcb)) {
                        SQLiteDatabase sQLiteDatabase0 = zzal0.e_();
                        try {
                            if(sQLiteDatabase0.delete("upload_queue", "rowid=?", new String[]{String.valueOf(long0)}) != 1) {
                                zzal0.zzj().zzu().zza("Deleted fewer rows from upload_queue than expected");
                            }
                        }
                        catch(SQLiteException sQLiteException0) {
                            zzal0.zzj().zzg().zza("Failed to delete a MeasurementBatch in a upload_queue table", sQLiteException0);
                            throw sQLiteException0;
                        }
                    }
                }
                this.zzj().zzp().zza("Successfully uploaded batch from upload queue. appId, status", s, v);
                if(!this.zze().zza(zzbh.zzcb) || !this.zzh().zzu() || !this.zzf().zzs(s)) {
                    this.zzac();
                }
                else {
                    this.zze(s);
                }
            }
        }
        finally {
            this.zzv = false;
            this.zzaa();
        }
    }

    // 检测为 Lambda 实现
    final void zza(String s, int v, Throwable throwable0, byte[] arr_b, Map map0) [...]

    final void zza(String s, com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza0) {
        Set set0 = this.zzi().zzg(s);
        if(set0 != null) {
            zzfy$zzk$zza0.zzd(set0);
        }
        if(this.zzi().zzp(s)) {
            zzfy$zzk$zza0.zzj();
        }
        if(this.zzi().zzs(s)) {
            String s1 = zzfy$zzk$zza0.zzy();
            if(!TextUtils.isEmpty(s1)) {
                int v = s1.indexOf(".");
                if(v != -1) {
                    zzfy$zzk$zza0.zzo(s1.substring(0, v));
                }
            }
        }
        if(this.zzi().zzt(s)) {
            int v1 = zzoo.zza(zzfy$zzk$zza0, "_id");
            if(v1 != -1) {
                zzfy$zzk$zza0.zzc(v1);
            }
        }
        if(this.zzi().zzr(s)) {
            zzfy$zzk$zza0.zzk();
        }
        if(this.zzi().zzo(s)) {
            zzfy$zzk$zza0.zzh();
            if(!zznm.zza() || !this.zze().zza(zzbh.zzcy) || this.zzb(s).zzh()) {
                zzb zznv$zzb0 = (zzb)this.zzae.get(s);
                if(zznv$zzb0 == null || zznv$zzb0.zzb + this.zze().zzc(s, zzbh.zzaw) < this.zzb().elapsedRealtime()) {
                    zznv$zzb0 = new zzb(this, null);
                    this.zzae.put(s, zznv$zzb0);
                }
                zzfy$zzk$zza0.zzk(zznv$zzb0.zza);
            }
        }
        if(this.zzi().zzq(s)) {
            zzfy$zzk$zza0.zzr();
        }
    }

    @WorkerThread
    public final void zza(String s, zzlk zzlk0) {
        this.zzl().zzt();
        if(this.zzag == null || this.zzag.equals(s) || zzlk0 != null) {
            this.zzag = s;
            this.zzaf = zzlk0;
        }
    }

    @WorkerThread
    final void zza(String s, com.google.android.gms.measurement.internal.zzo zzo0) {
        this.zzl().zzt();
        this.zzs();
        if(!zznv.zzi(zzo0)) {
            return;
        }
        if(!zzo0.zzh) {
            this.zza(zzo0);
            return;
        }
        Boolean boolean0 = zznv.zzh(zzo0);
        if("_npa".equals(s) && boolean0 != null) {
            this.zzj().zzc().zza("Falling back to manifest metadata value for ad personalization");
            this.zza(new zzon("_npa", this.zzb().currentTimeMillis(), ((long)(boolean0.booleanValue() ? 1L : 0L)), "auto"), zzo0);
            return;
        }
        this.zzj().zzc().zza("Removing user property", this.zzm.zzk().zzc(s));
        this.zzf().zzp();
        try {
            this.zza(zzo0);
            if("_id".equals(s)) {
                this.zzf().zzh(((String)Preconditions.checkNotNull(zzo0.zza)), "_lair");
            }
            this.zzf().zzh(((String)Preconditions.checkNotNull(zzo0.zza)), s);
            this.zzf().zzw();
            this.zzj().zzc().zza("User property removed", this.zzm.zzk().zzc(s));
        }
        finally {
            this.zzf().zzu();
        }
    }

    final void zza(boolean z) {
        this.zzac();
    }

    @VisibleForTesting
    @WorkerThread
    final void zza(boolean z, int v, Throwable throwable0, byte[] arr_b, String s, List list0) {
        zzal zzal0;
        this.zzl().zzt();
        this.zzs();
        try {
            byte[] arr_b1 = arr_b == null ? new byte[0] : arr_b;
            List list1 = (List)Preconditions.checkNotNull(this.zzz);
            this.zzz = null;
            if(!z || (v == 200 || v == 204) && throwable0 == null) {
                this.zzj().zzp().zza("Network upload successful with code", v);
                try {
                    if(z) {
                        this.zzj.zzd.zza(this.zzb().currentTimeMillis());
                    }
                    this.zzj.zze.zza(0L);
                    this.zzac();
                    if(z) {
                        this.zzj().zzp().zza("Successful upload. Got network response. code, size", v, ((int)arr_b1.length));
                    }
                    else {
                        this.zzj().zzp().zza("Purged empty bundles");
                    }
                    this.zzf().zzp();
                }
                catch(SQLiteException sQLiteException0) {
                    this.zzj().zzg().zza("Database error while trying to delete uploaded bundles", sQLiteException0);
                    this.zzp = this.zzb().elapsedRealtime();
                    this.zzj().zzp().zza("Disable upload, time", this.zzp);
                    return;
                }
                try {
                    if(this.zze().zza(zzbh.zzcb)) {
                        for(Object object0: list0) {
                            zzj zzfy$zzj0 = (zzj)((Pair)object0).first;
                            zznw zznw0 = (zznw)((Pair)object0).second;
                            this.zzf().zza(s, zzfy$zzj0, zznw0.zzb(), zznw0.zzc(), zznw0.zza());
                        }
                    }
                    for(Object object1: list1) {
                        Long long0 = (Long)object1;
                        try {
                            zzal0 = this.zzf();
                            zzal0.zzt();
                            zzal0.zzal();
                            SQLiteDatabase sQLiteDatabase0 = zzal0.e_();
                            String[] arr_s = {String.valueOf(((long)long0))};
                        }
                        catch(SQLiteException sQLiteException1) {
                            goto label_51;
                        }
                        try {
                            if(sQLiteDatabase0.delete("queue", "rowid=?", arr_s) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                            continue;
                        }
                        catch(SQLiteException sQLiteException2) {
                            try {
                                zzal0.zzj().zzg().zza("Failed to delete a bundle in a queue table", sQLiteException2);
                                throw sQLiteException2;
                            }
                            catch(SQLiteException sQLiteException1) {
                            }
                        }
                    label_51:
                        if(this.zzaa == null || !this.zzaa.contains(long0)) {
                            throw sQLiteException1;
                        }
                        if(false) {
                            break;
                        }
                    }
                    this.zzf().zzw();
                    goto label_60;
                }
                catch(Throwable throwable1) {
                }
                try {
                    this.zzf().zzu();
                    throw throwable1;
                label_60:
                    this.zzf().zzu();
                    this.zzaa = null;
                    if(this.zzh().zzu() && this.zzad()) {
                        this.zzw();
                    }
                    else if(this.zze().zza(zzbh.zzcb) && this.zzh().zzu() && this.zzf().zzs(s)) {
                        this.zze(s);
                    }
                    else {
                        this.zzab = -1L;
                        this.zzac();
                    }
                    this.zzp = 0L;
                    return;
                }
                catch(SQLiteException sQLiteException0) {
                }
                this.zzj().zzg().zza("Database error while trying to delete uploaded bundles", sQLiteException0);
                this.zzp = this.zzb().elapsedRealtime();
                this.zzj().zzp().zza("Disable upload, time", this.zzp);
            }
            else {
                if(!zzpb.zza() || !this.zze().zza(zzbh.zzcf)) {
                    this.zzj().zzp().zza("Network upload failed. Will retry later. code, error", v, throwable0);
                }
                else {
                    String s1 = new String(arr_b1, StandardCharsets.UTF_8);
                    this.zzj().zzv().zza("Network upload failed. Will retry later. code, error", v, throwable0, s1.substring(0, Math.min(0x20, s1.length())));
                }
                this.zzj.zze.zza(this.zzb().currentTimeMillis());
                if(v == 429 || v == 503) {
                    this.zzj.zzc.zza(this.zzb().currentTimeMillis());
                }
                this.zzf().zza(list1);
                this.zzac();
            }
        }
        finally {
            this.zzv = false;
            this.zzaa();
        }
    }

    @WorkerThread
    private final void zzaa() {
        this.zzl().zzt();
        if(!this.zzu && !this.zzv && !this.zzw) {
            this.zzj().zzp().zza("Stopping uploading service(s)");
            List list0 = this.zzq;
            if(list0 == null) {
                return;
            }
            for(Object object0: list0) {
                ((Runnable)object0).run();
            }
            ((List)Preconditions.checkNotNull(this.zzq)).clear();
            return;
        }
        this.zzj().zzp().zza("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
    }

    @WorkerThread
    private final void zzab() {
        this.zzl().zzt();
        for(Object object0: this.zzr) {
            String s = (String)object0;
            if(zzpn.zza() && this.zze().zze(s, zzbh.zzch)) {
                this.zzj().zzc().zza("Notifying app that trigger URIs are available. App ID", s);
                Intent intent0 = new Intent();
                intent0.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intent0.setPackage(s);
                this.zzm.zza().sendBroadcast(intent0);
            }
        }
        this.zzr.clear();
    }

    @WorkerThread
    private final void zzac() {
        long v10;
        long v3;
        this.zzl().zzt();
        this.zzs();
        if(this.zzp > 0L) {
            long v = Math.abs(this.zzb().elapsedRealtime() - this.zzp);
            if(3600000L - v > 0L) {
                this.zzj().zzp().zza("Upload has been suspended. Will update scheduling later in approximately ms", ((long)(3600000L - v)));
                this.zzy().zzb();
                this.zzz().zzu();
                return;
            }
            this.zzp = 0L;
        }
        if(this.zzm.zzaf() && this.zzad()) {
            long v1 = this.zzb().currentTimeMillis();
            this.zze();
            long v2 = Math.max(0L, ((long)(((Long)zzbh.zzab.zza(null)))));
            boolean z = this.zzf().zzz() || this.zzf().zzy();
            if(z) {
                String s = this.zze().zzo();
                if(TextUtils.isEmpty(s) || ".none.".equals(s)) {
                    this.zze();
                    v3 = Math.max(0L, ((long)(((Long)zzbh.zzv.zza(null)))));
                }
                else {
                    this.zze();
                    v3 = Math.max(0L, ((long)(((Long)zzbh.zzw.zza(null)))));
                }
            }
            else {
                this.zze();
                v3 = Math.max(0L, ((long)(((Long)zzbh.zzu.zza(null)))));
            }
            long v4 = this.zzj.zzd.zza();
            long v5 = this.zzj.zze.zza();
            long v6 = Math.max(this.zzf().c_(), this.zzf().d_());
            if(v6 == 0L) {
                v10 = 0L;
            }
            else {
                long v7 = v1 - Math.abs(v6 - v1);
                long v8 = v1 - Math.abs(v5 - v1);
                long v9 = Math.max(v1 - Math.abs(v4 - v1), v8);
                v10 = !z || v9 <= 0L ? v7 + v2 : Math.min(v7, v9) + v3;
                if(!this.zzp().zza(v9, v3)) {
                    v10 = v9 + v3;
                }
                if(v8 != 0L && v8 >= v7) {
                    int v11 = 0;
                    while(true) {
                        this.zze();
                        if(v11 >= Math.min(20, Math.max(0, ((int)(((Integer)zzbh.zzad.zza(null))))))) {
                            break;
                        }
                        this.zze();
                        v10 += Math.max(0L, ((long)(((Long)zzbh.zzac.zza(null))))) * (1L << v11);
                        if(v10 > v8) {
                            goto label_48;
                        }
                        ++v11;
                    }
                    v10 = 0L;
                }
            }
        label_48:
            if(v10 == 0L) {
                this.zzj().zzp().zza("Next upload time is 0");
                this.zzy().zzb();
                this.zzz().zzu();
                return;
            }
            if(!this.zzh().zzu()) {
                this.zzj().zzp().zza("No network");
                this.zzy().zza();
                this.zzz().zzu();
                return;
            }
            long v12 = this.zzj.zzc.zza();
            this.zze();
            long v13 = Math.max(0L, ((long)(((Long)zzbh.zzs.zza(null)))));
            if(!this.zzp().zza(v12, v13)) {
                v10 = Math.max(v10, v12 + v13);
            }
            this.zzy().zzb();
            long v14 = v10 - this.zzb().currentTimeMillis();
            if(v14 <= 0L) {
                this.zze();
                v14 = Math.max(0L, ((long)(((Long)zzbh.zzx.zza(null)))));
                this.zzj.zzd.zza(this.zzb().currentTimeMillis());
            }
            this.zzj().zzp().zza("Upload scheduled in approximately ms", v14);
            this.zzz().zza(v14);
            return;
        }
        this.zzj().zzp().zza("Nothing to upload or uploading impossible");
        this.zzy().zzb();
        this.zzz().zzu();
    }

    private final boolean zzad() {
        this.zzl().zzt();
        this.zzs();
        return this.zzf().zzx() || !TextUtils.isEmpty(this.zzf().f_());
    }

    @VisibleForTesting
    @WorkerThread
    private final boolean zzae() {
        this.zzl().zzt();
        if(this.zzx != null && this.zzx.isValid()) {
            this.zzj().zzp().zza("Storage concurrent access okay");
            return true;
        }
        File file0 = new File(zzcf.zza().zza(this.zzm.zza().getFilesDir(), "google_app_measurement.db"));
        try {
            FileChannel fileChannel0 = new RandomAccessFile(file0, "rw").getChannel();
            this.zzy = fileChannel0;
            FileLock fileLock0 = fileChannel0.tryLock();
            this.zzx = fileLock0;
            if(fileLock0 != null) {
                this.zzj().zzp().zza("Storage concurrent access okay");
                return true;
            }
            this.zzj().zzg().zza("Storage concurrent data access panic");
            return false;
        }
        catch(FileNotFoundException fileNotFoundException0) {
        }
        catch(IOException iOException0) {
            this.zzj().zzg().zza("Failed to access storage lock file", iOException0);
            return false;
        }
        catch(OverlappingFileLockException overlappingFileLockException0) {
            this.zzj().zzu().zza("Storage lock already acquired", overlappingFileLockException0);
            return false;
        }
        this.zzj().zzg().zza("Failed to acquire storage lock", fileNotFoundException0);
        return false;
    }

    @WorkerThread
    private final void zzb(zzbf zzbf0, com.google.android.gms.measurement.internal.zzo zzo0) {
        Preconditions.checkNotEmpty(zzo0.zza);
        zzgs zzgs0 = zzgs.zza(zzbf0);
        this.zzq().zza(zzgs0.zzc, this.zzf().zzd(zzo0.zza));
        this.zzq().zza(zzgs0, this.zze().zzb(zzo0.zza));
        zzbf zzbf1 = zzgs0.zza();
        if("_cmp".equals(zzbf1.zza) && "referrer API v2".equals(zzbf1.zzb.zzd("_cis"))) {
            String s = zzbf1.zzb.zzd("gclid");
            if(!TextUtils.isEmpty(s)) {
                this.zza(new zzon("_lgclid", zzbf1.zzd, s, "auto"), zzo0);
            }
        }
        this.zza(zzbf1, zzo0);
    }

    @WorkerThread
    private final void zzb(zzg zzg0) {
        ArrayMap arrayMap0 = null;
        this.zzl().zzt();
        if(TextUtils.isEmpty(zzg0.zzah()) && TextUtils.isEmpty(zzg0.zzaa())) {
            this.zzb(((String)Preconditions.checkNotNull(zzg0.zzac())), 204, null, null, null);
            return;
        }
        if(zzpb.zza() && this.zze().zza(zzbh.zzcf)) {
            String s = (String)Preconditions.checkNotNull(zzg0.zzac());
            this.zzj().zzp().zza("Fetching remote configuration", s);
            zzd zzfr$zzd0 = this.zzi().zzc(s);
            String s1 = this.zzi().zze(s);
            if(zzfr$zzd0 != null) {
                if(!TextUtils.isEmpty(s1)) {
                    arrayMap0 = new ArrayMap();
                    arrayMap0.put("If-Modified-Since", s1);
                }
                String s2 = this.zzi().zzd(s);
                if(!TextUtils.isEmpty(s2)) {
                    if(arrayMap0 == null) {
                        arrayMap0 = new ArrayMap();
                    }
                    arrayMap0.put("If-None-Match", s2);
                }
            }
            this.zzu = true;
            zzgr zzgr0 = this.zzh();
            com.google.android.gms.measurement.internal.zzny zzny0 = (String s, int v, Throwable throwable0, byte[] arr_b, Map map0) -> this.zzb(s, v, throwable0, arr_b, map0);
            zzgr0.zzt();
            zzgr0.zzal();
            Preconditions.checkNotNull(zzg0);
            Preconditions.checkNotNull(zzny0);
            String s3 = zzgr0.zzo().zza(zzg0);
            try {
                URL uRL0 = new URI(s3).toURL();
                zzgr0.zzl().zza(new zzgw(zzgr0, zzg0.zzac(), uRL0, null, arrayMap0, zzny0));
            }
            catch(IllegalArgumentException | MalformedURLException | URISyntaxException unused_ex) {
                zzgr0.zzj().zzg().zza("Failed to parse config URL. Not fetching. appId", zzgo.zza(zzg0.zzac()), s3);
            }
            return;
        }
        String s4 = this.zzk.zza(zzg0);
        try {
            Object object0 = Preconditions.checkNotNull(zzg0.zzac());
            URL uRL1 = new URL(s4);
            this.zzj().zzp().zza("Fetching remote configuration", ((String)object0));
            zzd zzfr$zzd1 = this.zzi().zzc(((String)object0));
            String s5 = this.zzi().zze(((String)object0));
            if(zzfr$zzd1 != null) {
                if(!TextUtils.isEmpty(s5)) {
                    arrayMap0 = new ArrayMap();
                    arrayMap0.put("If-Modified-Since", s5);
                }
                String s6 = this.zzi().zzd(((String)object0));
                if(!TextUtils.isEmpty(s6)) {
                    if(arrayMap0 == null) {
                        arrayMap0 = new ArrayMap();
                    }
                    arrayMap0.put("If-None-Match", s6);
                }
            }
            this.zzu = true;
            zzgr zzgr1 = this.zzh();
            zzod zzod0 = new zzod(this);
            zzgr1.zzt();
            zzgr1.zzal();
            Preconditions.checkNotNull(uRL1);
            Preconditions.checkNotNull(zzod0);
            zzgr1.zzl().zza(new zzgw(zzgr1, ((String)object0), uRL1, null, arrayMap0, zzod0));
        }
        catch(MalformedURLException unused_ex) {
            this.zzj().zzg().zza("Failed to parse config URL. Not fetching. appId", zzgo.zza(zzg0.zzac()), s4);
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzjc
    public final Clock zzb() {
        return ((zzhy)Preconditions.checkNotNull(this.zzm)).zzb();
    }

    @WorkerThread
    final zzje zzb(String s) {
        this.zzl().zzt();
        this.zzs();
        zzje zzje0 = (zzje)this.zzac.get(s);
        if(zzje0 == null) {
            zzje0 = this.zzf().zzi(s);
            if(zzje0 == null) {
                zzje0 = zzje.zza;
            }
            this.zza(s, zzje0);
        }
        return zzje0;
    }

    final String zzb(com.google.android.gms.measurement.internal.zzo zzo0) {
        Future future0 = this.zzl().zza(new zzog(this, zzo0));
        try {
            return (String)future0.get(30000L, TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException | InterruptedException | ExecutionException timeoutException0) {
            this.zzj().zzg().zza("Failed to get app instance id. appId", zzgo.zza(zzo0.zza), timeoutException0);
            return null;
        }
    }

    @WorkerThread
    final void zzb(zzae zzae0) {
        com.google.android.gms.measurement.internal.zzo zzo0 = this.zzc(((String)Preconditions.checkNotNull(zzae0.zza)));
        if(zzo0 != null) {
            this.zzb(zzae0, zzo0);
        }
    }

    @WorkerThread
    final void zzb(zzae zzae0, com.google.android.gms.measurement.internal.zzo zzo0) {
        Preconditions.checkNotNull(zzae0);
        Preconditions.checkNotEmpty(zzae0.zza);
        Preconditions.checkNotNull(zzae0.zzb);
        Preconditions.checkNotNull(zzae0.zzc);
        Preconditions.checkNotEmpty(zzae0.zzc.zza);
        this.zzl().zzt();
        this.zzs();
        if(!zznv.zzi(zzo0)) {
            return;
        }
        if(!zzo0.zzh) {
            this.zza(zzo0);
            return;
        }
        zzae zzae1 = new zzae(zzae0);
        boolean z = false;
        zzae1.zze = false;
        this.zzf().zzp();
        try {
            zzae zzae2 = this.zzf().zzc(((String)Preconditions.checkNotNull(zzae1.zza)), zzae1.zzc.zza);
            if(zzae2 != null && !zzae2.zzb.equals(zzae1.zzb)) {
                this.zzj().zzu().zza("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzm.zzk().zzc(zzae1.zzc.zza), zzae1.zzb, zzae2.zzb);
            }
            if(zzae2 != null && zzae2.zze) {
                zzae1.zzb = zzae2.zzb;
                zzae1.zzd = zzae2.zzd;
                zzae1.zzh = zzae2.zzh;
                zzae1.zzf = zzae2.zzf;
                zzae1.zzi = zzae2.zzi;
                zzae1.zze = true;
                zzae1.zzc = new zzon(zzae1.zzc.zza, zzae2.zzc.zzb, zzae1.zzc.zza(), zzae2.zzc.zze);
            }
            else if(TextUtils.isEmpty(zzae1.zzf)) {
                zzae1.zzc = new zzon(zzae1.zzc.zza, zzae1.zzd, zzae1.zzc.zza(), zzae1.zzc.zze);
                z = true;
                zzae1.zze = true;
            }
            if(zzae1.zze) {
                zzon zzon0 = zzae1.zzc;
                Object object0 = Preconditions.checkNotNull(zzae1.zza);
                String s = zzae1.zzb;
                Object object1 = Preconditions.checkNotNull(zzon0.zza());
                zzop zzop0 = new zzop(((String)object0), s, zzon0.zza, zzon0.zzb, object1);
                if(this.zzf().zza(zzop0)) {
                    this.zzj().zzc().zza("User property updated immediately", zzae1.zza, this.zzm.zzk().zzc(zzop0.zzc), zzop0.zze);
                }
                else {
                    this.zzj().zzg().zza("(2)Too many active user properties, ignoring", zzgo.zza(zzae1.zza), this.zzm.zzk().zzc(zzop0.zzc), zzop0.zze);
                }
                if(z && zzae1.zzi != null) {
                    this.zzc(new zzbf(zzae1.zzi, zzae1.zzd), zzo0);
                }
            }
            if(this.zzf().zza(zzae1)) {
                this.zzj().zzc().zza("Conditional property added", zzae1.zza, this.zzm.zzk().zzc(zzae1.zzc.zza), zzae1.zzc.zza());
            }
            else {
                this.zzj().zzg().zza("Too many conditional properties, ignoring", zzgo.zza(zzae1.zza), this.zzm.zzk().zzc(zzae1.zzc.zza), zzae1.zzc.zza());
            }
            this.zzf().zzw();
        }
        finally {
            this.zzf().zzu();
        }
    }

    @WorkerThread
    final void zzb(zzg zzg0, com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza0) {
        this.zzl().zzt();
        this.zzs();
        com.google.android.gms.internal.measurement.zzfy.zza.zza zzfy$zza$zza0 = com.google.android.gms.internal.measurement.zzfy.zza.zzc();
        byte[] arr_b = zzg0.zzav();
        if(arr_b != null) {
            try {
                zzfy$zza$zza0 = (com.google.android.gms.internal.measurement.zzfy.zza.zza)zzoo.zza(zzfy$zza$zza0, arr_b);
            }
            catch(zzkb unused_ex) {
                this.zzj().zzu().zza("Failed to parse locally stored ad campaign info. appId", zzgo.zza(zzg0.zzac()));
            }
        }
        for(Object object0: zzfy$zzk$zza0.zzaa()) {
            zzf zzfy$zzf0 = (zzf)object0;
            if(zzfy$zzf0.zzg().equals("_cmp")) {
                String s = (String)zzoo.zza(zzfy$zzf0, "gclid", "");
                String s1 = (String)zzoo.zza(zzfy$zzf0, "gbraid", "");
                String s2 = (String)zzoo.zza(zzfy$zzf0, "gad_source", "");
                if(!s.isEmpty() || !s1.isEmpty()) {
                    long v = (long)(((Long)zzoo.zza(zzfy$zzf0, "click_timestamp", 0L)));
                    if(v <= 0L) {
                        v = zzfy$zzf0.zzd();
                    }
                    if("referrer API v2".equals(zzoo.zzb(zzfy$zzf0, "_cis"))) {
                        if(v <= zzfy$zza$zza0.zzb()) {
                            continue;
                        }
                        if(s.isEmpty()) {
                            zzfy$zza$zza0.zzh();
                        }
                        else {
                            zzfy$zza$zza0.zzf(s);
                        }
                        if(s1.isEmpty()) {
                            zzfy$zza$zza0.zzg();
                        }
                        else {
                            zzfy$zza$zza0.zze(s1);
                        }
                        if(s2.isEmpty()) {
                            zzfy$zza$zza0.zzf();
                        }
                        else {
                            zzfy$zza$zza0.zzd(s2);
                        }
                        zzfy$zza$zza0.zzb(v);
                    }
                    else if(v > zzfy$zza$zza0.zza()) {
                        if(s.isEmpty()) {
                            zzfy$zza$zza0.zze();
                        }
                        else {
                            zzfy$zza$zza0.zzc(s);
                        }
                        if(s1.isEmpty()) {
                            zzfy$zza$zza0.zzd();
                        }
                        else {
                            zzfy$zza$zza0.zzb(s1);
                        }
                        if(s2.isEmpty()) {
                            zzfy$zza$zza0.zzc();
                        }
                        else {
                            zzfy$zza$zza0.zza(s2);
                        }
                        zzfy$zza$zza0.zza(v);
                    }
                }
            }
        }
        if(!((com.google.android.gms.internal.measurement.zzfy.zza)(((zzjt)zzfy$zza$zza0.zzai()))).equals(com.google.android.gms.internal.measurement.zzfy.zza.zze())) {
            zzfy$zzk$zza0.zza(((com.google.android.gms.internal.measurement.zzfy.zza)(((zzjt)zzfy$zza$zza0.zzai()))));
        }
        zzg0.zza(((com.google.android.gms.internal.measurement.zzfy.zza)(((zzjt)zzfy$zza$zza0.zzai()))).zzca());
        if(zzg0.zzas()) {
            this.zzf().zza(zzg0, false, false);
        }
    }

    @VisibleForTesting
    @WorkerThread
    final void zzb(String s, int v, Throwable throwable0, byte[] arr_b, Map map0) {
        String s2;
        String s1;
        zzg zzg0;
        this.zzl().zzt();
        this.zzs();
        Preconditions.checkNotEmpty(s);
        try {
            if(arr_b == null) {
                arr_b = new byte[0];
            }
            this.zzj().zzp().zza("onConfigFetched. Response size", ((int)arr_b.length));
            this.zzf().zzp();
        }
        catch(Throwable throwable1) {
            this.zzu = false;
            this.zzaa();
            throw throwable1;
        }
        try {
            zzg0 = this.zzf().zze(s);
            if(zzg0 == null) {
                goto label_52;
            }
            else if((v == 200 || (v == 204 || v == 304)) && throwable0 == null || v == 404) {
                if(!zzpb.zza() || !this.zze().zza(zzbh.zzcf)) {
                    List list0 = map0 == null ? null : ((List)map0.get("Last-Modified"));
                    s1 = list0 == null || list0.isEmpty() ? null : ((String)list0.get(0));
                    List list1 = map0 == null ? null : ((List)map0.get("ETag"));
                    s2 = list1 == null || list1.isEmpty() ? null : ((String)list1.get(0));
                }
                else {
                    s1 = zznv.zza(map0, "Last-Modified");
                    s2 = zznv.zza(map0, "ETag");
                }
                if(v == 304 || v == 404) {
                    goto label_24;
                }
                else if(!this.zzi().zza(s, arr_b, s1, s2)) {
                    goto label_20;
                }
                goto label_25;
            }
            else {
                goto label_43;
            }
            goto label_53;
        }
        catch(Throwable throwable2) {
            goto label_56;
        }
        try {
        label_20:
            this.zzf().zzu();
        }
        catch(Throwable throwable1) {
            this.zzu = false;
            this.zzaa();
            throw throwable1;
        }
        this.zzu = false;
        this.zzaa();
        return;
        try {
        label_24:
            if(this.zzi().zzc(s) == null && !this.zzi().zza(s, null, null, null)) {
                goto label_39;
            }
        label_25:
            zzg0.zzd(this.zzb().currentTimeMillis());
            this.zzf().zza(zzg0, false, false);
            if(v == 404) {
                this.zzj().zzv().zza("Config not found. Using empty config. appId", s);
            }
            else {
                this.zzj().zzp().zza("Successfully fetched config. Got network response. code, size", v, ((int)arr_b.length));
            }
            if(this.zzh().zzu() && this.zzad()) {
                this.zzw();
            }
            else if(this.zze().zza(zzbh.zzcb) && this.zzh().zzu() && this.zzf().zzs(zzg0.zzac())) {
                this.zze(zzg0.zzac());
            }
            else {
                this.zzac();
            }
            goto label_53;
        }
        catch(Throwable throwable2) {
            goto label_56;
        }
        try {
        label_39:
            this.zzf().zzu();
        }
        catch(Throwable throwable1) {
            this.zzu = false;
            this.zzaa();
            throw throwable1;
        }
        this.zzu = false;
        this.zzaa();
        return;
        try {
        label_43:
            zzg0.zzm(this.zzb().currentTimeMillis());
            this.zzf().zza(zzg0, false, false);
            this.zzj().zzp().zza("Fetching config failed. code, error", v, throwable0);
            this.zzi().zzi(s);
            this.zzj.zze.zza(this.zzb().currentTimeMillis());
            if(v == 429 || v == 503) {
                this.zzj.zzc.zza(this.zzb().currentTimeMillis());
            }
            this.zzac();
            goto label_53;
        label_52:
            this.zzj().zzu().zza("App does not exist in onConfigFetched. appId", zzgo.zza(s));
        label_53:
            this.zzf().zzw();
            goto label_58;
        }
        catch(Throwable throwable2) {
        }
        try {
        label_56:
            this.zzf().zzu();
            throw throwable2;
        label_58:
            this.zzf().zzu();
        }
        catch(Throwable throwable1) {
            this.zzu = false;
            this.zzaa();
            throw throwable1;
        }
        this.zzu = false;
        this.zzaa();
    }

    @WorkerThread
    private final com.google.android.gms.measurement.internal.zzo zzc(String s) {
        zzg zzg0 = this.zzf().zze(s);
        if(zzg0 != null && !TextUtils.isEmpty(zzg0.zzaf())) {
            Boolean boolean0 = this.zza(zzg0);
            if(boolean0 != null && !boolean0.booleanValue()) {
                this.zzj().zzg().zza("App version does not match; dropping. appId", zzgo.zza(s));
                return null;
            }
            return new com.google.android.gms.measurement.internal.zzo(s, zzg0.zzah(), zzg0.zzaf(), zzg0.zze(), zzg0.zzae(), zzg0.zzq(), zzg0.zzn(), null, zzg0.zzar(), false, zzg0.zzag(), zzg0.zzd(), 0L, 0, zzg0.zzaq(), false, zzg0.zzaa(), zzg0.zzx(), zzg0.zzo(), zzg0.zzan(), null, this.zzb(s).zzf(), "", null, zzg0.zzat(), zzg0.zzw(), this.zzb(s).zza(), this.zzd(s).zzf(), zzg0.zza(), zzg0.zzf(), zzg0.zzam(), zzg0.zzak());
        }
        this.zzj().zzc().zza("No app data available; dropping", s);
        return null;
    }

    @WorkerThread
    private final void zzc(zzbf zzbf0, com.google.android.gms.measurement.internal.zzo zzo0) {
        boolean z4;
        zzbb zzbb1;
        zzbf zzbf2;
        zzop zzop1;
        long v5;
        Preconditions.checkNotNull(zzo0);
        Preconditions.checkNotEmpty(zzo0.zza);
        long v = System.nanoTime();
        this.zzl().zzt();
        this.zzs();
        String s = zzo0.zza;
        this.zzp();
        if(!zzoo.zza(zzbf0, zzo0)) {
            return;
        }
        if(!zzo0.zzh) {
            this.zza(zzo0);
            return;
        }
        if(this.zzi().zzd(s, zzbf0.zza)) {
            this.zzj().zzu().zza("Dropping blocked event. appId", zzgo.zza(s), this.zzm.zzk().zza(zzbf0.zza));
            boolean z = this.zzi().zzl(s) || this.zzi().zzn(s);
            if(!z && !"_err".equals(zzbf0.zza)) {
                this.zzq();
                zzos.zza(this.zzah, s, 11, "_ev", zzbf0.zza, 0);
            }
            if(z) {
                zzg zzg0 = this.zzf().zze(s);
                if(zzg0 != null) {
                    long v1 = Math.max(zzg0.zzp(), zzg0.zzg());
                    long v2 = Math.abs(this.zzb().currentTimeMillis() - v1);
                    this.zze();
                    if(v2 > ((long)(((Long)zzbh.zzaa.zza(null))))) {
                        this.zzj().zzc().zza("Fetching config for blocked app");
                        this.zzb(zzg0);
                    }
                }
            }
            return;
        }
        zzgs zzgs0 = zzgs.zza(zzbf0);
        this.zzq().zza(zzgs0, this.zze().zzb(s));
        int v3 = this.zze().zza(s, zzbh.zzas, 10, 35);
        for(Object object0: new TreeSet(zzgs0.zzc.keySet())) {
            String s1 = (String)object0;
            if("items".equals(s1)) {
                this.zzq().zza(zzgs0.zzc.getParcelableArray(s1), v3);
            }
        }
        zzbf zzbf1 = zzgs0.zza();
        if(this.zzj().zza(2)) {
            this.zzj().zzp().zza("Logging event", this.zzm.zzk().zza(zzbf1));
        }
        if(zzow.zza()) {
            this.zze().zza(zzbh.zzcd);
        }
        this.zzf().zzp();
        try {
            this.zza(zzo0);
            boolean z1 = "ecommerce_purchase".equals(zzbf1.zza) || ("purchase".equals(zzbf1.zza) || "refund".equals(zzbf1.zza));
            if("_iap".equals(zzbf1.zza) || z1) {
                String s2 = zzbf1.zzb.zzd("currency");
                if(z1) {
                    double f = ((double)zzbf1.zzb.zza("value")) * 1000000.0;
                    if(f == 0.0) {
                        f = ((double)(((long)zzbf1.zzb.zzb("value")))) * 1000000.0;
                    }
                    if(f > 9223372036854776000.0 || f < -9223372036854776000.0) {
                        this.zzj().zzu().zza("Data lost. Currency value is too big. appId", zzgo.zza(s), f);
                        this.zzf().zzw();
                        return;
                    }
                    v5 = Math.round(f);
                    if("refund".equals(zzbf1.zza)) {
                        v5 = -v5;
                    }
                }
                else {
                    v5 = (long)zzbf1.zzb.zzb("value");
                }
                if(!TextUtils.isEmpty(s2)) {
                    String s3 = s2.toUpperCase(Locale.US);
                    if(s3.matches("[A-Z]{3}")) {
                        zzop zzop0 = this.zzf().zze(s, "_ltv_" + s3);
                        if(zzop0 == null) {
                        label_73:
                            zzal zzal0 = this.zzf();
                            int v7 = this.zze().zzb(s, zzbh.zzag);
                            Preconditions.checkNotEmpty(s);
                            zzal0.zzt();
                            zzal0.zzal();
                            try {
                                zzal0.e_().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? " + (zzal0.zze().zza(zzbh.zzdl) ? "and name like \'!_ltv!_%\' escape \'!\'" : "and name like \'_ltv_%\' ") + "order by set_timestamp desc limit ?,10);", new String[]{s, s, String.valueOf(v7 - 1)});
                            }
                            catch(SQLiteException sQLiteException0) {
                                zzal0.zzj().zzg().zza("Error pruning currencies. appId", zzgo.zza(s), sQLiteException0);
                            }
                            long v8 = this.zzb().currentTimeMillis();
                            zzop1 = new zzop(s, zzbf1.zzc, "_ltv_" + s3, v8, v5);
                        }
                        else {
                            Object object1 = zzop0.zze;
                            if(object1 instanceof Long) {
                                long v6 = this.zzb().currentTimeMillis();
                                zzop1 = new zzop(s, zzbf1.zzc, "_ltv_" + s3, v6, ((long)(((long)(((Long)object1))) + v5)));
                                goto label_84;
                            }
                            goto label_73;
                        }
                    label_84:
                        if(!this.zzf().zza(zzop1)) {
                            this.zzj().zzg().zza("Too many unique user properties are set. Ignoring user property. appId", zzgo.zza(s), this.zzm.zzk().zzc(zzop1.zzc), zzop1.zze);
                            this.zzq();
                            zzos.zza(this.zzah, s, 9, null, null, 0);
                        }
                    }
                }
            }
            boolean z2 = zzos.zzh(zzbf1.zza);
            boolean z3 = "_err".equals(zzbf1.zza);
            this.zzq();
            long v9 = zzos.zza(zzbf1.zzb);
            zzaq zzaq0 = this.zzf().zza(this.zzx(), s, v9 + 1L, true, z2, false, z3, false, false, false);
            long v10 = zzaq0.zzb;
            this.zze();
            long v11 = v10 - zzag.zzh();
            if(v11 > 0L) {
                if(v11 % 1000L == 1L) {
                    this.zzj().zzg().zza("Data loss. Too many events logged. appId, count", zzgo.zza(s), zzaq0.zzb);
                }
                this.zzf().zzw();
                return;
            }
            if(z2) {
                long v12 = zzaq0.zza;
                this.zze();
                long v13 = v12 - ((long)(((int)(((Integer)zzbh.zzm.zza(null))))));
                if(v13 > 0L) {
                    if(v13 % 1000L == 1L) {
                        this.zzj().zzg().zza("Data loss. Too many public events logged. appId, count", zzgo.zza(s), zzaq0.zza);
                    }
                    this.zzq();
                    zzos.zza(this.zzah, s, 16, "_ev", zzbf1.zza, 0);
                    this.zzf().zzw();
                    return;
                }
            }
            zzbf2 = zzbf1;
            if(z3) {
                long v14 = zzaq0.zzd - ((long)Math.max(0, Math.min(1000000, this.zze().zzb(zzo0.zza, zzbh.zzl))));
                if(Long.compare(v14, 0L) > 0) {
                    if(v14 == 1L) {
                        this.zzj().zzg().zza("Too many error events logged. appId, count", zzgo.zza(s), zzaq0.zzd);
                    }
                    this.zzf().zzw();
                    return;
                }
            }
            Bundle bundle0 = zzbf2.zzb.zzb();
            this.zzq().zza(bundle0, "_o", zzbf2.zzc);
            if(this.zzq().zzd(s, zzo0.zzac)) {
                this.zzq().zza(bundle0, "_dbg", 1L);
                this.zzq().zza(bundle0, "_r", 1L);
            }
            if("_s".equals(zzbf2.zza)) {
                zzop zzop2 = this.zzf().zze(zzo0.zza, "_sno");
                if(zzop2 != null && zzop2.zze instanceof Long) {
                    this.zzq().zza(bundle0, "_sno", zzop2.zze);
                }
            }
            if(this.zze().zza(zzbh.zzdj) && Objects.equals(zzbf2.zzc, "am") && Objects.equals(zzbf2.zza, "_ai")) {
                Object object2 = bundle0.get("value");
                if(object2 != null && object2 instanceof String) {
                    try {
                        double f1 = Double.parseDouble(((String)object2));
                        bundle0.remove("value");
                        bundle0.putDouble("value", f1);
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                }
            }
            long v15 = this.zzf().zza(s);
            if(v15 > 0L) {
                this.zzj().zzu().zza("Data lost. Too many events stored on disk, deleted. appId", zzgo.zza(s), v15);
            }
            zzbc zzbc0 = new zzbc(this.zzm, zzbf2.zzc, s, zzbf2.zza, zzbf2.zzd, 0L, bundle0);
            zzbb zzbb0 = this.zzf().zzd(s, zzbc0.zzb);
            if(zzbb0 == null) {
                if(this.zzf().zzc(s) >= ((long)this.zze().zza(s)) && z2) {
                    this.zzj().zzg().zza("Too many event names used, ignoring event. appId, name, supported count", zzgo.zza(s), this.zzm.zzk().zza(zzbc0.zzb), this.zze().zza(s));
                    this.zzq();
                    zzos.zza(this.zzah, s, 8, null, null, 0);
                    return;
                }
                zzbb1 = new zzbb(s, zzbc0.zzb, 0L, 0L, zzbc0.zzd, 0L, null, null, null, null);
            }
            else {
                zzbc0 = zzbc0.zza(this.zzm, zzbb0.zzf);
                zzbb1 = zzbb0.zza(zzbc0.zzd);
            }
            this.zzf().zza(zzbb1);
            this.zzl().zzt();
            this.zzs();
            Preconditions.checkNotNull(zzbc0);
            Preconditions.checkNotNull(zzo0);
            Preconditions.checkNotEmpty(zzbc0.zza);
            Preconditions.checkArgument(zzbc0.zza.equals(zzo0.zza));
            com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza0 = zzk.zzw().zzh(1).zzp("android");
            if(!TextUtils.isEmpty(zzo0.zza)) {
                zzfy$zzk$zza0.zzb(zzo0.zza);
            }
            if(!TextUtils.isEmpty(zzo0.zzd)) {
                zzfy$zzk$zza0.zzd(zzo0.zzd);
            }
            if(!TextUtils.isEmpty(zzo0.zzc)) {
                zzfy$zzk$zza0.zze(zzo0.zzc);
            }
            if(!TextUtils.isEmpty(zzo0.zzv)) {
                zzfy$zzk$zza0.zzr(zzo0.zzv);
            }
            long v16 = zzo0.zzj;
            if(v16 != 0xFFFFFFFF80000000L) {
                zzfy$zzk$zza0.zze(((int)v16));
            }
            zzfy$zzk$zza0.zzf(zzo0.zze);
            if(!TextUtils.isEmpty(zzo0.zzb)) {
                zzfy$zzk$zza0.zzm(zzo0.zzb);
            }
            zzje zzje0 = this.zzb(((String)Preconditions.checkNotNull(zzo0.zza))).zza(zzje.zzb(zzo0.zzt));
            zzfy$zzk$zza0.zzg(zzje0.zze());
            if(zzfy$zzk$zza0.zzx().isEmpty() && !TextUtils.isEmpty(zzo0.zzp)) {
                zzfy$zzk$zza0.zza(zzo0.zzp);
            }
            if(zzpn.zza() && this.zze().zze(zzo0.zza, zzbh.zzch)) {
                this.zzq();
                if(zzos.zzd(zzo0.zza)) {
                    zzfy$zzk$zza0.zzd(zzo0.zzaa);
                    long v17 = zzje0.zzg() || zzo0.zzab == 0L ? zzo0.zzab : zzo0.zzab & -2L | 0x20L;
                    zzfy$zzk$zza0.zza(v17 == 1L);
                    if(v17 != 0L) {
                        com.google.android.gms.internal.measurement.zzfy.zzc.zza zzfy$zzc$zza0 = zzc.zza();
                        zzfy$zzc$zza0.zzc((v17 & 1L) != 0L);
                        zzfy$zzc$zza0.zze((2L & v17) != 0L);
                        zzfy$zzc$zza0.zzf((4L & v17) != 0L);
                        zzfy$zzc$zza0.zzg((8L & v17) != 0L);
                        zzfy$zzc$zza0.zzb((16L & v17) != 0L);
                        zzfy$zzc$zza0.zza((0x20L & v17) != 0L);
                        zzfy$zzc$zza0.zzd((v17 & 0x40L) != 0L);
                        zzfy$zzk$zza0.zza(((zzc)(((zzjt)zzfy$zzc$zza0.zzai()))));
                    }
                }
            }
            long v18 = zzo0.zzf;
            if(v18 != 0L) {
                zzfy$zzk$zza0.zzc(v18);
            }
            zzfy$zzk$zza0.zzd(zzo0.zzr);
            List list0 = this.zzp().zzu();
            if(list0 != null) {
                zzfy$zzk$zza0.zzc(list0);
            }
            zzje zzje1 = this.zzb(((String)Preconditions.checkNotNull(zzo0.zza))).zza(zzje.zzb(zzo0.zzt));
            if(zzje1.zzg() && zzo0.zzn) {
                Pair pair0 = this.zzj.zza(zzo0.zza, zzje1);
                if(pair0 != null && !TextUtils.isEmpty(((CharSequence)pair0.first)) && zzo0.zzn) {
                    zzfy$zzk$zza0.zzq(((String)pair0.first));
                    Object object3 = pair0.second;
                    if(object3 != null) {
                        zzfy$zzk$zza0.zzc(((Boolean)object3).booleanValue());
                    }
                    if(!zzbc0.zzb.equals("_fx") && !((String)pair0.first).equals("00000000-0000-0000-0000-000000000000")) {
                        zzg zzg1 = this.zzf().zze(zzo0.zza);
                        if(zzg1 != null && zzg1.zzau()) {
                            this.zza(zzo0.zza, false, null, null);
                            Bundle bundle1 = new Bundle();
                            if(this.zze().zza(zzbh.zzcw)) {
                                Long long0 = zzg1.zzy();
                                if(long0 != null) {
                                    bundle1.putLong("_pfo", Math.max(0L, ((long)long0)));
                                }
                                Long long1 = zzg1.zzz();
                                if(long1 != null) {
                                    bundle1.putLong("_uwa", ((long)long1));
                                }
                            }
                            else if(this.zze().zza(zzbh.zzcv)) {
                                bundle1.putLong("_pfo", Math.max(0L, this.zzf().zzb(zzo0.zza) - 1L));
                            }
                            bundle1.putLong("_r", 1L);
                            this.zzah.zza(zzo0.zza, "_fx", bundle1);
                        }
                    }
                }
            }
            this.zzm.zzg().zzac();
            com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza1 = zzfy$zzk$zza0.zzi(Build.MODEL);
            this.zzm.zzg().zzac();
            zzfy$zzk$zza1.zzo(Build.VERSION.RELEASE).zzj(((int)this.zzm.zzg().zzc())).zzs(this.zzm.zzg().zzg());
            zzfy$zzk$zza0.zzj(zzo0.zzx);
            if(this.zzm.zzac() && !TextUtils.isEmpty(null)) {
                zzfy$zzk$zza0.zzj(null);
            }
            zzg zzg2 = this.zzf().zze(zzo0.zza);
            if(zzg2 == null) {
                zzg2 = new zzg(this.zzm, zzo0.zza);
                zzg2.zzb(this.zza(zzje1));
                zzg2.zze(zzo0.zzk);
                zzg2.zzf(zzo0.zzb);
                if(zzje1.zzg()) {
                    zzg2.zzh(this.zzj.zza(zzo0.zza, zzo0.zzn));
                }
                zzg2.zzq(0L);
                zzg2.zzr(0L);
                zzg2.zzp(0L);
                zzg2.zzd(zzo0.zzc);
                zzg2.zzb(zzo0.zzj);
                zzg2.zzc(zzo0.zzd);
                zzg2.zzn(zzo0.zze);
                zzg2.zzk(zzo0.zzf);
                zzg2.zzb(zzo0.zzh);
                zzg2.zzl(zzo0.zzr);
                this.zzf().zza(zzg2, false, false);
            }
            if(zzje1.zzh() && !TextUtils.isEmpty(zzg2.zzad())) {
                zzfy$zzk$zza0.zzc(((String)Preconditions.checkNotNull(zzg2.zzad())));
            }
            if(!TextUtils.isEmpty(zzg2.zzag())) {
                zzfy$zzk$zza0.zzl(((String)Preconditions.checkNotNull(zzg2.zzag())));
            }
            List list1 = this.zzf().zzl(zzo0.zza);
            for(int v19 = 0; v19 < list1.size(); ++v19) {
                com.google.android.gms.internal.measurement.zzfy.zzo.zza zzfy$zzo$zza0 = zzo.zze().zza(((zzop)list1.get(v19)).zzc).zzb(((zzop)list1.get(v19)).zzd);
                this.zzp().zza(zzfy$zzo$zza0, ((zzop)list1.get(v19)).zze);
                zzfy$zzk$zza0.zza(zzfy$zzo$zza0);
                if("_sid".equals(((zzop)list1.get(v19)).zzc) && zzg2.zzv() != 0L && this.zzp().zza(zzo0.zzv) != zzg2.zzv()) {
                    zzfy$zzk$zza0.zzr();
                }
            }
            try {
                long v20 = this.zzf().zza(((zzk)(((zzjt)zzfy$zzk$zza0.zzai()))));
            }
            catch(IOException iOException0) {
                this.zzj().zzg().zza("Data loss. Failed to insert raw event metadata. appId", zzgo.zza(zzfy$zzk$zza0.zzt()), iOException0);
                this.zzf().zzw();
                this.zzac();
                this.zzj().zzp().zza("Background event processing time, ms", ((long)((System.nanoTime() - v + 500000L) / 1000000L)));
                return;
            }
            zzal zzal1 = this.zzf();
            zzbe zzbe0 = zzbc0.zzf;
            if(zzbe0 == null) {
                z4 = false;
            }
            else {
                for(Object object4: zzbe0) {
                    if(!"_r".equals(((String)object4))) {
                        continue;
                    }
                    z4 = true;
                    goto label_290;
                }
                z4 = this.zzi().zzc(zzbc0.zza, zzbc0.zzb) && this.zzf().zza(this.zzx(), zzbc0.zza, false, false, false, false, false, false, false).zze < ((long)this.zze().zzc(zzbc0.zza));
            }
        label_290:
            if(zzal1.zza(zzbc0, v20, z4)) {
                this.zzp = 0L;
            }
            this.zzf().zzw();
        }
        finally {
            this.zzf().zzu();
        }
        this.zzac();
        this.zzj().zzp().zza("Background event processing time, ms", ((long)((System.nanoTime() - v + 500000L) / 1000000L)));
    }

    public final zzt zzc() {
        return (zzt)zznv.zza(this.zzg);
    }

    @WorkerThread
    final void zzc(com.google.android.gms.measurement.internal.zzo zzo0) {
        int v = 0;
        this.zzl().zzt();
        this.zzs();
        Preconditions.checkNotNull(zzo0);
        Preconditions.checkNotEmpty(zzo0.zza);
        if(!this.zze().zza(zzbh.zzdc)) {
            return;
        }
        if(this.zze().zza(zzbh.zzbj)) {
            long v1 = this.zzb().currentTimeMillis();
            int v2 = this.zze().zzb(null, zzbh.zzau);
            this.zze();
            long v3 = zzag.zzg();
            while(v < v2 && this.zza(null, v1 - v3)) {
                ++v;
            }
        }
        else {
            this.zze();
            long v4 = zzag.zzh();
            while(((long)v) < v4 && this.zza(zzo0.zza, 0L)) {
                ++v;
            }
        }
        if(this.zze().zza(zzbh.zzbk)) {
            this.zzab();
        }
    }

    @WorkerThread
    private final zzax zzd(String s) {
        this.zzl().zzt();
        this.zzs();
        zzax zzax0 = (zzax)this.zzad.get(s);
        if(zzax0 == null) {
            zzax0 = this.zzf().zzg(s);
            this.zzad.put(s, zzax0);
        }
        return zzax0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjc
    public final zzab zzd() {
        return this.zzm.zzd();
    }

    @WorkerThread
    final void zzd(com.google.android.gms.measurement.internal.zzo zzo0) {
        ApplicationInfo applicationInfo0;
        boolean z1;
        PackageInfo packageInfo0;
        this.zzl().zzt();
        this.zzs();
        Preconditions.checkNotNull(zzo0);
        Preconditions.checkNotEmpty(zzo0.zza);
        if(!zznv.zzi(zzo0)) {
            return;
        }
        zzg zzg0 = this.zzf().zze(zzo0.zza);
        if(zzg0 != null && TextUtils.isEmpty(zzg0.zzah()) && !TextUtils.isEmpty(zzo0.zzb)) {
            zzg0.zzd(0L);
            this.zzf().zza(zzg0, false, false);
            this.zzi().zzj(zzo0.zza);
        }
        if(!zzo0.zzh) {
            this.zza(zzo0);
            return;
        }
        long v = zzo0.zzl == 0L ? this.zzb().currentTimeMillis() : zzo0.zzl;
        this.zzm.zzg().zzt();
        int v1 = zzo0.zzm;
        if(v1 != 0 && v1 != 1) {
            this.zzj().zzu().zza("Incorrect app type, assuming installed app. appId, appType", zzgo.zza(zzo0.zza), v1);
            v1 = 0;
        }
        this.zzf().zzp();
        try {
            zzop zzop0 = this.zzf().zze(zzo0.zza, "_npa");
            Boolean boolean0 = zznv.zzh(zzo0);
            if(zzop0 == null || "auto".equals(zzop0.zzb)) {
                if(boolean0 != null) {
                    zzon zzon0 = new zzon("_npa", v, ((long)(boolean0.booleanValue() ? 1L : 0L)), "auto");
                    if(zzop0 == null || !zzop0.zze.equals(zzon0.zzc)) {
                        this.zza(zzon0, zzo0);
                    }
                }
                else if(zzop0 != null) {
                    this.zza("_npa", zzo0);
                }
            }
            zzg zzg1 = this.zzf().zze(((String)Preconditions.checkNotNull(zzo0.zza)));
            if(zzg1 != null) {
                this.zzq();
                String s = zzg1.zzah();
                String s1 = zzg1.zzaa();
                if(zzos.zza(zzo0.zzb, s, zzo0.zzp, s1)) {
                    this.zzj().zzu().zza("New GMP App Id passed in. Removing cached database data. appId", zzgo.zza(zzg1.zzac()));
                    zzal zzal0 = this.zzf();
                    String s2 = zzg1.zzac();
                    zzal0.zzal();
                    zzal0.zzt();
                    Preconditions.checkNotEmpty(s2);
                    try {
                        SQLiteDatabase sQLiteDatabase0 = zzal0.e_();
                        String[] arr_s = {s2};
                        int v3 = sQLiteDatabase0.delete("events", "app_id=?", arr_s) + sQLiteDatabase0.delete("user_attributes", "app_id=?", arr_s) + sQLiteDatabase0.delete("conditional_properties", "app_id=?", arr_s) + sQLiteDatabase0.delete("apps", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events_metadata", "app_id=?", arr_s) + sQLiteDatabase0.delete("event_filters", "app_id=?", arr_s) + sQLiteDatabase0.delete("property_filters", "app_id=?", arr_s) + sQLiteDatabase0.delete("audience_filter_values", "app_id=?", arr_s) + sQLiteDatabase0.delete("consent_settings", "app_id=?", arr_s) + sQLiteDatabase0.delete("default_event_params", "app_id=?", arr_s) + sQLiteDatabase0.delete("trigger_uris", "app_id=?", arr_s);
                        if(v3 > 0) {
                            zzal0.zzj().zzp().zza("Deleted application data. app, records", s2, v3);
                        }
                    }
                    catch(SQLiteException sQLiteException0) {
                        zzal0.zzj().zzg().zza("Error deleting application data. appId, error", zzgo.zza(s2), sQLiteException0);
                    }
                    zzg1 = null;
                }
            }
            if(zzg1 != null) {
                int v4 = zzg1.zze() == 0xFFFFFFFF80000000L || zzg1.zze() == zzo0.zzj ? 0 : 1;
                String s3 = zzg1.zzaf();
                if((v4 | (zzg1.zze() != 0xFFFFFFFF80000000L || s3 == null || s3.equals(zzo0.zzc) ? 0 : 1)) != 0) {
                    Bundle bundle0 = new Bundle();
                    bundle0.putString("_pv", s3);
                    this.zza(new zzbf("_au", new zzbe(bundle0), "auto", v), zzo0);
                }
            }
            this.zza(zzo0);
            if((v1 == 0 ? this.zzf().zzd(zzo0.zza, "_f") : this.zzf().zzd(zzo0.zza, "_v")) == null) {
                long v5 = (v / 3600000L + 1L) * 3600000L;
                if(v1 == 0) {
                    this.zza(new zzon("_fot", v, v5, "auto"), zzo0);
                    this.zzl().zzt();
                    zzhf zzhf0 = (zzhf)Preconditions.checkNotNull(this.zzl);
                    String s4 = zzo0.zza;
                    if(s4 == null || s4.isEmpty()) {
                        zzhf0.zza.zzj().zzw().zza("Install Referrer Reporter was called with invalid app package name");
                    }
                    else {
                        zzhf0.zza.zzl().zzt();
                        if(zzhf0.zza()) {
                            zzhi zzhi0 = new zzhi(zzhf0, s4);
                            zzhf0.zza.zzl().zzt();
                            Intent intent0 = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                            intent0.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                            PackageManager packageManager0 = zzhf0.zza.zza().getPackageManager();
                            if(packageManager0 == null) {
                                zzhf0.zza.zzj().zzw().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                            }
                            else {
                                List list0 = packageManager0.queryIntentServices(intent0, 0);
                                if(list0 == null || list0.isEmpty()) {
                                    zzhf0.zza.zzj().zzo().zza("Play Service for fetching Install Referrer is unavailable on device");
                                }
                                else {
                                    ServiceInfo serviceInfo0 = ((ResolveInfo)list0.get(0)).serviceInfo;
                                    if(serviceInfo0 != null) {
                                        if(serviceInfo0.name == null || !"com.android.vending".equals(serviceInfo0.packageName) || !zzhf0.zza()) {
                                            zzhf0.zza.zzj().zzu().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                        }
                                        else {
                                            Intent intent1 = new Intent(intent0);
                                            try {
                                                boolean z = ConnectionTracker.getInstance().bindService(zzhf0.zza.zza(), intent1, zzhi0, 1);
                                                zzhf0.zza.zzj().zzp().zza("Install Referrer Service is", (z ? "available" : "not available"));
                                                goto label_98;
                                            }
                                            catch(RuntimeException runtimeException0) {
                                            }
                                            zzhf0.zza.zzj().zzg().zza("Exception occurred while binding to Install Referrer Service", runtimeException0.getMessage());
                                        }
                                    }
                                }
                            }
                        }
                        else {
                            zzhf0.zza.zzj().zzo().zza("Install Referrer Reporter is not available");
                        }
                    }
                label_98:
                    this.zzl().zzt();
                    this.zzs();
                    Bundle bundle1 = new Bundle();
                    bundle1.putLong("_c", 1L);
                    bundle1.putLong("_r", 1L);
                    bundle1.putLong("_uwa", 0L);
                    bundle1.putLong("_pfo", 0L);
                    bundle1.putLong("_sys", 0L);
                    bundle1.putLong("_sysu", 0L);
                    bundle1.putLong("_et", 1L);
                    if(zzo0.zzo) {
                        bundle1.putLong("_dac", 1L);
                    }
                    String s5 = (String)Preconditions.checkNotNull(zzo0.zza);
                    zzal zzal1 = this.zzf();
                    Preconditions.checkNotEmpty(s5);
                    zzal1.zzt();
                    zzal1.zzal();
                    long v6 = zzal1.zzb(s5, "first_open_count");
                    if(this.zzm.zza().getPackageManager() == null) {
                        this.zzj().zzg().zza("PackageManager is null, first open report might be inaccurate. appId", zzgo.zza(s5));
                    }
                    else {
                        try {
                            packageInfo0 = Wrappers.packageManager(this.zzm.zza()).getPackageInfo(s5, 0);
                        }
                        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                            this.zzj().zzg().zza("Package info is null, first open report might be inaccurate. appId", zzgo.zza(s5), packageManager$NameNotFoundException0);
                            packageInfo0 = null;
                        }
                        if(packageInfo0 != null) {
                            long v7 = packageInfo0.firstInstallTime;
                            if(v7 != 0L) {
                                if(v7 == packageInfo0.lastUpdateTime) {
                                    z1 = true;
                                }
                                else {
                                    if(!this.zze().zza(zzbh.zzbs)) {
                                        bundle1.putLong("_uwa", 1L);
                                    }
                                    else if(v6 == 0L) {
                                        bundle1.putLong("_uwa", 1L);
                                    }
                                    z1 = false;
                                }
                                this.zza(new zzon("_fi", v, ((long)(z1 ? 1L : 0L)), "auto"), zzo0);
                            }
                        }
                        try {
                            applicationInfo0 = Wrappers.packageManager(this.zzm.zza()).getApplicationInfo(s5, 0);
                        }
                        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException1) {
                            this.zzj().zzg().zza("Application info is null, first open report might be inaccurate. appId", zzgo.zza(s5), packageManager$NameNotFoundException1);
                            applicationInfo0 = null;
                        }
                        if(applicationInfo0 != null) {
                            if((applicationInfo0.flags & 1) != 0) {
                                bundle1.putLong("_sys", 1L);
                            }
                            if((applicationInfo0.flags & 0x80) != 0) {
                                bundle1.putLong("_sysu", 1L);
                            }
                        }
                    }
                    if(v6 >= 0L) {
                        bundle1.putLong("_pfo", v6);
                    }
                    this.zzb(new zzbf("_f", new zzbe(bundle1), "auto", v), zzo0);
                }
                else {
                    this.zza(new zzon("_fvt", v, v5, "auto"), zzo0);
                    this.zzl().zzt();
                    this.zzs();
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("_c", 1L);
                    bundle2.putLong("_r", 1L);
                    bundle2.putLong("_et", 1L);
                    if(zzo0.zzo) {
                        bundle2.putLong("_dac", 1L);
                    }
                    this.zzb(new zzbf("_v", new zzbe(bundle2), "auto", v), zzo0);
                }
            }
            else if(zzo0.zzi) {
                this.zzb(new zzbf("_cd", new zzbe(new Bundle()), "auto", v), zzo0);
            }
            this.zzf().zzw();
        }
        finally {
            this.zzf().zzu();
        }
    }

    @WorkerThread
    private final void zze(String s) {
        this.zzl().zzt();
        this.zzs();
        this.zzw = true;
        try {
            Boolean boolean0 = this.zzm.zzr().zzab();
            if(boolean0 == null) {
                this.zzj().zzu().zza("Upload data called on the client side before use of service was decided");
                return;
            }
            if(boolean0.booleanValue()) {
                this.zzj().zzg().zza("Upload called in the client side when service should be used");
                return;
            }
            if(this.zzp > 0L) {
                this.zzac();
                return;
            }
            if(!this.zzh().zzu()) {
                this.zzj().zzp().zza("Network not connected, ignoring upload request");
                this.zzac();
                return;
            }
            if(!this.zzf().zzs(s)) {
                this.zzj().zzp().zza("Upload queue has no batches for appId", s);
                return;
            }
            zzoj zzoj0 = this.zzf().zzj(s);
            if(zzoj0 == null) {
                return;
            }
            zzj zzfy$zzj0 = zzoj0.zzc();
            if(zzfy$zzj0 == null) {
                return;
            }
            String s1 = this.zzp().zza(zzfy$zzj0);
            byte[] arr_b = zzfy$zzj0.zzca();
            this.zzj().zzp().zza("Uploading data from upload queue. appId, uncompressed size, data", s, ((int)arr_b.length), s1);
            if(!zzpb.zza() || !this.zze().zza(zzbh.zzcf)) {
                try {
                    this.zzv = true;
                    this.zzh().zza(s, new URL(zzoj0.zzd()), arr_b, zzoj0.zze(), new zzoe(this, s, zzoj0));
                }
                catch(MalformedURLException unused_ex) {
                    this.zzj().zzg().zza("Failed to parse URL. Not uploading MeasurementBatch. appId", zzgo.zza(s), zzoj0.zzd());
                }
            }
            else {
                this.zzv = true;
                this.zzh().zza(s, zzoj0.zzb(), zzfy$zzj0, new zzob(this, s, zzoj0));
            }
        }
        finally {
            this.zzw = false;
            this.zzaa();
        }
    }

    public final zzag zze() {
        return ((zzhy)Preconditions.checkNotNull(this.zzm)).zzf();
    }

    @VisibleForTesting(otherwise = 4)
    @WorkerThread
    final void zze(com.google.android.gms.measurement.internal.zzo zzo0) {
        if(this.zzz != null) {
            ArrayList arrayList0 = new ArrayList();
            this.zzaa = arrayList0;
            arrayList0.addAll(this.zzz);
        }
        zzal zzal0 = this.zzf();
        String s = (String)Preconditions.checkNotNull(zzo0.zza);
        Preconditions.checkNotEmpty(s);
        zzal0.zzt();
        zzal0.zzal();
        try {
            SQLiteDatabase sQLiteDatabase0 = zzal0.e_();
            String[] arr_s = {s};
            int v = sQLiteDatabase0.delete("apps", "app_id=?", arr_s) + sQLiteDatabase0.delete("events", "app_id=?", arr_s) + sQLiteDatabase0.delete("events_snapshot", "app_id=?", arr_s) + sQLiteDatabase0.delete("user_attributes", "app_id=?", arr_s) + sQLiteDatabase0.delete("conditional_properties", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events_metadata", "app_id=?", arr_s) + sQLiteDatabase0.delete("queue", "app_id=?", arr_s) + sQLiteDatabase0.delete("audience_filter_values", "app_id=?", arr_s) + sQLiteDatabase0.delete("main_event_params", "app_id=?", arr_s) + sQLiteDatabase0.delete("default_event_params", "app_id=?", arr_s) + sQLiteDatabase0.delete("trigger_uris", "app_id=?", arr_s) + sQLiteDatabase0.delete("upload_queue", "app_id=?", arr_s);
            if(v > 0) {
                zzal0.zzj().zzp().zza("Reset analytics data. app, records", s, v);
            }
        }
        catch(SQLiteException sQLiteException0) {
            zzal0.zzj().zzg().zza("Error resetting analytics data. appId, error", zzgo.zza(s), sQLiteException0);
        }
        if(zzo0.zzh) {
            this.zzd(zzo0);
        }
    }

    public final zzal zzf() {
        return (zzal)zznv.zza(this.zzd);
    }

    @WorkerThread
    final void zzf(com.google.android.gms.measurement.internal.zzo zzo0) {
        this.zzl().zzt();
        this.zzs();
        Preconditions.checkNotEmpty(zzo0.zza);
        zzax zzax0 = zzax.zza(zzo0.zzz);
        this.zzj().zzp().zza("Setting DMA consent for package", zzo0.zza, zzax0);
        String s = zzo0.zza;
        this.zzl().zzt();
        this.zzs();
        zzjh zzjh0 = zzax.zza(this.zza(s), 100).zzc();
        this.zzad.put(s, zzax0);
        this.zzf().zza(s, zzax0);
        zzjh zzjh1 = zzax.zza(this.zza(s), 100).zzc();
        this.zzl().zzt();
        this.zzs();
        int v = 0;
        int v1 = zzjh0 != zzjh.zzc || zzjh1 != zzjh.zzd ? 0 : 1;
        boolean z = zzjh0 == zzjh.zzd && zzjh1 == zzjh.zzc;
        if(this.zze().zza(zzbh.zzcq)) {
            if(v1 != 0 || z) {
                v = 1;
            }
            v1 = v;
        }
        if(v1 != 0) {
            this.zzj().zzp().zza("Generated _dcu event for", s);
            Bundle bundle0 = new Bundle();
            if(this.zzf().zza(this.zzx(), s, false, false, false, false, false, false, false).zzf < ((long)this.zze().zzb(s, zzbh.zzay))) {
                bundle0.putLong("_r", 1L);
                zzaq zzaq0 = this.zzf().zza(this.zzx(), s, false, false, false, false, false, true, false);
                this.zzj().zzp().zza("_dcu realtime event count", s, zzaq0.zzf);
            }
            this.zzah.zza(s, "_dcu", bundle0);
        }
    }

    public final zzgh zzg() {
        return this.zzm.zzk();
    }

    @WorkerThread
    final void zzg(com.google.android.gms.measurement.internal.zzo zzo0) {
        this.zzl().zzt();
        this.zzs();
        Preconditions.checkNotEmpty(zzo0.zza);
        zzje zzje0 = zzje.zza(zzo0.zzt, zzo0.zzy);
        zzje zzje1 = this.zzb(zzo0.zza);
        this.zzj().zzp().zza("Setting storage consent for package", zzo0.zza, zzje0);
        this.zza(zzo0.zza, zzje0);
        if((!zznm.zza() || !this.zze().zza(zzbh.zzcy)) && zzje0.zzc(zzje1)) {
            this.zze(zzo0);
        }
    }

    private static Boolean zzh(com.google.android.gms.measurement.internal.zzo zzo0) {
        Boolean boolean0 = zzo0.zzq;
        if(!TextUtils.isEmpty(zzo0.zzad)) {
            switch(com.google.android.gms.measurement.internal.zzf.zza(zzo0.zzad).zza()) {
                case 2: {
                    return false;
                }
                case 3: {
                    return true;
                }
                case 1: 
                case 4: {
                    return null;
                }
                default: {
                    return boolean0;
                }
            }
        }
        return boolean0;
    }

    public final zzgr zzh() {
        return (zzgr)zznv.zza(this.zzc);
    }

    // 去混淆评级： 低(20)
    private static boolean zzi(com.google.android.gms.measurement.internal.zzo zzo0) {
        return !TextUtils.isEmpty(zzo0.zzb) || !TextUtils.isEmpty(zzo0.zzp);
    }

    public final zzhl zzi() {
        return (zzhl)zznv.zza(this.zzb);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjc
    public final zzgo zzj() {
        return ((zzhy)Preconditions.checkNotNull(this.zzm)).zzj();
    }

    final zzhy zzk() {
        return this.zzm;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjc
    public final zzhv zzl() {
        return ((zzhy)Preconditions.checkNotNull(this.zzm)).zzl();
    }

    public final zzli zzm() {
        return (zzli)zznv.zza(this.zzi);
    }

    public final zzmw zzn() {
        return this.zzj;
    }

    public final zznu zzo() {
        return this.zzk;
    }

    public final zzoo zzp() {
        return (zzoo)zznv.zza(this.zzh);
    }

    public final zzos zzq() {
        return ((zzhy)Preconditions.checkNotNull(this.zzm)).zzt();
    }

    @WorkerThread
    final void zzr() {
        this.zzl().zzt();
        this.zzs();
        if(!this.zzo) {
            this.zzo = true;
            if(this.zzae()) {
                int v = this.zza(this.zzy);
                int v1 = this.zzm.zzh().zzab();
                this.zzl().zzt();
                if(v > v1) {
                    this.zzj().zzg().zza("Panic: can\'t downgrade version. Previous, current version", v, v1);
                    return;
                }
                if(v < v1) {
                    if(this.zza(v1, this.zzy)) {
                        this.zzj().zzp().zza("Storage version upgraded. Previous, current version", v, v1);
                        return;
                    }
                    this.zzj().zzg().zza("Storage version upgrade failed. Previous, current version", v, v1);
                }
            }
        }
    }

    final void zzs() {
        if(!this.zzn) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void zzt() {
        ++this.zzt;
    }

    final void zzu() {
        ++this.zzs;
    }

    @WorkerThread
    protected final void zzv() {
        this.zzl().zzt();
        this.zzf().zzv();
        zzal zzal0 = this.zzf();
        zzal0.zzt();
        zzal0.zzal();
        if(zzal0.zzaa()) {
            zzfz zzfz0 = zzbh.zzbh;
            if(((long)(((Long)zzfz0.zza(null)))) != 0L) {
                int v = zzal0.e_().delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(zzal0.zzb().currentTimeMillis()), String.valueOf(zzfz0.zza(null))});
                if(v > 0) {
                    zzal0.zzj().zzp().zza("Deleted stale trigger uris. rowsDeleted", v);
                }
            }
        }
        if(this.zzj.zzd.zza() == 0L) {
            this.zzj.zzd.zza(this.zzb().currentTimeMillis());
        }
        this.zzac();
    }

    @WorkerThread
    final void zzw() {
        zznw zznw2;
        zzoc zzoc0;
        Map map0;
        URL uRL0;
        zzgr zzgr0;
        zznw zznw1;
        this.zzl().zzt();
        this.zzs();
        this.zzw = true;
        try {
            Boolean boolean0 = this.zzm.zzr().zzab();
            if(boolean0 == null) {
                this.zzj().zzu().zza("Upload data called on the client side before use of service was decided");
                return;
            }
            if(boolean0.booleanValue()) {
                this.zzj().zzg().zza("Upload called in the client side when service should be used");
                return;
            }
            if(this.zzp > 0L) {
                this.zzac();
                return;
            }
            this.zzl().zzt();
            if(this.zzz != null) {
                this.zzj().zzp().zza("Uploading requested multiple times");
                return;
            }
            if(!this.zzh().zzu()) {
                this.zzj().zzp().zza("Network not connected, ignoring upload request");
                this.zzac();
                return;
            }
            long v1 = this.zzb().currentTimeMillis();
            int v2 = this.zze().zzb(null, zzbh.zzau);
            this.zze();
            long v3 = zzag.zzg();
            for(int v4 = 0; v4 < v2 && this.zza(null, v1 - v3); ++v4) {
            }
            if(zzpn.zza()) {
                this.zzab();
            }
            long v5 = this.zzj.zzd.zza();
            if(v5 != 0L) {
                this.zzj().zzc().zza("Uploading events. Elapsed time since last upload attempt (ms)", Math.abs(v1 - v5));
            }
            String s = this.zzf().f_();
            if(TextUtils.isEmpty(s)) {
                this.zzab = -1L;
                zzal zzal0 = this.zzf();
                this.zze();
                String s6 = zzal0.zza(v1 - zzag.zzg());
                if(!TextUtils.isEmpty(s6)) {
                    zzg zzg0 = this.zzf().zze(s6);
                    if(zzg0 != null) {
                        this.zzb(zzg0);
                    }
                }
            }
            else {
                if(this.zzab == -1L) {
                    this.zzab = this.zzf().b_();
                }
                int v6 = this.zze().zzb(s, zzbh.zzg);
                int v7 = Math.max(0, this.zze().zzb(s, zzbh.zzh));
                List list0 = this.zzf().zza(s, v6, v7);
                if(!list0.isEmpty()) {
                    if(this.zzb(s).zzg()) {
                        Iterator iterator0 = list0.iterator();
                        while(iterator0.hasNext()) {
                            iterator0.next();
                        }
                    }
                    com.google.android.gms.internal.measurement.zzfy.zzj.zza zzfy$zzj$zza0 = zzj.zzb();
                    int v8 = list0.size();
                    ArrayList arrayList0 = new ArrayList(list0.size());
                    boolean z = this.zze().zzj(s) && this.zzb(s).zzg();
                    boolean z1 = this.zzb(s).zzg();
                    boolean z2 = this.zzb(s).zzh();
                    boolean z3 = zzpo.zza() && this.zze().zze(s, zzbh.zzbw);
                    zznw zznw0 = this.zzk.zza(s);
                    for(int v9 = 0; v9 < v8; ++v9) {
                        com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza0 = (com.google.android.gms.internal.measurement.zzfy.zzk.zza)((zzk)((Pair)list0.get(v9)).first).zzcd();
                        arrayList0.add(((Long)((Pair)list0.get(v9)).second));
                        this.zze();
                        zzfy$zzk$zza0.zzl(106000L).zzk(v1).zzd(false);
                        if(!z) {
                            zzfy$zzk$zza0.zzk();
                        }
                        if(!z1) {
                            zzfy$zzk$zza0.zzq();
                            zzfy$zzk$zza0.zzn();
                        }
                        if(!z2) {
                            zzfy$zzk$zza0.zzh();
                        }
                        this.zza(s, zzfy$zzk$zza0);
                        if(!z3) {
                            zzfy$zzk$zza0.zzr();
                        }
                        if(zznm.zza() && this.zze().zza(zzbh.zzcz) && !z2) {
                            zzfy$zzk$zza0.zzi();
                        }
                        Iterator iterator1 = new ArrayList(zzfy$zzk$zza0.zzaa()).iterator();
                        while(iterator1.hasNext()) {
                            iterator1.next();
                        }
                        if(zzfy$zzk$zza0.zzc() != 0) {
                            if(this.zze().zze(s, zzbh.zzbm)) {
                                byte[] arr_b = ((zzk)(((zzjt)zzfy$zzk$zza0.zzai()))).zzca();
                                zzfy$zzk$zza0.zza(this.zzp().zza(arr_b));
                            }
                            zzfy$zzj$zza0.zza(zzfy$zzk$zza0);
                        }
                    }
                    if(zzfy$zzj$zza0.zza() == 0) {
                        this.zza(arrayList0);
                        this.zza(false, 204, null, null, s, Collections.emptyList());
                        return;
                    }
                    zzj zzfy$zzj0 = (zzj)(((zzjt)zzfy$zzj$zza0.zzai()));
                    ArrayList arrayList1 = new ArrayList();
                    if(this.zze().zza(zzbh.zzbx)) {
                        this.zzq();
                        if(zzos.zzf(s) && zznw0.zza() == zznt.zzc) {
                            String s1 = null;
                            for(Object object0: ((zzj)(((zzjt)zzfy$zzj$zza0.zzai()))).zzf()) {
                                if(((zzk)object0).zzbh()) {
                                    s1 = "1570d933-fa33-4529-881c-189cc6cc46ef";
                                    break;
                                }
                            }
                            zzj zzfy$zzj1 = (zzj)(((zzjt)zzfy$zzj$zza0.zzai()));
                            this.zzl().zzt();
                            this.zzs();
                            com.google.android.gms.internal.measurement.zzfy.zzj.zza zzfy$zzj$zza1 = zzj.zza(zzfy$zzj1);
                            if(!TextUtils.isEmpty(s1)) {
                                zzfy$zzj$zza1.zza(s1);
                            }
                            String s2 = this.zzi().zzf(s);
                            if(!TextUtils.isEmpty(s2)) {
                                zzfy$zzj$zza1.zzb(s2);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for(Object object1: zzfy$zzj1.zzf()) {
                                com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza1 = zzk.zza(((zzk)object1));
                                zzfy$zzk$zza1.zzk();
                                arrayList2.add(((zzk)(((zzjt)zzfy$zzk$zza1.zzai()))));
                            }
                            zzfy$zzj$zza1.zzb();
                            zzfy$zzj$zza1.zza(arrayList2);
                            zzag zzag0 = this.zze();
                            zzfz zzfz0 = zzbh.zzcc;
                            if(zzag0.zza(zzfz0)) {
                                this.zzj().zzp().zza("Processed MeasurementBatch for sGTM with sgtmJoinId: ", (TextUtils.isEmpty(s1) ? "null" : zzfy$zzj$zza1.zzc()));
                            }
                            else {
                                this.zzj().zzp().zza("Processed MeasurementBatch for sGTM.");
                            }
                            zzj zzfy$zzj2 = (zzj)(((zzjt)zzfy$zzj$zza1.zzai()));
                            if(!TextUtils.isEmpty(s1) && this.zze().zza(zzfz0)) {
                                zzj zzfy$zzj3 = (zzj)(((zzjt)zzfy$zzj$zza0.zzai()));
                                this.zzl().zzt();
                                this.zzs();
                                com.google.android.gms.internal.measurement.zzfy.zzj.zza zzfy$zzj$zza2 = zzj.zzb();
                                this.zzj().zzp().zza("Processing Google Signal, sgtmJoinId:", s1);
                                zzfy$zzj$zza2.zza(s1);
                                for(Object object2: zzfy$zzj3.zzf()) {
                                    zzfy$zzj$zza2.zza(zzk.zzw().zzj("").zzg(((zzk)object2).zzd()));
                                }
                                zzj zzfy$zzj4 = (zzj)(((zzjt)zzfy$zzj$zza2.zzai()));
                                String s3 = this.zzk.zzm().zzf(s);
                                if(TextUtils.isEmpty(s3)) {
                                    zznw1 = new zznw("https://app-measurement.com/s", zznt.zzb);
                                }
                                else {
                                    Uri uri0 = Uri.parse("https://app-measurement.com/s");
                                    Uri.Builder uri$Builder0 = uri0.buildUpon();
                                    uri$Builder0.authority(s3 + "." + uri0.getAuthority());
                                    zznw1 = new zznw(uri$Builder0.build().toString(), zznt.zzb);
                                }
                                arrayList1.add(Pair.create(zzfy$zzj4, zznw1));
                            }
                            zzfy$zzj0 = zzfy$zzj2;
                        }
                    }
                    String s4 = this.zzj().zza(2) ? this.zzp().zza(zzfy$zzj0) : null;
                    String s5 = "?";
                    this.zzp();
                    byte[] arr_b1 = zzfy$zzj0.zzca();
                    if(!zzpb.zza() || !this.zze().zza(zzbh.zzcf)) {
                        try {
                            this.zza(arrayList0);
                            this.zzj.zze.zza(v1);
                            if(v8 > 0) {
                                s5 = "";
                            }
                            this.zzj().zzp().zza("Uploading data. app, uncompressed size, data", s5, ((int)arr_b1.length), s4);
                            this.zzv = true;
                            zzgr0 = this.zzh();
                            uRL0 = new URL(zznw0.zzb());
                            map0 = zznw0.zzc();
                            zzoc0 = new zzoc(this, s, arrayList1);
                            zznw2 = zznw0;
                            goto label_185;
                        }
                        catch(MalformedURLException unused_ex) {
                        }
                        zznw2 = zznw0;
                        this.zzj().zzg().zza("Failed to parse upload URL. Not uploading. appId", zzgo.zza(s), zznw2.zzb());
                        return;
                        try {
                        label_185:
                            zzgr0.zza(s, uRL0, arr_b1, map0, zzoc0);
                        }
                        catch(MalformedURLException unused_ex) {
                            this.zzj().zzg().zza("Failed to parse upload URL. Not uploading. appId", zzgo.zza(s), zznw2.zzb());
                        }
                    }
                    else {
                        this.zza(arrayList0);
                        this.zzj.zze.zza(v1);
                        if(v8 > 0) {
                            s5 = "";
                        }
                        this.zzj().zzp().zza("Uploading data. app, uncompressed size, data", s5, ((int)arr_b1.length), s4);
                        this.zzv = true;
                        this.zzh().zza(s, zznw0, zzfy$zzj0, new zznz(this, s, arrayList1));
                    }
                }
            }
        }
        finally {
            this.zzw = false;
            this.zzaa();
        }
    }

    private final long zzx() {
        long v = this.zzb().currentTimeMillis();
        zzmw zzmw0 = this.zzj;
        zzmw0.zzal();
        zzmw0.zzt();
        long v1 = zzmw0.zzf.zza();
        if(v1 == 0L) {
            v1 = ((long)zzmw0.zzq().zzv().nextInt(86400000)) + 1L;
            zzmw0.zzf.zza(v1);
        }
        return (v + v1) / 1000L / 60L / 60L / 24L;
    }

    private final zzgy zzy() {
        zzgy zzgy0 = this.zze;
        if(zzgy0 == null) {
            throw new IllegalStateException("Network broadcast receiver not created");
        }
        return zzgy0;
    }

    private final zznq zzz() {
        return (zznq)zznv.zza(this.zzf);
    }
}

