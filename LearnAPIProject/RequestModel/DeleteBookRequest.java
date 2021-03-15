package RequestModel;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DeleteBookRequest {
    @JsonProperty("ID")
    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

   /* public DeleteBookRequest(String id) {
        this.id = id;
    }*/
}
