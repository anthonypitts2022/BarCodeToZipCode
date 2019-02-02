//Anthony Pitts 
public class Zipcode{
    int zip;
    String bar;
    String [] zipArray = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|::|:"};
 //The zipArray is an Array which, in order from 0,9 has the barcode colons and lines which correlate
 // to each number,0-9, that is a zipcode digit.

    public Zipcode(String bar){//barcode on package to zipcode of delivery
        this.bar = bar;
        int barCodeNumbers[] = new int [5];
        String [] barArray = new String [5]; //barArray stores 5 character segments of String bar
        barArray[0] = bar.substring(0,5);
        barArray[1] = bar.substring(5,10);
        barArray[2] = bar.substring(10,15);
        barArray[3] = bar.substring(15,20);
        barArray[4] = bar.substring(20,25);    
     
        int i = 0;
        int a = 0;
        while(a<5){//when element of zipArray equals element of barArray, zipcode digit is stored in barCodeNumbers[]
            i=0;
            while(i<10){
                if(zipArray[i].equals(barArray[a])){
                    barCodeNumbers[a] = i;
                    i = 9;
                   }
                i++;
                }
           a++;
       }
     String z = "";
     for(int b=0; b<=4; b++){
         z=z+ barCodeNumbers[b];
     }
       
     zip = Integer.parseInt(z);
        
    }
    
    public Zipcode(int zip){zipcode of address to barcode on package
        this.zip = zip;
        int checkDigitAsInt = -1;
        String zipAsString = Integer.toString(zip);
        int [] zip1 = new int [5];
        String [] barArray = new String [6];
        for(int i=0;i<zip1.length; i++){
            zip1[i] = Integer.parseInt(zipAsString.substring(i,(i+1)));
        }
        for(int i=0;i<5;i++){//purpose = converting zipcode digits into barcode symbols
            int a = zip1[i]; 
            barArray[i] = zipArray[a];
        }
        int j = zip1[0]+zip1[1]+zip1[2]+zip1[3]+zip1[4];
        if(j%10==0){//if sum of zipcode digits is a multiple of 10, sets checkDigitAsInt=0 
            checkDigitAsInt= 0;
        }
        if((j%10)!=10){
            checkDigitAsInt = 10 - (j%10);
        }
        barArray[5] = zipArray[checkDigitAsInt];
       String z = "";
     for(int b=0; b<zip1.length; b++){
         z=z+barArray[b].toString();
     }
       bar = z;
    }
    
    
    
    public String getBarcode(){
        return bar;
    }
    
    public int getZIPcode(){
        return zip;
    }
    
}