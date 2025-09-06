package com.fsn.cauly.blackdragoncore.contents;

import com.fsn.cauly.Y.a0;
import com.fsn.cauly.Y.h;
import com.fsn.cauly.Y.i0;
import com.fsn.cauly.Y.s0.a;
import com.fsn.cauly.Y.s0;
import com.fsn.cauly.blackdragoncore.utils.g;

public class b extends c implements a {
    h g;
    a0 h;

    public b(i0 i00, com.fsn.cauly.blackdragoncore.contents.c.b c$b0) {
        super(i00, c$b0);
        a0 a00 = new a0(i00.b, i00.P, i00);
        this.h = a00;
        a00.setLayoutParams(com.fsn.cauly.blackdragoncore.utils.c.a());
        this.addView(this.h);
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        if(s00.getErrorCode() == 0) {
            this.h.setAutoFill("Y".equalsIgnoreCase(this.b.z));
            this.h.setFullMode(this.e != com.fsn.cauly.blackdragoncore.contents.c.b.a);
            this.h.setBitmap(this.g.i());
            this.h.a(this.g.i());
            this.i();
        }
        else {
            this.c(this.g.getErrorCode(), this.g.d());
        }
        this.g = null;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean k() {
        return false;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean l() {
        return false;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean m() {
        return false;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean o() {
        return false;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public void p() {
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    protected void q() {
        g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Start banner content");
        h h0 = new h(this.a.b, this.b, true);
        this.g = h0;
        h0.a(this);
        this.g.execute();
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    protected void s() {
        g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Stop banner content");
        this.h.b();
        h h0 = this.g;
        if(h0 == null) {
            return;
        }
        h0.cancel();
        this.g = null;
    }
}

