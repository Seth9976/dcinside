package com.unity3d.ads.core.data.model;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class UniversalRequestStoreSerializer implements Serializer {
    @l
    private final UniversalRequestStore defaultValue;

    public UniversalRequestStoreSerializer() {
        UniversalRequestStore universalRequestStoreOuterClass$UniversalRequestStore0 = UniversalRequestStore.getDefaultInstance();
        L.o(universalRequestStoreOuterClass$UniversalRequestStore0, "getDefaultInstance()");
        this.defaultValue = universalRequestStoreOuterClass$UniversalRequestStore0;
    }

    @l
    public UniversalRequestStore getDefaultValue() {
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
            UniversalRequestStore universalRequestStoreOuterClass$UniversalRequestStore0 = UniversalRequestStore.parseFrom(inputStream0);
            L.o(universalRequestStoreOuterClass$UniversalRequestStore0, "parseFrom(input)");
            return universalRequestStoreOuterClass$UniversalRequestStore0;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            throw new CorruptionException("Cannot read proto.", invalidProtocolBufferException0);
        }
    }

    @m
    public Object writeTo(@l UniversalRequestStore universalRequestStoreOuterClass$UniversalRequestStore0, @l OutputStream outputStream0, @l d d0) {
        universalRequestStoreOuterClass$UniversalRequestStore0.writeTo(outputStream0);
        return S0.a;
    }

    @Override  // androidx.datastore.core.Serializer
    public Object writeTo(Object object0, OutputStream outputStream0, d d0) {
        return this.writeTo(((UniversalRequestStore)object0), outputStream0, d0);
    }
}

