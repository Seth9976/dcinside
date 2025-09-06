package com.bytedance.sdk.component.JQp.ReZ.PjT.PjT;

import android.util.Log;
import com.bytedance.sdk.component.utils.DWo;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

public final class PjT implements Closeable {
    public final class com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT {
        class com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT.PjT extends FilterOutputStream {
            final com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT PjT;

            private com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT.PjT(OutputStream outputStream0) {
                super(outputStream0);
            }

            com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT.PjT(OutputStream outputStream0, com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.1 pjT$10) {
                this(outputStream0);
            }

            @Override
            public void close() {
                try {
                    this.out.close();
                }
                catch(IOException unused_ex) {
                    com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT.this.cr = true;
                }
            }

            @Override
            public void flush() {
                try {
                    this.out.flush();
                }
                catch(IOException unused_ex) {
                    com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT.this.cr = true;
                }
            }

            @Override
            public void write(int v) {
                try {
                    this.out.write(v);
                }
                catch(IOException unused_ex) {
                    com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT.this.cr = true;
                }
            }

            @Override
            public void write(byte[] arr_b, int v, int v1) {
                try {
                    this.out.write(arr_b, v, v1);
                }
                catch(IOException unused_ex) {
                    com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT.this.cr = true;
                }
            }
        }

        private boolean JQp;
        final PjT PjT;
        private final boolean[] ReZ;
        private final Zh Zh;
        private boolean cr;

        private com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT(Zh pjT$Zh0) {
            this.Zh = pjT$Zh0;
            this.ReZ = pjT$Zh0.cr ? null : new boolean[pjT0.DWo];
        }

        com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT(Zh pjT$Zh0, com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.1 pjT$10) {
            this(pjT$Zh0);
        }

        public OutputStream PjT(int v) throws IOException {
            FileOutputStream fileOutputStream0;
            if(v < 0 || v >= PjT.this.DWo) {
                throw new IllegalArgumentException("Expected index " + v + " to be greater than 0 and less than the maximum value count of " + PjT.this.DWo);
            }
            PjT pjT0 = PjT.this;
            __monitor_enter(pjT0);
            try {
                if(this.Zh.JQp != this) {
                    throw new IllegalStateException();
                }
                if(!this.Zh.cr) {
                    this.ReZ[v] = true;
                }
                File file0 = this.Zh.Zh(v);
                try {
                    fileOutputStream0 = new FileOutputStream(file0);
                }
                catch(FileNotFoundException unused_ex) {
                    PjT.this.cr.mkdirs();
                    try {
                        fileOutputStream0 = new FileOutputStream(file0);
                    }
                    catch(FileNotFoundException unused_ex) {
                        __monitor_exit(pjT0);
                        return PjT.ReZ;
                    }
                }
                __monitor_exit(pjT0);
                return new com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT.PjT(this, fileOutputStream0, null);
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(pjT0);
            throw throwable0;
        }

        public void PjT() throws IOException {
            if(this.cr) {
                PjT.this.PjT(this, false);
                PjT.this.ReZ(this.Zh.Zh);
            }
            else {
                PjT.this.PjT(this, true);
            }
            this.JQp = true;
        }

        public void Zh() throws IOException {
            PjT.this.PjT(this, false);
        }
    }

    public final class ReZ implements Closeable {
        private final long[] JQp;
        final PjT PjT;
        private final long ReZ;
        private final String Zh;
        private final InputStream[] cr;

        private ReZ(String s, long v, InputStream[] arr_inputStream, long[] arr_v) {
            this.Zh = s;
            this.ReZ = v;
            this.cr = arr_inputStream;
            this.JQp = arr_v;
        }

        ReZ(String s, long v, InputStream[] arr_inputStream, long[] arr_v, com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.1 pjT$10) {
            this(s, v, arr_inputStream, arr_v);
        }

        public InputStream PjT(int v) {
            return this.cr[v];
        }

