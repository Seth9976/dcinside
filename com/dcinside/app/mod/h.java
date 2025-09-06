package com.dcinside.app.mod;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.os.FileObserver;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class h extends DialogFragment {
    public interface c {
        void b0();

        void y(@NonNull String arg1);
    }

    private String a;
    private String b;
    private c c;
    private Button d;
    private ImageButton e;
    private ImageButton f;
    private TextView g;
    private ArrayAdapter h;
    private List i;
    private File j;
    private File[] k;
    private FileObserver l;
    private DirectoryChooserConfig m;
    private int n;
    private static final String o = "CURRENT_DIRECTORY";
    private static final String p = "CONFIG";
    static final boolean q;

    static {
    }

    public h() {
        this.n = 0xFF888888;
    }

    // 检测为 Lambda 实现
    private void A0(View view0) [...]

    // 检测为 Lambda 实现
    private void B0(View view0) [...]

    // 检测为 Lambda 实现
    private static void C0(DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    private void D0(EditText editText0, Activity activity0, DialogInterface dialogInterface0, int v) [...]

    public static h E0(@NonNull DirectoryChooserConfig directoryChooserConfig0) {
        h h0 = new h();
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("CONFIG", directoryChooserConfig0);
        h0.setArguments(bundle0);
        return h0;
    }

    private void F0() {
        class a implements TextWatcher {
            final AlertDialog a;
            final TextView b;
            final h c;

            a(AlertDialog alertDialog0, TextView textView0) {
                this.a = alertDialog0;
                this.b = textView0;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
                boolean z = charSequence0.length() != 0;
                this.a.l(-1).setEnabled(z);
                String s = h.this.getString(0x7F15022F, new Object[]{charSequence0.toString()});  // string:create_folder_msg "%1$s로 폴더를 생성하시겠습니까?"
                this.b.setText(s);
            }
        }

        boolean z = true;
        int v = 0;
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 == null) {
            return;
        }
        ViewGroup viewGroup0 = (ViewGroup)fragmentActivity0.getWindow().getDecorView();
        View view0 = LayoutInflater.from(fragmentActivity0).inflate(0x7F0E00DE, viewGroup0, false);  // layout:dialog_new_folder
        TextView textView0 = (TextView)view0.findViewById(0x7F0B08A2);  // id:msgText
        EditText editText0 = (EditText)view0.findViewById(0x7F0B0446);  // id:editText
        editText0.setText(this.a);
        textView0.setText(this.getString(0x7F15022F, new Object[]{this.a}));  // string:create_folder_msg "%1$s로 폴더를 생성하시겠습니까?"
        AlertDialog alertDialog0 = new Builder(fragmentActivity0).F(0x7F15022E).setView(view0).setNegativeButton(0x1040000, (DialogInterface dialogInterface0, int v) -> dialogInterface0.dismiss()).setPositiveButton(0x104000A, (DialogInterface dialogInterface0, int v) -> {
            dialogInterface0.dismiss();
            this.a = editText0.getText().toString();
            Toast.makeText(fragmentActivity0, this.v0(), 0).show();
        }).I();
        Button button0 = alertDialog0.l(-1);
        if(editText0.getText().length() == 0) {
            z = false;
        }
        button0.setEnabled(z);
        editText0.addTextChangedListener(new a(this, alertDialog0, textView0));
        if(!this.m.e()) {
            v = 8;
        }
        editText0.setVisibility(v);
    }

    private void G0() {
        if(this.getActivity() != null) {
            File file0 = this.j;
            if(file0 != null) {
                this.d.setEnabled(this.w0(file0));
                this.getActivity().invalidateOptionsMenu();
            }
        }
    }

    private void H0() {
        File file0 = this.j;
        if(file0 != null) {
            this.t0(file0);
        }
    }

    private void I0() {
        File file0 = this.j;
        if(file0 == null) {
            c h$c1 = this.c;
            if(h$c1 != null) {
                h$c1.b0();
            }
        }
        else {
            c h$c0 = this.c;
            if(h$c0 != null) {
                h$c0.y(file0.getAbsolutePath());
            }
        }
    }

    public void J0(@ColorInt int v) {
        this.n = v;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 instanceof c) {
            this.c = (c)fragmentActivity0;
            return;
        }
        Fragment fragment0 = this.getTargetFragment();
        if(fragment0 instanceof c) {
            this.c = (c)fragment0;
        }
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(this.getArguments() == null) {
            throw new IllegalArgumentException("You must create DirectoryChooserFragment via newInstance().");
        }
        DirectoryChooserConfig directoryChooserConfig0 = (DirectoryChooserConfig)this.getArguments().getParcelable("CONFIG");
        this.m = directoryChooserConfig0;
        if(directoryChooserConfig0 == null) {
            throw new NullPointerException("No ARG_CONFIG provided for DirectoryChooserFragment creation.");
        }
        this.a = directoryChooserConfig0.h();
        this.b = this.m.g();
        if(bundle0 != null) {
            this.b = bundle0.getString("CURRENT_DIRECTORY");
        }
        if(this.getShowsDialog()) {
            this.setStyle(1, this.getTheme());
        }
        else {
            this.setHasOptionsMenu(true);
        }
        if(!this.m.e() && TextUtils.isEmpty(this.a)) {
            throw new IllegalArgumentException("New directory name must have a strictly positive length (not zero) when user is not allowed to modify it.");
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(@NonNull Menu menu0, @NonNull MenuInflater menuInflater0) {
        menuInflater0.inflate(0x7F100005, menu0);  // mipmap:ic_launcher1
        MenuItem menuItem0 = menu0.findItem(0x7F0B08F2);  // id:new_folder_item
        if(menuItem0 == null) {
            return;
        }
        menuItem0.setVisible(this.w0(this.j) && this.a != null);
    }

    @Override  // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E00E3, viewGroup0, false);  // layout:directory_chooser
        this.d = (Button)view0.findViewById(0x7F0B0267);  // id:btnConfirm
        Button button0 = (Button)view0.findViewById(0x7F0B0266);  // id:btnCancel
        this.e = (ImageButton)view0.findViewById(0x7F0B0269);  // id:btnNavUp
        this.f = (ImageButton)view0.findViewById(0x7F0B0268);  // id:btnCreateFolder
        this.g = (TextView)view0.findViewById(0x7F0B0FF0);  // id:txtvSelectedFolder
        ListView listView0 = (ListView)view0.findViewById(0x7F0B0429);  // id:directoryList
        this.d.setOnClickListener((View view0) -> if(this.w0(this.j)) {
            this.I0();
        });
        button0.setOnClickListener((View view0) -> {
            c h$c0 = this.c;
            if(h$c0 != null) {
                h$c0.b0();
            }
        });
        listView0.setOnItemClickListener((AdapterView adapterView0, View view0, int v, long v1) -> {
            File[] arr_file = this.k;
            if(arr_file != null && v >= 0 && v < arr_file.length) {
                this.t0(arr_file[v]);
            }
        });
        this.e.setOnClickListener((View view0) -> {
            File file0 = this.j;
            if(file0 != null) {
                File file1 = file0.getParentFile();
                if(file1 != null) {
                    this.t0(file1);
                }
            }
        });
        this.e.setColorFilter(this.n);
        this.f.setColorFilter(this.n);
        this.f.setOnClickListener((View view0) -> this.F0());
        if(!this.getShowsDialog()) {
            this.f.setVisibility(8);
        }
        this.s0();
        this.i = new ArrayList();
        ArrayAdapter arrayAdapter0 = new ArrayAdapter(this.getActivity(), 0x1090003, this.i);
        this.h = arrayAdapter0;
        listView0.setAdapter(arrayAdapter0);
        this.t0((TextUtils.isEmpty(this.b) || !this.w0(new File(this.b)) ? Environment.getExternalStorageDirectory() : new File(this.b)));
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDetach() {
        super.onDetach();
        this.c = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem0) {
        if(menuItem0.getItemId() == 0x7F0B08F2) {  // id:new_folder_item
            this.F0();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FileObserver fileObserver0 = this.l;
        if(fileObserver0 != null) {
            fileObserver0.stopWatching();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FileObserver fileObserver0 = this.l;
        if(fileObserver0 != null) {
            fileObserver0.startWatching();
        }
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onSaveInstanceState(@NonNull Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        File file0 = this.j;
        if(file0 != null) {
            bundle0.putString("CURRENT_DIRECTORY", file0.getAbsolutePath());
        }
    }

    private void s0() {
        int v;
        Resources.Theme resources$Theme0 = this.getActivity() == null ? null : this.getActivity().getTheme();
        if(resources$Theme0 == null) {
            v = 0xFFFFFF;
        }
        else {
            TypedArray typedArray0 = resources$Theme0.obtainStyledAttributes(new int[]{0x1010031});
            if(typedArray0 == null) {
                v = 0xFFFFFF;
            }
            else {
                v = typedArray0.getColor(0, 0xFFFFFF);
                typedArray0.recycle();
            }
        }
        if(v != 0xFFFFFF && ((double)Color.red(v)) * 0.21 + ((double)Color.green(v)) * 0.72 + ((double)Color.blue(v)) * 0.07 < 128.0) {
            this.e.setImageResource(0x7F080449);  // drawable:navigation_up_light
            this.f.setImageResource(0x7F080218);  // drawable:ic_action_create_light
        }
    }

    private void t0(File file0) {
        int v2;
        if(file0 != null && file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            int v = 0;
            if(arr_file == null) {
                v2 = 0;
            }
            else {
                v2 = 0;
                for(int v1 = 0; v1 < arr_file.length; ++v1) {
                    if(arr_file[v1].isDirectory()) {
                        ++v2;
                    }
                }
            }
            this.k = new File[v2];
            this.i.clear();
            for(int v3 = 0; v < v2; ++v3) {
                if(arr_file[v3].isDirectory()) {
                    this.k[v] = arr_file[v3];
                    this.i.add(arr_file[v3].getName());
                    ++v;
                }
            }
            Arrays.sort(this.k);
            Collections.sort(this.i);
            this.j = file0;
            this.g.setText(file0.getAbsolutePath());
            this.h.notifyDataSetChanged();
            FileObserver fileObserver0 = this.u0(file0.getAbsolutePath());
            this.l = fileObserver0;
            fileObserver0.startWatching();
        }
        this.G0();
    }

    private FileObserver u0(String s) {
        class b extends FileObserver {
            final h a;

            b(String s, int v) {
                super(s, v);
            }

            // 检测为 Lambda 实现
            private void b() [...]

            @Override  // android.os.FileObserver
            public void onEvent(int v, String s) {
                FragmentActivity fragmentActivity0 = h.this.getActivity();
                if(fragmentActivity0 != null) {
                    fragmentActivity0.runOnUiThread(() -> h.this.H0());
                }
            }
        }

        return new b(this, s, 960);
    }

    private int v0() {
        if(this.a != null && (this.j != null && this.j.canWrite())) {
            File file0 = new File(this.j, this.a);
            if(file0.exists()) {
                return 0x7F15022C;  // string:create_folder_error_already_exists "폴더가 이미 존재합니다."
            }
            return file0.mkdir() ? 0x7F150230 : 0x7F15022B;  // string:create_folder_success "폴더가 생성되었습니다."
        }
        return this.j == null || this.j.canWrite() ? 0x7F15022B : 0x7F15022D;  // string:create_folder_error "폴더를 생성할 수 없습니다."
    }

    // 去混淆评级： 低(40)
    private boolean w0(File file0) {
        return file0 != null && file0.isDirectory() && file0.canRead() && (this.m.e() || file0.canWrite());
    }

    // 检测为 Lambda 实现
    private void x0(View view0) [...]

    // 检测为 Lambda 实现
    private void y0(View view0) [...]

    // 检测为 Lambda 实现
    private void z0(AdapterView adapterView0, View view0, int v, long v1) [...]
}

