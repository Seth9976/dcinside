package com.unity3d.ads.core.domain;

import A3.a;
import A3.o;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.Invocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.services.core.di.IServiceComponent.DefaultImpls;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import java.util.Map;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

public final class HandleInvocationsFromAdViewer implements IServiceComponent {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String KEY_AD_DATA = "adData";
    @l
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    @l
    public static final String KEY_AD_STRING = "adString";
    @l
    public static final String KEY_AD_TYPE = "type";
    @l
    public static final String KEY_AD_UNIT_ID = "adUnitId";
    @l
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";
    @l
    public static final String KEY_DOWNLOAD_URL = "url";
    @l
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";
    @l
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";
    @l
    public static final String KEY_LOAD_OPTIONS = "loadOptions";
    @l
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";
    @l
    public static final String KEY_OMID = "openMeasurement";
    @l
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";
    @l
    public static final String KEY_OMJS_SESSION = "sessionFilePath";
    @l
    public static final String KEY_OM_PARTNER = "partnerName";
    @l
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";
    @l
    public static final String KEY_OM_VERSION = "version";
    @l
    public static final String KEY_PACKAGE_NAME = "packageName";
    @l
    public static final String KEY_PLACEMENT_ID = "placementId";
    @l
    public static final String KEY_PLACEMENT_NAME = "placementName";
    @l
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";
    @l
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";
    @l
    public static final String KEY_QUERY_ID = "queryId";
    @l
    public static final String KEY_TRACKING_TOKEN = "trackingToken";
    @l
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    static {
        HandleInvocationsFromAdViewer.Companion = new Companion(null);
    }

    @Override  // com.unity3d.services.core.di.IServiceComponent
    @l
    public IServiceProvider getServiceProvider() {
        return DefaultImpls.getServiceProvider(this);
    }

