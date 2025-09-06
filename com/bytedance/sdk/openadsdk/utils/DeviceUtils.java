package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.settings.cr;
import com.bytedance.sdk.openadsdk.core.settings.cz;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf;
import com.bytedance.sdk.openadsdk.xf.SM;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceUtils {
    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList PjT;

        static {
            AudioInfoReceiver.PjT = new CopyOnWriteArrayList();
        }

        public static void PjT(SM sM0) {
            if(sM0 != null) {
                CopyOnWriteArrayList copyOnWriteArrayList0 = AudioInfoReceiver.PjT;
                if(!copyOnWriteArrayList0.contains(sM0)) {
                    copyOnWriteArrayList0.add(sM0);
                }
            }
        }

        private static void Zh(Context context0) {
            if(context0 != null) {
                try {
                    IntentFilter intentFilter0 = new IntentFilter();
                    intentFilter0.addAction("android.media.VOLUME_CHANGED_ACTION");
                    intentFilter0.addAction("android.intent.action.HEADSET_PLUG");
                    context0.registerReceiver(new AudioInfoReceiver(), intentFilter0, null, com.bytedance.sdk.component.utils.SM.PjT());
                    DeviceUtils.cr = true;
                }
                catch(Throwable unused_ex) {
                }
            }
        }

        public static void Zh(SM sM0) {
            if(sM0 == null) {
                return;
            }
            AudioInfoReceiver.PjT.remove(sM0);
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            if(intent0 == null) {
                return;
            }
            try {
                if("android.media.VOLUME_CHANGED_ACTION".equals(intent0.getAction())) {
                    if(intent0.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                        DeviceUtils.xs = intent0.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                        if(!AudioInfoReceiver.PjT.isEmpty()) {
                            Jo.PjT(new Runnable() {
                                final AudioInfoReceiver PjT;

                                @Override
                                public void run() {
                                    for(Object object0: AudioInfoReceiver.PjT) {
                                        ((SM)object0).Zh(0);
                                    }
                                }
                            });
                        }
                    }
                }
                else if("android.intent.action.HEADSET_PLUG".equals(intent0.getAction())) {
                    DeviceUtils.qla = intent0.getIntExtra("state", 0);
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    static class PjT extends BroadcastReceiver {
        private static void Zh(Context context0) {
            int v = Build.VERSION.SDK_INT;
            if(context0 != null) {
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter0.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if(v >= 33) {
                    context0.registerReceiver(new PjT(), intentFilter0, 2);
                    return;
                }
                context0.registerReceiver(new PjT(), intentFilter0);
            }
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            int v = 0;
            if(intent0 != null && context0 != null) {
                if("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent0.getAction())) {
                    DeviceUtils.Sks(context0);
                    return;
                }
                if("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent0.getAction())) {
                    if(intent0.getIntExtra("state", 0) == 1) {
                        v = 1;
                    }
                    DeviceUtils.xE = v;
                }
            }
        }
    }

    public static class ReZ extends Au {
        public ReZ() {
            super("gaid_task");
        }

        @Override
        public void run() {
            boolean z;
            try {
                Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(ub.PjT());
                if(advertisingIdClient$Info0 == null) {
                    z = true;
                }
                else {
                    z = advertisingIdClient$Info0.isLimitAdTrackingEnabled();
                    DeviceUtils.Zh(advertisingIdClient$Info0, z);
                }
                if(z != -1) {
                    com.bytedance.sdk.openadsdk.core.ReZ.PjT(ub.PjT()).PjT("limit_ad_track", ((int)z));
                }
                return;
            }
            catch(IOException iOException0) {
            }
            catch(Throwable throwable0) {
                RD.Zh("TTAD.DeviceUtils", throwable0.getMessage());
                return;
            }
            RD.PjT("TTAD.DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", iOException0);
        }
    }

    static class Zh extends BroadcastReceiver {
        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            if("android.intent.action.SCREEN_ON".equals(intent0.getAction())) {
                DeviceUtils.cz = true;
                return;
            }
            if("android.intent.action.SCREEN_OFF".equals(intent0.getAction())) {
                DeviceUtils.cz = false;
                return;
            }
            if("android.intent.action.USER_PRESENT".equals(intent0.getAction())) {
                DeviceUtils.Zh = System.currentTimeMillis();
            }
        }
    }

    private static int Au = 0;
    private static String DWo = null;
    private static volatile boolean JQp = false;
    public static String PjT = "";
    private static volatile boolean ReZ;
    private static int SM;
    private static long XX;
    private static volatile long Zh;
    private static volatile boolean cr;
    private static volatile boolean cz;
    private static int fDm;
    private static int qj;
    private static int qla;
    private static AtomicBoolean ub;
    private static int xE;
    private static final AtomicBoolean xf;
    private static int xs;

    static {
        DeviceUtils.Zh = System.currentTimeMillis();
        DeviceUtils.ReZ = false;
        DeviceUtils.cr = false;
        DeviceUtils.JQp = false;
        DeviceUtils.cz = true;
        DeviceUtils.XX = 0L;
        DeviceUtils.DWo = "";
        DeviceUtils.qj = 0;
        DeviceUtils.xf = new AtomicBoolean(false);
        DeviceUtils.ub = new AtomicBoolean(false);
    }

    public static int Au() [...] // 潜在的解密器

    public static int Au(Context context0) {
        if(context0 == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context0.getContentResolver(), "adb_enabled", -1);
        }
        catch(Throwable throwable0) {
            RD.Zh("TTAD.DeviceUtils", throwable0.getMessage());
            return -1;
        }
    }

    public static int DWo(Context context0) {
        return DeviceUtils.Au;
    }

    public static void DWo() {
        Jo.PjT(new ReZ());
        xs.PjT(new com.bytedance.sdk.openadsdk.core.settings.xf.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.core.settings.xf$PjT
            public void PjT() {
                Jo.PjT(new ReZ());
            }

            @Override  // com.bytedance.sdk.openadsdk.core.settings.xf$PjT
            public void Zh() {
                Jo.PjT(new ReZ());
            }
        });
        Context context0 = ub.PjT();
        if(context0 != null) {
            com.bytedance.sdk.openadsdk.core.ReZ.PjT(context0).PjT("cpu_count", 8);
            int v = com.bytedance.sdk.openadsdk.utils.SM.PjT(8);
            com.bytedance.sdk.openadsdk.core.ReZ.PjT(context0).PjT("cpu_max_frequency", v);
            int v1 = com.bytedance.sdk.openadsdk.utils.SM.Zh(8);
            com.bytedance.sdk.openadsdk.core.ReZ.PjT(context0).PjT("cpu_min_frequency", v1);
            String s = wN.SM();
            if(s != null) {
                com.bytedance.sdk.openadsdk.core.ReZ.PjT(context0).PjT("total_memory", s);
            }
            long v2 = wN.DWo();
            com.bytedance.sdk.openadsdk.core.ReZ.PjT(context0).PjT("total_internal_storage", v2);
            long v3 = com.bytedance.sdk.component.utils.ub.PjT();
            com.bytedance.sdk.openadsdk.core.ReZ.PjT(context0).PjT("free_internal_storage", v3);
            long v4 = wN.qj();
            com.bytedance.sdk.openadsdk.core.ReZ.PjT(context0).PjT("total_sdcard_storage", v4);
            boolean z = wN.xf();
            com.bytedance.sdk.openadsdk.core.ReZ.PjT(context0).PjT("is_root", ((int)z));
            if(TextUtils.isEmpty(DeviceUtils.qj(context0))) {
                try {
                    Class.forName("com.unity3d.player.UnityPlayer");
                    DeviceUtils.PjT = "unity";
                }
                catch(ClassNotFoundException unused_ex) {
                    DeviceUtils.PjT = "native";
                }
                com.bytedance.sdk.openadsdk.core.ReZ.PjT(context0).PjT("framework_name", "");
            }
            DeviceUtils.qj();
            DeviceUtils.RD(context0);
            DeviceUtils.xE = DeviceUtils.tT(context0);
            XX.PjT(context0);
        }
    }

    public static float JQp() {
        try {
            Context context0 = ub.PjT();
            if(context0 != null) {
                int v = Settings.System.getInt(context0.getContentResolver(), "screen_brightness", -1);
                return v >= 0 ? ((float)Math.round(((float)v) / 255.0f * 10.0f)) / 10.0f : -1.0f;
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("TTAD.DeviceUtils", throwable0.getMessage());
        }
        return -1.0f;
    }

    public static String JQp(Context context0) {
        if(!DeviceUtils.xf.get()) {
            DeviceUtils.xE(context0);
        }
        return "";
    }

    private static int Lrd(Context context0) {
        try {
            String s = Build.MANUFACTURER;
            if(s.equalsIgnoreCase("XIAOMI")) {
                return Settings.System.getInt(context0.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1 ? 1 : 0;
            }
            return s.equalsIgnoreCase("HUAWEI") && Settings.System.getInt(context0.getContentResolver(), "SmartModeStatus") == 4 ? 1 : 0;
        }
        catch(Throwable unused_ex) {
            return -1;
        }
    }

    private static int Owx(Context context0) {
        return DeviceUtils.xE;
    }

    public static long PjT() [...] // 潜在的解密器

    public static JSONObject PjT(Context context0, boolean z) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("sys_adb_status", DeviceUtils.Au(context0));
            DeviceUtils.PjT(jSONObject0);
            jSONObject0.put("type", DeviceUtils.cr(context0));
            jSONObject0.put("os", 1);
            jSONObject0.put("os_version", Build.VERSION.RELEASE);
            jSONObject0.put("vendor", Build.MANUFACTURER);
            jSONObject0.put("conn_type", wN.xf(context0));
            jSONObject0.put("app_set_id", "");
            jSONObject0.put("app_set_id_scope", "");
            jSONObject0.put("installed_source", cr.cr());
            jSONObject0.put("screen_width", qZS.ReZ(context0));
            jSONObject0.put("screen_height", qZS.JQp(context0));
            jSONObject0.put("sec_did", com.bytedance.sdk.openadsdk.core.SM.ReZ.cz());
            cz cz0 = ub.cr();
            if(cz0.Yo("boot")) {
                jSONObject0.put("boot", "1757081380453");
                jSONObject0.put("power_on_time", "7903436");
            }
            jSONObject0.put("uuid", xf.ReZ(context0));
            jSONObject0.put("rom_version", cRA.PjT());
            jSONObject0.put("sys_compiling_time", xf.Zh(context0));
            jSONObject0.put("timezone", "Etc/GMT-8");
            jSONObject0.put("language", xf.Zh());
            jSONObject0.put("carrier_name", iZZ.PjT());
            jSONObject0.put("total_mem", String.valueOf(Long.parseLong((z ? wN.PjT(context0) : wN.Zh(context0))) * 0x400L));
            jSONObject0.put("locale_language", DeviceUtils.cr());
            jSONObject0.put("screen_bright", Math.ceil(DeviceUtils.JQp() * 10.0f) / 10.0);
            jSONObject0.put("is_screen_off", true ^ DeviceUtils.Zh());
            jSONObject0.put("cpu_num", com.bytedance.sdk.openadsdk.utils.SM.PjT(context0));
            jSONObject0.put("cpu_max_freq", com.bytedance.sdk.openadsdk.utils.SM.Zh(context0));
            jSONObject0.put("cpu_min_freq", com.bytedance.sdk.openadsdk.utils.SM.ReZ(context0));
            com.bytedance.sdk.openadsdk.utils.cz.PjT cz$PjT0 = com.bytedance.sdk.openadsdk.utils.cz.PjT();
            jSONObject0.put("battery_remaining_pct", ((int)cz$PjT0.Zh));
            jSONObject0.put("is_charging", cz$PjT0.PjT);
            jSONObject0.put("total_space", String.valueOf(wN.ReZ(context0)));
            jSONObject0.put("free_space_in", String.valueOf(wN.cr(context0)));
            jSONObject0.put("sdcard_size", String.valueOf(wN.JQp(context0)));
            jSONObject0.put("rooted", wN.cz(context0));
            jSONObject0.put("enable_assisted_clicking", DeviceUtils.cz());
            jSONObject0.put("force_language", Lrd.PjT(context0, "tt_choose_language"));
            jSONObject0.put("airplane", DeviceUtils.SM(context0));
            jSONObject0.put("darkmode", DeviceUtils.ub(context0));
            jSONObject0.put("headset", DeviceUtils.gK(context0));
            jSONObject0.put("ringmute", DeviceUtils.DWo(context0));
            jSONObject0.put("screenscale", ((double)DeviceUtils.ltE(context0)));
            jSONObject0.put("volume", 0);
            jSONObject0.put("low_power_mode", DeviceUtils.Owx(context0));
            if(z) {
                XX.PjT(jSONObject0, context0);
                jSONObject0.put("gp_v_name", DeviceUtils.JQp(context0));
                jSONObject0.put("gp_v_code", DeviceUtils.cz(context0));
            }
            if(cz0.Yo("mnc")) {
                jSONObject0.put("mnc", iZZ.ReZ());
            }
            if(cz0.Yo("mcc")) {
                jSONObject0.put("mcc", iZZ.Zh());
            }
            jSONObject0.put("act", com.bytedance.sdk.openadsdk.core.act.PjT.Zh(context0));
            jSONObject0.put("act_event", 0);
            String s = com.bytedance.sdk.openadsdk.core.SM.ReZ.ReZ();
            com.bytedance.sdk.openadsdk.core.SM.ReZ.cr();
            if(!TextUtils.isEmpty(s)) {
                jSONObject0.put("sof_chara", s);
            }
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    public static void PjT(Context context0) {
        if(!DeviceUtils.ReZ) {
            try {
                Zh deviceUtils$Zh0 = new Zh();
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addAction("android.intent.action.SCREEN_ON");
                intentFilter0.addAction("android.intent.action.SCREEN_OFF");
                intentFilter0.addAction("android.intent.action.USER_PRESENT");
                context0.getApplicationContext().registerReceiver(deviceUtils$Zh0, intentFilter0);
                DeviceUtils.ReZ = true;
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private static void PjT(JSONObject jSONObject0) throws JSONException {
        DeviceUtils.Zh(jSONObject0);
    }

    private static void RD(Context context0) {
        try {
            AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
            DeviceUtils.SM = audioManager0.getStreamMaxVolume(3);
            int v = audioManager0.getStreamVolume(3);
            DeviceUtils.xs = v;
            DeviceUtils.fDm = (int)(((double)v) / ((double)DeviceUtils.SM) * 100.0);
        }
        catch(Throwable unused_ex) {
        }
    }

    public static int ReZ() {
        return com.bytedance.sdk.openadsdk.core.ReZ.PjT(ub.PjT()).Zh("limit_ad_track", -1);
    }

    static int ReZ(int v) {
        DeviceUtils.fDm = v;
        return v;
    }

    public static boolean ReZ(Context context0) {
        try {
            if((context0.getResources().getConfiguration().uiMode & 15) == 4) {
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public static int SM() [...] // 潜在的解密器

    public static int SM(Context context0) {
        try {
            return Settings.Global.getInt(context0.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        }
        catch(Throwable unused_ex) {
            return -1;
        }
    }

    private static void Sks(Context context0) {
        if(context0 == null) {
            return;
        }
        Jo.Zh(new Au("DeviceUtils_get_low_power_mode") {
            @Override
            public void run() {
                DeviceUtils.xE = DeviceUtils.tT(context0.getApplicationContext());
            }
        });
    }

    public static int XX() [...] // 潜在的解密器

    public static JSONObject XX(Context context0) {
        return DeviceUtils.PjT(context0, false);
    }

    private static void Zh(Info advertisingIdClient$Info0, boolean z) {
        if(!z && ub.cr().Yo("gaid")) {
            String s = advertisingIdClient$Info0.getId();
            String s1 = com.bytedance.sdk.openadsdk.ltE.PjT.Zh.PjT.PjT().Zh();
            if(!TextUtils.isEmpty(s)) {
                com.bytedance.sdk.openadsdk.ltE.PjT.Zh.PjT.PjT().PjT(s);
                com.bytedance.sdk.openadsdk.core.SM.ReZ.PjT(s);
            }
            if(!s1.equals(s)) {
                xf.PjT();
            }
        }
    }

    private static void Zh(JSONObject jSONObject0) throws JSONException {
        jSONObject0.put("model", Build.MODEL);
        if(ub.cr().Yo("gaid")) {
            jSONObject0.put("gaid", com.bytedance.sdk.openadsdk.ltE.PjT.Zh.PjT.PjT().Zh());
        }
    }

    public static boolean Zh() {
        if(SystemClock.elapsedRealtime() - DeviceUtils.XX >= 20000L) {
            DeviceUtils.XX = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager0 = (PowerManager)ub.PjT().getSystemService("power");
                if(powerManager0 != null) {
                    DeviceUtils.cz = powerManager0.isInteractive();
                    return DeviceUtils.cz;
                }
            }
            catch(Throwable throwable0) {
                RD.Zh("TTAD.DeviceUtils", throwable0.getMessage());
            }
        }
        return DeviceUtils.cz;
    }

    public static boolean Zh(Context context0) {
        try {
            if((context0.getResources().getConfiguration().screenLayout & 15) >= 3) {
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    private static void cRA(Context context0) {
        Context context1 = context0.getApplicationContext();
        if(context1 == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.DeviceUtils.3 deviceUtils$30 = new ContentObserver(null) {
            @Override  // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                DeviceUtils.Sks(context1);
            }
        };
        context0.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, deviceUtils$30);
    }

    public static int cr(Context context0) {
        if(DeviceUtils.ReZ(context0)) {
            return 3;
        }
        return DeviceUtils.Zh(context0) ? 2 : 1;
    }

    public static String cr() {
        String s = Locale.getDefault().toLanguageTag();
        return TextUtils.isEmpty(s) ? "" : s;
    }

    public static int cz() {
        AccessibilityManager accessibilityManager0 = (AccessibilityManager)ub.PjT().getSystemService("accessibility");
        if(accessibilityManager0 == null) {
            return -1;
        }
        return accessibilityManager0.isEnabled() ? 1 : 0;
    }

    public static int cz(Context context0) {
        if(!DeviceUtils.xf.get()) {
            DeviceUtils.xE(context0);
        }
        return DeviceUtils.qj;
    }

    static int fDm() [...] // 潜在的解密器

    private static int gK(Context context0) {
        return DeviceUtils.qla;
    }

    private static float ltE(Context context0) {
        return context0.getResources().getDisplayMetrics().density;
    }

    // 去混淆评级： 低(40)
    public static String qj(Context context0) {
        DeviceUtils.PjT = "";
        return "";
    }

    public static void qj() {
        try {
            int v = ((AudioManager)ub.PjT().getSystemService("audio")).getRingerMode();
            if(v == 2) {
                DeviceUtils.Au = 1;
                return;
            }
            if(v == 1) {
                DeviceUtils.Au = 2;
                return;
            }
            DeviceUtils.Au = 0;
        }
        catch(Throwable unused_ex) {
        }
    }

    private static int tT(Context context0) {
        if(context0 == null) {
            return 0;
        }
        try {
            if(!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI") && !Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager)context0.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return DeviceUtils.Lrd(context0);
        }
        catch(Throwable unused_ex) {
            return 0;
        }
    }

    private static int ub(Context context0) {
        int v;
        try {
            v = context0.getApplicationContext().getResources().getConfiguration().uiMode & 0x30;
        }
        catch(Throwable unused_ex) {
            return -1;
        }
        if(v == 0x20) {
            return 1;
        }
        return v == 16 ? 0 : -1;
    }

    private static void xE(Context context0) {
        if(context0 != null && DeviceUtils.xf.compareAndSet(false, true)) {
            try {
                if(com.bytedance.sdk.openadsdk.RD.PjT.PjT("gp_v_enable", 0) == 1) {
                    PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo("com.android.vending", 0);
                    DeviceUtils.DWo = packageInfo0.versionName;
                    DeviceUtils.qj = packageInfo0.versionCode;
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public static void xf(Context context0) {
        AudioInfoReceiver.Zh(context0);
    }

    static boolean xf() [...] // 潜在的解密器

    static int xs() [...] // 潜在的解密器

    public static void xs(Context context0) {
        if(!DeviceUtils.JQp && context0 != null) {
            Context context1 = context0.getApplicationContext();
            if(context1 == null) {
                return;
            }
            try {
                if(Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                    DeviceUtils.cRA(context1);
                }
                else {
                    PjT.Zh(context1);
                }
                DeviceUtils.JQp = true;
            }
            catch(Throwable unused_ex) {
            }
        }
    }
}

