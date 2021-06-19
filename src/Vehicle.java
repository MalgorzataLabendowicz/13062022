import java.util.ArrayList;

public class Vehicle {


    public boolean checkIfListIsEmpty(ArrayList<Motocykle> motocykleArrayList) {
        return motocykleArrayList.isEmpty();
    }
    public void motorcycleCheck(ArrayList<Motocykle>motocykleArrayList){
        if (checkIfListIsEmpty(motocykleArrayList)){
            System.out.println("Ta lista jest pusta!");
        }
        else{
            for (int i = 0; i < motocykleArrayList.size(); i++){
                System.out.println("Motor NR" +i);
            }
        }
    }
}
