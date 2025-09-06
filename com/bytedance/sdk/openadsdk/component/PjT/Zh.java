package com.bytedance.sdk.openadsdk.component.PjT;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.Au.Au;
import com.bytedance.sdk.openadsdk.core.Au.SM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.XX;
import java.util.HashMap;

public class Zh {
    public static PjT PjT(Owx owx0, Activity activity0, com.bytedance.sdk.openadsdk.component.Au.PjT pjT0) {
        PjT pjT1 = new PjT(activity0.getApplicationContext(), owx0, "open_ad", 4, pjT0);
        pjT1.PjT(activity0.findViewById(0x1020002));
        pjT1.Zh(activity0.findViewById(0x1F000011));
        Zh.PjT(activity0.getApplicationContext(), owx0, pjT1);
        Zh.PjT(pjT1, owx0);
        return pjT1;
    }

    public static SM PjT(Owx owx0, Activity activity0, com.bytedance.sdk.openadsdk.component.Au.PjT pjT0, com.bytedance.sdk.openadsdk.component.SM.Zh zh0) {
        SM sM0 = new SM(activity0, owx0, "open_ad", 4) {
            @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh
            public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("duration", pjT0.Zh());
                this.PjT(hashMap0);
                super.PjT(view0, f, f1, f2, f3, sparseArray0, z);
            }
        };
        sM0.PjT(zh0);
        Zh.PjT(activity0.getApplicationContext(), owx0, sM0);
        Zh.PjT(sM0, owx0);
        return sM0;
    }

    private static void PjT(Context context0, Owx owx0, com.bytedance.sdk.openadsdk.core.Zh.Zh zh0) {
        if(owx0 != null && owx0.cI() == 4) {
            zh0.PjT(XX.PjT(context0, owx0, "open_ad"));
        }
    }

    public static void PjT(com.bytedance.sdk.openadsdk.core.Zh.Zh zh0, Owx owx0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("click_area", owx0.ub());
        hashMap0.put("openad_creative_type", (Owx.JQp(owx0) ? "video_normal_ad" : "image_normal_ad"));
        hashMap0.put("click_scence", ((int)(cRA.ReZ(owx0) ? 3 : 1)));
        zh0.PjT(hashMap0);
    }

    public static Au Zh(Owx owx0, Activity activity0, com.bytedance.sdk.openadsdk.component.Au.PjT pjT0, com.bytedance.sdk.openadsdk.component.SM.Zh zh0) {
        Au au0 = new Au(activity0.getApplicationContext(), owx0, "open_ad", 4) {
            @Override  // com.bytedance.sdk.openadsdk.core.Zh.PjT
            public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("duration", pjT0.Zh());
                this.PjT(hashMap0);
                super.PjT(view0, f, f1, f2, f3, sparseArray0, z);
            }
        };
        au0.PjT(zh0);
        Zh.PjT(activity0.getApplicationContext(), owx0, au0);
        Zh.PjT(au0, owx0);
        return au0;
    }
}

