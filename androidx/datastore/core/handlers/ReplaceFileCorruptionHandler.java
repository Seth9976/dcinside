package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import java.io.IOException;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ReplaceFileCorruptionHandler implements CorruptionHandler {
    @l
    private final Function1 a;

    public ReplaceFileCorruptionHandler(@l Function1 function10) {
        L.p(function10, "produceNewData");
        super();
        this.a = function10;
    }

    @Override  // androidx.datastore.core.CorruptionHandler
    @m
    public Object a(@l CorruptionException corruptionException0, @l d d0) throws IOException {
        return this.a.invoke(corruptionException0);
    }
}

