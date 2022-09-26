import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CardContainer extends JFrame {
    CardLayout crd;
    JPanel p1, p2, p3; // Panel variables to hold the references of panels
    Container cPane;

    CardContainer() { // constructor of the class
        cPane = getContentPane(); //default constructor used therefore, components will cover the whole area
        crd = new CardLayout();
        cPane.setLayout(crd);

        createPanel1(); // creating our panels
        createPanel2();
        createPanel3();

        cPane.add("p1", p1); // adding panels to container
        cPane.add("p2", p2);
        cPane.add("p3", p3);

    }

    private void createPanel1() {
        p1 = new JPanel();
        p1.setLayout(null);
        // Create elements
        JButton btn2 = new JButton("Goto Panel2");
        JButton btn3 = new JButton("Goto Panel3");
        JLabel lbl = new JLabel("Panel1");
        // Define the position and size of elements
        btn2.setBounds(40,30,200,40);
        btn3.setBounds(40,70,200,40);
        lbl.setBounds(40, 0, 200, 40);
        // Adding event listeners to buttons
        btn2.addActionListener(new AbstractAction("press") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                crd.show(cPane, "p2");
            }
        });
        btn3.addActionListener(new AbstractAction("press") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                crd.show(cPane, "p3");
            }
        });
        // Adding elements to panel and making it visible
        p1.add(btn2);
        p1.add(btn3);
        p1.add(lbl);
        p1.setVisible(true);
    }

    private void createPanel2() {
        p2 = new JPanel();
        p2.setLayout(null);
        // Create elements
        JButton btn1 = new JButton("Goto Panel1");
        JButton btn3 = new JButton("Goto Panel3");
        JLabel lbl = new JLabel("Panel2");
        // Define the position and size of elements
        btn1.setBounds(40,30,200,40);
        btn3.setBounds(40,70,200,40);
        lbl.setBounds(40, 0, 200, 40);
        // Adding event listeners to buttons
        btn1.addActionListener(new AbstractAction("press") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                crd.show(cPane, "p1");
            }
        });
        btn3.addActionListener(new AbstractAction("press") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                crd.show(cPane, "p3");
            }
        });
        // Adding elements to panel and making it visible
        p2.add(btn1);
        p2.add(btn3);
        p2.add(lbl);
        p2.setVisible(true);
    }

    private void createPanel3() {
        p3 = new JPanel();
        p3.setLayout(null);
        // Create elements
        JButton btn1 = new JButton("Goto Panel1");
        JButton btn2 = new JButton("Goto Panel2");
        JLabel lbl = new JLabel("Panel3");
        // Define the position and size of elements
        btn1.setBounds(40,30,200,40);
        btn2.setBounds(40,70,200,40);
        lbl.setBounds(40, 0, 200, 40);
        // Adding event listeners to buttons
        btn1.addActionListener(new AbstractAction("press") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                crd.show(cPane, "p1");
            }
        });
        btn2.addActionListener(new AbstractAction("press") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                crd.show(cPane, "p2");
            }
        });
        // Adding elements to panel and making it visible
        p3.add(btn1);
        p3.add(btn2);
        p3.add(lbl);
        p3.setVisible(true);
    }

}

