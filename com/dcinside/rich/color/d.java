package com.dcinside.rich.color;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;

public class d extends LinearLayout {
    private Context a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private View i;
    public static final String j = "ATTR_VIEW_WIDTH";
    public static final String k = "ATTR_VIEW_HEIGHT";
    public static final String l = "ATTR_MARGIN_LEFT";
    public static final String m = "ATTR_MARGIN_RIGHT";
    public static final String n = "ATTR_CHECKED_TYPE";
    private static final int o = 8;
    private static final int p = 2;
    private static final int q = 0;
    private static final int r = 1;

    public d(Context context0, int v, Bundle bundle0) {
        super(context0);
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.i = null;
        this.a = context0;
        this.g = v;
        this.b = bundle0.getInt("ATTR_VIEW_WIDTH", 40);
        this.c = bundle0.getInt("ATTR_VIEW_HEIGHT", 40);
        this.d = bundle0.getInt("ATTR_MARGIN_LEFT", 2);
        this.e = bundle0.getInt("ATTR_MARGIN_RIGHT", 2);
        this.f = bundle0.getInt("ATTR_CHECKED_TYPE", 0);
        this.b();
    }

    private void a() {
        View view0 = this.i;
        if(view0 == null) {
            return;
        }
        if(this.h) {
            view0.setVisibility(0);
            return;
        }
        view0.setVisibility(8);
    }

    private void b() {
        this.i = this.getCheckView();
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(this.b, this.c);
        linearLayout$LayoutParams0.setMargins(this.d, 0, this.e, 0);
        this.setLayoutParams(linearLayout$LayoutParams0);
        this.setBackgroundColor(this.g);
        this.setGravity(17);
        this.addView(this.i);
        this.a();
    }

    public View getCheckView() {
        if(this.i == null) {
            switch(this.f) {
                case 0: {
                    this.i = new a(this.a, this.b / 8);
                    break;
                }
                case 1: {
                    this.i = new b(this.a, this.b / 2);
                    return this.i;
                }
                default: {
                    this.i = new a(this.a, this.b / 8);
                    return this.i;
                }
            }
        }
        return this.i;
    }

    public boolean getChecked() {
        return this.h;
    }

    public int getColor() {
        return this.g;
    }

    public void setCheckView(View view0) {
        this.i = view0;
    }

    public void setChecked(boolean z) {
        this.h = z;
        this.a();
    }

    public void setColor(int v) {
        this.g = v;
        this.b();
    }
}

