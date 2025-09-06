package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.cz.PjT;
import com.bytedance.sdk.component.adexpress.dynamic.JQp.qj;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.utils.Lrd;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public class cRA extends cz {
    public cRA(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        this.Au += 6;
        if(this.xf.ig()) {
            PjT pjT0 = new PjT(context0, this.xf.XX(), this.xf.JQp(), 1, this.xf.Au());
            this.qla = pjT0;
            pjT0.setMaxLines(1);
        }
        else {
            TextView textView0 = new TextView(context0);
            this.qla = textView0;
            textView0.setIncludeFontPadding(false);
        }
        this.qla.setTag(this.getClickArea());
        this.addView(this.qla, this.getWidgetLayoutParams());
    }

    private void DWo() {
        if(TextUtils.equals(this.xs.DWo().Zh(), "source") || TextUtils.equals(this.xs.DWo().Zh(), "title") || TextUtils.equals(this.xs.DWo().Zh(), "text_star")) {
            int[] arr_v = qj.Zh(this.xf.cz(), this.xf.JQp(), true);
            int v = (int)XX.PjT(this.getContext(), ((float)this.xf.Zh()));
            int v1 = (int)XX.PjT(this.getContext(), ((float)this.xf.ReZ()));
            int v2 = (int)XX.PjT(this.getContext(), ((float)this.xf.cr()));
            int v3 = (int)XX.PjT(this.getContext(), ((float)this.xf.PjT()));
            int v4 = Math.min(v, v3);
            if(TextUtils.equals(this.xs.DWo().Zh(), "source")) {
                int v5 = this.Au - ((int)XX.PjT(this.getContext(), this.xf.JQp())) - v - v3;
                if(v5 > 1 && v5 <= v4 * 2) {
                    this.qla.setPadding(v1, v - v5 / 2, v2, v3 - (v5 - v5 / 2));
                    return;
                }
            }
            int v6 = arr_v[1] + v + v3 - this.Au - 2;
            if(v6 <= 1) {
                return;
            }
            if(v6 <= v4 * 2) {
                this.qla.setPadding(v1, v - v6 / 2, v2, v3 - (v6 - v6 / 2));
            }
            else if(v6 > v + v3) {
                int v7 = v6 - v - v3;
                this.qla.setPadding(v1, 0, v2, 0);
                if(v7 <= ((int)XX.PjT(this.getContext(), 1.0f)) + 1) {
                    ((TextView)this.qla).setTextSize(this.xf.JQp() - 1.0f);
                }
                else if(v7 <= (((int)XX.PjT(this.getContext(), 1.0f)) + 1) * 2) {
                    ((TextView)this.qla).setTextSize(this.xf.JQp() - 2.0f);
                }
                else {
                    this.post(new Runnable() {
                        final cRA Zh;

                        @Override
                        public void run() {
                            try {
                                ViewGroup.LayoutParams viewGroup$LayoutParams0 = cRA.this.qla.getLayoutParams();
                                viewGroup$LayoutParams0.height = cRA.this.Au + v7;
                                cRA.this.qla.setLayoutParams(viewGroup$LayoutParams0);
                                cRA.this.qla.setTranslationY(((float)(-v7)));
                                ((ViewGroup)cRA.this.qla.getParent()).setClipChildren(false);
                                ((ViewGroup)cRA.this.qla.getParent().getParent()).setClipChildren(false);
                            }
                            catch(Throwable unused_ex) {
                            }
                        }
                    });
                }
            }
            else if(v > v3) {
                this.qla.setPadding(v1, v - (v6 - v4), v2, v3 - v4);
            }
            else {
                this.qla.setPadding(v1, v - v4, v2, v3 - (v6 - v4));
            }
        }
        if(TextUtils.equals(this.xs.DWo().Zh(), "fillButton")) {
            this.qla.setTextAlignment(2);
            ((TextView)this.qla).setGravity(17);
        }
    }

    private boolean PjT() {
        return this.fDm != null && this.fDm.getRenderRequest() != null && this.fDm.getRenderRequest().DWo() != 4;
    }

    public void PjT(TextView textView0, int v, Context context0, String s) {
        textView0.setText("(" + String.format(Lrd.PjT(context0, s), v) + ")");
        if(v == -1) {
            textView0.setVisibility(8);
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        double f;
        int v1;
        super.SM();
        if(TextUtils.isEmpty(this.getText())) {
            this.qla.setVisibility(4);
            return true;
        }
        if(this.xf.ig()) {
            this.qj();
            return true;
        }
        ((TextView)this.qla).setText(this.xf.cz());
        ((TextView)this.qla).setTextDirection(5);
        this.qla.setTextAlignment(this.xf.Au());
        ((TextView)this.qla).setTextColor(this.xf.XX());
        ((TextView)this.qla).setTextSize(this.xf.JQp());
        if(this.xf.Sks()) {
            int v = this.xf.tT();
            if(v > 0) {
                ((TextView)this.qla).setLines(v);
                ((TextView)this.qla).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        else {
            ((TextView)this.qla).setMaxLines(1);
            ((TextView)this.qla).setGravity(17);
            ((TextView)this.qla).setEllipsize(TextUtils.TruncateAt.END);
        }
        if(this.xs != null && this.xs.DWo() != null) {
            if(cr.Zh() && this.PjT() && (TextUtils.equals(this.xs.DWo().Zh(), "text_star") || TextUtils.equals(this.xs.DWo().Zh(), "score-count") || TextUtils.equals(this.xs.DWo().Zh(), "score-count-type-1") || TextUtils.equals(this.xs.DWo().Zh(), "score-count-type-2"))) {
                this.setVisibility(8);
                return true;
            }
            if(TextUtils.equals(this.xs.DWo().Zh(), "score-count") || TextUtils.equals(this.xs.DWo().Zh(), "score-count-type-2")) {
                try {
                    try {
                        v1 = -1;
                        v1 = Integer.parseInt(this.getText());
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                    if(v1 < 0) {
                        if(cr.Zh()) {
                            this.setVisibility(8);
                            return true;
                        }
                        this.qla.setVisibility(0);
                    }
                    if(TextUtils.equals(this.xs.DWo().Zh(), "score-count-type-2")) {
                        String s = new DecimalFormat("(###,###,###)").format(((long)v1));
                        ((TextView)this.qla).setText(String.format(s, v1));
                        ((TextView)this.qla).setGravity(17);
                        return true;
                    }
                    this.PjT(((TextView)this.qla), v1, this.getContext(), "tt_comment_num");
                }
                catch(Exception unused_ex) {
                }
            }
            else if(TextUtils.equals(this.xs.DWo().Zh(), "text_star")) {
                try {
                    f = -1.0;
                    f = Double.parseDouble(this.getText());
                }
                catch(Exception unused_ex) {
                }
                if(f < 0.0 || f > 5.0) {
                    if(cr.Zh()) {
                        this.setVisibility(8);
                        return true;
                    }
                    this.qla.setVisibility(0);
                }
                ((TextView)this.qla).setIncludeFontPadding(false);
                ((TextView)this.qla).setText(String.format("%.1f", f));
            }
            else if(TextUtils.equals("privacy-detail", this.xs.DWo().Zh())) {
                ((TextView)this.qla).setText("Permission list | Privacy policy");
            }
            else if(TextUtils.equals(this.xs.DWo().Zh(), "development-name")) {
                ((TextView)this.qla).setText(Lrd.PjT(cr.PjT(), "tt_text_privacy_development") + this.getText());
            }
            else if(TextUtils.equals(this.xs.DWo().Zh(), "app-version")) {
                ((TextView)this.qla).setText(Lrd.PjT(cr.PjT(), "tt_text_privacy_app_version") + this.getText());
            }
            else {
                ((TextView)this.qla).setText(this.getText());
            }
            this.qla.setTextAlignment(this.xf.Au());
            ((TextView)this.qla).setGravity(this.xf.SM());
            if(cr.Zh()) {
                this.DWo();
            }
        }
        return true;
    }

    public String getText() {
        String s = this.xf.cz();
        if(TextUtils.isEmpty(s)) {
            if(!cr.Zh() && TextUtils.equals(this.xs.DWo().Zh(), "text_star")) {
                s = "5";
            }
            if(!cr.Zh() && TextUtils.equals(this.xs.DWo().Zh(), "score-count")) {
                s = "6870";
            }
        }
        return !TextUtils.equals(this.xs.DWo().Zh(), "title") && !TextUtils.equals(this.xs.DWo().Zh(), "subtitle") ? s : s.replace("\n", "");
    }

    private void qj() {
        if(!(this.qla instanceof PjT)) {
            return;
        }
        String s = this.getText();
        ArrayList arrayList0 = new ArrayList();
        try {
            JSONArray jSONArray0 = new JSONArray(s);
            for(int v = 0; v < jSONArray0.length(); ++v) {
                arrayList0.add(jSONArray0.optString(v));
            }
        }
        catch(JSONException unused_ex) {
            arrayList0.add(s);
        }
        ((PjT)this.qla).setMaxLines(1);
        ((PjT)this.qla).setTextColor(this.xf.XX());
        ((PjT)this.qla).setTextSize(this.xf.JQp());
        ((PjT)this.qla).setAnimationText(arrayList0);
        ((PjT)this.qla).setAnimationType(this.xf.kph());
        ((PjT)this.qla).setAnimationDuration(this.xf.rds() * 1000);
        ((PjT)this.qla).PjT();
    }
}

