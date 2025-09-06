package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(33)
class Api33Impl {
    @DoNotInline
    static Object a(@NonNull Bundle bundle0, @Nullable String s, @NonNull Class class0) {
        return bundle0.getParcelable(s, class0);
    }
}

