package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.color;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;

@RestrictTo({Scope.c})
public final class AppCompatDrawableManager {
    private ResourceManagerInternal a;
    private static final String b = "AppCompatDrawableManag";
    private static final boolean c = false;
    private static final PorterDuff.Mode d;
    private static AppCompatDrawableManager e;

    static {
        AppCompatDrawableManager.d = PorterDuff.Mode.SRC_IN;
    }

    public static AppCompatDrawableManager b() {
        synchronized(AppCompatDrawableManager.class) {
            if(AppCompatDrawableManager.e == null) {
                AppCompatDrawableManager.i();
            }
            return AppCompatDrawableManager.e;
        }
    }

    public Drawable c(@NonNull Context context0, @DrawableRes int v) {
        synchronized(this) {
            return this.a.j(context0, v);
        }
    }

    Drawable d(@NonNull Context context0, @DrawableRes int v, boolean z) {
        synchronized(this) {
            return this.a.k(context0, v, z);
        }
    }

    public static PorterDuffColorFilter e(int v, PorterDuff.Mode porterDuff$Mode0) {
        synchronized(AppCompatDrawableManager.class) {
            return ResourceManagerInternal.l(v, porterDuff$Mode0);
        }
    }

    ColorStateList f(@NonNull Context context0, @DrawableRes int v) {
        synchronized(this) {
            return this.a.m(context0, v);
        }
    }

    public void g(@NonNull Context context0) {
        synchronized(this) {
            this.a.s(context0);
        }
    }

    Drawable h(@NonNull Context context0, @NonNull VectorEnabledTintResources vectorEnabledTintResources0, @DrawableRes int v) {
        synchronized(this) {
            return this.a.t(context0, vectorEnabledTintResources0, v);
        }
    }

