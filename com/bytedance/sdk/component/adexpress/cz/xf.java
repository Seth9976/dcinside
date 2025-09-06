package com.bytedance.sdk.component.adexpress.cz;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.Xfermode;
import android.view.View;
import com.bytedance.sdk.component.utils.Lrd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class xf extends View {
    public static class PjT {
        private final int PjT;
        private int Zh;

        public PjT(int v) {
            this.PjT = v;
            this.Zh = 0;
        }

        public void PjT() {
            this.Zh += this.PjT;
        }
    }

    private int Au;
    private Bitmap DWo;
    private int JQp;
    Rect PjT;
    private int ReZ;
    private int[] SM;
    private int XX;
    Rect Zh;
    private int cr;
    private int cz;
    private LinearGradient fDm;
    private Paint qj;
    private final List qla;
    private Xfermode xf;
    private PorterDuff.Mode xs;

    public xf(Context context0) {
        super(context0);
        this.xs = PorterDuff.Mode.DST_IN;
        this.qla = new ArrayList();
        this.PjT();
    }

    private void PjT() {
        this.ReZ = Lrd.cr(this.getContext(), "tt_splash_unlock_image_arrow");
        this.cr = Color.parseColor("#00ffffff");
        this.JQp = Color.parseColor("#ffffffff");
        int v = Color.parseColor("#00ffffff");
        this.cz = v;
        this.XX = 10;
        this.Au = 40;
        this.SM = new int[]{this.cr, this.JQp, v};
        this.setLayerType(1, null);
        this.qj = new Paint(1);
        this.DWo = BitmapFactory.decodeResource(this.getResources(), this.ReZ);
        this.xf = new PorterDuffXfermode(this.xs);
    }

    public void PjT(int v) {
        PjT xf$PjT0 = new PjT(v);
        this.qla.add(xf$PjT0);
        this.postInvalidate();
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        canvas0.drawBitmap(this.DWo, this.PjT, this.Zh, this.qj);
        canvas0.save();
        Iterator iterator0 = this.qla.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            this.fDm = new LinearGradient(((float)((PjT)object0).Zh), 0.0f, ((float)(((PjT)object0).Zh + this.Au)), ((float)this.XX), this.SM, null, Shader.TileMode.CLAMP);
            this.qj.setColor(-1);
            this.qj.setShader(this.fDm);
            canvas0.drawRect(0.0f, 0.0f, ((float)this.getWidth()), ((float)this.getHeight()), this.qj);
            this.qj.setShader(null);
            ((PjT)object0).PjT();
            if(((PjT)object0).Zh > this.getWidth()) {
                iterator0.remove();
            }
        }
        this.qj.setXfermode(this.xf);
        canvas0.drawBitmap(this.DWo, this.PjT, this.Zh, this.qj);
        this.qj.setXfermode(null);
        canvas0.restore();
        this.invalidate();
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(this.DWo == null) {
            return;
        }
        this.PjT = new Rect(0, 0, this.DWo.getWidth(), this.DWo.getHeight());
        this.Zh = new Rect(0, 0, this.getWidth(), this.getHeight());
    }
}

