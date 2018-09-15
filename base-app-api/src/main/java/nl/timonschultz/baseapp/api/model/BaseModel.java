package nl.timonschultz.baseapp.api.model;

public class BaseModel {

    private String name;
    private String message;

    public BaseModel() {
    }

    public BaseModel(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

}