package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.utils.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class XX extends Button {
    public XX(Context context0) {
        super(context0);
        this.PjT();
    }

    private void PjT() {
        this.setId(qla.xR);
        Context context0 = this.getContext();
        this.setLayoutParams(new ViewGroup.LayoutParams(-1, qZS.Zh(context0, 48.0f)));
        this.setBackground(DWo.PjT(context0, "tt_browser_download_selector"));
        this.setText(Lrd.PjT(context0, "tt_video_download_apk"));
        this.setTextColor(-1);
        this.setTextSize(2, 16.0f);
    }
}

