package com.bytedance.sdk.openadsdk.core.xf.Zh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.widget.gK;
import com.bytedance.sdk.openadsdk.core.widget.ub;
import com.bytedance.sdk.openadsdk.gK.Zh;
import com.bytedance.sdk.openadsdk.utils.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import x.b;
import z.a;

public class cr extends JQp {
    private ColorStateList CD;
    private int CY;
    private final KM HG;
    private TextView IJ;
    private TextView Ld;
    private final Rect MN;
    private SeekBar MWx;
    private int Nv;
    private ImageView OMu;
    private final View.OnTouchListener RV;
    private float UR;
    private View VY;
    private float Vs;
    private final Rect Wo;
    private boolean Xe;
    private float Xtz;
    private ImageView Zd;
    private TextView cI;
    private final int dIF;
    private View dwk;
    private int fA;
    private ColorStateList fK;
    private final int hN;
    private View ig;
    private final Rect ix;
    private final Rect jK;
    private int kFP;
    private TextView kph;
    private float na;
    private ImageView oG;
    private TextView qZS;
    private TextView rds;
    private ImageView tY;
    private final ub uQg;
    private final Rect wKV;
    private TextView xH;
    private float xR;
    private int xu;
    private ColorStateList yks;
    private int zYH;
    private boolean zZ;

