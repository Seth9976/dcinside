package com.dcinside.app.post;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.model.ProfileInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class k extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private List a;
    @l
    public static final a b = null;
    public static final int c = 0;
    public static final int d = 1;

    static {
        k.b = new a(null);
    }

    public k() {
        this.a = new ArrayList();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return v == 0 ? 0 : 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof m) {
            ProfileInfo profileInfo0 = (ProfileInfo)this.a.get(v);
            Context context0 = recyclerView$ViewHolder0.itemView.getContext();
            ((m)recyclerView$ViewHolder0).h().setText("");
            ((m)recyclerView$ViewHolder0).f().setVisibility(8);
            CharSequence charSequence0 = ((m)recyclerView$ViewHolder0).h().getText();
            if(L.g(charSequence0, "사이트")) {
                TextView textView0 = ((m)recyclerView$ViewHolder0).e();
                L.m(context0);
                textView0.setText(t.b.a(context0, ""));
                ((m)recyclerView$ViewHolder0).e().setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            if(L.g(charSequence0, "대표 이미지")) {
                ((m)recyclerView$ViewHolder0).f().setVisibility(0);
                com.dcinside.app.glide.a.l(((m)recyclerView$ViewHolder0).f()).t0("").S1().q1(((m)recyclerView$ViewHolder0).f());
                ((m)recyclerView$ViewHolder0).e().setText(null);
                return;
            }
            ((m)recyclerView$ViewHolder0).e().setText("");
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 0: {
                View view1 = layoutInflater0.inflate(0x7F0E01D7, viewGroup0, false);  // layout:view_full_profile_desc
                L.m(view1);
                return new com.dcinside.app.post.l(view1);
            }
            case 1: {
                View view2 = layoutInflater0.inflate(0x7F0E01D6, viewGroup0, false);  // layout:view_full_profile
                L.m(view2);
                return new m(view2);
            }
            default: {
                View view0 = layoutInflater0.inflate(0x7F0E01D6, viewGroup0, false);  // layout:view_full_profile
                L.m(view0);
                return new m(view0);
            }
        }
    }

    public final void v(@l List list0) {
        L.p(list0, "items");
        this.a.add(0, new ProfileInfo(null, null, null, 7, null));
        this.a.addAll(list0);
        this.notifyItemRangeInserted(0, this.getItemCount());
    }
}

