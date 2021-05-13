
public class NoTaxProduct extends Product {
    @Override
     public double getImportTax(double tax){
        return 0;
}
     
     public String xuatTT2(){
         return  "Thue:" + getImportTax(0);
     }
     
     
}
