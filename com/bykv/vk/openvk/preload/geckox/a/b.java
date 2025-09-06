package com.bykv.vk.openvk.preload.geckox.a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bykv.vk.openvk.preload.geckox.utils.a;
import java.util.ArrayList;
import java.util.List;

class b extends SQLiteOpenHelper {
    private static volatile b a;

    private b(Context context0, String s, SQLiteDatabase.CursorFactory sQLiteDatabase$CursorFactory0) {
        super(context0, s, sQLiteDatabase$CursorFactory0, 1);
    }

    public static b a(Context context0) {
        if(b.a == null) {
            Class class0 = b.class;
            __monitor_enter(class0);
            try {
                if(b.a == null) {
                    b.a = new b(context0.getApplicationContext(), "geckox_clean_statistic" + a.c(context0) + ".db", null);
                }
                __monitor_exit(class0);
                return b.a;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return b.a;
    }

    final List a() {
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = this.getWritableDatabase().query("geckox_clean_statistic", null, null, null, null, null, null);
            if(cursor0 == null) {
                return list0;
            }
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(cursor0.getColumnIndex("access_key"));
                String s1 = cursor0.getString(cursor0.getColumnIndex("channel"));
                int v = cursor0.getInt(cursor0.getColumnIndex("clean_type"));
                int v1 = cursor0.getInt(cursor0.getColumnIndex("status"));
                long v2 = (long)cursor0.getInt(cursor0.getColumnIndex("pkg_id"));
                int v3 = cursor0.getInt(cursor0.getColumnIndex("err_code"));
                String s2 = cursor0.getString(cursor0.getColumnIndex("err_msg"));
                int v4 = cursor0.getInt(cursor0.getColumnIndex("clean_strategy"));
                long v5 = cursor0.getLong(cursor0.getColumnIndex("clean_duration"));
                PackageStatisticModel statisticModel$PackageStatisticModel0 = new PackageStatisticModel();
                statisticModel$PackageStatisticModel0.accessKey = s;
                statisticModel$PackageStatisticModel0.channel = s1;
                statisticModel$PackageStatisticModel0.statsType = v1;
                statisticModel$PackageStatisticModel0.id = v2;
                statisticModel$PackageStatisticModel0.errCode = v3 == 0 ? null : String.valueOf(v3);
                statisticModel$PackageStatisticModel0.errMsg = s2;
                statisticModel$PackageStatisticModel0.cleanType = v;
                statisticModel$PackageStatisticModel0.cleanDuration = v5;
                statisticModel$PackageStatisticModel0.cleanStrategy = v4;
                list0.add(statisticModel$PackageStatisticModel0);
            }
            this.getWritableDatabase().delete("geckox_clean_statistic", null, null);
        }
        catch(Exception exception0) {
            GeckoLogger.w("clean-channel", "get all statistic failed!", exception0);
        }
        CloseableUtils.close(cursor0);
        return list0;
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("create table if not exists geckox_clean_statistic (id integer primary key autoincrement,access_key text,channel text,clean_type integer,status integer,pkg_id integer,err_code integer,clean_strategy integer,clean_duration integer,err_msg text)");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }
}

