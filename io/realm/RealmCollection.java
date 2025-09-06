package io.realm;

import io.realm.internal.f;
import io.realm.internal.j;
import java.util.Collection;
import java.util.Date;
import o3.h;

public interface RealmCollection extends f, j, Collection {
    @Override  // io.realm.internal.j
    boolean L();

    boolean L0();

    @Override
    boolean contains(@h Object arg1);

    boolean e0();

    @h
    Number k4(String arg1);

    @h
    Date q4(String arg1);

    @Override  // io.realm.internal.j
    boolean s();

    Number u1(String arg1);

    @h
    Date v3(String arg1);

    boolean w();

    double x0(String arg1);

    RealmQuery x4();

    @h
    Number z4(String arg1);
}

