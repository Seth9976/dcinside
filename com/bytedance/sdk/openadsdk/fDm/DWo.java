package com.bytedance.sdk.openadsdk.fDm;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.xE;

public abstract class DWo extends ReZ {
    protected Au JQp;
    protected ReZ PjT;
    protected xE ReZ;
    protected cr Zh;
    protected Au cr;
    protected Au cz;

    public DWo(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.PjT(context0);
    }

    protected PAGLogoView Au(Context context0) {
        PAGLogoView pAGLogoView0 = new PAGLogoView(context0);
        pAGLogoView0.setId(0x1F00002B);
        return pAGLogoView0;
    }

    protected ReZ JQp(Context context0) {
        return new ReZ(context0);
    }

    protected abstract void PjT(Context arg1);

    protected Au ReZ(Context context0) {
        Au au0 = new Au(context0);
        au0.setEllipsize(TextUtils.TruncateAt.END);
        au0.setMaxLines(1);
        au0.setSingleLine();
        au0.setTextColor(Color.parseColor("#FF999999"));
        au0.setTextSize(2, 12.0f);
        return au0;
    }

    protected xE XX(Context context0) {
        xE xE0 = new xE(context0);
        xE0.setScaleType(ImageView.ScaleType.FIT_XY);
        xE0.setBackgroundColor(0);
        return xE0;
    }

    protected Au Zh(Context context0) {
        Au au0 = new Au(context0);
        au0.setEllipsize(TextUtils.TruncateAt.END);
        au0.setMaxLines(1);
        au0.setTextColor(Color.parseColor("#FF999999"));
        au0.setTextSize(2, 16.0f);
        return au0;
    }

    protected Au cr(Context context0) {
        Au au0 = new Au(context0);
        au0.setBackground(com.bytedance.sdk.openadsdk.utils.DWo.PjT(context0, "tt_backup_btn_1"));
        au0.setGravity(17);
        au0.setText(Lrd.PjT(context0, "tt_video_download_apk"));
        au0.setTextColor(-1);
        au0.setTextSize(2, 14.0f);
        return au0;
    }

    protected cr cz(Context context0) {
        cr cr0 = new cr(context0);
        cr0.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return cr0;
    }

    public FrameLayout getTtAdContainer() {
        return this.PjT;
    }

    public TextView getTtFullAdAppName() {
        return this.cr;
    }

    public TextView getTtFullAdDesc() {
        return this.JQp;
    }

    public TextView getTtFullAdDownload() {
        return this.cz;
    }

    public xE getTtFullAdIcon() {
        return this.ReZ;
    }

    public ImageView getTtFullImg() {
        return this.Zh;
    }
}

