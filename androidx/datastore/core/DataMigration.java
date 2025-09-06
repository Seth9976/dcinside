package androidx.datastore.core;

import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface DataMigration {
    @m
    Object cleanUp(@l d arg1);

    @m
    Object migrate(Object arg1, @l d arg2);

    @m
    Object shouldMigrate(Object arg1, @l d arg2);
}

