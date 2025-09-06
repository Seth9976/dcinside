package com.dcinside.app.settings.image.auto;

import A3.p;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.PostImage;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.m0;
import com.dcinside.app.rx.bus.x;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nAutoImageThumbHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoImageThumbHolder.kt\ncom/dcinside/app/settings/image/auto/AutoImageThumbHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n257#2,2:125\n257#2,2:127\n1#3:129\n25#4:130\n1557#5:131\n1628#5,3:132\n*S KotlinDebug\n*F\n+ 1 AutoImageThumbHolder.kt\ncom/dcinside/app/settings/image/auto/AutoImageThumbHolder\n*L\n39#1:125,2\n41#1:127,2\n92#1:130\n95#1:131\n95#1:132,3\n*E\n"})
public final class e extends ViewHolder {
    private final boolean a;
    @l
    private final ImageView b;
    @l
    private final TextView c;
    @l
    private final View d;
    @l
    private final TextView e;
    @l
    private final View f;

    public e(@l View view0, boolean z) {
        @f(c = "com.dcinside.app.settings.image.auto.AutoImageThumbHolder$4", f = "AutoImageThumbHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final e l;

            a(e e0, d d0) {
                this.l = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.v();
                return S0.a;
            }
        }

        L.p(view0, "view");
        super(view0);
        this.a = z;
        View view1 = view0.findViewById(0x7F0B017B);  // id:auto_thumb_image
        L.o(view1, "findViewById(...)");
        this.b = (ImageView)view1;
        View view2 = view0.findViewById(0x7F0B017E);  // id:auto_thumb_index
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B017C);  // id:auto_thumb_image_delete_wrap
        L.o(view3, "findViewById(...)");
        this.d = view3;
        View view4 = view0.findViewById(0x7F0B017D);  // id:auto_thumb_image_extension
        L.o(view4, "findViewById(...)");
        this.e = (TextView)view4;
        View view5 = view0.findViewById(0x7F0B09CC);  // id:picker_thumb_detail_wrap
        L.o(view5, "findViewById(...)");
        this.f = view5;
        ((ImageView)view1).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.u();
        });
        view3.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.s();
        });
        view5.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.t();
        });
        r.S(((ImageView)view1), null, false, new a(this, null), 3, null);
    }

    // 检测为 Lambda 实现
    private static final void i(e e0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void j(e e0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void k(e e0, View view0) [...]

    public final void m(@l Q q0, int v) {
        L.p(q0, "adapter");
        TextView textView0 = this.c;
        int v1 = q0.A().indexOf(v);
        if(v1 >= 0) {
            textView0.setText(String.valueOf(v1 + 1));
            textView0.setVisibility(0);
            return;
        }
        textView0.setVisibility(8);
    }

    @l
    public final View n() {
        return this.d;
    }

    @l
    public final View o() {
        return this.f;
    }

    @l
    public final ImageView p() {
        return this.b;
    }

    @l
    public final TextView q() {
        return this.c;
    }

    @l
    public final TextView r() {
        return this.e;
    }

    private final void s() {
        ViewParent viewParent0 = this.itemView.getParent();
        Integer integer0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        Q q0 = recyclerView$Adapter0 instanceof Q ? ((Q)recyclerView$Adapter0) : null;
        if(q0 == null) {
            return;
        }
        Integer integer1 = this.getBindingAdapterPosition();
        if(integer1.intValue() >= 0) {
            integer0 = integer1;
        }
        if(integer0 != null) {
            q0.w(((int)integer0));
        }
    }

    private final void t() {
        ViewParent viewParent0 = this.itemView.getParent();
        Integer integer0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(!(recyclerView$Adapter0 instanceof Q)) {
            recyclerView$Adapter0 = null;
        }
        if(((Q)recyclerView$Adapter0) == null) {
            return;
        }
        Integer integer1 = this.getBindingAdapterPosition();
        if(integer1.intValue() >= 0) {
            integer0 = integer1;
        }
        if(integer0 == null || ((Q)recyclerView$Adapter0).x(((int)integer0)) == null) {
            return;
        }
        Iterable iterable0 = ((Q)recyclerView$Adapter0).y();
        ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
        Iterator iterator0 = iterable0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            arrayList0.add(new PostImage("", ""));
        }
        Context context0 = this.itemView.getContext();
        L.o(context0, "getContext(...)");
        c.a(context0, new m0(null, 0, null, "", null, new ArrayList(arrayList0), false, com.dcinside.app.image.f0.f.ordinal(), null, false, null, null, 0xE00, null));
    }

    private final void u() {
        Integer integer0 = this.getBindingAdapterPosition();
        Q q0 = null;
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            ViewParent viewParent0 = this.itemView.getParent();
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(recyclerView$Adapter0 instanceof Q) {
                q0 = (Q)recyclerView$Adapter0;
            }
            if(q0 == null) {
                return;
            }
            if(!this.a && !q0.B()) {
                return;
            }
            Context context0 = this.itemView.getContext();
            if(context0 == null) {
                return;
            }
            List list0 = q0.A();
            int v1 = list0.indexOf(integer0);
            if(v1 >= 0) {
                HashSet hashSet0 = new HashSet();
                int v2 = list0.size();
                for(int v3 = v1; v3 < v2; ++v3) {
                    hashSet0.add(((Number)list0.get(v3)).intValue());
                }
                list0.remove(v1);
                for(Object object0: hashSet0) {
                    L.m(((Integer)object0));
                    this.w(recyclerView0, q0, ((int)(((Integer)object0))));
                }
            }
            else {
                int v4 = q0.y().size();
                if(v4 > list0.size()) {
                    list0.add(integer0);
                    this.w(recyclerView0, q0, v);
                }
                else {
                    String s = v4 == 1 ? "이미지는 1개만 첨부 가능합니다." : context0.getString(0x7F1507FE, new Object[]{v4});  // string:post_write_image_max "이미지는 최대 %d개까지만 첨부 가능합니다."
                    L.m(s);
                    Snackbar.E0(this.itemView, s, -1).m0();
                }
            }
            q0.E();
        }
    }

    private final void v() {
        Integer integer0 = this.getBindingAdapterPosition();
        Q q0 = null;
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            ViewParent viewParent0 = this.itemView.getParent();
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(recyclerView$Adapter0 instanceof Q) {
                q0 = (Q)recyclerView$Adapter0;
            }
            if(q0 == null) {
                return;
            }
            if(!this.a && !q0.B()) {
                return;
            }
            Context context0 = this.itemView.getContext();
            L.o(context0, "getContext(...)");
            c.a(context0, new x(v));
        }
    }

    private final void w(RecyclerView recyclerView0, Q q0, int v) {
        ViewHolder recyclerView$ViewHolder0 = recyclerView0.findViewHolderForAdapterPosition(v);
        e e0 = recyclerView$ViewHolder0 instanceof e ? ((e)recyclerView$ViewHolder0) : null;
        if(e0 != null && q0.x(v) != null) {
            e0.m(q0, v);
        }
    }
}

