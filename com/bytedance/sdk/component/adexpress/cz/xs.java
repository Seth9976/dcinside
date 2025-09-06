package com.bytedance.sdk.component.adexpress.cz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.drawable.a;

@SuppressLint({"AppCompatCustomView"})
public class xs extends ImageView {
    private float Au;
    private int DWo;
    private boolean JQp;
    private Movie PjT;
    private int ReZ;
    private float SM;
    private float XX;
    private long Zh;
    private AnimatedImageDrawable cr;
    private boolean cz;
    private boolean fDm;
    private int qj;
    private volatile boolean xf;
    private boolean xs;

    public xs(Context context0) {
        super(context0);
        this.JQp = Build.VERSION.SDK_INT >= 28;
        this.cz = false;
        this.xs = true;
        this.fDm = true;
        this.PjT();
    }

    private void PjT(Canvas canvas0) {
        Movie movie0 = this.PjT;
        if(movie0 == null) {
            return;
        }
        movie0.setTime(this.ReZ);
        float f = this.SM;
        if(f == 0.0f) {
            canvas0.scale(1.0f, 1.0f);
            this.PjT.draw(canvas0, 0.0f, 0.0f);
        }
        else {
            canvas0.scale(f, f);
            this.PjT.draw(canvas0, this.XX / this.SM, this.Au / this.SM);
        }
        canvas0.restore();
    }

    void PjT() {
        if(!this.JQp) {
            this.setLayerType(1, null);
        }
    }

    private void ReZ() {
        if(this.PjT == null) {
            return;
        }
        long v = SystemClock.uptimeMillis();
        if(this.Zh == 0L) {
            this.Zh = v;
        }
        int v1 = this.PjT.duration();
        if(v1 == 0) {
            v1 = 1000;
        }
        if(!this.fDm && Math.abs(v1 - this.ReZ) < 60) {
            this.ReZ = v1;
            this.xf = true;
            return;
        }
        this.ReZ = (int)((v - this.Zh) % ((long)v1));
    }

    private void Zh() {
        if(this.PjT != null && !this.JQp && this.xs) {
            this.postInvalidateOnAnimation();
        }
    }

    @Override  // android.widget.ImageView
    protected void onDraw(Canvas canvas0) {
        if(this.PjT != null && !this.JQp) {
            try {
                if(!this.xf) {
                    this.ReZ();
                    this.PjT(canvas0);
                    this.Zh();
                    return;
                }
                this.PjT(canvas0);
            }
            catch(Throwable unused_ex) {
            }
            return;
        }
        super.onDraw(canvas0);
    }

    @Override  // android.view.View
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(this.PjT != null && !this.JQp) {
            this.XX = ((float)(this.getWidth() - this.DWo)) / 2.0f;
            this.Au = ((float)(this.getHeight() - this.qj)) / 2.0f;
        }
        this.xs = this.getVisibility() == 0;
    }

    @Override  // android.widget.ImageView
    protected void onMeasure(int v, int v1) {
        float f1;
        float f;
        super.onMeasure(v, v1);
        if(!this.JQp) {
            Movie movie0 = this.PjT;
            if(movie0 != null) {
                int v2 = movie0.width();
                int v3 = this.PjT.height();
                if(View.MeasureSpec.getMode(v) == 0) {
                    f = 1.0f;
                }
                else {
                    int v4 = View.MeasureSpec.getSize(v);
                    f = v2 > v4 ? ((float)v2) / ((float)v4) : 1.0f;
                }
                if(View.MeasureSpec.getMode(v1) == 0) {
                    f1 = 1.0f;
                }
                else {
                    int v5 = View.MeasureSpec.getSize(v1);
                    f1 = v3 > v5 ? ((float)v3) / ((float)v5) : 1.0f;
                }
                float f2 = Math.max(f, f1);
                this.SM = 1.0f / f2;
                int v6 = (int)(((float)v2) * (1.0f / f2));
                this.DWo = v6;
                int v7 = (int)(((float)v3) * (1.0f / f2));
                this.qj = v7;
                this.setMeasuredDimension(v6, v7);
            }
        }
    }

    @Override  // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int v) {
        boolean z = true;
        super.onScreenStateChanged(v);
        if(this.PjT != null) {
            if(v != 1) {
                z = false;
            }
            this.xs = z;
            this.Zh();
        }
    }

    @Override  // android.view.View
    @SuppressLint({"NewApi"})
    protected void onVisibilityChanged(View view0, int v) {
        super.onVisibilityChanged(view0, v);
        if(this.PjT != null) {
            this.xs = v == 0;
            this.Zh();
        }
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        if(this.PjT != null) {
            this.xs = v == 0;
            this.Zh();
        }
    }

    private void setDrawable(Drawable drawable0) {
        if(drawable0 == null) {
            return;
        }
        this.setImageDrawable(drawable0);
        if(Build.VERSION.SDK_INT >= 28 && a.a(drawable0)) {
            this.cr = (AnimatedImageDrawable)drawable0;
            if(!this.xf) {
                ((AnimatedImageDrawable)drawable0).start();
            }
            if(!this.fDm) {
                ((AnimatedImageDrawable)drawable0).setRepeatCount(0);
            }
        }
        this.Zh();
    }

    public void setRepeatConfig(boolean z) {
        this.fDm = z;
        if(!z) {
            try {
                if(Build.VERSION.SDK_INT >= 28) {
                    AnimatedImageDrawable animatedImageDrawable0 = this.cr;
                    if(animatedImageDrawable0 != null) {
                        animatedImageDrawable0.setRepeatCount(0);
                    }
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }
}

