package com.dcinside.app.settings.image.auto;

import com.afollestad.dragselectrecyclerview.a;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class f implements a {
    @l
    private final Q a;

    public f(@l Q q0) {
        L.p(q0, "adapter");
        super();
        this.a = q0;
    }

    @Override  // com.afollestad.dragselectrecyclerview.a
    public void a(int v, boolean z) {
        if(this.a.C()) {
            List list0 = this.a.z();
            if(z) {
                if(this.a.D(v)) {
                    return;
                }
                this.a.L(v, true);
                return;
            }
            if(!list0.contains(v) && this.a.D(v)) {
                this.a.L(v, false);
                return;
            }
            return;
        }
        if(!this.c(v)) {
            return;
        }
        this.a.L(v, false);
    }

    @Override  // com.afollestad.dragselectrecyclerview.a
    public boolean b(int v) {
        boolean z = this.a.D(v);
        this.a.F(!z);
        return true;
    }

    @Override  // com.afollestad.dragselectrecyclerview.a
    public boolean c(int v) {
        return this.a.D(v);
    }

    @Override  // com.afollestad.dragselectrecyclerview.a
    public int getItemCount() {
        return this.a.getItemCount();
    }
}

