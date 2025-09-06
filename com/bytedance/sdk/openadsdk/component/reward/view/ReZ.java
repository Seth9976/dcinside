package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.JQp.xE;
import com.bytedance.sdk.openadsdk.SM.Zh;
import com.bytedance.sdk.openadsdk.SM.cr;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.Zh.XX;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.widget.qla;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class ReZ extends JQp {
    static class PjT implements xE {
        private final Owx PjT;
        private final String ReZ;
        private final String Zh;
        private final WeakReference cr;

        public PjT(ImageView imageView0, Owx owx0, String s, String s1) {
            this.cr = new WeakReference(imageView0);
            this.PjT = owx0;
            this.Zh = s;
            this.ReZ = s1;
        }

        private void PjT(int v, String s, String s1) {
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(new Au("load_vast_icon_fail") {
                final PjT cr;

                @Override
                public void run() {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("error_code", v);
                        jSONObject0.put("description", v + ":" + s);
                        jSONObject0.put("url", s1);
                    }
                    catch(Throwable unused_ex) {
                    }
                    com.bytedance.sdk.openadsdk.cr.ReZ.Zh(PjT.this.PjT, PjT.this.ReZ, "load_vast_icon_fail", jSONObject0);
                }
            });
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(int v, String s, @Nullable Throwable throwable0) {
            this.PjT(v, s, this.Zh);
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(qj qj0) {
            if(qj0 != null && qj0.Zh() != null) {
                ImageView imageView0 = (ImageView)this.cr.get();
                if(imageView0 != null) {
                    imageView0.setImageBitmap(((Bitmap)qj0.Zh()));
                }
                com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.PjT, this.ReZ, "load_vast_icon_success", null);
            }
        }
    }

    private boolean JQp;
    private qla PjT;
    private com.bytedance.sdk.openadsdk.core.widget.xE ReZ;
    private TextView Zh;
    private TextView cr;
    private com.bytedance.sdk.openadsdk.component.reward.PjT.PjT cz;

    public ReZ(@NonNull Context context0) {
        super(context0);
        this.setOrientation(1);
        this.setVisibility(8);
        this.setBackgroundColor(-1);
    }

    private void JQp() {
        Context context0 = this.getContext();
        this.setPadding(qZS.Zh(context0, 16.0f), qZS.Zh(context0, 16.0f), qZS.Zh(context0, 16.0f), qZS.Zh(context0, 24.0f));
        JQp jQp0 = new JQp(context0);
        jQp0.setOrientation(0);
        jQp0.setGravity(16);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.bottomMargin = qZS.Zh(context0, 12.0f);
        this.addView(jQp0, linearLayout$LayoutParams0);
        com.bytedance.sdk.openadsdk.core.widget.xE xE0 = new com.bytedance.sdk.openadsdk.core.widget.xE(context0);
        this.ReZ = xE0;
        xE0.setBackgroundColor(0);
        this.ReZ.setId(com.bytedance.sdk.openadsdk.utils.qla.Zh);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(qZS.Zh(context0, 48.0f), qZS.Zh(context0, 48.0f));
        jQp0.addView(this.ReZ, linearLayout$LayoutParams1);
        JQp jQp1 = new JQp(context0);
        jQp1.setOrientation(1);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams2.leftMargin = qZS.Zh(context0, 12.0f);
        jQp0.addView(jQp1, linearLayout$LayoutParams2);
        com.bytedance.sdk.openadsdk.core.JQp.Au au0 = new com.bytedance.sdk.openadsdk.core.JQp.Au(context0);
        this.cr = au0;
        TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
        au0.setEllipsize(textUtils$TruncateAt0);
        this.cr.setGravity(16);
        this.cr.setSingleLine(true);
        this.cr.setTextSize(2, 17.0f);
        this.cr.setId(com.bytedance.sdk.openadsdk.utils.qla.ReZ);
        this.cr.setTextColor(0xFF000000);
        jQp1.addView(this.cr, new LinearLayout.LayoutParams(-1, -2));
        qla qla0 = new qla(context0);
        this.PjT = qla0;
        qla0.setId(com.bytedance.sdk.openadsdk.utils.qla.JQp);
        jQp1.addView(this.PjT, new LinearLayout.LayoutParams(-2, qZS.Zh(context0, 14.0f)));
        com.bytedance.sdk.openadsdk.core.JQp.Au au1 = new com.bytedance.sdk.openadsdk.core.JQp.Au(context0);
        this.Zh = au1;
        au1.setGravity(17);
        this.Zh.setEllipsize(textUtils$TruncateAt0);
        this.Zh.setSingleLine(true);
        this.Zh.setTextColor(-1);
        this.Zh.setTextSize(2, 16.0f);
        this.Zh.setId(0x1F000009);
        this.Zh.setBackground(ReZ.PjT(context0));
        this.Zh.setText(this.cz.Zh.Nv());
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-1, qZS.Zh(context0, 36.0f));
        this.addView(this.Zh, linearLayout$LayoutParams3);
    }

    private static Drawable PjT(Context context0) {
        Drawable drawable0 = new GradientDrawable();
        ((GradientDrawable)drawable0).setColor(Color.parseColor("#1A73E8"));
        ((GradientDrawable)drawable0).setCornerRadius(((float)qZS.Zh(context0, 18.0f)));
        return drawable0;
    }

    public void PjT() {
        Keyframe keyframe0 = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframe1 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe keyframe2 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe keyframe3 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe keyframe4 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe keyframe5 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe("scaleX", new Keyframe[]{keyframe0, keyframe1, keyframe2, keyframe3, keyframe4, keyframe5}), PropertyValuesHolder.ofKeyframe("scaleY", new Keyframe[]{keyframe0, keyframe1, keyframe2, keyframe3, keyframe4, keyframe5})});
        objectAnimator0.setDuration(1000L);
        objectAnimator0.start();
    }

    public void PjT(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        this.cz = pjT0;
        if(pjT0.Zh.qZS() == 1) {
            this.ReZ();
        }
    }

    private void ReZ() {
        this.JQp = true;
        if(this.cz.cI == 1) {
            this.JQp();
        }
        else {
            this.cr();
        }
        if(this.Zh == null) {
            this.Zh = (TextView)this.cz.ig.findViewById(0x1F000009);
        }
        Owx owx0 = this.cz.Zh;
        TextView textView0 = this.Zh;
        if(textView0 != null) {
            textView0.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                final ReZ PjT;

                @Override  // android.view.View$OnLayoutChangeListener
                public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                    int v8 = ((ViewGroup)ReZ.this.Zh.getParent()).getWidth();
                    if(v8 > 0) {
                        ReZ.this.Zh.setMaxWidth(((int)(((float)v8) * 0.45f)));
                    }
                }
            });
            if(!owx0.uvo()) {
                this.Zh.setText((owx0.qZS() == 3 ? this.getButtonTextForNewStyleBar() : owx0.Nv()));
            }
            else if(owx0.QB() != null && TextUtils.isEmpty(owx0.QB().cz())) {
                qZS.PjT(this.Zh, 8);
            }
        }
        if(this.ReZ != null && owx0.Xe() != null && !TextUtils.isEmpty(owx0.Xe().PjT())) {
            String s = owx0.Xe().PjT();
            if(owx0.uvo()) {
                cr.PjT(owx0.Xe()).ReZ(2).PjT(new Zh(owx0, owx0.Xe().PjT(), new PjT(this.ReZ, owx0, s, this.cz.JQp)));
                if(owx0.QB() != null && owx0.QB().Zh() != null) {
                    owx0.QB().Zh().Zh(0L);
                }
            }
            else {
                com.bytedance.sdk.openadsdk.gK.Zh.PjT().PjT(owx0.Xe(), this.ReZ, owx0);
            }
        }
        TextView textView1 = this.cr;
        if(textView1 != null) {
            textView1.setText(owx0.Xtz());
        }
        qla qla0 = this.PjT;
        if(qla0 != null) {
            qZS.PjT(null, qla0, owx0);
        }
        if(this.cz.cI == 2 && owx0.qZS() == 1) {
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.Zh.getLayoutParams();
            linearLayout$LayoutParams0.height = qZS.Zh(this.cz.IJ, 55.0f);
            linearLayout$LayoutParams0.topMargin = qZS.Zh(this.cz.IJ, 20.0f);
            this.Zh.setLayoutParams(linearLayout$LayoutParams0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.getLayoutParams();
            frameLayout$LayoutParams0.bottomMargin = qZS.Zh(this.cz.IJ, 12.0f);
            this.setLayoutParams(frameLayout$LayoutParams0);
        }
        this.Zh();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void Zh() {
        com.bytedance.sdk.openadsdk.core.Zh.JQp jQp0 = this.cz.Yo.JQp();
        com.bytedance.sdk.openadsdk.core.Zh.Zh zh0 = this.cz.Yo.cr();
        Owx owx0 = this.cz.Zh;
        if(owx0.Zd() == null) {
            return;
        }
        if(owx0.qZS() != 5 && this.Zh != null) {
            if(owx0.Zd().JQp) {
                this.Zh.setOnClickListener(jQp0);
                this.Zh.setOnTouchListener(jQp0);
            }
            else {
                this.Zh.setOnClickListener(zh0);
            }
        }
        switch(owx0.qZS()) {
            case 1: {
                if(owx0.Zd().PjT) {
                    qZS.PjT(this, jQp0, "TTBaseVideoActivity#mRlDownloadBar");
                    qZS.PjT(this, jQp0, "TTBaseVideoActivity#mRlDownloadBar");
                    this.cr.setOnClickListener(jQp0);
                    this.cr.setOnTouchListener(jQp0);
                    this.PjT.setOnClickListener(jQp0);
                    this.PjT.setOnTouchListener(jQp0);
                    this.ReZ.setOnClickListener(jQp0);
                    this.ReZ.setOnTouchListener(jQp0);
                    return;
                }
                qZS.PjT(this, zh0, "TTBaseVideoActivity#mRlDownloadBar");
                this.cr.setOnClickListener(zh0);
                this.PjT.setOnClickListener(zh0);
                this.ReZ.setOnClickListener(zh0);
                return;
            }
            case 5: {
                if(owx0.Zd().JQp) {
                    com.bytedance.sdk.openadsdk.component.reward.view.ReZ.2 reZ$20 = new XX("VAST_ACTION_BUTTON", owx0.QB(), jQp0) {
                        final ReZ PjT;

                    };
                    com.bytedance.sdk.openadsdk.component.reward.view.ReZ.3 reZ$30 = new XX("VAST_ICON", owx0.QB(), jQp0) {
                        final ReZ PjT;

                    };
                    TextView textView0 = this.Zh;
                    if(textView0 != null) {
                        textView0.setOnClickListener(reZ$20);
                        this.Zh.setOnTouchListener(reZ$20);
                    }
                    com.bytedance.sdk.openadsdk.core.widget.xE xE0 = this.ReZ;
                    if(xE0 != null) {
                        xE0.setOnClickListener(reZ$30);
                        this.ReZ.setOnTouchListener(reZ$30);
                    }
                    if(this.cr != null && !TextUtils.isEmpty(this.cr.getText())) {
                        this.cr.setOnClickListener(reZ$20);
                        this.cr.setOnTouchListener(reZ$20);
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.view.ReZ.4 reZ$40 = new View.OnClickListener() {
                    final ReZ ReZ;

                    @Override  // android.view.View$OnClickListener
                    public void onClick(View view0) {
                        View.OnClickListener view$OnClickListener0 = zh0;
                        if(view$OnClickListener0 != null) {
                            view$OnClickListener0.onClick(view0);
                        }
                        if(view0 != null && "VAST_ICON".equals(view0.getTag(0x22000001))) {
                            if(owx0.QB() != null && owx0.QB().Zh() != null) {
                                owx0.QB().Zh().PjT(ReZ.this.cz.tT.XX());
                            }
                        }
                        else if(owx0.QB() != null) {
                            owx0.QB().PjT().XX(ReZ.this.cz.tT.XX());
                        }
                    }
                };
                TextView textView1 = this.Zh;
                if(textView1 != null) {
                    textView1.setOnClickListener(reZ$40);
                }
                if(this.cr != null && !TextUtils.isEmpty(this.cr.getText())) {
                    this.cr.setOnClickListener(reZ$40);
                }
                com.bytedance.sdk.openadsdk.core.widget.xE xE1 = this.ReZ;
                if(xE1 != null) {
                    xE1.setTag(0x22000001, "VAST_ICON");
                    this.ReZ.setOnClickListener(zh0);
                }
                return;
            }
            default: {
                if(owx0.Zd().ReZ) {
                    qZS.PjT(this, jQp0, "TTBaseVideoActivity#mRlDownloadBar");
                    qZS.PjT(this, jQp0, "TTBaseVideoActivity#mRlDownloadBar");
                    return;
                }
                qZS.PjT(this, zh0, "TTBaseVideoActivity#mRlDownloadBar");
            }
        }
    }

    private void cr() {
        this.setOrientation(0);
        this.setGravity(16);
        Context context0 = this.getContext();
        this.setPadding(qZS.Zh(context0, 16.0f), qZS.Zh(context0, 12.0f), qZS.Zh(context0, 16.0f), qZS.Zh(context0, 12.0f));
        com.bytedance.sdk.openadsdk.core.widget.xE xE0 = new com.bytedance.sdk.openadsdk.core.widget.xE(context0);
        this.ReZ = xE0;
        xE0.setBackgroundColor(0);
        this.ReZ.setId(com.bytedance.sdk.openadsdk.utils.qla.Zh);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(qZS.Zh(context0, 48.0f), qZS.Zh(context0, 48.0f));
        this.addView(this.ReZ, linearLayout$LayoutParams0);
        JQp jQp0 = new JQp(context0);
        jQp0.setOrientation(1);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(0, -2);
        linearLayout$LayoutParams1.leftMargin = qZS.Zh(context0, 12.0f);
        linearLayout$LayoutParams1.weight = 1.0f;
        this.addView(jQp0, linearLayout$LayoutParams1);
        com.bytedance.sdk.openadsdk.core.JQp.Au au0 = new com.bytedance.sdk.openadsdk.core.JQp.Au(context0);
        this.cr = au0;
        TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
        au0.setEllipsize(textUtils$TruncateAt0);
        this.cr.setGravity(16);
        this.cr.setSingleLine(true);
        this.cr.setTextSize(2, 17.0f);
        this.cr.setId(com.bytedance.sdk.openadsdk.utils.qla.ReZ);
        this.cr.setTextColor(0xFF000000);
        jQp0.addView(this.cr, new LinearLayout.LayoutParams(-1, -2));
        qla qla0 = new qla(context0);
        this.PjT = qla0;
        qla0.setId(com.bytedance.sdk.openadsdk.utils.qla.JQp);
        jQp0.addView(this.PjT, new LinearLayout.LayoutParams(-2, qZS.Zh(context0, 14.0f)));
        com.bytedance.sdk.openadsdk.core.JQp.Au au1 = new com.bytedance.sdk.openadsdk.core.JQp.Au(context0);
        this.Zh = au1;
        au1.setGravity(17);
        this.Zh.setEllipsize(textUtils$TruncateAt0);
        this.Zh.setSingleLine(true);
        this.Zh.setTextColor(-1);
        this.Zh.setTextSize(2, 16.0f);
        this.Zh.setId(0x1F000009);
        this.Zh.setBackground(ReZ.PjT(context0));
        this.Zh.setText(this.cz.Zh.Nv());
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(qZS.Zh(context0, 164.0f), qZS.Zh(context0, 36.0f));
        this.addView(this.Zh, linearLayout$LayoutParams2);
    }

    protected String getButtonTextForNewStyleBar() {
        String s1;
        String s = wN.XX(this.cz.IJ);
        if(s == null) {
            s = "";
        }
        try {
            boolean z = false;
            z = s.equals("en");
        }
        catch(Throwable unused_ex) {
        }
        if(!TextUtils.isEmpty(this.cz.Zh.Nv())) {
            s1 = this.cz.Zh.Nv();
            if(s1 == null || !wN.cz(s1) || s1.length() <= 2) {
                if(s1 != null && !wN.cz(s1) && s1.length() > 7 && z) {
                    s1 = this.getCnOrEnBtnText();
                }
            }
            else if(z) {
                s1 = this.getCnOrEnBtnText();
            }
        }
        else if(this.cz.Zh.cI() != 4) {
            s1 = "View";
        }
        else {
            s1 = "Install";
        }
        if(z && !wN.cz(s1)) {
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.Zh.getLayoutParams();
            linearLayout$LayoutParams0.bottomMargin = qZS.Zh(this.cz.IJ, 4.0f);
            this.Zh.setLayoutParams(linearLayout$LayoutParams0);
        }
        return s1;
    }

    private String getCnOrEnBtnText() {
        return this.cz.Zh.cI() == 4 ? "Install" : "View";
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        if(v == 0 && !this.JQp) {
            this.ReZ();
        }
    }
}

