package com.bytedance.sdk.openadsdk.ub;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import java.util.List;
import org.json.JSONObject;

public class ReZ {
    private static volatile PjT PjT;
    private static volatile HandlerThread ReZ;
    private static Boolean Zh;
    private static volatile Handler cr;

    static {
        ReZ.ReZ = Au.PjT("pag__bus_monitor", 0);
    }

    private static Handler JQp() {
        if(ReZ.ReZ != null && ReZ.ReZ.isAlive()) {
            if(ReZ.cr == null) {
                Class class0 = fDm.class;
                __monitor_enter(class0);
                try {
                    if(ReZ.cr == null) {
                        ReZ.cr = new Handler(ReZ.ReZ.getLooper());
                    }
                    __monitor_exit(class0);
                    return ReZ.cr;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(class0);
                throw throwable0;
            }
            return ReZ.cr;
        }
        Class class1 = fDm.class;
        __monitor_enter(class1);
        try {
            if(ReZ.ReZ == null || !ReZ.ReZ.isAlive()) {
                ReZ.ReZ = Au.PjT("csj_init_handle", -1);
                ReZ.cr = new Handler(ReZ.ReZ.getLooper());
            }
            __monitor_exit(class1);
            return ReZ.cr;
        }
        catch(Throwable throwable1) {
        }
        __monitor_exit(class1);
        throw throwable1;
    }

    public static PjT PjT() {
        if(ReZ.PjT == null) {
            Class class0 = ReZ.class;
            __monitor_enter(class0);
            try {
                if(ReZ.PjT == null) {
                    ReZ.PjT = PjT.PjT(new Zh() {
                        @Override  // com.bytedance.sdk.openadsdk.ub.Zh
                        public Context getContext() {
                            return ub.PjT();
                        }

                        @Override  // com.bytedance.sdk.openadsdk.ub.Zh
                        public Handler getHandler() {
                            return ReZ.JQp();
                        }

                        @Override  // com.bytedance.sdk.openadsdk.ub.Zh
                        public int getOnceLogCount() {
                            int v = com.bytedance.sdk.openadsdk.RD.PjT.PjT("bus_monitor_config", "once_count", 10);
                            return v > 100 || v < 5 ? 10 : v;
                        }

                        @Override  // com.bytedance.sdk.openadsdk.ub.Zh
                        public int getOnceLogInterval() {
                            int v = com.bytedance.sdk.openadsdk.RD.PjT.PjT("bus_monitor_config", "once_interval", 10000);
                            return v >= 10000 ? v : 10000;
                        }

                        @Override  // com.bytedance.sdk.openadsdk.ub.Zh
                        public HandlerThread getSafeHandlerThread(String s, int v) {
                            return Au.PjT(s, v);
                        }

                        @Override  // com.bytedance.sdk.openadsdk.ub.Zh
                        public int getUploadIntervalTime() {
                            int v = com.bytedance.sdk.openadsdk.RD.PjT.PjT("bus_monitor_config", "interval", 43200000);
                            return v >= 3600000 ? v : 86400000;
                        }

                        @Override  // com.bytedance.sdk.openadsdk.ub.Zh
                        public boolean isMonitorOpen() {
                            boolean z = false;
                            if(ReZ.Zh != null) {
                                return ReZ.Zh.booleanValue();
                            }
                            if(com.bytedance.sdk.openadsdk.RD.PjT.PjT("bus_monitor_config", "enable", 0) == 1) {
                                z = true;
                            }
                            ReZ.Zh = Boolean.valueOf(z);
                            return ReZ.Zh.booleanValue();
                        }

                        @Override  // com.bytedance.sdk.openadsdk.ub.Zh
                        public void onMonitorUpload(List list0) {
                            if(list0 != null && !list0.isEmpty()) {
                                for(Object object0: list0) {
                                    com.bytedance.sdk.openadsdk.qla.ReZ.PjT();
                                    com.bytedance.sdk.openadsdk.qla.ReZ.PjT("bus_monitor", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
                                        final com.bytedance.sdk.openadsdk.ub.ReZ.1 Zh;

                                        @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                                        public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                                            JSONObject jSONObject0 = new JSONObject();
                                            try {
                                                jSONObject0.put("sdk_version", "");
                                                jSONObject0.put("scene", "");
                                                jSONObject0.put("start_count", ((com.bytedance.sdk.openadsdk.ub.Zh.PjT)object0).cr());
                                                jSONObject0.put("success_count", ((com.bytedance.sdk.openadsdk.ub.Zh.PjT)object0).JQp());
                                                jSONObject0.put("fail_count", ((com.bytedance.sdk.openadsdk.ub.Zh.PjT)object0).cz());
                                                jSONObject0.put("rit", "");
                                                jSONObject0.put("tag", "");
                                                jSONObject0.put("label", "");
                                                jSONObject0.put("mediation", "");
                                                jSONObject0.put("is_init", ((com.bytedance.sdk.openadsdk.ub.Zh.PjT)object0).xf());
                                                jSONObject0.put("extra", "");
                                                return cr.Zh().PjT("bus_monitor").Zh(jSONObject0.toString());
                                            }
                                            catch(Exception exception0) {
                                                RD.PjT("BusMonitorUtils", "onMonitorUpload: ", exception0);
                                                return null;
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    });
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

    public static void PjT(com.bytedance.sdk.openadsdk.ub.cr cr0) {
        ReZ.PjT().PjT(new JQp(cr0, 1, 0, 0));
    }

    public static void ReZ(com.bytedance.sdk.openadsdk.ub.cr cr0) {
        ReZ.PjT().PjT(new JQp(cr0, 0, 0, 1));
    }

    public static void Zh() {
        ReZ.PjT().PjT(true);
    }

    public static void Zh(com.bytedance.sdk.openadsdk.ub.cr cr0) {
        ReZ.PjT().PjT(new JQp(cr0, 0, 1, 0));
    }
}

