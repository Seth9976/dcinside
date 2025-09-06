package io.realm.internal;

import android.content.Context;
import io.realm.F0;
import io.realm.Q0;
import io.realm.exceptions.RealmException;
import java.lang.reflect.InvocationTargetException;

public class m {
    public interface a {
        F0 a(Q0 arg1, io.realm.internal.OsSharedRealm.a arg2);
    }

    public interface b {
        F0 a(OsSharedRealm arg1);
    }

    public static final int a = 19;
    private static final m b;
    private static m c;

    static {
        m.b = new m();
        m.c = null;
        try {
            m.c = (m)Class.forName("io.realm.internal.SyncObjectServerFacade").getDeclaredConstructor(null).newInstance(null);
        }
        catch(ClassNotFoundException unused_ex) {
        }
        catch(InstantiationException instantiationException0) {
            throw new RealmException("Failed to init SyncObjectServerFacade", instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RealmException("Failed to init SyncObjectServerFacade", illegalAccessException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RealmException("Failed to init SyncObjectServerFacade", noSuchMethodException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RealmException("Failed to init SyncObjectServerFacade", invocationTargetException0.getTargetException());
        }
    }

    public void a(Q0 q00) {
    }

    public void b(Q0 q00) {
    }

    public void c(F0 f00, Q0 q00) {
    }

    public void d(Q0 q00) {
    }

    // 去混淆评级： 低(20)
    public static m e(boolean z) {
        return z ? m.c : m.b;
    }

    public Object[] f(Q0 q00) {
        return new Object[19];
    }

    public static m g() {
        return m.c == null ? m.b : m.c;
    }

    public String h(Q0 q00) {
        return null;
    }

    public String i(Q0 q00) {
        return null;
    }

    public void j(Context context0, String s, a m$a0, b m$b0) {
    }

    public void k(Q0 q00) {
    }

    public boolean l(Throwable throwable0) {
        return false;
    }

    public void m(OsRealmConfig osRealmConfig0) {
    }
}

