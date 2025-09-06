package com.unity3d.ads.core.data.datasource;

import A3.o;
import A3.p;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.datastore.ByteStringStoreKt.Dsl;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

public final class AndroidByteStringDataSource implements ByteStringDataSource {
    @l
    private final DataStore dataStore;

    public AndroidByteStringDataSource(@l DataStore dataStore0) {
        L.p(dataStore0, "dataStore");
        super();
        this.dataStore = dataStore0;
    }

    @Override  // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    @m
    public Object get(@l d d0) {
        return k.v0(k.u(this.dataStore.getData(), new p() {
            private Object L$0;
            Object L$1;
            int label;

            {
                super(3, d0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((j)object0), ((Throwable)object1), ((d)object2));
            }

            @m
            public final Object invoke(@l j j0, @l Throwable throwable0, @m d d0) {
                com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource.get.2 androidByteStringDataSource$get$20 = new com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource.get.2(d0);
                androidByteStringDataSource$get$20.L$0 = j0;
                androidByteStringDataSource$get$20.L$1 = throwable0;
                return androidByteStringDataSource$get$20.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        j j0 = (j)this.L$0;
                        Throwable throwable0 = (Throwable)this.L$1;
                        if(!(throwable0 instanceof CorruptionException)) {
                            throw throwable0;
                        }
                        Builder byteStringStoreOuterClass$ByteStringStore$Builder0 = ByteStringStore.newBuilder();
                        L.o(byteStringStoreOuterClass$ByteStringStore$Builder0, "newBuilder()");
                        Dsl byteStringStoreKt$Dsl0 = Dsl.Companion._create(byteStringStoreOuterClass$ByteStringStore$Builder0);
                        L.o(ByteString.EMPTY, "EMPTY");
                        byteStringStoreKt$Dsl0.setData(ByteString.EMPTY);
                        ByteStringStore byteStringStoreOuterClass$ByteStringStore0 = byteStringStoreKt$Dsl0._build();
                        this.L$0 = null;
                        this.label = 1;
                        return j0.emit(byteStringStoreOuterClass$ByteStringStore0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }), d0);
    }

    @Override  // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    @m
    public Object set(@l ByteString byteString0, @l d d0) {
        com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource.set.2 androidByteStringDataSource$set$20 = new o(null) {
            final ByteString $data;
            Object L$0;
            int label;

            {
                this.$data = byteString0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource.set.2(this.$data, d0);
                d1.L$0 = object0;
                return d1;
            }

            @m
            public final Object invoke(@l ByteStringStore byteStringStoreOuterClass$ByteStringStore0, @m d d0) {
                return ((com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource.set.2)this.create(byteStringStoreOuterClass$ByteStringStore0, d0)).invokeSuspend(S0.a);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((ByteStringStore)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                GeneratedMessageLite generatedMessageLite0 = ((Builder)((ByteStringStore)this.L$0).toBuilder()).setData(this.$data).build();
                L.o(generatedMessageLite0, "currentData.toBuilder()\n…\n                .build()");
                return generatedMessageLite0;
            }
        };
        Object object0 = this.dataStore.a(androidByteStringDataSource$set$20, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

