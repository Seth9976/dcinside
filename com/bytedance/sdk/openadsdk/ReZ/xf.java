package com.bytedance.sdk.openadsdk.ReZ;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter.AllCaps;
import android.text.InputFilter.LengthFilter;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.JQp.XX;
import com.bytedance.sdk.openadsdk.core.JQp.Zh;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.Locale;

public class xf extends Dialog {
    public interface PjT {
        void PjT();

        void PjT(int arg1, FilterWord arg2, String arg3);

        void ReZ();

        void Zh();
    }

    private String Au;
    private final DWo DWo;
    private Au JQp;
    private JQp PjT;
    private Zh ReZ;
    private String SM;
    private String XX;
    private PjT Zh;
    private Au cr;
    private cr cz;

    public xf(@NonNull Context context0, DWo dWo0) {
        super(context0, Lrd.cz(context0, "tt_quick_option_dialog"));
        this.setCanceledOnTouchOutside(false);
        this.DWo = dWo0;
    }

    private JQp PjT(Context context0) {
        JQp jQp0 = new JQp(context0);
        jQp0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        jQp0.setOrientation(1);
        jQp0.setBackground(com.bytedance.sdk.openadsdk.utils.DWo.PjT(context0, "tt_dislike_dialog_bg"));
        XX xX0 = new XX(context0);
        xX0.setLayoutParams(new LinearLayout.LayoutParams(-1, qZS.Zh(context0, 48.0f)));
        this.cz = new cr(context0);
        int v = qZS.Zh(context0, 24.0f);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v, v);
        relativeLayout$LayoutParams0.addRule(16);
        relativeLayout$LayoutParams0.addRule(11);
        int v1 = qZS.Zh(context0, 10.0f);
        relativeLayout$LayoutParams0.topMargin = v1;
        relativeLayout$LayoutParams0.rightMargin = v1;
        this.cz.setLayoutParams(relativeLayout$LayoutParams0);
        this.cz.setClickable(true);
        this.cz.setFocusable(true);
        this.cz.setImageDrawable(com.bytedance.sdk.openadsdk.utils.DWo.PjT(context0, "tt_titlebar_close_seletor"));
        Au au0 = new Au(context0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams1.addRule(16);
        relativeLayout$LayoutParams1.topMargin = qZS.Zh(context0, 12.0f);
        au0.setLayoutParams(relativeLayout$LayoutParams1);
        au0.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        au0.setGravity(17);
        au0.setSingleLine(true);
        au0.setText(Lrd.PjT(context0, "tt_other_reason"));
        au0.setTextColor(Color.parseColor("#161823"));
        au0.setTextSize(15.0f);
        au0.setTypeface(Typeface.defaultFromStyle(0));
        View view0 = new View(context0);
        view0.setLayoutParams(new LinearLayout.LayoutParams(-1, qZS.Zh(context0, 0.5f)));
        view0.setBackgroundColor(Color.argb(51, 22, 24, 35));
        JQp jQp1 = new JQp(context0);
        jQp1.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        jQp1.setOrientation(1);
        Zh zh0 = new Zh(context0);
        this.ReZ = zh0;
        zh0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.leftMargin = qZS.Zh(context0, 16.0f);
        linearLayout$LayoutParams0.rightMargin = qZS.Zh(context0, 16.0f);
        linearLayout$LayoutParams0.topMargin = qZS.Zh(context0, 11.5f);
        this.ReZ.setLayoutParams(linearLayout$LayoutParams0);
        this.ReZ.setLines(4);
        this.ReZ.setGravity(0x30);
        this.ReZ.setTextSize(15.0f);
        this.ReZ.setTextColor(Color.rgb(22, 24, 35));
        this.ReZ.setHintTextColor(Color.parseColor("#57161823"));
        this.ReZ.setBackground(null);
        this.ReZ.setImeOptions(0x10000000);
        JQp jQp2 = new JQp(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
        int v2 = qZS.Zh(context0, 16.0f);
        int v3 = qZS.Zh(context0, 17.0f);
        jQp2.setPadding(v2, v3, v2, v3);
        jQp2.setLayoutParams(linearLayout$LayoutParams1);
        jQp2.setOrientation(0);
        this.cr = new Au(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(0, -2);
        linearLayout$LayoutParams2.weight = 1.0f;
        linearLayout$LayoutParams2.gravity = 0x800003;
        this.cr.setLayoutParams(linearLayout$LayoutParams2);
        this.cr.setText("0/200");
        this.cr.setGravity(0x800003);
        this.cr.setTextColor(Color.parseColor("#57161823"));
        this.cr.setTextSize(15.0f);
        this.JQp = new Au(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams3.gravity = 0x800005;
        this.JQp.setLayoutParams(linearLayout$LayoutParams3);
        this.JQp.setTextSize(14.0f);
        this.JQp.setTextColor(-1);
        this.JQp.setVisibility(0);
        this.JQp.setSingleLine(true);
        int v4 = qZS.Zh(context0, 27.0f);
        int v5 = qZS.Zh(context0, 5.0f);
        this.JQp.setPadding(v4, v5, v4, v5);
        int v6 = qZS.Zh(context0, 6.0f);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setCornerRadius(((float)v6));
        int v7 = Color.rgb(0xFE, 44, 85);
        gradientDrawable0.setColor(v7);
        gradientDrawable0.setAlpha(102);
        GradientDrawable gradientDrawable1 = new GradientDrawable();
        gradientDrawable1.setCornerRadius(((float)v6));
        gradientDrawable1.setColor(v7);
        StateListDrawable stateListDrawable0 = new StateListDrawable();
        stateListDrawable0.addState(new int[]{0x101009E}, gradientDrawable1);
        stateListDrawable0.addState(new int[0], gradientDrawable0);
        this.JQp.setBackground(stateListDrawable0);
        this.JQp.setText(Lrd.PjT(context0, "tt_done"));
        this.JQp.setEnabled(false);
        jQp0.addView(xX0);
        jQp0.addView(view0);
        jQp0.addView(jQp1);
        xX0.addView(this.cz);
        xX0.addView(au0);
        jQp1.addView(this.ReZ);
        jQp1.addView(jQp2);
        jQp2.addView(this.cr);
        jQp2.addView(this.JQp);
        return jQp0;
    }

    private void PjT(View view0) {
        xf.PjT(this.ReZ);
        DWo dWo0 = this.DWo;
        if(dWo0 != null) {
            String s = dWo0.XX();
            if(!TextUtils.isEmpty(s)) {
                this.ReZ.setText(s);
                this.cr.setText(String.format(Locale.getDefault(), "%d%s", s.length(), "/200"));
            }
            this.JQp.setEnabled(((boolean)(true ^ TextUtils.isEmpty(s))));
        }
        this.JQp.setOnClickListener(new View.OnClickListener() {
            final xf PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                String s = xf.this.ReZ.getText().toString();
                if(xf.this.Zh != null) {
                    xf.this.Zh.PjT(4, DWo.PjT, s);
                }
                xf.this.dismiss();
            }
        });
        this.cz.setOnClickListener(new View.OnClickListener() {
            final xf PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(xf.this.Zh != null) {
                    xf.this.Zh.Zh();
                }
                xf.this.dismiss();
            }
        });
        this.ReZ.addTextChangedListener(new TextWatcher() {
            final xf PjT;

            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
                int v3 = Math.round(charSequence0.length());
                xf.this.cr.setText(v3 + "/200");
                boolean z = true;
                if(v3 <= 0) {
                    Au au0 = xf.this.JQp;
                    if(xf.this.DWo == null || TextUtils.isEmpty(xf.this.DWo.XX())) {
                        z = false;
                    }
                    au0.setEnabled(z);
                }
                else if(!xf.this.JQp.isEnabled()) {
                    xf.this.JQp.setEnabled(true);
                }
            }
        });
    }

