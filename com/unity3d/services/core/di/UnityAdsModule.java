package com.unity3d.services.core.di;

import A3.a;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryAsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.device.StorageManager.StorageType;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import gatewayprotocol.v1.NativeConfigurationKt.Dsl;
import gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration;
import gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration;
import gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder;
import gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration;
import gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy;
import gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy;
import gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy;
import java.io.File;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.N;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;
import y4.l;
import y4.m;

@s0({"SMAP\nUnityAdsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnityAdsModule.kt\ncom/unity3d/services/core/di/UnityAdsModule\n+ 2 NativeConfigurationKt.kt\ngatewayprotocol/v1/NativeConfigurationKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DiagnosticEventsConfigurationKt.kt\ngatewayprotocol/v1/DiagnosticEventsConfigurationKtKt\n+ 5 AdOperationsConfigurationKt.kt\ngatewayprotocol/v1/AdOperationsConfigurationKtKt\n+ 6 RequestPolicyKt.kt\ngatewayprotocol/v1/RequestPolicyKtKt\n+ 7 RequestRetryPolicyKt.kt\ngatewayprotocol/v1/RequestRetryPolicyKtKt\n+ 8 RequestTimeoutPolicyKt.kt\ngatewayprotocol/v1/RequestTimeoutPolicyKtKt\n*L\n1#1,305:1\n10#2:306\n1#3:307\n1#3:309\n1#3:311\n1#3:313\n1#3:315\n1#3:317\n10#4:308\n10#5:310\n10#6:312\n10#7:314\n10#8:316\n*S KotlinDebug\n*F\n+ 1 UnityAdsModule.kt\ncom/unity3d/services/core/di/UnityAdsModule\n*L\n209#1:306\n209#1:307\n215#1:309\n271#1:311\n279#1:313\n286#1:315\n297#1:317\n215#1:308\n271#1:310\n279#1:312\n286#1:314\n297#1:316\n*E\n"})
public final class UnityAdsModule {
    @l
    public final Context androidContext() {
        Context context0 = ClientProperties.getApplicationContext();
        L.o(context0, "getApplicationContext()");
        return context0;
    }

    @l
    public final AsyncTokenStorage asyncTokenStorage(@l TokenStorage tokenStorage0, @l SDKMetricsSender sDKMetricsSender0) {
        L.p(tokenStorage0, "tokenStorage");
        L.p(sDKMetricsSender0, "sdkMetricsSender");
        return new InMemoryAsyncTokenStorage(null, new Handler(Looper.getMainLooper()), sDKMetricsSender0, tokenStorage0);
    }

    @l
    public final ByteStringDataSource auidDataStore(@l DataStore dataStore0) {
        L.p(dataStore0, "dataStore");
        return this.provideByteStringDataSource(dataStore0);
    }

    @l
    public final K defaultDispatcher() {
        return h0.a();
    }

    @l
    public final NativeConfiguration defaultNativeConfiguration() {
        Builder nativeConfigurationOuterClass$NativeConfiguration$Builder0 = NativeConfiguration.newBuilder();
        L.o(nativeConfigurationOuterClass$NativeConfiguration$Builder0, "newBuilder()");
        Dsl nativeConfigurationKt$Dsl0 = Dsl.Companion._create(nativeConfigurationOuterClass$NativeConfiguration$Builder0);
        nativeConfigurationKt$Dsl0.setAdOperations(this.getDefaultAdOperations());
        nativeConfigurationKt$Dsl0.setInitPolicy(this.getDefaultRequestPolicy());
        nativeConfigurationKt$Dsl0.setAdPolicy(this.getDefaultRequestPolicy());
        nativeConfigurationKt$Dsl0.setOtherPolicy(this.getDefaultRequestPolicy());
        nativeConfigurationKt$Dsl0.setOperativeEventPolicy(this.getDefaultRequestPolicy());
        gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder nativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder0 = DiagnosticEventsConfiguration.newBuilder();
        L.o(nativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder0, "newBuilder()");
        gatewayprotocol.v1.DiagnosticEventsConfigurationKt.Dsl diagnosticEventsConfigurationKt$Dsl0 = gatewayprotocol.v1.DiagnosticEventsConfigurationKt.Dsl.Companion._create(nativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder0);
        diagnosticEventsConfigurationKt$Dsl0.setEnabled(true);
        diagnosticEventsConfigurationKt$Dsl0.setMaxBatchSize(10);
        diagnosticEventsConfigurationKt$Dsl0.setMaxBatchIntervalMs(30000);
        diagnosticEventsConfigurationKt$Dsl0.setTtmEnabled(false);
        nativeConfigurationKt$Dsl0.setDiagnosticEvents(diagnosticEventsConfigurationKt$Dsl0._build());
        return nativeConfigurationKt$Dsl0._build();
    }

