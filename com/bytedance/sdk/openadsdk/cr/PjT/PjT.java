package com.bytedance.sdk.openadsdk.cr.PjT;

import com.bytedance.sdk.openadsdk.qla.ReZ;

public class PjT {
    public static final Zh JQp;
    public static final Zh PjT;
    public static final Zh ReZ;
    public static final Zh Zh;
    public static final Zh cr;
    public static final Zh cz;

    static {
        PjT.PjT = new Zh(0);
        PjT.Zh = new Zh(1);
        PjT.ReZ = new Zh(2);
        PjT.cr = new Zh(0);
        PjT.JQp = new Zh(1);
        PjT.cz = new Zh(2);
    }

    public static void PjT() {
        try {
            Zh zh0 = PjT.PjT;
            if(zh0.XX.get()) {
                com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", zh0.PjT().toString());
            }
            Zh zh1 = PjT.Zh;
            if(zh1.XX.get()) {
                com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("tt_sdk_event_net_state", "tt_sdk_event_net_state", zh1.PjT().toString());
            }
            Zh zh2 = PjT.ReZ;
            if(zh2.XX.get()) {
                com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", zh2.PjT().toString());
            }
            Zh zh3 = PjT.cr;
            if(zh3.XX.get()) {
                com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", zh3.Zh().toString());
            }
            Zh zh4 = PjT.JQp;
            if(zh4.XX.get()) {
                com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("tt_sdk_event_db_state", "tt_sdk_event_db_state", zh4.Zh().toString());
            }
            Zh zh5 = PjT.cz;
            if(zh5.XX.get()) {
                com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", zh5.Zh().toString());
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT(Zh zh0) {
        try {
            zh0.XX.getAndSet(true);
            zh0.JQp.incrementAndGet();
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT(Zh zh0, boolean z) {
        try {
            zh0.XX.getAndSet(true);
            if(z) {
                zh0.PjT.incrementAndGet();
                return;
            }
            zh0.Zh.incrementAndGet();
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT(Zh zh0, boolean z, int v, long v1) {
        try {
            zh0.XX.getAndSet(true);
            if(z) {
                zh0.PjT.incrementAndGet();
                zh0.ReZ.addAndGet(v1);
                return;
            }
            zh0.Zh.incrementAndGet();
            Integer integer0 = (Integer)zh0.cz.get(v);
            if(integer0 != null) {
                zh0.cz.put(v, ((int)(((int)integer0) + 1)));
                return;
            }
            zh0.cz.put(v, 1);
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void Zh() {
        try {
            ReZ.Zh("net_upload_monitor", "");
            com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("tt_sdk_event_net_ad");
            ReZ.Zh("net_upload_monitor", "");
            com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("tt_sdk_event_net_state");
            ReZ.Zh("net_upload_monitor", "");
            com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("tt_sdk_event_net_trail");
            ReZ.Zh("db_upload_monitor", "");
            com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("tt_sdk_event_db_ad");
            ReZ.Zh("db_upload_monitor", "");
            com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("tt_sdk_event_db_state");
            ReZ.Zh("db_upload_monitor", "");
            com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("tt_sdk_event_db_trail");
        }
        catch(Throwable unused_ex) {
        }
    }
}

