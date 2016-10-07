import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Decoder decoder = new Decoder("abcdefghijklmnopqrstuvwxyz");
        System.out.println("result");

//        for (int i = 0; i < 130; i++) {
        DecryptionResult result = decoder.decode(("EFFPQLMEHEMVPCPYFLMVHQLUHYTCETHQEKLPVMMVHQLUWEOLFPQLIVDLWLULMVHQLUCYAUHUYDUEOSQY" +
                "ATFFVSMUVOVWEPLPQVSPCHLYGETDYUVPQOGUYOOYWYETHQEKLPVMYWLSASVWDEWCPLSPYGDYYFWLSSYGGVPCYAEULMYO" +
                "GYUPEKTLBVPQCYAOECASLVWFLRYGMYVWMVFLWMLNESVSNVLREOVWEPVYWSPEPVSPVMETPLSPSYUBQEPLILUOLPQYFCYAGLLT" +
                "BVTTSQYBPQLKLSPULSATPPUCPYPQVWNYGBQEPBVTTQEHHLWVGPQLNLCMYWPEVWSSEOLMQEUEMPLUSEPFVGGLULWPHYSVPVYWSB" +
                "VTTCYAUHUYDUEOSPVTTKLQEILMYUULMPTC").toLowerCase());
        System.out.println(result);
//            System.out.println(i+". "+ result);
//    }
//        System.out.println("result = " + result);
//        DecryptionResult result = decoder.decode(("EFFPQLMEHEMVPCPYFLMVHQLUHYTCETHQEKLPVMMVHQLUWEOLFPQLIVDLWLULMVHQLUCYAUHUYDUEOSQY" +
//                "ATFFVSMUVOVWEPLPQVSPCHLYGETDYUVPQOGUYOOYWYETHQEKLPVMYWLSASVWDEWCPLSPYGDYYFWLSSYGGVPCYAEULMYO" +
//                "GYUPEKTLBVPQCYAOECASLVWFLRYGMYVWMVFLWMLNESVSNVLREOVWEPVYWSPEPVSPVMETPLSPSYUBQEPLILUOLPQYFCYAGLLT" +
//                "BVTTSQYBPQLKLSPULSATPPUCPYPQVWNYGBQEPBVTTQEHHLWVGPQLNLCMYWPEVWSSEOLMQEUEMPLUSEPFVGGLULWPHYSVPVYWSB" +
//                "VTTCYAUHUYDUEOSPVTTKLQEILMYUULMPTC").toLowerCase());
//        System.out.println(result);
//        DecryptionResult result = decoder.decode(("LSSYEWRPLRFHZZFXHUZWMGUWVOSWKWFDWMRHZPPDVZVTBPAIEMSARWYSHNRBPZQCUSYCC" +
//                "DARXWCXELAQSWGSJPROECEOHQRLELWWKSFEFJAQWWCXXLXZFGSZGHSAFLLZLCUSPWSOGLKTRNKCXIQUNGKYIVOSJIHFBCFPLOBIJIHQRF" +
//                "WTGGNLDLFPRDGILFUWUSLWFLHLFCBXPKCVRLGWRGEIJYWCHFWIKRZVXZIAKTDZKNEDGEGGYCULHNQCFIHXCLGQLRGWLIOUFCZLGJFCEPL" +
//                "YNDWCLPYUWOLCBLARLOPCEIHQRFAGVCKGAOUGJVSELHBIPCFNKGWEFLUWFRTXELADWWKHZPPXKSMELDCLXCCWGHZPFRTPJHOUYLXCCVKW" +
//                "FDWMRLZSSARGPLUFUWLPLLBZGCSMYSLESSNZDIMXHBWPRRFLAYGRQSPEVRFLDPHCRFPJWDKASJQXAQWLZGSFGXLNFSJJCMRLOSOCJOKTBB" +
//                "JRWMICCZWLGNKRGIBXGTGCUNGLLZDXFHGYZRXSPEVNKGWNFNGLXZVAOMLPQXQSPKFRZHWYLMACFPLBVRWICOGVWIFNJOJOCWPSFZIGTSLI" +
//                "WCVHPXOHKQGXSGVBPSOCQMKZANKHAXSYYOLPFGNBVIHQVGADHQRLGYZHVYQIWLNBTPLBHFWHVXJOKEVNSWJDHXASLZUNGLLSWBKAWDGJTS" +
//                "PCWPUHBFGCUFAEWWTAWEVNCZSTBCRLLIRXRGFZHLBIFESDSSHELOBFLSOCKMGFLJESPQFNRHGOCFLOLPJNELQZIGJWKSWDLCDIKWAHPQWW" +
//                "QOFJHQVBYIOCRVWIRNFWYYORRRPAZJPSPEVNASAEVNEMGFLJESPNCCFSSCQQVBYIKNFZJZUBBAWZBNKSDDSPBHPEUCTSHCWLRLXTFBGLHY" +
//                "SJFSPISJISLSSGRAAEMURHLTFDCLLSSARLKZSERFQZBNKKGFZMXBGHPOBFKFFNKHZPMPHSKDSMKHZTGXASPECXYOLPWOLCMCDABUJLAGQS" +
//                "UTDQRFWOHQVGSFHXZOLTQJYZQIHQRBPTLBUCMWRGPCFRFJGIDLHNJWLSLCUSELLRZOEDQXESPZBNPC" +
//                "MWRGNQZTSERKAEVGGVADLUNPOZTTLCMCLFBFCIQJAADVSGNUJPOCKRWLZGNHPEHNKBWIIGCIRKZNKRSJOUBILEVRFLSIZRGHDILUNHWDEQNBCJCDKL").toLowerCase());
    }
}