package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

final class b extends e {
    final SideSheetBehavior a;

    b(@NonNull SideSheetBehavior sideSheetBehavior0) {
        this.a = sideSheetBehavior0;
    }

    @Override  // com.google.android.material.sidesheet.e
    int a(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return viewGroup$MarginLayoutParams0.rightMargin;
    }

    @Override  // com.google.android.material.sidesheet.e
    float b(int v) {
        float f = (float)this.e();
        return (f - ((float)v)) / (f - ((float)this.d()));
    }

    @Override  // com.google.android.material.sidesheet.e
    int c(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return viewGroup$MarginLayoutParams0.rightMargin;
    }

    @Override  // com.google.android.material.sidesheet.e
    int d() {
        return Math.max(0, this.e() - this.a.m0() - this.a.t0());
    }

    @Override  // com.google.android.material.sidesheet.e
    int e() {
        return this.a.x0();
    }

    @Override  // com.google.android.material.sidesheet.e
    int f() {
        return this.a.x0();
    }

    @Override  // com.google.android.material.sidesheet.e
    int g() {
        return this.d();
    }

    @Override  // com.google.android.material.sidesheet.e
    int h(@NonNull View view0) {
        return view0.getLeft() - this.a.t0();
    }

    @Override  // com.google.android.material.sidesheet.e
    public int i(@NonNull CoordinatorLayout coordinatorLayout0) {
        return coordinatorLayout0.getRight();
    }

    @Override  // com.google.android.material.sidesheet.e
    int j() {
        return 0;
    }

    @Override  // com.google.android.material.sidesheet.e
    boolean k(float f) {
        return f < 0.0f;
    }

    @Override  // com.google.android.material.sidesheet.e
    boolean l(@NonNull View view0) {
        return view0.getLeft() > (this.e() + this.d()) / 2;
    }

    @Override  // com.google.android.material.sidesheet.e
    boolean m(float f, float f1) {
        return h.a(f, f1) && Math.abs(f) > 500.0f;
    }

    @Override  // com.google.android.material.sidesheet.e
    boolean n(@NonNull View view0, float f) {
        return Math.abs(((float)view0.getRight()) + f * this.a.r0()) > 0.5f;
    }

    @Override  // com.google.android.material.sidesheet.e
    void o(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v) {
        viewGroup$MarginLayoutParams0.rightMargin = v;
    }

    @Override  // com.google.android.material.sidesheet.e
    void p(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, int v1) {
        int v2 = this.a.x0();
        if(v <= v2) {
            viewGroup$MarginLayoutParams0.rightMargin = v2 - v;
        }
    }
}

