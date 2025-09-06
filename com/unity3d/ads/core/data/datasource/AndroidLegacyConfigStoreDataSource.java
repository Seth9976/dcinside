package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreKt.Dsl;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager.StorageType;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidLegacyConfigStoreDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidLegacyConfigStoreDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidLegacyConfigStoreDataSource\n+ 2 ByteStringStoreKt.kt\ncom/unity3d/ads/datastore/ByteStringStoreKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n10#2:43\n1#3:44\n*S KotlinDebug\n*F\n+ 1 AndroidLegacyConfigStoreDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidLegacyConfigStoreDataSource\n*L\n26#1:43\n26#1:44\n*E\n"})
public final class AndroidLegacyConfigStoreDataSource implements ByteStringDataSource {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String KEY_CONFIGURATION_STORE = "configuration.store";
    @l
    private final StorageManager storageManager;

    static {
        AndroidLegacyConfigStoreDataSource.Companion = new Companion(null);
    }

    public AndroidLegacyConfigStoreDataSource(@l StorageManager storageManager0) {
        L.p(storageManager0, "storageManager");
        super();
        this.storageManager = storageManager0;
    }

    @Override  // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    @m
    public Object get(@l d d0) {
        ByteString byteString1;
        Object object0 = this.storageManager.getStorage(StorageType.PRIVATE).get("configuration.store");
        ByteString byteString0 = null;
        String s = object0 instanceof String ? ((String)object0) : null;
        try {
            byteString1 = s == null ? null : ProtobufExtensionsKt.fromBase64(s, true);
        }
        catch(Throwable throwable0) {
            byteString1 = e0.b(f0.a(throwable0));
        }
        if(!e0.i(byteString1)) {
            byteString0 = byteString1;
        }
        ByteString byteString2 = byteString0;
        Builder byteStringStoreOuterClass$ByteStringStore$Builder0 = ByteStringStore.newBuilder();
        L.o(byteStringStoreOuterClass$ByteStringStore$Builder0, "newBuilder()");
        Dsl byteStringStoreKt$Dsl0 = Dsl.Companion._create(byteStringStoreOuterClass$ByteStringStore$Builder0);
        if(byteString2 == null) {
            byteString2 = ByteString.EMPTY;
            L.o(byteString2, "EMPTY");
        }
        byteStringStoreKt$Dsl0.setData(byteString2);
        return byteStringStoreKt$Dsl0._build();
    }

    @Override  // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    @m
    public Object set(@l ByteString byteString0, @l d d0) {
        Storage storage0 = this.storageManager.getStorage(StorageType.PRIVATE);
        storage0.set("configuration.store", ProtobufExtensionsKt.toBase64(byteString0, true));
        storage0.writeStorage();
        return S0.a;
    }
}

