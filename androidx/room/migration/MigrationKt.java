package androidx.room.migration;

import kotlin.jvm.functions.Function1;
import y4.l;
import z3.i;

@i(name = "MigrationKt")
public final class MigrationKt {
    @l
    public static final Migration a(int v, int v1, @l Function1 function10) {
        return new MigrationImpl(v, v1, function10);
    }
}

