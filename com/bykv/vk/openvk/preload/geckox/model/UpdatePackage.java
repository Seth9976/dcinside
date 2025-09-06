package com.bykv.vk.openvk.preload.geckox.model;

import com.bykv.vk.openvk.preload.a.a.b;
import java.util.List;

public class UpdatePackage {
    public static class Content {
        @b(a = "package")
        private Package fullPackage;
        @b(a = "patch")
        private Package patch;
        @b(a = "strategies")
        private Strategy strategy;

    }

    public static final class FileType {
        public static final int COMPRESSED_FILE = 0;
        public static final int MY_ARCHIVE_FILE = 2;
        public static final int UNCOMPRESSED_FILE = 1;

    }

    public static class Package {
        @b(a = "id")
        long id;
        @b(a = "size")
        long length;
        @b(a = "md5")
        String md5;
        @Deprecated
        String url;
        @b(a = "url_list")
        List urlList;

        public Package() {
        }

        public Package(int v, List list0, String s) {
            this.id = (long)v;
            this.urlList = list0;
            this.md5 = s;
        }

        public long getId() {
            return this.id;
        }

        public long getLength() {
            return this.length;
        }

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public List getUrlList() {
            return this.urlList;
        }

        public void setId(int v) {
            this.id = (long)v;
        }

        public void setMd5(String s) {
            this.md5 = s;
        }

        public void setUrl(String s) {
            this.url = s;
        }

        public void setUrlList(List list0) {
            this.urlList = list0;
        }

        @Override
        public String toString() {
            return "Package{url=\'" + this.url + '\'' + ", md5=\'" + this.md5 + '\'' + '}';
        }
    }

    public static class Strategy {
        @b(a = "del_if_download_failed")
        private boolean deleteIfFail;
        @b(a = "del_old_pkg_before_download")
        private boolean deleteOldPackageBeforeDownload;
        @b(a = "need_unzip")
        private boolean needUnzip;

        public Strategy(int v) {
            this.deleteIfFail = v == 1;
        }

        public boolean isDeleteIfFail() {
            return this.deleteIfFail;
        }

        public boolean isDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public boolean isNeedUnzip() {
            return this.needUnzip;
        }

        public void setDeleteIfFail(boolean z) {
            this.deleteIfFail = z;
        }

        public void setDeleteOldPackageBeforeDownload(boolean z) {
            this.deleteOldPackageBeforeDownload = z;
        }

        public void setNeedUnzip(boolean z) {
            this.needUnzip = z;
        }
    }

    private String accessKey;
    @b(a = "channel")
    private String channel;
    @b(a = "channel_index")
    private int channelIndex;
    @b(a = "content")
    private Content content;
    @b(a = "group_name")
    private String groupName;
    private long localVersion;
    @b(a = "package_type")
    private int packageType;
    @b(a = "package_version")
    private long version;

    public UpdatePackage() {
    }

    public UpdatePackage(long v, String s, Package updatePackage$Package0, Package updatePackage$Package1) {
        this.version = v;
        this.channel = s;
        Content updatePackage$Content0 = new Content();
        this.content = updatePackage$Content0;
        updatePackage$Content0.fullPackage = updatePackage$Package0;
        this.content.patch = updatePackage$Package1;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public Package getFullPackage() {
        return this.content.fullPackage;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public Package getPatch() {
        return this.content.patch;
    }

    public Strategy getStrategy() {
        return this.content.strategy;
    }

    public long getVersion() {
        return this.version;
    }

    public boolean isFullUpdate() {
        return this.getFullPackage() != null && this.getFullPackage().getUrlList().size() > 0;
    }

    public boolean isPatchUpdate() {
        return this.getPatch() != null && this.getPatch().getUrlList().size() > 0;
    }

    public void setAccessKey(String s) {
        this.accessKey = s;
    }

    public void setChannel(String s) {
        this.channel = s;
    }

    public void setChannelIndex(int v) {
        this.channelIndex = v;
    }

    public void setFullPackage(Package updatePackage$Package0) {
        this.content.fullPackage = updatePackage$Package0;
    }

    public void setGroupName(String s) {
        this.groupName = s;
    }

    public void setLocalVersion(long v) {
        this.localVersion = v;
    }

    public void setPatch(Package updatePackage$Package0) {
        this.content.patch = updatePackage$Package0;
    }

    public void setStrategy(Strategy updatePackage$Strategy0) {
        this.content.strategy = updatePackage$Strategy0;
    }

    public void setVersion(long v) {
        this.version = v;
    }

    @Override
    public String toString() {
        return "UpdatePackage{version=" + this.version + ", channel=\'" + this.channel + '\'' + ", content=" + this.content + ", packageType=" + this.packageType + '}';
    }
}

