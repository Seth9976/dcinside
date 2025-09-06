package com.dcinside.app.read;

import android.content.Context;
import androidx.appcompat.app.AlertDialog;
import com.dcinside.app.view.ShareView;
import kotlin.jvm.internal.L;
import y4.l;

public final class S0 extends AlertDialog {
    public S0(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        this.z(new ShareView(context0, null, 0, 6, null));
    }
}

