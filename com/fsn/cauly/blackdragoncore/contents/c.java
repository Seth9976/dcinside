package com.fsn.cauly.blackdragoncore.contents;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout;
import com.fsn.cauly.Y.a0;
import com.fsn.cauly.Y.i0;
import com.fsn.cauly.Y.j0;

public abstract class c extends LinearLayout implements View.OnClickListener {
    public interface a {
        void a();

        void a(int arg1, String arg2);

        void a(c arg1);

        void a(c arg1, MotionEvent arg2);

        void b();

        void c();

        void e();
    }

    public static enum b {
        Banner,
        Interstitial,
        Landing,
        Custom,
        Native,
        Video;

    }

    i0 a;
    j0 b;
    a c;
    Point d;
    b e;
    boolean f;

    public c(i0 i00, b c$b0) {
        super(i00.b);
        this.f = false;
        this.a = i00;
        this.e = c$b0;
        this.setClickable(true);
        this.setOnClickListener(this);
    }

    public static c a(i0 i00, j0 j00, b c$b0) {
        String s = "";
        if(c$b0 == b.f) {
            return new e(i00, c$b0);
        }
        if(c$b0 == b.e) {
            return new d(i00, c$b0);
        }
        if(c$b0 == b.c) {
            String s1 = j00.l;
            String s2 = j00.g;
            if(!TextUtils.isEmpty(s1)) {
                s = s1;
            }
            TextUtils.isEmpty(s2);
            if(s.equals("video")) {
                return new h(i00, c$b0);
            }
            if(s.equals("richvideo")) {
                return new BDRichVideoContentView(i00, c$b0);
            }
            return s.equals("3d") ? new com.fsn.cauly.blackdragoncore.contents.a(i00, c$b0) : new f(i00, c$b0);
        }
        String s3 = j00.f;
        String s4 = j00.g;
        if(TextUtils.isEmpty(s3)) {
            s3 = "";
        }
        if(!TextUtils.isEmpty(s4)) {
            s = s4;
        }
        if(s3.equals("popup_mini")) {
            return !s.equals("img") && !s.equals("n/a") ? new f(i00, c$b0) : new com.fsn.cauly.blackdragoncore.contents.b(i00, c$b0);
        }
        if(s3.equals("text")) {
            return new g(i00, c$b0);
        }
        if(!s3.equals("banner") && !s3.equals("full")) {
            if(s3.equals("popup_customplayer")) {
                c c0 = new h(i00, c$b0);
                ((h)c0).setPauseOnStart(true);
                return c0;
            }
            if(s3.equals("popup_richvideo")) {
                return new BDRichVideoContentView(i00, c$b0);
            }
            return s3.startsWith("popup_3d") ? new com.fsn.cauly.blackdragoncore.contents.a(i00, c$b0) : new f(i00, c$b0);
        }
        return new com.fsn.cauly.blackdragoncore.contents.b(i00, c$b0);
    }

    public void a(j0 j00) {
        if(this.b != null) {
            return;
        }
        this.b = j00;
        this.q();
    }

    private boolean b(MotionEvent motionEvent0) {
        if(a0.a <= 0) {
            return false;
        }
        int v = a0.b(this.getWidth(), a0.a);
        return !"Y".equalsIgnoreCase(this.b.z) && (motionEvent0.getX() < ((float)v) || motionEvent0.getX() > ((float)(v + a0.a)) && motionEvent0.getX() < ((float)this.getWidth()));
    }

    protected void c(int v, String s) {
        if(this.f) {
            return;
        }
        this.f = true;
        a c$a0 = this.c;
        if(c$a0 == null) {
            return;
        }
        c$a0.a(v, s);
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        if(!this.b(motionEvent0) && this.isClickable()) {
            if(motionEvent0.getAction() == 1) {
                this.setClickable(false);
                new Handler(Looper.getMainLooper()).postDelayed(() -> this.setClickable(true), 500L);
            }
            a c$a0 = this.c;
            if(c$a0 != null) {
                c$a0.a(this, motionEvent0);
            }
            return super.dispatchTouchEvent(motionEvent0);
        }
        return false;
    }

    protected void f() {
        a c$a0 = this.c;
        if(c$a0 == null) {
            return;
        }
        c$a0.b();
    }

    protected void g() {
        a c$a0 = this.c;
        if(c$a0 == null) {
            return;
        }
        c$a0.e();
    }

    public j0 getAdItem() {
        return this.b;
    }

    public b getContainerType() {
        return this.e;
    }

    public Context getCurrentContext() {
        Context context0 = this.getContext();
        View view0 = this.getRootView();
        if(view0 != null) {
            context0 = view0.getContext();
            if(context0 != null && context0 instanceof Activity) {
                Activity activity0 = ((Activity)context0).getParent();
                if(activity0 != null && activity0 instanceof TabActivity) {
                    context0 = activity0;
                }
                i0 i00 = this.a;
                if(i00 != null && i00.b != context0) {
                    i00.b = context0;
                }
            }
        }
        i0 i01 = this.a;
        if(i01 != null) {
            Context context1 = i01.b;
            if(context1 == null) {
                i01.b = this.getContext();
                return context0;
            }
            return context1;
        }
        return context0;
    }

    protected void h() {
        a c$a0 = this.c;
        if(c$a0 == null) {
            return;
        }
        c$a0.c();
    }

    protected void i() {
        if(this.f) {
            return;
        }
        this.f = true;
        a c$a0 = this.c;
        if(c$a0 == null) {
            return;
        }
        c$a0.a();
    }

    public boolean j() {
        return false;
    }

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();

    // 检测为 Lambda 实现
    private void n() [...]

    public abstract boolean o();

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        a c$a0 = this.c;
        if(c$a0 != null) {
            c$a0.a(((c)view0));
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        motionEvent0.getAction();
        return super.onTouchEvent(motionEvent0);
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        Context context0 = this.a.b;
        if(context0 instanceof Activity) {
            if(v == 8 && ((Activity)context0).isFinishing()) {
                com.fsn.cauly.blackdragoncore.c.b().j(this.a);
                this.s();
            }
        }
        else if(v == 8) {
            com.fsn.cauly.blackdragoncore.c.b().j(this.a);
            this.s();
            this.g();
        }
    }

    public abstract void p();

    protected abstract void q();

    public void r() {
        if(this.b == null) {
            return;
        }
        this.s();
    }

    protected abstract void s();

    public void setContentSize(Point point0) {
        this.d = point0;
    }

    public void setListener(a c$a0) {
        this.c = c$a0;
    }
}

