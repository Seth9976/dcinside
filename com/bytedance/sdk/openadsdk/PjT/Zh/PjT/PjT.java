package com.bytedance.sdk.openadsdk.PjT.Zh.PjT;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.model.fDm;

public class PjT extends com.bytedance.sdk.openadsdk.core.Au.PjT {
    private ltE PjT;
    private com.bytedance.sdk.openadsdk.PjT.Zh.PjT xs;

    public PjT(@NonNull Context context0) {
        super(context0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.PjT
    protected void PjT(View view0, int v, fDm fDm0) {
        ltE ltE0 = this.PjT;
        if(ltE0 != null) {
            ltE0.PjT(view0, v, fDm0);
        }
    }

    public void PjT(ltE ltE0) {
        this.PjT = ltE0;
        ltE0.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }

    public void setExtraFuncationHelper(com.bytedance.sdk.openadsdk.PjT.Zh.PjT pjT0) {
        this.xs = pjT0;
    }
}

