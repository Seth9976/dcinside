package com.bytedance.sdk.openadsdk.core.Zh;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.Owx;

public abstract class JQp extends PjT {
    public JQp(@NonNull Context context0, @NonNull Owx owx0, @NonNull String s, int v) {
        super(context0, owx0, s, v);
    }

    protected abstract void PjT(View arg1, float arg2, float arg3, float arg4, float arg5, SparseArray arg6, int arg7, int arg8, int arg9, boolean arg10);

    @Override  // com.bytedance.sdk.openadsdk.core.Zh.PjT
    public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
        if(this.PjT(view0, z)) {
            this.PjT(view0, f, f1, f2, f3, sparseArray0, this.KM, this.iZZ, this.Yo, z);
        }
        super.PjT(view0, f, f1, f2, f3, sparseArray0, z);
    }
}

