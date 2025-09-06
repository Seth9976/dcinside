package com.apm.insight.e.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.HashMap;

public final class b extends a {
    public b() {
        super("duplicatelog");
    }

    @Override  // com.apm.insight.e.a.a
    protected final ContentValues a(Object object0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("path", ((com.apm.insight.d.a)object0).a);
        contentValues0.put("insert_time", ((com.apm.insight.d.a)object0).b);
        return contentValues0;
    }

    @Override  // com.apm.insight.e.a.a
    protected final HashMap a() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("path", "TEXT");
        hashMap0.put("insert_time", "INTEGER");
        hashMap0.put("ext1", "TEXT");
        hashMap0.put("ext2", "TEXT");
        return hashMap0;
    }

    public final void a(SQLiteDatabase sQLiteDatabase0, com.apm.insight.d.a a0) {
        if(a0 != null && !this.a(sQLiteDatabase0, a0.a)) {
            super.a(sQLiteDatabase0, a0);
            try {
                sQLiteDatabase0.execSQL("delete from " + this.a + " where _id in (select _id from " + this.a + " order by insert_time desc limit 1000 offset 500)");
            }
            catch(Exception exception0) {
                com.apm.insight.a.b(exception0);
            }
        }
    }

    @Override  // com.apm.insight.e.a.a
    public final void a(SQLiteDatabase sQLiteDatabase0, Object object0) {
        this.a(sQLiteDatabase0, ((com.apm.insight.d.a)object0));
    }

    public final boolean a(SQLiteDatabase sQLiteDatabase0, String s) {
        int v;
        if(sQLiteDatabase0 != null && !TextUtils.isEmpty(s)) {
            try {
                Cursor cursor0 = sQLiteDatabase0.query(this.a, null, "path=?", new String[]{s}, null, null, null);
                v = 0;
                v = cursor0.getCount();
                cursor0.close();
            }
            catch(Throwable throwable0) {
                com.apm.insight.a.b(throwable0);
            }
            return v > 0;
        }
        return false;
    }
}

