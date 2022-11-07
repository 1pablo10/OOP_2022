package company.vesminetelesa;

public class Hviezda extends Vesmirne_telesa {
    private String name;
    private double size;
    private double age;
    private Boolean svietim = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Hviezda() {
        setType("Hviezda");
        setName("Hviezda Y");
        setSize(0);
        setAge(0);
    }

    public Hviezda(String name, double size, double age) {
        setName(name);
        setSize(size);
        setAge(age);
        setType("Hviezda");
    }

    public void sviet(){
        if(svietim == false){
            svietim = true;
        }
        else System.out.println("Uz svietim");
    }

    public void zhasni(){
        if(svietim == true){
            svietim = false;
        }
        else System.out.println("Uz som zhasnuta");
    }
}
