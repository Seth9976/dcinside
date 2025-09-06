package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface Serializer {
    Object getDefaultValue();

    @m
    Object readFrom(@l InputStream arg1, @l d arg2);

    @m
    Object writeTo(Object arg1, @l OutputStream arg2, @l d arg3);
}

