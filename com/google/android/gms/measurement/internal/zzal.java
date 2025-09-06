package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo.zzb;
import com.google.android.gms.internal.measurement.zzfo.zzc;
import com.google.android.gms.internal.measurement.zzfo.zze;
import com.google.android.gms.internal.measurement.zzfy.zzf.zza;
import com.google.android.gms.internal.measurement.zzfy.zzf;
import com.google.android.gms.internal.measurement.zzfy.zzh;
import com.google.android.gms.internal.measurement.zzfy.zzj;
import com.google.android.gms.internal.measurement.zzfy.zzk;
import com.google.android.gms.internal.measurement.zzfy.zzm;
import com.google.android.gms.internal.measurement.zzfy.zzo;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zznm;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import jeb.synthetic.TWR;

final class zzal extends zznr {
    private static final String[] zza;
    private static final String[] zzb;
    private static final String[] zzc;
    private static final String[] zzd;
    private static final String[] zze;
    private static final String[] zzf;
    private static final String[] zzh;
    private static final String[] zzi;
    private static final String[] zzj;
    private static final String[] zzk;
    private final zzat zzl;
    private final zznl zzm;

    static {
        zzal.zza = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
        zzal.zzb = new String[]{"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
        zzal.zzc = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"};
        zzal.zzd = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
        zzal.zze = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
        zzal.zzf = new String[]{"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
        zzal.zzh = new String[]{"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
        zzal.zzi = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
        zzal.zzj = new String[]{"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
        zzal.zzk = new String[]{"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    }

    zzal(zznv zznv0) {
        super(zznv0);
        this.zzm = new zznl(this.zzb());
        this.zzl = new zzat(this, this.zza(), "google_app_measurement.db");
    }

    public final long b_() {
        long v;
        Cursor cursor0;
        try {
            try {
                cursor0 = null;
                cursor0 = this.e_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if(cursor0.moveToFirst()) {
                    v = cursor0.getLong(0);
                    goto label_13;
                }
                goto label_15;
            }
            catch(SQLiteException sQLiteException0) {
            }
            this.zzj().zzg().zza("Error querying raw events", sQLiteException0);
            if(cursor0 != null) {
                goto label_8;
            }
            return -1L;
        }
        catch(Throwable throwable0) {
            goto label_11;
        }
    label_8:
        cursor0.close();
        return -1L;
    label_11:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_13:
        cursor0.close();
        return v;
    label_15:
        cursor0.close();
        return -1L;
    }

    @WorkerThread
    public final long c_() {
        return this.zza("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    @WorkerThread
    public final long d_() {
        return this.zza("select max(timestamp) from raw_events", null, 0L);
    }

    @VisibleForTesting
    @WorkerThread
    final SQLiteDatabase e_() {
        this.zzt();
        try {
            return this.zzl.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzu().zza("Error opening database", sQLiteException0);
            throw sQLiteException0;
        }
    }

    @WorkerThread
    public final String f_() {
        String s;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        try {
            cursor0 = null;
            cursor0 = sQLiteDatabase0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
        }
        catch(SQLiteException sQLiteException0) {
            goto label_7;
        }
        try {
            try {
                if(cursor0.moveToFirst()) {
                    s = cursor0.getString(0);
                    goto label_14;
                }
                goto label_16;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_7:
            this.zzj().zzg().zza("Database error getting next bundle app id", sQLiteException0);
            if(cursor0 != null) {
                goto label_9;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_12;
        }
    label_9:
        cursor0.close();
        return null;
    label_12:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_14:
        cursor0.close();
        return s;
    label_16:
        cursor0.close();
        return null;
    }

    @WorkerThread
    private final long zza(String s, String[] arr_s, long v) {
        long v1;
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(cursor0.moveToFirst()) {
                    v1 = cursor0.getLong(0);
                    goto label_12;
                }
                goto label_14;
            }
            catch(SQLiteException sQLiteException0) {
                this.zzj().zzg().zza("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_12:
        cursor0.close();
        return v1;
    label_14:
        cursor0.close();
        return v;
    }

    // 检测为 Lambda 实现
    static zzje zza(Cursor cursor0) [...]

    @VisibleForTesting
    @WorkerThread
    private final Object zza(Cursor cursor0, int v) {
        int v1 = cursor0.getType(v);
        switch(v1) {
            case 0: {
                this.zzj().zzg().zza("Loaded invalid null value from database");
                return null;
            }
            case 1: {
                return cursor0.getLong(v);
            }
            case 2: {
                return cursor0.getDouble(v);
            }
            case 3: {
                return cursor0.getString(v);
            }
            case 4: {
                this.zzj().zzg().zza("Loaded invalid blob type value, ignoring it");
                return null;
            }
            default: {
                this.zzj().zzg().zza("Loaded invalid unknown value type, ignoring it", v1);
                return null;
            }
        }
    }

    @WorkerThread
    private final Object zza(String s, String[] arr_s, zzau zzau0) {
        Object object0;
        Cursor cursor0 = null;
        try {
            cursor0 = this.e_().rawQuery(s, arr_s);
            goto label_6;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_13;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
        label_6:
            if(!cursor0.moveToFirst()) {
                this.zzj().zzp().zza("No data found");
                goto label_8;
            }
            goto label_10;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_13;
        }
        catch(Throwable throwable0) {
            goto label_18;
        }
    label_8:
        cursor0.close();
        return null;
        try {
            try {
            label_10:
                object0 = zzau0.zza(cursor0);
                goto label_20;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_13:
            this.zzj().zzg().zza("Error querying database.", sQLiteException0);
            if(cursor0 != null) {
                goto label_15;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_18;
        }
    label_15:
        cursor0.close();
        return null;
    label_18:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_20:
        cursor0.close();
        return object0;
    }

    @WorkerThread
    private final String zza(String s, String[] arr_s, String s1) {
        String s2;
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(cursor0.moveToFirst()) {
                    s2 = cursor0.getString(0);
                    goto label_12;
                }
                goto label_14;
            }
            catch(SQLiteException sQLiteException0) {
                this.zzj().zzg().zza("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_12:
        cursor0.close();
        return s2;
    label_14:
        cursor0.close();
        return s1;
    }

    @WorkerThread
    private static void zza(ContentValues contentValues0, String s, Object object0) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(object0);
        if(object0 instanceof String) {
            contentValues0.put(s, ((String)object0));
            return;
        }
        if(object0 instanceof Long) {
            contentValues0.put(s, ((Long)object0));
            return;
        }
        if(!(object0 instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        }
        contentValues0.put(s, ((Double)object0));
    }

    @WorkerThread
    private final void zza(String s, zzbb zzbb0) {
        Preconditions.checkNotNull(zzbb0);
        this.zzt();
        this.zzal();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", zzbb0.zza);
        contentValues0.put("name", zzbb0.zzb);
        contentValues0.put("lifetime_count", zzbb0.zzc);
        contentValues0.put("current_bundle_count", zzbb0.zzd);
        contentValues0.put("last_fire_timestamp", zzbb0.zzf);
        contentValues0.put("last_bundled_timestamp", zzbb0.zzg);
        contentValues0.put("last_bundled_day", zzbb0.zzh);
        contentValues0.put("last_sampled_complex_event_id", zzbb0.zzi);
        contentValues0.put("last_sampling_rate", zzbb0.zzj);
        contentValues0.put("current_session_count", zzbb0.zze);
        contentValues0.put("last_exempt_from_sampling", (zzbb0.zzk == null || !zzbb0.zzk.booleanValue() ? null : 1L));
        try {
            if(this.e_().insertWithOnConflict(s, null, contentValues0, 5) == -1L) {
                this.zzj().zzg().zza("Failed to insert/update event aggregates (got -1). appId", zzgo.zza(zzbb0.zza));
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing event aggregates. appId", zzgo.zza(zzbb0.zza), sQLiteException0);
        }
    }

    @WorkerThread
    private final void zza(String s, String s1, ContentValues contentValues0) {
        try {
            SQLiteDatabase sQLiteDatabase0 = this.e_();
            String s2 = contentValues0.getAsString(s1);
            if(s2 == null) {
                this.zzj().zzm().zza("Value of the primary key is not set.", zzgo.zza(s1));
                return;
            }
            if(((long)sQLiteDatabase0.update(s, contentValues0, s1 + " = ?", new String[]{s2})) == 0L && sQLiteDatabase0.insertWithOnConflict(s, null, contentValues0, 5) == -1L) {
                this.zzj().zzg().zza("Failed to insert/update table (got -1). key", zzgo.zza(s), zzgo.zza(s1));
            }
            return;
        }
        catch(SQLiteException sQLiteException0) {
        }
        this.zzj().zzg().zza("Error storing into table. key", zzgo.zza(s), zzgo.zza(s1), sQLiteException0);
    }

    private final boolean zza(long v, zzbc zzbc0, long v1, boolean z) {
        this.zzt();
        this.zzal();
        Preconditions.checkNotNull(zzbc0);
        Preconditions.checkNotEmpty(zzbc0.zza);
        byte[] arr_b = this.g_().zza(zzbc0).zzca();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", zzbc0.zza);
        contentValues0.put("name", zzbc0.zzb);
        contentValues0.put("timestamp", zzbc0.zzd);
        contentValues0.put("metadata_fingerprint", v1);
        contentValues0.put("data", arr_b);
        contentValues0.put("realtime", ((int)z));
        try {
            long v2 = (long)this.e_().update("raw_events", contentValues0, "rowid = ?", new String[]{String.valueOf(v)});
            if(v2 != 1L) {
                this.zzj().zzg().zza("Failed to update raw event. appId, updatedRows", zzgo.zza(zzbc0.zza), v2);
                return false;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error updating raw event. appId", zzgo.zza(zzbc0.zza), sQLiteException0);
            return false;
        }
    }

    @WorkerThread
    private final boolean zza(String s, int v, zzb zzfo$zzb0) {
        this.zzal();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(zzfo$zzb0);
        Integer integer0 = null;
        zzgq zzgq0 = this.zzj().zzu();
        Object object0 = zzgo.zza(s);
        Integer integer1 = v;
        if(zzfo$zzb0.zzl()) {
            integer0 = zzfo$zzb0.zzb();
        }
        zzgq0.zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", object0, integer1, String.valueOf(integer0));
        return false;
    }

    @WorkerThread
    private final boolean zza(String s, int v, zze zzfo$zze0) {
        this.zzal();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(zzfo$zze0);
        Integer integer0 = null;
        zzgq zzgq0 = this.zzj().zzu();
        Object object0 = zzgo.zza(s);
        Integer integer1 = v;
        if(zzfo$zze0.zzi()) {
            integer0 = zzfo$zze0.zza();
        }
        zzgq0.zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", object0, integer1, String.valueOf(integer0));
        return false;
    }

    @WorkerThread
    public final int zza(String s, String s1) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzt();
        this.zzal();
        try {
            return this.e_().delete("conditional_properties", "app_id=? and name=?", new String[]{s, s1});
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error deleting conditional property", zzgo.zza(s), this.zzi().zzc(s1), sQLiteException0);
            return 0;
        }
    }

    public final long zza(zzk zzfy$zzk0) throws IOException {
        this.zzt();
        this.zzal();
        Preconditions.checkNotNull(zzfy$zzk0);
        Preconditions.checkNotEmpty("");
        byte[] arr_b = zzfy$zzk0.zzca();
        long v = this.g_().zza(arr_b);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", "");
        contentValues0.put("metadata_fingerprint", v);
        contentValues0.put("metadata", arr_b);
        try {
            this.e_().insertWithOnConflict("raw_events_metadata", null, contentValues0, 4);
            return v;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing raw event metadata. appId", zzgo.zza(""), sQLiteException0);
            throw sQLiteException0;
        }
    }

    public final long zza(String s) {
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzal();
        try {
            return (long)this.e_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{s, String.valueOf(Math.max(0, Math.min(1000000, this.zze().zzb(s, zzbh.zzp))))});
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error deleting over the limit events. appId", zzgo.zza(s), sQLiteException0);
            return 0L;
        }
    }

    public final Pair zza(String s, Long long0) {
        Pair pair0;
        zzf zzfy$zzf0;
        Long long1;
        Cursor cursor0;
        this.zzt();
        this.zzal();
        try {
            cursor0 = null;
            cursor0 = this.e_().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{s, String.valueOf(long0)});
            goto label_8;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_23;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
        label_8:
            if(!cursor0.moveToFirst()) {
                this.zzj().zzp().zza("Main event not found");
                goto label_10;
            }
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_23;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
    label_10:
        cursor0.close();
        return null;
        try {
        label_12:
            byte[] arr_b = cursor0.getBlob(0);
            long1 = cursor0.getLong(1);
            try {
                zzfy$zzf0 = (zzf)(((zzjt)((zza)zzoo.zza(zzf.zze(), arr_b)).zzai()));
                goto label_20;
            }
            catch(IOException iOException0) {
            }
            this.zzj().zzg().zza("Failed to merge main event. appId, eventId", zzgo.zza(s), long0, iOException0);
        }
        catch(SQLiteException sQLiteException0) {
            goto label_23;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
        cursor0.close();
        return null;
        try {
            try {
            label_20:
                pair0 = Pair.create(zzfy$zzf0, long1);
                goto label_30;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_23:
            this.zzj().zzg().zza("Error selecting main event", sQLiteException0);
            if(cursor0 != null) {
                goto label_25;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
    label_25:
        cursor0.close();
        return null;
    label_28:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_30:
        cursor0.close();
        return pair0;
    }

    @WorkerThread
    public final zzaq zza(long v, String s, long v1, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzal();
        String[] arr_s = {s};
        zzaq zzaq0 = new zzaq();
        Cursor cursor0 = null;
        try {
            SQLiteDatabase sQLiteDatabase0 = this.e_();
            cursor0 = sQLiteDatabase0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{s}, null, null, null);
            if(cursor0.moveToFirst()) {
                if(cursor0.getLong(0) == v) {
                    zzaq0.zzb = cursor0.getLong(1);
                    zzaq0.zza = cursor0.getLong(2);
                    zzaq0.zzc = cursor0.getLong(3);
                    zzaq0.zzd = cursor0.getLong(4);
                    zzaq0.zze = cursor0.getLong(5);
                    zzaq0.zzf = cursor0.getLong(6);
                    zzaq0.zzg = cursor0.getLong(7);
                }
                if(z) {
                    zzaq0.zzb += v1;
                }
                if(z1) {
                    zzaq0.zza += v1;
                }
                if(z2) {
                    zzaq0.zzc += v1;
                }
                if(z3) {
                    zzaq0.zzd += v1;
                }
                if(z4) {
                    zzaq0.zze += v1;
                }
                if(z5) {
                    zzaq0.zzf += v1;
                }
                if(z6) {
                    zzaq0.zzg += v1;
                }
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("day", v);
                contentValues0.put("daily_public_events_count", zzaq0.zza);
                contentValues0.put("daily_events_count", zzaq0.zzb);
                contentValues0.put("daily_conversions_count", zzaq0.zzc);
                contentValues0.put("daily_error_events_count", zzaq0.zzd);
                contentValues0.put("daily_realtime_events_count", zzaq0.zze);
                contentValues0.put("daily_realtime_dcu_count", zzaq0.zzf);
                contentValues0.put("daily_registered_triggers_count", zzaq0.zzg);
                sQLiteDatabase0.update("apps", contentValues0, "app_id=?", arr_s);
                goto label_41;
            }
            goto label_43;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_46;
        }
        catch(Throwable throwable0) {
            goto label_51;
        }
    label_41:
        cursor0.close();
        return zzaq0;
        try {
            try {
            label_43:
                this.zzj().zzu().zza("Not updating daily counts, app is not known. appId", zzgo.zza(s));
                goto label_53;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_46:
            this.zzj().zzg().zza("Error updating daily counts. appId", zzgo.zza(s), sQLiteException0);
            if(cursor0 != null) {
                goto label_48;
            }
            return zzaq0;
        }
        catch(Throwable throwable0) {
            goto label_51;
        }
    label_48:
        cursor0.close();
        return zzaq0;
    label_51:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_53:
        cursor0.close();
        return zzaq0;
    }

    @WorkerThread
    public final zzaq zza(long v, String s, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return this.zza(v, s, 1L, false, false, z2, false, z4, z5, z6);
    }

    public final String zza(long v) {
        String s;
        Cursor cursor0;
        this.zzt();
        this.zzal();
        try {
            cursor0 = null;
            cursor0 = this.e_().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(v)});
            goto label_8;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_15;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
        label_8:
            if(!cursor0.moveToFirst()) {
                this.zzj().zzp().zza("No expired configs for apps with pending events");
                goto label_10;
            }
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_15;
        }
        catch(Throwable throwable0) {
            goto label_20;
        }
    label_10:
        cursor0.close();
        return null;
        try {
            try {
            label_12:
                s = cursor0.getString(0);
                goto label_22;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_15:
            this.zzj().zzg().zza("Error selecting expired configs", sQLiteException0);
            if(cursor0 != null) {
                goto label_17;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_20;
        }
    label_17:
        cursor0.close();
        return null;
    label_20:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_22:
        cursor0.close();
        return s;
    }

    @WorkerThread
    public final List zza(String s, int v, int v1) {
        List list2;
        List list1;
        com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza0;
        byte[] arr_b1;
        List list0;
        this.zzt();
        this.zzal();
        Preconditions.checkArgument(v > 0);
        Preconditions.checkArgument(v1 > 0);
        Preconditions.checkNotEmpty(s);
        Cursor cursor0 = null;
        try {
            cursor0 = this.e_().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{s}, null, null, "rowid", String.valueOf(v));
            if(cursor0.moveToFirst()) {
                list0 = new ArrayList();
                int v2 = 0;
                while(true) {
                    long v3 = cursor0.getLong(0);
                    try {
                        byte[] arr_b = cursor0.getBlob(1);
                        arr_b1 = this.g_().zzc(arr_b);
                    }
                    catch(IOException iOException0) {
                        this.zzj().zzg().zza("Failed to unzip queued bundle. appId", zzgo.zza(s), iOException0);
                        goto label_41;
                    }
                    if(!list0.isEmpty() && arr_b1.length + v2 > v1) {
                        goto label_42;
                    }
                    try {
                        zzfy$zzk$zza0 = (com.google.android.gms.internal.measurement.zzfy.zzk.zza)zzoo.zza(zzk.zzw(), arr_b1);
                    }
                    catch(IOException iOException1) {
                        this.zzj().zzg().zza("Failed to merge queued bundle. appId", zzgo.zza(s), iOException1);
                        goto label_41;
                    }
                    if(!list0.isEmpty()) {
                        zzk zzfy$zzk0 = (zzk)((Pair)list0.get(0)).first;
                        zzk zzfy$zzk1 = (zzk)(((zzjt)zzfy$zzk$zza0.zzai()));
                        if(zzfy$zzk0.zzau() != zzfy$zzk1.zzau()) {
                            goto label_42;
                        }
                        for(Object object0: zzfy$zzk0.zzas()) {
                            zzo zzfy$zzo0 = (zzo)object0;
                        }
                        for(Object object1: zzfy$zzk1.zzas()) {
                            zzo zzfy$zzo1 = (zzo)object1;
                        }
                    }
                    if(!cursor0.isNull(2)) {
                        zzfy$zzk$zza0.zzi(cursor0.getInt(2));
                    }
                    v2 += arr_b1.length;
                    list0.add(Pair.create(((zzk)(((zzjt)zzfy$zzk$zza0.zzai()))), v3));
                label_41:
                    if(cursor0.moveToNext() && v2 <= v1) {
                        continue;
                    }
                    goto label_42;
                }
            }
            goto label_44;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_47;
        }
        catch(Throwable throwable0) {
            goto label_53;
        }
    label_42:
        cursor0.close();
        return list0;
        try {
            try {
            label_44:
                list1 = Collections.emptyList();
                goto label_55;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_47:
            this.zzj().zzg().zza("Error querying bundles. appId", zzgo.zza(s), sQLiteException0);
            list2 = Collections.emptyList();
            if(cursor0 != null) {
                goto label_50;
            }
            return list2;
        }
        catch(Throwable throwable0) {
            goto label_53;
        }
    label_50:
        cursor0.close();
        return list2;
    label_53:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_55:
        cursor0.close();
        return list1;
    }

    @WorkerThread
    public final List zza(String s, String s1, String s2) {
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzal();
        ArrayList arrayList0 = new ArrayList(3);
        arrayList0.add(s);
        StringBuilder stringBuilder0 = new StringBuilder("app_id=?");
        if(!TextUtils.isEmpty(s1)) {
            arrayList0.add(s1);
            stringBuilder0.append(" and origin=?");
        }
        if(!TextUtils.isEmpty(s2)) {
            arrayList0.add(s2 + "*");
            stringBuilder0.append(" and name glob ?");
        }
        return this.zza(stringBuilder0.toString(), ((String[])arrayList0.toArray(new String[arrayList0.size()])));
    }

    public final List zza(String s, String[] arr_s) {
        List list1;
        this.zzt();
        this.zzal();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = this.e_().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, s, arr_s, null, null, "rowid", "1001");
            if(cursor0.moveToFirst()) {
                while(true) {
                    if(list0.size() >= 1000) {
                        goto label_25;
                    }
                    boolean z = false;
                    String s1 = cursor0.getString(0);
                    String s2 = cursor0.getString(1);
                    String s3 = cursor0.getString(2);
                    Object object0 = this.zza(cursor0, 3);
                    if(cursor0.getInt(4) != 0) {
                        z = true;
                    }
                    String s4 = cursor0.getString(5);
                    long v = cursor0.getLong(6);
                    Parcelable parcelable0 = this.g_().zza(cursor0.getBlob(7), zzbf.CREATOR);
                    long v1 = cursor0.getLong(8);
                    Parcelable parcelable1 = this.g_().zza(cursor0.getBlob(9), zzbf.CREATOR);
                    long v2 = cursor0.getLong(10);
                    long v3 = cursor0.getLong(11);
                    Parcelable parcelable2 = this.g_().zza(cursor0.getBlob(12), zzbf.CREATOR);
                    list0.add(new zzae(s1, s2, new zzon(s3, v2, object0, s2), v1, z, s4, ((zzbf)parcelable0), v, ((zzbf)parcelable1), v3, ((zzbf)parcelable2)));
                    if(!cursor0.moveToNext()) {
                        goto label_24;
                    }
                }
            }
            goto label_38;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_28;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
    label_24:
        goto label_36;
        try {
            try {
            label_25:
                this.zzj().zzg().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
                goto label_36;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_28:
            this.zzj().zzg().zza("Error querying conditional user property value", sQLiteException0);
            list1 = Collections.emptyList();
            if(cursor0 != null) {
                goto label_31;
            }
            return list1;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
    label_31:
        cursor0.close();
        return list1;
    label_34:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_36:
        cursor0.close();
        return list0;
    label_38:
        cursor0.close();
        return list0;
    }

    @WorkerThread
    public final void zza(zzbb zzbb0) {
        this.zza("events", zzbb0);
    }

    @WorkerThread
    public final void zza(zzg zzg0, boolean z, boolean z1) {
        Preconditions.checkNotNull(zzg0);
        this.zzt();
        this.zzal();
        String s = zzg0.zzac();
        Preconditions.checkNotNull(s);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        if(!zznm.zza() || !this.zze().zza(zzbh.zzcy)) {
            contentValues0.put("app_instance_id", zzg0.zzad());
        }
        else if(z) {
            contentValues0.put("app_instance_id", null);
        }
        else if(this.zzg.zzb(s).zza(com.google.android.gms.measurement.internal.zzje.zza.zzb)) {
            contentValues0.put("app_instance_id", zzg0.zzad());
        }
        contentValues0.put("gmp_app_id", zzg0.zzah());
        if(!zznm.zza() || !this.zze().zza(zzbh.zzcy) || this.zzg.zzb(s).zza(com.google.android.gms.measurement.internal.zzje.zza.zza)) {
            contentValues0.put("resettable_device_id_hash", zzg0.zzaj());
        }
        contentValues0.put("last_bundle_index", zzg0.zzt());
        contentValues0.put("last_bundle_start_timestamp", zzg0.zzu());
        contentValues0.put("last_bundle_end_timestamp", zzg0.zzs());
        contentValues0.put("app_version", zzg0.zzaf());
        contentValues0.put("app_store", zzg0.zzae());
        contentValues0.put("gmp_version", zzg0.zzq());
        contentValues0.put("dev_cert_hash", zzg0.zzn());
        contentValues0.put("measurement_enabled", Boolean.valueOf(zzg0.zzar()));
        contentValues0.put("day", zzg0.zzm());
        contentValues0.put("daily_public_events_count", zzg0.zzk());
        contentValues0.put("daily_events_count", zzg0.zzj());
        contentValues0.put("daily_conversions_count", zzg0.zzh());
        contentValues0.put("config_fetched_time", zzg0.zzg());
        contentValues0.put("failed_config_fetch_time", zzg0.zzp());
        contentValues0.put("app_version_int", zzg0.zze());
        contentValues0.put("firebase_instance_id", zzg0.zzag());
        contentValues0.put("daily_error_events_count", zzg0.zzi());
        contentValues0.put("daily_realtime_events_count", zzg0.zzl());
        contentValues0.put("health_monitor_sample", zzg0.zzai());
        contentValues0.put("android_id", zzg0.zzd());
        contentValues0.put("adid_reporting_enabled", Boolean.valueOf(zzg0.zzaq()));
        contentValues0.put("admob_app_id", zzg0.zzaa());
        contentValues0.put("dynamite_version", zzg0.zzo());
        if(!zznm.zza() || !this.zze().zza(zzbh.zzcy) || this.zzg.zzb(s).zza(com.google.android.gms.measurement.internal.zzje.zza.zzb)) {
            contentValues0.put("session_stitching_token", zzg0.zzal());
        }
        contentValues0.put("sgtm_upload_enabled", Boolean.valueOf(zzg0.zzat()));
        contentValues0.put("target_os_version", zzg0.zzw());
        contentValues0.put("session_stitching_token_hash", zzg0.zzv());
        if(zzpn.zza() && this.zze().zze(s, zzbh.zzch)) {
            contentValues0.put("ad_services_version", zzg0.zza());
            contentValues0.put("attribution_eligibility_status", zzg0.zzf());
        }
        contentValues0.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzg0.zzau()));
        contentValues0.put("npa_metadata_value", zzg0.zzx());
        if(zzpu.zza() && this.zze().zze(s, zzbh.zzbx)) {
            this.zzq();
            if(zzos.zzf(s)) {
                contentValues0.put("bundle_delivery_index", zzg0.zzr());
            }
        }
        if(zzpu.zza() && this.zze().zze(s, zzbh.zzby)) {
            contentValues0.put("sgtm_preview_key", zzg0.zzam());
        }
        contentValues0.put("dma_consent_state", zzg0.zzc());
        contentValues0.put("daily_realtime_dcu_count", zzg0.zzb());
        contentValues0.put("serialized_npa_metadata", zzg0.zzak());
        List list0 = zzg0.zzan();
        if(list0 != null) {
            if(list0.isEmpty()) {
                this.zzj().zzu().zza("Safelisted events should not be an empty list. appId", s);
            }
            else {
                contentValues0.put("safelisted_events", TextUtils.join(",", list0));
            }
        }
        if(zzny.zza() && this.zze().zza(zzbh.zzbu) && !contentValues0.containsKey("safelisted_events")) {
            contentValues0.put("safelisted_events", null);
        }
        if(this.zze().zza(zzbh.zzcw)) {
            contentValues0.put("unmatched_pfo", zzg0.zzy());
            contentValues0.put("unmatched_uwa", zzg0.zzz());
        }
        if(zzov.zza() && this.zze().zze(s, zzbh.zzcu)) {
            contentValues0.put("ad_campaign_info", zzg0.zzav());
        }
        try {
            SQLiteDatabase sQLiteDatabase0 = this.e_();
            if(((long)sQLiteDatabase0.update("apps", contentValues0, "app_id = ?", new String[]{s})) == 0L && sQLiteDatabase0.insertWithOnConflict("apps", null, contentValues0, 5) == -1L) {
                this.zzj().zzg().zza("Failed to insert/update app (got -1). appId", zzgo.zza(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing app. appId", zzgo.zza(s), sQLiteException0);
        }
    }

    @WorkerThread
    final void zza(Long long0) {
        this.zzt();
        this.zzal();
        Preconditions.checkNotNull(long0);
        if(zzpu.zza() && !this.zze().zza(zzbh.zzcb)) {
            return;
        }
        if(!this.zzaa()) {
            return;
        }
        if(this.zzb("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + long0 + " AND retry_count =  2147483647 LIMIT 1", null) > 0L) {
            this.zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            this.e_().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + long0 + " AND retry_count < 2147483647");
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error incrementing retry count. error", sQLiteException0);
        }
    }

    public final void zza(String s, Bundle bundle0) {
        Preconditions.checkNotNull(bundle0);
        this.zzt();
        this.zzal();
        zzar zzar0 = new zzar(this, s);
        for(List list0 = zzar0.zza(); !list0.isEmpty(); list0 = zzar0.zza()) {
            for(Object object0: list0) {
                zzoo zzoo0 = this.g_();
                zzf zzfy$zzf0 = ((zzap)object0).zzd;
                Bundle bundle1 = new Bundle();
                for(Object object1: zzfy$zzf0.zzh()) {
                    zzh zzfy$zzh0 = (zzh)object1;
                    if(zzfy$zzh0.zzj()) {
                        bundle1.putDouble("", zzfy$zzh0.zza());
                    }
                    else if(zzfy$zzh0.zzk()) {
                        bundle1.putFloat("", zzfy$zzh0.zzb());
                    }
                    else if(zzfy$zzh0.zzl()) {
                        bundle1.putLong("", zzfy$zzh0.zzd());
                    }
                    else if(zzfy$zzh0.zzn()) {
                        bundle1.putString("", "");
                    }
                    else if(zzfy$zzh0.zzi().isEmpty()) {
                        zzoo0.zzj().zzg().zza("Unexpected parameter type for parameter", zzfy$zzh0);
                    }
                    else {
                        bundle1.putParcelableArray("", zzoo.zzb(zzfy$zzh0.zzi()));
                    }
                }
                String s1 = bundle1.getString("_o");
                bundle1.remove("_o");
                if(s1 == null) {
                    s1 = "";
                }
                zzgs zzgs0 = new zzgs("", s1, bundle1, zzfy$zzf0.zzd());
                this.zzq().zza(zzgs0.zzc, bundle0);
                String s2 = zzgs0.zzb;
                long v = ((zzap)object0).zzd.zzc();
                zzbc zzbc0 = new zzbc(this.zzu, s2, s, "", ((zzap)object0).zzd.zzd(), v, zzgs0.zzc);
                this.zza(((zzap)object0).zza, zzbc0, ((zzap)object0).zzb, ((zzap)object0).zzc);
            }
        }
    }

    public final void zza(String s, zzax zzax0) {
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(zzax0);
        this.zzt();
        this.zzal();
        if(this.zze().zza(zzbh.zzcr)) {
            zzje zzje0 = this.zzi(s);
            zzje zzje1 = zzje.zza;
            if(zzje0 == zzje1) {
                this.zzb(s, zzje1);
            }
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("dma_consent_settings", zzax0.zzf());
        this.zza("consent_settings", "app_id", contentValues0);
    }

    public final void zza(String s, zzje zzje0) {
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(zzje0);
        this.zzt();
        this.zzal();
        this.zzb(s, this.zzi(s));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("storage_consent_at_bundling", zzje0.zzf());
        this.zza("consent_settings", "app_id", contentValues0);
    }

    @WorkerThread
    final void zza(String s, List list0) {
        boolean z;
        Preconditions.checkNotNull(list0);
        for(int v = 0; v < list0.size(); ++v) {
            com.google.android.gms.internal.measurement.zzfo.zza.zza zzfo$zza$zza0 = (com.google.android.gms.internal.measurement.zzfo.zza.zza)((com.google.android.gms.internal.measurement.zzfo.zza)list0.get(v)).zzcd();
            if(zzfo$zza$zza0.zza() != 0) {
                for(int v1 = 0; v1 < zzfo$zza$zza0.zza(); ++v1) {
                    com.google.android.gms.internal.measurement.zzfo.zzb.zza zzfo$zzb$zza0 = (com.google.android.gms.internal.measurement.zzfo.zzb.zza)zzfo$zza$zza0.zza(v1).zzcd();
                    com.google.android.gms.internal.measurement.zzfo.zzb.zza zzfo$zzb$zza1 = (com.google.android.gms.internal.measurement.zzfo.zzb.zza)(((com.google.android.gms.internal.measurement.zzjt.zzb)zzfo$zzb$zza0.clone()));
                    String s1 = zzji.zzb(zzfo$zzb$zza0.zzb());
                    if(s1 == null) {
                        z = false;
                    }
                    else {
                        zzfo$zzb$zza1.zza(s1);
                        z = true;
                    }
                    for(int v2 = 0; v2 < zzfo$zzb$zza0.zza(); ++v2) {
                        zzc zzfo$zzc0 = zzfo$zzb$zza0.zza(v2);
                        String s2 = zzjk.zza("");
                        if(s2 != null) {
                            zzfo$zzb$zza1.zza(v2, ((zzc)(((zzjt)((com.google.android.gms.internal.measurement.zzfo.zzc.zza)zzfo$zzc0.zzcd()).zza(s2).zzai()))));
                            z = true;
                        }
                    }
                    if(z) {
                        com.google.android.gms.internal.measurement.zzfo.zza.zza zzfo$zza$zza1 = zzfo$zza$zza0.zza(v1, zzfo$zzb$zza1);
                        list0.set(v, ((com.google.android.gms.internal.measurement.zzfo.zza)(((zzjt)zzfo$zza$zza1.zzai()))));
                        zzfo$zza$zza0 = zzfo$zza$zza1;
                    }
                }
            }
            if(zzfo$zza$zza0.zzb() != 0) {
                for(int v3 = 0; v3 < zzfo$zza$zza0.zzb(); ++v3) {
                    zze zzfo$zze0 = zzfo$zza$zza0.zzb(v3);
                    String s3 = zzjj.zza("");
                    if(s3 != null) {
                        zzfo$zza$zza0 = zzfo$zza$zza0.zza(v3, ((com.google.android.gms.internal.measurement.zzfo.zze.zza)zzfo$zze0.zzcd()).zza(s3));
                        list0.set(v, ((com.google.android.gms.internal.measurement.zzfo.zza)(((zzjt)zzfo$zza$zza0.zzai()))));
                    }
                }
            }
        }
        this.zzal();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(list0);
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        sQLiteDatabase0.beginTransaction();
        try {
            this.zzal();
            this.zzt();
            Preconditions.checkNotEmpty(s);
            SQLiteDatabase sQLiteDatabase1 = this.e_();
            sQLiteDatabase1.delete("property_filters", "app_id=?", new String[]{s});
            sQLiteDatabase1.delete("event_filters", "app_id=?", new String[]{s});
            Iterator iterator0 = list0.iterator();
        label_56:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                com.google.android.gms.internal.measurement.zzfo.zza zzfo$zza0 = (com.google.android.gms.internal.measurement.zzfo.zza)object0;
                this.zzal();
                this.zzt();
                Preconditions.checkNotEmpty(s);
                Preconditions.checkNotNull(zzfo$zza0);
                if(zzfo$zza0.zzg()) {
                    int v5 = zzfo$zza0.zza();
                    for(Object object1: zzfo$zza0.zze()) {
                        if(!((zzb)object1).zzl()) {
                            this.zzj().zzu().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzgo.zza(s), v5);
                            continue label_56;
                        }
                        if(false) {
                            break;
                        }
                    }
                    for(Object object2: zzfo$zza0.zzf()) {
                        if(!((zze)object2).zzi()) {
                            this.zzj().zzu().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzgo.zza(s), v5);
                            continue label_56;
                        }
                        if(false) {
                            break;
                        }
                    }
                    boolean z1 = true;
                    for(Object object3: zzfo$zza0.zze()) {
                        if(!this.zza(s, v5, ((zzb)object3))) {
                            z1 = false;
                            break;
                        }
                    }
                    if(z1) {
                        for(Object object4: zzfo$zza0.zzf()) {
                            if(!this.zza(s, v5, ((zze)object4))) {
                                z1 = false;
                                break;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    if(!z1) {
                        this.zzal();
                        this.zzt();
                        Preconditions.checkNotEmpty(s);
                        SQLiteDatabase sQLiteDatabase2 = this.e_();
                        sQLiteDatabase2.delete("property_filters", "app_id=? and audience_id=?", new String[]{s, String.valueOf(v5)});
                        sQLiteDatabase2.delete("event_filters", "app_id=? and audience_id=?", new String[]{s, String.valueOf(v5)});
                    }
                }
                else {
                    this.zzj().zzu().zza("Audience with no ID. appId", zzgo.zza(s));
                }
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object5: list0) {
                com.google.android.gms.internal.measurement.zzfo.zza zzfo$zza1 = (com.google.android.gms.internal.measurement.zzfo.zza)object5;
                arrayList0.add((zzfo$zza1.zzg() ? zzfo$zza1.zza() : null));
            }
            this.zzb(s, arrayList0);
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    @VisibleForTesting
    @WorkerThread
    final void zza(List list0) {
        this.zzt();
        this.zzal();
        Preconditions.checkNotNull(list0);
        Preconditions.checkNotZero(list0.size());
        if(!this.zzaa()) {
            return;
        }
        String s = "(" + TextUtils.join(",", list0) + ")";
        if(this.zzb("SELECT COUNT(1) FROM queue WHERE rowid IN " + s + " AND retry_count =  2147483647 LIMIT 1", null) > 0L) {
            this.zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            this.e_().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + s + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error incrementing retry count. error", sQLiteException0);
        }
    }

    @WorkerThread
    public final boolean zza(zzk zzfy$zzk0, boolean z) {
        byte[] arr_b1;
        this.zzt();
        this.zzal();
        Preconditions.checkNotNull(zzfy$zzk0);
        Preconditions.checkNotEmpty("");
        Preconditions.checkState(zzfy$zzk0.zzbj());
        this.zzv();
        long v = this.zzb().currentTimeMillis();
        if(zzfy$zzk0.zzm() < v - zzag.zzm() || zzfy$zzk0.zzm() > zzag.zzm() + v) {
            this.zzj().zzu().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgo.zza(""), v, zzfy$zzk0.zzm());
        }
        byte[] arr_b = zzfy$zzk0.zzca();
        try {
            arr_b1 = this.g_().zzb(arr_b);
        }
        catch(IOException iOException0) {
            this.zzj().zzg().zza("Data loss. Failed to serialize bundle. appId", zzgo.zza(""), iOException0);
            return false;
        }
        this.zzj().zzp().zza("Saving bundle, size", ((int)arr_b1.length));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", "");
        contentValues0.put("bundle_end_timestamp", zzfy$zzk0.zzm());
        contentValues0.put("data", arr_b1);
        contentValues0.put("has_realtime", ((int)z));
        if(zzfy$zzk0.zzbq()) {
            contentValues0.put("retry_count", zzfy$zzk0.zzg());
        }
        try {
            if(this.e_().insert("queue", null, contentValues0) == -1L) {
                this.zzj().zzg().zza("Failed to insert bundle (got -1). appId", zzgo.zza(""));
                return false;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing bundle. appId", zzgo.zza(""), sQLiteException0);
            return false;
        }
    }

    @WorkerThread
    public final boolean zza(zzae zzae0) {
        Preconditions.checkNotNull(zzae0);
        this.zzt();
        this.zzal();
        String s = zzae0.zza;
        Preconditions.checkNotNull(s);
        if(this.zze(s, zzae0.zzc.zza) == null && this.zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{s}) >= 1000L) {
            return false;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("origin", zzae0.zzb);
        contentValues0.put("name", zzae0.zzc.zza);
        zzal.zza(contentValues0, "value", Preconditions.checkNotNull(zzae0.zzc.zza()));
        contentValues0.put("active", Boolean.valueOf(zzae0.zze));
        contentValues0.put("trigger_event_name", zzae0.zzf);
        contentValues0.put("trigger_timeout", zzae0.zzh);
        this.zzq();
        contentValues0.put("timed_out_event", zzos.zza(zzae0.zzg));
        contentValues0.put("creation_timestamp", zzae0.zzd);
        this.zzq();
        contentValues0.put("triggered_event", zzos.zza(zzae0.zzi));
        contentValues0.put("triggered_timestamp", zzae0.zzc.zzb);
        contentValues0.put("time_to_live", zzae0.zzj);
        this.zzq();
        contentValues0.put("expired_event", zzos.zza(zzae0.zzk));
        try {
            if(this.e_().insertWithOnConflict("conditional_properties", null, contentValues0, 5) == -1L) {
                this.zzj().zzg().zza("Failed to insert/update conditional user property (got -1)", zzgo.zza(s));
                return true;
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing conditional user property", zzgo.zza(s), sQLiteException0);
        }
        return true;
    }

    public final boolean zza(zzbc zzbc0, long v, boolean z) {
        this.zzt();
        this.zzal();
        Preconditions.checkNotNull(zzbc0);
        Preconditions.checkNotEmpty(zzbc0.zza);
        byte[] arr_b = this.g_().zza(zzbc0).zzca();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", zzbc0.zza);
        contentValues0.put("name", zzbc0.zzb);
        contentValues0.put("timestamp", zzbc0.zzd);
        contentValues0.put("metadata_fingerprint", v);
        contentValues0.put("data", arr_b);
        contentValues0.put("realtime", ((int)z));
        try {
            if(this.e_().insert("raw_events", null, contentValues0) == -1L) {
                this.zzj().zzg().zza("Failed to insert raw event (got -1). appId", zzgo.zza(zzbc0.zza));
                return false;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing raw event. appId", zzgo.zza(zzbc0.zza), sQLiteException0);
            return false;
        }
    }

    @WorkerThread
    public final boolean zza(zzop zzop0) {
        Preconditions.checkNotNull(zzop0);
        this.zzt();
        this.zzal();
        if(this.zze(zzop0.zza, zzop0.zzc) == null) {
            if(zzos.zzh(zzop0.zzc)) {
                if(this.zzb("select count(1) from user_attributes where app_id=? and name not like \'!_%\' escape \'!\'", new String[]{zzop0.zza}) >= ((long)this.zze().zza(zzop0.zza, zzbh.zzai, 25, 100))) {
                    return false;
                }
            }
            else if(!"_npa".equals(zzop0.zzc) && this.zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like \'!_%\' escape \'!\'", new String[]{zzop0.zza, zzop0.zzb}) >= 25L) {
                return false;
            }
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", zzop0.zza);
        contentValues0.put("origin", zzop0.zzb);
        contentValues0.put("name", zzop0.zzc);
        contentValues0.put("set_timestamp", zzop0.zzd);
        zzal.zza(contentValues0, "value", zzop0.zze);
        try {
            if(this.e_().insertWithOnConflict("user_attributes", null, contentValues0, 5) == -1L) {
                this.zzj().zzg().zza("Failed to insert/update user property (got -1). appId", zzgo.zza(zzop0.zza));
                return true;
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing user property. appId", zzgo.zza(zzop0.zza), sQLiteException0);
        }
        return true;
    }

    @WorkerThread
    public final boolean zza(String s, zzj zzfy$zzj0, String s1, Map map0, zznt zznt0) {
        this.zzt();
        this.zzal();
        Preconditions.checkNotNull(zzfy$zzj0);
        Preconditions.checkNotEmpty(s);
        if(zzpu.zza() && !this.zze().zza(zzbh.zzcb)) {
            return false;
        }
        this.zzt();
        this.zzal();
        if(this.zzaa()) {
            long v = this.zzn().zzb.zza();
            long v1 = this.zzb().elapsedRealtime();
            if(Math.abs(v1 - v) > zzag.zzn()) {
                this.zzn().zzb.zza(v1);
                this.zzt();
                this.zzal();
                if(this.zzaa()) {
                    int v2 = this.e_().delete("upload_queue", this.zzao(), new String[0]);
                    if(v2 > 0) {
                        this.zzj().zzp().zza("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", v2);
                    }
                }
            }
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            arrayList0.add(((String)((Map.Entry)object0).getKey()) + "=" + ((String)((Map.Entry)object0).getValue()));
        }
        byte[] arr_b = zzfy$zzj0.zzca();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("measurement_batch", arr_b);
        contentValues0.put("upload_uri", s1);
        StringBuilder stringBuilder0 = new StringBuilder();
        int v3 = arrayList0.size();
        if(v3 > 0) {
            stringBuilder0.append(((CharSequence)arrayList0.get(0)));
            int v4 = 1;
            while(v4 < v3) {
                stringBuilder0.append("\r\n");
                Object object1 = arrayList0.get(v4);
                ++v4;
                stringBuilder0.append(((CharSequence)object1));
            }
        }
        contentValues0.put("upload_headers", stringBuilder0.toString());
        contentValues0.put("upload_type", zznt0.zza());
        contentValues0.put("creation_timestamp", this.zzb().currentTimeMillis());
        contentValues0.put("retry_count", 0);
        try {
            if(this.e_().insert("upload_queue", null, contentValues0) == -1L) {
                this.zzj().zzg().zza("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", s);
                return false;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing MeasurementBatch to upload_queue. appId", s, sQLiteException0);
            return false;
        }
    }

    @WorkerThread
    public final boolean zza(String s, zzno zzno0) {
        this.zzt();
        this.zzal();
        Preconditions.checkNotNull(zzno0);
        Preconditions.checkNotEmpty(s);
        long v = this.zzb().currentTimeMillis();
        zzfz zzfz0 = zzbh.zzbh;
        long v1 = (long)(((Long)zzfz0.zza(null)));
        if(zzno0.zzb >= v - v1) {
            long v2 = (long)(((Long)zzfz0.zza(null)));
            if(zzno0.zzb > v2 + v) {
                this.zzj().zzu().zza("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgo.zza(s), v, zzno0.zzb);
            }
        }
        else {
            this.zzj().zzu().zza("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgo.zza(s), v, zzno0.zzb);
        }
        this.zzj().zzp().zza("Saving trigger URI");
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("trigger_uri", zzno0.zza);
        contentValues0.put("source", zzno0.zzc);
        contentValues0.put("timestamp_millis", zzno0.zzb);
        try {
            if(this.e_().insert("trigger_uris", null, contentValues0) == -1L) {
                this.zzj().zzg().zza("Failed to insert trigger URI (got -1). appId", zzgo.zza(s));
                return false;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing trigger URI. appId", zzgo.zza(s), sQLiteException0);
            return false;
        }
    }

    public final boolean zza(String s, Long long0, long v, zzf zzfy$zzf0) {
        this.zzt();
        this.zzal();
        Preconditions.checkNotNull(zzfy$zzf0);
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(long0);
        byte[] arr_b = zzfy$zzf0.zzca();
        this.zzj().zzp().zza("Saving complex main event, appId, data size", this.zzi().zza(s), ((int)arr_b.length));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("event_id", long0);
        contentValues0.put("children_to_process", v);
        contentValues0.put("main_event", arr_b);
        try {
            if(this.e_().insertWithOnConflict("main_event_params", null, contentValues0, 5) == -1L) {
                this.zzj().zzg().zza("Failed to insert complex main event (got -1). appId", zzgo.zza(s));
                return false;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing complex main event. appId", zzgo.zza(s), sQLiteException0);
            return false;
        }
    }

    @VisibleForTesting
    protected final boolean zzaa() {
        return this.zza().getDatabasePath("google_app_measurement.db").exists();
    }

    private final String zzao() {
        long v = this.zzb().currentTimeMillis();
        long v1 = (long)(((Long)zzbh.zzaf.zza(null)));
        long v2 = zzag.zzm();
        return "(" + ("(upload_type = " + zznt.zzb.zza() + " AND (ABS(creation_timestamp - " + v + ") > CAST(" + v1 + " AS INTEGER)))") + " OR " + ("(upload_type != " + zznt.zzb.zza() + " AND (ABS(creation_timestamp - " + v + ") > CAST(" + v2 + " AS INTEGER)))") + ")";
    }

    @WorkerThread
    private final long zzb(String s, String[] arr_s) {
        long v;
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(!cursor0.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                v = cursor0.getLong(0);
            }
            catch(SQLiteException sQLiteException0) {
                this.zzj().zzg().zza("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return v;
    }

    private final boolean zzb(String s, List list0) {
        Preconditions.checkNotEmpty(s);
        this.zzal();
        this.zzt();
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        try {
            long v = this.zzb("select count(1) from audience_filter_values where app_id=?", new String[]{s});
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(s), sQLiteException0);
            return false;
        }
        int v1 = Math.max(0, Math.min(2000, this.zze().zzb(s, zzbh.zzah)));
        if(v <= ((long)v1)) {
            return false;
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            Integer integer0 = (Integer)list0.get(v2);
            if(integer0 == null) {
                return false;
            }
            arrayList0.add(Integer.toString(((int)integer0)));
        }
        return sQLiteDatabase0.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(",", arrayList0) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{s, Integer.toString(v1)}) > 0;
    }

    @WorkerThread
    public final long zzb(String s) {
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzal();
        return this.zza("select first_open_count from app2 where app_id=?", new String[]{s}, -1L);
    }

    @VisibleForTesting
    @WorkerThread
    protected final long zzb(String s, String s1) {
        long v2;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzt();
        this.zzal();
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        sQLiteDatabase0.beginTransaction();
        long v = 0L;
        try {
            v2 = this.zza("select " + s1 + " from app2 where app_id=?", new String[]{s}, -1L);
            if(v2 == -1L) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("app_id", s);
                contentValues0.put("first_open_count", 0);
                contentValues0.put("previous_install_count", 0);
                if(sQLiteDatabase0.insertWithOnConflict("app2", null, contentValues0, 5) == -1L) {
                    this.zzj().zzg().zza("Failed to insert column (got -1). appId", zzgo.zza(s), s1);
                    return -1L;
                }
                goto label_20;
            }
            goto label_24;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error inserting column. appId", zzgo.zza(s), s1, sQLiteException0);
            return v;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        try {
        label_20:
            v2 = 0L;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error inserting column. appId", zzgo.zza(s), s1, sQLiteException0);
            return v;
        }
        try {
        label_24:
            ContentValues contentValues1 = new ContentValues();
            contentValues1.put("app_id", s);
            contentValues1.put(s1, ((long)(v2 + 1L)));
            if(((long)sQLiteDatabase0.update("app2", contentValues1, "app_id = ?", new String[]{s})) == 0L) {
                this.zzj().zzg().zza("Failed to update column (got 0). appId", zzgo.zza(s), s1);
                return -1L;
            }
            sQLiteDatabase0.setTransactionSuccessful();
            return v2;
        }
        catch(SQLiteException sQLiteException0) {
            v = v2;
        }
        this.zzj().zzg().zza("Error inserting column. appId", zzgo.zza(s), s1, sQLiteException0);
        return v;
    }

    @WorkerThread
    public final List zzb(String s, String s1, String s2) {
        List list1;
        String s5;
        Object object0;
        long v;
        String s4;
        StringBuilder stringBuilder0;
        ArrayList arrayList0;
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzal();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            arrayList0 = new ArrayList(3);
            arrayList0.add(s);
            stringBuilder0 = new StringBuilder("app_id=?");
            if(TextUtils.isEmpty(s1)) {
                goto label_17;
            }
            else {
                goto label_13;
            }
            goto label_18;
        }
        catch(SQLiteException sQLiteException0) {
            String s3 = s1;
            goto label_46;
            try {
                try {
                label_13:
                    s3 = s1;
                    arrayList0.add(s3);
                    stringBuilder0.append(" and origin=?");
                    goto label_18;
                label_17:
                    s3 = s1;
                label_18:
                    if(!TextUtils.isEmpty(s2)) {
                        arrayList0.add(s2 + "*");
                        stringBuilder0.append(" and name glob ?");
                    }
                    Object[] arr_object = arrayList0.toArray(new String[arrayList0.size()]);
                    cursor0 = this.e_().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, stringBuilder0.toString(), ((String[])arr_object), null, null, "rowid", "1001");
                    if(cursor0.moveToFirst()) {
                        while(true) {
                        label_24:
                            if(list0.size() >= 1000) {
                                this.zzj().zzg().zza("Read more than the max allowed user properties, ignoring excess", 1000);
                            }
                            else {
                                s4 = cursor0.getString(0);
                                v = cursor0.getLong(1);
                                object0 = this.zza(cursor0, 2);
                                s5 = cursor0.getString(3);
                                if(object0 == null) {
                                    goto label_32;
                                }
                                else {
                                    goto label_34;
                                }
                                goto label_35;
                            }
                            goto label_40;
                        }
                    }
                    goto label_54;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_46;
                }
                try {
                label_32:
                    this.zzj().zzg().zza("(2)Read invalid user property value, ignoring it", zzgo.zza(s), s5, s2);
                    goto label_35;
                label_34:
                    list0.add(new zzop(s, s5, s4, v, object0));
                label_35:
                    if(cursor0.moveToNext()) {
                        goto label_42;
                    }
                    goto label_40;
                }
                catch(SQLiteException sQLiteException0) {
                }
            }
            catch(Throwable throwable0) {
                goto label_52;
            }
            try {
            label_38:
                s3 = s5;
                goto label_46;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_38;
            }
            catch(Throwable throwable0) {
                goto label_52;
            }
        label_40:
            cursor0.close();
            return list0;
            try {
                try {
                label_42:
                    s3 = s5;
                    goto label_24;
                }
                catch(SQLiteException sQLiteException0) {
                }
            label_46:
                this.zzj().zzg().zza("(2)Error querying user properties", zzgo.zza(s), s3, sQLiteException0);
                list1 = Collections.emptyList();
                if(cursor0 != null) {
                    goto label_49;
                }
                return list1;
            }
            catch(Throwable throwable0) {
                goto label_52;
            }
        label_49:
            cursor0.close();
            return list1;
        }
        catch(Throwable throwable0) {
        label_52:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_54:
        cursor0.close();
        return list0;
    }

    public final void zzb(String s, zzje zzje0) {
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(zzje0);
        this.zzt();
        this.zzal();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("consent_state", zzje0.zzf());
        contentValues0.put("consent_source", zzje0.zza());
        this.zza("consent_settings", "app_id", contentValues0);
    }

    final boolean zzb(String s, Bundle bundle0) {
        this.zzt();
        this.zzal();
        zzbc zzbc0 = new zzbc(this.zzu, "", s, "dep", 0L, 0L, bundle0);
        byte[] arr_b = this.g_().zza(zzbc0).zzca();
        this.zzj().zzp().zza("Saving default event parameters, appId, data size", this.zzi().zza(s), ((int)arr_b.length));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("parameters", arr_b);
        try {
            if(this.e_().insertWithOnConflict("default_event_params", null, contentValues0, 5) == -1L) {
                this.zzj().zzg().zza("Failed to insert default event parameters (got -1). appId", zzgo.zza(s));
                return false;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing default event parameters. appId", zzgo.zza(s), sQLiteException0);
            return false;
        }
    }

    @WorkerThread
    private final zzbb zzc(String s, String s1, String s2) {
        zzbb zzbb0;
        Boolean boolean0;
        Cursor cursor0;
        boolean z;
        Preconditions.checkNotEmpty(s1);
        Preconditions.checkNotEmpty(s2);
        this.zzt();
        this.zzal();
        ArrayList arrayList0 = new ArrayList(Arrays.asList(new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"}));
        try {
            z = false;
            cursor0 = null;
            cursor0 = this.e_().query(s, ((String[])arrayList0.toArray(new String[0])), "app_id=? and name=?", new String[]{s1, s2}, null, null, null);
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_31;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_12:
                if(cursor0.moveToFirst()) {
                    long v = cursor0.getLong(0);
                    long v1 = cursor0.getLong(1);
                    long v2 = cursor0.getLong(2);
                    long v3 = cursor0.isNull(3) ? 0L : cursor0.getLong(3);
                    Long long0 = cursor0.isNull(4) ? null : cursor0.getLong(4);
                    Long long1 = cursor0.isNull(5) ? null : cursor0.getLong(5);
                    Long long2 = cursor0.isNull(6) ? null : cursor0.getLong(6);
                    if(cursor0.isNull(7)) {
                        boolean0 = null;
                    }
                    else {
                        if(cursor0.getLong(7) == 1L) {
                            z = true;
                        }
                        boolean0 = Boolean.valueOf(z);
                    }
                    zzbb0 = new zzbb(s1, s2, v, v1, (cursor0.isNull(8) ? 0L : cursor0.getLong(8)), v2, v3, long0, long1, long2, boolean0);
                    if(cursor0.moveToNext()) {
                        this.zzj().zzg().zza("Got multiple records for event aggregates, expected one. appId", zzgo.zza(s1));
                    }
                    goto label_38;
                }
                goto label_40;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_31:
            this.zzj().zzg().zza("Error querying events. appId", zzgo.zza(s1), this.zzi().zza(s2), sQLiteException0);
            if(cursor0 != null) {
                goto label_33;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_36;
        }
    label_33:
        cursor0.close();
        return null;
    label_36:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_38:
        cursor0.close();
        return zzbb0;
    label_40:
        cursor0.close();
        return null;
    }

    public final long zzc(String s) {
        Preconditions.checkNotEmpty(s);
        return this.zza("select count(1) from events where app_id=? and name not like \'!_%\' escape \'!\'", new String[]{s}, 0L);
    }

    @WorkerThread
    public final zzae zzc(String s, String s1) {
        zzae zzae0;
        Cursor cursor0;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzt();
        this.zzal();
        try {
            cursor0 = null;
            cursor0 = this.e_().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{s, s1}, null, null, null);
            goto label_10;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_29;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_10:
                if(cursor0.moveToFirst()) {
                    String s2 = cursor0.getString(0);
                    if(s2 == null) {
                        s2 = "";
                    }
                    Object object0 = this.zza(cursor0, 1);
                    boolean z = cursor0.getInt(2) != 0;
                    String s3 = cursor0.getString(3);
                    long v = cursor0.getLong(4);
                    Parcelable parcelable0 = this.g_().zza(cursor0.getBlob(5), zzbf.CREATOR);
                    long v1 = cursor0.getLong(6);
                    zzbf zzbf0 = (zzbf)this.g_().zza(cursor0.getBlob(7), zzbf.CREATOR);
                    long v2 = cursor0.getLong(8);
                    long v3 = cursor0.getLong(9);
                    Parcelable parcelable1 = this.g_().zza(cursor0.getBlob(10), zzbf.CREATOR);
                    zzae0 = new zzae(s, s2, new zzon(s1, v2, object0, s2), v1, z, s3, ((zzbf)parcelable0), v, zzbf0, v3, ((zzbf)parcelable1));
                    if(cursor0.moveToNext()) {
                        this.zzj().zzg().zza("Got multiple records for conditional property, expected one", zzgo.zza(s), this.zzi().zzc(s1));
                    }
                    goto label_36;
                }
                goto label_38;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_29:
            this.zzj().zzg().zza("Error querying conditional property", zzgo.zza(s), this.zzi().zzc(s1), sQLiteException0);
            if(cursor0 != null) {
                goto label_31;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
    label_31:
        cursor0.close();
        return null;
    label_34:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_36:
        cursor0.close();
        return zzae0;
    label_38:
        cursor0.close();
        return null;
    }

    @Override  // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }

    public final Bundle zzd(String s) {
        Bundle bundle0;
        zzf zzfy$zzf0;
        Cursor cursor0;
        this.zzt();
        this.zzal();
        try {
            cursor0 = null;
            cursor0 = this.e_().rawQuery("select parameters from default_event_params where app_id=?", new String[]{s});
            goto label_8;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_23;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
        label_8:
            if(!cursor0.moveToFirst()) {
                this.zzj().zzp().zza("Default event parameters not found");
                goto label_10;
            }
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_23;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
    label_10:
        cursor0.close();
        return null;
        try {
        label_12:
            byte[] arr_b = cursor0.getBlob(0);
            try {
                zzfy$zzf0 = (zzf)(((zzjt)((zza)zzoo.zza(zzf.zze(), arr_b)).zzai()));
                goto label_19;
            }
            catch(IOException iOException0) {
            }
            this.zzj().zzg().zza("Failed to retrieve default event parameters. appId", zzgo.zza(s), iOException0);
        }
        catch(SQLiteException sQLiteException0) {
            goto label_23;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
        cursor0.close();
        return null;
        try {
            try {
            label_19:
                this.g_();
                bundle0 = zzoo.zza(zzfy$zzf0.zzh());
                goto label_30;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_23:
            this.zzj().zzg().zza("Error selecting default event parameters", sQLiteException0);
            if(cursor0 != null) {
                goto label_25;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
    label_25:
        cursor0.close();
        return null;
    label_28:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_30:
        cursor0.close();
        return bundle0;
    }

    @WorkerThread
    public final zzbb zzd(String s, String s1) {
        return this.zzc("events", s, s1);
    }

    @WorkerThread
    public final zzg zze(String s) {
        Boolean boolean0;
        zzg zzg0;
        Cursor cursor0;
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzal();
        try {
            cursor0 = null;
            cursor0 = this.e_().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info"}, "app_id=?", new String[]{s}, null, null, null);
            goto label_9;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_78;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_9:
                if(cursor0.moveToFirst()) {
                    zzg0 = new zzg(this.zzg.zzk(), s);
                    boolean z = false;
                    if(!zznm.zza() || !this.zze().zza(zzbh.zzcy) || this.zzg.zzb(s).zza(com.google.android.gms.measurement.internal.zzje.zza.zzb)) {
                        zzg0.zzb(cursor0.getString(0));
                    }
                    zzg0.zzf(cursor0.getString(1));
                    if(!zznm.zza() || !this.zze().zza(zzbh.zzcy) || this.zzg.zzb(s).zza(com.google.android.gms.measurement.internal.zzje.zza.zza)) {
                        zzg0.zzh(cursor0.getString(2));
                    }
                    zzg0.zzq(cursor0.getLong(3));
                    zzg0.zzr(cursor0.getLong(4));
                    zzg0.zzp(cursor0.getLong(5));
                    zzg0.zzd(cursor0.getString(6));
                    zzg0.zzc(cursor0.getString(7));
                    zzg0.zzn(cursor0.getLong(8));
                    zzg0.zzk(cursor0.getLong(9));
                    zzg0.zzb(cursor0.isNull(10) || cursor0.getInt(10) != 0);
                    zzg0.zzj(cursor0.getLong(11));
                    zzg0.zzh(cursor0.getLong(12));
                    zzg0.zzg(cursor0.getLong(13));
                    zzg0.zze(cursor0.getLong(14));
                    zzg0.zzd(cursor0.getLong(15));
                    zzg0.zzm(cursor0.getLong(16));
                    zzg0.zzb((cursor0.isNull(17) ? 0xFFFFFFFF80000000L : ((long)cursor0.getInt(17))));
                    zzg0.zze(cursor0.getString(18));
                    zzg0.zzf(cursor0.getLong(19));
                    zzg0.zzi(cursor0.getLong(20));
                    zzg0.zzg(cursor0.getString(21));
                    zzg0.zza(cursor0.isNull(23) || cursor0.getInt(23) != 0);
                    zzg0.zza(cursor0.getString(24));
                    zzg0.zzl((cursor0.isNull(25) ? 0L : cursor0.getLong(25)));
                    if(!cursor0.isNull(26)) {
                        zzg0.zza(Arrays.asList(cursor0.getString(26).split(",", -1)));
                    }
                    if(!zznm.zza() || !this.zze().zza(zzbh.zzcy) || this.zzg.zzb(s).zza(com.google.android.gms.measurement.internal.zzje.zza.zzb)) {
                        zzg0.zzj(cursor0.getString(28));
                    }
                    if(zzpu.zza() && this.zze().zza(zzbh.zzbx)) {
                        this.zzq();
                        if(zzos.zzf(s)) {
                            zzg0.zzc(!cursor0.isNull(29) && cursor0.getInt(29) != 0);
                            zzg0.zzo(cursor0.getLong(39));
                            if(this.zze().zza(zzbh.zzby)) {
                                zzg0.zzk(cursor0.getString(36));
                            }
                        }
                    }
                    zzg0.zzt(cursor0.getLong(30));
                    zzg0.zzs(cursor0.getLong(0x1F));
                    if(zzpn.zza() && this.zze().zze(s, zzbh.zzch)) {
                        zzg0.zza(cursor0.getInt(0x20));
                        zzg0.zzc(cursor0.getLong(35));
                    }
                    zzg0.zzd(!cursor0.isNull(33) && cursor0.getInt(33) != 0);
                    if(cursor0.isNull(34)) {
                        boolean0 = null;
                    }
                    else {
                        if(cursor0.getInt(34) != 0) {
                            z = true;
                        }
                        boolean0 = Boolean.valueOf(z);
                    }
                    zzg0.zza(boolean0);
                    zzg0.zzc(cursor0.getInt(37));
                    zzg0.zzb(cursor0.getInt(38));
                    zzg0.zzi((cursor0.isNull(40) ? "" : ((String)Preconditions.checkNotNull(cursor0.getString(40)))));
                    if(this.zze().zza(zzbh.zzcw)) {
                        if(!cursor0.isNull(41)) {
                            zzg0.zza(cursor0.getLong(41));
                        }
                        if(!cursor0.isNull(42)) {
                            zzg0.zzb(cursor0.getLong(42));
                        }
                    }
                    if(zzov.zza() && this.zze().zze(s, zzbh.zzcu)) {
                        zzg0.zza(cursor0.getBlob(43));
                    }
                    zzg0.zzao();
                    if(cursor0.moveToNext()) {
                        this.zzj().zzg().zza("Got multiple records for app, expected one. appId", zzgo.zza(s));
                    }
                    goto label_85;
                }
                goto label_87;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_78:
            this.zzj().zzg().zza("Error querying app. appId", zzgo.zza(s), sQLiteException0);
            if(cursor0 != null) {
                goto label_80;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_83;
        }
    label_80:
        cursor0.close();
        return null;
    label_83:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_85:
        cursor0.close();
        return zzg0;
    label_87:
        cursor0.close();
        return null;
    }

    @WorkerThread
    public final zzop zze(String s, String s1) {
        zzop zzop0;
        Cursor cursor0;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzt();
        this.zzal();
        try {
            cursor0 = null;
            cursor0 = this.e_().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{s, s1}, null, null, null);
            goto label_10;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_19;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_10:
                if(cursor0.moveToFirst()) {
                    long v = cursor0.getLong(0);
                    Object object0 = this.zza(cursor0, 1);
                    if(object0 != null) {
                        zzop0 = new zzop(s, cursor0.getString(2), s1, v, object0);
                        if(cursor0.moveToNext()) {
                            this.zzj().zzg().zza("Got multiple records for user property, expected one. appId", zzgo.zza(s));
                        }
                        goto label_26;
                    }
                    goto label_28;
                }
                goto label_30;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_19:
            this.zzj().zzg().zza("Error querying user property. appId", zzgo.zza(s), this.zzi().zzc(s1), sQLiteException0);
            if(cursor0 != null) {
                goto label_21;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_24;
        }
    label_21:
        cursor0.close();
        return null;
    label_24:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_26:
        cursor0.close();
        return zzop0;
    label_28:
        cursor0.close();
        return null;
    label_30:
        cursor0.close();
        return null;
    }

    @WorkerThread
    public final zzan zzf(String s) {
        zzan zzan0;
        String s2;
        String s1;
        byte[] arr_b;
        Cursor cursor0;
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzal();
        try {
            cursor0 = null;
            cursor0 = this.e_().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{s}, null, null, null);
            goto label_9;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_21;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
        label_9:
            if(cursor0.moveToFirst()) {
                arr_b = cursor0.getBlob(0);
                s1 = cursor0.getString(1);
                s2 = cursor0.getString(2);
                if(cursor0.moveToNext()) {
                    this.zzj().zzg().zza("Got multiple records for app config, expected one. appId", zzgo.zza(s));
                }
                goto label_15;
            }
            goto label_30;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_21;
        }
        catch(Throwable throwable0) {
            goto label_26;
        }
    label_15:
        if(arr_b == null) {
            cursor0.close();
            return null;
        }
        try {
            try {
                zzan0 = new zzan(arr_b, s1, s2);
                goto label_28;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_21:
            this.zzj().zzg().zza("Error querying remote config. appId", zzgo.zza(s), sQLiteException0);
            if(cursor0 != null) {
                goto label_23;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_26;
        }
    label_23:
        cursor0.close();
        return null;
    label_26:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_28:
        cursor0.close();
        return zzan0;
    label_30:
        cursor0.close();
        return null;
    }

    final Map zzf(String s, String s1) {
        Map map2;
        zzb zzfo$zzb0;
        Map map1;
        this.zzal();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        Map map0 = new ArrayMap();
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            cursor0 = sQLiteDatabase0.query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{s, s1}, null, null, null);
            if(!cursor0.moveToFirst()) {
                map1 = Collections.emptyMap();
                goto label_10;
            }
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_27;
        }
        catch(Throwable throwable0) {
            goto label_33;
        }
    label_10:
        cursor0.close();
        return map1;
        try {
            do {
            label_12:
                byte[] arr_b = cursor0.getBlob(1);
                try {
                    zzfo$zzb0 = (zzb)(((zzjt)((com.google.android.gms.internal.measurement.zzfo.zzb.zza)zzoo.zza(zzb.zzc(), arr_b)).zzai()));
                }
                catch(IOException iOException0) {
                    this.zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(s), iOException0);
                    continue;
                }
                int v = cursor0.getInt(0);
                List list0 = (List)map0.get(v);
                if(list0 == null) {
                    list0 = new ArrayList();
                    map0.put(v, list0);
                }
                list0.add(zzfo$zzb0);
            }
            while(cursor0.moveToNext());
        }
        catch(SQLiteException sQLiteException0) {
            try {
            label_27:
                this.zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(s), sQLiteException0);
                map2 = Collections.emptyMap();
                if(cursor0 != null) {
                    goto label_30;
                }
                return map2;
            }
            catch(Throwable throwable0) {
                goto label_33;
            }
        label_30:
            cursor0.close();
            return map2;
        }
        catch(Throwable throwable0) {
        label_33:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return map0;
    }

    public final zzax zzg(String s) {
        Preconditions.checkNotNull(s);
        this.zzt();
        this.zzal();
        return zzax.zza(this.zza("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{s}, ""));
    }

    final Map zzg(String s, String s1) {
        Map map2;
        zze zzfo$zze0;
        Map map1;
        this.zzal();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        Map map0 = new ArrayMap();
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            cursor0 = sQLiteDatabase0.query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{s, s1}, null, null, null);
            if(!cursor0.moveToFirst()) {
                map1 = Collections.emptyMap();
                goto label_10;
            }
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_27;
        }
        catch(Throwable throwable0) {
            goto label_33;
        }
    label_10:
        cursor0.close();
        return map1;
        try {
            do {
            label_12:
                byte[] arr_b = cursor0.getBlob(1);
                try {
                    zzfo$zze0 = (zze)(((zzjt)((com.google.android.gms.internal.measurement.zzfo.zze.zza)zzoo.zza(zze.zzc(), arr_b)).zzai()));
                }
                catch(IOException iOException0) {
                    this.zzj().zzg().zza("Failed to merge filter", zzgo.zza(s), iOException0);
                    continue;
                }
                int v = cursor0.getInt(0);
                List list0 = (List)map0.get(v);
                if(list0 == null) {
                    list0 = new ArrayList();
                    map0.put(v, list0);
                }
                list0.add(zzfo$zze0);
            }
            while(cursor0.moveToNext());
        }
        catch(SQLiteException sQLiteException0) {
            try {
            label_27:
                this.zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(s), sQLiteException0);
                map2 = Collections.emptyMap();
                if(cursor0 != null) {
                    goto label_30;
                }
                return map2;
            }
            catch(Throwable throwable0) {
                goto label_33;
            }
        label_30:
            cursor0.close();
            return map2;
        }
        catch(Throwable throwable0) {
        label_33:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return map0;
    }

    public final zzje zzh(String s) {
        Preconditions.checkNotNull(s);
        this.zzt();
        this.zzal();
        return zzje.zzb(this.zza("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{s}, ""));
    }

    @WorkerThread
    public final void zzh(String s, String s1) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzt();
        this.zzal();
        try {
            this.e_().delete("user_attributes", "app_id=? and name=?", new String[]{s, s1});
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error deleting user property. appId", zzgo.zza(s), this.zzi().zzc(s1), sQLiteException0);
        }
    }

    private final void zzi(String s, String s1) {
        Preconditions.checkNotEmpty(s1);
        this.zzt();
        this.zzal();
        try {
            this.e_().delete(s, "app_id=?", new String[]{s1});
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error deleting snapshot. appId", zzgo.zza(s1), sQLiteException0);
        }
    }

    public final zzje zzi(String s) {
        Preconditions.checkNotNull(s);
        this.zzt();
        this.zzal();
        zzao zzao0 = (Cursor cursor0) -> zzje.zza(cursor0.getString(0), cursor0.getInt(1));
        zzje zzje0 = (zzje)this.zza("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{s}, zzao0);
        return zzje0 == null ? zzje.zza : zzje0;
    }

    @WorkerThread
    public final zzoj zzj(String s) {
        zzoj zzoj0;
        String s2;
        Cursor cursor0;
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzal();
        if(zzpu.zza() && !this.zze().zza(zzbh.zzcb)) {
            return null;
        }
        try {
            SQLiteDatabase sQLiteDatabase0 = this.e_();
            String s1 = this.zzao();
            cursor0 = null;
            cursor0 = sQLiteDatabase0.query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count"}, "app_id=? AND NOT " + s1, new String[]{s}, null, null, "creation_timestamp ASC", "1");
            goto label_13;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_55;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
        label_13:
            if(cursor0.moveToFirst()) {
                s2 = cursor0.getString(3);
                if(TextUtils.isEmpty(s2)) {
                    this.zzj().zzc().zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
                    goto label_17;
                }
                goto label_19;
            }
            goto label_64;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_55;
        }
        catch(Throwable throwable0) {
            goto label_60;
        }
    label_17:
        cursor0.close();
        return null;
        try {
            try {
            label_19:
                com.google.android.gms.internal.measurement.zzfy.zzj.zza zzfy$zzj$zza0 = (com.google.android.gms.internal.measurement.zzfy.zzj.zza)zzoo.zza(zzj.zzb(), cursor0.getBlob(2));
                zznt[] arr_zznt = zznt.values();
                zznt zznt0 = arr_zznt[cursor0.getInt(5)];
                if((zznt0 == zznt.zzc || zznt0 == zznt.zza) && cursor0.getInt(6) > 0) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: zzfy$zzj$zza0.zzd()) {
                        com.google.android.gms.internal.measurement.zzfy.zzk.zza zzfy$zzk$zza0 = (com.google.android.gms.internal.measurement.zzfy.zzk.zza)((zzk)object0).zzcd();
                        zzfy$zzk$zza0.zzi(cursor0.getInt(6));
                        arrayList0.add(((zzk)(((zzjt)zzfy$zzk$zza0.zzai()))));
                    }
                    zzfy$zzj$zza0.zzb();
                    zzfy$zzj$zza0.zza(arrayList0);
                }
                HashMap hashMap0 = new HashMap();
                String s3 = cursor0.getString(4);
                if(s3 != null) {
                    String[] arr_s = s3.split("\r\n");
                    int v = 0;
                    while(v < arr_s.length) {
                        String s4 = arr_s[v];
                        if(s4.isEmpty()) {
                            break;
                        }
                        String[] arr_s1 = s4.split("=", 2);
                        if(arr_s1.length == 2) {
                            hashMap0.put(arr_s1[0], arr_s1[1]);
                            ++v;
                        }
                        else {
                            this.zzj().zzg().zza("Invalid upload header: ", s4);
                            if(true) {
                                break;
                            }
                        }
                    }
                }
                zzoj0 = new zzom().zza(cursor0.getLong(0)).zza(((zzj)(((zzjt)zzfy$zzj$zza0.zzai())))).zza(s2).zza(hashMap0).zza(zznt0).zza();
                goto label_62;
            }
            catch(IOException iOException0) {
            }
            this.zzj().zzg().zza("Failed to queued MeasurementBatch from upload_queue. appId", s, iOException0);
        }
        catch(SQLiteException sQLiteException0) {
            goto label_55;
        }
        catch(Throwable throwable0) {
            goto label_60;
        }
        cursor0.close();
        return null;
        try {
        label_55:
            this.zzj().zzg().zza("Error to querying MeasurementBatch from upload_queue. appId", s, sQLiteException0);
            if(cursor0 != null) {
                goto label_57;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_60;
        }
    label_57:
        cursor0.close();
        return null;
    label_60:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_62:
        cursor0.close();
        return zzoj0;
    label_64:
        cursor0.close();
        return null;
    }

    public final List zzk(String s) {
        List list1;
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzal();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = this.e_().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{s}, null, null, "rowid", null);
            if(cursor0.moveToFirst()) {
                do {
                    String s1 = cursor0.getString(0);
                    if(s1 == null) {
                        s1 = "";
                    }
                    list0.add(new zzno(s1, cursor0.getLong(1), cursor0.getInt(2)));
                }
                while(cursor0.moveToNext());
                goto label_22;
            }
            goto label_24;
        }
        catch(SQLiteException sQLiteException0) {
            try {
                try {
                }
                catch(SQLiteException sQLiteException0) {
                }
                this.zzj().zzg().zza("Error querying trigger uris. appId", zzgo.zza(s), sQLiteException0);
                list1 = Collections.emptyList();
                if(cursor0 != null) {
                    goto label_17;
                }
                return list1;
            }
            catch(Throwable throwable0) {
                goto label_20;
            }
        label_17:
            cursor0.close();
            return list1;
        }
        catch(Throwable throwable0) {
        label_20:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_22:
        cursor0.close();
        return list0;
    label_24:
        cursor0.close();
        return list0;
    }

    @WorkerThread
    public final List zzl(String s) {
        List list1;
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzal();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = this.e_().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{s}, null, null, "rowid", "1000");
            if(cursor0.moveToFirst()) {
                do {
                    String s1 = cursor0.getString(0);
                    String s2 = cursor0.getString(1);
                    if(s2 == null) {
                        s2 = "";
                    }
                    long v = cursor0.getLong(2);
                    Object object0 = this.zza(cursor0, 3);
                    if(object0 == null) {
                        this.zzj().zzg().zza("Read invalid user property value, ignoring it. appId", zzgo.zza(s));
                    }
                    else {
                        list0.add(new zzop(s, s2, s1, v, object0));
                    }
                }
                while(cursor0.moveToNext());
                goto label_28;
            }
            goto label_30;
        }
        catch(SQLiteException sQLiteException0) {
            try {
                try {
                }
                catch(SQLiteException sQLiteException0) {
                }
                this.zzj().zzg().zza("Error querying user properties. appId", zzgo.zza(s), sQLiteException0);
                list1 = Collections.emptyList();
                if(cursor0 != null) {
                    goto label_23;
                }
                return list1;
            }
            catch(Throwable throwable0) {
                goto label_26;
            }
        label_23:
            cursor0.close();
            return list1;
        }
        catch(Throwable throwable0) {
        label_26:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_28:
        cursor0.close();
        return list0;
    label_30:
        cursor0.close();
        return list0;
    }

    final Map zzm(String s) {
        Map map2;
        Map map1;
        zzm zzfy$zzm0;
        Map map0;
        this.zzal();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            cursor0 = sQLiteDatabase0.query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{s}, null, null, null);
            if(cursor0.moveToFirst()) {
                map0 = new ArrayMap();
                while(true) {
                    int v = cursor0.getInt(0);
                    byte[] arr_b = cursor0.getBlob(1);
                    try {
                        zzfy$zzm0 = (zzm)(((zzjt)((com.google.android.gms.internal.measurement.zzfy.zzm.zza)zzoo.zza(zzm.zze(), arr_b)).zzai()));
                    }
                    catch(IOException iOException0) {
                        this.zzj().zzg().zza("Failed to merge filter results. appId, audienceId, error", zzgo.zza(s), v, iOException0);
                        goto label_16;
                    }
                    map0.put(v, zzfy$zzm0);
                label_16:
                    if(cursor0.moveToNext()) {
                        continue;
                    }
                    goto label_17;
                }
            }
            goto label_19;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_22;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
    label_17:
        cursor0.close();
        return map0;
        try {
            try {
            label_19:
                map1 = Collections.emptyMap();
                goto label_30;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_22:
            this.zzj().zzg().zza("Database error querying filter results. appId", zzgo.zza(s), sQLiteException0);
            map2 = Collections.emptyMap();
            if(cursor0 != null) {
                goto label_25;
            }
            return map2;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
    label_25:
        cursor0.close();
        return map2;
    label_28:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_30:
        cursor0.close();
        return map1;
    }

    final Map zzn(String s) {
        Map map2;
        zzb zzfo$zzb0;
        Map map1;
        Preconditions.checkNotEmpty(s);
        Map map0 = new ArrayMap();
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            cursor0 = sQLiteDatabase0.query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{s}, null, null, null);
            if(!cursor0.moveToFirst()) {
                map1 = Collections.emptyMap();
                goto label_7;
            }
            goto label_9;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_25;
        }
        catch(Throwable throwable0) {
            goto label_31;
        }
    label_7:
        cursor0.close();
        return map1;
        try {
            do {
            label_9:
                byte[] arr_b = cursor0.getBlob(1);
                try {
                    zzfo$zzb0 = (zzb)(((zzjt)((com.google.android.gms.internal.measurement.zzfo.zzb.zza)zzoo.zza(zzb.zzc(), arr_b)).zzai()));
                }
                catch(IOException iOException0) {
                    this.zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(s), iOException0);
                    continue;
                }
                if(zzfo$zzb0.zzk()) {
                    int v = cursor0.getInt(0);
                    List list0 = (List)map0.get(v);
                    if(list0 == null) {
                        list0 = new ArrayList();
                        map0.put(v, list0);
                    }
                    list0.add(zzfo$zzb0);
                }
            }
            while(cursor0.moveToNext());
        }
        catch(SQLiteException sQLiteException0) {
            try {
            label_25:
                this.zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(s), sQLiteException0);
                map2 = Collections.emptyMap();
                if(cursor0 != null) {
                    goto label_28;
                }
                return map2;
            }
            catch(Throwable throwable0) {
                goto label_31;
            }
        label_28:
            cursor0.close();
            return map2;
        }
        catch(Throwable throwable0) {
        label_31:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return map0;
    }

    final Map zzo(String s) {
        Map map2;
        Map map1;
        this.zzal();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        Map map0 = new ArrayMap();
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            cursor0 = sQLiteDatabase0.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{s, s});
            if(cursor0.moveToFirst()) {
                while(true) {
                    int v = cursor0.getInt(0);
                    List list0 = (List)map0.get(v);
                    if(list0 == null) {
                        list0 = new ArrayList();
                        map0.put(v, list0);
                    }
                    list0.add(cursor0.getInt(1));
                    if(cursor0.moveToNext()) {
                        continue;
                    }
                    goto label_15;
                }
            }
            goto label_17;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_20;
        }
        catch(Throwable throwable0) {
            goto label_26;
        }
    label_15:
        cursor0.close();
        return map0;
        try {
            try {
            label_17:
                map1 = Collections.emptyMap();
                goto label_28;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_20:
            this.zzj().zzg().zza("Database error querying scoped filters. appId", zzgo.zza(s), sQLiteException0);
            map2 = Collections.emptyMap();
            if(cursor0 != null) {
                goto label_23;
            }
            return map2;
        }
        catch(Throwable throwable0) {
            goto label_26;
        }
    label_23:
        cursor0.close();
        return map2;
    label_26:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_28:
        cursor0.close();
        return map1;
    }

    @WorkerThread
    public final void zzp() {
        this.zzal();
        this.e_().beginTransaction();
    }

    public final void zzp(String s) {
        this.zzt();
        this.zzal();
        try {
            this.e_().execSQL("delete from default_event_params where app_id=?", new String[]{s});
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error clearing default event params", sQLiteException0);
        }
    }

    public final void zzq(String s) {
        this.zzi("events_snapshot", s);
        List list0 = Collections.singletonList("name");
        Cursor cursor0 = null;
        try {
            cursor0 = this.e_().query("events", ((String[])list0.toArray(new String[0])), "app_id=?", new String[]{s}, null, null, null);
            if(cursor0.moveToFirst()) {
                do {
                    String s1 = cursor0.getString(0);
                    if(s1 != null) {
                        zzbb zzbb0 = this.zzd(s, s1);
                        if(zzbb0 != null) {
                            this.zza("events_snapshot", zzbb0);
                        }
                    }
                }
                while(cursor0.moveToNext());
                goto label_20;
            }
            goto label_22;
        }
        catch(SQLiteException sQLiteException0) {
            try {
                try {
                }
                catch(SQLiteException sQLiteException0) {
                }
                this.zzj().zzg().zza("Error creating snapshot. appId", zzgo.zza(s), sQLiteException0);
                if(cursor0 != null) {
                    goto label_15;
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_18;
            }
        label_15:
            cursor0.close();
            return;
        }
        catch(Throwable throwable0) {
        label_18:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_20:
        cursor0.close();
        return;
    label_22:
        cursor0.close();
    }

    public final void zzr(String s) {
        boolean z;
        ArrayList arrayList0 = new ArrayList(Arrays.asList(new String[]{"name", "lifetime_count"}));
        zzbb zzbb0 = this.zzd(s, "_f");
        zzbb zzbb1 = this.zzd(s, "_v");
        this.zzi("events", s);
        int v = 0;
        Cursor cursor0 = null;
        try {
            cursor0 = this.e_().query("events_snapshot", ((String[])arrayList0.toArray(new String[0])), "app_id=?", new String[]{s}, null, null, null);
            if(!cursor0.moveToFirst()) {
                goto label_15;
            }
            goto label_23;
        }
        catch(SQLiteException sQLiteException0) {
            z = false;
            goto label_50;
        }
        catch(Throwable throwable0) {
            z = false;
            goto label_63;
        }
    label_15:
        cursor0.close();
        if(zzbb0 != null) {
            this.zza("events", zzbb0);
        }
        else if(zzbb1 != null) {
            this.zza("events", zzbb1);
        }
        this.zzi("events_snapshot", s);
        return;
    label_23:
        int v1 = 0;
        z = false;
        try {
            do {
                String s1 = cursor0.getString(0);
                if(this.zze().zza(zzbh.zzda)) {
                    if(cursor0.getLong(1) >= 1L) {
                        if("_f".equals(s1)) {
                            v1 = 1;
                        }
                        else if("_v".equals(s1)) {
                            z = true;
                        }
                    }
                }
                else if("_f".equals(s1)) {
                    v1 = 1;
                }
                else if("_v".equals(s1)) {
                    z = true;
                }
                if(s1 != null) {
                    zzbb zzbb2 = this.zzc("events_snapshot", s, s1);
                    if(zzbb2 != null) {
                        this.zza("events", zzbb2);
                    }
                }
            }
            while(cursor0.moveToNext());
            goto label_72;
        }
        catch(SQLiteException sQLiteException0) {
            v = v1;
        }
        catch(Throwable throwable0) {
            v = v1;
            goto label_63;
        }
        try {
        label_50:
            this.zzj().zzg().zza("Error querying snapshot. appId", zzgo.zza(s), sQLiteException0);
        }
        catch(Throwable throwable0) {
            goto label_63;
        }
        if(cursor0 != null) {
            cursor0.close();
        }
        if(v == 0 && zzbb0 != null) {
            this.zza("events", zzbb0);
        }
        else if(!z && zzbb1 != null) {
            this.zza("events", zzbb1);
        }
        this.zzi("events_snapshot", s);
        return;
    label_63:
        if(cursor0 != null) {
            cursor0.close();
        }
        if(v == 0 && zzbb0 != null) {
            this.zza("events", zzbb0);
        }
        else if(!z && zzbb1 != null) {
            this.zza("events", zzbb1);
        }
        this.zzi("events_snapshot", s);
        throw throwable0;
    label_72:
        cursor0.close();
        if(v1 == 0 && zzbb0 != null) {
            this.zza("events", zzbb0);
        }
        else if(!z && zzbb1 != null) {
            this.zza("events", zzbb1);
        }
        this.zzi("events_snapshot", s);
    }

    // 去混淆评级： 低(20)
    @WorkerThread
    public final boolean zzs(String s) {
        return !zzpu.zza() || this.zze().zza(zzbh.zzcb) ? this.zzb("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT " + this.zzao(), new String[]{s}) != 0L : false;
    }

    final boolean zzt(String s) {
        boolean z;
        Cursor cursor0 = null;
        try {
            cursor0 = this.e_().rawQuery("select timestamp from raw_events where app_id=? and name = \'_f\' limit 1;", new String[]{s});
            if(cursor0.moveToFirst()) {
                long v = cursor0.getLong(0);
                if(this.zzb().currentTimeMillis() < v + 15000L) {
                    goto label_10;
                }
                else {
                    goto label_12;
                }
                goto label_13;
            }
            goto label_28;
        }
        catch(SQLiteException sQLiteException0) {
            try {
                z = false;
                this.zzj().zzg().zza("Error checking backfill conditions", sQLiteException0);
                goto label_17;
            }
            catch(Throwable throwable0) {
                goto label_21;
            }
        label_10:
            z = true;
            goto label_13;
        label_12:
            z = false;
            try {
            label_13:
                if(this.zza("select count(*) from raw_events where app_id=? and name not like \'!_%\' escape \'!\' limit 1;", new String[]{s}, 0L) > 0L) {
                    goto label_23;
                }
                else {
                    goto label_25;
                }
                goto label_26;
            }
            catch(SQLiteException sQLiteException0) {
            }
            catch(Throwable throwable0) {
                goto label_21;
            }
            try {
                this.zzj().zzg().zza("Error checking backfill conditions", sQLiteException0);
            }
            catch(Throwable throwable0) {
                goto label_21;
            }
        label_17:
            if(cursor0 != null) {
                cursor0.close();
            }
            return z;
        }
        catch(Throwable throwable0) {
        label_21:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_23:
        boolean z1 = true;
        goto label_26;
    label_25:
        z1 = false;
    label_26:
        cursor0.close();
        return z && !z1;
    label_28:
        cursor0.close();
        return false;
    }

    @WorkerThread
    public final void zzu() {
        this.zzal();
        this.e_().endTransaction();
    }

    @WorkerThread
    final void zzv() {
        this.zzt();
        this.zzal();
        if(!this.zzaa()) {
            return;
        }
        long v = this.zzn().zza.zza();
        long v1 = this.zzb().elapsedRealtime();
        if(Math.abs(v1 - v) > zzag.zzn()) {
            this.zzn().zza.zza(v1);
            this.zzt();
            this.zzal();
            if(this.zzaa()) {
                int v2 = this.e_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.zzb().currentTimeMillis()), "518400000"});
                if(v2 > 0) {
                    this.zzj().zzp().zza("Deleted stale rows. rowsDeleted", v2);
                }
            }
        }
    }

    @WorkerThread
    public final void zzw() {
        this.zzal();
        this.e_().setTransactionSuccessful();
    }

    public final boolean zzx() {
        return this.zzb("select count(1) > 0 from raw_events", null) != 0L;
    }

    public final boolean zzy() {
        return this.zzb("select count(1) > 0 from queue where has_realtime = 1", null) != 0L;
    }

    public final boolean zzz() {
        return this.zzb("select count(1) > 0 from raw_events where realtime = 1", null) != 0L;
    }
}

