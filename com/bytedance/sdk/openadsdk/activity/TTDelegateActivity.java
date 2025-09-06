package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.ReZ.ReZ;
import com.bytedance.sdk.openadsdk.core.ReZ.cr.PjT;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.cRA;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.Zh;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public class TTDelegateActivity extends TTBaseActivity {
    private Intent PjT;
    private static final Map ReZ;
    private cRA Zh;

    static {
        TTDelegateActivity.ReZ = DesugarCollections.synchronizedMap(new HashMap());
    }

    public static void PjT(Owx owx0, String s) {
        TTDelegateActivity.PjT(owx0, s, null);
    }

    public static void PjT(Owx owx0, String s, PjT cr$PjT0) {
        if(owx0 == null) {
            return;
        }
        Intent intent0 = new Intent(ub.PjT(), TTDelegateActivity.class);
        intent0.addFlags(0x10000000);
        intent0.putExtra("type", 6);
        intent0.putExtra("ext_info", owx0.xR());
        intent0.putExtra("filter_words", com.bytedance.sdk.openadsdk.tool.PjT.PjT(owx0.na()));
        intent0.putExtra("creative_info", owx0.dDm().toString());
        intent0.putExtra("closed_listener_key", s);
        if(cr$PjT0 != null) {
            if(Zh.ReZ()) {
                SM.Zh().PjT(s, cr$PjT0);
            }
            else {
                TTDelegateActivity.ReZ.put(s, cr$PjT0);
            }
        }
        com.bytedance.sdk.component.utils.Zh.PjT(ub.PjT(), intent0, null);
    }

    private void PjT(String s) {
        Map map0 = TTDelegateActivity.ReZ;
        if(map0 != null && !TextUtils.isEmpty(s)) {
            map0.remove(s);
        }
    }

    private void PjT(String s, String s1, String s2, String s3) {
        if(s1 != null && s != null && this.Zh == null) {
            ReZ reZ0 = new ReZ(this, s, com.bytedance.sdk.openadsdk.tool.PjT.PjT(s1), s3, "other");
            this.Zh = reZ0;
            reZ0.PjT(s2);
            this.Zh.PjT(new com.bytedance.sdk.openadsdk.core.cRA.PjT() {
                final TTDelegateActivity Zh;

                @Override  // com.bytedance.sdk.openadsdk.core.cRA$PjT
                public void PjT() {
                    if(!((ReZ)TTDelegateActivity.this.Zh).ReZ()) {
                        TTDelegateActivity.this.PjT(s2);
                        TTDelegateActivity.this.finish();
                    }
                    ((ReZ)TTDelegateActivity.this.Zh).PjT(false);
                }

                @Override  // com.bytedance.sdk.openadsdk.core.cRA$PjT
                public void PjT(int v, String s) {
                    if(TTDelegateActivity.ReZ != null && TTDelegateActivity.ReZ.size() > 0 && !TextUtils.isEmpty(s2) && !Zh.ReZ()) {
                        PjT cr$PjT0 = (PjT)TTDelegateActivity.ReZ.get(s2);
                        if(cr$PjT0 != null) {
                            cr$PjT0.PjT();
                        }
                    }
                    else if(!TextUtils.isEmpty(s2)) {
                        PjT cr$PjT1 = SM.Zh().JQp(s2);
                        if(cr$PjT1 != null) {
                            cr$PjT1.PjT();
                            SM.Zh().cz(s2);
                        }
                    }
                    TTDelegateActivity.this.PjT(s2);
                    TTDelegateActivity.this.finish();
                }
            });
        }
        cRA cRA0 = this.Zh;
        if(cRA0 != null) {
            cRA0.PjT();
        }
    }

    private void ReZ() {
        int v = this.PjT.getIntExtra("type", 0);
        if(v != 1) {
            if(v != 6) {
                this.finish();
                return;
            }
            String s = this.PjT.getStringExtra("ext_info");
            String s1 = this.PjT.getStringExtra("filter_words");
            String s2 = this.PjT.getStringExtra("creative_info");
            this.PjT(s, s1, this.PjT.getStringExtra("closed_listener_key"), s2);
        }
    }

    private void Zh() {
        Window window0 = this.getWindow();
        WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
        windowManager$LayoutParams0.alpha = 0.0f;
        window0.setAttributes(windowManager$LayoutParams0);
    }

    @Override  // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        if(!fDm.JQp()) {
            this.finish();
            return;
        }
        this.Zh();
        this.PjT = this.getIntent();
        if(ub.PjT() == null) {
            ub.Zh(this);
        }
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        cRA cRA0 = this.Zh;
        if(cRA0 != null) {
            cRA0.Zh();
        }
    }

    @Override  // android.app.Activity
    protected void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        if(ub.PjT() == null) {
            ub.Zh(this);
        }
        this.setIntent(intent0);
        this.PjT = intent0;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected void onResume() {
        super.onResume();
        if(this.Zh != null && ((ReZ)this.Zh).PjT != null && ((ReZ)this.Zh).PjT.isShowing()) {
            return;
        }
        if(this.PjT != null) {
            this.ReZ();
        }
    }
}

