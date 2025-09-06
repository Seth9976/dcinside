package com.fsn.cauly.blackdragoncore.contents;

import com.fsn.cauly.Y.i0;
import com.fsn.cauly.Y.z;
import com.fsn.cauly.blackdragoncore.utils.g;

public class a extends c implements com.fsn.cauly.Y.z.a {
    z g;

    public a(i0 i00, b c$b0) {
        super(i00, c$b0);
    }

    @Override  // com.fsn.cauly.Y.z$a
    public void a() {
        this.g.setLayoutParams(com.fsn.cauly.blackdragoncore.utils.c.a());
        this.i();
    }

    @Override  // com.fsn.cauly.Y.z$a
    public void b() {
        this.g();
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean k() {
        return true;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean l() {
        return false;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean m() {
        return true;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public boolean o() {
        return false;
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    public void p() {
        this.g.g();
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    protected void q() {
        g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Start 3d content");
        this.setVisibility(0);
        z z0 = new z(this.a.b);
        this.g = z0;
        if(this.e == b.b) {
            z0.setPauseOnStart(true);
        }
        this.g.setListener(this);
        this.addView(this.g, com.fsn.cauly.blackdragoncore.utils.c.a());
        this.g.a(this.a, this.b);
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c
    protected void s() {
        g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Stop 3d content");
        z z0 = this.g;
        if(z0 != null) {
            z0.i();
        }
    }
}

