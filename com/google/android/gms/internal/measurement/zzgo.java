package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Map;

public final class zzgo implements zzgq {
    @Override  // com.google.android.gms.internal.measurement.zzgq
    @Nullable
    public final String zza(ContentResolver contentResolver0, String s) throws zzgt {
        Uri uri0 = zzgi.zza;
        ContentProviderClient contentProviderClient0 = contentResolver0.acquireUnstableContentProviderClient(uri0);
        if(contentProviderClient0 != null) {
            try(Cursor cursor0 = contentProviderClient0.query(uri0, null, null, new String[]{s}, null)) {
                if(cursor0 == null) {
                    throw new zzgt("ContentProvider query returned null cursor");
                }
                return cursor0.moveToFirst() ? cursor0.getString(1) : null;
            }
            catch(RemoteException remoteException0) {
                throw new zzgt("ContentProvider query failed", remoteException0);
            }
            finally {
                contentProviderClient0.release();
            }
        }
        throw new zzgt("Unable to acquire ContentProviderClient");
    }

    @Override  // com.google.android.gms.internal.measurement.zzgq
    public final Map zza(ContentResolver contentResolver0, String[] arr_s, zzgr zzgr0) throws zzgt {
        Map map0;
        Uri uri0 = zzgi.zzb;
        ContentProviderClient contentProviderClient0 = contentResolver0.acquireUnstableContentProviderClient(uri0);
        if(contentProviderClient0 != null) {
            try(Cursor cursor0 = contentProviderClient0.query(uri0, null, null, arr_s, null)) {
                if(cursor0 == null) {
                    throw new zzgt("ContentProvider query returned null cursor");
                }
                map0 = zzgr0.zza(cursor0.getCount());
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    map0.put(cursor0.getString(0), cursor0.getString(1));
                }
                if(!cursor0.isAfterLast()) {
                    throw new zzgt("Cursor read incomplete (ContentProvider dead?)");
                }
                return map0;
            }
            catch(RemoteException remoteException0) {
                throw new zzgt("ContentProvider query failed", remoteException0);
            }
            finally {
                contentProviderClient0.release();
            }
        }
        throw new zzgt("Unable to acquire ContentProviderClient");
    }
}

