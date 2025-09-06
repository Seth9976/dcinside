package androidx.room.util;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.Y;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,646:1\n145#2,2:647\n148#2,2:654\n151#2:660\n145#2,7:661\n145#2,7:668\n145#2,7:675\n766#3:649\n857#3,2:650\n1855#3,2:652\n857#3,2:656\n1855#3,2:658\n*S KotlinDebug\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n*L\n477#1:647,2\n477#1:654,2\n477#1:660\n542#1:661,7\n580#1:668,7\n613#1:675,7\n497#1:649\n497#1:650,2\n499#1:652,2\n497#1:656,2\n499#1:658,2\n*E\n"})
public final class TableInfoKt {
    private static final Map a(SupportSQLiteDatabase supportSQLiteDatabase0, String s) {
        Map map2;
        Map map1;
        Cursor cursor0 = supportSQLiteDatabase0.x3("PRAGMA table_info(`" + s + "`)");
        try {
            if(cursor0.getColumnCount() > 0) {
                int v = cursor0.getColumnIndex("name");
                int v1 = cursor0.getColumnIndex("type");
                int v2 = cursor0.getColumnIndex("notnull");
                int v3 = cursor0.getColumnIndex("pk");
                int v4 = cursor0.getColumnIndex("dflt_value");
                Map map0 = Y.g();
                while(cursor0.moveToNext()) {
                    String s1 = cursor0.getString(v);
                    String s2 = cursor0.getString(v1);
                    boolean z = cursor0.getInt(v2) != 0;
                    int v5 = cursor0.getInt(v3);
                    String s3 = cursor0.getString(v4);
                    L.o(s1, "name");
                    L.o(s2, "type");
                    map0.put(s1, new Column(s1, s2, z, v5, s3, 2));
                }
                map1 = Y.d(map0);
                goto label_19;
            }
            goto label_21;
        }
        catch(Throwable throwable0) {
            c.a(cursor0, throwable0);
            throw throwable0;
        }
    label_19:
        c.a(cursor0, null);
        return map1;
        try {
        label_21:
            map2 = Y.z();
        }
        catch(Throwable throwable0) {
            c.a(cursor0, throwable0);
            throw throwable0;
        }
        c.a(cursor0, null);
        return map2;
    }

    private static final List b(Cursor cursor0) {
        int v = cursor0.getColumnIndex("id");
        int v1 = cursor0.getColumnIndex("seq");
        int v2 = cursor0.getColumnIndex("from");
        int v3 = cursor0.getColumnIndex("to");
        List list0 = u.i();
        while(cursor0.moveToNext()) {
            int v4 = cursor0.getInt(v);
            int v5 = cursor0.getInt(v1);
            String s = cursor0.getString(v2);
            L.o(s, "cursor.getString(fromColumnIndex)");
            String s1 = cursor0.getString(v3);
            L.o(s1, "cursor.getString(toColumnIndex)");
            list0.add(new ForeignKeyWithSequence(v4, v5, s, s1));
        }
        return u.q5(u.a(list0));
    }

