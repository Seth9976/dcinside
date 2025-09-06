package S0;

import android.net.Uri;
import com.facebook.common.internal.h;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nMultiUriHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiUriHelper.kt\ncom/facebook/fresco/ui/common/MultiUriHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
public final class o {
    @l
    public static final o a;

    static {
        o.a = new o();
    }

    @m
    @n
    public static final Uri a(@m Object object0, @m Object object1, @m Object[] arr_object, @l h h0) {
        L.p(h0, "requestToUri");
        Uri uri0 = object0 == null ? null : ((Uri)h0.apply(object0));
        if(uri0 != null) {
            return uri0;
        }
        if(arr_object != null && arr_object.length != 0) {
            Object object2 = arr_object[0];
            Uri uri1 = object2 == null ? null : ((Uri)h0.apply(object2));
            if(uri1 != null) {
                return uri1;
            }
        }
        return object1 == null ? null : ((Uri)h0.apply(object1));
    }
}

