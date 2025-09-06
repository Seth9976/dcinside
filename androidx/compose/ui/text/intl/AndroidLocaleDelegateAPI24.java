package androidx.compose.ui.text.intl;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(api = 24)
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {
    @m
    private LocaleList a;
    @m
    private androidx.compose.ui.text.intl.LocaleList b;
    @l
    private final SynchronizedObject c;

    public AndroidLocaleDelegateAPI24() {
        this.c = Synchronization_jvmKt.a();
    }

    @Override  // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @l
    public androidx.compose.ui.text.intl.LocaleList a() {
        LocaleList localeList0 = LocaleList.getDefault();
        L.o(localeList0, "getDefault()");
        synchronized(this.c) {
            androidx.compose.ui.text.intl.LocaleList localeList1 = this.b;
            if(localeList1 != null && localeList0 == this.a) {
                return localeList1;
            }
            int v1 = localeList0.size();
            ArrayList arrayList0 = new ArrayList(v1);
            for(int v2 = 0; v2 < v1; ++v2) {
                Locale locale0 = localeList0.get(v2);
                L.o(locale0, "platformLocaleList[position]");
                arrayList0.add(new androidx.compose.ui.text.intl.Locale(new AndroidLocale(locale0)));
            }
            androidx.compose.ui.text.intl.LocaleList localeList2 = new androidx.compose.ui.text.intl.LocaleList(arrayList0);
            this.a = localeList0;
            this.b = localeList2;
            return localeList2;
        }
    }

    @Override  // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @l
    public PlatformLocale b(@l String s) {
        L.p(s, "languageTag");
        Locale locale0 = Locale.forLanguageTag(s);
        L.o(locale0, "forLanguageTag(languageTag)");
        return new AndroidLocale(locale0);
    }
}

