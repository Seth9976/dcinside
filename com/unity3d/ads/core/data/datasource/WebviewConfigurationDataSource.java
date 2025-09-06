package com.unity3d.ads.core.data.datasource;

import A3.o;
import A3.p;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

public final class WebviewConfigurationDataSource {
    @l
    private final DataStore webviewConfigurationStore;

    public WebviewConfigurationDataSource(@l DataStore dataStore0) {
        L.p(dataStore0, "webviewConfigurationStore");
        super();
        this.webviewConfigurationStore = dataStore0;
    }

    @m
    public final Object get(@l d d0) {
        return k.v0(k.u(this.webviewConfigurationStore.getData(), new p() {
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
                com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.get.2 webviewConfigurationDataSource$get$20 = new com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.get.2(d0);
                webviewConfigurationDataSource$get$20.L$0 = j0;
                webviewConfigurationDataSource$get$20.L$1 = throwable0;
                return webviewConfigurationDataSource$get$20.invokeSuspend(S0.a);
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
                        WebViewConfigurationStore webviewConfigurationStore$WebViewConfigurationStore0 = WebViewConfigurationStore.getDefaultInstance();
                        L.o(webviewConfigurationStore$WebViewConfigurationStore0, "getDefaultInstance()");
                        this.L$0 = null;
                        this.label = 1;
                        return j0.emit(webviewConfigurationStore$WebViewConfigurationStore0, this) == object1 ? object1 : S0.a;
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
    public final Object set(@l WebViewConfigurationStore webviewConfigurationStore$WebViewConfigurationStore0, @l d d0) {
        com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.set.2 webviewConfigurationDataSource$set$20 = new o(null) {
            final WebViewConfigurationStore $data;
            int label;

            {
                this.$data = webviewConfigurationStore$WebViewConfigurationStore0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.set.2(this.$data, d0);
            }

            @m
            public final Object invoke(@l WebViewConfigurationStore webviewConfigurationStore$WebViewConfigurationStore0, @m d d0) {
                return ((com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.set.2)this.create(webviewConfigurationStore$WebViewConfigurationStore0, d0)).invokeSuspend(S0.a);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((WebViewConfigurationStore)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return this.$data;
            }
        };
        Object object0 = this.webviewConfigurationStore.a(webviewConfigurationDataSource$set$20, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

