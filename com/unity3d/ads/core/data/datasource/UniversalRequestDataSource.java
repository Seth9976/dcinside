package com.unity3d.ads.core.data.datasource;

import A3.o;
import A3.p;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

public final class UniversalRequestDataSource {
    @l
    private final DataStore universalRequestStore;

    public UniversalRequestDataSource(@l DataStore dataStore0) {
        L.p(dataStore0, "universalRequestStore");
        super();
        this.universalRequestStore = dataStore0;
    }

    @m
    public final Object get(@l d d0) {
        return k.v0(k.u(this.universalRequestStore.getData(), new p() {
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
                com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.get.2 universalRequestDataSource$get$20 = new com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.get.2(d0);
                universalRequestDataSource$get$20.L$0 = j0;
                universalRequestDataSource$get$20.L$1 = throwable0;
                return universalRequestDataSource$get$20.invokeSuspend(S0.a);
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
                        UniversalRequestStore universalRequestStoreOuterClass$UniversalRequestStore0 = UniversalRequestStore.getDefaultInstance();
                        L.o(universalRequestStoreOuterClass$UniversalRequestStore0, "getDefaultInstance()");
                        this.L$0 = null;
                        this.label = 1;
                        return j0.emit(universalRequestStoreOuterClass$UniversalRequestStore0, this) == object1 ? object1 : S0.a;
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

    @m
    public final Object remove(@l String s, @l d d0) {
        com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.remove.2 universalRequestDataSource$remove$20 = new o(null) {
            final String $key;
            Object L$0;
            int label;

            {
                this.$key = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.remove.2(this.$key, d0);
                d1.L$0 = object0;
                return d1;
            }

            @m
            public final Object invoke(@l UniversalRequestStore universalRequestStoreOuterClass$UniversalRequestStore0, @m d d0) {
                return ((com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.remove.2)this.create(universalRequestStoreOuterClass$UniversalRequestStore0, d0)).invokeSuspend(S0.a);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((UniversalRequestStore)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Builder universalRequestStoreOuterClass$UniversalRequestStore$Builder0 = (Builder)((UniversalRequestStore)this.L$0).toBuilder();
                universalRequestStoreOuterClass$UniversalRequestStore$Builder0.removeUniversalRequestMap(this.$key);
                GeneratedMessageLite generatedMessageLite0 = universalRequestStoreOuterClass$UniversalRequestStore$Builder0.build();
                L.o(generatedMessageLite0, "dataBuilder.build()");
                return generatedMessageLite0;
            }
        };
        Object object0 = this.universalRequestStore.a(universalRequestDataSource$remove$20, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @m
    public final Object set(@l String s, @l ByteString byteString0, @l d d0) {
        com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.set.2 universalRequestDataSource$set$20 = new o(byteString0, null) {
            final ByteString $data;
            final String $key;
            Object L$0;
            int label;

            {
                this.$key = s;
                this.$data = byteString0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.set.2(this.$key, this.$data, d0);
                d1.L$0 = object0;
                return d1;
            }

            @m
            public final Object invoke(@l UniversalRequestStore universalRequestStoreOuterClass$UniversalRequestStore0, @m d d0) {
                return ((com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.set.2)this.create(universalRequestStoreOuterClass$UniversalRequestStore0, d0)).invokeSuspend(S0.a);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((UniversalRequestStore)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Builder universalRequestStoreOuterClass$UniversalRequestStore$Builder0 = (Builder)((UniversalRequestStore)this.L$0).toBuilder();
                universalRequestStoreOuterClass$UniversalRequestStore$Builder0.putUniversalRequestMap(this.$key, this.$data);
                GeneratedMessageLite generatedMessageLite0 = universalRequestStoreOuterClass$UniversalRequestStore$Builder0.build();
                L.o(generatedMessageLite0, "dataBuilder.build()");
                return generatedMessageLite0;
            }
        };
        Object object0 = this.universalRequestStore.a(universalRequestDataSource$set$20, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

