package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.KM.PjT;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.component.utils.SM;
import com.bytedance.sdk.component.utils.xs;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.Zh.ReZ;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class XX extends View implements PjT {
    public interface com.bytedance.sdk.openadsdk.core.XX.PjT {
        void PjT();

        void PjT(View arg1);

        void PjT(boolean arg1);

        void Zh();
    }

    private int Au;
    private final AtomicBoolean DWo;
    private List JQp;
    private boolean PjT;
    private com.bytedance.sdk.openadsdk.core.XX.PjT ReZ;
    private final Handler SM;
    private boolean XX;
    private boolean Zh;
    private View cr;
    @Nullable
    private List cz;
    private ViewTreeObserver.OnGlobalLayoutListener qj;
    private boolean xf;
    private final Runnable xs;

    public XX(Context context0, View view0) {
        super(ub.PjT());
        this.SM = new KM(fDm.Zh().getLooper(), this);
        this.DWo = new AtomicBoolean(true);
        this.xf = false;
        this.xs = new Runnable() {
            final XX PjT;

            @Override
            public void run() {
                if(XX.this.ReZ != null) {
                    XX.this.ReZ.PjT(XX.this.cr);
                }
            }
        };
        this.cr = view0;
        this.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.qj = new ViewTreeObserver.OnGlobalLayoutListener() {
            final XX PjT;

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public void onGlobalLayout() {
                if(XX.this.xf) {
                    return;
                }
                XX.this.JQp();
                XX.this.cr();
            }
        };
    }

    private void JQp() {
        if(!this.PjT) {
            return;
        }
        this.SM.removeCallbacksAndMessages(null);
        this.PjT = false;
    }

    private void PjT(boolean z) {
        ViewTreeObserver viewTreeObserver0 = this.getViewTreeObserver();
        SM.Zh().post(new Runnable() {
            final XX ReZ;

            @Override
            public void run() {
                if(XX.this.qj != null) {
                    ViewTreeObserver viewTreeObserver0 = viewTreeObserver0;
                    if(viewTreeObserver0 != null) {
                        try {
                            viewTreeObserver0.removeOnGlobalLayoutListener(XX.this.qj);
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                }
                if(z) {
                    XX.this.qj = null;
                }
            }
        });
    }

    public void PjT() {
        this.PjT(this.JQp, null);
        this.PjT(this.cz, null);
    }

    @Override  // com.bytedance.sdk.component.utils.KM$PjT
    public void PjT(Message message0) {
        if(message0.what == 1 && this.PjT) {
            if(this.cz() && Qf.PjT(this.cr, 20, this.Au)) {
                this.JQp();
                this.xf = true;
                fDm.ReZ().post(this.xs);
                this.PjT(true);
                return;
            }
            this.SM.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    public void PjT(List list0, ReZ reZ0) {
        if(xs.Zh(list0)) {
            for(Object object0: list0) {
                View view0 = (View)object0;
                if(view0 != null) {
                    view0.setOnClickListener(reZ0);
                    view0.setOnTouchListener(reZ0);
                }
            }
        }
    }

    private void ReZ() {
        if(!this.DWo.getAndSet(true)) {
            com.bytedance.sdk.openadsdk.core.XX.PjT xX$PjT0 = this.ReZ;
            if(xX$PjT0 != null) {
                xX$PjT0.Zh();
            }
        }
    }

    private void Zh() {
        if(this.DWo.getAndSet(false)) {
            com.bytedance.sdk.openadsdk.core.XX.PjT xX$PjT0 = this.ReZ;
            if(xX$PjT0 != null) {
                xX$PjT0.PjT();
            }
        }
    }

    private void cr() {
        if(this.Zh && !this.PjT) {
            this.PjT = true;
            this.SM.sendEmptyMessage(1);
        }
    }

    // 去混淆评级： 低(20)
    private boolean cz() {
        return this.cr instanceof ltE ? ((ltE)this.cr).qla() : true;
    }

    @Override  // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.XX = false;
        this.Zh();
        if(this.qj != null) {
            this.getViewTreeObserver().addOnGlobalLayoutListener(this.qj);
        }
    }

    @Override  // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.JQp();
        this.XX = true;
        this.ReZ();
        this.PjT(false);
    }

    @Override  // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.Zh();
    }

    @Override  // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.ReZ();
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.bytedance.sdk.openadsdk.core.XX.PjT xX$PjT0 = this.ReZ;
        if(xX$PjT0 != null) {
            xX$PjT0.PjT(z);
        }
    }

    public void setAdType(int v) {
        this.Au = v;
    }

    public void setCallback(com.bytedance.sdk.openadsdk.core.XX.PjT xX$PjT0) {
        this.ReZ = xX$PjT0;
    }

    public void setNeedCheckingShow(boolean z) {
        this.Zh = z;
        if(!z && this.PjT) {
            this.JQp();
            return;
        }
        if(z && !this.PjT) {
            this.cr();
        }
    }

    public void setRefClickViews(List list0) {
        this.JQp = list0;
    }

    public void setRefCreativeViews(@Nullable List list0) {
        this.cz = list0;
    }
}

