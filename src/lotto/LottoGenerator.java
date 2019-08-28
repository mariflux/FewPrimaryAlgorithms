package lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoGenerator {
    static Set<Integer> rand(int start, int stop, int howMany){
        HashSet<Integer> hashRand = new HashSet<>();
        Random rand = new Random();
        int end = stop -start;

        if(end+1>howMany) {
            do {
                hashRand.add(rand.nextInt(end + 1) + start);
            } while (hashRand.size() < howMany);
        }else{
            throw new IllegalArgumentException("There is not enough numbers in this range");
        }
        return hashRand;
    }
}
