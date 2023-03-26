package pk;

import java.awt.*;
import javax.swing.*;

/**
 * The CostPanel class displays a panel with the total cost.
 */

public class CostPanel extends JPanel
{
    private static final double CREAM_CHEESE = 0;

	private static final double BUTTER = 0;

	private static final double PEACH_JELLY = 0;

	private static final double BLUEBERRY_JAM = 0;

	//private double subtotal,          // To hold the subtotal
    //                tax,               // To hold the tax
    //                total;             // To hold the total
     
    private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	
    private JCheckBox creamCheese;  // Cream cheese
	private JCheckBox butter;       // Butter
	private JCheckBox peachJelly;   // Peach jelly
	private JCheckBox blueberryJam; // Blueberry jam


	/**
	 * Constructor
	 */

     public CostPanel()
     {
          // Create a GridLayout manager with three rows and no columns.
          setLayout(new GridLayout(3, 0));

          // Create the labels.
          label1 = new JLabel("Subtotal");
          label2 = new JLabel("Tax");
          label3 = new JLabel("Total");

          // Add a border around the panel.
          setBorder(BorderFactory.createTitledBorder("Pick Your Toppings"));

          // Add the check boxes to the panel.
          add(creamCheese);
          add(butter);
          add(peachJelly);
          add(blueberryJam);
     }

	/**
	 * The getToppingCost method returns the cost of
     * the selected toppings.
	 */

     public double getToppingCost()
     {
          double toppingCost = 0.0;

          if (creamCheese.isSelected())
               toppingCost += CREAM_CHEESE;
          if (butter.isSelected())
               toppingCost += BUTTER;
          if (peachJelly.isSelected())
               toppingCost += PEACH_JELLY;
          if (blueberryJam.isSelected())
               toppingCost += BLUEBERRY_JAM;

          return toppingCost;
     }
}
