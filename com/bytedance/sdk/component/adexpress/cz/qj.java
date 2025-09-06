package com.bytedance.sdk.component.adexpress.cz;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.ReZ.PjT;

public class qj extends FrameLayout {
    private final TextView PjT;
    private final xf ReZ;
    private final ImageView Zh;
    private final RotateAnimation cr;

    public qj(@NonNull Context context0) {
        super(context0);
        this.addView(PjT.cr(context0));
        this.PjT = (TextView)this.findViewById(0x7D06FFF6);
        this.Zh = (ImageView)this.findViewById(0x7D06FFF9);
        this.ReZ = (xf)this.findViewById(0x7D06FFF8);
        RotateAnimation rotateAnimation0 = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.cr = rotateAnimation0;
        rotateAnimation0.setDuration(300L);
        rotateAnimation0.setRepeatMode(2);
        rotateAnimation0.setRepeatCount(1);
        rotateAnimation0.setInterpolator(new LinearInterpolator());
    }

    public void PjT() {
        this.postDelayed(this.getHaloAnimation(), 300L);
    }

    public void Zh() {
        this.cr.cancel();
    }

    private Runnable getHaloAnimation() {
        return new Runnable() {
            final qj PjT;

            @Override
            public void run() {
                qj.this.Zh.startAnimation(qj.this.cr);
                com.bytedance.sdk.component.adexpress.cz.qj.1.1 qj$1$10 = new Runnable() {
                    final com.bytedance.sdk.component.adexpress.cz.qj.1 PjT;

                    @Override
                    public void run() {
                        qj.this.ReZ.PjT(4);
                    }
                };
                qj.this.postDelayed(qj$1$10, 100L);
                com.bytedance.sdk.component.adexpress.cz.qj.1.2 qj$1$20 = new Runnable() {
                    final com.bytedance.sdk.component.adexpress.cz.qj.1 PjT;

                    @Override
                    public void run() {
                        qj.this.ReZ.PjT(4);
                    }
                };
                qj.this.postDelayed(qj$1$20, 300L);
                Runnable runnable0 = qj.this.getHaloAnimation();
                qj.this.postDelayed(runnable0, 1200L);
            }
        };
    }

    public void setText(String s) {
        if(TextUtils.isEmpty(s)) {
            s = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView0 = this.PjT;
        if(textView0 != null) {
            textView0.setText(s);
        }
    }
}

