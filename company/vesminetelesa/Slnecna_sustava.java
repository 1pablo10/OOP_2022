package company.vesminetelesa;

public class Slnecna_sustava {
    private String name;
    private Hviezda slnko;
    private Vesmirne_telesa[] obezne_telesa = new Vesmirne_telesa[5000];
    private int object_counter;

    public int getObject_counter() {
        return object_counter;
    }

    public void setObject_counter(int object_counter) {
        this.object_counter = object_counter;
    }

    public Slnecna_sustava() {
        slnko = new Hviezda();
        setObject_counter(0);

        String[] names = {"Merkur","Venusa","Zem","Mars","Jupiter","Saturn","Uran","Neptun"};
        double[] weights = {33022,48685,59736,64185,18986,56846,86810,10243};
        double[] diameters = {4879,12104,12742,6779,139820,116460,50724,49244};

        for(int i=0;i<8;i++,object_counter++){
            obezne_telesa[object_counter] = new Planeta(names[i],weights[i],diameters[i]);
            System.out.println("Nova planeta");
        }
        obezne_telesa[object_counter] = new Hviezda("Slnko",696340,4603);
        object_counter++;
    }

    public void addTeleso(Vesmirne_telesa nove_teleso){
        obezne_telesa[object_counter]=nove_teleso;
        object_counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
