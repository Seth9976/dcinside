package com.fsn.cauly.Y;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.fsn.cauly.blackdragoncore.contents.c;
import com.fsn.cauly.blackdragoncore.utils.d;
import com.fsn.cauly.blackdragoncore.utils.g.b;
import com.fsn.cauly.blackdragoncore.utils.g;

public class v extends q implements a {
    j0 e;
    ImageView f;
    Bitmap g;
    boolean h;

    public v(i0 i00) {
        super(i00);
        this.h = false;
        g.a(b.e, "Created Native container");
    }

    @Override  // com.fsn.cauly.Y.n0$a
    public void a(n0 n00, boolean z) {
    }

    @Override  // com.fsn.cauly.Y.q
    protected void a(c c0, j0 j00) {
        class com.fsn.cauly.Y.v.a implements Runnable {
            final RelativeLayout a;
            final c b;
            final v c;

            com.fsn.cauly.Y.v.a(RelativeLayout relativeLayout0, c c0) {
                this.a = relativeLayout0;
                this.b = c0;
                super();
            }

            @Override
            public void run() {
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
                this.a.addView(this.b, relativeLayout$LayoutParams0);
            }
        }

        i0 i00 = this.a;
        if(i00.c == null) {
            return;
        }
        this.e = j00;
        RelativeLayout relativeLayout0 = (RelativeLayout)i00.a();
        if(relativeLayout0 != null) {
            Context context0 = this.a.b;
            if(context0 instanceof Activity) {
                ((Activity)context0).runOnUiThread(new com.fsn.cauly.Y.v.a(this, relativeLayout0, c0));
                return;
            }
            relativeLayout0.addView(c0, new RelativeLayout.LayoutParams(-2, -2));
        }
    }

    @Override  // com.fsn.cauly.Y.q
    protected void a(c c0, c c1) {
        RelativeLayout relativeLayout0 = (RelativeLayout)this.a.a();
    }

    @Override  // com.fsn.cauly.Y.q
    protected void b(c c0, MotionEvent motionEvent0) {
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void c() {
        if(this.b != null && this.b.getAdItem() != null) {
            this.b.p();
            if(!this.h) {
                o.a(this.a, this.b.getAdItem(), null);
                this.h = true;
            }
        }
    }

    @Override  // com.fsn.cauly.Y.q
    protected void c(c c0) {
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void e() {
    }

    @Override  // com.fsn.cauly.Y.q
    protected void e(c c0) {
        i0 i00 = this.a;
        if(i00.c == null) {
            return;
        }
        RelativeLayout relativeLayout0 = (RelativeLayout)i00.a();
        if(relativeLayout0 != null) {
            com.fsn.cauly.blackdragoncore.utils.c.a(c0);
            relativeLayout0.removeView(c0);
        }
    }

    @Override  // com.fsn.cauly.Y.q
    protected Point f() {
        return d.a(this.a, com.fsn.cauly.Y.i0.a.a);
    }

    @Override  // com.fsn.cauly.Y.q
    public void g() {
        g.a(b.e, "Stopped Native container");
        this.e = null;
        this.h();
        if(this.f != null) {
            ViewGroup viewGroup0 = (ViewGroup)this.a.a();
            com.fsn.cauly.blackdragoncore.utils.c.a(this.f);
            if(viewGroup0 != null) {
                viewGroup0.removeView(this.f);
            }
            this.f = null;
        }
        super.g();
    }

    void h() {
        if(this.g != null) {
            this.f.setImageBitmap(null);
            this.g.recycle();
            this.g = null;
        }
    }
}

