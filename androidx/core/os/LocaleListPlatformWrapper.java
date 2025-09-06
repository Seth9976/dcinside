package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi(24)
final class LocaleListPlatformWrapper implements LocaleListInterface {
    private final LocaleList a;

    LocaleListPlatformWrapper(Object object0) {
        this.a = (LocaleList)object0;
    }

    @Override  // androidx.core.os.LocaleListInterface
    public String a() {
        return this.a.toLanguageTags();
    }

    @Override  // androidx.core.os.LocaleListInterface
    public Locale b(String[] arr_s) {
        return this.a.getFirstMatch(arr_s);
    }

    @Override  // androidx.core.os.LocaleListInterface
    public int c(Locale locale0) {
        return this.a.indexOf(locale0);
    }

    @Override
    public boolean equals(Object object0) {
        Object object1 = ((LocaleListInterface)object0).getLocaleList();
        return this.a.equals(object1);
    }

    @Override  // androidx.core.os.LocaleListInterface
    public Locale get(int v) {
        return this.a.get(v);
    }

    @Override  // androidx.core.os.LocaleListInterface
    public Object getLocaleList() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override  // androidx.core.os.LocaleListInterface
    public int size() {
        return this.a.size();
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

