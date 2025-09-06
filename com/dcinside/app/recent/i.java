package com.dcinside.app.recent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.type.F;
import com.dcinside.app.util.Dk;
import com.lsjwzh.widget.recyclerviewpager.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nRecentPageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentPageAdapter.kt\ncom/dcinside/app/recent/RecentPageAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,218:1\n257#2,2:219\n257#2,2:221\n257#2,2:223\n176#2,2:225\n176#2,2:227\n176#2,2:229\n176#2,2:231\n*S KotlinDebug\n*F\n+ 1 RecentPageAdapter.kt\ncom/dcinside/app/recent/RecentPageAdapter\n*L\n167#1:219,2\n169#1:221,2\n172#1:223,2\n182#1:225,2\n190#1:227,2\n197#1:229,2\n205#1:231,2\n*E\n"})
public final class i extends c {
    @l
    private final WeakReference a;
    @l
    private final WeakReference b;
    @l
    private final WeakReference c;
    @m
    private Throwable d;
    @m
    private Throwable e;
    @m
    private List f;
    @m
    private List g;

    public i(@m Function1 function10, @m Function1 function11, @m Function1 function12) {
        this.a = new WeakReference(function10);
        this.b = new WeakReference(function11);
        this.c = new WeakReference(function12);
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(new ArrayList());
        this.f = arrayList0;
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(new ArrayList());
        this.g = arrayList1;
    }

    public void A(@l j j0, int v) {
        int v9;
        int v2;
        List list0;
        Throwable throwable0;
        L.p(j0, "holder");
        int v1 = this.f == null ? 0 : this.f.size();
        if(v < v1) {
            throwable0 = this.d;
            list0 = this.f == null ? null : ((List)this.f.get(v));
            v2 = 0x7F15086E;  // string:recent_empty_basic "최근 방문 목록이 없습니다."
        }
        else {
            Throwable throwable1 = this.e;
            list0 = this.g == null ? null : ((List)this.g.get(v - v1));
            throwable0 = throwable1;
            v2 = 0x7F15086F;  // string:recent_empty_favorite "즐겨찾기 목록이 없습니다."
        }
        if(throwable0 != null) {
            String s = throwable0.getMessage();
            if(s == null) {
                s = j0.i().getContext().getString(v2);
                L.o(s, "getString(...)");
            }
            j0.m().setVisibility(0);
            j0.i().setText(s);
            j0.q().setVisibility(0);
            j0.l().setVisibility(8);
            j0.r().setVisibility(8);
            return;
        }
        if(list0 != null && !list0.isEmpty()) {
            j0.m().setVisibility(8);
            j0.l().setVisibility(0);
            j0.r().setVisibility(0);
            int v3 = list0.size();
            TextView[] arr_textView = j0.s();
            for(int v4 = 0; v4 < arr_textView.length; ++v4) {
                TextView textView0 = arr_textView[v4];
                if(textView0 != null) {
                    textView0.setText((v3 <= v4 ? null : ((h)list0.get(v4)).a()));
                }
            }
            View[] arr_view = j0.o();
            for(int v5 = 0; v5 < arr_view.length; ++v5) {
                View view0 = arr_view[v5];
                if(v3 > v5) {
                    Object object0 = ((h)list0.get(v5)).getItem();
                    if(!(object0 instanceof com.dcinside.app.realm.s0)) {
                        if(view0 != null) {
                            view0.setVisibility(8);
                        }
                    }
                    else if(view0 != null) {
                        view0.setVisibility((((com.dcinside.app.realm.s0)object0).U5() <= 0 ? 0 : 8));
                    }
                }
                else if(view0 != null) {
                    view0.setVisibility(8);
                }
            }
            ImageView[] arr_imageView = j0.k();
            int v6 = 0;
            while(v6 < arr_imageView.length) {
                ImageView imageView0 = arr_imageView[v6];
                if(imageView0 != null) {
                    if(v3 > v6) {
                        Object object1 = ((h)list0.get(v6)).getItem();
                        if(object1 instanceof com.dcinside.app.realm.s0) {
                            int v7 = ((com.dcinside.app.realm.s0)object1).T5();
                            com.dcinside.app.type.m m0 = com.dcinside.app.type.m.i;
                            if(v7 == m0.c() || ((com.dcinside.app.realm.s0)object1).T5() == com.dcinside.app.type.m.j.c()) {
                                if(((com.dcinside.app.realm.s0)object1).T5() == m0.c()) {
                                    imageView0.setImageResource(0x7F080415);  // drawable:mini_gall_ic
                                    imageView0.setPadding(0, 0, 0, 0);
                                }
                                else if(((com.dcinside.app.realm.s0)object1).T5() == com.dcinside.app.type.m.j.c()) {
                                    imageView0.setImageResource(0x7F0804A8);  // drawable:person_gall_ic
                                    int v8 = Dk.b(0x7F0703C6);  // dimen:person_icon_padding
                                    imageView0.setPadding(0, v8, v8, 0);
                                }
                                v9 = 0;
                                goto label_92;
                            }
                            else {
                                imageView0.setPadding(0, 0, 0, 0);
                                goto label_91;
                            }
                            goto label_75;
                        }
                        else {
                        label_75:
                            if(object1 instanceof com.dcinside.app.realm.m) {
                                int v10 = ((com.dcinside.app.realm.m)object1).Q5();
                                com.dcinside.app.type.m m1 = com.dcinside.app.type.m.i;
                                if(v10 == m1.c() || ((com.dcinside.app.realm.m)object1).Q5() == com.dcinside.app.type.m.j.c()) {
                                    if(((com.dcinside.app.realm.m)object1).Q5() == m1.c()) {
                                        imageView0.setImageResource(0x7F080415);  // drawable:mini_gall_ic
                                        imageView0.setPadding(0, 0, 0, 0);
                                    }
                                    else if(((com.dcinside.app.realm.m)object1).Q5() == com.dcinside.app.type.m.j.c()) {
                                        imageView0.setImageResource(0x7F0804A8);  // drawable:person_gall_ic
                                        int v11 = Dk.b(0x7F0703C6);  // dimen:person_icon_padding
                                        imageView0.setPadding(0, v11, v11, 0);
                                    }
                                    v9 = 0;
                                    goto label_92;
                                }
                                else {
                                    imageView0.setPadding(0, 0, 0, 0);
                                }
                            }
                        }
                    }
                label_91:
                    v9 = 8;
                label_92:
                    imageView0.setVisibility(v9);
                }
                ++v6;
            }
            return;
        }
        j0.m().setVisibility(0);
        r.o0(j0.i(), v2);
        j0.q().setVisibility(8);
        j0.l().setVisibility(8);
        j0.r().setVisibility(8);
    }

