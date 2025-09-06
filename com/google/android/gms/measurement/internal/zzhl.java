package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzfr.zza.zze;
import com.google.android.gms.internal.measurement.zzfr.zza.zzf;
import com.google.android.gms.internal.measurement.zzfr.zzd.zza;
import com.google.android.gms.internal.measurement.zzfr.zzd;
import com.google.android.gms.internal.measurement.zzgd.zzc;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.internal.measurement.zzv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import w4.d;

public final class zzhl extends zznr implements zzai {
    @VisibleForTesting
    final LruCache zza;
    final zzv zzb;
    private final Map zzc;
    @VisibleForTesting
    private final Map zzd;
    @VisibleForTesting
    private final Map zze;
    @VisibleForTesting
    private final Map zzf;
    private final Map zzh;
    private final Map zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;

    zzhl(zznv zznv0) {
        super(zznv0);
        this.zzc = new ArrayMap();
        this.zzd = new ArrayMap();
        this.zze = new ArrayMap();
        this.zzf = new ArrayMap();
        this.zzh = new ArrayMap();
        this.zzj = new ArrayMap();
        this.zzk = new ArrayMap();
        this.zzl = new ArrayMap();
        this.zzi = new ArrayMap();
        this.zza = new zzho(this, 20);
        this.zzb = new zzhr(this);
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzoo g_() {
        return super.g_();
    }

    static zzb zza(zzhl zzhl0, String s) {
        zzhl0.zzal();
        Preconditions.checkNotEmpty(s);
        if(!zzhl0.zzk(s)) {
            return null;
        }
        if(zzhl0.zzh.containsKey(s) && zzhl0.zzh.get(s) != null) {
            zzhl0.zza(s, ((zzd)zzhl0.zzh.get(s)));
            return (zzb)zzhl0.zza.snapshot().get(s);
        }
        zzhl0.zzu(s);
        return (zzb)zzhl0.zza.snapshot().get(s);
    }

    @WorkerThread
    private final zzd zza(String s, byte[] arr_b) {
        if(arr_b == null) {
            return zzd.zzg();
        }
        try {
            zzd zzfr$zzd0 = (zzd)(((zzjt)((zza)zzoo.zza(zzd.zze(), arr_b)).zzai()));
            zzgq zzgq0 = this.zzj().zzp();
            String s1 = null;
            Long long0 = zzfr$zzd0.zzr() ? zzfr$zzd0.zzc() : null;
            if(zzfr$zzd0.zzp()) {
                s1 = "";
            }
            zzgq0.zza("Parsed config. version, gmp_app_id", long0, s1);
            return zzfr$zzd0;
        }
        catch(zzkb zzkb0) {
        }
        catch(RuntimeException runtimeException0) {
            this.zzj().zzu().zza("Unable to merge remote config. appId", zzgo.zza(s), runtimeException0);
            return zzd.zzg();
        }
        this.zzj().zzu().zza("Unable to merge remote config. appId", zzgo.zza(s), zzkb0);
        return zzd.zzg();
    }

    private static com.google.android.gms.measurement.internal.zzje.zza zza(zze zzfr$zza$zze0) {
        switch(zzfr$zza$zze0) {
            case 1: {
                return com.google.android.gms.measurement.internal.zzje.zza.zza;
            }
            case 2: {
                return com.google.android.gms.measurement.internal.zzje.zza.zzb;
            }
            case 3: {
                return com.google.android.gms.measurement.internal.zzje.zza.zzc;
            }
            case 4: {
                return com.google.android.gms.measurement.internal.zzje.zza.zzd;
            }
            default: {
                return null;
            }
        }
    }

    private static Map zza(zzd zzfr$zzd0) {
        Map map0 = new ArrayMap();
        if(zzfr$zzd0 != null) {
            Iterator iterator0 = zzfr$zzd0.zzn().iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                map0.put("", "");
            }
        }
        return map0;
    }

