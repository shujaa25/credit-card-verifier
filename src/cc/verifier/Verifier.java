package cc.verifier;

public class Verifier {
    public boolean verify(String cardNumber){
        int cardLen = cardNumber.length();
            if(!(cardNumber.isEmpty() ||
                    cardLen < 13 //minimum length of a visa card is 13
            )){
                //verify checksum
                int sum = 0;
                for(int i = 0; i < cardLen; i++){
                    if(i%2 == 0){
                        sum += cardNumber.charAt(cardLen-1-i)-48;
                    }else{
                        int x = (cardNumber.charAt(cardLen-1-i)-48) * 2;
                        if(x > 9){
                            sum += x%10;
                            x /= 10;
                            sum += x;
                        }else{
                            sum += x;
                        }
                    }

            }
                return true;
        }
            return false;
    }
}
