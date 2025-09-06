package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class c1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ConstraintLayout c;
    @NonNull
    public final Barrier d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final TextView g;
    @NonNull
    public final RecyclerView h;
    @NonNull
    public final RadioButton i;
    @NonNull
    public final EditText j;
    @NonNull
    public final RadioButton k;
    @NonNull
    public final TextView l;
    @NonNull
    public final ProgressBar m;
    @NonNull
    public final TextView n;
    @NonNull
    public final ConstraintLayout o;

    private c1(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull ConstraintLayout constraintLayout1, @NonNull Barrier barrier0, @NonNull ImageView imageView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull RecyclerView recyclerView0, @NonNull RadioButton radioButton0, @NonNull EditText editText0, @NonNull RadioButton radioButton1, @NonNull TextView textView3, @NonNull ProgressBar progressBar0, @NonNull TextView textView4, @NonNull ConstraintLayout constraintLayout2) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = constraintLayout1;
        this.d = barrier0;
        this.e = imageView0;
        this.f = textView1;
        this.g = textView2;
        this.h = recyclerView0;
        this.i = radioButton0;
        this.j = editText0;
        this.k = radioButton1;
        this.l = textView3;
        this.m = progressBar0;
        this.n = textView4;
        this.o = constraintLayout2;
    }

    @NonNull
    public static c1 a(@NonNull View view0) {
        int v = 0x7F0B03DC;  // id:dialog_ai_image_lora_setting_apply
        View view1 = ViewBindings.a(view0, 0x7F0B03DC);  // id:dialog_ai_image_lora_setting_apply
        if(((TextView)view1) != null) {
            v = 0x7F0B03F2;  // id:dialog_ai_prompt_save_barrier
            View view2 = ViewBindings.a(view0, 0x7F0B03F2);  // id:dialog_ai_prompt_save_barrier
            if(((Barrier)view2) != null) {
                v = 0x7F0B03F3;  // id:dialog_ai_prompt_save_close
                View view3 = ViewBindings.a(view0, 0x7F0B03F3);  // id:dialog_ai_prompt_save_close
                if(((ImageView)view3) != null) {
                    v = 0x7F0B03F4;  // id:dialog_ai_prompt_save_desc
                    View view4 = ViewBindings.a(view0, 0x7F0B03F4);  // id:dialog_ai_prompt_save_desc
                    if(((TextView)view4) != null) {
                        v = 0x7F0B03F5;  // id:dialog_ai_prompt_save_id
                        View view5 = ViewBindings.a(view0, 0x7F0B03F5);  // id:dialog_ai_prompt_save_id
                        if(((TextView)view5) != null) {
                            v = 0x7F0B03F6;  // id:dialog_ai_prompt_save_list
                            View view6 = ViewBindings.a(view0, 0x7F0B03F6);  // id:dialog_ai_prompt_save_list
                            if(((RecyclerView)view6) != null) {
                                v = 0x7F0B03F7;  // id:dialog_ai_prompt_save_new_button
                                View view7 = ViewBindings.a(view0, 0x7F0B03F7);  // id:dialog_ai_prompt_save_new_button
                                if(((RadioButton)view7) != null) {
                                    v = 0x7F0B03F8;  // id:dialog_ai_prompt_save_new_name
                                    View view8 = ViewBindings.a(view0, 0x7F0B03F8);  // id:dialog_ai_prompt_save_new_name
                                    if(((EditText)view8) != null) {
                                        v = 0x7F0B03F9;  // id:dialog_ai_prompt_save_overwrite_button
                                        View view9 = ViewBindings.a(view0, 0x7F0B03F9);  // id:dialog_ai_prompt_save_overwrite_button
                                        if(((RadioButton)view9) != null) {
                                            v = 0x7F0B03FA;  // id:dialog_ai_prompt_save_overwrite_count
                                            View view10 = ViewBindings.a(view0, 0x7F0B03FA);  // id:dialog_ai_prompt_save_overwrite_count
                                            if(((TextView)view10) != null) {
                                                v = 0x7F0B03FB;  // id:dialog_ai_prompt_save_progress
                                                View view11 = ViewBindings.a(view0, 0x7F0B03FB);  // id:dialog_ai_prompt_save_progress
                                                if(((ProgressBar)view11) != null) {
                                                    v = 0x7F0B03FC;  // id:dialog_ai_prompt_save_title
                                                    View view12 = ViewBindings.a(view0, 0x7F0B03FC);  // id:dialog_ai_prompt_save_title
                                                    if(((TextView)view12) != null) {
                                                        v = 0x7F0B03FD;  // id:dialog_ai_prompt_save_wrap
                                                        View view13 = ViewBindings.a(view0, 0x7F0B03FD);  // id:dialog_ai_prompt_save_wrap
                                                        if(((ConstraintLayout)view13) != null) {
                                                            return new c1(((ConstraintLayout)view0), ((TextView)view1), ((ConstraintLayout)view0), ((Barrier)view2), ((ImageView)view3), ((TextView)view4), ((TextView)view5), ((RecyclerView)view6), ((RadioButton)view7), ((EditText)view8), ((RadioButton)view9), ((TextView)view10), ((ProgressBar)view11), ((TextView)view12), ((ConstraintLayout)view13));
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
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static c1 c(@NonNull LayoutInflater layoutInflater0) {
        return c1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static c1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00C0, viewGroup0, false);  // layout:dialog_ai_prompt_save
        if(z) {
            viewGroup0.addView(view0);
        }
        return c1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

