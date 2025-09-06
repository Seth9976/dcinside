package com.google.android.material.color;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R.color;
import com.google.android.material.color.utilities.j;
import com.google.android.material.color.utilities.k;
import com.google.android.material.color.utilities.v2;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

@RestrictTo({Scope.b})
public final class u {
    private static final v2 a;
    private static final Map b;

    static {
        v2 v20 = new v2();
        u.a = v20;
        HashMap hashMap0 = new HashMap();
        j j0 = v20.V5();
        hashMap0.put(color.material_personalized_color_primary, j0);
        j j1 = v20.E5();
        hashMap0.put(color.material_personalized_color_on_primary, j1);
        j j2 = v20.p2();
        hashMap0.put(color.material_personalized_color_primary_inverse, j2);
        j j3 = v20.W5();
        hashMap0.put(color.material_personalized_color_primary_container, j3);
        j j4 = v20.F5();
        hashMap0.put(color.material_personalized_color_on_primary_container, j4);
        j j5 = v20.b6();
        hashMap0.put(color.material_personalized_color_secondary, j5);
        j j6 = v20.I5();
        hashMap0.put(color.material_personalized_color_on_secondary, j6);
        j j7 = v20.c6();
        hashMap0.put(color.material_personalized_color_secondary_container, j7);
        j j8 = v20.J5();
        hashMap0.put(color.material_personalized_color_on_secondary_container, j8);
        j j9 = v20.r6();
        hashMap0.put(color.material_personalized_color_tertiary, j9);
        j j10 = v20.O5();
        hashMap0.put(color.material_personalized_color_on_tertiary, j10);
        j j11 = v20.s6();
        hashMap0.put(color.material_personalized_color_tertiary_container, j11);
        j j12 = v20.P5();
        hashMap0.put(color.material_personalized_color_on_tertiary_container, j12);
        j j13 = v20.g2();
        hashMap0.put(color.material_personalized_color_background, j13);
        j j14 = v20.B5();
        hashMap0.put(color.material_personalized_color_on_background, j14);
        j j15 = v20.h6();
        hashMap0.put(color.material_personalized_color_surface, j15);
        j j16 = v20.M5();
        hashMap0.put(color.material_personalized_color_on_surface, j16);
        j j17 = v20.q6();
        hashMap0.put(color.material_personalized_color_surface_variant, j17);
        j j18 = v20.N5();
        hashMap0.put(color.material_personalized_color_on_surface_variant, j18);
        j j19 = v20.q2();
        hashMap0.put(color.material_personalized_color_surface_inverse, j19);
        j j20 = v20.o2();
        hashMap0.put(color.material_personalized_color_on_surface_inverse, j20);
        j j21 = v20.i6();
        hashMap0.put(color.material_personalized_color_surface_bright, j21);
        j j22 = v20.o6();
        hashMap0.put(color.material_personalized_color_surface_dim, j22);
        j j23 = v20.j6();
        hashMap0.put(color.material_personalized_color_surface_container, j23);
        j j24 = v20.m6();
        hashMap0.put(color.material_personalized_color_surface_container_low, j24);
        j j25 = v20.k6();
        hashMap0.put(color.material_personalized_color_surface_container_high, j25);
        j j26 = v20.n6();
        hashMap0.put(color.material_personalized_color_surface_container_lowest, j26);
        j j27 = v20.l6();
        hashMap0.put(color.material_personalized_color_surface_container_highest, j27);
        j j28 = v20.S5();
        hashMap0.put(color.material_personalized_color_outline, j28);
        j j29 = v20.T5();
        hashMap0.put(color.material_personalized_color_outline_variant, j29);
        j j30 = v20.k2();
        hashMap0.put(color.material_personalized_color_error, j30);
        j j31 = v20.C5();
        hashMap0.put(color.material_personalized_color_on_error, j31);
        j j32 = v20.l2();
        hashMap0.put(color.material_personalized_color_error_container, j32);
        j j33 = v20.D5();
        hashMap0.put(color.material_personalized_color_on_error_container, j33);
        j j34 = v20.h2();
        hashMap0.put(color.material_personalized_color_control_activated, j34);
        j j35 = v20.j2();
        hashMap0.put(color.material_personalized_color_control_normal, j35);
        j j36 = v20.i2();
        hashMap0.put(color.material_personalized_color_control_highlight, j36);
        j j37 = v20.x6();
        hashMap0.put(color.material_personalized_color_text_primary_inverse, j37);
        j j38 = v20.z6();
        hashMap0.put(color.material_personalized_color_text_secondary_and_tertiary_inverse, j38);
        j j39 = v20.A6();
        hashMap0.put(color.material_personalized_color_text_secondary_and_tertiary_inverse_disabled, j39);
        j j40 = v20.y6();
        hashMap0.put(color.material_personalized_color_text_primary_inverse_disable_only, j40);
        j j41 = v20.w6();
        hashMap0.put(color.material_personalized_color_text_hint_foreground_inverse, j41);
        u.b = DesugarCollections.unmodifiableMap(hashMap0);
    }

    @NonNull
    public static Map a(@NonNull k k0) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: u.b.entrySet()) {
            hashMap0.put(((Integer)((Map.Entry)object0).getKey()), ((j)((Map.Entry)object0).getValue()).h(k0));
        }
        return DesugarCollections.unmodifiableMap(hashMap0);
    }
}

