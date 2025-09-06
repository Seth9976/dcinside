package androidx.appcompat.widget;

import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class TooltipCompat {
    @RequiresApi(26)
    static class Api26Impl {
        @DoNotInline
        static void a(View view0, CharSequence charSequence0) {
            view0.setTooltipText(charSequence0);
        }
    }

    public static void a(@NonNull View view0, @Nullable CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.a(view0, charSequence0);
            return;
        }
        TooltipCompatHandler.h(view0, charSequence0);
    }
}

