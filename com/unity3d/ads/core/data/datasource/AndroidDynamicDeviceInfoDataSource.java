package com.unity3d.ads.core.data.datasource;

import A3.a;
import A3.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.LocaleList;
import android.os.SystemClock;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device.MemoryInfoType;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.S0;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.f;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidDynamicDeviceInfoDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDynamicDeviceInfoDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidDynamicDeviceInfoDataSource\n+ 2 DynamicDeviceInfoKt.kt\ngatewayprotocol/v1/DynamicDeviceInfoKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DynamicDeviceInfoKt.kt\ngatewayprotocol/v1/DynamicDeviceInfoKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,749:1\n10#2:750\n1#3:751\n1#3:753\n1#3:759\n766#4:752\n230#5,5:754\n11335#6:760\n11670#6,3:761\n*S KotlinDebug\n*F\n+ 1 AndroidDynamicDeviceInfoDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidDynamicDeviceInfoDataSource\n*L\n55#1:750\n55#1:751\n75#1:753\n75#1:752\n161#1:754,5\n673#1:760\n673#1:761,3\n*E\n"})
public final class AndroidDynamicDeviceInfoDataSource implements DynamicDeviceInfoDataSource {
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
            int[] arr_v1 = new int[ConnectionType.values().length];
            try {
                arr_v1[ConnectionType.CONNECTION_TYPE_WIFI.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[ConnectionType.CONNECTION_TYPE_CELLULAR.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[ConnectionType.CONNECTION_TYPE_UNSPECIFIED.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String DIRECTORY_MEM_INFO = "/proc/meminfo";
    @l
    public static final String DIRECTORY_MODE_READ = "r";
    @l
    public static final String DIRECTORY_PROCESS_INFO = "/proc/self/stat";
    @l
    public static final String INTENT_USB_STATE = "android.hardware.usb.action.USB_STATE";
    @l
    public static final String KEY_STAT_CONTENT = "stat";
    @l
    public static final String USB_EXTRA_CONNECTED = "connected";
    @l
    private final Context context;
    @l
    private final LifecycleDataSource lifecycleDataSource;
    @l
    private final E reportedWarning;
    @l
    private final i volumeSettingsChange;

    static {
        AndroidDynamicDeviceInfoDataSource.Companion = new Companion(null);
    }

    public AndroidDynamicDeviceInfoDataSource(@l Context context0, @l LifecycleDataSource lifecycleDataSource0) {
        L.p(context0, "context");
        L.p(lifecycleDataSource0, "lifecycleDataSource");
        super();
        this.context = context0;
        this.lifecycleDataSource = lifecycleDataSource0;
        this.reportedWarning = W.a(Y.z());
        this.volumeSettingsChange = k.s(new o(null) {
            private Object L$0;
            int label;

            {
                AndroidDynamicDeviceInfoDataSource.this = androidDynamicDeviceInfoDataSource0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.volumeSettingsChange.1(AndroidDynamicDeviceInfoDataSource.this, d0);
                d1.L$0 = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.volumeSettingsChange.1)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.L$0;
                        kotlin.jvm.internal.l0.d l0$d0 = new kotlin.jvm.internal.l0.d();
                        double f = AndroidDynamicDeviceInfoDataSource.this.getStreamVolume(3);
                        l0$d0.a = f;
                        r.m0(d0, new VolumeChange(f));
                        f l0$f0 = new f();
                        int v = AndroidDynamicDeviceInfoDataSource.this.getRingerMode();
                        l0$f0.a = v;
                        r.m0(d0, new MuteChange(v == 0));
                        com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.volumeSettingsChange.1.contentObserver.1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$10 = new ContentObserver(l0$d0, d0, l0$f0) {
                            final D $$this$callbackFlow;
                            final f $currentRingerMode;
                            final kotlin.jvm.internal.l0.d $currentVolume;

                            {
                                AndroidDynamicDeviceInfoDataSource.this = androidDynamicDeviceInfoDataSource0;
                                this.$currentVolume = l0$d0;
                                this.$$this$callbackFlow = d0;
                                this.$currentRingerMode = l0$f0;
                                super(null);
                            }

                            @Override  // android.database.ContentObserver
                            public void onChange(boolean z) {
                                super.onChange(z);
                                double f = AndroidDynamicDeviceInfoDataSource.this.getStreamVolume(3);
                                kotlin.jvm.internal.l0.d l0$d0 = this.$currentVolume;
                                if(f != l0$d0.a) {
                                    l0$d0.a = f;
                                    VolumeChange volumeSettingsChange$VolumeChange0 = new VolumeChange(f);
                                    r.m0(this.$$this$callbackFlow, volumeSettingsChange$VolumeChange0);
                                }
                                int v = AndroidDynamicDeviceInfoDataSource.this.getRingerMode();
                                f l0$f0 = this.$currentRingerMode;
                                if(v != l0$f0.a) {
                                    l0$f0.a = v;
                                    r.m0(this.$$this$callbackFlow, new MuteChange(v == 0));
                                }
                            }
                        };
                        AndroidDynamicDeviceInfoDataSource.this.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$10);
                        com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.volumeSettingsChange.1.1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$10 = new a(androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$10) {
                            final com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.volumeSettingsChange.1.contentObserver.1 $contentObserver;

                            {
                                AndroidDynamicDeviceInfoDataSource.this = androidDynamicDeviceInfoDataSource0;
                                this.$contentObserver = androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$10;
                                super(0);
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                this.invoke();
                                return S0.a;
                            }

                            public final void invoke() {
                                AndroidDynamicDeviceInfoDataSource.this.getContext().getContentResolver().unregisterContentObserver(this.$contentObserver);
                            }
                        };
                        this.label = 1;
                        return B.a(d0, androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$10, this) == object1 ? object1 : S0.a;
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
    }

    private final boolean adbStatus() {
        try {
            Boolean boolean0 = Boolean.valueOf(1 == Settings.Global.getInt(this.context.getContentResolver(), "adb_enabled", 0));
            return boolean0 == null ? false : boolean0.booleanValue();
        }
        catch(Exception exception0) {
            DeviceLog.exception("Problems fetching adb enabled status", exception0);
            throw new NullPointerException();
        }
    }

    @Override  // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    @l
    public DynamicDeviceInfo fetch() {
        Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0 = DynamicDeviceInfo.newBuilder();
        L.o(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0, "newBuilder()");
        Dsl dynamicDeviceInfoKt$Dsl0 = Dsl.Companion._create(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0);
        dynamicDeviceInfoKt$Dsl0.setLanguage(this.getLanguage());
        dynamicDeviceInfoKt$Dsl0.setNetworkOperator(this.getNetworkOperator());
        dynamicDeviceInfoKt$Dsl0.setNetworkOperatorName(this.getNetworkOperatorName());
        dynamicDeviceInfoKt$Dsl0.setFreeDiskSpace(this.getUsableSpace(this.context.getExternalFilesDir(null)));
        dynamicDeviceInfoKt$Dsl0.setFreeRamMemory(this.getFreeMemory());
        dynamicDeviceInfoKt$Dsl0.setWiredHeadset(this.isWiredHeadsetOn());
        dynamicDeviceInfoKt$Dsl0.setTimeZone("CST");
        dynamicDeviceInfoKt$Dsl0.setTimeZoneOffset(this.getTimeZoneOffset());
        dynamicDeviceInfoKt$Dsl0.setLimitedTracking(this.isLimitAdTrackingEnabled());
        dynamicDeviceInfoKt$Dsl0.setLimitedOpenAdTracking(this.isLimitOpenAdTrackingEnabled());
        dynamicDeviceInfoKt$Dsl0.setBatteryLevel(this.getBatteryLevel());
        dynamicDeviceInfoKt$Dsl0.setBatteryStatus(this.getBatteryStatus());
        dynamicDeviceInfoKt$Dsl0.setConnectionType(this.getConnectionType());
        dynamicDeviceInfoKt$Dsl0.setAndroid(this.fetchAndroidDynamicDeviceInfo());
        dynamicDeviceInfoKt$Dsl0.setAppActive(this.isAppActive());
        dynamicDeviceInfoKt$Dsl0.setScreenWidth(this.getScreenWidth());
        dynamicDeviceInfoKt$Dsl0.setScreenHeight(this.getScreenHeight());
        return dynamicDeviceInfoKt$Dsl0._build();
    }

    private final Android fetchAndroidDynamicDeviceInfo() {
        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder0 = Android.newBuilder();
        L.o(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder0, "newBuilder()");
        gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl dynamicDeviceInfoKt$AndroidKt$Dsl0 = gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion._create(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder0);
        dynamicDeviceInfoKt$AndroidKt$Dsl0.setNetworkConnected(this.isActiveNetworkConnected());
        dynamicDeviceInfoKt$AndroidKt$Dsl0.setNetworkType(this.getNetworkType());
        dynamicDeviceInfoKt$AndroidKt$Dsl0.setNetworkMetered(this.getNetworkMetered());
        dynamicDeviceInfoKt$AndroidKt$Dsl0.setTelephonyManagerNetworkType(this.getNetworkType());
        dynamicDeviceInfoKt$AndroidKt$Dsl0.setAdbEnabled(this.isAdbEnabled());
        dynamicDeviceInfoKt$AndroidKt$Dsl0.setUsbConnected(this.isUSBConnected());
        dynamicDeviceInfoKt$AndroidKt$Dsl0.setVolume(this.getStreamVolume(3));
        dynamicDeviceInfoKt$AndroidKt$Dsl0.setMaxVolume(this.getStreamMaxVolume(3));
        dynamicDeviceInfoKt$AndroidKt$Dsl0.setDeviceElapsedRealtime(this.getElapsedRealtime());
        dynamicDeviceInfoKt$AndroidKt$Dsl0.setDeviceUpTime(this.getUptime());
        dynamicDeviceInfoKt$AndroidKt$Dsl0.setAirplaneMode(this.getAirplaneMode());
        dynamicDeviceInfoKt$AndroidKt$Dsl0.setChargingType(this.getChargingType());
        dynamicDeviceInfoKt$AndroidKt$Dsl0.setStayOnWhilePluggedIn(this.getStayOnWhilePluggedIn());
        dynamicDeviceInfoKt$AndroidKt$Dsl0.setSdCardPresent(this.getIsSdCardPresent());
        dynamicDeviceInfoKt$AndroidKt$Dsl0.setNetworkCapabilityTransports(this.getNetworkCapabilityTransports());
        return dynamicDeviceInfoKt$AndroidKt$Dsl0._build();
    }

    private final boolean getAirplaneMode() {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), "airplane_mode_on", 0) == 0 ? false : true;
        }
        catch(Throwable throwable0) {
            DeviceLog.error("Problems fetching airplane mode status", new Object[]{throwable0.getMessage()});
            return false;
        }
    }

    private final AudioManager getAudioManager() {
        Object object0 = this.context.getSystemService("audio");
        return object0 instanceof AudioManager ? ((AudioManager)object0) : null;
    }

    private final double getBatteryLevel() {
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intent0 = this.context.registerReceiver(null, intentFilter0);
        return intent0 == null ? -1.0 : ((double)intent0.getIntExtra("level", 0)) / ((double)intent0.getIntExtra("scale", 0));
    }

    private final int getBatteryStatus() {
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intent0 = this.context.registerReceiver(null, intentFilter0);
        return intent0 == null ? -1 : intent0.getIntExtra("status", 0);
    }

    public final int getChargingType() {
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intent0 = this.context.registerReceiver(null, intentFilter0);
        return intent0 == null ? -1 : intent0.getIntExtra("plugged", -1);
    }

    private final ConnectionType getConnectionType() {
        if(this.isUsingWifi()) {
            return ConnectionType.CONNECTION_TYPE_WIFI;
        }
        return this.isActiveNetworkConnected() ? ConnectionType.CONNECTION_TYPE_CELLULAR : ConnectionType.CONNECTION_TYPE_UNSPECIFIED;
    }

    @Override  // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    @l
    public String getConnectionTypeStr() {
        switch(WhenMappings.$EnumSwitchMapping$1[this.getConnectionType().ordinal()]) {
            case 1: {
                return "wifi";
            }
            case 2: {
                return "cellular";
            }
            default: {
                return "none";
            }
        }
    }

    private final ConnectivityManager getConnectivityManager() {
        Object object0 = this.context.getSystemService("connectivity");
        return object0 instanceof ConnectivityManager ? ((ConnectivityManager)object0) : null;
    }

    @l
    public final Context getContext() {
        return this.context;
    }

    @Override  // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getCurrentUiTheme() {
        return this.context.getResources().getConfiguration().uiMode;
    }

    private final long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    private final long getEventTimeStamp() {
        return System.currentTimeMillis() / 1000L;
    }

    public final long getFreeMemory() {
        return this.getMemoryInfo(MemoryInfoType.FREE_MEMORY);
    }

    @kotlin.k(message = "Legacy method, migrated from to .getUsableSpace()")
    private final long getFreeSpace(File file0) {
        return file0 == null || !file0.exists() ? -1L : ((long)kotlin.math.b.L0(file0.getFreeSpace() / 0x400L));
    }

    public final boolean getIsSdCardPresent() {
        return L.g(Environment.getExternalStorageState(), "mounted");
    }

    private final String getLanguage() {
        String s = Locale.getDefault().toString();
        L.o(s, "getDefault().toString()");
        return s;
    }

    @Override  // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    @l
    public List getLocaleList() {
        List list0;
        int v = 0;
        if(Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList0 = this.context.getResources().getConfiguration().getLocales();
            L.o(localeList0, "context.resources.configuration.locales");
            int v1 = localeList0.size();
            list0 = new ArrayList(v1);
            while(v < v1) {
                String s = localeList0.get(v).toString();
                L.o(s, "locales[it].toString()");
                ((ArrayList)list0).add(s);
                ++v;
            }
            return list0;
        }
        Locale[] arr_locale = Locale.getAvailableLocales();
        L.o(arr_locale, "getAvailableLocales()");
        list0 = new ArrayList(arr_locale.length);
        while(v < arr_locale.length) {
            list0.add(arr_locale[v].toString());
            ++v;
        }
        return list0;
    }

    private final long getMemoryInfo(MemoryInfoType device$MemoryInfoType0) {
        int v = 1;
        switch(device$MemoryInfoType0) {
            case 1: 
            case 2: {
                break;
            }
            default: {
                v = -1;
            }
        }
        RandomAccessFile randomAccessFile0 = new RandomAccessFile("/proc/meminfo", "r");
        int v1 = 0;
        String s = null;
        while(v1 < v) {
            try {
                s = randomAccessFile0.readLine();
                ++v1;
                continue;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                c.a(randomAccessFile0, throwable0);
                throw throwable1;
            }
        }
        c.a(randomAccessFile0, null);
        return this.getMemoryValueFromString(s);
    }

    private final long getMemoryValueFromString(String s) {
        if(s != null) {
            Matcher matcher0 = Pattern.compile("(\\d+)").matcher(s);
            String s1;
            for(s1 = null; matcher0.find(); s1 = matcher0.group(1)) {
            }
            return s1 == null ? -1L : Long.parseLong(s1);
        }
        return -1L;
    }

    @l
    public final NetworkCapabilityTransports getNetworkCapabilityTransports() {
        gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0 = NetworkCapabilityTransports.newBuilder();
        if(Build.VERSION.SDK_INT < 0x1F) {
            GeneratedMessageLite generatedMessageLite0 = networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0.build();
            L.o(generatedMessageLite0, "result.build()");
            return (NetworkCapabilityTransports)generatedMessageLite0;
        }
        Object object0 = this.context.getSystemService("connectivity");
        ConnectivityManager connectivityManager0 = object0 instanceof ConnectivityManager ? ((ConnectivityManager)object0) : null;
        if(connectivityManager0 != null) {
            Network network0 = connectivityManager0.getActiveNetwork();
            if(network0 != null) {
                NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(network0);
                if(networkCapabilities0 == null) {
                    GeneratedMessageLite generatedMessageLite1 = networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0.build();
                    L.o(generatedMessageLite1, "result.build()");
                    return (NetworkCapabilityTransports)generatedMessageLite1;
                }
                boolean z = networkCapabilities0.hasTransport(1);
                L.o(networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0, "result");
                networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0.setWifi(z);
                networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0.setCellular(networkCapabilities0.hasTransport(0));
                networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0.setVpn(networkCapabilities0.hasTransport(4));
                networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0.setEthernet(networkCapabilities0.hasTransport(3));
                networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0.setWifiAware(networkCapabilities0.hasTransport(5));
                networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0.setLowpan(networkCapabilities0.hasTransport(6));
                networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0.setBluetooth(networkCapabilities0.hasTransport(2));
                GeneratedMessageLite generatedMessageLite2 = networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0.build();
                L.o(generatedMessageLite2, "result.build()");
                return (NetworkCapabilityTransports)generatedMessageLite2;
            }
        }
        GeneratedMessageLite generatedMessageLite3 = networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0.build();
        L.o(generatedMessageLite3, "result.build()");
        return (NetworkCapabilityTransports)generatedMessageLite3;
    }

    @l
    public final String getNetworkCountryISO() {
        TelephonyManager telephonyManager0 = this.getTelephonyManager();
        String s = telephonyManager0 == null ? null : telephonyManager0.getNetworkCountryIso();
        return s == null ? "" : s;
    }

    private final boolean getNetworkMetered() {
        ConnectivityManager connectivityManager0 = this.getConnectivityManager();
        return connectivityManager0 != null && connectivityManager0.isActiveNetworkMetered();
    }

    private final String getNetworkOperator() {
        TelephonyManager telephonyManager0 = this.getTelephonyManager();
        String s = telephonyManager0 == null ? null : telephonyManager0.getNetworkOperator();
        return s == null ? "" : s;
    }

    private final String getNetworkOperatorName() {
        TelephonyManager telephonyManager0 = this.getTelephonyManager();
        String s = telephonyManager0 == null ? null : telephonyManager0.getNetworkOperatorName();
        return s == null ? "" : s;
    }

    @SuppressLint({"MissingPermission"})
    @kotlin.k(message = "This method was deprecated in API level 30. Use getDataNetworkType()")
    private final int getNetworkType() {
        TelephonyManager telephonyManager0 = this.getTelephonyManager();
        if(telephonyManager0 != null) {
            try {
                return telephonyManager0.getNetworkType();
            }
            catch(SecurityException unused_ex) {
                if(!L.g(((Map)this.reportedWarning.getValue()).get("getNetworkType"), Boolean.TRUE)) {
                    E e0 = this.reportedWarning;
                    do {
                        Object object0 = e0.getValue();
                    }
                    while(!e0.compareAndSet(object0, Y.o0(((Map)object0), r0.a("getNetworkType", Boolean.TRUE))));
                    DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
                }
            }
        }
        return -1;
    }

    @Override  // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    @l
    public String getOrientation() {
        return this.getScreenHeight() <= this.getScreenWidth() ? "landscape" : "portrait";
    }

    @l
    public final Map getProcessInfo() {
        Map map0 = new HashMap();
        RandomAccessFile randomAccessFile0 = new RandomAccessFile("/proc/self/stat", "r");
        try {
            String s = randomAccessFile0.readLine();
            L.o(s, "statContent");
            map0.put("stat", s);
        }
        catch(Throwable throwable0) {
            c.a(randomAccessFile0, throwable0);
            throw throwable0;
        }
        c.a(randomAccessFile0, null);
        return map0;
    }

    @Override  // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getRingerMode() {
        AudioManager audioManager0 = this.getAudioManager();
        return audioManager0 == null ? -2 : audioManager0.getRingerMode();
    }

