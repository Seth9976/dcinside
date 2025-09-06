package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface Interceptor {
    public interface Chain {
        @l
        Call call();

        int connectTimeoutMillis();

        @m
        Connection connection();

        @l
        Response proceed(@l Request arg1) throws IOException;

        int readTimeoutMillis();

        @l
        Request request();

        @l
        Chain withConnectTimeout(int arg1, @l TimeUnit arg2);

        @l
        Chain withReadTimeout(int arg1, @l TimeUnit arg2);

        @l
        Chain withWriteTimeout(int arg1, @l TimeUnit arg2);

        int writeTimeoutMillis();
    }

    public static final class Companion {
        static final Companion $$INSTANCE;

        static {
            Companion.$$INSTANCE = new Companion();
        }

        @l
        public final Interceptor invoke(@l Function1 function10) {
            L.p(function10, "block");
            return new Interceptor() {
                @Override  // okhttp3.Interceptor
                @l
                public final Response intercept(@l Chain interceptor$Chain0) {
                    L.p(interceptor$Chain0, "it");
                    return (Response)this.$block.invoke(interceptor$Chain0);
                }
            };
        }
    }

    @l
    public static final Companion Companion;

    static {
        Interceptor.Companion = Companion.$$INSTANCE;
    }

    @l
    Response intercept(@l Chain arg1) throws IOException;
}

