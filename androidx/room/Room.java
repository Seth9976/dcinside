package androidx.room;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.n;

public final class Room {
    @l
    public static final Room a = null;
    @l
    public static final String b = "ROOM";
    @l
    public static final String c = "room_master_table";
    @l
    private static final String d = "_CursorConverter";

    static {
        Room.a = new Room();
    }

    @l
    @n
    public static final Builder a(@l Context context0, @l Class class0, @m String s) {
        L.p(context0, "context");
        L.p(class0, "klass");
        if(s == null || v.x3(s)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new Builder(context0, class0, s);
    }

    @RestrictTo({Scope.b})
    @n
    public static final Object b(@l Class class0, @l String s) {
        L.p(class0, "klass");
        L.p(s, "suffix");
        Package package0 = class0.getPackage();
        L.m(package0);
        String s1 = package0.getName();
        String s2 = class0.getCanonicalName();
        L.m(s2);
        L.o(s1, "fullPackage");
        if(s1.length() != 0) {
            s2 = s2.substring(s1.length() + 1);
            L.o(s2, "this as java.lang.String).substring(startIndex)");
        }
        String s3 = v.k2(s2, '.', '_', false, 4, null) + s;
        try {
            Class class1 = Class.forName((s1.length() == 0 ? s3 : s1 + '.' + s3), true, class0.getClassLoader());
            L.n(class1, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return class1.getDeclaredConstructor(null).newInstance(null);
        }
        catch(ClassNotFoundException unused_ex) {
            throw new RuntimeException("Cannot find implementation for " + class0.getCanonicalName() + ". " + s3 + " does not exist");
        }
        catch(IllegalAccessException unused_ex) {
            throw new RuntimeException("Cannot access the constructor " + class0.getCanonicalName());
        }
        catch(InstantiationException unused_ex) {
            throw new RuntimeException("Failed to create an instance of " + class0.getCanonicalName());
        }
    }

    @l
    @n
    public static final Builder c(@l Context context0, @l Class class0) {
        L.p(context0, "context");
        L.p(class0, "klass");
        return new Builder(context0, class0, null);
    }
}

