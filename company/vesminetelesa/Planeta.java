package company.vesminetelesa;

public class Planeta extends Vesmirne_telesa{
    private String name;
    private double weight;
    private double diameter;
    private double gravity;
    private Boolean weightSet=false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(this.weight > weight){
            if(this.weight-weight >= 1000){
                System.out.println("Ja chudnem");
            }
            else System.out.println("Ja chudnem velmi");
        }
        else if(this.weight < weight){
            if(this.weight-weight <= 1000){
                System.out.println("Dokelu pribrala som");
            }
            else System.out.println("Velmo som pribrala");
        }
        if((weight + 1000) < this.weight){
            decreaseGravity(0.1);
        }
        else if((weight-1000) > this.weight){
            increaseGravity(0.1);
        }
        this.weight = weight;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public void increaseGravity(double add){
        setGravity(this.gravity+add);
  }

    public void decreaseGravity(double dec){
        setGravity(this.gravity-dec);
    }

    public void setPlanetaryWeight(double weight){
        if(weightSet == false){
            setWeight(this.weight+weight);
            weightSet = true;
        }
        else System.out.println("Menit vahu mozes len raz");
    }

    public Planeta(String name, double weight, double diameter) {
        setName(name);
        setWeight(weight);
        setDiameter(diameter);
    }

    public Planeta(double gravity) {
        setGravity(gravity);
    }

    public Planeta() {
        setName("Planeta X");
        setWeight(0);
        setDiameter(0);
    }
}