        @Override
        public void close() {
            InputStream[] arr_inputStream = this.cr;
            for(int v = 0; v < arr_inputStream.length; ++v) {
                DWo.PjT(arr_inputStream[v]);
            }
        }
    }

    final class Zh {
        private com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT JQp;
        final PjT PjT;
        private final long[] ReZ;
        private final String Zh;
        private boolean cr;
        private long cz;

        private Zh(String s) {
            this.Zh = s;
            this.ReZ = new long[pjT0.DWo];
        }

        Zh(String s, com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.1 pjT$10) {
            this(s);
        }

        private void PjT(String[] arr_s) throws IOException {
            if(arr_s.length == PjT.this.DWo) {
                try {
                    for(int v = 0; v < arr_s.length; ++v) {
                        this.ReZ[v] = Long.parseLong(arr_s[v]);
                    }
                    return;
                }
                catch(NumberFormatException unused_ex) {
                    throw this.Zh(arr_s);
                }
            }
            throw this.Zh(arr_s);
        }

        public File PjT(int v) {
            return new File(PjT.this.cr, this.Zh + "." + v);
        }

        public String PjT() throws IOException {
            StringBuilder stringBuilder0 = new StringBuilder();
            long[] arr_v = this.ReZ;
            for(int v = 0; v < arr_v.length; ++v) {
                long v1 = arr_v[v];
                stringBuilder0.append(' ');
                stringBuilder0.append(v1);
            }
            return stringBuilder0.toString();
        }

        private IOException Zh(String[] arr_s) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(arr_s));
        }

