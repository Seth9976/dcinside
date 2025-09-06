package com.fsn.cauly.Y;

import android.app.Activity;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.fsn.cauly.blackdragoncore.contents.c;
import com.fsn.cauly.blackdragoncore.contents.d.k;
import com.fsn.cauly.blackdragoncore.utils.d;
import com.fsn.cauly.blackdragoncore.utils.g.b;
import com.fsn.cauly.blackdragoncore.utils.g;

public class u extends q implements View.OnClickListener, a, k {
    double e;
    RelativeLayout f;

    public u(i0 i00) {
        super(i00);
        this.e = 1.0;
        g.a(b.e, "Created popup container");
    }

    @Override  // com.fsn.cauly.Y.q
    public void a() {
        if(this.a.v) {
            this.b(this.b);
            g.a(b.e, "AdItem Blocked");
            return;
        }
        super.a();
    }

    @Override  // com.fsn.cauly.Y.q
    public void a(int v, String s) {
        super.a(v, s);
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
    }

    @Override  // com.fsn.cauly.Y.q
    protected void a(c c0, j0 j00) {
    }

    @Override  // com.fsn.cauly.Y.q
    protected void a(c c0, c c1) {
    }

    @Override  // com.fsn.cauly.Y.q
    protected void b(c c0, MotionEvent motionEvent0) {
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void c() {
    }

    @Override  // com.fsn.cauly.Y.q
    protected void c(c c0) {
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.d$k
    public void d() {
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void e() {
        ((FrameLayout)((Activity)this.a.b).getWindow().getDecorView().getRootView().findViewById(0x1020002)).removeView(this.f);
    }

    @Override  // com.fsn.cauly.Y.q
    protected void e(c c0) {
    }

    @Override  // com.fsn.cauly.Y.q
    protected Point f() {
        return d.b(this.a.b);
    }

    @Override  // com.fsn.cauly.Y.q
    public void g() {
        g.a(b.e, "Stopped popup container");
        super.g();
    }

    public void h() {
        if(this.b.getAdItem() != null) {
            this.b.getAdItem().O = System.currentTimeMillis();
        }
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
    }
}

