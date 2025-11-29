public class ExcelSheetColumnNumber {

    public int titleToNumber(String columnTitle) {
      String alphabets=" ";

      for(int i=65;i<=90;i++){
        alphabets+=(char)(i);
      }

      //Now each index corresponds with the position of the number, i.e. A is 1, B is 2...

    int sum=0; //This will hold the column number

    /*It is essential to remember that column numbers in Excel are base 26 numbers*/

      for(int i=0, n=columnTitle.length()-1;i<columnTitle.length() && n>=0;i++,n--){
        sum+=alphabets.indexOf(columnTitle.charAt(i))*(int)(Math.pow(26,n));
      }

      //directly converting base 26 to base 10

      return sum;
    }
}

      

