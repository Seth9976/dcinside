package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.Lrd.Zh;
import java.util.ArrayList;
import jeb.synthetic.TWR;

class cz {
    class PjT extends SQLiteOpenHelper {
        final Context PjT;
        final cz Zh;

        public PjT(Context context0) {
            super(context0, "ttopensdk.db", null, 11);
            this.PjT = context0;
        }

        private void PjT(SQLiteDatabase sQLiteDatabase0) {
            sQLiteDatabase0.execSQL("ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0");
            sQLiteDatabase0.execSQL("ALTER TABLE loghighpriority ADD COLUMN encrypt INTEGER default 0");
            sQLiteDatabase0.execSQL("ALTER TABLE logstats ADD COLUMN encrypt INTEGER default 0");
            sQLiteDatabase0.execSQL("ALTER TABLE logstatsbatch ADD COLUMN encrypt INTEGER default 0");
        }

        private void PjT(SQLiteDatabase sQLiteDatabase0, Context context0) {
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0 , channel INTEGER default 0)");
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS loghighpriority (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , encrypt INTEGER default 0 , retry INTEGER default 0)");
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS logstatsbatch (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0, ad_id TEXT , url_type INTEGER default 0, error_code TEXT ,error_msg TEXT )");
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS adevent_applog (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0, channel INTEGER default 0)");
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)");
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)");
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS user_value (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit_id TEXT ,cpm TEXT ,adn_name TEXT ,adn_slot_id TEXT ,gen_time INTEGER)");
        }

        private void ReZ(SQLiteDatabase sQLiteDatabase0) {
            ArrayList arrayList0 = this.cr(sQLiteDatabase0);
            if(arrayList0 != null && arrayList0.size() > 0) {
                for(Object object0: arrayList0) {
                    sQLiteDatabase0.execSQL(String.format("DROP TABLE IF EXISTS %s ;", ((String)object0)));
                }
            }
        }

        private void Zh(SQLiteDatabase sQLiteDatabase0) {
            sQLiteDatabase0.execSQL("ALTER TABLE ugen_template ADD COLUMN rit TEXT ");
        }

        private ArrayList cr(SQLiteDatabase sQLiteDatabase0) {
            ArrayList arrayList0 = new ArrayList();
            Cursor cursor0 = null;
            try {
                cursor0 = sQLiteDatabase0.rawQuery("select name from sqlite_master where type=\'table\' order by name", null);
                if(cursor0 != null) {
                    while(cursor0.moveToNext()) {
                        String s = cursor0.getString(0);
                        if(!s.equals("android_metadata") && !s.equals("sqlite_sequence")) {
                            arrayList0.add(s);
                        }
                    }
                }
            }
            catch(Exception unused_ex) {
                if(cursor0 != null) {
                    goto label_15;
                }
                return arrayList0;
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
            if(cursor0 != null) {
            label_15:
                cursor0.close();
                return arrayList0;
            }
            return arrayList0;
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase0) {
            try {
                this.PjT(sQLiteDatabase0, this.PjT);
            }
            catch(Throwable throwable0) {
                RD.Zh("DBHelper", throwable0.getMessage());
            }
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
            if(v > v1) {
                try {
                    this.ReZ(sQLiteDatabase0);
                    this.PjT(sQLiteDatabase0, cz.this.Zh);
                }
                catch(Throwable throwable0) {
                    RD.Zh(throwable0.getMessage(), new Object[0]);
                }
            }
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
            try {
                if(v > v1) {
                    this.ReZ(sQLiteDatabase0);
                }
                this.PjT(sQLiteDatabase0, cz.this.Zh);
                switch(v) {
                    case 1: {
                        this.PjT(sQLiteDatabase0);
                        break;
                    }
                    case 2: {
                        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS \'ad_video_info\';");
                        this.PjT(sQLiteDatabase0);
                        break;
                    }
                    case 3: {
                        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , encrypt INTEGER default 0 , retry INTEGER default 0)");
                        this.PjT(sQLiteDatabase0);
                        break;
                    }
                    case 4: {
                        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)");
                        this.PjT(sQLiteDatabase0);
                        break;
                    }
                    case 5: {
                        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS logstatsbatch (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
                        this.PjT(sQLiteDatabase0);
                        break;
                    }
                    case 6: {
                        this.PjT(sQLiteDatabase0);
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
            if(v < 11) {
                try {
                    this.Zh(sQLiteDatabase0);
                    Zh.PjT(sQLiteDatabase0);
                }
                catch(Throwable throwable0) {
                    RD.Zh("DBHelper", throwable0.getMessage());
                }
            }
        }
    }

    public class ReZ {
        final cz PjT;
        private SQLiteDatabase Zh;

        public ReZ() {
            this.Zh = null;
        }

        private void JQp() {
            Object object0;
            synchronized(this) {
                try {
                    object0 = cz.ReZ;
                    __monitor_enter(object0);
                }
                catch(Throwable throwable0) {
                    goto label_15;
                }
            }
            try {
                if(this.Zh == null || !this.Zh.isOpen()) {
                    Context context0 = cz.this.ReZ();
                    SQLiteDatabase sQLiteDatabase0 = new PjT(cz.this, context0).getWritableDatabase();
                    this.Zh = sQLiteDatabase0;
                    sQLiteDatabase0.setLockingEnabled(false);
                }
                __monitor_exit(object0);
                return;
            }
            catch(Throwable throwable1) {
            }
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
            label_15:
                RD.Zh("DBHelper", throwable0.getMessage());
                if(this.cz()) {
                    throw throwable0;
                }
            }
        }

        public int PjT(String s, ContentValues contentValues0, String s1, String[] arr_s) {
            synchronized(this) {
                try {
                    this.JQp();
                    return this.Zh.update(s, contentValues0, s1, arr_s);
                }
                catch(Exception exception0) {
                    RD.Zh("DBHelper", exception0.getMessage());
                    if(this.cz()) {
                        throw exception0;
                    }
                    return 0;
                }
            }
        }

        public int PjT(String s, String s1, String[] arr_s) {
            synchronized(this) {
                try {
                    this.JQp();
                    return this.Zh.delete(s, s1, arr_s);
                }
                catch(Exception exception0) {
                    RD.Zh("DBHelper", exception0.getMessage());
                    if(this.cz()) {
                        throw exception0;
                    }
                    return 0;
                }
            }
        }

        public long PjT(String s, String s1, ContentValues contentValues0) {
            synchronized(this) {
                try {
                    this.JQp();
                    return this.Zh.replace(s, s1, contentValues0);
                }
                catch(Exception exception0) {
                    RD.Zh("DBHelper", exception0.getMessage());
                    if(this.cz()) {
                        throw exception0;
                    }
                    return -1L;
                }
            }
        }

        public Cursor PjT(String s, String[] arr_s, String s1, String[] arr_s1, String s2, String s3, String s4) {
            synchronized(this) {
                try {
                    this.JQp();
                    return this.Zh.query(s, arr_s, s1, arr_s1, s2, s3, s4);
                }
                catch(Throwable throwable0) {
                    RD.Zh("DBHelper", throwable0.getMessage());
                    com.bytedance.sdk.openadsdk.core.cz.Zh cz$Zh0 = new com.bytedance.sdk.openadsdk.core.cz.Zh(cz.this, null);
                    if(this.cz()) {
                        throw throwable0;
                    }
                    return cz$Zh0;
                }
            }
        }

        public SQLiteDatabase PjT() {
            this.JQp();
            return this.Zh;
        }

        public void PjT(String s) throws SQLException {
            synchronized(this) {
                try {
                    this.JQp();
                    this.Zh.execSQL(s);
                }
                catch(Throwable throwable0) {
                    if(this.cz()) {
                        throw throwable0;
                    }
                }
            }
        }

        public void ReZ() {
            synchronized(this) {
                this.JQp();
                SQLiteDatabase sQLiteDatabase0 = this.Zh;
                if(sQLiteDatabase0 == null) {
                    return;
                }
                sQLiteDatabase0.setTransactionSuccessful();
            }
        }

        public void Zh() {
            synchronized(this) {
                this.JQp();
                SQLiteDatabase sQLiteDatabase0 = this.Zh;
                if(sQLiteDatabase0 == null) {
                    return;
                }
                sQLiteDatabase0.beginTransaction();
            }
        }

        public void cr() {
            synchronized(this) {
                this.JQp();
                SQLiteDatabase sQLiteDatabase0 = this.Zh;
                if(sQLiteDatabase0 == null) {
                    return;
                }
                sQLiteDatabase0.endTransaction();
            }
        }

        private boolean cz() {
            synchronized(this) {
                return this.Zh != null && this.Zh.inTransaction();
            }
        }
    }

    class com.bytedance.sdk.openadsdk.core.cz.Zh extends AbstractCursor {
        final cz PjT;

        private com.bytedance.sdk.openadsdk.core.cz.Zh() {
        }

        com.bytedance.sdk.openadsdk.core.cz.Zh(com.bytedance.sdk.openadsdk.core.cz.1 cz$10) {
        }

        @Override  // android.database.AbstractCursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override  // android.database.AbstractCursor
        public int getCount() {
            return 0;
        }

        @Override  // android.database.AbstractCursor
        public double getDouble(int v) {
            return 0.0;
        }

        @Override  // android.database.AbstractCursor
        public float getFloat(int v) {
            return 0.0f;
        }

        @Override  // android.database.AbstractCursor
        public int getInt(int v) {
            return 0;
        }

        @Override  // android.database.AbstractCursor
        public long getLong(int v) {
            return 0L;
        }

        @Override  // android.database.AbstractCursor
        public short getShort(int v) {
            return 0;
        }

        @Override  // android.database.AbstractCursor
        public String getString(int v) {
            return null;
        }

        @Override  // android.database.AbstractCursor
        public boolean isNull(int v) {
            return true;
        }
    }

    private ReZ PjT;
    private static final Object ReZ;
    private Context Zh;

    static {
        cz.ReZ = new Object();
    }

    cz(Context context0) {
        try {
            this.Zh = context0 == null ? ub.PjT() : context0.getApplicationContext();
            if(this.PjT == null) {
                this.PjT = new ReZ(this);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public ReZ PjT() {
        return this.PjT;
    }

    private Context ReZ() {
        return this.Zh == null ? ub.PjT() : this.Zh;
    }

    class com.bytedance.sdk.openadsdk.core.cz.1 {
    }

}

