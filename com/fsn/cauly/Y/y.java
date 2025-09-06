package com.fsn.cauly.Y;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.fsn.cauly.blackdragoncore.contents.c;
import com.fsn.cauly.blackdragoncore.d;
import com.fsn.cauly.blackdragoncore.utils.g.b;
import com.fsn.cauly.blackdragoncore.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

public class y extends q implements a {
    j0 e;
    boolean f;
    int g;
    int h;
    String i;
    boolean j;
    j0 k;

    public y(i0 i00) {
        super(i00);
        this.f = false;
        this.g = 0;
        this.j = false;
        g.a(b.e, "Created Video container");
        this.j();
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        if(s00.getErrorCode() == 0) {
            this.k = ((f)s00).i();
            int v = s00.getErrorCode();
            this.h = v;
            if(v == 0) {
                j0 j00 = this.k;
                if(j00.o == 0 || j00.o == 100) {
                    if(!TextUtils.isEmpty(j00.i) && !"null".equalsIgnoreCase(this.k.i) && d.a().b(this.a, this.k)) {
                        if(!this.j) {
                            this.a(this.k);
                            this.a.a(100, this.k.o, "");
                            return;
                        }
                        JSONObject jSONObject0 = this.h(this.k);
                        if(jSONObject0 != null) {
                            this.a.a(100, ((f)s00).getErrorCode(), jSONObject0.toString());
                            return;
                        }
                    }
                    this.a.a(101, 200, "No filled AD");
                    return;
                }
            }
            this.i = ((u0)s00).d();
            this.a.a(101, this.h, this.i);
            return;
        }
        this.a.a(101, s00.getErrorCode(), ((u0)s00).d());
    }

    @Override  // com.fsn.cauly.Y.q
    protected void a(c c0, j0 j00) {
        i0 i00 = this.a;
        if(i00.c == null) {
            return;
        }
        this.e = j00;
        RelativeLayout relativeLayout0 = (RelativeLayout)i00.a();
        if(relativeLayout0 != null) {
            relativeLayout0.addView(c0, new RelativeLayout.LayoutParams(-1, -1));
        }
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
        return com.fsn.cauly.blackdragoncore.utils.d.a(this.a, com.fsn.cauly.Y.i0.a.a);
    }

    @Override  // com.fsn.cauly.Y.q
    public void g() {
        g.a(b.e, "Stopped Video container");
        this.e = null;
        super.g();
    }

    private JSONObject h(j0 j00) {
        try {
            if(this.j) {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("id", "" + j00.a);
                jSONObject0.put("image", "" + j00.h);
                jSONObject0.put("title", "" + j00.c);
                jSONObject0.put("subtitle", "" + j00.K);
                jSONObject0.put("description", "" + j00.d);
                jSONObject0.put("icon", "" + j00.i);
                jSONObject0.put("ad_charge_type", "" + j00.W);
                jSONObject0.put("linkUrl", "" + j00.e);
                return jSONObject0;
            }
        }
        catch(JSONException unused_ex) {
        }
        return null;
    }

    boolean i() {
        int v;
        l0 l00 = this.a.r;
        if(l00 == null) {
            v = 10;
        }
        else {
            v = l00.x;
            if(v <= 0) {
                v = 10;
            }
        }
        if(this.g >= v) {
            this.g = 0;
            return true;
        }
        return false;
    }

    private void j() {
        if(this.i()) {
            this.a.a(101, 200, "No filled AD");
            return;
        }
        int v = this.g;
        this.g = v + 1;
        f f0 = new f(this.a, 1, 0, false, false, v, this.j);
        f0.a(this);
        f0.execute();
    }
}

