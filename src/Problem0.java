import javax.swing.*;


public class Problem0 {

    public static void main(String[] args) {
        String name, classname;
        int snacks;
        float costTotal2;


        name = JOptionPane.showInputDialog("Please enter a Name");
        classname = JOptionPane.showInputDialog("Please enter Class");
        snacks = Integer.parseInt(JOptionPane.showInputDialog("How Many snacks do you want"));

        costTotal2 = costTotal(snacks);

        JOptionPane.showMessageDialog(null, "Details are:\nName: " + name + "\nClass: " + classname + "\nHow many: " + snacks + "\nCost: " + costTotal2 , "Details" ,JOptionPane.INFORMATION_MESSAGE );


    }
    public static float costTotal(int a) {

        float cost;
        cost = a *2;
        return cost;
    }
}
