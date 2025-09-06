package com.dcinside.app.view.tool;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.perform.p;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class c extends p {
    static final class a extends Adapter {
        @m
        private final List a;

        public a(@l List list0) {
            L.p(list0, "apps");
            super();
            this.a = list0;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return this.a == null ? 0 : this.a.size();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
            this.v(((b)recyclerView$ViewHolder0), v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
            return this.w(viewGroup0, v);
        }

        public void v(@l b c$b0, int v) {
            L.p(c$b0, "holder");
            L.m(this.a);
            String s = (String)this.a.get(v);
            PackageManager packageManager0 = c$b0.itemView.getContext().getPackageManager();
            try {
                ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo(s, 0);
                L.o(applicationInfo0, "getApplicationInfo(...)");
                c$b0.e().setImageDrawable(applicationInfo0.loadIcon(packageManager0));
                c$b0.f().setText(applicationInfo0.loadLabel(packageManager0));
            }
            catch(Exception unused_ex) {
                c$b0.e().setImageDrawable(null);
                c$b0.f().setText(s);
            }
        }

        @l
        public b w(@l ViewGroup viewGroup0, int v) {
            L.p(viewGroup0, "parent");
            View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0194, viewGroup0, false);  // layout:view_app_choose
            L.m(view0);
            return new b(view0);
        }
    }

    static final class b extends ViewHolder {
        @l
        private final ImageView a;
        @l
        private final TextView b;

        public b(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
            View view1 = view0.findViewById(0x7F0B0122);  // id:app_choose_icon
            L.o(view1, "findViewById(...)");
            this.a = (ImageView)view1;
            View view2 = view0.findViewById(0x7F0B0123);  // id:app_choose_text
            L.o(view2, "findViewById(...)");
            this.b = (TextView)view2;
        }

        @l
        public final ImageView e() {
            return this.a;
        }

        @l
        public final TextView f() {
            return this.b;
        }
    }

    public c(@l Context context0, @l List list0, @m String s) {
        L.p(context0, "context");
        L.p(list0, "apps");
        super(context0, 0);
        RecyclerView recyclerView0 = new RecyclerView(context0);
        recyclerView0.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        recyclerView0.setLayoutManager(new GridLayoutManager(context0, 4));
        recyclerView0.setAdapter(new a(list0));
        com.dcinside.app.util.ql.b.m(recyclerView0, 0, 0);
        com.dcinside.app.util.ql.b.e(recyclerView0, (View view0, int v) -> {
            L.p(list0, "$apps");
            L.p(context0, "$context");
            Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
            intent0.addCategory("android.intent.category.BROWSABLE");
            context0.startActivity(intent0.setPackage(((String)list0.get(v))));
            return true;
        });
        this.z(recyclerView0);
    }

    // 检测为 Lambda 实现
    private static final boolean C(String s, List list0, Context context0, View view0, int v) [...]
}

