package com.unity3d.services.core.domain.task;

import A3.o;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import java.io.File;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

public final class InitializeStateLoadCache extends MetricTask {
    public static final class LoadCacheResult {
        private final boolean hasHashMismatch;
        @m
        private final String webViewData;

        public LoadCacheResult(boolean z, @m String s) {
            this.hasHashMismatch = z;
            this.webViewData = s;
        }

        public LoadCacheResult(boolean z, String s, int v, w w0) {
            if((v & 2) != 0) {
                s = null;
            }
            this(z, s);
        }

        public final boolean component1() {
            return this.hasHashMismatch;
        }

        @m
        public final String component2() {
            return this.webViewData;
        }

        @l
        public final LoadCacheResult copy(boolean z, @m String s) {
            return new LoadCacheResult(z, s);
        }

        public static LoadCacheResult copy$default(LoadCacheResult initializeStateLoadCache$LoadCacheResult0, boolean z, String s, int v, Object object0) {
            if((v & 1) != 0) {
                z = initializeStateLoadCache$LoadCacheResult0.hasHashMismatch;
            }
            if((v & 2) != 0) {
                s = initializeStateLoadCache$LoadCacheResult0.webViewData;
            }
            return initializeStateLoadCache$LoadCacheResult0.copy(z, s);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof LoadCacheResult)) {
                return false;
            }
            return this.hasHashMismatch == ((LoadCacheResult)object0).hasHashMismatch ? L.g(this.webViewData, ((LoadCacheResult)object0).webViewData) : false;
        }

        public final boolean getHasHashMismatch() {
            return this.hasHashMismatch;
        }

        @m
        public final String getWebViewData() {
            return this.webViewData;
        }

        @Override
        public int hashCode() {
            int v = this.hasHashMismatch;
            if(v) {
                v = 1;
            }
            return this.webViewData == null ? v * 0x1F : v * 0x1F + this.webViewData.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "LoadCacheResult(hasHashMismatch=" + this.hasHashMismatch + ", webViewData=" + this.webViewData + ')';
        }
    }

    public static final class Params implements BaseParams {
        @l
        private final Configuration config;

        public Params(@l Configuration configuration0) {
            L.p(configuration0, "config");
            super();
            this.config = configuration0;
        }

        @l
        public final Configuration component1() {
            return this.config;
        }

        @l
        public final Params copy(@l Configuration configuration0) {
            L.p(configuration0, "config");
            return new Params(configuration0);
        }

        public static Params copy$default(Params initializeStateLoadCache$Params0, Configuration configuration0, int v, Object object0) {
            if((v & 1) != 0) {
                configuration0 = initializeStateLoadCache$Params0.config;
            }
            return initializeStateLoadCache$Params0.copy(configuration0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Params ? L.g(this.config, ((Params)object0).config) : false;
        }

        @l
        public final Configuration getConfig() {
            return this.config;
        }

        @Override
        public int hashCode() {
            return this.config.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    @l
    private final ISDKDispatchers dispatchers;

    public InitializeStateLoadCache(@l ISDKDispatchers iSDKDispatchers0) {
        L.p(iSDKDispatchers0, "dispatchers");
        super();
        this.dispatchers = iSDKDispatchers0;
    }

    @Override  // com.unity3d.services.core.domain.task.BaseTask
    public Object doWork-gIAlu-s(BaseParams baseParams0, d d0) {
        return this.doWork-gIAlu-s(((Params)baseParams0), d0);
    }

    @m
    public Object doWork-gIAlu-s(@l Params initializeStateLoadCache$Params0, @l d d0) {
        com.unity3d.services.core.domain.task.InitializeStateLoadCache.doWork.1 initializeStateLoadCache$doWork$10;
        if(d0 instanceof com.unity3d.services.core.domain.task.InitializeStateLoadCache.doWork.1) {
            initializeStateLoadCache$doWork$10 = (com.unity3d.services.core.domain.task.InitializeStateLoadCache.doWork.1)d0;
            int v = initializeStateLoadCache$doWork$10.label;
            if((v & 0x80000000) == 0) {
                initializeStateLoadCache$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        Object object1 = d0.doWork-gIAlu-s(null, this);
                        return object1 == b.l() ? object1 : e0.a(object1);
                    }
                };
            }
            else {
                initializeStateLoadCache$doWork$10.label = v ^ 0x80000000;
            }
        }
        else {
            initializeStateLoadCache$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    Object object1 = d0.doWork-gIAlu-s(null, this);
                    return object1 == b.l() ? object1 : e0.a(object1);
                }
            };
        }
        Object object0 = initializeStateLoadCache$doWork$10.result;
        Object object1 = b.l();
        switch(initializeStateLoadCache$doWork$10.label) {
            case 0: {
                f0.n(object0);
                K k0 = this.dispatchers.getDefault();
                com.unity3d.services.core.domain.task.InitializeStateLoadCache.doWork.2 initializeStateLoadCache$doWork$20 = new o(initializeStateLoadCache$Params0, null) {
                    final Params $params;
                    int label;

                    {
                        InitializeStateLoadCache.this = initializeStateLoadCache0;
                        this.$params = initializeStateLoadCache$Params0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.services.core.domain.task.InitializeStateLoadCache.doWork.2(InitializeStateLoadCache.this, this.$params, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.services.core.domain.task.InitializeStateLoadCache.doWork.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        LoadCacheResult initializeStateLoadCache$LoadCacheResult1;
                        LoadCacheResult initializeStateLoadCache$LoadCacheResult0;
                        if(this.label != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        Params initializeStateLoadCache$Params0 = this.$params;
                        try {
                            DeviceLog.debug("Unity Ads init: check if webapp can be loaded from local cache");
                            byte[] arr_b = InitializeStateLoadCache.this.getWebViewData();
                            boolean z = true;
                            if(arr_b == null) {
                                initializeStateLoadCache$LoadCacheResult0 = new LoadCacheResult(true, null, 2, null);
                            }
                            else {
                                String s = Utilities.Sha256(arr_b);
                                Charset charset0 = Charset.forName("UTF-8");
                                L.o(charset0, "forName(\"UTF-8\")");
                                String s1 = new String(arr_b, charset0);
                                if(s != null && L.g(s, initializeStateLoadCache$Params0.getConfig().getWebViewHash())) {
                                    z = false;
                                    DeviceLog.info("Unity Ads init: webapp loaded from local cache");
                                }
                                initializeStateLoadCache$LoadCacheResult0 = new LoadCacheResult(z, s1);
                            }
                            initializeStateLoadCache$LoadCacheResult1 = initializeStateLoadCache$LoadCacheResult0;
                            goto label_24;
                        }
                        catch(CancellationException cancellationException0) {
                        }
                        catch(Throwable throwable0) {
                            goto label_23;
                        }
                        throw cancellationException0;
                    label_23:
                        initializeStateLoadCache$LoadCacheResult1 = e0.b(f0.a(throwable0));
                    label_24:
                        if(!e0.j(initializeStateLoadCache$LoadCacheResult1)) {
                            Throwable throwable1 = e0.e(initializeStateLoadCache$LoadCacheResult1);
                            if(throwable1 != null) {
                                initializeStateLoadCache$LoadCacheResult1 = e0.b(f0.a(throwable1));
                            }
                        }
                        return e0.a(initializeStateLoadCache$LoadCacheResult1);
                    }
                };
                initializeStateLoadCache$doWork$10.label = 1;
                object0 = i.h(k0, initializeStateLoadCache$doWork$20, initializeStateLoadCache$doWork$10);
                return object0 == object1 ? object1 : ((e0)object0).l();
            }
            case 1: {
                f0.n(object0);
                return ((e0)object0).l();
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.unity3d.services.core.domain.task.MetricTask
    @l
    public String getMetricName() {
        return "native_read_local_webview_task_unknown_time";
    }

    private final byte[] getWebViewData() {
        try {
            return Utilities.readFileBytes(new File(""));
        }
        catch(Exception exception0) {
            DeviceLog.debug(("Unity Ads init: webapp not found in local cache: " + exception0.getMessage()));
            return null;
        }
    }
}

