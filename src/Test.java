import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<Byte> bn= new ArrayList<>();
        bn.add((byte) 'h');
        bn.add((byte) 'e');
        bn.add((byte) 'l');
        bn.add((byte) 'l');
        bn.add((byte) 'o');
//        System.out.println(bn.toString());
//
        getString(bn);
    }

    private static void getString(ArrayList<Byte> arr){

        arr.toString();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {

            stringBuilder.append(arr.get(i).toString());
        }
        System.out.println(stringBuilder.toString());
    }
}
