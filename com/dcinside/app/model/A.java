package com.dcinside.app.model;

import com.dcinside.app.http.f;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.xk;
import com.google.gson.annotations.c;
import rx.g;

public class a {
    @c("result")
    private boolean a;
    @c("cause")
    private String b;
    @c("ver")
    private String c;
    @c("notice")
    private boolean d;
    @c("notice_update")
    private boolean e;
    @c("gall_id")
    private String f;
    @c("date")
    private String g;

    public static g a(String s) {
        try {
            a a0 = (a)c0.a.a.a(uk.a, s, a.class);
            if(a0 != null) {
                return m0.a.i(a0.c()) || !a0.g() ? g.X1(new f(0x7F15030C, new Object[]{a0.b()})) : g.Q2(a0);  // string:failed_app_launch "앱을 실행할 수 없습니다. (%1$s)"
            }
        }
        catch(Exception exception0) {
            return xk.r(s, exception0);
        }
        return xk.r(s, new f(0x7F15030C, new Object[]{"-"}));  // string:failed_app_launch "앱을 실행할 수 없습니다. (%1$s)"
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.g;
    }

    public String d() {
        return this.f;
    }

    public String e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.a;
    }

    public boolean h() {
        return this.e;
    }
}

