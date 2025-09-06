package com.dcinside.app.dccon;

import Y.c5;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.p;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.q;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class f extends ViewHolder {
    @l
    private final c5 a;

    public f(@l c5 c50) {
        L.p(c50, "binding");
        super(c50.b());
        this.a = c50;
    }

    public final void e(@l p p0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.dccon.DcconTagSearchHolder$bind$1", f = "DcconTagSearchAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements A3.p {
            int k;
            final f l;
            final p m;

            a(f f0, p p0, d d0) {
                this.l = f0;
                this.m = p0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, this.m, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Context context0 = this.l.itemView.getContext();
                L.o(context0, "getContext(...)");
                c.a(context0, new q(this.m));
                return S0.a;
            }
        }

        L.p(p0, "item");
        com.facebook.drawee.controller.a a0 = ((com.facebook.drawee.backends.pipeline.f)com.facebook.drawee.backends.pipeline.d.j().j0(p0.r()).I(true)).e();
        this.a.b.setController(a0);
        L.o(this.a.b, "dcconPreviewItem");
        a f$a0 = new a(this, p0, null);
        r.M(this.a.b, null, f$a0, 1, null);
    }
}

