package androidx.compose.ui.platform;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
public final class AndroidUriHandler implements UriHandler {
    @l
    private final Context a;
    public static final int b = 8;

    static {
    }

    public AndroidUriHandler(@l Context context0) {
        L.p(context0, "context");
        super();
        this.a = context0;
    }

    @Override  // androidx.compose.ui.platform.UriHandler
    public void a(@l String s) {
        L.p(s, "uri");
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
        this.a.startActivity(intent0);
    }
}

