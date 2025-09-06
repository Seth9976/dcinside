package com.fsn.cauly.Y;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.Window;
import com.fsn.cauly.Logger.LogLevel;
import com.fsn.cauly.Logger;
import com.fsn.cauly.blackdragoncore.utils.g.b;
import com.fsn.cauly.blackdragoncore.utils.g;
import com.fsn.cauly.blackdragoncore.utils.j;
import com.fsn.cauly.blackdragoncore.utils.n;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.IOException;
import java.util.Locale;

public class m0 {
    public static boolean a = false;
    public static String b = "3.5.30";
    public static String c = "3d-na";
    public static String d = "gid";
    public static String e = "app_set_id";
    public static int f = 1800000;
    public static String g = "Android";

    static {
    }

    public static String a() {
        return Build.MODEL.replace(" ", "_");
    }

    public static String a(Activity activity0) {
        return activity0 == null ? "" : activity0.getLocalClassName().hashCode() + "";
    }

    public static String a(String s) {
        if(TextUtils.isEmpty(s)) {
            return "btn_site.png";
        }
        if(s.equalsIgnoreCase("app")) {
            return "btn_market.png";
        }
        if(s.equalsIgnoreCase("skt")) {
            return "btn_tstore.png";
        }
        if(s.equalsIgnoreCase("video")) {
            return "btn_video.png";
        }
        return s.equalsIgnoreCase("call") ? "btn_call.png" : "btn_site.png";
    }

    public static String a(String s, String s1) {
        return s1 + "/" + s.replace("http://", "").replace(":", "_").replace("/", "_").replace("&", "_").replace("?", "_");
    }

    public static String a(String s, boolean z) {
        if(TextUtils.isEmpty(s)) {
            return "a_black.png";
        }
        if("black,blue,brown,gray,green,lblue,pink,purple,red".contains(s)) {
            return z ? "b_" + s + ".png" : "a_" + s + ".png";
        }
        return z ? "b_black.png" : "a_black.png";
    }

    public static boolean a(Context context0) {
        if(context0 != null) {
            try {
                PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo("com.dcinside.app.android", 1);
                int v = 0;
                while(true) {
                    ActivityInfo[] arr_activityInfo = packageInfo0.activities;
                    if(v >= arr_activityInfo.length) {
                        break;
                    }
                    if(!"com.fsn.cauly.blackdragoncore.LandingActivity".equalsIgnoreCase(arr_activityInfo[v].name)) {
                        ++v;
                        continue;
                    }
                    return true;
                }
                return false;
            }
            catch(Exception unused_ex) {
            }
        }
        return false;
    }

    public static String b() {
        return Locale.getDefault().getLanguage();
    }

