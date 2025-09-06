package com.dcinside.app.totalsearch.video;

import A3.p;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dcinside.app.internal.r;
import com.dcinside.app.perform.e;
import com.dcinside.app.totalsearch.a.f;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Xk.a;
import com.dcinside.app.util.uk;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;
import z3.j;

public final class VideoItemView extends ConstraintLayout {
    @l
    private final ImageView a;
    @l
    private final TextView b;
    @l
    private final TextView c;
    @l
    private final TextView d;
    @l
    private final TextView e;
    @l
    private final View f;

    @j
    public VideoItemView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public VideoItemView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public VideoItemView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        View.inflate(context0, 0x7F0E02AB, this);  // layout:view_total_search_video_content
        View view0 = this.findViewById(0x7F0B0FDB);  // id:total_video_thumbnail
        L.o(view0, "findViewById(...)");
        this.a = (ImageView)view0;
        View view1 = this.findViewById(0x7F0B0FDE);  // id:total_video_title_play_time
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
        View view2 = this.findViewById(0x7F0B0FDD);  // id:total_video_title
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        View view3 = this.findViewById(0x7F0B0FD5);  // id:total_video_gall_name_date
        L.o(view3, "findViewById(...)");
        this.d = (TextView)view3;
        View view4 = this.findViewById(0x7F0B0FD6);  // id:total_video_hit_count
        L.o(view4, "findViewById(...)");
        this.e = (TextView)view4;
        View view5 = this.findViewById(0x7F0B0FDC);  // id:total_video_thumbnail_adult
        L.o(view5, "findViewById(...)");
        this.f = view5;
    }

    public VideoItemView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final void D(f a$f0) {
        if(a$f0 == null) {
            return;
        }
        Context context0 = this.getContext();
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        String s = a$f0.f();
        if(s == null) {
            return;
        }
        int v = a$f0.i();
        if(a$f0.t() == 1) {
            this.E(s, v);
            return;
        }
        new a(s, v, 0, null, false, false, true, false, true, false, null, false, null, null, 16060, null).a(appCompatActivity0);
    }

    private final void E(String s, int v) {
        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F150282);  // string:dialog_adult_post "앱 스토어의 약관, 정책 준수 필요성에 따라 성인 게시물은 모바일웹에서 확인할 수 있습니다. 모바일웹으로 
                                            // 이동하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
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


        static final class d extends N implements Function1 {
            final String e;
            final int f;
            final AppCompatActivity g;

            d(String s, int v, AppCompatActivity appCompatActivity0) {
                this.e = s;
                this.f = v;
                this.g = appCompatActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                com.dcinside.app.type.m m0 = com.dcinside.app.type.m.d.b(this.e);
                String s = uk.TG(this.e, this.f, m0);
                com.dcinside.app.main.a.i(this.g, s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        Context context0 = this.getContext();
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        e.e.a(appCompatActivity0).n(b.e).x(0x7F1501C1).z(0x7F15034A).b().Z1((Object object0) -> {
            L.p(c.e, "$tmp0");
            return (Boolean)c.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new d(s, v, appCompatActivity0), "$tmp0");
            new d(s, v, appCompatActivity0).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean F(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void G(Function1 function10, Object object0) [...]

    public final void setContents(@m f a$f0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.totalsearch.video.VideoItemView$setContents$1", f = "VideoItemView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.totalsearch.video.VideoItemView.a extends o implements p {
            int k;
            final VideoItemView l;
            final f m;

            com.dcinside.app.totalsearch.video.VideoItemView.a(VideoItemView videoItemView0, f a$f0, kotlin.coroutines.d d0) {
                this.l = videoItemView0;
                this.m = a$f0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.totalsearch.video.VideoItemView.a(this.l, this.m, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.D(this.m);
                return S0.a;
            }
        }

        r.M(this, null, new com.dcinside.app.totalsearch.video.VideoItemView.a(this, a$f0, null), 1, null);
        this.setVisibility((a$f0 == null ? 4 : 0));
        if(a$f0 != null) {
            if(a$f0.t() == 1) {
                com.dcinside.app.glide.a.l(this.a).r0(0x7F08035D).k2().q1(this.a);  // drawable:ico_total_video_adult
                this.a.setPadding(0, 0, 0, 0);
                this.f.setVisibility(0);
            }
            else {
                com.dcinside.app.glide.a.l(this.a).t0(a$f0.o()).S1().e2(0x7F08044F).q1(this.a);  // drawable:not_import_img
                this.a.setPadding(0, 0, 0, 0);
                this.f.setVisibility(8);
            }
            Context context0 = this.getContext();
            L.o(context0, "getContext(...)");
            String s = Bk.a(a$f0.c(), context0);
            this.b.setText(s);
            this.c.setText(a$f0.p());
            this.d.setText(a$f0.d());
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
            String s1 = this.getContext().getString(0x7F150A93, new Object[]{a$f0.j()});  // string:total_search_video_hit_count "조회수 %d"
            L.o(s1, "getString(...)");
            spannableStringBuilder0.append(a$f0.b());
            spannableStringBuilder0.append(' ');
            Context context1 = this.getContext();
            L.o(context1, "getContext(...)");
            com.dcinside.app.internal.l.a(spannableStringBuilder0, "**", new com.dcinside.app.span.b(context1, 0x7F08019D, null, 0, 0, false, null, 0x7C, null));  // drawable:divider_text
            spannableStringBuilder0.append(' ');
            SpannableStringBuilder spannableStringBuilder1 = spannableStringBuilder0.append(s1);
            this.e.setText(spannableStringBuilder1);
        }
    }
}

