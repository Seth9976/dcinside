package com.dcinside.app.gallery.search;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.model.Y;
import com.dcinside.app.realm.w0;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.J;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nCategoryHotAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryHotAdapter.kt\ncom/dcinside/app/gallery/search/CategoryHotAdapter\n+ 2 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,283:1\n47#2,2:284\n1#3:286\n1863#4,2:287\n1863#4,2:289\n*S KotlinDebug\n*F\n+ 1 CategoryHotAdapter.kt\ncom/dcinside/app/gallery/search/CategoryHotAdapter\n*L\n119#1:284,2\n200#1:287,2\n220#1:289,2\n*E\n"})
public final class g extends Adapter {
    public static final class a {
        private final int a;
        @m
        private final String b;
        @m
        private final Long c;
        @m
        private final Integer d;
        @m
        private final Y e;

        public a(int v, @m String s, @m Long long0, @m Integer integer0, @m Y y0) {
            this.a = v;
            this.b = s;
            this.c = long0;
            this.d = integer0;
            this.e = y0;
        }

        public a(int v, String s, Long long0, Integer integer0, Y y0, int v1, w w0) {
            this(v, ((v1 & 2) == 0 ? s : null), ((v1 & 4) == 0 ? long0 : null), ((v1 & 8) == 0 ? integer0 : null), ((v1 & 16) == 0 ? y0 : null));
        }

        public final int a() {
            return this.a;
        }

        @m
        public final String b() {
            return this.b;
        }

        @m
        public final Long c() {
            return this.c;
        }

        @m
        public final Integer d() {
            return this.d;
        }

