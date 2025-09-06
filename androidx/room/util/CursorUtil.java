package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;
import z3.i;

@RestrictTo({Scope.c})
@s0({"SMAP\nCursorUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n145#1,7:185\n13644#2,3:192\n1#3:195\n*S KotlinDebug\n*F\n+ 1 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n39#1:185,7\n127#1:192,3\n*E\n"})
@i(name = "CursorUtil")
public final class CursorUtil {
    @l
    public static final Cursor a(@l Cursor cursor0) {
        Cursor cursor1;
        L.p(cursor0, "c");
        try {
            cursor1 = new MatrixCursor(cursor0.getColumnNames(), cursor0.getCount());
            while(true) {
                if(!cursor0.moveToNext()) {
                    goto label_27;
                }
                Object[] arr_object = new Object[cursor0.getColumnCount()];
                int v = cursor0.getColumnCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    switch(cursor0.getType(v1)) {
                        case 0: {
                            arr_object[v1] = null;
                            break;
                        }
                        case 1: {
                            arr_object[v1] = cursor0.getLong(v1);
                            break;
                        }
                        case 2: {
                            arr_object[v1] = cursor0.getDouble(v1);
                            break;
                        }
                        case 3: {
                            arr_object[v1] = cursor0.getString(v1);
                            break;
                        }
                        case 4: {
                            arr_object[v1] = cursor0.getBlob(v1);
                            break;
                        }
                        default: {
                            throw new IllegalStateException();
                        }
                    }
                }
                ((MatrixCursor)cursor1).addRow(arr_object);
            }
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
    label_27:
        c.a(cursor0, null);
        return cursor1;
    }

    private static final int b(Cursor cursor0, String s) {
        if(Build.VERSION.SDK_INT > 25) {
            return -1;
        }
        if(s.length() == 0) {
            return -1;
        }
        String[] arr_s = cursor0.getColumnNames();
        L.o(arr_s, "columnNames");
        return CursorUtil.c(arr_s, s);
    }

    @VisibleForTesting
    public static final int c(@l String[] arr_s, @l String s) {
        L.p(arr_s, "columnNames");
        L.p(s, "name");
        int v = 0;
        for(int v1 = 0; v < arr_s.length; ++v1) {
            String s1 = arr_s[v];
            if(s1.length() >= s.length() + 2) {
                if(v.N1(s1, '.' + s, false, 2, null)) {
                    return v1;
                }
                if(s1.charAt(0) == 0x60 && v.N1(s1, '.' + s + '`', false, 2, null)) {
                    return v1;
                }
            }
            ++v;
        }
        return -1;
    }

    public static final int d(@l Cursor cursor0, @l String s) {
        L.p(cursor0, "c");
        L.p(s, "name");
        int v = cursor0.getColumnIndex(s);
        if(v >= 0) {
            return v;
        }
        int v1 = cursor0.getColumnIndex('`' + s + '`');
        return v1 >= 0 ? v1 : CursorUtil.b(cursor0, s);
    }

    public static final int e(@l Cursor cursor0, @l String s) {
        String s1;
        L.p(cursor0, "c");
        L.p(s, "name");
        int v = CursorUtil.d(cursor0, s);
        if(v >= 0) {
            return v;
        }
        try {
            String[] arr_s = cursor0.getColumnNames();
            L.o(arr_s, "c.columnNames");
            s1 = kotlin.collections.l.lh(arr_s, null, null, null, 0, null, null, 0x3F, null);
        }
        catch(Exception exception0) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", exception0);
            s1 = "unknown";
        }
        throw new IllegalArgumentException("column \'" + s + "\' does not exist. Available columns: " + s1);
    }

    public static final Object f(@l Cursor cursor0, @l Function1 function10) {
        Object object0;
        L.p(cursor0, "<this>");
        L.p(function10, "block");
        try {
            object0 = function10.invoke(cursor0);
        }
        catch(Throwable throwable0) {
            c.a(cursor0, throwable0);
            throw throwable0;
        }
        c.a(cursor0, null);
        return object0;
    }

    @l
    public static final Cursor g(@l Cursor cursor0, @l String[] arr_s, @l int[] arr_v) {
        L.p(cursor0, "cursor");
        L.p(arr_s, "columnNames");
        L.p(arr_v, "mapping");
        if(arr_s.length != arr_v.length) {
            throw new IllegalStateException("Expected columnNames.length == mapping.length");
        }
        return new CursorWrapper(cursor0) {
            @Override  // android.database.CursorWrapper
            public int getColumnIndex(@l String s) {
                L.p(s, "columnName");
                String[] arr_s = arr_s;
                int[] arr_v = arr_v;
                int v = 0;
                for(int v1 = 0; v < arr_s.length; ++v1) {
                    if(v.O1(arr_s[v], s, true)) {
                        return arr_v[v1];
                    }
                    ++v;
                }
                return super.getColumnIndex(s);
            }
        };
    }
}

