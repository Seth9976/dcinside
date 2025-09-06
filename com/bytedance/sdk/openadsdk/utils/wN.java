package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.iZZ;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.qla;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import s.a;
import v.c;

public class wN {
    public static class PjT implements Callable {
        private final int PjT;

        PjT(int v) {
            this.PjT = v;
        }

        public String PjT() throws Exception {
            synchronized(this) {
                String s = "unKnow";
                int v1 = this.PjT;
                if(v1 == 1) {
                    s = this.ReZ();
                }
                else if(v1 == 2) {
                    s = "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)";
                }
                return s;
            }
        }

        private String ReZ() {
            String[] arr_s;
            synchronized(this) {
                arr_s = new String[]{"unKnow"};
                CountDownLatch countDownLatch0 = new CountDownLatch(1);
                Jo.PjT(new Runnable() {
                    final PjT ReZ;

                    @Override
                    public void run() {
                        arr_s[0] = wN.iZZ();
                        String s = arr_s[0];
                        countDownLatch0.countDown();
                    }
                });
                try {
                    countDownLatch0.await(2L, TimeUnit.SECONDS);
                }
                catch(InterruptedException interruptedException0) {
                    RD.Zh("TTAD.ToolUtils", interruptedException0.getMessage());
                }
            }
            return arr_s[0];
        }

        private String Zh() [...] // 潜在的解密器

        @Override
        public Object call() throws Exception {
            return this.PjT();
        }
    }

    public static class Zh {
        public final ComponentName PjT;
        public final int Zh;

        public Zh(ComponentName componentName0, int v) {
            this.PjT = componentName0;
            this.Zh = v;
        }
    }

    private static String Au;
    private static final HashSet DWo;
    private static volatile String JQp;
    public static Integer PjT;
    private static volatile boolean ReZ;
    private static String SM;
    private static String XX;
    private static final ExecutorService Zh;
    private static final AtomicInteger cr;
    private static final ReentrantLock cz;
    private static String fDm;
    private static final HashSet qj;
    private static String qla;
    private static final byte[] xf;
    private static final byte[] xs;

    static {
        wN.Zh = Executors.newSingleThreadExecutor();
        wN.ReZ = false;
        wN.cr = new AtomicInteger(0);
        wN.JQp = "";
        wN.cz = new ReentrantLock();
        wN.XX = null;
        wN.Au = null;
        wN.SM = null;
        wN.DWo = new HashSet(Arrays.asList(new String[]{"Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"}));
        HashSet hashSet0 = new HashSet();
        wN.qj = hashSet0;
        hashSet0.addAll(Arrays.asList(new String[]{"America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"}));
        wN.PjT = null;
        wN.xf = new byte[]{108, 0x6F, 97, 100, 105, 110, 103};
        wN.xs = new byte[]{97, 0x72, 98, 105, 0x74, 0x72, 97, 103, 101};
    }

