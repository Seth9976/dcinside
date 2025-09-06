package androidx.datastore.core;

import A3.a;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;
import y4.l;
import y4.m;
import z3.j;

public final class DataStoreFactory {
    @l
    public static final DataStoreFactory a;

    static {
        DataStoreFactory.a = new DataStoreFactory();
    }

    @l
    @j
    public final DataStore a(@l Serializer serializer0, @l a a0) {
        L.p(serializer0, "serializer");
        L.p(a0, "produceFile");
        return DataStoreFactory.e(this, serializer0, null, null, null, a0, 14, null);
    }

    @l
    @j
    public final DataStore b(@l Serializer serializer0, @m ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @l a a0) {
        L.p(serializer0, "serializer");
        L.p(a0, "produceFile");
        return DataStoreFactory.e(this, serializer0, replaceFileCorruptionHandler0, null, null, a0, 12, null);
    }

    @l
    @j
    public final DataStore c(@l Serializer serializer0, @m ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @l List list0, @l a a0) {
        L.p(serializer0, "serializer");
        L.p(list0, "migrations");
        L.p(a0, "produceFile");
        return DataStoreFactory.e(this, serializer0, replaceFileCorruptionHandler0, list0, null, a0, 8, null);
    }

    @l
    @j
    public final DataStore d(@l Serializer serializer0, @m ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @l List list0, @l O o0, @l a a0) {
        L.p(serializer0, "serializer");
        L.p(list0, "migrations");
        L.p(o0, "scope");
        L.p(a0, "produceFile");
        if(replaceFileCorruptionHandler0 == null) {
            replaceFileCorruptionHandler0 = new NoOpCorruptionHandler();
        }
        return new SingleProcessDataStore(a0, serializer0, u.k(DataMigrationInitializer.a.b(list0)), replaceFileCorruptionHandler0, o0);
    }

    public static DataStore e(DataStoreFactory dataStoreFactory0, Serializer serializer0, ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, List list0, O o0, a a0, int v, Object object0) {
        if((v & 4) != 0) {
            list0 = u.H();
        }
        if((v & 8) != 0) {
            o0 = P.a(h0.c().plus(j1.c(null, 1, null)));
        }
        return dataStoreFactory0.d(serializer0, ((v & 2) == 0 ? replaceFileCorruptionHandler0 : null), list0, o0, a0);
    }
}

