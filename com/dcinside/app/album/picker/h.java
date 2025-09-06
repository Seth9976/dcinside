package com.dcinside.app.album.picker;

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
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.m0;
import com.dcinside.app.rx.bus.o0;
import com.dcinside.app.util.jl;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nPickerImageHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerImageHolder.kt\ncom/dcinside/app/album/picker/PickerImageHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,232:1\n1#2:233\n25#3:234\n25#3:235\n1557#4:236\n1628#4,3:237\n*S KotlinDebug\n*F\n+ 1 PickerImageHolder.kt\ncom/dcinside/app/album/picker/PickerImageHolder\n*L\n55#1:234\n203#1:235\n211#1:236\n211#1:237,3\n*E\n"})
public final class h extends ViewHolder {
    @m
    private I0 a;
    @l
    private TextView b;
    @l
    private TextView c;
    @l
    private ImageView d;
    @l
    private View e;

    public h(@l View view0) {
        @f(c = "com.dcinside.app.album.picker.PickerImageHolder$1", f = "PickerImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPickerImageHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerImageHolder.kt\ncom/dcinside/app/album/picker/PickerImageHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,232:1\n1#2:233\n177#3,9:234\n*S KotlinDebug\n*F\n+ 1 PickerImageHolder.kt\ncom/dcinside/app/album/picker/PickerImageHolder$1\n*L\n31#1:234,9\n*E\n"})
        static final class a extends o implements p {
            int k;
            Object l;
            final h m;