    @l
    public final ByteStringDataSource gatewayCacheDataStore(@l DataStore dataStore0) {
        L.p(dataStore0, "dataStore");
        return this.provideByteStringDataSource(dataStore0);
    }

    @l
    public final DataStore gatewayDataStore(@l Context context0, @l K k0) {
        L.p(context0, "context");
        L.p(k0, "dispatcher");
        return this.provideByteStringDataStore(context0, k0, "gateway_cache.pb");
    }

    private final AdOperationsConfiguration getDefaultAdOperations() {
        gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder nativeConfigurationOuterClass$AdOperationsConfiguration$Builder0 = AdOperationsConfiguration.newBuilder();
        L.o(nativeConfigurationOuterClass$AdOperationsConfiguration$Builder0, "newBuilder()");
        gatewayprotocol.v1.AdOperationsConfigurationKt.Dsl adOperationsConfigurationKt$Dsl0 = gatewayprotocol.v1.AdOperationsConfigurationKt.Dsl.Companion._create(nativeConfigurationOuterClass$AdOperationsConfiguration$Builder0);
        adOperationsConfigurationKt$Dsl0.setLoadTimeoutMs(30000);
        adOperationsConfigurationKt$Dsl0.setShowTimeoutMs(10000);
        adOperationsConfigurationKt$Dsl0.setGetTokenTimeoutMs(750);
        return adOperationsConfigurationKt$Dsl0._build();
    }

    private final RequestPolicy getDefaultRequestPolicy() {
        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder nativeConfigurationOuterClass$RequestPolicy$Builder0 = RequestPolicy.newBuilder();
        L.o(nativeConfigurationOuterClass$RequestPolicy$Builder0, "newBuilder()");
        gatewayprotocol.v1.RequestPolicyKt.Dsl requestPolicyKt$Dsl0 = gatewayprotocol.v1.RequestPolicyKt.Dsl.Companion._create(nativeConfigurationOuterClass$RequestPolicy$Builder0);
        requestPolicyKt$Dsl0.setRetryPolicy(this.getDefaultRequestRetryPolicy());
        requestPolicyKt$Dsl0.setTimeoutPolicy(this.getDefaultRequestTimeoutPolicy());
        return requestPolicyKt$Dsl0._build();
    }

    private final RequestRetryPolicy getDefaultRequestRetryPolicy() {
        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder nativeConfigurationOuterClass$RequestRetryPolicy$Builder0 = RequestRetryPolicy.newBuilder();
        L.o(nativeConfigurationOuterClass$RequestRetryPolicy$Builder0, "newBuilder()");
        gatewayprotocol.v1.RequestRetryPolicyKt.Dsl requestRetryPolicyKt$Dsl0 = gatewayprotocol.v1.RequestRetryPolicyKt.Dsl.Companion._create(nativeConfigurationOuterClass$RequestRetryPolicy$Builder0);
        requestRetryPolicyKt$Dsl0.setMaxDuration(120000);
        requestRetryPolicyKt$Dsl0.setRetryWaitBase(500);
        requestRetryPolicyKt$Dsl0.setRetryJitterPct(0.1f);
        requestRetryPolicyKt$Dsl0.setShouldStoreLocally(false);
        requestRetryPolicyKt$Dsl0.setRetryMaxInterval(2500);
        requestRetryPolicyKt$Dsl0.setRetryScalingFactor(2.0f);
        return requestRetryPolicyKt$Dsl0._build();
    }

