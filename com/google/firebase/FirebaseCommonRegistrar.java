package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.g;
import com.google.firebase.platforminfo.c;
import com.google.firebase.platforminfo.h;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    private static final String a = "fire-android";
    private static final String b = "fire-core";
    private static final String c = "device-name";
    private static final String d = "device-model";
    private static final String e = "device-brand";
    private static final String f = "android-target-sdk";
    private static final String g = "android-min-sdk";
    private static final String h = "android-platform";
    private static final String i = "android-installer";
    private static final String j = "kotlin";

    // 检测为 Lambda 实现
    private static String e(Context context0) [...]

    // 检测为 Lambda 实现
    private static String f(Context context0) [...]

    // 检测为 Lambda 实现
    private static String g(Context context0) [...]

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        List list0 = new ArrayList();
        list0.add(c.b());
        list0.add(g.g());
        list0.add(h.b("fire-android", "33"));
        list0.add(h.b("fire-core", "21.0.0"));
        list0.add(h.b("device-name", FirebaseCommonRegistrar.i(Build.PRODUCT)));
        list0.add(h.b("device-model", FirebaseCommonRegistrar.i(Build.DEVICE)));
        list0.add(h.b("device-brand", FirebaseCommonRegistrar.i(Build.BRAND)));
        list0.add(h.c("android-target-sdk", (Context context0) -> (context0.getApplicationInfo() == null ? "" : "35")));
        list0.add(h.c("android-min-sdk", (Context context0) -> {
            ApplicationInfo applicationInfo0 = context0.getApplicationInfo();
            return applicationInfo0 == null || Build.VERSION.SDK_INT < 24 ? "" : String.valueOf(applicationInfo0.minSdkVersion);
        }));
        list0.add(h.c("android-platform", (Context context0) -> {
            int v = Build.VERSION.SDK_INT;
            if(context0.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                return "tv";
            }
            if(context0.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                return "watch";
            }
            if(v >= 23 && context0.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                return "auto";
            }
            return v < 26 || !context0.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "" : "embedded";
        }));
        list0.add(h.c("android-installer", (Context context0) -> {
            String s = context0.getPackageManager().getInstallerPackageName("com.dcinside.app.android");
            return s == null ? "" : FirebaseCommonRegistrar.i(s);
        }));
        list0.add(h.b("kotlin", "2.0.0"));
        return list0;
    }

    // 检测为 Lambda 实现
    private static String h(Context context0) [...]

    private static String i(String s) {
        return s.replace(' ', '_').replace('/', '_');
    }
}

