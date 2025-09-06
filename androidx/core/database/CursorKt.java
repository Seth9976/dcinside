package androidx.core.database;

import android.database.Cursor;
import y4.l;
import y4.m;

public final class CursorKt {
    // 去混淆评级： 低(20)
    @m
    public static final byte[] a(@l Cursor cursor0, int v) {
        return cursor0.isNull(v) ? null : cursor0.getBlob(v);
    }

    // 去混淆评级： 低(20)
    @m
    public static final Double b(@l Cursor cursor0, int v) {
        return cursor0.isNull(v) ? null : cursor0.getDouble(v);
    }

    // 去混淆评级： 低(20)
    @m
    public static final Float c(@l Cursor cursor0, int v) {
        return cursor0.isNull(v) ? null : cursor0.getFloat(v);
    }

    // 去混淆评级： 低(20)
    @m
    public static final Integer d(@l Cursor cursor0, int v) {
        return cursor0.isNull(v) ? null : cursor0.getInt(v);
    }

    // 去混淆评级： 低(20)
    @m
    public static final Long e(@l Cursor cursor0, int v) {
        return cursor0.isNull(v) ? null : cursor0.getLong(v);
    }

    // 去混淆评级： 低(20)
    @m
    public static final Short f(@l Cursor cursor0, int v) {
        return cursor0.isNull(v) ? null : cursor0.getShort(v);
    }

    // 去混淆评级： 低(20)
    @m
    public static final String g(@l Cursor cursor0, int v) {
        return cursor0.isNull(v) ? null : cursor0.getString(v);
    }
}

