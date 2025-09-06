package com.fsn.cauly.Y;

import android.content.Context;
import android.text.TextUtils;
import com.fsn.cauly.blackdragoncore.d;
import java.util.ArrayList;

public class j extends v0 {
    Context s;

    public j(Context context0) {
        this.s = context0;
    }

    @Override  // com.fsn.cauly.Y.v0
    public void c() {
        ArrayList arrayList0 = com.fsn.cauly.blackdragoncore.utils.j.b(this.s, "PACKAGE_DETARGET_CHECK");
        if(arrayList0 != null && arrayList0.size() > 0) {
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: arrayList0) {
                String s = (String)object0;
                if(!TextUtils.isEmpty(s)) {
                    String s1 = s.split("::")[1];
                    if(!d.a().d(this.s, s1)) {
                        arrayList1.add(s);
                    }
                }
            }
            com.fsn.cauly.blackdragoncore.utils.j.a(this.s, "PACKAGE_DETARGET_CHECK", arrayList1);
        }
    }
}

