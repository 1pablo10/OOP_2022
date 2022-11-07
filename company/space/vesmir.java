package company.space;

public class vesmir {
    private boolean state;
    private long size;
    private String name;

    public vesmir() {
        state = false;
        size = 0;
        name = "jozkoferko";
    }
    public void startVesmir(){
        state = true;
        System.out.println("Startujem vesmir");
        increaseSize();
    }
    private void increaseSize(){
        while(size < 1000) {
            size++;
        }
    }
    private void decreaseSize(long desiredSize){
        while(size > desiredSize){
            size--;
        }
    }
}

