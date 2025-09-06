package com.unity3d.services.banners.view;

import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;

public enum BannerPosition {
    TOP_LEFT(new int[]{10, 9}, 51),
    TOP_CENTER(new int[]{10, 14}, 49),
    TOP_RIGHT(new int[]{10, 11}, 53),
    BOTTOM_LEFT(new int[]{12, 9}, 83),
    BOTTOM_CENTER(new int[]{12, 14}, 81),
    BOTTOM_RIGHT(new int[]{12, 11}, 85),
    CENTER(new int[]{13}, 17),
    NONE(new int[0], 0);

    private int _gravity;
    private final int[] _rules;

    private static BannerPosition[] $values() [...] // Inlined contents

    private BannerPosition(int[] arr_v, int v1) {
        this._rules = arr_v;
        this._gravity = v1;
    }

    public ViewGroup.LayoutParams addLayoutRules(RelativeLayout.LayoutParams relativeLayout$LayoutParams0) {
        int[] arr_v = this._rules;
        for(int v = 0; v < arr_v.length; ++v) {
            relativeLayout$LayoutParams0.addRule(arr_v[v]);
        }
        return relativeLayout$LayoutParams0;
    }

    public static BannerPosition fromString(String s) {
        if(s != null && !s.equals("none")) {
            if(s.equals("topleft")) {
                return BannerPosition.TOP_LEFT;
            }
            if(s.equals("topright")) {
                return BannerPosition.TOP_RIGHT;
            }
            if(s.equals("topcenter")) {
                return BannerPosition.TOP_CENTER;
            }
            if(s.equals("bottomleft")) {
                return BannerPosition.BOTTOM_LEFT;
            }
            if(s.equals("bottomright")) {
                return BannerPosition.BOTTOM_RIGHT;
            }
            if(s.equals("bottomcenter")) {
                return BannerPosition.BOTTOM_CENTER;
            }
            return s.equals("center") ? BannerPosition.CENTER : BannerPosition.NONE;
        }
        return BannerPosition.NONE;
    }

    public int getGravity() {
        return this._gravity;
    }
}

