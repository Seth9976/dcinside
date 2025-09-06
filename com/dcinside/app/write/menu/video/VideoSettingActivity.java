package com.dcinside.app.write.menu.video;

import A3.p;
import A3.q;
import Y.L0;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.IntentCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import com.dcinside.app.base.d;
import com.dcinside.app.image.ImageViewerActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.VideoInfoUploadResult;
import com.dcinside.app.model.VideoUploadResult;
import com.dcinside.app.rx.bus.m0;
import com.dcinside.app.span.e;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.tool.NonPredictiveGridLayoutManager;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import rx.o;
import rx.subscriptions.b;
import y4.l;
import y4.m;

@s0({"SMAP\nVideoSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoSettingActivity.kt\ncom/dcinside/app/write/menu/video/VideoSettingActivity\n+ 2 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 5 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n*L\n1#1,346:1\n60#2:347\n1#3:348\n25#4:349\n25#4:350\n25#4:351\n25#4:352\n25#4:353\n25#4:354\n25#4:355\n47#5,2:356\n47#5,2:358\n47#5,2:360\n47#5,2:362\n*S KotlinDebug\n*F\n+ 1 VideoSettingActivity.kt\ncom/dcinside/app/write/menu/video/VideoSettingActivity\n*L\n99#1:347\n192#1:349\n193#1:350\n205#1:351\n207#1:352\n241#1:353\n289#1:354\n293#1:355\n302#1:356,2\n303#1:358,2\n314#1:360,2\n315#1:362,2\n*E\n"})
public final class VideoSettingActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0, @m VideoUploadResult videoUploadResult0, @m VideoInfoData videoInfoData0, @m String s, @m ActivityResultLauncher activityResultLauncher0) {
            L.p(appCompatActivity0, "activity");
            Intent intent0 = new Intent(appCompatActivity0, VideoSettingActivity.class);
            intent0.putExtra("com.dcinside.app.extra.GALLERY_ID", s);
            intent0.putExtra("com.dcinside.app.write.menu.VideoSettingActivity_EXTRA_VIDEO_RESULT", videoUploadResult0);
            intent0.putExtra("com.dcinside.app.write.menu.VideoSettingActivity_EXTRA_VIDEO_INFO_RESULT_DATA", videoInfoData0);
            if(activityResultLauncher0 != null) {
                activityResultLauncher0.b(intent0);
            }
        }
    }

    @m
    private b A;
    @l
    public static final a B = null;
    @l
    private static final String C = "com.dcinside.app.write.menu.VideoSettingActivity_EXTRA_VIDEO_RESULT";
    @l
    public static final String D = "com.dcinside.app.write.menu.VideoSettingActivity_EXTRA_VIDEO_INFO_RESULT_DATA";
    private L0 u;
    @m
    private VideoUploadResult v;
    @m
    private VideoInfoData w;
    @m
    private String x;
    @m
    private o y;
    private ActivityResultLauncher z;

    static {
        VideoSettingActivity.B = new a(null);
    }

    private final void P1(TextView textView0) {
        L.o("https://www.law.go.kr/%EB%B2%95%EB%A0%B9/%EC%A0%84%EA%B8%B0%ED%86%B5%EC%8B%A0%EC%82%AC%EC%97%85%EB%B2%95/(20211019,18477,20211019)/%EC%A0%9C22%EC%A1%B0%EC%9D%985]", "getString(...)");
        int v = vk.b(this, 0x7F04012E);  // attr:colorAccent
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(textView0.getText());
        L.o("[전기통신사업법 제22조의5 제1항]", "getString(...)");
        CharSequence charSequence0 = textView0.getText();
        L.o(charSequence0, "getText(...)");
        int v1 = v.s3(charSequence0, "[전기통신사업법 제22조의5 제1항]", 0, false, 6, null);
        spannableStringBuilder0.setSpan(new UnderlineSpan(), v1, v1 + 20, 17);
        spannableStringBuilder0.setSpan(new e(v, true, "https://www.law.go.kr/%EB%B2%95%EB%A0%B9/%EC%A0%84%EA%B8%B0%ED%86%B5%EC%8B%A0%EC%82%AC%EC%97%85%EB%B2%95/(20211019,18477,20211019)/%EC%A0%9C22%EC%A1%B0%EC%9D%985]", com.dcinside.app.span.e.a.b), v1, v1 + 20, 17);
        textView0.setMovementMethod(LinkMovementMethod.getInstance());
        textView0.setText(spannableStringBuilder0);
    }

    private final void Q1(TextView textView0) {
        L.o("https://nstatic.dcinside.com/dc/m/policy/policy.html", "getString(...)");
        int v = vk.b(this, 0x7F04012E);  // attr:colorAccent
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(textView0.getText());
        L.o("[이용약관]", "getString(...)");
        CharSequence charSequence0 = textView0.getText();
        L.o(charSequence0, "getText(...)");
        int v1 = v.s3(charSequence0, "[이용약관]", 0, false, 6, null);
        spannableStringBuilder0.setSpan(new UnderlineSpan(), v1, v1 + 6, 17);
        spannableStringBuilder0.setSpan(new e(v, true, "https://nstatic.dcinside.com/dc/m/policy/policy.html", com.dcinside.app.span.e.a.b), v1, v1 + 6, 17);
        textView0.setMovementMethod(LinkMovementMethod.getInstance());
        textView0.setText(spannableStringBuilder0);
    }

    private final void R1() {
        @f(c = "com.dcinside.app.write.menu.video.VideoSettingActivity$initView$1", f = "VideoSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.video.VideoSettingActivity.b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final VideoSettingActivity l;

            com.dcinside.app.write.menu.video.VideoSettingActivity.b(VideoSettingActivity videoSettingActivity0, kotlin.coroutines.d d0) {
                this.l = videoSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.video.VideoSettingActivity.b(this.l, d0).invokeSuspend(S0.a);
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
                View view0 = this.l.getCurrentFocus();
                EditText editText0 = view0 instanceof EditText ? ((EditText)view0) : null;
                if(editText0 != null && editText0.getId() == 0x7F0B1062) {  // id:video_item_tag_text
                    this.l.b2(editText0, false);
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.video.VideoSettingActivity$initView$2", f = "VideoSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements q {
            int k;
            Object l;
            boolean m;

            c(kotlin.coroutines.d d0) {
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((View)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l View view0, boolean z, @m kotlin.coroutines.d d0) {
                c videoSettingActivity$c0 = new c(d0);
                videoSettingActivity$c0.l = view0;
                videoSettingActivity$c0.m = z;
                return videoSettingActivity$c0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                if(this.m) {
                    Nk.a.c(view0);
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.video.VideoSettingActivity$initView$4", f = "VideoSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.video.VideoSettingActivity.d extends kotlin.coroutines.jvm.internal.o implements q {
            int k;
            Object l;
            boolean m;

            com.dcinside.app.write.menu.video.VideoSettingActivity.d(kotlin.coroutines.d d0) {
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((View)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l View view0, boolean z, @m kotlin.coroutines.d d0) {
                com.dcinside.app.write.menu.video.VideoSettingActivity.d videoSettingActivity$d0 = new com.dcinside.app.write.menu.video.VideoSettingActivity.d(d0);
                videoSettingActivity$d0.l = view0;
                videoSettingActivity$d0.m = z;
                return videoSettingActivity$d0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                if(this.m) {
                    Nk.a.f(view0);
                }
                return S0.a;
            }
        }

        int v = this.getResources().getConfiguration().orientation == 1 ? 3 : 6;
        L0 l00 = this.u;
        L0 l01 = null;
        if(l00 == null) {
            L.S("binding");
            l00 = null;
        }
        NonPredictiveGridLayoutManager nonPredictiveGridLayoutManager0 = new NonPredictiveGridLayoutManager(v, 1, false);
        l00.q.setLayoutManager(nonPredictiveGridLayoutManager0);
        L0 l02 = this.u;
        if(l02 == null) {
            L.S("binding");
            l02 = null;
        }
        com.dcinside.app.write.menu.video.c c0 = new com.dcinside.app.write.menu.video.c();
        l02.q.setAdapter(c0);
        L0 l03 = this.u;
        if(l03 == null) {
            L.S("binding");
            l03 = null;
        }
        ChipsLayoutManager chipsLayoutManager0 = ChipsLayoutManager.j3(this).a();
        l03.i.setLayoutManager(chipsLayoutManager0);
        L0 l04 = this.u;
        if(l04 == null) {
            L.S("binding");
            l04 = null;
        }
        com.dcinside.app.write.menu.video.b b0 = new com.dcinside.app.write.menu.video.b();
        l04.i.setAdapter(b0);
        L0 l05 = this.u;
        if(l05 == null) {
            L.S("binding");
            l05 = null;
        }
        boolean z = dl.a.Z1();
        l05.b.setChecked(z);
        L0 l06 = this.u;
        if(l06 == null) {
            L.S("binding");
            l06 = null;
        }
        L.o(l06.r, "videoInfoWrapper");
        com.dcinside.app.write.menu.video.VideoSettingActivity.b videoSettingActivity$b0 = new com.dcinside.app.write.menu.video.VideoSettingActivity.b(this, null);
        r.M(l06.r, null, videoSettingActivity$b0, 1, null);
        L0 l07 = this.u;
        if(l07 == null) {
            L.S("binding");
            l07 = null;
        }
        L.o(l07.r, "videoInfoWrapper");
        c videoSettingActivity$c0 = new c(null);
        r.P(l07.r, null, videoSettingActivity$c0, 1, null);
        L0 l08 = this.u;
        if(l08 == null) {
            L.S("binding");
            l08 = null;
        }
        l08.f.setHorizontallyScrolling(false);
        L0 l09 = this.u;
        if(l09 == null) {
            L.S("binding");
            l09 = null;
        }
        l09.f.setMaxLines(20);
        L0 l010 = this.u;
        if(l010 == null) {
            L.S("binding");
            l010 = null;
        }
        com.dcinside.app.write.menu.video.e e0 = (TextView textView0, int v, KeyEvent keyEvent0) -> {
            if(6 == v) {
                Nk.a.c(textView0);
                textView0.clearFocus();
                return true;
            }
            return false;
        };
        l010.f.setOnEditorActionListener(e0);
        L0 l011 = this.u;
        if(l011 == null) {
            L.S("binding");
            l011 = null;
        }
        L.o(l011.f, "videoInfoDescInput");
        com.dcinside.app.write.menu.video.VideoSettingActivity.d videoSettingActivity$d0 = new com.dcinside.app.write.menu.video.VideoSettingActivity.d(null);
        r.P(l011.f, null, videoSettingActivity$d0, 1, null);
        L0 l012 = this.u;
        if(l012 == null) {
            L.S("binding");
            l012 = null;
        }
        L.o(l012.c, "videoInfoAppLaw");
        this.Q1(l012.c);
        L0 l013 = this.u;
        if(l013 == null) {
            L.S("binding");
        }
        else {
            l01 = l013;
        }
        L.o(l01.m, "videoInfoIllegalLaw");
        this.P1(l01.m);
    }

    // 检测为 Lambda 实现
    private static final boolean S1(TextView textView0, int v, KeyEvent keyEvent0) [...]

    private final void T1() {
        static final class com.dcinside.app.write.menu.video.VideoSettingActivity.e extends N implements Function1 {
            final VideoSettingActivity e;
            final VideoInfoData f;

            com.dcinside.app.write.menu.video.VideoSettingActivity.e(VideoSettingActivity videoSettingActivity0, VideoInfoData videoInfoData0) {
                this.e = videoSettingActivity0;
                this.f = videoInfoData0;
                super(1);
            }

            public final void a(VideoInfoUploadResult videoInfoUploadResult0) {
                L0 l00 = this.e.u;
                if(l00 == null) {
                    L.S("binding");
                    l00 = null;
                }
                l00.p.setVisibility(8);
                if(videoInfoUploadResult0.f()) {
                    L.m(videoInfoUploadResult0);
                    this.e.Z1(videoInfoUploadResult0, this.f);
                    return;
                }
                Dl.G(this.e, videoInfoUploadResult0.a());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((VideoInfoUploadResult)object0));
                return S0.a;
            }
        }

        String s1;
        if(!kl.a(new o[]{this.y})) {
            return;
        }
        L0 l00 = this.u;
        String s = null;
        if(l00 == null) {
            L.S("binding");
            l00 = null;
        }
        l00.p.setVisibility(0);
        L0 l01 = this.u;
        if(l01 == null) {
            L.S("binding");
            l01 = null;
        }
        Editable editable0 = l01.f.getText();
        if(editable0 == null) {
            s1 = "";
        }
        else {
            s1 = editable0.toString();
            if(s1 == null) {
                s1 = "";
            }
        }
        String s2 = Dl.C(s1);
        L0 l02 = this.u;
        if(l02 == null) {
            L.S("binding");
            l02 = null;
        }
        L.o(l02.i, "videoInfoEditTagList");
        Adapter recyclerView$Adapter0 = l02.i.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.write.menu.video.b)) {
            recyclerView$Adapter0 = null;
        }
        L0 l03 = this.u;
        if(l03 == null) {
            L.S("binding");
            l03 = null;
        }
        boolean z = l03.b.isChecked();
        int v = this.w == null ? 0 : this.w.y();
        int v1 = this.w == null ? 0 : this.w.t();
        String s3 = this.w == null ? null : this.w.s();
        String s4 = this.w == null ? null : this.w.x();
        String s5 = this.w == null ? null : this.w.w();
        VideoInfoData videoInfoData0 = this.w;
        if(videoInfoData0 != null) {
            s = videoInfoData0.v();
        }
        VideoInfoData videoInfoData1 = new VideoInfoData(v, v1, s3, s4, s5, s, s2, (((com.dcinside.app.write.menu.video.b)recyclerView$Adapter0) == null ? null : ""), z);
        this.y = uk.aG(this.x, videoInfoData1).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.video.VideoSettingActivity.e(this, videoInfoData1), "$tmp0");
            new com.dcinside.app.write.menu.video.VideoSettingActivity.e(this, videoInfoData1).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
            L0 l00 = this.u;
            if(l00 == null) {
                L.S("binding");
                l00 = null;
            }
            l00.p.setVisibility(8);
        });
    }

    // 检测为 Lambda 实现
    private static final void U1(VideoSettingActivity videoSettingActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void V1(Function1 function10, Object object0) [...]

    private final void W1(m0 m00) {
        Intent intent0 = new Intent(this, ImageViewerActivity.class);
        intent0.putExtra("com.dcinside.app.extra.GALLERY_ID", m00.c());
        intent0.putExtra("com.dcinside.app.extra.POST_NUMBER", m00.g());
        intent0.putExtra("com.dcinside.app.extra.POST_SUBJECT", m00.k());
        intent0.putExtra("com.dcinside.app.extra.IMAGE_SELECTED", m00.l());
        intent0.putExtra("com.dcinside.app.extra.SHOW_PATH_CHANGE", m00.j());
        intent0.putParcelableArrayListExtra("com.dcinside.app.extra.RESIZE_IMAGE_LIST", m00.h());
        intent0.putParcelableArrayListExtra("com.dcinside.app.extra.ORIGIN_IMAGE_LIST", m00.f());
        intent0.putExtra("com.dcinside.app.extra.EXTRA_SHOW_IMAGE_MODE", m00.e());
        intent0.putStringArrayListExtra("com.dcinside.app.extra.EXTRA_VIDEO_THUMBNAIL_LIST", m00.d());
        intent0.putExtra("com.dcinside.app.extra.EXTRA_CAN_BLOCK", m00.b());
        ActivityResultLauncher activityResultLauncher0 = this.z;
        if(activityResultLauncher0 == null) {
            L.S("activityResultImageViewer");
            activityResultLauncher0 = null;
        }
        activityResultLauncher0.b(intent0);
    }

    // 检测为 Lambda 实现
    private static final void X1(VideoSettingActivity videoSettingActivity0, ActivityResult activityResult0) [...]

    // 检测为 Lambda 实现
    private static final void Y1(Function1 function10, Object object0) [...]

    private final void Z1(VideoInfoUploadResult videoInfoUploadResult0, VideoInfoData videoInfoData0) {
        int v = videoInfoData0.y();
        int v1 = videoInfoData0.t();
        String s = videoInfoData0.s();
        if(s == null) {
            s = this.v == null ? null : this.v.a();
        }
        VideoInfoData videoInfoData1 = new VideoInfoData(v, v1, s, videoInfoUploadResult0.e(), videoInfoUploadResult0.d(), videoInfoData0.v(), videoInfoData0.r(), videoInfoData0.u(), videoInfoData0.q());
        Intent intent0 = new Intent();
        intent0.putExtra("com.dcinside.app.write.menu.VideoSettingActivity_EXTRA_VIDEO_INFO_RESULT_DATA", videoInfoData1);
        this.setResult(-1, intent0);
        this.finish();
    }

    private final void a2() {
        String s;
        L0 l00 = this.u;
        L0 l01 = null;
        if(l00 == null) {
            L.S("binding");
            l00 = null;
        }
        L.o(l00.q, "videoInfoThumbnailList");
        Adapter recyclerView$Adapter0 = l00.q.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.write.menu.video.c)) {
            recyclerView$Adapter0 = null;
        }
        if(((com.dcinside.app.write.menu.video.c)recyclerView$Adapter0) != null) {
            ((com.dcinside.app.write.menu.video.c)recyclerView$Adapter0).A((this.v == null ? null : this.v.d()));
        }
        L0 l02 = this.u;
        if(l02 == null) {
            L.S("binding");
            l02 = null;
        }
        L.o(l02.i, "videoInfoEditTagList");
        Adapter recyclerView$Adapter1 = l02.i.getAdapter();
        if(!(recyclerView$Adapter1 instanceof com.dcinside.app.write.menu.video.b)) {
            recyclerView$Adapter1 = null;
        }
        if(((com.dcinside.app.write.menu.video.b)recyclerView$Adapter1) != null) {
            VideoInfoData videoInfoData0 = this.w;
            if(videoInfoData0 == null) {
                s = "";
            }
            else {
                s = videoInfoData0.u();
                if(s == null) {
                    s = "";
                }
            }
            ((com.dcinside.app.write.menu.video.b)recyclerView$Adapter1).B(s);
        }
        VideoInfoData videoInfoData1 = this.w;
        if(videoInfoData1 != null) {
            boolean z = videoInfoData1.q();
            L0 l03 = this.u;
            if(l03 == null) {
                L.S("binding");
                l03 = null;
            }
            l03.b.setChecked(z);
        }
        VideoInfoData videoInfoData2 = this.w;
        if(videoInfoData2 != null) {
            String s1 = videoInfoData2.r();
            if(s1 != null) {
                L0 l04 = this.u;
                if(l04 == null) {
                    L.S("binding");
                }
                else {
                    l01 = l04;
                }
                l01.f.setText(s1);
            }
        }
    }

    private final void b2(EditText editText0, boolean z) {
        L0 l00 = this.u;
        Adapter recyclerView$Adapter0 = null;
        if(l00 == null) {
            L.S("binding");
            l00 = null;
        }
        L.o(l00.i, "videoInfoEditTagList");
        Adapter recyclerView$Adapter1 = l00.i.getAdapter();
        if(recyclerView$Adapter1 instanceof com.dcinside.app.write.menu.video.b) {
            recyclerView$Adapter0 = recyclerView$Adapter1;
        }
        if(((com.dcinside.app.write.menu.video.b)recyclerView$Adapter0) != null) {
            ((com.dcinside.app.write.menu.video.b)recyclerView$Adapter0).w(editText0, false, z);
        }
    }

    private final void c2(int v) {
        L0 l00 = this.u;
        Adapter recyclerView$Adapter0 = null;
        if(l00 == null) {
            L.S("binding");
            l00 = null;
        }
        L.o(l00.q, "videoInfoThumbnailList");
        Adapter recyclerView$Adapter1 = l00.q.getAdapter();
        if(recyclerView$Adapter1 instanceof com.dcinside.app.write.menu.video.c) {
            recyclerView$Adapter0 = recyclerView$Adapter1;
        }
        if(((com.dcinside.app.write.menu.video.c)recyclerView$Adapter0) != null) {
            ((com.dcinside.app.write.menu.video.c)recyclerView$Adapter0).B(v);
        }
    }

    private final void d2() {
        static final class g extends N implements Function1 {
            final VideoSettingActivity e;
            final VideoInfoData f;

            g(VideoSettingActivity videoSettingActivity0, VideoInfoData videoInfoData0) {
                this.e = videoSettingActivity0;
                this.f = videoInfoData0;
                super(1);
            }

            public final void a(VideoInfoUploadResult videoInfoUploadResult0) {
                if(videoInfoUploadResult0.f()) {
                    L.m(videoInfoUploadResult0);
                    this.e.Z1(videoInfoUploadResult0, this.f);
                    return;
                }
                Dl.G(this.e, videoInfoUploadResult0.a());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((VideoInfoUploadResult)object0));
                return S0.a;
            }
        }

        String s2;
        if(!kl.a(new o[]{this.y})) {
            return;
        }
        L0 l00 = this.u;
        String s = null;
        if(l00 == null) {
            L.S("binding");
            l00 = null;
        }
        l00.p.setVisibility(0);
        L0 l01 = this.u;
        if(l01 == null) {
            L.S("binding");
            l01 = null;
        }
        L.o(l01.q, "videoInfoThumbnailList");
        Adapter recyclerView$Adapter0 = l01.q.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.write.menu.video.c)) {
            recyclerView$Adapter0 = null;
        }
        String s1 = ((com.dcinside.app.write.menu.video.c)recyclerView$Adapter0) == null ? null : ((com.dcinside.app.write.menu.video.c)recyclerView$Adapter0).v();
        L0 l02 = this.u;
        if(l02 == null) {
            L.S("binding");
            l02 = null;
        }
        Editable editable0 = l02.f.getText();
        if(editable0 == null) {
            s2 = "";
        }
        else {
            s2 = editable0.toString();
            if(s2 == null) {
                s2 = "";
            }
        }
        L0 l03 = this.u;
        if(l03 == null) {
            L.S("binding");
            l03 = null;
        }
        L.o(l03.i, "videoInfoEditTagList");
        Adapter recyclerView$Adapter1 = l03.i.getAdapter();
        if(!(recyclerView$Adapter1 instanceof com.dcinside.app.write.menu.video.b)) {
            recyclerView$Adapter1 = null;
        }
        L0 l04 = this.u;
        if(l04 == null) {
            L.S("binding");
            l04 = null;
        }
        boolean z = l04.b.isChecked();
        int v = this.v == null ? 0 : this.v.f();
        int v1 = this.v == null ? 0 : this.v.e();
        VideoUploadResult videoUploadResult0 = this.v;
        if(videoUploadResult0 != null) {
            s = videoUploadResult0.a();
        }
        VideoInfoData videoInfoData0 = new VideoInfoData(v, v1, s, null, null, s1, s2, (((com.dcinside.app.write.menu.video.b)recyclerView$Adapter1) == null ? null : ""), z);
        this.y = uk.SG(this.x, videoInfoData0).y5((Object object0) -> {
            L.p(new g(this, videoInfoData0), "$tmp0");
            new g(this, videoInfoData0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
            L0 l00 = this.u;
            if(l00 == null) {
                L.S("binding");
                l00 = null;
            }
            l00.p.setVisibility(8);
        });
    }

    // 检测为 Lambda 实现
    private static final void e2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void f2(VideoSettingActivity videoSettingActivity0, Throwable throwable0) [...]

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        static final class com.dcinside.app.write.menu.video.VideoSettingActivity.f extends N implements Function1 {
            final VideoSettingActivity e;

            com.dcinside.app.write.menu.video.VideoSettingActivity.f(VideoSettingActivity videoSettingActivity0) {
                this.e = videoSettingActivity0;
                super(1);
            }

            public final void a(m0 m00) {
                L.m(m00);
                this.e.W1(m00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((m0)object0));
                return S0.a;
            }
        }

        String s;
        super.onCreate(bundle0);
        L0 l00 = L0.c(this.getLayoutInflater());
        L.o(l00, "inflate(...)");
        this.u = l00;
        L0 l01 = null;
        if(l00 == null) {
            L.S("binding");
            l00 = null;
        }
        this.setContentView(l00.b());
        L0 l02 = this.u;
        if(l02 == null) {
            L.S("binding");
            l02 = null;
        }
        this.S0(l02.l);
        kr.bhbfhfb.designcompat.a.d(this);
        Intent intent0 = this.getIntent();
        this.v = (VideoUploadResult)IntentCompat.d(intent0, "com.dcinside.app.write.menu.VideoSettingActivity_EXTRA_VIDEO_RESULT", VideoUploadResult.class);
        this.w = (VideoInfoData)IntentCompat.d(intent0, "com.dcinside.app.write.menu.VideoSettingActivity_EXTRA_VIDEO_INFO_RESULT_DATA", VideoInfoData.class);
        this.x = intent0.getStringExtra("com.dcinside.app.extra.GALLERY_ID");
        if(this.w == null) {
            L0 l03 = this.u;
            if(l03 == null) {
                L.S("binding");
                l03 = null;
            }
            l03.k.setVisibility(0);
            L0 l04 = this.u;
            if(l04 == null) {
                L.S("binding");
            }
            else {
                l01 = l04;
            }
            l01.q.setVisibility(0);
            s = "동영상 등록";
        }
        else {
            L0 l05 = this.u;
            if(l05 == null) {
                L.S("binding");
                l05 = null;
            }
            l05.k.setVisibility(8);
            L0 l06 = this.u;
            if(l06 == null) {
                L.S("binding");
            }
            else {
                l01 = l06;
            }
            l01.q.setVisibility(8);
            s = "동영상 등록 정보";
        }
        this.setTitle(s);
        this.R1();
        this.a2();
        this.z = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            int v = -1;
            if(activityResult0.c() != -1) {
                return;
            }
            Intent intent0 = activityResult0.a();
            if(intent0 != null) {
                v = intent0.getIntExtra("imageViewerSelectedPosition", -1);
            }
            if(v >= 0) {
                this.c2(v);
            }
        });
        b b0 = this.A;
        if(b0 != null) {
            b0.l();
        }
        this.A = new b();
        o o0 = com.dcinside.app.rx.bus.c.c(this, m0.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.video.VideoSettingActivity.f(this), "$tmp0");
            new com.dcinside.app.write.menu.video.VideoSettingActivity.f(this).invoke(object0);
        });
        b b1 = this.A;
        if(b1 != null) {
            b1.a(o0);
        }
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        L.p(menu0, "menu");
        this.getMenuInflater().inflate(0x7F100019, menu0);  // mipmap:ic_launcher28
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        dl dl0 = dl.a;
        L0 l00 = this.u;
        if(l00 == null) {
            L.S("binding");
            l00 = null;
        }
        dl0.L5(l00.b.isChecked());
        kl.b(new o[]{this.y});
        this.y = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.getOnBackPressedDispatcher().p();
                return true;
            }
            case 0x7F0B0075: {  // id:action_write
                View view0 = this.getCurrentFocus();
                EditText editText0 = view0 instanceof EditText ? ((EditText)view0) : null;
                Nk.a.a(this);
                if(editText0 != null && editText0.getId() == 0x7F0B1062) {  // id:video_item_tag_text
                    this.b2(editText0, true);
                }
                if(this.w == null) {
                    this.d2();
                    return true;
                }
                this.T1();
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }
}

