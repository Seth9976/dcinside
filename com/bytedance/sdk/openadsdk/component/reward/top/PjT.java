package com.bytedance.sdk.openadsdk.component.reward.top;

import android.view.View;

public interface PjT {
    void clickSkip();

    void clickSound(String arg1);

    View getCloseButton();

    void setListener(Zh arg1);

    void setShowDislike(boolean arg1);

    void setShowSkip(boolean arg1);

    void setShowSound(boolean arg1);

    void setSkipEnable(boolean arg1);

    void setSkipInvisiable();

    void setSkipText(CharSequence arg1);

    void setSoundMute(boolean arg1);

    void setTime(CharSequence arg1, CharSequence arg2);

    void showCloseButton();

    void showCountDownText();

    void showSkipButton();
}

