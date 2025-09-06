package com.dcinside.app.write.menu.series;

import A3.p;
import A3.q;
import Y.h0;
import Z.c;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.archive.main.PostArchiveSeriesActivity;
import com.dcinside.app.base.g;
import com.dcinside.app.history.PostHistoryActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.Q;
import com.dcinside.app.realm.d0;
import com.dcinside.app.realm.g0;
import com.dcinside.app.rx.bus.j0;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.Yk;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.leinardi.android.speeddial.FabWithLabelView;
import com.leinardi.android.speeddial.SpeedDialActionItem;
import com.leinardi.android.speeddial.SpeedDialView;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.T0;
import io.realm.g1;
import io.realm.r1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nSeriesManageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeriesManageActivity.kt\ncom/dcinside/app/write/menu/series/SeriesManageActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Uri.kt\nandroidx/core/net/UriKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n+ 8 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 9 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,753:1\n39#2:754\n55#2,12:755\n84#2,3:767\n60#3:770\n1#4:771\n1#4:794\n1#4:810\n1557#5:772\n1628#5,2:773\n1630#5:776\n774#5:777\n865#5,2:778\n1872#5,3:781\n1611#5,9:784\n1863#5:793\n1864#5:795\n1620#5:796\n1872#5,3:797\n1611#5,9:800\n1863#5:809\n1864#5:811\n1620#5:812\n1557#5:833\n1628#5,3:834\n29#6:775\n255#7:780\n192#8,7:813\n177#8,9:824\n11102#9:820\n11437#9,3:821\n*S KotlinDebug\n*F\n+ 1 SeriesManageActivity.kt\ncom/dcinside/app/write/menu/series/SeriesManageActivity\n*L\n152#1:754\n152#1:755,12\n152#1:767,3\n273#1:770\n582#1:794\n593#1:810\n397#1:772\n397#1:773,2\n397#1:776\n421#1:777\n421#1:778,2\n576#1:781,3\n582#1:784,9\n582#1:793\n582#1:795\n582#1:796\n587#1:797,3\n593#1:800,9\n593#1:809\n593#1:811\n593#1:812\n364#1:833\n364#1:834,3\n403#1:775\n452#1:780\n626#1:813,7\n343#1:824,9\n370#1:820\n370#1:821,3\n*E\n"})
public final class SeriesManageActivity extends g implements a {
    @s0({"SMAP\nSeriesManageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeriesManageActivity.kt\ncom/dcinside/app/write/menu/series/SeriesManageActivity$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,753:1\n1#2:754\n*E\n"})
    public static final class com.dcinside.app.write.menu.series.SeriesManageActivity.a {
        private com.dcinside.app.write.menu.series.SeriesManageActivity.a() {
        }

        public com.dcinside.app.write.menu.series.SeriesManageActivity.a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0, @m ActivityResultLauncher activityResultLauncher0, @m Long long0) {
            L.p(appCompatActivity0, "activity");
            Intent intent0 = new Intent(appCompatActivity0, SeriesManageActivity.class);
            if(long0 != null) {
                intent0.putExtra("extra_series_number", long0.longValue());
            }
            if(activityResultLauncher0 != null) {
                activityResultLauncher0.b(intent0);
            }
        }

        public final void b(@l AppCompatActivity appCompatActivity0, @m ActivityResultLauncher activityResultLauncher0, @m String s, @m String s1) {
            L.p(appCompatActivity0, "activity");
            Intent intent0 = new Intent(appCompatActivity0, SeriesManageActivity.class);
            if(s1 != null) {
                intent0.putExtra("extra_series_json_data", s1);
            }
            if(s != null) {
                intent0.putExtra("extra_series_html_data", s);
            }
            if(activityResultLauncher0 != null) {
                activityResultLauncher0.b(intent0);
            }
        }

        public static void c(com.dcinside.app.write.menu.series.SeriesManageActivity.a seriesManageActivity$a0, AppCompatActivity appCompatActivity0, ActivityResultLauncher activityResultLauncher0, Long long0, int v, Object object0) {
            if((v & 4) != 0) {
                long0 = null;
            }
            seriesManageActivity$a0.a(appCompatActivity0, activityResultLauncher0, long0);
        }

