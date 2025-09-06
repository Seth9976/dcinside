package com.bytedance.sdk.openadsdk.component.PjT;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.Lrd.Zh.JQp;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import java.util.HashMap;

public class PjT extends com.bytedance.sdk.openadsdk.core.Zh.PjT {
    private final com.bytedance.sdk.openadsdk.component.Au.PjT PjT;

    public PjT(@NonNull Context context0, @NonNull Owx owx0, @NonNull String s, int v, com.bytedance.sdk.openadsdk.component.Au.PjT pjT0) {
        super(context0, owx0, s, v);
        this.PjT = pjT0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Zh.PjT
    public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
        if(view0.getTag() == "open_ad_click_button_tag") {
            this.PjT("click_bar");
        }
        else {
            this.PjT("click_material");
        }
        HashMap hashMap0 = new HashMap();
        hashMap0.put("duration", this.PjT.Zh());
        this.PjT(hashMap0);
        super.PjT(view0, f, f1, f2, f3, sparseArray0, z);
        JQp.PjT(this.cz, 9);
    }
}

