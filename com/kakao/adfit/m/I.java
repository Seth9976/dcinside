package com.kakao.adfit.m;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import com.kakao.adfit.a.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONObject;

public final class i {
    public static final class a {
        private final String a;
        private final String b;

        public a(String s, String s1) {
            L.p(s, "name");
            L.p(s1, "hash");
            super();
            this.a = s;
            this.b = s1;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        // 去混淆评级： 低(40)
        @Override
        public boolean equals(Object object0) {
            return this == object0 ? true : object0 instanceof a && (L.g(this.a, ((a)object0).a) && L.g(this.b, ((a)object0).b));
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() * 0x1F + this.b.hashCode();
        }
    }

    public static final i a;
    private static List b;
    private static long c;
    private static String d;
    private static long e;

    static {
        i.a = new i();
        i.b = u.H();
    }

    private final String a(List list0) {
        if(list0.isEmpty()) {
            return null;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: list0) {
            stringBuilder0.append(((a)object0).a());
            stringBuilder0.append(",");
        }
        stringBuilder0.setLength(stringBuilder0.length() - 1);
        return stringBuilder0.toString();
    }

    private final List a(List list0, Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        List list1 = new ArrayList();
        for(Object object0: list0) {
            a i$a0 = (a)object0;
            String s = i$a0.b();
            i i0 = i.a;
            L.o(packageManager0, "packageManager");
            if(!i0.a(packageManager0, s)) {
            }
            else if(L.g(s, "com.google.android.apps.kids.familylinkhelper")) {
                ComponentName componentName0 = new ComponentName("com.google.android.gms", "com.google.android.gms.kids.account.receiver.ProfileOwnerReceiver");
                Object object1 = context0.getSystemService("device_policy");
                L.n(object1, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
                if(!((DevicePolicyManager)object1).isAdminActive(componentName0)) {
                    continue;
                }
                list1.add(i$a0);
            }
            else {
                List list2 = i0.b(packageManager0, s);
                if(!list2.isEmpty()) {
                    Object object2 = context0.getSystemService("device_policy");
                    L.n(object2, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
                    DevicePolicyManager devicePolicyManager0 = (DevicePolicyManager)object2;
                    for(Object object3: list2) {
                        if(!i.a.a(devicePolicyManager0, ((ResolveInfo)object3))) {
                            continue;
                        }
                        goto label_28;
                    }
                    object3 = null;
                label_28:
                    if(object3 != null) {
                        list1.add(i$a0);
                    }
                }
            }
        }
        return list1;
    }

    private final boolean a(DevicePolicyManager devicePolicyManager0, ResolveInfo resolveInfo0) {
        try {
            return devicePolicyManager0.isAdminActive(new ComponentName(resolveInfo0.activityInfo.packageName, resolveInfo0.activityInfo.name));
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    private final boolean a(PackageManager packageManager0, String s) {
        try {
            packageManager0.getPackageInfo(s, 0);
            return true;
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    public static boolean a(i i0, Context context0, t t0, D d0, int v, Object object0) {
        if((v & 4) != 0) {
            d0 = D.a.a();
        }
        return i0.a(context0, t0, d0);
    }

    public final String a(Context context0) {
        L.p(context0, "context");
        long v = SystemClock.elapsedRealtime();
        if(v < i.e) {
            return i.d;
        }
        if(i.b.isEmpty()) {
            List list0 = this.b(context0);
            i.b = list0;
            if(list0.isEmpty()) {
                i.b = this.a();
            }
        }
        String s = this.a(this.a(i.b, context0));
        i.d = s;
        i.e = v + 1800000L;
        return s;
    }

    public final List a() {
        return u.O(new a[]{new a("com.google.android.apps.kids.familylinkhelper", "3105b7"), new a("com.skt.tjunior", "c8b1c9"), new a("kr.co.safet.sk", "4ee2a9"), new a("app.kids360.kid", "c466a2"), new a("com.mobilefence.family", "bf7ab6 "), new a("ua.com.tim_berners.parental_control", "708818"), new a("com.lguplus.mdm.cleanmobile", "eb2f75"), new a("com.jiran.xkeeper.mobile", "d4cec9"), new a("com.jiran.xkeeperguard", "aed245"), new a("com.dolabs.ibchild", "c3ac41"), new a("com.jiran.xkeeper.mobile.ahn", "a06b48"), new a("com.jiran.xkmonitor_Ahnlab.onestore", "fd1fef"), new a("com.mobipintech.childrenfence.children", "f7a581"), new a("kr.co.kiwiplus.kiwichild", "aa0e4d"), new a("com.awesomeit.geminiagent", "eddf8d")});
    }

    public final List a(JSONArray jSONArray0) {
        L.p(jSONArray0, "src");
        int v = jSONArray0.length();
        if(v <= 0) {
            return u.H();
        }
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            JSONObject jSONObject0 = jSONArray0.optJSONObject(v1);
            if(jSONObject0 != null) {
                String s = q.e(jSONObject0, "name");
                String s1 = q.e(jSONObject0, "key");
                if(s != null && s.length() > 0 && s1 != null && s1.length() > 0) {
                    list0.add(new a(s, s1));
                }
            }
        }
        return list0;
    }

    public final boolean a(Context context0, t t0, D d0) {
        List list0 = null;
        L.p(context0, "context");
        L.p(d0, "time");
        long v = d0.a();
        if(v < i.c) {
            return false;
        }
        JSONArray jSONArray0 = t0 == null ? null : t0.a();
        if(jSONArray0 != null) {
            list0 = i.a.a(jSONArray0);
        }
        if(list0 != null && !list0.isEmpty() && !L.g(list0, i.b)) {
            i.b = list0;
            i.e = 0L;
            i.c = v + 1800000L;
            B.a(context0).edit().putString("adfit-bplist", jSONArray0.toString()).apply();
            return true;
        }
        i.c = v;
        return false;
    }

    private final List b(Context context0) {
        String s = B.a(context0).getString("adfit-bplist", null);
        if(s != null && s.length() > 0) {
            try {
                return this.a(new JSONArray(s));
            }
            catch(Exception unused_ex) {
            }
        }
        return u.H();
    }

    private final List b(PackageManager packageManager0, String s) {
        Intent intent0 = new Intent("android.app.action.DEVICE_ADMIN_ENABLED");
        intent0.setPackage(s);
        try {
            List list0 = packageManager0.queryBroadcastReceivers(intent0, 0);
            return list0 == null ? u.H() : list0;
        }
        catch(Exception unused_ex) {
            return u.H();
        }
    }
}

