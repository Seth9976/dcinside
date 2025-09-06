package com.bytedance.sdk.openadsdk.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Lrd;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.wN;
import org.json.JSONObject;

public class IPMiBroadcastReceiver extends BroadcastReceiver {
    private static volatile IPMiBroadcastReceiver PjT;
    private PjT ReZ;
    private final LruCache Zh;
    private int cr;

    private IPMiBroadcastReceiver() {
        this.cr = 0;
        int v = 10;
        int v1 = com.bytedance.sdk.openadsdk.RD.PjT.PjT("ip_data_config", "ip_ad_cache_count", 10);
        if(v1 > 0 && v1 <= 200) {
            v = v1;
        }
        this.Zh = new LruCache(v);
    }

    public static IPMiBroadcastReceiver PjT(Context context0) {
        if(com.bytedance.sdk.openadsdk.RD.PjT.PjT("ip_data_config", "ip_link_listener", 0) == 0) {
            return null;
        }
        if(IPMiBroadcastReceiver.PjT == null) {
            Class class0 = IPMiBroadcastReceiver.class;
            __monitor_enter(class0);
            try {
                if(IPMiBroadcastReceiver.PjT == null) {
                    IPMiBroadcastReceiver.PjT = new IPMiBroadcastReceiver();
                    IntentFilter intentFilter0 = new IntentFilter("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                    if(Build.VERSION.SDK_INT < 34 || wN.DWo(context0) < 34) {
                        context0.registerReceiver(IPMiBroadcastReceiver.PjT, intentFilter0);
                    }
                    else {
                        context0.registerReceiver(IPMiBroadcastReceiver.PjT, intentFilter0, 2);
                    }
                }
                __monitor_exit(class0);
                return IPMiBroadcastReceiver.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return IPMiBroadcastReceiver.PjT;
    }

    public static void PjT(Context context0, Owx owx0) {
        if(IPMiBroadcastReceiver.PjT != null) {
            return;
        }
        if(owx0 != null) {
            Lrd lrd0 = owx0.ceO();
            if(lrd0 != null && lrd0.XX()) {
                fDm.Zh().post(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            IPMiBroadcastReceiver.PjT(ub.PjT(context0));
                        }
                        catch(Throwable throwable0) {
                            RD.Zh("IPMiBroadcastReceiver", throwable0.getMessage());
                        }
                    }
                });
            }
        }
    }

    // 去混淆评级： 低(20)
    public Owx PjT(String s) {
        return TextUtils.isEmpty(s) ? null : ((Owx)this.Zh.get(s));
    }

    public void PjT() {
        this.ReZ = null;
    }

    public void PjT(PjT pjT0) {
        this.ReZ = pjT0;
    }

    public void PjT(String s, Owx owx0) {
        if(!TextUtils.isEmpty(s) && owx0 != null && this.Zh.get(s) == null) {
            this.Zh.put(s, owx0);
        }
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent0.getAction())) {
            Jo.ReZ(new Au("ip-mi") {
                final IPMiBroadcastReceiver Zh;

                @Override
                public void run() {
                    int v4;
                    int v6;
                    int v3;
                    int v1;
                    int v = 0;
                    try {
                        v1 = intent0.getIntExtra("errorCode", 0);
                        if(v1 < 0) {
                            int v2 = intent0.getIntExtra("reason", 0);
                            if(v1 == -4 && v2 == -1) {
                                return;
                            }
                            v3 = v2;
                        }
                        else {
                            v3 = 0;
                        }
                        if(v1 == 5) {
                            int v5 = intent0.getIntExtra("status", 0);
                            if(v5 != -2) {
                                v4 = v5;
                                v6 = 0;
                                goto label_24;
                            }
                            v = intent0.getIntExtra("progress", 0);
                            goto label_20;
                        }
                        else {
                            v4 = 0;
                            v6 = 0;
                        }
                        goto label_24;
                    }
                    catch(Throwable throwable0) {
                        RD.Zh("IPMiBroadcastReceiver", throwable0.getMessage());
                        return;
                    }
                    try {
                        v = intent0.getIntExtra("progress", 0);
                        goto label_20;
                    }
                    catch(Throwable unused_ex) {
                        try {
                            IPMiBroadcastReceiver.this.cr = 1;
                        label_20:
                            if(v < 100) {
                                return;
                            }
                            v4 = -2;
                            v6 = v;
                        label_24:
                            String s = intent0.getStringExtra("packageName");
                            PjT pjT0 = IPMiBroadcastReceiver.this.ReZ;
                            if(v1 > 0 && pjT0 != null) {
                                pjT0.PjT(s, v1);
                            }
                            Owx owx0 = IPMiBroadcastReceiver.this.PjT(s);
                            if(owx0 != null) {
                                ReZ.PjT(System.currentTimeMillis(), owx0, wN.PjT(owx0), "ip_listener_log", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                                    final com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.1 cz;

                                    @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                                    public JSONObject PjT() {
                                        JSONObject jSONObject0 = new JSONObject();
                                        try {
                                            JSONObject jSONObject1 = new JSONObject();
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("ip_error_code", v1);
                                            Owx owx0 = owx0;
                                            if(owx0 != null) {
                                                jSONObject2.put("ip_is_w2a", owx0.XX());
                                            }
                                            int v = v1;
                                            if(v > 0) {
                                                if(v == 5) {
                                                    jSONObject2.put("ip_status", v4);
                                                    jSONObject2.put("ip_exec_type", IPMiBroadcastReceiver.this.cr);
                                                }
                                                if(v4 == -2) {
                                                    jSONObject2.put("ip_progress", v6);
                                                }
                                            }
                                            if(v1 < 0) {
                                                jSONObject2.put("ip_reason", v3);
                                            }
                                            jSONObject1.put("pag_json_data", jSONObject2.toString());
                                            jSONObject0.put("ad_extra_data", jSONObject1);
                                            return jSONObject0;
                                        }
                                        catch(Throwable throwable0) {
                                        }
                                        RD.Zh("IPMiBroadcastReceiver", throwable0.getMessage());
                                        return jSONObject0;
                                    }
                                });
                            }
                            return;
                        }
                        catch(Throwable throwable0) {
                        }
                    }
                    RD.Zh("IPMiBroadcastReceiver", throwable0.getMessage());
                }
            });
        }
    }
}

