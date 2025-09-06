package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(29)
public final class WrapperVerificationHelperMethods {
    @l
    public static final WrapperVerificationHelperMethods a;

    static {
        WrapperVerificationHelperMethods.a = new WrapperVerificationHelperMethods();
    }

    @DoNotInline
    @RequiresApi(29)
    @l
    public final Map a(@l View view0) {
        L.p(view0, "view");
        Map map0 = view0.getAttributeSourceResourceMap();
        L.o(map0, "view.attributeSourceResourceMap");
        return map0;
    }
}

