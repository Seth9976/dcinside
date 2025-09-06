package com.dcinside.app.write.menu.ai.character;

import A3.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dcinside.app.internal.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class a extends com.codewaves.stickyheadergrid.a {
    public static final class com.dcinside.app.write.menu.ai.character.a.a {
        private com.dcinside.app.write.menu.ai.character.a.a() {
        }

        public com.dcinside.app.write.menu.ai.character.a.a(w w0) {
        }
    }

    static final class b extends com.codewaves.stickyheadergrid.a.a {
        @l
        private final TextView a;

        public b(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
            View view1 = view0.findViewById(0x7F0B0FB0);  // id:total_search_empty
            L.o(view1, "findViewById(...)");
            this.a = (TextView)view1;
            ((TextView)view1).setText("해당하는 캐릭터가 없습니다.");
        }
    }

    @l
    private final List g;
    @m
    private Function1 h;
    @l
    public static final com.dcinside.app.write.menu.ai.character.a.a i = null;
    public static final int j = 0;
    public static final int k = 1;

    static {
        a.i = new com.dcinside.app.write.menu.ai.character.a.a(null);
    }

    public a() {
        this.g = new ArrayList();
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int E() {
        return 1;
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int G(int v) {
        return this.g.size() == 0 ? 0 : 1;
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int H(int v) {
        return this.g.size() == 0 ? 0 : ((List)this.g.get(v)).size();
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public void X(@m com.codewaves.stickyheadergrid.a.a a$a0, int v) {
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public void Y(@m com.codewaves.stickyheadergrid.a.b a$b0, int v, int v1) {
        if(a$b0 instanceof c) {
            ((c)a$b0).h().setText("");
        }
    }

    @Override  // com.codewaves.stickyheadergrid.a
    @l
    public com.codewaves.stickyheadergrid.a.a a0(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        if(v == 0) {
            View view0 = layoutInflater0.inflate(0x7F0E02A1, viewGroup0, false);  // layout:view_total_search_empty
            L.m(view0);
            return new b(view0);
        }
        View view1 = layoutInflater0.inflate(0x7F0E01AA, viewGroup0, false);  // layout:view_chara_prompt_header
        L.m(view1);
        return new com.dcinside.app.write.menu.ai.character.b(view1);
    }

    @Override  // com.codewaves.stickyheadergrid.a
    @l
    public com.codewaves.stickyheadergrid.a.b b0(@l ViewGroup viewGroup0, int v) {
        @f(c = "com.dcinside.app.write.menu.ai.character.CharaPromptAdapter$onCreateItemViewHolder$1", f = "CharaPromptAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.character.a.c extends o implements p {
            int k;
            final a l;
            final c m;

            com.dcinside.app.write.menu.ai.character.a.c(a a0, c c0, d d0) {
                this.l = a0;
                this.m = c0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.write.menu.ai.character.a.c(this.l, this.m, d0).invokeSuspend(S0.a);
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
                int v = this.m.getBindingAdapterPosition();
                this.l.e0(v);
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01AB, viewGroup0, false);  // layout:view_chara_prompt_item
        L.m(view0);
        com.codewaves.stickyheadergrid.a.b a$b0 = new c(view0);
        L.o(a$b0.itemView, "itemView");
        com.dcinside.app.write.menu.ai.character.a.c a$c0 = new com.dcinside.app.write.menu.ai.character.a.c(this, ((c)a$b0), null);
        r.M(a$b0.itemView, null, a$c0, 1, null);
        return a$b0;
    }

    private final void e0(int v) {
        this.B(this.z(v), v);
        Function1 function10 = this.h;
        if(function10 != null) {
            function10.invoke("");
        }
    }

    public final void f0(@m List list0) {
        this.g.clear();
        if(list0 != null && !list0.isEmpty()) {
            this.g.add(list0);
            this.N();
            return;
        }
        this.N();
    }

    public final void g0(@m Function1 function10) {
        this.h = function10;
    }
}

