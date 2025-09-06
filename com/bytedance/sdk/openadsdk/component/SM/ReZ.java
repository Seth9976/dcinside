package com.bytedance.sdk.openadsdk.component.SM;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.JQp.XX;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.qla;
import com.bytedance.sdk.openadsdk.core.widget.xE;

public abstract class ReZ extends XX {
    final com.bytedance.sdk.openadsdk.component.SM.XX Au;
    Au DWo;
    Au JQp;
    cr PjT;
    cr ReZ;
    xE SM;
    Au XX;
    com.bytedance.sdk.openadsdk.core.JQp.ReZ Zh;
    PAGLogoView cr;
    xE cz;
    Au qj;
    com.bytedance.sdk.openadsdk.core.widget.ReZ xf;

    public ReZ(Context context0) {
        super(context0);
        this.Au = new com.bytedance.sdk.openadsdk.component.SM.XX(context0);
    }

    public abstract cr getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.cr;
    }

    public abstract Au getAdTitleTextView();

    public cr getBackImage() {
        return this.PjT;
    }

    public Au getClickButton() {
        return this.JQp;
    }

    public Au getContent() {
        return this.qj;
    }

    public com.bytedance.sdk.openadsdk.core.widget.ReZ getDspAdChoice() {
        return this.xf;
    }

    public xE getHostAppIcon() {
        return this.cz;
    }

    public Au getHostAppName() {
        return this.XX;
    }

    public xE getIconOnlyView() {
        return this.SM;
    }

    public cr getImageView() {
        return this.ReZ;
    }

    public JQp getOverlayLayout() {
        return null;
    }

    public abstract qla getScoreBar();

    public Au getTitle() {
        return this.DWo;
    }

    public Au getTopCountDown() {
        return this.Au == null ? null : this.Au.getTopCountDown();
    }

    public View getTopDisLike() {
        return this.Au == null ? null : this.Au.getTopDislike();
    }

    public cr getTopSkip() {
        return this.Au == null ? null : this.Au.getTopSkip();
    }

    public abstract View getUserInfo();

    public com.bytedance.sdk.openadsdk.core.JQp.ReZ getVideoContainer() {
        return this.Zh;
    }
}

