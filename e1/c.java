package E1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R.dimen;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.D;

@RestrictTo({Scope.b})
public class c {
    @NonNull
    public static Rect a(@NonNull Context context0, @AttrRes int v, int v1) {
        TypedArray typedArray0 = D.k(context0, null, styleable.MaterialAlertDialog, v, v1, new int[0]);
        int v2 = context0.getResources().getDimensionPixelSize(dimen.mtrl_alert_dialog_background_inset_start);
        int v3 = typedArray0.getDimensionPixelSize(styleable.MaterialAlertDialog_backgroundInsetStart, v2);
        int v4 = context0.getResources().getDimensionPixelSize(dimen.mtrl_alert_dialog_background_inset_top);
        int v5 = typedArray0.getDimensionPixelSize(styleable.MaterialAlertDialog_backgroundInsetTop, v4);
        int v6 = context0.getResources().getDimensionPixelSize(dimen.mtrl_alert_dialog_background_inset_end);
        int v7 = typedArray0.getDimensionPixelSize(styleable.MaterialAlertDialog_backgroundInsetEnd, v6);
        int v8 = context0.getResources().getDimensionPixelSize(dimen.mtrl_alert_dialog_background_inset_bottom);
        int v9 = typedArray0.getDimensionPixelSize(styleable.MaterialAlertDialog_backgroundInsetBottom, v8);
        typedArray0.recycle();
        if(context0.getResources().getConfiguration().getLayoutDirection() == 1) {
            int v10 = v7;
            v7 = v3;
            v3 = v10;
        }
        return new Rect(v3, v5, v7, v9);
    }

    @NonNull
    public static InsetDrawable b(@Nullable Drawable drawable0, @NonNull Rect rect0) {
        return new InsetDrawable(drawable0, rect0.left, rect0.top, rect0.right, rect0.bottom);
    }
}

