package com.bytedance.sdk.openadsdk.core.xf.JQp;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.Zh.PjT.XX;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.JQp.Zh.DWo;
import com.bytedance.sdk.openadsdk.cr.JQp.Zh.SM;
import com.bytedance.sdk.openadsdk.cr.JQp.Zh.qj;
import com.bytedance.sdk.openadsdk.cr.JQp.Zh.xf;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.wN;
import org.json.JSONObject;
import t.a;
import v.b;

public class PjT {
    public static final a PjT;

    static {
        PjT.PjT = new com.bykv.vk.openvk.PjT.PjT.Zh.PjT.Zh.a();
    }

    public static void PjT(b b0, t.a.a a$a0) {
        AdSlot adSlot1;
        Owx owx0;
        boolean z = true;
        if((b0.ReZ() > 0 || b0.DWo()) && (b0.qla() != -2 && b0.qla() != 1)) {
            b0.cr(6000);
            b0.JQp(6000);
            b0.cz(6000);
            boolean z1 = b0.JQp("material_meta") != null && b0.JQp("material_meta") instanceof Owx;
            if(b0.JQp("ad_slot") == null || !(b0.JQp("ad_slot") instanceof AdSlot)) {
                z = false;
            }
            if(!z1 || !z) {
                owx0 = null;
                adSlot1 = null;
            }
            else {
                owx0 = (Owx)b0.JQp("material_meta");
                AdSlot adSlot0 = (AdSlot)b0.JQp("ad_slot");
                PjT.Zh(b0, owx0, adSlot0);
                adSlot1 = adSlot0;
            }
            long v = SystemClock.elapsedRealtime();
            com.bytedance.sdk.openadsdk.core.xf.JQp.PjT.1 pjT$10 = new t.a.a() {
                @Override  // t.a$a
                public void PjT(b b0, int v) {
                    t.a.a a$a0 = a$a0;
                    if(a$a0 != null) {
                        a$a0.PjT(b0, v);
                    }
                    if(owx0 != null && adSlot1 != null) {
                        long v1 = SystemClock.elapsedRealtime();
                        PjT.Zh(b0, owx0, adSlot1, v1 - v);
                    }
                }

                @Override  // t.a$a
                public void PjT(b b0, int v, String s) {
                    t.a.a a$a0 = a$a0;
                    if(a$a0 != null) {
                        a$a0.PjT(b0, v, s);
                    }
                    if(owx0 != null && adSlot1 != null) {
                        long v1 = SystemClock.elapsedRealtime();
                        PjT.Zh(b0, owx0, adSlot1, v1 - v, v, s);
                    }
                }

                @Override  // t.a$a
                public void Zh(b b0, int v) {
                    t.a.a a$a0 = a$a0;
                    if(a$a0 != null) {
                        a$a0.PjT(b0, v);
                    }
                    Owx owx0 = owx0;
                    if(owx0 != null) {
                        AdSlot adSlot0 = adSlot1;
                        if(adSlot0 != null) {
                            PjT.ReZ(b0, owx0, adSlot0);
                        }
                    }
                    b0.fDm();
                }
            };
            if(!PjT.PjT(b0.xs())) {
                if(a$a0 != null) {
                    a$a0.PjT(b0, 404, "unexpected url: " + b0.xs());
                }
                PjT.Zh(b0, owx0, adSlot1, SystemClock.elapsedRealtime() - v, -1, "video url is invalid");
                return;
            }
            com.bytedance.sdk.openadsdk.core.xf.JQp.PjT.2 pjT$20 = new Au("VideoPreload") {
                @Override
                public void run() {
                    if(Build.VERSION.SDK_INT >= 23) {
                        try {
                            Context context0 = ub.PjT();
                            PjT.PjT.a(context0, b0, pjT$10);
                        }
                        catch(Throwable throwable0) {
                            throwable0.getMessage();
                        }
                        return;
                    }
                    if(PjT.PjT()) {
                        j.d.a().b(b0);
                    }
                }
            };
            if(Jo.cz()) {
                Jo.Zh(pjT$20);
                return;
            }
            pjT$20.run();
            return;
        }
        if(a$a0 != null) {
            a$a0.PjT(b0, 100);
        }
    }

    public static boolean PjT() {
        return com.bytedance.sdk.openadsdk.RD.PjT.PjT("video_lower_support_discard", 0) == 0;
    }

    public static boolean PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        if(s.regionMatches(true, 0, "ws:", 0, 3)) {
            return XX.ReZ(("http:" + s.substring(3))) != null;
        }
        if(s.regionMatches(true, 0, "wss:", 0, 4)) {
            s = "https:" + s.substring(4);
        }
        return XX.ReZ(s) != null;
    }

    private static boolean PjT(b b0) {
        return Build.VERSION.SDK_INT >= 23 || b0.qla() != 0;
    }

    private static void ReZ(b b0, Owx owx0, AdSlot adSlot0) {
        if(!PjT.PjT(b0)) {
            return;
        }
        com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.Zh(new com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT(owx0, wN.ReZ(adSlot0.getDurationSlotType()), com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(owx0, null, -1, b0), new SM(b0.xs(), ((long)b0.ReZ()))));
    }

    private static void Zh(b b0, Owx owx0, AdSlot adSlot0) {
        if(!PjT.PjT(b0)) {
            return;
        }
        long v = b0.DWo() ? b0.SM() : ((long)b0.ReZ());
        ReZ.PjT("load_video_start", new com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT(owx0, wN.ReZ(adSlot0.getDurationSlotType()), com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(owx0, null, -1, b0), new qj(b0.xs(), v)));
    }

    private static void Zh(b b0, Owx owx0, AdSlot adSlot0, long v) {
        if(!PjT.PjT(b0)) {
            return;
        }
        String s = wN.ReZ(adSlot0.getDurationSlotType());
        JSONObject jSONObject0 = com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(owx0, null, -1, b0);
        xf xf0 = new xf();
        xf0.PjT(b0.xs());
        xf0.PjT(((long)b0.ReZ()));
        xf0.Zh(v);
        if(b0.ltE() == 1) {
            xf0.ReZ(1L);
        }
        else {
            xf0.ReZ(0L);
        }
        ReZ.PjT("load_video_success", new com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT(owx0, s, jSONObject0, xf0));
    }

    private static void Zh(b b0, Owx owx0, AdSlot adSlot0, long v, int v1, String s) {
        if(!PjT.PjT(b0)) {
            return;
        }
        String s1 = wN.ReZ(adSlot0.getDurationSlotType());
        JSONObject jSONObject0 = com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(owx0, null, -1, b0);
        DWo dWo0 = new DWo();
        dWo0.PjT(b0.xs());
        dWo0.PjT(((long)b0.ReZ()));
        dWo0.Zh(v);
        dWo0.PjT(v1);
        if(TextUtils.isEmpty(s)) {
            s = "";
        }
        dWo0.Zh(s);
        dWo0.ReZ("");
        com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(new com.bytedance.sdk.openadsdk.cr.JQp.Zh.PjT(owx0, s1, jSONObject0, dWo0));
    }
}

