package mayame.edu.fillupwordshebrow.models;

/**
 * Created by מאיה מסיקה on 16/08/16.
 */
public class UserProfile {

    private String name;
    private String age;
    private String gender;
    private String profileImage;

    public UserProfile() {
    }

    public UserProfile(String name, String age, String gender, String profileImage) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.profileImage = profileImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", profileImage='" + profileImage + '\'' +
                '}';
    }
}
