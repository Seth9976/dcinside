package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface ByteStringDataSource {
    @m
    Object get(@l d arg1);

    @m
    Object set(@l ByteString arg1, @l d arg2);
}