        public static void d(com.dcinside.app.write.menu.series.SeriesManageActivity.a seriesManageActivity$a0, AppCompatActivity appCompatActivity0, ActivityResultLauncher activityResultLauncher0, String s, String s1, int v, Object object0) {
            if((v & 4) != 0) {
                s = null;
            }
            if((v & 8) != 0) {
                s1 = null;
            }
            seriesManageActivity$a0.b(appCompatActivity0, activityResultLauncher0, s, s1);
        }
    }

    public static final class b {
        @l
        private final String a;
        private final int b;
        @l
        private final String c;

        public b(@l String s, int v, @l String s1) {
            L.p(s, "galleryId");
            L.p(s1, "subject");
            super();
            this.a = s;
            this.b = v;
            this.c = s1;
        }

        @l
        public final String a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        @l
        public final String c() {
            return this.c;
        }

        @l
        public final b d(@l String s, int v, @l String s1) {
            L.p(s, "galleryId");
            L.p(s1, "subject");
            return new b(s, v, s1);
        }

        public static b e(b seriesManageActivity$b0, String s, int v, String s1, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = seriesManageActivity$b0.a;
            }
            if((v1 & 2) != 0) {
                v = seriesManageActivity$b0.b;
            }
            if((v1 & 4) != 0) {
                s1 = seriesManageActivity$b0.c;
            }
            return seriesManageActivity$b0.d(s, v, s1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof b)) {
                return false;
            }
            if(!L.g(this.a, ((b)object0).a)) {
                return false;
            }
            return this.b == ((b)object0).b ? L.g(this.c, ((b)object0).c) : false;
        }

        @l
        public final String f() {
            return this.a;
        }

        public final int g() {
            return this.b;
        }

        @l
        public final String h() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return (this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "HtmlSeriesData(galleryId=" + this.a + ", postNumber=" + this.b + ", subject=" + this.c + ")";
        }
    }

    @m
    private o A;
    @m
    private ItemTouchHelper B;
    @m
    private g0 C;
    @m
    private ActivityResultLauncher D;
    @l
    public static final com.dcinside.app.write.menu.series.SeriesManageActivity.a E = null;
    @l
    public static final String F = "extra_series_html_data";
    @l
    public static final String G = "extra_series_json_data";
    @l
    public static final String H = "extra_series_number";
    @l
    public static final String I = "extra_post_append_mode_type";
    @l
    public static final String J = "extra_post_append_list";
    @l
    public static final String K = "type_post_archive";
    @l
    public static final String L = "type_post_history";
    private h0 w;
    @l
    private final E x;
    @m
    private e y;
    @m
    private rx.subscriptions.b z;

    static {
        SeriesManageActivity.E = new com.dcinside.app.write.menu.series.SeriesManageActivity.a(null);
    }

    public SeriesManageActivity() {
        this.x = new E();
    }

    // 检测为 Lambda 实现
    private static final void A2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void B2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void C2(SeriesManageActivity seriesManageActivity0, Throwable throwable0) [...]

    private final void D2() {
        @f(c = "com.dcinside.app.write.menu.series.SeriesManageActivity$initStyleFloatingActionButton$1$8", f = "SeriesManageActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nSeriesManageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeriesManageActivity.kt\ncom/dcinside/app/write/menu/series/SeriesManageActivity$initStyleFloatingActionButton$1$8\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,753:1\n255#2:754\n*S KotlinDebug\n*F\n+ 1 SeriesManageActivity.kt\ncom/dcinside/app/write/menu/series/SeriesManageActivity$initStyleFloatingActionButton$1$8\n*L\n231#1:754\n*E\n"})
        static final class com.dcinside.app.write.menu.series.SeriesManageActivity.g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final SeriesManageActivity l;
            final SpeedDialView m;

            com.dcinside.app.write.menu.series.SeriesManageActivity.g(SeriesManageActivity seriesManageActivity0, SpeedDialView speedDialView0, d d0) {
                this.l = seriesManageActivity0;
                this.m = speedDialView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.write.menu.series.SeriesManageActivity.g(this.l, this.m, d0).invokeSuspend(S0.a);
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
                h0 h00 = this.l.w;
                if(h00 == null) {
                    L.S("binding");
                    h00 = null;
                }
                L.o(h00.b, "progressWrap");
                if(h00.b.getVisibility() == 0) {
                    return S0.a;
                }
                if(this.m.s()) {
                    this.m.i();
                    return S0.a;
                }
                if(((Boolean)this.l.r2().e()).booleanValue()) {
                    this.m.t();
                    FloatingActionButton floatingActionButton0 = this.m.getMainFab();
                    if(floatingActionButton0 != null) {
                        floatingActionButton0.requestFocus();
                        return S0.a;
                    }
                }
                else {
                    this.l.Y2();
                }
                return S0.a;
            }
        }

        h0 h00 = this.w;
        if(h00 == null) {
            L.S("binding");
            h00 = null;
        }
        SpeedDialView speedDialView0 = h00.d;
        ColorStateList colorStateList0 = ContextCompat.getColorStateList(this, 0x7F0605B8);  // color:white
        L.o("URL 입력", "getString(...)");
        FabWithLabelView fabWithLabelView0 = speedDialView0.d(this.t2(0x7F0B0E09, 0x7F0802F5, "URL 입력"));  // id:series_add_url
        if(fabWithLabelView0 != null) {
            CardView cardView0 = (CardView)fabWithLabelView0.findViewById(0x7F0B0DCA);  // id:sd_label_container
            if(cardView0 != null) {
                L.m(cardView0);
                cardView0.setUseCompatPadding(false);
                cardView0.h(0, 0, 0, 0);
            }
        }
        if(fabWithLabelView0 != null) {
            FloatingActionButton floatingActionButton0 = (FloatingActionButton)fabWithLabelView0.findViewById(0x7F0B0DC7);  // id:sd_fab
            if(floatingActionButton0 != null) {
                L.m(floatingActionButton0);
                floatingActionButton0.setBackgroundTintList(colorStateList0);
                floatingActionButton0.setUseCompatPadding(false);
            }
        }
        if(fabWithLabelView0 != null) {
            fabWithLabelView0.setPadding(0, 0, 0, 0);
        }
        L.o("최근 본 글", "getString(...)");
        FabWithLabelView fabWithLabelView1 = speedDialView0.d(this.t2(0x7F0B0E07, 0x7F0802CE, "최근 본 글"));  // id:series_add_recent_post
        if(fabWithLabelView1 != null) {
            CardView cardView1 = (CardView)fabWithLabelView1.findViewById(0x7F0B0DCA);  // id:sd_label_container
            if(cardView1 != null) {
                L.m(cardView1);
                cardView1.setUseCompatPadding(false);
                cardView1.h(0, 0, 0, 0);
            }
        }
        if(fabWithLabelView1 != null) {
            FloatingActionButton floatingActionButton1 = (FloatingActionButton)fabWithLabelView1.findViewById(0x7F0B0DC7);  // id:sd_fab
            if(floatingActionButton1 != null) {
                L.m(floatingActionButton1);
                floatingActionButton1.setBackgroundTintList(colorStateList0);
                floatingActionButton1.setUseCompatPadding(false);
            }
        }
        if(fabWithLabelView1 != null) {
            fabWithLabelView1.setPadding(0, 0, 0, 0);
        }
        L.o("글 보관함", "getString(...)");
        FabWithLabelView fabWithLabelView2 = speedDialView0.d(this.t2(0x7F0B0E04, 0x7F08022B, "글 보관함"));  // id:series_add_archive
        if(fabWithLabelView2 != null) {
            CardView cardView2 = (CardView)fabWithLabelView2.findViewById(0x7F0B0DCA);  // id:sd_label_container
            if(cardView2 != null) {
                L.m(cardView2);
                cardView2.setUseCompatPadding(false);
                cardView2.h(0, 0, 0, 0);
            }
        }
        if(fabWithLabelView2 != null) {
            FloatingActionButton floatingActionButton2 = (FloatingActionButton)fabWithLabelView2.findViewById(0x7F0B0DC7);  // id:sd_fab
            if(floatingActionButton2 != null) {
                L.m(floatingActionButton2);
                floatingActionButton2.setBackgroundTintList(colorStateList0);
                floatingActionButton2.setUseCompatPadding(false);
            }
        }
        if(fabWithLabelView2 != null) {
            fabWithLabelView2.setPadding(0, 0, 0, 0);
        }
        speedDialView0.setOnActionSelectedListener((SpeedDialActionItem speedDialActionItem0) -> {
            L.p(this, "this$0");
            L.m(speedDialActionItem0);
            return this.N2(speedDialActionItem0);
        });
        FloatingActionButton floatingActionButton3 = speedDialView0.getMainFab();
        L.o(floatingActionButton3, "getMainFab(...)");
        r.M(floatingActionButton3, null, new com.dcinside.app.write.menu.series.SeriesManageActivity.g(this, speedDialView0, null), 1, null);
    }

    // 检测为 Lambda 实现
    private static final boolean E2(SeriesManageActivity seriesManageActivity0, SpeedDialActionItem speedDialActionItem0) [...]

    private final void F2() {
        @s0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 SeriesManageActivity.kt\ncom/dcinside/app/write/menu/series/SeriesManageActivity\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,82:1\n63#2:83\n59#3:84\n153#4:85\n154#4,2:88\n257#5,2:86\n*S KotlinDebug\n*F\n+ 1 SeriesManageActivity.kt\ncom/dcinside/app/write/menu/series/SeriesManageActivity\n*L\n153#1:86,2\n*E\n"})
        public static final class h implements TextWatcher {
            final SeriesManageActivity a;

            public h(SeriesManageActivity seriesManageActivity0) {
                this.a = seriesManageActivity0;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
                h0 h00 = this.a.w;
                if(h00 == null) {
                    L.S("binding");
                    h00 = null;
                }
                L.o(h00.p, "seriesManageSubjectClearIcon");
                h00.p.setVisibility(((charSequence0 == null ? 0 : charSequence0.length()) <= 0 ? 0 : 8));
                this.a.X(false);
            }
        }


        @f(c = "com.dcinside.app.write.menu.series.SeriesManageActivity$initView$1", f = "SeriesManageActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nSeriesManageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeriesManageActivity.kt\ncom/dcinside/app/write/menu/series/SeriesManageActivity$initView$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,753:1\n255#2:754\n*S KotlinDebug\n*F\n+ 1 SeriesManageActivity.kt\ncom/dcinside/app/write/menu/series/SeriesManageActivity$initView$1\n*L\n126#1:754\n*E\n"})
        static final class i extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final SeriesManageActivity l;

            i(SeriesManageActivity seriesManageActivity0, d d0) {
                this.l = seriesManageActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new i(this.l, d0).invokeSuspend(S0.a);
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
                h0 h00 = this.l.w;
                if(h00 == null) {
                    L.S("binding");
                    h00 = null;
                }
                L.o(h00.b, "progressWrap");
                if(h00.b.getVisibility() == 0) {
                    return S0.a;
                }
                this.l.getIntent().putExtra("extra_series_number", this.l.T2());
                Long long0 = kotlin.coroutines.jvm.internal.b.g(this.l.getIntent().getLongExtra("extra_series_number", -1L));
                g0 g00 = g0.g.f(long0);
                this.l.C = g00;
                Dl.D(this.l, 0x7F150946);  // string:series_is_saved "시리즈가 저장되었습니다."
                this.l.X(false);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.series.SeriesManageActivity$initView$2", f = "SeriesManageActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class j extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final SeriesManageActivity l;

            j(SeriesManageActivity seriesManageActivity0, d d0) {
                this.l = seriesManageActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new j(this.l, d0).invokeSuspend(S0.a);
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
                this.l.q2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.series.SeriesManageActivity$initView$3", f = "SeriesManageActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class k extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final SeriesManageActivity l;

            k(SeriesManageActivity seriesManageActivity0, d d0) {
                this.l = seriesManageActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new k(this.l, d0).invokeSuspend(S0.a);
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
                this.l.p2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.series.SeriesManageActivity$initView$4", f = "SeriesManageActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.series.SeriesManageActivity.l extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final SeriesManageActivity l;

            com.dcinside.app.write.menu.series.SeriesManageActivity.l(SeriesManageActivity seriesManageActivity0, d d0) {
                this.l = seriesManageActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.write.menu.series.SeriesManageActivity.l(this.l, d0).invokeSuspend(S0.a);
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
                this.l.s2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.series.SeriesManageActivity$initView$8", f = "SeriesManageActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.series.SeriesManageActivity.m extends kotlin.coroutines.jvm.internal.o implements q {
            int k;
            boolean l;
            final SeriesManageActivity m;

            com.dcinside.app.write.menu.series.SeriesManageActivity.m(SeriesManageActivity seriesManageActivity0, d d0) {
                this.m = seriesManageActivity0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((View)object1), ((Boolean)object2).booleanValue(), ((d)object3));
            }

            @m
            public final Object a(@l O o0, @l View view0, boolean z, @m d d0) {
                com.dcinside.app.write.menu.series.SeriesManageActivity.m seriesManageActivity$m0 = new com.dcinside.app.write.menu.series.SeriesManageActivity.m(this.m, d0);
                seriesManageActivity$m0.l = z;
                return seriesManageActivity$m0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                if(this.l) {
                    this.m.u2(true);
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.series.SeriesManageActivity$initView$9", f = "SeriesManageActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class n extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final SeriesManageActivity l;

            n(SeriesManageActivity seriesManageActivity0, d d0) {
                this.l = seriesManageActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new n(this.l, d0).invokeSuspend(S0.a);
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
                this.l.u2(false);
                return S0.a;
            }
        }

        this.D2();
        h0 h00 = this.w;
        h0 h01 = null;
        if(h00 == null) {
            L.S("binding");
            h00 = null;
        }
        L.o(h00.n, "seriesManageSave");
        i seriesManageActivity$i0 = new i(this, null);
        r.M(h00.n, null, seriesManageActivity$i0, 1, null);
        h0 h02 = this.w;
        if(h02 == null) {
            L.S("binding");
            h02 = null;
        }
        L.o(h02.o, "seriesManageSort");
        j seriesManageActivity$j0 = new j(this, null);
        r.M(h02.o, null, seriesManageActivity$j0, 1, null);
        h0 h03 = this.w;
        if(h03 == null) {
            L.S("binding");
            h03 = null;
        }
        L.o(h03.f, "seriesManageApply");
        k seriesManageActivity$k0 = new k(this, null);
        r.M(h03.f, null, seriesManageActivity$k0, 1, null);
        h0 h04 = this.w;
        if(h04 == null) {
            L.S("binding");
            h04 = null;
        }
        L.o(h04.p, "seriesManageSubjectClearIcon");
        com.dcinside.app.write.menu.series.SeriesManageActivity.l seriesManageActivity$l0 = new com.dcinside.app.write.menu.series.SeriesManageActivity.l(this, null);
        r.M(h04.p, null, seriesManageActivity$l0, 1, null);
        this.x.C(this);
        h0 h05 = this.w;
        if(h05 == null) {
            L.S("binding");
            h05 = null;
        }
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        h05.l.setLayoutManager(nonPredictiveLayoutManager0);
        h05.l.setAdapter(this.x);
        int v = 0;
        h05.l.setVisibility(0);
        ItemTouchHelper itemTouchHelper0 = new ItemTouchHelper(new c(this.x, false));
        this.B = itemTouchHelper0;
        h0 h06 = this.w;
        if(h06 == null) {
            L.S("binding");
            h06 = null;
        }
        itemTouchHelper0.m(h06.l);
        h0 h07 = this.w;
        if(h07 == null) {
            L.S("binding");
            h07 = null;
        }
        ConstraintLayout constraintLayout0 = h07.g;
        if(this.x.getItemCount() > 0) {
            v = 8;
        }
        constraintLayout0.setVisibility(v);
        h0 h08 = this.w;
        if(h08 == null) {
            L.S("binding");
            h08 = null;
        }
        L.o(h08.q, "seriesManageSubjectInput");
        h seriesManageActivity$h0 = new h(this);
        h08.q.addTextChangedListener(seriesManageActivity$h0);
        h0 h09 = this.w;
        if(h09 == null) {
            L.S("binding");
            h09 = null;
        }
        u u0 = (TextView textView0, int v, KeyEvent keyEvent0) -> {
            L.p(this, "this$0");
            if(v == 6) {
                this.u2(false);
            }
            return true;
        };
        h09.q.setOnEditorActionListener(u0);
        h0 h010 = this.w;
        if(h010 == null) {
            L.S("binding");
            h010 = null;
        }
        L.o(h010.q, "seriesManageSubjectInput");
        com.dcinside.app.write.menu.series.SeriesManageActivity.m seriesManageActivity$m0 = new com.dcinside.app.write.menu.series.SeriesManageActivity.m(this, null);
        r.P(h010.q, null, seriesManageActivity$m0, 1, null);
        h0 h011 = this.w;
        if(h011 == null) {
            L.S("binding");
            h011 = null;
        }
        L.o(h011.i, "seriesManageKeyboardHide");
        n seriesManageActivity$n0 = new n(this, null);
        r.M(h011.i, null, seriesManageActivity$n0, 1, null);
        h0 h012 = this.w;
        if(h012 == null) {
            L.S("binding");
            h012 = null;
        }
        ImageView imageView0 = h012.o;
        L.o(imageView0, "seriesManageSort");
        h0 h013 = this.w;
        if(h013 == null) {
            L.S("binding");
        }
        else {
            h01 = h013;
        }
        h01.o.setSelected(true);
        imageView0.setImageResource((imageView0.isSelected() ? 0x7F0802EB : 0x7F0802EC));  // drawable:ic_sort_forward
    }

    // 检测为 Lambda 实现
    private static final boolean G2(SeriesManageActivity seriesManageActivity0, TextView textView0, int v, KeyEvent keyEvent0) [...]

    private final boolean H2(boolean z) {
        if(this.C != null) {
            ArrayList arrayList0 = this.x.z();
            int v = arrayList0.size();
            h0 h00 = this.w;
            T0 t00 = null;
            if(h00 == null) {
                L.S("binding");
                h00 = null;
            }
            String s = h00.q.getText().toString();
            if(z && v <= 0) {
                return false;
            }
            g0 g00 = this.C;
            if(g00 != null) {
                T0 t01 = g00.R5();
                if(t01 == null || v != t01.size() || !L.g(s, (this.C == null ? null : this.C.S5()))) {
                    return true;
                }
                com.dcinside.app.realm.g0.a g0$a0 = g0.g;
                g0 g01 = this.C;
                if(g01 != null) {
                    t00 = g01.R5();
                }
                return g0$a0.h(t00, arrayList0);
            }
            return true;
        }
        return this.x.getItemCount() > 0;
    }

    private final rx.g I2(String s) {
        @s0({"SMAP\nSeriesManageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeriesManageActivity.kt\ncom/dcinside/app/write/menu/series/SeriesManageActivity$loadSeriesFromHtml$1$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,753:1\n1557#2:754\n1628#2,3:755\n*S KotlinDebug\n*F\n+ 1 SeriesManageActivity.kt\ncom/dcinside/app/write/menu/series/SeriesManageActivity$loadSeriesFromHtml$1$3\n*L\n373#1:754\n373#1:755,3\n*E\n"})
        static final class com.dcinside.app.write.menu.series.SeriesManageActivity.o extends N implements Function1 {
            final String e;

            com.dcinside.app.write.menu.series.SeriesManageActivity.o(String s) {
                this.e = s;
                super(1);
            }

            public final g0 a(List list0) {
                T0 t00 = new T0();
                L.m(list0);
                ArrayList arrayList0 = new ArrayList(kotlin.collections.u.b0(list0, 10));
                for(Object object0: list0) {
                    com.dcinside.app.realm.h0 h00 = new com.dcinside.app.realm.h0();
                    h00.X5(((Q)object0).G0());
                    h00.Y5(((Q)object0).H0());
                    h00.a6(String.valueOf(((Q)object0).c1()));
                    h00.c6(((Q)object0).k1());
                    h00.Z5(((Q)object0).X0());
                    String s = ((Q)object0).D0();
                    if(s == null) {
                        s = "";
                    }
                    Date date0 = Bk.h(s);
                    h00.d6((date0 == null ? System.currentTimeMillis() : date0.getTime()));
                    h00.b6(System.currentTimeMillis());
                    arrayList0.add(h00);
                }
                t00.addAll(arrayList0);
                g0 g00 = new g0();
                g00.V5(this.e);
                g00.U5(t00);
                return g00;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }


        static final class com.dcinside.app.write.menu.series.SeriesManageActivity.p extends N implements Function1 {
            final b e;

            com.dcinside.app.write.menu.series.SeriesManageActivity.p(b seriesManageActivity$b0) {
                this.e = seriesManageActivity$b0;
                super(1);
            }

            public final Q a(Throwable throwable0) {
                String s = this.e.f();
                int v = this.e.g();
                return new Q(null, this.e.h(), 0, v, null, null, false, 0, null, null, null, null, 0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, 0, null, null, null, null, null, null, 0, 0, 0, null, null, null, false, null, null, null, false, false, false, false, false, false, null, null, false, false, null, null, false, false, false, s, null, null, null, 0L, false, null, -11, 0xFBFFFFFF, 1, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }

        rx.g g0 = rx.g.v1(new t(this, s));
        L.o(g0, "defer(...)");
        return g0;
    }

    private static final rx.g J2(SeriesManageActivity seriesManageActivity0, String s) {
        CharSequence charSequence0;
        org.jsoup.nodes.o o0;
        org.jsoup.nodes.f f0;
        L.p(seriesManageActivity0, "this$0");
        L.p(s, "$html");
        try {
            f0 = null;
            f0 = org.jsoup.g.m(s);
        }
        catch(Exception unused_ex) {
        }
        if(f0 == null) {
            o0 = null;
        }
        else {
            org.jsoup.select.e e0 = f0.E1("dc_series");
            o0 = e0 == null ? null : e0.u();
        }
        if(o0 == null) {
            charSequence0 = null;
        }
        else {
            org.jsoup.select.e e1 = o0.S0();
            if(e1 == null) {
                charSequence0 = null;
            }
            else {
                org.jsoup.nodes.o o1 = e1.u();
                if(o1 == null) {
                    charSequence0 = null;
                }
                else {
                    String s1 = o1.S2();
                    if(s1 == null) {
                        charSequence0 = null;
                    }
                    else {
                        String s2 = v.l2(s1, "[시리즈]", "", false, 4, null);
                        charSequence0 = s2 == null ? null : v.G5(s2).toString();
                    }
                }
            }
        }
        if(f0 != null && charSequence0 != null && charSequence0.length() != 0) {
            org.jsoup.select.e e2 = o0.I1("a");
            L.o(e2, "getElementsByTag(...)");
            List list0 = seriesManageActivity0.Q2(e2);
            if(list0.isEmpty()) {
                g0 g00 = new g0();
                g00.V5(((String)charSequence0));
                return rx.g.Q2(g00);
            }
            ArrayList arrayList0 = new ArrayList(kotlin.collections.u.b0(list0, 10));
            for(Object object0: list0) {
                arrayList0.add(uk.iG(((b)object0).f(), ((b)object0).g(), "", null).a4((Object object0) -> {
                    L.p(new com.dcinside.app.write.menu.series.SeriesManageActivity.p(((b)object0)), "$tmp0");
                    return (Q)new com.dcinside.app.write.menu.series.SeriesManageActivity.p(((b)object0)).invoke(object0);
                }));
            }
            return rx.g.n7(arrayList0, (Object[] arr_object) -> {
                L.m(arr_object);
                List list0 = new ArrayList(arr_object.length);
                for(int v = 0; v < arr_object.length; ++v) {
                    Object object0 = arr_object[v];
                    L.n(object0, "null cannot be cast to non-null type com.dcinside.app.model.PostInfo");
                    list0.add(((Q)object0));
                }
                return list0;
            }).g3((Object object0) -> {
                L.p(new com.dcinside.app.write.menu.series.SeriesManageActivity.o(((String)charSequence0)), "$tmp0");
                return (g0)new com.dcinside.app.write.menu.series.SeriesManageActivity.o(((String)charSequence0)).invoke(object0);
            });
        }
        return rx.g.Q2(new g0());
    }

    // 检测为 Lambda 实现
    private static final Q K2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final List L2(Object[] arr_object) [...]

    // 检测为 Lambda 实现
    private static final g0 M2(Function1 function10, Object object0) [...]

    private final boolean N2(SpeedDialActionItem speedDialActionItem0) {
        switch(speedDialActionItem0.D()) {
            case 0x7F0B0E04: {  // id:series_add_archive
                this.m2();
                return false;
            }
            case 0x7F0B0E07: {  // id:series_add_recent_post
                this.n2();
                return false;
            }
            case 0x7F0B0E09: {  // id:series_add_url
                this.o2();
                return false;
            }
            default: {
                return false;
            }
        }
    }

    private final void O2(boolean z) {
        int v = this.x.getItemCount();
        h0 h00 = this.w;
        h0 h01 = null;
        if(h00 == null) {
            L.S("binding");
            h00 = null;
        }
        int v1 = 8;
        h00.g.setVisibility((v <= 0 ? 0 : 8));
        h0 h02 = this.w;
        if(h02 == null) {
            L.S("binding");
            h02 = null;
        }
        View view0 = h02.k;
        if(v > 0) {
            v1 = 0;
        }
        view0.setVisibility(v1);
        h0 h03 = this.w;
        if(h03 == null) {
            L.S("binding");
            h03 = null;
        }
        String s = v <= 0 ? "글 추가" : this.getString(0x7F150951, new Object[]{v, 50});  // string:series_post_limit_count "%1$d/%2$d"
        h03.j.setText(s);
        if(z) {
            h0 h04 = this.w;
            if(h04 == null) {
                L.S("binding");
                h04 = null;
            }
            if(h04.q.getText().toString().length() == 0) {
                ArrayList arrayList0 = this.x.z();
                if(arrayList0.isEmpty()) {
                    arrayList0 = null;
                }
                if(arrayList0 != null) {
                    com.dcinside.app.realm.h0 h05 = (com.dcinside.app.realm.h0)arrayList0.get(0);
                    if(h05 != null) {
                        String s1 = h05.V5();
                        if(s1 != null) {
                            h0 h06 = this.w;
                            if(h06 == null) {
                                L.S("binding");
                                h06 = null;
                            }
                            h06.q.setText(s1);
                            goto label_43;
                        }
                    }
                }
                return;
            }
        }
    label_43:
        if(v > 1) {
            h0 h07 = this.w;
            if(h07 == null) {
                L.S("binding");
                h07 = null;
            }
            h07.o.setEnabled(true);
            h0 h08 = this.w;
            if(h08 == null) {
                L.S("binding");
            }
            else {
                h01 = h08;
            }
            h01.o.setAlpha(1.0f);
            return;
        }
        h0 h09 = this.w;
        if(h09 == null) {
            L.S("binding");
            h09 = null;
        }
        h09.o.setEnabled(false);
        h0 h010 = this.w;
        if(h010 == null) {
            L.S("binding");
        }
        else {
            h01 = h010;
        }
        h01.o.setAlpha(0.3f);
    }

    public final void P2(@l ViewHolder recyclerView$ViewHolder0) {
        L.p(recyclerView$ViewHolder0, "holder");
        ItemTouchHelper itemTouchHelper0 = this.B;
        if(itemTouchHelper0 != null) {
            itemTouchHelper0.H(recyclerView$ViewHolder0);
        }
    }

    private final List Q2(List list0) {
        b seriesManageActivity$b0;
        ArrayList arrayList0 = new ArrayList(kotlin.collections.u.b0(list0, 10));
        for(Object object0: list0) {
            org.jsoup.nodes.o o0 = (org.jsoup.nodes.o)object0;
            String s = o0.g("href");
            int v = 0;
            if(s == null || v.x3(s)) {
                seriesManageActivity$b0 = new b("", 0, "");
            }
            else {
                String s1 = o0.S2();
                L.o(s1, "text(...)");
                String s2 = v.G5(v.l2(s1, "·", "", false, 4, null)).toString();
                L.m(s);
                Uri uri0 = Uri.parse(s);
                int v1 = Yk.m.match(uri0);
                com.dcinside.app.main.a.a a$a0 = com.dcinside.app.main.a.a.e(uri0, v1);
                String s3 = a$a0.g();
                String s4 = a$a0.i();
                if(s3 == null || s3.length() <= 0 || s4 == null || s4.length() <= 0) {
                    seriesManageActivity$b0 = new b("", 0, s2);
                }
                else {
                    Integer integer0 = v.b1(s4);
                    if(integer0 != null) {
                        v = (int)integer0;
                    }
                    seriesManageActivity$b0 = new b(s3, v, s2);
                }
            }
            arrayList0.add(seriesManageActivity$b0);
        }
        List list1 = new ArrayList();
        for(Object object1: arrayList0) {
            if(((b)object1).f().length() > 0) {
                list1.add(object1);
            }
        }
        return list1;
    }

    private final void R2(ArrayList arrayList0, String s) {
        g1 g11;
        g1 g10;
        ArrayList arrayList1 = new ArrayList();
        h0 h00 = null;
        if(L.g(s, "type_post_archive")) {
            ArrayList arrayList2 = new ArrayList();
            F0 f00 = this.F1();
            if(f00 == null) {
                g10 = null;
            }
            else {
                RealmQuery realmQuery0 = f00.C4(d0.class);
                if(realmQuery0 == null) {
                    g10 = null;
                }
                else {
                    RealmQuery realmQuery1 = realmQuery0.g2("time", r1.c);
                    g10 = realmQuery1 == null ? null : realmQuery1.p0();
                }
            }
            if(g10 != null) {
                int v = 0;
                for(Object object0: g10) {
                    if(v < 0) {
                        kotlin.collections.u.Z();
                    }
                    String s1 = ((d0)object0).W5();
                    if(s1 != null && kotlin.collections.u.W1(arrayList0, ((d0)object0).W5())) {
                        arrayList2.add(d0.m.a(s1, v));
                    }
                    ++v;
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for(Object object1: arrayList2) {
                com.dcinside.app.realm.h0 h01 = (com.dcinside.app.realm.h0)object1;
                if(h01 != null) {
                    arrayList3.add(h01);
                }
            }
            arrayList1.addAll(arrayList3);
            goto label_75;
        }
        else if(L.g(s, "type_post_history")) {
            ArrayList arrayList4 = new ArrayList();
            F0 f01 = this.F1();
            if(f01 == null) {
                g11 = null;
            }
            else {
                RealmQuery realmQuery2 = f01.C4(com.dcinside.app.realm.f0.class);
                if(realmQuery2 == null) {
                    g11 = null;
                }
                else {
                    RealmQuery realmQuery3 = realmQuery2.g2("time", r1.c);
                    g11 = realmQuery3 == null ? null : realmQuery3.p0();
                }
            }
            if(g11 != null) {
                int v1 = 0;
                for(Object object2: g11) {
                    if(v1 < 0) {
                        kotlin.collections.u.Z();
                    }
                    String s2 = ((com.dcinside.app.realm.f0)object2).a6();
                    if(s2 != null && kotlin.collections.u.W1(arrayList0, ((com.dcinside.app.realm.f0)object2).a6())) {
                        arrayList4.add(com.dcinside.app.realm.f0.t.a(s2, v1));
                    }
                    ++v1;
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for(Object object3: arrayList4) {
                com.dcinside.app.realm.h0 h02 = (com.dcinside.app.realm.h0)object3;
                if(h02 != null) {
                    arrayList5.add(h02);
                }
            }
            arrayList1.addAll(arrayList5);
        label_75:
            this.x.w(arrayList1);
            h0 h03 = this.w;
            if(h03 == null) {
                L.S("binding");
            }
            else {
                h00 = h03;
            }
            h00.l.scrollToPosition(0);
        }
    }

    private final void S2(j0 j00) {
        Q q0 = j00.a();
        com.dcinside.app.realm.h0 h00 = new com.dcinside.app.realm.h0();
        h00.X5(q0.G0());
        h00.Y5(q0.H0());
        h00.Z5(q0.X0());
        h00.a6(String.valueOf(q0.c1()));
        h00.c6(q0.k1());
        Date date0 = Bk.h((q0.D0() == null ? "" : q0.D0()));
        h00.d6((date0 == null ? 0L : date0.getTime()));
        h00.b6(System.currentTimeMillis());
        e e0 = this.y;
        if(e0 != null) {
            e0.dismissAllowingStateLoss();
        }
        this.x.v(h00);
        h0 h01 = this.w;
        if(h01 == null) {
            L.S("binding");
            h01 = null;
        }
        h01.l.scrollToPosition(0);
    }

    private final long T2() {
        String s2;
        String s1;
        ArrayList arrayList0 = this.x.z();
        h0 h00 = this.w;
        Long long0 = null;
        if(h00 == null) {
            L.S("binding");
            h00 = null;
        }
        String s = h00.q.getText().toString();
        if(s.length() == 0) {
            ArrayList arrayList1 = arrayList0.size() <= 0 ? null : arrayList0;
            if(arrayList1 == null) {
                s1 = null;
            }
            else {
                com.dcinside.app.realm.h0 h01 = (com.dcinside.app.realm.h0)arrayList1.get(0);
                s1 = h01 == null ? null : h01.V5();
            }
        }
        else {
            s1 = s;
        }
        if(s1 == null) {
            s2 = null;
        }
        else {
            s2 = s1.substring(0, Math.min(s1.length(), 20));
            L.o(s2, "substring(...)");
        }
        if(!L.g(s, s2)) {
            h0 h02 = this.w;
            if(h02 == null) {
                L.S("binding");
                h02 = null;
            }
            h02.q.setText(s2);
        }
        String s3 = this.getIntent().getStringExtra("extra_series_json_data");
        g0 g00 = (g0)uk.a.r(s3, g0.class);
        if(g00 != null) {
            long0 = g00.Q5();
            return long0 == null ? g0.g.b(s2, arrayList0) : g0.g.i(long0, s2, arrayList0);
        }
        Long long1 = this.getIntent().getLongExtra("extra_series_number", -1L);
        if(long1.longValue() > 0L) {
            long0 = long1;
        }
        return long0 == null ? g0.g.b(s2, arrayList0) : g0.g.i(long0, s2, arrayList0);
    }

    private final void U2(boolean z) {
        @f(c = "com.dcinside.app.write.menu.series.SeriesManageActivity$setLoading$1", f = "SeriesManageActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nSeriesManageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeriesManageActivity.kt\ncom/dcinside/app/write/menu/series/SeriesManageActivity$setLoading$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,753:1\n257#2,2:754\n*S KotlinDebug\n*F\n+ 1 SeriesManageActivity.kt\ncom/dcinside/app/write/menu/series/SeriesManageActivity$setLoading$1\n*L\n266#1:754,2\n*E\n"})
        static final class com.dcinside.app.write.menu.series.SeriesManageActivity.q extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final SeriesManageActivity l;
            final boolean m;

            com.dcinside.app.write.menu.series.SeriesManageActivity.q(SeriesManageActivity seriesManageActivity0, boolean z, d d0) {
                this.l = seriesManageActivity0;
                this.m = z;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.dcinside.app.write.menu.series.SeriesManageActivity.q(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.write.menu.series.SeriesManageActivity.q)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                h0 h00 = this.l.w;
                if(h00 == null) {
                    L.S("binding");
                    h00 = null;
                }
                L.o(h00.b, "progressWrap");
                h00.b.setVisibility((this.m ? 0 : 8));
                return S0.a;
            }
        }

        kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), kotlinx.coroutines.h0.e(), null, new com.dcinside.app.write.menu.series.SeriesManageActivity.q(this, z, null), 2, null);
    }

    private final void V2() {
        static final class com.dcinside.app.write.menu.series.SeriesManageActivity.r extends N implements Function1 {
            public static final com.dcinside.app.write.menu.series.SeriesManageActivity.r e;

            static {
                com.dcinside.app.write.menu.series.SeriesManageActivity.r.e = new com.dcinside.app.write.menu.series.SeriesManageActivity.r();
            }

            com.dcinside.app.write.menu.series.SeriesManageActivity.r() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F15094F);  // string:series_post_exit_alert "시리즈 만들기를 취소하시겠습니까? 작성 중인 내용은 저장되지 않습니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class s extends N implements Function1 {
            public static final s e;

            static {
                s.e = new s();
            }

            s() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class com.dcinside.app.write.menu.series.SeriesManageActivity.t extends N implements Function1 {
            final SeriesManageActivity e;

            com.dcinside.app.write.menu.series.SeriesManageActivity.t(SeriesManageActivity seriesManageActivity0) {
                this.e = seriesManageActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.finish();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.e.a(this).n(com.dcinside.app.write.menu.series.SeriesManageActivity.r.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(s.e, "$tmp0");
            return (Boolean)s.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.series.SeriesManageActivity.t(this), "$tmp0");
            new com.dcinside.app.write.menu.series.SeriesManageActivity.t(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean W2(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.write.menu.series.E$a
    public void X(boolean z) {
        h0 h00 = null;
        if(this.H2(true)) {
            h0 h01 = this.w;
            if(h01 == null) {
                L.S("binding");
                h01 = null;
            }
            h01.n.setAlpha(1.0f);
            h0 h02 = this.w;
            if(h02 == null) {
                L.S("binding");
            }
            else {
                h00 = h02;
            }
            h00.n.setEnabled(true);
        }
        else {
            h0 h03 = this.w;
            if(h03 == null) {
                L.S("binding");
                h03 = null;
            }
            h03.n.setAlpha(0.3f);
            h0 h04 = this.w;
            if(h04 == null) {
                L.S("binding");
            }
            else {
                h00 = h04;
            }
            h00.n.setEnabled(false);
        }
        this.O2(z);
    }

    // 检测为 Lambda 实现
    private static final void X2(Function1 function10, Object object0) [...]

    private final void Y2() {
        static final class com.dcinside.app.write.menu.series.SeriesManageActivity.u extends N implements Function1 {
            final SeriesManageActivity e;

            com.dcinside.app.write.menu.series.SeriesManageActivity.u(SeriesManageActivity seriesManageActivity0) {
                this.e = seriesManageActivity0;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.n(this.e.getString(0x7F150950, new Object[]{50}));  // string:series_post_limit_alert "게시물은 %d개까지만 추가할 수 있습니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }

        com.dcinside.app.perform.e.e.a(this).n(new com.dcinside.app.write.menu.series.SeriesManageActivity.u(this)).z(0x7F15034A).b().t5();  // string:filter_apply "확인"
    }

    private final void m2() {
        V v0 = this.r2();
        if(((Boolean)v0.e()).booleanValue()) {
            Intent intent0 = new Intent(this, PostArchiveSeriesActivity.class);
            intent0.putExtra("PostArchiveSeriesActivity.EXTRA_SERIES_INPUT_MODE", true);
            intent0.putExtra("com.dcinside.app.extra.POST_INPUT_MAXIMUM_COUNT", ((Number)v0.f()).intValue());
            ActivityResultLauncher activityResultLauncher0 = this.D;
            if(activityResultLauncher0 != null) {
                activityResultLauncher0.b(intent0);
            }
        }
    }

    private final void n2() {
        V v0 = this.r2();
        if(((Boolean)v0.e()).booleanValue()) {
            Intent intent0 = new Intent(this, PostHistoryActivity.class);
            intent0.putExtra("com.dcinside.app.extra.POST_HISTORY_EDIT", true);
            intent0.putExtra("com.dcinside.app.extra.POST_INPUT_SERIES", true);
            intent0.putExtra("com.dcinside.app.extra.POST_INPUT_MAXIMUM_COUNT", ((Number)v0.f()).intValue());
            ActivityResultLauncher activityResultLauncher0 = this.D;
            if(activityResultLauncher0 != null) {
                activityResultLauncher0.b(intent0);
            }
        }
    }

    private final void o2() {
        if(((Boolean)this.r2().e()).booleanValue()) {
            FragmentManager fragmentManager0 = this.getSupportFragmentManager();
            L.o(fragmentManager0, "getSupportFragmentManager(...)");
            FragmentFactory fragmentFactory0 = fragmentManager0.G0();
            ClassLoader classLoader0 = e.class.getClassLoader();
            L.m(classLoader0);
            Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.write.menu.series.e");
            if(fragment0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.write.menu.series.SeriesAddPostUrlDialog");
            }
            ((e)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(new V[0], 0))));
            ((e)fragment0).show(fragmentManager0, "com.dcinside.app.write.menu.series.e");
            this.y = (e)fragment0;
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        h0 h00 = h0.c(this.getLayoutInflater());
        L.o(h00, "inflate(...)");
        this.w = h00;
        h0 h01 = null;
        if(h00 == null) {
            L.S("binding");
            h00 = null;
        }
        this.setContentView(h00.b());
        h0 h02 = this.w;
        if(h02 == null) {
            L.S("binding");
        }
        else {
            h01 = h02;
        }
        this.S0(h01.s);
        kr.bhbfhfb.designcompat.a.d(this);
        this.setTitle("시리즈 만들기");
        this.F2();
        this.v2();
        this.y2();
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        rx.subscriptions.b b0 = this.z;
        if(b0 != null) {
            b0.l();
        }
        this.z = null;
        ActivityResultLauncher activityResultLauncher0 = this.D;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.d();
        }
        this.D = null;
        o o0 = this.A;
        if(o0 != null) {
            o0.l();
        }
        this.A = null;
        h0 h00 = this.w;
        if(h00 == null) {
            L.S("binding");
            h00 = null;
        }
        h00.q.setOnFocusChangeListener(null);
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.getOnBackPressedDispatcher().p();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    private final void p2() {
        h0 h00 = this.w;
        String s = null;
        if(h00 == null) {
            L.S("binding");
            h00 = null;
        }
        L.o(h00.b, "progressWrap");
        if(h00.b.getVisibility() == 0) {
            return;
        }
        ArrayList arrayList0 = this.x.z();
        h0 h01 = this.w;
        if(h01 == null) {
            L.S("binding");
            h01 = null;
        }
        String s1 = h01.q.getText().toString();
        if(s1.length() == 0) {
            ArrayList arrayList1 = arrayList0.size() <= 0 ? null : arrayList0;
            if(arrayList1 == null) {
                s1 = null;
            }
            else {
                com.dcinside.app.realm.h0 h02 = (com.dcinside.app.realm.h0)arrayList1.get(0);
                s1 = h02 == null ? null : h02.V5();
            }
        }
        if(s1 != null) {
            s = s1.substring(0, Math.min(s1.length(), 20));
            L.o(s, "substring(...)");
        }
        if((s == null || s.length() == 0) && arrayList0.isEmpty()) {
            com.dcinside.app.internal.c.v(this, 0x7F15094A);  // string:series_need_subject "제목을 입력해 주세요."
            return;
        }
        if(arrayList0.isEmpty()) {
            com.dcinside.app.internal.c.v(this, 0x7F150949);  // string:series_need_post "게시물을 추가해주세요."
            return;
        }
        Intent intent0 = new Intent();
        String s2 = g0.g.c(s, arrayList0);
        String s3 = g0.g.d(s, arrayList0);
        intent0.putExtra("extra_series_html_data", s2);
        intent0.putExtra("extra_series_json_data", s3);
        this.setResult(-1, intent0);
        this.finish();
    }

    private final void q2() {
        h0 h00 = this.w;
        if(h00 == null) {
            L.S("binding");
            h00 = null;
        }
        ImageView imageView0 = h00.o;
        L.o(imageView0, "seriesManageSort");
        if(imageView0.isSelected()) {
            this.x.x(true);
        }
        else {
            this.x.x(false);
        }
        imageView0.setSelected(!imageView0.isSelected());
        imageView0.setImageResource((imageView0.isSelected() ? 0x7F0802EB : 0x7F0802EC));  // drawable:ic_sort_forward
    }

    private final V r2() {
        int v = this.x.getItemCount();
        return v >= 50 ? r0.a(Boolean.FALSE, 0) : r0.a(Boolean.TRUE, ((int)(50 - v)));
    }

    private final void s2() {
        h0 h00 = this.w;
        h0 h01 = null;
        if(h00 == null) {
            L.S("binding");
            h00 = null;
        }
        h00.q.setText(null);
        com.dcinside.app.util.Nk.a nk$a0 = Nk.a;
        h0 h02 = this.w;
        if(h02 == null) {
            L.S("binding");
        }
        else {
            h01 = h02;
        }
        nk$a0.f(h01.q);
    }

    private final SpeedDialActionItem t2(int v, int v1, String s) {
        SpeedDialActionItem speedDialActionItem0 = new com.leinardi.android.speeddial.SpeedDialActionItem.b(v, v1).t(vk.b(this, 0x1010054)).u(vk.b(this, 0x7F04012E)).y(s).B(ContextCompat.getColor(this, 0x7F0605B8)).z(ContextCompat.getColor(this, 0x7F0605A2)).q();  // attr:colorAccent
        L.o(speedDialActionItem0, "create(...)");
        return speedDialActionItem0;
    }

    private final void u2(boolean z) {
        h0 h00 = null;
        if(z) {
            h0 h01 = this.w;
            if(h01 == null) {
                L.S("binding");
            }
            else {
                h00 = h01;
            }
            h00.i.setVisibility(0);
            return;
        }
        h0 h02 = this.w;
        if(h02 == null) {
            L.S("binding");
            h02 = null;
        }
        h02.i.setVisibility(8);
        h0 h03 = this.w;
        if(h03 == null) {
            L.S("binding");
            h03 = null;
        }
        h03.q.clearFocus();
        com.dcinside.app.util.Nk.a nk$a0 = Nk.a;
        h0 h04 = this.w;
        if(h04 == null) {
            L.S("binding");
        }
        else {
            h00 = h04;
        }
        nk$a0.c(h00.q);
    }

    private final void v2() {
        static final class com.dcinside.app.write.menu.series.SeriesManageActivity.c extends N implements Function1 {
            final SeriesManageActivity e;

            com.dcinside.app.write.menu.series.SeriesManageActivity.c(SeriesManageActivity seriesManageActivity0) {
                this.e = seriesManageActivity0;
                super(1);
            }

            public final void a(j0 j00) {
                L.m(j00);
                this.e.S2(j00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((j0)object0));
                return S0.a;
            }
        }


        public static final class com.dcinside.app.write.menu.series.SeriesManageActivity.d extends OnBackPressedCallback {
            final SeriesManageActivity d;

            com.dcinside.app.write.menu.series.SeriesManageActivity.d(SeriesManageActivity seriesManageActivity0) {
                this.d = seriesManageActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                if(this.d.H2(false)) {
                    this.d.V2();
                    return;
                }
                this.d.finish();
            }
        }

        rx.subscriptions.b b0 = this.z;
        if(b0 != null) {
            b0.l();
        }
        this.z = new rx.subscriptions.b();
        o o0 = com.dcinside.app.rx.bus.c.c(this, j0.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.series.SeriesManageActivity.c(this), "$tmp0");
            new com.dcinside.app.write.menu.series.SeriesManageActivity.c(this).invoke(object0);
        });
        rx.subscriptions.b b1 = this.z;
        if(b1 != null) {
            b1.a(o0);
        }
        this.D = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            String s;
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == -1) {
                Intent intent0 = activityResult0.a();
                ArrayList arrayList0 = intent0 == null ? null : intent0.getStringArrayListExtra("extra_post_append_list");
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                }
                Intent intent1 = activityResult0.a();
                if(intent1 == null) {
                    s = "";
                }
                else {
                    s = intent1.getStringExtra("extra_post_append_mode_type");
                    if(s == null) {
                        s = "";
                    }
                }
                this.R2(arrayList0, s);
            }
        });
        this.getOnBackPressedDispatcher().h(new com.dcinside.app.write.menu.series.SeriesManageActivity.d(this));
    }

    // 检测为 Lambda 实现
    private static final void w2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void x2(SeriesManageActivity seriesManageActivity0, ActivityResult activityResult0) [...]

    private final void y2() {
        static final class com.dcinside.app.write.menu.series.SeriesManageActivity.e extends N implements Function1 {
            final SeriesManageActivity e;

            com.dcinside.app.write.menu.series.SeriesManageActivity.e(SeriesManageActivity seriesManageActivity0) {
                this.e = seriesManageActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(Throwable throwable0) {
                Dl.G(this.e, throwable0.getMessage());
                this.e.X(false);
            }
        }


        static final class com.dcinside.app.write.menu.series.SeriesManageActivity.f extends N implements Function1 {
            final SeriesManageActivity e;

            com.dcinside.app.write.menu.series.SeriesManageActivity.f(SeriesManageActivity seriesManageActivity0) {
                this.e = seriesManageActivity0;
                super(1);
            }

            public final void a(g0 g00) {
                this.e.U2(false);
                this.e.x.D(g00.R5());
                h0 h00 = this.e.w;
                if(h00 == null) {
                    L.S("binding");
                    h00 = null;
                }
                String s = g00.S5();
                h00.q.setText(s);
                this.e.X(false);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((g0)object0));
                return S0.a;
            }
        }

        g0 g00;
        if(this.getIntent().hasExtra("extra_series_number")) {
            Long long0 = this.getIntent().getLongExtra("extra_series_number", -1L);
            g00 = g0.g.f(long0);
        }
        else {
            String s = this.getIntent().getStringExtra("extra_series_json_data");
            g00 = g0.g.e(s);
        }
        this.C = g00;
        if(g00 != null) {
            T0 t00 = g00.R5();
            this.x.D(t00);
            h0 h00 = this.w;
            if(h00 == null) {
                L.S("binding");
                h00 = null;
            }
            String s1 = g00.S5();
            h00.q.setText(s1);
            return;
        }
        if(this.getIntent().hasExtra("extra_series_html_data")) {
            String s2 = this.getIntent().getStringExtra("extra_series_html_data");
            if(s2 == null) {
                s2 = "";
            }
            if(s2.length() == 0) {
                return;
            }
            this.A = this.I2(s2).M3(rx.android.schedulers.a.c()).R1(() -> {
                L.p(this, "this$0");
                this.U2(true);
            }).O1((Object object0) -> {
                L.p(new com.dcinside.app.write.menu.series.SeriesManageActivity.e(this), "$tmp0");
                new com.dcinside.app.write.menu.series.SeriesManageActivity.e(this).invoke(object0);
            }).y5((Object object0) -> {
                L.p(new com.dcinside.app.write.menu.series.SeriesManageActivity.f(this), "$tmp0");
                new com.dcinside.app.write.menu.series.SeriesManageActivity.f(this).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                this.U2(false);
                Dl.G(this, throwable0.getMessage());
                this.X(false);
            });
            return;
        }
        this.X(false);
    }

    // 检测为 Lambda 实现
    private static final void z2(SeriesManageActivity seriesManageActivity0) [...]
}

