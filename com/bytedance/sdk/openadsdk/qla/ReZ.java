package com.bytedance.sdk.openadsdk.qla;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf;
import com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.io.File;
import org.json.JSONObject;

public class ReZ {
    private static volatile ReZ PjT;

    public static long PjT(File file0) {
        if(file0.isFile()) {
            return file0.length();
        }
        File[] arr_file = file0.listFiles();
        long v = 0L;
        for(int v1 = 0; v1 < arr_file.length; ++v1) {
            v += ReZ.PjT(arr_file[v1]);
        }
        return v;
    }

    public static ReZ PjT() {
        if(ReZ.PjT == null) {
            Class class0 = ReZ.class;
            __monitor_enter(class0);
            try {
                if(ReZ.PjT == null) {
                    ReZ.PjT = new ReZ();
                }
                __monitor_exit(class0);
                return ReZ.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return ReZ.PjT;
    }

    public static void PjT(int v, String s) {
        ReZ.PjT(v, s, 0, null);
    }

    public static void PjT(int v, String s, int v1, String s1) {
        ReZ.PjT("ipv6_req", false, new Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            @Nullable
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                String s;
                JSONObject jSONObject0 = new JSONObject();
                int v = v;
                if(v == 1) {
                    s = "success";
                }
                else if(v == -1) {
                    jSONObject0.put("error_code", v1);
                    jSONObject0.put("error_msg", s1);
                    s = "fail";
                }
                else {
                    s = "start";
                }
                if(!TextUtils.isEmpty(s)) {
                    jSONObject0.put("url", s);
                }
                jSONObject0.put("status", s);
                return cr.Zh().PjT("ipv6_req").Zh(jSONObject0.toString());
            }
        });
    }

