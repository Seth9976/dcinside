package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.TWR;
import w4.d;

public final class zzgf extends zzh {
    private final zzgi zza;
    private boolean zzb;

    zzgf(zzhy zzhy0) {
        super(zzhy0);
        this.zza = new zzgi(this, this.zza(), "google_app_measurement_local.db");
    }

    private static long zza(SQLiteDatabase sQLiteDatabase0) {
        try(Cursor cursor0 = sQLiteDatabase0.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1")) {
            return cursor0.moveToFirst() ? cursor0.getLong(0) : -1L;
        }
    }

    @WorkerThread
    private final boolean zza(int v, byte[] arr_b) {
        long v3;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase1;
        SQLiteDatabase sQLiteDatabase0;
        this.zzt();
        if(this.zzb) {
            return false;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("type", v);
        contentValues0.put("entry", arr_b);
        int v1 = 5;
        int v2 = 0;
        while(true) {
            try {
                sQLiteDatabase0 = null;
                sQLiteDatabase1 = null;
                sQLiteDatabase1 = this.zzad();
                goto label_15;
            }
            catch(SQLiteFullException sQLiteFullException0) {
                goto label_44;
            }
            catch(SQLiteDatabaseLockedException unused_ex) {
                goto label_52;
            }
            catch(SQLiteException sQLiteException0) {
            }
            catch(Throwable throwable0) {
                goto label_80;
            }
            cursor0 = null;
            goto label_64;
        label_15:
            if(sQLiteDatabase1 == null) {
                try {
                    this.zzb = true;
                    return false;
                label_18:
                    sQLiteDatabase1.beginTransaction();
                    cursor0 = sQLiteDatabase1.rawQuery("select count(1) from messages", null);
                    goto label_26;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    goto label_44;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_52;
                }
                catch(SQLiteException sQLiteException0) {
                    cursor0 = null;
                    goto label_63;
                }
                catch(Throwable throwable0) {
                    goto label_80;
                }
            }
            goto label_18;
        label_26:
            if(cursor0 == null) {
                goto label_32;
            }
            else {
                try {
                    if(cursor0.moveToFirst()) {
                        v3 = cursor0.getLong(0);
                    }
                    else {
                        v3 = 0L;
                        goto label_33;
                    label_32:
                        v3 = 0L;
                    }
                label_33:
                    if(v3 >= 100000L) {
                        this.zzj().zzg().zza("Data loss, local db full");
                        long v4 = (long)sQLiteDatabase1.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(100001L - v3)});
                        if(v4 != 100001L - v3) {
                            this.zzj().zzg().zza("Different delete count than expected in local db. expected, received, difference", ((long)(100001L - v3)), v4, ((long)(100001L - v3 - v4)));
                        }
                    }
                    sQLiteDatabase1.insertOrThrow("messages", null, contentValues0);
                    sQLiteDatabase1.setTransactionSuccessful();
                    sQLiteDatabase1.endTransaction();
                    goto label_85;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    goto label_43;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_51;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_63;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            goto label_33;
        label_43:
            sQLiteDatabase0 = cursor0;
            try {
            label_44:
                this.zzj().zzg().zza("Error writing entry; local database full", sQLiteFullException0);
                this.zzb = true;
                if(sQLiteDatabase0 != null) {
                    goto label_47;
                }
                goto label_48;
            }
            catch(Throwable throwable0) {
                goto label_80;
            }
        label_47:
            ((Cursor)sQLiteDatabase0).close();
        label_48:
            if(sQLiteDatabase1 != null) {
                sQLiteDatabase1.close();
                goto label_76;
            label_51:
                sQLiteDatabase0 = cursor0;
                try {
                label_52:
                    SystemClock.sleep(v1);
                    v1 += 20;
                }
                catch(Throwable throwable0) {
                    goto label_80;
                }
                if(sQLiteDatabase0 != null) {
                    ((Cursor)sQLiteDatabase0).close();
                }
                if(sQLiteDatabase1 != null) {
                    sQLiteDatabase1.close();
                    goto label_76;
                label_63:
                    sQLiteDatabase0 = sQLiteDatabase1;
                    try {
                    label_64:
                        if(sQLiteDatabase0 != null && sQLiteDatabase0.inTransaction()) {
                            sQLiteDatabase0.endTransaction();
                        }
                        this.zzj().zzg().zza("Error writing entry to local database", sQLiteException0);
                        this.zzb = true;
                    }
                    catch(Throwable throwable0) {
                        sQLiteDatabase1 = sQLiteDatabase0;
                        break;
                    }
                    if(cursor0 != null) {
                        cursor0.close();
                    }
                    if(sQLiteDatabase0 != null) {
                        sQLiteDatabase0.close();
                    }
                }
            }
        label_76:
            ++v2;
        }
        sQLiteDatabase0 = cursor0;
    label_80:
        if(sQLiteDatabase0 != null) {
            ((Cursor)sQLiteDatabase0).close();
        }
        if(sQLiteDatabase1 != null) {
            sQLiteDatabase1.close();
        }
        throw throwable0;
    label_85:
        if(cursor0 != null) {
            cursor0.close();
        }
        sQLiteDatabase1.close();
        return true;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Context zza() {
        return super.zza();
    }

    public final List zza(int v) {
        zzae zzae0;
        Parcel parcel2;
        zzon zzon0;
        Parcel parcel1;
        zzbf zzbf0;
        Parcel parcel0;
        byte[] arr_b;
        String[] arr_s;
        String s;
        long v4;
        long v3;
        SQLiteDatabase sQLiteDatabase1;
        Cursor cursor1;
        SQLiteDatabase sQLiteDatabase0;
        this.zzt();
        Cursor cursor0 = null;
        if(this.zzb) {
            return null;
        }
        List list0 = new ArrayList();
        if(!this.zzae()) {
            return list0;
        }
        int v1 = 5;
        int v2 = 0;
        while(true) {
            try {
                sQLiteDatabase0 = this.zzad();
            }
            catch(SQLiteFullException sQLiteFullException0) {
                cursor1 = null;
                sQLiteDatabase0 = null;
                goto label_119;
            }
            catch(SQLiteDatabaseLockedException unused_ex) {
                cursor1 = null;
                sQLiteDatabase0 = null;
                goto label_127;
            }
            catch(SQLiteException sQLiteException0) {
                cursor1 = null;
                sQLiteDatabase0 = null;
                goto label_136;
            }
            catch(Throwable throwable0) {
                sQLiteDatabase1 = null;
                goto label_153;
            }
            if(sQLiteDatabase0 == null) {
                try {
                    try {
                        this.zzb = true;
                        return null;
                    }
                    catch(SQLiteDatabaseLockedException unused_ex) {
                        sQLiteDatabase1 = sQLiteDatabase0;
                        cursor1 = null;
                        goto label_126;
                    }
                    try {
                    label_28:
                        v3 = -1L;
                        sQLiteDatabase0.beginTransaction();
                        v4 = zzgf.zza(sQLiteDatabase0);
                        goto label_42;
                    }
                    catch(SQLiteFullException sQLiteFullException0) {
                        cursor1 = null;
                        goto label_119;
                    }
                    catch(SQLiteDatabaseLockedException unused_ex) {
                        sQLiteDatabase1 = sQLiteDatabase0;
                        cursor1 = null;
                        goto label_126;
                    }
                    catch(SQLiteException sQLiteException0) {
                        cursor1 = null;
                        goto label_136;
                    }
                }
                catch(Throwable throwable0) {
                    sQLiteDatabase1 = sQLiteDatabase0;
                    goto label_153;
                }
            }
            goto label_28;
        label_42:
            if(v4 == -1L) {
                s = null;
                arr_s = null;
            }
            else {
                s = "rowid<?";
                arr_s = new String[]{String.valueOf(v4)};
            }
            try {
                sQLiteDatabase1 = sQLiteDatabase0;
                cursor1 = null;
                cursor1 = sQLiteDatabase0.query("messages", new String[]{"rowid", "type", "entry"}, s, arr_s, null, null, "rowid asc", "100");
                goto label_56;
            }
            catch(SQLiteFullException sQLiteFullException0) {
                goto label_118;
            }
            catch(SQLiteDatabaseLockedException unused_ex) {
            }
            catch(SQLiteException sQLiteException0) {
                goto label_135;
            }
            catch(Throwable throwable0) {
                goto label_153;
            }
            cursor1 = null;
            goto label_126;
            try {
            alab1:
                while(true) {
                label_56:
                    if(!cursor1.moveToNext()) {
                        goto label_112;
                    }
                    v3 = cursor1.getLong(0);
                    int v5 = cursor1.getInt(1);
                    arr_b = cursor1.getBlob(2);
                    switch(v5) {
                        case 0: {
                            parcel0 = Parcel.obtain();
                            break alab1;
                        }
                        case 1: {
                            goto label_78;
                        }
                        case 2: {
                            goto label_94;
                        }
                        case 3: {
                            goto label_110;
                        }
                        default: {
                            this.zzj().zzg().zza("Unknown record type in local database");
                        }
                    }
                }
            }
            catch(SQLiteFullException sQLiteFullException0) {
                goto label_118;
            }
            catch(SQLiteDatabaseLockedException unused_ex) {
                goto label_126;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_135;
            }
            catch(Throwable throwable0) {
                break;
            }
            try {
                try {
                    parcel0.unmarshall(arr_b, 0, arr_b.length);
                    parcel0.setDataPosition(0);
                    zzbf0 = (zzbf)zzbf.CREATOR.createFromParcel(parcel0);
                    goto label_74;
                }
                catch(ParseException unused_ex) {
                }
                this.zzj().zzg().zza("Failed to load event from local database");
            }
            catch(Throwable throwable1) {
                goto label_72;
            }
            try {
                parcel0.recycle();
                goto label_56;
            label_72:
                parcel0.recycle();
                throw throwable1;
            label_74:
                parcel0.recycle();
                if(zzbf0 == null) {
                    goto label_56;
                }
                list0.add(zzbf0);
                goto label_56;
            label_78:
                parcel1 = Parcel.obtain();
            }
            catch(SQLiteFullException sQLiteFullException0) {
                goto label_118;
            }
            catch(SQLiteDatabaseLockedException unused_ex) {
                goto label_126;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_135;
            }
            catch(Throwable throwable0) {
                break;
            }
            try {
                try {
                    parcel1.unmarshall(arr_b, 0, arr_b.length);
                    parcel1.setDataPosition(0);
                    zzon0 = (zzon)zzon.CREATOR.createFromParcel(parcel1);
                    goto label_90;
                }
                catch(ParseException unused_ex) {
                }
                this.zzj().zzg().zza("Failed to load user property from local database");
            }
            catch(Throwable throwable2) {
                goto label_88;
            }
            try {
                parcel1.recycle();
                zzon0 = null;
                goto label_91;
            label_88:
                parcel1.recycle();
                throw throwable2;
            label_90:
                parcel1.recycle();
            label_91:
                if(zzon0 == null) {
                    goto label_56;
                }
                list0.add(zzon0);
                goto label_56;
            label_94:
                parcel2 = Parcel.obtain();
            }
            catch(SQLiteFullException sQLiteFullException0) {
                goto label_118;
            }
            catch(SQLiteDatabaseLockedException unused_ex) {
                goto label_126;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_135;
            }
            catch(Throwable throwable0) {
                break;
            }
            try {
                try {
                    parcel2.unmarshall(arr_b, 0, arr_b.length);
                    parcel2.setDataPosition(0);
                    zzae0 = (zzae)zzae.CREATOR.createFromParcel(parcel2);
                    goto label_106;
                }
                catch(ParseException unused_ex) {
                }
                this.zzj().zzg().zza("Failed to load conditional user property from local database");
            }
            catch(Throwable throwable3) {
                goto label_104;
            }
            try {
                parcel2.recycle();
                zzae0 = null;
                goto label_107;
            label_104:
                parcel2.recycle();
                throw throwable3;
            label_106:
                parcel2.recycle();
            label_107:
                if(zzae0 == null) {
                    goto label_56;
                }
                list0.add(zzae0);
                goto label_56;
            label_110:
                this.zzj().zzu().zza("Skipping app launch break");
                goto label_56;
            label_112:
                if(sQLiteDatabase1.delete("messages", "rowid <= ?", new String[]{Long.toString(v3)}) < list0.size()) {
                    this.zzj().zzg().zza("Fewer entries removed from local database than expected");
                }
                sQLiteDatabase1.setTransactionSuccessful();
                sQLiteDatabase1.endTransaction();
                goto label_158;
            }
            catch(SQLiteFullException sQLiteFullException0) {
            }
            catch(SQLiteDatabaseLockedException unused_ex) {
                goto label_126;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_135;
            }
            catch(Throwable throwable0) {
                break;
            }
        label_118:
            sQLiteDatabase0 = sQLiteDatabase1;
            try {
            label_119:
                this.zzj().zzg().zza("Error reading entries from local database", sQLiteFullException0);
                this.zzb = true;
                if(cursor1 != null) {
                    goto label_122;
                }
                goto label_123;
            }
            catch(Throwable throwable0) {
                cursor0 = cursor1;
                sQLiteDatabase1 = sQLiteDatabase0;
                goto label_153;
            }
        label_122:
            cursor1.close();
        label_123:
            if(sQLiteDatabase0 != null) {
                sQLiteDatabase0.close();
                goto label_149;
            label_126:
                sQLiteDatabase0 = sQLiteDatabase1;
                try {
                label_127:
                    SystemClock.sleep(v1);
                    v1 += 20;
                    if(cursor1 != null) {
                        goto label_130;
                    }
                    goto label_131;
                }
                catch(Throwable throwable0) {
                    cursor0 = cursor1;
                    sQLiteDatabase1 = sQLiteDatabase0;
                    goto label_153;
                }
            label_130:
                cursor1.close();
            label_131:
                if(sQLiteDatabase0 != null) {
                    sQLiteDatabase0.close();
                    goto label_149;
                label_135:
                    sQLiteDatabase0 = sQLiteDatabase1;
                    try {
                    label_136:
                        if(sQLiteDatabase0 != null && sQLiteDatabase0.inTransaction()) {
                            sQLiteDatabase0.endTransaction();
                        }
                        this.zzj().zzg().zza("Error reading entries from local database", sQLiteException0);
                        this.zzb = true;
                    }
                    catch(Throwable throwable0) {
                        cursor0 = cursor1;
                        sQLiteDatabase1 = sQLiteDatabase0;
                        goto label_153;
                    }
                    if(cursor1 != null) {
                        cursor1.close();
                    }
                    if(sQLiteDatabase0 != null) {
                        sQLiteDatabase0.close();
                    }
                }
            }
        label_149:
            ++v2;
        }
        cursor0 = cursor1;
    label_153:
        if(cursor0 != null) {
            cursor0.close();
        }
        if(sQLiteDatabase1 != null) {
            sQLiteDatabase1.close();
        }
        throw throwable0;
    label_158:
        cursor1.close();
        sQLiteDatabase1.close();
        return list0;
    }

    public final boolean zza(zzae zzae0) {
        this.zzq();
        byte[] arr_b = zzos.zza(zzae0);
        if(arr_b.length > 0x20000) {
            this.zzj().zzn().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return this.zza(2, arr_b);
    }

    public final boolean zza(zzbf zzbf0) {
        Parcel parcel0 = Parcel.obtain();
        zzbf0.writeToParcel(parcel0, 0);
        byte[] arr_b = parcel0.marshall();
        parcel0.recycle();
        if(arr_b.length > 0x20000) {
            this.zzj().zzn().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return this.zza(0, arr_b);
    }

    public final boolean zza(zzon zzon0) {
        Parcel parcel0 = Parcel.obtain();
        zzon0.writeToParcel(parcel0, 0);
        byte[] arr_b = parcel0.marshall();
        parcel0.recycle();
        if(arr_b.length > 0x20000) {
            this.zzj().zzn().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return this.zza(1, arr_b);
    }

    @WorkerThread
    public final void zzaa() {
        this.zzt();
        try {
            SQLiteDatabase sQLiteDatabase0 = this.zzad();
            if(sQLiteDatabase0 != null) {
                int v = sQLiteDatabase0.delete("messages", null, null);
                if(v > 0) {
                    this.zzj().zzp().zza("Reset local analytics data. records", v);
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error resetting local analytics data. error", sQLiteException0);
        }
    }

    @WorkerThread
    public final boolean zzab() {
        return this.zza(3, new byte[0]);
    }

    @WorkerThread
    public final boolean zzac() {
        SQLiteDatabase sQLiteDatabase0;
        this.zzt();
        if(this.zzb) {
            return false;
        }
        if(!this.zzae()) {
            return false;
        }
        int v = 5;
        int v1 = 0;
        while(true) {
            try {
                try {
                label_7:
                    sQLiteDatabase0 = null;
                    sQLiteDatabase0 = this.zzad();
                    if(sQLiteDatabase0 == null) {
                        this.zzb = true;
                        return false;
                    }
                    sQLiteDatabase0.beginTransaction();
                    sQLiteDatabase0.delete("messages", "type == ?", new String[]{"3"});
                    sQLiteDatabase0.setTransactionSuccessful();
                    sQLiteDatabase0.endTransaction();
                    break;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_23;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_29;
                }
                this.zzj().zzg().zza("Error deleting app launch break from local database", sQLiteFullException0);
                this.zzb = true;
                if(sQLiteDatabase0 != null) {
                    goto label_21;
                }
                goto label_35;
            }
            catch(Throwable throwable0) {
                goto label_38;
            }
        label_21:
            sQLiteDatabase0.close();
            goto label_35;
            try {
            label_23:
                SystemClock.sleep(v);
                v += 20;
                if(sQLiteDatabase0 != null) {
                    goto label_26;
                }
                goto label_35;
            }
            catch(Throwable throwable0) {
                goto label_38;
            }
        label_26:
            sQLiteDatabase0.close();
            goto label_35;
            try {
            label_29:
                if(sQLiteDatabase0 != null && sQLiteDatabase0.inTransaction()) {
                    sQLiteDatabase0.endTransaction();
                }
                this.zzj().zzg().zza("Error deleting app launch break from local database", sQLiteException0);
                this.zzb = true;
                if(sQLiteDatabase0 != null) {
                    goto label_34;
                }
                goto label_35;
            }
            catch(Throwable throwable0) {
                goto label_38;
            }
        label_34:
            sQLiteDatabase0.close();
        label_35:
            ++v1;
            goto label_7;
        label_38:
            TWR.safeClose$NT(sQLiteDatabase0, throwable0);
            throw throwable0;
        }
        sQLiteDatabase0.close();
        return true;
    }

    @VisibleForTesting
    @WorkerThread
    private final SQLiteDatabase zzad() throws SQLiteException {
        if(this.zzb) {
            return null;
        }
        SQLiteDatabase sQLiteDatabase0 = this.zza.getWritableDatabase();
        if(sQLiteDatabase0 == null) {
            this.zzb = true;
            return null;
        }
        return sQLiteDatabase0;
    }

    @VisibleForTesting
    private final boolean zzae() {
        return this.zza().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzb zzc() {
        return super.zzc();
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

