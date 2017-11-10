public class Test {
	
   public String compress(String str){
	   //String str1 = str;
	   String[] arr = {"a","a","a","b","b","c","d","d","d","e"};
	   StringBuffer sb = new StringBuffer();
	   
	   int j=1;
	   int size= arr.length-1;
	   int i;
	   for(i=0; i<size; i++){
		  
		   if(arr[i]==arr[i+1]){
			   j++;
		   }else {
			   sb.append(arr[i]).append(j);
			   j=1;
		   }
	   }
	   if(i==size){
		   sb.append(arr[i]).append(j);
	   }
	   return sb.toString();
	   
   
    }
   
   public static void main(String arrgs[]){
	   Test tc = new Test();
	   String inputStr = "aaabbcdddd";
	   System.out.println("Before Compress " + inputStr);
	   String outputStr = tc.compress(inputStr);
	   System.out.println("After Compress " + outputStr);
   }
}
   

