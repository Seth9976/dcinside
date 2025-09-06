package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.PjT;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.JQp.XX;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.utils.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import org.json.JSONException;
import org.json.JSONObject;

public class ub extends Dialog {
    private Button JQp;
    private final Handler PjT;
    private String ReZ;
    private static final String[] Zh;
    private TextView cr;
    private ImageView cz;

    static {
        ub.Zh = new String[]{"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    }

    public ub(@NonNull Context context0) {
        super(context0, Lrd.cz(context0, "tt_privacy_dialog_theme_ad_report"));
        this.PjT = new Handler(Looper.getMainLooper());
        this.ReZ = "";
    }

    private int PjT(float f) {
        return qZS.Zh(this.getContext(), f);
    }

    private View PjT(Context context0) {
        View view0 = new JQp(context0);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -1);
        view0.setBackground(DWo.PjT(context0, "tt_ad_report_info_bg"));
        ((LinearLayout)view0).setOrientation(1);
        ((JQp)view0).setLayoutParams(viewGroup$LayoutParams0);
        XX xX0 = new XX(context0);
        xX0.setLayoutParams(new ViewGroup.LayoutParams(-1, this.PjT(44.0f)));
        Au au0 = new Au(context0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(this.PjT(191.0f), this.PjT(24.0f));
        relativeLayout$LayoutParams0.addRule(13);
        au0.setGravity(17);
        au0.setText("Ad Report");
        au0.setTextColor(Color.parseColor("#161823"));
        au0.setTextSize(1, 17.0f);
        au0.setLayoutParams(relativeLayout$LayoutParams0);
        this.cz = new cr(context0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(this.PjT(40.0f), this.PjT(44.0f));
        relativeLayout$LayoutParams1.addRule(11);
        relativeLayout$LayoutParams1.addRule(15);
        relativeLayout$LayoutParams1.rightMargin = this.PjT(8.0f);
        this.cz.setPadding(this.PjT(12.0f), this.PjT(14.0f), this.PjT(12.0f), this.PjT(14.0f));
        this.cz.setImageResource(Lrd.cr(context0, "tt_ad_xmark"));
        this.cz.setLayoutParams(relativeLayout$LayoutParams1);
        View view1 = new View(context0);
        ViewGroup.LayoutParams viewGroup$LayoutParams1 = new ViewGroup.LayoutParams(-1, this.PjT(0.5f));
        view1.setBackgroundColor(Color.parseColor("#1F161823"));
        view1.setLayoutParams(viewGroup$LayoutParams1);
        ScrollView scrollView0 = new ScrollView(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, 0);
        linearLayout$LayoutParams0.leftMargin = this.PjT(16.0f);
        linearLayout$LayoutParams0.rightMargin = this.PjT(16.0f);
        linearLayout$LayoutParams0.weight = 1.0f;
        linearLayout$LayoutParams0.setMarginStart(this.PjT(16.0f));
        linearLayout$LayoutParams0.setMarginEnd(this.PjT(16.0f));
        scrollView0.setLayoutParams(linearLayout$LayoutParams0);
        JQp jQp0 = new JQp(context0);
        ViewGroup.LayoutParams viewGroup$LayoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        jQp0.setOrientation(1);
        jQp0.setLayoutParams(viewGroup$LayoutParams2);
        String s = wN.JQp();
        String s1 = wN.XX();
        JQp jQp1 = this.PjT(context0, "SDK version", "7.1.0.4");
        JQp jQp2 = this.PjT(context0, "App", s);
        JQp jQp3 = this.PjT(context0, "App version", s1);
        JQp jQp4 = this.PjT(context0, "OS", "Android " + Build.VERSION.RELEASE);
        JQp jQp5 = this.PjT(context0, "Device", Build.BRAND + " " + Build.MODEL);
        JQp jQp6 = this.PjT(context0, "Creative info", "loading ...");
        JQp jQp7 = new JQp(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, this.PjT(76.0f));
        jQp7.setBackgroundColor(-1);
        jQp7.setLayoutParams(linearLayout$LayoutParams1);
        this.JQp = new Button(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        int v = this.PjT(16.0f);
        linearLayout$LayoutParams2.setMargins(v, v, v, v);
        this.JQp.setBackground(DWo.PjT(context0, "tt_ad_report_info_button_bg"));
        this.JQp.setText("copy all");
        this.JQp.setTextColor(Color.parseColor("#333333"));
        this.JQp.setTextSize(14.0f);
        this.JQp.setLayoutParams(linearLayout$LayoutParams2);
        ((ViewGroup)view0).addView(xX0);
        xX0.addView(au0);
        xX0.addView(this.cz);
        ((ViewGroup)view0).addView(view1);
        ((ViewGroup)view0).addView(scrollView0);
        scrollView0.addView(jQp0);
        jQp0.addView(jQp1);
        jQp0.addView(jQp2);
        jQp0.addView(jQp3);
        jQp0.addView(jQp4);
        jQp0.addView(jQp5);
        jQp0.addView(jQp6);
        ((ViewGroup)view0).addView(jQp7);
        jQp7.addView(this.JQp);
        return view0;
    }

    private JQp PjT(Context context0, String s, String s1) {
        JQp jQp0 = new JQp(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, (s.equals("Creative info") ? -2 : this.PjT(74.0f)));
        jQp0.setOrientation(1);
        jQp0.setPadding(0, this.PjT(16.0f), 0, this.PjT(16.0f));
        jQp0.setLayoutParams(linearLayout$LayoutParams0);
        Au au0 = new Au(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams1.bottomMargin = this.PjT(7.0f);
        au0.setIncludeFontPadding(false);
        au0.setText(s);
        au0.setTextColor(Color.parseColor("#333333"));
        au0.setTextSize(16.0f);
        au0.setTypeface(Typeface.defaultFromStyle(1));
        au0.setLayoutParams(linearLayout$LayoutParams1);
        jQp0.addView(au0);
        Au au1 = new Au(context0);
        if(s.equals("Creative info")) {
            this.cr = au1;
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        au1.setIncludeFontPadding(false);
        au1.setTextColor(Color.parseColor("#666666"));
        au1.setText(s1);
        au1.setTextSize(14.0f);
        au1.setLayoutParams(linearLayout$LayoutParams2);
        jQp0.addView(au1);
        return jQp0;
    }

    public void PjT(String s) {
        try {
            if(!TextUtils.isEmpty(s)) {
                this.ReZ = PjT.PjT(new JSONObject(s)).toString();
            }
        }
        catch(JSONException jSONException0) {
            RD.Zh("TTPrivacyAdReportDialog", jSONException0.getMessage());
        }
    }

    private void Zh() {
        String s = wN.JQp();
        String s1 = wN.XX();
        this.JQp.setOnClickListener(new View.OnClickListener() {
            final ub JQp;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                ClipboardManager clipboardManager0 = (ClipboardManager)ub.this.getContext().getSystemService("clipboard");
                if(clipboardManager0 != null) {
                    StringBuilder stringBuilder0 = new StringBuilder();
                    String[] arr_s = {"7.1.0.4", s, s1, "Android " + Build.VERSION.RELEASE, Build.BRAND + " " + Build.MODEL, ub.this.ReZ};
                    for(int v = 0; v < ub.Zh.length; ++v) {
                        stringBuilder0.append(ub.Zh[v]);
                        stringBuilder0.append(": ");
                        stringBuilder0.append(arr_s[v]);
                        stringBuilder0.append("\n");
                    }
                    ClipData clipData0 = ClipData.newPlainText("pangle sdk build info", stringBuilder0);
                    try {
                        clipboardManager0.setPrimaryClip(clipData0);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        });
        this.cz.setOnClickListener(new View.OnClickListener() {
            final ub PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                ub.this.cr.setText("loading ...");
                ub.this.cancel();
            }
        });
    }

    @Override  // android.app.Dialog
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(this.PjT(this.getContext()), new ViewGroup.LayoutParams(qZS.ReZ(this.getContext()), ((int)(((double)qZS.JQp(this.getContext())) * 0.9))));
        this.Zh();
        if(this.getWindow() != null) {
            this.getWindow().setGravity(80);
        }
    }

    @Override  // android.app.Dialog
    public void show() {
        try {
            super.show();
            com.bytedance.sdk.openadsdk.common.ub.3 ub$30 = new Runnable() {
                final ub PjT;

                @Override
                public void run() {
                    ub.this.cr.setText(ub.this.ReZ);
                }
            };
            this.PjT.postDelayed(ub$30, 1000L);
        }
        catch(Exception exception0) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", exception0);
        }
    }
}

