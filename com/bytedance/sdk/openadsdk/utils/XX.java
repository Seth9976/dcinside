package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.compose.animation.core.d;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.RD.PjT;
import com.bytedance.sdk.openadsdk.core.ReZ;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class XX {
    private static final AtomicReference PjT;
    private static final AtomicReference Zh;

    static {
        XX.PjT = new AtomicReference(null);
        XX.Zh = new AtomicReference(null);
    }

    private static boolean Au() {
        try {
            if(((int)(((Integer)Class.forName("android.os.SystemProperties").getMethod("getInt", new Class[]{String.class, Integer.TYPE}).invoke(null, new Object[]{"persist.sys.muiltdisplay_type", 0})))) == 2) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("BED", "isXiaomiFold return false " + throwable0.getMessage());
        }
        return false;
    }

    private static boolean Au(Context context0) {
        try {
            Class.forName("com.unity3d.player.UnityPlayerActivity");
            return true;
        }
        catch(ClassNotFoundException unused_ex) {
            if(context0 == null) {
                return false;
            }
            try {
                return new File(context0.getApplicationInfo().nativeLibraryDir + "/libunity.so").exists();
            }
            catch(Throwable unused_ex) {
                return false;
            }
        }
    }

    private static boolean DWo() {
        try {
            Class class0 = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object object0 = class0.getMethod("getInstance", null).invoke(null, null);
            Object object1 = class0.getDeclaredMethod("hasFeature", String.class).invoke(object0, "oplus.hardware.type.fold");
            if(object1 instanceof Boolean) {
                return ((Boolean)object1).booleanValue();
            }
        }
        catch(ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException classNotFoundException0) {
            RD.Zh("BED", "get oppo fold properties error, msg: " + classNotFoundException0.getMessage());
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    private static boolean DWo(Context context0) {
        try {
            Class.forName("com.facebook.react.ReactActivity");
            return true;
        }
        catch(ClassNotFoundException unused_ex) {
            if(context0 == null) {
                return false;
            }
            try {
                return new File(context0.getApplicationInfo().nativeLibraryDir + "/libreactnativejni.so").exists();
            }
            catch(Throwable unused_ex) {
                return false;
            }
        }
    }

    public static String JQp(Context context0) {
        try {
            AtomicReference atomicReference0 = XX.Zh;
            String s = (String)atomicReference0.get();
            if(s != null) {
                return s;
            }
            PackageInfo packageInfo0 = XX.cz(context0);
            String s1 = packageInfo0 == null ? "" : packageInfo0.versionName;
            d.a(atomicReference0, null, s1);
            return s1;
        }
        catch(Throwable unused_ex) {
            d.a(XX.Zh, null, "");
            return "";
        }
    }

    private static boolean JQp() {
        if(XX.Au()) {
            return true;
        }
        try {
            String s = Build.MODEL.toLowerCase();
            if(!TextUtils.isEmpty(s)) {
                for(int v = 0; v < 6; ++v) {
                    if(s.contains(new String[]{"M2011J18C", "22061218C", "2308CPXD0C", "24072PX77C", "2405CPX3DC", "2405CPX3DG"}[v])) {
                        return true;
                    }
                }
                if(XX.Zh()) {
                    String s1 = XX.ReZ();
                    if(TextUtils.isEmpty(s1)) {
                        return false;
                    }
                    String[] arr_s = s1.split(",");
                    for(int v1 = 0; v1 < arr_s.length; ++v1) {
                        if(s.contains(arr_s[v1])) {
                            return true;
                        }
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public static String PjT() [...] // 潜在的解密器

    public static void PjT(Context context0) {
        if(context0 == null) {
            return;
        }
        try {
            if(!XX.Zh()) {
                return;
            }
            ReZ reZ0 = ReZ.PjT(context0);
            reZ0.PjT("w_ver", XX.JQp(context0));
            reZ0.PjT("bp", XX.Zh(context0));
            reZ0.PjT("is_fold", ((int)XX.XX(context0)));
            reZ0.PjT("abi", "arm64-v8a");
            reZ0.PjT("t_ver", XX.ReZ(context0));
            reZ0.PjT("aab", XX.cr(context0));
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT(JSONObject jSONObject0, Context context0) {
        if(context0 == null) {
            return;
        }
        try {
            if(!XX.Zh()) {
                return;
            }
            ReZ reZ0 = ReZ.PjT(context0);
            int v = reZ0.Zh("bp", XX.Zh(context0));
            if(v != 4) {
                jSONObject0.put("bp", v);
            }
            String s = reZ0.Zh("t_ver", XX.ReZ(context0));
            if(!TextUtils.isEmpty(s)) {
                jSONObject0.put("t_ver", s);
            }
            jSONObject0.put("is_fold", reZ0.Zh("is_fold", ((int)XX.XX(context0))));
            jSONObject0.put("aab", reZ0.Zh("aab", XX.cr(context0)));
            String s1 = reZ0.Zh("w_ver", XX.JQp(context0));
            if(!TextUtils.isEmpty(s1)) {
                jSONObject0.put("w_ver", s1);
            }
            if(!TextUtils.isEmpty("arm64-v8a")) {
                jSONObject0.put("abi", "arm64-v8a");
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public static String ReZ() {
        return PjT.PjT("fold_config", "fold_default", "");
    }

    public static String ReZ(Context context0) {
        return "35";
    }

    private static boolean SM() {
        if(XX.DWo()) {
            return true;
        }
        try {
            String s = Build.MODEL.toLowerCase();
            if(!TextUtils.isEmpty(s)) {
                for(int v = 0; v < 9; ++v) {
                    if(s.contains(new String[]{"CPH2439", "CPH2437", "CPH2499", "CPH2519", "PEUM00", "PGU110", "PGT110", "PHN110", "PHT110"}[v].toLowerCase())) {
                        return true;
                    }
                }
                if(XX.Zh()) {
                    String s1 = XX.ReZ();
                    if(TextUtils.isEmpty(s1)) {
                        return false;
                    }
                    String[] arr_s = s1.split(",");
                    for(int v1 = 0; v1 < arr_s.length; ++v1) {
                        if(s.contains(arr_s[v1].toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    private static boolean SM(Context context0) {
        try {
            Class.forName("io.flutter.embedding.android.FlutterActivity");
            return true;
        }
        catch(ClassNotFoundException unused_ex) {
            if(context0 == null) {
                return false;
            }
            try {
                return new File(context0.getApplicationInfo().nativeLibraryDir + "/libflutter.so").exists();
            }
            catch(Throwable unused_ex) {
                return false;
            }
        }
    }

    private static boolean XX() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", null).invoke(null, null));
        }
        catch(Throwable throwable0) {
            RD.Zh("BED", "isVIVOFoldDevice return false " + throwable0.getMessage());
            return false;
        }
    }

    public static boolean XX(Context context0) {
        boolean z1;
        boolean z;
        try {
            AtomicReference atomicReference0 = XX.PjT;
            Boolean boolean0 = (Boolean)atomicReference0.get();
            if(boolean0 != null) {
                return boolean0.booleanValue();
            }
            String s = Build.BRAND;
            s = TextUtils.isEmpty(s) ? Build.BRAND : s.toLowerCase();
            String s1 = Build.MANUFACTURER;
            s1 = TextUtils.isEmpty(s1) ? Build.MANUFACTURER : s1.toLowerCase();
            if(TextUtils.isEmpty(s) && TextUtils.isEmpty(s1)) {
                d.a(atomicReference0, null, Boolean.FALSE);
                return false;
            }
            if(TextUtils.isEmpty(s)) {
                z = false;
            label_25:
                z1 = false;
            }
            else {
                switch(s) {
                    case "oppo": {
                        z = XX.SM();
                        goto label_25;
                    }
                    case "samsung": {
                        z = XX.cr();
                        goto label_25;
                    }
                    case "vivo": {
                        z = XX.cz();
                        goto label_25;
                    }
                    case "xiaomi": {
                        z = XX.JQp();
                        goto label_25;
                    }
                    default: {
                        z = false;
                        z1 = true;
                    }
                }
            }
            if(z1 && !TextUtils.isEmpty(s1)) {
                switch(s1) {
                    case "oppo": {
                        z = XX.SM();
                        break;
                    }
                    case "samsung": {
                        z = XX.cr();
                        break;
                    }
                    case "vivo": {
                        z = XX.cz();
                        break;
                    }
                    case "xiaomi": {
                        z = XX.JQp();
                        break;
                    }
                    default: {
                        z = false;
                    }
                }
            }
            d.a(atomicReference0, null, Boolean.valueOf(z));
            return z;
        }
        catch(Throwable unused_ex) {
            d.a(XX.PjT, null, Boolean.FALSE);
            return false;
        }
    }

    public static int Zh(Context context0) {
        if(XX.Au(context0)) {
            return 1;
        }
        if(XX.SM(context0)) {
            return 2;
        }
        return XX.DWo(context0) ? 3 : 4;
    }

    public static boolean Zh() {
        return PjT.PjT("fold_config", "enable", 0) == 1;
    }

    public static int cr(Context context0) {
        try {
            Class.forName("com.google.android.play.core.splitinstall.SplitInstallManager");
            return 1;
        }
        catch(ClassNotFoundException unused_ex) {
            return 0;
        }
    }

    private static boolean cr() {
        if(XX.qj()) {
            return true;
        }
        try {
            String s = Build.DEVICE.toLowerCase();
            if(!TextUtils.isEmpty(s)) {
                for(int v = 0; v < 12; ++v) {
                    if(s.contains(new String[]{"winner", "f2q", "q2q", "q4q", "q5q", "q6q", "bloomq", "bloomxq", "b2q", "b4q", "b5q", "b6q"}[v])) {
                        return true;
                    }
                }
            }
            String s1 = Build.MODEL.toLowerCase();
            if(TextUtils.isEmpty(s1)) {
                return false;
            }
            for(int v1 = 0; v1 < 12; ++v1) {
                if(s1.contains(new String[]{"sm-f9000", "sm-f9160", "sm-f9260", "sm-f9360", "sm-f9460", "sm-f9560", "sm-f7000", "sm-f7070", "sm-f7110", "sm-f7210", "sm-f7310", "sm-f7410"}[v1])) {
                    return true;
                }
            }
            if(XX.Zh()) {
                String s2 = PjT.PjT("fold_config", "fold_samung", "");
                if(TextUtils.isEmpty(s2)) {
                    return false;
                }
                String[] arr_s = s2.split(",");
                for(int v2 = 0; v2 < arr_s.length; ++v2) {
                    if(s1.contains(arr_s[v2])) {
                        return true;
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public static PackageInfo cz(Context context0) {
        try {
            if(Build.VERSION.SDK_INT >= 26) {
                return WebView.getCurrentWebViewPackage();
            }
            PackageInfo packageInfo0 = (PackageInfo)Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
            return packageInfo0 == null ? XX.qj(context0) : packageInfo0;
        }
        catch(ClassNotFoundException | IllegalAccessException | InvocationTargetException | NoSuchMethodException unused_ex) {
            return null;
        }
    }

    private static boolean cz() {
        if(XX.XX()) {
            return true;
        }
        try {
            String s = Build.MODEL.toLowerCase();
            if(!TextUtils.isEmpty(s)) {
                for(int v = 0; v < 7; ++v) {
                    if(s.contains(new String[]{"V2330", "V2178A", "V2229A", "V2303A", "V2337A", "V2256A", "V2266A"}[v].toLowerCase())) {
                        return true;
                    }
                }
                if(XX.Zh()) {
                    String s1 = XX.ReZ();
                    if(TextUtils.isEmpty(s1)) {
                        return false;
                    }
                    String[] arr_s = s1.split(",");
                    for(int v1 = 0; v1 < arr_s.length; ++v1) {
                        if(s.contains(arr_s[v1].toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    private static PackageInfo qj(Context context0) {
        try {
            String s = Build.VERSION.SDK_INT > 23 ? ((String)Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null)) : ((String)Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", null).invoke(null, null));
            return s == null ? null : context0.getPackageManager().getPackageInfo(s, 0);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static boolean qj() {
        try {
            Class class0 = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object object0 = class0.getMethod("getInstance", null).invoke(null, null);
            Method method0 = class0.getDeclaredMethod("getString", String.class);
            if("TRUE".equalsIgnoreCase(((String)method0.invoke(object0, new Object[]{"SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD"})))) {
                return true;
            }
            if("TRUE".equalsIgnoreCase(((String)method0.invoke(object0, new Object[]{"SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"})))) {
                return true;
            }
        }
        catch(ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException classNotFoundException0) {
            RD.Zh("PAG_BANNER", "get ss fold device error: " + classNotFoundException0.getMessage());
        }
        return false;
    }
}

