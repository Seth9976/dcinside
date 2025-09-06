package com.bytedance.adsdk.ugeno.JQp;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.CompoundButton;
import com.bytedance.adsdk.ugeno.XX.JQp;
import com.bytedance.adsdk.ugeno.XX.cz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class cr {
    static class PjT {
        List PjT;
        int Zh;

        void PjT() {
            this.PjT = null;
            this.Zh = 0;
        }
    }

    static class Zh implements Comparable {
        int PjT;
        int Zh;

        private Zh() {
        }

        Zh(com.bytedance.adsdk.ugeno.JQp.cr.1 cr$10) {
        }

        public int PjT(Zh cr$Zh0) {
            return this.Zh == cr$Zh0.Zh ? this.PjT - cr$Zh0.PjT : this.Zh - cr$Zh0.Zh;
        }

        @Override
        public int compareTo(Object object0) {
            return this.PjT(((Zh)object0));
        }

        @Override
        public String toString() {
            return "Order{order=" + this.Zh + ", index=" + this.PjT + '}';
        }
    }

    private boolean[] JQp;
    int[] PjT;
    static final boolean ReZ = true;
    long[] Zh;
    private final com.bytedance.adsdk.ugeno.JQp.PjT cr;
    private long[] cz;

    static {
    }

    cr(com.bytedance.adsdk.ugeno.JQp.PjT pjT0) {
        this.cr = pjT0;
    }

    // 去混淆评级： 低(20)
    private int JQp(com.bytedance.adsdk.ugeno.JQp.Zh zh0, boolean z) {
        return z ? zh0.fDm() : zh0.xs();
    }

    private int PjT(int v, com.bytedance.adsdk.ugeno.JQp.Zh zh0, int v1) {
        int v2 = this.cr.getPaddingLeft();
        int v3 = this.cr.getPaddingRight();
        int v4 = zh0.xs();
        int v5 = zh0.qla();
        int v6 = zh0.PjT();
        int v7 = this.cr.PjT(v, v2 + v3 + v4 + v5 + v1, v6);
        int v8 = View.MeasureSpec.getSize(v7);
        if(v8 > zh0.SM()) {
            return View.MeasureSpec.makeMeasureSpec(zh0.SM(), View.MeasureSpec.getMode(v7));
        }
        return v8 >= zh0.XX() ? v7 : View.MeasureSpec.makeMeasureSpec(zh0.XX(), View.MeasureSpec.getMode(v7));
    }

    // 去混淆评级： 低(20)
    private int PjT(View view0, boolean z) {
        return z ? view0.getMeasuredWidth() : view0.getMeasuredHeight();
    }

    // 去混淆评级： 低(20)
    private int PjT(com.bytedance.adsdk.ugeno.JQp.Zh zh0, boolean z) {
        return z ? zh0.PjT() : zh0.Zh();
    }

    // 去混淆评级： 低(20)
    private int PjT(boolean z) {
        return z ? this.cr.getPaddingStart() : this.cr.getPaddingTop();
    }

    private List PjT(List list0, int v, int v1) {
        List list1 = new ArrayList();
        ReZ reZ0 = new ReZ();
        reZ0.XX = (v - v1) / 2;
        int v2 = list0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            if(v3 == 0) {
                list1.add(reZ0);
            }
            list1.add(((ReZ)list0.get(v3)));
            if(v3 == list0.size() - 1) {
                list1.add(reZ0);
            }
        }
        return list1;
    }

    private void PjT(int v, int v1, int v2, View view0) {
        long[] arr_v = this.Zh;
        if(arr_v != null) {
            arr_v[v] = ((long)v1) & 0xFFFFFFFFL | ((long)v2) << 0x20;
        }
        long[] arr_v1 = this.cz;
        if(arr_v1 != null) {
            arr_v1[v] = this.Zh(view0.getMeasuredWidth(), view0.getMeasuredHeight());
        }
    }

    private void PjT(int v, int v1, ReZ reZ0, int v2, int v3, boolean z) {
        int v16;
        int v15;
        int v11;
        float f = reZ0.DWo;
        if(f > 0.0f) {
            int v4 = reZ0.JQp;
            if(v2 >= v4) {
                float f1 = ((float)(v2 - v4)) / f;
                reZ0.JQp = v3 + reZ0.cz;
                if(!z) {
                    reZ0.XX = 0x80000000;
                }
                int v5 = 0;
                boolean z1 = false;
                int v6 = 0;
                float f2 = 0.0f;
                while(v5 < reZ0.Au) {
                    int v7 = reZ0.qla + v5;
                    View view0 = this.cr.Zh(v7);
                    if(view0 == null || view0.getVisibility() == 8) {
                        v16 = v4;
                    }
                    else {
                        com.bytedance.adsdk.ugeno.JQp.Zh zh0 = (com.bytedance.adsdk.ugeno.JQp.Zh)view0.getLayoutParams();
                        switch(this.cr.getFlexDirection()) {
                            case 0: 
                            case 1: {
                                int v17 = view0.getMeasuredWidth();
                                long[] arr_v2 = this.cz;
                                if(arr_v2 != null) {
                                    v17 = this.PjT(arr_v2[v7]);
                                }
                                int v18 = view0.getMeasuredHeight();
                                long[] arr_v3 = this.cz;
                                v16 = v4;
                                if(arr_v3 != null) {
                                    v18 = this.Zh(arr_v3[v7]);
                                }
                                if(!this.JQp[v7] && zh0.cr() > 0.0f) {
                                    float f5 = ((float)v17) + zh0.cr() * f1;
                                    if(v5 == reZ0.Au - 1) {
                                        f5 += f2;
                                        f2 = 0.0f;
                                    }
                                    int v19 = Math.round(f5);
                                    if(v19 > zh0.SM()) {
                                        v19 = zh0.SM();
                                        this.JQp[v7] = true;
                                        reZ0.DWo -= zh0.cr();
                                        z1 = true;
                                    }
                                    else {
                                        f2 += f5 - ((float)v19);
                                        double f6 = (double)f2;
                                        if(f6 > 1.0) {
                                            ++v19;
                                            f2 = (float)(f6 - 1.0);
                                        }
                                        else if(f6 < -1.0) {
                                            --v19;
                                            f2 = (float)(f6 + 1.0);
                                        }
                                    }
                                    int v20 = this.Zh(v1, zh0, reZ0.xs);
                                    int v21 = View.MeasureSpec.makeMeasureSpec(v19, 0x40000000);
                                    view0.measure(v21, v20);
                                    int v22 = view0.getMeasuredWidth();
                                    int v23 = view0.getMeasuredHeight();
                                    this.PjT(v7, v21, v20, view0);
                                    v17 = v22;
                                    v18 = v23;
                                }
                                int v24 = Math.max(v6, v18 + zh0.fDm() + zh0.xE() + this.cr.PjT(view0));
                                reZ0.JQp += v17 + zh0.xs() + zh0.qla();
                                v15 = v24;
                                break;
                            }
                            default: {
                                int v8 = view0.getMeasuredHeight();
                                long[] arr_v = this.cz;
                                if(arr_v != null) {
                                    v8 = this.Zh(arr_v[v7]);
                                }
                                int v9 = view0.getMeasuredWidth();
                                long[] arr_v1 = this.cz;
                                if(arr_v1 != null) {
                                    v9 = this.PjT(arr_v1[v7]);
                                }
                                if(this.JQp[v7] || zh0.cr() <= 0.0f) {
                                    v11 = v4;
                                }
                                else {
                                    float f3 = ((float)v8) + zh0.cr() * f1;
                                    if(v5 == reZ0.Au - 1) {
                                        f3 += f2;
                                        f2 = 0.0f;
                                    }
                                    int v10 = Math.round(f3);
                                    if(v10 > zh0.DWo()) {
                                        v10 = zh0.DWo();
                                        this.JQp[v7] = true;
                                        reZ0.DWo -= zh0.cr();
                                        v11 = v4;
                                        z1 = true;
                                    }
                                    else {
                                        f2 += f3 - ((float)v10);
                                        v11 = v4;
                                        double f4 = (double)f2;
                                        if(f4 > 1.0) {
                                            ++v10;
                                            f2 = (float)(f4 - 1.0);
                                        }
                                        else if(f4 < -1.0) {
                                            --v10;
                                            f2 = (float)(f4 + 1.0);
                                        }
                                    }
                                    int v12 = this.PjT(v, zh0, reZ0.xs);
                                    int v13 = View.MeasureSpec.makeMeasureSpec(v10, 0x40000000);
                                    view0.measure(v12, v13);
                                    v9 = view0.getMeasuredWidth();
                                    int v14 = view0.getMeasuredHeight();
                                    this.PjT(v7, v12, v13, view0);
                                    v8 = v14;
                                }
                                v15 = Math.max(v6, v9 + zh0.xs() + zh0.qla() + this.cr.PjT(view0));
                                reZ0.JQp += v8 + zh0.fDm() + zh0.xE();
                                v16 = v11;
                            }
                        }
                        reZ0.XX = Math.max(reZ0.XX, v15);
                        v6 = v15;
                    }
                    ++v5;
                    v4 = v16;
                }
                if(z1 && v4 != reZ0.JQp) {
                    this.PjT(v, v1, reZ0, v2, v3, true);
                }
            }
        }
    }

    private void PjT(View view0, int v) {
        int v4;
        com.bytedance.adsdk.ugeno.JQp.Zh zh0 = (com.bytedance.adsdk.ugeno.JQp.Zh)view0.getLayoutParams();
        int v1 = view0.getMeasuredWidth();
        int v2 = view0.getMeasuredHeight();
        int v3 = 1;
        if(v1 < zh0.XX()) {
            v1 = zh0.XX();
            v4 = 1;
        }
        else if(v1 > zh0.SM()) {
            v1 = zh0.SM();
            v4 = 1;
        }
        else {
            v4 = 0;
        }
        if(v2 < zh0.Au()) {
            v2 = zh0.Au();
        }
        else if(v2 > zh0.DWo()) {
            v2 = zh0.DWo();
        }
        else {
            v3 = v4;
        }
        if(v3 != 0) {
            int v5 = View.MeasureSpec.makeMeasureSpec(v1, 0x40000000);
            int v6 = View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
            view0.measure(v5, v6);
            this.PjT(v, v5, v6, view0);
        }
    }

    private void PjT(View view0, int v, int v1) {
        com.bytedance.adsdk.ugeno.JQp.Zh zh0 = (com.bytedance.adsdk.ugeno.JQp.Zh)view0.getLayoutParams();
        int v2 = Math.min(Math.max(v - zh0.fDm() - zh0.xE() - this.cr.PjT(view0), zh0.Au()), zh0.DWo());
        long[] arr_v = this.cz;
        int v3 = View.MeasureSpec.makeMeasureSpec((arr_v == null ? view0.getMeasuredWidth() : this.PjT(arr_v[v1])), 0x40000000);
        int v4 = View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
        view0.measure(v3, v4);
        this.PjT(v1, v3, v4, view0);
    }

    private void PjT(CompoundButton compoundButton0) {
        com.bytedance.adsdk.ugeno.JQp.Zh zh0 = (com.bytedance.adsdk.ugeno.JQp.Zh)compoundButton0.getLayoutParams();
        int v = zh0.XX();
        int v1 = zh0.Au();
        Drawable drawable0 = JQp.PjT(compoundButton0);
        int v2 = 0;
        int v3 = drawable0 == null ? 0 : drawable0.getMinimumWidth();
        if(drawable0 != null) {
            v2 = drawable0.getMinimumHeight();
        }
        if(v == -1) {
            v = v3;
        }
        zh0.PjT(v);
        if(v1 == -1) {
            v1 = v2;
        }
        zh0.Zh(v1);
    }

    private void PjT(List list0, ReZ reZ0, int v, int v1) {
        reZ0.xs = v1;
        this.cr.PjT(reZ0);
        reZ0.xE = v;
        list0.add(reZ0);
    }

    private boolean PjT(int v, int v1, ReZ reZ0) {
        return v == v1 - 1 && reZ0.Zh() != 0;
    }

    private boolean PjT(View view0, int v, int v1, int v2, int v3, com.bytedance.adsdk.ugeno.JQp.Zh zh0, int v4, int v5, int v6) {
        if(this.cr.getFlexWrap() == 0) {
            return false;
        }
        if(zh0.qj()) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        int v7 = this.cr.getMaxLine();
        if(v7 != -1 && v7 <= v6 + 1) {
            return false;
        }
        int v8 = this.cr.PjT(view0, v4, v5);
        if(v8 > 0) {
            v3 += v8;
        }
        return v1 < v2 + v3;
    }

    private int[] PjT(int v, List list0, SparseIntArray sparseIntArray0) {
        Collections.sort(list0);
        sparseIntArray0.clear();
        int[] arr_v = new int[v];
        int v1 = 0;
        for(Object object0: list0) {
            int v2 = ((Zh)object0).PjT;
            arr_v[v1] = v2;
            sparseIntArray0.append(v2, ((Zh)object0).Zh);
            ++v1;
        }
        return arr_v;
    }

    int PjT(long v) {
        return (int)v;
    }

    void PjT() {
        this.PjT(0);
    }

    void PjT(int v) {
        if(v >= this.cr.getFlexItemCount()) {
            return;
        }
        int v1 = this.cr.getFlexDirection();
        if(this.cr.getAlignItems() == 4) {
            int v2 = this.PjT == null ? 0 : this.PjT[v];
            List list0 = this.cr.getFlexLinesInternal();
            int v3 = list0.size();
            while(v2 < v3) {
                ReZ reZ0 = (ReZ)list0.get(v2);
                int v4 = reZ0.Au;
                for(int v5 = 0; v5 < v4; ++v5) {
                    int v6 = reZ0.qla + v5;
                    if(v5 < this.cr.getFlexItemCount()) {
                        View view0 = this.cr.Zh(v6);
                        if(view0 != null && view0.getVisibility() != 8) {
                            switch(((com.bytedance.adsdk.ugeno.JQp.Zh)view0.getLayoutParams()).cz()) {
                                case -1: 
                                case 4: {
                                    if(v1 == 0 || v1 == 1) {
                                        this.PjT(view0, reZ0.XX, v6);
                                    }
                                    else {
                                        if(v1 != 2 && v1 != 3) {
                                            throw new IllegalArgumentException("Invalid flex direction: " + v1);
                                        }
                                        this.Zh(view0, reZ0.XX, v6);
                                    }
                                }
                            }
                        }
                    }
                }
                ++v2;
            }
            return;
        }
        for(Object object0: this.cr.getFlexLinesInternal()) {
            ReZ reZ1 = (ReZ)object0;
            for(Object object1: reZ1.fDm) {
                Integer integer0 = (Integer)object1;
                View view1 = this.cr.Zh(((int)integer0));
                if(v1 != 0 && v1 != 1) {
                    if(v1 != 2 && v1 != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: " + v1);
                    }
                    this.Zh(view1, reZ1.XX, ((int)integer0));
                }
                else {
                    this.PjT(view1, reZ1.XX, ((int)integer0));
                }
            }
        }
    }

    void PjT(int v, int v1) {
        this.PjT(v, v1, 0);
    }

    void PjT(int v, int v1, int v2) {
        int v8;
        int v7;
        int v5;
        this.ReZ(this.cr.getFlexItemCount());
        if(v2 >= this.cr.getFlexItemCount()) {
            return;
        }
        int v3 = this.cr.getFlexDirection();
        switch(this.cr.getFlexDirection()) {
            case 0: 
            case 1: {
                int v4 = View.MeasureSpec.getMode(v);
                v5 = View.MeasureSpec.getSize(v);
                int v6 = this.cr.getLargestMainSize();
                if(v4 != 0x40000000) {
                    v5 = Math.min(v6, v5);
                }
                v7 = this.cr.getPaddingLeft();
                v8 = this.cr.getPaddingRight();
                break;
            }
            case 2: 
            case 3: {
                int v9 = View.MeasureSpec.getMode(v1);
                v5 = View.MeasureSpec.getSize(v1);
                if(v9 != 0x40000000) {
                    v5 = this.cr.getLargestMainSize();
                }
                v7 = this.cr.getPaddingTop();
                v8 = this.cr.getPaddingBottom();
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid flex direction: " + v3);
            }
        }
        int v10 = v7 + v8;
        int v11 = this.PjT == null ? 0 : this.PjT[v2];
        List list0 = this.cr.getFlexLinesInternal();
        int v12 = list0.size();
        while(v11 < v12) {
            ReZ reZ0 = (ReZ)list0.get(v11);
            int v13 = reZ0.JQp;
            if(v13 < v5 && reZ0.ub) {
                this.PjT(v, v1, reZ0, v5, v10, false);
            }
            else if(v13 > v5 && reZ0.gK) {
                this.Zh(v, v1, reZ0, v5, v10, false);
            }
            ++v11;
        }
    }

    void PjT(View view0, ReZ reZ0, int v, int v1, int v2, int v3) {
        com.bytedance.adsdk.ugeno.JQp.Zh zh0 = (com.bytedance.adsdk.ugeno.JQp.Zh)view0.getLayoutParams();
        int v4 = this.cr.getAlignItems();
        if(zh0.cz() != -1) {
            v4 = zh0.cz();
        }
        int v5 = reZ0.XX;
        if(v4 != 0) {
            switch(v4) {
                case 1: {
                    if(this.cr.getFlexWrap() != 2) {
                        view0.layout(v, v1 + v5 - view0.getMeasuredHeight() - zh0.xE(), v2, v1 + v5 - zh0.xE());
                        return;
                    }
                    view0.layout(v, v1 - v5 + view0.getMeasuredHeight() + zh0.fDm(), v2, v3 - v5 + view0.getMeasuredHeight() + zh0.fDm());
                    return;
                }
                case 2: {
                    int v6 = (v5 - view0.getMeasuredHeight() + zh0.fDm() - zh0.xE()) / 2;
                    if(this.cr.getFlexWrap() != 2) {
                        view0.layout(v, v1 + v6, v2, view0.getMeasuredHeight() + (v1 + v6));
                        return;
                    }
                    view0.layout(v, v1 - v6, v2, view0.getMeasuredHeight() + (v1 - v6));
                    return;
                }
                case 3: {
                    if(this.cr.getFlexWrap() != 2) {
                        int v7 = Math.max(reZ0.xf - view0.getBaseline(), zh0.fDm());
                        view0.layout(v, v1 + v7, v2, v3 + v7);
                        return;
                    }
                    int v8 = Math.max(reZ0.xf - view0.getMeasuredHeight() + view0.getBaseline(), zh0.xE());
                    view0.layout(v, v1 - v8, v2, v3 - v8);
                    return;
                }
                case 4: {
                    break;
                }
                default: {
                    return;
                }
            }
        }
        if(this.cr.getFlexWrap() != 2) {
            view0.layout(v, v1 + zh0.fDm(), v2, v3 + zh0.fDm());
            return;
        }
        view0.layout(v, v1 - zh0.xE(), v2, v3 - zh0.xE());
    }

    void PjT(View view0, ReZ reZ0, boolean z, int v, int v1, int v2, int v3) {
        com.bytedance.adsdk.ugeno.JQp.Zh zh0 = (com.bytedance.adsdk.ugeno.JQp.Zh)view0.getLayoutParams();
        int v4 = this.cr.getAlignItems();
        if(zh0.cz() != -1) {
            v4 = zh0.cz();
        }
        int v5 = reZ0.XX;
        switch(v4) {
            case 1: {
                if(!z) {
                    view0.layout(v + v5 - view0.getMeasuredWidth() - zh0.qla(), v1, v2 + v5 - view0.getMeasuredWidth() - zh0.qla(), v3);
                    return;
                }
                view0.layout(v - v5 + view0.getMeasuredWidth() + zh0.xs(), v1, v2 - v5 + view0.getMeasuredWidth() + zh0.xs(), v3);
                return;
            }
            case 2: {
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
                int v6 = (v5 - view0.getMeasuredWidth() + cz.PjT(viewGroup$MarginLayoutParams0) - cz.Zh(viewGroup$MarginLayoutParams0)) / 2;
                if(!z) {
                    view0.layout(v + v6, v1, v2 + v6, v3);
                    return;
                }
                view0.layout(v - v6, v1, v2 - v6, v3);
                return;
            }
            case 0: 
            case 3: 
            case 4: {
                if(!z) {
                    view0.layout(v + zh0.xs(), v1, v2 + zh0.xs(), v3);
                    return;
                }
                view0.layout(v - zh0.qla(), v1, v2 - zh0.qla(), v3);
            }
        }
    }

    void PjT(PjT cr$PjT0, int v, int v1) {
        this.PjT(cr$PjT0, v, v1, 0x7FFFFFFF, 0, -1, null);
    }

    void PjT(PjT cr$PjT0, int v, int v1, int v2, int v3, int v4, List list0) {
        int v59;
        int v57;
        int v56;
        View view1;
        ReZ reZ1;
        int v45;
        int v34;
        int v25;
        int v24;
        List list2;
        int v23;
        int v22;
        int v21;
        int v5 = v1;
        int v6 = v4;
        boolean z = this.cr.PjT();
        int v7 = View.MeasureSpec.getMode(v);
        int v8 = View.MeasureSpec.getSize(v);
        List list1 = list0 == null ? new ArrayList() : list0;
        cr$PjT0.PjT = list1;
        int v9 = this.PjT(z);
        int v10 = this.Zh(z);
        int v11 = this.ReZ(z);
        int v12 = this.cr(z);
        ReZ reZ0 = new ReZ();
        int v13 = v3;
        reZ0.qla = v13;
        int v14 = v10 + v9;
        reZ0.JQp = v14;
        int v15 = this.cr.getFlexItemCount();
        int v16 = v6 == -1 ? 1 : 0;
        int v17 = 0;
        int v18 = 0;
        int v19 = 0;
        int v20 = 0x80000000;
        while(true) {
            if(v13 >= v15) {
                v59 = v18;
                break;
            }
            View view0 = this.cr.Zh(v13);
            if(view0 == null) {
                if(this.PjT(v13, v15, reZ0)) {
                    this.PjT(list1, reZ0, v13, v17);
                }
                goto label_36;
            }
            else if(view0.getVisibility() == 8) {
                ++reZ0.SM;
                ++reZ0.Au;
                if(this.PjT(v13, v15, reZ0)) {
                    this.PjT(list1, reZ0, v13, v17);
                }
            label_36:
                v21 = v5;
                v22 = v6;
                v23 = v14;
                list2 = list1;
                v24 = v15;
                v25 = v13;
            }
            else {
                if(view0 instanceof CompoundButton) {
                    this.PjT(((CompoundButton)view0));
                }
                com.bytedance.adsdk.ugeno.JQp.Zh zh0 = (com.bytedance.adsdk.ugeno.JQp.Zh)view0.getLayoutParams();
                if(zh0.cz() == 4) {
                    reZ0.fDm.add(v13);
                }
                int v26 = this.PjT(zh0, z);
                if(zh0.xf() != -1.0f && v7 == 0x40000000) {
                    v26 = Math.round(((float)v8) * zh0.xf());
                }
                if(z) {
                    int v27 = this.ReZ(zh0, true);
                    int v28 = this.cr(zh0, true);
                    int v29 = this.cr.PjT(v, v14 + v27 + v28, v26);
                    int v30 = this.JQp(zh0, true);
                    int v31 = this.cz(zh0, true);
                    int v32 = this.Zh(zh0, true);
                    int v33 = this.cr.Zh(v5, v11 + v12 + v30 + v31 + v17, v32);
                    view0.measure(v29, v33);
                    this.PjT(v13, v29, v33, view0);
                    v34 = v29;
                }
                else {
                    int v35 = this.JQp(zh0, false);
                    int v36 = this.cz(zh0, false);
                    int v37 = this.Zh(zh0, false);
                    int v38 = this.cr.PjT(v5, v11 + v12 + v35 + v36 + v17, v37);
                    int v39 = this.ReZ(zh0, false);
                    int v40 = this.cr(zh0, false);
                    int v41 = this.cr.Zh(v, v39 + v14 + v40, v26);
                    view0.measure(v38, v41);
                    this.PjT(v13, v38, v41, view0);
                    v34 = v41;
                }
                this.PjT(view0, v13);
                v18 = View.combineMeasuredStates(v18, view0.getMeasuredState());
                int v42 = reZ0.JQp;
                int v43 = this.PjT(view0, z);
                int v44 = this.ReZ(zh0, z);
                list2 = list1;
                if(this.PjT(view0, v7, v8, v42, this.cr(zh0, z) + (v43 + v44), zh0, v13, v19, list1.size())) {
                    if(reZ0.Zh() > 0) {
                        if(v13 > 0) {
                            v45 = v13 - 1;
                            reZ1 = reZ0;
                        }
                        else {
                            reZ1 = reZ0;
                            v45 = 0;
                        }
                        this.PjT(list2, reZ1, v45, v17);
                        v17 = reZ1.XX + v17;
                    }
                    if(!z) {
                        v21 = v1;
                        v25 = v13;
                        view1 = view0;
                        if(zh0.PjT() == -1) {
                            int v51 = this.cr.getPaddingLeft();
                            int v52 = this.cr.getPaddingRight();
                            int v53 = zh0.xs();
                            int v54 = zh0.qla();
                            int v55 = zh0.PjT();
                            view1.measure(this.cr.PjT(v21, v51 + v52 + v53 + v54 + v17, v55), v34);
                            this.PjT(view1, v25);
                        }
                    }
                    else if(zh0.Zh() == -1) {
                        int v46 = this.cr.getPaddingTop();
                        int v47 = this.cr.getPaddingBottom();
                        int v48 = zh0.fDm();
                        int v49 = zh0.xE();
                        int v50 = zh0.Zh();
                        v21 = v1;
                        view1 = view0;
                        view1.measure(v34, this.cr.Zh(v21, v46 + v47 + v48 + v49 + v17, v50));
                        v25 = v13;
                        this.PjT(view1, v25);
                    }
                    else {
                        v21 = v1;
                        v25 = v13;
                        view1 = view0;
                    }
                    reZ0 = new ReZ();
                    reZ0.Au = 1;
                    v23 = v14;
                    reZ0.JQp = v23;
                    reZ0.qla = v25;
                    v56 = 0;
                    v57 = 0x80000000;
                }
                else {
                    v21 = v1;
                    v25 = v13;
                    view1 = view0;
                    v23 = v14;
                    ++reZ0.Au;
                    v56 = v19 + 1;
                    v57 = v20;
                }
                reZ0.ub |= zh0.cr() != 0.0f;
                reZ0.gK |= zh0.JQp() != 0.0f;
                int[] arr_v = this.PjT;
                if(arr_v != null) {
                    arr_v[v25] = list2.size();
                }
                reZ0.JQp += this.PjT(view1, z) + this.ReZ(zh0, z) + this.cr(zh0, z);
                reZ0.DWo += zh0.cr();
                reZ0.qj += zh0.JQp();
                this.cr.PjT(view1, v25, v56, reZ0);
                int v58 = Math.max(v57, this.Zh(view1, z) + this.JQp(zh0, z) + this.cz(zh0, z) + this.cr.PjT(view1));
                reZ0.XX = Math.max(reZ0.XX, v58);
                if(z) {
                    reZ0.xf = this.cr.getFlexWrap() == 2 ? Math.max(reZ0.xf, view1.getMeasuredHeight() - view1.getBaseline() + zh0.xE()) : Math.max(reZ0.xf, view1.getBaseline() + zh0.fDm());
                }
                v24 = v15;
                if(this.PjT(v25, v24, reZ0)) {
                    this.PjT(list2, reZ0, v25, v17);
                    v17 += reZ0.XX;
                }
                v22 = v4;
                if(v22 != -1 && list2.size() > 0 && ((ReZ)list2.get(list2.size() - 1)).xE >= v22 && v25 >= v22 && v16 == 0) {
                    v17 = -reZ0.PjT();
                    v16 = 1;
                }
                if(v17 > v2 && v16 != 0) {
                    v59 = v18;
                    break;
                }
                v19 = v56;
                v20 = v58;
            }
            v13 = v25 + 1;
            v15 = v24;
            v5 = v21;
            v14 = v23;
            list1 = list2;
            v6 = v22;
        }
        cr$PjT0.Zh = v59;
    }

    int[] PjT(SparseIntArray sparseIntArray0) {
        int v = this.cr.getFlexItemCount();
        return this.PjT(v, this.Zh(v), sparseIntArray0);
    }

    int[] PjT(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0, SparseIntArray sparseIntArray0) {
        int v1 = this.cr.getFlexItemCount();
        List list0 = this.Zh(v1);
        Zh cr$Zh0 = new Zh(null);
        cr$Zh0.Zh = view0 == null || !(viewGroup$LayoutParams0 instanceof com.bytedance.adsdk.ugeno.JQp.Zh) ? 1 : ((com.bytedance.adsdk.ugeno.JQp.Zh)viewGroup$LayoutParams0).ReZ();
        if(v == -1 || v == v1) {
            cr$Zh0.PjT = v1;
        }
        else if(v < this.cr.getFlexItemCount()) {
            cr$Zh0.PjT = v;
            while(v < v1) {
                Zh cr$Zh1 = (Zh)list0.get(v);
                ++cr$Zh1.PjT;
                ++v;
            }
        }
        else {
            cr$Zh0.PjT = v1;
        }
        list0.add(cr$Zh0);
        return this.PjT(v1 + 1, list0, sparseIntArray0);
    }

    // 去混淆评级： 低(20)
    private int ReZ(com.bytedance.adsdk.ugeno.JQp.Zh zh0, boolean z) {
        return z ? zh0.xs() : zh0.fDm();
    }

    // 去混淆评级： 低(20)
    private int ReZ(boolean z) {
        return z ? this.cr.getPaddingTop() : this.cr.getPaddingStart();
    }

    private void ReZ(int v) {
        boolean[] arr_z = this.JQp;
        if(arr_z == null) {
            this.JQp = new boolean[Math.max(v, 10)];
            return;
        }
        if(arr_z.length < v) {
            this.JQp = new boolean[Math.max(arr_z.length * 2, v)];
            return;
        }
        Arrays.fill(arr_z, false);
    }

    private int Zh(int v, com.bytedance.adsdk.ugeno.JQp.Zh zh0, int v1) {
        int v2 = this.cr.getPaddingTop();
        int v3 = this.cr.getPaddingBottom();
        int v4 = zh0.fDm();
        int v5 = zh0.xE();
        int v6 = zh0.Zh();
        int v7 = this.cr.Zh(v, v2 + v3 + v4 + v5 + v1, v6);
        int v8 = View.MeasureSpec.getSize(v7);
        if(v8 > zh0.DWo()) {
            return View.MeasureSpec.makeMeasureSpec(zh0.DWo(), View.MeasureSpec.getMode(v7));
        }
        return v8 >= zh0.Au() ? v7 : View.MeasureSpec.makeMeasureSpec(zh0.Au(), View.MeasureSpec.getMode(v7));
    }

    // 去混淆评级： 低(20)
    private int Zh(View view0, boolean z) {
        return z ? view0.getMeasuredHeight() : view0.getMeasuredWidth();
    }

    // 去混淆评级： 低(20)
    private int Zh(com.bytedance.adsdk.ugeno.JQp.Zh zh0, boolean z) {
        return z ? zh0.Zh() : zh0.PjT();
    }

    // 去混淆评级： 低(20)
    private int Zh(boolean z) {
        return z ? this.cr.getPaddingEnd() : this.cr.getPaddingBottom();
    }

    private List Zh(int v) {
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            com.bytedance.adsdk.ugeno.JQp.Zh zh0 = (com.bytedance.adsdk.ugeno.JQp.Zh)this.cr.PjT(v1).getLayoutParams();
            Zh cr$Zh0 = new Zh(null);
            cr$Zh0.Zh = zh0.ReZ();
            cr$Zh0.PjT = v1;
            list0.add(cr$Zh0);
        }
        return list0;
    }

    private void Zh(int v, int v1, ReZ reZ0, int v2, int v3, boolean z) {
        int v15;
        int v11;
        int v4 = reZ0.JQp;
        float f = reZ0.qj;
        if(f > 0.0f && v2 <= v4) {
            float f1 = ((float)(v4 - v2)) / f;
            reZ0.JQp = v3 + reZ0.cz;
            if(!z) {
                reZ0.XX = 0x80000000;
            }
            boolean z1 = false;
            int v6 = 0;
            float f2 = 0.0f;
            for(int v5 = 0; v5 < reZ0.Au; v5 = v11 + 1) {
                int v7 = reZ0.qla + v5;
                View view0 = this.cr.Zh(v7);
                if(view0 == null || view0.getVisibility() == 8) {
                    v11 = v5;
                }
                else {
                    com.bytedance.adsdk.ugeno.JQp.Zh zh0 = (com.bytedance.adsdk.ugeno.JQp.Zh)view0.getLayoutParams();
                    switch(this.cr.getFlexDirection()) {
                        case 0: 
                        case 1: {
                            int v16 = view0.getMeasuredWidth();
                            long[] arr_v2 = this.cz;
                            if(arr_v2 != null) {
                                v16 = this.PjT(arr_v2[v7]);
                            }
                            int v17 = view0.getMeasuredHeight();
                            long[] arr_v3 = this.cz;
                            if(arr_v3 != null) {
                                v17 = this.Zh(arr_v3[v7]);
                            }
                            if(this.JQp[v7] || zh0.JQp() <= 0.0f) {
                                v11 = v5;
                            }
                            else {
                                float f5 = ((float)v16) - zh0.JQp() * f1;
                                v11 = v5;
                                if(v11 == reZ0.Au - 1) {
                                    f5 += f2;
                                    f2 = 0.0f;
                                }
                                int v18 = Math.round(f5);
                                if(v18 < zh0.XX()) {
                                    v18 = zh0.XX();
                                    this.JQp[v7] = true;
                                    reZ0.qj -= zh0.JQp();
                                    z1 = true;
                                }
                                else {
                                    f2 += f5 - ((float)v18);
                                    double f6 = (double)f2;
                                    if(f6 > 1.0) {
                                        ++v18;
                                        --f2;
                                    }
                                    else if(f6 < -1.0) {
                                        --v18;
                                        ++f2;
                                    }
                                }
                                int v19 = this.Zh(v1, zh0, reZ0.xs);
                                int v20 = View.MeasureSpec.makeMeasureSpec(v18, 0x40000000);
                                view0.measure(v20, v19);
                                int v21 = view0.getMeasuredWidth();
                                int v22 = view0.getMeasuredHeight();
                                this.PjT(v7, v20, v19, view0);
                                v16 = v21;
                                v17 = v22;
                            }
                            int v23 = Math.max(v6, v17 + zh0.fDm() + zh0.xE() + this.cr.PjT(view0));
                            reZ0.JQp += v16 + zh0.xs() + zh0.qla();
                            v15 = v23;
                            break;
                        }
                        default: {
                            int v8 = view0.getMeasuredHeight();
                            long[] arr_v = this.cz;
                            if(arr_v != null) {
                                v8 = this.Zh(arr_v[v7]);
                            }
                            int v9 = view0.getMeasuredWidth();
                            long[] arr_v1 = this.cz;
                            if(arr_v1 != null) {
                                v9 = this.PjT(arr_v1[v7]);
                            }
                            if(this.JQp[v7] || zh0.JQp() <= 0.0f) {
                                v11 = v5;
                            }
                            else {
                                float f3 = ((float)v8) - zh0.JQp() * f1;
                                if(v5 == reZ0.Au - 1) {
                                    f3 += f2;
                                    f2 = 0.0f;
                                }
                                int v10 = Math.round(f3);
                                if(v10 < zh0.Au()) {
                                    v10 = zh0.Au();
                                    this.JQp[v7] = true;
                                    reZ0.qj -= zh0.JQp();
                                    v11 = v5;
                                    z1 = true;
                                }
                                else {
                                    f2 += f3 - ((float)v10);
                                    v11 = v5;
                                    double f4 = (double)f2;
                                    if(f4 > 1.0) {
                                        ++v10;
                                        --f2;
                                    }
                                    else if(f4 < -1.0) {
                                        --v10;
                                        ++f2;
                                    }
                                }
                                int v12 = this.PjT(v, zh0, reZ0.xs);
                                int v13 = View.MeasureSpec.makeMeasureSpec(v10, 0x40000000);
                                view0.measure(v12, v13);
                                v9 = view0.getMeasuredWidth();
                                int v14 = view0.getMeasuredHeight();
                                this.PjT(v7, v12, v13, view0);
                                v8 = v14;
                            }
                            v15 = Math.max(v6, v9 + zh0.xs() + zh0.qla() + this.cr.PjT(view0));
                            reZ0.JQp += v8 + zh0.fDm() + zh0.xE();
                        }
                    }
                    reZ0.XX = Math.max(reZ0.XX, v15);
                    v6 = v15;
                }
            }
            if(z1 && v4 != reZ0.JQp) {
                this.Zh(v, v1, reZ0, v2, v3, true);
            }
        }
    }

    private void Zh(View view0, int v, int v1) {
        com.bytedance.adsdk.ugeno.JQp.Zh zh0 = (com.bytedance.adsdk.ugeno.JQp.Zh)view0.getLayoutParams();
        int v2 = Math.min(Math.max(v - zh0.xs() - zh0.qla() - this.cr.PjT(view0), zh0.XX()), zh0.SM());
        long[] arr_v = this.cz;
        int v3 = View.MeasureSpec.makeMeasureSpec((arr_v == null ? view0.getMeasuredHeight() : this.Zh(arr_v[v1])), 0x40000000);
        int v4 = View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
        view0.measure(v4, v3);
        this.PjT(v1, v4, v3, view0);
    }

    int Zh(long v) {
        return (int)(v >> 0x20);
    }

    long Zh(int v, int v1) [...] // Inlined contents

    void Zh(int v, int v1, int v2) {
        int v5;
        int v4;
        int v3 = this.cr.getFlexDirection();
        switch(v3) {
            case 0: 
            case 1: {
                v4 = View.MeasureSpec.getMode(v1);
                v5 = View.MeasureSpec.getSize(v1);
                break;
            }
            case 2: 
            case 3: {
                v4 = View.MeasureSpec.getMode(v);
                v5 = View.MeasureSpec.getSize(v);
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid flex direction: " + v3);
            }
        }
        List list0 = this.cr.getFlexLinesInternal();
        if(v4 == 0x40000000) {
            int v6 = this.cr.getSumOfCrossSize() + v2;
            int v7 = 0;
            if(list0.size() == 1) {
                ((ReZ)list0.get(0)).XX = v5 - v2;
                return;
            }
            if(list0.size() >= 2) {
                switch(this.cr.getAlignContent()) {
                    case 1: {
                        ReZ reZ0 = new ReZ();
                        reZ0.XX = v5 - v6;
                        list0.add(0, reZ0);
                        return;
                    }
                    case 2: {
                        List list1 = this.PjT(list0, v5, v6);
                        this.cr.setFlexLines(list1);
                        return;
                    }
                    case 3: {
                        if(v6 < v5) {
                            float f = ((float)(v5 - v6)) / ((float)(list0.size() - 1));
                            ArrayList arrayList1 = new ArrayList();
                            int v8 = list0.size();
                            float f1 = 0.0f;
                            while(v7 < v8) {
                                arrayList1.add(((ReZ)list0.get(v7)));
                                if(v7 != list0.size() - 1) {
                                    ReZ reZ2 = new ReZ();
                                    if(v7 == list0.size() - 2) {
                                        reZ2.XX = Math.round(f1 + f);
                                        f1 = 0.0f;
                                    }
                                    else {
                                        reZ2.XX = Math.round(f);
                                    }
                                    int v9 = reZ2.XX;
                                    f1 += f - ((float)v9);
                                    if(f1 > 1.0f) {
                                        reZ2.XX = v9 + 1;
                                        --f1;
                                    }
                                    else if(f1 < -1.0f) {
                                        reZ2.XX = v9 - 1;
                                        ++f1;
                                    }
                                    arrayList1.add(reZ2);
                                }
                                ++v7;
                            }
                            this.cr.setFlexLines(arrayList1);
                            return;
                        }
                        break;
                    }
                    case 4: {
                        if(v6 >= v5) {
                            List list2 = this.PjT(list0, v5, v6);
                            this.cr.setFlexLines(list2);
                            return;
                        }
                        ArrayList arrayList0 = new ArrayList();
                        ReZ reZ1 = new ReZ();
                        reZ1.XX = (v5 - v6) / (list0.size() * 2);
                        for(Object object0: list0) {
                            arrayList0.add(reZ1);
                            arrayList0.add(((ReZ)object0));
                            arrayList0.add(reZ1);
                        }
                        this.cr.setFlexLines(arrayList0);
                        return;
                    }
                    case 5: {
                        if(v6 < v5) {
                            float f2 = ((float)(v5 - v6)) / ((float)list0.size());
                            int v10 = list0.size();
                            float f3 = 0.0f;
                            while(v7 < v10) {
                                ReZ reZ3 = (ReZ)list0.get(v7);
                                float f4 = ((float)reZ3.XX) + f2;
                                if(v7 == list0.size() - 1) {
                                    f4 += f3;
                                    f3 = 0.0f;
                                }
                                int v11 = Math.round(f4);
                                f3 += f4 - ((float)v11);
                                if(f3 > 1.0f) {
                                    ++v11;
                                    --f3;
                                }
                                else if(f3 < -1.0f) {
                                    --v11;
                                    ++f3;
                                }
                                reZ3.XX = v11;
                                ++v7;
                            }
                            return;
                        }
                        break;
                    }
                }
            }
        }
    }

    void Zh(PjT cr$PjT0, int v, int v1) {
        this.PjT(cr$PjT0, v1, v, 0x7FFFFFFF, 0, -1, null);
    }

    boolean Zh(SparseIntArray sparseIntArray0) {
        int v = this.cr.getFlexItemCount();
        if(sparseIntArray0.size() != v) {
            return true;
        }
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.cr.PjT(v1);
            if(view0 != null && ((com.bytedance.adsdk.ugeno.JQp.Zh)view0.getLayoutParams()).ReZ() != sparseIntArray0.get(v1)) {
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    private int cr(com.bytedance.adsdk.ugeno.JQp.Zh zh0, boolean z) {
        return z ? zh0.qla() : zh0.xE();
    }

    // 去混淆评级： 低(20)
    private int cr(boolean z) {
        return z ? this.cr.getPaddingBottom() : this.cr.getPaddingEnd();
    }

    // 去混淆评级： 低(20)
    private int cz(com.bytedance.adsdk.ugeno.JQp.Zh zh0, boolean z) {
        return z ? zh0.xE() : zh0.qla();
    }

    class com.bytedance.adsdk.ugeno.JQp.cr.1 {
    }

}

