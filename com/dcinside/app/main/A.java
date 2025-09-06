package com.dcinside.app.main;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.TaskStackBuilder;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.dcinside.app.backup.BackupActivity;
import com.dcinside.app.browser.AwesomeWebView.Builder;
import com.dcinside.app.image.ImageDownloadWorker;
import com.dcinside.app.internal.c;
import com.dcinside.app.perform.e;
import com.dcinside.app.post.c0;
import com.dcinside.app.settings.SettingActivity;
import com.dcinside.app.totalsearch.TotalSearchActivity;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.Yk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.vk;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import timber.log.b;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nGalleryMoves.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryMoves.kt\ncom/dcinside/app/main/GalleryMoves\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,383:1\n1#2:384\n177#3,9:385\n29#4:394\n*S KotlinDebug\n*F\n+ 1 GalleryMoves.kt\ncom/dcinside/app/main/GalleryMoves\n*L\n176#1:385,9\n243#1:394\n*E\n"})
public final class a {
    public static final class com.dcinside.app.main.a.a {
        @m
        private final String a;
        @m
        private final String b;
        @l
        private final com.dcinside.app.type.m c;
        @m
        private final String d;

        public com.dcinside.app.main.a.a(@m String s, @m String s1, @l com.dcinside.app.type.m m0, @m String s2) {
            L.p(m0, "galleryGrade");
            super();
            this.a = s;
            this.b = s1;
            this.c = m0;
            this.d = s2;
        }

        @m
        public final String a() {
            return this.a;
        }

        @m
        public final String b() {
            return this.b;
        }

        @l
        public final com.dcinside.app.type.m c() {
            return this.c;
        }

        @m
        public final String d() {
            return this.d;
        }

