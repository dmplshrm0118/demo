/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessment;

public class AddStringNumbers {
    
    public static int AddStrings(String num){
        if(num.isEmpty()){
                return 0;
            }
        else 
            if(!num.contains(",") && !num.contains("\n")){
                return Integer.parseInt(num);
            }
            else{
                
                int sum = 0;
                String ns = "0", ms = "0";
                ns = num.replaceAll("\n",",");
                if(ns.charAt(0) == '/' && ns.charAt(1) == '/'){
                    char ch = ns.charAt(2);
                    ms = ns.replace(ch, ',');
                    ms = ms.replace('/', ',');
                }
                    String[] numbers = ms.split(",");
                    for(int i = 0; i < numbers.length; i++){
                        if(numbers[i].isEmpty()){
                            numbers[i] = "0";
                        }
                            sum += Integer.parseInt(numbers[i]);
                    }
                    return sum;
            } 
    }
    public static void main(String[] args) {
        String a = "//***\n4*3*4*5";
        int result = AddStrings(a);
        System.out.println(result);   
    }
}