    private final RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder nativeConfigurationOuterClass$RequestTimeoutPolicy$Builder0 = RequestTimeoutPolicy.newBuilder();
        L.o(nativeConfigurationOuterClass$RequestTimeoutPolicy$Builder0, "newBuilder()");
        gatewayprotocol.v1.RequestTimeoutPolicyKt.Dsl requestTimeoutPolicyKt$Dsl0 = gatewayprotocol.v1.RequestTimeoutPolicyKt.Dsl.Companion._create(nativeConfigurationOuterClass$RequestTimeoutPolicy$Builder0);
        requestTimeoutPolicyKt$Dsl0.setConnectTimeoutMs(30000);
        requestTimeoutPolicyKt$Dsl0.setReadTimeoutMs(30000);
        requestTimeoutPolicyKt$Dsl0.setWriteTimeoutMs(30000);
        requestTimeoutPolicyKt$Dsl0.setOverallTimeoutMs(30000);
        return requestTimeoutPolicyKt$Dsl0._build();
    }

    @l
    public final O getTokenCoroutineScope(@l ISDKDispatchers iSDKDispatchers0, @l CoroutineExceptionHandler coroutineExceptionHandler0, @l I0 i00) {
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(coroutineExceptionHandler0, "errorHandler");
        L.p(i00, "parentJob");
        return P.a(i00.plus(iSDKDispatchers0.getDefault()).plus(new N("get_token_scope")).plus(coroutineExceptionHandler0));
    }

    @l
    public final DataStore glInfoDataStore(@l Context context0, @l K k0, @l DataMigration dataMigration0) {
        L.p(context0, "context");
        L.p(k0, "dispatcher");
        L.p(dataMigration0, "fetchGLInfo");
        ByteStringSerializer byteStringSerializer0 = new ByteStringSerializer();
        List list0 = u.k(dataMigration0);
        O o0 = P.a(k0.plus(j1.c(null, 1, null)));
        com.unity3d.services.core.di.UnityAdsModule.glInfoDataStore.1 unityAdsModule$glInfoDataStore$10 = new a() {
            final Context $context;

            {
                this.$context = context0;
                super(0);
            }

            @l
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, "glinfo.pb");
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        };
        return DataStoreFactory.e(DataStoreFactory.a, byteStringSerializer0, null, list0, o0, unityAdsModule$glInfoDataStore$10, 2, null);
    }

    @l
    public final ByteStringDataSource glInfoDataStore(@l DataStore dataStore0) {
        L.p(dataStore0, "dataStore");
        return this.provideByteStringDataSource(dataStore0);
    }

    @l
    public final DataStore iapTransactionDataStore(@l Context context0, @l K k0) {
        L.p(context0, "context");
        L.p(k0, "dispatcher");
        return this.provideByteStringDataStore(context0, k0, "iap_transaction.pb");
    }

    @l
    public final ByteStringDataSource iapTransactionDataStore(@l DataStore dataStore0) {
        L.p(dataStore0, "dataStore");
        return this.provideByteStringDataSource(dataStore0);
    }

    @l
    public final ByteStringDataSource idfiDataStore(@l DataStore dataStore0) {
        L.p(dataStore0, "dataStore");
        return this.provideByteStringDataSource(dataStore0);
    }

    @l
    public final O initCoroutineScope(@l ISDKDispatchers iSDKDispatchers0, @l CoroutineExceptionHandler coroutineExceptionHandler0, @l I0 i00) {
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(coroutineExceptionHandler0, "errorHandler");
        L.p(i00, "parentJob");
        return P.a(i00.plus(iSDKDispatchers0.getDefault()).plus(new N("init_scope")).plus(coroutineExceptionHandler0));
    }

    @l
    public final K ioDispatcher() {
        return h0.c();
    }

    @l
    public final O loadCoroutineScope(@l ISDKDispatchers iSDKDispatchers0, @l CoroutineExceptionHandler coroutineExceptionHandler0, @l I0 i00) {
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(coroutineExceptionHandler0, "errorHandler");
        L.p(i00, "parentJob");
        return P.a(i00.plus(iSDKDispatchers0.getDefault()).plus(new N("load_scope")).plus(coroutineExceptionHandler0));
    }

    @l
    public final K mainDispatcher() {
        return h0.e();
    }

    @l
    public final MeasurementsService measurementService(@l Context context0, @l ISDKDispatchers iSDKDispatchers0) {
        L.p(context0, "context");
        L.p(iSDKDispatchers0, "dispatchers");
        return new MeasurementsService(context0, iSDKDispatchers0, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    @l
    public final DataStore nativeConfigurationDataStore(@l Context context0, @l K k0) {
        L.p(context0, "context");
        L.p(k0, "dispatcher");
        return this.provideByteStringDataStore(context0, k0, "native_configuration.pb");
    }

    @l
    public final ByteStringDataSource nativeConfigurationDataStore(@l DataStore dataStore0) {
        L.p(dataStore0, "dataStore");
        return this.provideByteStringDataSource(dataStore0);
    }

    @l
    public final O offerwallSignalsCoroutineScope(@l ISDKDispatchers iSDKDispatchers0, @l CoroutineExceptionHandler coroutineExceptionHandler0, @l I0 i00) {
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(coroutineExceptionHandler0, "errorHandler");
        L.p(i00, "parentJob");
        return P.a(i00.plus(iSDKDispatchers0.getDefault()).plus(new N("offerwall_scope")).plus(coroutineExceptionHandler0));
    }

    @l
    public final O omidCoroutineScope(@l ISDKDispatchers iSDKDispatchers0, @l CoroutineExceptionHandler coroutineExceptionHandler0, @l I0 i00) {
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(coroutineExceptionHandler0, "errorHandler");
        L.p(i00, "parentJob");
        return P.a(i00.plus(iSDKDispatchers0.getDefault()).plus(new N("omid_scope")).plus(coroutineExceptionHandler0));
    }

    @l
    public final DataStore privacyDataStore(@l Context context0, @l K k0) {
        L.p(context0, "context");
        L.p(k0, "dispatcher");
        return this.provideByteStringDataStore(context0, k0, "privacy.pb");
    }

    @l
    public final ByteStringDataSource privacyDataStore(@l DataStore dataStore0) {
        L.p(dataStore0, "dataStore");
        return this.provideByteStringDataSource(dataStore0);
    }

    @l
    public final DataStore privacyFsmDataStore(@l Context context0, @l K k0) {
        L.p(context0, "context");
        L.p(k0, "dispatcher");
        return this.provideByteStringDataStore(context0, k0, "privacy_fsm.pb");
    }

    @l
    public final ByteStringDataSource privacyFsmDataStore(@l DataStore dataStore0) {
        L.p(dataStore0, "dataStore");
        return this.provideByteStringDataSource(dataStore0);
    }

    @l
    public final JsonStorage privateJsonStorage() {
        return this.provideJsonStorage(StorageType.PRIVATE);
    }

    private final ByteStringDataSource provideByteStringDataSource(DataStore dataStore0) {
        return new AndroidByteStringDataSource(dataStore0);
    }

    private final DataStore provideByteStringDataStore(Context context0, K k0, String s) {
        ByteStringSerializer byteStringSerializer0 = new ByteStringSerializer();
        O o0 = P.a(k0.plus(j1.c(null, 1, null)));
        com.unity3d.services.core.di.UnityAdsModule.provideByteStringDataStore.1 unityAdsModule$provideByteStringDataStore$10 = new a(s) {
            final Context $context;
            final String $dataStoreFile;

            {
                this.$context = context0;
                this.$dataStoreFile = s;
                super(0);
            }

            @l
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, this.$dataStoreFile);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        };
        return DataStoreFactory.e(DataStoreFactory.a, byteStringSerializer0, null, null, o0, unityAdsModule$provideByteStringDataStore$10, 4, null);
    }

    private final JsonStorage provideJsonStorage(StorageType storageManager$StorageType0) {
        if(!StorageManager.init(ClientProperties.getApplicationContext())) {
            throw new IllegalStateException("StorageManager failed to initialize");
        }
        JsonStorage jsonStorage0 = StorageManager.getStorage(storageManager$StorageType0);
        L.o(jsonStorage0, "getStorage(storageType)");
        return jsonStorage0;
    }

    @l
    public final I0 publicApiJob(@l DiagnosticEventRepository diagnosticEventRepository0) {
        L.p(diagnosticEventRepository0, "diagnosticEventRepository");
        I0 i00 = O0.c(null, 1, null);
        i00.w(new Function1() {
            final DiagnosticEventRepository $diagnosticEventRepository;

            {
                this.$diagnosticEventRepository = diagnosticEventRepository0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                this.$diagnosticEventRepository.flush();
            }
        });
        return i00;
    }

    @l
    public final JsonStorage publicJsonStorage() {
        return this.provideJsonStorage(StorageType.PUBLIC);
    }

    @l
    public final O scarSignalsCoroutineScope(@l ISDKDispatchers iSDKDispatchers0, @l CoroutineExceptionHandler coroutineExceptionHandler0, @l I0 i00) {
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(coroutineExceptionHandler0, "errorHandler");
        L.p(i00, "parentJob");
        return P.a(i00.plus(iSDKDispatchers0.getDefault()).plus(new N("scar_scope")).plus(coroutineExceptionHandler0));
    }

    @l
    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    @l
    public final SDKMetricsSender sdkMetrics() {
        SDKMetricsSender sDKMetricsSender0 = SDKMetrics.getInstance();
        L.o(sDKMetricsSender0, "getInstance()");
        return sDKMetricsSender0;
    }

    @l
    public final O showCoroutineScope(@l ISDKDispatchers iSDKDispatchers0, @l CoroutineExceptionHandler coroutineExceptionHandler0, @l I0 i00) {
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(coroutineExceptionHandler0, "errorHandler");
        L.p(i00, "parentJob");
        return P.a(i00.plus(iSDKDispatchers0.getDefault()).plus(new N("show_scope")).plus(coroutineExceptionHandler0));
    }

    @l
    public final TopicsService topicsService(@l Context context0, @l ISDKDispatchers iSDKDispatchers0) {
        L.p(context0, "context");
        L.p(iSDKDispatchers0, "dispatchers");
        return new TopicsService(context0, iSDKDispatchers0, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    @l
    public final O transactionCoroutineScope(@l ISDKDispatchers iSDKDispatchers0, @l CoroutineExceptionHandler coroutineExceptionHandler0, @l I0 i00) {
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(coroutineExceptionHandler0, "errorHandler");
        L.p(i00, "parentJob");
        return P.a(i00.plus(iSDKDispatchers0.getDefault()).plus(new N("transaction_scope")).plus(coroutineExceptionHandler0));
    }

    @l
    public final DataStore universalRequestDataStore(@l Context context0, @l K k0) {
        L.p(context0, "context");
        L.p(k0, "dispatcher");
        UniversalRequestStoreSerializer universalRequestStoreSerializer0 = new UniversalRequestStoreSerializer();
        O o0 = P.a(k0.plus(j1.c(null, 1, null)));
        com.unity3d.services.core.di.UnityAdsModule.universalRequestDataStore.1 unityAdsModule$universalRequestDataStore$10 = new a() {
            final Context $context;

            {
                this.$context = context0;
                super(0);
            }

            @l
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, "universal_request.pb");
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        };
        return DataStoreFactory.e(DataStoreFactory.a, universalRequestStoreSerializer0, null, null, o0, unityAdsModule$universalRequestDataStore$10, 4, null);
    }

    @l
    public final VolumeChangeMonitor volumeChangeMonitor(@l VolumeChange volumeChange0) {
        L.p(volumeChange0, "volumeChange");
        return new VolumeChangeMonitor(SharedInstances.INSTANCE.getWebViewEventSender(), volumeChange0);
    }

    @l
    public final DataStore webViewConfigurationDataStore(@l Context context0, @l K k0) {
        L.p(context0, "context");
        L.p(k0, "dispatcher");
        WebViewConfigurationStoreSerializer webViewConfigurationStoreSerializer0 = new WebViewConfigurationStoreSerializer();
        O o0 = P.a(k0.plus(j1.c(null, 1, null)));
        com.unity3d.services.core.di.UnityAdsModule.webViewConfigurationDataStore.1 unityAdsModule$webViewConfigurationDataStore$10 = new a() {
            final Context $context;

            {
                this.$context = context0;
                super(0);
            }

            @l
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, "webview_config.pb");
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        };
        return DataStoreFactory.e(DataStoreFactory.a, webViewConfigurationStoreSerializer0, null, null, o0, unityAdsModule$webViewConfigurationDataStore$10, 4, null);
    }
}

