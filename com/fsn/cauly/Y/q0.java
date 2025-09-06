package com.fsn.cauly.Y;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.fsn.cauly.blackdragoncore.contents.c.b;
import com.fsn.cauly.blackdragoncore.contents.d.k;
import com.fsn.cauly.blackdragoncore.contents.d;
import com.fsn.cauly.blackdragoncore.utils.c;
import java.util.ArrayList;

public class q0 extends b0 implements View.OnClickListener, a, n0, k {
    public static boolean b = false;
    i0 c;
    j0 d;
    final int e;
    final int f;
    final int g;
    d h;
    boolean i;
    int j;

    static {
    }

    public q0(Context context0) {
        super(context0, 0x103000B);
        this.e = 720;
        this.f = 1230;
        this.g = 0x500;
        this.i = false;
    }

    @Override  // com.fsn.cauly.Y.b0$a
    public void a(Dialog dialog0) {
        i0 i00 = this.c;
        if(i00 != null) {
            Context context0 = i00.b;
            if(context0 != null && context0 instanceof Activity) {
                ((Activity)context0).setRequestedOrientation(this.j);
            }
        }
        d d0 = this.h;
        if(d0 != null) {
            d0.r();
            c.a(this.h);
        }
        if(dialog0 == null) {
            this.dismiss();
        }
        else {
            dialog0.dismiss();
        }
        q0.b = false;
    }

    public void a(i0 i00, j0 j00) {
        this.c = i00;
        this.d = j00;
        d d0 = new d(i00, b.d);
        this.h = d0;
        d0.setNativeAdListener(this);
        this.a(this);
        Window window0 = this.getWindow();
        window0.requestFeature(1);
        window0.setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout relativeLayout0 = c.a(i00.b, c.b());
        relativeLayout0.addView(this.h, c.c());
        this.setContentView(relativeLayout0);
        Context context0 = i00.b;
        if(context0 instanceof Activity) {
            this.j = ((Activity)context0).getRequestedOrientation();
            com.fsn.cauly.blackdragoncore.utils.d.d(i00.b);
        }
        this.show();
        if(j00 != null) {
            this.h.a(j00);
        }
    }

    public void a(i0 i00, j0 j00, int v) {
        this.c = i00;
        this.d = j00;
        this.a(this);
        if(this.d != null && this.d.M != null) {
            j0 j01 = com.fsn.cauly.Y.d.c(j00.M);
            if(j01 != null) {
                ArrayList arrayList0 = j01.L;
                if(arrayList0 != null) {
                    k0 k00 = this.b(arrayList0);
                    if(k00 == null) {
                        return;
                    }
                    int v1 = com.fsn.cauly.blackdragoncore.utils.d.a(i00.b) <= com.fsn.cauly.blackdragoncore.utils.d.c(i00.b) ? com.fsn.cauly.blackdragoncore.utils.d.c(i00.b) / 0x500 : com.fsn.cauly.blackdragoncore.utils.d.a(i00.b) / 0x500;
                    if(k00.g >= 720 && k00.h >= 1230) {
                        this.i = true;
                    }
                    Point point0 = this.i ? new Point(com.fsn.cauly.blackdragoncore.utils.d.c(i00.b), com.fsn.cauly.blackdragoncore.utils.d.a(i00.b)) : new Point(((int)(((double)k00.g) * ((double)v1))), ((int)(((double)k00.h) * ((double)v1))));
                    Window window0 = this.getWindow();
                    window0.requestFeature(1);
                    RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = c.b();
                    RelativeLayout relativeLayout0 = c.a(i00.b, relativeLayout$LayoutParams0);
                    d d0 = new d(i00, this, b.c);
                    this.h = d0;
                    d0.setNativeAdListener(this);
                    this.h.setContentSize(point0);
                    relativeLayout0.addView(this.h, relativeLayout$LayoutParams0);
                    this.setContentView(relativeLayout0);
                    Context context0 = i00.b;
                    if(context0 instanceof Activity) {
                        this.j = ((Activity)context0).getRequestedOrientation();
                        com.fsn.cauly.blackdragoncore.utils.d.d(i00.b);
                        if(((Activity)context0).isDestroyed() || ((Activity)context0).isFinishing()) {
                            return;
                        }
                    }
                    this.show();
                    window0.setBackgroundDrawable(new ColorDrawable(Color.argb(100, 0, 0, 0)));
                    if(this.i) {
                        window0.setLayout(com.fsn.cauly.blackdragoncore.utils.d.c(i00.b), com.fsn.cauly.blackdragoncore.utils.d.a(i00.b));
                    }
                    else {
                        window0.setLayout(((int)(((double)k00.g) * ((double)v1))), ((int)(((double)k00.h) * ((double)v1))));
                    }
                    window0.setGravity(17);
                    this.h.a(j01);
                    q0.b = true;
                }
            }
        }
    }

    private k0 b(ArrayList arrayList0) {
        for(Object object0: arrayList0) {
            k0 k00 = (k0)object0;
            if(!TextUtils.isEmpty(k00.a) && k00.a.equals("frame")) {
                return k00;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.d$k
    public void d() {
        this.dismiss();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
    }
}

