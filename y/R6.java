package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ProfileHeaderTextView;

public final class r6 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ProfileHeaderTextView b;
    @NonNull
    public final Barrier c;
    @NonNull
    public final View d;
    @NonNull
    public final LinearLayout e;
    @NonNull
    public final TextView f;
    @NonNull
    public final TextView g;
    @NonNull
    public final ImageView h;

    private r6(@NonNull ConstraintLayout constraintLayout0, @NonNull ProfileHeaderTextView profileHeaderTextView0, @NonNull Barrier barrier0, @NonNull View view0, @NonNull LinearLayout linearLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull ImageView imageView0) {
        this.a = constraintLayout0;
        this.b = profileHeaderTextView0;
        this.c = barrier0;
        this.d = view0;
        this.e = linearLayout0;
        this.f = textView0;
        this.g = textView1;
        this.h = imageView0;
    }

    @NonNull
    public static r6 a(@NonNull View view0) {
        int v = 0x7F0B09A5;  // id:person_header_content
        View view1 = ViewBindings.a(view0, 0x7F0B09A5);  // id:person_header_content
        if(((ProfileHeaderTextView)view1) != null) {
            v = 0x7F0B09A6;  // id:person_header_content_barrier
            View view2 = ViewBindings.a(view0, 0x7F0B09A6);  // id:person_header_content_barrier
            if(((Barrier)view2) != null) {
                v = 0x7F0B09A7;  // id:person_header_divide
                View view3 = ViewBindings.a(view0, 0x7F0B09A7);  // id:person_header_divide
                if(view3 != null) {
                    v = 0x7F0B09A8;  // id:person_header_go_profile
                    View view4 = ViewBindings.a(view0, 0x7F0B09A8);  // id:person_header_go_profile
                    if(((LinearLayout)view4) != null) {
                        v = 0x7F0B09A9;  // id:person_header_go_profile_text
                        View view5 = ViewBindings.a(view0, 0x7F0B09A9);  // id:person_header_go_profile_text
                        if(((TextView)view5) != null) {
                            v = 0x7F0B09AA;  // id:person_header_personal_connection
                            View view6 = ViewBindings.a(view0, 0x7F0B09AA);  // id:person_header_personal_connection
                            if(((TextView)view6) != null) {
                                v = 0x7F0B09AB;  // id:person_header_profile_img
                                View view7 = ViewBindings.a(view0, 0x7F0B09AB);  // id:person_header_profile_img
                                if(((ImageView)view7) != null) {
                                    return new r6(((ConstraintLayout)view0), ((ProfileHeaderTextView)view1), ((Barrier)view2), view3, ((LinearLayout)view4), ((TextView)view5), ((TextView)view6), ((ImageView)view7));
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
    public static r6 c(@NonNull LayoutInflater layoutInflater0) {
        return r6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static r6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0235, viewGroup0, false);  // layout:view_post_list_person_header
        if(z) {
            viewGroup0.addView(view0);
        }
        return r6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

