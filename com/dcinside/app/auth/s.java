package com.dcinside.app.auth;

import com.leinardi.android.speeddial.SpeedDialActionItem;
import com.leinardi.android.speeddial.SpeedDialView.h;

public final class s implements h {
    public final OtpCodeActivity a;

    public s(OtpCodeActivity otpCodeActivity0) {
        this.a = otpCodeActivity0;
    }

    @Override  // com.leinardi.android.speeddial.SpeedDialView$h
    public final boolean a(SpeedDialActionItem speedDialActionItem0) {
        return OtpCodeActivity.b2(this.a, speedDialActionItem0);
    }
}

