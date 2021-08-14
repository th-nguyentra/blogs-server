package restapi.io.trainingbackend.entity;
import javax.persistence.*;
@Entity(name = Blog.PERSISTANCE_NAME)
@Table(name = Blog.PERSISTANCE_NAME)
public class Blog {
    static final String PERSISTANCE_NAME = "blogs";
    // define fields
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="title")
    private String title;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Categories category;

    @Column(name="description")
    private String description;

    @Column(name="description_detail")
    private String description_detail;

    @Column(name="image")
    private String image;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @Column(name="create_date")
    private String create_date;
    @Column(name="views")
    private int views;
    public  Blog(){}

    public Blog(int id, String title, Categories category, String description, String description_detail, String image, User user, String create_date, int views) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.description = description;
        this.description_detail = description_detail;
        this.image = image;
        this.user = user;
        this.create_date = create_date;
        this.views = views;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription_detail() {
        return description_detail;
    }

    public void setDescription_detail(String description_detail) {
        this.description_detail = description_detail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
