package web.models;

public class Cars {
    private String mark;
    private String model;

    public Cars(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }


    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }
}