    @m
    public final Object invoke(@l I i0, @l String s, @l String s1, @l String s2, @l AdObject adObject0, @l Function1 function10, @l d d0) {
        Map map0 = Y.W(new V[]{r0.a("com.unity3d.services.ads.api.AdViewer.getAdContext", new a(AdData.constructor-impl(s), ImpressionConfig.constructor-impl(s2), AdDataRefreshToken.constructor-impl(s1), adObject0) {
            final String $adDataObject;
            final String $adDataRefreshTokenObject;
            final AdObject $adObject;
            final String $impressionConfigObject;

            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                this.$adDataObject = s;
                this.$impressionConfigObject = s1;
                this.$adDataRefreshTokenObject = s2;
                this.$adObject = adObject0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                Object object0 = HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(AndroidGetAdPlayerContext.class));
                Object object1 = HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(IsOMActivated.class));
                return CommonAdViewerExposedFunctionsKt.getAdContext-yLuu4LI(((AndroidGetAdPlayerContext)object0), this.$adDataObject, this.$impressionConfigObject, this.$adDataRefreshTokenObject, ((IsOMActivated)object1), this.$adObject);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.core.api.DeviceInfo.getConnectionType", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getConnectionType(((DeviceInfoRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(DeviceInfoRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.core.api.DeviceInfo.getDeviceVolume", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getDeviceVolume(((DeviceInfoRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(DeviceInfoRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.core.api.DeviceInfo.getDeviceMaxVolume", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume(((DeviceInfoRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(DeviceInfoRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.core.api.DeviceInfo.getScreenHeight", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getScreenHeight(((DeviceInfoRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(DeviceInfoRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.core.api.DeviceInfo.getScreenWidth", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getScreenWidth(((DeviceInfoRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(DeviceInfoRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.openUrl", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.openUrl(((HandleOpenUrl)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(HandleOpenUrl.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.setOrientation", new a() {
            final AdObject $adObject;

            {
                this.$adObject = adObject0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setOrientation(this.$adObject);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.sendOperativeEvent", new a(adObject0) {
            final AdObject $adObject;

            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                this.$adObject = adObject0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendOperativeEvent(((GetOperativeEventApi)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(GetOperativeEventApi.class))), this.$adObject);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.core.api.Storage.write", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.10.INSTANCE), r0.a("com.unity3d.services.core.api.Storage.read", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.11.INSTANCE), r0.a("com.unity3d.services.core.api.Storage.delete", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.12.INSTANCE), r0.a("com.unity3d.services.core.api.Storage.clear", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.13.INSTANCE), r0.a("com.unity3d.services.core.api.Storage.getKeys", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.14.INSTANCE), r0.a("com.unity3d.services.core.api.Storage.get", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.15.INSTANCE), r0.a("com.unity3d.services.core.api.Storage.set", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.16.INSTANCE), r0.a("com.unity3d.services.ads.api.AdViewer.getPrivacyFsm", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getPrivacyFsm(((SessionRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(SessionRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.setPrivacyFsm", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setPrivacyFsm(((SessionRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(SessionRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.getPrivacyPayload", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getPrivacy(((SessionRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(SessionRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.setPrivacyPayload", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setPrivacy(((SessionRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(SessionRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.getPrivacyAllowedPii", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getAllowedPii(((DeviceInfoRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(DeviceInfoRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.setPrivacyAllowedPii", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setAllowedPii(((DeviceInfoRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(DeviceInfoRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.getSessionToken", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getSessionToken(((SessionRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(SessionRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.markCampaignStateAsShown", new a(adObject0) {
            final AdObject $adObject;

            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                this.$adObject = adObject0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.markCampaignStateShown(((CampaignRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(CampaignRepository.class))), this.$adObject);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.refreshAdData", new a(adObject0) {
            final AdObject $adObject;

            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                this.$adObject = adObject0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.refreshAdData(((Refresh)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(Refresh.class))), this.$adObject);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.updateTrackingToken", new a() {
            final AdObject $adObject;

            {
                this.$adObject = adObject0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.updateTrackingToken(this.$adObject);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.sendPrivacyUpdateRequest", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest(((SendPrivacyUpdateRequest)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(SendPrivacyUpdateRequest.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.sendDiagnosticEvent", new a(adObject0) {
            final AdObject $adObject;

            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                this.$adObject = adObject0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent(((SendDiagnosticEvent)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(SendDiagnosticEvent.class))), this.$adObject);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.incrementBannerImpressionCount", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount(((SessionRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(SessionRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.download", new a(adObject0) {
            final AdObject $adObject;

            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                this.$adObject = adObject0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.download(((CacheFile)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(CacheFile.class))), this.$adObject);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.isFileCached", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isFileCached(((GetIsFileCache)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(GetIsFileCache.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.omidStartSession", new a(adObject0) {
            final AdObject $adObject;

            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                this.$adObject = adObject0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omStartSession(((AndroidOmStartSession)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(AndroidOmStartSession.class))), this.$adObject);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.omidFinishSession", new a(adObject0) {
            final AdObject $adObject;

            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                this.$adObject = adObject0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omFinishSession(((OmFinishSession)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(OmFinishSession.class))), this.$adObject);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.omidImpression", new a(adObject0) {
            final AdObject $adObject;

            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                this.$adObject = adObject0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omImpression(((OmImpressionOccurred)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(OmImpressionOccurred.class))), this.$adObject);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.omidGetData", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omGetData(((GetOmData)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(GetOmData.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.isAttributionAvailable", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isAttributionAvailable(((AndroidAttribution)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(AndroidAttribution.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.attributionRegisterView", new a(adObject0) {
            final AdObject $adObject;

            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                this.$adObject = adObject0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.attributionRegisterView(((AndroidAttribution)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(AndroidAttribution.class))), this.$adObject);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.attributionRegisterClick", new a(adObject0) {
            final AdObject $adObject;

            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                this.$adObject = adObject0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.attributionRegisterClick(((AndroidAttribution)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(AndroidAttribution.class))), this.$adObject);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.loadScarAd", new a(adObject0) {
            final AdObject $adObject;

            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                this.$adObject = adObject0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.loadScarAd(((LoadScarAd)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(LoadScarAd.class))), this.$adObject);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.showScarAd", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.40.INSTANCE), r0.a("com.unity3d.services.ads.api.AdViewer.hbTokenIncrementWins", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins(((SessionRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(SessionRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.hbTokenIncrementStarts", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts(((SessionRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(SessionRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.hbTokenReset", new a() {
            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenReset(((SessionRepository)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(SessionRepository.class))));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.loadOfferwallAd", new a(adObject0) {
            final AdObject $adObject;

            {
                HandleInvocationsFromAdViewer.this = handleInvocationsFromAdViewer0;
                this.$adObject = adObject0;
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.loadOfferwallAd(((LoadOfferwallAd)HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", m0.d(LoadOfferwallAd.class))), this.$adObject);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }), r0.a("com.unity3d.services.ads.api.AdViewer.showOfferwallAd", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.45.INSTANCE)});
        return k.e1(k.m1(i0, new o(null) {
            final Function1 $onSubscription;
            int label;

            {
                this.$onSubscription = function10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.2(this.$onSubscription, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((j)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l j j0, @m d d0) {
                return ((com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.2)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        this.label = 1;
                        return this.$onSubscription.invoke(this) == object1 ? object1 : S0.a;
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
        }), new o(null) {
            final Map $definition;
            Object L$0;
            int label;

            {
                this.$definition = map0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.3(this.$definition, d0);
                d1.L$0 = object0;
                return d1;
            }

            @m
            public final Object invoke(@l Invocation invocation0, @m d d0) {
                return ((com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.3)this.create(invocation0, d0)).invokeSuspend(S0.a);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Invocation)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        Invocation invocation0 = (Invocation)this.L$0;
                        a a0 = (a)this.$definition.get(invocation0.getLocation());
                        if(a0 != null) {
                            ExposedFunction exposedFunction0 = (ExposedFunction)a0.invoke();
                            if(exposedFunction0 != null) {
                                com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.3.1 handleInvocationsFromAdViewer$invoke$3$10 = new Function1(invocation0, null) {
                                    final ExposedFunction $exposedFunction;
                                    final Invocation $it;
                                    int label;

                                    {
                                        this.$exposedFunction = exposedFunction0;
                                        this.$it = invocation0;
                                        super(1, d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@l d d0) {
                                        return new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.3.1(this.$exposedFunction, this.$it, d0);
                                    }

                                    @Override  // kotlin.jvm.functions.Function1
                                    public Object invoke(Object object0) {
                                        return this.invoke(((d)object0));
                                    }

                                    @m
                                    public final Object invoke(@m d d0) {
                                        return ((com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.3.1)this.create(d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Object object1 = b.l();
                                        switch(this.label) {
                                            case 0: {
                                                f0.n(object0);
                                                this.label = 1;
                                                object0 = this.$exposedFunction.invoke(this.$it.getParameters(), this);
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
                                };
                                this.label = 1;
                                return invocation0.handle(handleInvocationsFromAdViewer$invoke$3$10, this) == object1 ? object1 : S0.a;
                            }
                        }
                        return S0.a;
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
        });

        final class com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.10 extends N implements a {
            public static final com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.10 INSTANCE;

            static {
                com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.10.INSTANCE = new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.10();
            }

            com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.10() {
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.writeStorage();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }


        final class com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.11 extends N implements a {
            public static final com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.11 INSTANCE;

            static {
                com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.11.INSTANCE = new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.11();
            }

            com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.11() {
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.readStorage();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }


        final class com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.12 extends N implements a {
            public static final com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.12 INSTANCE;

            static {
                com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.12.INSTANCE = new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.12();
            }

            com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.12() {
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.deleteStorage();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }


        final class com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.13 extends N implements a {
            public static final com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.13 INSTANCE;

            static {
                com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.13.INSTANCE = new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.13();
            }

            com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.13() {
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.clearStorage();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }


        final class com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.14 extends N implements a {
            public static final com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.14 INSTANCE;

            static {
                com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.14.INSTANCE = new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.14();
            }

            com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.14() {
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getKeysStorage();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }


        final class com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.15 extends N implements a {
            public static final com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.15 INSTANCE;

            static {
                com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.15.INSTANCE = new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.15();
            }

            com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.15() {
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getStorage();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }


        final class com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.16 extends N implements a {
            public static final com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.16 INSTANCE;

            static {
                com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.16.INSTANCE = new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.16();
            }

            com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.16() {
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setStorage();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }


        final class com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.40 extends N implements a {
            public static final com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.40 INSTANCE;

            static {
                com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.40.INSTANCE = new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.40();
            }

            com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.40() {
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.showScarAd();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }


        final class com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.45 extends N implements a {
            public static final com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.45 INSTANCE;

            static {
                com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.45.INSTANCE = new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.45();
            }

            com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.invoke.definition.45() {
                super(0);
            }

            @l
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.showOfferwallAd();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }

    }
}

