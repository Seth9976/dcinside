package com.apm.insight;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.entity.b;
import com.apm.insight.k.j;
import com.apm.insight.l.m.a;
import com.apm.insight.l.m;
import j..util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {
    protected static MonitorCrash a;
    private MonitorCrash b;
    private static volatile ConcurrentHashMap c;

    static {
        d.c = new ConcurrentHashMap();
    }

    private d(MonitorCrash monitorCrash0) {
        this.b = monitorCrash0;
        b.a(this);
        com.apm.insight.j.b.c();
        j.e();
    }

    static d a(String s) {
        return (d)d.c.get(s);
    }

    public static Object a() {
        return d.a;
    }

    static void a(Context context0, MonitorCrash monitorCrash0) {
        d.a = monitorCrash0;
        Npth.init(context0, new ICommonParams() {
            @Override  // com.apm.insight.ICommonParams
            public final Map getCommonParams() {
                JSONObject jSONObject0 = new d(monitorCrash0).d();
                Map map0 = new HashMap();
                if(jSONObject0 != null) {
                    Iterator iterator0 = jSONObject0.keys();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        ((HashMap)map0).put(((String)object0), jSONObject0.opt(((String)object0)));
                    }
                }
                return map0;
            }

            // 去混淆评级： 低(40)
            @Override  // com.apm.insight.ICommonParams
            public final String getDeviceId() {
                return TextUtils.isEmpty(monitorCrash0.mConfig.mDeviceId) ? "" : monitorCrash0.mConfig.mDeviceId;
            }

            @Override  // com.apm.insight.ICommonParams
            public final List getPatchInfo() {
                return null;
            }

            @Override  // com.apm.insight.ICommonParams
            public final Map getPluginInfo() {
                return null;
            }

            @Override  // com.apm.insight.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override  // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }
        });
    }

    static void a(MonitorCrash monitorCrash0) {
        d d0 = new d(monitorCrash0);
        if(monitorCrash0.mConfig != null) {
            d.c.put(monitorCrash0.mConfig.mAid, d0);
        }
    }

    @Nullable
    public final JSONArray a(StackTraceElement[] arr_stackTraceElement, Throwable throwable0) {
        return this.a(arr_stackTraceElement, throwable0, null);
    }

    @Nullable
    public final JSONArray a(StackTraceElement[] arr_stackTraceElement, Throwable throwable0, String s) {
        String[] arr_s = this.b.mConfig.mPackageName;
        if(arr_s == null) {
            return new JSONArray().put(new a(0, arr_stackTraceElement.length).a());
        }
        if(throwable0 != null && arr_stackTraceElement != null) {
            JSONArray jSONArray0 = m.a(arr_stackTraceElement, arr_s);
            if(s != null && this.b.mConfig.mThreadList != null && com.apm.insight.a.a(jSONArray0)) {
                String[] arr_s1 = this.b.mConfig.mThreadList;
                for(int v = 0; v < arr_s1.length; ++v) {
                    if(TextUtils.equals(arr_s1[v], s)) {
                        jSONArray0.put(new a(0, arr_stackTraceElement.length).a());
                    }
                }
            }
            return jSONArray0;
        }
        return null;
    }

    public final JSONArray a(String[] arr_s) {
        return this.b.config().mPackageName == null ? new JSONArray().put(new a(0, arr_s.length).a()) : m.a(arr_s, this.b.mConfig.mPackageName);
    }

    public final JSONObject a(CrashType crashType0, JSONArray jSONArray0) {
        JSONObject jSONObject1;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("header", this.d());
            if(crashType0 != null) {
                AttachUserData attachUserData0 = this.b.mCustomData;
                if(attachUserData0 == null) {
                    jSONObject1 = null;
                }
                else {
                    Map map0 = attachUserData0.getUserData(crashType0);
                    jSONObject1 = map0 == null ? null : new JSONObject(map0);
                }
                jSONObject0.put("custom", jSONObject1);
                jSONObject0.put("filters", new JSONObject(this.b.mTagMap));
            }
            jSONObject0.put("line_num", jSONArray0);
        }
        catch(Throwable unused_ex) {
        }
        return jSONObject0;
    }

    public final boolean a(Object object0) {
        return this.b == object0;
    }

    public final boolean a(String s, String s1) {
        return this.b.config().mPackageName == null ? true : b.a(s, com.apm.insight.a.a(this.b.mConfig.mSoList), s1, com.apm.insight.a.a(this.b.mConfig.mThreadList));
    }

    public final String b() {
        return this.b.mConfig.mAid;
    }

    public final JSONObject c() {
        return this.d();
    }

    @Nullable
    private JSONObject d() {
        JSONObject jSONObject0 = new JSONObject();
        if(this.b.mConfig.mPackageName == null) {
            try {
                PackageInfo packageInfo0 = e.g().getPackageManager().getPackageInfo("com.dcinside.app.android", 0x80);
                if(packageInfo0 != null) {
                    Config monitorCrash$Config0 = this.b.mConfig;
                    if(monitorCrash$Config0.mVersionInt == -1L) {
                        monitorCrash$Config0.mVersionInt = (long)packageInfo0.versionCode;
                    }
                    if(monitorCrash$Config0.mVersionStr == null) {
                        monitorCrash$Config0.mVersionStr = packageInfo0.versionName;
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
        }
        if(TextUtils.isEmpty(this.b.mConfig.mDeviceId) || "0".equals(this.b.mConfig.mDeviceId)) {
            Config monitorCrash$Config1 = this.b.mConfig;
            monitorCrash$Config1.mDeviceId = e.c().a();
        }
        try {
            jSONObject0.put("aid", String.valueOf(this.b.mConfig.mAid));
            jSONObject0.put("update_version_code", this.b.mConfig.mVersionInt);
            jSONObject0.put("version_code", this.b.mConfig.mVersionInt);
            jSONObject0.put("app_version", this.b.mConfig.mVersionStr);
            jSONObject0.put("channel", this.b.mConfig.mChannel);
            jSONObject0.put("package", com.apm.insight.a.a(this.b.mConfig.mPackageName));
            jSONObject0.put("device_id", this.b.mConfig.mDeviceId);
            jSONObject0.put("user_id", this.b.mConfig.mUID);
            jSONObject0.put("ssid", this.b.mConfig.mSSID);
            jSONObject0.put("os", "Android");
            jSONObject0.put("so_list", com.apm.insight.a.a(this.b.mConfig.mSoList));
            jSONObject0.put("thread_list", com.apm.insight.a.a(this.b.mConfig.mThreadList));
            jSONObject0.put("single_upload", 0);
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }
}

