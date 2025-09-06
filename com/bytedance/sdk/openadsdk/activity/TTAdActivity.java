package com.bytedance.sdk.openadsdk.activity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.PjT.JQp.PjT;
import com.bytedance.sdk.openadsdk.core.Lrd;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.utils.fDm;

public class TTAdActivity extends TTBaseActivity {
    private Zh PjT;

    @Override  // android.app.Activity
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Zh zh0 = this.PjT;
        if(zh0 != null) {
            zh0.PjT(this);
        }
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        Zh zh0 = this.PjT;
        if(zh0 == null) {
            super.onBackPressed();
            return;
        }
        zh0.JQp();
    }

    @Override  // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        PjT pjT0 = Lrd.PjT().ReZ();
        com.bytedance.sdk.openadsdk.PjT.ReZ.Zh zh0 = Lrd.PjT().cr();
        Owx owx0 = com.bytedance.sdk.openadsdk.component.reward.PjT.Zh.PjT(this.getIntent(), bundle0, null);
        if(owx0 != null) {
            Zh zh1 = new Zh(this, owx0);
            this.PjT = zh1;
            zh1.PjT(this, bundle0, pjT0, zh0);
            return;
        }
        this.finish();
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Zh zh0 = this.PjT;
        if(zh0 != null) {
            zh0.JQp(this);
        }
        Lrd.PjT().PjT(null);
        Lrd.PjT().PjT(null);
        fDm.PjT();
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected void onPause() {
        super.onPause();
        Zh zh0 = this.PjT;
        if(zh0 != null) {
            zh0.ReZ(this);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected void onResume() {
        super.onResume();
        Zh zh0 = this.PjT;
        if(zh0 != null) {
            zh0.Zh(this);
        }
    }

    @Override  // android.app.Activity
    protected void onSaveInstanceState(@NonNull Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        Zh zh0 = this.PjT;
        if(zh0 != null) {
            zh0.PjT(this, bundle0);
        }
    }

    @Override  // android.app.Activity
    protected void onStart() {
        super.onStart();
        Zh zh0 = this.PjT;
        if(zh0 != null) {
            zh0.PjT(this);
        }
    }

    @Override  // android.app.Activity
    protected void onStop() {
        super.onStop();
        Zh zh0 = this.PjT;
        if(zh0 != null) {
            zh0.cr(this);
        }
    }

    @Override  // android.app.Activity
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Zh zh0 = this.PjT;
        if(zh0 != null) {
            zh0.PjT(z);
        }
    }
}

