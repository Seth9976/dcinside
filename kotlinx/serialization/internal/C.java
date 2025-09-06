package kotlinx.serialization.internal;

import kotlin.jvm.internal.L;
import kotlin.reflect.d;
import kotlin.y;
import kotlinx.serialization.v;
import y4.l;
import y4.m;
import z3.i;

public final class c {
    @l
    @i(name = "throwSubtypeNotRegistered")
    public static final Void a(@m String s, @l d d0) {
        L.p(d0, "baseClass");
        String s1 = "in the scope of \'" + d0.u() + '\'';
        throw new v((s == null ? "Class discriminator was missing and no default polymorphic serializers were registered " + s1 : "Class \'" + s + "\' is not registered for polymorphic serialization " + s1 + ".\nMark the base class as \'sealed\' or register the serializer explicitly."));
    }

    @l
    @i(name = "throwSubtypeNotRegistered")
    public static final Void b(@l d d0, @l d d1) {
        L.p(d0, "subClass");
        L.p(d1, "baseClass");
        String s = d0.u();
        if(s == null) {
            s = String.valueOf(d0);
        }
        c.a(s, d1);
        throw new y();
    }
}

