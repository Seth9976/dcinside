package com.bytedance.sdk.openadsdk.ReZ;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import java.util.List;

public class SM extends ReZ implements PjT, com.bytedance.sdk.openadsdk.ReZ.DWo.ReZ, Zh, cr {
    private View Au;
    private com.bytedance.sdk.openadsdk.core.JQp.cr DWo;
    private Au JQp;
    cz PjT;
    private int ReZ;
    private View SM;
    private qj XX;
    private int Zh;
    private final DWo cr;
    private TextView cz;
    private FilterWord fDm;
    private Au qj;
    private int xf;
    private int xs;

    public SM(Context context0, DWo dWo0) {
        this(context0, dWo0, null);
    }

    public SM(Context context0, DWo dWo0, List list0) {
        super(context0);
        this.cr = dWo0;
        dWo0.PjT(this);
        dWo0.PjT(this);
        dWo0.PjT(this);
        dWo0.PjT(this);
        this.ReZ();
        this.PjT(context0);
        if(list0 != null && !list0.isEmpty()) {
            this.Zh(list0);
        }
    }

    private void PjT(Context context0) {
        this.ReZ = qZS.Zh(context0, 8.0f);
        this.Zh = qZS.Zh(context0, 20.0f);
        int v = qZS.Zh(context0, 56.0f);
        int v1 = qZS.Zh(context0, 30.0f);
        int v2 = qZS.Zh(context0, 12.0f);
        if(this.cr()) {
            v2 = this.Zh;
        }
        if(!this.cr()) {
            v = v1;
        }
        View view0 = new View(this.getContext());
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, qZS.Zh(this.getContext(), 98.0f));
        view0.setBackground(Lrd.ReZ(context0, "tt_ad_bg_header_gradient"));
        this.addView(view0, viewGroup$LayoutParams0);
        ViewGroup.LayoutParams viewGroup$LayoutParams1 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setCornerRadius(((float)this.ReZ));
        gradientDrawable0.setColor(-1);
        this.setBackground(gradientDrawable0);
        this.setLayoutParams(viewGroup$LayoutParams1);
        com.bytedance.sdk.openadsdk.core.JQp.cr cr0 = new com.bytedance.sdk.openadsdk.core.JQp.cr(context0);
        int v3 = qZS.Zh(context0, 24.0f);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v3, v3);
        frameLayout$LayoutParams0.setMargins(0, v2, v2, 0);
        frameLayout$LayoutParams0.gravity = 0x800035;
        cr0.setImageDrawable(com.bytedance.sdk.openadsdk.utils.DWo.PjT(context0, "tt_titlebar_close_seletor"));
        this.addView(cr0, frameLayout$LayoutParams0);
        cr0.setOnClickListener(new View.OnClickListener() {
            final SM PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                SM.this.cr.JQp();
            }
        });
        com.bytedance.sdk.openadsdk.core.JQp.cr cr1 = new com.bytedance.sdk.openadsdk.core.JQp.cr(context0);
        this.DWo = cr1;
        cr1.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
            View view0 = SM.this.SM;
            if(view0 != null) {
                view0.setVisibility(8);
            }
            View view1 = SM.this.Au;
            if(view1 != null) {
                view1.setVisibility(0);
            }
            com.bytedance.sdk.openadsdk.core.JQp.cr cr0 = SM.this.DWo;
            if(cr0 != null) {
                cr0.setVisibility(8);
            }
            DWo dWo0 = SM.this.cr;
            if(dWo0 != null) {
                FilterWord filterWord0 = SM.this.fDm;
                if(filterWord0 == null) {
                    dWo0.PjT(DWo.PjT);
                }
                else {
                    dWo0.PjT(filterWord0);
                }
                SM.this.cr.ReZ(null);
            }
        });
        this.DWo.setVisibility(8);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(v3, v3);
        frameLayout$LayoutParams1.setMargins(v2, v2, 0, 0);
        frameLayout$LayoutParams1.gravity = 0x800033;
        Drawable drawable0 = com.bytedance.sdk.openadsdk.utils.DWo.PjT(context0, "tt_leftbackicon_selector");
        drawable0.setAutoMirrored(true);
        this.DWo.setImageDrawable(drawable0);
        this.addView(this.DWo, frameLayout$LayoutParams1);
        JQp jQp0 = new JQp(context0);
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout$LayoutParams2.setMargins(v2, v, v2, v2);
        jQp0.setOrientation(1);
        this.addView(jQp0, frameLayout$LayoutParams2);
        View view1 = this.ReZ(context0);
        this.Au = view1;
        jQp0.addView(view1);
        View view2 = this.cr(context0);
        this.SM = view2;
        jQp0.addView(view2);
        Au au0 = this.Zh(context0);
        this.JQp = au0;
        jQp0.addView(au0);

        class com.bytedance.sdk.openadsdk.ReZ.SM.2 implements View.OnClickListener {
            final SM PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                SM.this.Zh();
            }
        }

    }

    // 检测为 Lambda 实现
    public void PjT() [...]

    @Override  // com.bytedance.sdk.openadsdk.ReZ.DWo$Zh
    public void PjT(int v) {
        if(DWo.ReZ == v) {
            this.fDm = null;
            this.Zh();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.ReZ.DWo$ReZ
    public void PjT(FilterWord filterWord0) {
        if(filterWord0 == null) {
            return;
        }
        if(this.JQp != null && TextUtils.isEmpty(this.cr.XX())) {
            this.JQp.setEnabled(!DWo.PjT.equals(filterWord0));
        }
        if(com.bytedance.sdk.openadsdk.ReZ.JQp.PjT.equals(filterWord0) || com.bytedance.sdk.openadsdk.ReZ.JQp.Zh.equals(filterWord0)) {
            this.cz.setVisibility(8);
            this.XX.setVisibility(8);
        }
        if(com.bytedance.sdk.openadsdk.ReZ.JQp.ReZ.equals(filterWord0) || DWo.PjT.equals(filterWord0)) {
            this.cz.setVisibility(0);
            this.XX.setVisibility(0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.ReZ.DWo$cr
    public void PjT(String s) {
        Au au0 = this.qj;
        if(au0 != null) {
            au0.setText(s);
        }
        if(TextUtils.isEmpty(s)) {
            DWo dWo0 = this.cr;
            if(dWo0 != null) {
                Au au1 = this.JQp;
                if(au1 != null) {
                    au1.setEnabled(dWo0.ReZ());
                }
            }
        }
        else {
            Au au2 = this.JQp;
            if(au2 != null) {
                au2.setEnabled(true);
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.ReZ.DWo$PjT
    public void PjT(List list0) {
        this.Zh(list0);
    }

    private View ReZ(Context context0) {
        View view0 = new JQp(context0);
        ((JQp)view0).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ((LinearLayout)view0).setOrientation(1);
        TextView textView0 = new TextView(context0);
        textView0.setText(Lrd.PjT(context0, "tt_like_this_ad"));
        textView0.setTextSize(((float)(this.cr() ? 23 : 16)));
        textView0.setGravity(1);
        textView0.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams0.gravity = 1;
        ((ViewGroup)view0).addView(textView0, linearLayout$LayoutParams0);
        TextView textView1 = new TextView(context0);
        textView1.setText(Lrd.PjT(context0, "tt_feel_hint"));
        int v = 14;
        textView1.setTextSize(((float)(this.cr() ? 14 : 10)));
        textView1.setAlpha(0.5f);
        textView1.setTextColor(Color.parseColor("#161823"));
        textView1.setGravity(17);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams1.gravity = 17;
        if(this.cr()) {
            linearLayout$LayoutParams1.topMargin = qZS.Zh(context0, 4.0f);
        }
        ((ViewGroup)view0).addView(textView1, linearLayout$LayoutParams1);
        JQp jQp0 = new JQp(context0);
        jQp0.setOrientation(0);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int v1 = qZS.Zh(context0, 16.0f);
        int v2 = qZS.Zh(context0, 12.0f);
        int v3 = qZS.Zh(context0, 8.0f);
        if(this.cr()) {
            linearLayout$LayoutParams2.topMargin = v1;
            linearLayout$LayoutParams2.bottomMargin = v1;
        }
        else {
            linearLayout$LayoutParams2.topMargin = v2;
            linearLayout$LayoutParams2.bottomMargin = v3;
        }
        ((ViewGroup)view0).addView(jQp0, linearLayout$LayoutParams2);
        jQp0.addView(new com.bytedance.sdk.openadsdk.ReZ.JQp(context0, 1, this.cr));
        com.bytedance.sdk.openadsdk.ReZ.JQp jQp1 = new com.bytedance.sdk.openadsdk.ReZ.JQp(context0, 2, this.cr);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = jQp1.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams)) {
            viewGroup$LayoutParams0 = new LinearLayout.LayoutParams(0, -2);
            viewGroup$LayoutParams0.weight = 1.0f;
        }
        ((LinearLayout.LayoutParams)viewGroup$LayoutParams0).leftMargin = v1;
        ((LinearLayout.LayoutParams)viewGroup$LayoutParams0).rightMargin = v1;
        jQp0.addView(jQp1, viewGroup$LayoutParams0);
        jQp0.addView(new com.bytedance.sdk.openadsdk.ReZ.JQp(context0, 3, this.cr));
        qj qj0 = new qj(context0);
        this.XX = qj0;
        ((ViewGroup)view0).addView(qj0);
        this.cz = new TextView(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        if(!this.cr()) {
            v1 = v3;
        }
        linearLayout$LayoutParams3.topMargin = v1;
        this.cz.setTextColor(0xFF000000);
        this.cz.setPadding(v2, v3, v2, v3);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setCornerRadius(((float)v3));
        gradientDrawable0.setColor(Color.parseColor("#F8F8F8"));
        this.cz.setBackground(gradientDrawable0);
        this.cz.setText(Lrd.PjT(context0, "tt_report_this_ad"));
        if(!this.cr()) {
            v = 12;
        }
        this.cz.setTextSize(((float)v));
        Drawable drawable0 = Lrd.ReZ(context0, "tt_report_ad_arrow");
        drawable0.setBounds(0, 0, v2, v2);
        this.cz.setCompoundDrawables(null, null, drawable0, null);
        this.cz.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
            View view0 = SM.this.SM;
            if(view0 != null) {
                view0.setVisibility(0);
            }
            View view1 = SM.this.Au;
            if(view1 != null) {
                view1.setVisibility(8);
            }
            com.bytedance.sdk.openadsdk.core.JQp.cr cr0 = SM.this.DWo;
            if(cr0 != null) {
                cr0.setVisibility(0);
            }
            if(SM.this.cr != null && SM.this.cr.ReZ()) {
                SM.this.fDm = SM.this.cr.Zh();
            }
        });
        ((ViewGroup)view0).addView(this.cz, linearLayout$LayoutParams3);
        return view0;

        class com.bytedance.sdk.openadsdk.ReZ.SM.4 implements View.OnClickListener {
            final SM PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                SM.this.PjT();
            }
        }

    }

    private void ReZ() {
        if(this.xf > 0) {
            return;
        }
        this.xf = qZS.ReZ(this.getContext());
        int v = qZS.JQp(this.getContext());
        this.xs = v;
        this.cr.PjT(this.xf, v);
    }

    private Au Zh(Context context0) {
        Au au0 = new Au(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.topMargin = this.cr() ? this.Zh : qZS.Zh(context0, 12.0f);
        linearLayout$LayoutParams0.gravity = 80;
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setCornerRadius(((float)this.ReZ));
        int v = Color.rgb(0xFE, 44, 85);
        gradientDrawable0.setColor(v);
        gradientDrawable0.setAlpha(102);
        GradientDrawable gradientDrawable1 = new GradientDrawable();
        gradientDrawable1.setCornerRadius(((float)this.ReZ));
        gradientDrawable1.setColor(v);
        StateListDrawable stateListDrawable0 = new StateListDrawable();
        stateListDrawable0.addState(new int[]{0x101009E}, gradientDrawable1);
        stateListDrawable0.addState(new int[0], gradientDrawable0);
        au0.setPadding(0, this.ReZ, 0, this.ReZ);
        au0.setGravity(17);
        au0.setBackground(stateListDrawable0);
        au0.setTextColor(-1);
        au0.setTextSize(16.0f);
        au0.setText(Lrd.PjT(context0, "tt_suggestion_commit"));
        au0.setEnabled(false);
        au0.setOnClickListener(new View.OnClickListener() {
            final SM PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                SM.this.cr.cr();
            }
        });
        au0.setLayoutParams(linearLayout$LayoutParams0);
        return au0;
    }

    private void Zh(List list0) {
        this.PjT.PjT(list0);
    }

    // 检测为 Lambda 实现
    public void Zh() [...]

    private View cr(Context context0) {
        View view0 = new JQp(context0);
        ((LinearLayout)view0).setOrientation(1);
        ((JQp)view0).setLayoutParams(new LinearLayout.LayoutParams(-1, (this.cr() ? qZS.Zh(context0, 358.0f) : qZS.Zh(context0, 200.0f))));
        TextView textView0 = new TextView(context0);
        textView0.setText(Lrd.PjT(context0, "tt_select_reason"));
        textView0.setTextSize(((float)(this.cr() ? 23 : 16)));
        textView0.setGravity(1);
        textView0.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams0.gravity = 1;
        linearLayout$LayoutParams0.bottomMargin = qZS.Zh(context0, (this.cr() ? 24.0f : 4.0f));
        ((ViewGroup)view0).addView(textView0, linearLayout$LayoutParams0);
        cz cz0 = new cz(context0, this.cr);
        this.PjT = cz0;
        ((ViewGroup)view0).addView(cz0);
        if(xs.Gr().VY()) {
            Au au0 = new Au(context0);
            this.qj = au0;
            au0.setId(qla.Wcm);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
            frameLayout$LayoutParams0.topMargin = this.cr() ? this.Zh : qZS.Zh(context0, 6.0f);
            frameLayout$LayoutParams0.gravity = 17;
            this.qj.setLayoutParams(frameLayout$LayoutParams0);
            this.qj.setFocusable(false);
            this.qj.setHint(Lrd.PjT(context0, "tt_add_bad_reason"));
            this.qj.setHintTextColor(Color.parseColor("#57000000"));
            this.qj.setTextColor(Color.rgb(22, 24, 35));
            this.qj.setTextSize(15.0f);
            this.qj.setGravity(0x800007);
            this.qj.setVisibility(0);
            this.qj.setPadding(0, qZS.Zh(context0, 15.0f), 0, qZS.Zh(context0, 14.0f));
            this.qj.setEllipsize(TextUtils.TruncateAt.END);
            this.qj.setSingleLine();
            this.qj.setMaxLines(1);
            this.qj.setOnClickListener(new View.OnClickListener() {
                final SM PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    SM.this.cr.cz();
                }
            });
            ((ViewGroup)view0).addView(this.qj, frameLayout$LayoutParams0);
            ((ViewGroup)view0).addView(new qj(context0, Color.argb(0x80, 0, 0, 0)));
        }
        view0.setVisibility(8);
        return view0;
    }

    private boolean cr() {
        if(this.xf == 0) {
            this.ReZ();
        }
        return this.xf < this.xs;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.JQp.ReZ
    public void setLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setLayoutParams(viewGroup$LayoutParams0);
        if(viewGroup$LayoutParams0 != null) {
            if(this.xf == 0) {
                this.ReZ();
            }
            viewGroup$LayoutParams0.width = Math.min(this.xf, this.xs) - qZS.Zh(this.getContext(), 16.0f) * 2;
        }
    }
}

