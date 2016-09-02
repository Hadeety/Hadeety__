package mohammed.hatoon.hadeety.classes;

/**
 * Created by Hatoon Mo on 8/31/2016.
 */
public class Gift  {
 private int giftId;
    private int userId;
    private String giftTitle;
    private String giftStore;
    private String giftLink;
    private Picture giftPic;


    public Gift(int giftId, int userId, String giftTitle, String giftStore, String giftLink, Picture giftPic) {
        this.giftId = giftId;
        this.userId = userId;
        this.giftTitle = giftTitle;
        this.giftStore = giftStore;
        this.giftLink = giftLink;
        this.giftPic = giftPic;
    }

    public int getGiftId() {
        return giftId;
    }

    public void setGiftId(int giftId) {
        this.giftId = giftId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getGiftTitle() {
        return giftTitle;
    }

    public void setGiftTitle(String giftTitle) {
        this.giftTitle = giftTitle;
    }

    public String getGiftStore() {
        return giftStore;
    }

    public void setGiftStore(String giftStore) {
        this.giftStore = giftStore;
    }

    public String getGiftLink() {
        return giftLink;
    }

    public void setGiftLink(String giftLink) {
        this.giftLink = giftLink;
    }

    public Picture getGiftPic() {
        return giftPic;
    }

    public void setGiftPic(Picture giftPic) {
        this.giftPic = giftPic;
    }
}
