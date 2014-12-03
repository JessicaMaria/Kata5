package kata5;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class MoneyCalculatorFrame extends JFrame {

    public MoneyCalculatorFrame() {
        setTitle(" Money Calculator ");
        setMinimumSize(new Dimension(300, 300));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createComponents();
        setVisible(true);
    }

    private void createComponents() {
        add(createExchangeDialog());
        add(createToolbar(), BorderLayout.SOUTH);
    }

    private Component createExchangeDialog() {
        JPanel panel = new JPanel(new FlowLayout());
        return panel;
    }

    private Component createToolbar() {
        JToolBar toolBar = new JToolBar("My ToolBar");
        return toolBar;
    }

}
