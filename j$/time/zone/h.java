package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

final class h implements PrivilegedAction {
    final ArrayList a;

    h(ArrayList arrayList0) {
        this.a = arrayList0;
    }

    @Override
    public final Object run() {
        Class class0 = j.class;
        String s = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if(s != null) {
            try {
                j j0 = (j)class0.cast(Class.forName(s, true, class0.getClassLoader()).newInstance());
                j.e(j0);
                this.a.add(j0);
                return null;
            }
            catch(Exception exception0) {
                throw new Error(exception0);
            }
        }
        j.e(new i());
        return null;
    }
}

