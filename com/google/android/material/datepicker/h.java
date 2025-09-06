package com.google.android.material.datepicker;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.internal.M;

public final class h {
    // 检测为 Lambda 实现
    public static void a(EditText[] arr_editText, View view0, boolean z) [...]

    // 检测为 Lambda 实现
    public static void b(View view0) [...]

    public static void c(@NonNull EditText[] arr_editText) {
        if(arr_editText.length == 0) {
            return;
        }
        f f0 = (View view0, boolean z) -> {
            for(int v = 0; v < arr_editText.length; ++v) {
                if(arr_editText[v].hasFocus()) {
                    return;
                }
            }
            M.r(view0, false);
        };
        for(int v = 0; v < arr_editText.length; ++v) {
            arr_editText[v].setOnFocusChangeListener(f0);
        }
        EditText editText0 = arr_editText[0];
        editText0.postDelayed(() -> M.z(editText0, false), 100L);
    }
}

