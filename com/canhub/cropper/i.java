package com.canhub.cropper;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import kotlin.jvm.functions.Function1;

public final class i implements DialogInterface.OnClickListener {
    public final Function1 a;

    public i(Function1 function10) {
        this.a = function10;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        CropImageActivity.w1(this.a, dialogInterface0, v);
    }
}

