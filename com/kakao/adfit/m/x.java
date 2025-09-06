package com.kakao.adfit.m;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build.VERSION;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.collections.l;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.internal.L;

public final class x {
    public static final x a;

    static {
        x.a = new x();
    }

    public static final PackageInfo a(Context context0, String s, int v) {
        L.p(context0, "context");
        L.p(s, "packageName");
        try {
            return context0.getPackageManager().getPackageInfo(s, v);
        }
        catch(Exception exception0) {
            f.e(("Failed to get application package info. [package=" + s + "][error=" + exception0 + ']'));
            return null;
        }
    }

    public static PackageInfo a(Context context0, String s, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            s = "com.dcinside.app.android";
            L.o("com.dcinside.app.android", "context.packageName");
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return x.a(context0, s, v);
    }

    public static final String a(Context context0) {
        L.p(context0, "context");
        try {
            ApplicationInfo applicationInfo0 = context0.getApplicationInfo();
            L.o(applicationInfo0, "context.applicationInfo");
            int v = applicationInfo0.labelRes;
            if(v != 0) {
                String s = context0.getString(v);
                L.o(s, "context.getString(stringId)");
                return s;
            }
            CharSequence charSequence0 = applicationInfo0.nonLocalizedLabel;
            return charSequence0 == null ? applicationInfo0.loadLabel(context0.getPackageManager()).toString() : charSequence0.toString();
        }
        catch(Exception exception0) {
        }
        f.e(("Failed to get application name. [error=" + exception0 + ']'));
        return "unknown";
    }

    public static final String a(Context context0, String s) {
        L.p(context0, "context");
        L.p(s, "packageName");
        try {
            String s1 = context0.getPackageManager().getInstallerPackageName(s);
            if(s1 != null && s1.length() > 0) {
                return s1;
            }
        }
        catch(Exception exception0) {
            f.e(("Failed to get application installer name. [package=" + s + "][error=" + exception0 + ']'));
        }
        return "unknown";
    }

    // 去混淆评级： 低(25)
    public static final String a(PackageInfo packageInfo0) {
        L.p(packageInfo0, "packageInfo");
        return packageInfo0.applicationInfo == null ? "unknown" : "35";
    }

    public static final String a(Signature signature0, String s) {
        String s1;
        L.p(signature0, "signature");
        L.p(s, "algorithm");
        try {
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(signature0.toByteArray());
            try {
                Certificate certificate0 = CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream0);
                L.n(certificate0, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                byte[] arr_b = MessageDigest.getInstance(s).digest(((X509Certificate)certificate0).getEncoded());
                L.o(arr_b, "publicKey");
                s1 = x.a(arr_b);
            }
            catch(Throwable throwable0) {
                c.a(byteArrayInputStream0, throwable0);
                throw throwable0;
            }
            c.a(byteArrayInputStream0, null);
            return s1;
        }
        catch(Exception unused_ex) {
            return "unknown";
        }
    }

    private static final String a(byte[] arr_b) {
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length * 2);
        for(int v = 0; v < arr_b.length; ++v) {
            String s = Integer.toHexString(arr_b[v]);
            int v1 = s.length();
            if(v1 == 1) {
                stringBuilder0.append('0');
                stringBuilder0.append(s);
            }
            else if(v1 == 2) {
                stringBuilder0.append(s);
            }
            else if(v1 > 2) {
                stringBuilder0.append(s, v1 - 2, v1);
            }
        }
        String s1 = stringBuilder0.toString();
        L.o(s1, "builder.toString()");
        return s1;
    }

    public static final Signature b(Context context0, String s) {
        L.p(context0, "context");
        L.p(s, "packageName");
        if(Build.VERSION.SDK_INT >= 28) {
            PackageInfo packageInfo0 = x.a(context0, s, 0x8000000);
            if(packageInfo0 != null) {
                SigningInfo signingInfo0 = packageInfo0.signingInfo;
                if(signingInfo0 != null) {
                    Signature[] arr_signature = signingInfo0.getApkContentsSigners();
                    return arr_signature == null ? null : ((Signature)l.nc(arr_signature));
                }
            }
            return null;
        }
        PackageInfo packageInfo1 = x.a(context0, s, 0x40);
        if(packageInfo1 != null) {
            return packageInfo1.signatures == null ? null : ((Signature)l.nc(packageInfo1.signatures));
        }
        return null;
    }

    public static final String b(Context context0) {
        L.p(context0, "context");
        PackageInfo packageInfo0 = x.a(context0, null, 0, 6, null);
        if(packageInfo0 != null) {
            String s = x.c(packageInfo0);
            return s == null ? "unknown" : s;
        }
        return "unknown";
    }

    public static final String b(PackageInfo packageInfo0) {
        L.p(packageInfo0, "packageInfo");
        return Build.VERSION.SDK_INT < 28 ? String.valueOf(packageInfo0.versionCode) : String.valueOf(packageInfo0.getLongVersionCode());
    }

    public static final int c(Context context0, String s) {
        L.p(context0, "context");
        L.p(s, "packageName");
        Signature signature0 = x.b(context0, s);
        return signature0 == null ? 0 : signature0.hashCode();
    }

    public static final String c(PackageInfo packageInfo0) {
        L.p(packageInfo0, "packageInfo");
        return packageInfo0.versionName == null ? "unknown" : packageInfo0.versionName;
    }

    public static final boolean d(Context context0, String s) {
        L.p(context0, "context");
        L.p(s, "packageName");
        try {
            Object object0 = context0.getSystemService("activity");
            L.n(object0, "null cannot be cast to non-null type android.app.ActivityManager");
            List list0 = ((ActivityManager)object0).getRunningAppProcesses();
            if(list0 == null) {
                list0 = u.H();
            }
            for(Object object1: list0) {
                if(!L.g(s, ((ActivityManager.RunningAppProcessInfo)object1).processName)) {
                    continue;
                }
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }
}