        @l
        public final com.dcinside.app.main.a.a e(@m String s, @m String s1, @l com.dcinside.app.type.m m0, @m String s2) {
            L.p(m0, "galleryGrade");
            return new com.dcinside.app.main.a.a(s, s1, m0, s2);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.dcinside.app.main.a.a)) {
                return false;
            }
            if(!L.g(this.a, ((com.dcinside.app.main.a.a)object0).a)) {
                return false;
            }
            if(!L.g(this.b, ((com.dcinside.app.main.a.a)object0).b)) {
                return false;
            }
            return this.c == ((com.dcinside.app.main.a.a)object0).c ? L.g(this.d, ((com.dcinside.app.main.a.a)object0).d) : false;
        }

        public static com.dcinside.app.main.a.a f(com.dcinside.app.main.a.a a$a0, String s, String s1, com.dcinside.app.type.m m0, String s2, int v, Object object0) {
            if((v & 1) != 0) {
                s = a$a0.a;
            }
            if((v & 2) != 0) {
                s1 = a$a0.b;
            }
            if((v & 4) != 0) {
                m0 = a$a0.c;
            }
            if((v & 8) != 0) {
                s2 = a$a0.d;
            }
            return a$a0.e(s, s1, m0, s2);
        }

        @m
        public final String g() {
            return this.a;
        }

        @l
        public final com.dcinside.app.type.m h() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            int v2 = this.b == null ? 0 : this.b.hashCode();
            int v3 = this.c.hashCode();
            String s = this.d;
            if(s != null) {
                v = s.hashCode();
            }
            return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
        }

        @m
        public final String i() {
            return this.b;
        }

        @m
        public final String j() {
            return this.d;
        }

        @Override
        @l
        public String toString() {
            return "SchemeDataParam(gallId=" + this.a + ", postNo=" + this.b + ", galleryGrade=" + this.c + ", searchKeyword=" + this.d + ")";
        }
    }

    @l
    public static final a a;

    static {
        a.a = new a();
    }

    private final void a(AppCompatActivity appCompatActivity0, Intent intent0) {
        int v;
        if(intent0 != null) {
            Uri uri0 = intent0.getData();
            if(uri0 != null) {
                String s = uri0.getScheme();
                u0 u00 = null;
                if(!L.g("dcauth", s) && !L.g("otpauth", s)) {
                    if(s != null && (v.v2(s, "http", false, 2, null) || L.g("dcapp", s))) {
                        com.dcinside.app.main.a.a a$a0 = this.e(uri0, Yk.m.match(uri0));
                        String s1 = a$a0.a();
                        String s2 = a$a0.b();
                        if(a$a0.d() != null) {
                            return;
                        }
                        if(s1 != null && s1.length() != 0) {
                            try {
                                if(s2 == null) {
                                    v = 0;
                                }
                                else if(s2.length() > 0) {
                                    v = Integer.parseInt(s2);
                                }
                                else {
                                    v = 0;
                                }
                                u00 = v;
                            }
                            catch(Exception unused_ex) {
                            }
                            L.o(s1, "let(...)");
                            new com.dcinside.app.util.Xk.a(s1, (u00 == null ? 0 : ((int)(((Integer)u00)))), 0, null, false, true, false, false, false, false, null, false, null, null, 0x3FDC, null).a(appCompatActivity0);
                            return;
                        }
                    }
                    return;
                }
                if(appCompatActivity0 instanceof u0) {
                    u00 = (u0)appCompatActivity0;
                }
                if(u00 != null) {
                    u00.Z2(uri0.toString());
                }
            }
        }
    }

    @n
    public static final boolean b(@l AppCompatActivity appCompatActivity0, @m String s) {
        L.p(appCompatActivity0, "activity");
        if(s == null) {
            return false;
        }
        if(v.v2(s, "http", false, 2, null)) {
            if(a.c(appCompatActivity0, s)) {
                return true;
            }
            a.i(appCompatActivity0, s);
            return true;
        }
        if(v.v2(s, "ignore", false, 2, null)) {
            return false;
        }
        if(v.v2(s, "mailto:", false, 2, null)) {
            appCompatActivity0.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(s)));
            return true;
        }
        if(v.v2(s, "intent:", false, 2, null)) {
            try {
                Intent intent0 = Intent.parseUri(s, 1);
                intent0.addCategory("android.intent.category.BROWSABLE");
                intent0.setComponent(null);
                intent0.setSelector(null);
                PackageManager packageManager0 = appCompatActivity0.getPackageManager();
                String s1 = intent0.getPackage();
                if(s1 != null) {
                    if(packageManager0.getLaunchIntentForPackage(s1) != null) {
                        appCompatActivity0.startActivity(intent0);
                        return true;
                    }
                    Intent intent1 = new Intent("android.intent.action.VIEW");
                    intent1.setData(Uri.parse(("market://details?id=" + s1)));
                    appCompatActivity0.startActivity(intent1);
                    return true;
                }
            }
            catch(Exception exception0) {
                b.a.y(exception0);
            }
            Dl.D(appCompatActivity0, 0x7F150328);  // string:failed_open_urls "링크를 열 수 없습니다."
            return true;
        }
        a.i(appCompatActivity0, s);
        return true;
    }

    @n
    public static final boolean c(@m AppCompatActivity appCompatActivity0, @m String s) {
        static final class com.dcinside.app.main.a.b extends N implements Function1 {
            public static final com.dcinside.app.main.a.b e;

            static {
                com.dcinside.app.main.a.b.e = new com.dcinside.app.main.a.b();
            }

            com.dcinside.app.main.a.b() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "builder");
                return p$a0.m(0x7F1501C8);  // string:cannot_find_post "작성자가 삭제했거나 존재하지 않는 게시물입니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }

        int v1;
        int v2;
        if(appCompatActivity0 == null) {
            return false;
        }
        if(s != null) {
            Uri uri0 = Uri.parse(s);
            if(uri0 != null) {
                int v = Yk.m.match(uri0);
                com.dcinside.app.main.a.a a$a0 = a.a.e(uri0, v);
                if(v == 16) {
                    a$a0 = null;
                }
                if(a$a0 == null) {
                    return false;
                }
                String s1 = a$a0.a();
                String s2 = a$a0.b();
                String s3 = a$a0.d();
                if(s3 != null && s3.length() > 0) {
                    TotalSearchActivity.C2(appCompatActivity0, s3, true);
                    return true;
                }
                if(s1 != null && s1.length() > 0) {
                    if(s2 == null) {
                        goto label_24;
                    label_27:
                        if(exception0 instanceof NumberFormatException) {
                            e.e.a(appCompatActivity0).n(com.dcinside.app.main.a.b.e).z(0x7F1501F2).b().t5();  // string:close "닫기"
                            return true;
                        }
                        v2 = 0;
                        L.o(s1, "toString(...)");
                        Xk.j(appCompatActivity0, s1, v2, true, true, v2 > 0);
                        return true;
                    }
                    else {
                        try {
                            if(s2.length() == 0) {
                                v1 = 0;
                                goto label_32;
                            label_24:
                                v1 = 0;
                            }
                            else {
                                v1 = Integer.parseInt(s2);
                            }
                        }
                        catch(Exception exception0) {
                            goto label_27;
                        }
                    }
                label_32:
                    v2 = v1;
                    L.o(s1, "toString(...)");
                    Xk.j(appCompatActivity0, s1, v2, true, true, v2 > 0);
                    return true;
                }
            }
        }
        return false;
    }

    @m
    @n
    public static final Builder d(@m Activity activity0) {
        if(activity0 != null) {
            try {
                if(c.n(activity0)) {
                    int v = vk.b(activity0, 0x7F040219);  // attr:dcToolbarColor
                    int v1 = vk.b(activity0, 0x7F04021E);  // attr:dcToolbarTextColor
                    Builder awesomeWebView$Builder0 = new Builder(activity0, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -1, -1, -1, 1, null).s(true).J6(true).Z6(true).G5(false).k6(0x7F1500C0).s6(false).T5(v).p6(v).h6(v1).t6(v1).c2(v1).L2(v).V5(dl.a.q2().l());  // string:app_name "디시인사이드"
                    if(vk.a(activity0, 0x7F04021B)) {  // attr:dcToolbarDividerShow
                        awesomeWebView$Builder0.o(vk.d(activity0, 0x7F04021C)).l(vk.b(activity0, 0x7F04021A)).C5(true).a2(false);  // attr:dcToolbarDividerSize
                    }
                    awesomeWebView$Builder0.g7(0);
                    return awesomeWebView$Builder0;
                }
                return null;
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    @l
    public final com.dcinside.app.main.a.a e(@l Uri uri0, int v) {
        String s11;
        String s9;
        String s7;
        String s5;
        L.p(uri0, "<this>");
        switch(v) {
            case 2: {
                String s = uri0.getQueryParameter("id");
                String s1 = s == null ? null : v.G5(s).toString();
                String s2 = uri0.getQueryParameter("no");
                String s3 = s2 == null ? null : v.G5(s2).toString();
                boolean z = this.f(uri0, 2);
                boolean z1 = this.g(uri0, 2);
                if(z) {
                    return new com.dcinside.app.main.a.a(s1, s3, com.dcinside.app.type.m.i, null);
                }
                return z1 ? new com.dcinside.app.main.a.a(s1, s3, com.dcinside.app.type.m.j, null) : new com.dcinside.app.main.a.a(s1, s3, com.dcinside.app.type.m.g, null);
            }
            case 4: {
                List list0 = uri0.getPathSegments();
                if(list0 == null) {
                    s5 = null;
                }
                else {
                    List list1 = list0.isEmpty() ? null : list0;
                    if(list1 == null) {
                        s5 = null;
                    }
                    else {
                        String s4 = (String)list1.get(0);
                        s5 = s4 == null ? null : v.G5(s4).toString();
                    }
                }
                if(list0 == null) {
                    s7 = null;
                }
                else {
                    if(list0.size() <= 1) {
                        list0 = null;
                    }
                    if(list0 == null) {
                        s7 = null;
                    }
                    else {
                        String s6 = (String)list0.get(1);
                        s7 = s6 == null ? null : v.G5(s6).toString();
                    }
                }
                boolean z2 = this.f(uri0, 4);
                boolean z3 = this.g(uri0, 4);
                if(z2) {
                    return new com.dcinside.app.main.a.a(s5, s7, com.dcinside.app.type.m.i, null);
                }
                return z3 ? new com.dcinside.app.main.a.a(s5, s7, com.dcinside.app.type.m.j, null) : new com.dcinside.app.main.a.a(s5, s7, com.dcinside.app.type.m.g, null);
            }
            case 8: {
                List list2 = uri0.getPathSegments();
                if(list2 == null) {
                    s9 = null;
                }
                else {
                    List list3 = list2.size() <= 1 ? null : list2;
                    if(list3 == null) {
                        s9 = null;
                    }
                    else {
                        String s8 = (String)list3.get(1);
                        s9 = s8 == null ? null : v.G5(s8).toString();
                    }
                }
                if(list2 == null) {
                    s11 = null;
                }
                else {
                    if(list2.size() <= 2) {
                        list2 = null;
                    }
                    if(list2 == null) {
                        s11 = null;
                    }
                    else {
                        String s10 = (String)list2.get(2);
                        s11 = s10 == null ? null : v.G5(s10).toString();
                    }
                }
                boolean z4 = this.f(uri0, 8);
                boolean z5 = this.g(uri0, 8);
                if(z4) {
                    return new com.dcinside.app.main.a.a(s9, s11, com.dcinside.app.type.m.i, null);
                }
                return z5 ? new com.dcinside.app.main.a.a(s9, s11, com.dcinside.app.type.m.j, null) : new com.dcinside.app.main.a.a(s9, s11, com.dcinside.app.type.m.g, null);
            }
            case 0x20: {
                String s12 = uri0.getQueryParameter("keyword");
                return new com.dcinside.app.main.a.a(null, null, com.dcinside.app.type.m.g, s12);
            }
            default: {
                return new com.dcinside.app.main.a.a(null, null, com.dcinside.app.type.m.g, null);
            }
        }
    }

    private final boolean f(Uri uri0, int v) {
        if(v == 2 || v == 4 || v == 8) {
            List list0 = uri0.getPathSegments();
            String s = null;
            if(list0 != null) {
                if(list0.size() <= 0) {
                    list0 = null;
                }
                if(list0 != null) {
                    s = (String)list0.get(0);
                }
            }
            return L.g(s, "mini");
        }
        return false;
    }

    private final boolean g(Uri uri0, int v) {
        if(v == 2 || v == 4 || v == 8) {
            List list0 = uri0.getPathSegments();
            String s = null;
            if(list0 != null) {
                if(list0.size() <= 0) {
                    list0 = null;
                }
                if(list0 != null) {
                    s = (String)list0.get(0);
                }
            }
            return L.g(s, "person");
        }
        return false;
    }

    @n
    public static final void h(@l AppCompatActivity appCompatActivity0, @m Intent intent0) {
        L.p(appCompatActivity0, "activity");
        if(intent0 == null) {
            return;
        }
        try {
            String s = intent0.getAction();
            if(s == null) {
                return;
            }
            Class class0 = HomeActivity.class;
            switch(s) {
                case "actionShortEntered": 
                case "com.dcinside.app.action.ACTION_OPEN_GALLERY_WHEN_RESTART": {
                    String s2 = intent0.getStringExtra("shortcutGallery");
                    if(s2 == null) {
                        s2 = intent0.getStringExtra("com.dcinside.app.extra.GALLERY_ID");
                        if(s2 == null) {
                            return;
                        }
                    }
                    Xk.i(appCompatActivity0, s2);
                    return;
                }
                case "android.intent.action.VIEW": {
                    a.a.a(appCompatActivity0, intent0);
                    return;
                }
                case "autoBackupNotificationAction": {
                    TaskStackBuilder taskStackBuilder1 = TaskStackBuilder.h(appCompatActivity0);
                    taskStackBuilder1.b(new Intent(appCompatActivity0, class0));
                    taskStackBuilder1.a(new Intent(appCompatActivity0, SettingActivity.class));
                    taskStackBuilder1.a(new Intent(appCompatActivity0, BackupActivity.class));
                    taskStackBuilder1.r();
                    break;
                }
                case "com.dcinside.app.action.OPEN_READ_WHEN_RESTART": {
                    String s1 = intent0.getStringExtra("com.dcinside.app.extra.GALLERY_ID");
                    int v = intent0.getIntExtra("com.dcinside.app.extra.POST_NUMBER", 0);
                    if(s1 != null && v != 0) {
                        TaskStackBuilder taskStackBuilder0 = TaskStackBuilder.h(appCompatActivity0);
                        taskStackBuilder0.b(new Intent(appCompatActivity0, class0));
                        Intent intent1 = new Intent(appCompatActivity0, c0.class);
                        intent1.putExtra("com.dcinside.app.extra.GALLERY_ID", s1);
                        intent1.putExtra("com.dcinside.app.extra.POST_NUMBER", v);
                        taskStackBuilder0.a(intent1);
                        taskStackBuilder0.r();
                        return;
                    }
                    return;
                }
                case "com.dcinside.app.action.RETRY_DOWNLOAD": {
                    String s3 = intent0.getStringExtra("download_fail_data");
                    ImageDownloadWorker.a.a(s3);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @n
    public static final void i(@l AppCompatActivity appCompatActivity0, @m String s) {
        L.p(appCompatActivity0, "activity");
        if(s == null) {
            return;
        }
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
        if(v.W2(s, "gall.dcinside.com", false, 2, null) || v.W2(s, "m.dcinside.com", false, 2, null) || v.W2(s, "app.dcinside.com", false, 2, null)) {
            try {
                intent0.addCategory("android.intent.category.BROWSABLE");
                appCompatActivity0.startActivity(intent0);
                return;
            }
            catch(Exception unused_ex) {
            }
        }
        try {
            intent0.addFlags(0x10000000);
            appCompatActivity0.startActivity(intent0);
        }
        catch(Exception exception0) {
            b.a.y(exception0);
            a.j(appCompatActivity0, s);
        }
    }

    @n
    public static final void j(@l AppCompatActivity appCompatActivity0, @m String s) {
        L.p(appCompatActivity0, "activity");
        if(s == null) {
            return;
        }
        try {
            Builder awesomeWebView$Builder0 = a.d(appCompatActivity0);
            if(awesomeWebView$Builder0 != null) {
                Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.R5(appCompatActivity0, 1030);
                if(awesomeWebView$Builder1 != null) {
                    awesomeWebView$Builder1.y5(s);
                }
            }
        }
        catch(Exception exception0) {
            b.a.y(exception0);
        }
    }

    @n
    public static final void k(@l AppCompatActivity appCompatActivity0, @m String s, boolean z) {
        L.p(appCompatActivity0, "activity");
        if(s == null) {
            return;
        }
        try {
            Builder awesomeWebView$Builder0 = a.d(appCompatActivity0);
            if(awesomeWebView$Builder0 != null) {
                Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.R5(appCompatActivity0, 1030);
                if(awesomeWebView$Builder1 != null) {
                    Builder awesomeWebView$Builder2 = awesomeWebView$Builder1.q7(z);
                    if(awesomeWebView$Builder2 != null) {
                        awesomeWebView$Builder2.y5(s);
                    }
                }
            }
        }
        catch(Exception exception0) {
            b.a.y(exception0);
        }
    }

    @n
    public static final void l(@l Fragment fragment0, @m String s) {
        L.p(fragment0, "fragment");
        if(s == null) {
            return;
        }
        try {
            FragmentActivity fragmentActivity0 = fragment0.getActivity();
            if(fragmentActivity0 == null) {
                return;
            }
            Builder awesomeWebView$Builder0 = a.d(fragmentActivity0);
            if(awesomeWebView$Builder0 != null) {
                Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.S5(fragment0, 1030);
                if(awesomeWebView$Builder1 != null) {
                    awesomeWebView$Builder1.y5(s);
                }
            }
        }
        catch(Exception exception0) {
            b.a.y(exception0);
        }
    }
}