    public static void PjT(long v, long v1, String s, int v2) {
        if(v == 0L) {
            return;
        }
        long v3 = SystemClock.elapsedRealtime();
        ReZ.PjT("ad_show_cost_time", false, new Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("duration", v3 - v);
                jSONObject0.put("renderDuration", v3 - v1);
                jSONObject0.put("showToRenderDuration", v1 - v);
                jSONObject0.put("tag", s);
                jSONObject0.put("renderType", v2);
                return cr.Zh().PjT("ad_show_cost_time").Zh(jSONObject0.toString());
            }
        });
    }

    public static void PjT(Owx owx0) {
        if(owx0 == null) {
            return;
        }
        ReZ.PjT("bidding_receive", false, new Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            @Nullable
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("reveice_ts", System.currentTimeMillis());
                if(owx0.kW() == 3) {
                    jSONObject0.put("is_icon_only", ((int)owx0.Pv()));
                }
                return cr.Zh().PjT("bidding_receive").Zh(jSONObject0.toString());
            }
        });
    }

    public static void PjT(Owx owx0, long v) {
        if(owx0 == null) {
            return;
        }
        ReZ.PjT("bidding_load", false, new Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            @Nullable
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("duration", v);
                return cr.Zh().PjT("bidding_load").Zh(jSONObject0.toString());
            }
        });
    }

    public static void PjT(Owx owx0, JSONObject jSONObject0) {
        if(wN.PjT(owx0) != null && !TextUtils.isEmpty(owx0.MN())) {
            ReZ.PjT("download_gecko_end", false, new Zh() {
                @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                @Nullable
                public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("url", owx0.xu());
                    jSONObject0.put("channel_name", owx0.MN());
                    jSONObject0.put("data", jSONObject0);
                    return cr.Zh().PjT("download_gecko_end").PjT(owx0.kW()).Zh(jSONObject0.toString());
                }
            });
        }
    }

    public static void PjT(String s, PjT pjT0) {
        if(pjT0 == null) {
            return;
        }
        ReZ.PjT(s, false, new Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            @Nullable
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = pjT0.ReZ();
                if(jSONObject0 == null) {
                    jSONObject0 = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.cr.JQp.Zh.ReZ reZ0 = pjT0.cr();
                if(reZ0 != null) {
                    reZ0.PjT(jSONObject0);
                }
                int v = pjT0.PjT().kW();
                return cr.Zh().PjT(s).PjT(v).Zh(jSONObject0.toString());
            }
        });
    }

    public static void PjT(String s, boolean z) {
        ReZ.PjT("img_error_param", false, new Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            @Nullable
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("is_new", ((int)z));
                    jSONObject0.put("msg", s);
                }
                catch(Throwable unused_ex) {
                }
                return cr.Zh().PjT("img_error_param").Zh(jSONObject0.toString());
            }
        });
    }

    public static void PjT(String s, boolean z, Zh zh0) {
        int v = 0;
        int v1 = xs.Gr().Zh(s);
        if(!TextUtils.isEmpty(s) && v1 != 0 && zh0 != null) {
            int v2 = v1 == 100 ? 1 : 0;
            if(v2 == 0) {
                if(((int)(Math.random() * 100.0 + 1.0)) <= v1) {
                    v = 1;
                }
                v2 = v;
            }
            if(v2 != 0) {
                ub.JQp().PjT(zh0, z);
            }
        }
    }

    public void PjT(long v, long v1) {
        ReZ.PjT("general_label", false, new Zh() {
            final ReZ cr;

            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                boolean z = fDm.Zh.get();
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("starttime", v);
                    jSONObject0.put("endtime", v1);
                    jSONObject0.put("start_type", !z);
                }
                catch(Throwable unused_ex) {
                }
                return cr.Zh().PjT("general_label").Au(String.valueOf(v1 - v)).Zh(jSONObject0.toString());
            }
        });
    }

    public void PjT(cr cr0) {
        if(this.ReZ(cr0)) {
            return;
        }
        cr0.PjT("express_ad_render");
        ub.JQp().PjT(new Zh() {
            final ReZ Zh;

            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                return cr0;
            }
        });
    }

    public void PjT(String s) {
        ReZ.PjT("click_playable_test_tool", false, new Zh() {
            final ReZ Zh;

            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("playable_url", s);
                }
                catch(Throwable unused_ex) {
                }
                return cr.Zh().PjT("click_playable_test_tool").Zh(jSONObject0.toString());
            }
        });
    }

    public void PjT(String s, int v, String s1) {
        ReZ.PjT("use_playable_test_tool_error", false, new Zh() {
            final ReZ cr;

            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("playable_url", s);
                    jSONObject0.put("error_code", v);
                    jSONObject0.put("error_message", s1);
                }
                catch(Throwable unused_ex) {
                }
                return cr.Zh().PjT("use_playable_test_tool_error").Zh(jSONObject0.toString());
            }
        });
    }

    public void PjT(String s, String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            ReZ.PjT(s, false, new Zh() {
                final ReZ ReZ;

                @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                    return cr.Zh().PjT(s).Zh(s1);
                }
            });
        }
    }

    public void PjT(String s, JSONObject jSONObject0) {
        if(s != null && jSONObject0 != null) {
            ReZ.PjT(s, false, new Zh() {
                final ReZ ReZ;

                @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                    return cr.Zh().PjT(s).Zh(jSONObject0.toString());
                }
            });
        }
    }

    public void PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            RD.PjT("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object object0 = jSONObject0.opt("device_ad_mediation_platform");
        if(object0 instanceof String && !TextUtils.isEmpty(((String)object0))) {
            RD.PjT("adRevenuePangle", new Object[]{"pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject0});
            ReZ.PjT("ad_revenue", true, new Zh() {
                final ReZ Zh;

                @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                    try {
                        jSONObject0.put("event", 0x110);
                        String s = xf.ReZ(ub.PjT());
                        jSONObject0.put("uuid", s);
                        String s1 = "";
                        try {
                            if(xf.PjT(ub.PjT()) != null) {
                                s1 = xf.PjT(ub.PjT());
                            }
                        }
                        catch(Throwable throwable1) {
                            throwable1.getMessage();
                        }
                        jSONObject0.put("device_id", s1);
                        jSONObject0.put("platform", "android");
                        jSONObject0.put("partner", "PangleSDK");
                        return cr.Zh().PjT("ad_revenue").Zh(jSONObject0.toString());
                    }
                    catch(Throwable throwable0) {
                        throwable0.getMessage();
                        return cr.Zh().PjT("ad_revenue").Zh(jSONObject0.toString());
                    }
                }
            });
            return;
        }
        RD.PjT("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
    }

    public static void ReZ(String s, String s1) {
        ReZ.PjT("playable_url_mime", false, new Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            @Nullable
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    String s = "not validate";
                    String s1 = TextUtils.isEmpty(s) ? "not validate" : s;
                    jSONObject0.put("original_mime", s1);
                    String s2 = MimeTypeMap.getFileExtensionFromUrl(s1);
                    String s3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s2);
                    if(!TextUtils.isEmpty(s3)) {
                        s = s3;
                    }
                    jSONObject0.put("new_mime", s);
                    jSONObject0.put("url", s1);
                    jSONObject0.put("is_same", ((int)s1.equals(s)));
                }
                catch(Throwable unused_ex) {
                }
                return cr.Zh().PjT("playable_url_mime").Zh(jSONObject0.toString());
            }
        });
    }

    private boolean ReZ(cr cr0) {
        return cr0 == null;
    }

    public void ReZ() {
        ReZ.PjT("blind_mode_status", true, new Zh() {
            final ReZ PjT;

            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                return cr.Zh().PjT("blind_mode_status");
            }
        });
    }

    public static void Zh() {
        Jo.ReZ(new Au("showFailLog") {
            @Override
            public void run() {
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    ReZ.PjT().PjT("show_fail_log", jSONObject0);
                }
                catch(Throwable throwable0) {
                    RD.Zh("StatsLogManager", throwable0.getMessage());
                }
            }
        });
    }

    public static void Zh(Owx owx0) {
        if(wN.PjT(owx0) != null && !TextUtils.isEmpty(owx0.MN())) {
            ReZ.PjT("download_gecko_start", false, new Zh() {
                @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                @Nullable
                public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("url", owx0.xu());
                    jSONObject0.put("channel_name", owx0.MN());
                    return cr.Zh().PjT("download_gecko_start").PjT(owx0.kW()).Zh(jSONObject0.toString());
                }
            });
        }
    }

    public static void Zh(String s, String s1) {
        try {
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                cr cr0 = cr.Zh().PjT(s).Zh(s1);
                ub.JQp().PjT(new Zh() {
                    @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                    public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                        return cr0;
                    }
                }, false);
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("StatsLogManager", throwable0.getMessage());
        }
    }

    public void Zh(cr cr0) {
        if(this.ReZ(cr0)) {
            return;
        }
        cr0.PjT("show_backup_endcard");
        ub.JQp().PjT(new Zh() {
            final ReZ Zh;

            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                return cr0;
            }
        });
    }

    public void Zh(String s) {
        ReZ.PjT("close_playable_test_tool", false, new Zh() {
            final ReZ Zh;

            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("playable_url", s);
                }
                catch(Throwable unused_ex) {
                }
                return cr.Zh().PjT("close_playable_test_tool").Zh(jSONObject0.toString());
            }
        });
    }

    public static void cr() {
        ReZ.PjT("disk_log", false, new Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                File file0 = new File(CacheDirFactory.getRootDir());
                long v = 0L;
                if(file0.exists() && file0.isDirectory()) {
                    File[] arr_file = file0.listFiles();
                    for(int v1 = 0; v1 < arr_file.length; ++v1) {
                        File file1 = arr_file[v1];
                        long v2 = ReZ.PjT(file1);
                        v += v2;
                        jSONObject0.put(file1.getName(), v2);
                    }
                }
                return v < 0x1F400000L ? null : cr.Zh().PjT("disk_log").Zh(jSONObject0.toString());
            }
        });
    }
}

