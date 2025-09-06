package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public final class NoOpCorruptionHandler implements CorruptionHandler {
    @Override  // androidx.datastore.core.CorruptionHandler
    @m
    public Object a(@l CorruptionException corruptionException0, @l d d0) throws CorruptionException {
        throw corruptionException0;
    }
}

