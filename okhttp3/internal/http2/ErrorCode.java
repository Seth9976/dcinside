package okhttp3.internal.http2;

import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public enum ErrorCode {
    @s0({"SMAP\nErrorCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorCode.kt\nokhttp3/internal/http2/ErrorCode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @m
        public final ErrorCode fromHttp2(int v) {
            ErrorCode[] arr_errorCode = ErrorCode.values();
            int v1 = 0;
            while(v1 < arr_errorCode.length) {
                ErrorCode errorCode0 = arr_errorCode[v1];
                if(errorCode0.getHttpCode() != v) {
                    ++v1;
                    continue;
                }
                return errorCode0;
            }
            return null;
        }
    }

    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    @l
    public static final Companion Companion;
    private final int httpCode;

    private static final ErrorCode[] $values() [...] // Inlined contents

    static {
        ErrorCode.Companion = new Companion(null);
    }

    private ErrorCode(int v1) {
        this.httpCode = v1;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}

