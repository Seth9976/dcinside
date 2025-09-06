package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.DataMigration;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class FetchGLInfoDataMigration implements DataMigration {
    @l
    private final GetOpenGLRendererInfo getOpenGLRendererInfo;

    public FetchGLInfoDataMigration(@l GetOpenGLRendererInfo getOpenGLRendererInfo0) {
        L.p(getOpenGLRendererInfo0, "getOpenGLRendererInfo");
        super();
        this.getOpenGLRendererInfo = getOpenGLRendererInfo0;
    }

    @Override  // androidx.datastore.core.DataMigration
    @m
    public Object cleanUp(@l d d0) {
        return S0.a;
    }

    private final ByteString gatherOpenGLRendererInfo() {
        return this.getOpenGLRendererInfo.invoke();
    }

    @m
    public Object migrate(@l ByteStringStore byteStringStoreOuterClass$ByteStringStore0, @l d d0) {
        ByteString byteString0;
        try {
            byteString0 = this.gatherOpenGLRendererInfo();
        }
        catch(Exception unused_ex) {
            byteString0 = ByteString.EMPTY;
            L.o(byteString0, "{\n            ByteString.EMPTY\n        }");
        }
        GeneratedMessageLite generatedMessageLite0 = ByteStringStore.newBuilder().setData(byteString0).build();
        L.o(generatedMessageLite0, "newBuilder()\n           …rer)\n            .build()");
        return generatedMessageLite0;
    }

    @Override  // androidx.datastore.core.DataMigration
    public Object migrate(Object object0, d d0) {
        return this.migrate(((ByteStringStore)object0), d0);
    }

    @m
    public Object shouldMigrate(@l ByteStringStore byteStringStoreOuterClass$ByteStringStore0, @l d d0) {
        return b.a(byteStringStoreOuterClass$ByteStringStore0.getData().isEmpty());
    }

    @Override  // androidx.datastore.core.DataMigration
    public Object shouldMigrate(Object object0, d d0) {
        return this.shouldMigrate(((ByteStringStore)object0), d0);
    }
}