            a(h h0, d d0) {
                this.m = h0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                a h$a0 = new a(this.m, d0);
                h$a0.l = view0;
                return h$a0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                try {
                    this.m.o();
                }
                catch(Exception unused_ex) {
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.album.picker.PickerImageHolder$2", f = "PickerImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final h l;

            b(h h0, d d0) {
                this.l = h0;
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
                f0.n(object0);
                this.l.n();
                return S0.a;
            }
        }

        L.p(view0, "view");
        super(view0);
        View view1 = view0.findViewById(0x7F0B09CE);  // id:picker_thumb_index
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B09CF);  // id:picker_thumb_info
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B09CD);  // id:picker_thumb_image
        L.o(view3, "findViewById(...)");
        this.d = (ImageView)view3;
        View view4 = view0.findViewById(0x7F0B09CC);  // id:picker_thumb_detail_wrap
        L.o(view4, "findViewById(...)");
        this.e = view4;
        r.M(this.d, null, new a(this, null), 1, null);
        r.M(this.e, null, new b(this, null), 1, null);
    }

    public final void h(@l com.dcinside.app.album.picker.f f0, int v) {
        L.p(f0, "adapter");
        TextView textView0 = this.b;
        int v1 = f0.y().indexOf(v);
        if(v1 >= 0) {
            textView0.setText((f0.D() || U.a.b == 1 ? "" : String.valueOf(v1 + 1)));
            textView0.setVisibility(0);
            return;
        }
        textView0.setVisibility(8);
    }

    @l
    public final View i() {
        return this.e;
    }

    @l
    public final ImageView j() {
        return this.d;
    }

    @l
    public final TextView k() {
        return this.b;
    }

    @l
    public final TextView l() {
        return this.c;
    }

    @m
    public final I0 m() {
        return this.a;
    }

    private final void n() {
        ViewParent viewParent0 = this.itemView.getParent();
        Integer integer0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.album.picker.f)) {
            recyclerView$Adapter0 = null;
        }
        if(((com.dcinside.app.album.picker.f)recyclerView$Adapter0) == null) {
            return;
        }
        Integer integer1 = this.getBindingAdapterPosition();
        if(integer1.intValue() >= 0) {
            integer0 = integer1;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            PickerItem pickerItem0 = ((com.dcinside.app.album.picker.f)recyclerView$Adapter0).v(v);
            if(pickerItem0 == null) {
                return;
            }
            if((((com.dcinside.app.album.picker.f)recyclerView$Adapter0).E() || ((com.dcinside.app.album.picker.f)recyclerView$Adapter0).B()) && ((com.dcinside.app.album.picker.f)recyclerView$Adapter0).D()) {
                Context context0 = this.itemView.getContext();
                L.o(context0, "getContext(...)");
                c.a(context0, new o0(pickerItem0.m()));
                return;
            }
            int v1 = s.u(v - 2, 0);
            Iterable iterable0 = ((com.dcinside.app.album.picker.f)recyclerView$Adapter0).y();
            ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
            for(Object object0: iterable0) {
                arrayList0.add(((int)(((Number)object0).intValue() - 2)));
            }
            int[] arr_v = u.U5(arrayList0);
            Context context1 = this.itemView.getContext();
            L.o(context1, "getContext(...)");
            c.a(context1, new m0(null, 0, null, pickerItem0.m(), null, null, false, com.dcinside.app.image.f0.d.ordinal(), null, false, v1, arr_v, 0x200, null));
        }
    }

    private final void o() {
        Integer integer0 = this.getBindingAdapterPosition();
        Adapter recyclerView$Adapter0 = null;
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
            Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
            if(recyclerView$Adapter1 instanceof com.dcinside.app.album.picker.f) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            if(((com.dcinside.app.album.picker.f)recyclerView$Adapter0) == null) {
                return;
            }
            if(((com.dcinside.app.album.picker.f)recyclerView$Adapter0).B()) {
                if(((com.dcinside.app.album.picker.f)recyclerView$Adapter0).D()) {
                    this.q(v, recyclerView0, ((com.dcinside.app.album.picker.f)recyclerView$Adapter0));
                    return;
                }
                this.p(v, recyclerView0, ((com.dcinside.app.album.picker.f)recyclerView$Adapter0));
                return;
            }
            if(((com.dcinside.app.album.picker.f)recyclerView$Adapter0).E()) {
                if(((com.dcinside.app.album.picker.f)recyclerView$Adapter0).D()) {
                    this.s(v, recyclerView0, true, true, ((com.dcinside.app.album.picker.f)recyclerView$Adapter0));
                    return;
                }
                this.r(v, recyclerView0, ((com.dcinside.app.album.picker.f)recyclerView$Adapter0));
                return;
            }
            if(((com.dcinside.app.album.picker.f)recyclerView$Adapter0).D()) {
                this.s(v, recyclerView0, false, false, ((com.dcinside.app.album.picker.f)recyclerView$Adapter0));
                return;
            }
            this.r(v, recyclerView0, ((com.dcinside.app.album.picker.f)recyclerView$Adapter0));
        }
    }

    private final void p(int v, RecyclerView recyclerView0, com.dcinside.app.album.picker.f f0) {
        Context context0 = this.itemView.getContext();
        if(context0 == null) {
            return;
        }
        PickerItem pickerItem0 = f0.v(v);
        if(pickerItem0 == null) {
            return;
        }
        L.o(this.itemView, "itemView");
        if(!com.dcinside.app.album.l.p(com.dcinside.app.album.l.a, this.itemView, context0, pickerItem0.m(), false, false, 16, null)) {
            return;
        }
        List list0 = f0.y();
        int v1 = list0.indexOf(v);
        if(v1 >= 0) {
            HashSet hashSet0 = new HashSet();
            int v2 = list0.size();
            for(int v3 = v1; v3 < v2; ++v3) {
                hashSet0.add(((Number)list0.get(v3)).intValue());
            }
            list0.remove(v1);
            for(Object object0: hashSet0) {
                L.m(((Integer)object0));
                this.t(recyclerView0, f0, ((int)(((Integer)object0))));
            }
            return;
        }
        int v4 = U.a.a;
        if(v4 > list0.size()) {
            list0.add(v);
            this.t(recyclerView0, f0, v);
            return;
        }
        String s = context0.getString(0x7F1507FE, new Object[]{v4});  // string:post_write_image_max "이미지는 최대 %d개까지만 첨부 가능합니다."
        Snackbar.E0(this.itemView, s, -1).m0();
    }

    private final void q(int v, RecyclerView recyclerView0, com.dcinside.app.album.picker.f f0) {
        Context context0 = this.itemView.getContext();
        if(context0 == null) {
            return;
        }
        PickerItem pickerItem0 = f0.v(v);
        if(pickerItem0 == null) {
            return;
        }
        L.o(this.itemView, "itemView");
        if(!com.dcinside.app.album.l.p(com.dcinside.app.album.l.a, this.itemView, context0, pickerItem0.m(), false, false, 16, null)) {
            return;
        }
        List list0 = f0.y();
        if(!list0.contains(v)) {
            if(list0.size() > 0) {
                int v1 = ((Number)u.B2(list0)).intValue();
                if(v1 >= 0) {
                    list0.clear();
                    this.t(recyclerView0, f0, v1);
                }
            }
            list0.add(v);
            this.t(recyclerView0, f0, v);
        }
    }

    private final void r(int v, RecyclerView recyclerView0, com.dcinside.app.album.picker.f f0) {
        String s;
        Context context0 = this.itemView.getContext();
        if(context0 == null) {
            return;
        }
        PickerItem pickerItem0 = f0.v(v);
        if(pickerItem0 == null) {
            return;
        }
        L.o(this.itemView, "itemView");
        if(!com.dcinside.app.album.l.p(com.dcinside.app.album.l.a, this.itemView, context0, pickerItem0.m(), false, false, 16, null)) {
            return;
        }
        List list0 = f0.y();
        int v1 = list0.indexOf(v);
        if(v1 >= 0) {
            HashSet hashSet0 = new HashSet();
            int v2 = list0.size();
            for(int v3 = v1; v3 < v2; ++v3) {
                hashSet0.add(((Number)list0.get(v3)).intValue());
            }
            list0.remove(v1);
            for(Object object0: hashSet0) {
                L.m(((Integer)object0));
                this.t(recyclerView0, f0, ((int)(((Integer)object0))));
            }
            return;
        }
        if(U.a.b > list0.size()) {
            list0.add(v);
            this.t(recyclerView0, f0, v);
            return;
        }
        int v4 = U.a.b;
        if(v4 == 1) {
            s = "이미지는 1개만 첨부 가능합니다.";
        }
        else if(!f0.z() || v4 != 20) {
            s = f0.z() ? context0.getString(0x7F1507FE, new Object[]{jl.a.N()}) : context0.getString(0x7F1507FE, new Object[]{v4});  // string:post_write_image_max "이미지는 최대 %d개까지만 첨부 가능합니다."
        }
        else {
            s = context0.getString(0x7F15011E, new Object[]{20});  // string:auto_image_max_upload "이미지는 한 번에 %1$d개까지 첨부 가능합니다."
        }
        L.m(s);
        Snackbar.E0(this.itemView, s, -1).m0();
    }

    private final void s(int v, RecyclerView recyclerView0, boolean z, boolean z1, com.dcinside.app.album.picker.f f0) {
        Context context0 = this.itemView.getContext();
        if(context0 == null) {
            return;
        }
        PickerItem pickerItem0 = f0.v(v);
        if(pickerItem0 == null) {
            return;
        }
        L.o(this.itemView, "itemView");
        if(!com.dcinside.app.album.l.a.o(this.itemView, context0, pickerItem0.m(), z, z1)) {
            return;
        }
        List list0 = f0.y();
        if(!list0.contains(v)) {
            if(list0.size() > 0) {
                int v2 = ((Number)u.B2(list0)).intValue();
                if(v2 >= 0) {
                    list0.clear();
                    this.t(recyclerView0, f0, v2);
                }
            }
            list0.add(v);
            this.t(recyclerView0, f0, v);
        }
        else if(list0.size() > 0) {
            int v1 = ((Number)u.B2(list0)).intValue();
            if(v1 >= 0) {
                list0.clear();
                this.t(recyclerView0, f0, v1);
            }
        }
    }

    private final void t(RecyclerView recyclerView0, com.dcinside.app.album.picker.f f0, int v) {
        ViewHolder recyclerView$ViewHolder0 = recyclerView0.findViewHolderForAdapterPosition(v);
        h h0 = recyclerView$ViewHolder0 instanceof h ? ((h)recyclerView$ViewHolder0) : null;
        if(h0 != null && f0.v(v) != null) {
            h0.h(f0, v);
        }
        f0.F();
    }

    public final void u(@l View view0) {
        L.p(view0, "<set-?>");
        this.e = view0;
    }

    public final void v(@l ImageView imageView0) {
        L.p(imageView0, "<set-?>");
        this.d = imageView0;
    }

    public final void w(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.b = textView0;
    }

    public final void x(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.c = textView0;
    }

    public final void y(@m I0 i00) {
        this.a = i00;
    }
}

