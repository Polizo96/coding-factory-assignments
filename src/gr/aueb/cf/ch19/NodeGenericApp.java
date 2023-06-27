package gr.aueb.cf.ch19;

public class NodeGenericApp {

    public static void main(String[] args) {
        NodeGeneric<Integer> nodeInt = new NodeGeneric<>();
        NodeGeneric<String> nodeStr = new NodeGeneric<>();
//        var nodeInt = new NodeGeneric<Integer>();

        nodeInt.setValue(3);
        nodeStr.setValue("Coding");

//        Compile-type Safety
//        int val = (int) nodeStr.getValue();
    }
}
