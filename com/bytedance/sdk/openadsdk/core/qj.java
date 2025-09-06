package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.iZZ;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.core.SM.Zh;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.multipro.cr.cr;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public class qj {
    static class PjT implements com.bytedance.sdk.component.utils.iZZ.PjT {
        private static final AtomicBoolean PjT;
        private static volatile long Zh;

        static {
            PjT.PjT = new AtomicBoolean(false);
            PjT.Zh = -1L;
        }

        public static void PjT() {
            if(PjT.PjT.compareAndSet(false, true)) {
                PjT.Zh = System.currentTimeMillis();
                iZZ.PjT(new PjT(), ub.PjT());
            }
        }

        @Override  // com.bytedance.sdk.component.utils.iZZ$PjT
        public void PjT(Context context0, Intent intent0, boolean z, int v) {
            if(System.currentTimeMillis() - PjT.Zh < 2000L) {
                return;
            }
            if(v != 0) {
                qj.ReZ();
                qj.ReZ(xf.PjT(ub.PjT()));
                this.Zh();
            }
        }

        public void Zh() {
            iZZ.PjT(this);
        }
    }

    private static final AtomicInteger PjT;
    private static final AtomicBoolean Zh;

    static {
        qj.PjT = new AtomicInteger(0);
        qj.Zh = new AtomicBoolean(false);
    }

    public static void PjT(String s) {
        AtomicBoolean atomicBoolean0 = qj.Zh;
        if(atomicBoolean0.compareAndSet(false, true)) {
            if(!ltE.Au(ub.PjT())) {
                atomicBoolean0.set(false);
                return;
            }
            PjT.PjT();
            qj.ReZ(s);
        }
    }

    private static void ReZ() {
        qj.PjT.set(0);
    }

    // 检测为 Lambda 实现
    private static void ReZ(String s) [...]

    private static void Zh(String s, String s1) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            if(jSONObject0.optInt("cypher") != 4) {
                ReZ.PjT(-1, s1, 1, "cypher type error");
                return;
            }
            Pair pair0 = PangleEncryptManager.decryptType4(jSONObject0.optString("message"));
            if(pair0.second != null) {
                JSONObject jSONObject1 = new JSONObject(((String)pair0.second));
                switch(jSONObject1.optString("ip_type")) {
                    case "invalid": {
                        return;
                    }
                    case "ipv4": {
                        return;
                    }
                    case "ipv6": {
                        if(jSONObject1.has("ip")) {
                            String s2 = jSONObject1.optString("ip");
                            cr.PjT("ttopenadsdk", "key_ipv6", s2);
                            HashMap hashMap0 = new HashMap();
                            hashMap0.put("key_ipv6", s2);
                            Zh.Zh().PjT(hashMap0);
                            ReZ.PjT(1, s1);
                            return;
                        }
                        ReZ.PjT(-1, s1, 4, "no ip");
                        return;
                    }
                    default: {
                        ReZ.PjT(-1, s1, 3, "no ip type ");
                        return;
                    }
                }
            }
            ReZ.PjT(-1, s1, 2, "decrypt failed " + ((int)(((Integer)pair0.first))));
        }
        catch(JSONException unused_ex) {
            ReZ.PjT(-1, s1, 2, "decrypt failed, wrong data ");
        }
    }

    private static boolean Zh(JSONObject jSONObject0) {
        return jSONObject0 != null && jSONObject0.length() > 0;
    }

    private static void cr() {
        if(qj.PjT.getAndIncrement() <= 0) {
            Jo.PjT().schedule(() -> {
                Jo.ReZ(new Au("ipv6") {
                    @Override
                    public void run() {
                        JSONObject jSONObject1;
                        String s = wN.xs();
                        ReZ.PjT(0, s);
                        if(TextUtils.isEmpty(s)) {
                            ReZ.PjT(-1, s, -1, "domain is null");
                            return;
                        }
                        com.bytedance.sdk.component.XX.Zh.cr cr0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().Zh();
                        String s1 = "https://" + s + "/service/2/dual_events/";
                        try {
                            cr0.Zh(s1);
                            JSONObject jSONObject0 = new JSONObject();
                            jSONObject0.put("connect_type", iZZ.PjT(ub.PjT(), 0L));
                            jSONObject0.put("device_id", Long.parseLong(xf.PjT(ub.PjT())));
                            jSONObject0.put("header", com.bytedance.sdk.openadsdk.cr.PjT.ReZ.PjT().Zh());
                            if(xs.Gr().PjT(CryptDataScene.APP_LOG)) {
                                jSONObject1 = PangleEncryptManager.encryptType4(jSONObject0, new RD(CryptDataScene.DUAL_EVENT));
                                if(jSONObject1 == null || jSONObject1.optInt("cypher") != 4) {
                                    Sks.Zh(false);
                                }
                                else {
                                    Sks.Zh(true);
                                    cr0.Zh("x-pgli18n", "4");
                                    cr0.Zh("Content-Type", "application/json; charset=utf-8");
                                }
                            }
                            else {
                                jSONObject1 = com.bytedance.sdk.component.utils.PjT.PjT(jSONObject0);
                                if(qj.Zh(jSONObject1)) {
                                    cr0.Zh("Content-Encoding", "union_sdk_encode");
                                }
                            }
                            if(qj.Zh(jSONObject1)) {
                                jSONObject0 = jSONObject1;
                            }
                            cr0.Zh("Content-Type", "application/json; charset=utf-8");
                            cr0.Zh("User-Agent", wN.ReZ());
                            cr0.PjT(jSONObject0);
                            cr0.PjT(6);
                            cr0.PjT("send_i_p_v6");
                            cr0.PjT(new com.bytedance.sdk.component.XX.PjT.PjT() {
                                final com.bytedance.sdk.openadsdk.core.qj.1 Zh;

                                @Override  // com.bytedance.sdk.component.XX.PjT.PjT
                                public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
                                    if(zh0.cz()) {
                                        qj.Zh(zh0.cr(), s1);
                                        return;
                                    }
                                    ReZ.PjT(-1, s1, zh0.PjT(), zh0.Zh());
                                    qj.cr();
                                }

                                @Override  // com.bytedance.sdk.component.XX.PjT.PjT
                                public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0) {
                                    if(iOException0 != null) {
                                        ReZ.PjT(-1, s1, 1, iOException0.getMessage());
                                    }
                                    qj.cr();
                                }
                            });
                            return;
                        }
                        catch(Exception exception0) {
                        }
                        ReZ.PjT(-1, s1, -2, exception0.getMessage());
                        com.bytedance.sdk.component.utils.RD.Zh(("build ipv6 request failed:" + exception0.getMessage()), new Object[0]);
                    }
                });
            }, 10000L, TimeUnit.MILLISECONDS);
        }

        final class com.bytedance.sdk.openadsdk.core.qj.2 implements Runnable {
            @Override
            public void run() {
                qj.ReZ(xf.PjT(ub.PjT()));
            }
        }

    }
}

