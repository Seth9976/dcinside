package androidx.core.telephony.mbms;

import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.mbms.ServiceInfo;
import androidx.annotation.RequiresApi;
import java.util.Locale;
import java.util.Set;

public final class MbmsHelper {
    @RequiresApi(28)
    static class Api28Impl {
        static CharSequence a(Context context0, ServiceInfo serviceInfo0) {
            Set set0 = serviceInfo0.getNamedContentLocales();
            if(set0.isEmpty()) {
                return null;
            }
            String[] arr_s = new String[set0.size()];
            int v = 0;
            for(Object object0: serviceInfo0.getNamedContentLocales()) {
                arr_s[v] = ((Locale)object0).toLanguageTag();
                ++v;
            }
            Locale locale0 = context0.getResources().getConfiguration().getLocales().getFirstMatch(arr_s);
            return locale0 == null ? null : serviceInfo0.getNameForLocale(locale0);
        }
    }

    public static CharSequence a(Context context0, ServiceInfo serviceInfo0) {
        return Build.VERSION.SDK_INT < 28 ? null : Api28Impl.a(context0, serviceInfo0);
    }
}

