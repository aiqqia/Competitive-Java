   public static long findMaximumSum(List<Integer> stockPrice, int k) {
        int c = 0;
        long sum = 0;
        long ma = -1;
        HashSet<Integer> set = new HashSet<>();
        // int x=0,s=0;
        // while(set.size() != k){
        //     s++;
        //     if(!set.contains(stockPrice.get(x)))
        //         set.add(stockPrice.get(x));
        //     if(s == 3 && set.size() != k){
        //         set.clear();
        //         set.add();
        //         s = 1;
        //     }
        //     x++;
        // }
        int in = k;
        for(int i=0;i<stockPrice.size();i++){
            sum = 0;
            c = 0;
            set.clear();
            while(c<k){
                sum += stockPrice.get(i+c);
                set.add(stockPrice.get(i+c));
                c++;
            }
            if(set.size() == k && sum > ma){
                ma = sum;
                in = i+c;
                break;
            }
        }
        if(ma == -1)
            return ma;
            
        System.out.println(ma+" "+in);
            
        for(int i=in;i<(stockPrice.size());i++){
            set.remove(stockPrice.get(i-k));
            sum -= stockPrice.get(i-k);
            if(set.contains(stockPrice.get(i))){
                set.clear();
                set.add(stockPrice.get(i));
                sum = stockPrice.get(i);
                continue;
            }
            System.out.print(sum);
            // if(set.size() != k){
            //     set.add(stockPrice.get(i));
            //     sum += stockPrice.get(i);
            // }
            System.out.print(sum);
            set.add(stockPrice.get(i));
            sum += stockPrice.get(i);
            System.out.print(sum + " ");
            if(set.size() == k && sum > ma){
                ma = sum;
            }
            System.out.println(ma);
        }
        return ma;
    }

}