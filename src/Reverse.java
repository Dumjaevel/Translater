import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class Reverse {

   /* @Test
    public void testGetKey() {
        Reverse reverse = new Reverse();

        assertEquals("A", reverse.getKey("*-"));
    }
*/
    /*@Test
    public void testGetKeyEmpty(){
        Reverse reverse = new Reverse();
        String input = " ";
        String expectedOutput = " ";

        String actualOutput = reverse.getKey(input);

        assertEquals(expectedOutput, actualOutput);
    }
*/
    private HashMap<String, String> reverse;

    public Reverse()  {
        reverse= new HashMap<>();

        reverse.put("*-","A");
        reverse.put("-***","B");
        reverse.put("-*-*","C");
        reverse.put("-**","D");
        reverse.put("*","E");
        reverse.put("**-*","F");
        reverse.put("--*","G");
        reverse.put("****","H");
        reverse.put("**","I");
        reverse.put("*---","J");
        reverse.put("-*-","K");
        reverse.put("*-**","L");
        reverse.put("--","M");
        reverse.put("-*","N");
        reverse.put("---","O");
        reverse.put("*--*","P");
        reverse.put("--*-","Q");
        reverse.put("*-*","R");
        reverse.put("***","S");
        reverse.put("-","T");
        reverse.put("**-","U");
        reverse.put("***-","V");
        reverse.put("*--","W");
        reverse.put("-**-","X");
        reverse.put("-*--","Y");
        reverse.put("--**","Z");
        reverse.put("*----","1");
        reverse.put("**---","2");
        reverse.put("***--","3");
        reverse.put("****-","4");
        reverse.put("*****","5");
        reverse.put("-****","6");
        reverse.put("--***","7");
        reverse.put("---**","8");
        reverse.put("----*","9");
        reverse.put("-----","0");
        reverse.put("*-*-*-",".");
        reverse.put("--**--",",");
        reverse.put("**--**","?");
        reverse.put(" "," ");



    }

    public void exchange(String key, String other) {
        reverse.put(key, other);
    }
    public String getKey(String key) {
        String[] inputarray=key.split(" ");
        String result="";
        for (int i =0; i <inputarray.length; i++) {
            result +=reverse.get(inputarray[i])+"";
        }

        return result;
    }
}

