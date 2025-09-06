package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.JQp.XX;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class Zh extends Dialog {
    public interface PjT {
        void PjT();

        void Zh();
    }

    private final Context Au;
    private String DWo;
    private com.bytedance.sdk.openadsdk.core.JQp.PjT JQp;
    public PjT PjT;
    private Au ReZ;
    private String SM;
    private View XX;
    private cr Zh;
    private Au cr;
    private com.bytedance.sdk.openadsdk.core.JQp.PjT cz;
    private boolean fDm;
    private String qj;
    private String xf;
    private int xs;

    public Zh(Context context0) {
        super(context0, Lrd.cz(context0, "tt_custom_dialog"));
        this.xs = -1;
        this.fDm = false;
        this.Au = context0;
    }

    private int PjT(float f) {
        return qZS.Zh(this.getContext(), f);
    }

    private View PjT(Context context0) {
        View view0 = new XX(context0);
        ((XX)view0).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        JQp jQp0 = new JQp(context0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams0.addRule(13);
        jQp0.setMinimumWidth(this.PjT(260.0f));
        jQp0.setPadding(0, this.PjT(32.0f), 0, 0);
        jQp0.setBackground(DWo.PjT(context0, "tt_custom_dialog_bg"));
        jQp0.setOrientation(1);
        jQp0.setLayoutParams(relativeLayout$LayoutParams0);
        this.ReZ = new Au(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams0.gravity = 17;
        linearLayout$LayoutParams0.leftMargin = this.PjT(16.0f);
        linearLayout$LayoutParams0.rightMargin = this.PjT(16.0f);
        linearLayout$LayoutParams0.bottomMargin = this.PjT(16.0f);
        this.ReZ.setGravity(17);
        this.ReZ.setVisibility(0);
        this.ReZ.setTextColor(Color.parseColor("#333333"));
        this.ReZ.setTextSize(18.0f);
        this.ReZ.setLayoutParams(linearLayout$LayoutParams0);
        this.Zh = new cr(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams1.gravity = 17;
        linearLayout$LayoutParams1.leftMargin = this.PjT(16.0f);
        linearLayout$LayoutParams1.rightMargin = this.PjT(16.0f);
        linearLayout$LayoutParams1.bottomMargin = this.PjT(10.0f);
        this.Zh.setMaxHeight(this.PjT(150.0f));
        this.Zh.setMaxWidth(this.PjT(150.0f));
        this.Zh.setVisibility(0);
        this.Zh.setLayoutParams(linearLayout$LayoutParams1);
        this.cr = new Au(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams2.leftMargin = this.PjT(20.0f);
        linearLayout$LayoutParams2.rightMargin = this.PjT(20.0f);
        this.cr.setGravity(17);
        this.cr.setLineSpacing(((float)this.PjT(3.0f)), 1.2f);
        this.cr.setTextSize(18.0f);
        this.cr.setTextColor(Color.parseColor("#000000"));
        this.cr.setLayoutParams(linearLayout$LayoutParams2);
        View view1 = new View(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-1, 1);
        linearLayout$LayoutParams3.topMargin = this.PjT(32.0f);
        view1.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view1.setLayoutParams(linearLayout$LayoutParams3);
        JQp jQp1 = new JQp(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        jQp1.setOrientation(0);
        jQp1.setLayoutParams(linearLayout$LayoutParams4);
        com.bytedance.sdk.openadsdk.core.JQp.PjT pjT0 = new com.bytedance.sdk.openadsdk.core.JQp.PjT(context0);
        this.JQp = pjT0;
        pjT0.setId(0x1F000016);
        LinearLayout.LayoutParams linearLayout$LayoutParams5 = new LinearLayout.LayoutParams(0, -2);
        linearLayout$LayoutParams5.leftMargin = this.PjT(10.0f);
        linearLayout$LayoutParams5.weight = 1.0f;
        this.JQp.setPadding(0, this.PjT(16.0f), 0, this.PjT(16.0f));
        this.JQp.setBackground(null);
        this.JQp.setGravity(17);
        this.JQp.setSingleLine(true);
        this.JQp.setTextColor(Color.parseColor("#999999"));
        this.JQp.setTextSize(16.0f);
        this.JQp.setLayoutParams(linearLayout$LayoutParams5);
        this.XX = new View(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams6 = new LinearLayout.LayoutParams(1, -1);
        this.XX.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.XX.setLayoutParams(linearLayout$LayoutParams6);
        this.cz = new com.bytedance.sdk.openadsdk.core.JQp.PjT(context0);
        this.JQp.setId(0x1F000017);
        LinearLayout.LayoutParams linearLayout$LayoutParams7 = new LinearLayout.LayoutParams(0, -2);
        linearLayout$LayoutParams7.rightMargin = this.PjT(10.0f);
        linearLayout$LayoutParams7.weight = 1.0f;
        this.cz.setPadding(0, this.PjT(16.0f), 0, this.PjT(16.0f));
        this.cz.setBackground(null);
        this.cz.setGravity(17);
        this.cz.setSingleLine(true);
        this.cz.setTextColor(Color.parseColor("#38ADFF"));
        this.cz.setTextSize(16.0f);
        this.cz.setLayoutParams(linearLayout$LayoutParams7);
        ((ViewGroup)view0).addView(jQp0);
        jQp0.addView(this.ReZ);
        jQp0.addView(this.Zh);
        jQp0.addView(this.cr);
        jQp0.addView(view1);
        jQp0.addView(jQp1);
        jQp1.addView(this.JQp);
        jQp1.addView(this.XX);
        jQp1.addView(this.cz);
        return view0;
    }

    private void PjT() {
        this.cz.setOnClickListener(new View.OnClickListener() {
            final Zh PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                PjT zh$PjT0 = Zh.this.PjT;
                if(zh$PjT0 != null) {
                    zh$PjT0.PjT();
                }
            }
        });
        this.JQp.setOnClickListener(new View.OnClickListener() {
            final Zh PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                PjT zh$PjT0 = Zh.this.PjT;
                if(zh$PjT0 != null) {
                    zh$PjT0.Zh();
                }
            }
        });
    }

    public Zh PjT(PjT zh$PjT0) {
        this.PjT = zh$PjT0;
        return this;
    }

    public Zh PjT(String s) {
        this.SM = s;
        return this;
    }

    public Zh ReZ(String s) {
        this.xf = s;
        return this;
    }

    private void Zh() {
        if(TextUtils.isEmpty(this.DWo)) {
            this.ReZ.setVisibility(8);
        }
        else {
            this.ReZ.setText(this.DWo);
            this.ReZ.setVisibility(0);
        }
        if(!TextUtils.isEmpty(this.SM)) {
            this.cr.setText(this.SM);
        }
        if(TextUtils.isEmpty(this.qj)) {
            this.cz.setText(Lrd.PjT(ub.PjT(), "tt_postive_txt"));
        }
        else {
            this.cz.setText(this.qj);
        }
        if(TextUtils.isEmpty(this.xf)) {
            this.JQp.setText(Lrd.PjT(ub.PjT(), "tt_negtive_txt"));
        }
        else {
            this.JQp.setText(this.xf);
        }
        int v = this.xs;
        if(v == -1) {
            this.Zh.setVisibility(8);
        }
        else {
            this.Zh.setImageResource(v);
            this.Zh.setVisibility(0);
        }
        if(this.fDm) {
            this.XX.setVisibility(8);
            this.JQp.setVisibility(8);
            return;
        }
        this.JQp.setVisibility(0);
        this.XX.setVisibility(0);
    }

    public Zh Zh(String s) {
        this.qj = s;
        return this;
    }

    @Override  // android.app.Dialog
    public void onBackPressed() {
    }

    @Override  // android.app.Dialog
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(this.PjT(this.Au));
        this.setCanceledOnTouchOutside(false);
        this.Zh();
        this.PjT();
    }

    @Override  // android.app.Dialog
    public void show() {
        super.show();
        this.Zh();
    }
}

