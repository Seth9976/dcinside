package androidx.work.impl.model;

import androidx.sqlite.db.SupportSQLiteQuery;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.K;
import kotlinx.coroutines.flow.i;
import y4.l;

public final class RawWorkInfoDaoKt {
    @l
    public static final i a(@l RawWorkInfoDao rawWorkInfoDao0, @l K k0, @l SupportSQLiteQuery supportSQLiteQuery0) {
        L.p(rawWorkInfoDao0, "<this>");
        L.p(k0, "dispatcher");
        L.p(supportSQLiteQuery0, "query");
        return WorkSpecDaoKt.a(rawWorkInfoDao0.c(supportSQLiteQuery0), k0);
    }
}

