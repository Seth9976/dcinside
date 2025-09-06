package g0;

import com.google.gson.annotations.c;
import java.util.List;
import y4.m;

public final class d {
    public static final class a {
        @c("idx")
        @m
        private String a;
        @c("title")
        @m
        private String b;
        @c("message")
        @m
        private String c;
        @c("gallery_id")
        @m
        private String d;
        @c("content_no")
        @m
        private String e;
        @c("comment_content")
        @m
        private String f;
        @c("writer_nick")
        @m
        private String g;
        @c("alarm_type")
        @m
        private String h;
        @c("gall_ko_name")
        @m
        private String i;
        @c("comment_cnt")
        @m
        private Integer j;
        @c("regdate")
        @m
        private String k;
        @c("type")
        @m
        private String l;
        @c("user_id")
        @m
        private String m;
        @c("ip")
        @m
        private String n;
        @c("comment_nick")
        @m
        private String o;
        @c("comment_no")
        private int p;
        @com.dcinside.app.util.Ik.a
        @m
        private b q;
        @com.dcinside.app.util.Ik.a
        private boolean r;

        public final void A(@m String s) {
            this.a = s;
        }

        public final void B(@m String s) {
            this.n = s;
        }

        public final void C(@m String s) {
            this.c = s;
        }

        public final void D(@m String s) {
            this.e = s;
        }

        public final void E(int v) {
            this.p = v;
        }

        public final void F(@m String s) {
            this.l = s;
        }

        public final void G(@m b b0) {
            this.q = b0;
        }

        public final void H(@m String s) {
            this.b = s;
        }

        public final void I(@m String s) {
            this.m = s;
        }

        public final void J(@m String s) {
            this.g = s;
        }

        @m
        public final String a() {
            return this.h;
        }

        @m
        public final String b() {
            return this.o;
        }

        @m
        public final String c() {
            return this.f;
        }

        @m
        public final Integer d() {
            return this.j;
        }

        @m
        public final String e() {
            return this.k;
        }

        @m
        public final String f() {
            return this.d;
        }

        @m
        public final String g() {
            return this.i;
        }

        @m
        public final String h() {
            return this.a;
        }

        @m
        public final String i() {
            return this.n;
        }

        @m
        public final String j() {
            return this.c;
        }

        @m
        public final String k() {
            return this.e;
        }

        public final int l() {
            return this.p;
        }

        @m
        public final String m() {
            return this.l;
        }

        @m
        public final b n() {
            return this.q;
        }

        @m
        public final String o() {
            return this.b;
        }

        @m
        public final String p() {
            return this.m;
        }

        @m
        public final String q() {
            return this.g;
        }

        public final boolean r() {
            return this.r;
        }

        public final void s(@m String s) {
            this.h = s;
        }

        public final void t(@m String s) {
            this.o = s;
        }

        public final void u(boolean z) {
            this.r = z;
        }

        public final void v(@m String s) {
            this.f = s;
        }

        public final void w(@m Integer integer0) {
            this.j = integer0;
        }

        public final void x(@m String s) {
            this.k = s;
        }

        public final void y(@m String s) {
            this.d = s;
        }

        public final void z(@m String s) {
            this.i = s;
        }
    }

    @c("lists")
    @m
    private List a;

    @m
    public final List a() {
        return this.a;
    }

    public final void b(@m List list0) {
        this.a = list0;
    }
}

