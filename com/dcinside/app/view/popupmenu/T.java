package com.dcinside.app.view.popupmenu;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.dcinside.app.RelationGalleryActivity;
import com.dcinside.app.memo.UserMemoActivity;
import com.dcinside.app.post.PostHeadSettingActivity;
import com.dcinside.app.post.fragments.S0;
import com.dcinside.app.post.p;
import com.dcinside.app.push.GalleryPushSettingActivity;
import com.dcinside.app.realm.B;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.rx.bus.Q;
import com.dcinside.app.settings.block.BlockSettingActivity;
import com.dcinside.app.settings.image.setting.DefaultImageSettingActivity;
import com.dcinside.app.settings.text.GalleryTextOptionSettingActivity;
import com.dcinside.app.type.m;
import com.dcinside.app.type.x;
import com.dcinside.app.util.Clipboards;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.uk;
import java.util.List;
import kotlin.J;
import kotlin.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

public final class t extends a {
    public t(@l S0 s00) {
        L.p(s00, "fragment");
        super(s00);
    }

    @Override  // com.dcinside.app.view.popupmenu.a
    public boolean b(Object object0, com.dcinside.app.view.popupmenu.l l0) {
        return this.j(((S0)object0), l0);
    }

    @Override  // com.dcinside.app.view.popupmenu.a
    public void e(Object object0, int v) {
        this.l(((S0)object0), v);
    }

