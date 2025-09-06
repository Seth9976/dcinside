package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DividerConstraintLayout;
import com.dcinside.app.view.ResizeTextView;
import com.facebook.drawee.view.SimpleDraweeView;

public final class l7 implements ViewBinding {
    @NonNull
    private final DividerConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final ResizeTextView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final ImageView g;
    @NonNull
    public final ImageView h;
    @NonNull
    public final TextView i;
    @NonNull
    public final TextView j;
    @NonNull
    public final Barrier k;
    @NonNull
    public final TextView l;
    @NonNull
    public final ResizeTextView m;
    @NonNull
    public final SimpleDraweeView n;
    @NonNull
    public final ImageView o;
    @NonNull
    public final ResizeTextView p;
    @NonNull
    public final AppCompatImageView q;
    @NonNull
    public final ResizeTextView r;
    @NonNull
    public final SimpleDraweeView s;
    @NonNull
    public final ResizeTextView t;
    @NonNull
    public final AppCompatImageView u;
    @NonNull
    public final ResizeTextView v;

    private l7(@NonNull DividerConstraintLayout dividerConstraintLayout0, @NonNull TextView textView0, @NonNull ImageView imageView0, @NonNull ImageView imageView1, @NonNull ResizeTextView resizeTextView0, @NonNull TextView textView1, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull Barrier barrier0, @NonNull TextView textView4, @NonNull ResizeTextView resizeTextView1, @NonNull SimpleDraweeView simpleDraweeView0, @NonNull ImageView imageView4, @NonNull ResizeTextView resizeTextView2, @NonNull AppCompatImageView appCompatImageView0, @NonNull ResizeTextView resizeTextView3, @NonNull SimpleDraweeView simpleDraweeView1, @NonNull ResizeTextView resizeTextView4, @NonNull AppCompatImageView appCompatImageView1, @NonNull ResizeTextView resizeTextView5) {
        this.a = dividerConstraintLayout0;
        this.b = textView0;
        this.c = imageView0;
        this.d = imageView1;
        this.e = resizeTextView0;
        this.f = textView1;
        this.g = imageView2;
        this.h = imageView3;
        this.i = textView2;
        this.j = textView3;
        this.k = barrier0;
        this.l = textView4;
        this.m = resizeTextView1;
        this.n = simpleDraweeView0;
        this.o = imageView4;
        this.p = resizeTextView2;
        this.q = appCompatImageView0;
        this.r = resizeTextView3;
        this.s = simpleDraweeView1;
        this.t = resizeTextView4;
        this.u = appCompatImageView1;
        this.v = resizeTextView5;
    }

