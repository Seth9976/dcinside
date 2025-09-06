package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class PreservingByteStringPreferenceMigration implements DataMigration {
    @l
    private final Context context;
    @l
    private final GetByteStringData getByteStringData;
    @l
    private final String key;
    @l
    private final String name;

    public PreservingByteStringPreferenceMigration(@l Context context0, @l String s, @l String s1, @l GetByteStringData getByteStringData0) {
        L.p(context0, "context");
        L.p(s, "name");
        L.p(s1, "key");
        L.p(getByteStringData0, "getByteStringData");
        super();
        this.context = context0;
        this.name = s;
        this.key = s1;
        this.getByteStringData = getByteStringData0;
    }

    @Override  // androidx.datastore.core.DataMigration
    @m
    public Object cleanUp(@l d d0) {
        return S0.a;
    }

    @m
    public Object migrate(@l ByteStringStore byteStringStoreOuterClass$ByteStringStore0, @l d d0) {
        if(byteStringStoreOuterClass$ByteStringStore0.getData().isEmpty()) {
            String s = this.context.getSharedPreferences(this.name, 0).getString(this.key, null);
            if(s != null && s.length() != 0) {
                byteStringStoreOuterClass$ByteStringStore0 = ByteStringStore.newBuilder().setData(this.getByteStringData.invoke(s)).build();
                L.o(byteStringStoreOuterClass$ByteStringStore0, "newBuilder()\n           …                 .build()");
            }
        }
        return byteStringStoreOuterClass$ByteStringStore0;
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

