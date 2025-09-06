package com.bytedance.adsdk.Zh.ReZ.ReZ;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.Zh.DWo.PjT;
import com.bytedance.adsdk.Zh.DWo;
import com.bytedance.adsdk.Zh.SM;
import com.bytedance.adsdk.Zh.cz.cz;
import java.util.ArrayList;
import java.util.List;

public class ReZ extends cr {
    private LinearLayout Au;
    private final List DWo;
    private final LinearLayout.LayoutParams SM;
    private final List qj;
    private String xf;

    public ReZ(SM sM0, JQp jQp0, Context context0) {
        super(sM0, jQp0);
        this.SM = new LinearLayout.LayoutParams(-2, -2);
        this.DWo = new ArrayList();
        this.qj = new ArrayList();
        DWo dWo0 = this.XX;
        if(dWo0 != null) {
            List list0 = dWo0.ReZ();
            if(list0 != null && list0.size() > 0) {
                LinearLayout linearLayout0 = new LinearLayout(context0);
                this.Au = linearLayout0;
                linearLayout0.setOrientation(0);
                this.Zh(((PjT)list0.get(0)).XX);
                LinearLayout linearLayout1 = new LinearLayout(context0);
                linearLayout1.setOrientation(0);
                linearLayout1.setGravity(80);
                this.Au.addView(linearLayout1);
                List list1 = this.xf();
                for(int v = 0; v < list0.size(); ++v) {
                    PjT dWo$PjT0 = (PjT)list0.get(v);
                    TextView textView0 = new TextView(context0);
                    this.PjT(textView0, dWo$PjT0, (list1 == null || v >= list1.size() ? "" : ((String)list1.get(v))));
                    int v1 = dWo$PjT0.cz;
                    if(v1 == 0) {
                        linearLayout1.addView(textView0);
                    }
                    else {
                        this.SM.bottomMargin = (int)(((float)v1) * cz.PjT());
                        linearLayout1.addView(textView0, this.SM);
                    }
                }
                float f = cz.PjT();
                ReZ.PjT(this.Au, ((int)(((float)this.XX.PjT()) * f)), ((int)(((float)this.XX.Zh()) * f)));
            }
        }
    }

    private static void PjT(View view0, int v, int v1) {
        view0.layout(0, 0, v, v1);
        view0.measure(View.MeasureSpec.makeMeasureSpec(v, 0x40000000), View.MeasureSpec.makeMeasureSpec(v1, 0x40000000));
        view0.layout(0, 0, view0.getMeasuredWidth(), view0.getMeasuredHeight());
    }

    private void PjT(TextView textView0, PjT dWo$PjT0, String s) {
        if(TextUtils.isEmpty(s)) {
            textView0.setText("");
        }
        else {
            textView0.setText(s);
        }
        if(!TextUtils.isEmpty(dWo$PjT0.ReZ)) {
            textView0.setTextColor(Color.parseColor(dWo$PjT0.ReZ));
        }
        if(!TextUtils.isEmpty(dWo$PjT0.cr)) {
            textView0.setBackgroundColor(Color.parseColor(dWo$PjT0.cr));
        }
        textView0.setGravity(17);
        textView0.setTextSize(((float)dWo$PjT0.JQp));
    }

    public void PjT(String s) {
        this.xf = s;
    }

    private void ReZ(float f) {
        DWo dWo0 = this.XX;
        if(dWo0 != null) {
            List list0 = dWo0.ReZ();
            if(list0 != null && list0.size() > 0) {
                this.Au.setOrientation(0);
                this.Au.setGravity(17);
                if(this.Au.getChildCount() <= 0) {
                    return;
                }
                LinearLayout linearLayout0 = (LinearLayout)this.Au.getChildAt(0);
                linearLayout0.setOrientation(0);
                linearLayout0.setGravity(80);
                this.Au.removeAllViews();
                if(linearLayout0.getChildCount() != list0.size()) {
                    return;
                }
                List list1 = this.xf();
                this.qj.clear();
                for(int v1 = 0; v1 < list0.size(); ++v1) {
                    PjT dWo$PjT0 = (PjT)list0.get(v1);
                    TextView textView0 = (TextView)linearLayout0.getChildAt(v1);
                    this.qj.add(textView0);
                    this.PjT(textView0, dWo$PjT0, (list1 == null || v1 >= list1.size() ? "" : ((String)list1.get(v1))));
                }
                linearLayout0.removeAllViews();
                for(int v = 0; v < list0.size(); ++v) {
                    PjT dWo$PjT1 = (PjT)list0.get(v);
                    TextView textView1 = (TextView)this.qj.get(v);
                    textView1.setAlpha(f);
                    linearLayout0.setAlpha(f);
                    int v2 = dWo$PjT1.cz;
                    if(v2 == 0) {
                        linearLayout0.addView(textView1);
                    }
                    else {
                        this.SM.bottomMargin = (int)(((float)v2) * cz.PjT());
                        linearLayout0.addView(textView1, this.SM);
                    }
                }
                this.Au.setAlpha(f);
                this.Au.addView(linearLayout0);
                float f1 = cz.PjT();
                ReZ.PjT(this.Au, ((int)(((float)this.XX.PjT()) * f1)), ((int)(((float)this.XX.Zh()) * f1)));
            }
        }
    }

    private void Zh(String s) {
        if(TextUtils.isEmpty(s)) {
            this.Au.setGravity(17);
            return;
        }
        s.hashCode();
        if(!s.equals("left")) {
            if(!s.equals("right")) {
                this.Au.setGravity(17);
                return;
            }
            this.Au.setGravity(5);
            return;
        }
        this.Au.setGravity(3);
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.cr
    public void Zh(Canvas canvas0, Matrix matrix0, int v) {
        if(this.Au != null) {
            canvas0.save();
            canvas0.concat(matrix0);
            this.PjT(v);
            this.ReZ(this.cz());
            this.Au.draw(canvas0);
            canvas0.restore();
            return;
        }
        super.Zh(canvas0, matrix0, v);
    }

    private List xf() {
        if(this.XX == null || (this.Zh == null || this.Zh.Lrd() == null)) {
            return null;
        }
        String s = this.XX.cr();
        if(TextUtils.isEmpty(s) && TextUtils.isEmpty(this.xf)) {
            return null;
        }
        List list0 = this.XX.ReZ();
        if(list0 != null) {
            String s1 = TextUtils.isEmpty(this.xf) ? s : this.xf;
            if(!TextUtils.isEmpty(s1)) {
                int v = s1.length();
                this.DWo.clear();
                for(int v1 = 0; v1 < list0.size(); ++v1) {
                    PjT dWo$PjT0 = (PjT)list0.get(v1);
                    int v2 = dWo$PjT0.PjT;
                    int v3 = dWo$PjT0.Zh;
                    if(v2 < 0) {
                        v2 = Math.max(v2 + v, 0);
                    }
                    if(v3 < 0) {
                        v3 = Math.max(v3 + v, 0);
                    }
                    if(v2 + v3 > v) {
                        this.DWo.add("");
                    }
                    else {
                        if(list0.size() == 1 && v2 == 0 && v3 == 0) {
                            v3 = v;
                        }
                        this.DWo.add(s1.substring(v2, v3 + v2));
                    }
                }
                return this.DWo;
            }
        }
        return null;
    }
}

