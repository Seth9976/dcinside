package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.Au.XX;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.SM;
import j..util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class cRA {
    public static class PjT implements Callable {
        private final String PjT;

        public PjT(String s) {
            this.PjT = s;
        }

        public String PjT() throws Exception {
            String s = (String)cRA.XX.get(this.PjT);
            if(s != null) {
                return s;
            }
            String s1 = cRA.ReZ(this.PjT);
            if(s1 != null) {
                cRA.XX.put(this.PjT, s1);
            }
            return s1;
        }

        @Override
        public Object call() throws Exception {
            return this.PjT();
        }
    }

    private static String JQp = null;
    public static boolean PjT = false;
    private static final CharSequence ReZ = null;
    private static final ConcurrentHashMap XX = null;
    public static boolean Zh = false;
    private static final CharSequence cr = null;
    private static int cz = 0x7FFFFFFF;

    static {
        cRA.ReZ = "amigo";
        cRA.cr = "funtouch";
        cRA.XX = new ConcurrentHashMap();
    }

    public static boolean Au() {
        String s = Build.DISPLAY;
        return !TextUtils.isEmpty(s) && s.toLowerCase().contains(cRA.ReZ);
    }

    // 去混淆评级： 低(20)
    public static String DWo() {
        return cRA.qj() ? "eui_" + cRA.cr("ro.letv.release.version") + "_" + Build.DISPLAY : "";
    }

    public static boolean JQp() {
        if(!cRA.Zh) {
            try {
                Class.forName("miui.os.Build");
                cRA.PjT = true;
                cRA.Zh = true;
                return true;
            }
            catch(Exception unused_ex) {
                cRA.Zh = true;
            }
        }
        return cRA.PjT;
    }

    public static boolean Owx() {
        try {
            String s = Build.BRAND;
            if(TextUtils.isEmpty(s) || !s.toLowerCase().startsWith("huawei")) {
                String s1 = Build.MANUFACTURER;
                return !TextUtils.isEmpty(s1) && s1.toLowerCase().startsWith("huawei");
            }
            return true;
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public static String PjT() {
        if(!TextUtils.isEmpty(cRA.JQp)) {
            return cRA.JQp;
        }
        String s = SM.PjT("sdk_local_rom_info", 604800000L);
        cRA.JQp = s;
        if(TextUtils.isEmpty(s)) {
            String s1 = cRA.Sks();
            cRA.JQp = s1;
            SM.PjT("sdk_local_rom_info", s1);
        }
        return cRA.JQp;
    }

    public static boolean PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            s = cRA.fDm();
        }
        return !TextUtils.isEmpty(s) && s.toLowerCase().startsWith("emotionui") || cRA.Owx();
    }

    public static String ReZ() {
        return cRA.cr("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    private static String ReZ(String s) {
        Throwable throwable1;
        BufferedReader bufferedReader0;
        Process process0;
        String s1 = "";
        try {
            process0 = null;
            process0 = Runtime.getRuntime().exec("getprop " + s);
            bufferedReader0 = null;
            bufferedReader0 = new BufferedReader(new InputStreamReader(process0.getInputStream()), 0x400);
        }
        catch(IllegalThreadStateException unused_ex) {
            bufferedReader0 = null;
            goto label_15;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            goto label_20;
        }
        try {
            s1 = bufferedReader0.readLine();
            process0.exitValue();
            goto label_35;
        }
        catch(IllegalThreadStateException unused_ex) {
            try {
            label_15:
                process0.destroy();
            }
            catch(Throwable unused_ex) {
            }
            if(bufferedReader0 != null) {
                try {
                    bufferedReader0.close();
                }
                catch(IOException iOException0) {
                    RD.PjT("ToolUtils", "Exception while closing InputStream", iOException0);
                    return s1;
                }
            }
            return s1;
        }
        catch(Throwable throwable1) {
        }
        try {
        label_20:
            RD.PjT("ToolUtils", "Unable to read sysprop " + s, throwable1);
        }
        catch(Throwable throwable2) {
            if(bufferedReader0 != null) {
                try {
                    bufferedReader0.close();
                }
                catch(IOException iOException1) {
                    RD.PjT("ToolUtils", "Exception while closing InputStream", iOException1);
                }
            }
            throw throwable2;
        }
        if(bufferedReader0 != null) {
            try {
                bufferedReader0.close();
                return s1;
            }
            catch(IOException iOException2) {
                RD.PjT("ToolUtils", "Exception while closing InputStream", iOException2);
            }
        }
        return s1;
        try {
        label_35:
            bufferedReader0.close();
        }
        catch(IOException iOException0) {
            RD.PjT("ToolUtils", "Exception while closing InputStream", iOException0);
        }
        return s1;
    }

    public static String SM() {
        return Build.DISPLAY + "_" + cRA.cr("ro.gn.sv.version");
    }

    private static String Sks() {
        if(cRA.qla()) {
            return cRA.xE();
        }
        if(cRA.JQp()) {
            return "";
        }
        if(cRA.Zh()) {
            return cRA.ub();
        }
        if(cRA.gK()) {
            return cRA.ltE();
        }
        String s = cRA.xs();
        if(!TextUtils.isEmpty(s)) {
            return s;
        }
        if(cRA.XX()) {
            return cRA.cz();
        }
        if(cRA.Au()) {
            return cRA.SM();
        }
        if(cRA.cr()) {
            return cRA.ReZ();
        }
        String s1 = cRA.DWo();
        return TextUtils.isEmpty(s1) ? Build.DISPLAY : s1;
    }

    public static boolean XX() {
        String s = cRA.cr("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(s) && s.toLowerCase().contains(cRA.cr);
    }

    // 去混淆评级： 低(20)
    public static boolean Zh() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    private static String cr(String s) {
        String s1 = "";
        String s2 = (String)cRA.XX.get(s);
        if(s2 != null) {
            return s2;
        }
        try {
            XX xX0 = new XX(new PjT(s), 5, 2);
            Jo.Zh(new Au("_getSystemPropertyTask") {
                @Override
                public void run() {
                    xX0.run();
                }
            });
            s1 = (String)xX0.get(1L, TimeUnit.SECONDS);
        }
        catch(Throwable unused_ex) {
        }
        return s1 == null ? "" : s1;
    }

    public static boolean cr() {
        String s = Build.MANUFACTURER + Build.BRAND;
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        String s1 = s.toLowerCase();
        return s1.contains("360") || s1.contains("qiku");
    }

    public static String cz() {
        return cRA.cr("ro.vivo.os.build.display.id") + "_" + cRA.cr("ro.vivo.product.version");
    }

    public static String fDm() [...] // 潜在的解密器

    public static boolean gK() {
        if(cRA.cz == 0x7FFFFFFF) {
            String s = Build.MANUFACTURER;
            if(!TextUtils.isEmpty(s) && s.toLowerCase().contains("oppo")) {
                cRA.cz = 1;
                return true;
            }
            cRA.cz = 0;
        }
        return cRA.cz == 1;
    }

    // 去混淆评级： 低(40)
    public static String ltE() {
        return cRA.gK() ? "coloros_" + cRA.cr("ro.build.version.opporom") + "_" + Build.DISPLAY : "";
    }

    public static boolean qj() {
        return !TextUtils.isEmpty(cRA.cr("ro.letv.release.version"));
    }

    // 去混淆评级： 低(20)
    public static boolean qla() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static String ub() {
        return Build.DISPLAY == null || !Build.DISPLAY.toLowerCase().contains("flyme") ? "" : Build.DISPLAY;
    }

    public static String xE() {
        if(cRA.qla()) {
            try {
                return "smartisan_" + cRA.cr("ro.smartisan.version");
            }
            catch(Throwable unused_ex) {
            }
        }
        return Build.DISPLAY;
    }

    // 去混淆评级： 低(20)
    public static String xf() [...] // 潜在的解密器

    // 去混淆评级： 中等(100)
    public static String xs() {
        return "";
    }
}

