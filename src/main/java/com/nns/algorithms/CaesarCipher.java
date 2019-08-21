package com.nns.algorithms;

/**
 * Created by Aaron H. on 12/20/15.
 */
public class CaesarCipher {

    private char [] encoder = new char[26];
    private char [] decoder = new char[26];

    public CaesarCipher(int offset){
        this.generateKeys(offset);
    }

    private void generateKeys(int offset){
        int k = Math.abs(offset % 26);
        for(int i = 0; i < 26; i++){
            encoder[i] = (char)('A' + ((i + k) % 26));
            decoder[i] = (char)('A' + ((i - k + 26)) % 26);
        }
    }

    private String transformString(String s, char [] code){
        char [] msg = s.toCharArray();

        for(int i = 0; i < msg.length; i++){
            if(Character.isUpperCase(msg[i])){
                int j = msg[i] - 'A';
                msg[i] = code[j];
            }
        }
        return new String(msg);

//        String data = s.toLowerCase();
//        int length = data.length();
//        char [] decodedString = new char [length];
//        for(int i = 0; i < length; i++){
//            if(data.charAt(i) == ' '){
//                decodedString[i] = ' ';
//                continue;
//            }
//            int index = encoder.indexOf(data.charAt(i));
//            decodedString[i] = decoder.charAt(index);
//        }
//        return new String(decodedString);
    }

    public String encodeString(String s){
        return transformString(s, encoder);
    }

    public String decodeString(String s){
        return transformString(s, decoder);
    }
}
