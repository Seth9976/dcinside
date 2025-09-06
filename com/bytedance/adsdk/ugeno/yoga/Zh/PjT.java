package com.bytedance.adsdk.ugeno.yoga.Zh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.XX.Au;
import com.bytedance.adsdk.ugeno.XX.ReZ;
import com.bytedance.adsdk.ugeno.yoga.JQp;
import com.bytedance.adsdk.ugeno.yoga.XX;
import com.bytedance.adsdk.ugeno.yoga.Zh;
import com.bytedance.adsdk.ugeno.yoga.cz;
import com.bytedance.adsdk.ugeno.yoga.qla;
import com.bytedance.adsdk.ugeno.yoga.xE;
import com.bytedance.adsdk.ugeno.yoga.xf;

public class PjT extends com.bytedance.adsdk.ugeno.Zh.PjT {
    public static class com.bytedance.adsdk.ugeno.yoga.Zh.PjT.PjT extends com.bytedance.adsdk.ugeno.Zh.PjT.PjT {
        public int Co;
        private boolean IJ;
        public int Jo;
        public int KM;
        private boolean OMu;
        public float Qf;
        private boolean VY;
        public float Yo;
        public int ZX;
        public float Zd;
        public float iZZ;
        private boolean ig;
        private boolean kph;
        public int qZS;
        private boolean rds;
        public int wN;
        public int yIW;

        public com.bytedance.adsdk.ugeno.yoga.Zh.PjT.PjT(com.bytedance.adsdk.ugeno.Zh.PjT pjT0) {
            super(pjT0);
            this.yIW = 1;
            this.iZZ = 0.0f;
            this.Yo = 1.0f;
            this.KM = Zh.PjT.PjT();
            this.Qf = -1.0f;
            this.ZX = qla.Zh.PjT();
        }

        @Override  // com.bytedance.adsdk.ugeno.Zh.PjT$PjT
        public ViewGroup.LayoutParams PjT() {
            return this.Zh();
        }

        @Override  // com.bytedance.adsdk.ugeno.Zh.PjT$PjT
        public void PjT(Context context0, String s, String s1) {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            super.PjT(context0, s, s1);
            s.hashCode();
            switch(s) {
                case "alignSelf": {
                    this.KM = Zh.PjT(s1).PjT();
                    return;
                }
                case "bottom": {
                    this.kph = true;
                    this.Co = (int)Au.PjT(context0, ((float)ReZ.PjT(s1, 0)));
                    return;
                }
                case "flexBasis": {
                    this.ig = true;
                    this.Qf = ReZ.PjT(s1, -1.0f);
                    return;
                }
                case "flexGrow": {
                    this.iZZ = ReZ.PjT(s1, 0.0f);
                    return;
                }
                case "flexShrink": {
                    this.Yo = ReZ.PjT(s1, 1.0f);
                    return;
                }
                case "left": {
                    this.IJ = true;
                    this.wN = (int)Au.PjT(context0, ((float)ReZ.PjT(s1, 0)));
                    return;
                }
                case "order": {
                    this.yIW = ReZ.PjT(s1, 1);
                    return;
                }
                case "position": {
                    this.ZX = qla.PjT(s1).PjT();
                    return;
                }
                case "ratio": {
                    this.VY = true;
                    this.Zd = ReZ.PjT(s1, 0.0f);
                    return;
                }
                case "right": {
                    this.OMu = true;
                    this.qZS = (int)Au.PjT(context0, ((float)ReZ.PjT(s1, 0)));
                    return;
                }
                case "top": {
                    this.rds = true;
                    this.Jo = (int)Au.PjT(context0, ((float)ReZ.PjT(s1, 0)));
                }
            }
        }

        public boolean ReZ() {
            return this.PjT != -1.0f || this.Zh != -1.0f ? this.PjT == -2.0f || this.Zh == -2.0f : false;
        }

