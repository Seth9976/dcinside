package io.realm.kotlin;

import io.realm.RealmQuery;
import io.realm.o;
import java.util.Date;
import kotlin.jvm.internal.L;
import y4.l;

public final class i {
    @l
    public static final RealmQuery a(@l RealmQuery realmQuery0, @l String s, @l Boolean[] arr_boolean) {
        L.p(realmQuery0, "<this>");
        L.p(s, "propertyName");
        L.p(arr_boolean, "value");
        RealmQuery realmQuery1 = realmQuery0.R0(s, arr_boolean);
        L.o(realmQuery1, "this.`in`(propertyName, value)");
        return realmQuery1;
    }

    @l
    public static final RealmQuery b(@l RealmQuery realmQuery0, @l String s, @l Byte[] arr_byte) {
        L.p(realmQuery0, "<this>");
        L.p(s, "propertyName");
        L.p(arr_byte, "value");
        RealmQuery realmQuery1 = realmQuery0.S0(s, arr_byte);
        L.o(realmQuery1, "this.`in`(propertyName, value)");
        return realmQuery1;
    }

    @l
    public static final RealmQuery c(@l RealmQuery realmQuery0, @l String s, @l Double[] arr_double) {
        L.p(realmQuery0, "<this>");
        L.p(s, "propertyName");
        L.p(arr_double, "value");
        RealmQuery realmQuery1 = realmQuery0.T0(s, arr_double);
        L.o(realmQuery1, "this.`in`(propertyName, value)");
        return realmQuery1;
    }

    @l
    public static final RealmQuery d(@l RealmQuery realmQuery0, @l String s, @l Float[] arr_float) {
        L.p(realmQuery0, "<this>");
        L.p(s, "propertyName");
        L.p(arr_float, "value");
        RealmQuery realmQuery1 = realmQuery0.U0(s, arr_float);
        L.o(realmQuery1, "this.`in`(propertyName, value)");
        return realmQuery1;
    }

    @l
    public static final RealmQuery e(@l RealmQuery realmQuery0, @l String s, @l Integer[] arr_integer) {
        L.p(realmQuery0, "<this>");
        L.p(s, "propertyName");
        L.p(arr_integer, "value");
        RealmQuery realmQuery1 = realmQuery0.V0(s, arr_integer);
        L.o(realmQuery1, "this.`in`(propertyName, value)");
        return realmQuery1;
    }

    @l
    public static final RealmQuery f(@l RealmQuery realmQuery0, @l String s, @l Long[] arr_long) {
        L.p(realmQuery0, "<this>");
        L.p(s, "propertyName");
        L.p(arr_long, "value");
        RealmQuery realmQuery1 = realmQuery0.W0(s, arr_long);
        L.o(realmQuery1, "this.`in`(propertyName, value)");
        return realmQuery1;
    }

    @l
    public static final RealmQuery g(@l RealmQuery realmQuery0, @l String s, @l Short[] arr_short) {
        L.p(realmQuery0, "<this>");
        L.p(s, "propertyName");
        L.p(arr_short, "value");
        RealmQuery realmQuery1 = realmQuery0.X0(s, arr_short);
        L.o(realmQuery1, "this.`in`(propertyName, value)");
        return realmQuery1;
    }

    @l
    public static final RealmQuery h(@l RealmQuery realmQuery0, @l String s, @l String[] arr_s, @l o o0) {
        L.p(realmQuery0, "<this>");
        L.p(s, "propertyName");
        L.p(arr_s, "value");
        L.p(o0, "casing");
        RealmQuery realmQuery1 = realmQuery0.Z0(s, arr_s, o0);
        L.o(realmQuery1, "this.`in`(propertyName, value, casing)");
        return realmQuery1;
    }

    @l
    public static final RealmQuery i(@l RealmQuery realmQuery0, @l String s, @l Date[] arr_date) {
        L.p(realmQuery0, "<this>");
        L.p(s, "propertyName");
        L.p(arr_date, "value");
        RealmQuery realmQuery1 = realmQuery0.a1(s, arr_date);
        L.o(realmQuery1, "this.`in`(propertyName, value)");
        return realmQuery1;
    }

    public static RealmQuery j(RealmQuery realmQuery0, String s, String[] arr_s, o o0, int v, Object object0) {
        if((v & 4) != 0) {
            o0 = o.b;
        }
        return i.h(realmQuery0, s, arr_s, o0);
    }
}