    private static final Set c(SupportSQLiteDatabase supportSQLiteDatabase0, String s) {
        Set set1;
        Cursor cursor0 = supportSQLiteDatabase0.x3("PRAGMA foreign_key_list(`" + s + "`)");
        try {
            int v = cursor0.getColumnIndex("id");
            int v1 = cursor0.getColumnIndex("seq");
            int v2 = cursor0.getColumnIndex("table");
            int v3 = cursor0.getColumnIndex("on_delete");
            int v4 = cursor0.getColumnIndex("on_update");
            List list0 = TableInfoKt.b(cursor0);
            cursor0.moveToPosition(-1);
            Set set0 = k0.d();
            while(cursor0.moveToNext()) {
                if(cursor0.getInt(v1) == 0) {
                    int v5 = cursor0.getInt(v);
                    ArrayList arrayList0 = new ArrayList();
                    ArrayList arrayList1 = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object0: list0) {
                        if(((ForeignKeyWithSequence)object0).c() == v5) {
                            arrayList2.add(object0);
                        }
                    }
                    for(Object object1: arrayList2) {
                        arrayList0.add(((ForeignKeyWithSequence)object1).b());
                        arrayList1.add(((ForeignKeyWithSequence)object1).e());
                    }
                    String s1 = cursor0.getString(v2);
                    L.o(s1, "cursor.getString(tableColumnIndex)");
                    String s2 = cursor0.getString(v3);
                    L.o(s2, "cursor.getString(onDeleteColumnIndex)");
                    String s3 = cursor0.getString(v4);
                    L.o(s3, "cursor.getString(onUpdateColumnIndex)");
                    set0.add(new ForeignKey(s1, s2, s3, arrayList0, arrayList1));
                }
            }
            set1 = k0.a(set0);
            goto label_42;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            c.a(cursor0, throwable0);
            throw throwable1;
        }
    label_42:
        c.a(cursor0, null);
        return set1;
    }

    private static final Index d(SupportSQLiteDatabase supportSQLiteDatabase0, String s, boolean z) {
        Index tableInfo$Index0;
        Cursor cursor0 = supportSQLiteDatabase0.x3("PRAGMA index_xinfo(`" + s + "`)");
        try {
            int v = cursor0.getColumnIndex("seqno");
            int v1 = cursor0.getColumnIndex("cid");
            int v2 = cursor0.getColumnIndex("name");
            int v3 = cursor0.getColumnIndex("desc");
            if(v != -1 && v1 != -1 && v2 != -1 && v3 != -1) {
                TreeMap treeMap0 = new TreeMap();
                TreeMap treeMap1 = new TreeMap();
                while(cursor0.moveToNext()) {
                    if(cursor0.getInt(v1) >= 0) {
                        int v4 = cursor0.getInt(v);
                        String s1 = cursor0.getString(v2);
                        String s2 = cursor0.getInt(v3) <= 0 ? "ASC" : "DESC";
                        L.o(s1, "columnName");
                        treeMap0.put(v4, s1);
                        treeMap1.put(v4, s2);
                    }
                }
                Collection collection0 = treeMap0.values();
                L.o(collection0, "columnsMap.values");
                List list0 = u.V5(collection0);
                Collection collection1 = treeMap1.values();
                L.o(collection1, "ordersMap.values");
                tableInfo$Index0 = new Index(s, z, list0, u.V5(collection1));
                goto label_29;
            }
            goto label_31;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            c.a(cursor0, throwable0);
            throw throwable1;
        }
    label_29:
        c.a(cursor0, null);
        return tableInfo$Index0;
    label_31:
        c.a(cursor0, null);
        return null;
    }

    private static final Set e(SupportSQLiteDatabase supportSQLiteDatabase0, String s) {
        Set set1;
        Set set0;
        Cursor cursor0 = supportSQLiteDatabase0.x3("PRAGMA index_list(`" + s + "`)");
        int v = cursor0.getColumnIndex("name");
        int v1 = cursor0.getColumnIndex("origin");
        int v2 = cursor0.getColumnIndex("unique");
        if(v != -1 && v1 != -1 && v2 != -1) {
            set0 = k0.d();
            while(true) {
                if(!cursor0.moveToNext()) {
                    set1 = k0.a(set0);
                    goto label_24;
                }
                if(L.g("c", cursor0.getString(v1))) {
                    String s1 = cursor0.getString(v);
                    boolean z = cursor0.getInt(v2) == 1;
                    L.o(s1, "name");
                    Index tableInfo$Index0 = TableInfoKt.d(supportSQLiteDatabase0, s1, z);
                    if(tableInfo$Index0 == null) {
                        c.a(cursor0, null);
                        return null;
                    }
                    set0.add(tableInfo$Index0);
                }
            }
        }
        c.a(cursor0, null);
        return null;
        try {
            set1 = k0.a(set0);
            goto label_24;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            c.a(cursor0, throwable0);
            throw throwable1;
        }
    label_24:
        c.a(cursor0, null);
        return set1;
    }

    @l
    public static final TableInfo f(@l SupportSQLiteDatabase supportSQLiteDatabase0, @l String s) {
        L.p(supportSQLiteDatabase0, "database");
        L.p(s, "tableName");
        return new TableInfo(s, TableInfoKt.a(supportSQLiteDatabase0, s), TableInfoKt.c(supportSQLiteDatabase0, s), TableInfoKt.e(supportSQLiteDatabase0, s));
    }
}

