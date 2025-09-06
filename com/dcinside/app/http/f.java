package com.dcinside.app.http;

import androidx.annotation.StringRes;
import com.dcinside.app.Application;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class f extends RuntimeException {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final String d(@StringRes int v) {
            String s = Application.e.c().getString(v);
            L.o(s, "getString(...)");
            return s;
        }

        private final String e(@StringRes int v, Object[] arr_object) {
            String s = Application.e.c().getString(v, Arrays.copyOf(arr_object, arr_object.length));
            L.o(s, "getString(...)");
            return s;
        }

        private final String f(Throwable throwable0) {
            if(throwable0 instanceof UnknownHostException) {
                return this.d(0x7F1502FB);  // string:failed_access_internet "인터넷에 연결할 수 없습니다."
            }
            if(throwable0 instanceof SocketTimeoutException) {
                return this.d(0x7F1502FE);  // string:failed_access_timeout "서버에서 응답하지 않습니다."
            }
            return throwable0 instanceof ConnectException ? this.d(0x7F1502FB) : throwable0.getMessage();  // string:failed_access_internet "인터넷에 연결할 수 없습니다."
        }
    }

    @m
    private final Boolean a;
    @l
    public static final a b;

    static {
        f.b = new a(null);
    }

    public f(@StringRes int v) {
        super(f.b.d(v));
        this.a = null;
    }

    public f(@StringRes int v, @m Exception exception0) {
        super(f.b.d(v), exception0);
        this.a = null;
    }

    public f(@StringRes int v, @l Object[] arr_object) {
        L.p(arr_object, "cause");
        super(f.b.e(v, new Object[]{arr_object}));
        this.a = null;
    }

    public f(@m String s) {
        super(s);
        this.a = null;
    }

    public f(@m String s, @m Boolean boolean0) {
        super(s);
        this.a = boolean0;
    }

    public f(@l Throwable throwable0) {
        L.p(throwable0, "throwable");
        super(f.b.f(throwable0), throwable0);
        this.a = null;
    }

    @m
    public final Boolean a() {
        return this.a;
    }
}

