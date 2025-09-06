package com.bytedance.sdk.openadsdk.core.JQp;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;

public class SM {
    public static int PjT(int v) {
        return (v & 3) != 3 && (v & 5) != 5 ? v : v | 0x800000;
    }

    public static ViewGroup.LayoutParams PjT(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams1 = SM.Zh(view0, viewGroup$LayoutParams0);
        if(viewGroup$LayoutParams1 != null) {
            viewGroup$LayoutParams0 = viewGroup$LayoutParams1;
        }
        SM.PjT(viewGroup$LayoutParams0);
        return viewGroup$LayoutParams0;
    }

    private static void PjT(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 == null) {
            return;
        }
        if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMarginStart(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin);
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMarginEnd(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin);
        }
        if(viewGroup$LayoutParams0 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).gravity = SM.PjT(((FrameLayout.LayoutParams)viewGroup$LayoutParams0).gravity);
        }
        if(viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams)viewGroup$LayoutParams0).gravity = SM.PjT(((LinearLayout.LayoutParams)viewGroup$LayoutParams0).gravity);
        }
        if(viewGroup$LayoutParams0 instanceof RelativeLayout.LayoutParams) {
            int[] arr_v = ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).getRules();
            if(arr_v[9] != 0) {
                ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).addRule(20);
            }
            if(arr_v[11] != 0) {
                ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).addRule(21);
            }
            int v = arr_v[0];
            if(v != 0) {
                ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).addRule(16, v);
            }
            int v1 = arr_v[1];
            if(v1 != 0) {
                ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).addRule(17, v1);
            }
            int v2 = arr_v[5];
            if(v2 != 0) {
                ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).addRule(18, v2);
            }
            int v3 = arr_v[7];
            if(v3 != 0) {
                ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).addRule(19, v3);
            }
        }
    }

    private static ViewGroup.LayoutParams Zh(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams1;
        if(view0 == null) {
            return null;
        }
        if(viewGroup$LayoutParams0 == null) {
            return null;
        }
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 == null) {
            return null;
        }
        if(viewParent0 instanceof LinearLayout) {
            if(viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams) {
                return null;
            }
            viewGroup$LayoutParams1 = new LinearLayout.LayoutParams(viewGroup$LayoutParams0);
        }
        else {
            viewGroup$LayoutParams1 = null;
        }
        if(viewParent0 instanceof RelativeLayout) {
            if(viewGroup$LayoutParams0 instanceof RelativeLayout.LayoutParams) {
                return null;
            }
            viewGroup$LayoutParams1 = new RelativeLayout.LayoutParams(viewGroup$LayoutParams0);
        }
        if(viewParent0 instanceof FrameLayout) {
            return viewGroup$LayoutParams0 instanceof FrameLayout.LayoutParams ? null : new FrameLayout.LayoutParams(viewGroup$LayoutParams0);
        }
        return viewGroup$LayoutParams1;
    }
}

