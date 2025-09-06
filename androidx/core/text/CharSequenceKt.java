package androidx.core.text;

import android.text.TextUtils;
import y4.l;

public final class CharSequenceKt {
    public static final boolean a(@l CharSequence charSequence0) {
        return TextUtils.isDigitsOnly(charSequence0);
    }

    public static final int b(@l CharSequence charSequence0) {
        return TextUtils.getTrimmedLength(charSequence0);
    }
}

