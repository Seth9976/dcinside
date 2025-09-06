package com.dcinside.app.settings.text;

import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import top.defaults.colorpicker.ColorPickerView;

public final class e implements DialogInterface.OnDismissListener {
    public final ColorPickerView a;
    public final top.defaults.colorpicker.e b;

    public e(ColorPickerView colorPickerView0, top.defaults.colorpicker.e e0) {
        this.a = colorPickerView0;
        this.b = e0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        GalleryTextOptionSettingActivity.E2(this.a, this.b, dialogInterface0);
    }
}

