package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import o3.h;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public interface u {
    void A(long arg1);

    long B(String arg1);

    OsMap C(long arg1);

    boolean D(long arg1);

    RealmFieldType E(long arg1);

    long F();

    void G(long arg1, float arg2);

    long H(long arg1, RealmFieldType arg2);

    OsMap I(long arg1);

    void J(long arg1, ObjectId arg2);

    void K(long arg1);

    long L(long arg1);

    float M(long arg1);

    void N(long arg1, Date arg2);

    OsSet O(long arg1);

    boolean P(String arg1);

    boolean Q(long arg1);

    Date R(long arg1);

    void S(long arg1, Decimal128 arg2);

    void T();

    String U(long arg1);

    OsMap V(long arg1, RealmFieldType arg2);

    void W(long arg1, double arg2);

    u X(OsSharedRealm arg1);

    void a(long arg1, @h String arg2);

    Table b();

    UUID c(long arg1);

    void d(long arg1, long arg2);

    void e(long arg1, long arg2);

    boolean e0();

    boolean f(long arg1);

    OsSet g(long arg1, RealmFieldType arg2);

    long getColumnCount();

    String[] getColumnNames();

    NativeRealmAny h(long arg1);

    byte[] i(long arg1);

    double j(long arg1);

    void k(long arg1, UUID arg2);

    OsList l(long arg1, RealmFieldType arg2);

    void m(long arg1, @h byte[] arg2);

    Decimal128 n(long arg1);

    void p(long arg1, boolean arg2);

    OsSet r(long arg1);

    boolean s();

    ObjectId u(long arg1);

    long w(long arg1);

    OsList y(long arg1);

    void z(long arg1, long arg2);
}

