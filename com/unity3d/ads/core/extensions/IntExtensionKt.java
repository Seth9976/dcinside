package com.unity3d.ads.core.extensions;

import com.unity3d.ads.adplayer.model.ErrorReason;
import y4.l;

public final class IntExtensionKt {
    @l
    public static final ErrorReason webResourceToErrorReason(int v) {
        switch(v) {
            case -16: {
                return ErrorReason.REASON_WEB_ERROR_UNSAFE_RESOURCE;
            }
            case -15: {
                return ErrorReason.REASON_WEB_ERROR_TOO_MANY_REQUESTS;
            }
            case -14: {
                return ErrorReason.REASON_WEB_ERROR_FILE_NOT_FOUND;
            }
            case -13: {
                return ErrorReason.REASON_WEB_ERROR_FILE;
            }
            case -12: {
                return ErrorReason.REASON_WEB_ERROR_BAD_URL;
            }
            case -11: {
                return ErrorReason.REASON_WEB_ERROR_FAILED_SSL_HANDSHAKE;
            }
            case -10: {
                return ErrorReason.REASON_WEB_ERROR_UNSUPPORTED_SCHEME;
            }
            case -9: {
                return ErrorReason.REASON_WEB_ERROR_REDIRECT_LOOP;
            }
            case -8: {
                return ErrorReason.REASON_WEB_ERROR_TIMEOUT;
            }
            case -7: {
                return ErrorReason.REASON_WEB_ERROR_IO;
            }
            case -6: {
                return ErrorReason.REASON_WEB_ERROR_CONNECT;
            }
            case -5: {
                return ErrorReason.REASON_WEB_ERROR_PROXY_AUTHENTICATION;
            }
            case -4: {
                return ErrorReason.REASON_WEB_ERROR_AUTHENTICATION;
            }
            case -3: {
                return ErrorReason.REASON_WEB_ERROR_UNSUPPORTED_AUTH_SCHEME;
            }
            case -2: {
                return ErrorReason.REASON_WEB_ERROR_HOST_LOOKUP;
            }
            case -1: {
                return ErrorReason.REASON_WEB_ERROR_UNKNOWN;
            }
            default: {
                return ErrorReason.REASON_UNKNOWN;
            }
        }
    }
}

