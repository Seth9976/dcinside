package com.dcinside.app.write.menu.ai;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.t;
import com.dcinside.app.model.AiPromptLoadItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nAiSavePromptAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiSavePromptAdapter.kt\ncom/dcinside/app/write/menu/ai/AiSavePromptAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n147#2:122\n360#3,7:123\n1#4:130\n*S KotlinDebug\n*F\n+ 1 AiSavePromptAdapter.kt\ncom/dcinside/app/write/menu/ai/AiSavePromptAdapter\n*L\n14#1:122\n100#1:123,7\n*E\n"})
public final class q0 extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final ArrayList a;
    @l
    private final t b;
    @m
    private Long c;
    @m
    private String d;
    @l
    public static final a e = null;
    private static final int f = 0;
    private static final int g = 1;

    static {
        q0.e = new a(null);
    }

    public q0(@l n0 n00) {
        L.p(n00, "fragment");
        super();
        this.a = new ArrayList();
        this.b = new t(n00);
    }

    @m
    public final String A() {
        return this.d;
    }

    public final void B(int v) {
        int v1 = this.y();
        AiPromptLoadItem aiPromptLoadItem0 = this.w(v);
        this.c = aiPromptLoadItem0.i();
        this.d = aiPromptLoadItem0.q();
        if(v1 >= 0) {
            this.notifyItemChanged(v1);
        }
        this.notifyItemChanged(v);
    }

    public final void C(int v) {
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        n0 n00 = (n0)this.b.a();
        if(n00 != null) {
            n00.G0(((AiPromptLoadItem)object0), v);
        }
    }

    public final void D(@m List list0) {
        this.a.clear();
        if(list0 != null && !list0.isEmpty()) {
            this.a.addAll(list0);
            this.notifyDataSetChanged();
        }
    }

    public final void E(@m Long long0, @m String s) {
        if(long0 == null || long0.longValue() <= 0L) {
            long0 = null;
        }
        this.c = long0;
        if(s == null || s.length() <= 0) {
            s = null;
        }
        this.d = s;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return Math.max(this.a.size(), 1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return !this.a.isEmpty();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.write.menu.ai.s0) {
            Object object0 = this.a.get(v);
            L.o(object0, "get(...)");
            boolean z = this.c != null && ((long)this.c) == ((AiPromptLoadItem)object0).i() || L.g(this.d, ((AiPromptLoadItem)object0).q());
            recyclerView$ViewHolder0.itemView.setActivated(z);
            ((com.dcinside.app.write.menu.ai.s0)recyclerView$ViewHolder0).i().setText(((AiPromptLoadItem)object0).q());
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 0: {
                View view1 = layoutInflater0.inflate(0x7F0E018C, viewGroup0, false);  // layout:view_ai_prompt_save_empty
                L.m(view1);
                return new r0(view1);
            }
            case 1: {
                View view2 = layoutInflater0.inflate(0x7F0E018D, viewGroup0, false);  // layout:view_ai_prompt_save_item
                L.m(view2);
                return new com.dcinside.app.write.menu.ai.s0(view2);
            }
            default: {
                View view0 = layoutInflater0.inflate(0x7F0E018C, viewGroup0, false);  // layout:view_ai_prompt_save_empty
                L.m(view0);
                return new r0(view0);
            }
        }
    }

    public final void v(int v) {
        Object object0 = this.a.remove(v);
        L.o(object0, "removeAt(...)");
        if(L.g(((AiPromptLoadItem)object0).q(), this.d) || this.c != null && ((AiPromptLoadItem)object0).i() == ((long)this.c)) {
            this.d = null;
            this.c = null;
        }
        this.notifyItemRemoved(v);
    }

    @l
    public final AiPromptLoadItem w(int v) {
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        return (AiPromptLoadItem)object0;
    }

    public final int x() {
        return this.a.size();
    }

    public final int y() {
        if(this.c == null && this.d == null) {
            return -1;
        }
        int v = 0;
        for(Object object0: this.a) {
            if((this.c == null || ((AiPromptLoadItem)object0).i() != ((long)this.c)) && !L.g(((AiPromptLoadItem)object0).q(), this.d)) {
                ++v;
                continue;
            }
            return v;
        }
        return -1;
    }

    @m
    public final Long z() {
        return this.c;
    }
}

