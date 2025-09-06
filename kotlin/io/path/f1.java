package kotlin.io.path;

import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.W0;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.sequences.m;
import kotlin.text.v;
import kotlin.y;
import y4.l;

@s0({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1181:1\n1#2:1182\n1863#3,2:1183\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n440#1:1183,2\n*E\n"})
class f1 extends y0 {
    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path A0(Path path0, String s) {
        L.p(path0, "<this>");
        L.p(s, "other");
        Path path1 = path0.resolve(s);
        L.o(path1, "resolve(...)");
        return path1;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Object A1(Path path0, String s, Function1 function10) throws IOException {
        Object object0;
        L.p(path0, "<this>");
        L.p(s, "glob");
        L.p(function10, "block");
        DirectoryStream directoryStream0 = Files.newDirectoryStream(path0, s);
        try {
            L.m(directoryStream0);
            object0 = function10.invoke(u.A1(directoryStream0));
        }
        catch(Throwable throwable0) {
            c.a(directoryStream0, throwable0);
            throw throwable0;
        }
        c.a(directoryStream0, null);
        return object0;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path B0(Path path0, Path path1) {
        L.p(path0, "<this>");
        L.p(path1, "other");
        Path path2 = path0.resolve(path1);
        L.o(path2, "resolve(...)");
        return path2;
    }

    static Object B1(Path path0, String s, Function1 function10, int v, Object object0) throws IOException {
        Object object1;
        if((v & 1) != 0) {
            s = "*";
        }
        L.p(path0, "<this>");
        L.p(s, "glob");
        L.p(function10, "block");
        DirectoryStream directoryStream0 = Files.newDirectoryStream(path0, s);
        try {
            L.m(directoryStream0);
            object1 = function10.invoke(u.A1(directoryStream0));
        }
        catch(Throwable throwable0) {
            c.a(directoryStream0, throwable0);
            throw throwable0;
        }
        c.a(directoryStream0, null);
        return object1;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final boolean C0(Path path0, LinkOption[] arr_linkOption) {
        L.p(path0, "<this>");
        L.p(arr_linkOption, "options");
        return Files.exists(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
    }

    @h0(version = "1.7")
    @r
    public static final void C1(@l Path path0, int v, boolean z, @l Function1 function10) {
        L.p(path0, "<this>");
        L.p(function10, "builderAction");
        f1.D1(path0, f1.I0(function10), v, z);
    }

    @b0
    @l
    public static final Void D0(@l Path path0, @l Class class0) {
        L.p(path0, "path");
        L.p(class0, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + class0 + " is not available for the file " + path0 + '.');
    }

    @h0(version = "1.7")
    @r
    public static final void D1(@l Path path0, @l FileVisitor fileVisitor0, int v, boolean z) {
        L.p(path0, "<this>");
        L.p(fileVisitor0, "visitor");
        Files.walkFileTree(path0, (z ? k0.f(FileVisitOption.FOLLOW_LINKS) : k0.k()), v, fileVisitor0);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final FileAttributeView E0(Path path0, LinkOption[] arr_linkOption) {
        L.p(path0, "<this>");
        L.p(arr_linkOption, "options");
        L.y(4, "V");
        FileAttributeView fileAttributeView0 = Files.getFileAttributeView(path0, FileAttributeView.class, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
        if(fileAttributeView0 != null) {
            return fileAttributeView0;
        }
        L.y(4, "V");
        f1.D0(path0, FileAttributeView.class);
        throw new y();
    }

    public static void E1(Path path0, int v, boolean z, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0x7FFFFFFF;
        }
        if((v1 & 2) != 0) {
            z = false;
        }
        f1.C1(path0, v, z, function10);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final FileAttributeView F0(Path path0, LinkOption[] arr_linkOption) {
        L.p(path0, "<this>");
        L.p(arr_linkOption, "options");
        L.y(4, "V");
        return Files.getFileAttributeView(path0, FileAttributeView.class, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
    }

    public static void F1(Path path0, FileVisitor fileVisitor0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x7FFFFFFF;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        f1.D1(path0, fileVisitor0, v, z);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final long G0(Path path0) throws IOException {
        L.p(path0, "<this>");
        return Files.size(path0);
    }

    @h0(version = "1.7")
    @r
    @l
    public static final m G1(@l Path path0, @l Q[] arr_q) {
        L.p(path0, "<this>");
        L.p(arr_q, "options");
        return new kotlin.io.path.L(path0, arr_q);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final FileStore H0(Path path0) throws IOException {
        L.p(path0, "<this>");
        FileStore fileStore0 = Files.getFileStore(path0);
        L.o(fileStore0, "getFileStore(...)");
        return fileStore0;
    }

    @h0(version = "1.7")
    @r
    @l
    public static final FileVisitor I0(@l Function1 function10) {
        L.p(function10, "builderAction");
        t t0 = new t();
        function10.invoke(t0);
        return t0.e();
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final void J0(Path path0, String s, Function1 function10) throws IOException {
        L.p(path0, "<this>");
        L.p(s, "glob");
        L.p(function10, "action");
        DirectoryStream directoryStream0 = Files.newDirectoryStream(path0, s);
        try {
            L.m(directoryStream0);
            Iterator iterator0 = directoryStream0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    goto label_15;
                }
                Object object0 = iterator0.next();
                function10.invoke(object0);
            }
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            c.a(directoryStream0, throwable0);
            throw throwable1;
        }
    label_15:
        c.a(directoryStream0, null);
    }

    static void K0(Path path0, String s, Function1 function10, int v, Object object0) throws IOException {
        if((v & 1) != 0) {
            s = "*";
        }
        L.p(path0, "<this>");
        L.p(s, "glob");
        L.p(function10, "action");
        DirectoryStream directoryStream0 = Files.newDirectoryStream(path0, s);
        try {
            L.m(directoryStream0);
            Iterator iterator0 = directoryStream0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    goto label_17;
                }
                Object object1 = iterator0.next();
                function10.invoke(object1);
            }
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            c.a(directoryStream0, throwable0);
            throw throwable1;
        }
    label_17:
        c.a(directoryStream0, null);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Object L0(Path path0, String s, LinkOption[] arr_linkOption) throws IOException {
        L.p(path0, "<this>");
        L.p(s, "attribute");
        L.p(arr_linkOption, "options");
        return Files.getAttribute(path0, s, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
    }

    @l
    public static final String M0(@l Path path0) {
        L.p(path0, "<this>");
        Path path1 = path0.getFileName();
        if(path1 != null) {
            String s = path1.toString();
            if(s != null) {
                String s1 = v.s5(s, '.', "");
                return s1 == null ? "" : s1;
            }
        }
        return "";
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    public static void N0(Path path0) {
    }

    private static final String O0(Path path0) {
        L.p(path0, "<this>");
        return f1.Q0(path0);
    }

    @h0(version = "1.4")
    @f
    @r
    @k(level = kotlin.m.b, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @c0(expression = "invariantSeparatorsPathString", imports = {}))
    public static void P0(Path path0) {
    }

    @l
    public static final String Q0(@l Path path0) {
        L.p(path0, "<this>");
        String s = path0.getFileSystem().getSeparator();
        if(!L.g(s, "/")) {
            L.m(s);
            return v.l2(path0.toString(), s, "/", false, 4, null);
        }
        return path0.toString();
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    public static void R0(Path path0) {
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final FileTime S0(Path path0, LinkOption[] arr_linkOption) throws IOException {
        L.p(path0, "<this>");
        L.p(arr_linkOption, "options");
        FileTime fileTime0 = Files.getLastModifiedTime(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
        L.o(fileTime0, "getLastModifiedTime(...)");
        return fileTime0;
    }

    @l
    public static final String T0(@l Path path0) {
        L.p(path0, "<this>");
        Path path1 = path0.getFileName();
        String s = path1 == null ? null : path1.toString();
        return s == null ? "" : s;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    public static void U0(Path path0) {
    }

    @l
    public static final String V0(@l Path path0) {
        L.p(path0, "<this>");
        Path path1 = path0.getFileName();
        if(path1 != null) {
            String s = path1.toString();
            if(s != null) {
                String s1 = v.D5(s, ".", null, 2, null);
                return s1 == null ? "" : s1;
            }
        }
        return "";
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    public static void W0(Path path0) {
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final UserPrincipal X0(Path path0, LinkOption[] arr_linkOption) throws IOException {
        L.p(path0, "<this>");
        L.p(arr_linkOption, "options");
        return Files.getOwner(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
    }

    private static final String Y0(Path path0) {
        L.p(path0, "<this>");
        return path0.toString();
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    public static void Z0(Path path0) {
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Set a1(Path path0, LinkOption[] arr_linkOption) throws IOException {
        L.p(path0, "<this>");
        L.p(arr_linkOption, "options");
        Set set0 = Files.getPosixFilePermissions(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
        L.o(set0, "getPosixFilePermissions(...)");
        return set0;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final boolean b1(Path path0, LinkOption[] arr_linkOption) {
        L.p(path0, "<this>");
        L.p(arr_linkOption, "options");
        return Files.isDirectory(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final boolean c1(Path path0) {
        L.p(path0, "<this>");
        return Files.isExecutable(path0);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path d0(String s) {
        L.p(s, "path");
        Path path0 = Paths.get(s, new String[0]);
        L.o(path0, "get(...)");
        return path0;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final boolean d1(Path path0) throws IOException {
        L.p(path0, "<this>");
        return Files.isHidden(path0);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path e0(String s, String[] arr_s) {
        L.p(s, "base");
        L.p(arr_s, "subpaths");
        Path path0 = Paths.get(s, ((String[])Arrays.copyOf(arr_s, arr_s.length)));
        L.o(path0, "get(...)");
        return path0;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final boolean e1(Path path0) {
        L.p(path0, "<this>");
        return Files.isReadable(path0);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path f0(Path path0) {
        L.p(path0, "<this>");
        Path path1 = path0.toAbsolutePath();
        L.o(path1, "toAbsolutePath(...)");
        return path1;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final boolean f1(Path path0, LinkOption[] arr_linkOption) {
        L.p(path0, "<this>");
        L.p(arr_linkOption, "options");
        return Files.isRegularFile(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final String g0(Path path0) {
        L.p(path0, "<this>");
        return path0.toAbsolutePath().toString();
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final boolean g1(Path path0, Path path1) throws IOException {
        L.p(path0, "<this>");
        L.p(path1, "other");
        return Files.isSameFile(path0, path1);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path h0(Path path0, Path path1, boolean z) throws IOException {
        L.p(path0, "<this>");
        L.p(path1, "target");
        CopyOption[] arr_copyOption = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path path2 = Files.copy(path0, path1, ((CopyOption[])Arrays.copyOf(arr_copyOption, arr_copyOption.length)));
        L.o(path2, "copy(...)");
        return path2;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final boolean h1(Path path0) {
        L.p(path0, "<this>");
        return Files.isSymbolicLink(path0);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path i0(Path path0, Path path1, CopyOption[] arr_copyOption) throws IOException {
        L.p(path0, "<this>");
        L.p(path1, "target");
        L.p(arr_copyOption, "options");
        Path path2 = Files.copy(path0, path1, ((CopyOption[])Arrays.copyOf(arr_copyOption, arr_copyOption.length)));
        L.o(path2, "copy(...)");
        return path2;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final boolean i1(Path path0) {
        L.p(path0, "<this>");
        return Files.isWritable(path0);
    }

    static Path j0(Path path0, Path path1, boolean z, int v, Object object0) throws IOException {
        if((v & 2) != 0) {
            z = false;
        }
        L.p(path0, "<this>");
        L.p(path1, "target");
        CopyOption[] arr_copyOption = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path path2 = Files.copy(path0, path1, ((CopyOption[])Arrays.copyOf(arr_copyOption, arr_copyOption.length)));
        L.o(path2, "copy(...)");
        return path2;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @l
    public static final List j1(@l Path path0, @l String s) throws IOException {
        List list0;
        L.p(path0, "<this>");
        L.p(s, "glob");
        DirectoryStream directoryStream0 = Files.newDirectoryStream(path0, s);
        try {
            L.m(directoryStream0);
            list0 = u.V5(directoryStream0);
        }
        catch(Throwable throwable0) {
            c.a(directoryStream0, throwable0);
            throw throwable0;
        }
        c.a(directoryStream0, null);
        return list0;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path k0(Path path0, FileAttribute[] arr_fileAttribute) throws IOException {
        L.p(path0, "<this>");
        L.p(arr_fileAttribute, "attributes");
        Path path1 = Files.createDirectories(path0, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        L.o(path1, "createDirectories(...)");
        return path1;
    }

    public static List k1(Path path0, String s, int v, Object object0) throws IOException {
        if((v & 1) != 0) {
            s = "*";
        }
        return f1.j1(path0, s);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path l0(Path path0, FileAttribute[] arr_fileAttribute) throws IOException {
        L.p(path0, "<this>");
        L.p(arr_fileAttribute, "attributes");
        Path path1 = Files.createDirectory(path0, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        L.o(path1, "createDirectory(...)");
        return path1;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path l1(Path path0, Path path1, boolean z) throws IOException {
        L.p(path0, "<this>");
        L.p(path1, "target");
        CopyOption[] arr_copyOption = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path path2 = Files.move(path0, path1, ((CopyOption[])Arrays.copyOf(arr_copyOption, arr_copyOption.length)));
        L.o(path2, "move(...)");
        return path2;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path m0(Path path0, FileAttribute[] arr_fileAttribute) throws IOException {
        L.p(path0, "<this>");
        L.p(arr_fileAttribute, "attributes");
        Path path1 = Files.createFile(path0, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        L.o(path1, "createFile(...)");
        return path1;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path m1(Path path0, Path path1, CopyOption[] arr_copyOption) throws IOException {
        L.p(path0, "<this>");
        L.p(path1, "target");
        L.p(arr_copyOption, "options");
        Path path2 = Files.move(path0, path1, ((CopyOption[])Arrays.copyOf(arr_copyOption, arr_copyOption.length)));
        L.o(path2, "move(...)");
        return path2;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path n0(Path path0, Path path1) throws IOException {
        L.p(path0, "<this>");
        L.p(path1, "target");
        Path path2 = Files.createLink(path0, path1);
        L.o(path2, "createLink(...)");
        return path2;
    }

    static Path n1(Path path0, Path path1, boolean z, int v, Object object0) throws IOException {
        if((v & 2) != 0) {
            z = false;
        }
        L.p(path0, "<this>");
        L.p(path1, "target");
        CopyOption[] arr_copyOption = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path path2 = Files.move(path0, path1, ((CopyOption[])Arrays.copyOf(arr_copyOption, arr_copyOption.length)));
        L.o(path2, "move(...)");
        return path2;
    }

    @h0(version = "1.9")
    @l
    public static final Path o0(@l Path path0, @l FileAttribute[] arr_fileAttribute) throws IOException {
        L.p(path0, "<this>");
        L.p(arr_fileAttribute, "attributes");
        Path path1 = path0.getParent();
        if(path1 != null && !Files.isDirectory(path1, ((LinkOption[])Arrays.copyOf(new LinkOption[0], 0)))) {
            try {
                FileAttribute[] arr_fileAttribute1 = (FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length);
                L.o(Files.createDirectories(path1, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute1, arr_fileAttribute1.length))), "createDirectories(...)");
                return path0;
            }
            catch(FileAlreadyExistsException fileAlreadyExistsException0) {
                if(!Files.isDirectory(path1, ((LinkOption[])Arrays.copyOf(new LinkOption[0], 0)))) {
                    throw fileAlreadyExistsException0;
                }
            }
        }
        return path0;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final boolean o1(Path path0, LinkOption[] arr_linkOption) {
        L.p(path0, "<this>");
        L.p(arr_linkOption, "options");
        return Files.notExists(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path p0(Path path0, Path path1, FileAttribute[] arr_fileAttribute) throws IOException {
        L.p(path0, "<this>");
        L.p(path1, "target");
        L.p(arr_fileAttribute, "attributes");
        Path path2 = Files.createSymbolicLink(path0, path1, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        L.o(path2, "createSymbolicLink(...)");
        return path2;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final BasicFileAttributes p1(Path path0, LinkOption[] arr_linkOption) throws IOException {
        L.p(path0, "<this>");
        L.p(arr_linkOption, "options");
        L.y(4, "A");
        BasicFileAttributes basicFileAttributes0 = Files.readAttributes(path0, BasicFileAttributes.class, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
        L.o(basicFileAttributes0, "readAttributes(...)");
        return basicFileAttributes0;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path q0(String s, FileAttribute[] arr_fileAttribute) throws IOException {
        L.p(arr_fileAttribute, "attributes");
        Path path0 = Files.createTempDirectory(s, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        L.o(path0, "createTempDirectory(...)");
        return path0;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Map q1(Path path0, String s, LinkOption[] arr_linkOption) throws IOException {
        L.p(path0, "<this>");
        L.p(s, "attributes");
        L.p(arr_linkOption, "options");
        Map map0 = Files.readAttributes(path0, s, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
        L.o(map0, "readAttributes(...)");
        return map0;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @l
    public static final Path r0(@y4.m Path path0, @y4.m String s, @l FileAttribute[] arr_fileAttribute) throws IOException {
        Path path1;
        L.p(arr_fileAttribute, "attributes");
        if(path0 != null) {
            path1 = Files.createTempDirectory(path0, s, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
            L.o(path1, "createTempDirectory(...)");
            return path1;
        }
        path1 = Files.createTempDirectory(s, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        L.o(path1, "createTempDirectory(...)");
        return path1;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path r1(Path path0) throws IOException {
        L.p(path0, "<this>");
        Path path1 = Files.readSymbolicLink(path0);
        L.o(path1, "readSymbolicLink(...)");
        return path1;
    }

    static Path s0(String s, FileAttribute[] arr_fileAttribute, int v, Object object0) throws IOException {
        if((v & 1) != 0) {
            s = null;
        }
        L.p(arr_fileAttribute, "attributes");
        Path path0 = Files.createTempDirectory(s, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        L.o(path0, "createTempDirectory(...)");
        return path0;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @l
    public static final Path s1(@l Path path0, @l Path path1) {
        L.p(path0, "<this>");
        L.p(path1, "base");
        try {
            return H.a.a(path0, path1);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new IllegalArgumentException(illegalArgumentException0.getMessage() + "\nthis path: " + path0 + "\nbase path: " + path1, illegalArgumentException0);
        }
    }

    public static Path t0(Path path0, String s, FileAttribute[] arr_fileAttribute, int v, Object object0) throws IOException {
        if((v & 2) != 0) {
            s = null;
        }
        return f1.r0(path0, s, arr_fileAttribute);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @y4.m
    public static final Path t1(@l Path path0, @l Path path1) {
        L.p(path0, "<this>");
        L.p(path1, "base");
        try {
            return H.a.a(path0, path1);
        }
        catch(IllegalArgumentException unused_ex) {
            return null;
        }
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path u0(String s, String s1, FileAttribute[] arr_fileAttribute) throws IOException {
        L.p(arr_fileAttribute, "attributes");
        Path path0 = Files.createTempFile(s, s1, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        L.o(path0, "createTempFile(...)");
        return path0;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @l
    public static final Path u1(@l Path path0, @l Path path1) {
        L.p(path0, "<this>");
        L.p(path1, "base");
        Path path2 = f1.t1(path0, path1);
        return path2 == null ? path0 : path2;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @l
    public static final Path v0(@y4.m Path path0, @y4.m String s, @y4.m String s1, @l FileAttribute[] arr_fileAttribute) throws IOException {
        Path path1;
        L.p(arr_fileAttribute, "attributes");
        if(path0 != null) {
            path1 = Files.createTempFile(path0, s, s1, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
            L.o(path1, "createTempFile(...)");
            return path1;
        }
        path1 = Files.createTempFile(s, s1, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        L.o(path1, "createTempFile(...)");
        return path1;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path v1(Path path0, String s, Object object0, LinkOption[] arr_linkOption) throws IOException {
        L.p(path0, "<this>");
        L.p(s, "attribute");
        L.p(arr_linkOption, "options");
        Path path1 = Files.setAttribute(path0, s, object0, ((LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length)));
        L.o(path1, "setAttribute(...)");
        return path1;
    }

    static Path w0(String s, String s1, FileAttribute[] arr_fileAttribute, int v, Object object0) throws IOException {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        L.p(arr_fileAttribute, "attributes");
        Path path0 = Files.createTempFile(s, s1, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        L.o(path0, "createTempFile(...)");
        return path0;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path w1(Path path0, FileTime fileTime0) throws IOException {
        L.p(path0, "<this>");
        L.p(fileTime0, "value");
        Path path1 = Files.setLastModifiedTime(path0, fileTime0);
        L.o(path1, "setLastModifiedTime(...)");
        return path1;
    }

    public static Path x0(Path path0, String s, String s1, FileAttribute[] arr_fileAttribute, int v, Object object0) throws IOException {
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        return f1.v0(path0, s, s1, arr_fileAttribute);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path x1(Path path0, UserPrincipal userPrincipal0) throws IOException {
        L.p(path0, "<this>");
        L.p(userPrincipal0, "value");
        Path path1 = Files.setOwner(path0, userPrincipal0);
        L.o(path1, "setOwner(...)");
        return path1;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final void y0(Path path0) throws IOException {
        L.p(path0, "<this>");
        Files.delete(path0);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path y1(Path path0, Set set0) throws IOException {
        L.p(path0, "<this>");
        L.p(set0, "value");
        Path path1 = Files.setPosixFilePermissions(path0, set0);
        L.o(path1, "setPosixFilePermissions(...)");
        return path1;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final boolean z0(Path path0) throws IOException {
        L.p(path0, "<this>");
        return Files.deleteIfExists(path0);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final Path z1(URI uRI0) {
        L.p(uRI0, "<this>");
        Path path0 = Paths.get(uRI0);
        L.o(path0, "get(...)");
        return path0;
    }
}

