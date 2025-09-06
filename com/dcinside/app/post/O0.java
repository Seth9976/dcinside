package com.dcinside.app.post;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.annotation.DrawableRes;
import com.dcinside.app.model.Q;
import com.dcinside.app.response.PostItem.b;
import com.dcinside.app.response.PostItem;
import com.dcinside.app.span.i;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.vk;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class o0 {
    @l
    public static final o0 a;

    static {
        o0.a = new o0();
    }

    private final i a(float f, @DrawableRes int v) {
        int v1 = (int)(((float)Dk.b(0x7F07011A)) + f);  // dimen:list_subject_head_icon
        return new i(v, null, v1, v1, true, 2, null);
    }

    @m
    public final i b(@l Q q0) {
        L.p(q0, "item");
        return Q.n0.a(q0) ? new i(0x7F080283, null, Dk.b(0x7F0703D3), 0, true, 10, null) : null;  // drawable:ic_list_head_live_blue_lite_tinted
    }

    @m
    public final i c(@l PostItem postItem0, float f) {
        L.p(postItem0, "item");
        b postItem$b0 = PostItem.M8;
        if(postItem$b0.c(postItem0)) {
            return this.a(f, 0x7F08027E);  // drawable:ic_list_head_hit_tinted
        }
        if(postItem0.Y()) {
            return o0.f(this, f, 0x7F08027C, null, 0.0f, 6, null);  // drawable:ic_list_head_fix_post_tinted
        }
        if(postItem0.g0()) {
            return o0.f(this, f, 0x7F08028C, null, 0.0f, 6, null);  // drawable:ic_list_head_secret_tinted
        }
        if(postItem0.d0()) {
            return postItem$b0.f(postItem0) ? o0.f(this, f, 0x7F080286, null, 1.25f, 2, null) : o0.f(this, f, 0x7F080285, null, 1.25f, 2, null);  // drawable:ic_list_head_live_red_lite
        }
        if(postItem$b0.f(postItem0)) {
            return this.a(f, 0x7F080283);  // drawable:ic_list_head_live_blue_lite_tinted
        }
        if(postItem$b0.e(postItem0)) {
            return this.a(f, 0x7F080284);  // drawable:ic_list_head_live_blue_tinted
        }
        if(postItem$b0.g(postItem0)) {
            return this.a(f, 0x7F08028E);  // drawable:ic_list_head_video_tinted
        }
        if(postItem$b0.b(postItem0)) {
            return o0.f(this, f, 0x7F08027A, null, 0.0f, 6, null);  // drawable:ic_list_head_best
        }
        if(postItem$b0.a(postItem0)) {
            return postItem$b0.d(postItem0) ? this.a(f, 0x7F080289) : this.a(f, 0x7F08028A);  // drawable:ic_list_head_recommend_tinted0
        }
        if(postItem0.V()) {
            return this.a(f, 0x7F080279);  // drawable:ic_list_head_ai
        }
        return postItem$b0.d(postItem0) ? this.a(f, 0x7F080280) : null;  // drawable:ic_list_head_image_tinted
    }

    @l
    public final i[] d(@l PostItem postItem0, float f, @l Context context0) {
        L.p(postItem0, "item");
        L.p(context0, "context");
        ColorStateList colorStateList0 = vk.c(context0, 0x7F04032A);  // attr:icTintNormal
        i i0 = null;
        i i1 = PostItem.M8.h(postItem0) ? o0.f(this, f, 0x7F0804B2, colorStateList0, 0.0f, 4, null) : null;  // drawable:post_item_ic_voice
        i i2 = postItem0.l() ? o0.f(this, f, 0x7F080331, colorStateList0, 0.0f, 4, null) : null;  // drawable:ico_mini_poll
        i i3 = postItem0.h() ? o0.f(this, f, 0x7F080316, colorStateList0, 0.0f, 4, null) : null;  // drawable:ico_auto_delete_remain
        if(postItem0.U()) {
            i0 = o0.f(this, f, 0x7F080229, colorStateList0, 0.0f, 4, null);  // drawable:ic_adult_post_s
        }
        return new i[]{i1, i2, i3, i0};
    }

    private final i e(float f, @DrawableRes int v, ColorStateList colorStateList0, float f1) {
        int v1 = (int)(((float)Dk.b(0x7F07011A)) + f);  // dimen:list_subject_head_icon
        return new i(v, colorStateList0, v1, ((int)(((float)v1) * f1)), false, 16, null);
    }

    static i f(o0 o00, float f, int v, ColorStateList colorStateList0, float f1, int v1, Object object0) {
        if((v1 & 2) != 0) {
            colorStateList0 = null;
        }
        if((v1 & 4) != 0) {
            f1 = 1.0f;
        }
        return o00.e(f, v, colorStateList0, f1);
    }
}