    public static void PjT(EditText editText0) {
        editText0.setFilters(new InputFilter[]{new InputFilter() {
            @Override  // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence0, int v, int v1, Spanned spanned0, int v2, int v3) {
                while(v < v1) {
                    switch(Character.getType(charSequence0.charAt(v))) {
                        case 19: 
                        case 28: {
                            return "";
                        }
                    }
                    ++v;
                }
                return null;
            }
        }, new InputFilter.LengthFilter(200)});
    }

    public void PjT() {
        Zh zh0 = this.ReZ;
        if(zh0 == null) {
            return;
        }
        zh0.requestFocus();
        Window window0 = this.getWindow();
        if(window0 != null) {
            window0.setSoftInputMode(5);
        }
    }

    public void PjT(PjT xf$PjT0) {
        this.Zh = xf$PjT0;
    }

    public void PjT(String s) {
        this.SM = s;
    }

    public void PjT(String s, String s1) {
        this.XX = s;
        this.Au = s1;
        DWo dWo0 = this.DWo;
        if(dWo0 != null) {
            dWo0.cr(s1);
        }
    }

    private void ReZ() {
        this.setCanceledOnTouchOutside(true);
        this.setCancelable(true);
        Window window0 = this.getWindow();
        if(window0 != null) {
            if(window0.getDecorView() != null) {
                window0.getDecorView().setPadding(0, 0, 0, 0);
            }
            WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
            windowManager$LayoutParams0.width = -1;
            windowManager$LayoutParams0.height = -2;
            window0.setAttributes(windowManager$LayoutParams0);
            window0.setGravity(80);
        }
    }

    public void Zh() {
        Zh zh0 = this.ReZ;
        if(zh0 == null) {
            return;
        }
        InputMethodManager inputMethodManager0 = (InputMethodManager)zh0.getContext().getSystemService("input_method");
        if(inputMethodManager0 != null) {
            inputMethodManager0.hideSoftInputFromWindow(this.PjT.getWindowToken(), 0);
        }
    }

    private void cr() {
        this.setOnCancelListener(new DialogInterface.OnCancelListener() {
            final xf PjT;

            @Override  // android.content.DialogInterface$OnCancelListener
            public void onCancel(DialogInterface dialogInterface0) {
                if(xf.this.Zh != null) {
                    xf.this.Zh.ReZ();
                }
            }
        });
    }

    @Override  // android.app.Dialog
    public void dismiss() {
        this.Zh();
        super.dismiss();
    }

    @Override  // android.app.Dialog
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        JQp jQp0 = this.PjT(ub.PjT());
        this.PjT = jQp0;
        this.setContentView(jQp0);
        this.PjT(this.PjT);
        this.ReZ();
        this.PjT();
        this.cr();
    }

    @Override  // android.app.Dialog
    public void show() {
        super.show();
        PjT xf$PjT0 = this.Zh;
        if(xf$PjT0 != null) {
            xf$PjT0.PjT();
        }
    }
}

