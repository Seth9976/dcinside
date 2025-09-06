package V;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class g {
    @c("gallId")
    @l
    private final String a;
    @c("galleryName")
    @l
    private final String b;
    @c("useHeaderFooterInMainText")
    private boolean c;
    @c("useCommentFooter")
    private boolean d;
    @c("mainTextHeaderTextColor")
    @m
    private String e;
    @c("mainTextHeaderText")
    @m
    private String f;
    @c("mainTextFooterTextColor")
    @m
    private String g;
    @c("mainTextFooterText")
    @m
    private String h;
    @c("commentFooterText")
    @m
    private String i;

    public g(@l String s, @l String s1, boolean z, boolean z1, @m String s2, @m String s3, @m String s4, @m String s5, @m String s6) {
        L.p(s, "galleryId");
        L.p(s1, "galleryName");
        super();
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = z1;
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.h = s5;
        this.i = s6;
    }

    public g(String s, String s1, boolean z, boolean z1, String s2, String s3, String s4, String s5, String s6, int v, w w0) {
        this(s, s1, ((v & 4) == 0 ? z : false), ((v & 8) == 0 ? z1 : false), ((v & 16) == 0 ? s2 : null), ((v & 0x20) == 0 ? s3 : null), ((v & 0x40) == 0 ? s4 : null), ((v & 0x80) == 0 ? s5 : null), ((v & 0x100) == 0 ? s6 : null));
    }

    @l
    public final String a() {
        return this.a;
    }

    @l
    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    @m
    public final String d() {
        return this.i;
    }

    public final boolean e() {
        return this.c;
    }

    @m
    public final String f() {
        return this.f;
    }

    @m
    public final String g() {
        return this.e;
    }

    @m
    public final String h() {
        return this.h;
    }

    @m
    public final String i() {
        return this.g;
    }

    public final void j(boolean z) {
        this.d = z;
    }

    public final void k(@m String s) {
        this.i = s;
    }

    public final void l(boolean z) {
        this.c = z;
    }

    public final void m(@m String s) {
        this.f = s;
    }

    public final void n(@m String s) {
        this.e = s;
    }

    public final void o(@m String s) {
        this.h = s;
    }

    public final void p(@m String s) {
        this.g = s;
    }
}

