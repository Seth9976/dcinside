package com.bytedance.sdk.openadsdk.core.qj;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.SM;
import com.bytedance.sdk.openadsdk.core.ub;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class cz {
    final Set PjT;
    private XX Zh;

    private cz() {
        this.PjT = new HashSet();
        JQp.PjT(ub.PjT());
    }

    // 检测为 Lambda 实现
    private void Au() [...]

    private Handler JQp() {
        return SM.Zh();
    }

    public static cz PjT() {
        return new cz();
    }

    @UiThread
    public void PjT(int v) {
        if(a.x()) {
            this.Zh(v);
            return;
        }
        this.JQp().post(() -> {
            XX xX0 = cz.this.Zh;
            if(xX0 != null) {
                try {
                    xX0.Zh(this.PjT);
                }
                catch(Throwable unused_ex) {
                }
            }
        });

        class com.bytedance.sdk.openadsdk.core.qj.cz.3 implements Runnable {
            final cz Zh;

            com.bytedance.sdk.openadsdk.core.qj.cz.3(int v) {
            }

            @Override
            public void run() {
                cz.this.Zh(this.PjT);
            }
        }

    }

    @UiThread
    public void PjT(long v, boolean z) {
        if(a.x()) {
            this.Zh(v, z);
            return;
        }
        this.JQp().post(() -> {
            XX xX0 = cz.this.Zh;
            if(xX0 != null) {
                try {
                    xX0.PjT(((float)this.PjT) / 1000.0f, this.Zh);
                }
                catch(Throwable unused_ex) {
                }
            }
        });

        class com.bytedance.sdk.openadsdk.core.qj.cz.10 implements Runnable {
            final cz ReZ;

            com.bytedance.sdk.openadsdk.core.qj.cz.10(long v, boolean z) {
            }

            @Override
            public void run() {
                cz.this.Zh(this.PjT, this.Zh);
            }
        }

    }

    @UiThread
    public void PjT(@Nullable View view0, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose0) {
        if(a.x()) {
            this.Zh(view0, friendlyObstructionPurpose0);
            return;
        }
        this.JQp().post(() -> {
            XX xX0 = cz.this.Zh;
            if(xX0 != null) {
                goto label_6;
            }
            else if(this.PjT != null && this.Zh != null) {
                try {
                    Pair pair0 = new Pair(this.PjT, this.Zh);
                    cz.this.PjT.add(pair0);
                    return;
                label_6:
                    if(this.PjT != null && this.Zh != null) {
                        xX0.PjT(this.PjT, this.Zh);
                    }
                    if(cz.this.PjT.size() > 0) {
                        xX0.PjT(cz.this.PjT);
                        cz.this.PjT.clear();
                    }
                }
                catch(Throwable unused_ex) {
                }
            }
        });

        class com.bytedance.sdk.openadsdk.core.qj.cz.9 implements Runnable {
            final cz ReZ;

            com.bytedance.sdk.openadsdk.core.qj.cz.9(View view0, FriendlyObstructionPurpose friendlyObstructionPurpose0) {
            }

            @Override
            public void run() {
                cz.this.Zh(this.PjT, this.Zh);
            }
        }

    }

    public void PjT(View view0, Set set0) {
        if(this.Zh != null) {
            return;
        }
        if(view0 != null && set0 != null) {
            if(a.x()) {
                this.Zh(view0, set0);
                return;
            }
            this.JQp().post(() -> try {
                if(cz.this.Zh == null) {
                    cz.this.Zh = Au.PjT(this.PjT, this.Zh);
                }
            }
            catch(Throwable throwable0) {
                RD.Zh(("createVideoSession failed : " + throwable0), new Object[0]);
                HashMap hashMap0 = new HashMap();
                hashMap0.put("scene", "createVideoSession");
                hashMap0.put("message", throwable0.getMessage());
                JQp.PjT(hashMap0);
            });
        }

        class com.bytedance.sdk.openadsdk.core.qj.cz.4 implements Runnable {
            final cz ReZ;

            com.bytedance.sdk.openadsdk.core.qj.cz.4(View view0, Set set0) {
            }

            @Override
            public void run() {
                cz.this.Zh(this.PjT, this.Zh);
            }
        }

    }

    @UiThread
    public void PjT(WebView webView0) {
        if(webView0 != null && this.Zh == null) {
            if(a.x()) {
                this.Zh(webView0);
                return;
            }
            this.JQp().post(() -> try {
                if(cz.this.Zh == null) {
                    cz.this.Zh = Au.PjT(this.PjT);
                }
            }
            catch(Throwable throwable0) {
                RD.Zh(("createWebViewSession failed : " + throwable0), new Object[0]);
                HashMap hashMap0 = new HashMap();
                hashMap0.put("scene", "createWebViewSession");
                hashMap0.put("message", throwable0.getMessage());
                JQp.PjT(hashMap0);
            });
        }

        class com.bytedance.sdk.openadsdk.core.qj.cz.1 implements Runnable {
            final cz Zh;

            com.bytedance.sdk.openadsdk.core.qj.cz.1(WebView webView0) {
            }

            @Override
            public void run() {
                cz.this.Zh(this.PjT);
            }
        }

    }

    @UiThread
    public void PjT(boolean z) {
        if(a.x()) {
            this.Zh(z);
            return;
        }
        this.JQp().post(() -> {
            XX xX0 = cz.this.Zh;
            if(xX0 != null) {
                try {
                    xX0.PjT(this.PjT);
                }
                catch(Throwable unused_ex) {
                }
            }
        });

        class com.bytedance.sdk.openadsdk.core.qj.cz.2 implements Runnable {
            final cz Zh;

            com.bytedance.sdk.openadsdk.core.qj.cz.2(boolean z) {
            }

            @Override
            public void run() {
                cz.this.Zh(this.PjT);
            }
        }

    }

    @UiThread
    public void PjT(boolean z, float f) {
        if(a.x()) {
            this.Zh(z, f);
            return;
        }
        this.JQp().post(() -> if(cz.this.Zh != null) {
            try {
                cz.this.PjT(null, null);
                cz.this.Zh.PjT(this.PjT, this.Zh);
            }
            catch(Throwable unused_ex) {
            }
        });

        class com.bytedance.sdk.openadsdk.core.qj.cz.6 implements Runnable {
            final cz ReZ;

            com.bytedance.sdk.openadsdk.core.qj.cz.6(boolean z, float f) {
            }

            @Override
            public void run() {
                cz.this.Zh(this.PjT, this.Zh);
            }
        }

    }

    @UiThread
    public void ReZ() {
        if(a.x()) {
            this.XX();
            return;
        }
        this.JQp().post(() -> {
            XX xX0 = cz.this.Zh;
            if(xX0 != null) {
                try {
                    xX0.cr();
                }
                catch(Throwable unused_ex) {
                }
            }
        });

        class com.bytedance.sdk.openadsdk.core.qj.cz.7 implements Runnable {
            final cz PjT;

            @Override
            public void run() {
                cz.this.XX();
            }
        }

    }

    // 检测为 Lambda 实现
    private void XX() [...]

    // 检测为 Lambda 实现
    private void Zh(int v) [...]

    // 检测为 Lambda 实现
    private void Zh(@Nullable View view0, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose0) [...]

    // 检测为 Lambda 实现
    private void Zh(View view0, Set set0) [...]

    // 检测为 Lambda 实现
    private void Zh(WebView webView0) [...]

    // 检测为 Lambda 实现
    private void Zh(boolean z) [...]

    // 检测为 Lambda 实现
    private void Zh(boolean z, float f) [...]

    @UiThread
    public void Zh() {
        if(a.x()) {
            this.cz();
            return;
        }
        this.JQp().post(() -> if(cz.this.Zh != null) {
            try {
                cz.this.PjT(null, null);
                cz.this.Zh.Zh();
            }
            catch(Throwable unused_ex) {
            }
        });

        class com.bytedance.sdk.openadsdk.core.qj.cz.5 implements Runnable {
            final cz PjT;

            @Override
            public void run() {
                cz.this.cz();
            }
        }

    }

    // 检测为 Lambda 实现
    public void Zh(long v, boolean z) [...]

    @UiThread
    public void cr() {
        if(a.x()) {
            this.Au();
            return;
        }
        this.JQp().post(() -> {
            XX xX0 = cz.this.Zh;
            if(xX0 != null) {
                try {
                    xX0.ReZ();
                }
                catch(Throwable unused_ex) {
                }
            }
        });

        class com.bytedance.sdk.openadsdk.core.qj.cz.8 implements Runnable {
            final cz PjT;

            @Override
            public void run() {
                cz.this.Au();
            }
        }

    }

    // 检测为 Lambda 实现
    private void cz() [...]
}

