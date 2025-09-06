package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.StateAnnounceView;

public final class v6 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final FrameLayout e;
    @NonNull
    public final RecyclerView f;
    @NonNull
    public final ConstraintLayout g;
    @NonNull
    public final View h;
    @NonNull
    public final FrameLayout i;
    @NonNull
    public final ProgressBar j;
    @NonNull
    public final StateAnnounceView k;
    @NonNull
    public final TextView l;
    @NonNull
    public final ConstraintLayout m;
    @NonNull
    public final View n;
    @NonNull
    public final LinearLayout o;
    @NonNull
    public final TextView p;
    @NonNull
    public final ImageView q;
    @NonNull
    public final TextView r;
    @NonNull
    public final TextView s;
    @NonNull
    public final LinearLayout t;

    private v6(@NonNull FrameLayout frameLayout0, @NonNull LinearLayout linearLayout0, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull FrameLayout frameLayout1, @NonNull RecyclerView recyclerView0, @NonNull ConstraintLayout constraintLayout0, @NonNull View view0, @NonNull FrameLayout frameLayout2, @NonNull ProgressBar progressBar0, @NonNull StateAnnounceView stateAnnounceView0, @NonNull TextView textView1, @NonNull ConstraintLayout constraintLayout1, @NonNull View view1, @NonNull LinearLayout linearLayout1, @NonNull TextView textView2, @NonNull ImageView imageView1, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull LinearLayout linearLayout2) {
        this.a = frameLayout0;
        this.b = linearLayout0;
        this.c = imageView0;
        this.d = textView0;
        this.e = frameLayout1;
        this.f = recyclerView0;
        this.g = constraintLayout0;
        this.h = view0;
        this.i = frameLayout2;
        this.j = progressBar0;
        this.k = stateAnnounceView0;
        this.l = textView1;
        this.m = constraintLayout1;
        this.n = view1;
        this.o = linearLayout1;
        this.p = textView2;
        this.q = imageView1;
        this.r = textView3;
        this.s = textView4;
        this.t = linearLayout2;
    }

    @NonNull
    public static v6 a(@NonNull View view0) {
        int v = 0x7F0B05D3;  // id:image_note_bg
        View view1 = ViewBindings.a(view0, 0x7F0B05D3);  // id:image_note_bg
        if(((LinearLayout)view1) != null) {
            v = 0x7F0B05D4;  // id:image_note_close
            View view2 = ViewBindings.a(view0, 0x7F0B05D4);  // id:image_note_close
            if(((ImageView)view2) != null) {
                v = 0x7F0B05D5;  // id:image_note_confirm
                View view3 = ViewBindings.a(view0, 0x7F0B05D5);  // id:image_note_confirm
                if(((TextView)view3) != null) {
                    v = 0x7F0B05F1;  // id:image_note_input_parent
                    View view4 = ViewBindings.a(view0, 0x7F0B05F1);  // id:image_note_input_parent
                    if(((FrameLayout)view4) != null) {
                        v = 0x7F0B05FA;  // id:image_note_list
                        View view5 = ViewBindings.a(view0, 0x7F0B05FA);  // id:image_note_list
                        if(((RecyclerView)view5) != null) {
                            v = 0x7F0B05FB;  // id:image_note_move
                            View view6 = ViewBindings.a(view0, 0x7F0B05FB);  // id:image_note_move
                            if(((ConstraintLayout)view6) != null) {
                                v = 0x7F0B05FC;  // id:image_note_move_icon
                                View view7 = ViewBindings.a(view0, 0x7F0B05FC);  // id:image_note_move_icon
                                if(view7 != null) {
                                    v = 0x7F0B05FE;  // id:image_note_progress_write
                                    View view8 = ViewBindings.a(view0, 0x7F0B05FE);  // id:image_note_progress_write
                                    if(((ProgressBar)view8) != null) {
                                        v = 0x7F0B05FF;  // id:image_note_state
                                        View view9 = ViewBindings.a(view0, 0x7F0B05FF);  // id:image_note_state
                                        if(((StateAnnounceView)view9) != null) {
                                            v = 0x7F0B0600;  // id:image_note_text
                                            View view10 = ViewBindings.a(view0, 0x7F0B0600);  // id:image_note_text
                                            if(((TextView)view10) != null) {
                                                v = 0x7F0B0601;  // id:image_note_text_container
                                                View view11 = ViewBindings.a(view0, 0x7F0B0601);  // id:image_note_text_container
                                                if(((ConstraintLayout)view11) != null) {
                                                    v = 0x7F0B0602;  // id:image_note_text_divider
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0602);  // id:image_note_text_divider
                                                    if(view12 != null) {
                                                        v = 0x7F0B0603;  // id:image_note_text_nick_icon_container
                                                        View view13 = ViewBindings.a(view0, 0x7F0B0603);  // id:image_note_text_nick_icon_container
                                                        if(((LinearLayout)view13) != null) {
                                                            v = 0x7F0B0604;  // id:image_note_text_profile_anonymous
                                                            View view14 = ViewBindings.a(view0, 0x7F0B0604);  // id:image_note_text_profile_anonymous
                                                            if(((TextView)view14) != null) {
                                                                v = 0x7F0B0605;  // id:image_note_text_profile_icon
                                                                View view15 = ViewBindings.a(view0, 0x7F0B0605);  // id:image_note_text_profile_icon
                                                                if(((ImageView)view15) != null) {
                                                                    v = 0x7F0B0606;  // id:image_note_text_profile_name
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B0606);  // id:image_note_text_profile_name
                                                                    if(((TextView)view16) != null) {
                                                                        v = 0x7F0B0607;  // id:image_note_title
                                                                        View view17 = ViewBindings.a(view0, 0x7F0B0607);  // id:image_note_title
                                                                        if(((TextView)view17) != null) {
                                                                            v = 0x7F0B0EEB;  // id:shadow_wrap
                                                                            View view18 = ViewBindings.a(view0, 0x7F0B0EEB);  // id:shadow_wrap
                                                                            if(((LinearLayout)view18) != null) {
                                                                                return new v6(((FrameLayout)view0), ((LinearLayout)view1), ((ImageView)view2), ((TextView)view3), ((FrameLayout)view4), ((RecyclerView)view5), ((ConstraintLayout)view6), view7, ((FrameLayout)view0), ((ProgressBar)view8), ((StateAnnounceView)view9), ((TextView)view10), ((ConstraintLayout)view11), view12, ((LinearLayout)view13), ((TextView)view14), ((ImageView)view15), ((TextView)view16), ((TextView)view17), ((LinearLayout)view18));
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
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static v6 c(@NonNull LayoutInflater layoutInflater0) {
        return v6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static v6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0239, viewGroup0, false);  // layout:view_post_read_image_note
        if(z) {
            viewGroup0.addView(view0);
        }
        return v6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

