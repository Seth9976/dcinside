package com.dcinside.app.dccon;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.dccon.setting.tag.b;
import com.dcinside.app.read.E;
import com.dcinside.app.read.G;
import com.dcinside.app.realm.B;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import rx.g;
import rx.schedulers.c;
import y4.l;
import y4.m;

@s0({"SMAP\nDcconTagSearchManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconTagSearchManager.kt\ncom/dcinside/app/dccon/DcconTagSearchManager\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n257#2,2:103\n1#3:105\n*S KotlinDebug\n*F\n+ 1 DcconTagSearchManager.kt\ncom/dcinside/app/dccon/DcconTagSearchManager\n*L\n70#1:103,2\n*E\n"})
public final class j {
    @l
    private final Context a;
    @l
    private final g b;
    @l
    private final e c;
    @l
    private String d;
    @m
    private View e;
    @m
    private TextView f;

    public j(@l Context context0) {
        L.p(context0, "context");
        super();
        this.a = context0;
        this.b = G.c();
        this.c = new e();
        this.d = "";
    }

    public final void g(@l String s) {
        @s0({"SMAP\nDcconTagSearchManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconTagSearchManager.kt\ncom/dcinside/app/dccon/DcconTagSearchManager$applyText$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1611#2,9:103\n1863#2:112\n1864#2:114\n1620#2:115\n1557#2:116\n1628#2,3:117\n1#3:113\n*S KotlinDebug\n*F\n+ 1 DcconTagSearchManager.kt\ncom/dcinside/app/dccon/DcconTagSearchManager$applyText$1\n*L\n50#1:103,9\n50#1:112\n50#1:114\n50#1:115\n56#1:116\n56#1:117,3\n50#1:113\n*E\n"})
        static final class a extends N implements Function1 {
            final String e;

            a(String s) {
                this.e = s;
                super(1);
            }

            public final List a(E e0) {
                Iterable iterable0 = b.h.b(this.e);
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: iterable0) {
                    com.dcinside.app.read.E.a e$a0 = e0.a(((Number)((V)object0).a()).intValue(), ((Number)((V)object0).b()).intValue());
                    if(e$a0 != null) {
                        arrayList0.add(e$a0);
                    }
                }
                List list0 = e0.b(this.e);
                Set set0 = u.Z5(arrayList0);
                set0.addAll(list0);
                Iterable iterable1 = u.q5(set0);
                List list1 = new ArrayList(u.b0(iterable1, 10));
                for(Object object1: iterable1) {
                    list1.add(((com.dcinside.app.read.E.a)object1).g());
                }
                return list1;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((E)object0));
            }
        }


        @s0({"SMAP\nDcconTagSearchManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconTagSearchManager.kt\ncom/dcinside/app/dccon/DcconTagSearchManager$applyText$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,102:1\n257#2,2:103\n*S KotlinDebug\n*F\n+ 1 DcconTagSearchManager.kt\ncom/dcinside/app/dccon/DcconTagSearchManager$applyText$2\n*L\n61#1:103,2\n*E\n"})
        static final class com.dcinside.app.dccon.j.b extends N implements Function1 {
            final j e;

            com.dcinside.app.dccon.j.b(j j0) {
                this.e = j0;
                super(1);
            }

            public final void a(List list0) {
                int v = 0;
                this.e.o(false);
                TextView textView0 = this.e.f;
                if(textView0 != null) {
                    if(!list0.isEmpty()) {
                        v = 8;
                    }
                    textView0.setVisibility(v);
                }
                L.m(list0);
                this.e.c.y(list0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((List)object0));
                return S0.a;
            }
        }

        L.p(s, "tag");
        this.d = s;
        this.o(true);
        rx.j j0 = c.a();
        this.b.M3(j0).g3((Object object0) -> {
            L.p(new a(s), "$tmp0");
            return (List)new a(s).invoke(object0);
        }).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new com.dcinside.app.dccon.j.b(this), "$tmp0");
            new com.dcinside.app.dccon.j.b(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.o(false);
            Dl.D(this.a, 0x7F150323);  // string:failed_main_contents "컨텐츠를 가져오기를 실패했습니다."
        });
    }

    // 检测为 Lambda 实现
    private static final List h(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void i(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void j(j j0, Throwable throwable0) [...]

    public final void k() {
        String s = this.d.length() > 0 ? this.d : null;
        if(s == null) {
            return;
        }
        String s1 = B.E.c0();
        if(s1 == null) {
            s1 = "guest";
        }
        dl dl0 = dl.a;
        String s2 = dl0.Q1(s1);
        if(s2 == null) {
            dl0.D5(s1, s);
            return;
        }
        List list0 = u.Y5(v.V4(s2, new String[]{"#"}, false, 0, 6, null));
        int v = 0;
        for(Object object0: list0) {
            if(L.g(((String)object0), s)) {
                list0.remove(v);
                break;
            }
            ++v;
        }
        if(list0.size() > 19) {
            list0.remove(u.J(list0));
        }
        list0.add(0, s);
        String s3 = u.m3(list0, "#", null, null, 0, null, null, 62, null);
        dl.a.D5(s1, s3);
    }

    public final void l(@l TextView textView0) {
        L.p(textView0, "emptyText");
        this.f = textView0;
    }

    public final void m(@l View view0) {
        L.p(view0, "progressBar");
        this.e = view0;
    }

    public final void n(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "rv");
        recyclerView0.setAdapter(this.c);
        recyclerView0.setLayoutManager(new LinearLayoutManager(this.a, 0, false));
    }

    private final void o(boolean z) {
        View view0 = this.e;
        if(view0 != null) {
            view0.setVisibility((z ? 0 : 8));
        }
    }
}

