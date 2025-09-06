package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.g;

public enum t implements g {
    USE_ANNOTATIONS(true),
    USE_GETTERS_AS_SETTERS(true),
    PROPAGATE_TRANSIENT_MARKER(false),
    AUTO_DETECT_CREATORS(true),
    AUTO_DETECT_FIELDS(true),
    AUTO_DETECT_GETTERS(true),
    AUTO_DETECT_IS_GETTERS(true),
    AUTO_DETECT_SETTERS(true),
    REQUIRE_SETTERS_FOR_GETTERS(false),
    ALLOW_FINAL_FIELDS_AS_MUTATORS(true),
    INFER_PROPERTY_MUTATORS(true),
    INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES(true),
    ALLOW_VOID_VALUED_PROPERTIES(false),
    CAN_OVERRIDE_ACCESS_MODIFIERS(true),
    OVERRIDE_PUBLIC_ACCESS_MODIFIERS(true),
    USE_STATIC_TYPING(false),
    USE_BASE_TYPE_AS_DEFAULT_IMPL(false),
    INFER_BUILDER_TYPE_BINDINGS(true),
    REQUIRE_TYPE_ID_FOR_SUBTYPES(true),
    DEFAULT_VIEW_INCLUSION(true),
    SORT_PROPERTIES_ALPHABETICALLY(false),
    SORT_CREATOR_PROPERTIES_FIRST(true),
    ACCEPT_CASE_INSENSITIVE_PROPERTIES(false),
    ACCEPT_CASE_INSENSITIVE_ENUMS(false),
    ACCEPT_CASE_INSENSITIVE_VALUES(false),
    USE_WRAPPER_NAME_AS_PROPERTY_NAME(false),
    USE_STD_BEAN_NAMING(false),
    ALLOW_EXPLICIT_PROPERTY_RENAMING(false),
    ALLOW_IS_GETTERS_FOR_NON_BOOLEAN(false),
    ALLOW_COERCION_OF_SCALARS(true),
    IGNORE_DUPLICATE_MODULE_REGISTRATIONS(true),
    IGNORE_MERGE_FOR_UNMERGEABLE(true),
    BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES(false),
    APPLY_DEFAULT_VALUES(true);

    private final boolean a;
    private final long b;

    private t(boolean z) {
        this.a = z;
        this.b = 1L << this.ordinal();
    }

    @Override  // com.fasterxml.jackson.databind.cfg.g
    @Deprecated
    public int a() {
        return (int)this.b;
    }

    @Override  // com.fasterxml.jackson.databind.cfg.g
    @Deprecated
    public boolean b(int v) {
        return (((long)v) & this.b) != 0L;
    }

    @Override  // com.fasterxml.jackson.databind.cfg.g
    public boolean c() {
        return this.a;
    }

    public static long d() {
        t[] arr_t = t.values();
        long v = 0L;
        for(int v1 = 0; v1 < arr_t.length; ++v1) {
            t t0 = arr_t[v1];
            if(t0.c()) {
                v |= t0.f();
            }
        }
        return v;
    }

    public boolean e(long v) {
        return (v & this.b) != 0L;
    }

    public long f() {
        return this.b;
    }
}

