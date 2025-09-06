package androidx.room.util;

import android.util.Log;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.f;
import z3.i;

@RestrictTo({Scope.c})
@s0({"SMAP\nStringUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringUtil.kt\nandroidx/room/util/StringUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1603#2,9:87\n1855#2:96\n1856#2:98\n1612#2:99\n1#3:97\n*S KotlinDebug\n*F\n+ 1 StringUtil.kt\nandroidx/room/util/StringUtil\n*L\n66#1:87,9\n66#1:96\n66#1:98\n66#1:99\n66#1:97\n*E\n"})
@i(name = "StringUtil")
public final class StringUtil {
    @l
    @f
    public static final String[] a;

    static {
        StringUtil.a = new String[0];
    }

    public static final void a(@l StringBuilder stringBuilder0, int v) {
        L.p(stringBuilder0, "builder");
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append("?");
            if(v1 < v - 1) {
                stringBuilder0.append(",");
            }
        }
    }

    public static void b() {
    }

    @m
    public static final String c(@m List list0) {
        return list0 == null ? null : u.m3(list0, ",", null, null, 0, null, null, 62, null);
    }

    @l
    public static final StringBuilder d() {
        return new StringBuilder();
    }

    @m
    public static final List e(@m String s) {
        Integer integer0;
        if(s != null) {
            List list0 = v.U4(s, new char[]{','}, false, 0, 6, null);
            if(list0 != null) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: list0) {
                    String s1 = (String)object0;
                    try {
                        integer0 = Integer.parseInt(s1);
                    }
                    catch(NumberFormatException numberFormatException0) {
                        Log.e("ROOM", "Malformed integer list", numberFormatException0);
                        integer0 = null;
                    }
                    if(integer0 != null) {
                        arrayList0.add(integer0);
                    }
                }
                return arrayList0;
            }
        }
        return null;
    }
}