    public static String Au() {
        try {
            ActivityManager activityManager0 = (ActivityManager)ub.PjT().getSystemService("activity");
            ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
            activityManager0.getMemoryInfo(activityManager$MemoryInfo0);
            long v = activityManager$MemoryInfo0.totalMem;
            if(v > 0L) {
                return String.valueOf(v / 0x400L);
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public static void Au(String s) {
        ReZ.PjT();
        ReZ.PjT("reportMultiLog", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                if(ub.cr().dwk()) {
                    wN.ReZ = true;
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("error", s);
                    return cr.Zh().PjT("reportMultiLog").Zh(jSONObject0.toString());
                }
                return null;
            }
        });
    }

    public static boolean Au(int v) {
        if(v <= 0) {
            return false;
        }
        return v < 100 ? new Random(System.currentTimeMillis()).nextInt(100) + 1 <= v : true;
    }

    public static boolean Au(Context context0) [...] // Inlined contents

    public static int DWo(Context context0) {
        return 35;
    }

    public static long DWo() {
        try {
            StatFs statFs0 = new StatFs(Environment.getDataDirectory().getPath());
            long v = statFs0.getBlockSizeLong();
            return statFs0.getBlockCountLong() * v;
        }
        catch(Throwable unused_ex) {
            return 0L;
        }
    }

    public static void DWo(String s) {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        RD.Zh(("You should use method \'" + s + "\' on the asynchronous thread,it may cause anr, please check."), new Object[0]);
    }

    public static long JQp(Context context0) {
        return (long)com.bytedance.sdk.openadsdk.core.ReZ.PjT(context0).Zh("total_sdcard_storage", 0L);
    }

    public static String JQp() {
        synchronized(wN.class) {
            if(TextUtils.isEmpty(wN.XX) && ub.PjT() != null) {
                wN.XX = "com.dcinside.app.android";
            }
            return wN.XX;
        }
    }

    public static String JQp(String s) {
        if(TextUtils.isEmpty(s)) {
            s = ub.cr().ZX();
        }
        if(TextUtils.isEmpty(s)) {
            return "https://api16-access-ttp.tiktokpangle.us/service/2/app_log/";
        }
        return s.startsWith("http") ? s : "https://" + s;
    }

    public static boolean JQp(int v) {
        return v == 5;
    }

    // 去混淆评级： 低(20)
    static String Lrd() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static String Owx() [...] // 潜在的解密器

    public static int PjT(WebView webView0) {
        if(webView0 == null) {
            return -1;
        }
        try {
            WebBackForwardList webBackForwardList0 = webView0.copyBackForwardList();
            int v = webBackForwardList0.getSize();
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; v1 < v; ++v1) {
                WebHistoryItem webHistoryItem0 = webBackForwardList0.getItemAtIndex(v1);
                if(webHistoryItem0 != null) {
                    String s = webHistoryItem0.getUrl();
                    if(!arrayList0.contains(s)) {
                        arrayList0.add(s);
                    }
                }
            }
            return arrayList0.indexOf(webView0.getUrl()) + 1;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("TTAD.ToolUtils", throwable0.toString());
        return -1;
    }

    public static int PjT(String s) {
        s.hashCode();
        switch(s) {
            case "banner_ad": {
                return 2;
            }
            case "cache_splash_ad": {
                return 4;
            }
            case "fullscreen_interstitial_ad": {
                return 5;
            }
            case "interaction": {
                return 3;
            }
            case "open_ad": {
                return 4;
            }
            case "rewarded_video": {
                return 7;
            }
            default: {
                return 1;
            }
        }
    }

    public static Intent PjT(Context context0, String s) {
        Intent intent0 = context0.getPackageManager().getLaunchIntentForPackage(s);
        if(intent0 == null) {
            return null;
        }
        if(!intent0.hasCategory("android.intent.category.LAUNCHER")) {
            intent0.addCategory("android.intent.category.LAUNCHER");
        }
        intent0.setPackage(null);
        intent0.addFlags(0x200000);
        intent0.addFlags(0x10000000);
        return intent0;
    }

    public static com.bytedance.sdk.openadsdk.common.cr PjT(Owx owx0, cz cz0, Context context0, String s) {
        int v = owx0.zZ();
        if(owx0.HG() && (v == 1 || v == 3)) {
            cz0.PjT(true, new com.bytedance.sdk.openadsdk.common.ReZ(context0));
            return new com.bytedance.sdk.openadsdk.common.cr(owx0, cz0, s, false);
        }
        return null;
    }

    @NonNull
    public static Zh PjT(Context context0, Intent intent0) {
        return new Zh(null, 0);
    }

    public static String PjT(int v) {
        switch(v) {
            case 1: {
                return "embeded_ad";
            }
            case 2: {
                return "banner_ad";
            }
            case 3: {
                return "interaction";
            }
            case 4: {
                return "open_ad";
            }
            case 5: {
                return "fullscreen_interstitial_ad";
            }
            case 7: {
                return "rewarded_video";
            }
            default: {
                return null;
            }
        }
    }

    public static String PjT(Context context0) {
        String s = com.bytedance.sdk.openadsdk.core.ReZ.PjT(context0).Zh("total_memory", null);
        if(s == null || wN.Zh(s) <= 0L) {
            s = wN.ReZ("MemTotal");
            if(wN.Zh(s) <= 0L) {
                s = wN.Au();
            }
            com.bytedance.sdk.openadsdk.core.ReZ.PjT(context0).PjT("total_memory", s);
        }
        return s;
    }

    public static String PjT(Owx owx0) {
        if(owx0 == null) {
            return null;
        }
        try {
            return wN.ReZ(owx0.XWz());
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static String PjT(@NonNull String s, boolean z, boolean z1) {
        if(s != null && !s.startsWith("/")) {
            s = "/" + s;
        }
        String s1 = z1 ? wN.fDm() : wN.xs();
        if(TextUtils.isEmpty(s1)) {
            s1 = "api16-access-ttp.tiktokpangle.us";
        }
        String s2 = !ZX.PjT() || z ? "https://" + s1 + s : ZX.PjT(("https://" + s1 + s));
        return z ? wN.xf(s2) : s2;
    }

    public static JSONObject PjT(AdSlot adSlot0) {
        JSONObject jSONObject0 = new JSONObject();
        if(adSlot0 != null) {
            try {
                jSONObject0.put("is_sb", !TextUtils.isEmpty(adSlot0.getBidAdm()));
            }
            catch(Throwable unused_ex) {
            }
        }
        return jSONObject0;
    }

    public static JSONObject PjT(Owx owx0, long v, a a0) {
        if(owx0 == null) {
            return new JSONObject();
        }
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("creative_id", owx0.dIF());
            jSONObject0.put("buffers_time", v);
            c c0 = owx0.MWx();
            if(c0 != null) {
                jSONObject0.put("video_size", c0.e());
                jSONObject0.put("video_resolution", c0.r());
            }
            wN.PjT(jSONObject0, a0);
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
        }
        RD.PjT("TTAD.ToolUtils", "getVideoAction json error", jSONException0);
        return jSONObject0;
    }

    public static JSONObject PjT(boolean z, Owx owx0, long v, long v1, String s) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("creative_id", owx0.dIF());
            jSONObject0.put("load_time", v);
            c c0 = owx0.MWx();
            if(c0 != null) {
                jSONObject0.put("video_size", c0.e());
                jSONObject0.put("video_resolution", c0.r());
            }
            if(!z) {
                jSONObject0.put("error_code", v1);
                if(TextUtils.isEmpty(s)) {
                    s = "unknown";
                }
                jSONObject0.put("error_message", s);
                return jSONObject0;
            }
        }
        catch(JSONException jSONException0) {
            RD.PjT("TTAD.ToolUtils", "getVideoDownload json error", jSONException0);
        }
        return jSONObject0;
    }

