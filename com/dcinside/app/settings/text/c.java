package com.dcinside.app.settings.text;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import kotlin.jvm.functions.Function1;
import top.defaults.colorpicker.ColorPickerView;

public final class c implements DialogInterface.OnClickListener {
    public final Function1 a;
    public final ColorPickerView b;

    public c(Function1 function10, ColorPickerView colorPickerView0) {
        this.a = function10;
        this.b = colorPickerView0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        GalleryTextOptionSettingActivity.C2(this.a, this.b, dialogInterface0, v);
    }
}

