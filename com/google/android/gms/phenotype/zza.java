package com.google.android.gms.phenotype;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import j..util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import jeb.synthetic.TWR;

public final class zza {
    private final Uri uri;
    private static final ConcurrentHashMap zzg;
    private final ContentResolver zzh;
    private final ContentObserver zzi;
    private final Object zzj;
    private volatile Map zzk;
    private static final String[] zzl;

    static {
        zza.zzg = new ConcurrentHashMap();
        zza.zzl = new String[]{"key", "value"};
    }

    private zza(ContentResolver contentResolver0, Uri uri0) {
        this.zzj = new Object();
        this.zzh = contentResolver0;
        this.uri = uri0;
        this.zzi = new zzb(this, null);
    }

    public static zza zza(ContentResolver contentResolver0, Uri uri0) {
        ConcurrentHashMap concurrentHashMap0 = zza.zzg;
        zza zza0 = (zza)concurrentHashMap0.get(uri0);
        if(zza0 == null) {
            zza0 = new zza(contentResolver0, uri0);
            zza zza1 = (zza)concurrentHashMap0.putIfAbsent(uri0, zza0);
            if(zza1 == null) {
                zza0.zzh.registerContentObserver(zza0.uri, false, zza0.zzi);
                return zza0;
            }
            return zza1;
        }
        return zza0;
    }

    public final Map zza() {
        Map map0 = PhenotypeFlag.zza("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? this.zzc() : this.zzk;
        if(map0 == null) {
            synchronized(this.zzj) {
                map0 = this.zzk;
                if(map0 == null) {
                    map0 = this.zzc();
                    this.zzk = map0;
                }
            }
        }
        return map0;
    }

    public final void zzb() {
        synchronized(this.zzj) {
            this.zzk = null;
        }
    }

    private final Map zzc() {
        Map map0 = new HashMap();
        Cursor cursor0 = this.zzh.query(this.uri, zza.zzl, null, null, null);
        if(cursor0 != null) {
            while(true) {
                try {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    map0.put(cursor0.getString(0), cursor0.getString(1));
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
            }
            cursor0.close();
        }
        return map0;
    }
}

