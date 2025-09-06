package com.google.android.gms.internal.vision;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jeb.synthetic.TWR;

public final class zzau implements zzay {
    @GuardedBy("ConfigurationContentLoader.class")
    private static final Map zza;
    private final ContentResolver zzb;
    private final Uri zzc;
    private final ContentObserver zzd;
    private final Object zze;
    private volatile Map zzf;
    @GuardedBy("this")
    private final List zzg;
    private static final String[] zzh;

    static {
        zzau.zza = new ArrayMap();
        zzau.zzh = new String[]{"key", "value"};
    }

    private zzau(ContentResolver contentResolver0, Uri uri0) {
        zzaw zzaw0 = new zzaw(this, null);
        this.zzd = zzaw0;
        this.zze = new Object();
        this.zzg = new ArrayList();
        zzde.zza(contentResolver0);
        zzde.zza(uri0);
        this.zzb = contentResolver0;
        this.zzc = uri0;
        contentResolver0.registerContentObserver(uri0, false, zzaw0);
    }

    public static zzau zza(ContentResolver contentResolver0, Uri uri0) {
        synchronized(zzau.class) {
            Map map0 = zzau.zza;
            zzau zzau0 = (zzau)map0.get(uri0);
            if(zzau0 == null) {
                try {
                    zzau zzau1 = new zzau(contentResolver0, uri0);
                    try {
                        map0.put(uri0, zzau1);
                    }
                    catch(SecurityException unused_ex) {
                    }
                    zzau0 = zzau1;
                }
                catch(SecurityException unused_ex) {
                }
            }
            return zzau0;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzay
    public final Object zza(String s) {
        return (String)this.zzd().get(s);
    }

    public final void zza() {
        synchronized(this.zze) {
            this.zzf = null;
            zzbi.zza();
        }
        synchronized(this) {
            for(Object object0: this.zzg) {
                ((zzaz)object0).zza();
            }
        }
    }

    static void zzb() {
        synchronized(zzau.class) {
            for(Object object0: zzau.zza.values()) {
                ((zzau)object0).zzb.unregisterContentObserver(((zzau)object0).zzd);
            }
            zzau.zza.clear();
        }
    }

    // 检测为 Lambda 实现
    final Map zzc() [...]

    private final Map zzd() {
        Map map0 = this.zzf;
        if(map0 == null) {
            synchronized(this.zze) {
                map0 = this.zzf;
                if(map0 == null) {
                    map0 = this.zze();
                    this.zzf = map0;
                }
            }
        }
        return map0 == null ? Collections.emptyMap() : map0;
    }

    private final Map zze() {
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            return (Map)zzbb.zza(() -> {
                Map map1;
                Map map0;
                Cursor cursor0 = this.zzb.query(this.zzc, zzau.zzh, null, null, null);
                if(cursor0 == null) {
                    return Collections.emptyMap();
                }
                try {
                    int v = cursor0.getCount();
                    if(v != 0) {
                        map0 = v <= 0x100 ? new ArrayMap(v) : new HashMap(v, 1.0f);
                        while(true) {
                            if(!cursor0.moveToNext()) {
                                goto label_12;
                            }
                            map0.put(cursor0.getString(0), cursor0.getString(1));
                        }
                    }
                    goto label_14;
                }
                catch(Throwable throwable0) {
                    goto label_17;
                }
            label_12:
                cursor0.close();
                return map0;
                try {
                label_14:
                    map1 = Collections.emptyMap();
                }
                catch(Throwable throwable0) {
                label_17:
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
                cursor0.close();
                return map1;
            });
        }
        catch(SecurityException | SQLiteException | IllegalStateException unused_ex) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }
}

