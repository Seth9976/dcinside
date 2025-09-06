package U2;

import java.util.Locale;
import kotlin.jvm.internal.L;
import y4.l;

public final class b implements a {
    @Override  // U2.a
    @l
    public String getLanguage() {
        String s = Locale.getDefault().getLanguage();
        L.o(s, "getDefault().language");
        return s;
    }

    // 去混淆评级： 低(30)
    @Override  // U2.a
    @l
    public String getTimeZoneId() {
        L.o("Asia/Shanghai", "getDefault().id");
        return "Asia/Shanghai";
    }
}

