package com.unity3d.services.core.properties;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.unity3d.services.core.log.DeviceLog;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class ClientProperties {
    private static final X500Principal DEBUG_CERT;
    private static WeakReference _activity;
    private static Application _application;
    private static Context _applicationContext;
    private static String _gameId;
    private static String _previousGameId;

    static {
        ClientProperties.DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
    }

    public static Activity getActivity() {
        return (Activity)ClientProperties._activity.get();
    }

    // 去混淆评级： 低(30)
    public static String getAppName() [...] // 潜在的解密器

    public static String getAppVersion() {
        PackageManager packageManager0 = ClientProperties.getApplicationContext().getPackageManager();
        try {
            return packageManager0.getPackageInfo("com.dcinside.app.android", 0).versionName == null ? "FakeVersionName" : packageManager0.getPackageInfo("com.dcinside.app.android", 0).versionName;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
        }
        DeviceLog.exception("Error getting package info", packageManager$NameNotFoundException0);
        return null;
    }

    public static Application getApplication() {
        return ClientProperties._application;
    }

    public static Context getApplicationContext() {
        return ClientProperties._applicationContext;
    }

    public static String getGameId() {
        return ClientProperties._gameId;
    }

    public static String getPreviousGameId() {
        return ClientProperties._previousGameId;
    }

    public static boolean isAppDebuggable() {
        boolean z1;
        int v = 0;
        if(ClientProperties.getApplicationContext() != null) {
            PackageManager packageManager0 = ClientProperties.getApplicationContext().getPackageManager();
            boolean z = true;
            try {
                ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.dcinside.app.android", 0);
                int v1 = applicationInfo0.flags & 2;
                applicationInfo0.flags = v1;
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                DeviceLog.exception("Could not find name", packageManager$NameNotFoundException0);
                z1 = false;
                goto label_16;
            }
            if(v1 == 0) {
                z = false;
            }
            z1 = z;
            z = false;
        label_16:
            if(z) {
                try {
                    Signature[] arr_signature = packageManager0.getPackageInfo("com.dcinside.app.android", 0x40).signatures;
                    while(true) {
                    label_18:
                        if(v >= arr_signature.length) {
                            return z1;
                        }
                        Signature signature0 = arr_signature[v];
                        z1 = ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature0.toByteArray()))).getSubjectX500Principal().equals(ClientProperties.DEBUG_CERT);
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
                goto label_18;
            }
            return z1;
        }
        return false;
    }

    public static void setActivity(Activity activity0) {
        ClientProperties._activity = new WeakReference(activity0);
    }

    public static void setApplication(Application application0) {
        ClientProperties._application = application0;
    }

    public static void setApplicationContext(Context context0) {
        ClientProperties._applicationContext = context0;
    }

    public static void setGameId(String s) {
        ClientProperties._previousGameId = ClientProperties._gameId;
        ClientProperties._gameId = s;
    }
}

