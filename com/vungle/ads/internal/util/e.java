package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vungle.ads.internal.ui.b;
import com.vungle.ads.s0;
import java.net.URISyntaxException;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

public final class e {
    @l
    public static final e INSTANCE = null;
    @l
    private static final String TAG = "ExternalRouter";

    static {
        e.INSTANCE = new e();
    }

    private final Intent getIntentFromUrl(String s, boolean z) {
        Intent intent0 = null;
        try {
            intent0 = s == null || s.length() == 0 ? null : Intent.parseUri(s, 0);
            if(intent0 != null && z) {
                intent0.setFlags(0x10000000);
                return intent0;
            }
        }
        catch(URISyntaxException uRISyntaxException0) {
            p.Companion.e("ExternalRouter", "url format is not correct " + uRISyntaxException0.getLocalizedMessage());
        }
        return intent0;
    }

    @n
    public static final boolean launch(@m String s, @m String s1, @l Context context0, @m o o0, @m b b0) {
        L.p(context0, "context");
        if(s != null && s.length() != 0 || s1 != null && s1.length() != 0) {
            try {
                Intent intent0 = e.INSTANCE.getIntentFromUrl(s, !(context0 instanceof Activity));
                Intent intent1 = e.INSTANCE.getIntentFromUrl(s1, !(context0 instanceof Activity));
                return com.vungle.ads.internal.util.b.Companion.startWhenForeground(context0, intent0, intent1, b0);
            }
            catch(Exception exception0) {
                if(s == null || s.length() == 0) {
                    new s0(com.vungle.ads.internal.protos.Sdk.SDKError.b.LINK_COMMAND_OPEN_FAILED, "Fail to open " + s1).setLogEntry$vungle_ads_release(o0).logErrorNoReturnValue$vungle_ads_release();
                }
                else {
                    new s0(com.vungle.ads.internal.protos.Sdk.SDKError.b.DEEPLINK_OPEN_FAILED, "Fail to open " + s).setLogEntry$vungle_ads_release(o0).logErrorNoReturnValue$vungle_ads_release();
                }
                p.Companion.e("ExternalRouter", "Error while opening url" + exception0.getLocalizedMessage());
                p.Companion.d("ExternalRouter", "Cannot open url " + s1);
            }
        }
        return false;
    }

    public static boolean launch$default(String s, String s1, Context context0, o o0, b b0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 8) != 0) {
            o0 = null;
        }
        if((v & 16) != 0) {
            b0 = null;
        }
        return e.launch(s, s1, context0, o0, b0);
    }
}

