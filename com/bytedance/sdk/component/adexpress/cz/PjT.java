package com.bytedance.sdk.component.adexpress.cz;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;
import com.bytedance.sdk.component.adexpress.dynamic.JQp.qj;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.component.utils.Lrd;
import java.util.ArrayList;
import java.util.List;

public class PjT extends TextSwitcher implements ViewSwitcher.ViewFactory, com.bytedance.sdk.component.utils.KM.PjT {
    private int Au;
    private int DWo;
    private Context JQp;
    Animation.AnimationListener PjT;
    private int ReZ;
    private float SM;
    private int XX;
    private List Zh;
    private final int cr;
    private TextView cz;
    private Handler fDm;
    private int qj;
    private int xf;
    private int xs;

    public PjT(Context context0, int v, float f, int v1, int v2) {
        super(context0);
        this.Zh = new ArrayList();
        this.ReZ = 0;
        this.cr = 1;
        this.fDm = new KM(Looper.getMainLooper(), this);
        this.PjT = new Animation.AnimationListener() {
            final PjT PjT;

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationEnd(Animation animation0) {
                if(PjT.this.cz != null) {
                    PjT.this.cz.setText("");
                }
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationRepeat(Animation animation0) {
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationStart(Animation animation0) {
            }
        };
        this.JQp = context0;
        this.Au = v;
        this.SM = f;
        this.DWo = v1;
        this.xs = v2;
        this.ReZ();
    }

    public void PjT() {
        int v = this.xf;
        if(v == 1) {
            this.setInAnimation(this.getContext(), Lrd.SM(this.JQp, "tt_text_animation_y_in"));
            this.setOutAnimation(this.getContext(), Lrd.SM(this.JQp, "tt_text_animation_y_out"));
        }
        else if(v == 0) {
            this.setInAnimation(this.getContext(), Lrd.SM(this.JQp, "tt_text_animation_x_in"));
            this.setOutAnimation(this.getContext(), Lrd.SM(this.JQp, "tt_text_animation_x_in"));
            this.getInAnimation().setInterpolator(new LinearInterpolator());
            this.getOutAnimation().setInterpolator(new LinearInterpolator());
            this.getInAnimation().setAnimationListener(this.PjT);
            this.getOutAnimation().setAnimationListener(this.PjT);
        }
        this.fDm.sendEmptyMessage(1);
    }

    @Override  // com.bytedance.sdk.component.utils.KM$PjT
    public void PjT(Message message0) {
        if(message0.what == 1) {
            this.Zh();
            this.fDm.sendEmptyMessageDelayed(1, ((long)this.XX));
        }
    }

    private void ReZ() {
        this.setFactory(this);
    }

    public void Zh() {
        if(this.Zh != null && this.Zh.size() > 0) {
            int v = this.ReZ;
            this.ReZ = v + 1;
            this.qj = v;
            this.setText(((CharSequence)this.Zh.get(v)));
            if(this.ReZ > this.Zh.size() - 1) {
                this.ReZ = 0;
            }
        }
    }

    @Override  // android.widget.ViewSwitcher$ViewFactory
    public View makeView() {
        TextView textView0 = new TextView(this.getContext());
        this.cz = textView0;
        textView0.setTextColor(this.Au);
        this.cz.setTextSize(this.SM);
        this.cz.setMaxLines(this.DWo);
        this.cz.setTextAlignment(this.xs);
        return this.cz;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.fDm.sendEmptyMessageDelayed(1, ((long)this.XX));
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.fDm.removeMessages(1);
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(qj.Zh(((String)this.Zh.get(this.qj)), this.SM, false)[0], 0x40000000), v);
        }
        catch(Exception unused_ex) {
            super.onMeasure(v, v1);
        }
    }

    public void setAnimationDuration(int v) {
        this.XX = v;
    }

    public void setAnimationText(List list0) {
        this.Zh = list0;
    }

    public void setAnimationType(int v) {
        this.xf = v;
    }

    public void setMaxLines(int v) {
        this.DWo = v;
    }

    public void setTextColor(int v) {
        this.Au = v;
    }

    public void setTextSize(float f) {
        this.SM = f;
    }
}

