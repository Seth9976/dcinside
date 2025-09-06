package com.bytedance.sdk.component.Zh.PjT;

import java.util.ArrayList;
import java.util.List;

public final class JQp extends fDm {
    public static final class PjT {
        private final List PjT;
        private final List Zh;

        public PjT() {
            this.PjT = new ArrayList();
            this.Zh = new ArrayList();
        }

        public PjT PjT(String s, String s1) {
            this.PjT.add(s);
            this.Zh.add(s1);
            return this;
        }

        public JQp PjT() {
            return new JQp(this.PjT, this.Zh);
        }
    }

    List PjT;
    List Zh;

    JQp(List list0, List list1) {
        this.PjT = list0;
        this.Zh = list1;
    }
}