    public static boolean b(Context context0) {
        return ((ActivityManager)context0.getApplicationContext().getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 0x20000;
    }

    public static int[] b(String s) {
        if(TextUtils.isEmpty(s)) {
            return new int[]{0xFF080808, 0xFF7B7B7B};
        }
        if(s.equalsIgnoreCase("blue")) {
            return new int[]{0xFF3C569E, -10648094};
        }
        if(s.equalsIgnoreCase("brown")) {
            return new int[]{-10599382, 0xFF926B45};
        }
        if(s.equalsIgnoreCase("gray")) {
            return new int[]{0xFF838383, 0xFFB1B1B1};
        }
        if(s.equalsIgnoreCase("green")) {
            return new int[]{0xFF65890D, -6107107};
        }
        if(s.equalsIgnoreCase("lblue")) {
            return new int[]{-14441540, 0xFF77CED4};
        }
        if(s.equalsIgnoreCase("pink")) {
            return new int[]{0xFFE86E8C, 0xFFF9A3C0};
        }
        if(s.equalsIgnoreCase("purple")) {
            return new int[]{0xFF454279, 0xFF6E69B7};
        }
        return s.equalsIgnoreCase("red") ? new int[]{0xFF850202, 0xFFC60202} : new int[]{0xFF080808, 0xFF7B7B7B};
    }

    public static String c() {
        return Build.MANUFACTURER.replace(" ", "_");
    }

    public static String c(Context context0) {
        String s = j.a(context0, "APP_SET_ID_SCOPE", "");
        String s1 = j.a(context0, "PREV_APP_SET_ID_SCOPE", "");
        if(!m0.n(context0)) {
            return s == null || s.isEmpty() ? s1 : s;
        }
        return "";
    }

    public static void c(Context context0, boolean z) {
        class a implements Runnable {
            final Context a;
            final boolean b;

            a(Context context0, boolean z) {
                this.b = z;
                super();
            }

            @Override
            public void run() {
                try {
                    String s = AdvertisingIdClient.getAdvertisingIdInfo(this.a).getId();
                    g.a(b.d, "ad_id:" + s);
                    Logger.writeLog(LogLevel.Info, "ad_id:" + s);
                    if(AdvertisingIdClient.getAdvertisingIdInfo(this.a).isLimitAdTrackingEnabled() && s.equals("00000000-0000-0000-0000-000000000000") || s.equals("")) {
                        j.b(this.a, "IS_GA_ID", false);
                        m0.e(this.a, this.b);
                        return;
                    }
                    if(this.b) {
                        j.b(this.a, "GID", s);
                        j.b(this.a, "IS_GA_ID", true);
                        return;
                    }
                    j.b(this.a, "GID", s);
                    j.b(this.a, "IS_GA_ID", true);
                    if(j.a(this.a, "PREV_GID", "").length() <= 0) {
                        j.b(this.a, "PREV_GID", s);
                        return;
                    }
                    return;
                }
                catch(IllegalStateException illegalStateException0) {
                }
                catch(GooglePlayServicesRepairableException googlePlayServicesRepairableException0) {
                    m0.d(this.a, this.b);
                    googlePlayServicesRepairableException0.printStackTrace();
                    return;
                }
                catch(IOException iOException0) {
                    m0.d(this.a, this.b);
                    iOException0.printStackTrace();
                    return;
                }
                catch(GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException0) {
                    m0.d(this.a, this.b);
                    googlePlayServicesNotAvailableException0.printStackTrace();
                    return;
                }
                catch(Exception exception0) {
                    m0.d(this.a, this.b);
                    exception0.printStackTrace();
                    return;
                }
                catch(Throwable throwable0) {
                    m0.d(this.a, this.b);
                    g.a(b.b, throwable0.getMessage());
                    return;
                }
                m0.d(this.a, this.b);
                illegalStateException0.printStackTrace();
            }
        }

        AsyncTask.execute(new a(context0, z));
    }

    public static String d() {
        return Build.VERSION.RELEASE;
    }

    public static String d(Context context0) {
        return Environment.getDataDirectory().getAbsolutePath() + "/data/" + "com.dcinside.app.android" + "/cauly";
    }

    public static void d(Context context0, boolean z) {
        class c implements Runnable {
            final Context a;
            final boolean b;

            c(Context context0, boolean z) {
                this.b = z;
                super();
            }

            @Override
            public void run() {
                try {
                    com.fsn.cauly.blackdragoncore.utils.a.b a$b0 = com.fsn.cauly.blackdragoncore.utils.a.a(this.a.getApplicationContext());
                    if((!AdvertisingIdClient.getAdvertisingIdInfo(this.a).isLimitAdTrackingEnabled() || !a$b0.a().equals("00000000-0000-0000-0000-000000000000")) && !a$b0.a().equals("")) {
                        if(this.b) {
                            j.b(this.a, "IS_GA_ID", true);
                            j.b(this.a, "GID", a$b0.a());
                            return;
                        }
                        j.b(this.a, "IS_GA_ID", true);
                        j.b(this.a, "GID", a$b0.a());
                        if(j.a(this.a, "PREV_GID", "").length() <= 0) {
                            j.b(this.a, "PREV_GID", a$b0.a());
                        }
                        return;
                    }
                    j.b(this.a, "IS_GA_ID", false);
                }
                catch(Exception unused_ex) {
                }
            }
        }

        new Thread(new c(context0, z)).start();
    }

    public static String e(Context context0) {
        return m0.d(context0) + "/image";
    }

    private static void e(Context context0, boolean z) {
        class com.fsn.cauly.Y.m0.b implements OnSuccessListener {
            final boolean a;
            final Context b;

            com.fsn.cauly.Y.m0.b(boolean z, Context context0) {
                this.b = context0;
                super();
            }

            public void a(AppSetIdInfo appSetIdInfo0) {
                int v = appSetIdInfo0.getScope();
                String s = appSetIdInfo0.getId();
                g.a(b.d, "app_set_id:" + s + ", app_set_id_scope:" + v);
                Logger.writeLog(LogLevel.Info, "app_set_id:" + s + ", app_set_id_scope:" + v);
                if(this.a) {
                    j.b(this.b, "APP_SET_ID", s);
                    j.b(this.b, "APP_SET_ID_SCOPE", String.valueOf(v));
                    return;
                }
                j.b(this.b, "APP_SET_ID", s);
                if(j.a(this.b, "PREV_APP_SET_ID", "").length() <= 0) {
                    j.b(this.b, "PREV_APP_SET_ID", s);
                }
                j.b(this.b, "APP_SET_ID_SCOPE", String.valueOf(v));
                if(j.a(this.b, "PREV_APP_SET_ID_SCOPE", "").length() <= 0) {
                    j.b(this.b, "PREV_APP_SET_ID_SCOPE", String.valueOf(v));
                }
            }

            @Override  // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Object object0) {
                this.a(((AppSetIdInfo)object0));
            }
        }

        AppSet.getClient(context0).getAppSetIdInfo().addOnSuccessListener(new com.fsn.cauly.Y.m0.b(z, context0));
    }

