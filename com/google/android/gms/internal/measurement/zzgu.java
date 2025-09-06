package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import com.google.common.base.H;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzgu implements zzhb {
    @GuardedBy("ConfigurationContentLoader.class")
    private static final Map zza;
    private static final String[] zzb;
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map zzh;
    @GuardedBy("this")
    private final List zzi;

    static {
        zzgu.zza = new ArrayMap();
        zzgu.zzb = new String[]{"key", "value"};
    }

    private zzgu(ContentResolver contentResolver0, Uri uri0, Runnable runnable0) {
        zzgw zzgw0 = new zzgw(this, null);
        this.zzf = zzgw0;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        H.E(contentResolver0);
        H.E(uri0);
        this.zzc = contentResolver0;
        this.zzd = uri0;
        this.zze = runnable0;
        contentResolver0.registerContentObserver(uri0, false, zzgw0);
    }

    public static zzgu zza(ContentResolver contentResolver0, Uri uri0, Runnable runnable0) {
        synchronized(zzgu.class) {
            Map map0 = zzgu.zza;
            zzgu zzgu0 = (zzgu)map0.get(uri0);
            if(zzgu0 == null) {
                try {
                    zzgu zzgu1 = new zzgu(contentResolver0, uri0, runnable0);
                    try {
                        map0.put(uri0, zzgu1);
                    }
                    catch(SecurityException unused_ex) {
                    }
                    zzgu0 = zzgu1;
                }
                catch(SecurityException unused_ex) {
                }
            }
            return zzgu0;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzhb
    public final Object zza(String s) {
        return (String)this.zza().get(s);
    }

    public final Map zza() {
        Map map0 = this.zzh;
        if(map0 == null) {
            synchronized(this.zzg) {
                map0 = this.zzh;
                if(map0 == null) {
                    map0 = this.zze();
                    this.zzh = map0;
                }
            }
        }
        return map0 == null ? Collections.emptyMap() : map0;
    }

    // 检测为 Lambda 实现
    final Map zzb() [...]

    static void zzc() {
        synchronized(zzgu.class) {
            for(Object object0: zzgu.zza.values()) {
                ((zzgu)object0).zzc.unregisterContentObserver(((zzgu)object0).zzf);
            }
            zzgu.zza.clear();
        }
    }

    public final void zzd() {
        synchronized(this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized(this) {
            for(Object object0: this.zzi) {
                ((zzgz)object0).zza();
            }
        }
    }

    private final Map zze() {
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            return (Map)zzha.zza(() -> {
                Map map1;
                ContentProviderClient contentProviderClient0 = this.zzc.acquireUnstableContentProviderClient(this.zzd);
                if(contentProviderClient0 == null) {
                    Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                    return Collections.emptyMap();
                }
                try(Cursor cursor0 = contentProviderClient0.query(this.zzd, zzgu.zzb, null, null, null)) {
                    if(cursor0 != null) {
                        int v1 = cursor0.getCount();
                        if(v1 == 0) {
                            return Collections.emptyMap();
                        }
                        map1 = v1 <= 0x100 ? new ArrayMap(v1) : new HashMap(v1, 1.0f);
                        while(true) {
                            if(!cursor0.moveToNext()) {
                                break;
                            }
                            map1.put(cursor0.getString(0), cursor0.getString(1));
                        }
                        if(!cursor0.isAfterLast()) {
                            Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                            return Collections.emptyMap();
                        }
                        return map1;
                    }
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.emptyMap();
                }
                catch(RemoteException remoteException0) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", remoteException0);
                    return Collections.emptyMap();
                }
                finally {
                    contentProviderClient0.release();
                }
            });
        }
        catch(SecurityException | SQLiteException | IllegalStateException securityException0) {
            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", securityException0);
            return Collections.emptyMap();
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }
}

