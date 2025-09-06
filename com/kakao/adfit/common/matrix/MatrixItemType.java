package com.kakao.adfit.common.matrix;

import com.kakao.adfit.m.s;
import kotlin.jvm.internal.w;
import y4.l;

@s
public enum MatrixItemType {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    Session("session"),
    Event("event"),
    Attachment("attachment"),
    Transaction("transaction"),
    Unknown("__unknown__");

    @l
    public static final a Companion;
    private final String a;

    static {
        MatrixItemType.Companion = new a(null);
    }

    private MatrixItemType(String s1) {
        this.a = s1;
    }

    private static final MatrixItemType[] a() [...] // Inlined contents

    @l
    public final String getItemType() {
        return this.a;
    }
}

