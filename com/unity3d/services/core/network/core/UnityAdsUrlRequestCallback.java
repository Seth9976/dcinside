package com.unity3d.services.core.network.core;

import A3.o;
import androidx.annotation.VisibleForTesting;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0.a;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.k;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import y4.l;
import y4.m;

public abstract class UnityAdsUrlRequestCallback extends Callback {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    private static final int BYTE_BUFFER_CAPACITY_BYTES = 0x4000;
    @l
    public static final Companion Companion;
    @l
    private final ByteArrayOutputStream bytesReceived;
    @l
    private final ISDKDispatchers dispatchers;
    private final long readTimeout;
    private final WritableByteChannel receiveChannel;
    @m
    private I0 task;

    static {
        UnityAdsUrlRequestCallback.Companion = new Companion(null);
    }

    public UnityAdsUrlRequestCallback(@l ISDKDispatchers iSDKDispatchers0, long v) {
        L.p(iSDKDispatchers0, "dispatchers");
        super();
        this.dispatchers = iSDKDispatchers0;
        this.readTimeout = v;
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        this.bytesReceived = byteArrayOutputStream0;
        this.receiveChannel = Channels.newChannel(byteArrayOutputStream0);
    }

    private final void cancelTimer() {
        I0 i00 = this.task;
        if(i00 != null) {
            a.b(i00, null, 1, null);
        }
        this.task = null;
    }

    public final long getReadTimeout() {
        return this.readTimeout;
    }

    @m
    public final I0 getTask() {
        return this.task;
    }

    @VisibleForTesting
    public static void getTask$annotations() {
    }

    @Override  // org.chromium.net.UrlRequest$Callback
    public void onCanceled(@m UrlRequest urlRequest0, @m UrlResponseInfo urlResponseInfo0) {
        super.onCanceled(urlRequest0, urlResponseInfo0);
        this.cancelTimer();
    }

    @Override  // org.chromium.net.UrlRequest$Callback
    public void onFailed(@m UrlRequest urlRequest0, @m UrlResponseInfo urlResponseInfo0, @m CronetException cronetException0) {
        this.cancelTimer();
    }

    @Override  // org.chromium.net.UrlRequest$Callback
    public final void onReadCompleted(@l UrlRequest urlRequest0, @l UrlResponseInfo urlResponseInfo0, @l ByteBuffer byteBuffer0) {
        L.p(urlRequest0, "request");
        L.p(urlResponseInfo0, "info");
        L.p(byteBuffer0, "byteBuffer");
        this.cancelTimer();
        byteBuffer0.flip();
        try {
            this.receiveChannel.write(byteBuffer0);
        }
        catch(IOException iOException0) {
            DeviceLog.info("IOException during ByteBuffer read. Details: ", new Object[]{iOException0});
        }
        byteBuffer0.clear();
        this.startTimer(urlRequest0);
        urlRequest0.read(byteBuffer0);
    }

    @Override  // org.chromium.net.UrlRequest$Callback
    public void onRedirectReceived(@l UrlRequest urlRequest0, @m UrlResponseInfo urlResponseInfo0, @m String s) {
        L.p(urlRequest0, "request");
        urlRequest0.followRedirect();
    }

    @Override  // org.chromium.net.UrlRequest$Callback
    public final void onResponseStarted(@l UrlRequest urlRequest0, @l UrlResponseInfo urlResponseInfo0) {
        L.p(urlRequest0, "request");
        L.p(urlResponseInfo0, "info");
        this.startTimer(urlRequest0);
        urlRequest0.read(ByteBuffer.allocateDirect(0x4000));
    }

    @Override  // org.chromium.net.UrlRequest$Callback
    public final void onSucceeded(@l UrlRequest urlRequest0, @l UrlResponseInfo urlResponseInfo0) {
        L.p(urlRequest0, "request");
        L.p(urlResponseInfo0, "info");
        this.cancelTimer();
        byte[] arr_b = this.bytesReceived.toByteArray();
        L.o(arr_b, "bodyBytes");
        this.onSucceeded(urlRequest0, urlResponseInfo0, arr_b);
    }

    public abstract void onSucceeded(@l UrlRequest arg1, @l UrlResponseInfo arg2, @l byte[] arg3);

    public final void setTask(@m I0 i00) {
        this.task = i00;
    }

    public final void startTimer(@l UrlRequest urlRequest0) {
        L.p(urlRequest0, "request");
        this.cancelTimer();
        this.task = k.f(P.a(this.dispatchers.getIo()), null, null, new o(urlRequest0, null) {
            final UrlRequest $request;
            int label;

            {
                UnityAdsUrlRequestCallback.this = unityAdsUrlRequestCallback0;
                this.$request = urlRequest0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback.startTimer.1(UnityAdsUrlRequestCallback.this, this.$request, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback.startTimer.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        this.label = 1;
                        if(a0.b(UnityAdsUrlRequestCallback.this.getReadTimeout(), this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                this.$request.cancel();
                return S0.a;
            }
        }, 3, null);
    }
}