    public static void PjT(@NonNull Owx owx0, @NonNull View view0) {
    }

    public static void PjT(Owx owx0, cz cz0) {
        wN.PjT(owx0, cz0, false);
    }

    public static void PjT(Owx owx0, cz cz0, boolean z) {
        List list1;
        if(owx0 != null && cz0 != null) {
            int v = owx0.zZ();
            if(owx0.HG() && (v == 2 || v == 3 || v == 5)) {
                com.bytedance.sdk.openadsdk.core.model.cz cz1 = owx0.qla();
                if(cz1 != null) {
                    List list0 = cz1.cz();
                    ArrayList arrayList0 = new ArrayList();
                    if(z) {
                        for(int v1 = 0; v1 < list0.size(); ++v1) {
                            arrayList0.add(((int)(((int)(((Integer)list0.get(v1)))) - 1)));
                        }
                        list1 = arrayList0;
                    }
                    else {
                        list1 = list0;
                    }
                    cz0.PjT(true, cz1.cr(), cz1.JQp(), list1, cz1.XX(), cz1.ReZ());
                }
            }
            int v2 = owx0.Lf();
            long v3 = owx0.Bf();
            if((v2 == 1 || v2 == 2) && v3 > 0L) {
                cz0.PjT(v2, v3);
            }
        }
    }