    public boolean j(@l S0 s00, @l com.dcinside.app.view.popupmenu.l l0) {
        static final class com.dcinside.app.view.popupmenu.t.a extends N implements Function1 {
            public final class com.dcinside.app.view.popupmenu.t.a.a {
                public static final int[] a;

                static {
                    int[] arr_v = new int[m.values().length];
                    try {
                        arr_v[m.g.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[m.h.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[m.i.ordinal()] = 3;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[m.j.ordinal()] = 4;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    com.dcinside.app.view.popupmenu.t.a.a.a = arr_v;
                }
            }

            final GalleryInfo e;
            final t f;
            final FragmentActivity g;

            com.dcinside.app.view.popupmenu.t.a(GalleryInfo galleryInfo0, t t0, FragmentActivity fragmentActivity0) {
                this.e = galleryInfo0;
                this.f = t0;
                this.g = fragmentActivity0;
                super(1);
            }

            public final void a(@l d l$d0) {
                int v;
                L.p(l$d0, "$this$section");
                String s = B.E.k0();
                if(m0.a.a.k(s) && GalleryInfo.Q8.a(this.e, s)) {
                    switch(this.e.q()) {
                        case 1: {
                            v = 0x7F15056D;  // string:major_manage_title "갤러리 관리"
                            break;
                        }
                        case 2: {
                            v = 0x7F150678;  // string:minor_manage_title "마이너 갤러리 관리"
                            break;
                        }
                        case 3: {
                            v = 0x7F15066D;  // string:mini_manage_title "미니 갤러리 관리"
                            break;
                        }
                        case 4: {
                            v = 0x7F150776;  // string:person_manage_title "인물 갤러리 관리"
                            break;
                        }
                        default: {
                            throw new J();
                        }
                    }
                    a.d(this.f, l$d0, this.g, v, 0x7F0802A6, null, null, 0, false, null, 0xF8, null);  // drawable:ic_menu_gall_manage_bold
                }
                V v1 = this.e.q().g(this.e);
                int v2 = ((Number)v1.a()).intValue();
                int v3 = ((Number)v1.b()).intValue();
                if(v2 != 0) {
                    a.d(this.f, l$d0, this.g, v2, v3, null, null, 0, false, null, 0xF8, null);
                }
                String s1 = this.e.X();
                if(s1 == null || s1.length() == 0 || L.g(this.e.X(), "N")) {
                    a.d(this.f, l$d0, this.g, 0x7F15004C, 0x7F0802A7, null, null, 0, false, null, 0xF8, null);  // string:action_relative_gall "연관 갤러리"
                }
                List list0 = this.e.w();
                if(list0 != null && !list0.isEmpty() == 1 && !x.b.a(this.e.r())) {
                    a.d(this.f, l$d0, this.g, 0x7F15003D, 0x7F0802A4, null, null, 0, false, null, 0xF8, null);  // string:action_post_head_setting "말머리 설정"
                }
                a.d(this.f, l$d0, this.g, 0x7F150032, 0x7F0802AA, null, null, 0, false, null, 0xF8, null);  // string:action_page_move "페이지 이동"
                if(x.b.a(this.e.r())) {
                    a.d(this.f, l$d0, this.g, 0x7F1500B0, 0x7F0802A8, null, null, 0, false, null, 0xF8, null);  // string:alert_setting_list_contents_mode "목록 보기 설정"
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((d)object0));
                return kotlin.S0.a;
            }
        }


        static final class b extends N implements Function1 {
            final t e;
            final FragmentActivity f;

            b(t t0, FragmentActivity fragmentActivity0) {
                this.e = t0;
                this.f = fragmentActivity0;
                super(1);
            }

            public final void a(@l d l$d0) {
                L.p(l$d0, "$this$section");
                a.d(this.e, l$d0, this.f, 0x7F15004B, 0x7F08026E, null, null, 0, false, null, 0xF8, null);  // string:action_receive_notice "갤러리 알림"
                boolean z = dl.a.p0();
                a.d(this.e, l$d0, this.f, 0x7F150026, 0x7F080234, this.e.k(z), null, 0, false, null, 0xF0, null);  // string:action_block_setting "차단 설정"
                boolean z1 = dl.a.q0();
                a.d(this.e, l$d0, this.f, 0x7F150641, 0x7F0802A9, this.e.k(z1), null, 0, false, null, 0xF0, null);  // string:memo_add_title "이용자 메모"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((d)object0));
                return kotlin.S0.a;
            }
        }


        static final class c extends N implements Function1 {
            final GalleryInfo e;
            final t f;
            final FragmentActivity g;

            c(GalleryInfo galleryInfo0, t t0, FragmentActivity fragmentActivity0) {
                this.e = galleryInfo0;
                this.f = t0;
                this.g = fragmentActivity0;
                super(1);
            }

            public final void a(@l d l$d0) {
                L.p(l$d0, "$this$section");
                if(!this.e.d()) {
                    a.d(this.f, l$d0, this.g, 0x7F150027, 0x7F0802B1, null, null, 0, false, null, 0xF8, null);  // string:action_default_image "자동 짤방 이미지"
                }
                a.d(this.f, l$d0, this.g, 0x7F15004D, 0x7F0802B2, null, null, 0, false, null, 0xF8, null);  // string:action_setting_gallery_text "머리말 · 꼬리말"
                boolean z = dl.a.o0();
                a.d(this.f, l$d0, this.g, 0x7F150023, 0x7F0802A0, this.f.k(z), null, 0, false, null, 0xF0, null);  // string:action_auto_refresh "목록 자동 새로고침"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((d)object0));
                return kotlin.S0.a;
            }
        }

        L.p(s00, "parent");
        L.p(l0, "builder");
        FragmentActivity fragmentActivity0 = s00.getActivity();
        if(fragmentActivity0 == null) {
            return false;
        }
        L.m(fragmentActivity0);
        GalleryInfo galleryInfo0 = s00.I0();
        if(galleryInfo0 == null) {
            return false;
        }
        s00.Q2();
        l0.c(new com.dcinside.app.view.popupmenu.t.a(galleryInfo0, this, fragmentActivity0));
        l0.c(new b(this, fragmentActivity0));
        l0.c(new c(galleryInfo0, this, fragmentActivity0));
        return true;
    }

    // 去混淆评级： 低(20)
    private final Integer k(boolean z) {
        return z ? 0x7F0804E2 : null;  // drawable:ranking_new
    }

    public void l(@l S0 s00, int v) {
        static final class com.dcinside.app.view.popupmenu.t.d extends N implements Function1 {
            final AppCompatActivity e;
            final S0 f;

            com.dcinside.app.view.popupmenu.t.d(AppCompatActivity appCompatActivity0, S0 s00) {
                this.e = appCompatActivity0;
                this.f = s00;
                super(1);
            }

            public final void b(String s) {
                if(com.dcinside.app.internal.c.o(this.e)) {
                    return;
                }
                com.dcinside.app.main.a.l(this.f, s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return kotlin.S0.a;
            }
        }

        L.p(s00, "parent");
        GalleryInfo galleryInfo0 = s00.I0();
        if(galleryInfo0 == null) {
            return;
        }
        FragmentActivity fragmentActivity0 = s00.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        p p0 = s00.g3();
        switch(v) {
            case 0x7F150023: {  // string:action_auto_refresh "목록 자동 새로고침"
                s00.O3();
                dl.a.h4(false);
                return;
            }
            case 0x7F150026: {  // string:action_block_setting "차단 설정"
                Intent intent0 = new Intent(appCompatActivity0, BlockSettingActivity.class);
                intent0.putExtra("galleryId", p0.a);
                intent0.putExtra("galleryName", galleryInfo0.s());
                s00.startActivityForResult(intent0, 1001);
                dl.a.i4(false);
                return;
            }
            case 0x7F150027: {  // string:action_default_image "자동 짤방 이미지"
                String s = galleryInfo0.s();
                if(s == null) {
                    return;
                }
                com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.a.b(DefaultImageSettingActivity.Q, appCompatActivity0, p0.a, s, galleryInfo0.f(), null, 16, null);
                return;
            }
            case 0x7F150030: {  // string:action_gallery_url "갤러리 주소 복사"
                String s1 = galleryInfo0.s();
                if(s1 == null) {
                    return;
                }
                String s2 = uk.ok(galleryInfo0.r(), galleryInfo0.q());
                L.o(s2, "exportUrl(...)");
                Clipboards.a.b(0x7F15021B, s1, s2);  // string:copy_gallery_url_to_clipboard "주소가 복사되었습니다."
                return;
            }
            case 0x7F150032: {  // string:action_page_move "페이지 이동"
                s00.K3();
                return;
            }
            case 0x7F15003D: {  // string:action_post_head_setting "말머리 설정"
                Intent intent1 = new Intent(appCompatActivity0, PostHeadSettingActivity.class);
                intent1.putExtra("com.dcinside.app.extra.GALLERY_INFO", galleryInfo0);
                s00.h3().b(intent1);
                return;
            }
            case 0x7F15004B: {  // string:action_receive_notice "갤러리 알림"
                String s3 = p0.a;
                String s4 = galleryInfo0.s();
                if(s4 == null) {
                    return;
                }
                GalleryPushSettingActivity.B.a(appCompatActivity0, s3, s4, "gallerySettingAction");
                dl.a.a4(false);
                return;
            }
            case 0x7F15004C: {  // string:action_relative_gall "연관 갤러리"
                String s5 = galleryInfo0.s();
                if(s5 == null) {
                    return;
                }
                RelationGalleryActivity.D.a(appCompatActivity0, p0.a, s5, null, null);
                return;
            }
            case 0x7F15004D: {  // string:action_setting_gallery_text "머리말 · 꼬리말"
                String s6 = galleryInfo0.s();
                if(s6 == null) {
                    return;
                }
                GalleryTextOptionSettingActivity.F.a(appCompatActivity0, p0.a, s6);
                return;
            }
            case 0x7F1500B0: {  // string:alert_setting_list_contents_mode "목록 보기 설정"
                com.dcinside.app.rx.bus.c.a(appCompatActivity0, new Q(0, 0));
                return;
            }
            case 0x7F15002F:   // string:action_gallery_info "갤러리 정보(즐찾)"
            case 0x7F1503A6: {  // string:gallery_info_major_title "매니저 운영 정보"
                s00.u4();
                return;
            }
            case 0x7F150641: {  // string:memo_add_title "이용자 메모"
                Intent intent2 = new Intent(appCompatActivity0, UserMemoActivity.class);
                intent2.putExtra("galleryId", p0.a);
                s00.startActivityForResult(intent2, 1002);
                dl.a.j4(false);
                return;
            }
            case 0x7F15056D:   // string:major_manage_title "갤러리 관리"
            case 0x7F15066D:   // string:mini_manage_title "미니 갤러리 관리"
            case 0x7F150678:   // string:minor_manage_title "마이너 갤러리 관리"
            case 0x7F150776: {  // string:person_manage_title "인물 갤러리 관리"
                uk.MF(galleryInfo0).x5((Object object0) -> {
                    L.p(new com.dcinside.app.view.popupmenu.t.d(appCompatActivity0, s00), "$tmp0");
                    new com.dcinside.app.view.popupmenu.t.d(appCompatActivity0, s00).invoke(object0);
                });
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void m(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.base.i
    public void release() {
    }
}

