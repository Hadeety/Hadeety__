package mohammed.hatoon.hadeety.classes;

/**
 * Created by Hatoon Mo on 8/31/2016.
 */
public class Picture {
    private int picId;
    private String picUrl;
    private Gift gift;

    public Picture(int picId, String picUrl, Gift gift) {
        this.picId = picId;
        this.picUrl = picUrl;
        this.gift = gift;
    }

    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }
}
