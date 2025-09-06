package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class NiceImageView extends cr {
    private int Au;
    private int DWo;
    private int JQp;
    private Path Lrd;
    private RectF Owx;
    private final Context PjT;
    private final RectF RD;
    private boolean ReZ;
    private int SM;
    private final Paint Sks;
    private int XX;
    private boolean Zh;
    private int cr;
    private int cz;
    private final Xfermode fDm;
    private final float[] gK;
    private final float[] ltE;
    private int qj;
    private int qla;
    private final Path tT;
    private float ub;
    private int xE;
    private int xf;
    private int xs;

    public NiceImageView(Context context0) {
        this(context0, null);
    }

    public NiceImageView(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public NiceImageView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.JQp = -1;
        this.XX = -1;
        this.PjT = context0;
        this.Au = qZS.Zh(context0, 10.0f);
        this.gK = new float[8];
        this.ltE = new float[8];
        this.RD = new RectF();
        this.Owx = new RectF();
        this.Sks = new Paint();
        this.tT = new Path();
        if(Build.VERSION.SDK_INT <= 27) {
            this.fDm = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        }
        else {
            this.fDm = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.Lrd = new Path();
        }
        this.ReZ();
        this.cr();
    }

    private void PjT() {
        if(!this.Zh) {
            this.RD.set(((float)this.cr) / 2.0f, ((float)this.cr) / 2.0f, ((float)this.qla) - ((float)this.cr) / 2.0f, ((float)this.xE) - ((float)this.cr) / 2.0f);
        }
    }

    private void PjT(int v, int v1) {
        this.tT.reset();
        this.Sks.setStrokeWidth(((float)v));
        this.Sks.setColor(v1);
        this.Sks.setStyle(Paint.Style.STROKE);
    }

    private void PjT(Canvas canvas0) {
        if(this.Zh) {
            int v = this.cr;
            if(v > 0) {
                this.PjT(canvas0, v, this.JQp, this.ub - ((float)v) / 2.0f);
            }
            int v1 = this.cz;
            if(v1 > 0) {
                this.PjT(canvas0, v1, this.XX, this.ub - ((float)this.cr) - ((float)v1) / 2.0f);
            }
        }
        else {
            int v2 = this.cr;
            if(v2 > 0) {
                this.PjT(canvas0, v2, this.JQp, this.RD, this.gK);
            }
        }
    }

    private void PjT(Canvas canvas0, int v, int v1, float f) {
        this.PjT(v, v1);
        this.tT.addCircle(((float)this.qla) / 2.0f, ((float)this.xE) / 2.0f, f, Path.Direction.CCW);
        canvas0.drawPath(this.tT, this.Sks);
    }

    private void PjT(Canvas canvas0, int v, int v1, RectF rectF0, float[] arr_f) {
        this.PjT(v, v1);
        this.tT.addRoundRect(rectF0, arr_f, Path.Direction.CCW);
        canvas0.drawPath(this.tT, this.Sks);
    }

    private void PjT(boolean z) {
        if(z) {
            this.Au = 0;
        }
        this.ReZ();
        this.PjT();
        this.invalidate();
    }

    private void ReZ() {
        if(this.Zh) {
            return;
        }
        if(this.Au > 0) {
            for(int v = 0; true; ++v) {
                float[] arr_f = this.gK;
                if(v >= arr_f.length) {
                    break;
                }
                int v1 = this.Au;
                arr_f[v] = (float)v1;
                this.ltE[v] = ((float)v1) - ((float)this.cr) / 2.0f;
            }
            return;
        }
        int v2 = this.SM;
        this.gK[1] = (float)v2;
        this.gK[0] = (float)v2;
        int v3 = this.DWo;
        this.gK[3] = (float)v3;
        this.gK[2] = (float)v3;
        int v4 = this.xf;
        this.gK[5] = (float)v4;
        this.gK[4] = (float)v4;
        int v5 = this.qj;
        this.gK[7] = (float)v5;
        this.gK[6] = (float)v5;
        int v6 = this.cr;
        float f = ((float)v2) - ((float)v6) / 2.0f;
        this.ltE[1] = f;
        this.ltE[0] = f;
        float f1 = ((float)v3) - ((float)v6) / 2.0f;
        this.ltE[3] = f1;
        this.ltE[2] = f1;
        float f2 = ((float)v4) - ((float)v6) / 2.0f;
        this.ltE[5] = f2;
        this.ltE[4] = f2;
        float f3 = ((float)v5) - ((float)v6) / 2.0f;
        this.ltE[7] = f3;
        this.ltE[6] = f3;
    }

    private void Zh() {
        if(this.Zh) {
            float f = ((float)Math.min(this.qla, this.xE)) / 2.0f;
            this.ub = f;
            this.Owx.set(((float)this.qla) / 2.0f - f, ((float)this.xE) / 2.0f - f, ((float)this.qla) / 2.0f + f, ((float)this.xE) / 2.0f + f);
            return;
        }
        this.Owx.set(0.0f, 0.0f, ((float)this.qla), ((float)this.xE));
        if(this.ReZ) {
            this.Owx = this.RD;
        }
    }

    private void cr() {
        if(!this.Zh) {
            this.cz = 0;
        }
    }

    public void isCircle(boolean z) {
        this.Zh = z;
        this.cr();
        this.Zh();
        this.invalidate();
    }

    public void isCoverSrc(boolean z) {
        this.ReZ = z;
        this.Zh();
        this.invalidate();
    }

    @Override  // android.widget.ImageView
    protected void onDraw(Canvas canvas0) {
        canvas0.saveLayer(this.Owx, null, 0x1F);
        if(!this.ReZ) {
            canvas0.scale(((float)(this.qla - this.cr * 2 - this.cz * 2)) * 1.0f / ((float)this.qla), ((float)(this.xE - this.cr * 2 - this.cz * 2)) * 1.0f / ((float)this.xE), ((float)this.qla) / 2.0f, ((float)this.xE) / 2.0f);
        }
        super.onDraw(canvas0);
        this.Sks.reset();
        this.tT.reset();
        if(this.Zh) {
            this.tT.addCircle(((float)this.qla) / 2.0f, ((float)this.xE) / 2.0f, this.ub, Path.Direction.CCW);
        }
        else {
            this.tT.addRoundRect(this.Owx, this.ltE, Path.Direction.CCW);
        }
        this.Sks.setAntiAlias(true);
        this.Sks.setStyle(Paint.Style.FILL);
        this.Sks.setXfermode(this.fDm);
        if(Build.VERSION.SDK_INT <= 27) {
            canvas0.drawPath(this.tT, this.Sks);
        }
        else {
            this.Lrd.addRect(this.Owx, Path.Direction.CCW);
            this.Lrd.op(this.tT, Path.Op.DIFFERENCE);
            canvas0.drawPath(this.Lrd, this.Sks);
        }
        this.Sks.setXfermode(null);
        int v = this.xs;
        if(v != 0) {
            this.Sks.setColor(v);
            canvas0.drawPath(this.tT, this.Sks);
        }
        canvas0.restore();
        this.PjT(canvas0);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.qla = v;
        this.xE = v1;
        this.PjT();
        this.Zh();
    }

    public void setBorderColor(@ColorInt int v) {
        this.JQp = v;
        this.invalidate();
    }

    public void setBorderWidth(int v) {
        this.cr = qZS.Zh(this.PjT, ((float)v));
        this.PjT(false);
    }

    public void setCornerBottomLeftRadius(int v) {
        this.qj = qZS.Zh(this.PjT, ((float)v));
        this.PjT(true);
    }

    public void setCornerBottomRightRadius(int v) {
        this.xf = qZS.Zh(this.PjT, ((float)v));
        this.PjT(true);
    }

    public void setCornerRadius(int v) {
        this.Au = qZS.Zh(this.PjT, ((float)v));
        this.PjT(false);
    }

    public void setCornerTopLeftRadius(int v) {
        this.SM = qZS.Zh(this.PjT, ((float)v));
        this.PjT(true);
    }

    public void setCornerTopRightRadius(int v) {
        this.DWo = qZS.Zh(this.PjT, ((float)v));
        this.PjT(true);
    }

    public void setInnerBorderColor(@ColorInt int v) {
        this.XX = v;
        this.invalidate();
    }

    public void setInnerBorderWidth(int v) {
        this.cz = qZS.Zh(this.PjT, ((float)v));
        this.cr();
        this.invalidate();
    }

    public void setMaskColor(@ColorInt int v) {
        this.xs = v;
        this.invalidate();
    }
}

