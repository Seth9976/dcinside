package com.dcinside.app.post;

import A3.p;
import Y.u1;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.f0;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nSelectYearDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectYearDialogFragment.kt\ncom/dcinside/app/post/SelectYearDialogFragment\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,109:1\n25#2:110\n*S KotlinDebug\n*F\n+ 1 SelectYearDialogFragment.kt\ncom/dcinside/app/post/SelectYearDialogFragment\n*L\n71#1:110\n*E\n"})
public final class o1 extends DialogFragment {
    public static final class a extends Adapter {
        public static final class com.dcinside.app.post.o1.a.a extends ViewHolder {
            public com.dcinside.app.post.o1.a.a(@l View view0) {
                L.p(view0, "itemView");
                super(view0);
            }
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return this.v().size();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
            this.w(((com.dcinside.app.post.o1.a.a)recyclerView$ViewHolder0), v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
            return this.x(viewGroup0, v);
        }

        @l
        public final ArrayList v() {
            int v = Calendar.getInstance().get(1);
            ArrayList arrayList0 = new ArrayList();
            while(0x7CE < v) {
                arrayList0.add(String.valueOf(v));
                --v;
            }
            return arrayList0;
        }

        public void w(@l com.dcinside.app.post.o1.a.a o1$a$a0, int v) {
            L.p(o1$a$a0, "holder");
            View view0 = o1$a$a0.itemView;
            L.o(view0, "itemView");
            if(view0 instanceof TextView) {
                ((TextView)view0).setText(((CharSequence)this.v().get(v)));
            }
        }

        @l
        public com.dcinside.app.post.o1.a.a x(@l ViewGroup viewGroup0, int v) {
            L.p(viewGroup0, "parent");
            View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01FE, viewGroup0, false);  // layout:view_item_year
            L.m(view0);
            return new com.dcinside.app.post.o1.a.a(view0);
        }
    }

    @m
    private u1 a;

    private final u1 l0() {
        u1 u10 = this.a;
        L.m(u10);
        return u10;
    }

    // 检测为 Lambda 实现
    private static final boolean m0(o1 o10, View view0, int v) [...]

    private final void n0(int v) {
        u1 u10 = this.l0();
        L.o(u10.b, "dialogSelectYearList");
        Adapter recyclerView$Adapter0 = u10.b.getAdapter();
        if(!(recyclerView$Adapter0 instanceof a)) {
            recyclerView$Adapter0 = null;
        }
        if(((a)recyclerView$Adapter0) == null) {
            return;
        }
        Context context0 = this.getContext();
        if(context0 == null) {
            return;
        }
        Object object0 = ((a)recyclerView$Adapter0).v().get(v);
        L.o(object0, "get(...)");
        c.a(context0, new f0(Integer.parseInt(((String)object0))));
        this.dismissAllowingStateLoss();
    }

    @Override  // androidx.fragment.app.DialogFragment
    @l
    public Dialog onCreateDialog(@m Bundle bundle0) {
        Dialog dialog0 = super.onCreateDialog(bundle0);
        L.o(dialog0, "onCreateDialog(...)");
        Window window0 = dialog0.getWindow();
        if(window0 != null) {
            window0.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = u1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.l0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        this.a = null;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStart() {
        super.onStart();
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setLayout(-1, -1);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        @f(c = "com.dcinside.app.post.SelectYearDialogFragment$onViewCreated$1", f = "SelectYearDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final o1 l;

            b(o1 o10, d d0) {
                this.l = o10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.dismissAllowingStateLoss();
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        u1 u10 = this.l0();
        L.o(u10.c, "dialogSelectYearWrap");
        b o1$b0 = new b(this, null);
        r.M(u10.c, null, o1$b0, 1, null);
        u1 u11 = this.l0();
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(u11.b.getContext());
        u11.b.setLayoutManager(linearLayoutManager0);
        a o1$a0 = new a();
        u11.b.setAdapter(o1$a0);
        n1 n10 = (View view0, int v) -> {
            L.p(this, "this$0");
            this.n0(v);
            return true;
        };
        com.dcinside.app.util.ql.b.e(u11.b, n10);
    }
}

