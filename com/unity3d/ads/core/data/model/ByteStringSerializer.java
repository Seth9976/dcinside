package com.unity3d.ads.core.data.model;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ByteStringSerializer implements Serializer {
    @l
    private final ByteStringStore defaultValue;

    public ByteStringSerializer() {
        ByteStringStore byteStringStoreOuterClass$ByteStringStore0 = ByteStringStore.getDefaultInstance();
        L.o(byteStringStoreOuterClass$ByteStringStore0, "getDefaultInstance()");
        this.defaultValue = byteStringStoreOuterClass$ByteStringStore0;
    }

    @l
    public ByteStringStore getDefaultValue() {
        return this.defaultValue;
    }

    @Override  // androidx.datastore.core.Serializer
    public Object getDefaultValue() {
        return this.getDefaultValue();
    }

    @Override  // androidx.datastore.core.Serializer
    @m
    public Object readFrom(@l InputStream inputStream0, @l d d0) {
        try {
            ByteStringStore byteStringStoreOuterClass$ByteStringStore0 = ByteStringStore.parseFrom(inputStream0);
            L.o(byteStringStoreOuterClass$ByteStringStore0, "parseFrom(input)");
            return byteStringStoreOuterClass$ByteStringStore0;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            throw new CorruptionException("Cannot read proto.", invalidProtocolBufferException0);
        }
    }

    @m
    public Object writeTo(@l ByteStringStore byteStringStoreOuterClass$ByteStringStore0, @l OutputStream outputStream0, @l d d0) {
        byteStringStoreOuterClass$ByteStringStore0.writeTo(outputStream0);
        return S0.a;
    }

    @Override  // androidx.datastore.core.Serializer
    public Object writeTo(Object object0, OutputStream outputStream0, d d0) {
        return this.writeTo(((ByteStringStore)object0), outputStream0, d0);
    }
}

