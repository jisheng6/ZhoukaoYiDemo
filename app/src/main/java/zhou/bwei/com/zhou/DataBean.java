package zhou.bwei.com.zhou;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public  class DataBean {
            /**
             * uniquekey : fcb17e6b548c62e5a1e1c4e856e49dac
             * title : 外媒盛赞世界互联网大会：乌镇开启人脸识别新时代
             * date : 2017-12-01 16:48
             * category : 头条
             * author_name : 环球网
             * url : http://mini.eastday.com/mobile/171201164816907.html
             * thumbnail_pic_s : http://06.imgmini.eastday.com/mobile/20171201/20171201164816_e90161695f76bf67820636279bb54457_4_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://06.imgmini.eastday.com/mobile/20171201/20171201164816_e90161695f76bf67820636279bb54457_3_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://06.imgmini.eastday.com/mobile/20171201/20171201164816_e90161695f76bf67820636279bb54457_1_mwpm_03200403.jpg
             */
            @Id(autoincrement = true)
            private Long tid;
            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            @Generated(hash = 1324645534)
            public DataBean(Long tid, String uniquekey, String title, String date, String category, String author_name, String url, String thumbnail_pic_s,
                    String thumbnail_pic_s02, String thumbnail_pic_s03) {
                this.tid = tid;
                this.uniquekey = uniquekey;
                this.title = title;
                this.date = date;
                this.category = category;
                this.author_name = author_name;
                this.url = url;
                this.thumbnail_pic_s = thumbnail_pic_s;
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }

            @Generated(hash = 908697775)
            public DataBean() {
            }

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }

    @Override
    public String toString() {
        return "DataBean{" +
                "tid=" + tid +
                ", uniquekey='" + uniquekey + '\'' +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", category='" + category + '\'' +
                ", author_name='" + author_name + '\'' +
                ", url='" + url + '\'' +
                ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                '}';
    }

    public Long getTid() {
        return this.tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}