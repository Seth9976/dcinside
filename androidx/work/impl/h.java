package androidx.work.impl;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

public final class h implements Factory {
    public final Context a;

    public h(Context context0) {
        this.a = context0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Factory
    public final SupportSQLiteOpenHelper a(Configuration supportSQLiteOpenHelper$Configuration0) {
        return Companion.c(this.a, supportSQLiteOpenHelper$Configuration0);
    }
}

