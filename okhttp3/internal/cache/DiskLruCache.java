package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.S0;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.r;
import kotlin.text.v;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.Z;
import okio.m0;
import okio.n;
import okio.o0;
import okio.y;
import y4.l;
import y4.m;
import z3.f;
import z3.j;

@s0({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1065:1\n1#2:1066\n608#3,4:1067\n37#4,2:1071\n37#4,2:1073\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n*L\n215#1:1067,4\n672#1:1071,2\n721#1:1073,2\n*E\n"})
public final class DiskLruCache implements Closeable, Flushable {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public final class Editor {
        private boolean done;
        @l
        private final Entry entry;
        @m
        private final boolean[] written;

        public Editor(@l Entry diskLruCache$Entry0) {
            L.p(diskLruCache$Entry0, "entry");
            DiskLruCache.this = diskLruCache0;
            super();
            this.entry = diskLruCache$Entry0;
            this.written = diskLruCache$Entry0.getReadable$okhttp() ? null : new boolean[diskLruCache0.getValueCount$okhttp()];
        }

        public final void abort() throws IOException {
            DiskLruCache diskLruCache0 = DiskLruCache.this;
            synchronized(diskLruCache0) {
                if(!this.done) {
                    if(L.g(this.entry.getCurrentEditor$okhttp(), this)) {
                        diskLruCache0.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                    return;
                }
            }
            throw new IllegalStateException("Check failed.");
        }

        public final void commit() throws IOException {
            DiskLruCache diskLruCache0 = DiskLruCache.this;
            synchronized(diskLruCache0) {
                if(!this.done) {
                    if(L.g(this.entry.getCurrentEditor$okhttp(), this)) {
                        diskLruCache0.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                    return;
                }
            }
            throw new IllegalStateException("Check failed.");
        }

        public final void detach$okhttp() {
            if(L.g(this.entry.getCurrentEditor$okhttp(), this)) {
                if(DiskLruCache.this.civilizedFileSystem) {
                    DiskLruCache.this.completeEdit$okhttp(this, false);
                    return;
                }
                this.entry.setZombie$okhttp(true);
            }
        }

        @l
        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        @m
        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        @l
        public final m0 newSink(int v) {
            m0 m01;
            DiskLruCache diskLruCache0 = DiskLruCache.this;
            synchronized(diskLruCache0) {
                if(!this.done) {
                    if(!L.g(this.entry.getCurrentEditor$okhttp(), this)) {
                        return Z.c();
                    }
                    if(!this.entry.getReadable$okhttp()) {
                        L.m(this.written);
                        this.written[v] = true;
                    }
                    File file0 = (File)this.entry.getDirtyFiles$okhttp().get(v);
                    try {
                        m01 = diskLruCache0.getFileSystem$okhttp().sink(file0);
                    }
                    catch(FileNotFoundException unused_ex) {
                        return Z.c();
                    }
                    return new FaultHidingSink(m01, new Function1(this) {
                        {
                            DiskLruCache.this = diskLruCache0;
                            Editor.this = diskLruCache$Editor0;
                            super(1);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.invoke(((IOException)object0));
                            return S0.a;
                        }

                        public final void invoke(@l IOException iOException0) {
                            L.p(iOException0, "it");
                            synchronized(DiskLruCache.this) {
                                Editor.this.detach$okhttp();
                            }
                        }
                    });
                }
            }
            throw new IllegalStateException("Check failed.");
        }

        @m
        public final o0 newSource(int v) {
            o0 o00 = null;
            DiskLruCache diskLruCache0 = DiskLruCache.this;
            synchronized(diskLruCache0) {
                if(!this.done) {
                    if(this.entry.getReadable$okhttp() && L.g(this.entry.getCurrentEditor$okhttp(), this) && !this.entry.getZombie$okhttp()) {
                        try {
                            o00 = diskLruCache0.getFileSystem$okhttp().source(((File)this.entry.getCleanFiles$okhttp().get(v)));
                        }
                        catch(FileNotFoundException unused_ex) {
                        }
                        return o00;
                    }
                    return null;
                }
            }
            throw new IllegalStateException("Check failed.");
        }
    }

    @s0({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1065:1\n608#2,4:1066\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n*L\n1001#1:1066,4\n*E\n"})
    public final class Entry {
        @l
        private final List cleanFiles;
        @m
        private Editor currentEditor;
        @l
        private final List dirtyFiles;
        @l
        private final String key;
        @l
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        private boolean zombie;

        public Entry(@l String s) {
            L.p(s, "key");
            DiskLruCache.this = diskLruCache0;
            super();
            this.key = s;
            this.lengths = new long[diskLruCache0.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder stringBuilder0 = new StringBuilder(s);
            stringBuilder0.append('.');
            int v = stringBuilder0.length();
            int v1 = diskLruCache0.getValueCount$okhttp();
            for(int v2 = 0; v2 < v1; ++v2) {
                stringBuilder0.append(v2);
                File file0 = new File(DiskLruCache.this.getDirectory(), stringBuilder0.toString());
                this.cleanFiles.add(file0);
                stringBuilder0.append(".tmp");
                File file1 = new File(DiskLruCache.this.getDirectory(), stringBuilder0.toString());
                this.dirtyFiles.add(file1);
                stringBuilder0.setLength(v);
            }
        }

        @l
        public final List getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        @m
        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        @l
        public final List getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        @l
        public final String getKey$okhttp() {
            return this.key;
        }

        @l
        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        private final Void invalidLengths(List list0) throws IOException {
            throw new IOException("unexpected journal line: " + list0);
        }

        private final o0 newSource(int v) {
            o0 o00 = DiskLruCache.this.getFileSystem$okhttp().source(((File)this.cleanFiles.get(v)));
            if(DiskLruCache.this.civilizedFileSystem) {
                return o00;
            }
            ++this.lockingSourceCount;
            return new y(DiskLruCache.this) {
                private boolean closed;

                @Override  // okio.y
                public void close() {
                    super.close();
                    if(!this.closed) {
                        this.closed = true;
                        DiskLruCache diskLruCache0 = this;
                        Entry diskLruCache$Entry0 = Entry.this;
                        synchronized(diskLruCache0) {
                            diskLruCache$Entry0.setLockingSourceCount$okhttp(diskLruCache$Entry0.getLockingSourceCount$okhttp() - 1);
                            if(diskLruCache$Entry0.getLockingSourceCount$okhttp() == 0 && diskLruCache$Entry0.getZombie$okhttp()) {
                                diskLruCache0.removeEntry$okhttp(diskLruCache$Entry0);
                            }
                        }
                    }
                }
            };
        }

        public final void setCurrentEditor$okhttp(@m Editor diskLruCache$Editor0) {
            this.currentEditor = diskLruCache$Editor0;
        }

        public final void setLengths$okhttp(@l List list0) throws IOException {
            L.p(list0, "strings");
            if(list0.size() == DiskLruCache.this.getValueCount$okhttp()) {
                try {
                    int v = list0.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        this.lengths[v1] = Long.parseLong(((String)list0.get(v1)));
                    }
                    return;
                }
                catch(NumberFormatException unused_ex) {
                    this.invalidLengths(list0);
                    throw new kotlin.y();
                }
            }
            this.invalidLengths(list0);
            throw new kotlin.y();
        }

        public final void setLockingSourceCount$okhttp(int v) {
            this.lockingSourceCount = v;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final void setSequenceNumber$okhttp(long v) {
            this.sequenceNumber = v;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        @m
        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache0 = DiskLruCache.this;
            if(Util.assertionsEnabled && !Thread.holdsLock(diskLruCache0)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-12392 MUST hold lock on " + diskLruCache0);
            }
            if(!this.readable) {
                return null;
            }
            if(!DiskLruCache.this.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList0 = new ArrayList();
            long[] arr_v = (long[])this.lengths.clone();
            try {
                int v = DiskLruCache.this.getValueCount$okhttp();
                for(int v1 = 0; v1 < v; ++v1) {
                    arrayList0.add(this.newSource(v1));
                }
                return new Snapshot(DiskLruCache.this, this.key, this.sequenceNumber, arrayList0, arr_v);
            }
            catch(FileNotFoundException unused_ex) {
                for(Object object0: arrayList0) {
                    Util.closeQuietly(((o0)object0));
                }
                try {
                    DiskLruCache.this.removeEntry$okhttp(this);
                }
                catch(IOException unused_ex) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(@l okio.m m0) throws IOException {
            L.p(m0, "writer");
            long[] arr_v = this.lengths;
            for(int v = 0; v < arr_v.length; ++v) {
                long v1 = arr_v[v];
                m0.writeByte(0x20).v0(v1);
            }
        }
    }

    public final class Snapshot implements Closeable {
        @l
        private final String key;
        @l
        private final long[] lengths;
        private final long sequenceNumber;
        @l
        private final List sources;

        public Snapshot(@l String s, long v, @l List list0, @l long[] arr_v) {
            L.p(s, "key");
            L.p(list0, "sources");
            L.p(arr_v, "lengths");
            DiskLruCache.this = diskLruCache0;
            super();
            this.key = s;
            this.sequenceNumber = v;
            this.sources = list0;
            this.lengths = arr_v;
        }

        @Override
        public void close() {
            for(Object object0: this.sources) {
                Util.closeQuietly(((o0)object0));
            }
        }

        @m
        public final Editor edit() throws IOException {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int v) {
            return this.lengths[v];
        }

        @l
        public final o0 getSource(int v) {
            return (o0)this.sources.get(v);
        }

        @l
        public final String key() {
            return this.key;
        }
    }

    @f
    public static final long ANY_SEQUENCE_NUMBER;
    @l
    @f
    public static final String CLEAN;
    @l
    public static final Companion Companion;
    @l
    @f
    public static final String DIRTY;
    @l
    @f
    public static final String JOURNAL_FILE;
    @l
    @f
    public static final String JOURNAL_FILE_BACKUP;
    @l
    @f
    public static final String JOURNAL_FILE_TEMP;
    @l
    @f
    public static final r LEGAL_KEY_PATTERN;
    @l
    @f
    public static final String MAGIC;
    @l
    @f
    public static final String READ;
    @l
    @f
    public static final String REMOVE;
    @l
    @f
    public static final String VERSION_1;
    private final int appVersion;
    private boolean civilizedFileSystem;
    @l
    private final TaskQueue cleanupQueue;
    @l
    private final okhttp3.internal.cache.DiskLruCache.cleanupTask.1 cleanupTask;
    private boolean closed;
    @l
    private final File directory;
    @l
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    @l
    private final File journalFile;
    @l
    private final File journalFileBackup;
    @l
    private final File journalFileTmp;
    @m
    private okio.m journalWriter;
    @l
    private final LinkedHashMap lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    static {
        DiskLruCache.Companion = new Companion(null);
        DiskLruCache.JOURNAL_FILE = "journal";
        DiskLruCache.JOURNAL_FILE_TEMP = "journal.tmp";
        DiskLruCache.JOURNAL_FILE_BACKUP = "journal.bkp";
        DiskLruCache.MAGIC = "libcore.io.DiskLruCache";
        DiskLruCache.VERSION_1 = "1";
        DiskLruCache.ANY_SEQUENCE_NUMBER = -1L;
        DiskLruCache.LEGAL_KEY_PATTERN = new r("[a-z0-9_-]{1,120}");
        DiskLruCache.CLEAN = "CLEAN";
        DiskLruCache.DIRTY = "DIRTY";
        DiskLruCache.REMOVE = "REMOVE";
        DiskLruCache.READ = "READ";
    }

    public DiskLruCache(@l FileSystem fileSystem0, @l File file0, int v, int v1, long v2, @l TaskRunner taskRunner0) {
        L.p(fileSystem0, "fileSystem");
        L.p(file0, "directory");
        L.p(taskRunner0, "taskRunner");
        super();
        this.fileSystem = fileSystem0;
        this.directory = file0;
        this.appVersion = v;
        this.valueCount = v1;
        this.maxSize = v2;
        this.lruEntries = new LinkedHashMap(0, 0.75f, true);
        this.cleanupQueue = taskRunner0.newQueue();
        this.cleanupTask = new Task(Util.okHttpName + " Cache") {
            {
                DiskLruCache.this = diskLruCache0;
                super(s, false, 2, null);
            }

            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                DiskLruCache diskLruCache0 = DiskLruCache.this;
                synchronized(diskLruCache0) {
                    if(diskLruCache0.initialized && !diskLruCache0.getClosed$okhttp()) {
                        try {
                            diskLruCache0.trimToSize();
                        }
                        catch(IOException unused_ex) {
                            diskLruCache0.mostRecentTrimFailed = true;
                        }
                        try {
                            if(diskLruCache0.journalRebuildRequired()) {
                                diskLruCache0.rebuildJournal$okhttp();
                                diskLruCache0.redundantOpCount = 0;
                            }
                        }
                        catch(IOException unused_ex) {
                            diskLruCache0.mostRecentRebuildFailed = true;
                            diskLruCache0.journalWriter = Z.d(Z.c());
                        }
                        return -1L;
                    }
                    return -1L;
                }
            }
        };
        if(v2 <= 0L) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if(v1 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.journalFile = new File(file0, "journal");
        this.journalFileTmp = new File(file0, "journal.tmp");
        this.journalFileBackup = new File(file0, "journal.bkp");
    }

    private final void checkNotClosed() {
        synchronized(this) {
            if(!this.closed) {
                return;
            }
        }
        throw new IllegalStateException("cache is closed");
    }

    @Override
    public void close() throws IOException {
        synchronized(this) {
            if(this.initialized && !this.closed) {
                Collection collection0 = this.lruEntries.values();
                L.o(collection0, "lruEntries.values");
                Entry[] arr_diskLruCache$Entry = (Entry[])collection0.toArray(new Entry[0]);
                for(int v1 = 0; v1 < arr_diskLruCache$Entry.length; ++v1) {
                    Entry diskLruCache$Entry0 = arr_diskLruCache$Entry[v1];
                    if(diskLruCache$Entry0.getCurrentEditor$okhttp() != null) {
                        Editor diskLruCache$Editor0 = diskLruCache$Entry0.getCurrentEditor$okhttp();
                        if(diskLruCache$Editor0 != null) {
                            diskLruCache$Editor0.detach$okhttp();
                        }
                    }
                }
                this.trimToSize();
                okio.m m0 = this.journalWriter;
                L.m(m0);
                m0.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        }
    }

    public final void completeEdit$okhttp(@l Editor diskLruCache$Editor0, boolean z) throws IOException {
        synchronized(this) {
            L.p(diskLruCache$Editor0, "editor");
            Entry diskLruCache$Entry0 = diskLruCache$Editor0.getEntry$okhttp();
            if(L.g(diskLruCache$Entry0.getCurrentEditor$okhttp(), diskLruCache$Editor0)) {
                if(z && !diskLruCache$Entry0.getReadable$okhttp()) {
                    int v2 = this.valueCount;
                    int v3 = 0;
                    while(v3 < v2) {
                        boolean[] arr_z = diskLruCache$Editor0.getWritten$okhttp();
                        L.m(arr_z);
                        if(arr_z[v3]) {
                            File file0 = (File)diskLruCache$Entry0.getDirtyFiles$okhttp().get(v3);
                            if(!this.fileSystem.exists(file0)) {
                                diskLruCache$Editor0.abort();
                                return;
                            }
                            ++v3;
                            continue;
                        }
                        diskLruCache$Editor0.abort();
                        throw new IllegalStateException("Newly created entry didn\'t create value for index " + v3);
                    }
                }
                int v4 = this.valueCount;
                for(int v1 = 0; v1 < v4; ++v1) {
                    File file1 = (File)diskLruCache$Entry0.getDirtyFiles$okhttp().get(v1);
                    if(!z || diskLruCache$Entry0.getZombie$okhttp()) {
                        this.fileSystem.delete(file1);
                    }
                    else if(this.fileSystem.exists(file1)) {
                        File file2 = (File)diskLruCache$Entry0.getCleanFiles$okhttp().get(v1);
                        this.fileSystem.rename(file1, file2);
                        long v5 = diskLruCache$Entry0.getLengths$okhttp()[v1];
                        long v6 = this.fileSystem.size(file2);
                        diskLruCache$Entry0.getLengths$okhttp()[v1] = v6;
                        this.size = this.size - v5 + v6;
                    }
                }
                diskLruCache$Entry0.setCurrentEditor$okhttp(null);
                if(diskLruCache$Entry0.getZombie$okhttp()) {
                    this.removeEntry$okhttp(diskLruCache$Entry0);
                    return;
                }
                ++this.redundantOpCount;
                okio.m m0 = this.journalWriter;
                L.m(m0);
                if(diskLruCache$Entry0.getReadable$okhttp() || z) {
                    diskLruCache$Entry0.setReadable$okhttp(true);
                    m0.D2("CLEAN").writeByte(0x20);
                    m0.D2(diskLruCache$Entry0.getKey$okhttp());
                    diskLruCache$Entry0.writeLengths$okhttp(m0);
                    m0.writeByte(10);
                    if(z) {
                        long v7 = this.nextSequenceNumber;
                        this.nextSequenceNumber = v7 + 1L;
                        diskLruCache$Entry0.setSequenceNumber$okhttp(v7);
                    }
                }
                else {
                    this.lruEntries.remove(diskLruCache$Entry0.getKey$okhttp());
                    m0.D2("REMOVE").writeByte(0x20);
                    m0.D2(diskLruCache$Entry0.getKey$okhttp());
                    m0.writeByte(10);
                }
                m0.flush();
                if(this.size > this.maxSize || this.journalRebuildRequired()) {
                    TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                }
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void delete() throws IOException {
        this.close();
        this.fileSystem.deleteContents(this.directory);
    }

    @m
    @j
    public final Editor edit(@l String s) throws IOException {
        L.p(s, "key");
        return DiskLruCache.edit$default(this, s, 0L, 2, null);
    }

    @m
    @j
    public final Editor edit(@l String s, long v) throws IOException {
        synchronized(this) {
            L.p(s, "key");
            this.initialize();
            this.checkNotClosed();
            this.validateKey(s);
            Entry diskLruCache$Entry0 = (Entry)this.lruEntries.get(s);
            if(v != DiskLruCache.ANY_SEQUENCE_NUMBER && (diskLruCache$Entry0 == null || diskLruCache$Entry0.getSequenceNumber$okhttp() != v)) {
                return null;
            }
            if((diskLruCache$Entry0 == null ? null : diskLruCache$Entry0.getCurrentEditor$okhttp()) != null) {
                return null;
            }
            if(diskLruCache$Entry0 != null && diskLruCache$Entry0.getLockingSourceCount$okhttp() != 0) {
                return null;
            }
            if(!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                okio.m m0 = this.journalWriter;
                L.m(m0);
                m0.D2("DIRTY").writeByte(0x20).D2(s).writeByte(10);
                m0.flush();
                if(this.hasJournalErrors) {
                    return null;
                }
                if(diskLruCache$Entry0 == null) {
                    diskLruCache$Entry0 = new Entry(this, s);
                    this.lruEntries.put(s, diskLruCache$Entry0);
                }
                Editor diskLruCache$Editor0 = new Editor(this, diskLruCache$Entry0);
                diskLruCache$Entry0.setCurrentEditor$okhttp(diskLruCache$Editor0);
                return diskLruCache$Editor0;
            }
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return null;
        }
    }

    public static Editor edit$default(DiskLruCache diskLruCache0, String s, long v, int v1, Object object0) throws IOException {
        if((v1 & 2) != 0) {
            v = DiskLruCache.ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache0.edit(s, v);
    }

    public final void evictAll() throws IOException {
        synchronized(this) {
            this.initialize();
            Collection collection0 = this.lruEntries.values();
            L.o(collection0, "lruEntries.values");
            Entry[] arr_diskLruCache$Entry = (Entry[])collection0.toArray(new Entry[0]);
            for(int v1 = 0; v1 < arr_diskLruCache$Entry.length; ++v1) {
                Entry diskLruCache$Entry0 = arr_diskLruCache$Entry[v1];
                L.o(diskLruCache$Entry0, "entry");
                this.removeEntry$okhttp(diskLruCache$Entry0);
            }
            this.mostRecentTrimFailed = false;
        }
    }

    @Override
    public void flush() throws IOException {
        synchronized(this) {
            if(!this.initialized) {
                return;
            }
            this.checkNotClosed();
            this.trimToSize();
            okio.m m0 = this.journalWriter;
            L.m(m0);
            m0.flush();
        }
    }

    @m
    public final Snapshot get(@l String s) throws IOException {
        synchronized(this) {
            L.p(s, "key");
            this.initialize();
            this.checkNotClosed();
            this.validateKey(s);
            Entry diskLruCache$Entry0 = (Entry)this.lruEntries.get(s);
            if(diskLruCache$Entry0 == null) {
                return null;
            }
            Snapshot diskLruCache$Snapshot0 = diskLruCache$Entry0.snapshot$okhttp();
            if(diskLruCache$Snapshot0 == null) {
                return null;
            }
            ++this.redundantOpCount;
            okio.m m0 = this.journalWriter;
            L.m(m0);
            m0.D2("READ").writeByte(0x20).D2(s).writeByte(10);
            if(this.journalRebuildRequired()) {
                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
            return diskLruCache$Snapshot0;
        }
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    @l
    public final File getDirectory() {
        return this.directory;
    }

    @l
    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    @l
    public final LinkedHashMap getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final long getMaxSize() {
        synchronized(this) {
        }
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final void initialize() throws IOException {
        synchronized(this) {
            if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-12449 MUST hold lock on " + this);
            }
            if(this.initialized) {
                return;
            }
            if(this.fileSystem.exists(this.journalFileBackup)) {
                if(this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                }
                else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
            if(this.fileSystem.exists(this.journalFile)) {
                try {
                    this.readJournal();
                    this.processJournal();
                    this.initialized = true;
                    return;
                }
                catch(IOException iOException0) {
                    Platform.Companion.get().log("DiskLruCache " + this.directory + " is corrupt: " + iOException0.getMessage() + ", removing", 5, iOException0);
                    try {
                        this.delete();
                        this.closed = false;
                    }
                    catch(Throwable throwable0) {
                        this.closed = false;
                        throw throwable0;
                    }
                }
            }
            this.rebuildJournal$okhttp();
            this.initialized = true;
        }
    }

    public final boolean isClosed() {
        synchronized(this) {
        }
        return this.closed;
    }

    private final boolean journalRebuildRequired() {
        return this.redundantOpCount >= 2000 && this.redundantOpCount >= this.lruEntries.size();
    }

    private final okio.m newJournalWriter() throws FileNotFoundException {
        return Z.d(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new Function1() {
            {
                DiskLruCache.this = diskLruCache0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((IOException)object0));
                return S0.a;
            }

            public final void invoke(@l IOException iOException0) {
                L.p(iOException0, "it");
                DiskLruCache diskLruCache0 = DiskLruCache.this;
                if(Util.assertionsEnabled && !Thread.holdsLock(diskLruCache0)) {
                    throw new AssertionError("Thread jeb-dexdec-sb-st-12460 MUST hold lock on " + diskLruCache0);
                }
                DiskLruCache.this.hasJournalErrors = true;
            }
        }));
    }

    private final void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator iterator0 = this.lruEntries.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            L.o(object0, "i.next()");
            Entry diskLruCache$Entry0 = (Entry)object0;
            int v = 0;
            if(diskLruCache$Entry0.getCurrentEditor$okhttp() == null) {
                int v1 = this.valueCount;
                while(v < v1) {
                    this.size += diskLruCache$Entry0.getLengths$okhttp()[v];
                    ++v;
                }
            }
            else {
                diskLruCache$Entry0.setCurrentEditor$okhttp(null);
                int v2 = this.valueCount;
                while(v < v2) {
                    File file0 = (File)diskLruCache$Entry0.getCleanFiles$okhttp().get(v);
                    this.fileSystem.delete(file0);
                    File file1 = (File)diskLruCache$Entry0.getDirtyFiles$okhttp().get(v);
                    this.fileSystem.delete(file1);
                    ++v;
                }
                iterator0.remove();
            }
        }
    }

    private final void readJournal() throws IOException {
        n n0 = Z.e(this.fileSystem.source(this.journalFile));
        try {
            String s = n0.M2();
            String s1 = n0.M2();
            String s2 = n0.M2();
            String s3 = n0.M2();
            String s4 = n0.M2();
            if(!L.g("libcore.io.DiskLruCache", s) || !L.g("1", s1) || !L.g(String.valueOf(this.appVersion), s2) || !L.g(String.valueOf(this.valueCount), s3) || s4.length() > 0) {
                throw new IOException("unexpected journal header: [" + s + ", " + s1 + ", " + s3 + ", " + s4 + ']');
            }
            int v = 0;
            try {
                while(true) {
                    this.readJournalLine(n0.M2());
                    ++v;
                }
            }
            catch(EOFException unused_ex) {
            }
            this.redundantOpCount = v - this.lruEntries.size();
            if(n0.j3()) {
                this.journalWriter = this.newJournalWriter();
            }
            else {
                this.rebuildJournal$okhttp();
            }
        }
        catch(Throwable throwable0) {
            c.a(n0, throwable0);
            throw throwable0;
        }
        c.a(n0, null);
    }

    private final void readJournalLine(String s) throws IOException {
        String s1;
        int v = v.r3(s, ' ', 0, false, 6, null);
        if(v == -1) {
            throw new IOException("unexpected journal line: " + s);
        }
        int v1 = v.r3(s, ' ', v + 1, false, 4, null);
        if(v1 == -1) {
            s1 = s.substring(v + 1);
            L.o(s1, "this as java.lang.String).substring(startIndex)");
            if(v == 6 && v.v2(s, "REMOVE", false, 2, null)) {
                this.lruEntries.remove(s1);
                return;
            }
        }
        else {
            s1 = s.substring(v + 1, v1);
            L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Entry diskLruCache$Entry0 = (Entry)this.lruEntries.get(s1);
        if(diskLruCache$Entry0 == null) {
            diskLruCache$Entry0 = new Entry(this, s1);
            this.lruEntries.put(s1, diskLruCache$Entry0);
        }
        if(v1 != -1 && (v == 5 && v.v2(s, "CLEAN", false, 2, null))) {
            String s2 = s.substring(v1 + 1);
            L.o(s2, "this as java.lang.String).substring(startIndex)");
            List list0 = v.U4(s2, new char[]{' '}, false, 0, 6, null);
            diskLruCache$Entry0.setReadable$okhttp(true);
            diskLruCache$Entry0.setCurrentEditor$okhttp(null);
            diskLruCache$Entry0.setLengths$okhttp(list0);
            return;
        }
        if(v1 == -1 && (v == 5 && v.v2(s, "DIRTY", false, 2, null))) {
            diskLruCache$Entry0.setCurrentEditor$okhttp(new Editor(this, diskLruCache$Entry0));
            return;
        }
        if(v1 != -1 || (v != 4 || !v.v2(s, "READ", false, 2, null))) {
            throw new IOException("unexpected journal line: " + s);
        }
    }

    public final void rebuildJournal$okhttp() throws IOException {
        synchronized(this) {
            okio.m m0 = this.journalWriter;
            if(m0 != null) {
                m0.close();
            }
            okio.m m1 = Z.d(this.fileSystem.sink(this.journalFileTmp));
            try {
                m1.D2("libcore.io.DiskLruCache").writeByte(10);
                m1.D2("1").writeByte(10);
                m1.v0(((long)this.appVersion)).writeByte(10);
                m1.v0(((long)this.valueCount)).writeByte(10);
                m1.writeByte(10);
                Iterator iterator0 = this.lruEntries.values().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_31;
                    }
                    Object object0 = iterator0.next();
                    Entry diskLruCache$Entry0 = (Entry)object0;
                    if(diskLruCache$Entry0.getCurrentEditor$okhttp() == null) {
                        m1.D2("CLEAN").writeByte(0x20);
                        m1.D2(diskLruCache$Entry0.getKey$okhttp());
                        diskLruCache$Entry0.writeLengths$okhttp(m1);
                    }
                    else {
                        m1.D2("DIRTY").writeByte(0x20);
                        m1.D2(diskLruCache$Entry0.getKey$okhttp());
                    }
                    m1.writeByte(10);
                }
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                c.a(m1, throwable0);
                throw throwable1;
            }
        label_31:
            c.a(m1, null);
            if(this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = this.newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        }
    }

    public final boolean remove(@l String s) throws IOException {
        synchronized(this) {
            L.p(s, "key");
            this.initialize();
            this.checkNotClosed();
            this.validateKey(s);
            Entry diskLruCache$Entry0 = (Entry)this.lruEntries.get(s);
            if(diskLruCache$Entry0 == null) {
                return false;
            }
            boolean z = this.removeEntry$okhttp(diskLruCache$Entry0);
            if(z && this.size <= this.maxSize) {
                this.mostRecentTrimFailed = false;
            }
            return z;
        }
    }

    public final boolean removeEntry$okhttp(@l Entry diskLruCache$Entry0) throws IOException {
        L.p(diskLruCache$Entry0, "entry");
        if(!this.civilizedFileSystem) {
            if(diskLruCache$Entry0.getLockingSourceCount$okhttp() > 0) {
                okio.m m0 = this.journalWriter;
                if(m0 != null) {
                    m0.D2("DIRTY");
                    m0.writeByte(0x20);
                    m0.D2(diskLruCache$Entry0.getKey$okhttp());
                    m0.writeByte(10);
                    m0.flush();
                }
            }
            if(diskLruCache$Entry0.getLockingSourceCount$okhttp() > 0 || diskLruCache$Entry0.getCurrentEditor$okhttp() != null) {
                diskLruCache$Entry0.setZombie$okhttp(true);
                return true;
            }
        }
        Editor diskLruCache$Editor0 = diskLruCache$Entry0.getCurrentEditor$okhttp();
        if(diskLruCache$Editor0 != null) {
            diskLruCache$Editor0.detach$okhttp();
        }
        int v = this.valueCount;
        for(int v1 = 0; v1 < v; ++v1) {
            File file0 = (File)diskLruCache$Entry0.getCleanFiles$okhttp().get(v1);
            this.fileSystem.delete(file0);
            this.size -= diskLruCache$Entry0.getLengths$okhttp()[v1];
            diskLruCache$Entry0.getLengths$okhttp()[v1] = 0L;
        }
        ++this.redundantOpCount;
        okio.m m1 = this.journalWriter;
        if(m1 != null) {
            m1.D2("REMOVE");
            m1.writeByte(0x20);
            m1.D2(diskLruCache$Entry0.getKey$okhttp());
            m1.writeByte(10);
        }
        this.lruEntries.remove(diskLruCache$Entry0.getKey$okhttp());
        if(this.journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    private final boolean removeOldestEntry() {
        for(Object object0: this.lruEntries.values()) {
            Entry diskLruCache$Entry0 = (Entry)object0;
            if(!diskLruCache$Entry0.getZombie$okhttp()) {
                L.o(diskLruCache$Entry0, "toEvict");
                this.removeEntry$okhttp(diskLruCache$Entry0);
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final void setMaxSize(long v) {
        synchronized(this) {
            this.maxSize = v;
            if(this.initialized) {
                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
        }
    }

    public final long size() throws IOException {
        synchronized(this) {
            this.initialize();
            return this.size;
        }
    }

    @l
    public final Iterator snapshots() throws IOException {
        synchronized(this) {
            this.initialize();
            return new Object() {
                @l
                private final Iterator delegate;
                @m
                private Snapshot nextSnapshot;
                @m
                private Snapshot removeSnapshot;

                {
                    Iterator iterator0 = new ArrayList(diskLruCache0.getLruEntries$okhttp().values()).iterator();
                    L.o(iterator0, "ArrayList(lruEntries.values).iterator()");
                    this.delegate = iterator0;
                }

                @Override
                public boolean hasNext() {
                    if(this.nextSnapshot != null) {
                        return true;
                    }
                    DiskLruCache diskLruCache0 = DiskLruCache.this;
                    synchronized(diskLruCache0) {
                        if(diskLruCache0.getClosed$okhttp()) {
                            return false;
                        }
                        while(this.delegate.hasNext()) {
                            Object object0 = this.delegate.next();
                            Entry diskLruCache$Entry0 = (Entry)object0;
                            if(diskLruCache$Entry0 != null) {
                                Snapshot diskLruCache$Snapshot0 = diskLruCache$Entry0.snapshot$okhttp();
                                if(diskLruCache$Snapshot0 != null) {
                                    this.nextSnapshot = diskLruCache$Snapshot0;
                                    return true;
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                        return false;
                    }
                }

                @Override
                public Object next() {
                    return this.next();
                }

                @l
                public Snapshot next() {
                    if(!this.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Snapshot diskLruCache$Snapshot0 = this.nextSnapshot;
                    this.removeSnapshot = diskLruCache$Snapshot0;
                    this.nextSnapshot = null;
                    L.m(diskLruCache$Snapshot0);
                    return diskLruCache$Snapshot0;
                }

                @Override
                public void remove() {
                    Snapshot diskLruCache$Snapshot0 = this.removeSnapshot;
                    if(diskLruCache$Snapshot0 == null) {
                        throw new IllegalStateException("remove() before next()");
                    }
                    try {
                        DiskLruCache.this.remove(diskLruCache$Snapshot0.key());
                    }
                    catch(IOException unused_ex) {
                    }
                    finally {
                        this.removeSnapshot = null;
                    }
                }
            };
        }
    }

    public final void trimToSize() throws IOException {
        while(this.size > this.maxSize) {
            if(!this.removeOldestEntry()) {
                return;
            }
            if(false) {
                break;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    private final void validateKey(String s) {
        if(!DiskLruCache.LEGAL_KEY_PATTERN.k(s)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + s + '\"').toString());
        }
    }
}

