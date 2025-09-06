package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.Lrd;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.PjT;
import com.bytedance.sdk.openadsdk.core.model.RD;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class Zh {
    private static final SparseArray PjT;

    static {
        Zh.PjT = new SparseArray();
    }

    public static Owx PjT(Intent intent0, Bundle bundle0, com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0) {
        Owx owx0 = null;
        if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            PjT pjT0 = Lrd.PjT().XX();
            if(pjT0 != null) {
                owx0 = new RD(pjT0);
            }
            if(zh0 != null) {
                zh0.PjT(bundle0);
            }
            Lrd.PjT().cz();
        }
        else if(intent0 != null) {
            try {
                String s = intent0.getStringExtra("multi_process_ad_info");
                if(s != null) {
                    owx0 = new RD(PjT.ReZ(new JSONObject(s)));
                }
            }
            catch(Exception exception0) {
                com.bytedance.sdk.component.utils.RD.PjT("TTAD.RFDM", "", exception0);
            }
        }
        if(bundle0 != null) {
            try {
                int v = bundle0.getInt("meta_tmp");
                WeakReference weakReference0 = (WeakReference)Zh.PjT.get(v);
                if(weakReference0 != null) {
                    owx0 = (Owx)weakReference0.get();
                }
            }
            catch(Throwable throwable0) {
                com.bytedance.sdk.component.utils.RD.PjT("TTAD.RFDM", "", throwable0);
            }
        }
        if(owx0 != null) {
            owx0.PjT(owx0.Sks(), 7);
        }
        return owx0;
    }

    public static void PjT(Intent intent0, Activity activity0, boolean z, PjT pjT0, String s) {
        int v;
        if(activity0 == null) {
            intent0.addFlags(0x10000000);
            goto label_7;
        }
        else {
            try {
                v = activity0.getWindowManager().getDefaultDisplay().getRotation();
                goto label_8;
            }
            catch(Exception exception0) {
                com.bytedance.sdk.component.utils.RD.PjT("TTAD.RFDM", "", exception0);
            }
        label_7:
            v = 0;
        }
    label_8:
        intent0.putExtra("orientation_angle", v);
        intent0.putExtra("video_is_cached", z);
        if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            JSONObject jSONObject0 = pjT0.xs();
            if(jSONObject0 == null) {
                return;
            }
            intent0.putExtra("multi_process_ad_info", jSONObject0.toString());
            intent0.putExtra("multi_process_listener_key", s);
            return;
        }
        Lrd.PjT().cz();
        Lrd.PjT().PjT(pjT0);
    }

    public static void PjT(Intent intent0, com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        if(intent0 == null) {
            return;
        }
        boolean z = false;
        boolean z1 = intent0.getBooleanExtra("video_is_cached", false);
        pjT0.tT.Zh(z1);
        pjT0.tY = intent0.getStringExtra("multi_process_listener_key");
        if(intent0.getIntExtra("orientation_angle", 0) == 3) {
            z = true;
        }
        pjT0.Xe = z;
    }

    public static void PjT(Bundle bundle0, com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        if(bundle0 == null) {
            return;
        }
        pjT0.tY = bundle0.getString("multi_process_listener_key");
        boolean z = bundle0.getBoolean("video_is_cached", false);
        pjT0.tT.Zh(z);
        pjT0.xH = bundle0.getBoolean("is_mute");
        if(bundle0.getLong("video_current") > 0L) {
            long v = bundle0.getLong("video_current", 0L);
            pjT0.tT.PjT(v);
        }
        pjT0.PjT(bundle0.getBoolean("has_show_skip_btn"));
    }

    public static void PjT(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0, Intent intent0, Bundle bundle0) {
        Zh.PjT(intent0, pjT0);
        Zh.PjT(bundle0, pjT0);
    }

    public static void PjT(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0, Bundle bundle0) {
        if(bundle0 == null) {
            return;
        }
        try {
            WeakReference weakReference0 = new WeakReference(pjT0.Zh);
            Zh.PjT.append(pjT0.Zh.hashCode(), weakReference0);
            bundle0.putInt("meta_tmp", pjT0.Zh.hashCode());
            bundle0.putString("multi_process_listener_key", pjT0.tY);
            bundle0.putBoolean("video_is_cached", pjT0.tT.cRA());
            bundle0.putLong("video_current", pjT0.tT.XX());
            bundle0.putBoolean("is_mute", pjT0.xH);
            bundle0.putBoolean("has_show_skip_btn", pjT0.kFP);
        }
        catch(Throwable throwable0) {
            com.bytedance.sdk.component.utils.RD.PjT("TTAD.RFDM", "onSaveInstanceState: ", throwable0);
        }
    }
}

