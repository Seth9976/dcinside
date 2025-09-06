package com.bytedance.sdk.openadsdk.ReZ;

import android.content.Context;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.Iterator;
import java.util.List;

public class cz extends ScrollView {
    private final DWo PjT;
    private final JQp Zh;

    public cz(Context context0, DWo dWo0) {
        super(context0);
        this.PjT = dWo0;
        JQp jQp0 = new JQp(context0);
        this.Zh = jQp0;
        jQp0.setOrientation(1);
        this.addView(jQp0, new FrameLayout.LayoutParams(-1, -2));
        if(dWo0.Au() == 0) {
            this.PjT();
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, 0);
        linearLayout$LayoutParams0.weight = 1.0f;
        this.setLayoutParams(linearLayout$LayoutParams0);
        this.setVerticalScrollBarEnabled(false);
    }

    private void PjT() {
        if(this.PjT.Au() != 0) {
            return;
        }
        int v = qZS.ReZ(this.getContext());
        int v1 = qZS.JQp(this.getContext());
        this.PjT.PjT(v, v1);
    }

    public void PjT(List list0) {
        List list1 = cz.ReZ(list0);
        if(list1 == null) {
            return;
        }
        this.Zh(list1);
    }

    private static List ReZ(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            int v = 0;
            int v2 = -1;
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                if(((FilterWord)list0.get(v1)).hasSecondOptions()) {
                    v2 = v1;
                }
            }
            if(v2 != -1 && v2 <= list0.size()) {
                v = v2;
            }
            FilterWord filterWord0 = (FilterWord)list0.get(v);
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                FilterWord filterWord1 = (FilterWord)object0;
                if(!filterWord1.hasSecondOptions()) {
                    filterWord0.addOption(filterWord1);
                    iterator0.remove();
                }
            }
            return list0;
        }
        return null;
    }

    private void Zh(List list0) {
        this.Zh.removeAllViews();
        for(int v = 0; v < list0.size(); ++v) {
            FilterWord filterWord0 = (FilterWord)list0.get(v);
            if(filterWord0 != null) {
                XX xX0 = new XX(this.getContext(), filterWord0, this.PjT);
                this.Zh.addView(xX0);
            }
            if(v < list0.size() - 1) {
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
                int v1 = qZS.Zh(this.getContext(), (this.PjT.SM() ? 16.0f : 8.0f));
                linearLayout$LayoutParams0.topMargin = v1;
                linearLayout$LayoutParams0.bottomMargin = v1;
                qj qj0 = new qj(this.getContext());
                this.Zh.addView(qj0, linearLayout$LayoutParams0);
            }
        }
    }
}