    private final void zza(String s, zza zzfr$zzd$zza0) {
        HashSet hashSet0 = new HashSet();
        ArrayMap arrayMap0 = new ArrayMap();
        ArrayMap arrayMap1 = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        if(zzfr$zzd$zza0 != null) {
            Iterator iterator0 = zzfr$zzd$zza0.zze().iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                hashSet0.add("");
            }
            for(int v = 0; v < zzfr$zzd$zza0.zza(); ++v) {
                com.google.android.gms.internal.measurement.zzfr.zzc.zza zzfr$zzc$zza0 = (com.google.android.gms.internal.measurement.zzfr.zzc.zza)zzfr$zzd$zza0.zza(v).zzcd();
                this.zzj().zzu().zza("EventConfig contained null event name");
            }
        }
        this.zzd.put(s, hashSet0);
        this.zze.put(s, arrayMap0);
        this.zzf.put(s, arrayMap1);
        this.zzi.put(s, arrayMap2);
    }

    @WorkerThread
    private final void zza(String s, zzd zzfr$zzd0) {
        if(zzfr$zzd0.zza() == 0) {
            this.zza.remove(s);
            return;
        }
        this.zzj().zzp().zza("EES programs found", zzfr$zzd0.zza());
        zzc zzgd$zzc0 = (zzc)zzfr$zzd0.zzm().get(0);
        try {
            zzb zzb0 = new zzb();
            zzb0.zza("internal.remoteConfig", new zzhn(this, s));
            zzb0.zza("internal.appMetadata", new zzhm(this, s));
            zzb0.zza("internal.logger", new zzhp(this));
            zzb0.zza(zzgd$zzc0);
            this.zza.put(s, zzb0);
            this.zzj().zzp().zza("EES program loaded for appId, activities", s, zzgd$zzc0.zza().zza());
            Iterator iterator0 = zzgd$zzc0.zza().zzd().iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                this.zzj().zzp().zza("EES program activity", "");
            }
        }
        catch(com.google.android.gms.internal.measurement.zzc unused_ex) {
            this.zzj().zzg().zza("Failed to load EES program. appId", s);
        }
    }

    @WorkerThread
    final long zza(String s) {
        String s1 = this.zza(s, "measurement.account.time_zone_offset_minutes");
        if(!TextUtils.isEmpty(s1)) {
            try {
                return Long.parseLong(s1);
            }
            catch(NumberFormatException numberFormatException0) {
                this.zzj().zzu().zza("Unable to parse timezone offset. appId", zzgo.zza(s), numberFormatException0);
            }
        }
        return 0L;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Context zza() {
        return super.zza();
    }

    @WorkerThread
    final zzjh zza(String s, com.google.android.gms.measurement.internal.zzje.zza zzje$zza0) {
        this.zzt();
        this.zzu(s);
        com.google.android.gms.internal.measurement.zzfr.zza zzfr$zza0 = this.zzb(s);
        if(zzfr$zza0 == null) {
            return zzjh.zza;
        }
        for(Object object0: zzfr$zza0.zzf()) {
            com.google.android.gms.internal.measurement.zzfr.zza.zza zzfr$zza$zza0 = (com.google.android.gms.internal.measurement.zzfr.zza.zza)object0;
            if(zzhl.zza(zzfr$zza$zza0.zzc()) == zzje$zza0) {
                switch(zzfr$zza$zza0.zzb()) {
                    case 1: {
                        return zzjh.zzc;
                    }
                    case 2: {
                        return zzjh.zzd;
                    }
                    default: {
                        return zzjh.zza;
                    }
                }
            }
            if(false) {
                break;
            }
        }
        return zzjh.zza;
    }

    @Override  // com.google.android.gms.measurement.internal.zzai
    @WorkerThread
    public final String zza(String s, String s1) {
        this.zzt();
        this.zzu(s);
        Map map0 = (Map)this.zzc.get(s);
        return map0 == null ? null : ((String)map0.get(s1));
    }

    @WorkerThread
    protected final boolean zza(String s, byte[] arr_b, String s1, String s2) {
        this.zzal();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        zza zzfr$zzd$zza0 = (zza)this.zza(s, arr_b).zzcd();
        if(zzfr$zzd$zza0 == null) {
            return false;
        }
        this.zza(s, zzfr$zzd$zza0);
        this.zza(s, ((zzd)(((zzjt)zzfr$zzd$zza0.zzai()))));
        zzd zzfr$zzd0 = (zzd)(((zzjt)zzfr$zzd$zza0.zzai()));
        this.zzh.put(s, zzfr$zzd0);
        String s3 = zzfr$zzd$zza0.zzc();
        this.zzj.put(s, s3);
        this.zzk.put(s, s1);
        this.zzl.put(s, s2);
        Map map0 = zzhl.zza(((zzd)(((zzjt)zzfr$zzd$zza0.zzai()))));
        this.zzc.put(s, map0);
        this.zzh().zza(s, new ArrayList(zzfr$zzd$zza0.zzd()));
        try {
            zzfr$zzd$zza0.zzb();
            arr_b = ((zzd)(((zzjt)zzfr$zzd$zza0.zzai()))).zzca();
        }
        catch(RuntimeException runtimeException0) {
            this.zzj().zzu().zza("Unable to serialize reduced-size config. Storing full config instead. appId", zzgo.zza(s), runtimeException0);
        }
        zzal zzal0 = this.zzh();
        Preconditions.checkNotEmpty(s);
        zzal0.zzt();
        zzal0.zzal();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("remote_config", arr_b);
        contentValues0.put("config_last_modified_time", s1);
        contentValues0.put("e_tag", s2);
        try {
            if(((long)zzal0.e_().update("apps", contentValues0, "app_id = ?", new String[]{s})) == 0L) {
                zzal0.zzj().zzg().zza("Failed to update remote config (got 0). appId", zzgo.zza(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            zzal0.zzj().zzg().zza("Error storing remote config. appId", zzgo.zza(s), sQLiteException0);
        }
        zzd zzfr$zzd1 = (zzd)(((zzjt)zzfr$zzd$zza0.zzai()));
        this.zzh.put(s, zzfr$zzd1);
        return true;
    }

    @WorkerThread
    final int zzb(String s, String s1) {
        this.zzt();
        this.zzu(s);
        Map map0 = (Map)this.zzi.get(s);
        if(map0 != null) {
            Integer integer0 = (Integer)map0.get(s1);
            return integer0 == null ? 1 : ((int)integer0);
        }
        return 1;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    @WorkerThread
    final com.google.android.gms.internal.measurement.zzfr.zza zzb(String s) {
        this.zzt();
        this.zzu(s);
        zzd zzfr$zzd0 = this.zzc(s);
        return zzfr$zzd0 == null || !zzfr$zzd0.zzo() ? null : zzfr$zzd0.zzd();
    }

    @WorkerThread
    final com.google.android.gms.measurement.internal.zzje.zza zzb(String s, com.google.android.gms.measurement.internal.zzje.zza zzje$zza0) {
        this.zzt();
        this.zzu(s);
        com.google.android.gms.internal.measurement.zzfr.zza zzfr$zza0 = this.zzb(s);
        if(zzfr$zza0 == null) {
            return null;
        }
        for(Object object0: zzfr$zza0.zze()) {
            com.google.android.gms.internal.measurement.zzfr.zza.zzc zzfr$zza$zzc0 = (com.google.android.gms.internal.measurement.zzfr.zza.zzc)object0;
            if(zzje$zza0 == zzhl.zza(zzfr$zza$zzc0.zzc())) {
                return zzhl.zza(zzfr$zza$zzc0.zzb());
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @WorkerThread
    protected final zzd zzc(String s) {
        this.zzal();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        this.zzu(s);
        return (zzd)this.zzh.get(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }

    @WorkerThread
    final boolean zzc(String s, com.google.android.gms.measurement.internal.zzje.zza zzje$zza0) {
        this.zzt();
        this.zzu(s);
        com.google.android.gms.internal.measurement.zzfr.zza zzfr$zza0 = this.zzb(s);
        if(zzfr$zza0 == null) {
            return false;
        }
        for(Object object0: zzfr$zza0.zzd()) {
            com.google.android.gms.internal.measurement.zzfr.zza.zza zzfr$zza$zza0 = (com.google.android.gms.internal.measurement.zzfr.zza.zza)object0;
            if(zzje$zza0 == zzhl.zza(zzfr$zza$zza0.zzc())) {
                return zzfr$zza$zza0.zzb() == com.google.android.gms.internal.measurement.zzfr.zza.zzd.zzb;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @WorkerThread
    final boolean zzc(String s, String s1) {
        this.zzt();
        this.zzu(s);
        if("ecommerce_purchase".equals(s1)) {
            return true;
        }
        if(!"purchase".equals(s1) && !"refund".equals(s1)) {
            Map map0 = (Map)this.zzf.get(s);
            if(map0 != null) {
                Boolean boolean0 = (Boolean)map0.get(s1);
                return boolean0 == null ? false : boolean0.booleanValue();
            }
            return false;
        }
        return true;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzab zzd() {
        return super.zzd();
    }

    @WorkerThread
    protected final String zzd(String s) {
        this.zzt();
        return (String)this.zzl.get(s);
    }

    @WorkerThread
    final boolean zzd(String s, String s1) {
        this.zzt();
        this.zzu(s);
        if(this.zzl(s) && zzos.zzg(s1)) {
            return true;
        }
        if(this.zzn(s) && zzos.zzh(s1)) {
            return true;
        }
        Map map0 = (Map)this.zze.get(s);
        if(map0 != null) {
            Boolean boolean0 = (Boolean)map0.get(s1);
            return boolean0 == null ? false : boolean0.booleanValue();
        }
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzag zze() {
        return super.zze();
    }

    @WorkerThread
    protected final String zze(String s) {
        this.zzt();
        return (String)this.zzk.get(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzaz zzf() {
        return super.zzf();
    }

    @WorkerThread
    final String zzf(String s) {
        this.zzt();
        this.zzu(s);
        return (String)this.zzj.get(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzt zzg() {
        return super.zzg();
    }

    @WorkerThread
    final Set zzg(String s) {
        this.zzt();
        this.zzu(s);
        return (Set)this.zzd.get(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzal zzh() {
        return super.zzh();
    }

    @WorkerThread
    final SortedSet zzh(String s) {
        this.zzt();
        this.zzu(s);
        SortedSet sortedSet0 = new TreeSet();
        com.google.android.gms.internal.measurement.zzfr.zza zzfr$zza0 = this.zzb(s);
        if(zzfr$zza0 == null) {
            return sortedSet0;
        }
        for(Object object0: zzfr$zza0.zzc()) {
            sortedSet0.add(((zzf)object0).zzb());
        }
        return sortedSet0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgh zzi() {
        return super.zzi();
    }

    @WorkerThread
    protected final void zzi(String s) {
        this.zzt();
        this.zzk.put(s, null);
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzgo zzj() {
        return super.zzj();
    }

    @WorkerThread
    final void zzj(String s) {
        this.zzt();
        this.zzh.remove(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzha zzk() {
        return super.zzk();
    }

    public final boolean zzk(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        zzd zzfr$zzd0 = (zzd)this.zzh.get(s);
        return zzfr$zzd0 == null ? false : zzfr$zzd0.zza() != 0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzhv zzl() {
        return super.zzl();
    }

    final boolean zzl(String s) {
        return "1".equals(this.zza(s, "measurement.upload.blacklist_internal"));
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzhl zzm() {
        return super.zzm();
    }

    @WorkerThread
    final boolean zzm(String s) {
        this.zzt();
        this.zzu(s);
        com.google.android.gms.internal.measurement.zzfr.zza zzfr$zza0 = this.zzb(s);
        return zzfr$zza0 == null ? true : !zzfr$zza0.zzh() || zzfr$zza0.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzmw zzn() {
        return super.zzn();
    }

    final boolean zzn(String s) {
        return "1".equals(this.zza(s, "measurement.upload.blacklist_public"));
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zznu zzo() {
        return super.zzo();
    }

    @WorkerThread
    final boolean zzo(String s) {
        this.zzt();
        this.zzu(s);
        return this.zzd.get(s) != null && ((Set)this.zzd.get(s)).contains("app_instance_id");
    }

    @WorkerThread
    final boolean zzp(String s) {
        this.zzt();
        this.zzu(s);
        return this.zzd.get(s) != null && (((Set)this.zzd.get(s)).contains("device_model") || ((Set)this.zzd.get(s)).contains("device_info"));
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzos zzq() {
        return super.zzq();
    }

    @WorkerThread
    final boolean zzq(String s) {
        this.zzt();
        this.zzu(s);
        return this.zzd.get(s) != null && ((Set)this.zzd.get(s)).contains("enhanced_user_id");
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzr() {
        super.zzr();
    }

    @WorkerThread
    final boolean zzr(String s) {
        this.zzt();
        this.zzu(s);
        return this.zzd.get(s) != null && ((Set)this.zzd.get(s)).contains("google_signals");
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzs() {
        super.zzs();
    }

    @WorkerThread
    final boolean zzs(String s) {
        this.zzt();
        this.zzu(s);
        return this.zzd.get(s) != null && (((Set)this.zzd.get(s)).contains("os_version") || ((Set)this.zzd.get(s)).contains("device_info"));
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzt() {
        super.zzt();
    }

    @WorkerThread
    final boolean zzt(String s) {
        this.zzt();
        this.zzu(s);
        return this.zzd.get(s) != null && ((Set)this.zzd.get(s)).contains("user_id");
    }

    @WorkerThread
    private final void zzu(String s) {
        this.zzal();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        if(this.zzh.get(s) == null) {
            zzan zzan0 = this.zzh().zzf(s);
            if(zzan0 == null) {
                this.zzc.put(s, null);
                this.zze.put(s, null);
                this.zzd.put(s, null);
                this.zzf.put(s, null);
                this.zzh.put(s, null);
                this.zzj.put(s, null);
                this.zzk.put(s, null);
                this.zzl.put(s, null);
                this.zzi.put(s, null);
                return;
            }
            zza zzfr$zzd$zza0 = (zza)this.zza(s, zzan0.zza).zzcd();
            this.zza(s, zzfr$zzd$zza0);
            Map map0 = zzhl.zza(((zzd)(((zzjt)zzfr$zzd$zza0.zzai()))));
            this.zzc.put(s, map0);
            zzd zzfr$zzd0 = (zzd)(((zzjt)zzfr$zzd$zza0.zzai()));
            this.zzh.put(s, zzfr$zzd0);
            this.zza(s, ((zzd)(((zzjt)zzfr$zzd$zza0.zzai()))));
            String s1 = zzfr$zzd$zza0.zzc();
            this.zzj.put(s, s1);
            this.zzk.put(s, zzan0.zzb);
            this.zzl.put(s, zzan0.zzc);
        }
    }
}

