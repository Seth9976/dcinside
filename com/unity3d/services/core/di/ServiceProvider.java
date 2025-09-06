package com.unity3d.services.core.di;

import A3.a;
import A3.o;
import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.adplayer.CommonGetWebViewCacheAssetLoader;
import com.unity3d.ads.adplayer.GetWebViewCacheAssetLoader;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOfferwallManager;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidScarManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTcfRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.AndroidGetAdRequest;
import com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy;
import com.unity3d.ads.core.domain.AndroidGetClientInfo;
import com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationData;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken;
import com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleFocusCounters;
import com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidHttpClientProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidRemoveUrlQuery;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CleanAssets;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CommonCleanAssets;
import com.unity3d.ads.core.domain.CommonCreateFile;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetCacheDirectory;
import com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.CommonGetGameId;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonSetGameId;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.CommonShouldAllowInitialization;
import com.unity3d.ads.core.domain.CommonValidateGameId;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetGameId;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.ValidateGameId;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.AndroidGetTransactionData;
import com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.CommonGetTransactionRequest;
import com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.GetAndroidTokenEventRequest;
import com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest;
import com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest;
import com.unity3d.ads.core.domain.scar.HandleGetTokenRequest;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration;
import kotlin.E;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.j;
import y4.l;
import y4.m;

public final class ServiceProvider implements IServiceProvider {
    @l
    public static final String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;
    @l
    public static final String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";
    @l
    public static final String DATA_STORE_GL_INFO = "glinfo.pb";
    @l
    public static final String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";
    @l
    public static final String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";
    @l
    public static final String DATA_STORE_PRIVACY = "privacy.pb";
    @l
    public static final String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";
    @l
    public static final String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";
    @l
    public static final String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";
    @l
    public static final String DEFAULT_DISPATCHER = "default_dispatcher";
    @l
    public static final String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";
    @l
    public static final String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 0x1400000L;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500L;
    @l
    public static final ServiceProvider INSTANCE = null;
    @l
    public static final String IO_DISPATCHER = "io_dispatcher";
    @l
    public static final String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";
    @l
    public static final String MAIN_DISPATCHER = "main_dispatcher";
    @l
    public static final String NAMED_AD_REQ = "ad_req";
    @l
    public static final String NAMED_GET_TOKEN_SCOPE = "get_token_scope";
    @l
    public static final String NAMED_INIT_REQ = "init_req";
    @l
    public static final String NAMED_INIT_SCOPE = "init_scope";
    @l
    public static final String NAMED_LOAD_SCOPE = "load_scope";
    @l
    public static final String NAMED_LOCAL = "local";
    @l
    public static final String NAMED_OFFERWALL_SCOPE = "offerwall_scope";
    @l
    public static final String NAMED_OMID_SCOPE = "omid_scope";
    @l
    public static final String NAMED_OPERATIVE_REQ = "op_event_req";
    @l
    public static final String NAMED_OTHER_REQ = "other_req";
    @l
    public static final String NAMED_PUBLIC_JOB = "public_job";
    @l
    public static final String NAMED_REMOTE = "remote";
    @l
    public static final String NAMED_SCAR_SCOPE = "scar_scope";
    @l
    public static final String NAMED_SDK = "sdk";
    @l
    public static final String NAMED_SHOW_SCOPE = "show_scope";
    @l
    public static final String NAMED_TRANSACTION_SCOPE = "transaction_scope";
    @l
    public static final String PREF_GL_INFO = "glinfo";
    public static final long SCAR_SIGNALS_FETCH_TIMEOUT = 50000L;
    public static final long SCAR_VERSION_FETCH_TIMEOUT = 5000L;
    @l
    private static final IServicesRegistry serviceRegistry;

    static {
        ServiceProvider serviceProvider0 = new ServiceProvider();
        ServiceProvider.INSTANCE = serviceProvider0;
        ServiceProvider.serviceRegistry = serviceProvider0.initialize();
    }

    @Override  // com.unity3d.services.core.di.IServiceProvider
    @l
    public IServicesRegistry getRegistry() {
        return ServiceProvider.serviceRegistry;
    }

    @Override  // com.unity3d.services.core.di.IServiceProvider
    @l
    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(com.unity3d.services.core.di.ServiceProvider.initialize.1.INSTANCE);

        @s0({"SMAP\nServiceProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceProvider.kt\ncom/unity3d/services/core/di/ServiceProvider$initialize$1\n+ 2 ServicesRegistry.kt\ncom/unity3d/services/core/di/ServicesRegistry\n*L\n1#1,1082:1\n22#2,5:1083\n23#2,4:1088\n23#2,4:1092\n23#2,4:1096\n22#2,5:1100\n22#2,5:1105\n35#2,4:1110\n35#2,4:1114\n35#2,4:1118\n35#2,4:1122\n35#2,4:1126\n35#2,4:1130\n35#2,4:1134\n35#2,4:1138\n35#2,4:1142\n23#2,4:1146\n23#2,4:1150\n23#2,4:1154\n23#2,4:1158\n23#2,4:1162\n23#2,4:1166\n23#2,4:1170\n23#2,4:1174\n23#2,4:1178\n23#2,4:1182\n23#2,4:1186\n23#2,4:1190\n23#2,4:1194\n22#2,5:1198\n22#2,5:1203\n23#2,4:1208\n23#2,4:1212\n22#2,5:1216\n22#2,5:1221\n22#2,5:1226\n22#2,5:1231\n22#2,5:1236\n22#2,5:1241\n34#2,5:1246\n22#2,5:1251\n22#2,5:1256\n22#2,5:1261\n22#2,5:1266\n22#2,5:1271\n22#2,5:1276\n22#2,5:1281\n22#2,5:1286\n22#2,5:1291\n22#2,5:1296\n22#2,5:1301\n22#2,5:1306\n23#2,4:1311\n22#2,5:1315\n22#2,5:1320\n22#2,5:1325\n22#2,5:1330\n22#2,5:1335\n23#2,4:1340\n22#2,5:1344\n23#2,4:1349\n22#2,5:1353\n22#2,5:1358\n22#2,5:1363\n22#2,5:1368\n22#2,5:1373\n22#2,5:1378\n22#2,5:1383\n22#2,5:1388\n22#2,5:1393\n22#2,5:1398\n22#2,5:1403\n22#2,5:1408\n22#2,5:1413\n22#2,5:1418\n22#2,5:1423\n22#2,5:1428\n22#2,5:1433\n22#2,5:1438\n22#2,5:1443\n22#2,5:1448\n22#2,5:1453\n22#2,5:1458\n22#2,5:1463\n22#2,5:1468\n22#2,5:1473\n22#2,5:1478\n22#2,5:1483\n22#2,5:1488\n22#2,5:1493\n34#2,5:1498\n34#2,5:1503\n22#2,5:1508\n34#2,5:1513\n22#2,5:1518\n22#2,5:1523\n22#2,5:1528\n22#2,5:1533\n23#2,4:1538\n22#2,5:1542\n22#2,5:1547\n22#2,5:1552\n22#2,5:1557\n22#2,5:1562\n22#2,5:1567\n22#2,5:1572\n22#2,5:1577\n22#2,5:1582\n22#2,5:1587\n22#2,5:1592\n22#2,5:1597\n22#2,5:1602\n22#2,5:1607\n22#2,5:1612\n22#2,5:1617\n22#2,5:1622\n22#2,5:1627\n22#2,5:1632\n22#2,5:1637\n22#2,5:1642\n22#2,5:1647\n23#2,4:1652\n22#2,5:1656\n23#2,4:1661\n23#2,4:1665\n22#2,5:1669\n22#2,5:1674\n22#2,5:1679\n22#2,5:1684\n34#2,5:1689\n22#2,5:1694\n22#2,5:1699\n22#2,5:1704\n22#2,5:1709\n22#2,5:1714\n22#2,5:1719\n22#2,5:1724\n22#2,5:1729\n22#2,5:1734\n22#2,5:1739\n22#2,5:1744\n22#2,5:1749\n22#2,5:1754\n22#2,5:1759\n22#2,5:1764\n22#2,5:1769\n22#2,5:1774\n22#2,5:1779\n22#2,5:1784\n22#2,5:1789\n22#2,5:1794\n22#2,5:1799\n23#2,4:1804\n23#2,4:1808\n22#2,5:1812\n22#2,5:1817\n22#2,5:1822\n23#2,4:1827\n22#2,5:1831\n22#2,5:1836\n22#2,5:1841\n22#2,5:1846\n22#2,5:1851\n22#2,5:1856\n22#2,5:1861\n22#2,5:1866\n22#2,5:1871\n22#2,5:1876\n22#2,5:1881\n22#2,5:1886\n22#2,5:1891\n22#2,5:1896\n22#2,5:1901\n22#2,5:1906\n22#2,5:1911\n22#2,5:1916\n34#2,5:1921\n34#2,5:1926\n34#2,5:1931\n34#2,5:1936\n34#2,5:1941\n34#2,5:1946\n34#2,5:1951\n34#2,5:1956\n34#2,5:1961\n34#2,5:1966\n34#2,5:1971\n34#2,5:1976\n22#2,5:1981\n22#2,5:1986\n22#2,5:1991\n22#2,5:1996\n22#2,5:2001\n22#2,5:2006\n22#2,5:2011\n22#2,5:2016\n22#2,5:2021\n22#2,5:2026\n22#2,5:2031\n22#2,5:2036\n22#2,5:2041\n22#2,5:2046\n22#2,5:2051\n22#2,5:2056\n*S KotlinDebug\n*F\n+ 1 ServiceProvider.kt\ncom/unity3d/services/core/di/ServiceProvider$initialize$1\n*L\n331#1:1083,5\n332#1:1088,4\n333#1:1092,4\n334#1:1096,4\n335#1:1100,5\n336#1:1105,5\n337#1:1110,4\n344#1:1114,4\n351#1:1118,4\n358#1:1122,4\n365#1:1126,4\n372#1:1130,4\n379#1:1134,4\n386#1:1138,4\n393#1:1142,4\n394#1:1146,4\n395#1:1150,4\n396#1:1154,4\n397#1:1158,4\n398#1:1162,4\n399#1:1166,4\n405#1:1170,4\n406#1:1174,4\n407#1:1178,4\n408#1:1182,4\n409#1:1186,4\n410#1:1190,4\n411#1:1194,4\n417#1:1198,5\n418#1:1203,5\n419#1:1208,4\n420#1:1212,4\n421#1:1216,5\n422#1:1221,5\n423#1:1226,5\n424#1:1231,5\n425#1:1236,5\n426#1:1241,5\n427#1:1246,5\n428#1:1251,5\n429#1:1256,5\n430#1:1261,5\n431#1:1266,5\n432#1:1271,5\n433#1:1276,5\n434#1:1281,5\n435#1:1286,5\n436#1:1291,5\n442#1:1296,5\n448#1:1301,5\n454#1:1306,5\n455#1:1311,4\n456#1:1315,5\n457#1:1320,5\n458#1:1325,5\n459#1:1330,5\n464#1:1335,5\n469#1:1340,4\n477#1:1344,5\n485#1:1349,4\n490#1:1353,5\n491#1:1358,5\n492#1:1363,5\n493#1:1368,5\n494#1:1373,5\n495#1:1378,5\n506#1:1383,5\n507#1:1388,5\n519#1:1393,5\n520#1:1398,5\n525#1:1403,5\n530#1:1408,5\n538#1:1413,5\n539#1:1418,5\n544#1:1423,5\n549#1:1428,5\n555#1:1433,5\n566#1:1438,5\n567#1:1443,5\n568#1:1448,5\n575#1:1453,5\n576#1:1458,5\n577#1:1463,5\n585#1:1468,5\n591#1:1473,5\n596#1:1478,5\n597#1:1483,5\n603#1:1488,5\n609#1:1493,5\n610#1:1498,5\n617#1:1503,5\n632#1:1508,5\n638#1:1513,5\n639#1:1518,5\n648#1:1523,5\n654#1:1528,5\n660#1:1533,5\n666#1:1538,4\n671#1:1542,5\n679#1:1547,5\n684#1:1552,5\n685#1:1557,5\n695#1:1562,5\n698#1:1567,5\n699#1:1572,5\n700#1:1577,5\n701#1:1582,5\n702#1:1587,5\n711#1:1592,5\n712#1:1597,5\n715#1:1602,5\n724#1:1607,5\n730#1:1612,5\n736#1:1617,5\n743#1:1622,5\n748#1:1627,5\n749#1:1632,5\n754#1:1637,5\n763#1:1642,5\n764#1:1647,5\n770#1:1652,4\n775#1:1656,5\n776#1:1661,4\n781#1:1665,4\n786#1:1669,5\n787#1:1674,5\n795#1:1679,5\n801#1:1684,5\n822#1:1689,5\n833#1:1694,5\n834#1:1699,5\n842#1:1704,5\n843#1:1709,5\n853#1:1714,5\n854#1:1719,5\n859#1:1724,5\n864#1:1729,5\n865#1:1734,5\n866#1:1739,5\n867#1:1744,5\n868#1:1749,5\n869#1:1754,5\n878#1:1759,5\n888#1:1764,5\n889#1:1769,5\n890#1:1774,5\n896#1:1779,5\n902#1:1784,5\n908#1:1789,5\n909#1:1794,5\n914#1:1799,5\n922#1:1804,4\n923#1:1808,4\n924#1:1812,5\n925#1:1817,5\n926#1:1822,5\n934#1:1827,4\n942#1:1831,5\n943#1:1836,5\n944#1:1841,5\n945#1:1846,5\n958#1:1851,5\n959#1:1856,5\n960#1:1861,5\n968#1:1866,5\n969#1:1871,5\n970#1:1876,5\n971#1:1881,5\n972#1:1886,5\n973#1:1891,5\n974#1:1896,5\n975#1:1901,5\n976#1:1906,5\n977#1:1911,5\n978#1:1916,5\n979#1:1921,5\n980#1:1926,5\n987#1:1931,5\n996#1:1936,5\n1008#1:1941,5\n1013#1:1946,5\n1022#1:1951,5\n1035#1:1956,5\n1050#1:1961,5\n1051#1:1966,5\n1062#1:1971,5\n1063#1:1976,5\n1064#1:1981,5\n1065#1:1986,5\n1066#1:1991,5\n1067#1:1996,5\n1068#1:2001,5\n1069#1:2006,5\n1070#1:2011,5\n1071#1:2016,5\n1072#1:2021,5\n1073#1:2026,5\n1074#1:2031,5\n1075#1:2036,5\n1076#1:2041,5\n1077#1:2046,5\n1078#1:2051,5\n1079#1:2056,5\n*E\n"})
        final class com.unity3d.services.core.di.ServiceProvider.initialize.1 extends N implements Function1 {
            public static final com.unity3d.services.core.di.ServiceProvider.initialize.1 INSTANCE;