        @m
        public final Y e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof a)) {
                return false;
            }
            if(this.a != ((a)object0).a) {
                return false;
            }
            if(!L.g(this.b, ((a)object0).b)) {
                return false;
            }
            if(!L.g(this.c, ((a)object0).c)) {
                return false;
            }
            return L.g(this.d, ((a)object0).d) ? L.g(this.e, ((a)object0).e) : false;
        }

        @l
        public final a f(int v, @m String s, @m Long long0, @m Integer integer0, @m Y y0) {
            return new a(v, s, long0, integer0, y0);
        }

        public static a g(a g$a0, int v, String s, Long long0, Integer integer0, Y y0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = g$a0.a;
            }
            if((v1 & 2) != 0) {
                s = g$a0.b;
            }
            if((v1 & 4) != 0) {
                long0 = g$a0.c;
            }
            if((v1 & 8) != 0) {
                integer0 = g$a0.d;
            }
            if((v1 & 16) != 0) {
                y0 = g$a0.e;
            }
            return g$a0.f(v, s, long0, integer0, y0);
        }

        @m
        public final Integer h() {
            return this.d;
        }

        @Override
        public int hashCode() {
            int v = this.a * 0x1F;
            int v1 = 0;
            int v2 = this.b == null ? 0 : this.b.hashCode();
            int v3 = this.c == null ? 0 : this.c.hashCode();
            int v4 = this.d == null ? 0 : this.d.hashCode();
            Y y0 = this.e;
            if(y0 != null) {
                v1 = y0.hashCode();
            }
            return (((v + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1;
        }

        @m
        public final Long i() {
            return this.c;
        }

        @m
        public final String j() {
            return this.b;
        }

        @m
        public final Y k() {
            return this.e;
        }

        public final int l() {
            return this.a;
        }

        @Override
        @l
        public String toString() {
            return "CategoryHotViewData(viewType=" + this.a + ", categoryName=" + this.b + ", categoryId=" + this.c + ", categoryGallCount=" + this.d + ", ranking=" + this.e + ")";
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }
    }

    public final class c {
        public static final int[] a;

        static {
            int[] arr_v = new int[com.dcinside.app.type.m.values().length];
            try {
                arr_v[com.dcinside.app.type.m.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.type.m.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.type.m.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.type.m.j.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            c.a = arr_v;
        }
    }

    @l
    private final com.dcinside.app.type.m a;
    @l
    private ArrayList b;
    @l
    public static final b c = null;
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 3;
    private static final int g = 4;
    private static final int h = 5;
    private static final int i = 6;

    static {
        g.c = new b(null);
    }

    public g(@l com.dcinside.app.type.m m0) {
        L.p(m0, "galleryGrade");
        super();
        this.a = m0;
        this.b = new ArrayList();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.b.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return ((a)this.b.get(v)).l();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        Drawable drawable0;
        String s1;
        L.p(recyclerView$ViewHolder0, "holder");
        Object object0 = this.b.get(v);
        L.o(object0, "get(...)");
        Context context0 = recyclerView$ViewHolder0.itemView.getContext();
        boolean z = true;
        if(recyclerView$ViewHolder0 instanceof r) {
            ((r)recyclerView$ViewHolder0).f().setText(((a)object0).j());
            TextView textView0 = ((r)recyclerView$ViewHolder0).e();
            String s = String.format(Locale.getDefault(), "(%s)", Arrays.copyOf(new Object[]{((a)object0).h()}, 1));
            L.o(s, "format(...)");
            textView0.setText(s);
            return;
        }
        if(recyclerView$ViewHolder0 instanceof y) {
            TextView textView1 = ((y)recyclerView$ViewHolder0).h();
            switch(this.a) {
                case 1: {
                    s1 = "갤러리 카테고리";
                    break;
                }
                case 2: {
                    s1 = "흥한 마이너 갤러리";
                    break;
                }
                case 3: {
                    s1 = "흥한 미니 갤러리";
                    break;
                }
                case 4: {
                    s1 = "흥한 인물 갤러리";
                    break;
                }
                default: {
                    throw new J();
                }
            }
            textView1.setText(s1);
            if(this.a == com.dcinside.app.type.m.g) {
                ((y)recyclerView$ViewHolder0).e().setVisibility(0);
                ((y)recyclerView$ViewHolder0).f().setVisibility(8);
                return;
            }
            ((y)recyclerView$ViewHolder0).e().setVisibility(8);
            ((y)recyclerView$ViewHolder0).f().setVisibility(0);
            return;
        }
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.gallery.search.c) {
            switch(this.a) {
                case 2: {
                    ((com.dcinside.app.gallery.search.c)recyclerView$ViewHolder0).w().setText("마이너 갤러리?");
                    ((com.dcinside.app.gallery.search.c)recyclerView$ViewHolder0).r().setText("마이너 갤러리 만들기");
                    ((com.dcinside.app.gallery.search.c)recyclerView$ViewHolder0).r().setTag("https://m.dcinside.com/makeminor/1");
                    ((com.dcinside.app.gallery.search.c)recyclerView$ViewHolder0).u().setText("마이너 갤러리란?");
                    ((com.dcinside.app.gallery.search.c)recyclerView$ViewHolder0).s().setText(Dl.c("누구나 갤러리를 개설할 수 있습니다.<br/>갤러리의 운영 권한(및 의무)이 임시로 개설자에게 부여됩니다."));
                    ((com.dcinside.app.gallery.search.c)recyclerView$ViewHolder0).t().setText(Dl.c("<font color=#d22227>승격안내 :</font> 마이너 갤러리는 심사 후 메인 갤러리로 승격됩니다. 승격 여부는 전적으로 회사에 의해 결정됩니다. 승격 시 매니저 권한은 회수될 수 있으며 개설자 이력은 보존됩니다."));
                    break;
                }
                case 3: {
                    ((com.dcinside.app.gallery.search.c)recyclerView$ViewHolder0).w().setText("미니 갤러리?");
                    ((com.dcinside.app.gallery.search.c)recyclerView$ViewHolder0).r().setText("미니 갤러리 만들기");
                    ((com.dcinside.app.gallery.search.c)recyclerView$ViewHolder0).r().setTag("https://m.dcinside.com/makemini/1");
                    break;
                }
                case 4: {
                    ((com.dcinside.app.gallery.search.c)recyclerView$ViewHolder0).w().setText("인물 갤러리?");
                    ((com.dcinside.app.gallery.search.c)recyclerView$ViewHolder0).r().setText("인물 갤러리 만들기");
                    ((com.dcinside.app.gallery.search.c)recyclerView$ViewHolder0).r().setTag("https://m.dcinside.com/makeperson/1");
                    break;
                }
                default: {
                    recyclerView$ViewHolder0.itemView.setVisibility(8);
                }
            }
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(((com.dcinside.app.gallery.search.c)recyclerView$ViewHolder0).w().getText());
            int v1 = spannableStringBuilder0.length();
            spannableStringBuilder0.setSpan(new UnderlineSpan(), 0, v1, 17);
            ((com.dcinside.app.gallery.search.c)recyclerView$ViewHolder0).w().setText(spannableStringBuilder0);
            ((com.dcinside.app.gallery.search.c)recyclerView$ViewHolder0).y(this.a);
            return;
        }
        if(recyclerView$ViewHolder0 instanceof q) {
            Y y0 = ((a)object0).k();
            Integer integer0 = y0 == null ? null : y0.m();
            TextView textView2 = ((q)recyclerView$ViewHolder0).f();
            Y y1 = ((a)object0).k();
            textView2.setText((y1 == null ? null : y1.l()));
            ((q)recyclerView$ViewHolder0).j().setText((integer0 == null ? null : context0.getString(0x7F150844, new Object[]{integer0.intValue()})));  // string:ranking_dot_text "%d."
            Y y2 = ((a)object0).k();
            boolean z1 = L.g((y2 == null ? null : y2.getState()), "N");
            ((q)recyclerView$ViewHolder0).e().setVisibility((z1 ? 0 : 8));
            TextView textView3 = ((q)recyclerView$ViewHolder0).f();
            if(z1) {
                z = false;
            }
            textView3.setEnabled(z);
            if((integer0 == null ? 99 : ((int)integer0)) > 20) {
                TextView textView4 = ((q)recyclerView$ViewHolder0).j();
                L.m(context0);
                textView4.setTextColor(vk.b(context0, 0x1010036));
            }
            else {
                ((q)recyclerView$ViewHolder0).j().setTextColor(ContextCompat.getColor(context0, 0x7F0600A5));  // color:caution
            }
            Y y3 = ((a)object0).k();
            if(y3 == null) {
                ((q)recyclerView$ViewHolder0).i().setVisibility(8);
                return;
            }
            ((q)recyclerView$ViewHolder0).i().setVisibility(0);
            int v2 = y3.r();
            if(v2 == 0) {
                ((q)recyclerView$ViewHolder0).i().setText("");
                drawable0 = ContextCompat.getDrawable(context0, 0x7F0804E1);  // drawable:ranking_edited
            }
            else {
                ((q)recyclerView$ViewHolder0).i().setText(String.valueOf(v2));
                drawable0 = ContextCompat.getDrawable(context0, y3.a().b());
            }
            if(drawable0 != null) {
                drawable0.setBounds(0, 0, 0, 0);
            }
            ((q)recyclerView$ViewHolder0).i().setCompoundDrawables(null, null, drawable0, null);
            if(this.a == com.dcinside.app.type.m.j) {
                ((q)recyclerView$ViewHolder0).h().setVisibility(0);
                ((q)recyclerView$ViewHolder0).h().setText(((a)object0).k().e());
                return;
            }
            ((q)recyclerView$ViewHolder0).h().setVisibility(4);
            return;
        }
        if(recyclerView$ViewHolder0 instanceof v) {
            ((v)recyclerView$ViewHolder0).q();
            return;
        }
        if(recyclerView$ViewHolder0 instanceof p) {
            ((p)recyclerView$ViewHolder0).e().setText((this.a == com.dcinside.app.type.m.j ? "흥한 인물 갤러리 순위를 집계 중입니다." : "전날 데이터 집계가 완료되면 순위가 표시됩니다."));
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 1: {
                View view1 = layoutInflater0.inflate(0x7F0E01A8, viewGroup0, false);  // layout:view_category_major_hot
                L.m(view1);
                return new v(view1);
            }
            case 2: {
                View view2 = layoutInflater0.inflate(0x7F0E01A7, viewGroup0, false);  // layout:view_category_item
                L.m(view2);
                return new r(view2);
            }
            case 3: {
                View view3 = layoutInflater0.inflate(0x7F0E01A9, viewGroup0, false);  // layout:view_category_title
                L.m(view3);
                return new y(view3);
            }
            case 4: {
                View view4 = layoutInflater0.inflate(0x7F0E01A5, viewGroup0, false);  // layout:view_category_about
                L.m(view4);
                return new com.dcinside.app.gallery.search.c(view4);
            }
            case 5: {
                View view5 = layoutInflater0.inflate(0x7F0E01A6, viewGroup0, false);  // layout:view_category_hot_item
                L.m(view5);
                return new q(view5);
            }
            case 6: {
                View view6 = layoutInflater0.inflate(0x7F0E01DD, viewGroup0, false);  // layout:view_hot_empty
                L.m(view6);
                return new p(view6);
            }
            default: {
                View view0 = layoutInflater0.inflate(0x7F0E01A6, viewGroup0, false);  // layout:view_category_hot_item
                L.m(view0);
                return new q(view0);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewDetachedFromWindow(@l ViewHolder recyclerView$ViewHolder0) {
        L.p(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof v) {
            o o0 = ((v)recyclerView$ViewHolder0).t();
            if(o0 != null) {
                o0.l();
            }
        }
        super.onViewDetachedFromWindow(recyclerView$ViewHolder0);
    }

    @m
    public final a v(int v) {
        return (a)u.W2(this.b, v);
    }

    public final void w(@l List list0) {
        L.p(list0, "list");
        this.b.clear();
        this.b.add(new a(4, null, null, null, null, 30, null));
        this.b.add(new a(3, null, null, null, null, 30, null));
        if(list0.isEmpty()) {
            this.b.add(new a(6, null, null, null, null, 30, null));
        }
        else {
            for(Object object0: list0) {
                this.b.add(new a(5, null, null, null, ((Y)object0), 14, null));
            }
        }
        this.notifyDataSetChanged();
    }

    public final void x(@m List list0) {
        this.b.clear();
        if(list0 != null) {
            this.b.add(new a(1, null, null, null, null, 30, null));
            this.b.add(new a(3, null, null, null, null, 30, null));
            for(Object object0: list0) {
                int v = ((w0)object0).Q5().size();
                this.b.add(new a(2, ((w0)object0).T5(), ((w0)object0).R5(), v, null, 16, null));
            }
        }
        this.notifyDataSetChanged();
    }
}

