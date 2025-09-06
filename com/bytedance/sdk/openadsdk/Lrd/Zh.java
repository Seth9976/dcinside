package com.bytedance.sdk.openadsdk.Lrd;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class Zh {
    public static String PjT() [...] // Inlined contents

    public static void PjT(SQLiteDatabase sQLiteDatabase0) throws SQLException {
        sQLiteDatabase0.execSQL("ALTER TABLE trackurl ADD COLUMN ad_id TEXT ");
        sQLiteDatabase0.execSQL("ALTER TABLE trackurl ADD COLUMN error_code TEXT ");
        sQLiteDatabase0.execSQL("ALTER TABLE trackurl ADD COLUMN error_msg TEXT ");
        sQLiteDatabase0.execSQL("ALTER TABLE trackurl ADD COLUMN url_type INTEGER default 0");
    }
}

