package com.dcinside.app.write.menu.ai.character;

import Y.e0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter.LengthFilter;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.MenuItem;
import androidx.activity.result.ActivityResultLauncher;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager;
import com.dcinside.app.base.g;
import com.dcinside.app.util.uk;
import com.dcinside.app.write.menu.ai.type.b;
import com.hjq.toast.s;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.r;
import rx.o;
import rx.schedulers.c;
import y4.l;
import y4.m;

@s0({"SMAP\nCharaPromptSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharaPromptSearchActivity.kt\ncom/dcinside/app/write/menu/ai/character/CharaPromptSearchActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,139:1\n55#2,12:140\n84#2,3:152\n255#3:155\n257#3,2:156\n257#3,2:158\n257#3,2:161\n257#3,2:163\n257#3,2:165\n25#4:160\n*S KotlinDebug\n*F\n+ 1 CharaPromptSearchActivity.kt\ncom/dcinside/app/write/menu/ai/character/CharaPromptSearchActivity\n*L\n42#1:140,12\n42#1:152,3\n80#1:155\n81#1:156,2\n82#1:158,2\n88#1:161,2\n91#1:163,2\n126#1:165,2\n86#1:160\n*E\n"})
public final class CharaPromptSearchActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0, @m ActivityResultLauncher activityResultLauncher0) {
            S0 s00;
            L.p(context0, "context");
            Intent intent0 = new Intent(context0, CharaPromptSearchActivity.class);
            if(activityResultLauncher0 == null) {
                s00 = null;
            }
            else {
                activityResultLauncher0.b(intent0);
                s00 = S0.a;
            }
            if(s00 == null) {
                context0.startActivity(intent0);
            }
        }
    }

    @l
    public static final a A = null;
    @l
    public static final String B = "app.write.menu.ai.chara.EXTRA_SELECTED_PROMPT";
    private e0 w;
    @m
    private o x;
    @l
    private String y;
    @l
    private final HashMap z;

    static {
        CharaPromptSearchActivity.A = new a(null);
    }

    public CharaPromptSearchActivity() {
        this.y = "";
        this.z = new HashMap();
    }

    // 检测为 Lambda 实现
    private static final CharSequence V1(r r0, CharSequence charSequence0, int v, int v1, Spanned spanned0, int v2, int v3) [...]

    private final void W1(CharSequence charSequence0) {
        e0 e00 = this.w;
        e0 e01 = null;
        if(e00 == null) {
            L.S("binding");
            e00 = null;
        }
        L.o(e00.d, "charaPromptSearchAboutTitle");
        if(e00.d.getVisibility() == 0) {
            e0 e02 = this.w;
            if(e02 == null) {
                L.S("binding");
                e02 = null;
            }
            L.o(e02.d, "charaPromptSearchAboutTitle");
            e02.d.setVisibility(8);
            e0 e03 = this.w;
            if(e03 == null) {
                L.S("binding");
                e03 = null;
            }
            L.o(e03.c, "charaPromptSearchAboutDesc");
            e03.c.setVisibility(8);
        }
        o o0 = this.x;
        if(o0 != null) {
            o0.l();
        }
        if(charSequence0 != null && charSequence0.length() != 0) {
            e0 e04 = this.w;
            if(e04 == null) {
                L.S("binding");
            }
            else {
                e01 = e04;
            }
            L.o(e01.b, "charaPromptProgress");
            e01.b.setVisibility(0);
            this.X1(charSequence0.toString());
            return;
        }
        e0 e05 = this.w;
        if(e05 == null) {
            L.S("binding");
            e05 = null;
        }
        L.o(e05.f, "charaPromptSearchList");
        Adapter recyclerView$Adapter0 = e05.f.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.write.menu.ai.character.a)) {
            recyclerView$Adapter0 = null;
        }
        if(((com.dcinside.app.write.menu.ai.character.a)recyclerView$Adapter0) == null) {
            return;
        }
        this.y = "";
        e0 e06 = this.w;
        if(e06 == null) {
            L.S("binding");
            e06 = null;
        }
        L.o(e06.b, "charaPromptProgress");
        e06.b.setVisibility(8);
        ((com.dcinside.app.write.menu.ai.character.a)recyclerView$Adapter0).f0(null);
    }

    private final void X1(String s) {
        static final class d extends N implements Function1 {
            final CharaPromptSearchActivity e;
            final String f;

            d(CharaPromptSearchActivity charaPromptSearchActivity0, String s) {
                this.e = charaPromptSearchActivity0;
                this.f = s;
                super(1);
            }

            public final Boolean b(String s) {
                return Boolean.valueOf(!m0.a.a.d(this.e.y, this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((String)object0));
            }
        }


        static final class e extends N implements Function1 {
            final CharaPromptSearchActivity e;
            final String f;

            e(CharaPromptSearchActivity charaPromptSearchActivity0, String s) {
                this.e = charaPromptSearchActivity0;
                this.f = s;
                super(1);
            }

            public final void b(String s) {
                this.e.y = this.f;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }


        static final class f extends N implements Function1 {
            final CharaPromptSearchActivity e;
            final String f;

            f(CharaPromptSearchActivity charaPromptSearchActivity0, String s) {
                this.e = charaPromptSearchActivity0;
                this.f = s;
                super(1);
            }

            public final rx.g b(String s) {
                b b0 = (b)this.e.z.get(this.f);
                return b0 == null ? uk.BG(this.f).A1(0xFAL, TimeUnit.MILLISECONDS) : rx.g.Q2(b0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((String)object0));
            }
        }


        @s0({"SMAP\nCharaPromptSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharaPromptSearchActivity.kt\ncom/dcinside/app/write/menu/ai/character/CharaPromptSearchActivity$searchCharaPrompt$4\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,139:1\n257#2,2:140\n257#2,2:143\n25#3:142\n*S KotlinDebug\n*F\n+ 1 CharaPromptSearchActivity.kt\ncom/dcinside/app/write/menu/ai/character/CharaPromptSearchActivity$searchCharaPrompt$4\n*L\n114#1:140,2\n123#1:143,2\n117#1:142\n*E\n"})
        static final class com.dcinside.app.write.menu.ai.character.CharaPromptSearchActivity.g extends N implements Function1 {
            final CharaPromptSearchActivity e;
            final String f;

            com.dcinside.app.write.menu.ai.character.CharaPromptSearchActivity.g(CharaPromptSearchActivity charaPromptSearchActivity0, String s) {
                this.e = charaPromptSearchActivity0;
                this.f = s;
                super(1);
            }

            public final void a(b b0) {
                e0 e00 = this.e.w;
                e0 e01 = null;
                if(e00 == null) {
                    L.S("binding");
                    e00 = null;
                }
                L.o(e00.f, "charaPromptSearchList");
                e00.f.setVisibility(0);
                L.m(b0);
                this.e.z.put(this.f, b0);
                e0 e02 = this.e.w;
                if(e02 == null) {
                    L.S("binding");
                    e02 = null;
                }
                L.o(e02.f, "charaPromptSearchList");
                Adapter recyclerView$Adapter0 = e02.f.getAdapter();
                if(!(recyclerView$Adapter0 instanceof com.dcinside.app.write.menu.ai.character.a)) {
                    recyclerView$Adapter0 = null;
                }
                if(((com.dcinside.app.write.menu.ai.character.a)recyclerView$Adapter0) == null) {
                    return;
                }
                if(b0.f()) {
                    ((com.dcinside.app.write.menu.ai.character.a)recyclerView$Adapter0).f0(b0.e());
                }
                else {
                    ((com.dcinside.app.write.menu.ai.character.a)recyclerView$Adapter0).f0(null);
                }
                e0 e03 = this.e.w;
                if(e03 == null) {
                    L.S("binding");
                }
                else {
                    e01 = e03;
                }
                L.o(e01.b, "charaPromptProgress");
                e01.b.setVisibility(8);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((b)object0));
                return S0.a;
            }
        }

        this.x = rx.g.Q2(s).Z1((Object object0) -> {
            L.p(new d(this, s), "$tmp0");
            return (Boolean)new d(this, s).invoke(object0);
        }).P1((Object object0) -> {
            L.p(new e(this, s), "$tmp0");
            new e(this, s).invoke(object0);
        }).f2((Object object0) -> {
            L.p(new f(this, s), "$tmp0");
            return (rx.g)new f(this, s).invoke(object0);
        }).A5(c.e()).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.ai.character.CharaPromptSearchActivity.g(this, s), "$tmp0");
            new com.dcinside.app.write.menu.ai.character.CharaPromptSearchActivity.g(this, s).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            s.C(throwable0.getMessage());
            e0 e00 = this.w;
            if(e00 == null) {
                L.S("binding");
                e00 = null;
            }
            L.o(e00.b, "charaPromptProgress");
            e00.b.setVisibility(8);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean Y1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void Z1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final rx.g a2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void b2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void c2(CharaPromptSearchActivity charaPromptSearchActivity0, Throwable throwable0) [...]

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        @s0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 CharaPromptSearchActivity.kt\ncom/dcinside/app/write/menu/ai/character/CharaPromptSearchActivity\n*L\n1#1,82:1\n63#2:83\n59#3:84\n43#4,2:85\n*E\n"})
        public static final class com.dcinside.app.write.menu.ai.character.CharaPromptSearchActivity.b implements TextWatcher {
            final CharaPromptSearchActivity a;

            public com.dcinside.app.write.menu.ai.character.CharaPromptSearchActivity.b(CharaPromptSearchActivity charaPromptSearchActivity0) {
                this.a = charaPromptSearchActivity0;
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
                this.a.W1(charSequence0);
            }
        }


        static final class com.dcinside.app.write.menu.ai.character.CharaPromptSearchActivity.c extends N implements Function1 {
            final CharaPromptSearchActivity e;

            com.dcinside.app.write.menu.ai.character.CharaPromptSearchActivity.c(CharaPromptSearchActivity charaPromptSearchActivity0) {
                this.e = charaPromptSearchActivity0;
                super(1);
            }

            public final void b(@l String s) {
                L.p(s, "it");
                Intent intent0 = this.e.getIntent();
                Intent intent1 = intent0 == null ? null : intent0.putExtra("app.write.menu.ai.chara.EXTRA_SELECTED_PROMPT", s);
                this.e.setResult(-1, intent1);
                this.e.finish();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        e0 e00 = e0.c(this.getLayoutInflater());
        L.o(e00, "inflate(...)");
        this.w = e00;
        e0 e01 = null;
        if(e00 == null) {
            L.S("binding");
            e00 = null;
        }
        this.setContentView(e00.b());
        e0 e02 = this.w;
        if(e02 == null) {
            L.S("binding");
            e02 = null;
        }
        this.S0(e02.g);
        kr.bhbfhfb.designcompat.a.d(this);
        e0 e03 = this.w;
        if(e03 == null) {
            L.S("binding");
            e03 = null;
        }
        e03.g.setNavigationIcon(0x7F08012F);  // drawable:btn_close
        e0 e04 = this.w;
        if(e04 == null) {
            L.S("binding");
            e04 = null;
        }
        L.o(e04.e, "charaPromptSearchInput");
        com.dcinside.app.write.menu.ai.character.CharaPromptSearchActivity.b charaPromptSearchActivity$b0 = new com.dcinside.app.write.menu.ai.character.CharaPromptSearchActivity.b(this);
        e04.e.addTextChangedListener(charaPromptSearchActivity$b0);
        e0 e05 = this.w;
        if(e05 == null) {
            L.S("binding");
            e05 = null;
        }
        StickyHeaderGridLayoutManager stickyHeaderGridLayoutManager0 = new StickyHeaderGridLayoutManager(1);
        e05.f.setLayoutManager(stickyHeaderGridLayoutManager0);
        com.dcinside.app.write.menu.ai.character.a a0 = new com.dcinside.app.write.menu.ai.character.a();
        e0 e06 = this.w;
        if(e06 == null) {
            L.S("binding");
            e06 = null;
        }
        e06.f.setAdapter(a0);
        e0 e07 = this.w;
        if(e07 == null) {
            L.S("binding");
            e07 = null;
        }
        l0.b b0 = new l0.b(this);
        e07.f.addItemDecoration(b0);
        a0.g0(new com.dcinside.app.write.menu.ai.character.CharaPromptSearchActivity.c(this));
        InputFilter.LengthFilter inputFilter$LengthFilter0 = new InputFilter.LengthFilter(60);
        i i0 = (CharSequence charSequence0, int v, int v1, Spanned spanned0, int v2, int v3) -> {
            L.p(new r("[ㄱ-ㅎㅏ-ㅣ가-힣]"), "$regex");
            L.m(charSequence0);
            return new r("[ㄱ-ㅎㅏ-ㅣ가-힣]").m(charSequence0, "");
        };
        e0 e08 = this.w;
        if(e08 == null) {
            L.S("binding");
        }
        else {
            e01 = e08;
        }
        e01.e.setFilters(new InputFilter[]{inputFilter$LengthFilter0, i0});
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        o o0 = this.x;
        if(o0 != null) {
            o0.l();
        }
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
}

