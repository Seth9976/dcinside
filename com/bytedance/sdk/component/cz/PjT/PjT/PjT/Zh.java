package com.bytedance.sdk.component.cz.PjT.PjT.PjT;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.cz.PjT.Au;
import java.util.List;
import org.json.JSONObject;

class Zh {
    class PjT extends AbstractCursor {
        final Zh PjT;

        private PjT() {
        }

        PjT(com.bytedance.sdk.component.cz.PjT.PjT.PjT.Zh.1 zh$10) {
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

    public class com.bytedance.sdk.component.cz.PjT.PjT.PjT.Zh.Zh {
        final Zh PjT;
        private volatile SQLiteDatabase Zh;

        public com.bytedance.sdk.component.cz.PjT.PjT.PjT.Zh.Zh() {
            this.Zh = null;
        }

        private void PjT() {
            try {
                if(this.Zh != null && this.Zh.isOpen()) {
                    return;
                }
                __monitor_enter(this);
            }
            catch(Throwable throwable0) {
                goto label_12;
            }
            try {
                if(this.Zh == null || !this.Zh.isOpen()) {
                    this.Zh = Au.XX().cr().PjT(Au.XX().cz());
                    this.Zh.setLockingEnabled(false);
                }
                __monitor_exit(this);
                return;
            }
            catch(Throwable throwable1) {
            }
            try {
                __monitor_exit(this);
                throw throwable1;
            }
            catch(Throwable throwable0) {
            }
        label_12:
            if(this.Zh()) {
                throw throwable0;
            }
        }

        public int PjT(String s, ContentValues contentValues0, String s1, String[] arr_s) {
            try {
                this.PjT();
                return this.Zh.update(s, contentValues0, s1, arr_s);
            }
            catch(Exception exception0) {
                if(this.Zh()) {
                    throw exception0;
                }
                return 0;
            }
        }

        public int PjT(String s, String s1, String[] arr_s) {
            try {
                this.PjT();
                return this.Zh.delete(s, s1, arr_s);
            }
            catch(Exception exception0) {
                if(this.Zh()) {
                    throw exception0;
                }
                return 0;
            }
        }

        public long PjT(String s, String s1, ContentValues contentValues0) {
            try {
                this.PjT();
                return this.Zh.insert(s, s1, contentValues0);
            }
            catch(Exception exception0) {
                if(this.Zh()) {
                    throw exception0;
                }
                return -1L;
            }
        }

        public Cursor PjT(String s, String[] arr_s, String s1, String[] arr_s1, String s2, String s3, String s4) {
            try {
                this.PjT();
                return this.Zh.query(s, arr_s, s1, arr_s1, s2, s3, s4);
            }
            catch(Throwable throwable0) {
                PjT zh$PjT0 = new PjT(Zh.this, null);
                if(this.Zh()) {
                    throw throwable0;
                }
                return zh$PjT0;
            }
        }

        public void PjT(String s) throws SQLException {
            try {
                this.PjT();
                this.Zh.execSQL(s);
            }
            catch(Throwable throwable0) {
                if(this.Zh()) {
                    throw throwable0;
                }
            }
        }

        public void PjT(String s, String s1, List list0) {
            __monitor_enter(this);
            try {
                try {
                    this.PjT();
                    this.Zh.beginTransaction();
                    ContentValues contentValues0 = new ContentValues();
                    for(int v = 0; v < list0.size(); ++v) {
                        com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0 = (com.bytedance.sdk.component.cz.PjT.cr.PjT)list0.get(v);
                        if(pjT0 != null) {
                            JSONObject jSONObject0 = pjT0.XX();
                            if(jSONObject0 != null) {
                                contentValues0.put("id", pjT0.ReZ());
                                String s2 = Au.XX().xE().Zh(jSONObject0.toString());
                                if(!TextUtils.isEmpty(s2)) {
                                    contentValues0.put("value", s2);
                                    contentValues0.put("gen_time", System.currentTimeMillis());
                                    contentValues0.put("retry", 0);
                                    contentValues0.put("encrypt", 1);
                                    if(com.bytedance.sdk.component.cz.PjT.ReZ.PjT.cr() && pjT0.DWo() > 0 && (pjT0.cr() == 0 || pjT0.cr() == 3)) {
                                        contentValues0.put("channel", pjT0.DWo());
                                    }
                                    this.Zh.insert(s, s1, contentValues0);
                                }
                                contentValues0.clear();
                            }
                        }
                    }
                    this.Zh.setTransactionSuccessful();
                    goto label_38;
                }
                catch(Exception exception0) {
                }
                list0.size();
                if(this.Zh()) {
                    throw exception0;
                }
            }
            catch(Throwable throwable0) {
                goto label_35;
            }
            if(this.Zh != null) {
                try {
                    this.Zh.endTransaction();
                }
                catch(Throwable throwable1) {
                    __monitor_exit(this);
                    throw throwable1;
                }
                __monitor_exit(this);
                return;
                try {
                label_35:
                    if(this.Zh != null) {
                        this.Zh.endTransaction();
                    }
                    throw throwable0;
                label_38:
                    if(this.Zh != null) {
                        this.Zh.endTransaction();
                        goto label_44;
                    }
                    goto label_46;
                }
                catch(Throwable throwable1) {
                    __monitor_exit(this);
                    throw throwable1;
                }
            label_44:
                __monitor_exit(this);
                return;
            }
        label_46:
            __monitor_exit(this);
        }

        private boolean Zh() {
            return this.Zh != null && this.Zh.inTransaction();
        }
    }

    private com.bytedance.sdk.component.cz.PjT.PjT.PjT.Zh.Zh PjT;
    private Context Zh;

    Zh(Context context0) {
        try {
            this.Zh = context0.getApplicationContext();
            if(this.PjT == null) {
                this.PjT = new com.bytedance.sdk.component.cz.PjT.PjT.PjT.Zh.Zh(this);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public com.bytedance.sdk.component.cz.PjT.PjT.PjT.Zh.Zh PjT() {
        return this.PjT;
    }

    class com.bytedance.sdk.component.cz.PjT.PjT.PjT.Zh.1 {
    }

}