    public static void PjT(Owx owx0, String s) {
        if(owx0 != null) {
            try {
                String s1 = owx0.xu();
                if(TextUtils.isEmpty(s1) && owx0.RV() != null && owx0.RV().ReZ() == 1 && !TextUtils.isEmpty(owx0.RV().Zh())) {
                    s1 = owx0.RV().Zh();
                }
                if(!TextUtils.isEmpty(s1)) {
                    com.bytedance.sdk.openadsdk.core.ZX.PjT(ub.PjT(), s1, owx0, wN.PjT(s), s, false);
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public static void PjT(String s, String s1, Context context0) {
        if(!TextUtils.isEmpty(s1) && wN.SM(context0)) {
            int v = s1.length();
            int v1 = 1;
            int v2 = v % 0xDF4 == 0 ? v / 0xDF4 : v / 0xDF4 + 1;
            int v3 = 0xDF4;
            int v4 = 0;
            while(v1 <= v2) {
                if(v3 < v) {
                    Log.d(s, v2 + "-" + v1 + ":" + s1.substring(v4, v3));
                    ++v1;
                    v4 = v3;
                    v3 += 0xDF4;
                }
                else {
                    Log.d(s, v2 + "-" + v1 + ":" + s1.substring(v4));
                    if(true) {
                        break;
                    }
                }
            }
        }
    }

    public static void PjT(StringBuilder stringBuilder0, String s, String s1) {
        if(stringBuilder0 != null && !TextUtils.isEmpty(s)) {
            int v = stringBuilder0.indexOf(s);
            if(v > 0) {
                stringBuilder0.replace(v, s.length() + v, s1);
            }
        }
    }

    public static void PjT(JSONObject jSONObject0) {
        try {
            Pair pair0 = SM.cr("oem_store");
            int v = -1;
            if(pair0 != null) {
                int v1 = (int)Integer.valueOf(((String)pair0.first));
                if(v1 != -2 || System.currentTimeMillis() - ((long)(((Long)pair0.second))) < ((long)com.bytedance.sdk.openadsdk.RD.PjT.PjT("oem_store_state_time", 259200000))) {
                    v = v1;
                }
            }
            jSONObject0.put("oem_store", v);
            return;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("TTAD.ToolUtils", throwable0.getMessage());
    }

    private static void PjT(JSONObject jSONObject0, a a0) {
        if(!jSONObject0.has("video_resolution") && a0 != null) {
            try {
                int v = a0.cr();
                int v1 = a0.JQp();
                jSONObject0.put("video_resolution", String.format(Locale.getDefault(), "%d×%d", v, v1));
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public static boolean PjT() {
        return qla.PjT() != null && !qla.PjT().cr();
    }

    public static boolean RD() {
        return wN.cr.get() == 1;
    }

    public static long ReZ(Context context0) {
        return (long)com.bytedance.sdk.openadsdk.core.ReZ.PjT(context0).Zh("total_internal_storage", 0L);
    }

    public static String ReZ() {
        com.bytedance.sdk.openadsdk.multipro.ReZ.PjT(ub.PjT());
        String s = SM.PjT("sdk_local_web_ua", 86400000L);
        wN.JQp = s;
        if(TextUtils.isEmpty(s)) {
            ReentrantLock reentrantLock0 = wN.cz;
            if(reentrantLock0.tryLock()) {
                try {
                    try {
                        wN.JQp = WebSettings.getDefaultUserAgent(ub.PjT());
                        SM.PjT("sdk_local_web_ua", "");
                        goto label_21;
                    }
                    catch(Exception exception0) {
                    }
                    catch(NoClassDefFoundError noClassDefFoundError0) {
                        RD.PjT("TTAD.ToolUtils", "", noClassDefFoundError0);
                        wN.cz.unlock();
                        return "";
                    }
                    RD.PjT("TTAD.ToolUtils", "", exception0);
                }
                catch(Throwable throwable0) {
                    wN.cz.unlock();
                    throw throwable0;
                }
                wN.cz.unlock();
                return "";
            label_21:
                reentrantLock0.unlock();
                return "";
            }
        }
        return "";

        final class com.bytedance.sdk.openadsdk.utils.wN.1 implements Runnable {
            @Override
            public void run() {
                try {
                    cz cz0 = new cz(ub.PjT());
                    cz0.setWebViewClient(new com.bytedance.sdk.component.SM.cz.PjT());
                    wN.JQp = cz0.getUserAgentString();
                }
                catch(Exception exception0) {
                    RD.PjT("TTAD.ToolUtils", "", exception0);
                }
                catch(NoClassDefFoundError noClassDefFoundError0) {
                    RD.PjT("TTAD.ToolUtils", "", noClassDefFoundError0);
                }
            }
        }

    }

    public static String ReZ(int v) {
        switch(v) {
            case 1: {
                return "banner_ad";
            }
            case 2: {
                return "interaction";
            }
            case 3: 
            case 4: {
                return "open_ad";
            }
            case 7: {
                return "rewarded_video";
            }
            case 8: {
                return "fullscreen_interstitial_ad";
            }
            default: {
                return "embeded_ad";
            }
        }
    }

    public static String ReZ(String s) {
        String s2;
        String s1;
        BufferedReader bufferedReader0;
        FileReader fileReader0;
        try {
            fileReader0 = new FileReader("/proc/meminfo");
        }
        catch(Throwable throwable0) {
            fileReader0 = null;
            bufferedReader0 = null;
            goto label_17;
        }
        try {
            bufferedReader0 = null;
            bufferedReader0 = new BufferedReader(fileReader0, 0x1000);
            while(true) {
                s1 = bufferedReader0.readLine();
                if(s1 == null || s1.contains(s)) {
                    break;
                }
            }
        }
        catch(Throwable throwable0) {
            goto label_17;
        }
        if(s1 == null) {
            try {
                bufferedReader0.close();
            }
            catch(Exception unused_ex) {
            }
            try {
                fileReader0.close();
            }
            catch(Exception unused_ex) {
            }
            return null;
        }
        try {
            s2 = s1.split("\\s+")[1];
            goto label_30;
        }
        catch(Throwable throwable0) {
        }
        try {
        label_17:
            RD.Zh("TTAD.ToolUtils", throwable0.getMessage());
        }
        catch(Throwable throwable1) {
            if(bufferedReader0 != null) {
                try {
                    bufferedReader0.close();
                }
                catch(Exception unused_ex) {
                }
            }
            if(fileReader0 != null) {
                try {
                    fileReader0.close();
                }
                catch(Exception unused_ex) {
                }
            }
            throw throwable1;
        }
        if(bufferedReader0 != null) {
            try {
                bufferedReader0.close();
            }
            catch(Exception unused_ex) {
            }
        }
        if(fileReader0 != null) {
            try {
                fileReader0.close();
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
        try {
        label_30:
            bufferedReader0.close();
        }
        catch(Exception unused_ex) {
        }
        try {
            fileReader0.close();
        }
        catch(Exception unused_ex) {
        }
        return s2;
    }

    public static boolean ReZ(Owx owx0) {
        if(owx0 == null) {
            return true;
        }
        int v = owx0.joj();
        int v1 = ub.cr().Zh(v);
        int v2 = ltE.ReZ(ub.PjT());
        switch(v1) {
            case 1: {
                return wN.cr(v2);
            }
            case 2: {
                return wN.JQp(v2) || wN.cr(v2) || wN.cz(v2);
            }
            case 3: {
                return false;
            }
            case 5: {
                return wN.cr(v2) || wN.cz(v2);
            }
            default: {
                return true;
            }
        }
    }

    public static String SM() {
        return wN.ReZ("MemTotal");
    }

    public static boolean SM(Context context0) {
        if(context0 == null) {
            return false;
        }
        try {
            if((context0.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    public static boolean SM(String s) {
        if(fDm.JQp()) {
            return true;
        }
        RD.Zh(("You must use method \'" + s + "\' after initialization, please check."), new Object[0]);
        return false;
    }

    // 去混淆评级： 低(23)
    public static String Sks() [...] // 潜在的解密器

    public static int XX(int v) {
        switch(v) {
            case 1: {
                return 0;
            }
            case 4: {
                return 1;
            }
            case 5: {
                return 4;
            }
            case 6: {
                return 5;
            }
            default: {
                return v;
            }
        }
    }

    public static String XX() {
        synchronized(wN.class) {
            if(TextUtils.isEmpty(wN.SM) && ub.PjT() != null) {
                try {
                    String s = wN.JQp();
                    PackageInfo packageInfo0 = ub.PjT().getPackageManager().getPackageInfo(s, 0);
                    wN.Au = String.valueOf(packageInfo0.versionCode);
                    wN.SM = packageInfo0.versionName;
                }
                catch(Throwable throwable0) {
                    RD.PjT("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", throwable0);
                }
            }
            return wN.SM;
        }
    }

    public static String XX(@NonNull Context context0) {
        try {
            return (Build.VERSION.SDK_INT < 24 ? Locale.getDefault() : context0.getResources().getConfiguration().getLocales().get(0)).getLanguage();
        }
        catch(Exception exception0) {
        }
        RD.Zh("TTAD.ToolUtils", exception0.toString());
        return "";
    }

    public static String XX(String s) [...] // 潜在的解密器

    private static boolean Yo() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public static int Zh(Owx owx0) {
        if(owx0 == null) {
            return -1;
        }
        int v = owx0.XWz();
        int v1 = 1;
        switch(v) {
            case 1: {
                return 2;
            }
            case 3: {
                return 4;
            label_8:
                v1 = 7;
                switch(v) {
                    case 7: {
                        return v1;
                    }
                    case 8: {
                        return 5;
                    }
                    default: {
                        return -1;
                    }
                }
            }
            case 5: {
                return v1;
            }
            default: {
                goto label_8;
            }
        }
    }

    public static long Zh(String s) {
        try {
            return Long.parseLong(s);
        }
        catch(Throwable unused_ex) {
            return 0L;
        }
    }

    public static String Zh() [...] // 潜在的解密器

    public static String Zh(int v) {
        switch(v) {
            case 1: {
                return "embeded_ad_landingpage";
            }
            case 2: {
                return "banner_ad_landingpage";
            }
            case 3: {
                return "interaction_landingpage";
            }
            case 4: {
                return "splash_ad_landingpage";
            }
            case 5: {
                return "fullscreen_interstitial_ad";
            }
            case 7: {
                return "rewarded_video_landingpage";
            }
            default: {
                return "unknow";
            }
        }
    }

    // 去混淆评级： 低(20)
    public static String Zh(Context context0) {
        return "0";
    }

    public static boolean Zh(Context context0, String s) {
        if(context0 != null && !TextUtils.isEmpty(s)) {
            try {
                Intent intent0 = new Intent("android.intent.action.DIAL", Uri.parse(("tel:" + Uri.encode(s))));
                if(!(context0 instanceof Activity)) {
                    intent0.setFlags(0x10000000);
                }
                com.bytedance.sdk.component.utils.Zh.PjT(context0, intent0, null);
                return true;
            }
            catch(Exception unused_ex) {
            }
        }
        return false;
    }

    public static long cr(Context context0) {
        return (long)com.bytedance.sdk.openadsdk.core.ReZ.PjT(context0).Zh("free_internal_storage", 0L);
    }

    // 去混淆评级： 低(20)
    public static String cr() [...] // 潜在的解密器

    public static String cr(String s) {
        return wN.PjT(s, false, false);
    }

    public static boolean cr(int v) {
        return v == 4;
    }

    public static boolean cr(Owx owx0) {
        if(owx0 == null) {
            return false;
        }
        if(owx0.cI() == 3 && owx0.HG()) {
            switch(owx0.zZ()) {
                case 4: 
                case 5: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    public static int cz(Context context0) {
        return com.bytedance.sdk.openadsdk.core.ReZ.PjT(context0).Zh("is_root", -1);
    }

    public static String cz() {
        synchronized(wN.class) {
            if(TextUtils.isEmpty(wN.Au) && ub.PjT() != null) {
                try {
                    String s = wN.JQp();
                    PackageInfo packageInfo0 = ub.PjT().getPackageManager().getPackageInfo(s, 0);
                    wN.Au = String.valueOf(packageInfo0.versionCode);
                    wN.SM = packageInfo0.versionName;
                }
                catch(Throwable throwable0) {
                    RD.PjT("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", throwable0);
                }
            }
            return wN.Au;
        }
    }

    public static boolean cz(int v) {
        return v == 6;
    }

    public static boolean cz(String s) {
        try {
            if(Pattern.compile("[一-龥]").matcher(s).find()) {
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public static int fDm(Context context0) {
        Integer integer0 = wN.PjT;
        if(integer0 != null) {
            return (int)integer0;
        }
        if(context0 == null) {
            return 0;
        }
        List list0 = context0.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0);
        if(list0 != null) {
            int v = list0.size();
            wN.PjT = v;
            return v;
        }
        return 0;
    }

    // 去混淆评级： 低(20)
    public static String fDm() {
        String s = ub.cr().Qf();
        return TextUtils.isEmpty(s) ? "api16-access-ttp.tiktokpangle.us" : s;
    }

    // 去混淆评级： 中等(60)
    public static int gK() {
        try {
            return !wN.DWo.contains("Asia/Shanghai") && false ? 3 : 2;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("TTAD.ToolUtils", throwable0.toString());
        return 0;
    }

    private static String iZZ() {
        try {
            WebView webView0 = new WebView(ub.PjT());
            webView0.setWebViewClient(new com.bytedance.sdk.component.SM.cz.PjT());
            String s = webView0.getSettings().getUserAgentString();
            if(s != null && !"unKnow".equals(s)) {
                if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                    com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_ua_data", "webview_ua", s);
                    return s;
                }
                com.bytedance.sdk.openadsdk.core.ReZ.PjT(ub.PjT()).PjT("webview_ua", s);
            }
            return s;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("getUA", "e:" + throwable0.getMessage());
        return "unKnow";
    }

    public static int ltE() {
        int v = TimeZone.getDefault().getRawOffset() / 3600000;
        if(v < -12) {
            v = -12;
        }
        return v <= 12 ? v : 12;
    }

    public static long qj() {
        try {
            if(wN.Yo()) {
                StatFs statFs0 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                long v = (long)statFs0.getBlockSize();
                return ((long)statFs0.getBlockCount()) * v;
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("TTAD.ToolUtils", throwable0.getMessage());
        }
        return 0L;
    }

    public static long qj(Context context0) {
        if(Build.VERSION.SDK_INT >= 24) {
            try {
                return (long)context0.getApplicationInfo().minSdkVersion;
            }
            catch(Throwable throwable0) {
                RD.Zh("TTAD.ToolUtils", throwable0.getMessage());
            }
        }
        return -1L;
    }

    // 去混淆评级： 低(20)
    public static String qla() [...] // 潜在的解密器

    // 去混淆评级： 低(23)
    public static String tT() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static String ub() [...] // 潜在的解密器

    public static String xE() [...] // Inlined contents

    public static int xf(Context context0) {
        return wN.XX(iZZ.PjT(context0, 0L));
    }

    private static String xf(String s) {
        try {
            return Uri.parse(s).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", wN.cz()).toString();
        }
        catch(Exception exception0) {
            RD.Zh("TTAD.ToolUtils", exception0.getMessage());
            return s;
        }
    }

    public static boolean xf() {
        try {
            if(new File("/system/bin/su").exists() || new File("/system/xbin/su").exists()) {
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public static String xs() {
        String s = ub.cr().KM();
        return TextUtils.isEmpty(s) ? "api16-access-ttp.tiktokpangle.us" : s;
    }

    public static void xs(Context context0) {
        try {
            AtomicInteger atomicInteger0 = wN.cr;
            if(atomicInteger0.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager0 = (AccessibilityManager)context0.getSystemService("accessibility");
            if(accessibilityManager0.isEnabled() && accessibilityManager0.isTouchExplorationEnabled()) {
                atomicInteger0.set(1);
                ReZ.PjT().ReZ();
                return;
            }
            atomicInteger0.set(2);
        }
        catch(Exception unused_ex) {
            wN.cr.set(2);
        }
    }

    static boolean yIW() [...] // 潜在的解密器
}

