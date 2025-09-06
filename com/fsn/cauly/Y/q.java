package com.fsn.cauly.Y;

import android.app.Activity;
import android.graphics.Point;
import android.view.MotionEvent;
import com.fsn.cauly.blackdragoncore.contents.c.a;
import com.fsn.cauly.blackdragoncore.contents.c;
import com.fsn.cauly.blackdragoncore.utils.g.b;
import com.fsn.cauly.blackdragoncore.utils.g;

public abstract class q implements a {
    public interface com.fsn.cauly.Y.q.a {
        void a(j0 arg1);

        void a(j0 arg1, int arg2, String arg3);

        void b(j0 arg1);

        void onClickAd();
    }

    i0 a;
    c b;
    c c;
    com.fsn.cauly.Y.q.a d;

    public q(i0 i00) {
        this.a = i00;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void a() {
        if(this.a.v) {
            this.b(this.c);
            g.a(b.e, "AdItem Blocked");
            return;
        }
        j0 j00 = this.c.getAdItem();
        if(!this.a.w && j00.f.startsWith("rich_pe")) {
            this.b(this.c);
            g.a(b.e, "PE AdItem Blocked");
            return;
        }
        b g$b0 = b.e;
        g.a(g$b0, "Received AdItem");
        if(com.fsn.cauly.blackdragoncore.c.b().b(this.a, j00)) {
            this.b(this.c);
            g.a(g$b0, "PE AdItem Blocked");
            return;
        }
        this.c.setVisibility(0);
        this.a(this.b, this.c);
        this.b(this.b);
        com.fsn.cauly.blackdragoncore.c.b().a(this.a, j00);
        c c0 = this.c;
        this.b = c0;
        this.c = null;
        this.c(c0);
        com.fsn.cauly.Y.q.a q$a0 = this.d;
        if(q$a0 == null) {
            return;
        }
        q$a0.b(this.b.getAdItem());
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void a(int v, String s) {
        g.a(b.e, "Failed to received AdItem");
        j0 j00 = this.c.getAdItem();
        this.b(this.c);
        if(this.d == null) {
            return;
        }
        com.fsn.cauly.blackdragoncore.c.b().i(this.a);
        com.fsn.cauly.Y.q.a q$a0 = this.d;
        if(q$a0 != null) {
            q$a0.a(j00, v, s);
        }
    }

    public void a(j0 j00) {
        g.a(b.e, "Load adItem");
        if(j00 == null) {
            return;
        }
        if(this.a != null && !(this.a.b instanceof Activity) && (this.a.a == com.fsn.cauly.Y.i0.a.b || this.a.a == com.fsn.cauly.Y.i0.a.d || this.a.a == com.fsn.cauly.Y.i0.a.e || this.a.a == com.fsn.cauly.Y.i0.a.h)) {
            com.fsn.cauly.Y.q.a q$a0 = this.d;
            if(q$a0 != null) {
                q$a0.a(j00, -100, "non-activity request is not allowed in this adtype");
            }
            return;
        }
        if(j00.g != null && (j00.g.startsWith("mraid") || j00.g.startsWith("ormma"))) {
            com.fsn.cauly.Y.q.a q$a1 = this.d;
            if(q$a1 != null) {
                q$a1.a(j00, 200, "No filled AD");
            }
            return;
        }
        this.b(this.c);
        this.c = null;
        Point point0 = this.f();
        i0 i00 = this.a;
        com.fsn.cauly.Y.i0.a i0$a0 = i00.a;
        com.fsn.cauly.Y.i0.a i0$a1 = com.fsn.cauly.Y.i0.a.b;
        if(i0$a0 == i0$a1 || i0$a0 == com.fsn.cauly.Y.i0.a.d) {
            this.c = c.a(i00, j00, com.fsn.cauly.blackdragoncore.contents.c.b.b);
        }
        else if(i0$a0 == com.fsn.cauly.Y.i0.a.a) {
            this.c = c.a(i00, j00, com.fsn.cauly.blackdragoncore.contents.c.b.a);
        }
        else if(i0$a0 == com.fsn.cauly.Y.i0.a.c || i0$a0 == com.fsn.cauly.Y.i0.a.g) {
            this.c = c.a(i00, j00, com.fsn.cauly.blackdragoncore.contents.c.b.e);
        }
        else if(i0$a0 == com.fsn.cauly.Y.i0.a.h) {
            this.c = c.a(i00, j00, com.fsn.cauly.blackdragoncore.contents.c.b.f);
        }
        this.c.setListener(this);
        this.c.setContentSize(point0);
        this.c.setVisibility(4);
        this.a(this.c, j00);
        this.c.a(j00);
        i0 i01 = this.a;
        if(i01.a != i0$a1) {
            i01.X = System.currentTimeMillis();
        }
    }

    public void a(com.fsn.cauly.Y.q.a q$a0) {
        this.d = q$a0;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void a(c c0) {
        this.d(c0);
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void a(c c0, MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                i0 i00 = this.a;
                i00.S = ((int)motionEvent0.getX()) + "x" + ((int)motionEvent0.getY());
                break;
            }
            case 1: {
                i0 i01 = this.a;
                i01.T = ((int)motionEvent0.getX()) + "x" + ((int)motionEvent0.getY());
            }
        }
        this.b(c0, motionEvent0);
    }

    protected abstract void a(c arg1, j0 arg2);

    protected abstract void a(c arg1, c arg2);

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void b() {
        com.fsn.cauly.Y.q.a q$a0 = this.d;
        if(q$a0 == null) {
            return;
        }
        q$a0.onClickAd();
    }

    public void b(c c0) {
        if(c0 == null) {
            return;
        }
        this.e(c0);
        c0.setListener(null);
        c0.r();
        com.fsn.cauly.blackdragoncore.c.b().i(this.a);
    }

    protected abstract void b(c arg1, MotionEvent arg2);

    protected abstract void c(c arg1);

    protected void d(c c0) {
    }

    protected abstract void e(c arg1);

    protected abstract Point f();

    public void g() {
        c c0 = this.c;
        if(c0 != null) {
            this.b(c0);
        }
        c c1 = this.b;
        if(c1 != null) {
            this.b(c1);
        }
    }
}

