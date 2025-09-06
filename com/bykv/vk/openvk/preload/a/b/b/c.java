package com.bykv.vk.openvk.preload.a.b.b;

import com.bykv.vk.openvk.preload.a.j;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

final class c extends b {
    private static Class a;
    private final Object b;
    private final Field c;

    c() {
        this.b = c.b();
        this.c = c.c();
    }

    @Override  // com.bykv.vk.openvk.preload.a.b.b.b
    public final void a(AccessibleObject accessibleObject0) {
        if(!this.b(accessibleObject0)) {
            try {
                accessibleObject0.setAccessible(true);
            }
            catch(SecurityException securityException0) {
                throw new j("Gson couldn\'t modify fields for " + accessibleObject0 + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", securityException0);
            }
        }
    }

    private static Object b() {
        try {
            Class class0 = Class.forName("sun.misc.Unsafe");
            c.a = class0;
            Field field0 = class0.getDeclaredField("theUnsafe");
            field0.setAccessible(true);
            return field0.get(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    private boolean b(AccessibleObject accessibleObject0) {
        if(this.b != null && this.c != null) {
            try {
                Long long0 = (Long)c.a.getMethod("objectFieldOffset", Field.class).invoke(this.b, this.c);
                long0.longValue();
                c.a.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.b, accessibleObject0, long0, Boolean.TRUE);
                return true;
            }
            catch(Exception unused_ex) {
            }
        }
        return false;
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        }
        catch(NoSuchFieldException unused_ex) {
            return null;
        }
    }
}

