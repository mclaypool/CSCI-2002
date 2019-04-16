import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

public class order{
    private JPanel orderPanel;
    private JButton buttonSubmit;

    // inputs
    private JCheckBox checkBoxPancakes;
    private JTextField InputQuantityPancakes;
    private JCheckBox checkBoxBacon;
    private JTextField InputQuantityBacon;
    private JCheckBox checkBoxEggs;
    private JTextField InputQuantityEggs;

    // outputs
    private JTextArea orderReceipt;
    private JTextArea textAreaMouseClicks;
    private JLabel labelCostPancakes;
    private JLabel labelBaconCost;
    private JLabel labelEggsCost;
    private JLabel labelEggsQuantity;
    private JLabel labelPancakesQuantity;
    private JLabel labelBaconQuantity;

    //
    // Set up form
    //
    public order() {
        buttonSubmit.addActionListener(actionEvent -> onSubmitClick());
        buttonSubmit.addMouseListener(new MouseEventDemo());
        checkBoxPancakes.addMouseListener(new MouseEventDemo());
        InputQuantityPancakes.addMouseListener(new MouseEventDemo());
        checkBoxBacon.addMouseListener(new MouseEventDemo());
        InputQuantityBacon.addMouseListener(new MouseEventDemo());
        checkBoxEggs.addMouseListener(new MouseEventDemo());
        InputQuantityEggs.addMouseListener(new MouseEventDemo());
        orderReceipt.addMouseListener(new MouseEventDemo());
        textAreaMouseClicks.addMouseListener(new MouseEventDemo());
        labelCostPancakes.addMouseListener(new MouseEventDemo());
        labelBaconCost.addMouseListener(new MouseEventDemo());
        labelEggsCost.addMouseListener(new MouseEventDemo());
        labelPancakesQuantity.addMouseListener(new MouseEventDemo());
        labelBaconQuantity.addMouseListener(new MouseEventDemo());
        labelEggsQuantity.addMouseListener(new MouseEventDemo());
    }

    //
    // Run form
    //
    public static void main(String[] args) {
        JFrame frame = new JFrame("Breakfast Order");
        frame.setContentPane(new order().orderPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    //
    // Listeners
    //
    private void onSubmitClick() {
        int totalCostPancakes = 0;
        int totalCostBacon = 0;
        int totalCostEggs = 0;

        orderReceipt.selectAll();
        orderReceipt.replaceSelection("Item, Quantity, Total Cost\n");

        if (checkBoxPancakes.isSelected()){
            final int costPancakes = 5;
            int quantityPancakes = Integer.parseInt(InputQuantityPancakes.getText());
            totalCostPancakes = costPancakes * quantityPancakes;
            orderReceipt.append(Arrays.toString(new String[] {
                    "Pancakes", Integer.toString(quantityPancakes), "$"+Integer.toString(totalCostPancakes)
            }) + '\n');
        }
        if (checkBoxBacon.isSelected()){
            final int costBacon = 2;
            int quantityBacon = Integer.parseInt(InputQuantityBacon.getText());
            totalCostBacon = costBacon * quantityBacon;
            orderReceipt.append(Arrays.toString(new String[] {
                    "Bacon", Integer.toString(quantityBacon), "$"+Integer.toString(totalCostBacon)
            }) + '\n');
        }
        if (checkBoxEggs.isSelected()){
            final int costEggs = 2;
            int quantityEggs = Integer.parseInt(InputQuantityEggs.getText());
            totalCostEggs = costEggs * quantityEggs;
            orderReceipt.append(Arrays.toString(new String[] {
                    "Eggs", Integer.toString(quantityEggs), "$"+Integer.toString(totalCostEggs)
            }) + '\n');
        }
        int totalCostOrder = totalCostPancakes + totalCostBacon + totalCostEggs;
        orderReceipt.append(Arrays.toString(new String[] {
                "Total Cost", "$"+Integer.toString(totalCostOrder)
        }) + '\n');
    }

    // referenced from https://docs.oracle.com/javase/tutorial/uiswing/events/mouselistener.html
    public class MouseEventDemo implements MouseListener {
        public void mousePressed(MouseEvent e) {
            print("Mouse pressed; # of clicks: " + e.getClickCount(), e);
        }

        public void mouseReleased(MouseEvent e) {
            print("Mouse released; # of clicks: " + e.getClickCount(), e);
        }

        public void mouseEntered(MouseEvent e) {
            print("Mouse entered", e);
        }

        public void mouseExited(MouseEvent e) {
            print("Mouse exited", e);
        }

        public void mouseClicked(MouseEvent e) {
            print("Mouse clicked (# of clicks: " + e.getClickCount() + ")", e);
        }

        void print(String eventDescription, MouseEvent e) {
            textAreaMouseClicks.append(eventDescription + " detected on "
                    + e.getComponent().getClass().getName() + "." + "\n");
        }
    }
}
