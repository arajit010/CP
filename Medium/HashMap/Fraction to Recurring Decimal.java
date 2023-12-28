class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder str=new StringBuilder();
        if(numerator<0 && denominator>0){
            str.append("-");
        }
        else if(numerator>0 && denominator<0){
            str.append("-");
        }
        long num = (long) Math.abs((long) numerator);
        long den = (long) Math.abs((long) denominator);
        
        long q=num/den;
        long rem=num%den;
        str.append(q);
        if(rem==0){
            return str.toString();
        }

        else{
            HashMap<Long,Integer> map=new HashMap<>();
            str.append(".");
            while(rem!=0){
                if(map.containsKey(rem)){
                    int l=map.get(rem);
                    str.insert(l,"(");
                    str.append(")");
                    break;
                }
                else{
                    map.put(rem,str.length());
                    rem=rem*10;
                    q=rem/den;
                    rem=rem%den;
                    str.append(q);
                }
            }
        }
    return str.toString();
    }
}