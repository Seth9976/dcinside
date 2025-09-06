package com.vungle.ads.internal.load;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.vungle.ads.H0;
import com.vungle.ads.L0;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.W0;
import com.vungle.ads.X0;
import com.vungle.ads.Y0;
import com.vungle.ads.d1;
import com.vungle.ads.e0;
import com.vungle.ads.internal.downloader.e;
import com.vungle.ads.internal.executor.i;
import com.vungle.ads.internal.k;
import com.vungle.ads.internal.model.b.g;
import com.vungle.ads.internal.model.h;
import com.vungle.ads.internal.omsdk.c;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.x;
import com.vungle.ads.j;
import com.vungle.ads.k0;
import com.vungle.ads.o0;
import com.vungle.ads.p0;
import com.vungle.ads.r;
import com.vungle.ads.s;
import com.vungle.ads.u0;
import com.vungle.ads.u;
import com.vungle.ads.v;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final a Companion = null;
    @l
    private static final String DOWNLOADED_FILE_NOT_FOUND = "Downloaded file not found!";
    @l
    private static final String TAG = "BaseAdLoader";
    @l
    private final List adAssets;
    @m
    private com.vungle.ads.internal.load.a adLoaderCallback;
    @l
    private Y0 adOptionalDownloadDurationMetric;
    @l
    private final b adRequest;
    @l
    private Y0 adRequiredDownloadDurationMetric;
    @m
    private com.vungle.ads.internal.model.b advertisement;
    @l
    private Y0 assetDownloadDurationMetric;
    @l
    private final Context context;
    @l
    private final AtomicLong downloadCount;
    @l
    private final AtomicLong downloadRequiredCount;
    @l
    private final e downloader;
    @l
    private AtomicBoolean fullyDownloaded;
    @m
    private o logEntry;
    @l
    private W0 mainVideoSizeMetric;
    @l
    private AtomicBoolean notifyFailed;
    @l
    private AtomicBoolean notifySuccess;
    @l
    private final c omInjector;
    @l
    private final q pathProvider;
    @l
    private AtomicBoolean requiredAssetDownloaded;
    @l
    private final com.vungle.ads.internal.executor.a sdkExecutors;
    @l
    private W0 templateHtmlSizeMetric;
    @l
    private W0 templateSizeMetric;
    @l
    private final com.vungle.ads.internal.network.l vungleApiClient;

    static {
        d.Companion = new a(null);
    }

    public d(@l Context context0, @l com.vungle.ads.internal.network.l l0, @l com.vungle.ads.internal.executor.a a0, @l c c0, @l e e0, @l q q0, @l b b0) {
        L.p(context0, "context");
        L.p(l0, "vungleApiClient");
        L.p(a0, "sdkExecutors");
        L.p(c0, "omInjector");
        L.p(e0, "downloader");
        L.p(q0, "pathProvider");
        L.p(b0, "adRequest");
        super();
        this.context = context0;
        this.vungleApiClient = l0;
        this.sdkExecutors = a0;
        this.omInjector = c0;
        this.downloader = e0;
        this.pathProvider = q0;
        this.adRequest = b0;
        this.downloadCount = new AtomicLong(0L);
        this.downloadRequiredCount = new AtomicLong(0L);
        this.notifySuccess = new AtomicBoolean(false);
        this.notifyFailed = new AtomicBoolean(false);
        this.adAssets = new ArrayList();
        this.fullyDownloaded = new AtomicBoolean(true);
        this.requiredAssetDownloaded = new AtomicBoolean(true);
        this.mainVideoSizeMetric = new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.ASSET_FILE_SIZE);
        this.templateSizeMetric = new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.TEMPLATE_ZIP_SIZE);
        this.templateHtmlSizeMetric = new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.TEMPLATE_HTML_SIZE);
        this.assetDownloadDurationMetric = new Y0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.ASSET_DOWNLOAD_DURATION_MS);
        this.adRequiredDownloadDurationMetric = new Y0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_REQUIRED_DOWNLOAD_DURATION_MS);
        this.adOptionalDownloadDurationMetric = new Y0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_OPTIONAL_DOWNLOAD_DURATION_MS);
    }

    public final void cancel() {
        this.downloader.cancelAll();
    }

    private final void downloadAssets() {
        this.assetDownloadDurationMetric.markStart();
        this.adRequiredDownloadDurationMetric.markStart();
        this.adOptionalDownloadDurationMetric.markStart();
        this.downloadCount.set(((long)this.adAssets.size()));
        AtomicLong atomicLong0 = this.downloadRequiredCount;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.adAssets) {
            if(((com.vungle.ads.internal.model.a)object0).isRequired()) {
                arrayList0.add(object0);
            }
        }
        atomicLong0.set(((long)arrayList0.size()));
        for(Object object1: this.adAssets) {
            com.vungle.ads.internal.downloader.d d0 = new com.vungle.ads.internal.downloader.d(this.getAssetPriority(((com.vungle.ads.internal.model.a)object1)), ((com.vungle.ads.internal.model.a)object1), this.logEntry);
            if(d0.isTemplate()) {
                d0.startRecord();
            }
            com.vungle.ads.internal.downloader.a a0 = this.getAssetDownloadListener();
            this.downloader.download(d0, a0);
        }
    }

    private final boolean fileIsValid(File file0, com.vungle.ads.internal.model.a a0) {
        return file0.exists() && file0.length() == a0.getFileSize();
    }

    @l
    public final b getAdRequest() {
        return this.adRequest;
    }

    @m
    public final com.vungle.ads.internal.model.b getAdvertisement$vungle_ads_release() {
        return this.advertisement;
    }

    private final com.vungle.ads.internal.downloader.a getAssetDownloadListener() {
        public static final class com.vungle.ads.internal.load.d.b implements com.vungle.ads.internal.downloader.a {
            com.vungle.ads.internal.load.d.b(d d0) {
                d.this = d0;
                super();
            }

            @Override  // com.vungle.ads.internal.downloader.a
            public void onError(@m com.vungle.ads.internal.downloader.a.a a$a0, @l com.vungle.ads.internal.downloader.d d0) {
                L.p(d0, "downloadRequest");
                com.vungle.ads.internal.util.p.a p$a0 = p.Companion;
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append("onError called: reason ");
                Throwable throwable0 = null;
                stringBuilder0.append((a$a0 == null ? null : a$a0.getReason()));
                stringBuilder0.append("; cause ");
                if(a$a0 != null) {
                    throwable0 = a$a0.getCause();
                }
                stringBuilder0.append(throwable0);
                p$a0.e("BaseAdLoader", stringBuilder0.toString());
                d.this.getSdkExecutors().getBackgroundExecutor().execute(() -> {
                    L.p(d.this, "this$0");
                    L.p(d0, "$downloadRequest");
                    d.this.fullyDownloaded.set(false);
                    if(d0.getAsset().isRequired()) {
                        d.this.requiredAssetDownloaded.set(false);
                    }
                    StringBuilder stringBuilder0 = new StringBuilder();
                    stringBuilder0.append("Failed to download assets. required=");
                    stringBuilder0.append(d0.getAsset().isRequired());
                    stringBuilder0.append(" reason=");
                    Throwable throwable0 = null;
                    stringBuilder0.append((a$a0 == null ? null : a$a0.getReason()));
                    stringBuilder0.append(" cause=");
                    if(a$a0 != null) {
                        throwable0 = a$a0.getCause();
                    }
                    stringBuilder0.append(throwable0);
                    String s = stringBuilder0.toString();
                    if(d0.getAsset().isRequired() && d.this.downloadRequiredCount.decrementAndGet() <= 0L) {
                        d.this.onAdLoadFailed(new s(com.vungle.ads.internal.protos.Sdk.SDKError.b.ASSET_RESPONSE_DATA_ERROR, s).setLogEntry$vungle_ads_release(d.this.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                        d.this.cancel();
                        return;
                    }
                    if(d.this.downloadCount.decrementAndGet() <= 0L) {
                        d.this.onAdLoadFailed(new s(com.vungle.ads.internal.protos.Sdk.SDKError.b.ASSET_RESPONSE_DATA_ERROR, s).setLogEntry$vungle_ads_release(d.this.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                    }
                });
            }

            // 检测为 Lambda 实现
            private static final void onError$lambda-0(d d0, com.vungle.ads.internal.downloader.d d1, com.vungle.ads.internal.downloader.a.a a$a0) [...]

            @Override  // com.vungle.ads.internal.downloader.a
            public void onSuccess(@l File file0, @l com.vungle.ads.internal.downloader.d d0) {
                L.p(file0, "file");
                L.p(d0, "downloadRequest");
                d.this.getSdkExecutors().getBackgroundExecutor().execute(() -> {
                    L.p(file0, "$file");
                    L.p(this, "this$0");
                    L.p(d0, "$downloadRequest");
                    L.p(d.this, "this$1");
                    if(!file0.exists()) {
                        this.onError(new com.vungle.ads.internal.downloader.a.a(-1, new IOException("Downloaded file not found!"), 3), d0);
                        return;
                    }
                    com.vungle.ads.internal.model.a a0 = d0.getAsset();
                    a0.setFileSize(file0.length());
                    a0.setStatus(com.vungle.ads.internal.model.a.b.DOWNLOAD_SUCCESS);
                    if(d0.isTemplate()) {
                        d0.stopRecord();
                        W0 w00 = d0.isHtmlTemplate() ? d.this.templateHtmlSizeMetric : d.this.templateSizeMetric;
                        w00.setValue(file0.length());
                        r.INSTANCE.logMetric$vungle_ads_release(w00, d.this.getLogEntry$vungle_ads_release(), a0.getServerPath());
                    }
                    else if(d0.isMainVideo()) {
                        d.this.mainVideoSizeMetric.setValue(file0.length());
                        r.INSTANCE.logMetric$vungle_ads_release(d.this.mainVideoSizeMetric, d.this.getLogEntry$vungle_ads_release(), a0.getServerPath());
                    }
                    com.vungle.ads.internal.model.b b0 = d.this.getAdvertisement$vungle_ads_release();
                    if(b0 != null) {
                        b0.updateAdAssetPath(a0);
                    }
                    if(d0.isTemplate() && !d.this.processVmTemplate(a0, d.this.getAdvertisement$vungle_ads_release())) {
                        d.this.fullyDownloaded.set(false);
                        if(a0.isRequired()) {
                            d.this.requiredAssetDownloaded.set(false);
                        }
                    }
                    if(a0.isRequired() && d.this.downloadRequiredCount.decrementAndGet() <= 0L) {
                        if(d.this.requiredAssetDownloaded.get()) {
                            d.this.onRequiredDownloadCompleted();
                            goto label_33;
                        }
                        d.this.onAdLoadFailed(new s(com.vungle.ads.internal.protos.Sdk.SDKError.b.ASSET_RESPONSE_DATA_ERROR, "Failed to download required assets.").setLogEntry$vungle_ads_release(d.this.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                        d.this.cancel();
                        return;
                    }
                label_33:
                    if(d.this.downloadCount.decrementAndGet() <= 0L) {
                        if(d.this.fullyDownloaded.get()) {
                            d.this.onDownloadCompleted(d.this.getAdRequest());
                            return;
                        }
                        d.this.onAdLoadFailed(new s(com.vungle.ads.internal.protos.Sdk.SDKError.b.ASSET_RESPONSE_DATA_ERROR, "Failed to download assets.").setLogEntry$vungle_ads_release(d.this.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                    }
                });
            }

            // 检测为 Lambda 实现
            private static final void onSuccess$lambda-1(File file0, com.vungle.ads.internal.load.d.b d$b0, com.vungle.ads.internal.downloader.d d0, d d1) [...]
        }

        return new com.vungle.ads.internal.load.d.b(this);
    }

    // 去混淆评级： 低(20)
    private final com.vungle.ads.internal.downloader.d.a getAssetPriority(com.vungle.ads.internal.model.a a0) {
        return a0.isRequired() ? com.vungle.ads.internal.downloader.d.a.CRITICAL : com.vungle.ads.internal.downloader.d.a.HIGHEST;
    }

    @l
    public final Context getContext() {
        return this.context;
    }

    private final File getDestinationDir(com.vungle.ads.internal.model.b b0) {
        String s = b0.eventId();
        return this.pathProvider.getDownloadsDirForAd(s);
    }

    private final d1 getErrorInfo(com.vungle.ads.internal.model.b b0) {
        com.vungle.ads.internal.model.b.c b$c0 = b0.adUnit();
        String s = null;
        Integer integer0 = b$c0 == null ? null : b$c0.getErrorCode();
        com.vungle.ads.internal.model.b.c b$c1 = b0.adUnit();
        Integer integer1 = b$c1 == null ? null : b$c1.getSleep();
        com.vungle.ads.internal.model.b.c b$c2 = b0.adUnit();
        if(b$c2 != null) {
            s = b$c2.getInfo();
        }
        String s1 = "Response error: " + integer1 + ", Request failed with error: " + integer0 + ", " + s;
        if(integer0 != null && ((int)integer0) == 10001 || integer0 != null && ((int)integer0) == 10002 || integer0 != null && ((int)integer0) == 20001 || integer0 != null && ((int)integer0) == 30001 || integer0 != null && ((int)integer0) == 30002) {
            com.vungle.ads.internal.protos.Sdk.SDKError.b sdk$SDKError$b0 = com.vungle.ads.internal.protos.Sdk.SDKError.b.forNumber(((int)integer0));
            L.o(sdk$SDKError$b0, "forNumber(errorCode)");
            return new j(sdk$SDKError$b0, s1);
        }
        return new j(com.vungle.ads.internal.protos.Sdk.SDKError.b.PLACEMENT_SLEEP, s1);
    }

    @m
    public final o getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    @l
    public final q getPathProvider() {
        return this.pathProvider;
    }

    @l
    public final com.vungle.ads.internal.executor.a getSdkExecutors() {
        return this.sdkExecutors;
    }

    private final d1 getTemplateError(com.vungle.ads.internal.model.b b0) {
        com.vungle.ads.internal.model.b.c b$c0 = b0.adUnit();
        g b$g0 = b$c0 == null ? null : b$c0.getTemplateSettings();
        if(b$g0 == null) {
            return new v("Missing template settings");
        }
        Map map0 = b$g0.getCacheableReplacements();
        if(b0.isNativeTemplateType()) {
            if(map0 == null) {
                goto label_22;
            }
            com.vungle.ads.internal.model.b.d b$d0 = (com.vungle.ads.internal.model.b.d)map0.get("MAIN_IMAGE");
            if((b$d0 == null ? null : b$d0.getUrl()) == null) {
                return new H0("Unable to load null main image.");
            }
            com.vungle.ads.internal.model.b.d b$d1 = (com.vungle.ads.internal.model.b.d)map0.get("VUNGLE_PRIVACY_ICON_URL");
            if((b$d1 == null ? null : b$d1.getUrl()) != null) {
                goto label_22;
            }
            return new H0("Unable to load null privacy image.");
        }
        com.vungle.ads.internal.model.b.c b$c1 = b0.adUnit();
        String s = b$c1 == null ? null : b$c1.getTemplateURL();
        com.vungle.ads.internal.model.b.c b$c2 = b0.adUnit();
        String s1 = b$c2 == null ? null : b$c2.getVmURL();
        if(s != null && s.length() != 0 || s1 != null && s1.length() != 0) {
            if(s != null && s.length() != 0 && !x.INSTANCE.isUrlValid(s)) {
                return new u("Failed to load template: " + s);
            }
            if(s1 != null && s1.length() != 0 && !x.INSTANCE.isUrlValid(s1)) {
                return new u("Failed to load vm url: " + s1);
            }
        label_22:
            if(map0 != null) {
                for(Object object0: map0.entrySet()) {
                    String s2 = ((com.vungle.ads.internal.model.b.d)((Map.Entry)object0).getValue()).getUrl();
                    if(s2 != null && s2.length() != 0) {
                        if(x.INSTANCE.isUrlValid(s2)) {
                            continue;
                        }
                        return new u("Invalid asset URL " + s2);
                    }
                    return new k0("Invalid asset URL " + s2);
                }
            }
            return null;
        }
        return new p0("Failed to prepare null vmURL or templateURL for downloading.");
    }

    @l
    public final com.vungle.ads.internal.network.l getVungleApiClient() {
        return this.vungleApiClient;
    }

    private static final com.vungle.ads.internal.signals.c handleAdMetaData$lambda-5(D d0) {
        return (com.vungle.ads.internal.signals.c)d0.getValue();
    }

    public final void handleAdMetaData$vungle_ads_release(@l com.vungle.ads.internal.model.b b0, @m W0 w00) {
        public static final class com.vungle.ads.internal.load.d.c extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.load.d.c(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.c.class);
            }
        }


        public static final class com.vungle.ads.internal.load.d.d implements com.vungle.ads.internal.load.k.a {
            com.vungle.ads.internal.load.d.d(d d0) {
                d.this = d0;
                super();
            }

            @Override  // com.vungle.ads.internal.load.k$a
            public void onDownloadResult(int v) {
                if(v == 10 || v == 13) {
                    if(v == 10) {
                        r.logMetric$vungle_ads_release$default(r.INSTANCE, com.vungle.ads.internal.protos.Sdk.SDKMetric.b.MRAID_DOWNLOAD_JS_RETRY_SUCCESS, 0L, d.this.getLogEntry$vungle_ads_release(), null, 10, null);
                    }
                    d.this.downloadAssets();
                }
                else {
                    com.vungle.ads.internal.load.a a0 = d.this.adLoaderCallback;
                    if(a0 != null) {
                        a0.onFailure(new u0(com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_DOWNLOAD_JS_ERROR, "Failed to download mraid.js."));
                    }
                }
            }
        }

        L.p(b0, "advertisement");
        this.advertisement = b0;
        b0.setLogEntry$vungle_ads_release(this.logEntry);
        o o0 = this.logEntry;
        if(o0 != null) {
            o0.setEventId$vungle_ads_release(b0.eventId());
        }
        o o1 = this.logEntry;
        if(o1 != null) {
            o1.setCreativeId$vungle_ads_release("unknown");
        }
        o o2 = this.logEntry;
        if(o2 != null) {
            o2.setAdSource$vungle_ads_release(b0.getAdSource());
        }
        h h0 = b0.config();
        if(h0 != null) {
            k.INSTANCE.initWithConfig$vungle_ads_release(this.context, h0, false, w00);
        }
        d1 d10 = this.validateAdMetadata(b0);
        if(d10 != null) {
            this.onAdLoadFailed(d10.setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        File file0 = this.getDestinationDir(b0);
        if(file0 != null && file0.isDirectory() && file0.exists()) {
            com.vungle.ads.internal.load.d.c d$c0 = new com.vungle.ads.internal.load.d.c(this.context);
            D d0 = E.c(H.a, d$c0);
            com.vungle.ads.internal.model.b.c b$c0 = b0.adUnit();
            if(b$c0 != null) {
                List list0 = b$c0.getLoadAdUrls();
                if(list0 != null) {
                    o o3 = this.logEntry;
                    i i0 = this.sdkExecutors.getIoExecutor();
                    com.vungle.ads.internal.signals.c c0 = d.handleAdMetaData$lambda-5(d0);
                    com.vungle.ads.internal.network.j j0 = new com.vungle.ads.internal.network.j(this.vungleApiClient, o3, i0, this.pathProvider, c0);
                    for(Object object0: list0) {
                        j0.sendTpat(((String)object0), this.sdkExecutors.getJobExecutor());
                    }
                }
            }
            if(!this.adAssets.isEmpty()) {
                this.adAssets.clear();
            }
            Collection collection0 = b0.getDownloadableAssets(file0);
            this.adAssets.addAll(collection0);
            if(this.adAssets.isEmpty()) {
                this.onAdLoadFailed(new s(com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_ASSET_URL, "No assets to download.").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
            i i1 = this.sdkExecutors.getBackgroundExecutor();
            com.vungle.ads.internal.load.d.d d$d0 = new com.vungle.ads.internal.load.d.d(this);
            com.vungle.ads.internal.load.k.INSTANCE.downloadJs(this.pathProvider, this.downloader, i1, d$d0, b0);
            return;
        }
        this.onAdLoadFailed(new s(com.vungle.ads.internal.protos.Sdk.SDKError.b.ASSET_WRITE_ERROR, "Invalid directory. " + file0).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
    }

    public static void handleAdMetaData$vungle_ads_release$default(d d0, com.vungle.ads.internal.model.b b0, W0 w00, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAdMetaData");
        }
        if((v & 2) != 0) {
            w00 = null;
        }
        d0.handleAdMetaData$vungle_ads_release(b0, w00);
    }

    private final boolean injectMraidJS(File file0) {
        try {
            File file1 = new File(file0.getPath(), "mraid.js");
            new String("mraid_1");
            File file2 = new File(this.pathProvider.getJsAssetDir("mraid_1"), "mraid.min.js");
            if(file2.exists()) {
                kotlin.io.m.T(file2, file1, true, 0, 4, null);
                return true;
            }
            new u0(com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_JS_DOES_NOT_EXIST, "mraid js source file not exist.").setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return false;
        }
        catch(Exception exception0) {
        }
        p.Companion.e("BaseAdLoader", "Failed to inject mraid.js: " + exception0.getMessage());
        new u0(com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_JS_COPY_FAILED, "Failed to copy mraid js to ad folder: " + exception0.getMessage()).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
        return false;
    }

    public final void loadAd(@l com.vungle.ads.internal.load.a a0) {
        L.p(a0, "adLoaderCallback");
        this.adLoaderCallback = a0;
        this.sdkExecutors.getBackgroundExecutor().execute(() -> {
            L.p(this, "this$0");
            this.requestAd();
        });
    }

    // 检测为 Lambda 实现
    private static final void loadAd$lambda-0(d d0) [...]

    public final void onAdLoadFailed(@l d1 d10) {
        L.p(d10, "error");
        if(!this.notifySuccess.get() && this.notifyFailed.compareAndSet(false, true)) {
            com.vungle.ads.internal.load.a a0 = this.adLoaderCallback;
            if(a0 != null) {
                a0.onFailure(d10);
            }
        }
    }

    public abstract void onAdLoadReady();

    private final void onAdReady() {
        com.vungle.ads.internal.model.b b0 = this.advertisement;
        if(b0 != null && !this.notifyFailed.get() && this.notifySuccess.compareAndSet(false, true)) {
            this.onAdLoadReady();
            com.vungle.ads.internal.load.a a0 = this.adLoaderCallback;
            if(a0 != null) {
                a0.onSuccess(b0);
            }
        }
    }

    @WorkerThread
    private final void onDownloadCompleted(b b0) {
        p.Companion.d("BaseAdLoader", "All download completed " + b0);
        com.vungle.ads.internal.model.b b1 = this.advertisement;
        if(b1 != null) {
            b1.setAssetFullyDownloaded();
        }
        this.onAdReady();
        this.assetDownloadDurationMetric.markEnd();
        r.logMetric$vungle_ads_release$default(r.INSTANCE, this.assetDownloadDurationMetric, this.logEntry, null, 4, null);
        this.adOptionalDownloadDurationMetric.markEnd();
        r.logMetric$vungle_ads_release$default(r.INSTANCE, this.adOptionalDownloadDurationMetric, this.logEntry, null, 4, null);
    }

    private final void onRequiredDownloadCompleted() {
        this.adRequiredDownloadDurationMetric.markEnd();
        r.logMetric$vungle_ads_release$default(r.INSTANCE, this.adRequiredDownloadDurationMetric, this.logEntry, null, 4, null);
        this.onAdReady();
    }

    private final boolean processVmTemplate(com.vungle.ads.internal.model.a a0, com.vungle.ads.internal.model.b b0) {
        if(b0 == null) {
            return false;
        }
        if(a0.getStatus() != com.vungle.ads.internal.model.a.b.DOWNLOAD_SUCCESS) {
            return false;
        }
        if(a0.getLocalPath().length() == 0) {
            return false;
        }
        File file0 = new File(a0.getLocalPath());
        if(!this.fileIsValid(file0, a0)) {
            return false;
        }
        File file1 = this.getDestinationDir(b0);
        if(file1 != null && file1.isDirectory()) {
            if(a0.getFileType() == com.vungle.ads.internal.model.a.a.ZIP && !this.unzipFile(file0, file1)) {
                return false;
            }
            if(b0.omEnabled()) {
                try {
                    this.omInjector.injectJsFiles$vungle_ads_release(file1);
                    return this.injectMraidJS(file1);
                }
                catch(Exception exception0) {
                    p.Companion.e("BaseAdLoader", "Failed to inject OMSDK: " + exception0.getMessage());
                    new L0(com.vungle.ads.internal.protos.Sdk.SDKError.b.OMSDK_JS_WRITE_FAILED, "Failed to inject OMSDK: " + exception0.getMessage()).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
                    return this.injectMraidJS(file1);
                }
            }
            return this.injectMraidJS(file1);
        }
        p.Companion.e("BaseAdLoader", "Unable to access Destination Directory");
        return false;
    }

    protected abstract void requestAd();

    public final void setAdvertisement$vungle_ads_release(@m com.vungle.ads.internal.model.b b0) {
        this.advertisement = b0;
    }

    public final void setLogEntry$vungle_ads_release(@m o o0) {
        this.logEntry = o0;
    }

    private final boolean unzipFile(File file0, File file1) {
        public static final class com.vungle.ads.internal.load.d.e implements com.vungle.ads.internal.util.w.a {
            final List $existingPaths;

            com.vungle.ads.internal.load.d.e(List list0) {
                this.$existingPaths = list0;
                super();
            }

            @Override  // com.vungle.ads.internal.util.w$a
            public boolean matches(@m String s) {
                if(s != null && s.length() != 0) {
                    File file0 = new File(s);
                    for(Object object0: this.$existingPaths) {
                        File file1 = new File(((String)object0));
                        if(L.g(file1, file0)) {
                            return false;
                        }
                        String s1 = file0.getPath();
                        L.o(s1, "toExtract.path");
                        if(kotlin.text.v.v2(s1, file1.getPath() + "/", false, 2, null)) {
                            return false;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return true;
            }
        }

        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.adAssets) {
            com.vungle.ads.internal.model.a a0 = (com.vungle.ads.internal.model.a)object0;
            if(a0.getFileType() == com.vungle.ads.internal.model.a.a.ASSET) {
                arrayList0.add(a0.getLocalPath());
            }
        }
        try {
            String s = file0.getPath();
            String s1 = file1.getPath();
            L.o(s1, "destinationDir.path");
            com.vungle.ads.internal.load.d.e d$e0 = new com.vungle.ads.internal.load.d.e(arrayList0);
            com.vungle.ads.internal.util.w.INSTANCE.unzip(s, s1, d$e0);
            if(!new File(file1.getPath(), "index.html").exists()) {
                new e0(com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_INDEX_URL, "Failed to retrieve indexFileUrl from the Ad").setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
                return false;
            }
        }
        catch(Exception exception0) {
            new X0("Unzip failed: " + exception0.getMessage()).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return false;
        }
        com.vungle.ads.internal.util.h.delete(file0);
        return true;
    }

    private final d1 validateAdMetadata(com.vungle.ads.internal.model.b b0) {
        String s = null;
        com.vungle.ads.internal.model.b.c b$c0 = b0.adUnit();
        if(b$c0 != null && b$c0.getSleep() != null) {
            return this.getErrorInfo(b0);
        }
        if(!L.g(this.adRequest.getPlacement().getReferenceId(), (this.advertisement == null ? null : this.advertisement.placementId()))) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Requests and responses don\'t match ");
            com.vungle.ads.internal.model.b b1 = this.advertisement;
            if(b1 != null) {
                s = b1.placementId();
            }
            stringBuilder0.append(s);
            stringBuilder0.append('.');
            return new com.vungle.ads.k(stringBuilder0.toString());
        }
        d1 d10 = this.getTemplateError(b0);
        if(d10 != null) {
            return d10;
        }
        if(b0.hasExpired()) {
            return new com.vungle.ads.e("The ad markup has expired for playback.");
        }
        String s1 = b0.eventId();
        return s1 != null && s1.length() != 0 ? null : new o0("Event id is invalid.");
    }
}