    public static String f(Context context0) {
        return m0.d(context0) + "/" + "xconf.cauly.co.kr";
    }

    public static String g(Context context0) {
        try {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
            if(Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(connectivityManager0.getActiveNetwork());
                if(networkCapabilities0 == null) {
                    return "-";
                }
                if(!networkCapabilities0.hasTransport(1)) {
                    return networkCapabilities0.hasTransport(0) ? "4G" : "";
                }
            }
            else {
                NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
                if(networkInfo0 == null) {
                    return "-";
                }
                switch(networkInfo0.getType()) {
                    case 0: {
                        return "4G";
                    }
                    case 1: {
                        break;
                    }
                    default: {
                        return "";
                    }
                }
            }
            return "WIFI";
        }
        catch(Exception unused_ex) {
            return "permission";
        }
    }

    public static String h(Context context0) {
        String s = j.a(context0, "PREV_GID", "");
        String s1 = j.a(context0, "PREV_APP_SET_ID", "");
        return m0.n(context0) ? s : s1;
    }

    public static String i(Context context0) {
        String s = j.a(context0, "GID", "");
        String s1 = j.a(context0, "APP_SET_ID", "");
        return m0.n(context0) ? s : s1;
    }

    // 去混淆评级： 中等(60)
    public static String j(Context context0) {
        return m0.n(context0) ? "gid" : "app_set_id";
    }

    public static int k(Context context0) {
        return 35;
    }

    public static boolean l(Context context0) {
        if(context0 != null && context0 instanceof Activity) {
            Activity activity0 = (Activity)context0;
            Window window0 = activity0.getWindow();
            if(window0 != null && (window0.getAttributes().flags & 0x1000000) != 0) {
                return true;
            }
            try {
                if((activity0.getPackageManager().getActivityInfo(activity0.getComponentName(), 0).flags & 0x200) != 0) {
                    return true;
                }
            }
            catch(Exception unused_ex) {
            }
        }
        return false;
    }

    public static boolean m(Context context0) {
        if(j.a(context0, "IS_EMULATOR")) {
            return j.a(context0, "IS_EMULATOR", false);
        }
        boolean z = n.a(context0);
        j.b(context0, "IS_EMULATOR", z);
        return z;
    }

    public static boolean n(Context context0) {
        return j.a(context0, "IS_GA_ID", true);
    }
}