        public com.bytedance.adsdk.ugeno.yoga.Au.PjT Zh() {
            com.bytedance.adsdk.ugeno.yoga.Au.PjT au$PjT0 = new com.bytedance.adsdk.ugeno.yoga.Au.PjT(((int)this.PjT), ((int)this.Zh));
            au$PjT0.xf(((float)(((int)(this.Owx ? this.cz : this.JQp)))));
            au$PjT0.fDm(((float)(((int)(this.RD ? this.XX : this.JQp)))));
            au$PjT0.qj(((float)(((int)(this.Sks ? this.Au : this.JQp)))));
            au$PjT0.xs(((float)(((int)(this.tT ? this.SM : this.JQp)))));
            au$PjT0.PjT(((float)this.yIW));
            au$PjT0.JQp(((float)this.KM));
            au$PjT0.Zh(this.iZZ);
            au$PjT0.ReZ(this.Yo);
            au$PjT0.xE(this.ReZ);
            au$PjT0.ub(this.cr);
            if(this.ig) {
                au$PjT0.cr(this.Qf);
            }
            au$PjT0.cz(((float)this.ZX));
            if(this.rds) {
                au$PjT0.XX(((float)this.Jo));
            }
            if(this.kph) {
                au$PjT0.SM(((float)this.Co));
            }
            if(this.IJ) {
                au$PjT0.Au(((float)this.wN));
            }
            if(this.OMu) {
                au$PjT0.DWo(((float)this.qZS));
            }
            if(this.VY && this.ReZ()) {
                float f = this.Zd;
                if(f > 0.0f) {
                    au$PjT0.qla(f);
                }
            }
            return au$PjT0;
        }

        @Override  // com.bytedance.adsdk.ugeno.Zh.PjT$PjT
        public String toString() {
            return "LayoutParams{mOrder=" + this.yIW + ", mFlexGrow=" + this.iZZ + ", mFlexShrink=" + this.Yo + ", mAlignSelf=" + this.KM + ", mFlexBasis=" + this.Qf + ", mPosition=" + this.ZX + ", mTop=" + this.Jo + ", mBottom=" + this.Co + ", mLeft=" + this.wN + ", mRight=" + this.qZS + '}';
        }
    }

    private cz OL;
    private Zh ZsT;
    private XX dDm;
    private xE jp;
    private xf kWj;
    private Zh oMU;

