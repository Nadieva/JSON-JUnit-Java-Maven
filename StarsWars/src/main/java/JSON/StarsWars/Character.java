package JSON.StarsWars;
import javax.json.bind.annotation.JsonbProperty;


public class Character{

    private Long id;

    @JsonbProperty("name")
    private String name;

    @JsonbProperty("height")
    private Integer height;

	@JsonbProperty("birth year")
    private String birth_year;
    
    @JsonbProperty("gender")
    private String gender;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


   public void setHeight(Integer height) {
	        this.height=height;
	}

    public Integer getHeight() {
	       return this.height;
	}
	

    public void setBirthYear(String birth_year) {
	        this.birth_year = birth_year;
	}

    public String getBirthYear() {
	       return this.birth_year;
	}

	public void setGender(String gender) {
	        this.gender = gender;
	}

    public String getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return "Character [id=" + id 
        		+ ", name=" + name
                + ", birth year=" + birth_year
                + ",height=" + height
                + ", gender="+ gender + "]";
    }
}