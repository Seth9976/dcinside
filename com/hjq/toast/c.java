package com.hjq.toast;

import android.view.View;
import android.widget.TextView;
import y2.a;
import y2.b;

public abstract class c implements b {
    private View a;
    private TextView b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private float h;
    private int i;
    private int j;
    private int k;

    public c() {
        this.i = 0x1030004;
        this.j = 2000;
        this.k = 3500;
    }

    @Override  // y2.b
    public TextView a(View view0) {
        return a.a(this, view0);
    }

    public int b() {
        return this.i;
    }

    public int c() {
        return this.k;
    }

    public int d() {
        return this.j;
    }

    public void e(int v) {
        this.i = v;
    }

    public void f(int v) {
        this.k = v;
    }

    public void g(int v) {
        this.j = v;
    }

    @Override  // y2.b
    public int getDuration() {
        return this.d;
    }

    @Override  // y2.b
    public int getGravity() {
        return this.c;
    }

    @Override  // y2.b
    public float getHorizontalMargin() {
        return this.g;
    }

    @Override  // y2.b
    public float getVerticalMargin() {
        return this.h;
    }

    @Override  // y2.b
    public View getView() {
        return this.a;
    }

    @Override  // y2.b
    public int getXOffset() {
        return this.e;
    }

    @Override  // y2.b
    public int getYOffset() {
        return this.f;
    }

    @Override  // y2.b
    public void setDuration(int v) {
        this.d = v;
    }

    @Override  // y2.b
    public void setGravity(int v, int v1, int v2) {
        this.c = v;
        this.e = v1;
        this.f = v2;
    }

    @Override  // y2.b
    public void setMargin(float f, float f1) {
        this.g = f;
        this.h = f1;
    }

    @Override  // y2.b
    public void setText(int v) {
        View view0 = this.a;
        if(view0 == null) {
            return;
        }
        this.setText(view0.getResources().getString(v));
    }

    @Override  // y2.b
    public void setText(CharSequence charSequence0) {
        TextView textView0 = this.b;
        if(textView0 == null) {
            return;
        }
        textView0.setText(charSequence0);
    }

    @Override  // y2.b
    public void setView(View view0) {
        this.a = view0;
        if(view0 == null) {
            this.b = null;
            return;
        }
        this.b = this.a(view0);
    }
}

