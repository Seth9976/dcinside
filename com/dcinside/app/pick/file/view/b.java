package com.dcinside.app.pick.file.view;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.dcinside.app.Application;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Fk;
import e0.c;
import f0.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nFilePickerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePickerDialog.kt\ncom/dcinside/app/pick/file/view/FilePickerDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
public final class b extends AlertDialog implements AdapterView.OnItemClickListener {
    @l
    private c i;
    @m
    private ListView j;
    @m
    private TextView k;
    @m
    private TextView l;
    @m
    private Function1 m;
    @l
    private ArrayList n;
    @l
    private a o;
    @l
    private com.dcinside.app.pick.file.view.a p;

    public b(@l Context context0, @l c c0) {
        L.p(context0, "context");
        L.p(c0, "properties");
        super(context0);
        this.i = c0;
        this.n = new ArrayList();
        this.o = new a(this.i);
        this.p = new com.dcinside.app.pick.file.view.a(context0, this.n);
    }

    public b(Context context0, c c0, int v, w w0) {
        if((v & 2) != 0) {
            c0 = new c();
        }
        this(context0, c0);
    }

    private final List B(File file0, a a0) {
        List list0 = new ArrayList();
        try {
            File[] arr_file = file0.listFiles(a0);
            L.o(arr_file, "listFiles(...)");
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                if(file1.canRead()) {
                    list0.add(new e0.b(file1.getName(), file1.getAbsolutePath(), file1.isDirectory(), file1.lastModified(), file1.length()));
                }
            }
            u.m0(list0);
            return list0;
        }
        catch(NullPointerException nullPointerException0) {
        }
        nullPointerException0.printStackTrace();
        return new ArrayList();
    }

    public final void C(@m Function1 function10) {
        this.m = function10;
    }

    private final boolean D() {
        String s = this.i.c().getAbsolutePath();
        String s1 = this.i.d().getAbsolutePath();
        if(!L.g(s, s1)) {
            L.m(s);
            L.m(s1);
            return v.W2(s, s1, false, 2, null);
        }
        return false;
    }

    @Override  // androidx.appcompat.app.AppCompatDialog, android.content.DialogInterface
    public void dismiss() {
        this.n.clear();
        super.dismiss();
    }

    @Override  // androidx.appcompat.app.AlertDialog
    protected void onCreate(@m Bundle bundle0) {
        this.requestWindowFeature(1);
        super.onCreate(bundle0);
        this.setContentView(0x7F0E0220);  // layout:view_picker_file_main
        this.j = (ListView)this.findViewById(0x7F0B09C9);  // id:picker_file_main_list
        this.k = (TextView)this.findViewById(0x7F0B09C2);  // id:picker_file_header_name
        this.l = (TextView)this.findViewById(0x7F0B09C3);  // id:picker_file_header_path
        ListView listView0 = this.j;
        if(listView0 != null) {
            listView0.setAdapter(this.p);
        }
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public void onItemClick(@l AdapterView adapterView0, @l View view0, int v, long v1) {
        L.p(adapterView0, "adapterView");
        L.p(view0, "view");
        if(this.n.size() < v) {
            return;
        }
        Object object0 = this.n.get(v);
        if(((e0.b)object0).b() == null) {
            object0 = null;
        }
        if(((e0.b)object0) == null) {
            return;
        }
        if(((e0.b)object0).f()) {
            if(new File(((e0.b)object0).b()).canRead()) {
                File file0 = new File(((e0.b)object0).b());
                TextView textView0 = this.k;
                L.m(textView0);
                textView0.setText(file0.getName());
                TextView textView1 = this.l;
                L.m(textView1);
                textView1.setText(Fk.i(file0.getAbsolutePath()));
                this.n.clear();
                if(!L.g(file0.getName(), this.i.d().getName())) {
                    e0.b b0 = new e0.b("...", file0.getParentFile().getAbsolutePath(), true, file0.lastModified(), 0L);
                    this.n.add(b0);
                }
                this.n.addAll(this.B(file0, this.o));
                this.p.notifyDataSetChanged();
                return;
            }
            Dl.D(Application.e.c(), 0x7F150345);  // string:file_picker_error_dir_access "경로에 접근할 수 없습니다."
            return;
        }
        Function1 function10 = this.m;
        if(function10 != null) {
            String s = ((e0.b)object0).b();
            L.m(s);
            function10.invoke(new String[]{s});
        }
        this.dismiss();
    }

    @Override  // androidx.activity.ComponentDialog
    protected void onStart() {
        File file0;
        super.onStart();
        this.n.clear();
        if(!this.i.c().isDirectory() || !this.D()) {
            file0 = !this.i.d().exists() || !this.i.d().isDirectory() ? new File(this.i.a().getAbsolutePath()) : new File(this.i.d().getAbsolutePath());
        }
        else {
            file0 = new File(this.i.c().getAbsolutePath());
            e0.b b0 = new e0.b("...", file0.getParentFile().getAbsolutePath(), true, file0.lastModified(), 0L);
            this.n.add(b0);
        }
        TextView textView0 = this.k;
        L.m(textView0);
        textView0.setText(file0.getName());
        TextView textView1 = this.l;
        L.m(textView1);
        textView1.setText(Fk.i(file0.getAbsolutePath()));
        this.n.addAll(this.B(file0, this.o));
        this.p.notifyDataSetChanged();
        ListView listView0 = this.j;
        L.m(listView0);
        listView0.setOnItemClickListener(this);
    }
}

