package org.slf4j;

import java.io.Serializable;
import java.util.Iterator;

public interface d extends Serializable {
    public static final String K8 = "*";
    public static final String L8 = "+";

    void C3(d arg1);

    boolean I2(d arg1);

    boolean contains(String arg1);

    boolean d0(d arg1);

    @Override
    boolean equals(Object arg1);

    String getName();

    boolean hasChildren();

    @Override
    int hashCode();

    Iterator iterator();

    boolean n3();
}