            static {
                com.unity3d.services.core.di.ServiceProvider.initialize.1.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1();
            }

            com.unity3d.services.core.di.ServiceProvider.initialize.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((ServicesRegistry)object0));
                return S0.a;
            }

            public final void invoke(@l ServicesRegistry servicesRegistry0) {
                L.p(servicesRegistry0, "$this$registry");
                UnityAdsModule unityAdsModule0 = new UnityAdsModule();
                servicesRegistry0.updateService(new ServiceKey("", m0.d(Context.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.1.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.2 serviceProvider$initialize$1$20 = new a() {
                    final UnityAdsModule $moduleInstance;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }

                    @l
                    public final K invoke() {
                        return this.$moduleInstance.mainDispatcher();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("main_dispatcher", m0.d(K.class)), E.a(serviceProvider$initialize$1$20));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.3 serviceProvider$initialize$1$30 = new a() {
                    final UnityAdsModule $moduleInstance;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }

                    @l
                    public final K invoke() {
                        return this.$moduleInstance.defaultDispatcher();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("default_dispatcher", m0.d(K.class)), E.a(serviceProvider$initialize$1$30));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.4 serviceProvider$initialize$1$40 = new a() {
                    final UnityAdsModule $moduleInstance;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }

                    @l
                    public final K invoke() {
                        return this.$moduleInstance.ioDispatcher();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("io_dispatcher", m0.d(K.class)), E.a(serviceProvider$initialize$1$40));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.5 serviceProvider$initialize$1$50 = new a() {
                    final UnityAdsModule $moduleInstance;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        super(0);
                    }

                    @l
                    public final ISDKDispatchers invoke() {
                        return this.$moduleInstance.sdkDispatchers();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(ISDKDispatchers.class)), E.a(serviceProvider$initialize$1$50));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.6 serviceProvider$initialize$1$60 = new a() {
                    final UnityAdsModule $moduleInstance;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        super(0);
                    }

                    @l
                    public final SDKMetricsSender invoke() {
                        return this.$moduleInstance.sdkMetrics();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(SDKMetricsSender.class)), E.a(serviceProvider$initialize$1$60));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.7 serviceProvider$initialize$1$70 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }

                    @l
                    public final O invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        ISDKDispatchers iSDKDispatchers0 = (ISDKDispatchers)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("sdk", m0.d(CoroutineExceptionHandler.class));
                        CoroutineExceptionHandler coroutineExceptionHandler0 = (CoroutineExceptionHandler)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("public_job", m0.d(I0.class));
                        I0 i00 = (I0)this.$this_registry.resolveService(serviceKey2);
                        return this.$moduleInstance.initCoroutineScope(iSDKDispatchers0, coroutineExceptionHandler0, i00);
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("init_scope", m0.d(O.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$70));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.8 serviceProvider$initialize$1$80 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }

                    @l
                    public final O invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        ISDKDispatchers iSDKDispatchers0 = (ISDKDispatchers)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("sdk", m0.d(CoroutineExceptionHandler.class));
                        CoroutineExceptionHandler coroutineExceptionHandler0 = (CoroutineExceptionHandler)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("public_job", m0.d(I0.class));
                        I0 i00 = (I0)this.$this_registry.resolveService(serviceKey2);
                        return this.$moduleInstance.loadCoroutineScope(iSDKDispatchers0, coroutineExceptionHandler0, i00);
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("load_scope", m0.d(O.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$80));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.9 serviceProvider$initialize$1$90 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }

                    @l
                    public final O invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        ISDKDispatchers iSDKDispatchers0 = (ISDKDispatchers)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("sdk", m0.d(CoroutineExceptionHandler.class));
                        CoroutineExceptionHandler coroutineExceptionHandler0 = (CoroutineExceptionHandler)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("public_job", m0.d(I0.class));
                        I0 i00 = (I0)this.$this_registry.resolveService(serviceKey2);
                        return this.$moduleInstance.showCoroutineScope(iSDKDispatchers0, coroutineExceptionHandler0, i00);
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("show_scope", m0.d(O.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$90));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.10 serviceProvider$initialize$1$100 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }

                    @l
                    public final O invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        ISDKDispatchers iSDKDispatchers0 = (ISDKDispatchers)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("sdk", m0.d(CoroutineExceptionHandler.class));
                        CoroutineExceptionHandler coroutineExceptionHandler0 = (CoroutineExceptionHandler)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("public_job", m0.d(I0.class));
                        I0 i00 = (I0)this.$this_registry.resolveService(serviceKey2);
                        return this.$moduleInstance.transactionCoroutineScope(iSDKDispatchers0, coroutineExceptionHandler0, i00);
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("transaction_scope", m0.d(O.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$100));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.11 serviceProvider$initialize$1$110 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }

                    @l
                    public final O invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        ISDKDispatchers iSDKDispatchers0 = (ISDKDispatchers)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("sdk", m0.d(CoroutineExceptionHandler.class));
                        CoroutineExceptionHandler coroutineExceptionHandler0 = (CoroutineExceptionHandler)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("public_job", m0.d(I0.class));
                        I0 i00 = (I0)this.$this_registry.resolveService(serviceKey2);
                        return this.$moduleInstance.getTokenCoroutineScope(iSDKDispatchers0, coroutineExceptionHandler0, i00);
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("get_token_scope", m0.d(O.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$110));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.12 serviceProvider$initialize$1$120 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }

                    @l
                    public final O invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        ISDKDispatchers iSDKDispatchers0 = (ISDKDispatchers)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("sdk", m0.d(CoroutineExceptionHandler.class));
                        CoroutineExceptionHandler coroutineExceptionHandler0 = (CoroutineExceptionHandler)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("public_job", m0.d(I0.class));
                        I0 i00 = (I0)this.$this_registry.resolveService(serviceKey2);
                        return this.$moduleInstance.scarSignalsCoroutineScope(iSDKDispatchers0, coroutineExceptionHandler0, i00);
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("scar_scope", m0.d(O.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$120));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.13 serviceProvider$initialize$1$130 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }

                    @l
                    public final O invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        ISDKDispatchers iSDKDispatchers0 = (ISDKDispatchers)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("sdk", m0.d(CoroutineExceptionHandler.class));
                        CoroutineExceptionHandler coroutineExceptionHandler0 = (CoroutineExceptionHandler)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("public_job", m0.d(I0.class));
                        I0 i00 = (I0)this.$this_registry.resolveService(serviceKey2);
                        return this.$moduleInstance.offerwallSignalsCoroutineScope(iSDKDispatchers0, coroutineExceptionHandler0, i00);
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("offerwall_scope", m0.d(O.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$130));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.14 serviceProvider$initialize$1$140 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }

                    @l
                    public final O invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        ISDKDispatchers iSDKDispatchers0 = (ISDKDispatchers)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("sdk", m0.d(CoroutineExceptionHandler.class));
                        CoroutineExceptionHandler coroutineExceptionHandler0 = (CoroutineExceptionHandler)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("public_job", m0.d(I0.class));
                        I0 i00 = (I0)this.$this_registry.resolveService(serviceKey2);
                        return this.$moduleInstance.omidCoroutineScope(iSDKDispatchers0, coroutineExceptionHandler0, i00);
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("omid_scope", m0.d(O.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$140));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.15 serviceProvider$initialize$1$150 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }

                    @l
                    public final I0 invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(DiagnosticEventRepository.class));
                        DiagnosticEventRepository diagnosticEventRepository0 = (DiagnosticEventRepository)this.$this_registry.resolveService(serviceKey0);
                        return this.$moduleInstance.publicApiJob(diagnosticEventRepository0);
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("public_job", m0.d(I0.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$150));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.16 serviceProvider$initialize$1$160 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final ByteStringDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(StorageManager.class));
                        return new AndroidLegacyConfigStoreDataSource(((StorageManager)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("gateway_cache.pb", m0.d(ByteStringDataSource.class)), E.a(serviceProvider$initialize$1$160));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.17 serviceProvider$initialize$1$170 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final DataStore invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        Context context0 = (Context)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("io_dispatcher", m0.d(K.class));
                        K k0 = (K)this.$this_registry.resolveService(serviceKey1);
                        return this.$moduleInstance.privacyDataStore(context0, k0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("privacy.pb", m0.d(DataStore.class)), E.a(serviceProvider$initialize$1$170));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.18 serviceProvider$initialize$1$180 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final ByteStringDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("privacy.pb", m0.d(DataStore.class));
                        DataStore dataStore0 = (DataStore)this.$this_registry.resolveService(serviceKey0);
                        return this.$moduleInstance.privacyDataStore(dataStore0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("privacy.pb", m0.d(ByteStringDataSource.class)), E.a(serviceProvider$initialize$1$180));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.19 serviceProvider$initialize$1$190 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final DataStore invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        Context context0 = (Context)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("io_dispatcher", m0.d(K.class));
                        K k0 = (K)this.$this_registry.resolveService(serviceKey1);
                        return this.$moduleInstance.privacyFsmDataStore(context0, k0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("privacy_fsm.pb", m0.d(DataStore.class)), E.a(serviceProvider$initialize$1$190));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.20 serviceProvider$initialize$1$200 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final ByteStringDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("privacy_fsm.pb", m0.d(DataStore.class));
                        DataStore dataStore0 = (DataStore)this.$this_registry.resolveService(serviceKey0);
                        return this.$moduleInstance.privacyFsmDataStore(dataStore0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("privacy_fsm.pb", m0.d(ByteStringDataSource.class)), E.a(serviceProvider$initialize$1$200));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.21 serviceProvider$initialize$1$210 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final DataStore invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        Context context0 = (Context)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("io_dispatcher", m0.d(K.class));
                        K k0 = (K)this.$this_registry.resolveService(serviceKey1);
                        return this.$moduleInstance.nativeConfigurationDataStore(context0, k0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("native_configuration.pb", m0.d(DataStore.class)), E.a(serviceProvider$initialize$1$210));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.22 serviceProvider$initialize$1$220 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final ByteStringDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("native_configuration.pb", m0.d(DataStore.class));
                        DataStore dataStore0 = (DataStore)this.$this_registry.resolveService(serviceKey0);
                        return this.$moduleInstance.nativeConfigurationDataStore(dataStore0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("native_configuration.pb", m0.d(ByteStringDataSource.class)), E.a(serviceProvider$initialize$1$220));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.23 serviceProvider$initialize$1$230 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final DataStore invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        Context context0 = (Context)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("io_dispatcher", m0.d(K.class));
                        K k0 = (K)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("glinfo", m0.d(DataMigration.class));
                        DataMigration dataMigration0 = (DataMigration)this.$this_registry.resolveService(serviceKey2);
                        return this.$moduleInstance.glInfoDataStore(context0, k0, dataMigration0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("glinfo.pb", m0.d(DataStore.class)), E.a(serviceProvider$initialize$1$230));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.24 serviceProvider$initialize$1$240 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final ByteStringDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("glinfo.pb", m0.d(DataStore.class));
                        DataStore dataStore0 = (DataStore)this.$this_registry.resolveService(serviceKey0);
                        return this.$moduleInstance.glInfoDataStore(dataStore0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("glinfo.pb", m0.d(ByteStringDataSource.class)), E.a(serviceProvider$initialize$1$240));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.25 serviceProvider$initialize$1$250 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final DataStore invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        Context context0 = (Context)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("io_dispatcher", m0.d(K.class));
                        K k0 = (K)this.$this_registry.resolveService(serviceKey1);
                        return this.$moduleInstance.universalRequestDataStore(context0, k0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("universal_request.pb", m0.d(DataStore.class)), E.a(serviceProvider$initialize$1$250));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.26 serviceProvider$initialize$1$260 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final DataStore invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        Context context0 = (Context)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("io_dispatcher", m0.d(K.class));
                        K k0 = (K)this.$this_registry.resolveService(serviceKey1);
                        return this.$moduleInstance.iapTransactionDataStore(context0, k0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("iap_transaction.pb", m0.d(DataStore.class)), E.a(serviceProvider$initialize$1$260));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.27 serviceProvider$initialize$1$270 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final ByteStringDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("iap_transaction.pb", m0.d(DataStore.class));
                        DataStore dataStore0 = (DataStore)this.$this_registry.resolveService(serviceKey0);
                        return this.$moduleInstance.iapTransactionDataStore(dataStore0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("iap_transaction.pb", m0.d(ByteStringDataSource.class)), E.a(serviceProvider$initialize$1$270));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.28 serviceProvider$initialize$1$280 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final DataStore invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        Context context0 = (Context)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("io_dispatcher", m0.d(K.class));
                        K k0 = (K)this.$this_registry.resolveService(serviceKey1);
                        return this.$moduleInstance.webViewConfigurationDataStore(context0, k0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("webview_config.pb", m0.d(DataStore.class)), E.a(serviceProvider$initialize$1$280));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.29 serviceProvider$initialize$1$290 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final AsyncTokenStorage invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(TokenStorage.class));
                        TokenStorage tokenStorage0 = (TokenStorage)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SDKMetricsSender.class));
                        SDKMetricsSender sDKMetricsSender0 = (SDKMetricsSender)this.$this_registry.resolveService(serviceKey1);
                        return this.$moduleInstance.asyncTokenStorage(tokenStorage0, sDKMetricsSender0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AsyncTokenStorage.class)), E.a(serviceProvider$initialize$1$290));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.30 serviceProvider$initialize$1$300 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final VolumeChangeMonitor invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(VolumeChange.class));
                        VolumeChange volumeChange0 = (VolumeChange)this.$this_registry.resolveService(serviceKey0);
                        return this.$moduleInstance.volumeChangeMonitor(volumeChange0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(VolumeChangeMonitor.class)), E.a(serviceProvider$initialize$1$300));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.31 serviceProvider$initialize$1$310 = new a() {
                    final UnityAdsModule $moduleInstance;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        super(0);
                    }

                    @l
                    public final JsonStorage invoke() {
                        return this.$moduleInstance.publicJsonStorage();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("PUBLIC", m0.d(JsonStorage.class)), E.a(serviceProvider$initialize$1$310));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.32 serviceProvider$initialize$1$320 = new a() {
                    final UnityAdsModule $moduleInstance;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        super(0);
                    }

                    @l
                    public final JsonStorage invoke() {
                        return this.$moduleInstance.privateJsonStorage();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("PRIVATE", m0.d(JsonStorage.class)), E.a(serviceProvider$initialize$1$320));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.33 serviceProvider$initialize$1$330 = new a() {
                    final UnityAdsModule $moduleInstance;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        super(0);
                    }

                    @l
                    public final NativeConfiguration invoke() {
                        return this.$moduleInstance.defaultNativeConfiguration();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(NativeConfiguration.class)), E.a(serviceProvider$initialize$1$330));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.34 serviceProvider$initialize$1$340 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final MeasurementsService invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        Context context0 = (Context)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        ISDKDispatchers iSDKDispatchers0 = (ISDKDispatchers)this.$this_registry.resolveService(serviceKey1);
                        return this.$moduleInstance.measurementService(context0, iSDKDispatchers0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(MeasurementsService.class)), E.a(serviceProvider$initialize$1$340));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.35 serviceProvider$initialize$1$350 = new a(servicesRegistry0) {
                    final UnityAdsModule $moduleInstance;
                    final ServicesRegistry $this_registry;

                    {
                        this.$moduleInstance = unityAdsModule0;
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final TopicsService invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        Context context0 = (Context)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        ISDKDispatchers iSDKDispatchers0 = (ISDKDispatchers)this.$this_registry.resolveService(serviceKey1);
                        return this.$moduleInstance.topicsService(context0, iSDKDispatchers0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(TopicsService.class)), E.a(serviceProvider$initialize$1$350));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(CronetEngineBuilderFactory.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.36.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.37 serviceProvider$initialize$1$370 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final HttpClientProvider invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ConfigFileFromLocalStorage.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(AlternativeFlowReader.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(Context.class));
                        Object object4 = this.$this_registry.resolveService(serviceKey4);
                        ServiceKey serviceKey5 = new ServiceKey("", m0.d(CronetEngineBuilderFactory.class));
                        Object object5 = this.$this_registry.resolveService(serviceKey5);
                        ServiceKey serviceKey6 = new ServiceKey("", m0.d(SessionRepository.class));
                        Object object6 = this.$this_registry.resolveService(serviceKey6);
                        ServiceKey serviceKey7 = new ServiceKey("", m0.d(CleanupDirectory.class));
                        return new AndroidHttpClientProvider(((ConfigFileFromLocalStorage)object0), ((AlternativeFlowReader)object1), ((ISDKDispatchers)object2), ((SendDiagnosticEvent)object3), ((Context)object4), ((CronetEngineBuilderFactory)object5), ((SessionRepository)object6), ((CleanupDirectory)this.$this_registry.resolveService(serviceKey7)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(HttpClientProvider.class)), E.a(serviceProvider$initialize$1$370));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.38 serviceProvider$initialize$1$380 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final HttpClient invoke() {
                        return (HttpClient)j.b(null, new o(null) {
                            final ServicesRegistry $this_registry;
                            int label;

                            {
                                this.$this_registry = servicesRegistry0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new com.unity3d.services.core.di.ServiceProvider.initialize.1.38.1(this.$this_registry, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((com.unity3d.services.core.di.ServiceProvider.initialize.1.38.1)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Object object1 = b.l();
                                switch(this.label) {
                                    case 0: {
                                        f0.n(object0);
                                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(HttpClientProvider.class));
                                        HttpClientProvider httpClientProvider0 = (HttpClientProvider)this.$this_registry.resolveService(serviceKey0);
                                        this.label = 1;
                                        object0 = httpClientProvider0.invoke(this);
                                        return object0 == object1 ? object1 : object0;
                                    }
                                    case 1: {
                                        f0.n(object0);
                                        return object0;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                            }
                        }, 1, null);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(HttpClient.class)), E.a(serviceProvider$initialize$1$380));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.39 serviceProvider$initialize$1$390 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final MediationTraitsMetadataReader invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("PUBLIC", m0.d(JsonStorage.class));
                        return new MediationTraitsMetadataReader(((JsonStorage)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(MediationTraitsMetadataReader.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$390));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.40 serviceProvider$initialize$1$400 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final AlternativeFlowReader invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ConfigurationReader.class));
                        ConfigurationReader configurationReader0 = (ConfigurationReader)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SessionRepository.class));
                        SessionRepository sessionRepository0 = (SessionRepository)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(MediationTraitsMetadataReader.class));
                        return new AlternativeFlowReader(configurationReader0, sessionRepository0, ((MediationTraitsMetadataReader)this.$this_registry.resolveService(serviceKey2)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AlternativeFlowReader.class)), E.a(serviceProvider$initialize$1$400));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(TcfDataSource.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.41.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.42 serviceProvider$initialize$1$420 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final TcfRepository invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(TcfDataSource.class));
                        return new AndroidTcfRepository(((TcfDataSource)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(TcfRepository.class)), E.a(serviceProvider$initialize$1$420));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.43 serviceProvider$initialize$1$430 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final AndroidManifestIntPropertyReader invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        return new AndroidManifestIntPropertyReader(((Context)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AndroidManifestIntPropertyReader.class)), E.a(serviceProvider$initialize$1$430));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.44 serviceProvider$initialize$1$440 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final AndroidTestDataInfo invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(AndroidManifestIntPropertyReader.class));
                        return new AndroidTestDataInfo(((AndroidManifestIntPropertyReader)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AndroidTestDataInfo.class)), E.a(serviceProvider$initialize$1$440));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.45 serviceProvider$initialize$1$450 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GameServerIdReader invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("PUBLIC", m0.d(JsonStorage.class));
                        return new GameServerIdReader(((JsonStorage)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GameServerIdReader.class)), E.a(serviceProvider$initialize$1$450));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.46 serviceProvider$initialize$1$460 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final StoreDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        return new AndroidStoreDataSource(((Context)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(StoreDataSource.class)), E.a(serviceProvider$initialize$1$460));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AnalyticsDataSource.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.47.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.48 serviceProvider$initialize$1$480 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final DeveloperConsentDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("dev_consent_privacy_rules", m0.d(FlattenerRulesUseCase.class));
                        FlattenerRulesUseCase flattenerRulesUseCase0 = (FlattenerRulesUseCase)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("PUBLIC", m0.d(JsonStorage.class));
                        return new AndroidDeveloperConsentDataSource(flattenerRulesUseCase0, ((JsonStorage)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(DeveloperConsentDataSource.class)), E.a(serviceProvider$initialize$1$480));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.49 serviceProvider$initialize$1$490 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final DynamicDeviceInfoDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        Context context0 = (Context)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(LifecycleDataSource.class));
                        return new AndroidDynamicDeviceInfoDataSource(context0, ((LifecycleDataSource)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(DynamicDeviceInfoDataSource.class)), E.a(serviceProvider$initialize$1$490));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.50 serviceProvider$initialize$1$500 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final LegacyUserConsentDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("legacy_privacy_rules", m0.d(FlattenerRulesUseCase.class));
                        FlattenerRulesUseCase flattenerRulesUseCase0 = (FlattenerRulesUseCase)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("PRIVATE", m0.d(JsonStorage.class));
                        return new AndroidLegacyUserConsentDataSource(flattenerRulesUseCase0, ((JsonStorage)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(LegacyUserConsentDataSource.class)), E.a(serviceProvider$initialize$1$500));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(LifecycleDataSource.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.51.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.52 serviceProvider$initialize$1$520 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final CacheDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(CreateFile.class));
                        CreateFile createFile0 = (CreateFile)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GetFileExtensionFromUrl.class));
                        return new AndroidLocalCacheDataSource(createFile0, ((GetFileExtensionFromUrl)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("local", m0.d(CacheDataSource.class)), E.a(serviceProvider$initialize$1$520));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(CreateFile.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.53.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.54 serviceProvider$initialize$1$540 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetFileExtensionFromUrl invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(RemoveUrlQuery.class));
                        return new CommonGetFileExtensionFromUrl(((RemoveUrlQuery)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetFileExtensionFromUrl.class)), E.a(serviceProvider$initialize$1$540));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(RemoveUrlQuery.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.55.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.56 serviceProvider$initialize$1$560 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final MediationDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("PUBLIC", m0.d(JsonStorage.class));
                        return new AndroidMediationDataSource(((JsonStorage)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(MediationDataSource.class)), E.a(serviceProvider$initialize$1$560));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.57 serviceProvider$initialize$1$570 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final PrivacyDeviceInfoDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        return new AndroidPrivacyDeviceInfoDataSource(((Context)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(PrivacyDeviceInfoDataSource.class)), E.a(serviceProvider$initialize$1$570));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.58 serviceProvider$initialize$1$580 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final CacheDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("io_dispatcher", m0.d(K.class));
                        K k0 = (K)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(CreateFile.class));
                        CreateFile createFile0 = (CreateFile)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(GetFileExtensionFromUrl.class));
                        GetFileExtensionFromUrl getFileExtensionFromUrl0 = (GetFileExtensionFromUrl)this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(HttpClient.class));
                        return new AndroidRemoteCacheDataSource(k0, createFile0, getFileExtensionFromUrl0, ((HttpClient)this.$this_registry.resolveService(serviceKey3)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("remote", m0.d(CacheDataSource.class)), E.a(serviceProvider$initialize$1$580));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.59 serviceProvider$initialize$1$590 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final StaticDeviceInfoDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        Context context0 = (Context)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("glinfo.pb", m0.d(ByteStringDataSource.class));
                        ByteStringDataSource byteStringDataSource0 = (ByteStringDataSource)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(AnalyticsDataSource.class));
                        AnalyticsDataSource analyticsDataSource0 = (AnalyticsDataSource)this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(StoreDataSource.class));
                        return new AndroidStaticDeviceInfoDataSource(context0, byteStringDataSource0, analyticsDataSource0, ((StoreDataSource)this.$this_registry.resolveService(serviceKey3)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(StaticDeviceInfoDataSource.class)), E.a(serviceProvider$initialize$1$590));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.60 serviceProvider$initialize$1$600 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final DataMigration invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetOpenGLRendererInfo.class));
                        return new FetchGLInfoDataMigration(((GetOpenGLRendererInfo)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("glinfo", m0.d(DataMigration.class)), E.a(serviceProvider$initialize$1$600));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.61 serviceProvider$initialize$1$610 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final UniversalRequestDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("universal_request.pb", m0.d(DataStore.class));
                        return new UniversalRequestDataSource(((DataStore)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(UniversalRequestDataSource.class)), E.a(serviceProvider$initialize$1$610));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.62 serviceProvider$initialize$1$620 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final WebviewConfigurationDataSource invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("webview_config.pb", m0.d(DataStore.class));
                        return new WebviewConfigurationDataSource(((DataStore)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(WebviewConfigurationDataSource.class)), E.a(serviceProvider$initialize$1$620));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(OmidManager.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.63.INSTANCE));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(SDKPropertiesManager.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.64.INSTANCE));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(StorageManager.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.65.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.66 serviceProvider$initialize$1$660 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final TransactionEventManager invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("transaction_scope", m0.d(O.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(StoreMonitor.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(GetTransactionData.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(GetTransactionRequest.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(TransactionEventRepository.class));
                        Object object4 = this.$this_registry.resolveService(serviceKey4);
                        ServiceKey serviceKey5 = new ServiceKey("iap_transaction.pb", m0.d(ByteStringDataSource.class));
                        Object object5 = this.$this_registry.resolveService(serviceKey5);
                        ServiceKey serviceKey6 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        return new TransactionEventManager(((O)object0), ((StoreMonitor)object1), ((GetTransactionData)object2), ((GetTransactionRequest)object3), ((TransactionEventRepository)object4), ((ByteStringDataSource)object5), ((SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey6)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(TransactionEventManager.class)), E.a(serviceProvider$initialize$1$660));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AdRepository.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.67.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.68 serviceProvider$initialize$1$680 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final CacheRepository invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("io_dispatcher", m0.d(K.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GetCacheDirectory.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("local", m0.d(CacheDataSource.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("remote", m0.d(CacheDataSource.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(Context.class));
                        Object object4 = this.$this_registry.resolveService(serviceKey4);
                        ServiceKey serviceKey5 = new ServiceKey("", m0.d(SessionRepository.class));
                        Object object5 = this.$this_registry.resolveService(serviceKey5);
                        ServiceKey serviceKey6 = new ServiceKey("", m0.d(CleanupDirectory.class));
                        Object object6 = this.$this_registry.resolveService(serviceKey6);
                        ServiceKey serviceKey7 = new ServiceKey("", m0.d(DownloadPriorityQueue.class));
                        return new AndroidCacheRepository(((K)object0), ((GetCacheDirectory)object1), ((CacheDataSource)object2), ((CacheDataSource)object3), ((Context)object4), ((SessionRepository)object5), ((CleanupDirectory)object6), ((DownloadPriorityQueue)this.$this_registry.resolveService(serviceKey7)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(CacheRepository.class)), E.a(serviceProvider$initialize$1$680));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetCacheDirectory.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.69.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.70 serviceProvider$initialize$1$700 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final CampaignRepository invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetSharedDataTimestamps.class));
                        return new AndroidCampaignRepository(((GetSharedDataTimestamps)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(CampaignRepository.class)), E.a(serviceProvider$initialize$1$700));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.71 serviceProvider$initialize$1$710 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final DeveloperConsentRepository invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(DeveloperConsentDataSource.class));
                        return new AndroidDeveloperConsentRepository(((DeveloperConsentDataSource)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(DeveloperConsentRepository.class)), E.a(serviceProvider$initialize$1$710));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.72 serviceProvider$initialize$1$720 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final DeviceInfoRepository invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(StaticDeviceInfoDataSource.class));
                        StaticDeviceInfoDataSource staticDeviceInfoDataSource0 = (StaticDeviceInfoDataSource)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(DynamicDeviceInfoDataSource.class));
                        DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource0 = (DynamicDeviceInfoDataSource)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(PrivacyDeviceInfoDataSource.class));
                        PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource0 = (PrivacyDeviceInfoDataSource)this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(SessionRepository.class));
                        return new AndroidDeviceInfoRepository(staticDeviceInfoDataSource0, dynamicDeviceInfoDataSource0, privacyDeviceInfoDataSource0, ((SessionRepository)this.$this_registry.resolveService(serviceKey3)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(DeviceInfoRepository.class)), E.a(serviceProvider$initialize$1$720));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.73 serviceProvider$initialize$1$730 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final DiagnosticEventRepository invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(CoroutineTimer.class));
                        CoroutineTimer coroutineTimer0 = (CoroutineTimer)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GetDiagnosticEventRequest.class));
                        GetDiagnosticEventRequest getDiagnosticEventRequest0 = (GetDiagnosticEventRequest)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("default_dispatcher", m0.d(K.class));
                        return new AndroidDiagnosticEventRepository(coroutineTimer0, getDiagnosticEventRequest0, ((K)this.$this_registry.resolveService(serviceKey2)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(DiagnosticEventRepository.class)), E.a(serviceProvider$initialize$1$730));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.74 serviceProvider$initialize$1$740 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final LegacyUserConsentRepository invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(LegacyUserConsentDataSource.class));
                        return new AndroidLegacyUserConsentRepository(((LegacyUserConsentDataSource)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(LegacyUserConsentRepository.class)), E.a(serviceProvider$initialize$1$740));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.75 serviceProvider$initialize$1$750 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final MediationRepository invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(MediationDataSource.class));
                        return new AndroidMediationRepository(((MediationDataSource)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(MediationRepository.class)), E.a(serviceProvider$initialize$1$750));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.76 serviceProvider$initialize$1$760 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final OpenMeasurementRepository invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("main_dispatcher", m0.d(K.class));
                        K k0 = (K)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(OmidManager.class));
                        return new AndroidOpenMeasurementRepository(k0, ((OmidManager)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(OpenMeasurementRepository.class)), E.a(serviceProvider$initialize$1$760));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.77 serviceProvider$initialize$1$770 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final SessionRepository invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("gateway_cache.pb", m0.d(ByteStringDataSource.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("privacy.pb", m0.d(ByteStringDataSource.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("privacy_fsm.pb", m0.d(ByteStringDataSource.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("native_configuration.pb", m0.d(ByteStringDataSource.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(NativeConfiguration.class));
                        Object object4 = this.$this_registry.resolveService(serviceKey4);
                        ServiceKey serviceKey5 = new ServiceKey("io_dispatcher", m0.d(K.class));
                        Object object5 = this.$this_registry.resolveService(serviceKey5);
                        ServiceKey serviceKey6 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        return new AndroidSessionRepository(((ByteStringDataSource)object0), ((ByteStringDataSource)object1), ((ByteStringDataSource)object2), ((ByteStringDataSource)object3), ((NativeConfiguration)object4), ((K)object5), ((SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey6)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(SessionRepository.class)), E.a(serviceProvider$initialize$1$770));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(TransactionEventRepository.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.78.INSTANCE));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(OperativeEventRepository.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.79.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.80 serviceProvider$initialize$1$800 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final ExecuteAdViewerRequest invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("io_dispatcher", m0.d(K.class));
                        K k0 = (K)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(HttpClient.class));
                        HttpClient httpClient0 = (HttpClient)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(GetCachedAsset.class));
                        return new AndroidExecuteAdViewerRequest(k0, httpClient0, ((GetCachedAsset)this.$this_registry.resolveService(serviceKey2)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(ExecuteAdViewerRequest.class)), E.a(serviceProvider$initialize$1$800));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetByteStringId.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.81.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.82 serviceProvider$initialize$1$820 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final HandleOpenUrl invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        return new AndroidHandleOpenUrl(((Context)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(HandleOpenUrl.class)), E.a(serviceProvider$initialize$1$820));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.83 serviceProvider$initialize$1$830 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final Refresh invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("default_dispatcher", m0.d(K.class));
                        K k0 = (K)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GetAdDataRefreshRequest.class));
                        GetAdDataRefreshRequest getAdDataRefreshRequest0 = (GetAdDataRefreshRequest)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("ad_req", m0.d(GetRequestPolicy.class));
                        GetRequestPolicy getRequestPolicy0 = (GetRequestPolicy)this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(GatewayClient.class));
                        return new AndroidRefresh(k0, getAdDataRefreshRequest0, getRequestPolicy0, ((GatewayClient)this.$this_registry.resolveService(serviceKey3)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(Refresh.class)), E.a(serviceProvider$initialize$1$830));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.84 serviceProvider$initialize$1$840 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final SendDiagnosticEvent invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(DiagnosticEventRepository.class));
                        DiagnosticEventRepository diagnosticEventRepository0 = (DiagnosticEventRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GetDiagnosticEventRequest.class));
                        return new AndroidSendDiagnosticEvent(diagnosticEventRepository0, ((GetDiagnosticEventRequest)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(SendDiagnosticEvent.class)), E.a(serviceProvider$initialize$1$840));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.85 serviceProvider$initialize$1$850 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final SendWebViewClientErrorDiagnostics invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        return new AndroidSendWebViewClientErrorDiagnostics(((SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(SendWebViewClientErrorDiagnostics.class)), E.a(serviceProvider$initialize$1$850));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.86 serviceProvider$initialize$1$860 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final Show invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(AdRepository.class));
                        AdRepository adRepository0 = (AdRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GameServerIdReader.class));
                        GameServerIdReader gameServerIdReader0 = (GameServerIdReader)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        return new AndroidShow(adRepository0, gameServerIdReader0, ((SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey2)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(Show.class)), E.a(serviceProvider$initialize$1$860));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.87 serviceProvider$initialize$1$870 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final CacheFile invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(CacheRepository.class));
                        CacheRepository cacheRepository0 = (CacheRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        return new CommonCacheFile(cacheRepository0, ((SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(CacheFile.class)), E.a(serviceProvider$initialize$1$870));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.88 serviceProvider$initialize$1$880 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final CleanAssets invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(CacheRepository.class));
                        CacheRepository cacheRepository0 = (CacheRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        return new CommonCleanAssets(cacheRepository0, ((SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(CleanAssets.class)), E.a(serviceProvider$initialize$1$880));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.89 serviceProvider$initialize$1$890 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetAdObject invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(AdRepository.class));
                        return new CommonGetAdObject(((AdRepository)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetAdObject.class)), E.a(serviceProvider$initialize$1$890));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.90 serviceProvider$initialize$1$900 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetHeaderBiddingToken invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(BuildHeaderBiddingToken.class));
                        BuildHeaderBiddingToken buildHeaderBiddingToken0 = (BuildHeaderBiddingToken)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(FetchSignalsAndSendUseCase.class));
                        FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase0 = (FetchSignalsAndSendUseCase)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(SessionRepository.class));
                        return new CommonGetHeaderBiddingToken(buildHeaderBiddingToken0, fetchSignalsAndSendUseCase0, ((SessionRepository)this.$this_registry.resolveService(serviceKey2)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$900));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.91 serviceProvider$initialize$1$910 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final BuildHeaderBiddingToken invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetByteStringId.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GetClientInfo.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(GetSharedDataTimestamps.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(GetLimitedSessionToken.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(GetInitializationData.class));
                        Object object4 = this.$this_registry.resolveService(serviceKey4);
                        ServiceKey serviceKey5 = new ServiceKey("", m0.d(DeviceInfoRepository.class));
                        Object object5 = this.$this_registry.resolveService(serviceKey5);
                        ServiceKey serviceKey6 = new ServiceKey("", m0.d(SessionRepository.class));
                        Object object6 = this.$this_registry.resolveService(serviceKey6);
                        ServiceKey serviceKey7 = new ServiceKey("", m0.d(CampaignRepository.class));
                        Object object7 = this.$this_registry.resolveService(serviceKey7);
                        ServiceKey serviceKey8 = new ServiceKey("", m0.d(TcfRepository.class));
                        Object object8 = this.$this_registry.resolveService(serviceKey8);
                        ServiceKey serviceKey9 = new ServiceKey("", m0.d(AndroidTestDataInfo.class));
                        Object object9 = this.$this_registry.resolveService(serviceKey9);
                        ServiceKey serviceKey10 = new ServiceKey("", m0.d(OfferwallManager.class));
                        return new AndroidBuildHeaderBiddingToken(((GetByteStringId)object0), ((GetClientInfo)object1), ((GetSharedDataTimestamps)object2), ((GetLimitedSessionToken)object3), ((GetInitializationData)object4), ((DeviceInfoRepository)object5), ((SessionRepository)object6), ((CampaignRepository)object7), ((TcfRepository)object8), ((AndroidTestDataInfo)object9), ((OfferwallManager)this.$this_registry.resolveService(serviceKey10)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(BuildHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$910));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.92 serviceProvider$initialize$1$920 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetInitializationData invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetInitializationRequestPayload.class));
                        GetInitializationRequestPayload getInitializationRequestPayload0 = (GetInitializationRequestPayload)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GetUniversalRequestSharedData.class));
                        return new AndroidGetInitializationData(getInitializationRequestPayload0, ((GetUniversalRequestSharedData)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetInitializationData.class)), E.a(serviceProvider$initialize$1$920));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.93 serviceProvider$initialize$1$930 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final MediationInitBlobMetadataReader invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("PUBLIC", m0.d(JsonStorage.class));
                        return new MediationInitBlobMetadataReader(((JsonStorage)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(MediationInitBlobMetadataReader.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$930));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.94 serviceProvider$initialize$1$940 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetInitializationRequestPayload invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetClientInfo.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SessionRepository.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(DeviceInfoRepository.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(LegacyUserConsentRepository.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(MediationInitBlobMetadataReader.class));
                        return new AndroidGetInitializationRequestPayload(((GetClientInfo)object0), ((SessionRepository)object1), ((DeviceInfoRepository)object2), ((LegacyUserConsentRepository)object3), ((MediationInitBlobMetadataReader)this.$this_registry.resolveService(serviceKey4)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetInitializationRequestPayload.class)), E.a(serviceProvider$initialize$1$940));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.95 serviceProvider$initialize$1$950 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetInitializationState invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SessionRepository.class));
                        SessionRepository sessionRepository0 = (SessionRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SDKPropertiesManager.class));
                        return new CommonGetInitializationState(sessionRepository0, ((SDKPropertiesManager)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetInitializationState.class)), E.a(serviceProvider$initialize$1$950));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.96 serviceProvider$initialize$1$960 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetIsFileCache invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(CacheRepository.class));
                        CacheRepository cacheRepository0 = (CacheRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        return new CommonGetIsFileCache(cacheRepository0, ((SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetIsFileCache.class)), E.a(serviceProvider$initialize$1$960));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.97 serviceProvider$initialize$1$970 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final SetInitializationState invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SessionRepository.class));
                        SessionRepository sessionRepository0 = (SessionRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SDKPropertiesManager.class));
                        return new CommonSetInitializationState(sessionRepository0, ((SDKPropertiesManager)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(SetInitializationState.class)), E.a(serviceProvider$initialize$1$970));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.98 serviceProvider$initialize$1$980 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetRequestPolicy invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SessionRepository.class));
                        return new AndroidGetAdRequestPolicy(((SessionRepository)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("ad_req", m0.d(GetRequestPolicy.class)), E.a(serviceProvider$initialize$1$980));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.99 serviceProvider$initialize$1$990 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetAdDataRefreshRequest invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetUniversalRequestForPayLoad.class));
                        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad0 = (GetUniversalRequestForPayLoad)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SessionRepository.class));
                        SessionRepository sessionRepository0 = (SessionRepository)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(DeviceInfoRepository.class));
                        DeviceInfoRepository deviceInfoRepository0 = (DeviceInfoRepository)this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(CampaignRepository.class));
                        return new AndroidGetAdDataRefreshRequest(getUniversalRequestForPayLoad0, sessionRepository0, deviceInfoRepository0, ((CampaignRepository)this.$this_registry.resolveService(serviceKey3)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetAdDataRefreshRequest.class)), E.a(serviceProvider$initialize$1$990));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.100 serviceProvider$initialize$1$1000 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetAdPlayerConfigRequest invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetUniversalRequestForPayLoad.class));
                        return new AndroidGetAdPlayerConfigRequest(((GetUniversalRequestForPayLoad)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetAdPlayerConfigRequest.class)), E.a(serviceProvider$initialize$1$1000));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.101 serviceProvider$initialize$1$1010 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final AndroidGetAdPlayerContext invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(DeviceInfoRepository.class));
                        DeviceInfoRepository deviceInfoRepository0 = (DeviceInfoRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SessionRepository.class));
                        return new AndroidGetAdPlayerContext(deviceInfoRepository0, ((SessionRepository)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AndroidGetAdPlayerContext.class)), E.a(serviceProvider$initialize$1$1010));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.102 serviceProvider$initialize$1$1020 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetAdRequest invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetUniversalRequestForPayLoad.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SessionRepository.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(DeviceInfoRepository.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(CampaignRepository.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(WebviewConfigurationDataSource.class));
                        Object object4 = this.$this_registry.resolveService(serviceKey4);
                        ServiceKey serviceKey5 = new ServiceKey("", m0.d(TcfRepository.class));
                        return new AndroidGetAdRequest(((GetUniversalRequestForPayLoad)object0), ((SessionRepository)object1), ((DeviceInfoRepository)object2), ((CampaignRepository)object3), ((WebviewConfigurationDataSource)object4), ((TcfRepository)this.$this_registry.resolveService(serviceKey5)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetAdRequest.class)), E.a(serviceProvider$initialize$1$1020));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetHbTokenEventRequest.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.103.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.104 serviceProvider$initialize$1$1040 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final CommonScarEventReceiver invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("scar_scope", m0.d(O.class));
                        return new CommonScarEventReceiver(((O)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(CommonScarEventReceiver.class)), E.a(serviceProvider$initialize$1$1040));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.105 serviceProvider$initialize$1$1050 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GMAScarAdapterBridge invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(CommonScarEventReceiver.class));
                        GMAScarAdapterBridge gMAScarAdapterBridge0 = GMA.getInstance(new GMAEventSender(((IEventSender)this.$this_registry.resolveService(serviceKey0)))).getBridge();
                        L.o(gMAScarAdapterBridge0, "getInstance(GMAEventSend…EventReceiver>())).bridge");
                        return gMAScarAdapterBridge0;
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GMAScarAdapterBridge.class)), E.a(serviceProvider$initialize$1$1050));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.106 serviceProvider$initialize$1$1060 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final ScarTimeHackFixer invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        return new ScarTimeHackFixer(((SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(ScarTimeHackFixer.class)), E.a(serviceProvider$initialize$1$1060));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.107 serviceProvider$initialize$1$1070 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final ScarManager invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(CommonScarEventReceiver.class));
                        CommonScarEventReceiver commonScarEventReceiver0 = (CommonScarEventReceiver)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GMAScarAdapterBridge.class));
                        GMAScarAdapterBridge gMAScarAdapterBridge0 = (GMAScarAdapterBridge)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(ScarTimeHackFixer.class));
                        return new AndroidScarManager(commonScarEventReceiver0, gMAScarAdapterBridge0, ((ScarTimeHackFixer)this.$this_registry.resolveService(serviceKey2)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(ScarManager.class)), E.a(serviceProvider$initialize$1$1070));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.108 serviceProvider$initialize$1$1080 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final FetchSignalsAndSendUseCase invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("scar_scope", m0.d(O.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SessionRepository.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(ScarManager.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(HandleGetTokenRequest.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        return new AndroidFetchSignalsAndSendUseCase(((O)object0), ((SessionRepository)object1), ((ScarManager)object2), ((HandleGetTokenRequest)object3), ((SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey4)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(FetchSignalsAndSendUseCase.class)), E.a(serviceProvider$initialize$1$1080));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.109 serviceProvider$initialize$1$1090 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final LoadScarAd invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ScarManager.class));
                        return new LoadScarAd(((ScarManager)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(LoadScarAd.class)), E.a(serviceProvider$initialize$1$1090));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.110 serviceProvider$initialize$1$1100 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final HandleGetTokenRequest invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetUniversalRequestForPayLoad.class));
                        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad0 = (GetUniversalRequestForPayLoad)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GetHbTokenEventRequest.class));
                        GetHbTokenEventRequest getHbTokenEventRequest0 = (GetHbTokenEventRequest)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("other_req", m0.d(GetRequestPolicy.class));
                        GetRequestPolicy getRequestPolicy0 = (GetRequestPolicy)this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(GatewayClient.class));
                        return new HandleAndroidGetTokenRequest(getUniversalRequestForPayLoad0, getHbTokenEventRequest0, getRequestPolicy0, ((GatewayClient)this.$this_registry.resolveService(serviceKey3)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(HandleGetTokenRequest.class)), E.a(serviceProvider$initialize$1$1100));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.111 serviceProvider$initialize$1$1110 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetClientInfo invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SessionRepository.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(MediationRepository.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(OmidManager.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(ScarManager.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(OfferwallManager.class));
                        return new AndroidGetClientInfo(((SessionRepository)object0), ((MediationRepository)object1), ((OmidManager)object2), ((ScarManager)object3), ((OfferwallManager)this.$this_registry.resolveService(serviceKey4)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetClientInfo.class)), E.a(serviceProvider$initialize$1$1110));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.112 serviceProvider$initialize$1$1120 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetInitializationCompletedRequest invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetUniversalRequestForPayLoad.class));
                        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad0 = (GetUniversalRequestForPayLoad)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(DeviceInfoRepository.class));
                        return new AndroidGetInitializationCompletedRequest(getUniversalRequestForPayLoad0, ((DeviceInfoRepository)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetInitializationCompletedRequest.class)), E.a(serviceProvider$initialize$1$1120));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.113 serviceProvider$initialize$1$1130 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetInitializationRequest invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetInitializationRequestPayload.class));
                        GetInitializationRequestPayload getInitializationRequestPayload0 = (GetInitializationRequestPayload)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GetUniversalRequestForPayLoad.class));
                        return new AndroidGetInitializationRequest(getInitializationRequestPayload0, ((GetUniversalRequestForPayLoad)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetInitializationRequest.class)), E.a(serviceProvider$initialize$1$1130));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.114 serviceProvider$initialize$1$1140 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetLimitedSessionToken invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(DeviceInfoRepository.class));
                        DeviceInfoRepository deviceInfoRepository0 = (DeviceInfoRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SessionRepository.class));
                        SessionRepository sessionRepository0 = (SessionRepository)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(MediationRepository.class));
                        return new AndroidGetLimitedSessionToken(deviceInfoRepository0, sessionRepository0, ((MediationRepository)this.$this_registry.resolveService(serviceKey2)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetLimitedSessionToken.class)), E.a(serviceProvider$initialize$1$1140));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.115 serviceProvider$initialize$1$1150 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetOpenGLRendererInfo invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SessionRepository.class));
                        return new AndroidGetOpenGLRendererInfo(((SessionRepository)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetOpenGLRendererInfo.class)), E.a(serviceProvider$initialize$1$1150));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetSharedDataTimestamps.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.116.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.117 serviceProvider$initialize$1$1170 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetUniversalRequestForPayLoad invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetUniversalRequestSharedData.class));
                        return new AndroidGetUniversalRequestForPayLoad(((GetUniversalRequestSharedData)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetUniversalRequestForPayLoad.class)), E.a(serviceProvider$initialize$1$1170));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.118 serviceProvider$initialize$1$1180 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetUniversalRequestSharedData invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetSharedDataTimestamps.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SessionRepository.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(DeviceInfoRepository.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(GetLimitedSessionToken.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(DeveloperConsentRepository.class));
                        return new AndroidGetUniversalRequestSharedData(((GetSharedDataTimestamps)object0), ((SessionRepository)object1), ((DeviceInfoRepository)object2), ((GetLimitedSessionToken)object3), ((DeveloperConsentRepository)this.$this_registry.resolveService(serviceKey4)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetUniversalRequestSharedData.class)), E.a(serviceProvider$initialize$1$1180));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.119 serviceProvider$initialize$1$1190 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetCachedAsset invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(CacheRepository.class));
                        CacheRepository cacheRepository0 = (CacheRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(Context.class));
                        return new GetCachedAsset(cacheRepository0, ((Context)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetCachedAsset.class)), E.a(serviceProvider$initialize$1$1190));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.120 serviceProvider$initialize$1$1200 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetWebViewBridgeUseCase invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("default_dispatcher", m0.d(K.class));
                        K k0 = (K)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        return new CommonGetWebViewBridgeUseCase(k0, ((SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetWebViewBridgeUseCase.class)), E.a(serviceProvider$initialize$1$1200));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.121 serviceProvider$initialize$1$1210 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetRequestPolicy invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SessionRepository.class));
                        return new GetInitRequestPolicy(((SessionRepository)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("init_req", m0.d(GetRequestPolicy.class)), E.a(serviceProvider$initialize$1$1210));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.122 serviceProvider$initialize$1$1220 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetLatestWebViewConfiguration invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(WebviewConfigurationDataSource.class));
                        return new GetLatestWebViewConfiguration(((WebviewConfigurationDataSource)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetLatestWebViewConfiguration.class)), E.a(serviceProvider$initialize$1$1220));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.123 serviceProvider$initialize$1$1230 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetRequestPolicy invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SessionRepository.class));
                        return new GetOperativeEventRequestPolicy(((SessionRepository)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("op_event_req", m0.d(GetRequestPolicy.class)), E.a(serviceProvider$initialize$1$1230));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.124 serviceProvider$initialize$1$1240 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetRequestPolicy invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SessionRepository.class));
                        return new GetOtherRequestPolicy(((SessionRepository)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("other_req", m0.d(GetRequestPolicy.class)), E.a(serviceProvider$initialize$1$1240));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.125 serviceProvider$initialize$1$1250 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetPrivacyUpdateRequest invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetUniversalRequestForPayLoad.class));
                        return new GetPrivacyUpdateRequest(((GetUniversalRequestForPayLoad)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetPrivacyUpdateRequest.class)), E.a(serviceProvider$initialize$1$1250));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.126 serviceProvider$initialize$1$1260 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final HandleGatewayInitializationResponse invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(TransactionEventManager.class));
                        TransactionEventManager transactionEventManager0 = (TransactionEventManager)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(TriggerInitializationCompletedRequest.class));
                        TriggerInitializationCompletedRequest triggerInitializationCompletedRequest0 = (TriggerInitializationCompletedRequest)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(SessionRepository.class));
                        SessionRepository sessionRepository0 = (SessionRepository)this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("init_scope", m0.d(O.class));
                        return new AndroidHandleGatewayInitializationResponse(transactionEventManager0, triggerInitializationCompletedRequest0, sessionRepository0, ((O)this.$this_registry.resolveService(serviceKey3)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(HandleGatewayInitializationResponse.class)), E.a(serviceProvider$initialize$1$1260));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.127 serviceProvider$initialize$1$1270 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final HandleGatewayUniversalResponse invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SessionRepository.class));
                        SessionRepository sessionRepository0 = (SessionRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(DeviceInfoRepository.class));
                        return new AndroidHandleGatewayUniversalResponse(sessionRepository0, ((DeviceInfoRepository)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(HandleGatewayUniversalResponse.class)), E.a(serviceProvider$initialize$1$1270));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.128 serviceProvider$initialize$1$1280 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final InitializeBoldSDK invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("default_dispatcher", m0.d(K.class));
                        K k0 = (K)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(InitializeOMSDK.class));
                        InitializeOMSDK initializeOMSDK0 = (InitializeOMSDK)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(GetInitializationRequest.class));
                        GetInitializationRequest getInitializationRequest0 = (GetInitializationRequest)this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("init_req", m0.d(GetRequestPolicy.class));
                        GetRequestPolicy getRequestPolicy0 = (GetRequestPolicy)this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(CleanAssets.class));
                        CleanAssets cleanAssets0 = (CleanAssets)this.$this_registry.resolveService(serviceKey4);
                        ServiceKey serviceKey5 = new ServiceKey("", m0.d(HandleGatewayInitializationResponse.class));
                        HandleGatewayInitializationResponse handleGatewayInitializationResponse0 = (HandleGatewayInitializationResponse)this.$this_registry.resolveService(serviceKey5);
                        ServiceKey serviceKey6 = new ServiceKey("", m0.d(GatewayClient.class));
                        GatewayClient gatewayClient0 = (GatewayClient)this.$this_registry.resolveService(serviceKey6);
                        ServiceKey serviceKey7 = new ServiceKey("", m0.d(SessionRepository.class));
                        SessionRepository sessionRepository0 = (SessionRepository)this.$this_registry.resolveService(serviceKey7);
                        ServiceKey serviceKey8 = new ServiceKey("", m0.d(EventObservers.class));
                        EventObservers eventObservers0 = (EventObservers)this.$this_registry.resolveService(serviceKey8);
                        ServiceKey serviceKey9 = new ServiceKey("", m0.d(TriggerInitializeListener.class));
                        TriggerInitializeListener triggerInitializeListener0 = (TriggerInitializeListener)this.$this_registry.resolveService(serviceKey9);
                        ServiceKey serviceKey10 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        SendDiagnosticEvent sendDiagnosticEvent0 = (SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey10);
                        ServiceKey serviceKey11 = new ServiceKey("", m0.d(DiagnosticEventRepository.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey11);
                        ServiceKey serviceKey12 = new ServiceKey("", m0.d(StorageManager.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey12);
                        ServiceKey serviceKey13 = new ServiceKey("", m0.d(ConfigurationReader.class));
                        ConfigurationReader configurationReader0 = (ConfigurationReader)this.$this_registry.resolveService(serviceKey13);
                        ServiceKey serviceKey14 = new ServiceKey("", m0.d(SDKPropertiesManager.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey14);
                        ServiceKey serviceKey15 = new ServiceKey("", m0.d(GetGameId.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey15);
                        ServiceKey serviceKey16 = new ServiceKey("", m0.d(AndroidHandleFocusCounters.class));
                        return new AndroidInitializeBoldSDK(k0, initializeOMSDK0, getInitializationRequest0, getRequestPolicy0, cleanAssets0, handleGatewayInitializationResponse0, gatewayClient0, sessionRepository0, eventObservers0, triggerInitializeListener0, sendDiagnosticEvent0, ((DiagnosticEventRepository)object0), ((StorageManager)object1), configurationReader0, ((SDKPropertiesManager)object2), ((GetGameId)object3), ((AndroidHandleFocusCounters)this.$this_registry.resolveService(serviceKey16)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(InitializeBoldSDK.class)), E.a(serviceProvider$initialize$1$1280));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.129 serviceProvider$initialize$1$1290 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final LegacyShowUseCase invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("main_dispatcher", m0.d(K.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(Show.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(AdRepository.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(GetOperativeEventApi.class));
                        Object object4 = this.$this_registry.resolveService(serviceKey4);
                        ServiceKey serviceKey5 = new ServiceKey("", m0.d(GetInitializationState.class));
                        Object object5 = this.$this_registry.resolveService(serviceKey5);
                        ServiceKey serviceKey6 = new ServiceKey("", m0.d(SessionRepository.class));
                        return new LegacyShowUseCase(((K)object0), ((Show)object1), ((AdRepository)object2), ((SendDiagnosticEvent)object3), ((GetOperativeEventApi)object4), ((GetInitializationState)object5), ((SessionRepository)this.$this_registry.resolveService(serviceKey6)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(LegacyShowUseCase.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$1290));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.130 serviceProvider$initialize$1$1300 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final SendPrivacyUpdateRequest invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetPrivacyUpdateRequest.class));
                        GetPrivacyUpdateRequest getPrivacyUpdateRequest0 = (GetPrivacyUpdateRequest)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("other_req", m0.d(GetRequestPolicy.class));
                        GetRequestPolicy getRequestPolicy0 = (GetRequestPolicy)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(GatewayClient.class));
                        return new SendPrivacyUpdateRequest(getPrivacyUpdateRequest0, getRequestPolicy0, ((GatewayClient)this.$this_registry.resolveService(serviceKey2)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(SendPrivacyUpdateRequest.class)), E.a(serviceProvider$initialize$1$1300));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.131 serviceProvider$initialize$1$1310 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final TriggerInitializationCompletedRequest invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetInitializationCompletedRequest.class));
                        GetInitializationCompletedRequest getInitializationCompletedRequest0 = (GetInitializationCompletedRequest)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("init_req", m0.d(GetRequestPolicy.class));
                        GetRequestPolicy getRequestPolicy0 = (GetRequestPolicy)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(GatewayClient.class));
                        GatewayClient gatewayClient0 = (GatewayClient)this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        return new AndroidTriggerInitializationCompletedRequest(getInitializationCompletedRequest0, getRequestPolicy0, gatewayClient0, ((SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey3)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(TriggerInitializationCompletedRequest.class)), E.a(serviceProvider$initialize$1$1310));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.132 serviceProvider$initialize$1$1320 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final TriggerInitializeListener invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("main_dispatcher", m0.d(K.class));
                        return new TriggerInitializeListener(((K)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(TriggerInitializeListener.class)), E.a(serviceProvider$initialize$1$1320));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.133 serviceProvider$initialize$1$1330 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final DiagnosticEventObserver invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetUniversalRequestForPayLoad.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GetDiagnosticEventBatchRequest.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("default_dispatcher", m0.d(K.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(DiagnosticEventRepository.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(UniversalRequestDataSource.class));
                        Object object4 = this.$this_registry.resolveService(serviceKey4);
                        ServiceKey serviceKey5 = new ServiceKey("", m0.d(BackgroundWorker.class));
                        return new DiagnosticEventObserver(((GetUniversalRequestForPayLoad)object0), ((GetDiagnosticEventBatchRequest)object1), ((K)object2), ((DiagnosticEventRepository)object3), ((UniversalRequestDataSource)object4), ((BackgroundWorker)this.$this_registry.resolveService(serviceKey5)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(DiagnosticEventObserver.class)), E.a(serviceProvider$initialize$1$1330));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.134 serviceProvider$initialize$1$1340 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final EventObservers invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(OperativeEventObserver.class));
                        OperativeEventObserver operativeEventObserver0 = (OperativeEventObserver)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(DiagnosticEventObserver.class));
                        DiagnosticEventObserver diagnosticEventObserver0 = (DiagnosticEventObserver)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(TransactionEventObserver.class));
                        return new EventObservers(operativeEventObserver0, diagnosticEventObserver0, ((TransactionEventObserver)this.$this_registry.resolveService(serviceKey2)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(EventObservers.class)), E.a(serviceProvider$initialize$1$1340));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.135 serviceProvider$initialize$1$1350 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetTransactionData invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetByteStringId.class));
                        return new AndroidGetTransactionData(((GetByteStringId)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetTransactionData.class)), E.a(serviceProvider$initialize$1$1350));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.136 serviceProvider$initialize$1$1360 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetTransactionRequest invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(DeviceInfoRepository.class));
                        return new CommonGetTransactionRequest(((DeviceInfoRepository)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetTransactionRequest.class)), E.a(serviceProvider$initialize$1$1360));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetDiagnosticEventBatchRequest.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.137.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.138 serviceProvider$initialize$1$1380 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetDiagnosticEventRequest invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetSharedDataTimestamps.class));
                        return new GetDiagnosticEventRequest(((GetSharedDataTimestamps)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetDiagnosticEventRequest.class)), E.a(serviceProvider$initialize$1$1380));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.139 serviceProvider$initialize$1$1390 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetOperativeEventApi invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(OperativeEventRepository.class));
                        OperativeEventRepository operativeEventRepository0 = (OperativeEventRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GetOperativeEventRequest.class));
                        return new GetOperativeEventApi(operativeEventRepository0, ((GetOperativeEventRequest)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetOperativeEventApi.class)), E.a(serviceProvider$initialize$1$1390));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.140 serviceProvider$initialize$1$1400 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetOperativeEventRequest invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetByteStringId.class));
                        GetByteStringId getByteStringId0 = (GetByteStringId)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(DeviceInfoRepository.class));
                        DeviceInfoRepository deviceInfoRepository0 = (DeviceInfoRepository)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(SessionRepository.class));
                        SessionRepository sessionRepository0 = (SessionRepository)this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(CampaignRepository.class));
                        return new GetOperativeEventRequest(getByteStringId0, deviceInfoRepository0, sessionRepository0, ((CampaignRepository)this.$this_registry.resolveService(serviceKey3)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetOperativeEventRequest.class)), E.a(serviceProvider$initialize$1$1400));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(HandleGatewayEventResponse.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.141.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.142 serviceProvider$initialize$1$1420 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final OperativeEventObserver invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetUniversalRequestForPayLoad.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("default_dispatcher", m0.d(K.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(OperativeEventRepository.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(UniversalRequestDataSource.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(BackgroundWorker.class));
                        return new OperativeEventObserver(((GetUniversalRequestForPayLoad)object0), ((K)object1), ((OperativeEventRepository)object2), ((UniversalRequestDataSource)object3), ((BackgroundWorker)this.$this_registry.resolveService(serviceKey4)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(OperativeEventObserver.class)), E.a(serviceProvider$initialize$1$1420));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.143 serviceProvider$initialize$1$1430 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final TransactionEventObserver invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetUniversalRequestForPayLoad.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("default_dispatcher", m0.d(K.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(TransactionEventRepository.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(GatewayClient.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("other_req", m0.d(GetRequestPolicy.class));
                        Object object4 = this.$this_registry.resolveService(serviceKey4);
                        ServiceKey serviceKey5 = new ServiceKey("iap_transaction.pb", m0.d(ByteStringDataSource.class));
                        return new TransactionEventObserver(((GetUniversalRequestForPayLoad)object0), ((K)object1), ((TransactionEventRepository)object2), ((GatewayClient)object3), ((GetRequestPolicy)object4), ((ByteStringDataSource)this.$this_registry.resolveService(serviceKey5)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(TransactionEventObserver.class)), E.a(serviceProvider$initialize$1$1430));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(UniversalRequestTtlValidator.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.144.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.145 serviceProvider$initialize$1$1450 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final UniversalRequestEventSender invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GatewayClient.class));
                        GatewayClient gatewayClient0 = (GatewayClient)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(HandleGatewayEventResponse.class));
                        HandleGatewayEventResponse handleGatewayEventResponse0 = (HandleGatewayEventResponse)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(UniversalRequestTtlValidator.class));
                        return new UniversalRequestEventSender(gatewayClient0, handleGatewayEventResponse0, ((UniversalRequestTtlValidator)this.$this_registry.resolveService(serviceKey2)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(UniversalRequestEventSender.class)), E.a(serviceProvider$initialize$1$1450));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.146 serviceProvider$initialize$1$1460 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final OmFinishSession invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(OpenMeasurementRepository.class));
                        OpenMeasurementRepository openMeasurementRepository0 = (OpenMeasurementRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        return new AndroidOmFinishSession(openMeasurementRepository0, ((SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(OmFinishSession.class)), E.a(serviceProvider$initialize$1$1460));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.147 serviceProvider$initialize$1$1470 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final OmImpressionOccurred invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(OpenMeasurementRepository.class));
                        OpenMeasurementRepository openMeasurementRepository0 = (OpenMeasurementRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        return new AndroidOmImpressionOccurred(openMeasurementRepository0, ((SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(OmImpressionOccurred.class)), E.a(serviceProvider$initialize$1$1470));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.148 serviceProvider$initialize$1$1480 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final AndroidOmInteraction invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(OpenMeasurementRepository.class));
                        OpenMeasurementRepository openMeasurementRepository0 = (OpenMeasurementRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        return new AndroidOmStartSession(openMeasurementRepository0, ((SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AndroidOmInteraction.class)), E.a(serviceProvider$initialize$1$1480));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.149 serviceProvider$initialize$1$1490 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetOmData invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(OpenMeasurementRepository.class));
                        return new CommonGetOmData(((OpenMeasurementRepository)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetOmData.class)), E.a(serviceProvider$initialize$1$1490));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.150 serviceProvider$initialize$1$1500 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final IsOMActivated invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(OpenMeasurementRepository.class));
                        return new CommonIsOMActivated(((OpenMeasurementRepository)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(IsOMActivated.class)), E.a(serviceProvider$initialize$1$1500));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.151 serviceProvider$initialize$1$1510 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final InitializeOMSDK invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        Context context0 = (Context)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        SendDiagnosticEvent sendDiagnosticEvent0 = (SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(SessionRepository.class));
                        SessionRepository sessionRepository0 = (SessionRepository)this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(OpenMeasurementRepository.class));
                        return new AndroidInitializeOMSDK(context0, sendDiagnosticEvent0, sessionRepository0, ((OpenMeasurementRepository)this.$this_registry.resolveService(serviceKey3)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(InitializeOMSDK.class)), E.a(serviceProvider$initialize$1$1510));
                servicesRegistry0.updateService(new ServiceKey("dev_consent_privacy_rules", m0.d(FlattenerRulesUseCase.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.152.INSTANCE));
                servicesRegistry0.updateService(new ServiceKey("legacy_privacy_rules", m0.d(FlattenerRulesUseCase.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.153.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.154 serviceProvider$initialize$1$1540 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final BackgroundWorker invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        return new BackgroundWorker(((Context)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(BackgroundWorker.class)), E.a(serviceProvider$initialize$1$1540));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.155 serviceProvider$initialize$1$1550 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final DiagnosticEventRequestWorkModifier invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SessionRepository.class));
                        SessionRepository sessionRepository0 = (SessionRepository)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(LifecycleDataSource.class));
                        return new DiagnosticEventRequestWorkModifier(sessionRepository0, ((LifecycleDataSource)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(DiagnosticEventRequestWorkModifier.class)), E.a(serviceProvider$initialize$1$1550));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.156 serviceProvider$initialize$1$1560 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GatewayClient invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(HttpClient.class));
                        HttpClient httpClient0 = (HttpClient)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(HandleGatewayUniversalResponse.class));
                        HandleGatewayUniversalResponse handleGatewayUniversalResponse0 = (HandleGatewayUniversalResponse)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        SendDiagnosticEvent sendDiagnosticEvent0 = (SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(SessionRepository.class));
                        return new CommonGatewayClient(httpClient0, handleGatewayUniversalResponse0, sendDiagnosticEvent0, ((SessionRepository)this.$this_registry.resolveService(serviceKey3)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GatewayClient.class)), E.a(serviceProvider$initialize$1$1560));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.157 serviceProvider$initialize$1$1570 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }

                    @l
                    public final CoroutineExceptionHandler invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("io_dispatcher", m0.d(K.class));
                        K k0 = (K)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(AlternativeFlowReader.class));
                        AlternativeFlowReader alternativeFlowReader0 = (AlternativeFlowReader)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        SendDiagnosticEvent sendDiagnosticEvent0 = (SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(SDKMetricsSender.class));
                        return new SDKErrorHandler(k0, alternativeFlowReader0, sendDiagnosticEvent0, ((SDKMetricsSender)this.$this_registry.resolveService(serviceKey3)));
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("sdk", m0.d(CoroutineExceptionHandler.class)), E.a(serviceProvider$initialize$1$1570));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(TokenStorage.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.158.INSTANCE));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(VolumeChange.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.159.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.160 serviceProvider$initialize$1$1600 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final ConfigFileFromLocalStorage invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        return new ConfigFileFromLocalStorage(((ISDKDispatchers)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(ConfigFileFromLocalStorage.class)), E.a(serviceProvider$initialize$1$1600));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.161 serviceProvider$initialize$1$1610 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final InitializeSDK invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(ConfigFileFromLocalStorage.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(InitializeStateReset.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(InitializeStateError.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(InitializeStateConfig.class));
                        Object object4 = this.$this_registry.resolveService(serviceKey4);
                        ServiceKey serviceKey5 = new ServiceKey("", m0.d(InitializeStateCreate.class));
                        Object object5 = this.$this_registry.resolveService(serviceKey5);
                        ServiceKey serviceKey6 = new ServiceKey("", m0.d(InitializeStateLoadCache.class));
                        Object object6 = this.$this_registry.resolveService(serviceKey6);
                        ServiceKey serviceKey7 = new ServiceKey("", m0.d(InitializeStateLoadWeb.class));
                        Object object7 = this.$this_registry.resolveService(serviceKey7);
                        ServiceKey serviceKey8 = new ServiceKey("", m0.d(InitializeStateComplete.class));
                        return new InitializeSDK(((ISDKDispatchers)object0), ((ConfigFileFromLocalStorage)object1), ((InitializeStateReset)object2), ((InitializeStateError)object3), ((InitializeStateConfig)object4), ((InitializeStateCreate)object5), ((InitializeStateLoadCache)object6), ((InitializeStateLoadWeb)object7), ((InitializeStateComplete)this.$this_registry.resolveService(serviceKey8)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(InitializeSDK.class)), E.a(serviceProvider$initialize$1$1610));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.162 serviceProvider$initialize$1$1620 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final InitializeStateComplete invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        return new InitializeStateComplete(((ISDKDispatchers)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(InitializeStateComplete.class)), E.a(serviceProvider$initialize$1$1620));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.163 serviceProvider$initialize$1$1630 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final InitializeStateConfig invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        ISDKDispatchers iSDKDispatchers0 = (ISDKDispatchers)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(InitializeStateConfigWithLoader.class));
                        return new InitializeStateConfig(iSDKDispatchers0, ((InitializeStateConfigWithLoader)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(InitializeStateConfig.class)), E.a(serviceProvider$initialize$1$1630));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.164 serviceProvider$initialize$1$1640 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final InitializeStateConfigWithLoader invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        ISDKDispatchers iSDKDispatchers0 = (ISDKDispatchers)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(InitializeStateNetworkError.class));
                        InitializeStateNetworkError initializeStateNetworkError0 = (InitializeStateNetworkError)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(TokenStorage.class));
                        TokenStorage tokenStorage0 = (TokenStorage)this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(SDKMetricsSender.class));
                        return new InitializeStateConfigWithLoader(iSDKDispatchers0, initializeStateNetworkError0, tokenStorage0, ((SDKMetricsSender)this.$this_registry.resolveService(serviceKey3)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(InitializeStateConfigWithLoader.class)), E.a(serviceProvider$initialize$1$1640));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.165 serviceProvider$initialize$1$1650 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final InitializeStateCreate invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        return new InitializeStateCreate(((ISDKDispatchers)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(InitializeStateCreate.class)), E.a(serviceProvider$initialize$1$1650));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.166 serviceProvider$initialize$1$1660 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final InitializeStateError invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        return new InitializeStateError(((ISDKDispatchers)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(InitializeStateError.class)), E.a(serviceProvider$initialize$1$1660));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.167 serviceProvider$initialize$1$1670 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final InitializeStateLoadCache invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        return new InitializeStateLoadCache(((ISDKDispatchers)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(InitializeStateLoadCache.class)), E.a(serviceProvider$initialize$1$1670));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.168 serviceProvider$initialize$1$1680 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final InitializeStateLoadWeb invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        ISDKDispatchers iSDKDispatchers0 = (ISDKDispatchers)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(InitializeStateNetworkError.class));
                        InitializeStateNetworkError initializeStateNetworkError0 = (InitializeStateNetworkError)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(HttpClient.class));
                        return new InitializeStateLoadWeb(iSDKDispatchers0, initializeStateNetworkError0, ((HttpClient)this.$this_registry.resolveService(serviceKey2)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(InitializeStateLoadWeb.class)), E.a(serviceProvider$initialize$1$1680));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.169 serviceProvider$initialize$1$1690 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final InitializeStateReset invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        return new InitializeStateReset(((ISDKDispatchers)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(InitializeStateReset.class)), E.a(serviceProvider$initialize$1$1690));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.170 serviceProvider$initialize$1$1700 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final StoreMonitor invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(StoreExceptionHandler.class));
                        return new StoreMonitor(((StoreExceptionHandler)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(StoreMonitor.class)), E.a(serviceProvider$initialize$1$1700));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.171 serviceProvider$initialize$1$1710 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final StoreWebViewEventSender invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(IEventSender.class));
                        return new StoreWebViewEventSender(((IEventSender)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(StoreWebViewEventSender.class)), E.a(serviceProvider$initialize$1$1710));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(StoreExceptionHandler.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.172.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.173 serviceProvider$initialize$1$1730 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final StoreEventListenerFactory invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(StoreWebViewEventSender.class));
                        return new StoreEventListenerFactory(((StoreWebViewEventSender)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(StoreEventListenerFactory.class)), E.a(serviceProvider$initialize$1$1730));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(ConfigurationReader.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.174.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.175 serviceProvider$initialize$1$1750 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final AndroidAttribution invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        Context context0 = (Context)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        ISDKDispatchers iSDKDispatchers0 = (ISDKDispatchers)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(SessionRepository.class));
                        return new AndroidAttribution(context0, iSDKDispatchers0, ((SessionRepository)this.$this_registry.resolveService(serviceKey2)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AndroidAttribution.class)), E.a(serviceProvider$initialize$1$1750));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.176 serviceProvider$initialize$1$1760 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final AdPlayerScope invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("default_dispatcher", m0.d(K.class));
                        return new AdPlayerScope(((K)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$1760));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.177 serviceProvider$initialize$1$1770 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final AndroidWebViewClient invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetWebViewCacheAssetLoader.class));
                        GetWebViewCacheAssetLoader getWebViewCacheAssetLoader0 = (GetWebViewCacheAssetLoader)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GetCachedAsset.class));
                        GetCachedAsset getCachedAsset0 = (GetCachedAsset)this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(GetLatestWebViewConfiguration.class));
                        return new AndroidWebViewClient(getWebViewCacheAssetLoader0, getCachedAsset0, ((GetLatestWebViewConfiguration)this.$this_registry.resolveService(serviceKey2)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$1770));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.178 serviceProvider$initialize$1$1780 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final AndroidGetWebViewContainerUseCase invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(AndroidWebViewClient.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(SendWebViewClientErrorDiagnostics.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("main_dispatcher", m0.d(K.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("default_dispatcher", m0.d(K.class));
                        return new AndroidGetWebViewContainerUseCase(((Context)object0), ((AndroidWebViewClient)object1), ((SendWebViewClientErrorDiagnostics)object2), ((K)object3), ((K)this.$this_registry.resolveService(serviceKey4)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$1780));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.179 serviceProvider$initialize$1$1790 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final Load invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("default_dispatcher", m0.d(K.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GetAdRequest.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(GetAdPlayerConfigRequest.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("ad_req", m0.d(GetRequestPolicy.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(HandleGatewayAdResponse.class));
                        Object object4 = this.$this_registry.resolveService(serviceKey4);
                        ServiceKey serviceKey5 = new ServiceKey("", m0.d(SessionRepository.class));
                        Object object5 = this.$this_registry.resolveService(serviceKey5);
                        ServiceKey serviceKey6 = new ServiceKey("", m0.d(GatewayClient.class));
                        Object object6 = this.$this_registry.resolveService(serviceKey6);
                        ServiceKey serviceKey7 = new ServiceKey("", m0.d(AdRepository.class));
                        return new AndroidLoad(((K)object0), ((GetAdRequest)object1), ((GetAdPlayerConfigRequest)object2), ((GetRequestPolicy)object3), ((HandleGatewayAdResponse)object4), ((SessionRepository)object5), ((GatewayClient)object6), ((AdRepository)this.$this_registry.resolveService(serviceKey7)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(Load.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$1790));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.180 serviceProvider$initialize$1$1800 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final AwaitInitialization invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SessionRepository.class));
                        return new CommonAwaitInitialization(((SessionRepository)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$1800));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.181 serviceProvider$initialize$1$1810 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetAsyncHeaderBiddingToken invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetHeaderBiddingToken.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(GetInitializationState.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(AwaitInitialization.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(SessionRepository.class));
                        return new CommonInitAwaitingGetHeaderBiddingToken(((GetHeaderBiddingToken)object0), ((SendDiagnosticEvent)object1), ((GetInitializationState)object2), ((AwaitInitialization)object3), ((SessionRepository)this.$this_registry.resolveService(serviceKey4)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$1810));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.182 serviceProvider$initialize$1$1820 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetAdPlayer invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(DeviceInfoRepository.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SessionRepository.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(ExecuteAdViewerRequest.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("default_dispatcher", m0.d(K.class));
                        Object object4 = this.$this_registry.resolveService(serviceKey4);
                        ServiceKey serviceKey5 = new ServiceKey("", m0.d(AdPlayerScope.class));
                        Object object5 = this.$this_registry.resolveService(serviceKey5);
                        ServiceKey serviceKey6 = new ServiceKey("", m0.d(OpenMeasurementRepository.class));
                        Object object6 = this.$this_registry.resolveService(serviceKey6);
                        ServiceKey serviceKey7 = new ServiceKey("", m0.d(ScarManager.class));
                        Object object7 = this.$this_registry.resolveService(serviceKey7);
                        ServiceKey serviceKey8 = new ServiceKey("", m0.d(OfferwallManager.class));
                        return new CommonGetAdPlayer(((DeviceInfoRepository)object0), ((SessionRepository)object1), ((ExecuteAdViewerRequest)object2), ((SendDiagnosticEvent)object3), ((K)object4), ((O)object5), ((OpenMeasurementRepository)object6), ((ScarManager)object7), ((OfferwallManager)this.$this_registry.resolveService(serviceKey8)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$1820));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.183 serviceProvider$initialize$1$1830 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final HandleGatewayAdResponse invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(AdRepository.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(AndroidGetWebViewContainerUseCase.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(GetWebViewBridgeUseCase.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(DeviceInfoRepository.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(HandleInvocationsFromAdViewer.class));
                        Object object4 = this.$this_registry.resolveService(serviceKey4);
                        ServiceKey serviceKey5 = new ServiceKey("", m0.d(CampaignRepository.class));
                        Object object5 = this.$this_registry.resolveService(serviceKey5);
                        ServiceKey serviceKey6 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        Object object6 = this.$this_registry.resolveService(serviceKey6);
                        ServiceKey serviceKey7 = new ServiceKey("", m0.d(GetOperativeEventApi.class));
                        Object object7 = this.$this_registry.resolveService(serviceKey7);
                        ServiceKey serviceKey8 = new ServiceKey("", m0.d(GetLatestWebViewConfiguration.class));
                        Object object8 = this.$this_registry.resolveService(serviceKey8);
                        ServiceKey serviceKey9 = new ServiceKey("", m0.d(AdPlayerScope.class));
                        Object object9 = this.$this_registry.resolveService(serviceKey9);
                        ServiceKey serviceKey10 = new ServiceKey("", m0.d(GetAdPlayer.class));
                        return new AndroidHandleGatewayAdResponse(((AdRepository)object0), ((AndroidGetWebViewContainerUseCase)object1), ((GetWebViewBridgeUseCase)object2), ((DeviceInfoRepository)object3), ((HandleInvocationsFromAdViewer)object4), ((CampaignRepository)object5), ((SendDiagnosticEvent)object6), ((GetOperativeEventApi)object7), ((GetLatestWebViewConfiguration)object8), ((AdPlayerScope)object9), ((GetAdPlayer)this.$this_registry.resolveService(serviceKey10)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$1830));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(com.unity3d.services.core.di.ServiceProvider.initialize.1.184.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.185 serviceProvider$initialize$1$1850 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final LegacyLoadUseCase invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("main_dispatcher", m0.d(K.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(Load.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(GetInitializationState.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(AwaitInitialization.class));
                        Object object4 = this.$this_registry.resolveService(serviceKey4);
                        ServiceKey serviceKey5 = new ServiceKey("", m0.d(SessionRepository.class));
                        Object object5 = this.$this_registry.resolveService(serviceKey5);
                        ServiceKey serviceKey6 = new ServiceKey("", m0.d(AdRepository.class));
                        return new LegacyLoadUseCase(((K)object0), ((Load)object1), ((SendDiagnosticEvent)object2), ((GetInitializationState)object3), ((AwaitInitialization)object4), ((SessionRepository)object5), ((AdRepository)this.$this_registry.resolveService(serviceKey6)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$1850));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.186 serviceProvider$initialize$1$1860 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final InitializeStateNetworkError invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(ISDKDispatchers.class));
                        return new InitializeStateNetworkError(((ISDKDispatchers)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$1860));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.187 serviceProvider$initialize$1$1870 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final CoroutineTimer invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("default_dispatcher", m0.d(K.class));
                        return new CommonCoroutineTimer(((K)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(serviceProvider$initialize$1$1870));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(IEventSender.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.188.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.189 serviceProvider$initialize$1$1890 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final SetGameId invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SessionRepository.class));
                        return new CommonSetGameId(((SessionRepository)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(SetGameId.class)), E.a(serviceProvider$initialize$1$1890));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.190 serviceProvider$initialize$1$1900 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetGameId invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SessionRepository.class));
                        return new CommonGetGameId(((SessionRepository)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetGameId.class)), E.a(serviceProvider$initialize$1$1900));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.191 serviceProvider$initialize$1$1910 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final ValidateGameId invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetGameId.class));
                        GetGameId getGameId0 = (GetGameId)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SetGameId.class));
                        return new CommonValidateGameId(getGameId0, ((SetGameId)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(ValidateGameId.class)), E.a(serviceProvider$initialize$1$1910));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.192 serviceProvider$initialize$1$1920 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final GetWebViewCacheAssetLoader invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        Context context0 = (Context)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(GetLatestWebViewConfiguration.class));
                        return new CommonGetWebViewCacheAssetLoader(context0, ((GetLatestWebViewConfiguration)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(GetWebViewCacheAssetLoader.class)), E.a(serviceProvider$initialize$1$1920));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.193 serviceProvider$initialize$1$1930 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final ShouldAllowInitialization invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(AlternativeFlowReader.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(CheckForGameIdAndTestModeChanges.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(GetInitializationState.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("", m0.d(SetInitializationState.class));
                        Object object3 = this.$this_registry.resolveService(serviceKey3);
                        ServiceKey serviceKey4 = new ServiceKey("", m0.d(ValidateGameId.class));
                        return new CommonShouldAllowInitialization(((AlternativeFlowReader)object0), ((CheckForGameIdAndTestModeChanges)object1), ((GetInitializationState)object2), ((SetInitializationState)object3), ((ValidateGameId)this.$this_registry.resolveService(serviceKey4)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(ShouldAllowInitialization.class)), E.a(serviceProvider$initialize$1$1930));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.194 serviceProvider$initialize$1$1940 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final CheckForGameIdAndTestModeChanges invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(GetGameId.class));
                        GetGameId getGameId0 = (GetGameId)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(SendDiagnosticEvent.class));
                        return new CommonCheckForGameIdAndTestModeChanges(getGameId0, ((SendDiagnosticEvent)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(CheckForGameIdAndTestModeChanges.class)), E.a(serviceProvider$initialize$1$1940));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(DownloadPriorityQueue.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.195.INSTANCE));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(CleanupDirectory.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.196.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.197 serviceProvider$initialize$1$1970 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final FocusRepository invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(AndroidGetLifecycleFlow.class));
                        AndroidGetLifecycleFlow androidGetLifecycleFlow0 = (AndroidGetLifecycleFlow)this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("default_dispatcher", m0.d(K.class));
                        return new FocusRepository(androidGetLifecycleFlow0, ((K)this.$this_registry.resolveService(serviceKey1)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(FocusRepository.class)), E.a(serviceProvider$initialize$1$1970));
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AndroidGetIsAdActivity.class)), E.a(com.unity3d.services.core.di.ServiceProvider.initialize.1.198.INSTANCE));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.199 serviceProvider$initialize$1$1990 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final AndroidGetLifecycleFlow invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(Context.class));
                        return new AndroidGetLifecycleFlow(((Context)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AndroidGetLifecycleFlow.class)), E.a(serviceProvider$initialize$1$1990));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.200 serviceProvider$initialize$1$2000 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final AndroidHandleFocusCounters invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(SessionRepository.class));
                        Object object0 = this.$this_registry.resolveService(serviceKey0);
                        ServiceKey serviceKey1 = new ServiceKey("", m0.d(FocusRepository.class));
                        Object object1 = this.$this_registry.resolveService(serviceKey1);
                        ServiceKey serviceKey2 = new ServiceKey("", m0.d(AndroidGetIsAdActivity.class));
                        Object object2 = this.$this_registry.resolveService(serviceKey2);
                        ServiceKey serviceKey3 = new ServiceKey("default_dispatcher", m0.d(K.class));
                        return new AndroidHandleFocusCounters(((SessionRepository)object0), ((FocusRepository)object1), ((AndroidGetIsAdActivity)object2), ((K)this.$this_registry.resolveService(serviceKey3)), null, 16, null);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(AndroidHandleFocusCounters.class)), E.a(serviceProvider$initialize$1$2000));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.201 serviceProvider$initialize$1$2010 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final OfferwallAdapterBridge invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("offerwall_scope", m0.d(O.class));
                        return new OfferwallAdapterBridge(((O)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(OfferwallAdapterBridge.class)), E.a(serviceProvider$initialize$1$2010));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.202 serviceProvider$initialize$1$2020 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final OfferwallManager invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(OfferwallAdapterBridge.class));
                        return new AndroidOfferwallManager(((OfferwallAdapterBridge)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(OfferwallManager.class)), E.a(serviceProvider$initialize$1$2020));
                com.unity3d.services.core.di.ServiceProvider.initialize.1.203 serviceProvider$initialize$1$2030 = new a() {
                    final ServicesRegistry $this_registry;

                    {
                        this.$this_registry = servicesRegistry0;
                        super(0);
                    }

                    @l
                    public final LoadOfferwallAd invoke() {
                        ServiceKey serviceKey0 = new ServiceKey("", m0.d(OfferwallManager.class));
                        return new LoadOfferwallAd(((OfferwallManager)this.$this_registry.resolveService(serviceKey0)));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                servicesRegistry0.updateService(new ServiceKey("", m0.d(LoadOfferwallAd.class)), E.a(serviceProvider$initialize$1$2030));

                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.103 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.103 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.103.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.103();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.103() {
                        super(0);
                    }

                    @l
                    public final GetHbTokenEventRequest invoke() {
                        return new GetAndroidTokenEventRequest();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.116 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.116 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.116.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.116();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.116() {
                        super(0);
                    }

                    @l
                    public final GetSharedDataTimestamps invoke() {
                        return new AndroidGetSharedDataTimestamps();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.137 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.137 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.137.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.137();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.137() {
                        super(0);
                    }

                    @l
                    public final GetDiagnosticEventBatchRequest invoke() {
                        return new GetDiagnosticEventBatchRequest();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.141 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.141 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.141.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.141();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.141() {
                        super(0);
                    }

                    @l
                    public final HandleGatewayEventResponse invoke() {
                        return new AndroidHandleGatewayEventResponse();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.144 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.144 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.144.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.144();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.144() {
                        super(0);
                    }

                    @l
                    public final UniversalRequestTtlValidator invoke() {
                        return new CommonUniversalRequestTtlValidator();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.152 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.152 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.152.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.152();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.152() {
                        super(0);
                    }

                    @l
                    public final FlattenerRulesUseCase invoke() {
                        return new DeveloperConsentFlattenerRulesUseCase();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.153 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.153 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.153.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.153();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.153() {
                        super(0);
                    }

                    @l
                    public final FlattenerRulesUseCase invoke() {
                        return new LegacyUserConsentFlattenerRulesUseCase();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.158 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.158 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.158.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.158();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.158() {
                        super(0);
                    }

                    @l
                    public final TokenStorage invoke() {
                        return new InMemoryTokenStorage();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.159 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.159 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.159.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.159();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.159() {
                        super(0);
                    }

                    @l
                    public final VolumeChange invoke() {
                        return new VolumeChangeContentObserver();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.172 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.172 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.172.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.172();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.172() {
                        super(0);
                    }

                    @l
                    public final StoreExceptionHandler invoke() {
                        return new GatewayStoreExceptionHandler();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.174 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.174 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.174.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.174();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.174() {
                        super(0);
                    }

                    @l
                    public final ConfigurationReader invoke() {
                        return new ConfigurationReader();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.184 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.184 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.184.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.184();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.184() {
                        super(0);
                    }

                    @l
                    public final HandleInvocationsFromAdViewer invoke() {
                        return new HandleInvocationsFromAdViewer();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.188 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.188 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.188.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.188();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.188() {
                        super(0);
                    }

                    @l
                    public final IEventSender invoke() {
                        return SharedInstances.INSTANCE.getWebViewEventSender();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.195 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.195 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.195.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.195();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.195() {
                        super(0);
                    }

                    @l
                    public final DownloadPriorityQueue invoke() {
                        return new DownloadPriorityQueue();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.196 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.196 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.196.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.196();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.196() {
                        super(0);
                    }

                    @l
                    public final CleanupDirectory invoke() {
                        return new CleanupDirectory();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.198 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.198 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.198.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.198();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.198() {
                        super(0);
                    }

                    @l
                    public final AndroidGetIsAdActivity invoke() {
                        return new AndroidGetIsAdActivity();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.1 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.1 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.1.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.1();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.1() {
                        super(0);
                    }

                    public final Context invoke() {
                        return ClientProperties.getApplicationContext();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.36 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.36 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.36.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.36();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.36() {
                        super(0);
                    }

                    @l
                    public final CronetEngineBuilderFactory invoke() {
                        return new CronetEngineBuilderFactory();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.41 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.41 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.41.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.41();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.41() {
                        super(0);
                    }

                    @l
                    public final TcfDataSource invoke() {
                        return new AndroidTcfDataSource();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.47 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.47 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.47.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.47();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.47() {
                        super(0);
                    }

                    @l
                    public final AnalyticsDataSource invoke() {
                        return new AndroidAnalyticsDataSource();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.51 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.51 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.51.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.51();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.51() {
                        super(0);
                    }

                    @l
                    public final LifecycleDataSource invoke() {
                        return new AndroidLifecycleDataSource();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.53 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.53 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.53.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.53();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.53() {
                        super(0);
                    }

                    @l
                    public final CreateFile invoke() {
                        return new CommonCreateFile();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.55 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.55 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.55.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.55();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.55() {
                        super(0);
                    }

                    @l
                    public final RemoveUrlQuery invoke() {
                        return new AndroidRemoveUrlQuery();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.63 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.63 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.63.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.63();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.63() {
                        super(0);
                    }

                    @l
                    public final OmidManager invoke() {
                        return new AndroidOmidManager();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.64 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.64 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.64.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.64();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.64() {
                        super(0);
                    }

                    @l
                    public final SDKPropertiesManager invoke() {
                        return new AndroidSDKPropertiesManager();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.65 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.65 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.65.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.65();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.65() {
                        super(0);
                    }

                    @l
                    public final StorageManager invoke() {
                        return new AndroidStorageManager();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.67 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.67 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.67.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.67();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.67() {
                        super(0);
                    }

                    @l
                    public final AdRepository invoke() {
                        return new AndroidAdRepository();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.69 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.69 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.69.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.69();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.69() {
                        super(0);
                    }

                    @l
                    public final GetCacheDirectory invoke() {
                        return new CommonGetCacheDirectory();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.78 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.78 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.78.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.78();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.78() {
                        super(0);
                    }

                    @l
                    public final TransactionEventRepository invoke() {
                        return new AndroidTransactionEventRepository();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.79 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.79 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.79.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.79();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.79() {
                        super(0);
                    }

                    @l
                    public final OperativeEventRepository invoke() {
                        return new OperativeEventRepository();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }


                final class com.unity3d.services.core.di.ServiceProvider.initialize.1.81 extends N implements a {
                    public static final com.unity3d.services.core.di.ServiceProvider.initialize.1.81 INSTANCE;

                    static {
                        com.unity3d.services.core.di.ServiceProvider.initialize.1.81.INSTANCE = new com.unity3d.services.core.di.ServiceProvider.initialize.1.81();
                    }

                    com.unity3d.services.core.di.ServiceProvider.initialize.1.81() {
                        super(0);
                    }

                    @l
                    public final GetByteStringId invoke() {
                        return new AndroidGenerateByteStringId();
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.invoke();
                    }
                }

            }
        }

    }
}

