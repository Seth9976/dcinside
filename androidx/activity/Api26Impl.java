package androidx.activity;

import android.app.Activity;
import android.app.PictureInPictureParams.Builder;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(26)
public final class Api26Impl {
    @l
    public static final Api26Impl a;

    static {
        Api26Impl.a = new Api26Impl();
    }

    public final void a(@l Activity activity0, @l Rect rect0) {
        L.p(activity0, "activity");
        L.p(rect0, "hint");
        activity0.setPictureInPictureParams(new PictureInPictureParams.Builder().setSourceRectHint(rect0).build());
    }
}

