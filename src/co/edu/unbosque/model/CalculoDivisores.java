package co.edu.unbosque.model;

import java.util.ArrayList;

public class CalculoDivisores {

    private ArrayList<Integer> divisores1;
    private ArrayList<Integer> divisores2;

    public CalculoDivisores() {
        divisores1 = new ArrayList<>();
        divisores2 = new ArrayList<>();
    }

    public int calcularMCD(int num1, int num2) {
        int mcd=0;
        for (int i=1;i<=num1;i++){
            if (num1%i==0){
                divisores1.add(i);
            }
        }
        for (int i=1;i<=num2;i++){
            if (num2%i==0){
                divisores2.add(i);
            }
        }
        if(divisores1.size()>divisores2.size()){
            for (int div:divisores2) {
                if(divisores1.contains(div) && div>mcd){
                    mcd=div;
                }
            }
            return mcd;
        }else{
            for (int div:divisores1) {
                if(divisores2.contains(div) && div>mcd){
                    mcd=div;
                }
            }
            return mcd;
        }
    }
}