    public final int getScreenBrightness() {
        return Settings.System.getInt(this.context.getContentResolver(), "screen_brightness", -1);
    }

    private final int getScreenHeight() {
        Resources resources0 = this.context.getResources();
        if(resources0 != null) {
            DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
            return displayMetrics0 == null ? -1 : displayMetrics0.heightPixels;
        }
        return -1;
    }

    private final int getScreenWidth() {
        Resources resources0 = this.context.getResources();
        if(resources0 != null) {
            DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
            return displayMetrics0 == null ? -1 : displayMetrics0.widthPixels;
        }
        return -1;
    }

    public final boolean getStayOnWhilePluggedIn() {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), "stay_on_while_plugged_in", 0) == 0 ? false : true;
        }
        catch(Throwable throwable0) {
            DeviceLog.error("Problems fetching stay on while plugged in status", new Object[]{throwable0.getMessage()});
            return false;
        }
    }

    public final double getStreamMaxVolume(int v) {
        AudioManager audioManager0 = this.getAudioManager();
        return audioManager0 == null ? -2.0 : ((double)audioManager0.getStreamMaxVolume(v));
    }

    private final double getStreamVolume(int v) {
        AudioManager audioManager0 = this.getAudioManager();
        return audioManager0 == null ? -2.0 : ((double)audioManager0.getStreamVolume(v));
    }

    private final TelephonyManager getTelephonyManager() {
        Object object0 = this.context.getSystemService("phone");
        return object0 instanceof TelephonyManager ? ((TelephonyManager)object0) : null;
    }

    private final String getTimeZone() [...] // 潜在的解密器

    private final long getTimeZoneOffset() {
        return ((long)TimeZone.getDefault().getOffset(System.currentTimeMillis())) / 1000L;
    }

    public final long getTotalMemory() {
        return this.getMemoryInfo(MemoryInfoType.TOTAL_MEMORY);
    }

    private final long getUptime() {
        return SystemClock.uptimeMillis();
    }

    private final long getUsableSpace(File file0) {
        return file0 == null || !file0.exists() ? -1L : ((long)kotlin.math.b.L0(file0.getUsableSpace() / 0x400L));
    }

    @Override  // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    @l
    public i getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    @Override  // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public boolean hasInternet() {
        return Build.VERSION.SDK_INT < 23 ? this.hasInternetConnection() : this.hasInternetConnectionM();
    }

    private final boolean hasInternetConnection() {
        ConnectivityManager connectivityManager0 = this.getConnectivityManager();
        if(connectivityManager0 == null) {
            return false;
        }
        NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
        return networkInfo0 != null && networkInfo0.isConnected();
    }

    @RequiresApi(api = 23)
    private final boolean hasInternetConnectionM() {
        ConnectivityManager connectivityManager0 = this.getConnectivityManager();
        if(connectivityManager0 == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(connectivityManager0.getActiveNetwork());
        return networkCapabilities0 != null && networkCapabilities0.hasCapability(12) && networkCapabilities0.hasCapability(16);
    }

    private final boolean isActiveNetworkConnected() {
        ConnectivityManager connectivityManager0 = this.getConnectivityManager();
        NetworkInfo networkInfo0 = connectivityManager0 == null ? null : connectivityManager0.getActiveNetworkInfo();
        return networkInfo0 != null && networkInfo0.isConnected();
    }

    private final boolean isAdbEnabled() {
        return this.adbStatus();
    }

    private final boolean isAppActive() {
        return this.lifecycleDataSource.appIsForeground();
    }

    private final boolean isLimitAdTrackingEnabled() {
        return AdvertisingId.getLimitedAdTracking();
    }

    private final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    private final boolean isUSBConnected() {
        IntentFilter intentFilter0 = new IntentFilter("android.hardware.usb.action.USB_STATE");
        Intent intent0 = this.context.registerReceiver(null, intentFilter0);
        return intent0 == null ? false : intent0.getBooleanExtra("connected", false);
    }

    private final boolean isUsingWifi() {
        ConnectivityManager connectivityManager0 = this.getConnectivityManager();
        if(connectivityManager0 == null) {
            return false;
        }
        TelephonyManager telephonyManager0 = this.getTelephonyManager();
        NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
        return networkInfo0 != null && connectivityManager0.getBackgroundDataSetting() && networkInfo0.isConnected() && telephonyManager0 != null && networkInfo0.getType() == 1 && networkInfo0.isConnected();
    }

    private final boolean isWiredHeadsetOn() {
        AudioManager audioManager0 = this.getAudioManager();
        return audioManager0 != null && audioManager0.isWiredHeadsetOn();
    }
}

