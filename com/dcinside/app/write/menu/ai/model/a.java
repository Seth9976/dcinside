package com.dcinside.app.write.menu.ai.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.t;
import com.dcinside.app.rx.bus.G;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.util.dl;
import com.dcinside.app.write.menu.ai.type.AiModelItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.random.f;
import y4.l;
import y4.m;

@s0({"SMAP\nAiModelAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiModelAdapter.kt\ncom/dcinside/app/write/menu/ai/model/AiModelAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n257#2,2:122\n257#2,2:124\n147#3:126\n1#4:127\n295#5,2:128\n*S KotlinDebug\n*F\n+ 1 AiModelAdapter.kt\ncom/dcinside/app/write/menu/ai/model/AiModelAdapter\n*L\n51#1:122,2\n63#1:124,2\n71#1:126\n108#1:128,2\n*E\n"})
public final class a extends Adapter {
    public static final class com.dcinside.app.write.menu.ai.model.a.a {
        private com.dcinside.app.write.menu.ai.model.a.a() {
        }

        public com.dcinside.app.write.menu.ai.model.a.a(w w0) {
        }
    }

    private final boolean a;
    @l
    private final Context b;
    @l
    private final ArrayList c;
    private int d;
    @m
    private t e;
    @l
    public static final com.dcinside.app.write.menu.ai.model.a.a f = null;
    private static final int g = 0;
    private static final int h = 1;

    static {
        a.f = new com.dcinside.app.write.menu.ai.model.a.a(null);
    }

    public a(boolean z, @l Context context0) {
        L.p(context0, "context");
        super();
        this.a = z;
        this.b = context0;
        this.c = new ArrayList();
    }

    public final void A(@l List list0) {
        L.p(list0, "list");
        this.c.clear();
        this.c.addAll(list0);
        Integer integer0 = dl.a.x();
        int v = integer0.intValue();
        if(v < 0 || v >= this.c.size()) {
            integer0 = null;
        }
        this.d = integer0 == null ? f.a.m(this.c.size()) : ((int)integer0);
        this.notifyItemRangeChanged(0, this.c.size());
    }

    public final void B(int v) {
        this.d = v;
    }

    public final void e(int v) {
        Object object0 = this.c.get(v);
        L.o(object0, "get(...)");
        G g0 = new G(((AiModelItem)object0));
        c.a(this.b, g0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.c.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return this.a;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        this.e = new t(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        int v1 = 8;
        if(recyclerView$ViewHolder0 instanceof b) {
            int v2 = ((AiModelItem)this.c.get(v)).c().c();
            if(v2 == 0) {
                ((b)recyclerView$ViewHolder0).f().setVisibility(4);
            }
            else {
                ((b)recyclerView$ViewHolder0).f().setVisibility(0);
                ((b)recyclerView$ViewHolder0).f().setImageResource(v2);
            }
            View view0 = ((b)recyclerView$ViewHolder0).h();
            if(this.d == v) {
                v1 = 0;
            }
            view0.setVisibility(v1);
            return;
        }
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.write.menu.ai.b) {
            Context context0 = recyclerView$ViewHolder0.itemView.getContext();
            Object object0 = this.c.get(v);
            L.o(object0, "get(...)");
            int v3 = ((AiModelItem)object0).c().c();
            if(v3 == 0) {
                ((com.dcinside.app.write.menu.ai.b)recyclerView$ViewHolder0).f().setVisibility(4);
            }
            else {
                ((com.dcinside.app.write.menu.ai.b)recyclerView$ViewHolder0).f().setVisibility(0);
                ((com.dcinside.app.write.menu.ai.b)recyclerView$ViewHolder0).f().setImageResource(v3);
            }
            View view1 = ((com.dcinside.app.write.menu.ai.b)recyclerView$ViewHolder0).i();
            if(this.d == v) {
                v1 = 0;
            }
            view1.setVisibility(v1);
            ((com.dcinside.app.write.menu.ai.b)recyclerView$ViewHolder0).h().setText(context0.getString(((AiModelItem)object0).c().d()));
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        if(v == 1) {
            View view0 = layoutInflater0.inflate(0x7F0E01F8, viewGroup0, false);  // layout:view_item_model_ai_big
            L.m(view0);
            return new com.dcinside.app.write.menu.ai.b(view0);
        }
        View view1 = layoutInflater0.inflate(0x7F0E01F7, viewGroup0, false);  // layout:view_item_model_ai
        L.m(view1);
        return new b(view1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        this.e = null;
    }

    public final int v() {
        return this.d;
    }

    @l
    public final AiModelItem w() {
        Object object0 = this.c.get(this.d);
        L.o(object0, "get(...)");
        return (AiModelItem)object0;
    }

    public final boolean x() {
        com.dcinside.app.write.menu.ai.type.a a0 = ((AiModelItem)this.c.get(this.d)).c();
        return com.dcinside.app.write.menu.ai.type.a.d.b(a0);
    }

    public final void y(@l AiModelItem aiModelItem0) {
        L.p(aiModelItem0, "model");
        this.d = this.c.indexOf(aiModelItem0);
        this.notifyItemRangeChanged(0, this.c.size());
    }

    public final void z(@m com.dcinside.app.write.menu.ai.type.a a0) {
        if(a0 == null) {
            return;
        }
        Object object0 = null;
        for(Object object1: this.c) {
            if(((AiModelItem)object1).c() == a0) {
                object0 = object1;
                break;
            }
        }
        if(((AiModelItem)object0) == null) {
            return;
        }
        this.y(((AiModelItem)object0));
    }
}

