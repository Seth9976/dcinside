package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build.VERSION;
import com.bytedance.sdk.component.utils.RD;
import java.lang.reflect.Field;

public class TTBaseActivity extends Activity {
    protected boolean XX;

    public TTBaseActivity() {
        this.XX = false;
    }

    public void Zh(boolean z) {
        this.XX = z;
    }

    @Override  // android.app.Activity
    public void finish() {
        try {
            super.finish();
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // android.app.Activity
    protected void onPause() {
        if(Build.VERSION.SDK_INT >= 33) {
            try {
                super.onPause();
            }
            catch(IllegalArgumentException unused_ex) {
                try {
                    Field field0 = Activity.class.getDeclaredField("mCalled");
                    field0.setAccessible(true);
                    field0.set(this, Boolean.TRUE);
                }
                catch(Exception unused_ex) {
                }
            }
            return;
        }
        super.onPause();
    }

    @Override  // android.app.Activity
    protected void onResume() {
        if(Build.VERSION.SDK_INT <= 28 && Build.VERSION.SDK_INT >= 24) {
            try {
                super.onResume();
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                RD.PjT("TTBaseActivity", "super.onResume() run fail", illegalArgumentException0);
                try {
                    Field field0 = Activity.class.getDeclaredField("mCalled");
                    field0.setAccessible(true);
                    field0.set(this, Boolean.TRUE);
                }
                catch(Exception exception0) {
                    RD.PjT("TTBaseActivity", "onResume set mCalled fail", exception0);
                }
            }
            return;
        }
        super.onResume();
    }
}