    public static void i() {
        synchronized(AppCompatDrawableManager.class) {
            if(AppCompatDrawableManager.e == null) {
                AppCompatDrawableManager appCompatDrawableManager0 = new AppCompatDrawableManager();
                AppCompatDrawableManager.e = appCompatDrawableManager0;
                appCompatDrawableManager0.a = ResourceManagerInternal.h();
                AppCompatDrawableManager.e.a.u(new ResourceManagerHooks() {
                    private final int[] a;
                    private final int[] b;
                    private final int[] c;
                    private final int[] d;
                    private final int[] e;
                    private final int[] f;

                    {
                        this.a = new int[]{drawable.abc_textfield_search_default_mtrl_alpha, drawable.abc_textfield_default_mtrl_alpha, drawable.abc_ab_share_pack_mtrl_alpha};
                        this.b = new int[]{drawable.abc_ic_commit_search_api_mtrl_alpha, drawable.abc_seekbar_tick_mark_material, drawable.abc_ic_menu_share_mtrl_alpha, drawable.abc_ic_menu_copy_mtrl_am_alpha, drawable.abc_ic_menu_cut_mtrl_alpha, drawable.abc_ic_menu_selectall_mtrl_alpha, drawable.abc_ic_menu_paste_mtrl_am_alpha};
                        this.c = new int[]{drawable.abc_textfield_activated_mtrl_alpha, drawable.abc_textfield_search_activated_mtrl_alpha, drawable.abc_cab_background_top_mtrl_alpha, drawable.abc_text_cursor_material, drawable.abc_text_select_handle_left_mtrl, drawable.abc_text_select_handle_middle_mtrl, drawable.abc_text_select_handle_right_mtrl};
                        this.d = new int[]{drawable.abc_popup_background_mtrl_mult, drawable.abc_cab_background_internal_bg, drawable.abc_menu_hardkey_panel_mtrl_mult};
                        this.e = new int[]{drawable.abc_tab_indicator_material, drawable.abc_textfield_search_material};
                        this.f = new int[]{drawable.abc_btn_check_material, drawable.abc_btn_radio_material, drawable.abc_btn_check_material_anim, drawable.abc_btn_radio_material_anim};
                    }

                    @Override  // androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks
                    public Drawable a(@NonNull ResourceManagerInternal resourceManagerInternal0, @NonNull Context context0, int v) {
                        if(v == drawable.abc_cab_background_top_material) {
                            return new LayerDrawable(new Drawable[]{resourceManagerInternal0.j(context0, drawable.abc_cab_background_internal_bg), resourceManagerInternal0.j(context0, drawable.abc_cab_background_top_mtrl_alpha)});
                        }
                        if(v == drawable.abc_ratingbar_material) {
                            return this.l(resourceManagerInternal0, context0, dimen.abc_star_big);
                        }
                        if(v == drawable.abc_ratingbar_indicator_material) {
                            return this.l(resourceManagerInternal0, context0, dimen.abc_star_medium);
                        }
                        return v == drawable.abc_ratingbar_small_material ? this.l(resourceManagerInternal0, context0, dimen.abc_star_small) : null;
                    }

                    @Override  // androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks
                    public ColorStateList b(@NonNull Context context0, int v) {
                        if(v == drawable.abc_edit_text_material) {
                            return AppCompatResources.a(context0, color.abc_tint_edittext);
                        }
                        if(v == drawable.abc_switch_track_mtrl_alpha) {
                            return AppCompatResources.a(context0, color.abc_tint_switch_track);
                        }
                        if(v == drawable.abc_switch_thumb_material) {
                            return this.k(context0);
                        }
                        if(v == drawable.abc_btn_default_mtrl_shape) {
                            return this.j(context0);
                        }
                        if(v == drawable.abc_btn_borderless_material) {
                            return this.g(context0);
                        }
                        if(v == drawable.abc_btn_colored_material) {
                            return this.i(context0);
                        }
                        if(v != drawable.abc_spinner_mtrl_am_alpha && v != drawable.abc_spinner_textfield_background_material) {
                            if(this.f(this.b, v)) {
                                return ThemeUtils.f(context0, attr.colorControlNormal);
                            }
                            if(this.f(this.e, v)) {
                                return AppCompatResources.a(context0, color.abc_tint_default);
                            }
                            if(this.f(this.f, v)) {
                                return AppCompatResources.a(context0, color.abc_tint_btn_checkable);
                            }
                            return v == drawable.abc_seekbar_thumb_material ? AppCompatResources.a(context0, color.abc_tint_seek_thumb) : null;
                        }
                        return AppCompatResources.a(context0, color.abc_tint_spinner);
                    }

                    @Override  // androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks
                    public PorterDuff.Mode c(int v) {
                        return v == drawable.abc_switch_thumb_material ? PorterDuff.Mode.MULTIPLY : null;
                    }

                    @Override  // androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks
                    public boolean d(@NonNull Context context0, int v, @NonNull Drawable drawable0) {
                        if(v == drawable.abc_seekbar_track_material) {
                            this.m(((LayerDrawable)drawable0).findDrawableByLayerId(0x1020000), ThemeUtils.d(context0, attr.colorControlNormal), AppCompatDrawableManager.d);
                            this.m(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000F), ThemeUtils.d(context0, attr.colorControlNormal), AppCompatDrawableManager.d);
                            this.m(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000D), ThemeUtils.d(context0, attr.colorControlActivated), AppCompatDrawableManager.d);
                            return true;
                        }
                        if(v != drawable.abc_ratingbar_material && v != drawable.abc_ratingbar_indicator_material && v != drawable.abc_ratingbar_small_material) {
                            return false;
                        }
                        this.m(((LayerDrawable)drawable0).findDrawableByLayerId(0x1020000), ThemeUtils.c(context0, attr.colorControlNormal), AppCompatDrawableManager.d);
                        this.m(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000F), ThemeUtils.d(context0, attr.colorControlActivated), AppCompatDrawableManager.d);
                        this.m(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000D), ThemeUtils.d(context0, attr.colorControlActivated), AppCompatDrawableManager.d);
                        return true;
                    }

                    @Override  // androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks
                    public boolean e(@NonNull Context context0, int v, @NonNull Drawable drawable0) {
                        boolean z;
                        int v2;
                        PorterDuff.Mode porterDuff$Mode1;
                        int v1;
                        PorterDuff.Mode porterDuff$Mode0 = AppCompatDrawableManager.d;
                        if(this.f(this.a, v)) {
                            v1 = attr.colorControlNormal;
                            porterDuff$Mode1 = porterDuff$Mode0;
                            v2 = -1;
                            z = true;
                        }
                        else if(this.f(this.c, v)) {
                            v1 = attr.colorControlActivated;
                            porterDuff$Mode1 = porterDuff$Mode0;
                            v2 = -1;
                            z = true;
                        }
                        else if(this.f(this.d, v)) {
                            porterDuff$Mode1 = PorterDuff.Mode.MULTIPLY;
                            v1 = 0x1010031;
                            v2 = -1;
                            z = true;
                        }
                        else if(v == drawable.abc_list_divider_mtrl_alpha) {
                            porterDuff$Mode1 = porterDuff$Mode0;
                            z = true;
                            v2 = 41;
                            v1 = 0x1010030;
                        }
                        else if(v == drawable.abc_dialog_material_background) {
                            porterDuff$Mode1 = porterDuff$Mode0;
                            v1 = 0x1010031;
                            v2 = -1;
                            z = true;
                        }
                        else {
                            porterDuff$Mode1 = porterDuff$Mode0;
                            v1 = 0;
                            v2 = -1;
                            z = false;
                        }
                        if(z) {
                            Drawable drawable1 = drawable0.mutate();
                            drawable1.setColorFilter(AppCompatDrawableManager.e(ThemeUtils.d(context0, v1), porterDuff$Mode1));
                            if(v2 != -1) {
                                drawable1.setAlpha(v2);
                            }
                            return true;
                        }
                        return false;
                    }

                    private boolean f(int[] arr_v, int v) {
                        for(int v1 = 0; v1 < arr_v.length; ++v1) {
                            if(arr_v[v1] == v) {
                                return true;
                            }
                        }
                        return false;
                    }

                    private ColorStateList g(@NonNull Context context0) {
                        return this.h(context0, 0);
                    }

                    private ColorStateList h(@NonNull Context context0, @ColorInt int v) {
                        int[][] arr2_v = new int[4][];
                        int[] arr_v = new int[4];
                        int v1 = ThemeUtils.d(context0, attr.colorControlHighlight);
                        int v2 = ThemeUtils.c(context0, attr.colorButtonNormal);
                        arr2_v[0] = ThemeUtils.c;
                        arr_v[0] = v2;
                        arr2_v[1] = ThemeUtils.f;
                        arr_v[1] = ColorUtils.v(v1, v);
                        arr2_v[2] = ThemeUtils.d;
                        arr_v[2] = ColorUtils.v(v1, v);
                        arr2_v[3] = ThemeUtils.j;
                        arr_v[3] = v;
                        return new ColorStateList(arr2_v, arr_v);
                    }

                    private ColorStateList i(@NonNull Context context0) {
                        return this.h(context0, ThemeUtils.d(context0, attr.colorAccent));
                    }

                    private ColorStateList j(@NonNull Context context0) {
                        return this.h(context0, ThemeUtils.d(context0, attr.colorButtonNormal));
                    }

                    private ColorStateList k(Context context0) {
                        int[][] arr2_v = new int[3][];
                        int[] arr_v = new int[3];
                        ColorStateList colorStateList0 = ThemeUtils.f(context0, attr.colorSwitchThumbNormal);
                        if(colorStateList0 != null && colorStateList0.isStateful()) {
                            arr2_v[0] = ThemeUtils.c;
                            arr_v[0] = colorStateList0.getColorForState(ThemeUtils.c, 0);
                            arr2_v[1] = ThemeUtils.g;
                            arr_v[1] = ThemeUtils.d(context0, attr.colorControlActivated);
                            arr2_v[2] = ThemeUtils.j;
                            arr_v[2] = colorStateList0.getDefaultColor();
                            return new ColorStateList(arr2_v, arr_v);
                        }
                        arr2_v[0] = ThemeUtils.c;
                        arr_v[0] = ThemeUtils.c(context0, 0x7F040175);  // attr:colorSwitchThumbNormal
                        arr2_v[1] = ThemeUtils.g;
                        arr_v[1] = ThemeUtils.d(context0, attr.colorControlActivated);
                        arr2_v[2] = ThemeUtils.j;
                        arr_v[2] = ThemeUtils.d(context0, 0x7F040175);  // attr:colorSwitchThumbNormal
                        return new ColorStateList(arr2_v, arr_v);
                    }

                    private LayerDrawable l(@NonNull ResourceManagerInternal resourceManagerInternal0, @NonNull Context context0, @DimenRes int v) {
                        BitmapDrawable bitmapDrawable2;
                        BitmapDrawable bitmapDrawable1;
                        BitmapDrawable bitmapDrawable0;
                        int v1 = context0.getResources().getDimensionPixelSize(v);
                        Drawable drawable0 = resourceManagerInternal0.j(context0, drawable.abc_star_black_48dp);
                        Drawable drawable1 = resourceManagerInternal0.j(context0, drawable.abc_star_half_black_48dp);
                        if(!(drawable0 instanceof BitmapDrawable) || drawable0.getIntrinsicWidth() != v1 || drawable0.getIntrinsicHeight() != v1) {
                            Bitmap bitmap0 = Bitmap.createBitmap(v1, v1, Bitmap.Config.ARGB_8888);
                            Canvas canvas0 = new Canvas(bitmap0);
                            drawable0.setBounds(0, 0, v1, v1);
                            drawable0.draw(canvas0);
                            bitmapDrawable0 = new BitmapDrawable(bitmap0);
                            bitmapDrawable1 = new BitmapDrawable(bitmap0);
                        }
                        else {
                            bitmapDrawable0 = (BitmapDrawable)drawable0;
                            bitmapDrawable1 = new BitmapDrawable(bitmapDrawable0.getBitmap());
                        }
                        bitmapDrawable1.setTileModeX(Shader.TileMode.REPEAT);
                        if(!(drawable1 instanceof BitmapDrawable) || drawable1.getIntrinsicWidth() != v1 || drawable1.getIntrinsicHeight() != v1) {
                            Bitmap bitmap1 = Bitmap.createBitmap(v1, v1, Bitmap.Config.ARGB_8888);
                            Canvas canvas1 = new Canvas(bitmap1);
                            drawable1.setBounds(0, 0, v1, v1);
                            drawable1.draw(canvas1);
                            bitmapDrawable2 = new BitmapDrawable(bitmap1);
                        }
                        else {
                            bitmapDrawable2 = (BitmapDrawable)drawable1;
                        }
                        LayerDrawable layerDrawable0 = new LayerDrawable(new Drawable[]{bitmapDrawable0, bitmapDrawable2, bitmapDrawable1});
                        layerDrawable0.setId(0, 0x1020000);
                        layerDrawable0.setId(1, 0x102000F);
                        layerDrawable0.setId(2, 0x102000D);
                        return layerDrawable0;
                    }

                    private void m(Drawable drawable0, int v, PorterDuff.Mode porterDuff$Mode0) {
                        Drawable drawable1 = drawable0.mutate();
                        if(porterDuff$Mode0 == null) {
                            porterDuff$Mode0 = AppCompatDrawableManager.d;
                        }
                        drawable1.setColorFilter(AppCompatDrawableManager.e(v, porterDuff$Mode0));
                    }
                });
            }
        }
    }

    static void j(Drawable drawable0, TintInfo tintInfo0, int[] arr_v) {
        ResourceManagerInternal.w(drawable0, tintInfo0, arr_v);
    }

    boolean k(@NonNull Context context0, @DrawableRes int v, @NonNull Drawable drawable0) {
        return this.a.x(context0, v, drawable0);
    }
}