    public PjT(Context context0) {
        super(context0);
        this.OL = cz.ReZ;
        this.jp = xE.PjT;
        this.dDm = XX.PjT;
        this.oMU = Zh.JQp;
        this.ZsT = Zh.JQp;
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.PjT
    public com.bytedance.adsdk.ugeno.Zh.PjT.PjT DWo() {
        return this.cr();
    }

    private void PjT(ImageView imageView0) {
        this.JQp.post(new Runnable() {
            final PjT Zh;

            @Override
            public void run() {
                if(PjT.this.JQp == null) {
                    return;
                }
                xf xf0 = ((com.bytedance.adsdk.ugeno.yoga.Au)PjT.this.JQp).PjT(imageView0);
                if(xf0 == null) {
                    return;
                }
                xf0.cr(((float)PjT.this.JQp.getWidth()));
                xf0.cz(((float)PjT.this.JQp.getHeight()));
                PjT.this.JQp.requestLayout();
            }
        });
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public View PjT() {
        return this.ReZ();
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    protected void PjT(Drawable drawable0) {
        ImageView imageView0 = new ImageView(this.Zh);
        imageView0.setImageDrawable(drawable0);
        if(this.OMu) {
            ImageView.ScaleType imageView$ScaleType0 = this.rds;
            if(imageView$ScaleType0 == ImageView.ScaleType.FIT_XY) {
                imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            else {
                imageView0.setScaleType(imageView$ScaleType0);
            }
        }
        else {
            imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        com.bytedance.adsdk.ugeno.yoga.Au.PjT au$PjT0 = new com.bytedance.adsdk.ugeno.yoga.Au.PjT(-1, -1);
        au$PjT0.cz(((float)qla.ReZ.PjT()));
        View view0 = this.JQp;
        if(view0 instanceof com.bytedance.adsdk.ugeno.yoga.Au) {
            ((com.bytedance.adsdk.ugeno.yoga.Au)view0).addView(imageView0, 0, au$PjT0);
            this.PjT(imageView0);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.PjT
    public void PjT(com.bytedance.adsdk.ugeno.Zh.ReZ reZ0) {
        super.PjT(reZ0);
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.PjT
    public void PjT(com.bytedance.adsdk.ugeno.Zh.ReZ reZ0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(reZ0 == null) {
            return;
        }
        this.PjT.add(reZ0);
        View view0 = reZ0.qj();
        if(view0 != null) {
            ((com.bytedance.adsdk.ugeno.yoga.Au)this.JQp).addView(view0, viewGroup$LayoutParams0);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void PjT(String s, String s1) {
        super.PjT(s, s1);
        s.hashCode();
        switch(s) {
            case "alignContent": {
                this.ZsT = Zh.PjT(s1);
                return;
            }
            case "alignItems": {
                this.oMU = Zh.PjT(s1);
                return;
            }
            case "flexDirection": {
                this.OL = cz.PjT(s1);
                return;
            }
            case "flexWrap": {
                this.jp = xE.PjT(s1);
                return;
            }
            case "justifyContent": {
                this.dDm = XX.PjT(s1);
            }
        }
    }

    public com.bytedance.adsdk.ugeno.yoga.Au ReZ() {
        com.bytedance.adsdk.ugeno.yoga.Au au0 = new com.bytedance.adsdk.ugeno.yoga.Au(this.Zh);
        au0.PjT(this);
        this.kWj = au0.getYogaNode();
        return au0;
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.PjT
    public void Zh() {
        super.Zh();
        this.kWj.PjT(this.OL);
        this.kWj.PjT(this.jp);
        this.kWj.PjT(this.dDm);
        this.kWj.PjT(this.oMU);
        this.kWj.ReZ(this.ZsT);
    }

    public com.bytedance.adsdk.ugeno.yoga.Zh.PjT.PjT cr() {
        return new com.bytedance.adsdk.ugeno.yoga.Zh.PjT.PjT(this);
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    protected void xs() {
        if(this.ZX) {
            this.kWj.Zh(JQp.SM, this.yIW);
        }
        if(this.Jo) {
            this.kWj.Zh(JQp.PjT, this.iZZ);
        }
        if(this.Co) {
            this.kWj.Zh(JQp.ReZ, this.Yo);
        }
        if(this.wN) {
            this.kWj.Zh(JQp.Zh, this.KM);
        }
        if(this.qZS) {
            this.kWj.Zh(JQp.cr, this.Qf);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    protected void yIW() {
        if(this.IJ) {
            com.bytedance.adsdk.ugeno.JQp.PjT().Zh().PjT(this.SM, this.ig, new com.bytedance.adsdk.ugeno.PjT.PjT() {
                final PjT PjT;

                @Override  // com.bytedance.adsdk.ugeno.PjT$PjT
                public void PjT(Bitmap bitmap0) {
                    if(bitmap0 != null) {
                        Bitmap bitmap1 = Au.PjT(PjT.this.Zh, bitmap0, ((int)PjT.this.kph));
                        if(bitmap1 != null) {
                            Au.PjT(new Runnable() {
                                final com.bytedance.adsdk.ugeno.yoga.Zh.PjT.1 Zh;

                                @Override
                                public void run() {
                                    BitmapDrawable bitmapDrawable0 = new BitmapDrawable(bitmap1);
                                    PjT.this.PjT(bitmapDrawable0);
                                }
                            });
                        }
                    }
                }
            });
            return;
        }
        ImageView imageView0 = new ImageView(this.Zh);
        com.bytedance.adsdk.ugeno.JQp.PjT().Zh().PjT(this.SM, this.ig, imageView0, this.JQp.getWidth(), this.JQp.getHeight());
        if(this.OMu) {
            ImageView.ScaleType imageView$ScaleType0 = this.rds;
            if(imageView$ScaleType0 == ImageView.ScaleType.FIT_XY) {
                imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            else {
                imageView0.setScaleType(imageView$ScaleType0);
            }
        }
        else {
            imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        com.bytedance.adsdk.ugeno.yoga.Au.PjT au$PjT0 = new com.bytedance.adsdk.ugeno.yoga.Au.PjT(-1, -1);
        au$PjT0.cz(((float)qla.ReZ.PjT()));
        View view0 = this.JQp;
        if(view0 instanceof com.bytedance.adsdk.ugeno.yoga.Au) {
            ((com.bytedance.adsdk.ugeno.yoga.Au)view0).addView(imageView0, 0, au$PjT0);
            this.PjT(imageView0);
        }
    }
}