        public File Zh(int v) {
            return new File(PjT.this.cr, this.Zh + "." + v + ".tmp");
        }
    }

    private final int Au;
    private final int DWo;
    private final File JQp;
    static final Pattern PjT;
    public static final OutputStream ReZ;
    private long SM;
    private final File XX;
    final ExecutorService Zh;
    private final File cr;
    private final File cz;
    private int fDm;
    private long qj;
    private long qla;
    private final Callable ub;
    private long xE;
    private Writer xf;
    private final LinkedHashMap xs;

    static {
        PjT.PjT = Pattern.compile("[a-z0-9_-]{1,120}");
        PjT.ReZ = new OutputStream() {
            @Override
            public void write(int v) throws IOException {
            }
        };
    }

    private PjT(File file0, int v, int v1, long v2, ExecutorService executorService0) {
        this.qj = 0L;
        this.xs = new LinkedHashMap(0, 0.75f, true);
        this.qla = -1L;
        this.xE = 0L;
        this.ub = new Callable() {
            final PjT PjT;

            public Void PjT() throws Exception {
                PjT pjT0 = PjT.this;
                __monitor_enter(pjT0);
                try {
                    if(PjT.this.xf == null) {
                        __monitor_exit(pjT0);
                        return null;
                    }
                    PjT.this.Au();
                    if(PjT.this.cz()) {
                        PjT.this.JQp();
                        PjT.this.fDm = 0;
                    }
                    __monitor_exit(pjT0);
                    return null;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(pjT0);
                throw throwable0;
            }

            @Override
            public Object call() throws Exception {
                return this.PjT();
            }
        };
        this.cr = file0;
        this.Au = v;
        this.JQp = new File(file0, "journal");
        this.cz = new File(file0, "journal.tmp");
        this.XX = new File(file0, "journal.bkp");
        this.DWo = v1;
        this.SM = v2;
        this.Zh = executorService0;
    }

    private void Au() throws IOException {
        long v = this.SM;
        long v1 = this.qla;
        if(v1 >= 0L) {
            v = v1;
        }
        while(this.qj > v) {
            Object object0 = this.xs.entrySet().iterator().next();
            this.ReZ(((String)((Map.Entry)object0).getKey()));
        }
        this.qla = -1L;
    }

    private void JQp() throws IOException {
        synchronized(this) {
            Writer writer0 = this.xf;
            if(writer0 != null) {
                writer0.close();
            }
            BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.cz), cr.PjT));
            try {
                bufferedWriter0.write("libcore.io.DiskLruCache");
                bufferedWriter0.write("\n");
                bufferedWriter0.write("1");
                bufferedWriter0.write("\n");
                bufferedWriter0.write(Integer.toString(this.Au));
                bufferedWriter0.write("\n");
                bufferedWriter0.write(Integer.toString(this.DWo));
                bufferedWriter0.write("\n");
                bufferedWriter0.write("\n");
                Iterator iterator0 = this.xs.values().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_28;
                    }
                    Object object0 = iterator0.next();
                    Zh pjT$Zh0 = (Zh)object0;
                    if(pjT$Zh0.JQp == null) {
                        bufferedWriter0.write("CLEAN " + pjT$Zh0.Zh + pjT$Zh0.PjT() + '\n');
                    }
                    else {
                        bufferedWriter0.write("DIRTY " + pjT$Zh0.Zh + '\n');
                    }
                }
            }
            catch(Throwable throwable0) {
            }
            bufferedWriter0.close();
            throw throwable0;
        label_28:
            bufferedWriter0.close();
            if(this.JQp.exists()) {
                PjT.PjT(this.JQp, this.XX, true);
            }
            PjT.PjT(this.cz, this.JQp, false);
            this.XX.delete();
            this.xf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.JQp, true), cr.PjT));
        }
    }

    private void JQp(String s) {
        if(!PjT.PjT.matcher(s).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + s + "\"");
        }
    }

    private com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT PjT(String s, long v) throws IOException {
        synchronized(this) {
            this.XX();
            this.JQp(s);
            Zh pjT$Zh0 = (Zh)this.xs.get(s);
            if(v != -1L && (pjT$Zh0 == null || pjT$Zh0.cz != v)) {
                return null;
            }
            if(pjT$Zh0 == null) {
                pjT$Zh0 = new Zh(this, s, null);
                this.xs.put(s, pjT$Zh0);
            }
            else if(pjT$Zh0.JQp != null) {
                return null;
            }
            com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT pjT$PjT0 = new com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT(this, pjT$Zh0, null);
            pjT$Zh0.JQp = pjT$PjT0;
            this.xf.write("DIRTY " + s + '\n');
            this.xf.flush();
            return pjT$PjT0;
        }
    }

    public static PjT PjT(File file0, int v, int v1, long v2, ExecutorService executorService0) throws IOException {
        if(v2 <= 0L) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if(v1 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file1 = new File(file0, "journal.bkp");
        if(file1.exists()) {
            File file2 = new File(file0, "journal");
            if(file2.exists()) {
                file1.delete();
            }
            else {
                PjT.PjT(file1, file2, false);
            }
        }
        PjT pjT0 = new PjT(file0, v, v1, v2, executorService0);
        if(pjT0.JQp.exists()) {
            try {
                pjT0.ReZ();
                pjT0.cr();
                return pjT0;
            }
            catch(IOException iOException0) {
                Log.w("DiskLruCache ", file0 + " is corrupt: " + iOException0.getMessage() + ", removing");
                pjT0.Zh();
            }
        }
        file0.mkdirs();
        PjT pjT1 = new PjT(file0, v, v1, v2, executorService0);
        pjT1.JQp();
        return pjT1;
    }

    private void PjT(com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT pjT$PjT0, boolean z) throws IOException {
        synchronized(this) {
            Zh pjT$Zh0 = pjT$PjT0.Zh;
            if(pjT$Zh0.JQp == pjT$PjT0) {
                if(z && !pjT$Zh0.cr) {
                    int v2 = 0;
                    while(v2 < this.DWo) {
                        if(pjT$PjT0.ReZ[v2]) {
                            if(!pjT$Zh0.Zh(v2).exists()) {
                                pjT$PjT0.Zh();
                                return;
                            }
                            ++v2;
                            continue;
                        }
                        pjT$PjT0.Zh();
                        throw new IllegalStateException("Newly created entry didn\'t create value for index " + v2);
                    }
                }
                for(int v1 = 0; v1 < this.DWo; ++v1) {
                    File file0 = pjT$Zh0.Zh(v1);
                    if(!z) {
                        PjT.PjT(file0);
                    }
                    else if(file0.exists()) {
                        File file1 = pjT$Zh0.PjT(v1);
                        file0.renameTo(file1);
                        long v3 = pjT$Zh0.ReZ[v1];
                        long v4 = file1.length();
                        pjT$Zh0.ReZ[v1] = v4;
                        this.qj = this.qj - v3 + v4;
                    }
                }
                ++this.fDm;
                pjT$Zh0.JQp = null;
                if((pjT$Zh0.cr | z) == 0) {
                    this.xs.remove(pjT$Zh0.Zh);
                    this.xf.write("REMOVE " + pjT$Zh0.Zh + '\n');
                }
                else {
                    pjT$Zh0.cr = true;
                    this.xf.write("CLEAN " + pjT$Zh0.Zh + pjT$Zh0.PjT() + '\n');
                    if(z) {
                        long v5 = this.xE;
                        this.xE = v5 + 1L;
                        pjT$Zh0.cz = v5;
                    }
                }
                this.xf.flush();
                if(this.qj > this.SM || this.cz()) {
                    this.Zh.submit(this.ub);
                }
                return;
            }
        }
        throw new IllegalStateException();
    }

    private static void PjT(File file0) throws IOException {
        if(file0.exists() && !file0.delete()) {
            throw new IOException();
        }
    }

    private static void PjT(File file0, File file1, boolean z) throws IOException {
        if(z) {
            PjT.PjT(file1);
        }
        if(!file0.renameTo(file1)) {
            throw new IOException();
        }
    }

    public ReZ PjT(String s) throws IOException {
        synchronized(this) {
            this.XX();
            this.JQp(s);
            Zh pjT$Zh0 = (Zh)this.xs.get(s);
            if(pjT$Zh0 == null) {
                return null;
            }
            if(!pjT$Zh0.cr) {
                return null;
            }
            InputStream[] arr_inputStream = new InputStream[this.DWo];
            int v2 = 0;
            while(v2 < this.DWo) {
                try {
                    arr_inputStream[v2] = new FileInputStream(pjT$Zh0.PjT(v2));
                    ++v2;
                    continue;
                }
                catch(FileNotFoundException unused_ex) {
                }
                for(int v1 = 0; v1 < this.DWo; ++v1) {
                    InputStream inputStream0 = arr_inputStream[v1];
                    if(inputStream0 == null) {
                        break;
                    }
                    DWo.PjT(inputStream0);
                }
                return null;
            }
            ++this.fDm;
            this.xf.append("READ " + s + '\n');
            if(this.cz()) {
                this.Zh.submit(this.ub);
            }
            return new ReZ(this, s, pjT$Zh0.cz, arr_inputStream, pjT$Zh0.ReZ, null);
        }
    }

    public void PjT() throws IOException {
        synchronized(this) {
            this.XX();
            this.Au();
            this.xf.flush();
        }
    }

    private void ReZ() throws IOException {
        String s4;
        String s3;
        String s1;
        String s;
        com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.ReZ reZ0 = new com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.ReZ(new FileInputStream(this.JQp), cr.PjT);
        try {
            s = reZ0.PjT();
            s1 = reZ0.PjT();
            String s2 = reZ0.PjT();
            s3 = reZ0.PjT();
            s4 = reZ0.PjT();
            if("libcore.io.DiskLruCache".equals(s) && "1".equals(s1) && Integer.toString(this.Au).equals(s2) && Integer.toString(this.DWo).equals(s3) && "".equals(s4)) {
                int v1 = 0;
                try {
                    while(true) {
                        this.cr(reZ0.PjT());
                        ++v1;
                    }
                }
                catch(EOFException unused_ex) {
                    this.fDm = v1 - this.xs.size();
                    if(reZ0.Zh()) {
                        this.JQp();
                    }
                    else {
                        this.xf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.JQp, true), cr.PjT));
                    }
                    return;
                }
            }
        }
        finally {
            DWo.PjT(reZ0);
        }
        throw new IOException("unexpected journal header: [" + s + ", " + s1 + ", " + s3 + ", " + s4 + "]");
    }

    public boolean ReZ(String s) throws IOException {
        synchronized(this) {
            this.XX();
            this.JQp(s);
            Zh pjT$Zh0 = (Zh)this.xs.get(s);
            if(pjT$Zh0 != null && pjT$Zh0.JQp == null) {
                for(int v1 = 0; v1 < this.DWo; ++v1) {
                    File file0 = pjT$Zh0.PjT(v1);
                    if(file0.exists() && !file0.delete()) {
                        throw new IOException("failed to delete " + file0);
                    }
                    this.qj -= pjT$Zh0.ReZ[v1];
                    pjT$Zh0.ReZ[v1] = 0L;
                }
                ++this.fDm;
                this.xf.append("REMOVE " + s + '\n');
                this.xs.remove(s);
                if(this.cz()) {
                    this.Zh.submit(this.ub);
                }
                return true;
            }
            return false;
        }
    }

    private void XX() {
        if(this.xf == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT Zh(String s) throws IOException {
        return this.PjT(s, -1L);
    }

    public void Zh() throws IOException {
        this.close();
        cr.PjT(this.cr);
    }

    @Override
    public void close() throws IOException {
        synchronized(this) {
            if(this.xf == null) {
                return;
            }
            for(Object object0: new ArrayList(this.xs.values())) {
                Zh pjT$Zh0 = (Zh)object0;
                if(pjT$Zh0.JQp != null) {
                    pjT$Zh0.JQp.Zh();
                }
            }
            this.Au();
            this.xf.close();
            this.xf = null;
        }
    }

    private void cr() throws IOException {
        PjT.PjT(this.cz);
        Iterator iterator0 = this.xs.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Zh pjT$Zh0 = (Zh)object0;
            int v = 0;
            if(pjT$Zh0.JQp == null) {
                while(v < this.DWo) {
                    this.qj += pjT$Zh0.ReZ[v];
                    ++v;
                }
            }
            else {
                pjT$Zh0.JQp = null;
                while(v < this.DWo) {
                    PjT.PjT(pjT$Zh0.PjT(v));
                    PjT.PjT(pjT$Zh0.Zh(v));
                    ++v;
                }
                iterator0.remove();
            }
        }
    }

    private void cr(String s) throws IOException {
        String s1;
        int v = s.indexOf(0x20);
        if(v == -1) {
            throw new IOException("unexpected journal line: " + s);
        }
        int v1 = s.indexOf(0x20, v + 1);
        if(v1 == -1) {
            s1 = s.substring(v + 1);
            if(v == 6 && s.startsWith("REMOVE")) {
                this.xs.remove(s1);
                return;
            }
        }
        else {
            s1 = s.substring(v + 1, v1);
        }
        Zh pjT$Zh0 = (Zh)this.xs.get(s1);
        if(pjT$Zh0 == null) {
            pjT$Zh0 = new Zh(this, s1, null);
            this.xs.put(s1, pjT$Zh0);
        }
        if(v1 != -1 && v == 5 && s.startsWith("CLEAN")) {
            pjT$Zh0.cr = true;
            pjT$Zh0.JQp = null;
            pjT$Zh0.PjT(s.substring(v1 + 1).split(" "));
            return;
        }
        if(v1 == -1 && v == 5 && s.startsWith("DIRTY")) {
            pjT$Zh0.JQp = new com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT(this, pjT$Zh0, null);
            return;
        }
        if(v1 != -1 || v != 4 || !s.startsWith("READ")) {
            throw new IOException("unexpected journal line: " + s);
        }
    }

    private boolean cz() {
        return this.fDm >= 2000 && this.fDm >= this.xs.size();
    }
}

