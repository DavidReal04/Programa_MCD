package co.edu.unbosque.model;

public class FactoresPrimos {

    public FactoresPrimos() {
    }

    public int calcularMCD(int num1, int num2){
        boolean bandera=false;
        int mcd = 1;
        for(int div=2 ; num1!=1 && num2!=1; div++){
            while(num1%div==0 || num2%div==0) {
                if(num1%div==0&&num2%div==0){
                    bandera=true;
                }
                if(num1%div==0){
                    num1 = num1/div;
                }
                if(num2%div==0){
                    num2 = num2/div;
                }
            }
            if(bandera){
                mcd=mcd*div;
            }
        }
        return mcd;
    }
}