    public cr(Context context0, ViewGroup viewGroup0, boolean z, int v, Owx owx0, b b0, boolean z1) {
        super(context0, viewGroup0, z, v, owx0, b0, z1);
        this.HG = new KM(this);
        this.zZ = false;
        this.Xe = false;
        this.kFP = 0;
        this.xu = 0;
        this.CY = 0;
        this.fA = 0;
        this.zYH = 0;
        this.wKV = new Rect();
        this.ix = new Rect();
        this.Nv = 0;
        this.RV = new View.OnTouchListener() {
            final cr PjT;

            @Override  // android.view.View$OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                switch(motionEvent0.getActionMasked()) {
                    case 2: {
                        view0.getParent().requestDisallowInterceptTouchEvent(true);
                        return false;
                    }
                    case 3: {
                        view0.getParent().requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                    default: {
                        return false;
                    }
                }
            }
        };
        this.MN = new Rect();
        this.Wo = new Rect();
        this.jK = new Rect();
        this.yIW = com.bytedance.sdk.openadsdk.core.ub.PjT().getApplicationContext();
        this.cr(z1);
        this.ReZ = viewGroup0;
        this.RD = z;
        ub ub0 = new ub(this);
        this.uQg = ub0;
        ub0.PjT(this.RD);
        DisplayMetrics displayMetrics0 = this.yIW.getResources().getDisplayMetrics();
        this.dIF = displayMetrics0.widthPixels;
        this.hN = displayMetrics0.heightPixels;
        this.Lrd = v;
        this.ZX = b0;
        this.cRA = owx0;
        this.cr(8);
        this.PjT(context0, this.ReZ);
        this.cr();
        this.xf();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void Au() {
        qZS.JQp(this.cz);
        qZS.JQp(this.VY);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public boolean DWo() {
        return this.zZ;
    }

    private void JQp(boolean z) {
        if(z) {
            this.cRA();
            return;
        }
        this.yIW();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void JQp() {
        this.HG.removeMessages(1);
        Message message0 = this.HG.obtainMessage(1);
        this.HG.sendMessageDelayed(message0, 2000L);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void PjT() {
        this.PjT(false, this.RD);
        this.ltE();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void PjT(int v) {
        if(this.dwk == null || this.dwk.getVisibility() != 0) {
            this.MWx.setProgress(v);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void PjT(long v) {
        this.cI.setText(a.b(v));
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void PjT(long v, long v1) {
        this.Ld.setText(a.b(v1));
        this.cI.setText(a.b(v));
        this.MWx.setProgress(a.a(v, v1));
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    protected void PjT(Context context0, View view0) {
        super.PjT(context0, view0);
        this.qZS = (TextView)view0.findViewById(qla.OnL);
        this.Zd = (ImageView)view0.findViewById(qla.NR);
        this.ig = view0.findViewById(qla.Lmo);
        this.OMu = (ImageView)view0.findViewById(qla.xi);
        this.rds = (TextView)view0.findViewById(qla.KP);
        this.kph = (TextView)view0.findViewById(qla.WHM);
        this.IJ = (TextView)view0.findViewById(qla.RXa);
        this.VY = view0.findViewById(qla.vSp);
        this.tY = (ImageView)view0.findViewById(qla.hLk);
        TextView textView0 = (TextView)view0.findViewById(qla.VZ);
        this.xH = textView0;
        textView0.setText(Lrd.PjT(context0, "tt_video_retry_des_txt"));
        this.MWx = (SeekBar)view0.findViewById(qla.It);
        this.Ld = (TextView)view0.findViewById(qla.JU);
        this.cI = (TextView)view0.findViewById(qla.gH);
        this.dwk = view0.findViewById(qla.hx);
        this.oG = (ImageView)view0.findViewById(qla.GP);
        this.SM = view0.findViewById(qla.fU);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void PjT(Message message0) {
        if(message0.what == 1) {
            this.qj();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void PjT(View view0, boolean z) {
        if(this.DWo()) {
            String s = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            if(this.cRA != null && !TextUtils.isEmpty(this.cRA.Xtz())) {
                this.PjT(this.cRA.Xtz());
            }
            this.IJ.setText(s);
        }
        else {
            this.PjT("");
            this.IJ.setText("");
        }
        boolean z1 = false;
        if(!this.KM) {
            this.ReZ(this.RD && !this.zZ);
            if(this.xE()) {
                PjT pjT0 = this.Yo;
                if(this.cz.getVisibility() != 0) {
                    z1 = true;
                }
                pjT0.PjT(this, view0, true, z1);
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void PjT(@Nullable ViewGroup viewGroup0) {
        if(viewGroup0 == null) {
            return;
        }
        if(!(this.ReZ.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.zZ = true;
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.ReZ.getLayoutParams();
        this.xu = viewGroup$MarginLayoutParams0.leftMargin;
        this.kFP = viewGroup$MarginLayoutParams0.topMargin;
        this.CY = viewGroup$MarginLayoutParams0.width;
        this.fA = viewGroup$MarginLayoutParams0.height;
        viewGroup$MarginLayoutParams0.width = -1;
        viewGroup$MarginLayoutParams0.height = -1;
        viewGroup$MarginLayoutParams0.topMargin = 0;
        viewGroup$MarginLayoutParams0.leftMargin = 0;
        this.ReZ.setLayoutParams(viewGroup$MarginLayoutParams0);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = viewGroup0.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof RelativeLayout.LayoutParams) {
            int[] arr_v = ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).getRules();
            this.zYH = arr_v.length <= 0 ? 0 : arr_v[3];
            ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).addRule(3, 0);
            viewGroup0.setLayoutParams(((RelativeLayout.LayoutParams)viewGroup$LayoutParams0));
        }
        if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
            this.wKV.set(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin);
            qZS.PjT(viewGroup0, 0, 0, 0, 0);
        }
        this.Zh(true);
        this.oG.setImageDrawable(Lrd.ReZ(this.yIW, "tt_shrink_video"));
        this.MWx.setThumb(DWo.PjT(this.yIW, "tt_seek_thumb_fullscreen_selector"));
        this.MWx.setThumbOffset(0);
        a.c(this.ReZ, false);
        this.JQp(this.zZ);
        qZS.PjT(this.ig, 8);
        if(!this.RD) {
            qZS.PjT(this.Zd, 8);
            qZS.PjT(this.qZS, 8);
            return;
        }
        if((this.Lrd & 1) == 1) {
            qZS.PjT(this.Zd, 8);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    @SuppressLint({"ClickableViewAccessibility"})
    public void PjT(Owx owx0, WeakReference weakReference0, boolean z) {
        String s1;
        String s;
        if(owx0 == null) {
            return;
        }
        this.PjT(this.ReZ, com.bytedance.sdk.openadsdk.core.ub.PjT());
        this.PjT(false, this.RD);
        qZS.PjT(this.DWo, 0);
        qZS.PjT(this.qj, 0);
        qZS.PjT(this.xf, 0);
        if(this.qj != null && (this.cRA != null && this.cRA.MWx() != null && this.cRA.MWx().c() != null)) {
            Zh.PjT().PjT(this.cRA.MWx().c(), this.cRA.MWx().o(), this.cRA.MWx().w(), this.qj, this.cRA);
        }
        if(!TextUtils.isEmpty(owx0.Ld())) {
            s = owx0.Ld();
        }
        else if(TextUtils.isEmpty(owx0.Xtz())) {
            s = TextUtils.isEmpty(owx0.ix()) ? "" : owx0.ix();
        }
        else {
            s = owx0.Xtz();
        }
        if(this.cRA != null && this.cRA.Xe() != null && this.cRA.Xe().PjT() != null) {
            qZS.PjT(this.xs, 0);
            qZS.PjT(this.fDm, 4);
            if(this.xs != null) {
                Zh.PjT().PjT(this.cRA.Xe(), this.xs, owx0);
                this.xs.setOnClickListener(this.Jo);
                this.xs.setOnTouchListener(this.Jo);
            }
        }
        else if(!TextUtils.isEmpty(s)) {
            qZS.PjT(this.xs, 4);
            qZS.PjT(this.fDm, 0);
            TextView textView0 = this.fDm;
            if(textView0 != null) {
                textView0.setText(s.substring(0, 1));
                this.fDm.setOnClickListener(this.Jo);
                this.fDm.setOnTouchListener(this.Jo);
            }
        }
        if(this.qla != null && !TextUtils.isEmpty(s)) {
            this.qla.setText(s);
        }
        qZS.PjT(this.qla, 0);
        qZS.PjT(this.xE, 0);
        switch(owx0.cI()) {
            case 4: {
                s1 = Lrd.PjT(this.yIW, "tt_video_download_apk");
                break;
            }
            case 5: {
                s1 = Lrd.PjT(this.yIW, "tt_video_dial_phone");
                break;
            }
            default: {
                s1 = Lrd.PjT(this.yIW, "tt_video_mobile_go_detail");
            }
        }
        TextView textView1 = this.xE;
        if(textView1 != null) {
            textView1.setText(s1);
            this.xE.setOnClickListener(this.Jo);
            this.xE.setOnTouchListener(this.Jo);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    @SuppressLint({"ClickableViewAccessibility"})
    public void PjT(Object object0, WeakReference weakReference0, boolean z) {
        this.PjT(((Owx)object0), weakReference0, z);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void PjT(String s) {
        TextView textView0 = this.rds;
        if(textView0 != null) {
            textView0.setText(s);
        }
        TextView textView1 = this.kph;
        if(textView1 != null) {
            textView1.setText(s);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void PjT(boolean z, boolean z1) {
        qZS.PjT(this.dwk, 8);
        qZS.PjT(this.ig, 8);
        qZS.PjT(this.JQp, 8);
        if(!this.RD && !this.zZ) {
            qZS.PjT(this.Zd, 8);
            if((this.Lrd & 2) != 2) {
                qZS.PjT(this.qZS, 8);
            }
        }
        else if((this.Lrd & 1) == 1) {
            qZS.PjT(this.Zd, 8);
        }
        if(z1) {
            qZS.PjT(this.Zd, 8);
            qZS.PjT(this.qZS, 8);
        }
        this.ReZ(false);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void PjT(boolean z, boolean z1, boolean z2) {
        qZS.PjT(this.dwk, 0);
        int v = 8;
        if(this.zZ) {
            qZS.PjT(this.ig, 0);
            qZS.PjT(this.kph, 0);
        }
        else if(z2) {
            qZS.PjT(this.ig, 8);
        }
        qZS.PjT(this.JQp, (!z || this.cz.getVisibility() == 0 ? 8 : 0));
        if(!this.RD && !this.zZ) {
            if((this.Lrd & 1) != 1 && !z2) {
                qZS.PjT(this.Zd, 0);
            }
            TextView textView0 = this.qZS;
            if(!z2) {
                v = 0;
            }
            qZS.PjT(textView0, v);
        }
        qZS.PjT(this.Ld, 0);
        qZS.PjT(this.cI, 0);
        qZS.PjT(this.MWx, 0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void ReZ(boolean z) {
        TextView textView0 = this.rds;
        if(textView0 != null) {
            qZS.PjT(textView0, (this.RD || !z ? 8 : 0));
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void SM() {
        this.MWx.setProgress(0);
        this.MWx.setSecondaryProgress(0);
        this.Ld.setText(Lrd.PjT(this.yIW, "tt_00_00"));
        this.cI.setText(Lrd.PjT(this.yIW, "tt_00_00"));
        this.cr(8);
        if(this.Lrd()) {
            this.cr.setVisibility(8);
        }
        ImageView imageView0 = this.Au;
        if(imageView0 != null) {
            imageView0.setImageDrawable(null);
        }
        this.cr(8);
        qZS.PjT(this.dwk, 8);
        qZS.PjT(this.DWo, 8);
        qZS.PjT(this.qj, 8);
        qZS.PjT(this.xf, 8);
        qZS.PjT(this.xs, 8);
        qZS.PjT(this.fDm, 8);
        qZS.PjT(this.qla, 8);
        gK gK0 = this.iZZ;
        if(gK0 != null) {
            gK0.PjT(true);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void XX() {
        qZS.cz(this.cz);
        qZS.cz(this.XX);
        qZS.JQp(this.VY);
        if(this.Au != null && (this.cRA != null && this.cRA.MWx() != null && this.cRA.MWx().c() != null)) {
            qZS.cz(this.Au);
            Zh.PjT().PjT(this.cRA.MWx().c(), this.cRA.MWx().o(), this.cRA.MWx().w(), this.Au, this.cRA);
        }
        if(this.JQp.getVisibility() == 0) {
            qZS.PjT(this.JQp, 8);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void Zh(@Nullable ViewGroup viewGroup0) {
        if(viewGroup0 == null) {
            return;
        }
        if(this.ReZ != null && this.ReZ.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            this.zZ = false;
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.ReZ.getLayoutParams();
            viewGroup$MarginLayoutParams0.width = this.CY;
            viewGroup$MarginLayoutParams0.height = this.fA;
            viewGroup$MarginLayoutParams0.leftMargin = this.xu;
            viewGroup$MarginLayoutParams0.topMargin = this.kFP;
            this.ReZ.setLayoutParams(viewGroup$MarginLayoutParams0);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = viewGroup0.getLayoutParams();
            if(viewGroup$LayoutParams0 instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).addRule(3, this.zYH);
                viewGroup0.setLayoutParams(((RelativeLayout.LayoutParams)viewGroup$LayoutParams0));
            }
            if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
                qZS.PjT(viewGroup0, this.wKV.left, this.wKV.top, this.wKV.right, this.wKV.bottom);
            }
            this.Zh(true);
            this.oG.setImageDrawable(Lrd.ReZ(this.yIW, "tt_enlarge_video"));
            this.MWx.setThumb(DWo.PjT(this.yIW, "tt_seek_thumb_normal"));
            this.MWx.setThumbOffset(0);
            a.c(this.ReZ, true);
            this.JQp(this.zZ);
            qZS.PjT(this.ig, 8);
            if((this.Lrd & 2) == 2) {
                qZS.PjT(this.qZS, 0);
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void Zh(boolean z) {
        int v = this.DWo() ? this.hN : this.ub;
        int v1 = this.DWo() ? this.dIF : this.gK;
        if(this.Owx <= 0 || this.ltE <= 0 || v <= 0) {
            return;
        }
        if(!this.RD() && !this.DWo() && (this.Lrd & 8) != 8) {
            v1 = qZS.Zh(this.yIW, 228.0f);
        }
        int v2 = this.ltE;
        int v3 = this.Owx;
        int v4 = (int)(((float)v3) * (((float)v) * 1.0f / ((float)v2)));
        if(v4 > v1) {
            v = (int)(((float)v2) * (((float)v1) * 1.0f / ((float)v3)));
        }
        else {
            v1 = v4;
        }
        if(!z && !this.DWo()) {
            v = this.ub;
            v1 = this.gK;
        }
        this.cr.PjT(v, v1);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public boolean Zh(int v) {
        return this.MWx != null && v > this.MWx.getSecondaryProgress();
    }

    private void cRA() {
        DisplayMetrics displayMetrics0 = this.yIW.getResources().getDisplayMetrics();
        TextView textView0 = this.cI;
        if(textView0 != null) {
            this.xR = textView0.getTextSize();
            this.cI.setTextSize(2, 14.0f);
            ColorStateList colorStateList0 = this.cI.getTextColors();
            this.fK = colorStateList0;
            if(colorStateList0 != null) {
                this.cI.setTextColor(-1);
            }
            this.na = this.cI.getAlpha();
            this.cI.setAlpha(0.85f);
            this.cI.setShadowLayer(0.0f, ((float)qZS.Zh(this.yIW, 0.5f)), ((float)qZS.Zh(this.yIW, 0.5f)), Lrd.XX(this.yIW, "tt_b2000000"));
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.cI.getLayoutParams();
            if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
                this.MN.set(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin);
                qZS.PjT(this.cI, ((int)TypedValue.applyDimension(1, 16.0f, displayMetrics0)), this.MN.top, ((int)TypedValue.applyDimension(1, 14.0f, displayMetrics0)), this.MN.bottom);
            }
        }
        TextView textView1 = this.Ld;
        if(textView1 != null) {
            this.UR = textView1.getTextSize();
            this.Ld.setTextSize(2, 14.0f);
            ColorStateList colorStateList1 = this.Ld.getTextColors();
            this.CD = colorStateList1;
            if(colorStateList1 != null) {
                this.Ld.setTextColor(-1);
            }
            this.Vs = this.Ld.getAlpha();
            this.Ld.setAlpha(0.85f);
            this.Ld.setShadowLayer(0.0f, ((float)qZS.Zh(this.yIW, 0.5f)), ((float)qZS.Zh(this.yIW, 0.5f)), Lrd.XX(this.yIW, "tt_b2000000"));
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = this.Ld.getLayoutParams();
            if(viewGroup$LayoutParams1 instanceof ViewGroup.MarginLayoutParams) {
                this.Wo.set(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).leftMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).topMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).rightMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).bottomMargin);
                qZS.PjT(this.Ld, ((int)TypedValue.applyDimension(1, 14.0f, displayMetrics0)), this.Wo.top, this.Wo.right, this.Wo.bottom);
            }
        }
        ImageView imageView0 = this.oG;
        if(imageView0 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams2 = imageView0.getLayoutParams();
            if(viewGroup$LayoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                this.jK.set(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams2).leftMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams2).topMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams2).bottomMargin);
                qZS.PjT(this.oG, this.jK.left, this.jK.top, ((int)TypedValue.applyDimension(1, 16.0f, displayMetrics0)), this.jK.bottom);
            }
        }
        ImageView imageView1 = this.oG;
        if(imageView1 != null) {
            imageView1.setImageDrawable(Lrd.ReZ(this.yIW, "tt_shrink_fullscreen"));
        }
        TextView textView2 = this.kph;
        if(textView2 != null) {
            ColorStateList colorStateList2 = textView2.getTextColors();
            this.yks = colorStateList2;
            if(colorStateList2 != null) {
                this.kph.setTextColor(-1);
            }
            this.Xtz = this.kph.getAlpha();
            this.kph.setAlpha(0.85f);
            ViewGroup.LayoutParams viewGroup$LayoutParams3 = this.kph.getLayoutParams();
            if(viewGroup$LayoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                this.ix.set(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams3).leftMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams3).topMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams3).rightMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams3).bottomMargin);
                qZS.PjT(this.kph, ((int)TypedValue.applyDimension(1, 1.0f, displayMetrics0)), this.Wo.top, this.Wo.right, this.Wo.bottom);
            }
        }
        View view0 = this.ig;
        if(view0 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams4 = view0.getLayoutParams();
            this.Nv = viewGroup$LayoutParams4.height;
            viewGroup$LayoutParams4.height = (int)TypedValue.applyDimension(1, 49.0f, displayMetrics0);
            this.ig.setLayoutParams(viewGroup$LayoutParams4);
            this.ig.setBackgroundResource(Lrd.cr(this.yIW, "tt_shadow_fullscreen_top"));
        }
        this.Zh(false, true);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    @SuppressLint({"ClickableViewAccessibility"})
    protected void cr() {
        super.cr();
        this.uQg.PjT(this.ReZ);
        int v = 8;
        qZS.PjT(this.Zd, (this.RD || (this.Lrd & 1) == 1 ? 8 : 0));
        this.Zd.setOnClickListener(new View.OnClickListener() {
            final cr PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(cr.this.xE()) {
                    cr.this.Yo.ReZ(cr.this, view0);
                }
            }
        });
        TextView textView0 = this.qZS;
        if(!this.RD || (this.Lrd & 2) == 2) {
            v = 0;
        }
        qZS.PjT(textView0, v);
        this.qZS.setOnClickListener(new View.OnClickListener() {
            final cr PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(cr.this.xE()) {
                    cr.this.Yo.cr(cr.this, view0);
                }
            }
        });
        this.OMu.setOnClickListener(new View.OnClickListener() {
            final cr PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(cr.this.xE()) {
                    cr.this.Yo.JQp(cr.this, view0);
                }
            }
        });
        this.tY.setOnClickListener(new View.OnClickListener() {
            final cr PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                cr.this.Zh(false, true);
                cr.this.Au();
                cr.this.XX();
            }
        });
        this.oG.setOnClickListener(new View.OnClickListener() {
            final cr PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(cr.this.xE()) {
                    cr.this.Yo.Zh(cr.this, view0);
                }
            }
        });
        this.MWx.setThumbOffset(0);
        this.MWx.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            final cr PjT;

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
                if(cr.this.xE()) {
                    cr.this.Yo.PjT(cr.this, v, z);
                }
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar0) {
                if(!cr.this.zZ && cr.this.yIW != null) {
                    seekBar0.setThumb(DWo.PjT(com.bytedance.sdk.openadsdk.core.ub.PjT(), "tt_seek_thumb_press"));
                }
                if(cr.this.xE()) {
                    seekBar0.setThumbOffset(0);
                    PjT pjT0 = cr.this.Yo;
                    int v = seekBar0.getProgress();
                    pjT0.Zh(cr.this, v);
                }
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar0) {
                if(!cr.this.zZ && cr.this.yIW != null) {
                    seekBar0.setThumb(DWo.PjT(com.bytedance.sdk.openadsdk.core.ub.PjT(), "tt_seek_thumb_normal"));
                }
                if(cr.this.xE()) {
                    seekBar0.setThumbOffset(0);
                    PjT pjT0 = cr.this.Yo;
                    int v = seekBar0.getProgress();
                    pjT0.PjT(cr.this, v);
                }
            }
        });
        this.MWx.setOnTouchListener(this.RV);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void cz() {
        this.HG.removeMessages(1);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.JQp
    public void qj() {
        this.PjT(true, false);
    }

    private void yIW() {
        TextView textView0 = this.cI;
        if(textView0 != null) {
            textView0.setTextSize(0, this.xR);
            ColorStateList colorStateList0 = this.fK;
            if(colorStateList0 != null) {
                this.cI.setTextColor(colorStateList0);
            }
            this.cI.setAlpha(this.na);
            this.cI.setShadowLayer(((float)qZS.Zh(this.yIW, 1.0f)), 0.0f, 0.0f, Lrd.XX(this.yIW, "tt_72000000"));
            qZS.PjT(this.cI, this.MN.left, this.MN.top, this.MN.right, this.MN.bottom);
        }
        TextView textView1 = this.Ld;
        if(textView1 != null) {
            textView1.setTextSize(0, this.UR);
            ColorStateList colorStateList1 = this.CD;
            if(colorStateList1 != null) {
                this.Ld.setTextColor(colorStateList1);
            }
            this.Ld.setAlpha(this.Vs);
            this.Ld.setShadowLayer(((float)qZS.Zh(this.yIW, 1.0f)), 0.0f, 0.0f, Lrd.XX(this.yIW, "tt_72000000"));
            qZS.PjT(this.Ld, this.Wo.left, this.Wo.top, this.Wo.right, this.Wo.bottom);
        }
        ImageView imageView0 = this.oG;
        if(imageView0 != null) {
            qZS.PjT(imageView0, this.jK.left, this.jK.top, this.jK.right, this.jK.bottom);
        }
        ImageView imageView1 = this.oG;
        if(imageView1 != null) {
            imageView1.setImageDrawable(Lrd.ReZ(this.yIW, "tt_enlarge_video"));
        }
        TextView textView2 = this.kph;
        if(textView2 != null) {
            ColorStateList colorStateList2 = this.yks;
            if(colorStateList2 != null) {
                textView2.setTextColor(colorStateList2);
            }
            this.kph.setAlpha(this.Xtz);
            qZS.PjT(this.kph, this.Wo.left, this.Wo.top, this.Wo.right, this.Wo.bottom);
        }
        View view0 = this.ig;
        if(view0 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            viewGroup$LayoutParams0.height = this.Nv;
            this.ig.setLayoutParams(viewGroup$LayoutParams0);
            this.ig.setBackground(DWo.PjT(this.yIW, "tt_video_black_desc_gradient"));
        }
        this.Zh(false, true);
    }
}

