package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class h.f extends SQLiteOpenHelper {
    public h.f(Context context0) {
        super(context0, "tt_open_sdk_video.db", null, 3);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS video_http_header_t(_id INTEGER PRIMARY KEY AUTOINCREMENT,key TEXT,mime TEXT,contentLength INTEGER,flag INTEGER,extra TEXT)");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        switch(v) {
            case 1: {
                sQLiteDatabase0.execSQL("ALTER TABLE video_http_header_t ADD COLUMN flag INTEGER DEFAULT 0");
                sQLiteDatabase0.execSQL("ALTER TABLE video_http_header_t ADD COLUMN extra TEXT DEFAULT \'\'");
                return;
            }
            case 2: {
                sQLiteDatabase0.execSQL("ALTER TABLE video_http_header_t ADD COLUMN extra TEXT DEFAULT \'\'");
                return;
            }
            default: {
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS video_http_header_t");
                this.onCreate(sQLiteDatabase0);
            }
        }
    }
}

