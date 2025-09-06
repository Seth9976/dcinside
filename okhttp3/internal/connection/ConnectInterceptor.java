package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.L;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import y4.l;

public final class ConnectInterceptor implements Interceptor {
    @l
    public static final ConnectInterceptor INSTANCE;

    static {
        ConnectInterceptor.INSTANCE = new ConnectInterceptor();
    }

    @Override  // okhttp3.Interceptor
    @l
    public Response intercept(@l Chain interceptor$Chain0) throws IOException {
        L.p(interceptor$Chain0, "chain");
        return RealInterceptorChain.copy$okhttp$default(((RealInterceptorChain)interceptor$Chain0), 0, ((RealInterceptorChain)interceptor$Chain0).getCall$okhttp().initExchange$okhttp(((RealInterceptorChain)interceptor$Chain0)), null, 0, 0, 0, 61, null).proceed(((RealInterceptorChain)interceptor$Chain0).getRequest$okhttp());
    }
}

