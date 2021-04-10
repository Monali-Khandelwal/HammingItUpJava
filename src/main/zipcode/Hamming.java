package zipcode;

public class Hamming {
    String hammingString1;
    String hammingString2;

    public Hamming(String s, String s1) throws IllegalArgumentException {
        this.hammingString1 =s;
        this.hammingString2 =s1;

        if (hammingString1.length() != hammingString2.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        }

    public int getHammingDistance() {
    int count = 0;
        for (int i = 0; i < hammingString1.length(); i++) {
            if(hammingString1.charAt(i) != hammingString2.charAt(i)){
                count++;
            }
        }
    return count;
    }
}
