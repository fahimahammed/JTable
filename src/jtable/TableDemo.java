
package jtable;

import java.awt.*;
import javafx.scene.paint.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Fahim
 */

public class TableDemo extends JFrame{
    private Container c;
    private JLabel label;
    private Font font;
    private JTable table;
    private JScrollPane scroll;
    
    private String[] cols = {"ID", "Name", "GPA"}; 
    private String[][] rows = {
        {"101", "Fahim", "3.50"},
        {"102", "Saim", "3.50"},
        {"103", "Niloy", "3.50"},
        {"104", "Jency", "3.50"},
        {"105", "Bithi", "3.50"},
        {"106", "Sadia", "3.50"},
        {"107", "Mithun", "3.50"},
        {"103", "Niloy", "3.50"},
        {"104", "Jency", "3.50"},
        {"105", "Bithi", "3.50"},
        {"106", "Sadia", "3.50"},
        {"107", "Mithun", "3.50"}
    
    };
    //constructor
    TableDemo(){
        initComponents();
    }
    
    public void initComponents(){
            
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 700, 400);
        this.setTitle("Table");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(java.awt.Color.pink);
        
        font = new Font("Arial", Font.BOLD, 22);
        label = new JLabel("Result");
        label.setBounds(200, 30, 150, 30);
        label.setFont(font);
        c.add(label);
        
        table=new JTable(rows,cols); 
        table.setSelectionBackground(java.awt.Color.yellow);
        //table.setEnabled(false);
        //table.setBounds(30,40,200,300); 
        
        scroll = new JScrollPane(table);
        scroll.setBounds(50, 80, 600, 150);
        c.add(scroll);
        
    }
    
    public static void main(String[] args) {
        TableDemo frame = new TableDemo();
        frame.setVisible(true);
        //new TableExample();
    }
}
