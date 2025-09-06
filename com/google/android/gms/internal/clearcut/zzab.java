package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.GuardedBy;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzab {
    private final Uri uri;
    private static final ConcurrentHashMap zzde;
    private final ContentResolver zzdf;
    private final ContentObserver zzdg;
    private final Object zzdh;
    private volatile Map zzdi;
    private final Object zzdj;
    @GuardedBy("listenersLock")
    private final List zzdk;
    private static final String[] zzdl;

    static {
        zzab.zzde = new ConcurrentHashMap();
        zzab.zzdl = new String[]{"key", "value"};
    }

    private zzab(ContentResolver contentResolver0, Uri uri0) {
        this.zzdh = new Object();
        this.zzdj = new Object();
        this.zzdk = new ArrayList();
        this.zzdf = contentResolver0;
        this.uri = uri0;
        this.zzdg = new zzac(this, null);
    }

    public static zzab zza(ContentResolver contentResolver0, Uri uri0) {
        ConcurrentHashMap concurrentHashMap0 = zzab.zzde;
        zzab zzab0 = (zzab)concurrentHashMap0.get(uri0);
        if(zzab0 == null) {
            zzab0 = new zzab(contentResolver0, uri0);
            zzab zzab1 = (zzab)concurrentHashMap0.putIfAbsent(uri0, zzab0);
            if(zzab1 == null) {
                zzab0.zzdf.registerContentObserver(zzab0.uri, false, zzab0.zzdg);
                return zzab0;
            }
            return zzab1;
        }
        return zzab0;
    }

    public final Map zzg() {
        Map map0 = zzae.zza("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? this.zzi() : this.zzdi;
        if(map0 == null) {
            synchronized(this.zzdh) {
                map0 = this.zzdi;
                if(map0 == null) {
                    map0 = this.zzi();
                    this.zzdi = map0;
                }
            }
        }
        return map0 == null ? Collections.emptyMap() : map0;
    }

    public final void zzh() {
        synchronized(this.zzdh) {
            this.zzdi = null;
        }
    }

    private final Map zzi() {
        try {
            Map map0 = new HashMap();
            Cursor cursor0 = this.zzdf.query(this.uri, zzab.zzdl, null, null, null);
            if(cursor0 != null) {
                try {
                    while(cursor0.moveToNext()) {
                        map0.put(cursor0.getString(0), cursor0.getString(1));
                    }
                    return map0;
                }
                finally {
                    cursor0.close();
                }
            }
            return map0;
        }
        catch(SecurityException | SQLiteException unused_ex) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    private final void zzj() {
        synchronized(this.zzdj) {
            for(Object object1: this.zzdk) {
                ((zzad)object1).zzk();
            }
        }
    }
}

