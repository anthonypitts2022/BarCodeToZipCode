  Anthony Pitts   
                         
                         ***     ZIPCODE/BARCODE CONVERTER:    ***
                                     
This project is effectuated through the main method found in the ZipTest class. 
The Zipcode class has three instance variables, as zip, bar, and the zipArray. The zipArray is an Array which, in order
     from 0,9 has the barcode colons and lines which correlate to each number,0-9, that is a zipcode digit. This allows
     for quick access to the conversion between zipcode digits and the five correlated barcode symbols in both the
     method which converts zipcodes to barcodes and the method which converts barcodes to zipcodes.
               
public Zipcode(String bar) is the method which takes an inputted String barcode, bar, and ultimately converts it to 
     a 5 digit zipcode, zip. How this code goes about that is by taking each 5 symbols of the barcode and putting each
     into seperate elements in the barArray[]. The following while loop compares each element of the barArray to each
     element in the zipArray, and whichever element is equal, is placed in another array, called barCodeNumbers. 
     Ultimately, this loop will populate the barCodeNumbers array with 5 elements, 1 integer per element, which correlate,
     in correct sequential order, to the zipcode which correlates with the inputted barcode. 
     IMPORTANT: the last five characters in the bar variable were never put into the barArray because they are only used
     as a check number for the barcode, but not part of the 5-digit zipcode. Then a for loop is used to convert the 
     barCodeNumbers array into a random String variable z. This String variable is then stored in the zip variable.
     
public Zipcode(int zip) is the method which takes an inputted int zipcode, zip, and ultimately converts it to 
     a 30 char barcode, bar. How this code goes about that is by instantiating variables that will be used later. Then
     the inputted variable zip is converted to a String, zipAsString. Then, an integer array, called zip1, is created.
     Then a String array, called barArray, is created. The first for loop's purpose is to take each character in 
     zipAsString and parse it into an integer value and store each integer value into the zip1 array. The following for
     loop takes the zipcode digit in each zip1 array element and set it equal to a random variable a. Then, each
     iteration of the loop takes the String value of zipArray[a] and stores it in the first 5 elements of barArray. The
     variable j and the next 2 if statements are all used to insure the accuracy of the check digit section of the barcode
     I used modulo 10 and the sum of the zipcode if everything worked simply in the second if statement. However, since
     10-(10%10) = 10 , yet the check digit should be 0 and not 10, since that would mean the sum of the zipcode digits
     is already a multiple of ten, the first if statement corrected this. I stored the correct check digit as 
     checkDigitAsInt, which then gets converted to its equilivant value in terms of barcode symbols, by way of the
     zipArray. The variable z and the final for loop are used to take the elements from the barArray and convert them into
     the String variable, bar.
     
This Zipcode class ends with two getter methods. The getBarcode method returns the bar variable value. The getZIPcode 
    method returns the value of the zip variable. Both of these are printed out in the main method found in
    the ZipTest class.
