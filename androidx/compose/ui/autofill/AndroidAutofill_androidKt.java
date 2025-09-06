package androidx.compose.ui.autofill;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import c.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import kotlin.K;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import y4.l;

@s0({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n151#2,3:231\n33#2,4:234\n154#2,2:238\n38#2:240\n156#2:241\n37#3,2:242\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n*L\n96#1:231,3\n96#1:234,4\n96#1:238,2\n96#1:240\n96#1:241\n96#1:242,2\n*E\n"})
public final class AndroidAutofill_androidKt {
    @RequiresApi(26)
    @ExperimentalComposeUiApi
    public static final void a(@l AndroidAutofill androidAutofill0, @l SparseArray sparseArray0) {
        L.p(androidAutofill0, "<this>");
        L.p(sparseArray0, "values");
        int v = sparseArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = sparseArray0.keyAt(v1);
            AutofillValue autofillValue0 = g.a(sparseArray0.get(v2));
            AutofillApi26Helper autofillApi26Helper0 = AutofillApi26Helper.a;
            L.o(autofillValue0, "value");
            if(autofillApi26Helper0.d(autofillValue0)) {
                androidAutofill0.d().b(v2, autofillApi26Helper0.i(autofillValue0).toString());
            }
            else {
                if(autofillApi26Helper0.b(autofillValue0)) {
                    throw new K("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if(autofillApi26Helper0.c(autofillValue0)) {
                    throw new K("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if(autofillApi26Helper0.e(autofillValue0)) {
                    throw new K("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
                continue;
            }
        }
    }

    @RequiresApi(26)
    @ExperimentalComposeUiApi
    public static final void b(@l AndroidAutofill androidAutofill0, @l ViewStructure viewStructure0) {
        L.p(androidAutofill0, "<this>");
        L.p(viewStructure0, "root");
        int v = AutofillApi23Helper.a.a(viewStructure0, androidAutofill0.d().a().size());
        for(Object object0: androidAutofill0.d().a().entrySet()) {
            int v1 = ((Number)((Map.Entry)object0).getKey()).intValue();
            AutofillNode autofillNode0 = (AutofillNode)((Map.Entry)object0).getValue();
            AutofillApi23Helper autofillApi23Helper0 = AutofillApi23Helper.a;
            ViewStructure viewStructure1 = autofillApi23Helper0.b(viewStructure0, v);
            if(viewStructure1 != null) {
                AutofillApi26Helper autofillApi26Helper0 = AutofillApi26Helper.a;
                AutofillId autofillId0 = autofillApi26Helper0.a(viewStructure0);
                L.m(autofillId0);
                autofillApi26Helper0.g(viewStructure1, autofillId0, v1);
                autofillApi23Helper0.d(viewStructure1, v1, "com.dcinside.app.android", null, null);
                autofillApi26Helper0.h(viewStructure1, 1);
                List list0 = autofillNode0.c();
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v2 = list0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    arrayList0.add(AndroidAutofillType_androidKt.b(((AutofillType)list0.get(v3))));
                }
                autofillApi26Helper0.f(viewStructure1, ((String[])arrayList0.toArray(new String[0])));
                Rect rect0 = autofillNode0.d();
                if(rect0 == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                }
                else {
                    int v4 = b.L0(rect0.t());
                    int v5 = b.L0(rect0.B());
                    int v6 = b.L0(rect0.x());
                    int v7 = b.L0(rect0.j());
                    AutofillApi23Helper.a.c(viewStructure1, v4, v5, 0, 0, v6 - v4, v7 - v5);
                }
            }
            ++v;
        }
    }
}

