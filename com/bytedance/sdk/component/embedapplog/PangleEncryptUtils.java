package com.bytedance.sdk.component.embedapplog;

import android.util.Log;

class PangleEncryptUtils {
    static {
        try {
            System.loadLibrary("tobEmbedPagEncrypt");
        }
        catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
            Log.e("pangle-encrypt", unsatisfiedLinkError0.getMessage());
        }
    }

    static byte[] decrypt(byte[] arr_b, int v) {
        try {
            return PangleEncryptUtils.ttDecrypt(arr_b, v);
        }
        catch(Throwable throwable0) {
            Log.e("pangle-encrypt", "decrypt exception " + throwable0.getMessage());
            return null;
        }
    }

    static byte[] encrypt(byte[] arr_b, int v) {
        try {
            return PangleEncryptUtils.ttEncrypt(arr_b, v);
        }
        catch(Throwable throwable0) {
            Log.e("pangle-encrypt", "encrypt exception " + throwable0.getMessage());
            return null;
        }
    }

    private static native byte[] ttDecrypt(byte[] arg0, int arg1) {
    }

    private static native byte[] ttEncrypt(byte[] arg0, int arg1) {
    }
}

