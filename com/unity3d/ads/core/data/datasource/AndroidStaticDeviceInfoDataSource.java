package com.unity3d.ads.core.data.datasource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.unity3d.ads.core.data.model.StorageType;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device.MemoryInfoType;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import gatewayprotocol.v1.StaticDeviceInfoKt.Dsl;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;
import kotlin.J;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.f;
import kotlin.text.r;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidStaticDeviceInfoDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStaticDeviceInfoDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidStaticDeviceInfoDataSource\n+ 2 StaticDeviceInfoKt.kt\ngatewayprotocol/v1/StaticDeviceInfoKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StaticDeviceInfoKt.kt\ngatewayprotocol/v1/StaticDeviceInfoKt$Dsl\n+ 5 StaticDeviceInfoKt.kt\ngatewayprotocol/v1/StaticDeviceInfoKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,859:1\n10#2:860\n1329#2:864\n1#3:861\n1#3:865\n1#3:869\n1#3:870\n369#4,2:862\n369#4,2:866\n589#5:868\n731#6,9:871\n37#7,2:880\n*S KotlinDebug\n*F\n+ 1 AndroidStaticDeviceInfoDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidStaticDeviceInfoDataSource\n*L\n70#1:860\n101#1:864\n70#1:861\n101#1:865\n116#1:869\n83#1:862,2\n104#1:866,2\n116#1:868\n308#1:871,9\n309#1:880,2\n*E\n"})
public final class AndroidStaticDeviceInfoDataSource implements StaticDeviceInfoDataSource {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] arr_v = new int[MemoryInfoType.values().length];
            try {
                arr_v[MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[StorageType.values().length];
            try {
                arr_v1[StorageType.INTERNAL.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[StorageType.EXTERNAL.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        }
    }

    @l
    public static final String ALGORITHM_SHA1 = "SHA-1";
    @l
    public static final String APP_VERSION_FAKE = "FakeVersionName";
    @l
    public static final String BINARY_SU = "su";
    @l
    public static final String CERTIFICATE_TYPE_X509 = "X.509";
    @l
    public static final Companion Companion = null;
    @l
    private final X500Principal DEBUG_CERT;
    @l
    public static final String ENVIRONMENT_VARIABLE_PATH = "PATH";
    @l
    public static final String PLATFORM_ANDROID = "android";
    @l
    public static final String STORE_GOOGLE = "google";
    @l
    private final AnalyticsDataSource analyticsDataSource;
    @l
    private final Context context;
    @l
    private final ByteStringDataSource glInfoStore;
    @l
    private StaticDeviceInfo staticDeviceInfo;
    @l
    private final StoreDataSource storeDataSource;

    static {
        AndroidStaticDeviceInfoDataSource.Companion = new Companion(null);
    }

    public AndroidStaticDeviceInfoDataSource(@l Context context0, @l ByteStringDataSource byteStringDataSource0, @l AnalyticsDataSource analyticsDataSource0, @l StoreDataSource storeDataSource0) {
        L.p(context0, "context");
        L.p(byteStringDataSource0, "glInfoStore");
        L.p(analyticsDataSource0, "analyticsDataSource");
        L.p(storeDataSource0, "storeDataSource");
        super();
        this.context = context0;
        this.glInfoStore = byteStringDataSource0;
        this.analyticsDataSource = analyticsDataSource0;
        this.storeDataSource = storeDataSource0;
        this.DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
        Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0 = StaticDeviceInfo.newBuilder();
        L.o(staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0, "newBuilder()");
        Dsl staticDeviceInfoKt$Dsl0 = Dsl.Companion._create(staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0);
        staticDeviceInfoKt$Dsl0.setBundleId(this.getAppName());
        staticDeviceInfoKt$Dsl0.setBundleVersion(this.getAppVersion());
        staticDeviceInfoKt$Dsl0.setAppDebuggable(this.isAppDebuggable());
        staticDeviceInfoKt$Dsl0.setRooted(this.isRooted());
        staticDeviceInfoKt$Dsl0.setOsVersion(this.getOsVersion());
        staticDeviceInfoKt$Dsl0.setDeviceMake(this.getManufacturer());
        staticDeviceInfoKt$Dsl0.setDeviceModel(this.getModel());
        staticDeviceInfoKt$Dsl0.setWebviewUa("");
        staticDeviceInfoKt$Dsl0.setScreenDensity(this.getScreenDensity());
        staticDeviceInfoKt$Dsl0.setScreenWidth(this.getScreenWidth());
        staticDeviceInfoKt$Dsl0.setScreenHeight(this.getScreenHeight());
        staticDeviceInfoKt$Dsl0.setScreenSize(this.getScreenLayout());
        staticDeviceInfoKt$Dsl0.addAllStores(staticDeviceInfoKt$Dsl0.getStores(), AndroidStaticDeviceInfoDataSource.getStores$default(this, null, 1, null));
        staticDeviceInfoKt$Dsl0.setTotalDiskSpace(this.getTotalSpace(this.getFileForStorageType(StorageType.EXTERNAL)));
        staticDeviceInfoKt$Dsl0.setTotalRamMemory(this.getTotalMemory());
        staticDeviceInfoKt$Dsl0.setCpuModel(this.getCPUModel());
        staticDeviceInfoKt$Dsl0.setCpuCount(8L);
        staticDeviceInfoKt$Dsl0.setAndroid(this.fetchAndroidStaticDeviceInfo());
        staticDeviceInfoKt$Dsl0.setMadeWithUnity(MadeWithUnityDetector.isMadeWithUnity());
        this.staticDeviceInfo = staticDeviceInfoKt$Dsl0._build();
    }

    @Override  // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @m
    public Object fetch(@l List list0, @l d d0) {
        AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource0;
        com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.fetch.1 androidStaticDeviceInfoDataSource$fetch$10;
        if(d0 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.fetch.1) {
            androidStaticDeviceInfoDataSource$fetch$10 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.fetch.1)d0;
            int v = androidStaticDeviceInfoDataSource$fetch$10.label;
            if((v & 0x80000000) == 0) {
                androidStaticDeviceInfoDataSource$fetch$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.fetch(null, this);
                    }
                };
            }
            else {
                androidStaticDeviceInfoDataSource$fetch$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidStaticDeviceInfoDataSource$fetch$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.fetch(null, this);
                }
            };
        }
        Object object0 = androidStaticDeviceInfoDataSource$fetch$10.result;
        Object object1 = b.l();
        switch(androidStaticDeviceInfoDataSource$fetch$10.label) {
            case 0: {
                f0.n(object0);
                String s = this.staticDeviceInfo.getGpuModel();
                if(s != null && s.length() != 0) {
                    return this.staticDeviceInfo;
                }
                androidStaticDeviceInfoDataSource$fetch$10.L$0 = this;
                androidStaticDeviceInfoDataSource$fetch$10.L$1 = list0;
                androidStaticDeviceInfoDataSource$fetch$10.label = 1;
                object0 = this.getGPUModel(androidStaticDeviceInfoDataSource$fetch$10);
                if(object0 == object1) {
                    return object1;
                }
                androidStaticDeviceInfoDataSource0 = this;
                break;
            }
            case 1: {
                list0 = (List)androidStaticDeviceInfoDataSource$fetch$10.L$1;
                androidStaticDeviceInfoDataSource0 = (AndroidStaticDeviceInfoDataSource)androidStaticDeviceInfoDataSource$fetch$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((String)object0) != null && ((String)object0).length() != 0) {
            com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = androidStaticDeviceInfoDataSource0.staticDeviceInfo.toBuilder();
            L.o(generatedMessageLite$Builder0, "this.toBuilder()");
            Dsl staticDeviceInfoKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
            staticDeviceInfoKt$Dsl0.setGpuModel(((String)object0));
            staticDeviceInfoKt$Dsl0.clearStores(staticDeviceInfoKt$Dsl0.getStores());
            staticDeviceInfoKt$Dsl0.addAllStores(staticDeviceInfoKt$Dsl0.getStores(), androidStaticDeviceInfoDataSource0.getStores(list0));
            StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0 = staticDeviceInfoKt$Dsl0._build();
            androidStaticDeviceInfoDataSource0.staticDeviceInfo = staticDeviceInfoOuterClass$StaticDeviceInfo0;
            return staticDeviceInfoOuterClass$StaticDeviceInfo0;
        }
        return androidStaticDeviceInfoDataSource0.staticDeviceInfo;
    }

    private final Android fetchAndroidStaticDeviceInfo() {
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder0 = Android.newBuilder();
        L.o(staticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder0, "newBuilder()");
        gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl staticDeviceInfoKt$AndroidKt$Dsl0 = gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl.Companion._create(staticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder0);
        staticDeviceInfoKt$AndroidKt$Dsl0.setApiLevel(33);
        staticDeviceInfoKt$AndroidKt$Dsl0.setVersionCode(41401);
        staticDeviceInfoKt$AndroidKt$Dsl0.setAndroidFingerprint("google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys");
        staticDeviceInfoKt$AndroidKt$Dsl0.setAppInstaller(this.getInstallerPackageName());
        staticDeviceInfoKt$AndroidKt$Dsl0.setApkDeveloperSigningCertificateHash(this.getCertificateFingerprint());
        staticDeviceInfoKt$AndroidKt$Dsl0.setBuildBoard(this.getBoard());
        staticDeviceInfoKt$AndroidKt$Dsl0.setBuildBrand(this.getBrand());
        staticDeviceInfoKt$AndroidKt$Dsl0.setBuildDevice(this.getDevice());
        staticDeviceInfoKt$AndroidKt$Dsl0.setBuildDisplay(this.getDisplay());
        staticDeviceInfoKt$AndroidKt$Dsl0.setBuildFingerprint("google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys");
        staticDeviceInfoKt$AndroidKt$Dsl0.setBuildHardware(this.getHardware());
        staticDeviceInfoKt$AndroidKt$Dsl0.setBuildHost(this.getHost());
        staticDeviceInfoKt$AndroidKt$Dsl0.setBuildBootloader(this.getBootloader());
        staticDeviceInfoKt$AndroidKt$Dsl0.setBuildProduct(this.getProduct());
        staticDeviceInfoKt$AndroidKt$Dsl0.setExtensionVersion(this.getExtensionVersion());
        String s = this.getBuildId();
        if(s != null) {
            staticDeviceInfoKt$AndroidKt$Dsl0.setBuildId(s);
        }
        staticDeviceInfoKt$AndroidKt$Dsl0.setPhoneType(this.getPhoneType());
        staticDeviceInfoKt$AndroidKt$Dsl0.setSimOperator(this.getSimOperator());
        return staticDeviceInfoKt$AndroidKt$Dsl0._build();
    }

    @Override  // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @l
    public StaticDeviceInfo fetchCached() {
        return this.staticDeviceInfo;
    }

    @l
    public final String getAdvertisingTrackingId() {
        AdvertisingId.getAdvertisingTrackingId();
        return "";
    }

    @Override  // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @m
    public String getAnalyticsUserId() {
        return this.analyticsDataSource.getUserId();
    }

    private final int getApiLevel() [...] // 潜在的解密器

    @Override  // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @l
    public String getAppName() {
        L.o("com.dcinside.app.android", "context.packageName");
        return "com.dcinside.app.android";
    }

    // 去混淆评级： 低(20)
    private final long getAppStartTime() {
        return 0L;
    }

    private final String getAppVersion() {
        PackageManager packageManager0 = this.context.getPackageManager();
        try {
            String s = packageManager0.getPackageInfo("com.dcinside.app.android", 0).versionName == null ? "FakeVersionName" : packageManager0.getPackageInfo("com.dcinside.app.android", 0).versionName;
            L.o(s, "{\n            if (pm.get…e\n            }\n        }");
            return s;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
        }
        DeviceLog.exception("Error getting package info", packageManager$NameNotFoundException0);
        return "";
    }

    @Override  // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @m
    public Object getAuid(@l d d0) {
        String s = AndroidPreferences.getString("supersonic_shared_preferen", "auid");
        return s == null ? null : s;
    }

    @l
    public final String getBoard() {
        return Build.BOARD == null ? "" : Build.BOARD;
    }

    @l
    public final String getBootloader() {
        return Build.BOOTLOADER == null ? "" : Build.BOOTLOADER;
    }

    @l
    public final String getBrand() {
        return Build.BRAND == null ? "" : Build.BRAND;
    }

    @m
    public final String getBuildId() {
        return Build.ID;
    }

    @m
    public final String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    private final long getCPUCount() [...] // 潜在的解密器

    private final String getCPUModel() {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            String s = Build.SOC_MODEL;
            L.o(s, "{\n            Build.SOC_MODEL\n        }");
            return s;
        }
        try {
            return (String)u.p3(kotlin.io.m.z(new File("/proc/cpuinfo"), null, 1, null));
        }
        catch(FileNotFoundException fileNotFoundException0) {
            DeviceLog.exception("Error reading CPU model", fileNotFoundException0);
            return "";
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    @k(message = "This constant was deprecated in API level 28. Use GET_SIGNING_CERTIFICATES instead")
    private final String getCertificateFingerprint() {
        PackageManager packageManager0 = this.context.getPackageManager();
        try {
            Signature[] arr_signature = packageManager0.getPackageInfo("com.dcinside.app.android", 0x40).signatures;
            if(arr_signature != null && arr_signature.length != 0) {
                Certificate certificate0 = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(arr_signature[0].toByteArray()));
                L.n(certificate0, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                String s = Utilities.toHexString(MessageDigest.getInstance("SHA-1").digest(((X509Certificate)certificate0).getEncoded()));
                L.o(s, "toHexString(publicKey)");
                return s;
            }
        }
        catch(Exception exception0) {
            DeviceLog.exception("Exception when signing certificate fingerprint", exception0);
        }
        return "";
    }

    @l
    public final Context getContext() {
        return this.context;
    }

    @l
    public final String getDevice() {
        return Build.DEVICE == null ? "" : Build.DEVICE;
    }

    @l
    public final String getDisplay() {
        return Build.DISPLAY == null ? "" : Build.DISPLAY;
    }

    private final float getDisplayMetricDensity() {
        Resources resources0 = this.context.getResources();
        if(resources0 != null) {
            DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
            return displayMetrics0 == null ? 0.0f : displayMetrics0.density;
        }
        return 0.0f;
    }

    private final int getExtensionVersion() {
        return Build.VERSION.SDK_INT < 30 ? -1 : SdkExtensions.getExtensionVersion(30);
    }

    private final File getFileForStorageType(StorageType storageType0) {
        switch(storageType0) {
            case 1: {
                return this.context.getCacheDir();
            }
            case 2: {
                return this.context.getExternalCacheDir();
            }
            default: {
                DeviceLog.error(("Unhandled storagetype: " + storageType0));
                return null;
            }
        }
    }

    // 去混淆评级： 中等(60)
    private final String getFingerprint() [...] // 潜在的解密器

    private final Object getGPUModel(d d0) {
        com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.getGPUModel.1 androidStaticDeviceInfoDataSource$getGPUModel$10;
        if(d0 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.getGPUModel.1) {
            androidStaticDeviceInfoDataSource$getGPUModel$10 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.getGPUModel.1)d0;
            int v = androidStaticDeviceInfoDataSource$getGPUModel$10.label;
            if((v & 0x80000000) == 0) {
                androidStaticDeviceInfoDataSource$getGPUModel$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.getGPUModel(this);
                    }
                };
            }
            else {
                androidStaticDeviceInfoDataSource$getGPUModel$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidStaticDeviceInfoDataSource$getGPUModel$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.getGPUModel(this);
                }
            };
        }
        Object object0 = androidStaticDeviceInfoDataSource$getGPUModel$10.result;
        Object object1 = b.l();
        switch(androidStaticDeviceInfoDataSource$getGPUModel$10.label) {
            case 0: {
                f0.n(object0);
                androidStaticDeviceInfoDataSource$getGPUModel$10.label = 1;
                object0 = this.glInfoStore.get(androidStaticDeviceInfoDataSource$getGPUModel$10);
                return object0 == object1 ? object1 : ((ByteStringStore)object0).getData().toString(f.b);
            }
            case 1: {
                f0.n(object0);
                return ((ByteStringStore)object0).getData().toString(f.b);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    // 去混淆评级： 低(30)
    private final String getGameId() {
        return "";
    }

    @l
    public final String getHardware() {
        return Build.HARDWARE == null ? "" : Build.HARDWARE;
    }

    @l
    public final String getHost() {
        return Build.HOST == null ? "" : Build.HOST;
    }

    @Override  // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @m
    public Object getIdfi(@l d d0) {
        String s = AndroidPreferences.getString("unityads-installinfo", "unityads-idfi");
        if(s == null) {
            s = null;
        }
        if(s == null) {
            s = "2bda811b-9a23-45b5-b40b-b9933e7c06fb";
            AndroidPreferences.setString("unityads-installinfo", "unityads-idfi", "2bda811b-9a23-45b5-b40b-b9933e7c06fb");
        }
        return s;
    }

    @k(message = "This method was deprecated in API level 30. use getInstallSourceInfo")
    private final String getInstallerPackageName() {
        String s = this.context.getPackageManager().getInstallerPackageName("com.dcinside.app.android");
        return s == null ? "" : s;
    }

    @Override  // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @l
    public String getManufacturer() {
        return Build.MANUFACTURER == null ? "" : Build.MANUFACTURER;
    }

    private final long getMemoryInfo(MemoryInfoType device$MemoryInfoType0) {
        FileNotFoundException fileNotFoundException1;
        int v;
        RandomAccessFile randomAccessFile0;
        String s;
        switch(device$MemoryInfoType0) {
            case 1: 
            case 2: {
                try {
                    s = null;
                    randomAccessFile0 = new RandomAccessFile("/proc/meminfo", "r");
                    v = 0;
                }
                catch(FileNotFoundException fileNotFoundException0) {
                    fileNotFoundException1 = fileNotFoundException0;
                    DeviceLog.exception("Error reading memory info", fileNotFoundException1);
                    return this.getMemoryValueFromString(s);
                }
                while(true) {
                    if(v >= 1) {
                        goto label_18;
                    }
                    try {
                        s = randomAccessFile0.readLine();
                        ++v;
                        continue;
                    }
                    catch(Throwable throwable0) {
                    }
                    try {
                        throw throwable0;
                    }
                    catch(Throwable throwable1) {
                        try {
                            c.a(randomAccessFile0, throwable0);
                            throw throwable1;
                        label_18:
                            c.a(randomAccessFile0, null);
                            return this.getMemoryValueFromString(s);
                        }
                        catch(FileNotFoundException fileNotFoundException1) {
                            break;
                        }
                    }
                }
                DeviceLog.exception("Error reading memory info", fileNotFoundException1);
                return this.getMemoryValueFromString(s);
            }
            default: {
                throw new J();
            }
        }
    }

    private final long getMemoryValueFromString(String s) {
        if(s != null) {
            Matcher matcher0 = Pattern.compile("(\\d+)").matcher(s);
            String s1;
            for(s1 = null; matcher0.find(); s1 = matcher0.group(1)) {
            }
            return s1 == null ? -1L : Long.parseLong(s1);
        }
        return 0L;
    }

    @Override  // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @l
    public String getModel() {
        return Build.MODEL == null ? "" : Build.MODEL;
    }

    @TargetApi(21)
    private final ArrayList getNewAbiList() {
        ArrayList arrayList0 = new ArrayList();
        String[] arr_s = Build.SUPPORTED_ABIS;
        L.o(arr_s, "SUPPORTED_ABIS");
        arrayList0.addAll(u.O(Arrays.copyOf(arr_s, arr_s.length)));
        return arrayList0;
    }

    // 去混淆评级： 低(20)
    private final List getOldAbiList() {
        List list0 = new ArrayList();
        L.o("arm64-v8a", "CPU_ABI");
        list0.add("arm64-v8a");
        L.o("arm64-v8a", "CPU_ABI2");
        list0.add("arm64-v8a");
        return list0;
    }

    private final String getOpenAdvertisingTrackingId() {
        OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return "";
    }

    @Override  // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @l
    public String getOsVersion() {
        return Build.VERSION.RELEASE == null ? "" : Build.VERSION.RELEASE;
    }

    private final int getPhoneType() {
        Object object0 = this.context.getSystemService("phone");
        L.n(object0, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((TelephonyManager)object0).getPhoneType();
    }

    private final String getPlatform() {
        return "android";
    }

    @l
    public final String getProduct() {
        return Build.PRODUCT == null ? "" : Build.PRODUCT;
    }

    private final int getScreenDensity() {
        Resources resources0 = this.context.getResources();
        if(resources0 != null) {
            DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
            return displayMetrics0 == null ? -1 : displayMetrics0.densityDpi;
        }
        return -1;
    }

    private final int getScreenHeight() {
        Resources resources0 = this.context.getResources();
        if(resources0 != null) {
            DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
            return displayMetrics0 == null ? -1 : displayMetrics0.heightPixels;
        }
        return -1;
    }

    private final int getScreenLayout() {
        return this.context.getResources().getConfiguration().screenLayout;
    }

    private final int getScreenWidth() {
        Resources resources0 = this.context.getResources();
        if(resources0 != null) {
            DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
            return displayMetrics0 == null ? -1 : displayMetrics0.widthPixels;
        }
        return -1;
    }

    @l
    public final List getSensorList() {
        Object object0 = this.context.getSystemService("sensor");
        L.n(object0, "null cannot be cast to non-null type android.hardware.SensorManager");
        List list0 = ((SensorManager)object0).getSensorList(-1);
        L.o(list0, "sensorManager.getSensorList(Sensor.TYPE_ALL)");
        return list0;
    }

    private final String getSimOperator() {
        Object object0 = this.context.getSystemService("phone");
        L.n(object0, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String s = ((TelephonyManager)object0).getSimOperator();
        L.o(s, "telephonyManager.simOperator");
        return s;
    }

    private final List getStores(List list0) {
        return this.storeDataSource.fetchStores(list0);
    }

    static List getStores$default(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = u.H();
        }
        return androidStaticDeviceInfoDataSource0.getStores(list0);
    }

    // 去混淆评级： 低(20)
    @l
    public final List getSupportedAbis() {
        return this.getNewAbiList();
    }

    @Override  // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public long getSystemBootTime() {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000L;
    }

    public final long getTotalMemory() {
        return this.getMemoryInfo(MemoryInfoType.TOTAL_MEMORY);
    }

    public final long getTotalSpace(@m File file0) {
        return file0 == null || !file0.exists() ? -1L : ((long)kotlin.math.b.L0(file0.getTotalSpace() / 0x400L));
    }

    private final int getVersionCode() [...] // Inlined contents

    private final String getVersionName() {
        return "4.14.1";
    }

    private final String getWebViewUserAgent() [...] // 潜在的解密器

    public final boolean hasX264Decoder() {
        return !this.selectAllDecodeCodecs("video/avc").isEmpty();
    }

    public final boolean hasX265Decoder() {
        return !this.selectAllDecodeCodecs("video/hevc").isEmpty();
    }

    private final boolean isAppDebuggable() {
        boolean z1;
        int v1;
        PackageManager packageManager0 = this.context.getPackageManager();
        L.o(packageManager0, "context.packageManager");
        L.o("com.dcinside.app.android", "context.packageName");
        boolean z = true;
        int v = 0;
        try {
            ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.dcinside.app.android", 0);
            L.o(applicationInfo0, "pm.getApplicationInfo(pkgName, 0)");
            v1 = applicationInfo0.flags & 2;
            applicationInfo0.flags = v1;
            z = false;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            DeviceLog.exception("Could not find name", packageManager$NameNotFoundException0);
            z1 = false;
            goto label_16;
        }
        z1 = v1 != 0;
    label_16:
        if(z) {
            try {
                Signature[] arr_signature = packageManager0.getPackageInfo("com.dcinside.app.android", 0x40).signatures;
                L.o(arr_signature, "signatures");
                while(true) {
                label_19:
                    if(v >= arr_signature.length) {
                        return z1;
                    }
                    Signature signature0 = arr_signature[v];
                    Certificate certificate0 = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature0.toByteArray()));
                    L.n(certificate0, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    z1 = L.g(((X509Certificate)certificate0).getSubjectX500Principal(), this.DEBUG_CERT);
                    break;
                }
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException1) {
                DeviceLog.exception("Could not find name", packageManager$NameNotFoundException1);
                return z1;
            }
            catch(CertificateException certificateException0) {
                DeviceLog.exception("Certificate exception", certificateException0);
                return z1;
            }
            if(z1) {
                return z1;
            }
            ++v;
            goto label_19;
        }
        return z1;
    }

    // 去混淆评级： 低(30)
    private final boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo0, String s) {
        return this.isHardwareAcceleratedV29(mediaCodecInfo0);
    }

    @TargetApi(29)
    private final boolean isHardwareAcceleratedV29(MediaCodecInfo mediaCodecInfo0) {
        return mediaCodecInfo0.isHardwareAccelerated();
    }

    public final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    private final boolean isRooted() {
        try {
            return this.searchPathForBinary("su");
        }
        catch(Exception exception0) {
            DeviceLog.exception("Rooted check failed", exception0);
            return false;
        }
    }

    // 去混淆评级： 中等(120)
    private final boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo0, String s) {
        return this.isSoftwareOnlyV29(mediaCodecInfo0);
    }

    @TargetApi(29)
    private final boolean isSoftwareOnlyV29(MediaCodecInfo mediaCodecInfo0) {
        return mediaCodecInfo0.isSoftwareOnly();
    }

    // 去混淆评级： 低(20)
    private final boolean isTestMode() {
        return false;
    }

    private final boolean searchPathForBinary(String s) {
        List list1;
        List list0 = new r(":").p("/product/bin:/apex/com.android.runtime/bin:/apex/com.android.art/bin:/system_ext/bin:/system/bin:/system/xbin:/odm/bin:/vendor/bin:/vendor/xbin", 0);
        if(list0 != null) {
            if(!list0.isEmpty()) {
                ListIterator listIterator0 = list0.listIterator(list0.size());
                while(listIterator0.hasPrevious()) {
                    if(((String)listIterator0.previous()).length() == 0) {
                        continue;
                    }
                    list1 = u.J5(list0, listIterator0.nextIndex() + 1);
                    goto label_9;
                }
            }
            list1 = u.H();
        label_9:
            if(list1 != null) {
                String[] arr_s = (String[])list1.toArray(new String[0]);
                if(arr_s != null) {
                    for(int v = 0; v < arr_s.length; ++v) {
                        File file0 = new File(arr_s[v]);
                        if(file0.exists() && file0.isDirectory()) {
                            File[] arr_file = file0.listFiles();
                            if(arr_file != null) {
                                int v1 = arr_file.length;
                                for(int v2 = 0; v2 < v1; ++v2) {
                                    if(L.g(arr_file[v2].getName(), s)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final List selectAllDecodeCodecs(String s) {
        List list0 = new ArrayList();
        int v = MediaCodecList.getCodecCount();
        for(int v1 = 0; v1 < v; ++v1) {
            MediaCodecInfo mediaCodecInfo0 = MediaCodecList.getCodecInfoAt(v1);
            if(!mediaCodecInfo0.isEncoder()) {
                String[] arr_s = mediaCodecInfo0.getSupportedTypes();
                for(int v2 = 0; v2 < arr_s.length; ++v2) {
                    if(v.O1(arr_s[v2], s, true)) {
                        L.o(mediaCodecInfo0, "codecInfo");
                        if(this.isHardwareAccelerated(mediaCodecInfo0, s)) {
                            list0.add(mediaCodecInfo0);
                        }
                    }
                }
            }
        }
        return list0;
    }
}

