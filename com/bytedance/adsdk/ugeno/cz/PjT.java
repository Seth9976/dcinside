package com.bytedance.adsdk.ugeno.cz;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.Au.ReZ.cr;
import com.bytedance.adsdk.ugeno.Au.ReZ;
import com.bytedance.adsdk.ugeno.Au.Zh;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class PjT extends FrameLayout implements cr {
    class com.bytedance.adsdk.ugeno.cz.PjT.PjT extends Zh {
        final PjT PjT;

        @Override  // com.bytedance.adsdk.ugeno.Au.Zh
        public float PjT(int v) {
            return PjT.this.SM <= 0.0f ? 1.0f : 1.0f / PjT.this.SM;
        }

        // 去混淆评级： 低(20)
        @Override  // com.bytedance.adsdk.ugeno.Au.Zh
        public int PjT() {
            return PjT.this.xf ? 0x400 : PjT.this.PjT.size();
        }

        @Override  // com.bytedance.adsdk.ugeno.Au.Zh
        public int PjT(Object object0) {
            return -2;
        }

        @Override  // com.bytedance.adsdk.ugeno.Au.Zh
        public Object PjT(ViewGroup viewGroup0, int v) {
            int v1 = com.bytedance.adsdk.ugeno.cz.cr.PjT(PjT.this.xf, v, PjT.this.PjT.size());
            View view0 = PjT.this.PjT(v, v1);
            viewGroup0.addView(view0);
            return view0;
        }

        @Override  // com.bytedance.adsdk.ugeno.Au.Zh
        public void PjT(ViewGroup viewGroup0, int v, Object object0) {
            viewGroup0.removeView(((View)object0));
        }

        @Override  // com.bytedance.adsdk.ugeno.Au.Zh
        public boolean PjT(View view0, Object object0) {
            return view0 == object0;
        }
    }

    public class com.bytedance.adsdk.ugeno.cz.PjT.Zh extends ReZ {
        final PjT PjT;

        public com.bytedance.adsdk.ugeno.cz.PjT.Zh(Context context0) {
            super(context0);
        }

        private MotionEvent PjT(MotionEvent motionEvent0) {
            float f = (float)this.getWidth();
            float f1 = (float)this.getHeight();
            motionEvent0.setLocation(motionEvent0.getY() / f1 * f, motionEvent0.getX() / f * f1);
            return motionEvent0;
        }

        @Override  // com.bytedance.adsdk.ugeno.Au.ReZ
        public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
            if(PjT.this.xs) {
                try {
                    if(PjT.this.ub == 1) {
                        boolean z = super.onInterceptTouchEvent(this.PjT(motionEvent0));
                        this.PjT(motionEvent0);
                        return z;
                    }
                    return super.onInterceptTouchEvent(motionEvent0);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            return false;
        }

        @Override  // com.bytedance.adsdk.ugeno.Au.ReZ
        public boolean onTouchEvent(MotionEvent motionEvent0) {
            if(PjT.this.xs) {
                try {
                    return PjT.this.ub == 1 ? super.onTouchEvent(this.PjT(motionEvent0)) : super.onTouchEvent(motionEvent0);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            return false;
        }
    }

    private String Au;
    private boolean DWo;
    private int JQp;
    private com.bytedance.adsdk.ugeno.cz.PjT.PjT Owx;
    protected List PjT;
    private com.bytedance.adsdk.ugeno.cz.ReZ RD;
    private int ReZ;
    private float SM;
    private final Runnable Sks;
    private int XX;
    protected ReZ Zh;
    private int cr;
    private int cz;
    private int fDm;
    private FrameLayout gK;
    private com.bytedance.adsdk.ugeno.cz.PjT.PjT ltE;
    private boolean qj;
    private int qla;
    private final Runnable tT;
    private int ub;
    private int xE;
    private boolean xf;
    private boolean xs;

    public PjT(Context context0) {
        super(context0);
        this.PjT = new CopyOnWriteArrayList();
        this.ReZ = 2000;
        this.cr = 500;
        this.JQp = 0;
        this.cz = -1;
        this.XX = -1;
        this.Au = "normal";
        this.SM = 1.0f;
        this.DWo = true;
        this.qj = true;
        this.xf = true;
        this.xs = true;
        this.fDm = 0;
        this.qla = 0;
        this.xE = 0;
        this.ub = 0;
        this.Sks = new Runnable() {
            final PjT PjT;

            @Override
            public void run() {
                int v = PjT.this.Zh.getCurrentItem();
                if(PjT.this.xf) {
                    if(v + 1 >= 0x400) {
                        PjT.this.Zh.PjT(0x200, false);
                        return;
                    }
                    PjT.this.Zh.PjT(v + 1, true);
                    return;
                }
                if(v + 1 >= PjT.this.Zh.getAdapter().PjT()) {
                    PjT.this.Zh.PjT(0, false);
                    return;
                }
                PjT.this.Zh.PjT(v + 1, true);
            }
        };
        this.tT = new Runnable() {
            final PjT PjT;

            @Override
            public void run() {
                if(PjT.this.qj) {
                    int v = PjT.this.Zh.getCurrentItem();
                    if(PjT.this.xf) {
                        if(v + 1 >= 0x400) {
                            PjT.this.Zh.PjT(0x200, false);
                        }
                        else {
                            PjT.this.Zh.PjT(v + 1, true);
                        }
                        PjT.this.postDelayed(PjT.this.tT, ((long)PjT.this.ReZ));
                        return;
                    }
                    if(v + 1 >= PjT.this.Zh.getAdapter().PjT()) {
                        PjT.this.Zh.PjT(0, false);
                        PjT.this.postDelayed(PjT.this.tT, ((long)PjT.this.ReZ));
                        return;
                    }
                    PjT.this.Zh.PjT(v + 1, true);
                    PjT.this.postDelayed(PjT.this.tT, ((long)PjT.this.ReZ));
                }
            }
        };
        this.gK = new FrameLayout(context0);
        this.Zh = this.PjT();
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout$LayoutParams0.gravity = 17;
        this.gK.addView(this.Zh, frameLayout$LayoutParams0);
        this.addView(this.gK);
        com.bytedance.adsdk.ugeno.cz.PjT.PjT pjT0 = new com.bytedance.adsdk.ugeno.cz.PjT.PjT(context0);
        this.ltE = pjT0;
        this.addView(pjT0);
    }

    public PjT Au(int v) {
        this.XX = v;
        this.PjT(this.Au, this.JQp, this.cz, v, true);
        return this;
    }

    @Override  // com.bytedance.adsdk.ugeno.Au.ReZ$cr
    public void DWo(int v) {
        if(this.RD != null) {
            int v1 = com.bytedance.adsdk.ugeno.cz.cr.PjT(this.xf, v, this.PjT.size());
            this.RD.PjT(this.xf, v1, v, v1 == 0, v1 == this.PjT.size() - 1);
        }
        if(this.DWo) {
            this.ltE.PjT(v);
        }
    }

    public PjT JQp(int v) {
        this.ltE.setUnSelectedColor(v);
        return this;
    }

    public View PjT(int v, int v1) {
        if(this.PjT.size() == 0) {
            return new View(this.getContext());
        }
        View view0 = this.SM(v1);
        View view1 = new FrameLayout(this.getContext());
        if(view0 instanceof ViewGroup) {
            ((ViewGroup)view1).setClipChildren(true);
        }
        if(view0.getParent() instanceof ViewGroup) {
            ((ViewGroup)view0.getParent()).removeView(view0);
        }
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout$LayoutParams0.gravity = 17;
        ((ViewGroup)view1).addView(view0, frameLayout$LayoutParams0);
        ((ViewGroup)view1).addView(new View(this.getContext()), new FrameLayout.LayoutParams(-1, -1));
        return view1;
    }

    public ReZ PjT() {
        return new com.bytedance.adsdk.ugeno.cz.PjT.Zh(this, this.getContext());
    }

    public PjT PjT(float f) {
        this.SM = f;
        return this;
    }

    public PjT PjT(int v) {
        this.ub = v;
        return this;
    }

    public PjT PjT(Object object0) {
        if(object0 != null) {
            this.PjT.add(object0);
            if(this.DWo) {
                this.ltE.Zh();
            }
        }
        com.bytedance.adsdk.ugeno.cz.PjT.PjT pjT$PjT0 = this.Owx;
        if(pjT$PjT0 != null) {
            pjT$PjT0.ReZ();
            this.ltE.PjT(this.fDm, this.Zh.getCurrentItem());
        }
        return this;
    }

    public PjT PjT(String s) {
        this.Au = s;
        this.PjT(s, this.JQp, this.cz, this.XX, true);
        return this;
    }

    public PjT PjT(boolean z) {
        this.qj = z;
        this.ReZ();
        return this;
    }

    @Override  // com.bytedance.adsdk.ugeno.Au.ReZ$cr
    public void PjT(int v, float f, int v1) {
        com.bytedance.adsdk.ugeno.cz.ReZ reZ0 = this.RD;
        if(reZ0 != null) {
            reZ0.PjT(this.xf, com.bytedance.adsdk.ugeno.cz.cr.PjT(this.xf, v, this.PjT.size()), f, v1);
        }
    }

    public void PjT(String s, int v, int v1, int v2, boolean z) {
        com.bytedance.adsdk.ugeno.cz.PjT.PjT pjT$PjT0 = this.Owx;
        if(pjT$PjT0 != null) {
            pjT$PjT0.ReZ();
        }
        this.Zh.setPageMargin(v);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.Zh.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
            if(this.ub == 1) {
                ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin = v1 + v;
                ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin = v + v2;
            }
            else {
                ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin = v1 + v;
                ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin = v + v2;
            }
            this.Zh.setLayoutParams(viewGroup$LayoutParams0);
        }
        if(v1 > 0 || v2 > 0) {
            this.gK.setClipChildren(false);
            this.Zh.setClipChildren(false);
        }
        if(this.ub == 1) {
            this.Zh.PjT(true, new com.bytedance.adsdk.ugeno.cz.Zh.Zh());
            this.Zh.setOverScrollMode(2);
        }
        else if(TextUtils.equals(s, "linear")) {
            this.Zh.PjT(false, new com.bytedance.adsdk.ugeno.cz.Zh.PjT());
        }
        else {
            this.Zh.PjT(false, null);
        }
        this.Zh.setOffscreenPageLimit(((int)this.SM));
    }

    public PjT ReZ(int v) {
        this.ReZ = v;
        this.ReZ();
        return this;
    }

    public PjT ReZ(boolean z) {
        this.ltE.setLoop(z);
        if(this.xf != z) {
            int v = com.bytedance.adsdk.ugeno.cz.cr.PjT(z, this.Zh.getCurrentItem(), this.PjT.size());
            this.xf = z;
            com.bytedance.adsdk.ugeno.cz.PjT.PjT pjT$PjT0 = this.Owx;
            if(pjT$PjT0 != null) {
                pjT$PjT0.ReZ();
                this.Zh.setCurrentItem(v);
            }
        }
        return this;
    }

    public void ReZ() {
        this.removeCallbacks(this.tT);
        this.postDelayed(this.tT, ((long)this.ReZ));
    }

    public abstract View SM(int arg1);

    public PjT XX(int v) {
        this.cz = v;
        this.PjT(this.Au, this.JQp, v, this.XX, true);
        return this;
    }

    public PjT Zh(int v) {
        this.cr = v;
        return this;
    }

    public PjT Zh(boolean z) {
        this.DWo = z;
        return this;
    }

    public void Zh() {
        this.PjT(this.Au, this.JQp, this.cz, this.XX, true);
        if(this.Owx == null) {
            this.Owx = new com.bytedance.adsdk.ugeno.cz.PjT.PjT(this);
            this.Zh.PjT(this);
            this.Zh.setAdapter(this.Owx);
        }
        if(this.fDm < 0 || this.fDm >= this.PjT.size()) {
            this.fDm = 0;
        }
        int v = this.xf ? this.fDm + 0x200 : this.fDm;
        this.Zh.PjT(v, true);
        if(!this.xf) {
            this.DWo(v);
        }
        if(this.qj) {
            this.ReZ();
        }
    }

    public PjT cr(int v) {
        this.ltE.setSelectedColor(v);
        return this;
    }

    public void cr() {
        this.removeCallbacks(this.tT);
    }

    public PjT cz(int v) {
        this.JQp = v;
        this.PjT(this.Au, v, this.cz, this.XX, true);
        return this;
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        if(this.qj) {
            switch(motionEvent0.getAction()) {
                case 0: {
                    this.cr();
                    return super.dispatchTouchEvent(motionEvent0);
                }
                case 1: 
                case 3: 
                case 4: {
                    this.ReZ();
                    break;
                }
                default: {
                    return super.dispatchTouchEvent(motionEvent0);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent0);
    }

    public Zh getAdapter() {
        return this.Zh.getAdapter();
    }

    public int getCurrentItem() {
        return this.Zh.getCurrentItem();
    }

    public ReZ getViewPager() {
        return this.Zh;
    }

    @Override  // com.bytedance.adsdk.ugeno.Au.ReZ$cr
    public void qj(int v) {
        com.bytedance.adsdk.ugeno.cz.ReZ reZ0 = this.RD;
        if(reZ0 != null) {
            reZ0.PjT(this.xf, v);
        }
    }

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.cz.ReZ reZ0) {
        this.RD = reZ0;
    }

    public void xf(int v) {
        this.PjT(this.Au, this.JQp, this.cz, this.XX, true);
        if(this.Owx == null) {
            this.Owx = new com.bytedance.adsdk.ugeno.cz.PjT.PjT(this);
            this.Zh.PjT(this);
            this.Zh.setAdapter(this.Owx);
        }
        if(this.xf) {
            if(v >= 0x400) {
                this.Zh.PjT(0x200, false);
                return;
            }
            this.Zh.PjT(v, true);
            return;
        }
        if(v >= 0 && v < this.PjT.size()) {
            this.Zh.PjT(v, true);
        }
    }
}

