package mohammed.hatoon.hadeety.classes;

import java.util.Date;

/**
 * Created by Hatoon Mo on 8/26/2016.
 */
public class User {

    private int userId;
    private String userName;
    private String userEmail;
    private Date userDateofBirth;
    private String userPicture;
    private String userBio;
    private String userFavColor;
    private Following[] followings;
    private Follower[] followers;

    public User(int userId, String userName, String userEmail, Date userDateofBirth, String userPicture, String userBio, String userFavColor, Following[] followings,Follower[] followers) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userDateofBirth = userDateofBirth;
        this.userPicture = userPicture;
        this.userBio = userBio;
        this.userFavColor = userFavColor;
        this.followings=followings;
        this.followers=followers;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getUserDateofBirth() {
        return userDateofBirth;
    }

    public void setUserDateofBirth(Date userDateofBirth) {
        this.userDateofBirth = userDateofBirth;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public String getUserBio() {
        return userBio;
    }

    public void setUserBio(String userBio) {
        this.userBio = userBio;
    }

    public String getUserFavColor() {
        return userFavColor;
    }

    public void setUserFavColor(String userFavColor) {
        this.userFavColor = userFavColor;
    }
}