    public final void B(int v, int v1) {
        int v2 = this.x();
        List list0 = null;
        if(v < v2) {
            List list1 = this.f;
            if(list1 != null) {
                list0 = (List)list1.get(v);
            }
        }
        else {
            List list2 = this.g;
            if(list2 != null) {
                list0 = (List)list2.get(v - v2);
            }
        }
        if(list0 != null && list0.size() > v1) {
            Function1 function10 = (Function1)this.b.get();
            if(function10 != null) {
                function10.invoke(list0.get(v1));
            }
        }
    }

    public final void C(int v) {
        if(v < this.x()) {
            Function1 function10 = (Function1)this.a.get();
            if(function10 != null) {
                function10.invoke(F.b);
            }
        }
        else {
            Function1 function11 = (Function1)this.a.get();
            if(function11 != null) {
                function11.invoke(F.c);
            }
        }
    }

    @l
    public j D(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E025B, viewGroup0, false);  // layout:view_recent_page
        L.m(view0);
        return new j(view0);
    }

    public final void E(int v, int v1) {
        int v2 = this.x();
        List list0 = null;
        if(v < v2) {
            List list1 = this.f;
            if(list1 != null) {
                list0 = (List)list1.get(v);
            }
        }
        else {
            List list2 = this.g;
            if(list2 != null) {
                list0 = (List)list2.get(v - v2);
            }
        }
        if(list0 != null && list0.size() > v1) {
            Function1 function10 = (Function1)this.c.get();
            if(function10 != null) {
                function10.invoke(list0.get(v1));
            }
        }
    }

    public final void F(@l List list0, @m Throwable throwable0) {
        L.p(list0, "list");
        this.e = throwable0;
        this.g = this.v(list0, 0);
        this.notifyDataSetChanged();
    }

    public final void G(@l List list0, @m Throwable throwable0) {
        L.p(list0, "list");
        this.d = throwable0;
        this.f = this.v(list0, 0);
        this.notifyDataSetChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.x() + this.w();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.A(((j)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.D(viewGroup0, v);
    }

    private final List v(List list0, int v) {
        List list1 = new ArrayList();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(((h)object0));
            if(arrayList0.size() == 10) {
                ((ArrayList)list1).add(arrayList0);
                arrayList0 = new ArrayList();
            }
            if(v > 0 && ((ArrayList)list1).size() >= v) {
                break;
            }
        }
        if(arrayList0.size() > 0 || ((ArrayList)list1).size() == 0) {
            ((ArrayList)list1).add(arrayList0);
        }
        return list1;
    }

    public final int w() {
        return this.g == null ? 0 : this.g.size();
    }

    public final int x() {
        return this.f == null ? 0 : this.f.size();
    }

    public final int y(int v) {
        int v1 = this.x();
        return v < v1 ? v1 : this.w();
    }

    public final int z(int v) {
        int v1 = this.x();
        return v < v1 ? v : v - v1;
    }
}

