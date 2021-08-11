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

    @Column(name="category_id")
    private String category_id;

    @Column(name="description")
    private String description;

    @Column(name="description_detail")
    private String description_detail;

    @Column(name="image")
    private String image;

    @Column(name="create_by")
    private String create_by;

    @Column(name="create_date")
    private String create_date;
    @Column(name="views")
    private int views;
    public  Blog(){}
    public Blog(String title, String category_id, String description, String description_detail, String image, String create_by, String create_date, int views) {
        this.title = title;
        this.category_id = category_id;
        this.description = description;
        this.description_detail = description_detail;
        this.image = image;
        this.create_by = create_by;
        this.create_date = create_date;
        this.views = views;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
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

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
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