    @NonNull
    public static l7 a(@NonNull View view0) {
        int v = 0x7F0B0D1F;  // id:reply_dccon_block
        View view1 = ViewBindings.a(view0, 0x7F0B0D1F);  // id:reply_dccon_block
        if(((TextView)view1) != null) {
            v = 0x7F0B0D20;  // id:reply_dccon_block_left_icon
            View view2 = ViewBindings.a(view0, 0x7F0B0D20);  // id:reply_dccon_block_left_icon
            if(((ImageView)view2) != null) {
                v = 0x7F0B0D21;  // id:reply_dccon_block_right_icon
                View view3 = ViewBindings.a(view0, 0x7F0B0D21);  // id:reply_dccon_block_right_icon
                if(((ImageView)view3) != null) {
                    v = 0x7F0B0D22;  // id:reply_dccon_buy
                    View view4 = ViewBindings.a(view0, 0x7F0B0D22);  // id:reply_dccon_buy
                    if(((ResizeTextView)view4) != null) {
                        v = 0x7F0B0D23;  // id:reply_dccon_down
                        View view5 = ViewBindings.a(view0, 0x7F0B0D23);  // id:reply_dccon_down
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0D24;  // id:reply_dccon_icon_block
                            View view6 = ViewBindings.a(view0, 0x7F0B0D24);  // id:reply_dccon_icon_block
                            if(((ImageView)view6) != null) {
                                v = 0x7F0B0D25;  // id:reply_dccon_icon_down
                                View view7 = ViewBindings.a(view0, 0x7F0B0D25);  // id:reply_dccon_icon_down
                                if(((ImageView)view7) != null) {
                                    v = 0x7F0B0D26;  // id:reply_dccon_left_image_alt
                                    View view8 = ViewBindings.a(view0, 0x7F0B0D26);  // id:reply_dccon_left_image_alt
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B0D27;  // id:reply_dccon_right_image_alt
                                        View view9 = ViewBindings.a(view0, 0x7F0B0D27);  // id:reply_dccon_right_image_alt
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B0D28;  // id:reply_dccons_bottom_barrier
                                            View view10 = ViewBindings.a(view0, 0x7F0B0D28);  // id:reply_dccons_bottom_barrier
                                            if(((Barrier)view10) != null) {
                                                v = 0x7F0B0D2D;  // id:reply_first_icon
                                                View view11 = ViewBindings.a(view0, 0x7F0B0D2D);  // id:reply_first_icon
                                                if(((TextView)view11) != null) {
                                                    v = 0x7F0B0D2E;  // id:reply_ip
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0D2E);  // id:reply_ip
                                                    if(((ResizeTextView)view12) != null) {
                                                        v = 0x7F0B0D2F;  // id:reply_left_image
                                                        View view13 = ViewBindings.a(view0, 0x7F0B0D2F);  // id:reply_left_image
                                                        if(((SimpleDraweeView)view13) != null) {
                                                            v = 0x7F0B0D30;  // id:reply_member_ic
                                                            View view14 = ViewBindings.a(view0, 0x7F0B0D30);  // id:reply_member_ic
                                                            if(((ImageView)view14) != null) {
                                                                v = 0x7F0B0D32;  // id:reply_mention
                                                                View view15 = ViewBindings.a(view0, 0x7F0B0D32);  // id:reply_mention
                                                                if(((ResizeTextView)view15) != null) {
                                                                    v = 0x7F0B0D33;  // id:reply_more
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B0D33);  // id:reply_more
                                                                    if(((AppCompatImageView)view16) != null) {
                                                                        v = 0x7F0B0D65;  // id:reply_name
                                                                        View view17 = ViewBindings.a(view0, 0x7F0B0D65);  // id:reply_name
                                                                        if(((ResizeTextView)view17) != null) {
                                                                            v = 0x7F0B0D6A;  // id:reply_right_image
                                                                            View view18 = ViewBindings.a(view0, 0x7F0B0D6A);  // id:reply_right_image
                                                                            if(((SimpleDraweeView)view18) != null) {
                                                                                v = 0x7F0B0D70;  // id:reply_time
                                                                                View view19 = ViewBindings.a(view0, 0x7F0B0D70);  // id:reply_time
                                                                                if(((ResizeTextView)view19) != null) {
                                                                                    v = 0x7F0B0D73;  // id:reply_under_icon
                                                                                    View view20 = ViewBindings.a(view0, 0x7F0B0D73);  // id:reply_under_icon
                                                                                    if(((AppCompatImageView)view20) != null) {
                                                                                        v = 0x7F0B0D74;  // id:reply_user_memo
                                                                                        View view21 = ViewBindings.a(view0, 0x7F0B0D74);  // id:reply_user_memo
                                                                                        if(((ResizeTextView)view21) != null) {
                                                                                            return new l7(((DividerConstraintLayout)view0), ((TextView)view1), ((ImageView)view2), ((ImageView)view3), ((ResizeTextView)view4), ((TextView)view5), ((ImageView)view6), ((ImageView)view7), ((TextView)view8), ((TextView)view9), ((Barrier)view10), ((TextView)view11), ((ResizeTextView)view12), ((SimpleDraweeView)view13), ((ImageView)view14), ((ResizeTextView)view15), ((AppCompatImageView)view16), ((ResizeTextView)view17), ((SimpleDraweeView)view18), ((ResizeTextView)view19), ((AppCompatImageView)view20), ((ResizeTextView)view21));
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public DividerConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static l7 c(@NonNull LayoutInflater layoutInflater0) {
        return l7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static l7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0264, viewGroup0, false);  // layout:view_reply_item_image_big
        if(z) {
            viewGroup0.addView(view0);
        }
        return l7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

