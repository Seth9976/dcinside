package androidx.core.os;

import androidx.annotation.IntRange;
import java.util.Locale;

interface LocaleListInterface {
    String a();

    Locale b(String[] arg1);

    @IntRange(from = -1L)
    int c(Locale arg1);

    Locale get(int arg1);

    Object getLocaleList();

    boolean isEmpty();

    @IntRange(from = 0L)
    int size();
}

